// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface FailureDefPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.FailureDefPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string failure_name = 1;</code>
   * @return The failureName.
   */
  java.lang.String getFailureName();
  /**
   * <code>string failure_name = 1;</code>
   * @return The bytes for failureName.
   */
  com.google.protobuf.ByteString
      getFailureNameBytes();

  /**
   * <code>.lh_proto.TaskResultCodePb failure_code = 2;</code>
   * @return The enum numeric value on the wire for failureCode.
   */
  int getFailureCodeValue();
  /**
   * <code>.lh_proto.TaskResultCodePb failure_code = 2;</code>
   * @return The failureCode.
   */
  io.littlehorse.common.proto.TaskResultCodePb getFailureCode();

  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.lh_proto.VariableAssignmentPb content = 4;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.lh_proto.VariableAssignmentPb content = 4;</code>
   * @return The content.
   */
  io.littlehorse.common.proto.VariableAssignmentPb getContent();
  /**
   * <code>.lh_proto.VariableAssignmentPb content = 4;</code>
   */
  io.littlehorse.common.proto.VariableAssignmentPbOrBuilder getContentOrBuilder();
}