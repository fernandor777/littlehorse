package io.littlehorse.jtests.test.workflowtests;

import io.littlehorse.jlib.client.LHClient;
import io.littlehorse.jlib.common.config.LHWorkerConfig;
import io.littlehorse.jlib.common.exception.LHApiError;
import io.littlehorse.jlib.common.proto.LHStatusPb;
import io.littlehorse.jlib.wfsdk.Workflow;
import io.littlehorse.jlib.wfsdk.internal.WorkflowImpl;
import io.littlehorse.jlib.worker.LHTaskMethod;
import io.littlehorse.jtests.test.LogicTestFailure;
import io.littlehorse.jtests.test.WorkflowLogicTest;
import java.util.Arrays;
import java.util.List;

public class AASequential extends WorkflowLogicTest {

    public AASequential(LHClient client, LHWorkerConfig workerConfig) {
        super(client, workerConfig);
    }

    public String getDescription() {
        return "Simple test with workflow that executes two tasks sequentially";
    }

    public Workflow getWorkflowImpl() {
        return new WorkflowImpl(
            getWorkflowName(),
            thread -> {
                thread.execute("aa-simple");
                thread.execute("aa-simple");
            }
        );
    }

    public List<Object> getTaskWorkerObjects() {
        return Arrays.asList(new SimpleTask());
    }

    public List<String> launchAndCheckWorkflows(LHClient client)
        throws LogicTestFailure, InterruptedException, LHApiError {
        String wfRunId = runWf(client);
        Thread.sleep(500);
        assertStatus(client, wfRunId, LHStatusPb.COMPLETED);

        for (int i = 1; i < 3; i++) {
            assertTaskOutput(client, wfRunId, 0, i, new SimpleTask().obiWan());
        }

        return Arrays.asList(wfRunId);
    }
}

class SimpleTask {

    @LHTaskMethod("aa-simple")
    public String obiWan() {
        return "hello there";
    }
}