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
        System.out.println("incrementing value for " + toString());
        value += 1;
    }

    @Override
    public String toString() {
        return "UsageMetric{" + "id='"
                + id + '\'' + ", value="
                + value + ", windowStart="
                + windowStart + ", windowEnd="
                + windowEnd + '}';
    }

    public boolean isStillActive(Date eventTime) {
        return windowEnd.compareTo(eventTime) >= 0;
    }
}
