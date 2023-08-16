// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.CancelUserTaskRunPb}
 */
public final class CancelUserTaskRunPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.CancelUserTaskRunPb)
    CancelUserTaskRunPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancelUserTaskRunPb.newBuilder() to construct.
  private CancelUserTaskRunPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancelUserTaskRunPb() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CancelUserTaskRunPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_CancelUserTaskRunPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_CancelUserTaskRunPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.class, io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.Builder.class);
  }

  public static final int USER_TASK_RUN_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.UserTaskRunIdPb userTaskRunId_;
  /**
   * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
   * @return Whether the userTaskRunId field is set.
   */
  @java.lang.Override
  public boolean hasUserTaskRunId() {
    return userTaskRunId_ != null;
  }
  /**
   * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
   * @return The userTaskRunId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserTaskRunIdPb getUserTaskRunId() {
    return userTaskRunId_ == null ? io.littlehorse.sdk.common.proto.UserTaskRunIdPb.getDefaultInstance() : userTaskRunId_;
  }
  /**
   * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder getUserTaskRunIdOrBuilder() {
    return userTaskRunId_ == null ? io.littlehorse.sdk.common.proto.UserTaskRunIdPb.getDefaultInstance() : userTaskRunId_;
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
    if (userTaskRunId_ != null) {
      output.writeMessage(1, getUserTaskRunId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userTaskRunId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserTaskRunId());
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.CancelUserTaskRunPb)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.CancelUserTaskRunPb other = (io.littlehorse.sdk.common.proto.CancelUserTaskRunPb) obj;

    if (hasUserTaskRunId() != other.hasUserTaskRunId()) return false;
    if (hasUserTaskRunId()) {
      if (!getUserTaskRunId()
          .equals(other.getUserTaskRunId())) return false;
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
    if (hasUserTaskRunId()) {
      hash = (37 * hash) + USER_TASK_RUN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserTaskRunId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.CancelUserTaskRunPb prototype) {
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
   * Protobuf type {@code littlehorse.CancelUserTaskRunPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.CancelUserTaskRunPb)
      io.littlehorse.sdk.common.proto.CancelUserTaskRunPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_CancelUserTaskRunPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_CancelUserTaskRunPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.class, io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.newBuilder()
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
      userTaskRunId_ = null;
      if (userTaskRunIdBuilder_ != null) {
        userTaskRunIdBuilder_.dispose();
        userTaskRunIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_CancelUserTaskRunPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.CancelUserTaskRunPb getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.CancelUserTaskRunPb build() {
      io.littlehorse.sdk.common.proto.CancelUserTaskRunPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.CancelUserTaskRunPb buildPartial() {
      io.littlehorse.sdk.common.proto.CancelUserTaskRunPb result = new io.littlehorse.sdk.common.proto.CancelUserTaskRunPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.CancelUserTaskRunPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userTaskRunId_ = userTaskRunIdBuilder_ == null
            ? userTaskRunId_
            : userTaskRunIdBuilder_.build();
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
      if (other instanceof io.littlehorse.sdk.common.proto.CancelUserTaskRunPb) {
        return mergeFrom((io.littlehorse.sdk.common.proto.CancelUserTaskRunPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.CancelUserTaskRunPb other) {
      if (other == io.littlehorse.sdk.common.proto.CancelUserTaskRunPb.getDefaultInstance()) return this;
      if (other.hasUserTaskRunId()) {
        mergeUserTaskRunId(other.getUserTaskRunId());
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
              input.readMessage(
                  getUserTaskRunIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private io.littlehorse.sdk.common.proto.UserTaskRunIdPb userTaskRunId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserTaskRunIdPb, io.littlehorse.sdk.common.proto.UserTaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder> userTaskRunIdBuilder_;
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     * @return Whether the userTaskRunId field is set.
     */
    public boolean hasUserTaskRunId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     * @return The userTaskRunId.
     */
    public io.littlehorse.sdk.common.proto.UserTaskRunIdPb getUserTaskRunId() {
      if (userTaskRunIdBuilder_ == null) {
        return userTaskRunId_ == null ? io.littlehorse.sdk.common.proto.UserTaskRunIdPb.getDefaultInstance() : userTaskRunId_;
      } else {
        return userTaskRunIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public Builder setUserTaskRunId(io.littlehorse.sdk.common.proto.UserTaskRunIdPb value) {
      if (userTaskRunIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userTaskRunId_ = value;
      } else {
        userTaskRunIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public Builder setUserTaskRunId(
        io.littlehorse.sdk.common.proto.UserTaskRunIdPb.Builder builderForValue) {
      if (userTaskRunIdBuilder_ == null) {
        userTaskRunId_ = builderForValue.build();
      } else {
        userTaskRunIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public Builder mergeUserTaskRunId(io.littlehorse.sdk.common.proto.UserTaskRunIdPb value) {
      if (userTaskRunIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          userTaskRunId_ != null &&
          userTaskRunId_ != io.littlehorse.sdk.common.proto.UserTaskRunIdPb.getDefaultInstance()) {
          getUserTaskRunIdBuilder().mergeFrom(value);
        } else {
          userTaskRunId_ = value;
        }
      } else {
        userTaskRunIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public Builder clearUserTaskRunId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userTaskRunId_ = null;
      if (userTaskRunIdBuilder_ != null) {
        userTaskRunIdBuilder_.dispose();
        userTaskRunIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.UserTaskRunIdPb.Builder getUserTaskRunIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserTaskRunIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder getUserTaskRunIdOrBuilder() {
      if (userTaskRunIdBuilder_ != null) {
        return userTaskRunIdBuilder_.getMessageOrBuilder();
      } else {
        return userTaskRunId_ == null ?
            io.littlehorse.sdk.common.proto.UserTaskRunIdPb.getDefaultInstance() : userTaskRunId_;
      }
    }
    /**
     * <code>.littlehorse.UserTaskRunIdPb user_task_run_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserTaskRunIdPb, io.littlehorse.sdk.common.proto.UserTaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder> 
        getUserTaskRunIdFieldBuilder() {
      if (userTaskRunIdBuilder_ == null) {
        userTaskRunIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.UserTaskRunIdPb, io.littlehorse.sdk.common.proto.UserTaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder>(
                getUserTaskRunId(),
                getParentForChildren(),
                isClean());
        userTaskRunId_ = null;
      }
      return userTaskRunIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.CancelUserTaskRunPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.CancelUserTaskRunPb)
  private static final io.littlehorse.sdk.common.proto.CancelUserTaskRunPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.CancelUserTaskRunPb();
  }

  public static io.littlehorse.sdk.common.proto.CancelUserTaskRunPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelUserTaskRunPb>
      PARSER = new com.google.protobuf.AbstractParser<CancelUserTaskRunPb>() {
    @java.lang.Override
    public CancelUserTaskRunPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<CancelUserTaskRunPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelUserTaskRunPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.CancelUserTaskRunPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
