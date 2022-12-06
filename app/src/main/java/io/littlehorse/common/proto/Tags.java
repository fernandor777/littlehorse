// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tags.proto

package io.littlehorse.common.proto;

public final class Tags {
  private Tags() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_AttributePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_AttributePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TagPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TagPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TagsCachePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TagsCachePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_DiscreteTagLocalCounterPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_DiscreteTagLocalCounterPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TagChangesToBroadcastPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TagChangesToBroadcastPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TagChangesToBroadcastPb_ChangelogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TagChangesToBroadcastPb_ChangelogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntags.proto\022\010lh_proto\032\037google/protobuf/" +
      "timestamp.proto\"\'\n\013AttributePb\022\013\n\003key\030\001 " +
      "\001(\t\022\013\n\003val\030\002 \001(\t\"\276\001\n\005TagPb\022*\n\004type\030\001 \001(\016" +
      "2\034.lh_proto.GETableClassEnumPb\022)\n\nattrib" +
      "utes\030\002 \003(\0132\025.lh_proto.AttributePb\022\033\n\023des" +
      "cribed_object_id\030\003 \001(\t\022+\n\007created\030\004 \001(\0132" +
      "\032.google.protobuf.Timestamp\022\024\n\014counter_k" +
      "eys\030\005 \003(\t\"\036\n\013TagsCachePb\022\017\n\007tag_ids\030\001 \003(" +
      "\t\"[\n\031DiscreteTagLocalCounterPb\022\023\n\013local_" +
      "count\030\001 \001(\003\022\026\n\016tag_attributes\030\002 \001(\t\022\021\n\tp" +
      "artition\030\003 \001(\005\"\310\001\n\027TagChangesToBroadcast" +
      "Pb\022C\n\tchangelog\030\001 \003(\01320.lh_proto.TagChan" +
      "gesToBroadcastPb.ChangelogEntry\022\021\n\tparti" +
      "tion\030\002 \001(\005\032U\n\016ChangelogEntry\022\013\n\003key\030\001 \001(" +
      "\t\0222\n\005value\030\002 \001(\0132#.lh_proto.DiscreteTagL" +
      "ocalCounterPb:\0028\001*\203\001\n\022GETableClassEnumPb" +
      "\022\014\n\010TASK_DEF\020\000\022\026\n\022EXTERNAL_EVENT_DEF\020\001\022\013" +
      "\n\007WF_SPEC\020\002\022\n\n\006WF_RUN\020\003\022\014\n\010NODE_RUN\020\004\022\014\n" +
      "\010VARIABLE\020\005\022\022\n\016EXTERNAL_EVENT\020\006B(\n\033io.li" +
      "ttlehorse.common.protoP\001Z\007.;modelb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_lh_proto_AttributePb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_AttributePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_AttributePb_descriptor,
        new java.lang.String[] { "Key", "Val", });
    internal_static_lh_proto_TagPb_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lh_proto_TagPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TagPb_descriptor,
        new java.lang.String[] { "Type", "Attributes", "DescribedObjectId", "Created", "CounterKeys", });
    internal_static_lh_proto_TagsCachePb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lh_proto_TagsCachePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TagsCachePb_descriptor,
        new java.lang.String[] { "TagIds", });
    internal_static_lh_proto_DiscreteTagLocalCounterPb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lh_proto_DiscreteTagLocalCounterPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_DiscreteTagLocalCounterPb_descriptor,
        new java.lang.String[] { "LocalCount", "TagAttributes", "Partition", });
    internal_static_lh_proto_TagChangesToBroadcastPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lh_proto_TagChangesToBroadcastPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TagChangesToBroadcastPb_descriptor,
        new java.lang.String[] { "Changelog", "Partition", });
    internal_static_lh_proto_TagChangesToBroadcastPb_ChangelogEntry_descriptor =
      internal_static_lh_proto_TagChangesToBroadcastPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_TagChangesToBroadcastPb_ChangelogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TagChangesToBroadcastPb_ChangelogEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}