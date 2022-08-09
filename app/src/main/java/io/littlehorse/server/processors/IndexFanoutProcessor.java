package io.littlehorse.server.processors;

import java.util.ArrayList;
import java.util.List;
import org.apache.kafka.streams.processor.api.Processor;
import org.apache.kafka.streams.processor.api.ProcessorContext;
import org.apache.kafka.streams.processor.api.Record;
import org.apache.kafka.streams.state.KeyValueStore;
import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.LHConstants;
import io.littlehorse.common.model.GETable;
import io.littlehorse.common.proto.server.IndexActionEnum;
import io.littlehorse.server.model.internal.IndexEntries;
import io.littlehorse.server.model.internal.IndexEntry;
import io.littlehorse.server.model.internal.IndexEntryAction;

public class IndexFanoutProcessor<U extends MessageOrBuilder, T extends GETable<U>>
implements Processor<String, T, String, IndexEntryAction> {
    private ProcessorContext<String, IndexEntryAction> ctx;
    private KeyValueStore<String, IndexEntries> store;
    private Class<T> cls;

    public IndexFanoutProcessor(Class<T> cls) {
        this.cls = cls;
    }

    public void init(final ProcessorContext<String, IndexEntryAction> ctx) {
        this.ctx = ctx;
        this.store = ctx.getStateStore(GETable.getIndexStoreName(cls));
    }

    public void process(final Record<String, T> record) {
        String objectId = new String(record.headers().lastHeader(
            LHConstants.OBJECT_ID_HEADER
        ).value());
        T newT = record.value();

        IndexEntries oldEntriesObj = store.get(objectId);
        List<IndexEntry> oldIdx = (
            oldEntriesObj == null ? new ArrayList<>() : oldEntriesObj.entries
        );

        List<IndexEntry> newIdx = (
            newT == null ? new ArrayList<>() : newT.getIndexEntries()
        );

        if (newT == null) {
            store.delete(objectId);
        } else {
            IndexEntries newIdxEntries = new IndexEntries();
            newIdxEntries.entries = newIdx;
            store.put(objectId, newIdxEntries);
        }

        for (IndexEntry ie: newIdx) {
            if (!oldIdx.contains(ie)) {
                IndexEntryAction action = new IndexEntryAction();
                action.action = IndexActionEnum.CREATE_IDX_ENTRY;
                action.indexEntry = ie;
                Record<String, IndexEntryAction> rec = new Record<>(
                    ie.getPartitionKey(),
                    action,
                    record.timestamp()
                );
                rec.headers().add(LHConstants.OBJECT_ID_HEADER, objectId.getBytes());
                ctx.forward(rec);
            }
        }
        for (IndexEntry ie: oldIdx) {
            if (!newIdx.contains(ie)) {
                IndexEntryAction action = new IndexEntryAction();
                action.action = IndexActionEnum.DELETE_IDX_ENTRY;
                action.indexEntry = ie;
                ctx.forward(
                    new Record<String, IndexEntryAction>(
                        ie.getPartitionKey(),
                        action,
                        record.timestamp()
                    )
                );
            }
        }
    }
}