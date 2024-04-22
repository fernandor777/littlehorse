// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics.proto

package io.littlehorse.sdk.common.proto;

public interface LHTenantPartitionMonitorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.LHTenantPartitionMonitor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.TenantId id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.littlehorse.TenantId id = 1;</code>
   * @return The id.
   */
  io.littlehorse.sdk.common.proto.TenantId getId();
  /**
   * <code>.littlehorse.TenantId id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.TenantIdOrBuilder getIdOrBuilder();

  /**
   * <code>repeated .littlehorse.UsageMetric metrics = 3;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.UsageMetric> 
      getMetricsList();
  /**
   * <code>repeated .littlehorse.UsageMetric metrics = 3;</code>
   */
  io.littlehorse.sdk.common.proto.UsageMetric getMetrics(int index);
  /**
   * <code>repeated .littlehorse.UsageMetric metrics = 3;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .littlehorse.UsageMetric metrics = 3;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.UsageMetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .littlehorse.UsageMetric metrics = 3;</code>
   */
  io.littlehorse.sdk.common.proto.UsageMetricOrBuilder getMetricsOrBuilder(
      int index);
}