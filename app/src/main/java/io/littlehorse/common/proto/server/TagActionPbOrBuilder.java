// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public interface TagActionPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TagActionPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lh_proto.TagPb entry = 1;</code>
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   * <code>.lh_proto.TagPb entry = 1;</code>
   * @return The entry.
   */
  io.littlehorse.common.proto.server.TagPb getEntry();
  /**
   * <code>.lh_proto.TagPb entry = 1;</code>
   */
  io.littlehorse.common.proto.server.TagPbOrBuilder getEntryOrBuilder();

  /**
   * <code>.lh_proto.IndexActionEnum action = 2;</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <code>.lh_proto.IndexActionEnum action = 2;</code>
   * @return The action.
   */
  io.littlehorse.common.proto.server.IndexActionEnum getAction();
}