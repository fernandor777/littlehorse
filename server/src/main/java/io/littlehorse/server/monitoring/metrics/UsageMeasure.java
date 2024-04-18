package io.littlehorse.server.monitoring.metrics;

import io.littlehorse.common.model.getable.objectId.MonitorConfigIdModel;
import java.util.Date;

public record UsageMeasure(MonitorConfigIdModel id, Date createdOn) {}
