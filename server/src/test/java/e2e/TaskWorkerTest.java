package e2e;

import static org.assertj.core.api.Assertions.*;

import io.littlehorse.sdk.common.LHLibUtil;
import io.littlehorse.sdk.common.config.LHConfig;
import io.littlehorse.sdk.common.proto.LHHostInfo;
import io.littlehorse.sdk.common.proto.LittleHorseGrpc.LittleHorseBlockingStub;
import io.littlehorse.sdk.common.proto.PutTaskDefRequest;
import io.littlehorse.sdk.common.proto.RegisterTaskWorkerRequest;
import io.littlehorse.sdk.common.proto.RegisterTaskWorkerResponse;
import io.littlehorse.test.LHTest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

@LHTest
public class TaskWorkerTest {

    private final String taskDefName = "test-task";
    private LHConfig config;
    private LittleHorseBlockingStub client;

    @Test
    public void shouldBalanceWorkerGroupConnections() throws Exception {
        final Set<String> allHosts = new HashSet<>();
        // Create taskdef
        client.putTaskDef(PutTaskDefRequest.newBuilder().setName(taskDefName).build());

        // Taskdef needs to propagate to all servers
        Thread.sleep(50);

        String client1 = "client-1";
        String client2 = "client-2";
        String client3 = "client-3";
        String client4 = "client-4";

        // This is the first worker to connect, so it should get ALL of the hosts
        RegisterTaskWorkerResponse reply1 = client.registerTaskWorker(register(client1));
        for (LHHostInfo host : reply1.getYourHostsList()) {
            allHosts.add(hostToString(host));
        }

        // Since we require that each server has at least two connections on it,
        // we should check that when we add the worker #2, then it still gets all
        // the hosts.
        final AtomicInteger numberOfHosts = new AtomicInteger();
        assertThat(client.registerTaskWorker(register(client1)))
                .extracting(RegisterTaskWorkerResponse::getYourHostsList)
                .extracting(List::size)
                .matches(numberOfConnections -> numberOfConnections > 0)
                .satisfies(numberOfHosts::set);
        assertThat(client.registerTaskWorker(register(client2)))
                .withFailMessage("Second worker should still get all hosts!")
                .extracting(RegisterTaskWorkerResponse::getYourHostsList)
                .extracting(List::size)
                .matches(numberOfConnections -> numberOfConnections.equals(numberOfHosts.get()));

        assertThat(client.registerTaskWorker(register(client1)))
                .withFailMessage("First worker should still get all hosts when only one other")
                .extracting(RegisterTaskWorkerResponse::getYourHostsList)
                .extracting(List::size)
                .matches(numberOfConnections -> numberOfConnections.equals(numberOfHosts.get()));

        // When we add a third and fourth worker, if there are more than one server,
        // then they shouldn't all get all the hosts
        assertThat(client.registerTaskWorker(register(client3))).isNotNull();
        assertThat(client.registerTaskWorker(register(client4))).isNotNull();

        assertThat(client.registerTaskWorker(register(client1)))
                .withFailMessage("work isn't being balanced!")
                .extracting(RegisterTaskWorkerResponse::getYourHostsCount)
                .matches(newCount -> !(newCount > 1 && newCount.equals(numberOfHosts.get())));
    }

    private RegisterTaskWorkerRequest register(String clientId) {
        return RegisterTaskWorkerRequest.newBuilder()
                .setTaskWorkerId(clientId)
                .setTaskDefId(LHLibUtil.taskDefId(taskDefName))
                .setListenerName(config.getConnectListener())
                .build();
    }

    private String hostToString(LHHostInfo host) {
        return host.getHost() + ":" + host.getPort();
    }
}
