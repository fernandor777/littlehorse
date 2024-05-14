// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_wfspec.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Enumerates the available operations to mutate a variable in a WfRun.
 * </pre>
 *
 * Protobuf enum {@code littlehorse.VariableMutationType}
 */
public enum VariableMutationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Set the variable specified by the LHS to the value of the RHS.
   * </pre>
   *
   * <code>ASSIGN = 0;</code>
   */
  ASSIGN(0),
  /**
   * <pre>
   * Add the RHS to the LHS.
   * </pre>
   *
   * <code>ADD = 1;</code>
   */
  ADD(1),
  /**
   * <pre>
   * Append the RHS to the LHS (valid if the LHS is a STR or JSON_ARR)
   * </pre>
   *
   * <code>EXTEND = 2;</code>
   */
  EXTEND(2),
  /**
   * <pre>
   * Subtract the RHS from the LHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>SUBTRACT = 3;</code>
   */
  SUBTRACT(3),
  /**
   * <pre>
   * Multiply the LHS by the RHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>MULTIPLY = 4;</code>
   */
  MULTIPLY(4),
  /**
   * <pre>
   * Divide the LHS by the RHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>DIVIDE = 5;</code>
   */
  DIVIDE(5),
  /**
   * <pre>
   * Remove any occurrences of RHS from LHS (LHS must be JSON_ARR)
   * </pre>
   *
   * <code>REMOVE_IF_PRESENT = 6;</code>
   */
  REMOVE_IF_PRESENT(6),
  /**
   * <pre>
   * Remove item at index RHS from LHS (LHS must be JSON_ARR)
   * </pre>
   *
   * <code>REMOVE_INDEX = 7;</code>
   */
  REMOVE_INDEX(7),
  /**
   * <pre>
   * Remove the key specified by RHS from the LHS (LHS must be JSON_OBJ)
   * </pre>
   *
   * <code>REMOVE_KEY = 8;</code>
   */
  REMOVE_KEY(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Set the variable specified by the LHS to the value of the RHS.
   * </pre>
   *
   * <code>ASSIGN = 0;</code>
   */
  public static final int ASSIGN_VALUE = 0;
  /**
   * <pre>
   * Add the RHS to the LHS.
   * </pre>
   *
   * <code>ADD = 1;</code>
   */
  public static final int ADD_VALUE = 1;
  /**
   * <pre>
   * Append the RHS to the LHS (valid if the LHS is a STR or JSON_ARR)
   * </pre>
   *
   * <code>EXTEND = 2;</code>
   */
  public static final int EXTEND_VALUE = 2;
  /**
   * <pre>
   * Subtract the RHS from the LHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>SUBTRACT = 3;</code>
   */
  public static final int SUBTRACT_VALUE = 3;
  /**
   * <pre>
   * Multiply the LHS by the RHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>MULTIPLY = 4;</code>
   */
  public static final int MULTIPLY_VALUE = 4;
  /**
   * <pre>
   * Divide the LHS by the RHS (both must be INT or DOUBLE)
   * </pre>
   *
   * <code>DIVIDE = 5;</code>
   */
  public static final int DIVIDE_VALUE = 5;
  /**
   * <pre>
   * Remove any occurrences of RHS from LHS (LHS must be JSON_ARR)
   * </pre>
   *
   * <code>REMOVE_IF_PRESENT = 6;</code>
   */
  public static final int REMOVE_IF_PRESENT_VALUE = 6;
  /**
   * <pre>
   * Remove item at index RHS from LHS (LHS must be JSON_ARR)
   * </pre>
   *
   * <code>REMOVE_INDEX = 7;</code>
   */
  public static final int REMOVE_INDEX_VALUE = 7;
  /**
   * <pre>
   * Remove the key specified by RHS from the LHS (LHS must be JSON_OBJ)
   * </pre>
   *
   * <code>REMOVE_KEY = 8;</code>
   */
  public static final int REMOVE_KEY_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VariableMutationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariableMutationType forNumber(int value) {
    switch (value) {
      case 0: return ASSIGN;
      case 1: return ADD;
      case 2: return EXTEND;
      case 3: return SUBTRACT;
      case 4: return MULTIPLY;
      case 5: return DIVIDE;
      case 6: return REMOVE_IF_PRESENT;
      case 7: return REMOVE_INDEX;
      case 8: return REMOVE_KEY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariableMutationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariableMutationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariableMutationType>() {
          public VariableMutationType findValueByNumber(int number) {
            return VariableMutationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.CommonWfspec.getDescriptor().getEnumTypes().get(0);
  }

  private static final VariableMutationType[] VALUES = values();

  public static VariableMutationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VariableMutationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:littlehorse.VariableMutationType)
}
