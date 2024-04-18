/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";
import { VariableType, variableTypeFromJSON, variableTypeToNumber } from "./common_enums";
import { TaskDefId } from "./object_id";
import { VariableValue } from "./variable";

export const protobufPackage = "littlehorse";

/** Enumerates the available operations to mutate a variable in a WfRun. */
export enum VariableMutationType {
  /** ASSIGN - Set the variable specified by the LHS to the value of the RHS. */
  ASSIGN = "ASSIGN",
  /** ADD - Add the RHS to the LHS. */
  ADD = "ADD",
  /** EXTEND - Append the RHS to the LHS (valid if the LHS is a STR or JSON_ARR) */
  EXTEND = "EXTEND",
  /** SUBTRACT - Subtract the RHS from the LHS (both must be INT or DOUBLE) */
  SUBTRACT = "SUBTRACT",
  /** MULTIPLY - Multiply the LHS by the RHS (both must be INT or DOUBLE) */
  MULTIPLY = "MULTIPLY",
  /** DIVIDE - Divide the LHS by the RHS (both must be INT or DOUBLE) */
  DIVIDE = "DIVIDE",
  /** REMOVE_IF_PRESENT - Remove any occurrences of RHS from LHS (LHS must be JSON_ARR) */
  REMOVE_IF_PRESENT = "REMOVE_IF_PRESENT",
  /** REMOVE_INDEX - Remove item at index RHS from LHS (LHS must be JSON_ARR) */
  REMOVE_INDEX = "REMOVE_INDEX",
  /** REMOVE_KEY - Remove the key specified by RHS from the LHS (LHS must be JSON_OBJ) */
  REMOVE_KEY = "REMOVE_KEY",
  UNRECOGNIZED = "UNRECOGNIZED",
}

export function variableMutationTypeFromJSON(object: any): VariableMutationType {
  switch (object) {
    case 0:
    case "ASSIGN":
      return VariableMutationType.ASSIGN;
    case 1:
    case "ADD":
      return VariableMutationType.ADD;
    case 2:
    case "EXTEND":
      return VariableMutationType.EXTEND;
    case 3:
    case "SUBTRACT":
      return VariableMutationType.SUBTRACT;
    case 4:
    case "MULTIPLY":
      return VariableMutationType.MULTIPLY;
    case 5:
    case "DIVIDE":
      return VariableMutationType.DIVIDE;
    case 6:
    case "REMOVE_IF_PRESENT":
      return VariableMutationType.REMOVE_IF_PRESENT;
    case 7:
    case "REMOVE_INDEX":
      return VariableMutationType.REMOVE_INDEX;
    case 8:
    case "REMOVE_KEY":
      return VariableMutationType.REMOVE_KEY;
    case -1:
    case "UNRECOGNIZED":
    default:
      return VariableMutationType.UNRECOGNIZED;
  }
}

export function variableMutationTypeToNumber(object: VariableMutationType): number {
  switch (object) {
    case VariableMutationType.ASSIGN:
      return 0;
    case VariableMutationType.ADD:
      return 1;
    case VariableMutationType.EXTEND:
      return 2;
    case VariableMutationType.SUBTRACT:
      return 3;
    case VariableMutationType.MULTIPLY:
      return 4;
    case VariableMutationType.DIVIDE:
      return 5;
    case VariableMutationType.REMOVE_IF_PRESENT:
      return 6;
    case VariableMutationType.REMOVE_INDEX:
      return 7;
    case VariableMutationType.REMOVE_KEY:
      return 8;
    case VariableMutationType.UNRECOGNIZED:
    default:
      return -1;
  }
}

