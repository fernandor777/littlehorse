// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.common.proto;

public interface SleepNodePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.SleepNodePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lh_proto.VariableAssignmentPb raw_seconds = 1;</code>
   * @return Whether the rawSeconds field is set.
   */
  boolean hasRawSeconds();
  /**
   * <code>.lh_proto.VariableAssignmentPb raw_seconds = 1;</code>
   * @return The rawSeconds.
   */
  io.littlehorse.common.proto.VariableAssignmentPb getRawSeconds();
  /**
   * <code>.lh_proto.VariableAssignmentPb raw_seconds = 1;</code>
   */
  io.littlehorse.common.proto.VariableAssignmentPbOrBuilder getRawSecondsOrBuilder();

  /**
   * <code>.lh_proto.VariableAssignmentPb timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.lh_proto.VariableAssignmentPb timestamp = 2;</code>
   * @return The timestamp.
   */
  io.littlehorse.common.proto.VariableAssignmentPb getTimestamp();
  /**
   * <code>.lh_proto.VariableAssignmentPb timestamp = 2;</code>
   */
  io.littlehorse.common.proto.VariableAssignmentPbOrBuilder getTimestampOrBuilder();

  /**
   * <code>.lh_proto.VariableAssignmentPb iso_date = 3;</code>
   * @return Whether the isoDate field is set.
   */
  boolean hasIsoDate();
  /**
   * <code>.lh_proto.VariableAssignmentPb iso_date = 3;</code>
   * @return The isoDate.
   */
  io.littlehorse.common.proto.VariableAssignmentPb getIsoDate();
  /**
   * <code>.lh_proto.VariableAssignmentPb iso_date = 3;</code>
   */
  io.littlehorse.common.proto.VariableAssignmentPbOrBuilder getIsoDateOrBuilder();

  public io.littlehorse.common.proto.SleepNodePb.SleepLengthCase getSleepLengthCase();
}
