// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.littlehorse.common.proto;

public final class Command {
  private Command() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskScheduleRequestPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskScheduleRequestPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskScheduleRequestPb_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskScheduleRequestPb_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunRequestPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunRequestPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunRequestPb_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunRequestPb_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskClaimEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskClaimEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskResultEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskResultEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutWfSpecPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutWfSpecPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutWfSpecPb_ThreadSpecsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutWfSpecPb_ThreadSpecsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutTaskDefPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutTaskDefPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutTaskDefPb_InputVarsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutTaskDefPb_InputVarsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutExternalEventDefPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutExternalEventDefPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_PutExternalEventPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_PutExternalEventPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_RunWfPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_RunWfPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_RunWfPb_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_RunWfPb_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_StopWfRunPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_StopWfRunPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_ResumeWfRunPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_ResumeWfRunPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_SleepNodeMaturedPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_SleepNodeMaturedPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_CommandPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_CommandPb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcommand.proto\022\010lh_proto\032\014status.proto\032" +
      "\016variable.proto\032\rwf_spec.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"\300\003\n\025TaskSchedule" +
      "RequestPb\022\023\n\013task_def_id\030\001 \001(\t\022\025\n\rtask_d" +
      "ef_name\030\002 \001(\t\022\031\n\021thread_run_number\030\004 \001(\005" +
      "\022\027\n\017task_run_number\030\005 \001(\005\022\031\n\021task_run_po" +
      "sition\030\006 \001(\005\022\021\n\twf_run_id\030\007 \001(\t\022\032\n\022wf_ru" +
      "n_event_queue\030\010 \001(\t\022\022\n\nwf_spec_id\030\t \001(\t\022" +
      "\026\n\016attempt_number\030\n \001(\005\022\021\n\tnode_name\030\013 \001" +
      "(\t\022A\n\tvariables\030\014 \003(\0132..lh_proto.TaskSch" +
      "eduleRequestPb.VariablesEntry\022.\n\ncreated" +
      "_at\030\r \001(\0132\032.google.protobuf.Timestamp\032K\n" +
      "\016VariablesEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 " +
      "\001(\0132\031.lh_proto.VariableValuePb:\0028\001\"\323\001\n\016W" +
      "fRunRequestPb\022\026\n\twf_run_id\030\001 \001(\tH\000\210\001\001\022\022\n" +
      "\nwf_spec_id\030\002 \001(\t\022:\n\tvariables\030\003 \003(\0132\'.l" +
      "h_proto.WfRunRequestPb.VariablesEntry\032K\n" +
      "\016VariablesEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 " +
      "\001(\0132\031.lh_proto.VariableValuePb:\0028\001B\014\n\n_w" +
      "f_run_id\"\236\001\n\020TaskClaimEventPb\022\021\n\twf_run_" +
      "id\030\001 \001(\t\022\031\n\021thread_run_number\030\002 \001(\005\022\027\n\017t" +
      "ask_run_number\030\003 \001(\005\022\031\n\021task_run_positio" +
      "n\030\004 \001(\005\022(\n\004time\030\005 \001(\0132\032.google.protobuf." +
      "Timestamp\"\307\002\n\021TaskResultEventPb\022\021\n\twf_ru" +
      "n_id\030\001 \001(\t\022\031\n\021thread_run_number\030\002 \001(\005\022\031\n" +
      "\021task_run_position\030\003 \001(\005\022(\n\004time\030\004 \001(\0132\032" +
      ".google.protobuf.Timestamp\022/\n\013result_cod" +
      "e\030\005 \001(\0162\032.lh_proto.TaskResultCodePb\022.\n\006o" +
      "utput\030\006 \001(\0132\031.lh_proto.VariableValuePbH\000" +
      "\210\001\001\0222\n\nlog_output\030\007 \001(\0132\031.lh_proto.Varia" +
      "bleValuePbH\001\210\001\001\022\020\n\010from_rpc\030\010 \001(\010B\t\n\007_ou" +
      "tputB\r\n\013_log_output\"\335\001\n\013PutWfSpecPb\022\014\n\004n" +
      "ame\030\001 \001(\t\022<\n\014thread_specs\030\005 \003(\0132&.lh_pro" +
      "to.PutWfSpecPb.ThreadSpecsEntry\022\036\n\026entry" +
      "point_thread_name\030\006 \001(\t\032J\n\020ThreadSpecsEn" +
      "try\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.lh_pro" +
      "to.ThreadSpecPb:\0028\001J\004\010\002\020\003J\004\010\003\020\004J\004\010\004\020\005J\004\010" +
      "\007\020\010\"\207\002\n\014PutTaskDefPb\022\014\n\004name\030\001 \001(\t\022/\n\rou" +
      "tput_schema\030\003 \001(\0132\030.lh_proto.OutputSchem" +
      "aPb\0229\n\ninput_vars\030\004 \003(\0132%.lh_proto.PutTa" +
      "skDefPb.InputVarsEntry\022\r\n\003rpc\030\005 \001(\010H\000\022\017\n" +
      "\005kafka\030\006 \001(\010H\000\032I\n\016InputVarsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022&\n\005value\030\002 \001(\0132\027.lh_proto.Variable" +
      "DefPb:\0028\001B\014\n\nqueue_typeJ\004\010\002\020\003\"%\n\025PutExte" +
      "rnalEventDefPb\022\014\n\004name\030\001 \001(\t\"\210\002\n\022PutExte" +
      "rnalEventPb\022\021\n\twf_run_id\030\001 \001(\t\022\037\n\027extern" +
      "al_event_def_name\030\002 \001(\t\022\021\n\004guid\030\003 \001(\tH\000\210" +
      "\001\001\022*\n\007content\030\005 \001(\0132\031.lh_proto.VariableV" +
      "aluePb\022\036\n\021thread_run_number\030\006 \001(\005H\001\210\001\001\022\036" +
      "\n\021node_run_position\030\007 \001(\005H\002\210\001\001B\007\n\005_guidB" +
      "\024\n\022_thread_run_numberB\024\n\022_node_run_posit" +
      "ionJ\004\010\004\020\005J\004\010\010\020\t\"\353\001\n\007RunWfPb\022\024\n\014wf_spec_n" +
      "ame\030\001 \001(\t\022\034\n\017wf_spec_version\030\002 \001(\005H\000\210\001\001\022" +
      "3\n\tvariables\030\003 \003(\0132 .lh_proto.RunWfPb.Va" +
      "riablesEntry\022\017\n\002id\030\004 \001(\tH\001\210\001\001\032K\n\016Variabl" +
      "esEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 \001(\0132\031.lh" +
      "_proto.VariableValuePb:\0028\001B\022\n\020_wf_spec_v" +
      "ersionB\005\n\003_id\";\n\013StopWfRunPb\022\021\n\twf_run_i" +
      "d\030\001 \001(\t\022\031\n\021thread_run_number\030\002 \001(\005\"=\n\rRe" +
      "sumeWfRunPb\022\021\n\twf_run_id\030\001 \001(\t\022\031\n\021thread" +
      "_run_number\030\002 \001(\005\"]\n\022SleepNodeMaturedPb\022" +
      "\021\n\twf_run_id\030\001 \001(\t\022\031\n\021thread_run_number\030" +
      "\002 \001(\005\022\031\n\021node_run_position\030\003 \001(\005\"\370\004\n\tCom" +
      "mandPb\022(\n\004time\030\001 \001(\0132\032.google.protobuf.T" +
      "imestamp\022\027\n\ncommand_id\030\002 \001(\tH\001\210\001\001\0228\n\021tas" +
      "k_result_event\030\003 \001(\0132\033.lh_proto.TaskResu" +
      "ltEventPbH\000\0226\n\020task_claim_event\030\004 \001(\0132\032." +
      "lh_proto.TaskClaimEventPbH\000\022,\n\013put_wf_sp" +
      "ec\030\006 \001(\0132\025.lh_proto.PutWfSpecPbH\000\022.\n\014put" +
      "_task_def\030\007 \001(\0132\026.lh_proto.PutTaskDefPbH" +
      "\000\022A\n\026put_external_event_def\030\010 \001(\0132\037.lh_p" +
      "roto.PutExternalEventDefPbH\000\022#\n\006run_wf\030\t" +
      " \001(\0132\021.lh_proto.RunWfPbH\000\022:\n\022put_externa" +
      "l_event\030\n \001(\0132\034.lh_proto.PutExternalEven" +
      "tPbH\000\022,\n\013stop_wf_run\030\013 \001(\0132\025.lh_proto.St" +
      "opWfRunPbH\000\0220\n\rresume_wf_run\030\014 \001(\0132\027.lh_" +
      "proto.ResumeWfRunPbH\000\022:\n\022sleep_node_matu" +
      "red\030\r \001(\0132\034.lh_proto.SleepNodeMaturedPbH" +
      "\000B\t\n\007commandB\r\n\013_command_idB(\n\033io.little" +
      "horse.common.protoP\001Z\007.;modelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.littlehorse.common.proto.Status.getDescriptor(),
          io.littlehorse.common.proto.Variable.getDescriptor(),
          io.littlehorse.common.proto.WfSpec.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_lh_proto_TaskScheduleRequestPb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_TaskScheduleRequestPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskScheduleRequestPb_descriptor,
        new java.lang.String[] { "TaskDefId", "TaskDefName", "ThreadRunNumber", "TaskRunNumber", "TaskRunPosition", "WfRunId", "WfRunEventQueue", "WfSpecId", "AttemptNumber", "NodeName", "Variables", "CreatedAt", });
    internal_static_lh_proto_TaskScheduleRequestPb_VariablesEntry_descriptor =
      internal_static_lh_proto_TaskScheduleRequestPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_TaskScheduleRequestPb_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskScheduleRequestPb_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lh_proto_WfRunRequestPb_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lh_proto_WfRunRequestPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunRequestPb_descriptor,
        new java.lang.String[] { "WfRunId", "WfSpecId", "Variables", "WfRunId", });
    internal_static_lh_proto_WfRunRequestPb_VariablesEntry_descriptor =
      internal_static_lh_proto_WfRunRequestPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_WfRunRequestPb_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunRequestPb_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lh_proto_TaskClaimEventPb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lh_proto_TaskClaimEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskClaimEventPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", "TaskRunNumber", "TaskRunPosition", "Time", });
    internal_static_lh_proto_TaskResultEventPb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lh_proto_TaskResultEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskResultEventPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", "TaskRunPosition", "Time", "ResultCode", "Output", "LogOutput", "FromRpc", "Output", "LogOutput", });
    internal_static_lh_proto_PutWfSpecPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lh_proto_PutWfSpecPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutWfSpecPb_descriptor,
        new java.lang.String[] { "Name", "ThreadSpecs", "EntrypointThreadName", });
    internal_static_lh_proto_PutWfSpecPb_ThreadSpecsEntry_descriptor =
      internal_static_lh_proto_PutWfSpecPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_PutWfSpecPb_ThreadSpecsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutWfSpecPb_ThreadSpecsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lh_proto_PutTaskDefPb_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_lh_proto_PutTaskDefPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutTaskDefPb_descriptor,
        new java.lang.String[] { "Name", "OutputSchema", "InputVars", "Rpc", "Kafka", "QueueType", });
    internal_static_lh_proto_PutTaskDefPb_InputVarsEntry_descriptor =
      internal_static_lh_proto_PutTaskDefPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_PutTaskDefPb_InputVarsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutTaskDefPb_InputVarsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lh_proto_PutExternalEventDefPb_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_lh_proto_PutExternalEventDefPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutExternalEventDefPb_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_lh_proto_PutExternalEventPb_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_lh_proto_PutExternalEventPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_PutExternalEventPb_descriptor,
        new java.lang.String[] { "WfRunId", "ExternalEventDefName", "Guid", "Content", "ThreadRunNumber", "NodeRunPosition", "Guid", "ThreadRunNumber", "NodeRunPosition", });
    internal_static_lh_proto_RunWfPb_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_lh_proto_RunWfPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_RunWfPb_descriptor,
        new java.lang.String[] { "WfSpecName", "WfSpecVersion", "Variables", "Id", "WfSpecVersion", "Id", });
    internal_static_lh_proto_RunWfPb_VariablesEntry_descriptor =
      internal_static_lh_proto_RunWfPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_RunWfPb_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_RunWfPb_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lh_proto_StopWfRunPb_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_lh_proto_StopWfRunPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_StopWfRunPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", });
    internal_static_lh_proto_ResumeWfRunPb_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_lh_proto_ResumeWfRunPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_ResumeWfRunPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", });
    internal_static_lh_proto_SleepNodeMaturedPb_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_lh_proto_SleepNodeMaturedPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_SleepNodeMaturedPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", "NodeRunPosition", });
    internal_static_lh_proto_CommandPb_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_lh_proto_CommandPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_CommandPb_descriptor,
        new java.lang.String[] { "Time", "CommandId", "TaskResultEvent", "TaskClaimEvent", "PutWfSpec", "PutTaskDef", "PutExternalEventDef", "RunWf", "PutExternalEvent", "StopWfRun", "ResumeWfRun", "SleepNodeMatured", "Command", "CommandId", });
    io.littlehorse.common.proto.Status.getDescriptor();
    io.littlehorse.common.proto.Variable.getDescriptor();
    io.littlehorse.common.proto.WfSpec.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
