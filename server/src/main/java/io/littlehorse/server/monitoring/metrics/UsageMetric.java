package io.littlehorse.server.monitoring.metrics;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsageMetric {

    private final String id;
    private long value;
    private final Date windowStart;
    private final Date windowEnd;

    public void increment() {
        value += 1;
    }

    public boolean isStillActive(Date eventTime) {
        return windowEnd.compareTo(eventTime) >= 0;
    }
}
