package io.littlehorse.server.monitoring.metrics;

import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.Storeable;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.proto.StoreableType;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.LHPartitionMonitor;
import io.littlehorse.sdk.common.proto.LHTenantPartitionMonitor;
import io.littlehorse.sdk.common.proto.UsageMetric;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import io.littlehorse.server.streams.topology.core.ProcessorExecutionContext;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.kafka.streams.processor.TaskId;

public class LHPartitionMonitorModel extends Storeable<LHPartitionMonitor> {
    private TaskId taskId;

    private final Map<MonitorConfigIdModel, UsageMetricModel> metrics = new HashMap<>();
    private final Map<MonitorConfigIdModel, MonitorConfigModel> configs = new HashMap<>();

    public LHPartitionMonitorModel() {}

    public LHPartitionMonitorModel(TaskId taskId) {
        this.taskId = taskId;
    }

    public void record(final UsageMeasure usageMeasure, ProcessorExecutionContext context) {
        UsageMetricModel currentMetric = metrics.get(usageMeasure.id());
        MonitorConfigModel metricConfig = resolveMonitorConfig(usageMeasure.id(), context);
        Optional<UsageMetricModel> metricOrEmpty =
                calculateMetricFor(metricConfig, currentMetric, usageMeasure.createdOn());

        metricOrEmpty.ifPresentOrElse(
                usageMetric -> metrics.put(usageMeasure.id(), usageMetric),
                () -> System.out.println(
                        "well, not found for " + usageMeasure.id().getId()));
    }

    private MonitorConfigModel resolveMonitorConfig(MonitorConfigIdModel metricId, ProcessorExecutionContext context) {
        return configs.get(metricId) != null
                ? configs.get(metricId)
                : context.metadataManager().get(metricId);
    }

    public Optional<UsageMetricModel> getMetric(MonitorConfigIdModel metricId) {
        return Optional.ofNullable(metrics.get(metricId));
    }

    public void register(MonitorConfigModel config) {
        configs.put(config.getMetricId(), config);
    }

    public boolean isMetricEnabledFor(MonitorConfigIdModel metricId, ProcessorExecutionContext context) {
        return resolveMonitorConfig(metricId, context) != null;
    }

    public Optional<UsageMetricModel> calculateMetricFor(
            @Nullable MonitorConfigModel config, @Nullable UsageMetricModel currentMetric, Date measureTime) {
        if (config == null) {
            return Optional.empty();
        }
        configs.putIfAbsent(config.getMetricId(), config);
        if (currentMetric != null && currentMetric.isStillActive(measureTime)) {
            currentMetric.increment();
            return Optional.of(currentMetric);
        }
        // create metric for a new window
        Date windowStart = measureTime;
        LocalDateTime windowEndLocalTime = calculateWindowEnd(windowStart, config.getWindowLength());
        Date windowEnd =
                Date.from(windowEndLocalTime.toInstant(OffsetDateTime.now().getOffset()));
        return Optional.of(new UsageMetricModel(config.getMetricId(), 1L, windowStart, windowEnd));
    }

    //
    private LocalDateTime calculateWindowEnd(Date windowStart, Duration windowLength) {
        LocalDateTime startTime = Instant.ofEpochMilli(windowStart.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return startTime.plus(windowLength);
    }

    private List<LHTenantPartitionMonitor> perTenantPartitionMonitors() {
        Map<MonitorConfigIdModel, UsageMetric> metricsPerTenant = new HashMap<>();
        metrics.forEach((monitorConfigIdModel, usageMetric) -> {
            metricsPerTenant.put(monitorConfigIdModel, usageMetric.toProto().build());
        });
        List<LHTenantPartitionMonitor> out = new ArrayList<>();
        metricsPerTenant.forEach((metricId, usageMetrics) -> {
            LHTenantPartitionMonitor partitionMonitor = LHTenantPartitionMonitor.newBuilder()
                    .setMetricId(metricId.toProto())
                    .setMetrics(usageMetrics)
                    .build();
            out.add(partitionMonitor);
        });
        return out;
    }

    @Override
    public LHPartitionMonitor.Builder toProto() {
        return LHPartitionMonitor.newBuilder()
                .setId(taskId.toString())
                .addAllTenantPartitions(perTenantPartitionMonitors());
    }

    @Override
    public void initFrom(Message proto, ExecutionContext context) throws LHSerdeError {
        LHPartitionMonitor p = (LHPartitionMonitor) proto;
        this.taskId = TaskId.parse(p.getId());
        for (LHTenantPartitionMonitor lhTenantPartitionMonitor : p.getTenantPartitionsList()) {
            MonitorConfigIdModel configId = LHSerializable.fromProto(
                    lhTenantPartitionMonitor.getMetricId(), MonitorConfigIdModel.class, context);
            UsageMetricModel metric =
                    LHSerializable.fromProto(lhTenantPartitionMonitor.getMetrics(), UsageMetricModel.class, context);
            metrics.put(configId, metric);
        }
    }

    @Override
    public Class<LHPartitionMonitor> getProtoBaseClass() {
        return LHPartitionMonitor.class;
    }

    @Override
    public String getStoreKey() {
        return null;
    }

    @Override
    public StoreableType getType() {
        return null;
    }

    public void fordward(ProcessorExecutionContext context) {}
}
