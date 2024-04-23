package io.littlehorse.server.monitoring.metrics;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.model.repartitioncommand.RepartitionSubCommand;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.UsageMetric;
import io.littlehorse.server.streams.stores.TenantScopedStore;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.kafka.streams.processor.api.ProcessorContext;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UsageMetricModel extends LHSerializable<UsageMetric> implements RepartitionSubCommand {

    private MonitorConfigIdModel metricId;
    private long value;
    private Date windowStart;
    private Date windowEnd;

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        UsageMetric p = (UsageMetric) proto;
        this.metricId = LHSerializable.fromProto(p.getMetricId(), MonitorConfigIdModel.class, context);
        this.value = p.getValue();
        this.windowStart = LHUtil.fromProtoTs(p.getWindowStart());
        this.windowEnd = LHUtil.fromProtoTs(p.getWindowEnd());
    }

    @Override
    public UsageMetric.Builder toProto() {
        return UsageMetric.newBuilder()
                .setMetricId(metricId.toProto())
                .setValue(value)
                .setWindowStart(LHUtil.fromDate(windowStart))
                .setWindowEnd(LHUtil.fromDate(windowEnd));
    }

    @Override
    public Class<? extends GeneratedMessageV3> getProtoBaseClass() {
        return UsageMetric.class;
    }

    public void increment() {
        value += 1;
    }

    public boolean isStillActive(Date eventTime) {
        return windowEnd.compareTo(eventTime) >= 0;
    }

    @Override
    public void process(TenantScopedStore repartitionedStore, ProcessorContext<Void, Void> ctx) {}

    @Override
    public String getPartitionKey() {
        return metricId.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsageMetricModel that)) return false;
        return value == that.value
                && Objects.equals(metricId, that.metricId)
                && Objects.equals(windowStart, that.windowStart)
                && Objects.equals(windowEnd, that.windowEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricId, value, windowStart, windowEnd);
    }
}
