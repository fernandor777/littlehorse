// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public final class LhProto {
  private LhProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_VariableValuePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_VariableValuePb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016lh_proto.proto\022\010lh_proto\"\217\002\n\017VariableV" +
      "aluePb\022&\n\004type\030\001 \001(\0162\030.lh_proto.Variable" +
      "TypePb\022\025\n\010json_obj\030\002 \001(\tH\000\210\001\001\022\025\n\010json_ar" +
      "r\030\003 \001(\tH\001\210\001\001\022\023\n\006double\030\004 \001(\001H\002\210\001\001\022\021\n\004boo" +
      "l\030\005 \001(\010H\003\210\001\001\022\020\n\003str\030\006 \001(\tH\004\210\001\001\022\020\n\003int\030\007 " +
      "\001(\005H\005\210\001\001\022\022\n\005bytes\030\010 \001(\014H\006\210\001\001B\013\n\t_json_ob" +
      "jB\013\n\t_json_arrB\t\n\007_doubleB\007\n\005_boolB\006\n\004_s" +
      "trB\006\n\004_intB\010\n\006_bytes*Z\n\nLHStatusPb\022\014\n\010ST" +
      "ARTING\020\000\022\013\n\007RUNNING\020\001\022\r\n\tCOMPLETED\020\002\022\013\n\007" +
      "HALTING\020\003\022\n\n\006HALTED\020\004\022\t\n\005ERROR\020\005*_\n\016Vari" +
      "ableTypePb\022\014\n\010JSON_OBJ\020\000\022\014\n\010JSON_ARR\020\001\022\n" +
      "\n\006DOUBLE\020\002\022\010\n\004BOOL\020\003\022\007\n\003STR\020\004\022\007\n\003INT\020\005\022\t" +
      "\n\005BYTES\020\006*>\n\020TaskResultCodePb\022\013\n\007SUCCESS" +
      "\020\000\022\013\n\007TIMEOUT\020\001\022\020\n\014TASK_FAILURE\020\002B(\n\033io." +
      "littlehorse.common.protoP\001Z\007.;modelb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_lh_proto_VariableValuePb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_VariableValuePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_VariableValuePb_descriptor,
        new java.lang.String[] { "Type", "JsonObj", "JsonArr", "Double", "Bool", "Str", "Int", "Bytes", "JsonObj", "JsonArr", "Double", "Bool", "Str", "Int", "Bytes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
