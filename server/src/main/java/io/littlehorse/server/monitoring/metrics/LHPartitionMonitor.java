package io.littlehorse.server.monitoring.metrics;

import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.server.streams.topology.core.ProcessorExecutionContext;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class LHPartitionMonitor {
    private final Map<MonitorConfigIdModel, UsageMetric> metrics = new HashMap<>();
    private final Map<MonitorConfigIdModel, MonitorConfigModel> configs = new HashMap<>();

    public void record(final UsageMeasure usageMeasure, ProcessorExecutionContext context) {
        UsageMetric currentMetric = metrics.get(usageMeasure.id());
        MonitorConfigModel metricConfig = resolveMonitorConfig(usageMeasure.id(), context);
        Optional<UsageMetric> metricOrEmpty = calculateMetricFor(metricConfig, currentMetric, usageMeasure.createdOn());

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

    public Optional<UsageMetric> getMetric(MonitorConfigIdModel metricId) {
        return Optional.ofNullable(metrics.get(metricId));
    }

    public void register(MonitorConfigModel config) {
        configs.put(config.getMetricId(), config);
    }

    public boolean isMetricEnabledFor(MonitorConfigIdModel metricId, ProcessorExecutionContext context) {
        return resolveMonitorConfig(metricId, context) != null;
    }

    public Optional<UsageMetric> calculateMetricFor(
            @Nullable MonitorConfigModel config, @Nullable UsageMetric currentMetric, Date measureTime) {
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
        return Optional.of(new UsageMetric(config.getMetricId().getId(), 1L, windowStart, windowEnd));
    }

    //
    private LocalDateTime calculateWindowEnd(Date windowStart, Duration windowLength) {
        LocalDateTime startTime = Instant.ofEpochMilli(windowStart.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return startTime.plus(windowLength);
    }
}
