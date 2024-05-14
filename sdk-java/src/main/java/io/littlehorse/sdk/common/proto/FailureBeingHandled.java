// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_run.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Points to the Failure that is currently being handled in the ThreadRun.
 * </pre>
 *
 * Protobuf type {@code littlehorse.FailureBeingHandled}
 */
public final class FailureBeingHandled extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.FailureBeingHandled)
    FailureBeingHandledOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FailureBeingHandled.newBuilder() to construct.
  private FailureBeingHandled(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FailureBeingHandled() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FailureBeingHandled();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_FailureBeingHandled_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_FailureBeingHandled_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.FailureBeingHandled.class, io.littlehorse.sdk.common.proto.FailureBeingHandled.Builder.class);
  }

  public static final int THREAD_RUN_NUMBER_FIELD_NUMBER = 1;
  private int threadRunNumber_ = 0;
  /**
   * <pre>
   * The thread run number.
   * </pre>
   *
   * <code>int32 thread_run_number = 1;</code>
   * @return The threadRunNumber.
   */
  @java.lang.Override
  public int getThreadRunNumber() {
    return threadRunNumber_;
  }

  public static final int NODE_RUN_POSITION_FIELD_NUMBER = 2;
  private int nodeRunPosition_ = 0;
  /**
   * <pre>
   * The position of the NodeRun causing the failure.
   * </pre>
   *
   * <code>int32 node_run_position = 2;</code>
   * @return The nodeRunPosition.
   */
  @java.lang.Override
  public int getNodeRunPosition() {
    return nodeRunPosition_;
  }

  public static final int FAILURE_NUMBER_FIELD_NUMBER = 3;
  private int failureNumber_ = 0;
  /**
   * <pre>
   * The number of the failure.
   * </pre>
   *
   * <code>int32 failure_number = 3;</code>
   * @return The failureNumber.
   */
  @java.lang.Override
  public int getFailureNumber() {
    return failureNumber_;
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
    if (threadRunNumber_ != 0) {
      output.writeInt32(1, threadRunNumber_);
    }
    if (nodeRunPosition_ != 0) {
      output.writeInt32(2, nodeRunPosition_);
    }
    if (failureNumber_ != 0) {
      output.writeInt32(3, failureNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (threadRunNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, threadRunNumber_);
    }
    if (nodeRunPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nodeRunPosition_);
    }
    if (failureNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, failureNumber_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.FailureBeingHandled)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.FailureBeingHandled other = (io.littlehorse.sdk.common.proto.FailureBeingHandled) obj;

    if (getThreadRunNumber()
        != other.getThreadRunNumber()) return false;
    if (getNodeRunPosition()
        != other.getNodeRunPosition()) return false;
    if (getFailureNumber()
        != other.getFailureNumber()) return false;
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
    hash = (37 * hash) + THREAD_RUN_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getThreadRunNumber();
    hash = (37 * hash) + NODE_RUN_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getNodeRunPosition();
    hash = (37 * hash) + FAILURE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFailureNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.FailureBeingHandled parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.FailureBeingHandled prototype) {
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
   * Points to the Failure that is currently being handled in the ThreadRun.
   * </pre>
   *
   * Protobuf type {@code littlehorse.FailureBeingHandled}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.FailureBeingHandled)
      io.littlehorse.sdk.common.proto.FailureBeingHandledOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_FailureBeingHandled_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_FailureBeingHandled_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.FailureBeingHandled.class, io.littlehorse.sdk.common.proto.FailureBeingHandled.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.FailureBeingHandled.newBuilder()
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
      threadRunNumber_ = 0;
      nodeRunPosition_ = 0;
      failureNumber_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_FailureBeingHandled_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureBeingHandled getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.FailureBeingHandled.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureBeingHandled build() {
      io.littlehorse.sdk.common.proto.FailureBeingHandled result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.FailureBeingHandled buildPartial() {
      io.littlehorse.sdk.common.proto.FailureBeingHandled result = new io.littlehorse.sdk.common.proto.FailureBeingHandled(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.FailureBeingHandled result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.threadRunNumber_ = threadRunNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nodeRunPosition_ = nodeRunPosition_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failureNumber_ = failureNumber_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.FailureBeingHandled) {
        return mergeFrom((io.littlehorse.sdk.common.proto.FailureBeingHandled)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.FailureBeingHandled other) {
      if (other == io.littlehorse.sdk.common.proto.FailureBeingHandled.getDefaultInstance()) return this;
      if (other.getThreadRunNumber() != 0) {
        setThreadRunNumber(other.getThreadRunNumber());
      }
      if (other.getNodeRunPosition() != 0) {
        setNodeRunPosition(other.getNodeRunPosition());
      }
      if (other.getFailureNumber() != 0) {
        setFailureNumber(other.getFailureNumber());
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
            case 8: {
              threadRunNumber_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              nodeRunPosition_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              failureNumber_ = input.readInt32();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private int threadRunNumber_ ;
    /**
     * <pre>
     * The thread run number.
     * </pre>
     *
     * <code>int32 thread_run_number = 1;</code>
     * @return The threadRunNumber.
     */
    @java.lang.Override
    public int getThreadRunNumber() {
      return threadRunNumber_;
    }
    /**
     * <pre>
     * The thread run number.
     * </pre>
     *
     * <code>int32 thread_run_number = 1;</code>
     * @param value The threadRunNumber to set.
     * @return This builder for chaining.
     */
    public Builder setThreadRunNumber(int value) {

      threadRunNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The thread run number.
     * </pre>
     *
     * <code>int32 thread_run_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadRunNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      threadRunNumber_ = 0;
      onChanged();
      return this;
    }

    private int nodeRunPosition_ ;
    /**
     * <pre>
     * The position of the NodeRun causing the failure.
     * </pre>
     *
     * <code>int32 node_run_position = 2;</code>
     * @return The nodeRunPosition.
     */
    @java.lang.Override
    public int getNodeRunPosition() {
      return nodeRunPosition_;
    }
    /**
     * <pre>
     * The position of the NodeRun causing the failure.
     * </pre>
     *
     * <code>int32 node_run_position = 2;</code>
     * @param value The nodeRunPosition to set.
     * @return This builder for chaining.
     */
    public Builder setNodeRunPosition(int value) {

      nodeRunPosition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The position of the NodeRun causing the failure.
     * </pre>
     *
     * <code>int32 node_run_position = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeRunPosition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      nodeRunPosition_ = 0;
      onChanged();
      return this;
    }

    private int failureNumber_ ;
    /**
     * <pre>
     * The number of the failure.
     * </pre>
     *
     * <code>int32 failure_number = 3;</code>
     * @return The failureNumber.
     */
    @java.lang.Override
    public int getFailureNumber() {
      return failureNumber_;
    }
    /**
     * <pre>
     * The number of the failure.
     * </pre>
     *
     * <code>int32 failure_number = 3;</code>
     * @param value The failureNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFailureNumber(int value) {

      failureNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of the failure.
     * </pre>
     *
     * <code>int32 failure_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureNumber() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failureNumber_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:littlehorse.FailureBeingHandled)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.FailureBeingHandled)
  private static final io.littlehorse.sdk.common.proto.FailureBeingHandled DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.FailureBeingHandled();
  }

  public static io.littlehorse.sdk.common.proto.FailureBeingHandled getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailureBeingHandled>
      PARSER = new com.google.protobuf.AbstractParser<FailureBeingHandled>() {
    @java.lang.Override
    public FailureBeingHandled parsePartialFrom(
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

  public static com.google.protobuf.Parser<FailureBeingHandled> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailureBeingHandled> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.FailureBeingHandled getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
