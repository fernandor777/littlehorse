// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public interface TagsPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TagsPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .lh_proto.TagPb entries = 1;</code>
   */
  java.util.List<io.littlehorse.common.proto.server.TagPb> 
      getEntriesList();
  /**
   * <code>repeated .lh_proto.TagPb entries = 1;</code>
   */
  io.littlehorse.common.proto.server.TagPb getEntries(int index);
  /**
   * <code>repeated .lh_proto.TagPb entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .lh_proto.TagPb entries = 1;</code>
   */
  java.util.List<? extends io.littlehorse.common.proto.server.TagPbOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .lh_proto.TagPb entries = 1;</code>
   */
  io.littlehorse.common.proto.server.TagPbOrBuilder getEntriesOrBuilder(
      int index);
}