/** Operator for comparing two values to create a boolean expression. */
export enum Comparator {
  /** LESS_THAN - Equivalent to `<`. Only valid for primitive types (no JSON_OBJ or JSON_ARR). */
  LESS_THAN = "LESS_THAN",
  /** GREATER_THAN - Equivalent to `>`. Only valid for primitive types (no JSON_OBJ or JSON_ARR). */
  GREATER_THAN = "GREATER_THAN",
  /** LESS_THAN_EQ - Equivalent to `<=`. Only valid for primitive types (no JSON_OBJ or JSON_ARR). */
  LESS_THAN_EQ = "LESS_THAN_EQ",
  /** GREATER_THAN_EQ - Equivalent to `>=`. Only valid for primitive types (no JSON_OBJ or JSON_ARR). */
  GREATER_THAN_EQ = "GREATER_THAN_EQ",
  /**
   * EQUALS - This is valid for any variable type, and is similar to .equals() in Java.
   *
   * One note: if the RHS is a different type from the LHS, then LittleHorse will
   * try to cast the RHS to the same type as the LHS. If the cast fails, then the
   * ThreadRun fails with a VAR_SUB_ERROR.
   */
  EQUALS = "EQUALS",
  /** NOT_EQUALS - This is the inverse of `EQUALS` */
  NOT_EQUALS = "NOT_EQUALS",
  /**
   * IN - Only valid if the RHS is a JSON_OBJ or JSON_ARR. Valid for any type on the LHS.
   *
   * For the JSON_OBJ type, this returns true if the LHS is equal to a *KEY* in the
   * RHS. For the JSON_ARR type, it returns true if one of the elements of the RHS
   * is equal to the LHS.
   */
  IN = "IN",
  /** NOT_IN - The inverse of IN. */
  NOT_IN = "NOT_IN",
  UNRECOGNIZED = "UNRECOGNIZED",
}

export function comparatorFromJSON(object: any): Comparator {
  switch (object) {
    case 0:
    case "LESS_THAN":
      return Comparator.LESS_THAN;
    case 1:
    case "GREATER_THAN":
      return Comparator.GREATER_THAN;
    case 2:
    case "LESS_THAN_EQ":
      return Comparator.LESS_THAN_EQ;
    case 3:
    case "GREATER_THAN_EQ":
      return Comparator.GREATER_THAN_EQ;
    case 4:
    case "EQUALS":
      return Comparator.EQUALS;
    case 5:
    case "NOT_EQUALS":
      return Comparator.NOT_EQUALS;
    case 6:
    case "IN":
      return Comparator.IN;
    case 7:
    case "NOT_IN":
      return Comparator.NOT_IN;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Comparator.UNRECOGNIZED;
  }
}

export function comparatorToNumber(object: Comparator): number {
  switch (object) {
    case Comparator.LESS_THAN:
      return 0;
    case Comparator.GREATER_THAN:
      return 1;
    case Comparator.LESS_THAN_EQ:
      return 2;
    case Comparator.GREATER_THAN_EQ:
      return 3;
    case Comparator.EQUALS:
      return 4;
    case Comparator.NOT_EQUALS:
      return 5;
    case Comparator.IN:
      return 6;
    case Comparator.NOT_IN:
      return 7;
    case Comparator.UNRECOGNIZED:
    default:
      return -1;
  }
}

/**
 * A VariableAssignment is used within a WfSpec to determine how a value should be
 * assigned in the context of a specific WfRun. For example, in a TASK node, you
 * use a VariableAssignment for each input parameter to determine how the value
 * is set.
 *
 * Note that the VariableAssignment is normally handled by the SDK; you shouldn't
 * have to worry about this in daily LittleHorse usage.
 */
export interface VariableAssignment {
  /**
   * If you provide a `variable_name` and the specified variable is JSON_OBJ or
   * JSON_ARR type, then you may also provide a json_path which makes the VariableAssignment
   * resolve to the specified field.
   */
  jsonPath?:
    | string
    | undefined;
  /** Assign the value from a variable. */
  variableName?:
    | string
    | undefined;
  /** Assign a literal value */
  literalValue?:
    | VariableValue
    | undefined;
  /** Assign a format string */
  formatString?: VariableAssignment_FormatString | undefined;
}

