// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public interface POSTableRequestPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.POSTableRequestPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lh_proto.RequestTypePb type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.lh_proto.RequestTypePb type = 1;</code>
   * @return The type.
   */
  io.littlehorse.common.proto.server.RequestTypePb getType();

  /**
   * <code>string store_key = 2;</code>
   * @return The storeKey.
   */
  java.lang.String getStoreKey();
  /**
   * <code>string store_key = 2;</code>
   * @return The bytes for storeKey.
   */
  com.google.protobuf.ByteString
      getStoreKeyBytes();

  /**
   * <code>string request_id = 3;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <code>string request_id = 3;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>bytes payload = 4;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>bytes payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}