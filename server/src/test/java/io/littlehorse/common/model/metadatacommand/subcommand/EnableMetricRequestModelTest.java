package io.littlehorse.common.model.metadatacommand.subcommand;

import static org.assertj.core.api.Assertions.*;

import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.LHServerConfig;
import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import io.littlehorse.common.model.getable.objectId.TenantIdModel;
import io.littlehorse.common.model.metadatacommand.MetadataCommandModel;
import io.littlehorse.common.model.metadatacommand.MetadataSubCommand;
import io.littlehorse.sdk.common.proto.EnableMetricRequest;
import io.littlehorse.sdk.common.proto.MonitorConfigId;
import io.littlehorse.server.KafkaStreamsServerImpl;
import io.littlehorse.server.monitoring.metrics.MonitorConfigModel;
import io.littlehorse.server.streams.ServerTopology;
import io.littlehorse.server.streams.storeinternals.ReadOnlyMetadataManager;
import io.littlehorse.server.streams.stores.ClusterScopedStore;
import io.littlehorse.server.streams.stores.TenantScopedStore;
import io.littlehorse.server.streams.topology.core.ExecutionContext;
import io.littlehorse.server.streams.topology.core.processors.MetadataProcessor;
import io.littlehorse.server.streams.util.HeadersUtil;
import io.littlehorse.server.streams.util.MetadataCache;
import java.time.Duration;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.processor.api.MockProcessorContext;
import org.apache.kafka.streams.processor.api.Record;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.Stores;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnableMetricRequestModelTest {

    @Mock
    private LHServerConfig config;

    @Mock
    private KafkaStreamsServerImpl server;

    private final MetadataCache metadataCache = new MetadataCache();
    private final KeyValueStore<String, Bytes> nativeMetadataStore = Stores.keyValueStoreBuilder(
                    Stores.inMemoryKeyValueStore(ServerTopology.METADATA_STORE), Serdes.String(), Serdes.Bytes())
            .withLoggingDisabled()
            .build();

    private ExecutionContext executionContext = Mockito.mock(Answers.RETURNS_DEEP_STUBS);
    private final String metricId = "I'm a metric";
    private final String tenantId = "A";
    private final String principalId = "pedro";

    private final MockProcessorContext<String, Bytes> mockProcessorContext = new MockProcessorContext<>();

    private MetadataProcessor metadataProcessor;

    private final ReadOnlyMetadataManager metadataManager = new ReadOnlyMetadataManager(
            ClusterScopedStore.newInstance(nativeMetadataStore, executionContext),
            TenantScopedStore.newInstance(nativeMetadataStore, new TenantIdModel(tenantId), executionContext),
            metadataCache);
    private final EnableMetricRequestModel enableMetricCommand =
            LHSerializable.fromProto(buildEnableMetricRequest(), EnableMetricRequestModel.class, executionContext);

    @BeforeEach
    public void setup() {
        nativeMetadataStore.init(mockProcessorContext.getStateStoreContext(), nativeMetadataStore);
        metadataProcessor = new MetadataProcessor(config, server, metadataCache);
    }

    @Test
    public void shouldEnableMetric() {
        sendCommand(enableMetricCommand);
        MonitorConfigModel monitorConfig = metadataManager.get(new MonitorConfigIdModel(metricId));
        assertThat(monitorConfig).isNotNull();
        assertThat(monitorConfig.getMetricId().getId()).isEqualTo(metricId);
        assertThat(monitorConfig.getCreatedAt()).isInThePast();
        assertThat(monitorConfig.getWindowLength()).isEqualTo(Duration.ofDays(2));
    }

    private EnableMetricRequest buildEnableMetricRequest() {
        return EnableMetricRequest.newBuilder()
                .setId(MonitorConfigId.newBuilder().setId(metricId).build())
                .setWindowLengthMs(Duration.ofDays(2).toMillis())
                .build();
    }

    private MetadataCommandModel sendCommand(MetadataSubCommand<?> putPrincipalRequest) {
        MetadataCommandModel command = new MetadataCommandModel(putPrincipalRequest);
        Headers metadata = HeadersUtil.metadataHeadersFor(tenantId, principalId);
        metadataProcessor.init(mockProcessorContext);
        metadataProcessor.process(new Record<>(principalId, command.toProto().build(), 0L, metadata));
        return command;
    }
}
