// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

/**
 * Protobuf type {@code littlehorse.TaskWorkerGroupIdPb}
 */
public final class TaskWorkerGroupIdPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskWorkerGroupIdPb)
    TaskWorkerGroupIdPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskWorkerGroupIdPb.newBuilder() to construct.
  private TaskWorkerGroupIdPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskWorkerGroupIdPb() {
    taskDefName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskWorkerGroupIdPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskWorkerGroupIdPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskWorkerGroupIdPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.class, io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.Builder.class);
  }

  public static final int TASK_DEF_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskDefName_ = "";
  /**
   * <code>string task_def_name = 1;</code>
   * @return The taskDefName.
   */
  @java.lang.Override
  public java.lang.String getTaskDefName() {
    java.lang.Object ref = taskDefName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskDefName_ = s;
      return s;
    }
  }
  /**
   * <code>string task_def_name = 1;</code>
   * @return The bytes for taskDefName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskDefNameBytes() {
    java.lang.Object ref = taskDefName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskDefName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskDefName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, taskDefName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskDefName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, taskDefName_);
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
    if (!(obj instanceof io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb)) {
      return super.equals(obj);
    }
    io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb other = (io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb) obj;

    if (!getTaskDefName()
        .equals(other.getTaskDefName())) return false;
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
    hash = (37 * hash) + TASK_DEF_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTaskDefName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb prototype) {
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
   * Protobuf type {@code littlehorse.TaskWorkerGroupIdPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskWorkerGroupIdPb)
      io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskWorkerGroupIdPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskWorkerGroupIdPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.class, io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.Builder.class);
    }

    // Construct using io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.newBuilder()
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
      taskDefName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskWorkerGroupIdPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb getDefaultInstanceForType() {
      return io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb build() {
      io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb buildPartial() {
      io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb result = new io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskDefName_ = taskDefName_;
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
      if (other instanceof io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb) {
        return mergeFrom((io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb other) {
      if (other == io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb.getDefaultInstance()) return this;
      if (!other.getTaskDefName().isEmpty()) {
        taskDefName_ = other.taskDefName_;
        bitField0_ |= 0x00000001;
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
              taskDefName_ = input.readStringRequireUtf8();
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

    private java.lang.Object taskDefName_ = "";
    /**
     * <code>string task_def_name = 1;</code>
     * @return The taskDefName.
     */
    public java.lang.String getTaskDefName() {
      java.lang.Object ref = taskDefName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskDefName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string task_def_name = 1;</code>
     * @return The bytes for taskDefName.
     */
    public com.google.protobuf.ByteString
        getTaskDefNameBytes() {
      java.lang.Object ref = taskDefName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskDefName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string task_def_name = 1;</code>
     * @param value The taskDefName to set.
     * @return This builder for chaining.
     */
    public Builder setTaskDefName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskDefName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string task_def_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskDefName() {
      taskDefName_ = getDefaultInstance().getTaskDefName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string task_def_name = 1;</code>
     * @param value The bytes for taskDefName to set.
     * @return This builder for chaining.
     */
    public Builder setTaskDefNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskDefName_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskWorkerGroupIdPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskWorkerGroupIdPb)
  private static final io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb();
  }

  public static io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskWorkerGroupIdPb>
      PARSER = new com.google.protobuf.AbstractParser<TaskWorkerGroupIdPb>() {
    @java.lang.Override
    public TaskWorkerGroupIdPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskWorkerGroupIdPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskWorkerGroupIdPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.jlib.common.proto.TaskWorkerGroupIdPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

