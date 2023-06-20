// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface UserTaskDefPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskDefPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 version = 2;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>optional string description = 3;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .littlehorse.UserTaskFieldPb fields = 4;</code>
   */
  java.util.List<io.littlehorse.jlib.common.proto.UserTaskFieldPb> 
      getFieldsList();
  /**
   * <code>repeated .littlehorse.UserTaskFieldPb fields = 4;</code>
   */
  io.littlehorse.jlib.common.proto.UserTaskFieldPb getFields(int index);
  /**
   * <code>repeated .littlehorse.UserTaskFieldPb fields = 4;</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .littlehorse.UserTaskFieldPb fields = 4;</code>
   */
  java.util.List<? extends io.littlehorse.jlib.common.proto.UserTaskFieldPbOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <code>repeated .littlehorse.UserTaskFieldPb fields = 4;</code>
   */
  io.littlehorse.jlib.common.proto.UserTaskFieldPbOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
}
