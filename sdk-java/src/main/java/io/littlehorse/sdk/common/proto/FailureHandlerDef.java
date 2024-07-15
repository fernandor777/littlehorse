// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Specifies a Failure Handler which can run in case of a certain Failure to allow
 * the ThreadRun to run compensatory logic and gracefully continue rather than
 * failing immediately.
 * </pre>
 *
 * Protobuf type {@code littlehorse.FailureHandlerDef}
 */
public final class FailureHandlerDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.FailureHandlerDef)
    FailureHandlerDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FailureHandlerDef.newBuilder() to construct.
  private FailureHandlerDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FailureHandlerDef() {
    handlerSpecName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FailureHandlerDef();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_FailureHandlerDef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_FailureHandlerDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.FailureHandlerDef.class, io.littlehorse.sdk.common.proto.FailureHandlerDef.Builder.class);
  }

  /**
   * <pre>
   * Specifies a type of Failure
   * </pre>
   *
   * Protobuf enum {@code littlehorse.FailureHandlerDef.LHFailureType}
   */
  public enum LHFailureType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * FAILURE_TYPE_ERROR specifies any technical `ERROR`.
     * </pre>
     *
     * <code>FAILURE_TYPE_ERROR = 0;</code>
     */
    FAILURE_TYPE_ERROR(0),
    /**
     * <pre>
     * Specifies a user-defined, business-related `EXCEPTION`.
     * </pre>
     *
     * <code>FAILURE_TYPE_EXCEPTION = 1;</code>
     */
    FAILURE_TYPE_EXCEPTION(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * FAILURE_TYPE_ERROR specifies any technical `ERROR`.
     * </pre>
     *
     * <code>FAILURE_TYPE_ERROR = 0;</code>
     */
    public static final int FAILURE_TYPE_ERROR_VALUE = 0;
    /**
     * <pre>
     * Specifies a user-defined, business-related `EXCEPTION`.
     * </pre>
     *
     * <code>FAILURE_TYPE_EXCEPTION = 1;</code>
     */
    public static final int FAILURE_TYPE_EXCEPTION_VALUE = 1;


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
    public static LHFailureType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LHFailureType forNumber(int value) {
      switch (value) {
        case 0: return FAILURE_TYPE_ERROR;
        case 1: return FAILURE_TYPE_EXCEPTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LHFailureType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LHFailureType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LHFailureType>() {
            public LHFailureType findValueByNumber(int number) {
              return LHFailureType.forNumber(number);
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
      return io.littlehorse.sdk.common.proto.FailureHandlerDef.getDescriptor().getEnumTypes().get(0);
    }

    private static final LHFailureType[] VALUES = values();

    public static LHFailureType valueOf(
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

    private LHFailureType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:littlehorse.FailureHandlerDef.LHFailureType)
  }

  private int failureToCatchCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object failureToCatch_;
  public enum FailureToCatchCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SPECIFIC_FAILURE(1),
    ANY_FAILURE_OF_TYPE(3),
    FAILURETOCATCH_NOT_SET(0);
    private final int value;
    private FailureToCatchCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FailureToCatchCase valueOf(int value) {
      return forNumber(value);
    }

    public static FailureToCatchCase forNumber(int value) {
      switch (value) {
        case 1: return SPECIFIC_FAILURE;
        case 3: return ANY_FAILURE_OF_TYPE;
        case 0: return FAILURETOCATCH_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FailureToCatchCase
  getFailureToCatchCase() {
    return FailureToCatchCase.forNumber(
        failureToCatchCase_);
  }

  public static final int HANDLER_SPEC_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object handlerSpecName_ = "";
  /**
   * <pre>
   * The name of the ThreadSpec to run as a
   * </pre>
   *
   * <code>string handler_spec_name = 2;</code>
   * @return The handlerSpecName.
   */
  @java.lang.Override
  public java.lang.String getHandlerSpecName() {
    java.lang.Object ref = handlerSpecName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      handlerSpecName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the ThreadSpec to run as a
   * </pre>
   *
   * <code>string handler_spec_name = 2;</code>
   * @return The bytes for handlerSpecName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHandlerSpecNameBytes() {
    java.lang.Object ref = handlerSpecName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      handlerSpecName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPECIFIC_FAILURE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for a Failure with this
   * exact name.
   *
   * If this and `specific_failure` are both unset, then any failure is caught.
   * </pre>
   *
   * <code>string specific_failure = 1;</code>
   * @return Whether the specificFailure field is set.
   */
  public boolean hasSpecificFailure() {
    return failureToCatchCase_ == 1;
  }
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for a Failure with this
   * exact name.
   *
   * If this and `specific_failure` are both unset, then any failure is caught.
   * </pre>
   *
   * <code>string specific_failure = 1;</code>
   * @return The specificFailure.
   */
  public java.lang.String getSpecificFailure() {
    java.lang.Object ref = "";
    if (failureToCatchCase_ == 1) {
      ref = failureToCatch_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (failureToCatchCase_ == 1) {
        failureToCatch_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for a Failure with this
   * exact name.
   *
   * If this and `specific_failure` are both unset, then any failure is caught.
   * </pre>
   *
   * <code>string specific_failure = 1;</code>
   * @return The bytes for specificFailure.
   */
  public com.google.protobuf.ByteString
      getSpecificFailureBytes() {
    java.lang.Object ref = "";
    if (failureToCatchCase_ == 1) {
      ref = failureToCatch_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (failureToCatchCase_ == 1) {
        failureToCatch_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANY_FAILURE_OF_TYPE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for any failure matching
   * this type (ERROR or EXCEPTION).
   * </pre>
   *
   * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
   * @return Whether the anyFailureOfType field is set.
   */
  public boolean hasAnyFailureOfType() {
    return failureToCatchCase_ == 3;
  }
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for any failure matching
   * this type (ERROR or EXCEPTION).
   * </pre>
   *
   * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
   * @return The enum numeric value on the wire for anyFailureOfType.
   */
  public int getAnyFailureOfTypeValue() {
    if (failureToCatchCase_ == 3) {
      return (java.lang.Integer) failureToCatch_;
    }
    return 0;
  }
  /**
   * <pre>
   * Specifies that this FailureHandlerDef will be triggered for any failure matching
   * this type (ERROR or EXCEPTION).
   * </pre>
   *
   * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
   * @return The anyFailureOfType.
   */
  public io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType getAnyFailureOfType() {
    if (failureToCatchCase_ == 3) {
      io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType result = io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.forNumber(
          (java.lang.Integer) failureToCatch_);
      return result == null ? io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.UNRECOGNIZED : result;
    }
    return io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.FAILURE_TYPE_ERROR;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (failureToCatchCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, failureToCatch_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(handlerSpecName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, handlerSpecName_);
    }
    if (failureToCatchCase_ == 3) {
      output.writeEnum(3, ((java.lang.Integer) failureToCatch_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (failureToCatchCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, failureToCatch_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(handlerSpecName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, handlerSpecName_);
    }
    if (failureToCatchCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ((java.lang.Integer) failureToCatch_));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.littlehorse.sdk.common.proto.FailureHandlerDef)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.FailureHandlerDef other = (io.littlehorse.sdk.common.proto.FailureHandlerDef) obj;

    if (!getHandlerSpecName()
        .equals(other.getHandlerSpecName())) return false;
    if (!getFailureToCatchCase().equals(other.getFailureToCatchCase())) return false;
    switch (failureToCatchCase_) {
      case 1:
        if (!getSpecificFailure()
            .equals(other.getSpecificFailure())) return false;
        break;
      case 3:
        if (getAnyFailureOfTypeValue()
            != other.getAnyFailureOfTypeValue()) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HANDLER_SPEC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHandlerSpecName().hashCode();
    switch (failureToCatchCase_) {
      case 1:
        hash = (37 * hash) + SPECIFIC_FAILURE_FIELD_NUMBER;
        hash = (53 * hash) + getSpecificFailure().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ANY_FAILURE_OF_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getAnyFailureOfTypeValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.FailureHandlerDef parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.FailureHandlerDef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Specifies a Failure Handler which can run in case of a certain Failure to allow
   * the ThreadRun to run compensatory logic and gracefully continue rather than
   * failing immediately.
   * </pre>
   *
   * Protobuf type {@code littlehorse.FailureHandlerDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.FailureHandlerDef)
      io.littlehorse.sdk.common.proto.FailureHandlerDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_FailureHandlerDef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_FailureHandlerDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.FailureHandlerDef.class, io.littlehorse.sdk.common.proto.FailureHandlerDef.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.FailureHandlerDef.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      handlerSpecName_ = "";
      failureToCatchCase_ = 0;
      failureToCatch_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_FailureHandlerDef_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureHandlerDef getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.FailureHandlerDef.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureHandlerDef build() {
      io.littlehorse.sdk.common.proto.FailureHandlerDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureHandlerDef buildPartial() {
      io.littlehorse.sdk.common.proto.FailureHandlerDef result = new io.littlehorse.sdk.common.proto.FailureHandlerDef(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.FailureHandlerDef result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.handlerSpecName_ = handlerSpecName_;
      }
    }

    private void buildPartialOneofs(io.littlehorse.sdk.common.proto.FailureHandlerDef result) {
      result.failureToCatchCase_ = failureToCatchCase_;
      result.failureToCatch_ = this.failureToCatch_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.littlehorse.sdk.common.proto.FailureHandlerDef) {
        return mergeFrom((io.littlehorse.sdk.common.proto.FailureHandlerDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.FailureHandlerDef other) {
      if (other == io.littlehorse.sdk.common.proto.FailureHandlerDef.getDefaultInstance()) return this;
      if (!other.getHandlerSpecName().isEmpty()) {
        handlerSpecName_ = other.handlerSpecName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getFailureToCatchCase()) {
        case SPECIFIC_FAILURE: {
          failureToCatchCase_ = 1;
          failureToCatch_ = other.failureToCatch_;
          onChanged();
          break;
        }
        case ANY_FAILURE_OF_TYPE: {
          setAnyFailureOfTypeValue(other.getAnyFailureOfTypeValue());
          break;
        }
        case FAILURETOCATCH_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              failureToCatchCase_ = 1;
              failureToCatch_ = s;
              break;
            } // case 10
            case 18: {
              handlerSpecName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 24: {
              int rawValue = input.readEnum();
              failureToCatchCase_ = 3;
              failureToCatch_ = rawValue;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int failureToCatchCase_ = 0;
    private java.lang.Object failureToCatch_;
    public FailureToCatchCase
        getFailureToCatchCase() {
      return FailureToCatchCase.forNumber(
          failureToCatchCase_);
    }

    public Builder clearFailureToCatch() {
      failureToCatchCase_ = 0;
      failureToCatch_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object handlerSpecName_ = "";
    /**
     * <pre>
     * The name of the ThreadSpec to run as a
     * </pre>
     *
     * <code>string handler_spec_name = 2;</code>
     * @return The handlerSpecName.
     */
    public java.lang.String getHandlerSpecName() {
      java.lang.Object ref = handlerSpecName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        handlerSpecName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the ThreadSpec to run as a
     * </pre>
     *
     * <code>string handler_spec_name = 2;</code>
     * @return The bytes for handlerSpecName.
     */
    public com.google.protobuf.ByteString
        getHandlerSpecNameBytes() {
      java.lang.Object ref = handlerSpecName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        handlerSpecName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the ThreadSpec to run as a
     * </pre>
     *
     * <code>string handler_spec_name = 2;</code>
     * @param value The handlerSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setHandlerSpecName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      handlerSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the ThreadSpec to run as a
     * </pre>
     *
     * <code>string handler_spec_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHandlerSpecName() {
      handlerSpecName_ = getDefaultInstance().getHandlerSpecName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the ThreadSpec to run as a
     * </pre>
     *
     * <code>string handler_spec_name = 2;</code>
     * @param value The bytes for handlerSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setHandlerSpecNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      handlerSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @return Whether the specificFailure field is set.
     */
    @java.lang.Override
    public boolean hasSpecificFailure() {
      return failureToCatchCase_ == 1;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @return The specificFailure.
     */
    @java.lang.Override
    public java.lang.String getSpecificFailure() {
      java.lang.Object ref = "";
      if (failureToCatchCase_ == 1) {
        ref = failureToCatch_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (failureToCatchCase_ == 1) {
          failureToCatch_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @return The bytes for specificFailure.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSpecificFailureBytes() {
      java.lang.Object ref = "";
      if (failureToCatchCase_ == 1) {
        ref = failureToCatch_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (failureToCatchCase_ == 1) {
          failureToCatch_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @param value The specificFailure to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificFailure(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      failureToCatchCase_ = 1;
      failureToCatch_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecificFailure() {
      if (failureToCatchCase_ == 1) {
        failureToCatchCase_ = 0;
        failureToCatch_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for a Failure with this
     * exact name.
     *
     * If this and `specific_failure` are both unset, then any failure is caught.
     * </pre>
     *
     * <code>string specific_failure = 1;</code>
     * @param value The bytes for specificFailure to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificFailureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      failureToCatchCase_ = 1;
      failureToCatch_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @return Whether the anyFailureOfType field is set.
     */
    @java.lang.Override
    public boolean hasAnyFailureOfType() {
      return failureToCatchCase_ == 3;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @return The enum numeric value on the wire for anyFailureOfType.
     */
    @java.lang.Override
    public int getAnyFailureOfTypeValue() {
      if (failureToCatchCase_ == 3) {
        return ((java.lang.Integer) failureToCatch_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @param value The enum numeric value on the wire for anyFailureOfType to set.
     * @return This builder for chaining.
     */
    public Builder setAnyFailureOfTypeValue(int value) {
      failureToCatchCase_ = 3;
      failureToCatch_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @return The anyFailureOfType.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType getAnyFailureOfType() {
      if (failureToCatchCase_ == 3) {
        io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType result = io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.forNumber(
            (java.lang.Integer) failureToCatch_);
        return result == null ? io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.UNRECOGNIZED : result;
      }
      return io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType.FAILURE_TYPE_ERROR;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @param value The anyFailureOfType to set.
     * @return This builder for chaining.
     */
    public Builder setAnyFailureOfType(io.littlehorse.sdk.common.proto.FailureHandlerDef.LHFailureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      failureToCatchCase_ = 3;
      failureToCatch_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that this FailureHandlerDef will be triggered for any failure matching
     * this type (ERROR or EXCEPTION).
     * </pre>
     *
     * <code>.littlehorse.FailureHandlerDef.LHFailureType any_failure_of_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnyFailureOfType() {
      if (failureToCatchCase_ == 3) {
        failureToCatchCase_ = 0;
        failureToCatch_ = null;
        onChanged();
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:littlehorse.FailureHandlerDef)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.FailureHandlerDef)
  private static final io.littlehorse.sdk.common.proto.FailureHandlerDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.FailureHandlerDef();
  }

  public static io.littlehorse.sdk.common.proto.FailureHandlerDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailureHandlerDef>
      PARSER = new com.google.protobuf.AbstractParser<FailureHandlerDef>() {
    @java.lang.Override
    public FailureHandlerDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FailureHandlerDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailureHandlerDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.FailureHandlerDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