/** A FormatString formats a template String with values from the WfRun. */
export interface VariableAssignment_FormatString {
  /**
   * A VariableAssignment which must resolve to a String that has format args.
   * A valid string is "This is a format string with three args: {0}, {1}, {2}"
   */
  format:
    | VariableAssignment
    | undefined;
  /** VariableAssignments which fill out the args. */
  args: VariableAssignment[];
}

/**
 * A VariableMutation defines a modification made to one of a ThreadRun's variables.
 * The LHS determines the variable that is modified; the operation determines how
 * it is modified, and the RHS is the input to the operation.
 *
 * Day-to-day users of LittleHorse generally don't interact with this structure unless
 * they are writing their own WfSpec SDK.
 */
export interface VariableMutation {
  /** The name of the variable to mutate */
  lhsName: string;
  /**
   * For JSON_ARR and JSON_OBJ variables, this allows you to optionally mutate
   * a specific sub-field of the variable.
   */
  lhsJsonPath?:
    | string
    | undefined;
  /** Defines the operation that we are executing. */
  operation: VariableMutationType;
  /**
   * Set the source_variable as the RHS to use another variable from the workflow to
   * as the RHS/
   */
  sourceVariable?:
    | VariableAssignment
    | undefined;
  /** Use a literal value as the RHS. */
  literalValue?:
    | VariableValue
    | undefined;
  /** Use the output of the current node as the RHS. */
  nodeOutput?: VariableMutation_NodeOutputSource | undefined;
}

/** Specifies to use the output of a NodeRun as the RHS. */
export interface VariableMutation_NodeOutputSource {
  /** Use this specific field from a JSON output */
  jsonpath?: string | undefined;
}

/** Declares a Variable. */
export interface VariableDef {
  /** The Type of the variable. */
  type: VariableType;
  /** The name of the variable. */
  name: string;
  /**
   * Optional default value if the variable isn't set; for example, in a ThreadRun
   * if you start a ThreadRun or WfRun without passing a variable in, then this is
   * used.
   */
  defaultValue?: VariableValue | undefined;
}

/**
 * A UTActionTrigger triggers an action upon certain lifecycle hooks
 * in a User Task. Actions include:
 * - re-assign the User Task Run
 * - cancel the User Task Run
 * - execute a Reminder Task
 *
 * Hooks include:
 * - Upon creation of the UserTaskRun
 * - Upon rescheduling the UserTaskRun
 */
export interface UTActionTrigger {
  task?: UTActionTrigger_UTATask | undefined;
  cancel?:
    | UTActionTrigger_UTACancel
    | undefined;
  /** later on, might enable scheduling entire ThreadRuns */
  reassign?:
    | UTActionTrigger_UTAReassign
    | undefined;
  /**
   * The Action is triggered some time after the Hook matures. The delay is controlled
   * by this field.
   */
  delaySeconds:
    | VariableAssignment
    | undefined;
  /** The hook on which this UserTaskAction is scheduled. */
  hook: UTActionTrigger_UTHook;
}

/** Enumerates the different lifecycle hooks that can cause the timer to start running. */
export enum UTActionTrigger_UTHook {
  /**
   * ON_ARRIVAL - The hook should be scheduled `delay_seconds` after the UserTaskRun is created. This
   * hook only causes the action to be scheduled once.
   */
  ON_ARRIVAL = "ON_ARRIVAL",
  /**
   * ON_TASK_ASSIGNED - The hook should be scheduled `delay_seconds` after the ownership of the UserTaskRun
   * changes. This hook causes the Action to be scheduled one or more times. The first
   * time is scheduled when the UserTaskRun is created, since we treat the change from
   * "UserTaskRun is nonexistent" to "UserTaskRun is owned by a userId or userGroup" as
   * a change in ownership.
   */
  ON_TASK_ASSIGNED = "ON_TASK_ASSIGNED",
  UNRECOGNIZED = "UNRECOGNIZED",
}

