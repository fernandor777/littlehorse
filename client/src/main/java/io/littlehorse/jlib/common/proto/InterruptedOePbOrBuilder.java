// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface InterruptedOePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.InterruptedOePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ext_evt_def_name = 1;</code>
   * @return The extEvtDefName.
   */
  java.lang.String getExtEvtDefName();
  /**
   * <code>string ext_evt_def_name = 1;</code>
   * @return The bytes for extEvtDefName.
   */
  com.google.protobuf.ByteString
      getExtEvtDefNameBytes();

  /**
   * <code>string ext_evt_guid = 2;</code>
   * @return The extEvtGuid.
   */
  java.lang.String getExtEvtGuid();
  /**
   * <code>string ext_evt_guid = 2;</code>
   * @return The bytes for extEvtGuid.
   */
  com.google.protobuf.ByteString
      getExtEvtGuidBytes();

  /**
   * <code>int32 interrupted_thread = 3;</code>
   * @return The interruptedThread.
   */
  int getInterruptedThread();
}