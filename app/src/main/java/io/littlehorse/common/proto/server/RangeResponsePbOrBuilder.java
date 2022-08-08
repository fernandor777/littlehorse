// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public interface RangeResponsePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.RangeResponsePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string ids = 1;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <code>repeated string ids = 1;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <code>repeated string ids = 1;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <code>repeated string ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);

  /**
   * <code>string token = 2;</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <code>string token = 2;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
