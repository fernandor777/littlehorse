// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface TaskNodePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TaskNodePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string task_def_name = 1;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string task_def_name = 1;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();

  /**
   * <code>.lh_proto.VariableAssignmentPb timeout_seconds = 2;</code>
   * @return Whether the timeoutSeconds field is set.
   */
  boolean hasTimeoutSeconds();
  /**
   * <code>.lh_proto.VariableAssignmentPb timeout_seconds = 2;</code>
   * @return The timeoutSeconds.
   */
  io.littlehorse.common.proto.VariableAssignmentPb getTimeoutSeconds();
  /**
   * <code>.lh_proto.VariableAssignmentPb timeout_seconds = 2;</code>
   */
  io.littlehorse.common.proto.VariableAssignmentPbOrBuilder getTimeoutSecondsOrBuilder();

  /**
   * <code>int32 retries = 3;</code>
   * @return The retries.
   */
  int getRetries();

  /**
   * <code>map&lt;string, .lh_proto.VariableAssignmentPb&gt; variables = 4;</code>
   */
  int getVariablesCount();
  /**
   * <code>map&lt;string, .lh_proto.VariableAssignmentPb&gt; variables = 4;</code>
   */
  boolean containsVariables(
      java.lang.String key);
  /**
   * Use {@link #getVariablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableAssignmentPb>
  getVariables();
  /**
   * <code>map&lt;string, .lh_proto.VariableAssignmentPb&gt; variables = 4;</code>
   */
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableAssignmentPb>
  getVariablesMap();
  /**
   * <code>map&lt;string, .lh_proto.VariableAssignmentPb&gt; variables = 4;</code>
   */

  io.littlehorse.common.proto.VariableAssignmentPb getVariablesOrDefault(
      java.lang.String key,
      io.littlehorse.common.proto.VariableAssignmentPb defaultValue);
  /**
   * <code>map&lt;string, .lh_proto.VariableAssignmentPb&gt; variables = 4;</code>
   */

  io.littlehorse.common.proto.VariableAssignmentPb getVariablesOrThrow(
      java.lang.String key);
}
