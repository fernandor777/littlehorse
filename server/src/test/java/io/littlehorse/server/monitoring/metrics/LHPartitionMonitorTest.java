package io.littlehorse.server.monitoring.metrics;

import static org.assertj.core.api.Assertions.assertThat;

import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.model.getable.objectId.TenantIdModel;
import io.littlehorse.sdk.common.proto.LHPartitionMonitor;
import io.littlehorse.server.streams.storeinternals.ReadOnlyMetadataManager;
import io.littlehorse.server.streams.topology.core.ProcessorExecutionContext;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import org.apache.kafka.streams.processor.TaskId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LHPartitionMonitorTest {

    private final TaskId task = TaskId.parse("0_1");
    private final LHPartitionMonitorModel partitionMonitor = new LHPartitionMonitorModel(task);
    private final ProcessorExecutionContext mockContext = Mockito.mock();
    private final ReadOnlyMetadataManager mockMetadataManager = Mockito.mock();
    private final TenantIdModel tenantId = new TenantIdModel("my-tenant");

    @Test
    public void shouldRegisterMetricConfig() {
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand", tenantId);
        Duration windowLengthMs = Duration.ofHours(1);
        MonitorConfigModel config = new MonitorConfigModel(metricId, windowLengthMs);
        partitionMonitor.register(config);
        assertThat(partitionMonitor.isMetricEnabledFor(metricId, mockContext)).isTrue();
    }

    @Test
    public void shouldCalculateMetricUsagePerId() {
        partitionMonitor.register(
                new MonitorConfigModel(new MonitorConfigIdModel("RunWfCommand", tenantId), Duration.ofMillis(2)));
        partitionMonitor.register(
                new MonitorConfigModel(new MonitorConfigIdModel("ReportTaskRun", tenantId), Duration.ofMillis(2)));
        MonitorConfigIdModel metricId1 = new MonitorConfigIdModel("RunWfCommand", tenantId);
        MonitorConfigIdModel metricId2 = new MonitorConfigIdModel("ReportTaskRun", tenantId);
        UsageMeasure measure1 = new UsageMeasure(metricId1, new Date());
        UsageMeasure measure2 = new UsageMeasure(metricId1, new Date());
        UsageMeasure measure3 = new UsageMeasure(metricId2, new Date());
        partitionMonitor.record(measure1, mockContext);
        partitionMonitor.record(measure2, mockContext);
        partitionMonitor.record(measure3, mockContext);
        UsageMetricModel metric = partitionMonitor.getMetric(metricId1).get();
        assertThat(metric.getMetricId().getId()).isEqualTo(metricId1.getId());
        assertThat(metric.getValue()).isEqualTo(2L);
    }

    @Test
    public void shouldAggregateMetricsByMonitorConfig() {
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand", tenantId);
        Duration windowLengthMs = Duration.ofHours(1);
        MonitorConfigModel config = new MonitorConfigModel(metricId, windowLengthMs);
        partitionMonitor.register(config);
        assertThat(partitionMonitor.isMetricEnabledFor(metricId, mockContext)).isTrue();
        UsageMeasure measure1 = new UsageMeasure(
                metricId,
                Date.from(LocalDateTime.now()
                        .minusHours(2)
                        .atZone(ZoneId.systemDefault())
                        .toInstant()));
        UsageMeasure measure2 = new UsageMeasure(metricId, new Date());
        UsageMeasure measure3 = new UsageMeasure(metricId, new Date());
        partitionMonitor.record(measure1, mockContext);
        partitionMonitor.record(measure2, mockContext);
        partitionMonitor.record(measure3, mockContext);
        UsageMetricModel metric = partitionMonitor.getMetric(metricId).get();
        assertThat(metric.getMetricId().getId()).isEqualTo(metricId.getId());
        assertThat(metric.getValue()).isEqualTo(2L);
    }

    @Test
    public void shouldIgnoreMeasureWhenIfThereIsNoConfig() {
        Mockito.when(mockContext.metadataManager()).thenReturn(mockMetadataManager);
        Mockito.when(mockMetadataManager.get(Mockito.any(MonitorConfigIdModel.class)))
                .thenReturn(null);
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("DeletePrincipalCommand", tenantId);
        UsageMeasure measure2 = new UsageMeasure(metricId, new Date());
        assertThat(partitionMonitor.isMetricEnabledFor(metricId, mockContext)).isFalse();
        partitionMonitor.record(measure2, mockContext);
        Optional<UsageMetricModel> metric = partitionMonitor.getMetric(metricId);
        assertThat(metric).isEmpty();
    }

    @Test
    public void shouldDiscoverMonitorConfig() {
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("SleepNodeMaturedModel", tenantId);
        Duration windowLengthMs = Duration.ofHours(1);
        MonitorConfigModel config = new MonitorConfigModel(metricId, windowLengthMs);
        Mockito.when(mockContext.metadataManager()).thenReturn(mockMetadataManager);
        Mockito.when(mockMetadataManager.get(Mockito.any(MonitorConfigIdModel.class)))
                .thenReturn(config);
        assertThat(partitionMonitor.isMetricEnabledFor(metricId, mockContext)).isTrue();
        UsageMeasure measure1 = new UsageMeasure(
                metricId,
                Date.from(LocalDateTime.now()
                        .minusHours(2)
                        .atZone(ZoneId.systemDefault())
                        .toInstant()));
        UsageMeasure measure2 = new UsageMeasure(metricId, new Date());
        UsageMeasure measure3 = new UsageMeasure(metricId, new Date());
        partitionMonitor.record(measure1, mockContext);
        partitionMonitor.record(measure2, mockContext);
        partitionMonitor.record(measure3, mockContext);
        UsageMetricModel metric = partitionMonitor.getMetric(metricId).get();
        assertThat(metric.getMetricId().getId()).isEqualTo(metricId.getId());
        assertThat(metric.getValue()).isEqualTo(2L);
    }

    @Test
    public void shouldDoProtoSerializationWithConfigsAndMetrics() {
        partitionMonitor.register(
                new MonitorConfigModel(new MonitorConfigIdModel("RunWfCommand", tenantId), Duration.ofMinutes(2)));
        MonitorConfigIdModel metricId = new MonitorConfigIdModel("RunWfCommand", tenantId);
        partitionMonitor.record(new UsageMeasure(metricId, new Date()), mockContext);
        partitionMonitor.record(new UsageMeasure(metricId, new Date()), mockContext);
        partitionMonitor.record(new UsageMeasure(metricId, new Date()), mockContext);
        LHPartitionMonitor protoPartitionMonitor = partitionMonitor.toProto().build();
        LHPartitionMonitorModel deserializedPartitionMonitor =
                LHSerializable.fromProto(protoPartitionMonitor, LHPartitionMonitorModel.class, mockContext);
        assertThat(deserializedPartitionMonitor)
                .usingRecursiveComparison()
                .ignoringFields("configs")
                .isEqualTo(partitionMonitor);
    }
}
