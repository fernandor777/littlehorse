package io.littlehorse.common.model.getable.objectId;

import com.google.protobuf.Message;
import io.littlehorse.common.model.getable.MetadataId;
import io.littlehorse.common.proto.GetableClassEnum;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.MonitorConfig;
import io.littlehorse.sdk.common.proto.MonitorConfigId;
import io.littlehorse.server.monitoring.metrics.MonitorConfigModel;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import lombok.Getter;

import java.util.Objects;

@Getter
public class MonitorConfigIdModel extends MetadataId<MonitorConfigId, MonitorConfig, MonitorConfigModel> {
    private String id;

    public MonitorConfigIdModel() {}

    public MonitorConfigIdModel(String id) {
        this.id = id;
    }

    @Override
    public MonitorConfigId.Builder toProto() {
        return MonitorConfigId.newBuilder().setId(id);
    }

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        MonitorConfigId p = (MonitorConfigId) proto;
        this.id = p.getId();
    }

    @Override
    public Class<MonitorConfigId> getProtoBaseClass() {
        return MonitorConfigId.class;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public void initFromString(String storeKey) {
        this.id = storeKey;
    }

    @Override
    public GetableClassEnum getType() {
        return GetableClassEnum.MONITOR_CONFIG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonitorConfigIdModel that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
