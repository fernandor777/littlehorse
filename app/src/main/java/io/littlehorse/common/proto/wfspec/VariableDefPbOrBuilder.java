// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.common.proto.wfspec;

public interface VariableDefPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.VariableDefPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lh_proto.VariableTypePb type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.lh_proto.VariableTypePb type = 1;</code>
   * @return The type.
   */
  io.littlehorse.common.proto.VariableTypePb getType();

  /**
   * <code>.lh_proto.VariableValuePb default_val = 2;</code>
   * @return Whether the defaultVal field is set.
   */
  boolean hasDefaultVal();
  /**
   * <code>.lh_proto.VariableValuePb default_val = 2;</code>
   * @return The defaultVal.
   */
  io.littlehorse.common.proto.VariableValuePb getDefaultVal();
  /**
   * <code>.lh_proto.VariableValuePb default_val = 2;</code>
   */
  io.littlehorse.common.proto.VariableValuePbOrBuilder getDefaultValOrBuilder();

  /**
   * <code>bool required = 3;</code>
   * @return The required.
   */
  boolean getRequired();
}