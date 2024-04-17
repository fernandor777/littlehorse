package io.littlehorse.server.monitoring.metrics;

import java.time.Duration;

public record MonitorConfig(String metricId, Duration windowLengthMs, Duration advanceByMs) {}
