// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Metrics
 * </pre>
 *
 * Protobuf enum {@code littlehorse.MetricsWindowLengthPb}
 */
public enum MetricsWindowLengthPb
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MINUTES_5 = 0;</code>
   */
  MINUTES_5(0),
  /**
   * <code>HOURS_2 = 1;</code>
   */
  HOURS_2(1),
  /**
   * <code>DAYS_1 = 2;</code>
   */
  DAYS_1(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MINUTES_5 = 0;</code>
   */
  public static final int MINUTES_5_VALUE = 0;
  /**
   * <code>HOURS_2 = 1;</code>
   */
  public static final int HOURS_2_VALUE = 1;
  /**
   * <code>DAYS_1 = 2;</code>
   */
  public static final int DAYS_1_VALUE = 2;


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
  public static MetricsWindowLengthPb valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MetricsWindowLengthPb forNumber(int value) {
    switch (value) {
      case 0: return MINUTES_5;
      case 1: return HOURS_2;
      case 2: return DAYS_1;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetricsWindowLengthPb>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetricsWindowLengthPb> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetricsWindowLengthPb>() {
          public MetricsWindowLengthPb findValueByNumber(int number) {
            return MetricsWindowLengthPb.forNumber(number);
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
    return io.littlehorse.sdk.common.proto.Service.getDescriptor().getEnumTypes().get(9);
  }

  private static final MetricsWindowLengthPb[] VALUES = values();

  public static MetricsWindowLengthPb valueOf(
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

  private MetricsWindowLengthPb(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:littlehorse.MetricsWindowLengthPb)
}
