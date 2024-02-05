package e2e;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.littlehorse.sdk.common.LHLibUtil;
import io.littlehorse.sdk.common.config.LHConfig;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.AssignUserTaskRunRequest;
import io.littlehorse.sdk.common.proto.CompleteUserTaskRunRequest;
import io.littlehorse.sdk.common.proto.LHStatus;
import io.littlehorse.sdk.common.proto.LittleHorseGrpc;
import io.littlehorse.sdk.common.proto.RunWfRequest;
import io.littlehorse.sdk.common.proto.SearchWfRunRequest;
import io.littlehorse.sdk.common.proto.TaskRunId;
import io.littlehorse.sdk.common.proto.TaskRunIdList;
import io.littlehorse.sdk.common.proto.TaskStatus;
import io.littlehorse.sdk.common.proto.UserTaskRunId;
import io.littlehorse.sdk.common.proto.UserTaskRunIdList;
import io.littlehorse.sdk.common.proto.UserTaskRunStatus;
import io.littlehorse.sdk.common.proto.Variable;
import io.littlehorse.sdk.common.proto.VariableId;
import io.littlehorse.sdk.common.proto.VariableType;
import io.littlehorse.sdk.common.proto.VariableValue;
import io.littlehorse.sdk.common.proto.WfRunId;
import io.littlehorse.sdk.common.proto.WfRunIdList;
import io.littlehorse.sdk.common.util.Arg;
import io.littlehorse.sdk.usertask.UserTaskSchema;
import io.littlehorse.sdk.usertask.annotations.UserTaskField;
import io.littlehorse.sdk.wfsdk.WfRunVariable;
import io.littlehorse.sdk.wfsdk.WorkflowThread;
import io.littlehorse.sdk.wfsdk.internal.WorkflowImpl;
import io.littlehorse.sdk.worker.LHTaskMethod;
import io.littlehorse.sdk.worker.LHTaskWorker;
import io.littlehorse.test.LHTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Once the LittleHorse Test Framework fully supports user tasks,
this class should be written from scratch.
 */
@LHTest
public class TaskAndUserTaskSearchTest {
    public static final String USER_TASK = "af-user-task";
    public static final String SLOW_TASK = "af-slow-task";
    public static final String FAIL_TASK = "af-fail-if-true";
    public static final String WF_SPEC_NAME = "af-wf";

    private List<String> wfRunIds;
    private LHConfig config;
    private LittleHorseGrpc.LittleHorseBlockingStub client;

    public void wf(WorkflowThread thread) {
        WfRunVariable shouldFail = thread.addVariable("should-fail", VariableType.BOOL);

        thread.execute(FAIL_TASK, shouldFail);
        thread.execute(SLOW_TASK);

        thread.assignUserTask(USER_TASK, "obiwan", null);
    }

