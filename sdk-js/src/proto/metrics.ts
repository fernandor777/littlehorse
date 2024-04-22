/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";
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
  tenantPartitions: LHTenantPartitionMonitor[];
}

export interface LHTenantPartitionMonitor {
  id: TenantId | undefined;
  metrics: UsageMetric[];
}

export interface UsageMetric {
  id: string;
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

  create(base?: DeepPartial<MonitorConfig>): MonitorConfig {
    return MonitorConfig.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<MonitorConfig>): MonitorConfig {
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

  create(base?: DeepPartial<MonitorConfigId>): MonitorConfigId {
    return MonitorConfigId.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<MonitorConfigId>): MonitorConfigId {
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

  create(base?: DeepPartial<EnableMetricRequest>): EnableMetricRequest {
    return EnableMetricRequest.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<EnableMetricRequest>): EnableMetricRequest {
    const message = createBaseEnableMetricRequest();
    message.id = (object.id !== undefined && object.id !== null) ? MonitorConfigId.fromPartial(object.id) : undefined;
    message.windowLengthMs = object.windowLengthMs ?? 0;
    return message;
  },
};

function createBaseLHPartitionMonitor(): LHPartitionMonitor {
  return { tenantPartitions: [] };
}

export const LHPartitionMonitor = {
  encode(message: LHPartitionMonitor, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.tenantPartitions) {
      LHTenantPartitionMonitor.encode(v!, writer.uint32(10).fork()).ldelim();
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

  create(base?: DeepPartial<LHPartitionMonitor>): LHPartitionMonitor {
    return LHPartitionMonitor.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<LHPartitionMonitor>): LHPartitionMonitor {
    const message = createBaseLHPartitionMonitor();
    message.tenantPartitions = object.tenantPartitions?.map((e) => LHTenantPartitionMonitor.fromPartial(e)) || [];
    return message;
  },
};

function createBaseLHTenantPartitionMonitor(): LHTenantPartitionMonitor {
  return { id: undefined, metrics: [] };
}

export const LHTenantPartitionMonitor = {
  encode(message: LHTenantPartitionMonitor, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      TenantId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    for (const v of message.metrics) {
      UsageMetric.encode(v!, writer.uint32(26).fork()).ldelim();
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

          message.id = TenantId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.metrics.push(UsageMetric.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  create(base?: DeepPartial<LHTenantPartitionMonitor>): LHTenantPartitionMonitor {
    return LHTenantPartitionMonitor.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<LHTenantPartitionMonitor>): LHTenantPartitionMonitor {
    const message = createBaseLHTenantPartitionMonitor();
    message.id = (object.id !== undefined && object.id !== null) ? TenantId.fromPartial(object.id) : undefined;
    message.metrics = object.metrics?.map((e) => UsageMetric.fromPartial(e)) || [];
    return message;
  },
};

function createBaseUsageMetric(): UsageMetric {
  return { id: "", value: 0, windowStart: undefined, windowEnd: undefined };
}

export const UsageMetric = {
  encode(message: UsageMetric, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
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

          message.id = reader.string();
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

  create(base?: DeepPartial<UsageMetric>): UsageMetric {
    return UsageMetric.fromPartial(base ?? {});
  },
  fromPartial(object: DeepPartial<UsageMetric>): UsageMetric {
    const message = createBaseUsageMetric();
    message.id = object.id ?? "";
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
