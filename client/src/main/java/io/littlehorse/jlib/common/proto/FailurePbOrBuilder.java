// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface FailurePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.FailurePb)
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
   * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
   * @return The enum numeric value on the wire for failureCode.
   */
  int getFailureCodeValue();
  /**
   * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
   * @return The failureCode.
   */
  io.littlehorse.jlib.common.proto.TaskResultCodePb getFailureCode();

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
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   * @return The content.
   */
  io.littlehorse.jlib.common.proto.VariableValuePb getContent();
  /**
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   */
  io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getContentOrBuilder();
}
