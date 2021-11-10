// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.github.dawidd6.andttt.proto;

/**
 * Protobuf type {@code proto.ApiRooms}
 */
public  final class ApiRooms extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ApiRooms)
    ApiRoomsOrBuilder {
  // Use ApiRooms.newBuilder() to construct.
  private ApiRooms(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiRooms() {
    count_ = 0;
    rooms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ApiRooms(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            count_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              rooms_ = new java.util.ArrayList<com.github.dawidd6.andttt.proto.Room>();
              mutable_bitField0_ |= 0x00000002;
            }
            rooms_.add(
                input.readMessage(com.github.dawidd6.andttt.proto.Room.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        rooms_ = java.util.Collections.unmodifiableList(rooms_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.dawidd6.andttt.proto.Api.internal_static_proto_ApiRooms_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.dawidd6.andttt.proto.Api.internal_static_proto_ApiRooms_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.dawidd6.andttt.proto.ApiRooms.class, com.github.dawidd6.andttt.proto.ApiRooms.Builder.class);
  }

  private int bitField0_;
  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int ROOMS_FIELD_NUMBER = 2;
  private java.util.List<com.github.dawidd6.andttt.proto.Room> rooms_;
  /**
   * <code>repeated .proto.Room rooms = 2;</code>
   */
  public java.util.List<com.github.dawidd6.andttt.proto.Room> getRoomsList() {
    return rooms_;
  }
  /**
   * <code>repeated .proto.Room rooms = 2;</code>
   */
  public java.util.List<? extends com.github.dawidd6.andttt.proto.RoomOrBuilder> 
      getRoomsOrBuilderList() {
    return rooms_;
  }
  /**
   * <code>repeated .proto.Room rooms = 2;</code>
   */
  public int getRoomsCount() {
    return rooms_.size();
  }
  /**
   * <code>repeated .proto.Room rooms = 2;</code>
   */
  public com.github.dawidd6.andttt.proto.Room getRooms(int index) {
    return rooms_.get(index);
  }
  /**
   * <code>repeated .proto.Room rooms = 2;</code>
   */
  public com.github.dawidd6.andttt.proto.RoomOrBuilder getRoomsOrBuilder(
      int index) {
    return rooms_.get(index);
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    for (int i = 0; i < rooms_.size(); i++) {
      output.writeMessage(2, rooms_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    for (int i = 0; i < rooms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, rooms_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.dawidd6.andttt.proto.ApiRooms)) {
      return super.equals(obj);
    }
    com.github.dawidd6.andttt.proto.ApiRooms other = (com.github.dawidd6.andttt.proto.ApiRooms) obj;

    boolean result = true;
    result = result && (getCount()
        == other.getCount());
    result = result && getRoomsList()
        .equals(other.getRoomsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (getRoomsCount() > 0) {
      hash = (37 * hash) + ROOMS_FIELD_NUMBER;
      hash = (53 * hash) + getRoomsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.ApiRooms parseFrom(
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
  public static Builder newBuilder(com.github.dawidd6.andttt.proto.ApiRooms prototype) {
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
   * Protobuf type {@code proto.ApiRooms}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ApiRooms)
      com.github.dawidd6.andttt.proto.ApiRoomsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.dawidd6.andttt.proto.Api.internal_static_proto_ApiRooms_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.dawidd6.andttt.proto.Api.internal_static_proto_ApiRooms_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.dawidd6.andttt.proto.ApiRooms.class, com.github.dawidd6.andttt.proto.ApiRooms.Builder.class);
    }

    // Construct using com.github.dawidd6.andttt.proto.ApiRooms.newBuilder()
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
        getRoomsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      count_ = 0;

      if (roomsBuilder_ == null) {
        rooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        roomsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.dawidd6.andttt.proto.Api.internal_static_proto_ApiRooms_descriptor;
    }

    public com.github.dawidd6.andttt.proto.ApiRooms getDefaultInstanceForType() {
      return com.github.dawidd6.andttt.proto.ApiRooms.getDefaultInstance();
    }

    public com.github.dawidd6.andttt.proto.ApiRooms build() {
      com.github.dawidd6.andttt.proto.ApiRooms result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.dawidd6.andttt.proto.ApiRooms buildPartial() {
      com.github.dawidd6.andttt.proto.ApiRooms result = new com.github.dawidd6.andttt.proto.ApiRooms(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.count_ = count_;
      if (roomsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          rooms_ = java.util.Collections.unmodifiableList(rooms_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.rooms_ = rooms_;
      } else {
        result.rooms_ = roomsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.dawidd6.andttt.proto.ApiRooms) {
        return mergeFrom((com.github.dawidd6.andttt.proto.ApiRooms)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.dawidd6.andttt.proto.ApiRooms other) {
      if (other == com.github.dawidd6.andttt.proto.ApiRooms.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (roomsBuilder_ == null) {
        if (!other.rooms_.isEmpty()) {
          if (rooms_.isEmpty()) {
            rooms_ = other.rooms_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRoomsIsMutable();
            rooms_.addAll(other.rooms_);
          }
          onChanged();
        }
      } else {
        if (!other.rooms_.isEmpty()) {
          if (roomsBuilder_.isEmpty()) {
            roomsBuilder_.dispose();
            roomsBuilder_ = null;
            rooms_ = other.rooms_;
            bitField0_ = (bitField0_ & ~0x00000002);
            roomsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoomsFieldBuilder() : null;
          } else {
            roomsBuilder_.addAllMessages(other.rooms_);
          }
        }
      }
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
      com.github.dawidd6.andttt.proto.ApiRooms parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.dawidd6.andttt.proto.ApiRooms) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int count_ ;
    /**
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.github.dawidd6.andttt.proto.Room> rooms_ =
      java.util.Collections.emptyList();
    private void ensureRoomsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        rooms_ = new java.util.ArrayList<com.github.dawidd6.andttt.proto.Room>(rooms_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.dawidd6.andttt.proto.Room, com.github.dawidd6.andttt.proto.Room.Builder, com.github.dawidd6.andttt.proto.RoomOrBuilder> roomsBuilder_;

    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public java.util.List<com.github.dawidd6.andttt.proto.Room> getRoomsList() {
      if (roomsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rooms_);
      } else {
        return roomsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public int getRoomsCount() {
      if (roomsBuilder_ == null) {
        return rooms_.size();
      } else {
        return roomsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public com.github.dawidd6.andttt.proto.Room getRooms(int index) {
      if (roomsBuilder_ == null) {
        return rooms_.get(index);
      } else {
        return roomsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder setRooms(
        int index, com.github.dawidd6.andttt.proto.Room value) {
      if (roomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomsIsMutable();
        rooms_.set(index, value);
        onChanged();
      } else {
        roomsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder setRooms(
        int index, com.github.dawidd6.andttt.proto.Room.Builder builderForValue) {
      if (roomsBuilder_ == null) {
        ensureRoomsIsMutable();
        rooms_.set(index, builderForValue.build());
        onChanged();
      } else {
        roomsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder addRooms(com.github.dawidd6.andttt.proto.Room value) {
      if (roomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomsIsMutable();
        rooms_.add(value);
        onChanged();
      } else {
        roomsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder addRooms(
        int index, com.github.dawidd6.andttt.proto.Room value) {
      if (roomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomsIsMutable();
        rooms_.add(index, value);
        onChanged();
      } else {
        roomsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder addRooms(
        com.github.dawidd6.andttt.proto.Room.Builder builderForValue) {
      if (roomsBuilder_ == null) {
        ensureRoomsIsMutable();
        rooms_.add(builderForValue.build());
        onChanged();
      } else {
        roomsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder addRooms(
        int index, com.github.dawidd6.andttt.proto.Room.Builder builderForValue) {
      if (roomsBuilder_ == null) {
        ensureRoomsIsMutable();
        rooms_.add(index, builderForValue.build());
        onChanged();
      } else {
        roomsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder addAllRooms(
        java.lang.Iterable<? extends com.github.dawidd6.andttt.proto.Room> values) {
      if (roomsBuilder_ == null) {
        ensureRoomsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rooms_);
        onChanged();
      } else {
        roomsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder clearRooms() {
      if (roomsBuilder_ == null) {
        rooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        roomsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public Builder removeRooms(int index) {
      if (roomsBuilder_ == null) {
        ensureRoomsIsMutable();
        rooms_.remove(index);
        onChanged();
      } else {
        roomsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public com.github.dawidd6.andttt.proto.Room.Builder getRoomsBuilder(
        int index) {
      return getRoomsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public com.github.dawidd6.andttt.proto.RoomOrBuilder getRoomsOrBuilder(
        int index) {
      if (roomsBuilder_ == null) {
        return rooms_.get(index);  } else {
        return roomsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public java.util.List<? extends com.github.dawidd6.andttt.proto.RoomOrBuilder> 
         getRoomsOrBuilderList() {
      if (roomsBuilder_ != null) {
        return roomsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rooms_);
      }
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public com.github.dawidd6.andttt.proto.Room.Builder addRoomsBuilder() {
      return getRoomsFieldBuilder().addBuilder(
          com.github.dawidd6.andttt.proto.Room.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public com.github.dawidd6.andttt.proto.Room.Builder addRoomsBuilder(
        int index) {
      return getRoomsFieldBuilder().addBuilder(
          index, com.github.dawidd6.andttt.proto.Room.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Room rooms = 2;</code>
     */
    public java.util.List<com.github.dawidd6.andttt.proto.Room.Builder> 
         getRoomsBuilderList() {
      return getRoomsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.dawidd6.andttt.proto.Room, com.github.dawidd6.andttt.proto.Room.Builder, com.github.dawidd6.andttt.proto.RoomOrBuilder> 
        getRoomsFieldBuilder() {
      if (roomsBuilder_ == null) {
        roomsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.dawidd6.andttt.proto.Room, com.github.dawidd6.andttt.proto.Room.Builder, com.github.dawidd6.andttt.proto.RoomOrBuilder>(
                rooms_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        rooms_ = null;
      }
      return roomsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.ApiRooms)
  }

  // @@protoc_insertion_point(class_scope:proto.ApiRooms)
  private static final com.github.dawidd6.andttt.proto.ApiRooms DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.dawidd6.andttt.proto.ApiRooms();
  }

  public static com.github.dawidd6.andttt.proto.ApiRooms getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiRooms>
      PARSER = new com.google.protobuf.AbstractParser<ApiRooms>() {
    public ApiRooms parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ApiRooms(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApiRooms> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiRooms> getParserForType() {
    return PARSER;
  }

  public com.github.dawidd6.andttt.proto.ApiRooms getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
