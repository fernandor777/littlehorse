// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface WaitThreadRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.WaitThreadRunPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.protobuf.Timestamp thread_end_time = 1;</code>
   * @return Whether the threadEndTime field is set.
   */
  boolean hasThreadEndTime();
  /**
   * <code>optional .google.protobuf.Timestamp thread_end_time = 1;</code>
   * @return The threadEndTime.
   */
  com.google.protobuf.Timestamp getThreadEndTime();
  /**
   * <code>optional .google.protobuf.Timestamp thread_end_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getThreadEndTimeOrBuilder();

  /**
   * <code>.littlehorse.LHStatusPb thread_status = 2;</code>
   * @return The enum numeric value on the wire for threadStatus.
   */
  int getThreadStatusValue();
  /**
   * <code>.littlehorse.LHStatusPb thread_status = 2;</code>
   * @return The threadStatus.
   */
  io.littlehorse.sdk.common.proto.LHStatusPb getThreadStatus();

  /**
   * <code>int32 thread_run_number = 3;</code>
   * @return The threadRunNumber.
   */
  int getThreadRunNumber();
}