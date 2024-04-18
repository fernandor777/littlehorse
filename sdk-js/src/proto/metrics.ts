/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";
import { Timestamp } from "./google/protobuf/timestamp";

export const protobufPackage = "littlehorse";

export interface MonitorConfig {
  id: MonitorConfigId | undefined;
  windowLengthMs: number;
  createdTime: string | undefined;
}

export interface MonitorConfigId {
  id: string;
}

export interface EnableMetricRequest {
  id: MonitorConfigId | undefined;
  windowLengthMs: number;
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
  return { id: "" };
}

export const MonitorConfigId = {
  encode(message: MonitorConfigId, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
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
