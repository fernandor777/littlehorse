// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface SearchExternalEventDefReplyPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.SearchExternalEventDefReplyPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.LHResponseCodePb code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.littlehorse.LHResponseCodePb code = 1;</code>
   * @return The code.
   */
  io.littlehorse.jlib.common.proto.LHResponseCodePb getCode();

  /**
   * <code>optional string message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .littlehorse.ExternalEventDefIdPb results = 3;</code>
   */
  java.util.List<io.littlehorse.jlib.common.proto.ExternalEventDefIdPb> 
      getResultsList();
  /**
   * <code>repeated .littlehorse.ExternalEventDefIdPb results = 3;</code>
   */
  io.littlehorse.jlib.common.proto.ExternalEventDefIdPb getResults(int index);
  /**
   * <code>repeated .littlehorse.ExternalEventDefIdPb results = 3;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .littlehorse.ExternalEventDefIdPb results = 3;</code>
   */
  java.util.List<? extends io.littlehorse.jlib.common.proto.ExternalEventDefIdPbOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .littlehorse.ExternalEventDefIdPb results = 3;</code>
   */
  io.littlehorse.jlib.common.proto.ExternalEventDefIdPbOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <code>optional bytes bookmark = 4;</code>
   * @return Whether the bookmark field is set.
   */
  boolean hasBookmark();
  /**
   * <code>optional bytes bookmark = 4;</code>
   * @return The bookmark.
   */
  com.google.protobuf.ByteString getBookmark();
}
