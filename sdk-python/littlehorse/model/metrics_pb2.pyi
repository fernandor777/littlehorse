from google.protobuf import timestamp_pb2 as _timestamp_pb2
import littlehorse.model.object_id_pb2 as _object_id_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

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
    __slots__ = ["id", "tenant_id"]
    ID_FIELD_NUMBER: _ClassVar[int]
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    tenant_id: _object_id_pb2.TenantId
    def __init__(self, id: _Optional[str] = ..., tenant_id: _Optional[_Union[_object_id_pb2.TenantId, _Mapping]] = ...) -> None: ...

class EnableMetricRequest(_message.Message):
    __slots__ = ["id", "window_length_ms"]
    ID_FIELD_NUMBER: _ClassVar[int]
    WINDOW_LENGTH_MS_FIELD_NUMBER: _ClassVar[int]
    id: MonitorConfigId
    window_length_ms: int
    def __init__(self, id: _Optional[_Union[MonitorConfigId, _Mapping]] = ..., window_length_ms: _Optional[int] = ...) -> None: ...

class LHPartitionMonitor(_message.Message):
    __slots__ = ["tenant_partitions"]
    TENANT_PARTITIONS_FIELD_NUMBER: _ClassVar[int]
    tenant_partitions: _containers.RepeatedCompositeFieldContainer[LHTenantPartitionMonitor]
    def __init__(self, tenant_partitions: _Optional[_Iterable[_Union[LHTenantPartitionMonitor, _Mapping]]] = ...) -> None: ...

class LHTenantPartitionMonitor(_message.Message):
    __slots__ = ["id", "metrics"]
    ID_FIELD_NUMBER: _ClassVar[int]
    METRICS_FIELD_NUMBER: _ClassVar[int]
    id: _object_id_pb2.TenantId
    metrics: _containers.RepeatedCompositeFieldContainer[UsageMetric]
    def __init__(self, id: _Optional[_Union[_object_id_pb2.TenantId, _Mapping]] = ..., metrics: _Optional[_Iterable[_Union[UsageMetric, _Mapping]]] = ...) -> None: ...

class UsageMetric(_message.Message):
    __slots__ = ["metric_id", "value", "window_start", "window_end"]
    METRIC_ID_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    WINDOW_START_FIELD_NUMBER: _ClassVar[int]
    WINDOW_END_FIELD_NUMBER: _ClassVar[int]
    metric_id: MonitorConfigId
    value: int
    window_start: _timestamp_pb2.Timestamp
    window_end: _timestamp_pb2.Timestamp
    def __init__(self, metric_id: _Optional[_Union[MonitorConfigId, _Mapping]] = ..., value: _Optional[int] = ..., window_start: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., window_end: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...
