// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_run.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * The type of a ThreadRUn.
 * </pre>
 *
 * Protobuf enum {@code littlehorse.ThreadType}
 */
public enum ThreadType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The ENTRYPOINT ThreadRun. Exactly one per WfRun. Always has number == 0.
   * </pre>
   *
   * <code>ENTRYPOINT = 0;</code>
   */
  ENTRYPOINT(0),
  /**
   * <pre>
   * A ThreadRun explicitly created by another ThreadRun via a START_THREAD or START_MULTIPLE_THREADS
   * NodeRun.
   * </pre>
   *
   * <code>CHILD = 1;</code>
   */
  CHILD(1),
  /**
   * <pre>
   * A ThreadRun that was created to handle an Interrupt.
   * </pre>
   *
   * <code>INTERRUPT = 2;</code>
   */
  INTERRUPT(2),
  /**
   * <pre>
   * A ThreadRun that was created to handle a Failure.
   * </pre>
   *
   * <code>FAILURE_HANDLER = 3;</code>
   */
  FAILURE_HANDLER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The ENTRYPOINT ThreadRun. Exactly one per WfRun. Always has number == 0.
   * </pre>
   *
   * <code>ENTRYPOINT = 0;</code>
   */
  public static final int ENTRYPOINT_VALUE = 0;
  /**
   * <pre>
   * A ThreadRun explicitly created by another ThreadRun via a START_THREAD or START_MULTIPLE_THREADS
   * NodeRun.
   * </pre>
   *
   * <code>CHILD = 1;</code>
   */
  public static final int CHILD_VALUE = 1;
  /**
   * <pre>
   * A ThreadRun that was created to handle an Interrupt.
   * </pre>
   *
   * <code>INTERRUPT = 2;</code>
   */
  public static final int INTERRUPT_VALUE = 2;
  /**
   * <pre>
   * A ThreadRun that was created to handle a Failure.
   * </pre>
   *
   * <code>FAILURE_HANDLER = 3;</code>
   */
  public static final int FAILURE_HANDLER_VALUE = 3;


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
  public static ThreadType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ThreadType forNumber(int value) {
    switch (value) {
      case 0: return ENTRYPOINT;
      case 1: return CHILD;
      case 2: return INTERRUPT;
      case 3: return FAILURE_HANDLER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ThreadType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ThreadType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ThreadType>() {
          public ThreadType findValueByNumber(int number) {
            return ThreadType.forNumber(number);
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
    return io.littlehorse.sdk.common.proto.WfRunOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ThreadType[] VALUES = values();

  public static ThreadType valueOf(
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

  private ThreadType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:littlehorse.ThreadType)
}
