// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

public interface ThreadSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.ThreadSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Nodes inside this ThreadSpec. Maps from name to Node.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.Node&gt; nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * The Nodes inside this ThreadSpec. Maps from name to Node.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.Node&gt; nodes = 1;</code>
   */
  boolean containsNodes(
      java.lang.String key);
  /**
   * Use {@link #getNodesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.Node>
  getNodes();
  /**
   * <pre>
   * The Nodes inside this ThreadSpec. Maps from name to Node.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.Node&gt; nodes = 1;</code>
   */
  java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.Node>
  getNodesMap();
  /**
   * <pre>
   * The Nodes inside this ThreadSpec. Maps from name to Node.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.Node&gt; nodes = 1;</code>
   */
  /* nullable */
io.littlehorse.sdk.common.proto.Node getNodesOrDefault(
      java.lang.String key,
      /* nullable */
io.littlehorse.sdk.common.proto.Node defaultValue);
  /**
   * <pre>
   * The Nodes inside this ThreadSpec. Maps from name to Node.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.Node&gt; nodes = 1;</code>
   */
  io.littlehorse.sdk.common.proto.Node getNodesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Defines Variables that are local to ThreadRun's of this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.ThreadVarDef variable_defs = 2;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.ThreadVarDef> 
      getVariableDefsList();
  /**
   * <pre>
   * Defines Variables that are local to ThreadRun's of this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.ThreadVarDef variable_defs = 2;</code>
   */
  io.littlehorse.sdk.common.proto.ThreadVarDef getVariableDefs(int index);
  /**
   * <pre>
   * Defines Variables that are local to ThreadRun's of this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.ThreadVarDef variable_defs = 2;</code>
   */
  int getVariableDefsCount();
  /**
   * <pre>
   * Defines Variables that are local to ThreadRun's of this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.ThreadVarDef variable_defs = 2;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.ThreadVarDefOrBuilder> 
      getVariableDefsOrBuilderList();
  /**
   * <pre>
   * Defines Variables that are local to ThreadRun's of this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.ThreadVarDef variable_defs = 2;</code>
   */
  io.littlehorse.sdk.common.proto.ThreadVarDefOrBuilder getVariableDefsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines all interrupts for this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.InterruptDef interrupt_defs = 3;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.InterruptDef> 
      getInterruptDefsList();
  /**
   * <pre>
   * Defines all interrupts for this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.InterruptDef interrupt_defs = 3;</code>
   */
  io.littlehorse.sdk.common.proto.InterruptDef getInterruptDefs(int index);
  /**
   * <pre>
   * Defines all interrupts for this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.InterruptDef interrupt_defs = 3;</code>
   */
  int getInterruptDefsCount();
  /**
   * <pre>
   * Defines all interrupts for this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.InterruptDef interrupt_defs = 3;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.InterruptDefOrBuilder> 
      getInterruptDefsOrBuilderList();
  /**
   * <pre>
   * Defines all interrupts for this ThreadSpec.
   * </pre>
   *
   * <code>repeated .littlehorse.InterruptDef interrupt_defs = 3;</code>
   */
  io.littlehorse.sdk.common.proto.InterruptDefOrBuilder getInterruptDefsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional retention policy to clean up ThreadRun's of this ThreadSpec after they
   * have been completed. This is important for long-lived WfRun's that could have
   * hundreds of ThreadRun's, because a ThreadRun has a record inside the WfRun itself.
   * </pre>
   *
   * <code>optional .littlehorse.ThreadRetentionPolicy retention_policy = 4;</code>
   * @return Whether the retentionPolicy field is set.
   */
  boolean hasRetentionPolicy();
  /**
   * <pre>
   * Optional retention policy to clean up ThreadRun's of this ThreadSpec after they
   * have been completed. This is important for long-lived WfRun's that could have
   * hundreds of ThreadRun's, because a ThreadRun has a record inside the WfRun itself.
   * </pre>
   *
   * <code>optional .littlehorse.ThreadRetentionPolicy retention_policy = 4;</code>
   * @return The retentionPolicy.
   */
  io.littlehorse.sdk.common.proto.ThreadRetentionPolicy getRetentionPolicy();
  /**
   * <pre>
   * Optional retention policy to clean up ThreadRun's of this ThreadSpec after they
   * have been completed. This is important for long-lived WfRun's that could have
   * hundreds of ThreadRun's, because a ThreadRun has a record inside the WfRun itself.
   * </pre>
   *
   * <code>optional .littlehorse.ThreadRetentionPolicy retention_policy = 4;</code>
   */
  io.littlehorse.sdk.common.proto.ThreadRetentionPolicyOrBuilder getRetentionPolicyOrBuilder();
}