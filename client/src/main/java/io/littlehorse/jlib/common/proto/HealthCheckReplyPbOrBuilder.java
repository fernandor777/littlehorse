// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface HealthCheckReplyPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.HealthCheckReplyPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.LHHealthResultPb core_state = 1;</code>
   * @return The enum numeric value on the wire for coreState.
   */
  int getCoreStateValue();
  /**
   * <code>.littlehorse.LHHealthResultPb core_state = 1;</code>
   * @return The coreState.
   */
  io.littlehorse.jlib.common.proto.LHHealthResultPb getCoreState();

  /**
   * <code>.littlehorse.LHHealthResultPb timer_state = 2;</code>
   * @return The enum numeric value on the wire for timerState.
   */
  int getTimerStateValue();
  /**
   * <code>.littlehorse.LHHealthResultPb timer_state = 2;</code>
   * @return The timerState.
   */
  io.littlehorse.jlib.common.proto.LHHealthResultPb getTimerState();
}
