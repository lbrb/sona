// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_worker.proto

package com.tencent.client.worker.protos;

/**
 * Protobuf type {@code ClientMaster.SaveTensorLike}
 */
public  final class SaveTensorLike extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientMaster.SaveTensorLike)
    SaveTensorLikeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveTensorLike.newBuilder() to construct.
  private SaveTensorLike(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveTensorLike() {
    taskId_ = 0L;
    matId_ = 0;
    path_ = "";
    formatClassName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveTensorLike(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            taskId_ = input.readInt64();
            break;
          }
          case 16: {

            matId_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            formatClassName_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tencent.client.worker.protos.ClientWorkerProto.internal_static_ClientMaster_SaveTensorLike_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.client.worker.protos.ClientWorkerProto.internal_static_ClientMaster_SaveTensorLike_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.client.worker.protos.SaveTensorLike.class, com.tencent.client.worker.protos.SaveTensorLike.Builder.class);
  }

  public static final int TASKID_FIELD_NUMBER = 1;
  private long taskId_;
  /**
   * <code>int64 taskId = 1;</code>
   */
  public long getTaskId() {
    return taskId_;
  }

  public static final int MATID_FIELD_NUMBER = 2;
  private int matId_;
  /**
   * <code>int32 matId = 2;</code>
   */
  public int getMatId() {
    return matId_;
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 3;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMATCLASSNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object formatClassName_;
  /**
   * <code>string formatClassName = 4;</code>
   */
  public java.lang.String getFormatClassName() {
    java.lang.Object ref = formatClassName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      formatClassName_ = s;
      return s;
    }
  }
  /**
   * <code>string formatClassName = 4;</code>
   */
  public com.google.protobuf.ByteString
      getFormatClassNameBytes() {
    java.lang.Object ref = formatClassName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      formatClassName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (taskId_ != 0L) {
      output.writeInt64(1, taskId_);
    }
    if (matId_ != 0) {
      output.writeInt32(2, matId_);
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
    }
    if (!getFormatClassNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, formatClassName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, taskId_);
    }
    if (matId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, matId_);
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
    }
    if (!getFormatClassNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, formatClassName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tencent.client.worker.protos.SaveTensorLike)) {
      return super.equals(obj);
    }
    com.tencent.client.worker.protos.SaveTensorLike other = (com.tencent.client.worker.protos.SaveTensorLike) obj;

    boolean result = true;
    result = result && (getTaskId()
        == other.getTaskId());
    result = result && (getMatId()
        == other.getMatId());
    result = result && getPath()
        .equals(other.getPath());
    result = result && getFormatClassName()
        .equals(other.getFormatClassName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TASKID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTaskId());
    hash = (37 * hash) + MATID_FIELD_NUMBER;
    hash = (53 * hash) + getMatId();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + FORMATCLASSNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFormatClassName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.worker.protos.SaveTensorLike parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tencent.client.worker.protos.SaveTensorLike prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ClientMaster.SaveTensorLike}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientMaster.SaveTensorLike)
      com.tencent.client.worker.protos.SaveTensorLikeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.client.worker.protos.ClientWorkerProto.internal_static_ClientMaster_SaveTensorLike_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.client.worker.protos.ClientWorkerProto.internal_static_ClientMaster_SaveTensorLike_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.client.worker.protos.SaveTensorLike.class, com.tencent.client.worker.protos.SaveTensorLike.Builder.class);
    }

    // Construct using com.tencent.client.worker.protos.SaveTensorLike.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      taskId_ = 0L;

      matId_ = 0;

      path_ = "";

      formatClassName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.client.worker.protos.ClientWorkerProto.internal_static_ClientMaster_SaveTensorLike_descriptor;
    }

    public com.tencent.client.worker.protos.SaveTensorLike getDefaultInstanceForType() {
      return com.tencent.client.worker.protos.SaveTensorLike.getDefaultInstance();
    }

    public com.tencent.client.worker.protos.SaveTensorLike build() {
      com.tencent.client.worker.protos.SaveTensorLike result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.tencent.client.worker.protos.SaveTensorLike buildPartial() {
      com.tencent.client.worker.protos.SaveTensorLike result = new com.tencent.client.worker.protos.SaveTensorLike(this);
      result.taskId_ = taskId_;
      result.matId_ = matId_;
      result.path_ = path_;
      result.formatClassName_ = formatClassName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tencent.client.worker.protos.SaveTensorLike) {
        return mergeFrom((com.tencent.client.worker.protos.SaveTensorLike)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.client.worker.protos.SaveTensorLike other) {
      if (other == com.tencent.client.worker.protos.SaveTensorLike.getDefaultInstance()) return this;
      if (other.getTaskId() != 0L) {
        setTaskId(other.getTaskId());
      }
      if (other.getMatId() != 0) {
        setMatId(other.getMatId());
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getFormatClassName().isEmpty()) {
        formatClassName_ = other.formatClassName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tencent.client.worker.protos.SaveTensorLike parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.client.worker.protos.SaveTensorLike) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long taskId_ ;
    /**
     * <code>int64 taskId = 1;</code>
     */
    public long getTaskId() {
      return taskId_;
    }
    /**
     * <code>int64 taskId = 1;</code>
     */
    public Builder setTaskId(long value) {
      
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 taskId = 1;</code>
     */
    public Builder clearTaskId() {
      
      taskId_ = 0L;
      onChanged();
      return this;
    }

    private int matId_ ;
    /**
     * <code>int32 matId = 2;</code>
     */
    public int getMatId() {
      return matId_;
    }
    /**
     * <code>int32 matId = 2;</code>
     */
    public Builder setMatId(int value) {
      
      matId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 matId = 2;</code>
     */
    public Builder clearMatId() {
      
      matId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 3;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 3;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 3;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 3;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object formatClassName_ = "";
    /**
     * <code>string formatClassName = 4;</code>
     */
    public java.lang.String getFormatClassName() {
      java.lang.Object ref = formatClassName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        formatClassName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string formatClassName = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFormatClassNameBytes() {
      java.lang.Object ref = formatClassName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        formatClassName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string formatClassName = 4;</code>
     */
    public Builder setFormatClassName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formatClassName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string formatClassName = 4;</code>
     */
    public Builder clearFormatClassName() {
      
      formatClassName_ = getDefaultInstance().getFormatClassName();
      onChanged();
      return this;
    }
    /**
     * <code>string formatClassName = 4;</code>
     */
    public Builder setFormatClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formatClassName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientMaster.SaveTensorLike)
  }

  // @@protoc_insertion_point(class_scope:ClientMaster.SaveTensorLike)
  private static final com.tencent.client.worker.protos.SaveTensorLike DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.client.worker.protos.SaveTensorLike();
  }

  public static com.tencent.client.worker.protos.SaveTensorLike getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveTensorLike>
      PARSER = new com.google.protobuf.AbstractParser<SaveTensorLike>() {
    public SaveTensorLike parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveTensorLike(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveTensorLike> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveTensorLike> getParserForType() {
    return PARSER;
  }

  public com.tencent.client.worker.protos.SaveTensorLike getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

