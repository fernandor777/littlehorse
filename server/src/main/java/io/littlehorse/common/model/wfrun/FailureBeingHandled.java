package io.littlehorse.common.model.wfrun;

import com.google.protobuf.Message;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.jlib.common.proto.FailureBeingHandledPb;

public class FailureBeingHandled extends LHSerializable<FailureBeingHandledPb> {

    public int threadRunNumber;
    public int nodeRunPosition;
    public int failureNumber;

    public Class<FailureBeingHandledPb> getProtoBaseClass() {
        return FailureBeingHandledPb.class;
    }

    public FailureBeingHandledPb.Builder toProto() {
        FailureBeingHandledPb.Builder out = FailureBeingHandledPb
            .newBuilder()
            .setThreadRunNumber(threadRunNumber)
            .setNodeRunPosition(nodeRunPosition)
            .setFailureNumber(failureNumber);
        return out;
    }

    public void initFrom(Message proto) {
        FailureBeingHandledPb p = (FailureBeingHandledPb) proto;
        failureNumber = p.getFailureNumber();
        nodeRunPosition = p.getNodeRunPosition();
        threadRunNumber = p.getThreadRunNumber();
    }

    public static FailureBeingHandled fromProto(FailureBeingHandledPb p) {
        FailureBeingHandled out = new FailureBeingHandled();
        out.initFrom(p);
        return out;
    }
}