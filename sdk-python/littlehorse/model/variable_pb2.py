# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: variable.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
import littlehorse.model.object_id_pb2 as object__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0evariable.proto\x12\x0blittlehorse\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x0fobject_id.proto\"\x97\x01\n\rVariableValue\x12\x12\n\x08json_obj\x18\x02 \x01(\tH\x00\x12\x12\n\x08json_arr\x18\x03 \x01(\tH\x00\x12\x10\n\x06\x64ouble\x18\x04 \x01(\x01H\x00\x12\x0e\n\x04\x62ool\x18\x05 \x01(\x08H\x00\x12\r\n\x03str\x18\x06 \x01(\tH\x00\x12\r\n\x03int\x18\x07 \x01(\x03H\x00\x12\x0f\n\x05\x62ytes\x18\x08 \x01(\x0cH\x00\x42\x07\n\x05valueJ\x04\x08\x01\x10\x02\"\xb5\x01\n\x08Variable\x12#\n\x02id\x18\x01 \x01(\x0b\x32\x17.littlehorse.VariableId\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.littlehorse.VariableValue\x12.\n\ncreated_at\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12)\n\nwf_spec_id\x18\x04 \x01(\x0b\x32\x15.littlehorse.WfSpecIdBG\n\x1fio.littlehorse.sdk.common.protoP\x01Z\x07.;model\xaa\x02\x18LittleHorse.Common.Protob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'variable_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.littlehorse.sdk.common.protoP\001Z\007.;model\252\002\030LittleHorse.Common.Proto'
  _globals['_VARIABLEVALUE']._serialized_start=82
  _globals['_VARIABLEVALUE']._serialized_end=233
  _globals['_VARIABLE']._serialized_start=236
  _globals['_VARIABLE']._serialized_end=417
# @@protoc_insertion_point(module_scope)