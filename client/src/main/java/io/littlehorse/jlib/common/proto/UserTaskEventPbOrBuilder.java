// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface UserTaskEventPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskEventPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.littlehorse.UserTaskEventPb.UTETaskExecutedPb task_executed = 2;</code>
   * @return Whether the taskExecuted field is set.
   */
  boolean hasTaskExecuted();
  /**
   * <code>.littlehorse.UserTaskEventPb.UTETaskExecutedPb task_executed = 2;</code>
   * @return The taskExecuted.
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTETaskExecutedPb getTaskExecuted();
  /**
   * <code>.littlehorse.UserTaskEventPb.UTETaskExecutedPb task_executed = 2;</code>
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTETaskExecutedPbOrBuilder getTaskExecutedOrBuilder();

  /**
   * <code>.littlehorse.UserTaskEventPb.UTEReassignedPb reassigned = 3;</code>
   * @return Whether the reassigned field is set.
   */
  boolean hasReassigned();
  /**
   * <code>.littlehorse.UserTaskEventPb.UTEReassignedPb reassigned = 3;</code>
   * @return The reassigned.
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTEReassignedPb getReassigned();
  /**
   * <code>.littlehorse.UserTaskEventPb.UTEReassignedPb reassigned = 3;</code>
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTEReassignedPbOrBuilder getReassignedOrBuilder();

  /**
   * <pre>
   * TODO: Add "save user task" and "complete user task" to the
   * audit log
   * </pre>
   *
   * <code>.littlehorse.UserTaskEventPb.UTECancelledPb cancelled = 4;</code>
   * @return Whether the cancelled field is set.
   */
  boolean hasCancelled();
  /**
   * <pre>
   * TODO: Add "save user task" and "complete user task" to the
   * audit log
   * </pre>
   *
   * <code>.littlehorse.UserTaskEventPb.UTECancelledPb cancelled = 4;</code>
   * @return The cancelled.
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTECancelledPb getCancelled();
  /**
   * <pre>
   * TODO: Add "save user task" and "complete user task" to the
   * audit log
   * </pre>
   *
   * <code>.littlehorse.UserTaskEventPb.UTECancelledPb cancelled = 4;</code>
   */
  io.littlehorse.jlib.common.proto.UserTaskEventPb.UTECancelledPbOrBuilder getCancelledOrBuilder();

  public io.littlehorse.jlib.common.proto.UserTaskEventPb.EventCase getEventCase();
}
