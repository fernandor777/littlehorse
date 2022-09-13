package io.littlehorse.common.util;

import static com.google.protobuf.util.Timestamps.fromMillis;

import com.google.protobuf.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class LHUtil {

    public static Timestamp fromDate(Date date) {
        if (date == null) return null;
        return fromMillis(date.getTime());
    }

    public static Date fromProtoTs(Timestamp proto) {
        if (proto == null) return null;
        Date out = Date.from(
            Instant.ofEpochSecond(proto.getSeconds(), proto.getNanos())
        );

        if (out.getTime() == 0) {
            out = new Date();
        }

        return out;
    }

    public static void logBack(int framesBack, Object... things) {
        framesBack += 2; // 2 frames needed for processing the thing.
        StackTraceElement ste = Thread
            .currentThread()
            .getStackTrace()[framesBack];

        StringBuilder builder = new StringBuilder();

        builder.append("LHorse: ");
        builder.append(ste.getMethodName());
        builder.append(" ");
        builder.append(ste.getFileName());
        builder.append(": ");
        builder.append(ste.getLineNumber());
        builder.append(": ");
        for (Object thing : things) {
            builder.append(thing == null ? "null" : thing.toString());
            builder.append(" ");
        }
        System.out.println(builder.toString());
    }

    public static void log(Object... things) {
        logBack(1, things); // Add one frame back because of this method call.
    }

    public static String generateGuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String toLhDbFormat(Date date) {
        return date == null ? "null" : String.format("%012d", date.getTime());
    }

    public static String toLhDbFormat(Integer val) {
        return val == null ? "null" : String.format("%012d", val);
    }

    public static String toLhDbFormat(Boolean val) {
        return val == null ? "null" : val.toString();
    }

    /**
     * TODO: THis needs more thought. We want the double to be searchable both positive and negative,
     * and we want to be able to do range queries.
     */
    public static String toLhDbFormat(Double val) {
        return val == null ? "null" : String.format("%20.10f", val);
    }

    public static String toLhDbFormat(String val) {
        // TODO: Determine if we want to truncate this by just hashing it.
        return val;
    }
}
