package io.littlehorse.server.monitoring.metrics;

import static org.assertj.core.api.Assertions.*;

import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LHPartitionMonitorTest {

    private final LHPartitionMonitor partitionMonitor = new LHPartitionMonitor();

    @Test
    public void shouldRegisterMetricConfig() {
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand");
        Duration windowLengthMs = Duration.ofHours(1);
        MonitorConfigModel config = new MonitorConfigModel(metricId, windowLengthMs);
        partitionMonitor.register(config);
        assertThat(partitionMonitor.isMetricEnabledFor(metricId)).isTrue();
    }

    @Test
    public void shouldCalculateMetricUsagePerId() {
        MonitorConfigIdModel metricId1 = new MonitorConfigIdModel("RunWfCommand");
        MonitorConfigIdModel metricId2 = new MonitorConfigIdModel("ReportTaskRun");
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
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand");
        Duration windowLengthMs = Duration.ofHours(1);
        MonitorConfigModel config = new MonitorConfigModel(metricId, windowLengthMs);
        partitionMonitor.register(config);
        assertThat(partitionMonitor.isMetricEnabledFor(metricId)).isTrue();
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

    @Test
    public void shouldIgnoreMeasureWhenIfThereIsNoConfig() {
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand");
        UsageMeasure measure2 = new UsageMeasure(metricId, new Date());
        assertThat(partitionMonitor.isMetricEnabledFor(metricId)).isFalse();
        partitionMonitor.record(measure2);
        Optional<UsageMetric> metric = partitionMonitor.getMetric(metricId);
        assertThat(metric).isEmpty();
    }
}
