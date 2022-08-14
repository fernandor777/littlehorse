// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler.proto

package io.littlehorse.common.proto.scheduler;

public interface WfRunEventPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.WfRunEventPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  java.lang.String getWfRunId();
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The bytes for wfRunId.
   */
  com.google.protobuf.ByteString
      getWfRunIdBytes();

  /**
   * <code>string wf_spec_id = 2;</code>
   * @return The wfSpecId.
   */
  java.lang.String getWfSpecId();
  /**
   * <code>string wf_spec_id = 2;</code>
   * @return The bytes for wfSpecId.
   */
  com.google.protobuf.ByteString
      getWfSpecIdBytes();

  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.lh_proto.WfRunRequestPb run_request = 4;</code>
   * @return Whether the runRequest field is set.
   */
  boolean hasRunRequest();
  /**
   * <code>.lh_proto.WfRunRequestPb run_request = 4;</code>
   * @return The runRequest.
   */
  io.littlehorse.common.proto.scheduler.WfRunRequestPb getRunRequest();
  /**
   * <code>.lh_proto.WfRunRequestPb run_request = 4;</code>
   */
  io.littlehorse.common.proto.scheduler.WfRunRequestPbOrBuilder getRunRequestOrBuilder();

  /**
   * <code>.lh_proto.TaskStartedEventPb started_event = 5;</code>
   * @return Whether the startedEvent field is set.
   */
  boolean hasStartedEvent();
  /**
   * <code>.lh_proto.TaskStartedEventPb started_event = 5;</code>
   * @return The startedEvent.
   */
  io.littlehorse.common.proto.scheduler.TaskStartedEventPb getStartedEvent();
  /**
   * <code>.lh_proto.TaskStartedEventPb started_event = 5;</code>
   */
  io.littlehorse.common.proto.scheduler.TaskStartedEventPbOrBuilder getStartedEventOrBuilder();

  /**
   * <code>.lh_proto.TaskResultEventPb task_result = 6;</code>
   * @return Whether the taskResult field is set.
   */
  boolean hasTaskResult();
  /**
   * <code>.lh_proto.TaskResultEventPb task_result = 6;</code>
   * @return The taskResult.
   */
  io.littlehorse.common.proto.scheduler.TaskResultEventPb getTaskResult();
  /**
   * <code>.lh_proto.TaskResultEventPb task_result = 6;</code>
   */
  io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder getTaskResultOrBuilder();

  public io.littlehorse.common.proto.scheduler.WfRunEventPb.EventCase getEventCase();
}
