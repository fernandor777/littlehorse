package io.littlehorse.server.monitoring.metrics;

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
    private final Map<String, UsageMetric> metrics = new HashMap<>();
    private final Map<String, MonitorConfigModel> configs = new HashMap<>();

    public void record(final UsageMeasure usageMeasure) {
        UsageMetric currentMetric = metrics.get(usageMeasure.id());
        Optional<UsageMetric> metricOrEmpty =
                calculateMetricFor(configs.get(usageMeasure.id()), currentMetric, usageMeasure.createdOn());
        metricOrEmpty.ifPresent(usageMetric -> metrics.put(usageMeasure.id(), usageMetric));
    }

    public Optional<UsageMetric> getMetric(String metricId) {
        return Optional.ofNullable(metrics.get(metricId));
    }

    public void register(MonitorConfigModel config) {
        configs.put(config.getMetricId(), config);
    }

    public boolean isMetricEnabledFor(String metricId) {
        return configs.containsKey(metricId);
    }

    public Optional<UsageMetric> calculateMetricFor(
            @Nullable MonitorConfigModel config, @Nullable UsageMetric currentMetric, Date measureTime) {
        if (config == null) {
            return Optional.empty();
        }
        if (currentMetric != null && currentMetric.isStillActive(measureTime)) {
            currentMetric.increment();
            return Optional.of(currentMetric);
        }
        // create metric for a new window
        Date windowStart = measureTime;
        LocalDateTime windowEndLocalTime = calculateWindowEnd(windowStart, config.getWindowLength());
        Date windowEnd =
                Date.from(windowEndLocalTime.toInstant(OffsetDateTime.now().getOffset()));
        return Optional.of(new UsageMetric(config.getMetricId(), 1L, windowStart, windowEnd));
    }

    //
    private LocalDateTime calculateWindowEnd(Date windowStart, Duration windowLength) {
        LocalDateTime startTime = Instant.ofEpochMilli(windowStart.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return startTime.plus(windowLength);
    }
}