export function uTActionTrigger_UTHookFromJSON(object: any): UTActionTrigger_UTHook {
  switch (object) {
    case 0:
    case "ON_ARRIVAL":
      return UTActionTrigger_UTHook.ON_ARRIVAL;
    case 1:
    case "ON_TASK_ASSIGNED":
      return UTActionTrigger_UTHook.ON_TASK_ASSIGNED;
    case -1:
    case "UNRECOGNIZED":
    default:
      return UTActionTrigger_UTHook.UNRECOGNIZED;
  }
}

export function uTActionTrigger_UTHookToNumber(object: UTActionTrigger_UTHook): number {
  switch (object) {
    case UTActionTrigger_UTHook.ON_ARRIVAL:
      return 0;
    case UTActionTrigger_UTHook.ON_TASK_ASSIGNED:
      return 1;
    case UTActionTrigger_UTHook.UNRECOGNIZED:
    default:
      return -1;
  }
}

/** A UserTaskAction that causes a UserTaskRun to be CANCELLED when it fires. */
export interface UTActionTrigger_UTACancel {
}

/** A UserTaskAction that causes a TaskRun to be scheduled when it fires. */
export interface UTActionTrigger_UTATask {
  /** The specification of the Task to schedule. */
  task:
    | TaskNode
    | undefined;
  /** EXPERIMENTAL: Any variables in the ThreadRun which we should mutate. */
  mutations: VariableMutation[];
}

/** A UserTaskAction that causes a UserTaskRun to be reassigned when it fires. */
export interface UTActionTrigger_UTAReassign {
  /**
   * A variable assignment that resolves to a STR representing the new user_id. If
   * not set, the user_id of the UserTaskRun will be un-set.
   */
  userId?:
    | VariableAssignment
    | undefined;
  /**
   * A variable assignment that resolves to a STR representing the new user_group. If
   * not set, the user_group of the UserTaskRun will be un-set.
   */
  userGroup?: VariableAssignment | undefined;
}

/**
 * Defines an Exponential backoff policy for TaskRun retries. The delay for a retry
 * attempt `N` is defined as:
 *
 * min(base_interval_ms * (multiplier ^(N-1)), max_delay_ms)
 *
 * Note that timers in LittleHorse have a resolution of about 500-1000 milliseconds,
 * so timing is not exact.
 */
export interface ExponentialBackoffRetryPolicy {
  /**
   * Base delay in ms for the first retry. Note that in LittleHorse, timers have a
   * resolution of 500-1000 milliseconds. Must be greater than zero.
   */
  baseIntervalMs: number;
  /** Maximum delay in milliseconds between retries. */
  maxDelayMs: number;
  /**
   * The multiplier to use in calculating the retry backoff policy. We recommend
   * starting with 2.0. Must be at least 1.0.
   */
  multiplier: number;
}

/** Defines a TaskRun execution. Used in a Node and also in the UserTask Trigger Actions. */
export interface TaskNode {
  taskDefId?: TaskDefId | undefined;
  dynamicTask?:
    | VariableAssignment
    | undefined;
  /**
   * How long until LittleHorse determines that the Task Worker had a technical ERROR if
   * the worker does not yet reply to the Server. This is determined on a per-Attempt
   * basis.
   */
  timeoutSeconds: number;
  /**
   * Configures the amount of retries allowed on this TaskNode.
   *
   * Retryable errors include:
   * - TASK_TIMEOUT: the TaskRun was started but the scheduler didn't hear back from the
   *   Task Worker in time.
   * - TASK_FAILED: the Task Worker reported an unexpected *technical* ERROR when executing
   *   the Task Function.
   *
   * Other result codes are not retryable (including TASK_OUTPUT_SERIALIZING_ERROR,
   * TASK_INPUT_VAR_SUB_ERROR, and TASK_EXCEPTION).
   */
  retries: number;
  /** If this field is set, then retries will use Exponential Backoff. */
  exponentialBackoff?:
    | ExponentialBackoffRetryPolicy
    | undefined;
  /** Input variables into the TaskDef. */
  variables: VariableAssignment[];
}

function createBaseVariableAssignment(): VariableAssignment {
  return { jsonPath: undefined, variableName: undefined, literalValue: undefined, formatString: undefined };
}

