// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler.proto

package io.littlehorse.common.proto;

public interface ThreadRunStatePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.ThreadRunStatePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string thread_spec_name = 1;</code>
   * @return The threadSpecName.
   */
  java.lang.String getThreadSpecName();
  /**
   * <code>string thread_spec_name = 1;</code>
   * @return The bytes for threadSpecName.
   */
  com.google.protobuf.ByteString
      getThreadSpecNameBytes();

  /**
   * <code>.lh_proto.LHStatusPb status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.lh_proto.LHStatusPb status = 2;</code>
   * @return The status.
   */
  io.littlehorse.common.proto.LHStatusPb getStatus();

  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 3;</code>
   * @return Whether the currentNodeRun field is set.
   */
  boolean hasCurrentNodeRun();
  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 3;</code>
   * @return The currentNodeRun.
   */
  io.littlehorse.common.proto.NodeRunStatePb getCurrentNodeRun();
  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 3;</code>
   */
  io.littlehorse.common.proto.NodeRunStatePbOrBuilder getCurrentNodeRunOrBuilder();
}
