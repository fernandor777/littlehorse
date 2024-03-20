/* eslint-disable */
import _m0 from "protobufjs/minimal";
import {
  LHErrorType,
  lHErrorTypeFromJSON,
  lHErrorTypeToNumber,
  TaskStatus,
  taskStatusFromJSON,
  taskStatusToNumber,
} from "./common_enums";
import { ExponentialBackoffRetryPolicy } from "./common_wfspec";
import { Timestamp } from "./google/protobuf/timestamp";
import { NodeRunId, TaskDefId, TaskRunId, WfSpecId } from "./object_id";
import { UserTaskTriggerReference } from "./user_tasks";
import { VariableValue } from "./variable";

export const protobufPackage = "littlehorse";

/** A TaskRun resents a single instance of a TaskDef being executed. */
export interface TaskRun {
  /** The ID of the TaskRun. Note that the TaskRunId contains the WfRunId. */
  id:
    | TaskRunId
    | undefined;
  /** The ID of the TaskDef being executed. */
  taskDefId:
    | TaskDefId
    | undefined;
  /**
   * All attempts scheduled for this TaskRun. A TaskAttempt represents an occurrence of
   * the TaskRun being put on a Task Queue to be executed by the Task Workers.
   */
  attempts: TaskAttempt[];
  /**
   * The input variables to pass into this TaskRun. Note that this is a list and not
   * a map, because ordering matters. Depending on the language implementation, not
   * every LittleHorse Task Worker SDK has the ability to determine the names of the
   * variables from the method signature, so we provide both names and ordering.
   */
  inputVariables: VarNameAndVal[];
  /**
   * The source (in the WfRun) that caused this TaskRun to be created. Currently, this
   * can be either a TASK node, or a User Task Action Task Trigger in a USER_TASK node (such
   * as a task used to send reminders).
   */
  source:
    | TaskRunSource
    | undefined;
  /** When the TaskRun was scheduled. */
  scheduledAt:
    | string
    | undefined;
  /** The status of the TaskRun. */
  status: TaskStatus;
  /** The timeout before LH considers a TaskAttempt to be timed out. */
  timeoutSeconds: number;
  /**
   * The maximum number of attempts that may be scheduled for this TaskRun. NOTE: setting
   * total_attempts to 1 means that there are no retries.
   */
  totalAttempts: number;
  /** Optional backoff policy . */
  exponentialBackoff?: ExponentialBackoffRetryPolicy | undefined;
}

/** A key-value pair of variable name and value. */
export interface VarNameAndVal {
  /** The variable name. */
  varName: string;
  /** The value of the variable for this TaskRun. */
  value: VariableValue | undefined;
}

/** A single time that a TaskRun was scheduled for execution on a Task Queue. */
export interface TaskAttempt {
  /**
   * Optional information provided by the Task Worker SDK for debugging. Usually, if set
   * it contains a stacktrace or it contains information logged via `WorkerContext#log()`.
   */
  logOutput?:
    | VariableValue
    | undefined;
  /**
   * The time the TaskAttempt was scheduled on the Task Queue. Not set for a TaskAttempt that is
   * in the TASK_PENDING status; for example, when waiting between retries with exponential
   * backoff.
   */
  scheduleTime?:
    | string
    | undefined;
  /** The time the TaskAttempt was pulled off the queue and sent to a TaskWorker. */
  startTime?:
    | string
    | undefined;
  /**
   * The time the TaskAttempt was finished (either completed, reported as failed, or
   * timed out)
   */
  endTime?:
    | string
    | undefined;
  /** EXPERIMENTAL: the ID of the Task Worker who executed this TaskRun. */
  taskWorkerId: string;
  /** The version of the Task Worker that executed the TaskAttempt. */
  taskWorkerVersion?:
    | string
    | undefined;
  /** The status of this TaskAttempt. */
  status: TaskStatus;
  /** Denotes the Task Function executed properly and returned an output. */
  output?:
    | VariableValue
    | undefined;
  /** An unexpected technical error was encountered. May or may not be retriable. */
  error?:
    | LHTaskError
    | undefined;
  /** The Task Function encountered a business problem and threw a technical exception. */
  exception?: LHTaskException | undefined;
}

/** The source of a TaskRun; i.e. why it was scheduled. */
export interface TaskRunSource {
  /** Reference to a NodeRun of type TASK which scheduled this TaskRun. */
  taskNode?:
    | TaskNodeReference
    | undefined;
  /** Reference to the specific UserTaskRun trigger action which scheduled this TaskRun */
  userTaskTrigger?:
    | UserTaskTriggerReference
    | undefined;
  /**
   * The ID of the WfSpec that is being executed. Always set in ScheduledTask.source so
   * that the WorkerContext can know this information.
   */
  wfSpecId?: WfSpecId | undefined;
}

