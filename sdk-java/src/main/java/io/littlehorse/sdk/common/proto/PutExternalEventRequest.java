// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.PutExternalEventRequest}
 */
public final class PutExternalEventRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.PutExternalEventRequest)
    PutExternalEventRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PutExternalEventRequest.newBuilder() to construct.
  private PutExternalEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutExternalEventRequest() {
    wfRunId_ = "";
    externalEventDefName_ = "";
    guid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PutExternalEventRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PutExternalEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PutExternalEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.PutExternalEventRequest.class, io.littlehorse.sdk.common.proto.PutExternalEventRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WF_RUN_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object wfRunId_ = "";
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  @java.lang.Override
  public java.lang.String getWfRunId() {
    java.lang.Object ref = wfRunId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      wfRunId_ = s;
      return s;
    }
  }
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The bytes for wfRunId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWfRunIdBytes() {
    java.lang.Object ref = wfRunId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      wfRunId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_EVENT_DEF_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalEventDefName_ = "";
  /**
   * <code>string external_event_def_name = 2;</code>
   * @return The externalEventDefName.
   */
  @java.lang.Override
  public java.lang.String getExternalEventDefName() {
    java.lang.Object ref = externalEventDefName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalEventDefName_ = s;
      return s;
    }
  }
  /**
   * <code>string external_event_def_name = 2;</code>
   * @return The bytes for externalEventDefName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalEventDefNameBytes() {
    java.lang.Object ref = externalEventDefName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalEventDefName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GUID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object guid_ = "";
  /**
   * <code>optional string guid = 3;</code>
   * @return Whether the guid field is set.
   */
  @java.lang.Override
  public boolean hasGuid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string guid = 3;</code>
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
   * <code>optional string guid = 3;</code>
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

  public static final int CONTENT_FIELD_NUMBER = 5;
  private io.littlehorse.sdk.common.proto.VariableValue content_;
  /**
   * <code>.littlehorse.VariableValue content = 5;</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return content_ != null;
  }
  /**
   * <code>.littlehorse.VariableValue content = 5;</code>
   * @return The content.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.VariableValue getContent() {
    return content_ == null ? io.littlehorse.sdk.common.proto.VariableValue.getDefaultInstance() : content_;
  }
  /**
   * <code>.littlehorse.VariableValue content = 5;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.VariableValueOrBuilder getContentOrBuilder() {
    return content_ == null ? io.littlehorse.sdk.common.proto.VariableValue.getDefaultInstance() : content_;
  }

  public static final int THREAD_RUN_NUMBER_FIELD_NUMBER = 6;
  private int threadRunNumber_ = 0;
  /**
   * <code>optional int32 thread_run_number = 6;</code>
   * @return Whether the threadRunNumber field is set.
   */
  @java.lang.Override
  public boolean hasThreadRunNumber() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 thread_run_number = 6;</code>
   * @return The threadRunNumber.
   */
  @java.lang.Override
  public int getThreadRunNumber() {
    return threadRunNumber_;
  }

  public static final int NODE_RUN_POSITION_FIELD_NUMBER = 7;
  private int nodeRunPosition_ = 0;
  /**
   * <code>optional int32 node_run_position = 7;</code>
   * @return Whether the nodeRunPosition field is set.
   */
  @java.lang.Override
  public boolean hasNodeRunPosition() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 node_run_position = 7;</code>
   * @return The nodeRunPosition.
   */
  @java.lang.Override
  public int getNodeRunPosition() {
    return nodeRunPosition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(wfRunId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, wfRunId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalEventDefName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, externalEventDefName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, guid_);
    }
    if (content_ != null) {
      output.writeMessage(5, getContent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(6, threadRunNumber_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(7, nodeRunPosition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(wfRunId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, wfRunId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalEventDefName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, externalEventDefName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, guid_);
    }
    if (content_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getContent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, threadRunNumber_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, nodeRunPosition_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.PutExternalEventRequest)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.PutExternalEventRequest other = (io.littlehorse.sdk.common.proto.PutExternalEventRequest) obj;

    if (!getWfRunId()
        .equals(other.getWfRunId())) return false;
    if (!getExternalEventDefName()
        .equals(other.getExternalEventDefName())) return false;
    if (hasGuid() != other.hasGuid()) return false;
    if (hasGuid()) {
      if (!getGuid()
          .equals(other.getGuid())) return false;
    }
    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
    }
    if (hasThreadRunNumber() != other.hasThreadRunNumber()) return false;
    if (hasThreadRunNumber()) {
      if (getThreadRunNumber()
          != other.getThreadRunNumber()) return false;
    }
    if (hasNodeRunPosition() != other.hasNodeRunPosition()) return false;
    if (hasNodeRunPosition()) {
      if (getNodeRunPosition()
          != other.getNodeRunPosition()) return false;
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
    hash = (37 * hash) + WF_RUN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWfRunId().hashCode();
    hash = (37 * hash) + EXTERNAL_EVENT_DEF_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getExternalEventDefName().hashCode();
    if (hasGuid()) {
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid().hashCode();
    }
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    if (hasThreadRunNumber()) {
      hash = (37 * hash) + THREAD_RUN_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getThreadRunNumber();
    }
    if (hasNodeRunPosition()) {
      hash = (37 * hash) + NODE_RUN_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getNodeRunPosition();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.PutExternalEventRequest prototype) {
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
   * Protobuf type {@code littlehorse.PutExternalEventRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.PutExternalEventRequest)
      io.littlehorse.sdk.common.proto.PutExternalEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PutExternalEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PutExternalEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.PutExternalEventRequest.class, io.littlehorse.sdk.common.proto.PutExternalEventRequest.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.PutExternalEventRequest.newBuilder()
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
      wfRunId_ = "";
      externalEventDefName_ = "";
      guid_ = "";
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      threadRunNumber_ = 0;
      nodeRunPosition_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PutExternalEventRequest_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PutExternalEventRequest getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.PutExternalEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PutExternalEventRequest build() {
      io.littlehorse.sdk.common.proto.PutExternalEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PutExternalEventRequest buildPartial() {
      io.littlehorse.sdk.common.proto.PutExternalEventRequest result = new io.littlehorse.sdk.common.proto.PutExternalEventRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.PutExternalEventRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfRunId_ = wfRunId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.externalEventDefName_ = externalEventDefName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.guid_ = guid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.content_ = contentBuilder_ == null
            ? content_
            : contentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.threadRunNumber_ = threadRunNumber_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.nodeRunPosition_ = nodeRunPosition_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof io.littlehorse.sdk.common.proto.PutExternalEventRequest) {
        return mergeFrom((io.littlehorse.sdk.common.proto.PutExternalEventRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.PutExternalEventRequest other) {
      if (other == io.littlehorse.sdk.common.proto.PutExternalEventRequest.getDefaultInstance()) return this;
      if (!other.getWfRunId().isEmpty()) {
        wfRunId_ = other.wfRunId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getExternalEventDefName().isEmpty()) {
        externalEventDefName_ = other.externalEventDefName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasGuid()) {
        guid_ = other.guid_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasContent()) {
        mergeContent(other.getContent());
      }
      if (other.hasThreadRunNumber()) {
        setThreadRunNumber(other.getThreadRunNumber());
      }
      if (other.hasNodeRunPosition()) {
        setNodeRunPosition(other.getNodeRunPosition());
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
              wfRunId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              externalEventDefName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              guid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 42: {
              input.readMessage(
                  getContentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 42
            case 48: {
              threadRunNumber_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 48
            case 56: {
              nodeRunPosition_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 56
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

    private java.lang.Object wfRunId_ = "";
    /**
     * <code>string wf_run_id = 1;</code>
     * @return The wfRunId.
     */
    public java.lang.String getWfRunId() {
      java.lang.Object ref = wfRunId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wfRunId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @return The bytes for wfRunId.
     */
    public com.google.protobuf.ByteString
        getWfRunIdBytes() {
      java.lang.Object ref = wfRunId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wfRunId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @param value The wfRunId to set.
     * @return This builder for chaining.
     */
    public Builder setWfRunId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      wfRunId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWfRunId() {
      wfRunId_ = getDefaultInstance().getWfRunId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @param value The bytes for wfRunId to set.
     * @return This builder for chaining.
     */
    public Builder setWfRunIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      wfRunId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object externalEventDefName_ = "";
    /**
     * <code>string external_event_def_name = 2;</code>
     * @return The externalEventDefName.
     */
    public java.lang.String getExternalEventDefName() {
      java.lang.Object ref = externalEventDefName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalEventDefName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string external_event_def_name = 2;</code>
     * @return The bytes for externalEventDefName.
     */
    public com.google.protobuf.ByteString
        getExternalEventDefNameBytes() {
      java.lang.Object ref = externalEventDefName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalEventDefName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string external_event_def_name = 2;</code>
     * @param value The externalEventDefName to set.
     * @return This builder for chaining.
     */
    public Builder setExternalEventDefName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalEventDefName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string external_event_def_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalEventDefName() {
      externalEventDefName_ = getDefaultInstance().getExternalEventDefName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string external_event_def_name = 2;</code>
     * @param value The bytes for externalEventDefName to set.
     * @return This builder for chaining.
     */
    public Builder setExternalEventDefNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalEventDefName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object guid_ = "";
    /**
     * <code>optional string guid = 3;</code>
     * @return Whether the guid field is set.
     */
    public boolean hasGuid() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string guid = 3;</code>
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
     * <code>optional string guid = 3;</code>
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
     * <code>optional string guid = 3;</code>
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
     * <code>optional string guid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuid() {
      guid_ = getDefaultInstance().getGuid();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string guid = 3;</code>
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

    private io.littlehorse.sdk.common.proto.VariableValue content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.VariableValue, io.littlehorse.sdk.common.proto.VariableValue.Builder, io.littlehorse.sdk.common.proto.VariableValueOrBuilder> contentBuilder_;
    /**
     * <code>.littlehorse.VariableValue content = 5;</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.littlehorse.VariableValue content = 5;</code>
     * @return The content.
     */
    public io.littlehorse.sdk.common.proto.VariableValue getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? io.littlehorse.sdk.common.proto.VariableValue.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    public Builder setContent(io.littlehorse.sdk.common.proto.VariableValue value) {
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
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    public Builder setContent(
        io.littlehorse.sdk.common.proto.VariableValue.Builder builderForValue) {
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
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    public Builder mergeContent(io.littlehorse.sdk.common.proto.VariableValue value) {
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          content_ != null &&
          content_ != io.littlehorse.sdk.common.proto.VariableValue.getDefaultInstance()) {
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
     * <code>.littlehorse.VariableValue content = 5;</code>
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
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    public io.littlehorse.sdk.common.proto.VariableValue.Builder getContentBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    public io.littlehorse.sdk.common.proto.VariableValueOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            io.littlehorse.sdk.common.proto.VariableValue.getDefaultInstance() : content_;
      }
    }
    /**
     * <code>.littlehorse.VariableValue content = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.VariableValue, io.littlehorse.sdk.common.proto.VariableValue.Builder, io.littlehorse.sdk.common.proto.VariableValueOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.VariableValue, io.littlehorse.sdk.common.proto.VariableValue.Builder, io.littlehorse.sdk.common.proto.VariableValueOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
    }

    private int threadRunNumber_ ;
    /**
     * <code>optional int32 thread_run_number = 6;</code>
     * @return Whether the threadRunNumber field is set.
     */
    @java.lang.Override
    public boolean hasThreadRunNumber() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 thread_run_number = 6;</code>
     * @return The threadRunNumber.
     */
    @java.lang.Override
    public int getThreadRunNumber() {
      return threadRunNumber_;
    }
    /**
     * <code>optional int32 thread_run_number = 6;</code>
     * @param value The threadRunNumber to set.
     * @return This builder for chaining.
     */
    public Builder setThreadRunNumber(int value) {

      threadRunNumber_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 thread_run_number = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadRunNumber() {
      bitField0_ = (bitField0_ & ~0x00000010);
      threadRunNumber_ = 0;
      onChanged();
      return this;
    }

    private int nodeRunPosition_ ;
    /**
     * <code>optional int32 node_run_position = 7;</code>
     * @return Whether the nodeRunPosition field is set.
     */
    @java.lang.Override
    public boolean hasNodeRunPosition() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional int32 node_run_position = 7;</code>
     * @return The nodeRunPosition.
     */
    @java.lang.Override
    public int getNodeRunPosition() {
      return nodeRunPosition_;
    }
    /**
     * <code>optional int32 node_run_position = 7;</code>
     * @param value The nodeRunPosition to set.
     * @return This builder for chaining.
     */
    public Builder setNodeRunPosition(int value) {

      nodeRunPosition_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 node_run_position = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeRunPosition() {
      bitField0_ = (bitField0_ & ~0x00000020);
      nodeRunPosition_ = 0;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.PutExternalEventRequest)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.PutExternalEventRequest)
  private static final io.littlehorse.sdk.common.proto.PutExternalEventRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.PutExternalEventRequest();
  }

  public static io.littlehorse.sdk.common.proto.PutExternalEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutExternalEventRequest>
      PARSER = new com.google.protobuf.AbstractParser<PutExternalEventRequest>() {
    @java.lang.Override
    public PutExternalEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PutExternalEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutExternalEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.PutExternalEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
