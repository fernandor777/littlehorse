package io.littlehorse.jtests.test.workflowtests;

import io.littlehorse.jlib.client.LHClient;
import io.littlehorse.jlib.common.config.LHWorkerConfig;
import io.littlehorse.jlib.common.exception.LHApiError;
import io.littlehorse.jlib.common.proto.LHStatusPb;
import io.littlehorse.jlib.common.proto.VariableTypePb;
import io.littlehorse.jlib.common.util.Arg;
import io.littlehorse.jlib.wfsdk.WfRunVariable;
import io.littlehorse.jlib.wfsdk.Workflow;
import io.littlehorse.jlib.wfsdk.internal.WorkflowImpl;
import io.littlehorse.jlib.worker.LHTaskMethod;
import io.littlehorse.jtests.test.LogicTestFailure;
import io.littlehorse.jtests.test.WorkflowLogicTest;
import java.util.Arrays;
import java.util.List;

public class ABIntInputVars extends WorkflowLogicTest {

    public ABIntInputVars(LHClient client, LHWorkerConfig workerConfig) {
        super(client, workerConfig);
    }

    public String getDescription() {
        return "Ensures that we can pass input variables to Task Runs properly.";
    }

    public Workflow getWorkflowImpl() {
        return new WorkflowImpl(
            getWorkflowName(),
            thread -> {
                WfRunVariable myVar = thread.addVariable(
                    "my-var",
                    VariableTypePb.INT
                );
                thread.execute("ab-double-it", myVar);
                thread.execute("ab-subtract", 10, 8);
            }
        );
    }

    public List<Object> getTaskWorkerObjects() {
        return Arrays.asList(new ABDoubler());
    }

    public List<String> launchAndCheckWorkflows(LHClient client)
        throws LogicTestFailure, InterruptedException, LHApiError {
        String wfRunId = runWf(client, Arg.of("my-var", 5));
        Thread.sleep(500);

        assertStatus(client, wfRunId, LHStatusPb.COMPLETED);
        assertTaskOutput(client, wfRunId, 0, 1, new ABDoubler().doubleIt(5));
        assertTaskOutput(client, wfRunId, 0, 2, 10 - 8);

        return Arrays.asList(wfRunId);
    }
}

class ABDoubler {

    @LHTaskMethod("ab-double-it")
    public int doubleIt(int toDouble) {
        return toDouble * 2;
    }

    @LHTaskMethod("ab-subtract")
    public Long subtract(long first, Integer second) {
        return first - second;
    }
}
