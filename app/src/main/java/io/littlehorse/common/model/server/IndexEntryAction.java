package io.littlehorse.common.model.server;

import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.proto.IndexActionEnum;
import io.littlehorse.common.proto.TagActionPb;
import io.littlehorse.common.proto.TagActionPbOrBuilder;

public class IndexEntryAction extends LHSerializable<TagActionPb> {

    public IndexActionEnum action;
    public Tag indexEntry;

    public Class<TagActionPb> getProtoBaseClass() {
        return TagActionPb.class;
    }

    public void initFrom(MessageOrBuilder proto) {
        TagActionPbOrBuilder p = (TagActionPbOrBuilder) proto;
        action = p.getAction();
        indexEntry = new Tag();
        indexEntry.initFrom(p.getEntry());
    }

    public TagActionPb.Builder toProto() {
        TagActionPb.Builder out = TagActionPb.newBuilder();
        out.setAction(action);
        out.setEntry(indexEntry.toProto());
        return out;
    }
}