# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: metrics.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
import littlehorse.model.object_id_pb2 as object__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\rmetrics.proto\x12\x0blittlehorse\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x0fobject_id.proto\"\x85\x01\n\rMonitorConfig\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.littlehorse.MonitorConfigId\x12\x18\n\x10window_length_ms\x18\x02 \x01(\x03\x12\x30\n\x0c\x63reated_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x1d\n\x0fMonitorConfigId\x12\n\n\x02id\x18\x01 \x01(\tBG\n\x1fio.littlehorse.sdk.common.protoP\x01Z\x07.;model\xaa\x02\x18LittleHorse.Common.Protob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'metrics_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.littlehorse.sdk.common.protoP\001Z\007.;model\252\002\030LittleHorse.Common.Proto'
  _globals['_MONITORCONFIG']._serialized_start=81
  _globals['_MONITORCONFIG']._serialized_end=214
  _globals['_MONITORCONFIGID']._serialized_start=216
  _globals['_MONITORCONFIGID']._serialized_end=245
# @@protoc_insertion_point(module_scope)
