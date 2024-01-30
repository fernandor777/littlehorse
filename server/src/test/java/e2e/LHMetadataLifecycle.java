package e2e;

import static io.grpc.Status.*;
import static org.assertj.core.api.Assertions.*;

import io.grpc.StatusRuntimeException;
import io.littlehorse.sdk.common.LHLibUtil;
import io.littlehorse.sdk.common.config.LHConfig;
import io.littlehorse.sdk.common.proto.DeleteTaskDefRequest;
import io.littlehorse.sdk.common.proto.DeleteWfSpecRequest;
import io.littlehorse.sdk.common.proto.GetLatestWfSpecRequest;
import io.littlehorse.sdk.common.proto.LHHostInfo;
import io.littlehorse.sdk.common.proto.LittleHorseGrpc;
import io.littlehorse.sdk.common.proto.PutTaskDefRequest;
import io.littlehorse.sdk.common.proto.PutWfSpecRequest;
import io.littlehorse.sdk.common.proto.RegisterTaskWorkerRequest;
import io.littlehorse.sdk.common.proto.RegisterTaskWorkerResponse;
import io.littlehorse.sdk.common.proto.TaskDef;
import io.littlehorse.sdk.common.proto.TaskDefId;
import io.littlehorse.sdk.common.proto.WfSpec;
import io.littlehorse.sdk.common.proto.WfSpecId;
import io.littlehorse.sdk.wfsdk.Workflow;
import io.littlehorse.sdk.wfsdk.internal.WorkflowImpl;
import io.littlehorse.test.LHTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

@LHTest
public class LHMetadataLifecycle {

    private LittleHorseGrpc.LittleHorseBlockingStub client;
    private Set<String> allHosts = new HashSet<>();
    private final String taskA = "task-a";
    private final String testWfSpec = "test-wf-spec";
    private LHConfig config;

    @AfterEach
    public void cleanup() {
        client.deleteTaskDef(DeleteTaskDefRequest.newBuilder()
                .setId(TaskDefId.newBuilder().setName(taskA))
                .build());
        try {
            WfSpec latestWfSpec = client.getLatestWfSpec(
                    GetLatestWfSpecRequest.newBuilder().setName(testWfSpec).build());
            client.deleteWfSpec(DeleteWfSpecRequest.newBuilder()
                    .setId(WfSpecId.newBuilder()
                            .setName(latestWfSpec.getId().getName())
                            .setMajorVersion(0)
                            .setRevision(0))
                    .build());
        } catch (Exception ex) {
            // ignore
        }
    }

    @Test
    public void shouldRemoveDeadTaskWorkers() throws Exception {
        client.putTaskDef(PutTaskDefRequest.newBuilder().setName(taskA).build());

        // Taskdef needs to propagate to all servers
        Thread.sleep(50);

        String client1 = "client-1";
        String client2 = "client-2";
        String client3 = "client-3";
        String client4 = "client-4";
        String client5 = "client-5";

        RegisterTaskWorkerResponse reply1 = client.registerTaskWorker(register(client1));
        for (LHHostInfo host : reply1.getYourHostsList()) {
            allHosts.add(hostToString(host));
        }

        // It distributes available worker (one server each worker)
        client.registerTaskWorker(register(client2));
        client.registerTaskWorker(register(client3));
        client.registerTaskWorker(register(client4));

        // Wait until all workers are dead
        Thread.sleep(15000);

        RegisterTaskWorkerResponse reply5 = client.registerTaskWorker(register(client5));
        int newCount = reply5.getYourHostsCount();

        // It should assign all the workers available for this only task worker
        if (newCount != allHosts.size()) {
            throw new RuntimeException("dead workers aren't being deleted!");
        }
    }

    @Test
    public void shouldNotRegisterAWfSpecThatHasAMissingTaskDef() {
        Workflow wf = new WorkflowImpl(testWfSpec, thread -> {
            thread.execute(taskA);
        });
        PutWfSpecRequest request = wf.compileWorkflow();
        assertThatThrownBy(() -> client.putWfSpec(request))
                .isInstanceOf(StatusRuntimeException.class)
                .matches(throwable -> ((StatusRuntimeException) throwable)
                        .getStatus()
                        .getCode()
                        .equals(Code.INVALID_ARGUMENT));
        assertThatThrownBy(() -> client.getLatestWfSpec(
                        GetLatestWfSpecRequest.newBuilder().setName(testWfSpec).build()))
                .isInstanceOf(StatusRuntimeException.class)
                .matches(throwable -> ((StatusRuntimeException) throwable)
                        .getStatus()
                        .getCode()
                        .equals(Code.NOT_FOUND));
        TaskDef createdTaskDef =
                client.putTaskDef(PutTaskDefRequest.newBuilder().setName(taskA).build());
        assertThat(createdTaskDef).isNotNull();
        WfSpec result = client.putWfSpec(request);
        assertThat(result.getId().getMajorVersion())
                .withFailMessage("Somehow the version wasn't zero!")
                .isZero();
    }

    private String hostToString(LHHostInfo host) {
        return host.getHost() + ":" + host.getPort();
    }

    private RegisterTaskWorkerRequest register(String clientId) {
        return RegisterTaskWorkerRequest.newBuilder()
                .setTaskWorkerId(clientId)
                .setTaskDefId(LHLibUtil.taskDefId(taskA))
                .setListenerName(config.getConnectListener())
                .build();
    }
}
