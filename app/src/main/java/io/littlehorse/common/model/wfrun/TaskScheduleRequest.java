package io.littlehorse.common.model.wfrun;

import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.model.GETable;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.jlib.common.proto.TaskScheduleRequestPb;
import io.littlehorse.jlib.common.proto.TaskScheduleRequestPbOrBuilder;
import io.littlehorse.jlib.common.proto.VarNameAndValPb;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskScheduleRequest extends GETable<TaskScheduleRequestPb> {

    public String taskDefId;
    public String taskDefName;
    public int threadRunNumber;
    public int taskRunNumber;
    public int taskRunPosition;
    public String wfRunId;
    public String wfRunEventQueue;
    public String wfSpecId;
    public int attemptNumber;
    public String nodeName;
    public List<VarNameAndVal> variables;
    public Date createdAt;

    public String getPartitionKey() {
        return wfRunId;
    }

    public String getObjectId() {
        return NodeRun.getObjectId(wfRunId, threadRunNumber, taskRunPosition);
    }

    public Date getCreatedAt() {
        if (createdAt == null) {
            createdAt = new Date();
        }
        return createdAt;
    }

    public TaskScheduleRequest() {
        variables = new ArrayList<>();
    }

    public TaskScheduleRequestPb.Builder toProto() {
        TaskScheduleRequestPb.Builder out = TaskScheduleRequestPb
            .newBuilder()
            .setTaskDefId(taskDefId)
            .setTaskDefName(taskDefName)
            .setThreadRunNumber(threadRunNumber)
            .setTaskRunNumber(taskRunNumber)
            .setTaskRunPosition(taskRunPosition)
            .setWfRunId(wfRunId)
            .setWfRunEventQueue(wfRunEventQueue)
            .setWfSpecId(wfSpecId)
            .setAttemptNumber(attemptNumber)
            .setNodeName(nodeName)
            .setCreatedAt(LHUtil.fromDate(getCreatedAt()));

        for (VarNameAndVal v : variables) {
            out.addVariables(v.toProto());
        }

        return out;
    }

    public Class<TaskScheduleRequestPb> getProtoBaseClass() {
        return TaskScheduleRequestPb.class;
    }

    public static TaskScheduleRequest fromProto(TaskScheduleRequestPbOrBuilder p) {
        TaskScheduleRequest out = new TaskScheduleRequest();
        out.initFrom(p);
        return out;
    }

    public void initFrom(MessageOrBuilder proto) {
        TaskScheduleRequestPbOrBuilder p = (TaskScheduleRequestPbOrBuilder) proto;
        this.taskDefId = p.getTaskDefId();
        this.taskDefName = p.getTaskDefName();
        this.threadRunNumber = p.getThreadRunNumber();
        this.taskRunNumber = p.getTaskRunNumber();
        this.taskRunPosition = p.getTaskRunPosition();
        this.wfRunId = p.getWfRunId();
        this.wfRunEventQueue = p.getWfRunEventQueue();
        this.wfSpecId = p.getWfSpecId();
        this.attemptNumber = p.getAttemptNumber();
        this.nodeName = p.getNodeName();
        this.createdAt = LHUtil.fromProtoTs(p.getCreatedAt());

        if (this.createdAt.getTime() == 0) {
            this.createdAt = new Date();
        }

        for (VarNameAndValPb v : p.getVariablesList()) {
            variables.add(LHSerializable.fromProto(v, VarNameAndVal.class));
        }
    }
}
