// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.4
// source: metrics.proto

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

type MonitorConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id             *MonitorConfigId       `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	WindowLengthMs int64                  `protobuf:"varint,2,opt,name=window_length_ms,json=windowLengthMs,proto3" json:"window_length_ms,omitempty"`
	CreatedTime    *timestamppb.Timestamp `protobuf:"bytes,3,opt,name=created_time,json=createdTime,proto3" json:"created_time,omitempty"`
}

func (x *MonitorConfig) Reset() {
	*x = MonitorConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_metrics_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MonitorConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MonitorConfig) ProtoMessage() {}

func (x *MonitorConfig) ProtoReflect() protoreflect.Message {
	mi := &file_metrics_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MonitorConfig.ProtoReflect.Descriptor instead.
func (*MonitorConfig) Descriptor() ([]byte, []int) {
	return file_metrics_proto_rawDescGZIP(), []int{0}
}

func (x *MonitorConfig) GetId() *MonitorConfigId {
	if x != nil {
		return x.Id
	}
	return nil
}

func (x *MonitorConfig) GetWindowLengthMs() int64 {
	if x != nil {
		return x.WindowLengthMs
	}
	return 0
}

func (x *MonitorConfig) GetCreatedTime() *timestamppb.Timestamp {
	if x != nil {
		return x.CreatedTime
	}
	return nil
}

type MonitorConfigId struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *MonitorConfigId) Reset() {
	*x = MonitorConfigId{}
	if protoimpl.UnsafeEnabled {
		mi := &file_metrics_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MonitorConfigId) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MonitorConfigId) ProtoMessage() {}

func (x *MonitorConfigId) ProtoReflect() protoreflect.Message {
	mi := &file_metrics_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MonitorConfigId.ProtoReflect.Descriptor instead.
func (*MonitorConfigId) Descriptor() ([]byte, []int) {
	return file_metrics_proto_rawDescGZIP(), []int{1}
}

func (x *MonitorConfigId) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

var File_metrics_proto protoreflect.FileDescriptor

var file_metrics_proto_rawDesc = []byte{
	0x0a, 0x0d, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0b, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x1a, 0x1f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69,
	0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x6f,
	0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x69, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa6,
	0x01, 0x0a, 0x0d, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x12, 0x2c, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6c,
	0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x4d, 0x6f, 0x6e, 0x69, 0x74,
	0x6f, 0x72, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x49, 0x64, 0x52, 0x02, 0x69, 0x64, 0x12, 0x28,
	0x0a, 0x10, 0x77, 0x69, 0x6e, 0x64, 0x6f, 0x77, 0x5f, 0x6c, 0x65, 0x6e, 0x67, 0x74, 0x68, 0x5f,
	0x6d, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0e, 0x77, 0x69, 0x6e, 0x64, 0x6f, 0x77,
	0x4c, 0x65, 0x6e, 0x67, 0x74, 0x68, 0x4d, 0x73, 0x12, 0x3d, 0x0a, 0x0c, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x64, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x0b, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x64, 0x54, 0x69, 0x6d, 0x65, 0x22, 0x21, 0x0a, 0x0f, 0x4d, 0x6f, 0x6e, 0x69, 0x74,
	0x6f, 0x72, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x49, 0x64, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x42, 0x47, 0x0a, 0x1f, 0x69, 0x6f,
	0x2e, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x73, 0x64, 0x6b,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x07, 0x2e, 0x3b, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0xaa, 0x02, 0x18, 0x4c, 0x69, 0x74, 0x74, 0x6c,
	0x65, 0x48, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_metrics_proto_rawDescOnce sync.Once
	file_metrics_proto_rawDescData = file_metrics_proto_rawDesc
)

func file_metrics_proto_rawDescGZIP() []byte {
	file_metrics_proto_rawDescOnce.Do(func() {
		file_metrics_proto_rawDescData = protoimpl.X.CompressGZIP(file_metrics_proto_rawDescData)
	})
	return file_metrics_proto_rawDescData
}

var file_metrics_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_metrics_proto_goTypes = []interface{}{
	(*MonitorConfig)(nil),         // 0: littlehorse.MonitorConfig
	(*MonitorConfigId)(nil),       // 1: littlehorse.MonitorConfigId
	(*timestamppb.Timestamp)(nil), // 2: google.protobuf.Timestamp
}
var file_metrics_proto_depIdxs = []int32{
	1, // 0: littlehorse.MonitorConfig.id:type_name -> littlehorse.MonitorConfigId
	2, // 1: littlehorse.MonitorConfig.created_time:type_name -> google.protobuf.Timestamp
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_metrics_proto_init() }
func file_metrics_proto_init() {
	if File_metrics_proto != nil {
		return
	}
	file_object_id_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_metrics_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MonitorConfig); i {
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
		file_metrics_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MonitorConfigId); i {
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
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_metrics_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_metrics_proto_goTypes,
		DependencyIndexes: file_metrics_proto_depIdxs,
		MessageInfos:      file_metrics_proto_msgTypes,
	}.Build()
	File_metrics_proto = out.File
	file_metrics_proto_rawDesc = nil
	file_metrics_proto_goTypes = nil
	file_metrics_proto_depIdxs = nil
}
