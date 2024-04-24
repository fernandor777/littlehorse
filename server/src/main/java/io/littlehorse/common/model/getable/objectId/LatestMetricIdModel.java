package io.littlehorse.common.model.getable.objectId;

import com.google.protobuf.Message;
import io.littlehorse.common.LHStore;
import io.littlehorse.common.model.getable.ObjectIdModel;
import io.littlehorse.common.model.getable.core.metrics.LatestMetricModel;
import io.littlehorse.common.proto.GetableClassEnum;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.LatestMetric;
import io.littlehorse.sdk.common.proto.LatestMetricId;
import io.littlehorse.server.streams.topology.core.ExecutionContext;

public class LatestMetricIdModel extends ObjectIdModel<LatestMetricId, LatestMetric, LatestMetricModel> {
    private String metricId;

    @Override
    public LatestMetricId.Builder toProto() {
        return LatestMetricId.newBuilder().setId(metricId);
    }

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        LatestMetricId p = (LatestMetricId) proto;
        this.metricId = p.getId();
    }

    @Override
    public Class<LatestMetricId> getProtoBaseClass() {
        return LatestMetricId.class;
    }

    @Override
    public String toString() {
        return metricId;
    }

    @Override
    public void initFromString(String storeKey) {
        metricId = storeKey;
    }

    @Override
    public GetableClassEnum getType() {
        return GetableClassEnum.LATEST_METRIC;
    }

    @Override
    public LHStore getStore() {
        return LHStore.REPARTITION;
    }
}
