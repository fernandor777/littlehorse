// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface NodeRunStatePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.NodeRunStatePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string node_name = 1;</code>
   * @return The nodeName.
   */
  java.lang.String getNodeName();
  /**
   * <code>string node_name = 1;</code>
   * @return The bytes for nodeName.
   */
  com.google.protobuf.ByteString
      getNodeNameBytes();

  /**
   * <code>int32 attempt_number = 2;</code>
   * @return The attemptNumber.
   */
  int getAttemptNumber();

  /**
   * <code>int32 position = 3;</code>
   * @return The position.
   */
  int getPosition();

  /**
   * <code>int32 number = 4;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>.lh_proto.LHStatusPb status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.lh_proto.LHStatusPb status = 5;</code>
   * @return The status.
   */
  io.littlehorse.common.proto.LHStatusPb getStatus();
}