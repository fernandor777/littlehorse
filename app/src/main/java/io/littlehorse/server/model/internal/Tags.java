package io.littlehorse.server.model.internal;

import java.util.ArrayList;
import java.util.List;
import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.proto.server.TagsPb;
import io.littlehorse.common.proto.server.TagsPbOrBuilder;
import io.littlehorse.common.proto.server.TagPb;

public class Tags extends LHSerializable<TagsPb> {
    public List<Tag> entries;

    public Tags() {
        this.entries = new ArrayList<>();
    }

    public Class<TagsPb> getProtoBaseClass() {
        return TagsPb.class;
    }

    public void initFrom(MessageOrBuilder proto) {
        TagsPbOrBuilder p = (TagsPbOrBuilder) proto;
        for (TagPb iepb: p.getEntriesList()) {
            Tag entry = new Tag();
            entry.initFrom(iepb);
            entries.add(entry);
        }
    }

    public TagsPb.Builder toProto() {
        TagsPb.Builder out = TagsPb.newBuilder();
        for (Tag e: entries) {
            out.addEntries(e.toProto());
        }

        return out;
    }
}