    @Test
    public void test() throws Exception {


        String failWf = runWf(WF_SPEC_NAME, Arg.of("should-fail", true));

        wfRunIds.add(failWf);


        assertVarEqual(client, succeedWf, 0, "should-fail", false);
        assertVarEqual(client, failWf, 0, "should-fail", true);


        assertContainsWfRun(runningWfs, failWf);

        failWorker.start();
        Thread.sleep(800); // wait for worker to do its thing

        assertStatus(client, succeedWf, LHStatus.RUNNING);
        assertStatus(client, failWf, LHStatus.ERROR);
        TaskRunIdList failedTasks = searchTaskRuns(FAIL_TASK, TaskStatus.TASK_FAILED);
        assertContainsWfRun(failedTasks, failWf);
        assertNotContainsWfRun(failedTasks, succeedWf);

        TaskRunIdList runningFailTasks = searchTaskRuns(FAIL_TASK, TaskStatus.TASK_RUNNING);
        assertNotContainsWfRun(runningFailTasks, failWf);
        assertNotContainsWfRun(runningFailTasks, succeedWf);
        TaskRunIdList runningSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_RUNNING);
        assertContainsWfRun(runningSlowTasks, succeedWf);
        assertNotContainsWfRun(runningSlowTasks, failWf);
        Thread.sleep(1100);
        runningSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_RUNNING);
        assertNotContainsWfRun(runningSlowTasks, succeedWf);
        assertNotContainsWfRun(runningSlowTasks, failWf);

        TaskRunIdList succeededSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_SUCCESS);
        assertContainsWfRun(succeededSlowTasks, succeedWf);

        // Ok, now we look for the UserTaskRuns
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan"), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan", USER_TASK, UserTaskRunStatus.ASSIGNED), succeedWf);

        UserTaskRunId userTaskId = searchUserTaskRunsUserId("obiwan").getResultsList().stream()
                .filter(id -> id.getWfRunId().getId().equals(succeedWf))
                .findFirst()
                .orElseThrow();

        StatusRuntimeException caught = null;
        try {
            client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                    .setUserId("fdsa")
                    .setOverrideClaim(false)
                    .setUserTaskRunId(userTaskId)
                    .build());
        } catch (StatusRuntimeException exn) {
            caught = exn;
        }
        assertThat(
                caught != null && caught.getStatus().getCode() == Status.Code.FAILED_PRECONDITION,
                "should be unable to reassign without override claim");
        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserId("fdsa")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());
        Thread.sleep(150); // allow remote tag to propagate

        // Shouldn't be obiwan's task anymore
        assertNotContainsWfRun(searchUserTaskRunsUserId("obiwan", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("fdsa", UserTaskRunStatus.ASSIGNED), succeedWf);

        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserGroup("mygroup")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());

        Thread.sleep(150); // allow remote indexes to propagate
        assertContainsWfRun(searchUserTaskRunsUserGroup("mygroup", UserTaskRunStatus.UNASSIGNED), succeedWf);
        assertNotContainsWfRun(searchUserTaskRunsUserId("fdsa", UserTaskRunStatus.ASSIGNED), succeedWf);

        // Now we claim it once more
        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserId("yoda")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());
        Thread.sleep(150); // allow remote tag to propagate

        assertContainsWfRun(searchUserTaskRunsUserId("yoda"), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("yoda", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertNotContainsWfRun(searchUserTaskRunsUserGroup("mygroup", UserTaskRunStatus.UNASSIGNED), succeedWf);

        // Finally, complete the TaskRun
        client.completeUserTaskRun(CompleteUserTaskRunRequest.newBuilder()
                .setUserTaskRunId(userTaskId)
                .setUserId("yoda")
                .putResults("foo", LHLibUtil.objToVarVal("bar"))
                .build());
        Thread.sleep(150);

        assertContainsWfRun(searchUserTaskRunsUserId("yoda", UserTaskRunStatus.DONE), succeedWf);

        assertStatus(client, succeedWf, LHStatus.COMPLETED);
    }

    @Test
    public void succeedWf() throws Exception{
        wfRunIds = new ArrayList<>();
        UserTaskSchema uts = new UserTaskSchema(new UserTaskForm(), USER_TASK);
        try {
            client.putUserTaskDef(uts.compile());
        } catch (StatusRuntimeException exn) {
            if (exn.getStatus().getCode() != Status.Code.ALREADY_EXISTS) {
                throw exn;
            }
        }
        LHTaskWorker slowWorker = new LHTaskWorker(new AFSearchWorker(), SLOW_TASK, config);
        slowWorker.registerTaskDef();

        Thread.sleep(200);
        slowWorker.start();
        // will start the failWorker later so we can catch the STARTING tasks

        client.putWfSpec(new WorkflowImpl(WF_SPEC_NAME, this::wf).compileWorkflow());
        Thread.sleep(300);

        String succeedWf = runWf(WF_SPEC_NAME, Arg.of("should-fail", false));
        wfRunIds.add(succeedWf);

        assertVarEqual(client, succeedWf, 0, "should-fail", false);

        // Since we haven't started the first TaskWorker, the tasks should both
        // be STARTING. We'll test out pagination.
        WfRunIdList runningWfs = client.searchWfRun(SearchWfRunRequest.newBuilder()
                .setWfSpecName(WF_SPEC_NAME)
                .setStatus(LHStatus.RUNNING)
                .setEarliestStart(LHLibUtil.fromDate(new Date(System.currentTimeMillis() - 5000)))
                .build());
        assertContainsWfRun(runningWfs, succeedWf);

        Thread.sleep(800); // wait for worker to do its thing

        assertStatus(client, succeedWf, LHStatus.RUNNING);
        TaskRunIdList failedTasks = searchTaskRuns(FAIL_TASK, TaskStatus.TASK_FAILED);
        assertNotContainsWfRun(failedTasks, succeedWf);

        TaskRunIdList runningFailTasks = searchTaskRuns(FAIL_TASK, TaskStatus.TASK_RUNNING);
        assertNotContainsWfRun(runningFailTasks, succeedWf);
        TaskRunIdList runningSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_RUNNING);
        assertContainsWfRun(runningSlowTasks, succeedWf);
        Thread.sleep(1100);
        runningSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_RUNNING);
        assertNotContainsWfRun(runningSlowTasks, succeedWf);

        TaskRunIdList succeededSlowTasks = searchTaskRuns(SLOW_TASK, TaskStatus.TASK_SUCCESS);
        assertContainsWfRun(succeededSlowTasks, succeedWf);

        // Ok, now we look for the UserTaskRuns
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan"), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("obiwan", USER_TASK, UserTaskRunStatus.ASSIGNED), succeedWf);

        UserTaskRunId userTaskId = searchUserTaskRunsUserId("obiwan").getResultsList().stream()
                .filter(id -> id.getWfRunId().getId().equals(succeedWf))
                .findFirst()
                .orElseThrow();

        StatusRuntimeException caught = null;
        try {
            client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                    .setUserId("fdsa")
                    .setOverrideClaim(false)
                    .setUserTaskRunId(userTaskId)
                    .build());
        } catch (StatusRuntimeException exn) {
            caught = exn;
        }
        assertThat(
                caught != null && caught.getStatus().getCode() == Status.Code.FAILED_PRECONDITION,
                "should be unable to reassign without override claim");
        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserId("fdsa")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());
        Thread.sleep(150); // allow remote tag to propagate

        // Shouldn't be obiwan's task anymore
        assertNotContainsWfRun(searchUserTaskRunsUserId("obiwan", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("fdsa", UserTaskRunStatus.ASSIGNED), succeedWf);

        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserGroup("mygroup")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());

        Thread.sleep(150); // allow remote indexes to propagate
        assertContainsWfRun(searchUserTaskRunsUserGroup("mygroup", UserTaskRunStatus.UNASSIGNED), succeedWf);
        assertNotContainsWfRun(searchUserTaskRunsUserId("fdsa", UserTaskRunStatus.ASSIGNED), succeedWf);

        // Now we claim it once more
        client.assignUserTaskRun(AssignUserTaskRunRequest.newBuilder()
                .setUserId("yoda")
                .setOverrideClaim(true)
                .setUserTaskRunId(userTaskId)
                .build());
        Thread.sleep(150); // allow remote tag to propagate

        assertContainsWfRun(searchUserTaskRunsUserId("yoda"), succeedWf);
        assertContainsWfRun(searchUserTaskRunsUserId("yoda", UserTaskRunStatus.ASSIGNED), succeedWf);
        assertNotContainsWfRun(searchUserTaskRunsUserGroup("mygroup", UserTaskRunStatus.UNASSIGNED), succeedWf);

        // Finally, complete the TaskRun
        client.completeUserTaskRun(CompleteUserTaskRunRequest.newBuilder()
                .setUserTaskRunId(userTaskId)
                .setUserId("yoda")
                .putResults("foo", LHLibUtil.objToVarVal("bar"))
                .build());
        Thread.sleep(150);

        assertContainsWfRun(searchUserTaskRunsUserId("yoda", UserTaskRunStatus.DONE), succeedWf);

        assertStatus(client, succeedWf, LHStatus.COMPLETED);

    }

    private String runWf(String wfSpecName, Arg... args) {
        RunWfRequest.Builder b = RunWfRequest.newBuilder().setWfSpecName(wfSpecName);

        for (Arg arg : args) {
            try {
                b.putVariables(arg.name, LHLibUtil.objToVarVal(arg.value));
            } catch (LHSerdeError exn) {
                throw new RuntimeException(exn);
            }
        }

        return client.runWf(b.build()).getId().getId();
    }

    private void assertContainsWfRun(WfRunIdList wfRuns, String id) {
        for (WfRunId wfRunId : wfRuns.getResultsList()) {
            if (id.equals(wfRunId.getId())) {
                return;
            }
        }
        throw new RuntimeException("Should have found WfRun " + id);
    }

    private void assertContainsWfRun(UserTaskRunIdList results, String id) {
        for (UserTaskRunId trid : results.getResultsList()) {
            if (trid.getWfRunId().getId().equals(id)) {
                return;
            }
        }
        throw new RuntimeException("Should have found WfRun " + id);
    }

    private void assertNotContainsWfRun(UserTaskRunIdList results, String id) {
        for (UserTaskRunId trid : results.getResultsList()) {
            if (trid.getWfRunId().getId().equals(id)) {
                throw new RuntimeException("Should NOT have found WfRun " + id);
            }
        }
    }

    private void assertNotContainsWfRun(TaskRunIdList results, String id) {
        for (TaskRunId trid : results.getResultsList()) {
            if (trid.getWfRunId().getId().equals(id)) {
                throw new RuntimeException("Should NOT have found WfRun " + id);
            }
        }
    }

    private void assertContainsWfRun(TaskRunIdList results, String id) {
        for (TaskRunId trid : results.getResultsList()) {
            if (trid.getWfRunId().getId().equals(id)) {
                return;
            }
        }
        throw new RuntimeException("Should have found WfRun " + id);
    }

    public void cleanup() {
        // for (String wfRunId : wfRunIds) {
        //     client.deleteWfRun(wfRunId);
        // }
        // client.deleteTaskDef(FAIL_TASK);
        // client.deleteTaskDef(SLOW_TASK);
        // client.deleteWfSpec(WF_SPEC_NAME, wfSpecVersion);
    }

}
class AFSearchWorker {

    @LHTaskMethod("af-slow-task")
    public String slow() throws Exception {
        Thread.sleep(1000);
        return "slow task";
    }

    @LHTaskMethod("af-fail-if-true")
    public String failIfTrue(boolean shouldFail) {
        if (shouldFail) {
            throw new RuntimeException("yikes asdf");
        }

        return "haha, didn't fail!";
    }
}

class UserTaskForm {

    @UserTaskField
    public String foo;
}