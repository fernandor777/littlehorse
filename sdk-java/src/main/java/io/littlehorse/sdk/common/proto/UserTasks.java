// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_tasks.proto

package io.littlehorse.sdk.common.proto;

public final class UserTasks {
  private UserTasks() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskRun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_AssignUserTaskRunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_AssignUserTaskRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskFieldResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskFieldResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_SaveUserTaskRun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_SaveUserTaskRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_CompleteUserTaskRunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_CompleteUserTaskRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_CancelUserTaskRunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_CancelUserTaskRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskTriggerContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskTriggerContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskTriggerReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskTriggerReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskEvent_UTECancelled_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskEvent_UTECancelled_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskEvent_UTETaskExecuted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskEvent_UTETaskExecuted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_UserTaskEvent_UTEReassigned_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_UserTaskEvent_UTEReassigned_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020user_tasks.proto\022\013littlehorse\032\037google/" +
      "protobuf/timestamp.proto\032\022common_enums.p" +
      "roto\032\017object_id.proto\032\016variable.proto\"\262\001" +
      "\n\013UserTaskDef\022\014\n\004name\030\001 \001(\t\022\017\n\007version\030\002" +
      " \001(\005\022\030\n\013description\030\003 \001(\tH\000\210\001\001\022*\n\006fields" +
      "\030\004 \003(\0132\032.littlehorse.UserTaskField\022.\n\ncr" +
      "eated_at\030\005 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\016\n\014_description\"\230\001\n\rUserTaskField\022\014\n\004" +
      "name\030\001 \001(\t\022\'\n\004type\030\002 \001(\0162\031.littlehorse.V" +
      "ariableType\022\030\n\013description\030\003 \001(\tH\000\210\001\001\022\024\n" +
      "\014display_name\030\004 \001(\t\022\020\n\010required\030\005 \001(\010B\016\n" +
      "\014_description\"\323\003\n\013UserTaskRun\022&\n\002id\030\001 \001(" +
      "\0132\032.littlehorse.UserTaskRunId\0224\n\020user_ta" +
      "sk_def_id\030\002 \001(\0132\032.littlehorse.UserTaskDe" +
      "fId\0221\n\007results\030\006 \003(\0132 .littlehorse.UserT" +
      "askFieldResult\022.\n\006status\030\007 \001(\0162\036.littleh" +
      "orse.UserTaskRunStatus\022*\n\006events\030\010 \003(\0132\032" +
      ".littlehorse.UserTaskEvent\022\022\n\005notes\030\t \001(" +
      "\tH\001\210\001\001\0222\n\016scheduled_time\030\n \001(\0132\032.google." +
      "protobuf.Timestamp\022+\n\013node_run_id\030\013 \001(\0132" +
      "\026.littlehorse.NodeRunId\022,\n\nuser_group\030\014 " +
      "\001(\0132\026.littlehorse.UserGroupH\000\022!\n\004user\030\r " +
      "\001(\0132\021.littlehorse.UserH\000B\007\n\005ownerB\010\n\006_no" +
      "tes\"\305\001\n\030AssignUserTaskRunRequest\0224\n\020user" +
      "_task_run_id\030\001 \001(\0132\032.littlehorse.UserTas" +
      "kRunId\022\026\n\016override_claim\030\002 \001(\010\022!\n\004user\030\003" +
      " \001(\0132\021.littlehorse.UserH\000\022,\n\nuser_group\030" +
      "\004 \001(\0132\026.littlehorse.UserGroupH\000B\n\n\010assig" +
      "nee\"]\n\023UserTaskFieldResult\022\014\n\004name\030\001 \001(\t" +
      "\022.\n\005value\030\002 \001(\0132\032.littlehorse.VariableVa" +
      "lueH\000\210\001\001B\010\n\006_value\"B\n\016UserTaskResult\0220\n\006" +
      "fields\030\001 \003(\0132 .littlehorse.UserTaskField" +
      "Result\"\202\001\n\017SaveUserTaskRun\022+\n\006result\030\001 \001" +
      "(\0132\033.littlehorse.UserTaskResult\022\017\n\007user_" +
      "id\030\002 \001(\t\0221\n\007results\030\003 \003(\0132 .littlehorse." +
      "UserTaskFieldResult\"\220\001\n\032CompleteUserTask" +
      "RunRequest\0224\n\020user_task_run_id\030\001 \001(\0132\032.l" +
      "ittlehorse.UserTaskRunId\022+\n\006result\030\002 \001(\013" +
      "2\033.littlehorse.UserTaskResult\022\017\n\007user_id" +
      "\030\003 \001(\t\"P\n\030CancelUserTaskRunRequest\0224\n\020us" +
      "er_task_run_id\030\001 \001(\0132\032.littlehorse.UserT" +
      "askRunId\"r\n\026UserTaskTriggerContext\022,\n\nus" +
      "er_group\030\001 \001(\0132\026.littlehorse.UserGroupH\000" +
      "\022!\n\004user\030\002 \001(\0132\021.littlehorse.UserH\000B\007\n\005o" +
      "wner\"\331\001\n\030UserTaskTriggerReference\022+\n\013nod" +
      "e_run_id\030\001 \001(\0132\026.littlehorse.NodeRunId\022\036" +
      "\n\026user_task_event_number\030\002 \001(\005\022)\n\nwf_spe" +
      "c_id\030\003 \001(\0132\025.littlehorse.WfSpecId\0229\n\007con" +
      "text\030\004 \001(\0132#.littlehorse.UserTaskTrigger" +
      "ContextH\000\210\001\001B\n\n\010_context\"\027\n\tUserGroup\022\n\n" +
      "\002id\030\001 \001(\t\"R\n\004User\022\n\n\002id\030\001 \001(\t\022/\n\nuser_gr" +
      "oup\030\002 \001(\0132\026.littlehorse.UserGroupH\000\210\001\001B\r" +
      "\n\013_user_group\"\260\004\n\rUserTaskEvent\022(\n\004time\030" +
      "\001 \001(\0132\032.google.protobuf.Timestamp\022C\n\rtas" +
      "k_executed\030\002 \001(\0132*.littlehorse.UserTaskE" +
      "vent.UTETaskExecutedH\000\022>\n\nreassigned\030\003 \001" +
      "(\0132(.littlehorse.UserTaskEvent.UTEReassi" +
      "gnedH\000\022<\n\tcancelled\030\004 \001(\0132\'.littlehorse." +
      "UserTaskEvent.UTECancelledH\000\032\016\n\014UTECance" +
      "lled\032;\n\017UTETaskExecuted\022(\n\010task_run\030\001 \001(" +
      "\0132\026.littlehorse.TaskRunId\032\333\001\n\rUTEReassig" +
      "ned\022%\n\010old_user\030\005 \001(\0132\021.littlehorse.User" +
      "H\000\0220\n\016old_user_group\030\006 \001(\0132\026.littlehorse" +
      ".UserGroupH\000\022%\n\010new_user\030\007 \001(\0132\021.littleh" +
      "orse.UserH\001\0220\n\016new_user_group\030\010 \001(\0132\026.li" +
      "ttlehorse.UserGroupH\001B\013\n\told_ownerB\013\n\tne" +
      "w_ownerB\007\n\005event*J\n\021UserTaskRunStatus\022\016\n" +
      "\nUNASSIGNED\020\000\022\014\n\010ASSIGNED\020\001\022\010\n\004DONE\020\003\022\r\n" +
      "\tCANCELLED\020\004B,\n\037io.littlehorse.sdk.commo" +
      "n.protoP\001Z\007.;modelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          io.littlehorse.sdk.common.proto.CommonEnums.getDescriptor(),
          io.littlehorse.sdk.common.proto.ObjectId.getDescriptor(),
          io.littlehorse.sdk.common.proto.VariableOuterClass.getDescriptor(),
        });
    internal_static_littlehorse_UserTaskDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_littlehorse_UserTaskDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskDef_descriptor,
        new java.lang.String[] { "Name", "Version", "Description", "Fields", "CreatedAt", "Description", });
    internal_static_littlehorse_UserTaskField_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_littlehorse_UserTaskField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskField_descriptor,
        new java.lang.String[] { "Name", "Type", "Description", "DisplayName", "Required", "Description", });
    internal_static_littlehorse_UserTaskRun_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_littlehorse_UserTaskRun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskRun_descriptor,
        new java.lang.String[] { "Id", "UserTaskDefId", "Results", "Status", "Events", "Notes", "ScheduledTime", "NodeRunId", "UserGroup", "User", "Owner", "Notes", });
    internal_static_littlehorse_AssignUserTaskRunRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_littlehorse_AssignUserTaskRunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_AssignUserTaskRunRequest_descriptor,
        new java.lang.String[] { "UserTaskRunId", "OverrideClaim", "User", "UserGroup", "Assignee", });
    internal_static_littlehorse_UserTaskFieldResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_littlehorse_UserTaskFieldResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskFieldResult_descriptor,
        new java.lang.String[] { "Name", "Value", "Value", });
    internal_static_littlehorse_UserTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_littlehorse_UserTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskResult_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_littlehorse_SaveUserTaskRun_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_littlehorse_SaveUserTaskRun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_SaveUserTaskRun_descriptor,
        new java.lang.String[] { "Result", "UserId", "Results", });
    internal_static_littlehorse_CompleteUserTaskRunRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_littlehorse_CompleteUserTaskRunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_CompleteUserTaskRunRequest_descriptor,
        new java.lang.String[] { "UserTaskRunId", "Result", "UserId", });
    internal_static_littlehorse_CancelUserTaskRunRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_littlehorse_CancelUserTaskRunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_CancelUserTaskRunRequest_descriptor,
        new java.lang.String[] { "UserTaskRunId", });
    internal_static_littlehorse_UserTaskTriggerContext_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_littlehorse_UserTaskTriggerContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskTriggerContext_descriptor,
        new java.lang.String[] { "UserGroup", "User", "Owner", });
    internal_static_littlehorse_UserTaskTriggerReference_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_littlehorse_UserTaskTriggerReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskTriggerReference_descriptor,
        new java.lang.String[] { "NodeRunId", "UserTaskEventNumber", "WfSpecId", "Context", "Context", });
    internal_static_littlehorse_UserGroup_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_littlehorse_UserGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserGroup_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_littlehorse_User_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_littlehorse_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_User_descriptor,
        new java.lang.String[] { "Id", "UserGroup", "UserGroup", });
    internal_static_littlehorse_UserTaskEvent_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_littlehorse_UserTaskEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskEvent_descriptor,
        new java.lang.String[] { "Time", "TaskExecuted", "Reassigned", "Cancelled", "Event", });
    internal_static_littlehorse_UserTaskEvent_UTECancelled_descriptor =
      internal_static_littlehorse_UserTaskEvent_descriptor.getNestedTypes().get(0);
    internal_static_littlehorse_UserTaskEvent_UTECancelled_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskEvent_UTECancelled_descriptor,
        new java.lang.String[] { });
    internal_static_littlehorse_UserTaskEvent_UTETaskExecuted_descriptor =
      internal_static_littlehorse_UserTaskEvent_descriptor.getNestedTypes().get(1);
    internal_static_littlehorse_UserTaskEvent_UTETaskExecuted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskEvent_UTETaskExecuted_descriptor,
        new java.lang.String[] { "TaskRun", });
    internal_static_littlehorse_UserTaskEvent_UTEReassigned_descriptor =
      internal_static_littlehorse_UserTaskEvent_descriptor.getNestedTypes().get(2);
    internal_static_littlehorse_UserTaskEvent_UTEReassigned_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_UserTaskEvent_UTEReassigned_descriptor,
        new java.lang.String[] { "OldUser", "OldUserGroup", "NewUser", "NewUserGroup", "OldOwner", "NewOwner", });
    com.google.protobuf.TimestampProto.getDescriptor();
    io.littlehorse.sdk.common.proto.CommonEnums.getDescriptor();
    io.littlehorse.sdk.common.proto.ObjectId.getDescriptor();
    io.littlehorse.sdk.common.proto.VariableOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}