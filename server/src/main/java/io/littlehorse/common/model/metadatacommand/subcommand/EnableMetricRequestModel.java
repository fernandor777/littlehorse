package io.littlehorse.common.model.metadatacommand.subcommand;

import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.model.metadatacommand.MetadataSubCommand;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.EnableMetricRequest;
import io.littlehorse.server.monitoring.metrics.MonitorConfigModel;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import io.littlehorse.server.streams.topology.core.MetadataCommandExecution;
import java.time.Duration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnableMetricRequestModel extends MetadataSubCommand<EnableMetricRequest> {

    private MonitorConfigIdModel id;
    private Long windowLengthMs;

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        EnableMetricRequest p = (EnableMetricRequest) proto;
        this.id = LHSerializable.fromProto(p.getId(), MonitorConfigIdModel.class, context);
        this.windowLengthMs = p.getWindowLengthMs();
    }

    @Override
    public EnableMetricRequest.Builder toProto() {
        return EnableMetricRequest.newBuilder().setId(id.toProto()).setWindowLengthMs(windowLengthMs);
    }

    @Override
    public Class<EnableMetricRequest> getProtoBaseClass() {
        return EnableMetricRequest.class;
    }

    @Override
    public boolean hasResponse() {
        return false;
    }

    @Override
    public Message process(MetadataCommandExecution executionContext) {
        MonitorConfigModel monitorConfig = new MonitorConfigModel(id, Duration.ofMillis(windowLengthMs));
        return null;
    }
}
