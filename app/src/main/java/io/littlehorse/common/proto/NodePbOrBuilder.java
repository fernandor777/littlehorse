// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.common.proto;

public interface NodePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.NodePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string task_def_name = 1;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string task_def_name = 1;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();

  /**
   * <code>.lh_proto.NodeTypePb type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.lh_proto.NodeTypePb type = 2;</code>
   * @return The type.
   */
  io.littlehorse.common.proto.NodeTypePb getType();

  /**
   * <code>repeated .lh_proto.EdgePb outgoing_edges = 3;</code>
   */
  java.util.List<io.littlehorse.common.proto.EdgePb> 
      getOutgoingEdgesList();
  /**
   * <code>repeated .lh_proto.EdgePb outgoing_edges = 3;</code>
   */
  io.littlehorse.common.proto.EdgePb getOutgoingEdges(int index);
  /**
   * <code>repeated .lh_proto.EdgePb outgoing_edges = 3;</code>
   */
  int getOutgoingEdgesCount();
  /**
   * <code>repeated .lh_proto.EdgePb outgoing_edges = 3;</code>
   */
  java.util.List<? extends io.littlehorse.common.proto.EdgePbOrBuilder> 
      getOutgoingEdgesOrBuilderList();
  /**
   * <code>repeated .lh_proto.EdgePb outgoing_edges = 3;</code>
   */
  io.littlehorse.common.proto.EdgePbOrBuilder getOutgoingEdgesOrBuilder(
      int index);
}
