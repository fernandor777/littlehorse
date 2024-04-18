// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: node_run.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * The sub-node structure for a START_MULTIPLE_THREADS NodeRun.
 *
 * Note: the output of this NodeRun, which can be used to mutate Variables,
 * is a JSON_ARR variable containing the ID's of all the child threadRuns.
 * </pre>
 *
 * Protobuf type {@code littlehorse.StartMultipleThreadsRun}
 */
public final class StartMultipleThreadsRun extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.StartMultipleThreadsRun)
    StartMultipleThreadsRunOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartMultipleThreadsRun.newBuilder() to construct.
  private StartMultipleThreadsRun(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartMultipleThreadsRun() {
    threadSpecName_ = "";
    childThreadIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartMultipleThreadsRun();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.NodeRunOuterClass.internal_static_littlehorse_StartMultipleThreadsRun_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.NodeRunOuterClass.internal_static_littlehorse_StartMultipleThreadsRun_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.class, io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.Builder.class);
  }

  public static final int THREAD_SPEC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object threadSpecName_ = "";
  /**
   * <pre>
   * The thread_spec_name of the child thread_runs.
   * </pre>
   *
   * <code>string thread_spec_name = 1;</code>
   * @return The threadSpecName.
   */
  @java.lang.Override
  public java.lang.String getThreadSpecName() {
    java.lang.Object ref = threadSpecName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      threadSpecName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The thread_spec_name of the child thread_runs.
   * </pre>
   *
   * <code>string thread_spec_name = 1;</code>
   * @return The bytes for threadSpecName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getThreadSpecNameBytes() {
    java.lang.Object ref = threadSpecName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      threadSpecName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHILD_THREAD_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList childThreadIds_;
  /**
   * <pre>
   * The list of all created child ThreadRun's
   * </pre>
   *
   * <code>repeated int32 child_thread_ids = 2;</code>
   * @return A list containing the childThreadIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getChildThreadIdsList() {
    return childThreadIds_;
  }
  /**
   * <pre>
   * The list of all created child ThreadRun's
   * </pre>
   *
   * <code>repeated int32 child_thread_ids = 2;</code>
   * @return The count of childThreadIds.
   */
  public int getChildThreadIdsCount() {
    return childThreadIds_.size();
  }
  /**
   * <pre>
   * The list of all created child ThreadRun's
   * </pre>
   *
   * <code>repeated int32 child_thread_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The childThreadIds at the given index.
   */
  public int getChildThreadIds(int index) {
    return childThreadIds_.getInt(index);
  }
  private int childThreadIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadSpecName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, threadSpecName_);
    }
    if (getChildThreadIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(childThreadIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < childThreadIds_.size(); i++) {
      output.writeInt32NoTag(childThreadIds_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadSpecName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, threadSpecName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < childThreadIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(childThreadIds_.getInt(i));
      }
      size += dataSize;
      if (!getChildThreadIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      childThreadIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.StartMultipleThreadsRun)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.StartMultipleThreadsRun other = (io.littlehorse.sdk.common.proto.StartMultipleThreadsRun) obj;

    if (!getThreadSpecName()
        .equals(other.getThreadSpecName())) return false;
    if (!getChildThreadIdsList()
        .equals(other.getChildThreadIdsList())) return false;
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
    hash = (37 * hash) + THREAD_SPEC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getThreadSpecName().hashCode();
    if (getChildThreadIdsCount() > 0) {
      hash = (37 * hash) + CHILD_THREAD_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getChildThreadIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.StartMultipleThreadsRun prototype) {
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
   * The sub-node structure for a START_MULTIPLE_THREADS NodeRun.
   *
   * Note: the output of this NodeRun, which can be used to mutate Variables,
   * is a JSON_ARR variable containing the ID's of all the child threadRuns.
   * </pre>
   *
   * Protobuf type {@code littlehorse.StartMultipleThreadsRun}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.StartMultipleThreadsRun)
      io.littlehorse.sdk.common.proto.StartMultipleThreadsRunOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.NodeRunOuterClass.internal_static_littlehorse_StartMultipleThreadsRun_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.NodeRunOuterClass.internal_static_littlehorse_StartMultipleThreadsRun_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.class, io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.newBuilder()
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
      threadSpecName_ = "";
      childThreadIds_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.NodeRunOuterClass.internal_static_littlehorse_StartMultipleThreadsRun_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartMultipleThreadsRun getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartMultipleThreadsRun build() {
      io.littlehorse.sdk.common.proto.StartMultipleThreadsRun result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartMultipleThreadsRun buildPartial() {
      io.littlehorse.sdk.common.proto.StartMultipleThreadsRun result = new io.littlehorse.sdk.common.proto.StartMultipleThreadsRun(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.littlehorse.sdk.common.proto.StartMultipleThreadsRun result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        childThreadIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.childThreadIds_ = childThreadIds_;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.StartMultipleThreadsRun result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.threadSpecName_ = threadSpecName_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.StartMultipleThreadsRun) {
        return mergeFrom((io.littlehorse.sdk.common.proto.StartMultipleThreadsRun)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.StartMultipleThreadsRun other) {
      if (other == io.littlehorse.sdk.common.proto.StartMultipleThreadsRun.getDefaultInstance()) return this;
      if (!other.getThreadSpecName().isEmpty()) {
        threadSpecName_ = other.threadSpecName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.childThreadIds_.isEmpty()) {
        if (childThreadIds_.isEmpty()) {
          childThreadIds_ = other.childThreadIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureChildThreadIdsIsMutable();
          childThreadIds_.addAll(other.childThreadIds_);
        }
        onChanged();
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
              threadSpecName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int v = input.readInt32();
              ensureChildThreadIdsIsMutable();
              childThreadIds_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureChildThreadIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                childThreadIds_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
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

    private java.lang.Object threadSpecName_ = "";
    /**
     * <pre>
     * The thread_spec_name of the child thread_runs.
     * </pre>
     *
     * <code>string thread_spec_name = 1;</code>
     * @return The threadSpecName.
     */
    public java.lang.String getThreadSpecName() {
      java.lang.Object ref = threadSpecName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        threadSpecName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The thread_spec_name of the child thread_runs.
     * </pre>
     *
     * <code>string thread_spec_name = 1;</code>
     * @return The bytes for threadSpecName.
     */
    public com.google.protobuf.ByteString
        getThreadSpecNameBytes() {
      java.lang.Object ref = threadSpecName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        threadSpecName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The thread_spec_name of the child thread_runs.
     * </pre>
     *
     * <code>string thread_spec_name = 1;</code>
     * @param value The threadSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setThreadSpecName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      threadSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The thread_spec_name of the child thread_runs.
     * </pre>
     *
     * <code>string thread_spec_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadSpecName() {
      threadSpecName_ = getDefaultInstance().getThreadSpecName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The thread_spec_name of the child thread_runs.
     * </pre>
     *
     * <code>string thread_spec_name = 1;</code>
     * @param value The bytes for threadSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setThreadSpecNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      threadSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList childThreadIds_ = emptyIntList();
    private void ensureChildThreadIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        childThreadIds_ = mutableCopy(childThreadIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @return A list containing the childThreadIds.
     */
    public java.util.List<java.lang.Integer>
        getChildThreadIdsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(childThreadIds_) : childThreadIds_;
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @return The count of childThreadIds.
     */
    public int getChildThreadIdsCount() {
      return childThreadIds_.size();
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The childThreadIds at the given index.
     */
    public int getChildThreadIds(int index) {
      return childThreadIds_.getInt(index);
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The childThreadIds to set.
     * @return This builder for chaining.
     */
    public Builder setChildThreadIds(
        int index, int value) {

      ensureChildThreadIdsIsMutable();
      childThreadIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @param value The childThreadIds to add.
     * @return This builder for chaining.
     */
    public Builder addChildThreadIds(int value) {

      ensureChildThreadIdsIsMutable();
      childThreadIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @param values The childThreadIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllChildThreadIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureChildThreadIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, childThreadIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of all created child ThreadRun's
     * </pre>
     *
     * <code>repeated int32 child_thread_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChildThreadIds() {
      childThreadIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:littlehorse.StartMultipleThreadsRun)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.StartMultipleThreadsRun)
  private static final io.littlehorse.sdk.common.proto.StartMultipleThreadsRun DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.StartMultipleThreadsRun();
  }

  public static io.littlehorse.sdk.common.proto.StartMultipleThreadsRun getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartMultipleThreadsRun>
      PARSER = new com.google.protobuf.AbstractParser<StartMultipleThreadsRun>() {
    @java.lang.Override
    public StartMultipleThreadsRun parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartMultipleThreadsRun> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartMultipleThreadsRun> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.StartMultipleThreadsRun getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
