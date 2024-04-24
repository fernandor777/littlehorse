package io.littlehorse.common.model.getable.core.metrics;

import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.AbstractGetable;
import io.littlehorse.common.model.CoreGetable;
import io.littlehorse.common.model.getable.objectId.LatestMetricIdModel;
import io.littlehorse.common.proto.TagStorageType;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.LatestMetric;
import io.littlehorse.server.streams.storeinternals.GetableIndex;
import io.littlehorse.server.streams.storeinternals.index.IndexedField;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class LatestMetricModel extends CoreGetable<LatestMetric> {

    private LatestMetricIdModel id;
    private long value;
    private Date windowStart;
    private Date windowEnd;

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        LatestMetric p = (LatestMetric) proto;
        this.id = LHSerializable.fromProto(p.getId(), LatestMetricIdModel.class, context);
        this.value = p.getValue();
        this.windowStart = LHUtil.fromProtoTs(p.getWindowStart());
        this.windowEnd = LHUtil.fromProtoTs(p.getWindowEnd());
    }

    @Override
    public LatestMetric.Builder toProto() {
        return LatestMetric.newBuilder()
                .setId(id.toProto())
                .setValue(value)
                .setWindowStart(LHUtil.fromDate(windowStart))
                .setWindowEnd(LHUtil.fromDate(windowEnd));
    }

    @Override
    public Class<LatestMetric> getProtoBaseClass() {
        return LatestMetric.class;
    }

    @Override
    public Date getCreatedAt() {
        return windowStart;
    }

    @Override
    public List<GetableIndex<? extends AbstractGetable<?>>> getIndexConfigurations() {
        return List.of();
    }

    @Override
    public LatestMetricIdModel getObjectId() {
        return id;
    }

    @Override
    public List<IndexedField> getIndexValues(String key, Optional<TagStorageType> tagStorageType) {
        return null;
    }
}
