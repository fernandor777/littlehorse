// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code lh_proto.PaginatedTagQueryPb}
 */
public final class PaginatedTagQueryPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lh_proto.PaginatedTagQueryPb)
    PaginatedTagQueryPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginatedTagQueryPb.newBuilder() to construct.
  private PaginatedTagQueryPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginatedTagQueryPb() {
    fullTagAttributes_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginatedTagQueryPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaginatedTagQueryPb(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            fullTagAttributes_ = s;
            break;
          }
          case 16: {

            limit_ = input.readInt32();
            break;
          }
          case 26: {
            io.littlehorse.common.proto.BookmarkPb.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = bookmark_.toBuilder();
            }
            bookmark_ = input.readMessage(io.littlehorse.common.proto.BookmarkPb.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bookmark_);
              bookmark_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            type_ = rawValue;
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
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.PaginatedTagQueryPb.class, io.littlehorse.common.proto.PaginatedTagQueryPb.Builder.class);
  }

  private int bitField0_;
  public static final int FULL_TAG_ATTRIBUTES_FIELD_NUMBER = 1;
  private volatile java.lang.Object fullTagAttributes_;
  /**
   * <code>string full_tag_attributes = 1;</code>
   * @return The fullTagAttributes.
   */
  @java.lang.Override
  public java.lang.String getFullTagAttributes() {
    java.lang.Object ref = fullTagAttributes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullTagAttributes_ = s;
      return s;
    }
  }
  /**
   * <code>string full_tag_attributes = 1;</code>
   * @return The bytes for fullTagAttributes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullTagAttributesBytes() {
    java.lang.Object ref = fullTagAttributes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullTagAttributes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_;
  /**
   * <code>int32 limit = 2;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
  }

  public static final int BOOKMARK_FIELD_NUMBER = 3;
  private io.littlehorse.common.proto.BookmarkPb bookmark_;
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   * @return Whether the bookmark field is set.
   */
  @java.lang.Override
  public boolean hasBookmark() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   * @return The bookmark.
   */
  @java.lang.Override
  public io.littlehorse.common.proto.BookmarkPb getBookmark() {
    return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
  }
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   */
  @java.lang.Override
  public io.littlehorse.common.proto.BookmarkPbOrBuilder getBookmarkOrBuilder() {
    return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
   * @return The type.
   */
  @java.lang.Override public io.littlehorse.common.proto.GETableClassEnumPb getType() {
    @SuppressWarnings("deprecation")
    io.littlehorse.common.proto.GETableClassEnumPb result = io.littlehorse.common.proto.GETableClassEnumPb.valueOf(type_);
    return result == null ? io.littlehorse.common.proto.GETableClassEnumPb.UNRECOGNIZED : result;
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
    if (!getFullTagAttributesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fullTagAttributes_);
    }
    if (limit_ != 0) {
      output.writeInt32(2, limit_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getBookmark());
    }
    if (type_ != io.littlehorse.common.proto.GETableClassEnumPb.TASK_DEF.getNumber()) {
      output.writeEnum(4, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFullTagAttributesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fullTagAttributes_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, limit_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBookmark());
    }
    if (type_ != io.littlehorse.common.proto.GETableClassEnumPb.TASK_DEF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
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
    if (!(obj instanceof io.littlehorse.common.proto.PaginatedTagQueryPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.PaginatedTagQueryPb other = (io.littlehorse.common.proto.PaginatedTagQueryPb) obj;

    if (!getFullTagAttributes()
        .equals(other.getFullTagAttributes())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (hasBookmark() != other.hasBookmark()) return false;
    if (hasBookmark()) {
      if (!getBookmark()
          .equals(other.getBookmark())) return false;
    }
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + FULL_TAG_ATTRIBUTES_FIELD_NUMBER;
    hash = (53 * hash) + getFullTagAttributes().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    if (hasBookmark()) {
      hash = (37 * hash) + BOOKMARK_FIELD_NUMBER;
      hash = (53 * hash) + getBookmark().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.PaginatedTagQueryPb prototype) {
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
   * Protobuf type {@code lh_proto.PaginatedTagQueryPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lh_proto.PaginatedTagQueryPb)
      io.littlehorse.common.proto.PaginatedTagQueryPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.PaginatedTagQueryPb.class, io.littlehorse.common.proto.PaginatedTagQueryPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.PaginatedTagQueryPb.newBuilder()
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
        getBookmarkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fullTagAttributes_ = "";

      limit_ = 0;

      if (bookmarkBuilder_ == null) {
        bookmark_ = null;
      } else {
        bookmarkBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.PaginatedTagQueryPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb build() {
      io.littlehorse.common.proto.PaginatedTagQueryPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb buildPartial() {
      io.littlehorse.common.proto.PaginatedTagQueryPb result = new io.littlehorse.common.proto.PaginatedTagQueryPb(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.fullTagAttributes_ = fullTagAttributes_;
      result.limit_ = limit_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (bookmarkBuilder_ == null) {
          result.bookmark_ = bookmark_;
        } else {
          result.bookmark_ = bookmarkBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.littlehorse.common.proto.PaginatedTagQueryPb) {
        return mergeFrom((io.littlehorse.common.proto.PaginatedTagQueryPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.PaginatedTagQueryPb other) {
      if (other == io.littlehorse.common.proto.PaginatedTagQueryPb.getDefaultInstance()) return this;
      if (!other.getFullTagAttributes().isEmpty()) {
        fullTagAttributes_ = other.fullTagAttributes_;
        onChanged();
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.hasBookmark()) {
        mergeBookmark(other.getBookmark());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      io.littlehorse.common.proto.PaginatedTagQueryPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.PaginatedTagQueryPb) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object fullTagAttributes_ = "";
    /**
     * <code>string full_tag_attributes = 1;</code>
     * @return The fullTagAttributes.
     */
    public java.lang.String getFullTagAttributes() {
      java.lang.Object ref = fullTagAttributes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullTagAttributes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string full_tag_attributes = 1;</code>
     * @return The bytes for fullTagAttributes.
     */
    public com.google.protobuf.ByteString
        getFullTagAttributesBytes() {
      java.lang.Object ref = fullTagAttributes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullTagAttributes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string full_tag_attributes = 1;</code>
     * @param value The fullTagAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setFullTagAttributes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullTagAttributes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string full_tag_attributes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullTagAttributes() {
      
      fullTagAttributes_ = getDefaultInstance().getFullTagAttributes();
      onChanged();
      return this;
    }
    /**
     * <code>string full_tag_attributes = 1;</code>
     * @param value The bytes for fullTagAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setFullTagAttributesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullTagAttributes_ = value;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <code>int32 limit = 2;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <code>int32 limit = 2;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private io.littlehorse.common.proto.BookmarkPb bookmark_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder> bookmarkBuilder_;
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     * @return Whether the bookmark field is set.
     */
    public boolean hasBookmark() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     * @return The bookmark.
     */
    public io.littlehorse.common.proto.BookmarkPb getBookmark() {
      if (bookmarkBuilder_ == null) {
        return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
      } else {
        return bookmarkBuilder_.getMessage();
      }
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder setBookmark(io.littlehorse.common.proto.BookmarkPb value) {
      if (bookmarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bookmark_ = value;
        onChanged();
      } else {
        bookmarkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder setBookmark(
        io.littlehorse.common.proto.BookmarkPb.Builder builderForValue) {
      if (bookmarkBuilder_ == null) {
        bookmark_ = builderForValue.build();
        onChanged();
      } else {
        bookmarkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder mergeBookmark(io.littlehorse.common.proto.BookmarkPb value) {
      if (bookmarkBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            bookmark_ != null &&
            bookmark_ != io.littlehorse.common.proto.BookmarkPb.getDefaultInstance()) {
          bookmark_ =
            io.littlehorse.common.proto.BookmarkPb.newBuilder(bookmark_).mergeFrom(value).buildPartial();
        } else {
          bookmark_ = value;
        }
        onChanged();
      } else {
        bookmarkBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder clearBookmark() {
      if (bookmarkBuilder_ == null) {
        bookmark_ = null;
        onChanged();
      } else {
        bookmarkBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public io.littlehorse.common.proto.BookmarkPb.Builder getBookmarkBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBookmarkFieldBuilder().getBuilder();
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public io.littlehorse.common.proto.BookmarkPbOrBuilder getBookmarkOrBuilder() {
      if (bookmarkBuilder_ != null) {
        return bookmarkBuilder_.getMessageOrBuilder();
      } else {
        return bookmark_ == null ?
            io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
      }
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder> 
        getBookmarkFieldBuilder() {
      if (bookmarkBuilder_ == null) {
        bookmarkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder>(
                getBookmark(),
                getParentForChildren(),
                isClean());
        bookmark_ = null;
      }
      return bookmarkBuilder_;
    }

    private int type_ = 0;
    /**
     * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.littlehorse.common.proto.GETableClassEnumPb getType() {
      @SuppressWarnings("deprecation")
      io.littlehorse.common.proto.GETableClassEnumPb result = io.littlehorse.common.proto.GETableClassEnumPb.valueOf(type_);
      return result == null ? io.littlehorse.common.proto.GETableClassEnumPb.UNRECOGNIZED : result;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.littlehorse.common.proto.GETableClassEnumPb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lh_proto.PaginatedTagQueryPb)
  }

  // @@protoc_insertion_point(class_scope:lh_proto.PaginatedTagQueryPb)
  private static final io.littlehorse.common.proto.PaginatedTagQueryPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.PaginatedTagQueryPb();
  }

  public static io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginatedTagQueryPb>
      PARSER = new com.google.protobuf.AbstractParser<PaginatedTagQueryPb>() {
    @java.lang.Override
    public PaginatedTagQueryPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaginatedTagQueryPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaginatedTagQueryPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginatedTagQueryPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

