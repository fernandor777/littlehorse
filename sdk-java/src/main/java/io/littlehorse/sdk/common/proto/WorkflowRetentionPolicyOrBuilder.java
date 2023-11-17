// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

public interface WorkflowRetentionPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.WorkflowRetentionPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Delete all WfRun's X seconds after they terminate, regardless of
   * status.
   * </pre>
   *
   * <code>int64 seconds_after_wf_termination = 1;</code>
   * @return Whether the secondsAfterWfTermination field is set.
   */
  boolean hasSecondsAfterWfTermination();
  /**
   * <pre>
   * Delete all WfRun's X seconds after they terminate, regardless of
   * status.
   * </pre>
   *
   * <code>int64 seconds_after_wf_termination = 1;</code>
   * @return The secondsAfterWfTermination.
   */
  long getSecondsAfterWfTermination();

  /**
   * <code>int32 retention_hours = 7;</code>
   * @return The retentionHours.
   */
  int getRetentionHours();

  io.littlehorse.sdk.common.proto.WorkflowRetentionPolicy.WfGcPolicyCase getWfGcPolicyCase();
}