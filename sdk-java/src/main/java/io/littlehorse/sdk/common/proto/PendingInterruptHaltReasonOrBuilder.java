// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_run.proto

package io.littlehorse.sdk.common.proto;

public interface PendingInterruptHaltReasonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.PendingInterruptHaltReason)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ExternalEventId that caused the Interrupt.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventId external_event_id = 1;</code>
   * @return Whether the externalEventId field is set.
   */
  boolean hasExternalEventId();
  /**
   * <pre>
   * The ExternalEventId that caused the Interrupt.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventId external_event_id = 1;</code>
   * @return The externalEventId.
   */
  io.littlehorse.sdk.common.proto.ExternalEventId getExternalEventId();
  /**
   * <pre>
   * The ExternalEventId that caused the Interrupt.
   * </pre>
   *
   * <code>.littlehorse.ExternalEventId external_event_id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.ExternalEventIdOrBuilder getExternalEventIdOrBuilder();
}
