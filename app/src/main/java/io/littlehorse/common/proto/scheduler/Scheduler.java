// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler.proto

package io.littlehorse.common.proto.scheduler;

public final class Scheduler {
  private Scheduler() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_NodeRunStatePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_NodeRunStatePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_ThreadRunStatePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_ThreadRunStatePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunStatePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunStatePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunRequestPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunRequestPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskScheduleRequestPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskScheduleRequestPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskStartedEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskStartedEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskResultEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskResultEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_SchedulerTimerPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_SchedulerTimerPb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017scheduler.proto\022\010lh_proto\032\037google/prot" +
      "obuf/timestamp.proto\032\016lh_proto.proto\"\227\001\n" +
      "\016NodeRunStatePb\022\021\n\tnode_name\030\001 \001(\t\022\026\n\016at" +
      "tempt_number\030\002 \001(\005\022\020\n\010position\030\003 \001(\005\022\016\n\006" +
      "number\030\004 \001(\005\022$\n\006status\030\005 \001(\0162\024.lh_proto." +
      "LHStatusPb\022\022\n\ntimer_keys\030\006 \003(\t\"\240\001\n\020Threa" +
      "dRunStatePb\022\030\n\020thread_spec_name\030\001 \001(\t\022$\n" +
      "\006status\030\002 \001(\0162\024.lh_proto.LHStatusPb\0227\n\020c" +
      "urrent_node_run\030\003 \001(\0132\030.lh_proto.NodeRun" +
      "StatePbH\000\210\001\001B\023\n\021_current_node_run\"\365\001\n\014Wf" +
      "RunStatePb\022\n\n\002id\030\001 \001(\t\022\022\n\nwf_spec_id\030\002 \001" +
      "(\t\022$\n\006status\030\006 \001(\0162\024.lh_proto.LHStatusPb" +
      "\022/\n\013thread_runs\030\007 \003(\0132\032.lh_proto.ThreadR" +
      "unStatePb\022.\n\nstart_time\030\010 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\0221\n\010end_time\030\t \001(\0132\032.go" +
      "ogle.protobuf.TimestampH\000\210\001\001B\013\n\t_end_tim" +
      "e\"J\n\016WfRunRequestPb\022\026\n\twf_run_id\030\001 \001(\tH\000" +
      "\210\001\001\022\022\n\nwf_spec_id\030\002 \001(\tB\014\n\n_wf_run_id\"\377\001" +
      "\n\025TaskScheduleRequestPb\022\023\n\013task_def_id\030\001" +
      " \001(\t\022\025\n\rtask_def_name\030\002 \001(\t\022\031\n\021thread_ru" +
      "n_number\030\004 \001(\005\022\027\n\017task_run_number\030\005 \001(\005\022" +
      "\031\n\021task_run_position\030\006 \001(\005\022\021\n\twf_run_id\030" +
      "\007 \001(\t\022\031\n\021reply_kafka_topic\030\010 \001(\t\022\022\n\nwf_s" +
      "pec_id\030\t \001(\t\022\026\n\016attempt_number\030\n \001(\005\022\021\n\t" +
      "node_name\030\013 \001(\t\"\215\001\n\022TaskStartedEventPb\022\031" +
      "\n\021thread_run_number\030\001 \001(\005\022\027\n\017task_run_nu" +
      "mber\030\002 \001(\005\022\031\n\021task_run_position\030\003 \001(\005\022(\n" +
      "\004time\030\004 \001(\0132\032.google.protobuf.Timestamp\"" +
      "\205\002\n\021TaskResultEventPb\022\031\n\021thread_run_numb" +
      "er\030\001 \001(\005\022\027\n\017task_run_number\030\002 \001(\005\022\031\n\021tas" +
      "k_run_position\030\003 \001(\005\022(\n\004time\030\004 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\022/\n\013result_code\030\005 " +
      "\001(\0162\032.lh_proto.TaskResultCodePb\022\023\n\006outpu" +
      "t\030\006 \001(\014H\000\210\001\001\022\027\n\nlog_output\030\007 \001(\014H\001\210\001\001B\t\n" +
      "\007_outputB\r\n\013_log_output\"\204\002\n\014WfRunEventPb" +
      "\022\021\n\twf_run_id\030\001 \001(\t\022\022\n\nwf_spec_id\030\002 \001(\t\022" +
      "(\n\004time\030\003 \001(\0132\032.google.protobuf.Timestam" +
      "p\022/\n\013run_request\030\004 \001(\0132\030.lh_proto.WfRunR" +
      "equestPbH\000\0225\n\rstarted_event\030\005 \001(\0132\034.lh_p" +
      "roto.TaskStartedEventPbH\000\0222\n\013task_result" +
      "\030\006 \001(\0132\033.lh_proto.TaskResultEventPbH\000B\007\n" +
      "\005event\"\214\001\n\020SchedulerTimerPb\0223\n\017maturatio" +
      "n_time\030\001 \001(\0132\032.google.protobuf.Timestamp" +
      "\0222\n\013task_result\030\002 \001(\0132\033.lh_proto.TaskRes" +
      "ultEventPbH\000B\017\n\rtimer_messageB2\n%io.litt" +
      "lehorse.common.proto.schedulerP\001Z\007.;mode" +
      "lb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          io.littlehorse.common.proto.LhProto.getDescriptor(),
        });
    internal_static_lh_proto_NodeRunStatePb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_NodeRunStatePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_NodeRunStatePb_descriptor,
        new java.lang.String[] { "NodeName", "AttemptNumber", "Position", "Number", "Status", "TimerKeys", });
    internal_static_lh_proto_ThreadRunStatePb_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lh_proto_ThreadRunStatePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_ThreadRunStatePb_descriptor,
        new java.lang.String[] { "ThreadSpecName", "Status", "CurrentNodeRun", "CurrentNodeRun", });
    internal_static_lh_proto_WfRunStatePb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lh_proto_WfRunStatePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunStatePb_descriptor,
        new java.lang.String[] { "Id", "WfSpecId", "Status", "ThreadRuns", "StartTime", "EndTime", "EndTime", });
    internal_static_lh_proto_WfRunRequestPb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lh_proto_WfRunRequestPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunRequestPb_descriptor,
        new java.lang.String[] { "WfRunId", "WfSpecId", "WfRunId", });
    internal_static_lh_proto_TaskScheduleRequestPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lh_proto_TaskScheduleRequestPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskScheduleRequestPb_descriptor,
        new java.lang.String[] { "TaskDefId", "TaskDefName", "ThreadRunNumber", "TaskRunNumber", "TaskRunPosition", "WfRunId", "ReplyKafkaTopic", "WfSpecId", "AttemptNumber", "NodeName", });
    internal_static_lh_proto_TaskStartedEventPb_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_lh_proto_TaskStartedEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskStartedEventPb_descriptor,
        new java.lang.String[] { "ThreadRunNumber", "TaskRunNumber", "TaskRunPosition", "Time", });
    internal_static_lh_proto_TaskResultEventPb_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_lh_proto_TaskResultEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskResultEventPb_descriptor,
        new java.lang.String[] { "ThreadRunNumber", "TaskRunNumber", "TaskRunPosition", "Time", "ResultCode", "Output", "LogOutput", "Output", "LogOutput", });
    internal_static_lh_proto_WfRunEventPb_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_lh_proto_WfRunEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunEventPb_descriptor,
        new java.lang.String[] { "WfRunId", "WfSpecId", "Time", "RunRequest", "StartedEvent", "TaskResult", "Event", });
    internal_static_lh_proto_SchedulerTimerPb_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_lh_proto_SchedulerTimerPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_SchedulerTimerPb_descriptor,
        new java.lang.String[] { "MaturationTime", "TaskResult", "TimerMessage", });
    com.google.protobuf.TimestampProto.getDescriptor();
    io.littlehorse.common.proto.LhProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
