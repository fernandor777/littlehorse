// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

/**
 * Protobuf type {@code littlehorse.FailurePb}
 */
public final class FailurePb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.FailurePb)
    FailurePbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FailurePb.newBuilder() to construct.
  private FailurePb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FailurePb() {
    failureName_ = "";
    failureCode_ = 0;
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FailurePb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_FailurePb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_FailurePb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.jlib.common.proto.FailurePb.class, io.littlehorse.jlib.common.proto.FailurePb.Builder.class);
  }

  private int bitField0_;
  public static final int FAILURE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object failureName_ = "";
  /**
   * <code>string failure_name = 1;</code>
   * @return The failureName.
   */
  @java.lang.Override
  public java.lang.String getFailureName() {
    java.lang.Object ref = failureName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureName_ = s;
      return s;
    }
  }
  /**
   * <code>string failure_name = 1;</code>
   * @return The bytes for failureName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFailureNameBytes() {
    java.lang.Object ref = failureName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_CODE_FIELD_NUMBER = 2;
  private int failureCode_ = 0;
  /**
   * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
   * @return The enum numeric value on the wire for failureCode.
   */
  @java.lang.Override public int getFailureCodeValue() {
    return failureCode_;
  }
  /**
   * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
   * @return The failureCode.
   */
  @java.lang.Override public io.littlehorse.jlib.common.proto.TaskResultCodePb getFailureCode() {
    io.littlehorse.jlib.common.proto.TaskResultCodePb result = io.littlehorse.jlib.common.proto.TaskResultCodePb.forNumber(failureCode_);
    return result == null ? io.littlehorse.jlib.common.proto.TaskResultCodePb.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 4;
  private io.littlehorse.jlib.common.proto.VariableValuePb content_;
  /**
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   * @return The content.
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePb getContent() {
    return content_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : content_;
  }
  /**
   * <code>optional .littlehorse.VariableValuePb content = 4;</code>
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getContentOrBuilder() {
    return content_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : content_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, failureName_);
    }
    if (failureCode_ != io.littlehorse.jlib.common.proto.TaskResultCodePb.SUCCESS.getNumber()) {
      output.writeEnum(2, failureCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getContent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, failureName_);
    }
    if (failureCode_ != io.littlehorse.jlib.common.proto.TaskResultCodePb.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, failureCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getContent());
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
    if (!(obj instanceof io.littlehorse.jlib.common.proto.FailurePb)) {
      return super.equals(obj);
    }
    io.littlehorse.jlib.common.proto.FailurePb other = (io.littlehorse.jlib.common.proto.FailurePb) obj;

    if (!getFailureName()
        .equals(other.getFailureName())) return false;
    if (failureCode_ != other.failureCode_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
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
    hash = (37 * hash) + FAILURE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFailureName().hashCode();
    hash = (37 * hash) + FAILURE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + failureCode_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.FailurePb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.jlib.common.proto.FailurePb prototype) {
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
   * Protobuf type {@code littlehorse.FailurePb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.FailurePb)
      io.littlehorse.jlib.common.proto.FailurePbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_FailurePb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_FailurePb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.jlib.common.proto.FailurePb.class, io.littlehorse.jlib.common.proto.FailurePb.Builder.class);
    }

    // Construct using io.littlehorse.jlib.common.proto.FailurePb.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getContentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      failureName_ = "";
      failureCode_ = 0;
      message_ = "";
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_FailurePb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.FailurePb getDefaultInstanceForType() {
      return io.littlehorse.jlib.common.proto.FailurePb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.FailurePb build() {
      io.littlehorse.jlib.common.proto.FailurePb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.FailurePb buildPartial() {
      io.littlehorse.jlib.common.proto.FailurePb result = new io.littlehorse.jlib.common.proto.FailurePb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.jlib.common.proto.FailurePb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.failureName_ = failureName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failureCode_ = failureCode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.content_ = contentBuilder_ == null
            ? content_
            : contentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof io.littlehorse.jlib.common.proto.FailurePb) {
        return mergeFrom((io.littlehorse.jlib.common.proto.FailurePb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.jlib.common.proto.FailurePb other) {
      if (other == io.littlehorse.jlib.common.proto.FailurePb.getDefaultInstance()) return this;
      if (!other.getFailureName().isEmpty()) {
        failureName_ = other.failureName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.failureCode_ != 0) {
        setFailureCodeValue(other.getFailureCodeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasContent()) {
        mergeContent(other.getContent());
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
              failureName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              failureCode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getContentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
    private int bitField0_;

    private java.lang.Object failureName_ = "";
    /**
     * <code>string failure_name = 1;</code>
     * @return The failureName.
     */
    public java.lang.String getFailureName() {
      java.lang.Object ref = failureName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string failure_name = 1;</code>
     * @return The bytes for failureName.
     */
    public com.google.protobuf.ByteString
        getFailureNameBytes() {
      java.lang.Object ref = failureName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string failure_name = 1;</code>
     * @param value The failureName to set.
     * @return This builder for chaining.
     */
    public Builder setFailureName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      failureName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string failure_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureName() {
      failureName_ = getDefaultInstance().getFailureName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string failure_name = 1;</code>
     * @param value The bytes for failureName to set.
     * @return This builder for chaining.
     */
    public Builder setFailureNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      failureName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int failureCode_ = 0;
    /**
     * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
     * @return The enum numeric value on the wire for failureCode.
     */
    @java.lang.Override public int getFailureCodeValue() {
      return failureCode_;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
     * @param value The enum numeric value on the wire for failureCode to set.
     * @return This builder for chaining.
     */
    public Builder setFailureCodeValue(int value) {
      failureCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
     * @return The failureCode.
     */
    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskResultCodePb getFailureCode() {
      io.littlehorse.jlib.common.proto.TaskResultCodePb result = io.littlehorse.jlib.common.proto.TaskResultCodePb.forNumber(failureCode_);
      return result == null ? io.littlehorse.jlib.common.proto.TaskResultCodePb.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
     * @param value The failureCode to set.
     * @return This builder for chaining.
     */
    public Builder setFailureCode(io.littlehorse.jlib.common.proto.TaskResultCodePb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      failureCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb failure_code = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failureCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 3;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private io.littlehorse.jlib.common.proto.VariableValuePb content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> contentBuilder_;
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     * @return The content.
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public Builder setContent(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
      } else {
        contentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public Builder setContent(
        io.littlehorse.jlib.common.proto.VariableValuePb.Builder builderForValue) {
      if (contentBuilder_ == null) {
        content_ = builderForValue.build();
      } else {
        contentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public Builder mergeContent(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          content_ != null &&
          content_ != io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance()) {
          getContentBuilder().mergeFrom(value);
        } else {
          content_ = value;
        }
      } else {
        contentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public Builder clearContent() {
      bitField0_ = (bitField0_ & ~0x00000008);
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb.Builder getContentBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : content_;
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb content = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.FailurePb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.FailurePb)
  private static final io.littlehorse.jlib.common.proto.FailurePb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.jlib.common.proto.FailurePb();
  }

  public static io.littlehorse.jlib.common.proto.FailurePb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailurePb>
      PARSER = new com.google.protobuf.AbstractParser<FailurePb>() {
    @java.lang.Override
    public FailurePb parsePartialFrom(
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

  public static com.google.protobuf.Parser<FailurePb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailurePb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.jlib.common.proto.FailurePb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

