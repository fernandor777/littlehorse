package io.littlehorse.server.monitoring.metrics;

import static org.assertj.core.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LHPartitionMonitorTest {

    private final LHPartitionMonitor partitionMonitor = new LHPartitionMonitor();

    @Test
    public void shouldCalculateMetricUsagePerId() {
        String metricId1 = "RunWfCommand";
        String metricId2 = "ReportTaskRun";
        UsageMeasure measure1 = new UsageMeasure(metricId1, new Date());
        UsageMeasure measure2 = new UsageMeasure(metricId1, new Date());
        UsageMeasure measure3 = new UsageMeasure(metricId2, new Date());
        partitionMonitor.record(measure1);
        partitionMonitor.record(measure2);
        partitionMonitor.record(measure3);
        UsageMetric metric = partitionMonitor.getMetric(metricId1).get();
        assertThat(metric.getId()).isEqualTo(metricId1);
        assertThat(metric.getValue()).isEqualTo(2L);
    }

    @Test
    public void shouldAggregateMetricsByMonitorConfig() {
        String metricId = "DeletePrincipalCommand";
        Duration windowLengthMs = Duration.ofHours(1);
        Duration advanceByMs = Duration.ofMinutes(1);
        MonitorConfig config = new MonitorConfig(metricId, windowLengthMs, advanceByMs);
        partitionMonitor.register(config);
        UsageMeasure measure1 = new UsageMeasure(
                metricId,
                Date.from(LocalDateTime.now()
                        .minusHours(2)
                        .atZone(ZoneId.systemDefault())
                        .toInstant()));
        UsageMeasure measure2 = new UsageMeasure(metricId, new Date());
        UsageMeasure measure3 = new UsageMeasure(metricId, new Date());
        partitionMonitor.record(measure1);
        partitionMonitor.record(measure2);
        partitionMonitor.record(measure3);
        UsageMetric metric = partitionMonitor.getMetric(metricId).get();
        assertThat(metric.getId()).isEqualTo(metricId);
        assertThat(metric.getValue()).isEqualTo(2L);
    }
}
