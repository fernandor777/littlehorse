// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface ThreadRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.ThreadRunPb)
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
   * <code>int32 number = 2;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>.littlehorse.LHStatusPb status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.littlehorse.LHStatusPb status = 3;</code>
   * @return The status.
   */
  io.littlehorse.jlib.common.proto.LHStatusPb getStatus();

  /**
   * <code>string wf_spec_name = 4;</code>
   * @return The wfSpecName.
   */
  java.lang.String getWfSpecName();
  /**
   * <code>string wf_spec_name = 4;</code>
   * @return The bytes for wfSpecName.
   */
  com.google.protobuf.ByteString
      getWfSpecNameBytes();

  /**
   * <code>int32 wf_spec_version = 5;</code>
   * @return The wfSpecVersion.
   */
  int getWfSpecVersion();

  /**
   * <code>string thread_spec_name = 6;</code>
   * @return The threadSpecName.
   */
  java.lang.String getThreadSpecName();
  /**
   * <code>string thread_spec_name = 6;</code>
   * @return The bytes for threadSpecName.
   */
  com.google.protobuf.ByteString
      getThreadSpecNameBytes();

  /**
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp end_time = 8;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>optional .google.protobuf.Timestamp end_time = 8;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <code>optional .google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <code>optional string error_message = 9;</code>
   * @return Whether the errorMessage field is set.
   */
  boolean hasErrorMessage();
  /**
   * <code>optional string error_message = 9;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string error_message = 9;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <code>optional .littlehorse.TaskResultCodePb result_code = 10;</code>
   * @return Whether the resultCode field is set.
   */
  boolean hasResultCode();
  /**
   * <code>optional .littlehorse.TaskResultCodePb result_code = 10;</code>
   * @return The enum numeric value on the wire for resultCode.
   */
  int getResultCodeValue();
  /**
   * <code>optional .littlehorse.TaskResultCodePb result_code = 10;</code>
   * @return The resultCode.
   */
  io.littlehorse.jlib.common.proto.TaskResultCodePb getResultCode();

  /**
   * <code>repeated int32 child_thread_ids = 11;</code>
   * @return A list containing the childThreadIds.
   */
  java.util.List<java.lang.Integer> getChildThreadIdsList();
  /**
   * <code>repeated int32 child_thread_ids = 11;</code>
   * @return The count of childThreadIds.
   */
  int getChildThreadIdsCount();
  /**
   * <code>repeated int32 child_thread_ids = 11;</code>
   * @param index The index of the element to return.
   * @return The childThreadIds at the given index.
   */
  int getChildThreadIds(int index);

  /**
   * <code>optional int32 parent_thread_id = 12;</code>
   * @return Whether the parentThreadId field is set.
   */
  boolean hasParentThreadId();
  /**
   * <code>optional int32 parent_thread_id = 12;</code>
   * @return The parentThreadId.
   */
  int getParentThreadId();

  /**
   * <code>repeated .littlehorse.ThreadHaltReasonPb halt_reasons = 13;</code>
   */
  java.util.List<io.littlehorse.jlib.common.proto.ThreadHaltReasonPb> 
      getHaltReasonsList();
  /**
   * <code>repeated .littlehorse.ThreadHaltReasonPb halt_reasons = 13;</code>
   */
  io.littlehorse.jlib.common.proto.ThreadHaltReasonPb getHaltReasons(int index);
  /**
   * <code>repeated .littlehorse.ThreadHaltReasonPb halt_reasons = 13;</code>
   */
  int getHaltReasonsCount();
  /**
   * <code>repeated .littlehorse.ThreadHaltReasonPb halt_reasons = 13;</code>
   */
  java.util.List<? extends io.littlehorse.jlib.common.proto.ThreadHaltReasonPbOrBuilder> 
      getHaltReasonsOrBuilderList();
  /**
   * <code>repeated .littlehorse.ThreadHaltReasonPb halt_reasons = 13;</code>
   */
  io.littlehorse.jlib.common.proto.ThreadHaltReasonPbOrBuilder getHaltReasonsOrBuilder(
      int index);

  /**
   * <code>optional .littlehorse.ExternalEventIdPb interrupt_trigger_id = 14;</code>
   * @return Whether the interruptTriggerId field is set.
   */
  boolean hasInterruptTriggerId();
  /**
   * <code>optional .littlehorse.ExternalEventIdPb interrupt_trigger_id = 14;</code>
   * @return The interruptTriggerId.
   */
  io.littlehorse.jlib.common.proto.ExternalEventIdPb getInterruptTriggerId();
  /**
   * <code>optional .littlehorse.ExternalEventIdPb interrupt_trigger_id = 14;</code>
   */
  io.littlehorse.jlib.common.proto.ExternalEventIdPbOrBuilder getInterruptTriggerIdOrBuilder();

  /**
   * <code>optional .littlehorse.FailureBeingHandledPb failure_being_handled = 15;</code>
   * @return Whether the failureBeingHandled field is set.
   */
  boolean hasFailureBeingHandled();
  /**
   * <code>optional .littlehorse.FailureBeingHandledPb failure_being_handled = 15;</code>
   * @return The failureBeingHandled.
   */
  io.littlehorse.jlib.common.proto.FailureBeingHandledPb getFailureBeingHandled();
  /**
   * <code>optional .littlehorse.FailureBeingHandledPb failure_being_handled = 15;</code>
   */
  io.littlehorse.jlib.common.proto.FailureBeingHandledPbOrBuilder getFailureBeingHandledOrBuilder();

  /**
   * <code>int32 current_node_position = 16;</code>
   * @return The currentNodePosition.
   */
  int getCurrentNodePosition();

  /**
   * <code>repeated int32 handled_failed_children = 17;</code>
   * @return A list containing the handledFailedChildren.
   */
  java.util.List<java.lang.Integer> getHandledFailedChildrenList();
  /**
   * <code>repeated int32 handled_failed_children = 17;</code>
   * @return The count of handledFailedChildren.
   */
  int getHandledFailedChildrenCount();
  /**
   * <code>repeated int32 handled_failed_children = 17;</code>
   * @param index The index of the element to return.
   * @return The handledFailedChildren at the given index.
   */
  int getHandledFailedChildren(int index);

  /**
   * <code>.littlehorse.ThreadTypePb type = 18;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.littlehorse.ThreadTypePb type = 18;</code>
   * @return The type.
   */
  io.littlehorse.jlib.common.proto.ThreadTypePb getType();
}
