package io.littlehorse.server.monitoring.metrics;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.UsageMetric;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UsageMetricModel extends LHSerializable<UsageMetric> {

    private String id;
    private long value;
    private Date windowStart;
    private Date windowEnd;

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        UsageMetric p = (UsageMetric) proto;
        this.id = p.getId();
        this.value = p.getValue();
        this.windowStart = LHUtil.fromProtoTs(p.getWindowStart());
        this.windowEnd = LHUtil.fromProtoTs(p.getWindowEnd());
    }

    @Override
    public UsageMetric.Builder toProto() {
        return UsageMetric.newBuilder()
                .setId(id)
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

    @Override
    public String toString() {
        return "UsageMetric{" + "id='"
                + id + '\'' + ", value="
                + value + ", windowStart="
                + windowStart + ", windowEnd="
                + windowEnd + '}';
    }

    public boolean isStillActive(Date eventTime) {
        return windowEnd.compareTo(eventTime) >= 0;
    }
}
