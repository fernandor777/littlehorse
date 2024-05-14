// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

public interface UserTaskNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Denotes the name of the `UserTaskDef` that should create the `UserTaskRun`.
   * </pre>
   *
   * <code>string user_task_def_name = 1;</code>
   * @return The userTaskDefName.
   */
  java.lang.String getUserTaskDefName();
  /**
   * <pre>
   * Denotes the name of the `UserTaskDef` that should create the `UserTaskRun`.
   * </pre>
   *
   * <code>string user_task_def_name = 1;</code>
   * @return The bytes for userTaskDefName.
   */
  com.google.protobuf.ByteString
      getUserTaskDefNameBytes();

  /**
   * <pre>
   * Denotes the user_group to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_group = 2;</code>
   * @return Whether the userGroup field is set.
   */
  boolean hasUserGroup();
  /**
   * <pre>
   * Denotes the user_group to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_group = 2;</code>
   * @return The userGroup.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getUserGroup();
  /**
   * <pre>
   * Denotes the user_group to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_group = 2;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getUserGroupOrBuilder();

  /**
   * <pre>
   * Denotes the user_id to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_id = 3;</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <pre>
   * Denotes the user_id to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_id = 3;</code>
   * @return The userId.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getUserId();
  /**
   * <pre>
   * Denotes the user_id to which the UserTaskRun is assigned upon creation.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment user_id = 3;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getUserIdOrBuilder();

  /**
   * <pre>
   * Specifies a list of actions that happen on various time-based triggers. Actions
   * include reassigning the UserTaskRun, cancelling the UserTaskRun, or executing
   * a "reminder" TaskRun.
   * </pre>
   *
   * <code>repeated .littlehorse.UTActionTrigger actions = 4;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.UTActionTrigger> 
      getActionsList();
  /**
   * <pre>
   * Specifies a list of actions that happen on various time-based triggers. Actions
   * include reassigning the UserTaskRun, cancelling the UserTaskRun, or executing
   * a "reminder" TaskRun.
   * </pre>
   *
   * <code>repeated .littlehorse.UTActionTrigger actions = 4;</code>
   */
  io.littlehorse.sdk.common.proto.UTActionTrigger getActions(int index);
  /**
   * <pre>
   * Specifies a list of actions that happen on various time-based triggers. Actions
   * include reassigning the UserTaskRun, cancelling the UserTaskRun, or executing
   * a "reminder" TaskRun.
   * </pre>
   *
   * <code>repeated .littlehorse.UTActionTrigger actions = 4;</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * Specifies a list of actions that happen on various time-based triggers. Actions
   * include reassigning the UserTaskRun, cancelling the UserTaskRun, or executing
   * a "reminder" TaskRun.
   * </pre>
   *
   * <code>repeated .littlehorse.UTActionTrigger actions = 4;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.UTActionTriggerOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * Specifies a list of actions that happen on various time-based triggers. Actions
   * include reassigning the UserTaskRun, cancelling the UserTaskRun, or executing
   * a "reminder" TaskRun.
   * </pre>
   *
   * <code>repeated .littlehorse.UTActionTrigger actions = 4;</code>
   */
  io.littlehorse.sdk.common.proto.UTActionTriggerOrBuilder getActionsOrBuilder(
      int index);

  /**
   * <pre>
   * If set, then the UserTaskRun will always have this specific version of the
   * UserTaskDef. Otherwise, the UserTaskRun will have the latest version.
   * </pre>
   *
   * <code>optional int32 user_task_def_version = 5;</code>
   * @return Whether the userTaskDefVersion field is set.
   */
  boolean hasUserTaskDefVersion();
  /**
   * <pre>
   * If set, then the UserTaskRun will always have this specific version of the
   * UserTaskDef. Otherwise, the UserTaskRun will have the latest version.
   * </pre>
   *
   * <code>optional int32 user_task_def_version = 5;</code>
   * @return The userTaskDefVersion.
   */
  int getUserTaskDefVersion();

  /**
   * <pre>
   * Specifies the value to be displayed on the `notes` field of the UserTaskRun.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment notes = 6;</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <pre>
   * Specifies the value to be displayed on the `notes` field of the UserTaskRun.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment notes = 6;</code>
   * @return The notes.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getNotes();
  /**
   * <pre>
   * Specifies the value to be displayed on the `notes` field of the UserTaskRun.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment notes = 6;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getNotesOrBuilder();

  /**
   * <pre>
   * Specifies the name of the exception thrown when the User Task is canceled. If
   * not set, then the cancellation or timeout of a User Task Run throws an ERROR
   * rather than an EXCEPTION.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment on_cancellation_exception_name = 7;</code>
   * @return Whether the onCancellationExceptionName field is set.
   */
  boolean hasOnCancellationExceptionName();
  /**
   * <pre>
   * Specifies the name of the exception thrown when the User Task is canceled. If
   * not set, then the cancellation or timeout of a User Task Run throws an ERROR
   * rather than an EXCEPTION.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment on_cancellation_exception_name = 7;</code>
   * @return The onCancellationExceptionName.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getOnCancellationExceptionName();
  /**
   * <pre>
   * Specifies the name of the exception thrown when the User Task is canceled. If
   * not set, then the cancellation or timeout of a User Task Run throws an ERROR
   * rather than an EXCEPTION.
   * </pre>
   *
   * <code>optional .littlehorse.VariableAssignment on_cancellation_exception_name = 7;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getOnCancellationExceptionNameOrBuilder();
}