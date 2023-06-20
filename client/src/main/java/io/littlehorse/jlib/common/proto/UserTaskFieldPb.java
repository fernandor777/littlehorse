// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

/**
 * Protobuf type {@code littlehorse.UserTaskFieldPb}
 */
public final class UserTaskFieldPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.UserTaskFieldPb)
    UserTaskFieldPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserTaskFieldPb.newBuilder() to construct.
  private UserTaskFieldPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTaskFieldPb() {
    name_ = "";
    type_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserTaskFieldPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_UserTaskFieldPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_UserTaskFieldPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.jlib.common.proto.UserTaskFieldPb.class, io.littlehorse.jlib.common.proto.UserTaskFieldPb.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <code>.littlehorse.VariableTypePb type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.littlehorse.VariableTypePb type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public io.littlehorse.jlib.common.proto.VariableTypePb getType() {
    io.littlehorse.jlib.common.proto.VariableTypePb result = io.littlehorse.jlib.common.proto.VariableTypePb.forNumber(type_);
    return result == null ? io.littlehorse.jlib.common.proto.VariableTypePb.UNRECOGNIZED : result;
  }

  public static final int REQUIRED_FIELD_NUMBER = 3;
  private boolean required_ = false;
  /**
   * <code>bool required = 3;</code>
   * @return The required.
   */
  @java.lang.Override
  public boolean getRequired() {
    return required_;
  }

  public static final int DEFAULT_VAL_FIELD_NUMBER = 4;
  private io.littlehorse.jlib.common.proto.VariableValuePb defaultVal_;
  /**
   * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
   * @return Whether the defaultVal field is set.
   */
  @java.lang.Override
  public boolean hasDefaultVal() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
   * @return The defaultVal.
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePb getDefaultVal() {
    return defaultVal_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : defaultVal_;
  }
  /**
   * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getDefaultValOrBuilder() {
    return defaultVal_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : defaultVal_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * Later versions will allow stuff such as:
   * 1. Validation (eg. email address, integer between 1-10, etc)
   * 2. Nested object structures
   * 3. Multi-Page forms (survey-js style)
   * 4. Conditional rendering of forms based on input (surveyjs style)
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Later versions will allow stuff such as:
   * 1. Validation (eg. email address, integer between 1-10, etc)
   * 2. Nested object structures
   * 3. Multi-Page forms (survey-js style)
   * 4. Conditional rendering of forms based on input (surveyjs style)
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Later versions will allow stuff such as:
   * 1. Validation (eg. email address, integer between 1-10, etc)
   * 2. Nested object structures
   * 3. Multi-Page forms (survey-js style)
   * 4. Conditional rendering of forms based on input (surveyjs style)
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (type_ != io.littlehorse.jlib.common.proto.VariableTypePb.JSON_OBJ.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (required_ != false) {
      output.writeBool(3, required_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getDefaultVal());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (type_ != io.littlehorse.jlib.common.proto.VariableTypePb.JSON_OBJ.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (required_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, required_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDefaultVal());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
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
    if (!(obj instanceof io.littlehorse.jlib.common.proto.UserTaskFieldPb)) {
      return super.equals(obj);
    }
    io.littlehorse.jlib.common.proto.UserTaskFieldPb other = (io.littlehorse.jlib.common.proto.UserTaskFieldPb) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (getRequired()
        != other.getRequired()) return false;
    if (hasDefaultVal() != other.hasDefaultVal()) return false;
    if (hasDefaultVal()) {
      if (!getDefaultVal()
          .equals(other.getDefaultVal())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequired());
    if (hasDefaultVal()) {
      hash = (37 * hash) + DEFAULT_VAL_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultVal().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.jlib.common.proto.UserTaskFieldPb prototype) {
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
   * Protobuf type {@code littlehorse.UserTaskFieldPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.UserTaskFieldPb)
      io.littlehorse.jlib.common.proto.UserTaskFieldPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_UserTaskFieldPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_UserTaskFieldPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.jlib.common.proto.UserTaskFieldPb.class, io.littlehorse.jlib.common.proto.UserTaskFieldPb.Builder.class);
    }

    // Construct using io.littlehorse.jlib.common.proto.UserTaskFieldPb.newBuilder()
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
        getDefaultValFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      type_ = 0;
      required_ = false;
      defaultVal_ = null;
      if (defaultValBuilder_ != null) {
        defaultValBuilder_.dispose();
        defaultValBuilder_ = null;
      }
      description_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_UserTaskFieldPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.UserTaskFieldPb getDefaultInstanceForType() {
      return io.littlehorse.jlib.common.proto.UserTaskFieldPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.UserTaskFieldPb build() {
      io.littlehorse.jlib.common.proto.UserTaskFieldPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.UserTaskFieldPb buildPartial() {
      io.littlehorse.jlib.common.proto.UserTaskFieldPb result = new io.littlehorse.jlib.common.proto.UserTaskFieldPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.jlib.common.proto.UserTaskFieldPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.required_ = required_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.defaultVal_ = defaultValBuilder_ == null
            ? defaultVal_
            : defaultValBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.description_ = description_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof io.littlehorse.jlib.common.proto.UserTaskFieldPb) {
        return mergeFrom((io.littlehorse.jlib.common.proto.UserTaskFieldPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.jlib.common.proto.UserTaskFieldPb other) {
      if (other == io.littlehorse.jlib.common.proto.UserTaskFieldPb.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getRequired() != false) {
        setRequired(other.getRequired());
      }
      if (other.hasDefaultVal()) {
        mergeDefaultVal(other.getDefaultVal());
      }
      if (other.hasDescription()) {
        description_ = other.description_;
        bitField0_ |= 0x00000010;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              required_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getDefaultValFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.littlehorse.VariableTypePb type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.littlehorse.VariableTypePb type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.VariableTypePb type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.littlehorse.jlib.common.proto.VariableTypePb getType() {
      io.littlehorse.jlib.common.proto.VariableTypePb result = io.littlehorse.jlib.common.proto.VariableTypePb.forNumber(type_);
      return result == null ? io.littlehorse.jlib.common.proto.VariableTypePb.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlehorse.VariableTypePb type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.littlehorse.jlib.common.proto.VariableTypePb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.VariableTypePb type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean required_ ;
    /**
     * <code>bool required = 3;</code>
     * @return The required.
     */
    @java.lang.Override
    public boolean getRequired() {
      return required_;
    }
    /**
     * <code>bool required = 3;</code>
     * @param value The required to set.
     * @return This builder for chaining.
     */
    public Builder setRequired(boolean value) {
      
      required_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool required = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequired() {
      bitField0_ = (bitField0_ & ~0x00000004);
      required_ = false;
      onChanged();
      return this;
    }

    private io.littlehorse.jlib.common.proto.VariableValuePb defaultVal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> defaultValBuilder_;
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     * @return Whether the defaultVal field is set.
     */
    public boolean hasDefaultVal() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     * @return The defaultVal.
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb getDefaultVal() {
      if (defaultValBuilder_ == null) {
        return defaultVal_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : defaultVal_;
      } else {
        return defaultValBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public Builder setDefaultVal(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (defaultValBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultVal_ = value;
      } else {
        defaultValBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public Builder setDefaultVal(
        io.littlehorse.jlib.common.proto.VariableValuePb.Builder builderForValue) {
      if (defaultValBuilder_ == null) {
        defaultVal_ = builderForValue.build();
      } else {
        defaultValBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public Builder mergeDefaultVal(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (defaultValBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          defaultVal_ != null &&
          defaultVal_ != io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance()) {
          getDefaultValBuilder().mergeFrom(value);
        } else {
          defaultVal_ = value;
        }
      } else {
        defaultValBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public Builder clearDefaultVal() {
      bitField0_ = (bitField0_ & ~0x00000008);
      defaultVal_ = null;
      if (defaultValBuilder_ != null) {
        defaultValBuilder_.dispose();
        defaultValBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb.Builder getDefaultValBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDefaultValFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getDefaultValOrBuilder() {
      if (defaultValBuilder_ != null) {
        return defaultValBuilder_.getMessageOrBuilder();
      } else {
        return defaultVal_ == null ?
            io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : defaultVal_;
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb default_val = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> 
        getDefaultValFieldBuilder() {
      if (defaultValBuilder_ == null) {
        defaultValBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder>(
                getDefaultVal(),
                getParentForChildren(),
                isClean());
        defaultVal_ = null;
      }
      return defaultValBuilder_;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Later versions will allow stuff such as:
     * 1. Validation (eg. email address, integer between 1-10, etc)
     * 2. Nested object structures
     * 3. Multi-Page forms (survey-js style)
     * 4. Conditional rendering of forms based on input (surveyjs style)
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.UserTaskFieldPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.UserTaskFieldPb)
  private static final io.littlehorse.jlib.common.proto.UserTaskFieldPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.jlib.common.proto.UserTaskFieldPb();
  }

  public static io.littlehorse.jlib.common.proto.UserTaskFieldPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTaskFieldPb>
      PARSER = new com.google.protobuf.AbstractParser<UserTaskFieldPb>() {
    @java.lang.Override
    public UserTaskFieldPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserTaskFieldPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTaskFieldPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.jlib.common.proto.UserTaskFieldPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

