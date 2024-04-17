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
    private final Map<String, MonitorConfig> configs = new HashMap<>();

    public void record(UsageMeasure usageMeasure) {
        UsageMetric currentMetric = metrics.get(usageMeasure.id());
        UsageMetric calculatedMetric =
                calculateMetricFor(configs.get(usageMeasure.id()), currentMetric, usageMeasure.createdOn());
        metrics.put(usageMeasure.id(), calculatedMetric);
    }

    public Optional<UsageMetric> getMetric(String metricId) {
        return Optional.ofNullable(metrics.get(metricId));
    }

    public void register(MonitorConfig config) {
        configs.put(config.metricId(), config);
    }

    public UsageMetric calculateMetricFor(
            @Nullable MonitorConfig config, @Nullable UsageMetric currentMetric, Date measureTime) {
        if (currentMetric != null && currentMetric.isStillActive(measureTime)) {
            currentMetric.increment();
            return currentMetric;
        }
        // create metric for a new window
        Date windowStart = measureTime;
        LocalDateTime windowEndLocalTime = calculateWindowEnd(windowStart, config.windowLengthMs());
        Date windowEnd =
                Date.from(windowEndLocalTime.toInstant(OffsetDateTime.now().getOffset()));
        return new UsageMetric(config.metricId(), 1L, windowStart, windowEnd);
    }

    //
    private LocalDateTime calculateWindowEnd(Date windowStart, Duration windowLength) {
        LocalDateTime startTime = Instant.ofEpochMilli(windowStart.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return startTime.plus(windowLength);
    }
}
