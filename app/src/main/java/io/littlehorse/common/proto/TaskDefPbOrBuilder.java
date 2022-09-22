// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface TaskDefPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TaskDefPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   * @return Whether the outputSchema field is set.
   */
  boolean hasOutputSchema();
  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   * @return The outputSchema.
   */
  io.littlehorse.common.proto.OutputSchemaPb getOutputSchema();
  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   */
  io.littlehorse.common.proto.OutputSchemaPbOrBuilder getOutputSchemaOrBuilder();

  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; required_vars = 4;</code>
   */
  int getRequiredVarsCount();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; required_vars = 4;</code>
   */
  boolean containsRequiredVars(
      java.lang.String key);
  /**
   * Use {@link #getRequiredVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableDefPb>
  getRequiredVars();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; required_vars = 4;</code>
   */
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableDefPb>
  getRequiredVarsMap();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; required_vars = 4;</code>
   */

  io.littlehorse.common.proto.VariableDefPb getRequiredVarsOrDefault(
      java.lang.String key,
      io.littlehorse.common.proto.VariableDefPb defaultValue);
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; required_vars = 4;</code>
   */

  io.littlehorse.common.proto.VariableDefPb getRequiredVarsOrThrow(
      java.lang.String key);
}
