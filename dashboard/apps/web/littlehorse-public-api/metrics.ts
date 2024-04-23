/* eslint-disable */
import Long from "long";
import * as _m0 from "protobufjs/minimal";
import { Timestamp } from "./google/protobuf/timestamp";
import { TenantId } from "./object_id";

export const protobufPackage = "littlehorse";

export interface MonitorConfig {
  id: MonitorConfigId | undefined;
  windowLengthMs: number;
  createdTime: string | undefined;
}

export interface MonitorConfigId {
  id: string;
  tenantId: TenantId | undefined;
}

export interface EnableMetricRequest {
  id: MonitorConfigId | undefined;
  windowLengthMs: number;
}

export interface LHPartitionMonitor {
  id: string;
  tenantPartitions: LHTenantPartitionMonitor[];
}

export interface LHTenantPartitionMonitor {
  metricId: MonitorConfigId | undefined;
  metrics: UsageMetric | undefined;
}

export interface UsageMetric {
  metricId: MonitorConfigId | undefined;
  value: number;
  windowStart: string | undefined;
  windowEnd: string | undefined;
}

function createBaseMonitorConfig(): MonitorConfig {
  return { id: undefined, windowLengthMs: 0, createdTime: undefined };
}

export const MonitorConfig = {
  encode(message: MonitorConfig, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      MonitorConfigId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    if (message.windowLengthMs !== 0) {
      writer.uint32(16).int64(message.windowLengthMs);
    }
    if (message.createdTime !== undefined) {
      Timestamp.encode(toTimestamp(message.createdTime), writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): MonitorConfig {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseMonitorConfig();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = MonitorConfigId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.windowLengthMs = longToNumber(reader.int64() as Long);
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.createdTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): MonitorConfig {
    return {
      id: isSet(object.id) ? MonitorConfigId.fromJSON(object.id) : undefined,
      windowLengthMs: isSet(object.windowLengthMs) ? globalThis.Number(object.windowLengthMs) : 0,
      createdTime: isSet(object.createdTime) ? globalThis.String(object.createdTime) : undefined,
    };
  },

  toJSON(message: MonitorConfig): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = MonitorConfigId.toJSON(message.id);
    }
    if (message.windowLengthMs !== 0) {
      obj.windowLengthMs = Math.round(message.windowLengthMs);
    }
    if (message.createdTime !== undefined) {
      obj.createdTime = message.createdTime;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<MonitorConfig>, I>>(base?: I): MonitorConfig {
    return MonitorConfig.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<MonitorConfig>, I>>(object: I): MonitorConfig {
    const message = createBaseMonitorConfig();
    message.id = (object.id !== undefined && object.id !== null) ? MonitorConfigId.fromPartial(object.id) : undefined;
    message.windowLengthMs = object.windowLengthMs ?? 0;
    message.createdTime = object.createdTime ?? undefined;
    return message;
  },
};

function createBaseMonitorConfigId(): MonitorConfigId {
  return { id: "", tenantId: undefined };
}

export const MonitorConfigId = {
  encode(message: MonitorConfigId, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    if (message.tenantId !== undefined) {
      TenantId.encode(message.tenantId, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): MonitorConfigId {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseMonitorConfigId();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.tenantId = TenantId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): MonitorConfigId {
    return {
      id: isSet(object.id) ? globalThis.String(object.id) : "",
      tenantId: isSet(object.tenantId) ? TenantId.fromJSON(object.tenantId) : undefined,
    };
  },

  toJSON(message: MonitorConfigId): unknown {
    const obj: any = {};
    if (message.id !== "") {
      obj.id = message.id;
    }
    if (message.tenantId !== undefined) {
      obj.tenantId = TenantId.toJSON(message.tenantId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<MonitorConfigId>, I>>(base?: I): MonitorConfigId {
    return MonitorConfigId.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<MonitorConfigId>, I>>(object: I): MonitorConfigId {
    const message = createBaseMonitorConfigId();
    message.id = object.id ?? "";
    message.tenantId = (object.tenantId !== undefined && object.tenantId !== null)
      ? TenantId.fromPartial(object.tenantId)
      : undefined;
    return message;
  },
};

function createBaseEnableMetricRequest(): EnableMetricRequest {
  return { id: undefined, windowLengthMs: 0 };
}

export const EnableMetricRequest = {
  encode(message: EnableMetricRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      MonitorConfigId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    if (message.windowLengthMs !== 0) {
      writer.uint32(16).int64(message.windowLengthMs);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EnableMetricRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEnableMetricRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = MonitorConfigId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.windowLengthMs = longToNumber(reader.int64() as Long);
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): EnableMetricRequest {
    return {
      id: isSet(object.id) ? MonitorConfigId.fromJSON(object.id) : undefined,
      windowLengthMs: isSet(object.windowLengthMs) ? globalThis.Number(object.windowLengthMs) : 0,
    };
  },

  toJSON(message: EnableMetricRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = MonitorConfigId.toJSON(message.id);
    }
    if (message.windowLengthMs !== 0) {
      obj.windowLengthMs = Math.round(message.windowLengthMs);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<EnableMetricRequest>, I>>(base?: I): EnableMetricRequest {
    return EnableMetricRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<EnableMetricRequest>, I>>(object: I): EnableMetricRequest {
    const message = createBaseEnableMetricRequest();
    message.id = (object.id !== undefined && object.id !== null) ? MonitorConfigId.fromPartial(object.id) : undefined;
    message.windowLengthMs = object.windowLengthMs ?? 0;
    return message;
  },
};

function createBaseLHPartitionMonitor(): LHPartitionMonitor {
  return { id: "", tenantPartitions: [] };
}

export const LHPartitionMonitor = {
  encode(message: LHPartitionMonitor, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    for (const v of message.tenantPartitions) {
      LHTenantPartitionMonitor.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LHPartitionMonitor {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLHPartitionMonitor();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.tenantPartitions.push(LHTenantPartitionMonitor.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): LHPartitionMonitor {
    return {
      id: isSet(object.id) ? globalThis.String(object.id) : "",
      tenantPartitions: globalThis.Array.isArray(object?.tenantPartitions)
        ? object.tenantPartitions.map((e: any) => LHTenantPartitionMonitor.fromJSON(e))
        : [],
    };
  },

  toJSON(message: LHPartitionMonitor): unknown {
    const obj: any = {};
    if (message.id !== "") {
      obj.id = message.id;
    }
    if (message.tenantPartitions?.length) {
      obj.tenantPartitions = message.tenantPartitions.map((e) => LHTenantPartitionMonitor.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<LHPartitionMonitor>, I>>(base?: I): LHPartitionMonitor {
    return LHPartitionMonitor.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<LHPartitionMonitor>, I>>(object: I): LHPartitionMonitor {
    const message = createBaseLHPartitionMonitor();
    message.id = object.id ?? "";
    message.tenantPartitions = object.tenantPartitions?.map((e) => LHTenantPartitionMonitor.fromPartial(e)) || [];
    return message;
  },
};

function createBaseLHTenantPartitionMonitor(): LHTenantPartitionMonitor {
  return { metricId: undefined, metrics: undefined };
}

export const LHTenantPartitionMonitor = {
  encode(message: LHTenantPartitionMonitor, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.metricId !== undefined) {
      MonitorConfigId.encode(message.metricId, writer.uint32(10).fork()).ldelim();
    }
    if (message.metrics !== undefined) {
      UsageMetric.encode(message.metrics, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LHTenantPartitionMonitor {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLHTenantPartitionMonitor();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.metricId = MonitorConfigId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.metrics = UsageMetric.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): LHTenantPartitionMonitor {
    return {
      metricId: isSet(object.metricId) ? MonitorConfigId.fromJSON(object.metricId) : undefined,
      metrics: isSet(object.metrics) ? UsageMetric.fromJSON(object.metrics) : undefined,
    };
  },

  toJSON(message: LHTenantPartitionMonitor): unknown {
    const obj: any = {};
    if (message.metricId !== undefined) {
      obj.metricId = MonitorConfigId.toJSON(message.metricId);
    }
    if (message.metrics !== undefined) {
      obj.metrics = UsageMetric.toJSON(message.metrics);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<LHTenantPartitionMonitor>, I>>(base?: I): LHTenantPartitionMonitor {
    return LHTenantPartitionMonitor.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<LHTenantPartitionMonitor>, I>>(object: I): LHTenantPartitionMonitor {
    const message = createBaseLHTenantPartitionMonitor();
    message.metricId = (object.metricId !== undefined && object.metricId !== null)
      ? MonitorConfigId.fromPartial(object.metricId)
      : undefined;
    message.metrics = (object.metrics !== undefined && object.metrics !== null)
      ? UsageMetric.fromPartial(object.metrics)
      : undefined;
    return message;
  },
};

function createBaseUsageMetric(): UsageMetric {
  return { metricId: undefined, value: 0, windowStart: undefined, windowEnd: undefined };
}

export const UsageMetric = {
  encode(message: UsageMetric, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.metricId !== undefined) {
      MonitorConfigId.encode(message.metricId, writer.uint32(10).fork()).ldelim();
    }
    if (message.value !== 0) {
      writer.uint32(16).int64(message.value);
    }
    if (message.windowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.windowStart), writer.uint32(26).fork()).ldelim();
    }
    if (message.windowEnd !== undefined) {
      Timestamp.encode(toTimestamp(message.windowEnd), writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UsageMetric {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUsageMetric();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.metricId = MonitorConfigId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.value = longToNumber(reader.int64() as Long);
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.windowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.windowEnd = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): UsageMetric {
    return {
      metricId: isSet(object.metricId) ? MonitorConfigId.fromJSON(object.metricId) : undefined,
      value: isSet(object.value) ? globalThis.Number(object.value) : 0,
      windowStart: isSet(object.windowStart) ? globalThis.String(object.windowStart) : undefined,
      windowEnd: isSet(object.windowEnd) ? globalThis.String(object.windowEnd) : undefined,
    };
  },

  toJSON(message: UsageMetric): unknown {
    const obj: any = {};
    if (message.metricId !== undefined) {
      obj.metricId = MonitorConfigId.toJSON(message.metricId);
    }
    if (message.value !== 0) {
      obj.value = Math.round(message.value);
    }
    if (message.windowStart !== undefined) {
      obj.windowStart = message.windowStart;
    }
    if (message.windowEnd !== undefined) {
      obj.windowEnd = message.windowEnd;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<UsageMetric>, I>>(base?: I): UsageMetric {
    return UsageMetric.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<UsageMetric>, I>>(object: I): UsageMetric {
    const message = createBaseUsageMetric();
    message.metricId = (object.metricId !== undefined && object.metricId !== null)
      ? MonitorConfigId.fromPartial(object.metricId)
      : undefined;
    message.value = object.value ?? 0;
    message.windowStart = object.windowStart ?? undefined;
    message.windowEnd = object.windowEnd ?? undefined;
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;

export type DeepPartial<T> = T extends Builtin ? T
  : T extends globalThis.Array<infer U> ? globalThis.Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U> ? ReadonlyArray<DeepPartial<U>>
  : T extends {} ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

type KeysOfUnion<T> = T extends T ? keyof T : never;
export type Exact<P, I extends P> = P extends Builtin ? P
  : P & { [K in keyof P]: Exact<P[K], I[K]> } & { [K in Exclude<keyof I, KeysOfUnion<P>>]: never };

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

function isSet(value: any): boolean {
  return value !== null && value !== undefined;
}
