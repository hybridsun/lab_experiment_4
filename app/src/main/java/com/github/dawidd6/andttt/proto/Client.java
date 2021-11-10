// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package com.github.dawidd6.andttt.proto;

/**
 * Protobuf type {@code proto.Client}
 */
public  final class Client extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Client)
    ClientOrBuilder {
  // Use Client.newBuilder() to construct.
  private Client(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Client() {
    name_ = "";
    room_ = "";
    symbol_ = 0;
    turn_ = false;
    ready_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Client(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            room_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (since_ != null) {
              subBuilder = since_.toBuilder();
            }
            since_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(since_);
              since_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            symbol_ = rawValue;
            break;
          }
          case 48: {

            turn_ = input.readBool();
            break;
          }
          case 56: {

            ready_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.dawidd6.andttt.proto.ClientOuterClass.internal_static_proto_Client_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.dawidd6.andttt.proto.ClientOuterClass.internal_static_proto_Client_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.dawidd6.andttt.proto.Client.class, com.github.dawidd6.andttt.proto.Client.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOM_FIELD_NUMBER = 2;
  private volatile java.lang.Object room_;
  /**
   * <code>string room = 2;</code>
   */
  public java.lang.String getRoom() {
    java.lang.Object ref = room_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      room_ = s;
      return s;
    }
  }
  /**
   * <code>string room = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRoomBytes() {
    java.lang.Object ref = room_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      room_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SINCE_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp since_;
  /**
   * <code>.google.protobuf.Timestamp since = 4;</code>
   */
  public boolean hasSince() {
    return since_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp since = 4;</code>
   */
  public com.google.protobuf.Timestamp getSince() {
    return since_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : since_;
  }
  /**
   * <code>.google.protobuf.Timestamp since = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getSinceOrBuilder() {
    return getSince();
  }

  public static final int SYMBOL_FIELD_NUMBER = 5;
  private int symbol_;
  /**
   * <code>.proto.Symbol symbol = 5;</code>
   */
  public int getSymbolValue() {
    return symbol_;
  }
  /**
   * <code>.proto.Symbol symbol = 5;</code>
   */
  public com.github.dawidd6.andttt.proto.Symbol getSymbol() {
    com.github.dawidd6.andttt.proto.Symbol result = com.github.dawidd6.andttt.proto.Symbol.valueOf(symbol_);
    return result == null ? com.github.dawidd6.andttt.proto.Symbol.UNRECOGNIZED : result;
  }

  public static final int TURN_FIELD_NUMBER = 6;
  private boolean turn_;
  /**
   * <code>bool turn = 6;</code>
   */
  public boolean getTurn() {
    return turn_;
  }

  public static final int READY_FIELD_NUMBER = 7;
  private boolean ready_;
  /**
   * <code>bool ready = 7;</code>
   */
  public boolean getReady() {
    return ready_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getRoomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, room_);
    }
    if (since_ != null) {
      output.writeMessage(4, getSince());
    }
    if (symbol_ != com.github.dawidd6.andttt.proto.Symbol.NO.getNumber()) {
      output.writeEnum(5, symbol_);
    }
    if (turn_ != false) {
      output.writeBool(6, turn_);
    }
    if (ready_ != false) {
      output.writeBool(7, ready_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getRoomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, room_);
    }
    if (since_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSince());
    }
    if (symbol_ != com.github.dawidd6.andttt.proto.Symbol.NO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, symbol_);
    }
    if (turn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, turn_);
    }
    if (ready_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, ready_);
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
    if (!(obj instanceof com.github.dawidd6.andttt.proto.Client)) {
      return super.equals(obj);
    }
    com.github.dawidd6.andttt.proto.Client other = (com.github.dawidd6.andttt.proto.Client) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getRoom()
        .equals(other.getRoom());
    result = result && (hasSince() == other.hasSince());
    if (hasSince()) {
      result = result && getSince()
          .equals(other.getSince());
    }
    result = result && symbol_ == other.symbol_;
    result = result && (getTurn()
        == other.getTurn());
    result = result && (getReady()
        == other.getReady());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ROOM_FIELD_NUMBER;
    hash = (53 * hash) + getRoom().hashCode();
    if (hasSince()) {
      hash = (37 * hash) + SINCE_FIELD_NUMBER;
      hash = (53 * hash) + getSince().hashCode();
    }
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + symbol_;
    hash = (37 * hash) + TURN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTurn());
    hash = (37 * hash) + READY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReady());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.Client parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.Client parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.dawidd6.andttt.proto.Client parseFrom(
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
  public static Builder newBuilder(com.github.dawidd6.andttt.proto.Client prototype) {
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
   * Protobuf type {@code proto.Client}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Client)
      com.github.dawidd6.andttt.proto.ClientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.dawidd6.andttt.proto.ClientOuterClass.internal_static_proto_Client_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.dawidd6.andttt.proto.ClientOuterClass.internal_static_proto_Client_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.dawidd6.andttt.proto.Client.class, com.github.dawidd6.andttt.proto.Client.Builder.class);
    }

    // Construct using com.github.dawidd6.andttt.proto.Client.newBuilder()
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
      name_ = "";

      room_ = "";

      if (sinceBuilder_ == null) {
        since_ = null;
      } else {
        since_ = null;
        sinceBuilder_ = null;
      }
      symbol_ = 0;

      turn_ = false;

      ready_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.dawidd6.andttt.proto.ClientOuterClass.internal_static_proto_Client_descriptor;
    }

    public com.github.dawidd6.andttt.proto.Client getDefaultInstanceForType() {
      return com.github.dawidd6.andttt.proto.Client.getDefaultInstance();
    }

    public com.github.dawidd6.andttt.proto.Client build() {
      com.github.dawidd6.andttt.proto.Client result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.dawidd6.andttt.proto.Client buildPartial() {
      com.github.dawidd6.andttt.proto.Client result = new com.github.dawidd6.andttt.proto.Client(this);
      result.name_ = name_;
      result.room_ = room_;
      if (sinceBuilder_ == null) {
        result.since_ = since_;
      } else {
        result.since_ = sinceBuilder_.build();
      }
      result.symbol_ = symbol_;
      result.turn_ = turn_;
      result.ready_ = ready_;
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
      if (other instanceof com.github.dawidd6.andttt.proto.Client) {
        return mergeFrom((com.github.dawidd6.andttt.proto.Client)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.dawidd6.andttt.proto.Client other) {
      if (other == com.github.dawidd6.andttt.proto.Client.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getRoom().isEmpty()) {
        room_ = other.room_;
        onChanged();
      }
      if (other.hasSince()) {
        mergeSince(other.getSince());
      }
      if (other.symbol_ != 0) {
        setSymbolValue(other.getSymbolValue());
      }
      if (other.getTurn() != false) {
        setTurn(other.getTurn());
      }
      if (other.getReady() != false) {
        setReady(other.getReady());
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
      com.github.dawidd6.andttt.proto.Client parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.dawidd6.andttt.proto.Client) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object room_ = "";
    /**
     * <code>string room = 2;</code>
     */
    public java.lang.String getRoom() {
      java.lang.Object ref = room_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        room_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string room = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoomBytes() {
      java.lang.Object ref = room_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        room_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string room = 2;</code>
     */
    public Builder setRoom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      room_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string room = 2;</code>
     */
    public Builder clearRoom() {
      
      room_ = getDefaultInstance().getRoom();
      onChanged();
      return this;
    }
    /**
     * <code>string room = 2;</code>
     */
    public Builder setRoomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      room_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp since_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> sinceBuilder_;
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public boolean hasSince() {
      return sinceBuilder_ != null || since_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public com.google.protobuf.Timestamp getSince() {
      if (sinceBuilder_ == null) {
        return since_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : since_;
      } else {
        return sinceBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public Builder setSince(com.google.protobuf.Timestamp value) {
      if (sinceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        since_ = value;
        onChanged();
      } else {
        sinceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public Builder setSince(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (sinceBuilder_ == null) {
        since_ = builderForValue.build();
        onChanged();
      } else {
        sinceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public Builder mergeSince(com.google.protobuf.Timestamp value) {
      if (sinceBuilder_ == null) {
        if (since_ != null) {
          since_ =
            com.google.protobuf.Timestamp.newBuilder(since_).mergeFrom(value).buildPartial();
        } else {
          since_ = value;
        }
        onChanged();
      } else {
        sinceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public Builder clearSince() {
      if (sinceBuilder_ == null) {
        since_ = null;
        onChanged();
      } else {
        since_ = null;
        sinceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSinceBuilder() {
      
      onChanged();
      return getSinceFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSinceOrBuilder() {
      if (sinceBuilder_ != null) {
        return sinceBuilder_.getMessageOrBuilder();
      } else {
        return since_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : since_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp since = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getSinceFieldBuilder() {
      if (sinceBuilder_ == null) {
        sinceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getSince(),
                getParentForChildren(),
                isClean());
        since_ = null;
      }
      return sinceBuilder_;
    }

    private int symbol_ = 0;
    /**
     * <code>.proto.Symbol symbol = 5;</code>
     */
    public int getSymbolValue() {
      return symbol_;
    }
    /**
     * <code>.proto.Symbol symbol = 5;</code>
     */
    public Builder setSymbolValue(int value) {
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.Symbol symbol = 5;</code>
     */
    public com.github.dawidd6.andttt.proto.Symbol getSymbol() {
      com.github.dawidd6.andttt.proto.Symbol result = com.github.dawidd6.andttt.proto.Symbol.valueOf(symbol_);
      return result == null ? com.github.dawidd6.andttt.proto.Symbol.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.Symbol symbol = 5;</code>
     */
    public Builder setSymbol(com.github.dawidd6.andttt.proto.Symbol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      symbol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.Symbol symbol = 5;</code>
     */
    public Builder clearSymbol() {
      
      symbol_ = 0;
      onChanged();
      return this;
    }

    private boolean turn_ ;
    /**
     * <code>bool turn = 6;</code>
     */
    public boolean getTurn() {
      return turn_;
    }
    /**
     * <code>bool turn = 6;</code>
     */
    public Builder setTurn(boolean value) {
      
      turn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool turn = 6;</code>
     */
    public Builder clearTurn() {
      
      turn_ = false;
      onChanged();
      return this;
    }

    private boolean ready_ ;
    /**
     * <code>bool ready = 7;</code>
     */
    public boolean getReady() {
      return ready_;
    }
    /**
     * <code>bool ready = 7;</code>
     */
    public Builder setReady(boolean value) {
      
      ready_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ready = 7;</code>
     */
    public Builder clearReady() {
      
      ready_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.Client)
  }

  // @@protoc_insertion_point(class_scope:proto.Client)
  private static final com.github.dawidd6.andttt.proto.Client DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.dawidd6.andttt.proto.Client();
  }

  public static com.github.dawidd6.andttt.proto.Client getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Client>
      PARSER = new com.google.protobuf.AbstractParser<Client>() {
    public Client parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Client(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Client> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Client> getParserForType() {
    return PARSER;
  }

  public com.github.dawidd6.andttt.proto.Client getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
