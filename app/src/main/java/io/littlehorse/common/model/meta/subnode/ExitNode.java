package io.littlehorse.common.model.meta.subnode;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.LHConfig;
import io.littlehorse.common.exceptions.LHValidationError;
import io.littlehorse.common.model.meta.FailureDef;
import io.littlehorse.common.model.meta.OutputSchema;
import io.littlehorse.common.model.meta.SubNode;
import io.littlehorse.common.model.wfrun.subnoderun.ExitRun;
import io.littlehorse.common.proto.ExitNodePb;
import io.littlehorse.common.proto.ExitNodePbOrBuilder;
import io.littlehorse.common.proto.VariableTypePb;
import io.littlehorse.common.util.LHGlobalMetaStores;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ExitNode extends SubNode<ExitNodePb> {

    public FailureDef failureDef;

    public Class<ExitNodePb> getProtoBaseClass() {
        return ExitNodePb.class;
    }

    public void initFrom(MessageOrBuilder proto) {
        ExitNodePbOrBuilder p = (ExitNodePbOrBuilder) proto;
        if (p.hasFailureDef()) failureDef = FailureDef.fromProto(p.getFailureDef());
    }

    public ExitNodePb.Builder toProto() {
        ExitNodePb.Builder out = ExitNodePb.newBuilder();
        if (failureDef != null) {
            out.setFailureDef(failureDef.toProto());
        }
        return out;
    }

    public void validate(LHGlobalMetaStores stores, LHConfig config)
        throws LHValidationError {
        node.outputSchema = new OutputSchema();
        node.outputSchema.outputType = VariableTypePb.VOID;
        if (failureDef != null) failureDef.validate();
    }

    public ExitRun createRun(Date time) {
        return new ExitRun();
    }

    @Override
    @JsonIgnore
    public Set<String> getNeededVariableNames() {
        HashSet<String> out = new HashSet<>();
        if (failureDef != null) {
            out.addAll(failureDef.getNeededVariableNames());
        }
        return out;
    }
}