package io.littlehorse.server.monitoring.metrics;

import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.AbstractGetable;
import io.littlehorse.common.model.MetadataGetable;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.proto.TagStorageType;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.MonitorConfig;
import io.littlehorse.server.streams.storeinternals.GetableIndex;
import io.littlehorse.server.streams.storeinternals.index.IndexedField;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import lombok.Getter;

@Getter
public class MonitorConfigModel extends MetadataGetable<MonitorConfig> {
    private MonitorConfigIdModel metricId;
    private Duration windowLength;
    private Date createdTime;

    public MonitorConfigModel(MonitorConfigIdModel metricId, Duration windowLength) {
        this.metricId = metricId;
        this.windowLength = windowLength;
        this.createdTime = new Date();
    }

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        MonitorConfig p = (MonitorConfig) proto;
        this.metricId = LHSerializable.fromProto(p.getId(), MonitorConfigIdModel.class, context);
        this.windowLength = Duration.ofMillis(p.getWindowLengthMs());
        this.createdTime = LHUtil.fromProtoTs(p.getCreatedTime());
    }

    @Override
    public MonitorConfig.Builder toProto() {
        return MonitorConfig.newBuilder()
                .setId(metricId.toProto())
                .setWindowLengthMs(windowLength.toMillis())
                .setCreatedTime(LHUtil.fromDate(createdTime));
    }

    @Override
    public Class<MonitorConfig> getProtoBaseClass() {
        return MonitorConfig.class;
    }

    @Override
    public Date getCreatedAt() {
        return createdTime;
    }

    @Override
    public List<GetableIndex<? extends AbstractGetable<?>>> getIndexConfigurations() {
        return List.of();
    }

    @Override
    public MonitorConfigIdModel getObjectId() {
        return metricId;
    }

    @Override
    public List<IndexedField> getIndexValues(String key, Optional<TagStorageType> tagStorageType) {
        return null;
    }
}
