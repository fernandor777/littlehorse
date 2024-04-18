// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object_id.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * ID for an ExternalEvent.
 * </pre>
 *
 * Protobuf type {@code littlehorse.ExternalEventId}
 */
public final class ExternalEventId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.ExternalEventId)
    ExternalEventIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalEventId.newBuilder() to construct.
  private ExternalEventId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalEventId() {
    guid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalEventId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_ExternalEventId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_ExternalEventId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.ExternalEventId.class, io.littlehorse.sdk.common.proto.ExternalEventId.Builder.class);
  }

  public static final int WF_RUN_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.WfRunId wfRunId_;
  /**
   * <pre>
   * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
   * with a WfRun.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   * @return Whether the wfRunId field is set.
   */
  @java.lang.Override
  public boolean hasWfRunId() {
    return wfRunId_ != null;
  }
  /**
   * <pre>
   * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
   * with a WfRun.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WfRunId getWfRunId() {
    return wfRunId_ == null ? io.littlehorse.sdk.common.proto.WfRunId.getDefaultInstance() : wfRunId_;
  }
  /**
   * <pre>
   * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
   * with a WfRun.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WfRunIdOrBuilder getWfRunIdOrBuilder() {
    return wfRunId_ == null ? io.littlehorse.sdk.common.proto.WfRunId.getDefaultInstance() : wfRunId_;
  }

  public static final int EXTERNAL_EVENT_DEF_ID_FIELD_NUMBER = 2;
  private io.littlehorse.sdk.common.proto.ExternalEventDefId externalEventDefId_;
  /**
   * <pre>
   * The ExternalEventDef for this ExternalEvent.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
   * @return Whether the externalEventDefId field is set.
   */
  @java.lang.Override
  public boolean hasExternalEventDefId() {
    return externalEventDefId_ != null;
  }
  /**
   * <pre>
   * The ExternalEventDef for this ExternalEvent.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
   * @return The externalEventDefId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ExternalEventDefId getExternalEventDefId() {
    return externalEventDefId_ == null ? io.littlehorse.sdk.common.proto.ExternalEventDefId.getDefaultInstance() : externalEventDefId_;
  }
  /**
   * <pre>
   * The ExternalEventDef for this ExternalEvent.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ExternalEventDefIdOrBuilder getExternalEventDefIdOrBuilder() {
    return externalEventDefId_ == null ? io.littlehorse.sdk.common.proto.ExternalEventDefId.getDefaultInstance() : externalEventDefId_;
  }

  public static final int GUID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object guid_ = "";
  /**
   * <pre>
   * A unique guid allowing for distinguishing this ExternalEvent from other events
   * of the same ExternalEventDef and WfRun.
   * </pre>
   *
   * <code>string guid = 3;</code>
   * @return The guid.
   */
  @java.lang.Override
  public java.lang.String getGuid() {
    java.lang.Object ref = guid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      guid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A unique guid allowing for distinguishing this ExternalEvent from other events
   * of the same ExternalEventDef and WfRun.
   * </pre>
   *
   * <code>string guid = 3;</code>
   * @return The bytes for guid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGuidBytes() {
    java.lang.Object ref = guid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      guid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (wfRunId_ != null) {
      output.writeMessage(1, getWfRunId());
    }
    if (externalEventDefId_ != null) {
      output.writeMessage(2, getExternalEventDefId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, guid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (wfRunId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWfRunId());
    }
    if (externalEventDefId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExternalEventDefId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, guid_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.ExternalEventId)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.ExternalEventId other = (io.littlehorse.sdk.common.proto.ExternalEventId) obj;

    if (hasWfRunId() != other.hasWfRunId()) return false;
    if (hasWfRunId()) {
      if (!getWfRunId()
          .equals(other.getWfRunId())) return false;
    }
    if (hasExternalEventDefId() != other.hasExternalEventDefId()) return false;
    if (hasExternalEventDefId()) {
      if (!getExternalEventDefId()
          .equals(other.getExternalEventDefId())) return false;
    }
    if (!getGuid()
        .equals(other.getGuid())) return false;
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
    if (hasWfRunId()) {
      hash = (37 * hash) + WF_RUN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWfRunId().hashCode();
    }
    if (hasExternalEventDefId()) {
      hash = (37 * hash) + EXTERNAL_EVENT_DEF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExternalEventDefId().hashCode();
    }
    hash = (37 * hash) + GUID_FIELD_NUMBER;
    hash = (53 * hash) + getGuid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.ExternalEventId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.ExternalEventId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ExternalEventId parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.ExternalEventId prototype) {
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
   * ID for an ExternalEvent.
   * </pre>
   *
   * Protobuf type {@code littlehorse.ExternalEventId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.ExternalEventId)
      io.littlehorse.sdk.common.proto.ExternalEventIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_ExternalEventId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_ExternalEventId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.ExternalEventId.class, io.littlehorse.sdk.common.proto.ExternalEventId.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.ExternalEventId.newBuilder()
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
      wfRunId_ = null;
      if (wfRunIdBuilder_ != null) {
        wfRunIdBuilder_.dispose();
        wfRunIdBuilder_ = null;
      }
      externalEventDefId_ = null;
      if (externalEventDefIdBuilder_ != null) {
        externalEventDefIdBuilder_.dispose();
        externalEventDefIdBuilder_ = null;
      }
      guid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_ExternalEventId_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ExternalEventId getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.ExternalEventId.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ExternalEventId build() {
      io.littlehorse.sdk.common.proto.ExternalEventId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ExternalEventId buildPartial() {
      io.littlehorse.sdk.common.proto.ExternalEventId result = new io.littlehorse.sdk.common.proto.ExternalEventId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.ExternalEventId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfRunId_ = wfRunIdBuilder_ == null
            ? wfRunId_
            : wfRunIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.externalEventDefId_ = externalEventDefIdBuilder_ == null
            ? externalEventDefId_
            : externalEventDefIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.guid_ = guid_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.ExternalEventId) {
        return mergeFrom((io.littlehorse.sdk.common.proto.ExternalEventId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.ExternalEventId other) {
      if (other == io.littlehorse.sdk.common.proto.ExternalEventId.getDefaultInstance()) return this;
      if (other.hasWfRunId()) {
        mergeWfRunId(other.getWfRunId());
      }
      if (other.hasExternalEventDefId()) {
        mergeExternalEventDefId(other.getExternalEventDefId());
      }
      if (!other.getGuid().isEmpty()) {
        guid_ = other.guid_;
        bitField0_ |= 0x00000004;
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
              input.readMessage(
                  getWfRunIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExternalEventDefIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              guid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private io.littlehorse.sdk.common.proto.WfRunId wfRunId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WfRunId, io.littlehorse.sdk.common.proto.WfRunId.Builder, io.littlehorse.sdk.common.proto.WfRunIdOrBuilder> wfRunIdBuilder_;
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     * @return Whether the wfRunId field is set.
     */
    public boolean hasWfRunId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     * @return The wfRunId.
     */
    public io.littlehorse.sdk.common.proto.WfRunId getWfRunId() {
      if (wfRunIdBuilder_ == null) {
        return wfRunId_ == null ? io.littlehorse.sdk.common.proto.WfRunId.getDefaultInstance() : wfRunId_;
      } else {
        return wfRunIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public Builder setWfRunId(io.littlehorse.sdk.common.proto.WfRunId value) {
      if (wfRunIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wfRunId_ = value;
      } else {
        wfRunIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public Builder setWfRunId(
        io.littlehorse.sdk.common.proto.WfRunId.Builder builderForValue) {
      if (wfRunIdBuilder_ == null) {
        wfRunId_ = builderForValue.build();
      } else {
        wfRunIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public Builder mergeWfRunId(io.littlehorse.sdk.common.proto.WfRunId value) {
      if (wfRunIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          wfRunId_ != null &&
          wfRunId_ != io.littlehorse.sdk.common.proto.WfRunId.getDefaultInstance()) {
          getWfRunIdBuilder().mergeFrom(value);
        } else {
          wfRunId_ = value;
        }
      } else {
        wfRunIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public Builder clearWfRunId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wfRunId_ = null;
      if (wfRunIdBuilder_ != null) {
        wfRunIdBuilder_.dispose();
        wfRunIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WfRunId.Builder getWfRunIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWfRunIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WfRunIdOrBuilder getWfRunIdOrBuilder() {
      if (wfRunIdBuilder_ != null) {
        return wfRunIdBuilder_.getMessageOrBuilder();
      } else {
        return wfRunId_ == null ?
            io.littlehorse.sdk.common.proto.WfRunId.getDefaultInstance() : wfRunId_;
      }
    }
    /**
     * <pre>
     * WfRunId for the ExternalEvent. Note that every ExternalEvent is associated
     * with a WfRun.
     * </pre>
     *
     * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WfRunId, io.littlehorse.sdk.common.proto.WfRunId.Builder, io.littlehorse.sdk.common.proto.WfRunIdOrBuilder> 
        getWfRunIdFieldBuilder() {
      if (wfRunIdBuilder_ == null) {
        wfRunIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.WfRunId, io.littlehorse.sdk.common.proto.WfRunId.Builder, io.littlehorse.sdk.common.proto.WfRunIdOrBuilder>(
                getWfRunId(),
                getParentForChildren(),
                isClean());
        wfRunId_ = null;
      }
      return wfRunIdBuilder_;
    }

    private io.littlehorse.sdk.common.proto.ExternalEventDefId externalEventDefId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.ExternalEventDefId, io.littlehorse.sdk.common.proto.ExternalEventDefId.Builder, io.littlehorse.sdk.common.proto.ExternalEventDefIdOrBuilder> externalEventDefIdBuilder_;
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     * @return Whether the externalEventDefId field is set.
     */
    public boolean hasExternalEventDefId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     * @return The externalEventDefId.
     */
    public io.littlehorse.sdk.common.proto.ExternalEventDefId getExternalEventDefId() {
      if (externalEventDefIdBuilder_ == null) {
        return externalEventDefId_ == null ? io.littlehorse.sdk.common.proto.ExternalEventDefId.getDefaultInstance() : externalEventDefId_;
      } else {
        return externalEventDefIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public Builder setExternalEventDefId(io.littlehorse.sdk.common.proto.ExternalEventDefId value) {
      if (externalEventDefIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalEventDefId_ = value;
      } else {
        externalEventDefIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public Builder setExternalEventDefId(
        io.littlehorse.sdk.common.proto.ExternalEventDefId.Builder builderForValue) {
      if (externalEventDefIdBuilder_ == null) {
        externalEventDefId_ = builderForValue.build();
      } else {
        externalEventDefIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public Builder mergeExternalEventDefId(io.littlehorse.sdk.common.proto.ExternalEventDefId value) {
      if (externalEventDefIdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          externalEventDefId_ != null &&
          externalEventDefId_ != io.littlehorse.sdk.common.proto.ExternalEventDefId.getDefaultInstance()) {
          getExternalEventDefIdBuilder().mergeFrom(value);
        } else {
          externalEventDefId_ = value;
        }
      } else {
        externalEventDefIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public Builder clearExternalEventDefId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      externalEventDefId_ = null;
      if (externalEventDefIdBuilder_ != null) {
        externalEventDefIdBuilder_.dispose();
        externalEventDefIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public io.littlehorse.sdk.common.proto.ExternalEventDefId.Builder getExternalEventDefIdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExternalEventDefIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    public io.littlehorse.sdk.common.proto.ExternalEventDefIdOrBuilder getExternalEventDefIdOrBuilder() {
      if (externalEventDefIdBuilder_ != null) {
        return externalEventDefIdBuilder_.getMessageOrBuilder();
      } else {
        return externalEventDefId_ == null ?
            io.littlehorse.sdk.common.proto.ExternalEventDefId.getDefaultInstance() : externalEventDefId_;
      }
    }
    /**
     * <pre>
     * The ExternalEventDef for this ExternalEvent.
     * </pre>
     *
     * <code>.littlehorse.ExternalEventDefId external_event_def_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.ExternalEventDefId, io.littlehorse.sdk.common.proto.ExternalEventDefId.Builder, io.littlehorse.sdk.common.proto.ExternalEventDefIdOrBuilder> 
        getExternalEventDefIdFieldBuilder() {
      if (externalEventDefIdBuilder_ == null) {
        externalEventDefIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.ExternalEventDefId, io.littlehorse.sdk.common.proto.ExternalEventDefId.Builder, io.littlehorse.sdk.common.proto.ExternalEventDefIdOrBuilder>(
                getExternalEventDefId(),
                getParentForChildren(),
                isClean());
        externalEventDefId_ = null;
      }
      return externalEventDefIdBuilder_;
    }

    private java.lang.Object guid_ = "";
    /**
     * <pre>
     * A unique guid allowing for distinguishing this ExternalEvent from other events
     * of the same ExternalEventDef and WfRun.
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The guid.
     */
    public java.lang.String getGuid() {
      java.lang.Object ref = guid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A unique guid allowing for distinguishing this ExternalEvent from other events
     * of the same ExternalEventDef and WfRun.
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The bytes for guid.
     */
    public com.google.protobuf.ByteString
        getGuidBytes() {
      java.lang.Object ref = guid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A unique guid allowing for distinguishing this ExternalEvent from other events
     * of the same ExternalEventDef and WfRun.
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @param value The guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      guid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique guid allowing for distinguishing this ExternalEvent from other events
     * of the same ExternalEventDef and WfRun.
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuid() {
      guid_ = getDefaultInstance().getGuid();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique guid allowing for distinguishing this ExternalEvent from other events
     * of the same ExternalEventDef and WfRun.
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @param value The bytes for guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      guid_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.ExternalEventId)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.ExternalEventId)
  private static final io.littlehorse.sdk.common.proto.ExternalEventId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.ExternalEventId();
  }

  public static io.littlehorse.sdk.common.proto.ExternalEventId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalEventId>
      PARSER = new com.google.protobuf.AbstractParser<ExternalEventId>() {
    @java.lang.Override
    public ExternalEventId parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalEventId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalEventId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ExternalEventId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
