// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface ThreadRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.ThreadRunPb)
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
   * <code>.lh_proto.LHStatusPb status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.lh_proto.LHStatusPb status = 3;</code>
   * @return The status.
   */
  io.littlehorse.common.proto.LHStatusPb getStatus();

  /**
   * <code>string wf_spec_id = 4;</code>
   * @return The wfSpecId.
   */
  java.lang.String getWfSpecId();
  /**
   * <code>string wf_spec_id = 4;</code>
   * @return The bytes for wfSpecId.
   */
  com.google.protobuf.ByteString
      getWfSpecIdBytes();

  /**
   * <code>string thread_spec_name = 5;</code>
   * @return The threadSpecName.
   */
  java.lang.String getThreadSpecName();
  /**
   * <code>string thread_spec_name = 5;</code>
   * @return The bytes for threadSpecName.
   */
  com.google.protobuf.ByteString
      getThreadSpecNameBytes();

  /**
   * <code>int32 num_steps = 6;</code>
   * @return The numSteps.
   */
  int getNumSteps();

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
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 9;</code>
   * @return Whether the currentNodeRun field is set.
   */
  boolean hasCurrentNodeRun();
  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 9;</code>
   * @return The currentNodeRun.
   */
  io.littlehorse.common.proto.NodeRunStatePb getCurrentNodeRun();
  /**
   * <code>.lh_proto.NodeRunStatePb current_node_run = 9;</code>
   */
  io.littlehorse.common.proto.NodeRunStatePbOrBuilder getCurrentNodeRunOrBuilder();
}