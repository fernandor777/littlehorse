from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class MonitorConfig(_message.Message):
    __slots__ = ["id", "window_length_ms", "created_time"]
    ID_FIELD_NUMBER: _ClassVar[int]
    WINDOW_LENGTH_MS_FIELD_NUMBER: _ClassVar[int]
    CREATED_TIME_FIELD_NUMBER: _ClassVar[int]
    id: MonitorConfigId
    window_length_ms: int
    created_time: _timestamp_pb2.Timestamp
    def __init__(self, id: _Optional[_Union[MonitorConfigId, _Mapping]] = ..., window_length_ms: _Optional[int] = ..., created_time: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...

class MonitorConfigId(_message.Message):
    __slots__ = ["id"]
    ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    def __init__(self, id: _Optional[str] = ...) -> None: ...

class EnableMetricRequest(_message.Message):
    __slots__ = ["id", "window_length_ms"]
    ID_FIELD_NUMBER: _ClassVar[int]
    WINDOW_LENGTH_MS_FIELD_NUMBER: _ClassVar[int]
    id: MonitorConfigId
    window_length_ms: int
    def __init__(self, id: _Optional[_Union[MonitorConfigId, _Mapping]] = ..., window_length_ms: _Optional[int] = ...) -> None: ...