/** Reference to a NodeRun of type TASK which caused a TaskRun to be scheduled. */
export interface TaskNodeReference {
  /** The ID of the NodeRun which caused this TASK to be scheduled. */
  nodeRunId: NodeRunId | undefined;
}

/** Message denoting a TaskRun failed for technical reasons. */
export interface LHTaskError {
  /** The technical error code. */
  type: LHErrorType;
  /** Human readable message for debugging. */
  message: string;
}

/**
 * Message denoting a TaskRun's execution signaled that something went wrong in the
 * business process, throwing a littlehorse 'EXCEPTION'.
 */
export interface LHTaskException {
  /** The user-defined Failure name, for example, "credit-card-declined" */
  name: string;
  /** Human readadble description of the failure. */
  message: string;
  content: VariableValue | undefined;
}

function createBaseTaskRun(): TaskRun {
  return {
    id: undefined,
    taskDefId: undefined,
    attempts: [],
    inputVariables: [],
    source: undefined,
    scheduledAt: undefined,
    status: TaskStatus.TASK_SCHEDULED,
    timeoutSeconds: 0,
    totalAttempts: 0,
    exponentialBackoff: undefined,
  };
}

export const TaskRun = {
  encode(message: TaskRun, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      TaskRunId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(18).fork()).ldelim();
    }
    for (const v of message.attempts) {
      TaskAttempt.encode(v!, writer.uint32(26).fork()).ldelim();
    }
    for (const v of message.inputVariables) {
      VarNameAndVal.encode(v!, writer.uint32(42).fork()).ldelim();
    }
    if (message.source !== undefined) {
      TaskRunSource.encode(message.source, writer.uint32(50).fork()).ldelim();
    }
    if (message.scheduledAt !== undefined) {
      Timestamp.encode(toTimestamp(message.scheduledAt), writer.uint32(58).fork()).ldelim();
    }
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      writer.uint32(64).int32(taskStatusToNumber(message.status));
    }
    if (message.timeoutSeconds !== 0) {
      writer.uint32(72).int32(message.timeoutSeconds);
    }
    if (message.totalAttempts !== 0) {
      writer.uint32(32).int32(message.totalAttempts);
    }
    if (message.exponentialBackoff !== undefined) {
      ExponentialBackoffRetryPolicy.encode(message.exponentialBackoff, writer.uint32(82).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskRun {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskRun();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = TaskRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.attempts.push(TaskAttempt.decode(reader, reader.uint32()));
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.inputVariables.push(VarNameAndVal.decode(reader, reader.uint32()));
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.source = TaskRunSource.decode(reader, reader.uint32());
          continue;
        case 7:
          if (tag !== 58) {
            break;
          }

          message.scheduledAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 8:
          if (tag !== 64) {
            break;
          }

          message.status = taskStatusFromJSON(reader.int32());
          continue;
        case 9:
          if (tag !== 72) {
            break;
          }

          message.timeoutSeconds = reader.int32();
          continue;
        case 4:
          if (tag !== 32) {
            break;
          }

          message.totalAttempts = reader.int32();
          continue;
        case 10:
          if (tag !== 82) {
            break;
          }

          message.exponentialBackoff = ExponentialBackoffRetryPolicy.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<TaskRun>): TaskRun {
    return TaskRun.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<TaskRun>): TaskRun {
    const message = createBaseTaskRun();
    message.id = (object.id !== undefined && object.id !== null) ? TaskRunId.fromPartial(object.id) : undefined;
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.attempts = object.attempts?.map((e) => TaskAttempt.fromPartial(e)) || [];
    message.inputVariables = object.inputVariables?.map((e) => VarNameAndVal.fromPartial(e)) || [];
    message.source = (object.source !== undefined && object.source !== null)
      ? TaskRunSource.fromPartial(object.source)
      : undefined;
    message.scheduledAt = object.scheduledAt ?? undefined;
    message.status = object.status ?? TaskStatus.TASK_SCHEDULED;
    message.timeoutSeconds = object.timeoutSeconds ?? 0;
    message.totalAttempts = object.totalAttempts ?? 0;
    message.exponentialBackoff = (object.exponentialBackoff !== undefined && object.exponentialBackoff !== null)
      ? ExponentialBackoffRetryPolicy.fromPartial(object.exponentialBackoff)
      : undefined;
    return message;
  },
};

function createBaseVarNameAndVal(): VarNameAndVal {
  return { varName: "", value: undefined };
}

export const VarNameAndVal = {
  encode(message: VarNameAndVal, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.varName !== "") {
      writer.uint32(10).string(message.varName);
    }
    if (message.value !== undefined) {
      VariableValue.encode(message.value, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VarNameAndVal {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVarNameAndVal();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.varName = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.value = VariableValue.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VarNameAndVal>): VarNameAndVal {
    return VarNameAndVal.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VarNameAndVal>): VarNameAndVal {
    const message = createBaseVarNameAndVal();
    message.varName = object.varName ?? "";
    message.value = (object.value !== undefined && object.value !== null)
      ? VariableValue.fromPartial(object.value)
      : undefined;
    return message;
  },
};

function createBaseTaskAttempt(): TaskAttempt {
  return {
    logOutput: undefined,
    scheduleTime: undefined,
    startTime: undefined,
    endTime: undefined,
    taskWorkerId: "",
    taskWorkerVersion: undefined,
    status: TaskStatus.TASK_SCHEDULED,
    output: undefined,
    error: undefined,
    exception: undefined,
  };
}

export const TaskAttempt = {
  encode(message: TaskAttempt, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.logOutput !== undefined) {
      VariableValue.encode(message.logOutput, writer.uint32(18).fork()).ldelim();
    }
    if (message.scheduleTime !== undefined) {
      Timestamp.encode(toTimestamp(message.scheduleTime), writer.uint32(26).fork()).ldelim();
    }
    if (message.startTime !== undefined) {
      Timestamp.encode(toTimestamp(message.startTime), writer.uint32(34).fork()).ldelim();
    }
    if (message.endTime !== undefined) {
      Timestamp.encode(toTimestamp(message.endTime), writer.uint32(42).fork()).ldelim();
    }
    if (message.taskWorkerId !== "") {
      writer.uint32(58).string(message.taskWorkerId);
    }
    if (message.taskWorkerVersion !== undefined) {
      writer.uint32(66).string(message.taskWorkerVersion);
    }
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      writer.uint32(72).int32(taskStatusToNumber(message.status));
    }
    if (message.output !== undefined) {
      VariableValue.encode(message.output, writer.uint32(10).fork()).ldelim();
    }
    if (message.error !== undefined) {
      LHTaskError.encode(message.error, writer.uint32(82).fork()).ldelim();
    }
    if (message.exception !== undefined) {
      LHTaskException.encode(message.exception, writer.uint32(90).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskAttempt {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskAttempt();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          if (tag !== 18) {
            break;
          }

          message.logOutput = VariableValue.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.scheduleTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.startTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.endTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 7:
          if (tag !== 58) {
            break;
          }

          message.taskWorkerId = reader.string();
          continue;
        case 8:
          if (tag !== 66) {
            break;
          }

          message.taskWorkerVersion = reader.string();
          continue;
        case 9:
          if (tag !== 72) {
            break;
          }

          message.status = taskStatusFromJSON(reader.int32());
          continue;
        case 1:
          if (tag !== 10) {
            break;
          }

          message.output = VariableValue.decode(reader, reader.uint32());
          continue;
        case 10:
          if (tag !== 82) {
            break;
          }

          message.error = LHTaskError.decode(reader, reader.uint32());
          continue;
        case 11:
          if (tag !== 90) {
            break;
          }

          message.exception = LHTaskException.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<TaskAttempt>): TaskAttempt {
    return TaskAttempt.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<TaskAttempt>): TaskAttempt {
    const message = createBaseTaskAttempt();
    message.logOutput = (object.logOutput !== undefined && object.logOutput !== null)
      ? VariableValue.fromPartial(object.logOutput)
      : undefined;
    message.scheduleTime = object.scheduleTime ?? undefined;
    message.startTime = object.startTime ?? undefined;
    message.endTime = object.endTime ?? undefined;
    message.taskWorkerId = object.taskWorkerId ?? "";
    message.taskWorkerVersion = object.taskWorkerVersion ?? undefined;
    message.status = object.status ?? TaskStatus.TASK_SCHEDULED;
    message.output = (object.output !== undefined && object.output !== null)
      ? VariableValue.fromPartial(object.output)
      : undefined;
    message.error = (object.error !== undefined && object.error !== null)
      ? LHTaskError.fromPartial(object.error)
      : undefined;
    message.exception = (object.exception !== undefined && object.exception !== null)
      ? LHTaskException.fromPartial(object.exception)
      : undefined;
    return message;
  },
};

function createBaseTaskRunSource(): TaskRunSource {
  return { taskNode: undefined, userTaskTrigger: undefined, wfSpecId: undefined };
}

export const TaskRunSource = {
  encode(message: TaskRunSource, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskNode !== undefined) {
      TaskNodeReference.encode(message.taskNode, writer.uint32(10).fork()).ldelim();
    }
    if (message.userTaskTrigger !== undefined) {
      UserTaskTriggerReference.encode(message.userTaskTrigger, writer.uint32(18).fork()).ldelim();
    }
    if (message.wfSpecId !== undefined) {
      WfSpecId.encode(message.wfSpecId, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskRunSource {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskRunSource();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskNode = TaskNodeReference.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.userTaskTrigger = UserTaskTriggerReference.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.wfSpecId = WfSpecId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<TaskRunSource>): TaskRunSource {
    return TaskRunSource.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<TaskRunSource>): TaskRunSource {
    const message = createBaseTaskRunSource();
    message.taskNode = (object.taskNode !== undefined && object.taskNode !== null)
      ? TaskNodeReference.fromPartial(object.taskNode)
      : undefined;
    message.userTaskTrigger = (object.userTaskTrigger !== undefined && object.userTaskTrigger !== null)
      ? UserTaskTriggerReference.fromPartial(object.userTaskTrigger)
      : undefined;
    message.wfSpecId = (object.wfSpecId !== undefined && object.wfSpecId !== null)
      ? WfSpecId.fromPartial(object.wfSpecId)
      : undefined;
    return message;
  },
};

function createBaseTaskNodeReference(): TaskNodeReference {
  return { nodeRunId: undefined };
}

export const TaskNodeReference = {
  encode(message: TaskNodeReference, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.nodeRunId !== undefined) {
      NodeRunId.encode(message.nodeRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskNodeReference {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskNodeReference();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.nodeRunId = NodeRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<TaskNodeReference>): TaskNodeReference {
    return TaskNodeReference.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<TaskNodeReference>): TaskNodeReference {
    const message = createBaseTaskNodeReference();
    message.nodeRunId = (object.nodeRunId !== undefined && object.nodeRunId !== null)
      ? NodeRunId.fromPartial(object.nodeRunId)
      : undefined;
    return message;
  },
};

function createBaseLHTaskError(): LHTaskError {
  return { type: LHErrorType.CHILD_FAILURE, message: "" };
}

export const LHTaskError = {
  encode(message: LHTaskError, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.type !== LHErrorType.CHILD_FAILURE) {
      writer.uint32(8).int32(lHErrorTypeToNumber(message.type));
    }
    if (message.message !== "") {
      writer.uint32(18).string(message.message);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LHTaskError {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLHTaskError();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 8) {
            break;
          }

          message.type = lHErrorTypeFromJSON(reader.int32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.message = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<LHTaskError>): LHTaskError {
    return LHTaskError.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<LHTaskError>): LHTaskError {
    const message = createBaseLHTaskError();
    message.type = object.type ?? LHErrorType.CHILD_FAILURE;
    message.message = object.message ?? "";
    return message;
  },
};

function createBaseLHTaskException(): LHTaskException {
  return { name: "", message: "", content: undefined };
}

export const LHTaskException = {
  encode(message: LHTaskException, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.message !== "") {
      writer.uint32(18).string(message.message);
    }
    if (message.content !== undefined) {
      VariableValue.encode(message.content, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LHTaskException {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLHTaskException();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.message = reader.string();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.content = VariableValue.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<LHTaskException>): LHTaskException {
    return LHTaskException.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<LHTaskException>): LHTaskException {
    const message = createBaseLHTaskException();
    message.name = object.name ?? "";
    message.message = object.message ?? "";
    message.content = (object.content !== undefined && object.content !== null)
      ? VariableValue.fromPartial(object.content)
      : undefined;
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;

export type DeepPartial<T> = T extends Builtin ? T
  : T extends globalThis.Array<infer U> ? globalThis.Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U> ? ReadonlyArray<DeepPartial<U>>
  : T extends {} ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function toTimestamp(dateStr: string): Timestamp {
  const date = new globalThis.Date(dateStr);
  const seconds = Math.trunc(date.getTime() / 1_000);
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): string {
  let millis = (t.seconds || 0) * 1_000;
  millis += (t.nanos || 0) / 1_000_000;
  return new globalThis.Date(millis).toISOString();
}
