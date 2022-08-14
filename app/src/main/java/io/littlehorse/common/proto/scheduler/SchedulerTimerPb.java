// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler.proto

package io.littlehorse.common.proto.scheduler;

/**
 * Protobuf type {@code lh_proto.SchedulerTimerPb}
 */
public final class SchedulerTimerPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lh_proto.SchedulerTimerPb)
    SchedulerTimerPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulerTimerPb.newBuilder() to construct.
  private SchedulerTimerPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulerTimerPb() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulerTimerPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SchedulerTimerPb(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (maturationTime_ != null) {
              subBuilder = maturationTime_.toBuilder();
            }
            maturationTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maturationTime_);
              maturationTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder subBuilder = null;
            if (timerMessageCase_ == 2) {
              subBuilder = ((io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_).toBuilder();
            }
            timerMessage_ =
                input.readMessage(io.littlehorse.common.proto.scheduler.TaskResultEventPb.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_);
              timerMessage_ = subBuilder.buildPartial();
            }
            timerMessageCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.common.proto.scheduler.Scheduler.internal_static_lh_proto_SchedulerTimerPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.scheduler.Scheduler.internal_static_lh_proto_SchedulerTimerPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.scheduler.SchedulerTimerPb.class, io.littlehorse.common.proto.scheduler.SchedulerTimerPb.Builder.class);
  }

  private int timerMessageCase_ = 0;
  private java.lang.Object timerMessage_;
  public enum TimerMessageCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TASK_RESULT(2),
    TIMERMESSAGE_NOT_SET(0);
    private final int value;
    private TimerMessageCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimerMessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static TimerMessageCase forNumber(int value) {
      switch (value) {
        case 2: return TASK_RESULT;
        case 0: return TIMERMESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TimerMessageCase
  getTimerMessageCase() {
    return TimerMessageCase.forNumber(
        timerMessageCase_);
  }

  public static final int MATURATION_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp maturationTime_;
  /**
   * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
   * @return Whether the maturationTime field is set.
   */
  @java.lang.Override
  public boolean hasMaturationTime() {
    return maturationTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
   * @return The maturationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMaturationTime() {
    return maturationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : maturationTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMaturationTimeOrBuilder() {
    return getMaturationTime();
  }

  public static final int TASK_RESULT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * currently used for TimeOuts
   * </pre>
   *
   * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
   * @return Whether the taskResult field is set.
   */
  @java.lang.Override
  public boolean hasTaskResult() {
    return timerMessageCase_ == 2;
  }
  /**
   * <pre>
   * currently used for TimeOuts
   * </pre>
   *
   * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
   * @return The taskResult.
   */
  @java.lang.Override
  public io.littlehorse.common.proto.scheduler.TaskResultEventPb getTaskResult() {
    if (timerMessageCase_ == 2) {
       return (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_;
    }
    return io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
  }
  /**
   * <pre>
   * currently used for TimeOuts
   * </pre>
   *
   * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder getTaskResultOrBuilder() {
    if (timerMessageCase_ == 2) {
       return (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_;
    }
    return io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
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
    if (maturationTime_ != null) {
      output.writeMessage(1, getMaturationTime());
    }
    if (timerMessageCase_ == 2) {
      output.writeMessage(2, (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maturationTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMaturationTime());
    }
    if (timerMessageCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.littlehorse.common.proto.scheduler.SchedulerTimerPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.scheduler.SchedulerTimerPb other = (io.littlehorse.common.proto.scheduler.SchedulerTimerPb) obj;

    if (hasMaturationTime() != other.hasMaturationTime()) return false;
    if (hasMaturationTime()) {
      if (!getMaturationTime()
          .equals(other.getMaturationTime())) return false;
    }
    if (!getTimerMessageCase().equals(other.getTimerMessageCase())) return false;
    switch (timerMessageCase_) {
      case 2:
        if (!getTaskResult()
            .equals(other.getTaskResult())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMaturationTime()) {
      hash = (37 * hash) + MATURATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMaturationTime().hashCode();
    }
    switch (timerMessageCase_) {
      case 2:
        hash = (37 * hash) + TASK_RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getTaskResult().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.scheduler.SchedulerTimerPb prototype) {
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
   * Protobuf type {@code lh_proto.SchedulerTimerPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lh_proto.SchedulerTimerPb)
      io.littlehorse.common.proto.scheduler.SchedulerTimerPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.scheduler.Scheduler.internal_static_lh_proto_SchedulerTimerPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.scheduler.Scheduler.internal_static_lh_proto_SchedulerTimerPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.scheduler.SchedulerTimerPb.class, io.littlehorse.common.proto.scheduler.SchedulerTimerPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.scheduler.SchedulerTimerPb.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (maturationTimeBuilder_ == null) {
        maturationTime_ = null;
      } else {
        maturationTime_ = null;
        maturationTimeBuilder_ = null;
      }
      timerMessageCase_ = 0;
      timerMessage_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.scheduler.Scheduler.internal_static_lh_proto_SchedulerTimerPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.scheduler.SchedulerTimerPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.scheduler.SchedulerTimerPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.scheduler.SchedulerTimerPb build() {
      io.littlehorse.common.proto.scheduler.SchedulerTimerPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.scheduler.SchedulerTimerPb buildPartial() {
      io.littlehorse.common.proto.scheduler.SchedulerTimerPb result = new io.littlehorse.common.proto.scheduler.SchedulerTimerPb(this);
      if (maturationTimeBuilder_ == null) {
        result.maturationTime_ = maturationTime_;
      } else {
        result.maturationTime_ = maturationTimeBuilder_.build();
      }
      if (timerMessageCase_ == 2) {
        if (taskResultBuilder_ == null) {
          result.timerMessage_ = timerMessage_;
        } else {
          result.timerMessage_ = taskResultBuilder_.build();
        }
      }
      result.timerMessageCase_ = timerMessageCase_;
      onBuilt();
      return result;
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
      if (other instanceof io.littlehorse.common.proto.scheduler.SchedulerTimerPb) {
        return mergeFrom((io.littlehorse.common.proto.scheduler.SchedulerTimerPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.scheduler.SchedulerTimerPb other) {
      if (other == io.littlehorse.common.proto.scheduler.SchedulerTimerPb.getDefaultInstance()) return this;
      if (other.hasMaturationTime()) {
        mergeMaturationTime(other.getMaturationTime());
      }
      switch (other.getTimerMessageCase()) {
        case TASK_RESULT: {
          mergeTaskResult(other.getTaskResult());
          break;
        }
        case TIMERMESSAGE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.littlehorse.common.proto.scheduler.SchedulerTimerPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.scheduler.SchedulerTimerPb) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int timerMessageCase_ = 0;
    private java.lang.Object timerMessage_;
    public TimerMessageCase
        getTimerMessageCase() {
      return TimerMessageCase.forNumber(
          timerMessageCase_);
    }

    public Builder clearTimerMessage() {
      timerMessageCase_ = 0;
      timerMessage_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.Timestamp maturationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> maturationTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     * @return Whether the maturationTime field is set.
     */
    public boolean hasMaturationTime() {
      return maturationTimeBuilder_ != null || maturationTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     * @return The maturationTime.
     */
    public com.google.protobuf.Timestamp getMaturationTime() {
      if (maturationTimeBuilder_ == null) {
        return maturationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : maturationTime_;
      } else {
        return maturationTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public Builder setMaturationTime(com.google.protobuf.Timestamp value) {
      if (maturationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maturationTime_ = value;
        onChanged();
      } else {
        maturationTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public Builder setMaturationTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (maturationTimeBuilder_ == null) {
        maturationTime_ = builderForValue.build();
        onChanged();
      } else {
        maturationTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public Builder mergeMaturationTime(com.google.protobuf.Timestamp value) {
      if (maturationTimeBuilder_ == null) {
        if (maturationTime_ != null) {
          maturationTime_ =
            com.google.protobuf.Timestamp.newBuilder(maturationTime_).mergeFrom(value).buildPartial();
        } else {
          maturationTime_ = value;
        }
        onChanged();
      } else {
        maturationTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public Builder clearMaturationTime() {
      if (maturationTimeBuilder_ == null) {
        maturationTime_ = null;
        onChanged();
      } else {
        maturationTime_ = null;
        maturationTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMaturationTimeBuilder() {
      
      onChanged();
      return getMaturationTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMaturationTimeOrBuilder() {
      if (maturationTimeBuilder_ != null) {
        return maturationTimeBuilder_.getMessageOrBuilder();
      } else {
        return maturationTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : maturationTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp maturation_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getMaturationTimeFieldBuilder() {
      if (maturationTimeBuilder_ == null) {
        maturationTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getMaturationTime(),
                getParentForChildren(),
                isClean());
        maturationTime_ = null;
      }
      return maturationTimeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.scheduler.TaskResultEventPb, io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder, io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder> taskResultBuilder_;
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     * @return Whether the taskResult field is set.
     */
    @java.lang.Override
    public boolean hasTaskResult() {
      return timerMessageCase_ == 2;
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     * @return The taskResult.
     */
    @java.lang.Override
    public io.littlehorse.common.proto.scheduler.TaskResultEventPb getTaskResult() {
      if (taskResultBuilder_ == null) {
        if (timerMessageCase_ == 2) {
          return (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_;
        }
        return io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
      } else {
        if (timerMessageCase_ == 2) {
          return taskResultBuilder_.getMessage();
        }
        return io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    public Builder setTaskResult(io.littlehorse.common.proto.scheduler.TaskResultEventPb value) {
      if (taskResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timerMessage_ = value;
        onChanged();
      } else {
        taskResultBuilder_.setMessage(value);
      }
      timerMessageCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    public Builder setTaskResult(
        io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder builderForValue) {
      if (taskResultBuilder_ == null) {
        timerMessage_ = builderForValue.build();
        onChanged();
      } else {
        taskResultBuilder_.setMessage(builderForValue.build());
      }
      timerMessageCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    public Builder mergeTaskResult(io.littlehorse.common.proto.scheduler.TaskResultEventPb value) {
      if (taskResultBuilder_ == null) {
        if (timerMessageCase_ == 2 &&
            timerMessage_ != io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance()) {
          timerMessage_ = io.littlehorse.common.proto.scheduler.TaskResultEventPb.newBuilder((io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_)
              .mergeFrom(value).buildPartial();
        } else {
          timerMessage_ = value;
        }
        onChanged();
      } else {
        if (timerMessageCase_ == 2) {
          taskResultBuilder_.mergeFrom(value);
        }
        taskResultBuilder_.setMessage(value);
      }
      timerMessageCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    public Builder clearTaskResult() {
      if (taskResultBuilder_ == null) {
        if (timerMessageCase_ == 2) {
          timerMessageCase_ = 0;
          timerMessage_ = null;
          onChanged();
        }
      } else {
        if (timerMessageCase_ == 2) {
          timerMessageCase_ = 0;
          timerMessage_ = null;
        }
        taskResultBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    public io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder getTaskResultBuilder() {
      return getTaskResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    @java.lang.Override
    public io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder getTaskResultOrBuilder() {
      if ((timerMessageCase_ == 2) && (taskResultBuilder_ != null)) {
        return taskResultBuilder_.getMessageOrBuilder();
      } else {
        if (timerMessageCase_ == 2) {
          return (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_;
        }
        return io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * currently used for TimeOuts
     * </pre>
     *
     * <code>.lh_proto.TaskResultEventPb task_result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.scheduler.TaskResultEventPb, io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder, io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder> 
        getTaskResultFieldBuilder() {
      if (taskResultBuilder_ == null) {
        if (!(timerMessageCase_ == 2)) {
          timerMessage_ = io.littlehorse.common.proto.scheduler.TaskResultEventPb.getDefaultInstance();
        }
        taskResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.common.proto.scheduler.TaskResultEventPb, io.littlehorse.common.proto.scheduler.TaskResultEventPb.Builder, io.littlehorse.common.proto.scheduler.TaskResultEventPbOrBuilder>(
                (io.littlehorse.common.proto.scheduler.TaskResultEventPb) timerMessage_,
                getParentForChildren(),
                isClean());
        timerMessage_ = null;
      }
      timerMessageCase_ = 2;
      onChanged();;
      return taskResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:lh_proto.SchedulerTimerPb)
  }

  // @@protoc_insertion_point(class_scope:lh_proto.SchedulerTimerPb)
  private static final io.littlehorse.common.proto.scheduler.SchedulerTimerPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.scheduler.SchedulerTimerPb();
  }

  public static io.littlehorse.common.proto.scheduler.SchedulerTimerPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulerTimerPb>
      PARSER = new com.google.protobuf.AbstractParser<SchedulerTimerPb>() {
    @java.lang.Override
    public SchedulerTimerPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SchedulerTimerPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SchedulerTimerPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulerTimerPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.scheduler.SchedulerTimerPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

