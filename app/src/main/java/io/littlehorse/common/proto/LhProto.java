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
      "\n\016lh_proto.proto\022\010lh_proto\"\215\001\n\017VariableV" +
      "aluePb\022\022\n\010json_obj\030\001 \001(\014H\000\022\022\n\010json_arr\030\002" +
      " \001(\014H\000\022\r\n\003dub\030\003 \001(\001H\000\022\016\n\004bool\030\004 \001(\010H\000\022\r\n" +
      "\003str\030\005 \001(\tH\000\022\r\n\003int\030\006 \001(\003H\000\022\016\n\004byte\030\007 \001(" +
      "\014H\000B\005\n\003val*Z\n\nLHStatusPb\022\014\n\010STARTING\020\000\022\013" +
      "\n\007RUNNING\020\001\022\r\n\tCOMPLETED\020\002\022\013\n\007HALTING\020\003\022" +
      "\n\n\006HALTED\020\004\022\t\n\005ERROR\020\005*>\n\020TaskResultCode" +
      "Pb\022\013\n\007SUCCESS\020\000\022\013\n\007TIMEOUT\020\001\022\020\n\014TASK_FAI" +
      "LURE\020\002B(\n\033io.littlehorse.common.protoP\001Z" +
      "\007.;modelb\006proto3"
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
        new java.lang.String[] { "JsonObj", "JsonArr", "Dub", "Bool", "Str", "Int", "Byte", "Val", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
