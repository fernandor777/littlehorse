// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.4
// source: external_event.proto

package model

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ExternalEvent struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	WfRunId              string                 `protobuf:"bytes,1,opt,name=wf_run_id,json=wfRunId,proto3" json:"wf_run_id,omitempty"`
	ExternalEventDefName string                 `protobuf:"bytes,2,opt,name=external_event_def_name,json=externalEventDefName,proto3" json:"external_event_def_name,omitempty"`
	Guid                 string                 `protobuf:"bytes,3,opt,name=guid,proto3" json:"guid,omitempty"`
	CreatedAt            *timestamppb.Timestamp `protobuf:"bytes,4,opt,name=created_at,json=createdAt,proto3" json:"created_at,omitempty"`
	Content              *VariableValue         `protobuf:"bytes,5,opt,name=content,proto3" json:"content,omitempty"`
	ThreadRunNumber      *int32                 `protobuf:"varint,6,opt,name=thread_run_number,json=threadRunNumber,proto3,oneof" json:"thread_run_number,omitempty"`
	NodeRunPosition      *int32                 `protobuf:"varint,7,opt,name=node_run_position,json=nodeRunPosition,proto3,oneof" json:"node_run_position,omitempty"`
	Claimed              bool                   `protobuf:"varint,8,opt,name=claimed,proto3" json:"claimed,omitempty"`
}

func (x *ExternalEvent) Reset() {
	*x = ExternalEvent{}
	if protoimpl.UnsafeEnabled {
		mi := &file_external_event_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExternalEvent) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExternalEvent) ProtoMessage() {}

func (x *ExternalEvent) ProtoReflect() protoreflect.Message {
	mi := &file_external_event_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ExternalEvent.ProtoReflect.Descriptor instead.
func (*ExternalEvent) Descriptor() ([]byte, []int) {
	return file_external_event_proto_rawDescGZIP(), []int{0}
}

func (x *ExternalEvent) GetWfRunId() string {
	if x != nil {
		return x.WfRunId
	}
	return ""
}

func (x *ExternalEvent) GetExternalEventDefName() string {
	if x != nil {
		return x.ExternalEventDefName
	}
	return ""
}

func (x *ExternalEvent) GetGuid() string {
	if x != nil {
		return x.Guid
	}
	return ""
}

func (x *ExternalEvent) GetCreatedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.CreatedAt
	}
	return nil
}

func (x *ExternalEvent) GetContent() *VariableValue {
	if x != nil {
		return x.Content
	}
	return nil
}

func (x *ExternalEvent) GetThreadRunNumber() int32 {
	if x != nil && x.ThreadRunNumber != nil {
		return *x.ThreadRunNumber
	}
	return 0
}

func (x *ExternalEvent) GetNodeRunPosition() int32 {
	if x != nil && x.NodeRunPosition != nil {
		return *x.NodeRunPosition
	}
	return 0
}

func (x *ExternalEvent) GetClaimed() bool {
	if x != nil {
		return x.Claimed
	}
	return false
}

