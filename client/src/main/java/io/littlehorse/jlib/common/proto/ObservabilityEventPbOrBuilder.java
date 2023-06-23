// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface ObservabilityEventPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.ObservabilityEventPb)
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
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.littlehorse.WfRunStartOePb wf_run_start = 3;</code>
   * @return Whether the wfRunStart field is set.
   */
  boolean hasWfRunStart();
  /**
   * <code>.littlehorse.WfRunStartOePb wf_run_start = 3;</code>
   * @return The wfRunStart.
   */
  io.littlehorse.jlib.common.proto.WfRunStartOePb getWfRunStart();
  /**
   * <code>.littlehorse.WfRunStartOePb wf_run_start = 3;</code>
   */
  io.littlehorse.jlib.common.proto.WfRunStartOePbOrBuilder getWfRunStartOrBuilder();

  /**
   * <code>.littlehorse.ThreadStartOePb thread_start = 4;</code>
   * @return Whether the threadStart field is set.
   */
  boolean hasThreadStart();
  /**
   * <code>.littlehorse.ThreadStartOePb thread_start = 4;</code>
   * @return The threadStart.
   */
  io.littlehorse.jlib.common.proto.ThreadStartOePb getThreadStart();
  /**
   * <code>.littlehorse.ThreadStartOePb thread_start = 4;</code>
   */
  io.littlehorse.jlib.common.proto.ThreadStartOePbOrBuilder getThreadStartOrBuilder();

  /**
   * <code>.littlehorse.TaskScheduledOePb task_scheduled = 5;</code>
   * @return Whether the taskScheduled field is set.
   */
  boolean hasTaskScheduled();
  /**
   * <code>.littlehorse.TaskScheduledOePb task_scheduled = 5;</code>
   * @return The taskScheduled.
   */
  io.littlehorse.jlib.common.proto.TaskScheduledOePb getTaskScheduled();
  /**
   * <code>.littlehorse.TaskScheduledOePb task_scheduled = 5;</code>
   */
  io.littlehorse.jlib.common.proto.TaskScheduledOePbOrBuilder getTaskScheduledOrBuilder();

  /**
   * <code>.littlehorse.TaskStartOePb task_start = 6;</code>
   * @return Whether the taskStart field is set.
   */
  boolean hasTaskStart();
  /**
   * <code>.littlehorse.TaskStartOePb task_start = 6;</code>
   * @return The taskStart.
   */
  io.littlehorse.jlib.common.proto.TaskStartOePb getTaskStart();
  /**
   * <code>.littlehorse.TaskStartOePb task_start = 6;</code>
   */
  io.littlehorse.jlib.common.proto.TaskStartOePbOrBuilder getTaskStartOrBuilder();

  /**
   * <code>.littlehorse.TaskResultOePb task_result = 7;</code>
   * @return Whether the taskResult field is set.
   */
  boolean hasTaskResult();
  /**
   * <code>.littlehorse.TaskResultOePb task_result = 7;</code>
   * @return The taskResult.
   */
  io.littlehorse.jlib.common.proto.TaskResultOePb getTaskResult();
  /**
   * <code>.littlehorse.TaskResultOePb task_result = 7;</code>
   */
  io.littlehorse.jlib.common.proto.TaskResultOePbOrBuilder getTaskResultOrBuilder();

  /**
   * <code>.littlehorse.ExtEvtRegisteredOePb ext_evt_registered = 8;</code>
   * @return Whether the extEvtRegistered field is set.
   */
  boolean hasExtEvtRegistered();
  /**
   * <code>.littlehorse.ExtEvtRegisteredOePb ext_evt_registered = 8;</code>
   * @return The extEvtRegistered.
   */
  io.littlehorse.jlib.common.proto.ExtEvtRegisteredOePb getExtEvtRegistered();
  /**
   * <code>.littlehorse.ExtEvtRegisteredOePb ext_evt_registered = 8;</code>
   */
  io.littlehorse.jlib.common.proto.ExtEvtRegisteredOePbOrBuilder getExtEvtRegisteredOrBuilder();

  /**
   * <code>.littlehorse.WaitingForExtEvtOePb waiting_for_ext_evt = 9;</code>
   * @return Whether the waitingForExtEvt field is set.
   */
  boolean hasWaitingForExtEvt();
  /**
   * <code>.littlehorse.WaitingForExtEvtOePb waiting_for_ext_evt = 9;</code>
   * @return The waitingForExtEvt.
   */
  io.littlehorse.jlib.common.proto.WaitingForExtEvtOePb getWaitingForExtEvt();
  /**
   * <code>.littlehorse.WaitingForExtEvtOePb waiting_for_ext_evt = 9;</code>
   */
  io.littlehorse.jlib.common.proto.WaitingForExtEvtOePbOrBuilder getWaitingForExtEvtOrBuilder();

  /**
   * <code>.littlehorse.ExtEvtMatchedOePb ext_evt_matched = 10;</code>
   * @return Whether the extEvtMatched field is set.
   */
  boolean hasExtEvtMatched();
  /**
   * <code>.littlehorse.ExtEvtMatchedOePb ext_evt_matched = 10;</code>
   * @return The extEvtMatched.
   */
  io.littlehorse.jlib.common.proto.ExtEvtMatchedOePb getExtEvtMatched();
  /**
   * <code>.littlehorse.ExtEvtMatchedOePb ext_evt_matched = 10;</code>
   */
  io.littlehorse.jlib.common.proto.ExtEvtMatchedOePbOrBuilder getExtEvtMatchedOrBuilder();

  /**
   * <code>.littlehorse.InterruptedOePb interrupted = 11;</code>
   * @return Whether the interrupted field is set.
   */
  boolean hasInterrupted();
  /**
   * <code>.littlehorse.InterruptedOePb interrupted = 11;</code>
   * @return The interrupted.
   */
  io.littlehorse.jlib.common.proto.InterruptedOePb getInterrupted();
  /**
   * <code>.littlehorse.InterruptedOePb interrupted = 11;</code>
   */
  io.littlehorse.jlib.common.proto.InterruptedOePbOrBuilder getInterruptedOrBuilder();

  /**
   * <code>.littlehorse.ThreadStatusOePb thread_status = 12;</code>
   * @return Whether the threadStatus field is set.
   */
  boolean hasThreadStatus();
  /**
   * <code>.littlehorse.ThreadStatusOePb thread_status = 12;</code>
   * @return The threadStatus.
   */
  io.littlehorse.jlib.common.proto.ThreadStatusOePb getThreadStatus();
  /**
   * <code>.littlehorse.ThreadStatusOePb thread_status = 12;</code>
   */
  io.littlehorse.jlib.common.proto.ThreadStatusOePbOrBuilder getThreadStatusOrBuilder();

  /**
   * <code>.littlehorse.WfRunStatusOePb wf_run_status = 13;</code>
   * @return Whether the wfRunStatus field is set.
   */
  boolean hasWfRunStatus();
  /**
   * <code>.littlehorse.WfRunStatusOePb wf_run_status = 13;</code>
   * @return The wfRunStatus.
   */
  io.littlehorse.jlib.common.proto.WfRunStatusOePb getWfRunStatus();
  /**
   * <code>.littlehorse.WfRunStatusOePb wf_run_status = 13;</code>
   */
  io.littlehorse.jlib.common.proto.WfRunStatusOePbOrBuilder getWfRunStatusOrBuilder();

  public io.littlehorse.jlib.common.proto.ObservabilityEventPb.EventCase getEventCase();
}