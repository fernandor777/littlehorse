// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * List of TaskDef Id's.
 * </pre>
 *
 * Protobuf type {@code littlehorse.TaskDefIdList}
 */
public final class TaskDefIdList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskDefIdList)
    TaskDefIdListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskDefIdList.newBuilder() to construct.
  private TaskDefIdList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskDefIdList() {
    results_ = java.util.Collections.emptyList();
    bookmark_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskDefIdList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefIdList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefIdList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.TaskDefIdList.class, io.littlehorse.sdk.common.proto.TaskDefIdList.Builder.class);
  }

  private int bitField0_;
  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.littlehorse.sdk.common.proto.TaskDefId> results_;
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.TaskDefId results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.littlehorse.sdk.common.proto.TaskDefId> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.TaskDefId results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.TaskDefId results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.TaskDefId results = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefId getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.TaskDefId results = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int BOOKMARK_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString bookmark_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * The bookmark can be used for cursor-based pagination. If it is null, the server
   * has returned all results. If it is set, you can pass it into your next request
   * to resume searching where your previous request left off.
   * </pre>
   *
   * <code>optional bytes bookmark = 2;</code>
   * @return Whether the bookmark field is set.
   */
  @java.lang.Override
  public boolean hasBookmark() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The bookmark can be used for cursor-based pagination. If it is null, the server
   * has returned all results. If it is set, you can pass it into your next request
   * to resume searching where your previous request left off.
   * </pre>
   *
   * <code>optional bytes bookmark = 2;</code>
   * @return The bookmark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBookmark() {
    return bookmark_;
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(2, bookmark_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, bookmark_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.TaskDefIdList)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.TaskDefIdList other = (io.littlehorse.sdk.common.proto.TaskDefIdList) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
    if (hasBookmark() != other.hasBookmark()) return false;
    if (hasBookmark()) {
      if (!getBookmark()
          .equals(other.getBookmark())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    if (hasBookmark()) {
      hash = (37 * hash) + BOOKMARK_FIELD_NUMBER;
      hash = (53 * hash) + getBookmark().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefIdList parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.TaskDefIdList prototype) {
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
   * List of TaskDef Id's.
   * </pre>
   *
   * Protobuf type {@code littlehorse.TaskDefIdList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskDefIdList)
      io.littlehorse.sdk.common.proto.TaskDefIdListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefIdList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefIdList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.TaskDefIdList.class, io.littlehorse.sdk.common.proto.TaskDefIdList.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.TaskDefIdList.newBuilder()
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
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      bookmark_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefIdList_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefIdList getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.TaskDefIdList.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefIdList build() {
      io.littlehorse.sdk.common.proto.TaskDefIdList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefIdList buildPartial() {
      io.littlehorse.sdk.common.proto.TaskDefIdList result = new io.littlehorse.sdk.common.proto.TaskDefIdList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.littlehorse.sdk.common.proto.TaskDefIdList result) {
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.TaskDefIdList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bookmark_ = bookmark_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.TaskDefIdList) {
        return mergeFrom((io.littlehorse.sdk.common.proto.TaskDefIdList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.TaskDefIdList other) {
      if (other == io.littlehorse.sdk.common.proto.TaskDefIdList.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      if (other.hasBookmark()) {
        setBookmark(other.getBookmark());
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
              io.littlehorse.sdk.common.proto.TaskDefId m =
                  input.readMessage(
                      io.littlehorse.sdk.common.proto.TaskDefId.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              bookmark_ = input.readBytes();
              bitField0_ |= 0x00000002;
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

    private java.util.List<io.littlehorse.sdk.common.proto.TaskDefId> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<io.littlehorse.sdk.common.proto.TaskDefId>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public java.util.List<io.littlehorse.sdk.common.proto.TaskDefId> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder setResults(
        int index, io.littlehorse.sdk.common.proto.TaskDefId value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder setResults(
        int index, io.littlehorse.sdk.common.proto.TaskDefId.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder addResults(io.littlehorse.sdk.common.proto.TaskDefId value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder addResults(
        int index, io.littlehorse.sdk.common.proto.TaskDefId value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder addResults(
        io.littlehorse.sdk.common.proto.TaskDefId.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder addResults(
        int index, io.littlehorse.sdk.common.proto.TaskDefId.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends io.littlehorse.sdk.common.proto.TaskDefId> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public java.util.List<? extends io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance());
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance());
    }
    /**
     * <pre>
     * The resulting object id's.
     * </pre>
     *
     * <code>repeated .littlehorse.TaskDefId results = 1;</code>
     */
    public java.util.List<io.littlehorse.sdk.common.proto.TaskDefId.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private com.google.protobuf.ByteString bookmark_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The bookmark can be used for cursor-based pagination. If it is null, the server
     * has returned all results. If it is set, you can pass it into your next request
     * to resume searching where your previous request left off.
     * </pre>
     *
     * <code>optional bytes bookmark = 2;</code>
     * @return Whether the bookmark field is set.
     */
    @java.lang.Override
    public boolean hasBookmark() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The bookmark can be used for cursor-based pagination. If it is null, the server
     * has returned all results. If it is set, you can pass it into your next request
     * to resume searching where your previous request left off.
     * </pre>
     *
     * <code>optional bytes bookmark = 2;</code>
     * @return The bookmark.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBookmark() {
      return bookmark_;
    }
    /**
     * <pre>
     * The bookmark can be used for cursor-based pagination. If it is null, the server
     * has returned all results. If it is set, you can pass it into your next request
     * to resume searching where your previous request left off.
     * </pre>
     *
     * <code>optional bytes bookmark = 2;</code>
     * @param value The bookmark to set.
     * @return This builder for chaining.
     */
    public Builder setBookmark(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      bookmark_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bookmark can be used for cursor-based pagination. If it is null, the server
     * has returned all results. If it is set, you can pass it into your next request
     * to resume searching where your previous request left off.
     * </pre>
     *
     * <code>optional bytes bookmark = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookmark() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bookmark_ = getDefaultInstance().getBookmark();
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskDefIdList)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskDefIdList)
  private static final io.littlehorse.sdk.common.proto.TaskDefIdList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.TaskDefIdList();
  }

  public static io.littlehorse.sdk.common.proto.TaskDefIdList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskDefIdList>
      PARSER = new com.google.protobuf.AbstractParser<TaskDefIdList>() {
    @java.lang.Override
    public TaskDefIdList parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskDefIdList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskDefIdList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefIdList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