// ExternalEventDef
type ExternalEventDef struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name           string                 `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	CreatedAt      *timestamppb.Timestamp `protobuf:"bytes,2,opt,name=created_at,json=createdAt,proto3" json:"created_at,omitempty"`
	RetentionHours int32                  `protobuf:"varint,3,opt,name=retention_hours,json=retentionHours,proto3" json:"retention_hours,omitempty"`
}

func (x *ExternalEventDef) Reset() {
	*x = ExternalEventDef{}
	if protoimpl.UnsafeEnabled {
		mi := &file_external_event_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExternalEventDef) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExternalEventDef) ProtoMessage() {}

func (x *ExternalEventDef) ProtoReflect() protoreflect.Message {
	mi := &file_external_event_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ExternalEventDef.ProtoReflect.Descriptor instead.
func (*ExternalEventDef) Descriptor() ([]byte, []int) {
	return file_external_event_proto_rawDescGZIP(), []int{1}
}

func (x *ExternalEventDef) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ExternalEventDef) GetCreatedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.CreatedAt
	}
	return nil
}

func (x *ExternalEventDef) GetRetentionHours() int32 {
	if x != nil {
		return x.RetentionHours
	}
	return 0
}

var File_external_event_proto protoreflect.FileDescriptor

var file_external_event_proto_rawDesc = []byte{
	0x0a, 0x14, 0x65, 0x78, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f,
	0x72, 0x73, 0x65, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x76, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8f, 0x03, 0x0a, 0x0d, 0x45, 0x78, 0x74, 0x65, 0x72, 0x6e, 0x61,
	0x6c, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x1a, 0x0a, 0x09, 0x77, 0x66, 0x5f, 0x72, 0x75, 0x6e,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x77, 0x66, 0x52, 0x75, 0x6e,
	0x49, 0x64, 0x12, 0x35, 0x0a, 0x17, 0x65, 0x78, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x5f, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x64, 0x65, 0x66, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x14, 0x65, 0x78, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x44, 0x65, 0x66, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x67, 0x75, 0x69,
	0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x67, 0x75, 0x69, 0x64, 0x12, 0x39, 0x0a,
	0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x61, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x09, 0x63,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x41, 0x74, 0x12, 0x34, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74,
	0x65, 0x6e, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x6c, 0x69, 0x74, 0x74,
	0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x56, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65,
	0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x2f,
	0x0a, 0x11, 0x74, 0x68, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x6e, 0x75, 0x6d,
	0x62, 0x65, 0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05, 0x48, 0x00, 0x52, 0x0f, 0x74, 0x68, 0x72,
	0x65, 0x61, 0x64, 0x52, 0x75, 0x6e, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x88, 0x01, 0x01, 0x12,
	0x2f, 0x0a, 0x11, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x70, 0x6f, 0x73, 0x69,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x07, 0x20, 0x01, 0x28, 0x05, 0x48, 0x01, 0x52, 0x0f, 0x6e, 0x6f,
	0x64, 0x65, 0x52, 0x75, 0x6e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x88, 0x01, 0x01,
	0x12, 0x18, 0x0a, 0x07, 0x63, 0x6c, 0x61, 0x69, 0x6d, 0x65, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x07, 0x63, 0x6c, 0x61, 0x69, 0x6d, 0x65, 0x64, 0x42, 0x14, 0x0a, 0x12, 0x5f, 0x74,
	0x68, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72,
	0x42, 0x14, 0x0a, 0x12, 0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x70, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x8a, 0x01, 0x0a, 0x10, 0x45, 0x78, 0x74, 0x65, 0x72,
	0x6e, 0x61, 0x6c, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x66, 0x12, 0x12, 0x0a, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0x39, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x61, 0x74, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52,
	0x09, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x41, 0x74, 0x12, 0x27, 0x0a, 0x0f, 0x72, 0x65,
	0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x68, 0x6f, 0x75, 0x72, 0x73, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x0e, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x48, 0x6f,
	0x75, 0x72, 0x73, 0x42, 0x2c, 0x0a, 0x1f, 0x69, 0x6f, 0x2e, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65,
	0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x07, 0x2e, 0x3b, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_external_event_proto_rawDescOnce sync.Once
	file_external_event_proto_rawDescData = file_external_event_proto_rawDesc
)

func file_external_event_proto_rawDescGZIP() []byte {
	file_external_event_proto_rawDescOnce.Do(func() {
		file_external_event_proto_rawDescData = protoimpl.X.CompressGZIP(file_external_event_proto_rawDescData)
	})
	return file_external_event_proto_rawDescData
}

var file_external_event_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_external_event_proto_goTypes = []interface{}{
	(*ExternalEvent)(nil),         // 0: littlehorse.ExternalEvent
	(*ExternalEventDef)(nil),      // 1: littlehorse.ExternalEventDef
	(*timestamppb.Timestamp)(nil), // 2: google.protobuf.Timestamp
	(*VariableValue)(nil),         // 3: littlehorse.VariableValue
}
var file_external_event_proto_depIdxs = []int32{
	2, // 0: littlehorse.ExternalEvent.created_at:type_name -> google.protobuf.Timestamp
	3, // 1: littlehorse.ExternalEvent.content:type_name -> littlehorse.VariableValue
	2, // 2: littlehorse.ExternalEventDef.created_at:type_name -> google.protobuf.Timestamp
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_external_event_proto_init() }
func file_external_event_proto_init() {
	if File_external_event_proto != nil {
		return
	}
	file_variable_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_external_event_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ExternalEvent); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_external_event_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ExternalEventDef); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_external_event_proto_msgTypes[0].OneofWrappers = []interface{}{}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_external_event_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_external_event_proto_goTypes,
		DependencyIndexes: file_external_event_proto_depIdxs,
		MessageInfos:      file_external_event_proto_msgTypes,
	}.Build()
	File_external_event_proto = out.File
	file_external_event_proto_rawDesc = nil
	file_external_event_proto_goTypes = nil
	file_external_event_proto_depIdxs = nil
}