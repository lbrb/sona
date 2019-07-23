// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

public final class ClientMasterProto {
  private ClientMasterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterWorkerReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterWorkerReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterWorkerResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterWorkerResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterWorkerResp_ConfEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterWorkerResp_ConfEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterTaskReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterTaskReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterTaskResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterTaskResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_RegisterTaskResp_ClockEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_RegisterTaskResp_ClockEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_SetAngelLocationReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_SetAngelLocationReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_GetAngelLocationResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_GetAngelLocationResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_HeartBeatReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_HeartBeatReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_HeartBeatResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_HeartBeatResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_ClockReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_ClockReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_ClockResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_ClockResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_ClockResp_ClockMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_ClockResp_ClockMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_GetClockMapReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_GetClockMapReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_GetClockMapResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_GetClockMapResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_GetClockMapResp_ClockMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_GetClockMapResp_ClockMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMaster_GetGlobalBatchResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMaster_GetGlobalBatchResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023client_master.proto\022\014ClientMaster\032\014com" +
      "mon.proto\"/\n\021RegisterWorkerReq\022\014\n\004host\030\001" +
      " \001(\t\022\014\n\004port\030\002 \001(\005\"\312\001\n\022RegisterWorkerRes" +
      "p\022\016\n\006workId\030\002 \001(\003\022\017\n\007isChief\030\003 \001(\010\022\037\n\nas" +
      "yncModel\030\005 \001(\0162\013.AsyncModel\0228\n\004conf\030\006 \003(" +
      "\0132*.ClientMaster.RegisterWorkerResp.Conf" +
      "Entry\022\013\n\003msg\030\007 \001(\t\032+\n\tConfEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"4\n\017RegisterTaskR" +
      "eq\022\016\n\006workId\030\002 \001(\003\022\021\n\ttimestamp\030\003 \001(\003\"\233\001" +
      "\n\020RegisterTaskResp\022\016\n\006taskId\030\002 \001(\003\022\017\n\007nu" +
      "mTask\030\004 \001(\005\0228\n\005clock\030\003 \003(\0132).ClientMaste" +
      "r.RegisterTaskResp.ClockEntry\032,\n\nClockEn" +
      "try\022\013\n\003key\030\001 \001(\003\022\r\n\005value\030\002 \001(\005:\0028\001\"A\n\023S" +
      "etAngelLocationReq\022\016\n\006workId\030\001 \001(\003\022\014\n\004ho" +
      "st\030\002 \001(\t\022\014\n\004port\030\003 \001(\005\"?\n\024GetAngelLocati" +
      "onResp\022\014\n\004host\030\002 \001(\t\022\014\n\004port\030\003 \001(\005\022\013\n\003ms" +
      "g\030\004 \001(\t\"\036\n\014HeartBeatReq\022\016\n\006workId\030\001 \001(\003\"" +
      "3\n\rHeartBeatResp\022\"\n\003cmd\030\003 \001(\0162\025.ClientMa" +
      "ster.Command\"<\n\010ClockReq\022\016\n\006taskId\030\001 \001(\003" +
      "\022\r\n\005clock\030\002 \001(\005\022\021\n\tbatchSize\030\003 \001(\005\"\205\001\n\tC" +
      "lockResp\022\016\n\006taskId\030\001 \001(\003\0227\n\010clockMap\030\002 \003" +
      "(\0132%.ClientMaster.ClockResp.ClockMapEntr" +
      "y\032/\n\rClockMapEntry\022\013\n\003key\030\001 \001(\003\022\r\n\005value" +
      "\030\002 \001(\005:\0028\001\" \n\016GetClockMapReq\022\016\n\006taskId\030\001" +
      " \001(\003\"\221\001\n\017GetClockMapResp\022\016\n\006taskId\030\001 \001(\003" +
      "\022=\n\010clockMap\030\002 \003(\0132+.ClientMaster.GetClo" +
      "ckMapResp.ClockMapEntry\032/\n\rClockMapEntry" +
      "\022\013\n\003key\030\001 \001(\003\022\r\n\005value\030\002 \001(\005:\0028\001\"\'\n\022GetG" +
      "lobalBatchResp\022\021\n\tbatchSize\030\001 \001(\005*F\n\007Com" +
      "mand\022\r\n\tSTOPANGEL\020\000\022\017\n\013STOPPSAGENT\020\001\022\016\n\n" +
      "STOPWORKER\020\002\022\013\n\007NOTHING\020\0032\210\005\n\021AngelClein" +
      "tMaster\022U\n\016RegisterWorker\022\037.ClientMaster" +
      ".RegisterWorkerReq\032 .ClientMaster.Regist" +
      "erWorkerResp\"\000\022O\n\014RegisterTask\022\035.ClientM" +
      "aster.RegisterTaskReq\032\036.ClientMaster.Reg" +
      "isterTaskResp\"\000\022B\n\020SetAngelLocation\022!.Cl" +
      "ientMaster.SetAngelLocationReq\032\t.VoidRes" +
      "p\"\000\022B\n\020GetAngelLocation\022\010.VoidReq\032\".Clie" +
      "ntMaster.GetAngelLocationResp\"\000\022F\n\tHeart" +
      "Beat\022\032.ClientMaster.HeartBeatReq\032\033.Clien" +
      "tMaster.HeartBeatResp\"\000\022:\n\005Clock\022\026.Clien" +
      "tMaster.ClockReq\032\027.ClientMaster.ClockRes" +
      "p\"\000\022L\n\013GetClockMap\022\034.ClientMaster.GetClo" +
      "ckMapReq\032\035.ClientMaster.GetClockMapResp\"" +
      "\000\022B\n\022GetGlobalBatchSize\022\010.VoidReq\032 .Clie" +
      "ntMaster.GetGlobalBatchResp\"\000\022-\n\014Complet" +
      "eTask\022\020.CompleteTaskReq\032\t.VoidResp\"\000B:\n " +
      "com.tencent.client.master.protosB\021Client" +
      "MasterProtoP\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tencent.client.common.protos.MWComProto.getDescriptor(),
        }, assigner);
    internal_static_ClientMaster_RegisterWorkerReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientMaster_RegisterWorkerReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterWorkerReq_descriptor,
        new java.lang.String[] { "Host", "Port", });
    internal_static_ClientMaster_RegisterWorkerResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ClientMaster_RegisterWorkerResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterWorkerResp_descriptor,
        new java.lang.String[] { "WorkId", "IsChief", "AsyncModel", "Conf", "Msg", });
    internal_static_ClientMaster_RegisterWorkerResp_ConfEntry_descriptor =
      internal_static_ClientMaster_RegisterWorkerResp_descriptor.getNestedTypes().get(0);
    internal_static_ClientMaster_RegisterWorkerResp_ConfEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterWorkerResp_ConfEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ClientMaster_RegisterTaskReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ClientMaster_RegisterTaskReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterTaskReq_descriptor,
        new java.lang.String[] { "WorkId", "Timestamp", });
    internal_static_ClientMaster_RegisterTaskResp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ClientMaster_RegisterTaskResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterTaskResp_descriptor,
        new java.lang.String[] { "TaskId", "NumTask", "Clock", });
    internal_static_ClientMaster_RegisterTaskResp_ClockEntry_descriptor =
      internal_static_ClientMaster_RegisterTaskResp_descriptor.getNestedTypes().get(0);
    internal_static_ClientMaster_RegisterTaskResp_ClockEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_RegisterTaskResp_ClockEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ClientMaster_SetAngelLocationReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ClientMaster_SetAngelLocationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_SetAngelLocationReq_descriptor,
        new java.lang.String[] { "WorkId", "Host", "Port", });
    internal_static_ClientMaster_GetAngelLocationResp_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ClientMaster_GetAngelLocationResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_GetAngelLocationResp_descriptor,
        new java.lang.String[] { "Host", "Port", "Msg", });
    internal_static_ClientMaster_HeartBeatReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ClientMaster_HeartBeatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_HeartBeatReq_descriptor,
        new java.lang.String[] { "WorkId", });
    internal_static_ClientMaster_HeartBeatResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ClientMaster_HeartBeatResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_HeartBeatResp_descriptor,
        new java.lang.String[] { "Cmd", });
    internal_static_ClientMaster_ClockReq_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ClientMaster_ClockReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_ClockReq_descriptor,
        new java.lang.String[] { "TaskId", "Clock", "BatchSize", });
    internal_static_ClientMaster_ClockResp_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ClientMaster_ClockResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_ClockResp_descriptor,
        new java.lang.String[] { "TaskId", "ClockMap", });
    internal_static_ClientMaster_ClockResp_ClockMapEntry_descriptor =
      internal_static_ClientMaster_ClockResp_descriptor.getNestedTypes().get(0);
    internal_static_ClientMaster_ClockResp_ClockMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_ClockResp_ClockMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ClientMaster_GetClockMapReq_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ClientMaster_GetClockMapReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_GetClockMapReq_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_ClientMaster_GetClockMapResp_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ClientMaster_GetClockMapResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_GetClockMapResp_descriptor,
        new java.lang.String[] { "TaskId", "ClockMap", });
    internal_static_ClientMaster_GetClockMapResp_ClockMapEntry_descriptor =
      internal_static_ClientMaster_GetClockMapResp_descriptor.getNestedTypes().get(0);
    internal_static_ClientMaster_GetClockMapResp_ClockMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_GetClockMapResp_ClockMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ClientMaster_GetGlobalBatchResp_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ClientMaster_GetGlobalBatchResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMaster_GetGlobalBatchResp_descriptor,
        new java.lang.String[] { "BatchSize", });
    com.tencent.client.common.protos.MWComProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
