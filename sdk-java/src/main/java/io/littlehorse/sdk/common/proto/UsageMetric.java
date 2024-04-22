// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.UsageMetric}
 */
public final class UsageMetric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.UsageMetric)
    UsageMetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageMetric.newBuilder() to construct.
  private UsageMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageMetric() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageMetric();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Metrics.internal_static_littlehorse_UsageMetric_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Metrics.internal_static_littlehorse_UsageMetric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.UsageMetric.class, io.littlehorse.sdk.common.proto.UsageMetric.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private long value_ = 0L;
  /**
   * <code>int64 value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  public static final int WINDOW_START_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp windowStart_;
  /**
   * <code>.google.protobuf.Timestamp window_start = 3;</code>
   * @return Whether the windowStart field is set.
   */
  @java.lang.Override
  public boolean hasWindowStart() {
    return windowStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 3;</code>
   * @return The windowStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getWindowStart() {
    return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
    return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
  }

  public static final int WINDOW_END_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp windowEnd_;
  /**
   * <code>.google.protobuf.Timestamp window_end = 4;</code>
   * @return Whether the windowEnd field is set.
   */
  @java.lang.Override
  public boolean hasWindowEnd() {
    return windowEnd_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp window_end = 4;</code>
   * @return The windowEnd.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getWindowEnd() {
    return windowEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowEnd_;
  }
  /**
   * <code>.google.protobuf.Timestamp window_end = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getWindowEndOrBuilder() {
    return windowEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowEnd_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (value_ != 0L) {
      output.writeInt64(2, value_);
    }
    if (windowStart_ != null) {
      output.writeMessage(3, getWindowStart());
    }
    if (windowEnd_ != null) {
      output.writeMessage(4, getWindowEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, value_);
    }
    if (windowStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getWindowStart());
    }
    if (windowEnd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getWindowEnd());
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.UsageMetric)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.UsageMetric other = (io.littlehorse.sdk.common.proto.UsageMetric) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getValue()
        != other.getValue()) return false;
    if (hasWindowStart() != other.hasWindowStart()) return false;
    if (hasWindowStart()) {
      if (!getWindowStart()
          .equals(other.getWindowStart())) return false;
    }
    if (hasWindowEnd() != other.hasWindowEnd()) return false;
    if (hasWindowEnd()) {
      if (!getWindowEnd()
          .equals(other.getWindowEnd())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    if (hasWindowStart()) {
      hash = (37 * hash) + WINDOW_START_FIELD_NUMBER;
      hash = (53 * hash) + getWindowStart().hashCode();
    }
    if (hasWindowEnd()) {
      hash = (37 * hash) + WINDOW_END_FIELD_NUMBER;
      hash = (53 * hash) + getWindowEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.UsageMetric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.UsageMetric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.UsageMetric parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.UsageMetric prototype) {
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
   * Protobuf type {@code littlehorse.UsageMetric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.UsageMetric)
      io.littlehorse.sdk.common.proto.UsageMetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Metrics.internal_static_littlehorse_UsageMetric_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Metrics.internal_static_littlehorse_UsageMetric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.UsageMetric.class, io.littlehorse.sdk.common.proto.UsageMetric.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.UsageMetric.newBuilder()
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
      id_ = "";
      value_ = 0L;
      windowStart_ = null;
      if (windowStartBuilder_ != null) {
        windowStartBuilder_.dispose();
        windowStartBuilder_ = null;
      }
      windowEnd_ = null;
      if (windowEndBuilder_ != null) {
        windowEndBuilder_.dispose();
        windowEndBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Metrics.internal_static_littlehorse_UsageMetric_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UsageMetric getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.UsageMetric.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UsageMetric build() {
      io.littlehorse.sdk.common.proto.UsageMetric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UsageMetric buildPartial() {
      io.littlehorse.sdk.common.proto.UsageMetric result = new io.littlehorse.sdk.common.proto.UsageMetric(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.UsageMetric result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.windowStart_ = windowStartBuilder_ == null
            ? windowStart_
            : windowStartBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.windowEnd_ = windowEndBuilder_ == null
            ? windowEnd_
            : windowEndBuilder_.build();
      }
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
      if (other instanceof io.littlehorse.sdk.common.proto.UsageMetric) {
        return mergeFrom((io.littlehorse.sdk.common.proto.UsageMetric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.UsageMetric other) {
      if (other == io.littlehorse.sdk.common.proto.UsageMetric.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.hasWindowStart()) {
        mergeWindowStart(other.getWindowStart());
      }
      if (other.hasWindowEnd()) {
        mergeWindowEnd(other.getWindowEnd());
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              value_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getWindowStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getWindowEndFieldBuilder().getBuilder(),
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <code>int64 value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <code>int64 value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {

      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp windowStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> windowStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     * @return Whether the windowStart field is set.
     */
    public boolean hasWindowStart() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     * @return The windowStart.
     */
    public com.google.protobuf.Timestamp getWindowStart() {
      if (windowStartBuilder_ == null) {
        return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      } else {
        return windowStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public Builder setWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowStart_ = value;
      } else {
        windowStartBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public Builder setWindowStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (windowStartBuilder_ == null) {
        windowStart_ = builderForValue.build();
      } else {
        windowStartBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public Builder mergeWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          windowStart_ != null &&
          windowStart_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getWindowStartBuilder().mergeFrom(value);
        } else {
          windowStart_ = value;
        }
      } else {
        windowStartBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public Builder clearWindowStart() {
      bitField0_ = (bitField0_ & ~0x00000004);
      windowStart_ = null;
      if (windowStartBuilder_ != null) {
        windowStartBuilder_.dispose();
        windowStartBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getWindowStartBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getWindowStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
      if (windowStartBuilder_ != null) {
        return windowStartBuilder_.getMessageOrBuilder();
      } else {
        return windowStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getWindowStartFieldBuilder() {
      if (windowStartBuilder_ == null) {
        windowStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getWindowStart(),
                getParentForChildren(),
                isClean());
        windowStart_ = null;
      }
      return windowStartBuilder_;
    }

    private com.google.protobuf.Timestamp windowEnd_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> windowEndBuilder_;
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     * @return Whether the windowEnd field is set.
     */
    public boolean hasWindowEnd() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     * @return The windowEnd.
     */
    public com.google.protobuf.Timestamp getWindowEnd() {
      if (windowEndBuilder_ == null) {
        return windowEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowEnd_;
      } else {
        return windowEndBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public Builder setWindowEnd(com.google.protobuf.Timestamp value) {
      if (windowEndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowEnd_ = value;
      } else {
        windowEndBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public Builder setWindowEnd(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (windowEndBuilder_ == null) {
        windowEnd_ = builderForValue.build();
      } else {
        windowEndBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public Builder mergeWindowEnd(com.google.protobuf.Timestamp value) {
      if (windowEndBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          windowEnd_ != null &&
          windowEnd_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getWindowEndBuilder().mergeFrom(value);
        } else {
          windowEnd_ = value;
        }
      } else {
        windowEndBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public Builder clearWindowEnd() {
      bitField0_ = (bitField0_ & ~0x00000008);
      windowEnd_ = null;
      if (windowEndBuilder_ != null) {
        windowEndBuilder_.dispose();
        windowEndBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getWindowEndBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getWindowEndFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getWindowEndOrBuilder() {
      if (windowEndBuilder_ != null) {
        return windowEndBuilder_.getMessageOrBuilder();
      } else {
        return windowEnd_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : windowEnd_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_end = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getWindowEndFieldBuilder() {
      if (windowEndBuilder_ == null) {
        windowEndBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getWindowEnd(),
                getParentForChildren(),
                isClean());
        windowEnd_ = null;
      }
      return windowEndBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.UsageMetric)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.UsageMetric)
  private static final io.littlehorse.sdk.common.proto.UsageMetric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.UsageMetric();
  }

  public static io.littlehorse.sdk.common.proto.UsageMetric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageMetric>
      PARSER = new com.google.protobuf.AbstractParser<UsageMetric>() {
    @java.lang.Override
    public UsageMetric parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageMetric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageMetric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UsageMetric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