export const VariableAssignment = {
  encode(message: VariableAssignment, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.jsonPath !== undefined) {
      writer.uint32(10).string(message.jsonPath);
    }
    if (message.variableName !== undefined) {
      writer.uint32(18).string(message.variableName);
    }
    if (message.literalValue !== undefined) {
      VariableValue.encode(message.literalValue, writer.uint32(26).fork()).ldelim();
    }
    if (message.formatString !== undefined) {
      VariableAssignment_FormatString.encode(message.formatString, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableAssignment {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableAssignment();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.jsonPath = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.variableName = reader.string();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.literalValue = VariableValue.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.formatString = VariableAssignment_FormatString.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VariableAssignment>): VariableAssignment {
    return VariableAssignment.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VariableAssignment>): VariableAssignment {
    const message = createBaseVariableAssignment();
    message.jsonPath = object.jsonPath ?? undefined;
    message.variableName = object.variableName ?? undefined;
    message.literalValue = (object.literalValue !== undefined && object.literalValue !== null)
      ? VariableValue.fromPartial(object.literalValue)
      : undefined;
    message.formatString = (object.formatString !== undefined && object.formatString !== null)
      ? VariableAssignment_FormatString.fromPartial(object.formatString)
      : undefined;
    return message;
  },
};

function createBaseVariableAssignment_FormatString(): VariableAssignment_FormatString {
  return { format: undefined, args: [] };
}

export const VariableAssignment_FormatString = {
  encode(message: VariableAssignment_FormatString, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.format !== undefined) {
      VariableAssignment.encode(message.format, writer.uint32(10).fork()).ldelim();
    }
    for (const v of message.args) {
      VariableAssignment.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableAssignment_FormatString {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableAssignment_FormatString();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.format = VariableAssignment.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.args.push(VariableAssignment.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VariableAssignment_FormatString>): VariableAssignment_FormatString {
    return VariableAssignment_FormatString.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VariableAssignment_FormatString>): VariableAssignment_FormatString {
    const message = createBaseVariableAssignment_FormatString();
    message.format = (object.format !== undefined && object.format !== null)
      ? VariableAssignment.fromPartial(object.format)
      : undefined;
    message.args = object.args?.map((e) => VariableAssignment.fromPartial(e)) || [];
    return message;
  },
};

function createBaseVariableMutation(): VariableMutation {
  return {
    lhsName: "",
    lhsJsonPath: undefined,
    operation: VariableMutationType.ASSIGN,
    sourceVariable: undefined,
    literalValue: undefined,
    nodeOutput: undefined,
  };
}

export const VariableMutation = {
  encode(message: VariableMutation, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.lhsName !== "") {
      writer.uint32(10).string(message.lhsName);
    }
    if (message.lhsJsonPath !== undefined) {
      writer.uint32(18).string(message.lhsJsonPath);
    }
    if (message.operation !== VariableMutationType.ASSIGN) {
      writer.uint32(24).int32(variableMutationTypeToNumber(message.operation));
    }
    if (message.sourceVariable !== undefined) {
      VariableAssignment.encode(message.sourceVariable, writer.uint32(34).fork()).ldelim();
    }
    if (message.literalValue !== undefined) {
      VariableValue.encode(message.literalValue, writer.uint32(42).fork()).ldelim();
    }
    if (message.nodeOutput !== undefined) {
      VariableMutation_NodeOutputSource.encode(message.nodeOutput, writer.uint32(50).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableMutation {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableMutation();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.lhsName = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.lhsJsonPath = reader.string();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.operation = variableMutationTypeFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.sourceVariable = VariableAssignment.decode(reader, reader.uint32());
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.literalValue = VariableValue.decode(reader, reader.uint32());
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.nodeOutput = VariableMutation_NodeOutputSource.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VariableMutation>): VariableMutation {
    return VariableMutation.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VariableMutation>): VariableMutation {
    const message = createBaseVariableMutation();
    message.lhsName = object.lhsName ?? "";
    message.lhsJsonPath = object.lhsJsonPath ?? undefined;
    message.operation = object.operation ?? VariableMutationType.ASSIGN;
    message.sourceVariable = (object.sourceVariable !== undefined && object.sourceVariable !== null)
      ? VariableAssignment.fromPartial(object.sourceVariable)
      : undefined;
    message.literalValue = (object.literalValue !== undefined && object.literalValue !== null)
      ? VariableValue.fromPartial(object.literalValue)
      : undefined;
    message.nodeOutput = (object.nodeOutput !== undefined && object.nodeOutput !== null)
      ? VariableMutation_NodeOutputSource.fromPartial(object.nodeOutput)
      : undefined;
    return message;
  },
};

function createBaseVariableMutation_NodeOutputSource(): VariableMutation_NodeOutputSource {
  return { jsonpath: undefined };
}

export const VariableMutation_NodeOutputSource = {
  encode(message: VariableMutation_NodeOutputSource, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.jsonpath !== undefined) {
      writer.uint32(82).string(message.jsonpath);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableMutation_NodeOutputSource {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableMutation_NodeOutputSource();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 10:
          if (tag !== 82) {
            break;
          }

          message.jsonpath = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VariableMutation_NodeOutputSource>): VariableMutation_NodeOutputSource {
    return VariableMutation_NodeOutputSource.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VariableMutation_NodeOutputSource>): VariableMutation_NodeOutputSource {
    const message = createBaseVariableMutation_NodeOutputSource();
    message.jsonpath = object.jsonpath ?? undefined;
    return message;
  },
};

function createBaseVariableDef(): VariableDef {
  return { type: VariableType.JSON_OBJ, name: "", defaultValue: undefined };
}

export const VariableDef = {
  encode(message: VariableDef, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.type !== VariableType.JSON_OBJ) {
      writer.uint32(8).int32(variableTypeToNumber(message.type));
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    if (message.defaultValue !== undefined) {
      VariableValue.encode(message.defaultValue, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableDef {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableDef();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 8) {
            break;
          }

          message.type = variableTypeFromJSON(reader.int32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.name = reader.string();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.defaultValue = VariableValue.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<VariableDef>): VariableDef {
    return VariableDef.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<VariableDef>): VariableDef {
    const message = createBaseVariableDef();
    message.type = object.type ?? VariableType.JSON_OBJ;
    message.name = object.name ?? "";
    message.defaultValue = (object.defaultValue !== undefined && object.defaultValue !== null)
      ? VariableValue.fromPartial(object.defaultValue)
      : undefined;
    return message;
  },
};

function createBaseUTActionTrigger(): UTActionTrigger {
  return {
    task: undefined,
    cancel: undefined,
    reassign: undefined,
    delaySeconds: undefined,
    hook: UTActionTrigger_UTHook.ON_ARRIVAL,
  };
}

export const UTActionTrigger = {
  encode(message: UTActionTrigger, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.task !== undefined) {
      UTActionTrigger_UTATask.encode(message.task, writer.uint32(10).fork()).ldelim();
    }
    if (message.cancel !== undefined) {
      UTActionTrigger_UTACancel.encode(message.cancel, writer.uint32(18).fork()).ldelim();
    }
    if (message.reassign !== undefined) {
      UTActionTrigger_UTAReassign.encode(message.reassign, writer.uint32(26).fork()).ldelim();
    }
    if (message.delaySeconds !== undefined) {
      VariableAssignment.encode(message.delaySeconds, writer.uint32(42).fork()).ldelim();
    }
    if (message.hook !== UTActionTrigger_UTHook.ON_ARRIVAL) {
      writer.uint32(48).int32(uTActionTrigger_UTHookToNumber(message.hook));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UTActionTrigger {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUTActionTrigger();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.task = UTActionTrigger_UTATask.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.cancel = UTActionTrigger_UTACancel.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.reassign = UTActionTrigger_UTAReassign.decode(reader, reader.uint32());
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.delaySeconds = VariableAssignment.decode(reader, reader.uint32());
          continue;
        case 6:
          if (tag !== 48) {
            break;
          }

          message.hook = uTActionTrigger_UTHookFromJSON(reader.int32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<UTActionTrigger>): UTActionTrigger {
    return UTActionTrigger.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<UTActionTrigger>): UTActionTrigger {
    const message = createBaseUTActionTrigger();
    message.task = (object.task !== undefined && object.task !== null)
      ? UTActionTrigger_UTATask.fromPartial(object.task)
      : undefined;
    message.cancel = (object.cancel !== undefined && object.cancel !== null)
      ? UTActionTrigger_UTACancel.fromPartial(object.cancel)
      : undefined;
    message.reassign = (object.reassign !== undefined && object.reassign !== null)
      ? UTActionTrigger_UTAReassign.fromPartial(object.reassign)
      : undefined;
    message.delaySeconds = (object.delaySeconds !== undefined && object.delaySeconds !== null)
      ? VariableAssignment.fromPartial(object.delaySeconds)
      : undefined;
    message.hook = object.hook ?? UTActionTrigger_UTHook.ON_ARRIVAL;
    return message;
  },
};

function createBaseUTActionTrigger_UTACancel(): UTActionTrigger_UTACancel {
  return {};
}

export const UTActionTrigger_UTACancel = {
  encode(_: UTActionTrigger_UTACancel, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UTActionTrigger_UTACancel {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUTActionTrigger_UTACancel();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<UTActionTrigger_UTACancel>): UTActionTrigger_UTACancel {
    return UTActionTrigger_UTACancel.fromPartial(base ?? {});
  },
  fromPartial(_: DeepPartial<UTActionTrigger_UTACancel>): UTActionTrigger_UTACancel {
    const message = createBaseUTActionTrigger_UTACancel();
    return message;
  },
};

function createBaseUTActionTrigger_UTATask(): UTActionTrigger_UTATask {
  return { task: undefined, mutations: [] };
}

export const UTActionTrigger_UTATask = {
  encode(message: UTActionTrigger_UTATask, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.task !== undefined) {
      TaskNode.encode(message.task, writer.uint32(10).fork()).ldelim();
    }
    for (const v of message.mutations) {
      VariableMutation.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UTActionTrigger_UTATask {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUTActionTrigger_UTATask();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.task = TaskNode.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.mutations.push(VariableMutation.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<UTActionTrigger_UTATask>): UTActionTrigger_UTATask {
    return UTActionTrigger_UTATask.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<UTActionTrigger_UTATask>): UTActionTrigger_UTATask {
    const message = createBaseUTActionTrigger_UTATask();
    message.task = (object.task !== undefined && object.task !== null) ? TaskNode.fromPartial(object.task) : undefined;
    message.mutations = object.mutations?.map((e) => VariableMutation.fromPartial(e)) || [];
    return message;
  },
};

function createBaseUTActionTrigger_UTAReassign(): UTActionTrigger_UTAReassign {
  return { userId: undefined, userGroup: undefined };
}

export const UTActionTrigger_UTAReassign = {
  encode(message: UTActionTrigger_UTAReassign, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.userId !== undefined) {
      VariableAssignment.encode(message.userId, writer.uint32(10).fork()).ldelim();
    }
    if (message.userGroup !== undefined) {
      VariableAssignment.encode(message.userGroup, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UTActionTrigger_UTAReassign {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUTActionTrigger_UTAReassign();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.userId = VariableAssignment.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.userGroup = VariableAssignment.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<UTActionTrigger_UTAReassign>): UTActionTrigger_UTAReassign {
    return UTActionTrigger_UTAReassign.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<UTActionTrigger_UTAReassign>): UTActionTrigger_UTAReassign {
    const message = createBaseUTActionTrigger_UTAReassign();
    message.userId = (object.userId !== undefined && object.userId !== null)
      ? VariableAssignment.fromPartial(object.userId)
      : undefined;
    message.userGroup = (object.userGroup !== undefined && object.userGroup !== null)
      ? VariableAssignment.fromPartial(object.userGroup)
      : undefined;
    return message;
  },
};

function createBaseExponentialBackoffRetryPolicy(): ExponentialBackoffRetryPolicy {
  return { baseIntervalMs: 0, maxDelayMs: 0, multiplier: 0 };
}

export const ExponentialBackoffRetryPolicy = {
  encode(message: ExponentialBackoffRetryPolicy, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.baseIntervalMs !== 0) {
      writer.uint32(8).int32(message.baseIntervalMs);
    }
    if (message.maxDelayMs !== 0) {
      writer.uint32(16).int64(message.maxDelayMs);
    }
    if (message.multiplier !== 0) {
      writer.uint32(29).float(message.multiplier);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ExponentialBackoffRetryPolicy {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseExponentialBackoffRetryPolicy();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 8) {
            break;
          }

          message.baseIntervalMs = reader.int32();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.maxDelayMs = longToNumber(reader.int64() as Long);
          continue;
        case 3:
          if (tag !== 29) {
            break;
          }

          message.multiplier = reader.float();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<ExponentialBackoffRetryPolicy>): ExponentialBackoffRetryPolicy {
    return ExponentialBackoffRetryPolicy.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<ExponentialBackoffRetryPolicy>): ExponentialBackoffRetryPolicy {
    const message = createBaseExponentialBackoffRetryPolicy();
    message.baseIntervalMs = object.baseIntervalMs ?? 0;
    message.maxDelayMs = object.maxDelayMs ?? 0;
    message.multiplier = object.multiplier ?? 0;
    return message;
  },
};

function createBaseTaskNode(): TaskNode {
  return {
    taskDefId: undefined,
    dynamicTask: undefined,
    timeoutSeconds: 0,
    retries: 0,
    exponentialBackoff: undefined,
    variables: [],
  };
}

export const TaskNode = {
  encode(message: TaskNode, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(10).fork()).ldelim();
    }
    if (message.dynamicTask !== undefined) {
      VariableAssignment.encode(message.dynamicTask, writer.uint32(50).fork()).ldelim();
    }
    if (message.timeoutSeconds !== 0) {
      writer.uint32(16).int32(message.timeoutSeconds);
    }
    if (message.retries !== 0) {
      writer.uint32(24).int32(message.retries);
    }
    if (message.exponentialBackoff !== undefined) {
      ExponentialBackoffRetryPolicy.encode(message.exponentialBackoff, writer.uint32(42).fork()).ldelim();
    }
    for (const v of message.variables) {
      VariableAssignment.encode(v!, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskNode {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskNode();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.dynamicTask = VariableAssignment.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.timeoutSeconds = reader.int32();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.retries = reader.int32();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.exponentialBackoff = ExponentialBackoffRetryPolicy.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.variables.push(VariableAssignment.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<TaskNode>): TaskNode {
    return TaskNode.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<TaskNode>): TaskNode {
    const message = createBaseTaskNode();
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.dynamicTask = (object.dynamicTask !== undefined && object.dynamicTask !== null)
      ? VariableAssignment.fromPartial(object.dynamicTask)
      : undefined;
    message.timeoutSeconds = object.timeoutSeconds ?? 0;
    message.retries = object.retries ?? 0;
    message.exponentialBackoff = (object.exponentialBackoff !== undefined && object.exponentialBackoff !== null)
      ? ExponentialBackoffRetryPolicy.fromPartial(object.exponentialBackoff)
      : undefined;
    message.variables = object.variables?.map((e) => VariableAssignment.fromPartial(e)) || [];
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;

export type DeepPartial<T> = T extends Builtin ? T
  : T extends globalThis.Array<infer U> ? globalThis.Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U> ? ReadonlyArray<DeepPartial<U>>
  : T extends {} ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function longToNumber(long: Long): number {
  if (long.gt(globalThis.Number.MAX_SAFE_INTEGER)) {
    throw new globalThis.Error("Value is larger than Number.MAX_SAFE_INTEGER");
  }
  return long.toNumber();
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}