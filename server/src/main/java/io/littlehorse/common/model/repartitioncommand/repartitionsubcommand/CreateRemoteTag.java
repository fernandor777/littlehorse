package io.littlehorse.common.model.repartitioncommand.repartitionsubcommand;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.model.repartitioncommand.RepartitionSubCommand;
import io.littlehorse.common.proto.CreateRemoteTagPb;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.server.streams.store.RocksDBWrapper;
import io.littlehorse.server.streams.storeinternals.index.Tag;
import org.apache.kafka.streams.processor.api.ProcessorContext;

public class CreateRemoteTag extends LHSerializable<CreateRemoteTagPb> implements RepartitionSubCommand {

    private Tag tag;

    public CreateRemoteTag() {}

    public CreateRemoteTag(Tag tag) {
        this.tag = tag;
    }

    @Override
    public void process(RocksDBWrapper repartitionedStore, ProcessorContext<Void, Void> ctx) {
        repartitionedStore.put(tag);
    }

    @Override
    public String getPartitionKey() {
        return this.tag.getAttributeString();
    }

    @Override
    public CreateRemoteTagPb.Builder toProto() {
        return CreateRemoteTagPb.newBuilder().setTag(this.tag.toProto());
    }

    @Override
    public void initFrom(Message proto) throws LHSerdeError {
        CreateRemoteTagPb remoteTagSubCommandPb = (CreateRemoteTagPb) proto;
        this.tag = LHSerializable.fromProto(remoteTagSubCommandPb.getTag(), Tag.class);
    }

    @Override
    public Class<? extends GeneratedMessageV3> getProtoBaseClass() {
        return CreateRemoteTagPb.class;
    }
}