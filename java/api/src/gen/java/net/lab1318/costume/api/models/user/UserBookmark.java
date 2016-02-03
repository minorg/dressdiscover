package net.lab1318.costume.api.models.user;

public class UserBookmark implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            objectId = null;
            userId = null;
            folder = com.google.common.base.Optional.absent();
        }

        public Builder(final UserBookmark other) {
            this.objectId = other.getObjectId();
            this.userId = other.getUserId();
            this.folder = other.getFolder();
        }

        protected UserBookmark _build(final net.lab1318.costume.api.models.object.ObjectId objectId, final net.lab1318.costume.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder) {
            return new UserBookmark(objectId, userId, folder);
        }

        public UserBookmark build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId"), com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId"), com.google.common.base.Preconditions.checkNotNull(folder, "net.lab1318.costume.api.models.user.UserBookmark: missing folder"));
        }

        public final com.google.common.base.Optional<String> getFolder() {
            return folder;
        }

        public final net.lab1318.costume.api.models.object.ObjectId getObjectId() {
            return objectId;
        }

        public final net.lab1318.costume.api.models.user.UserId getUserId() {
            return userId;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                objectId = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            try {
                userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            if (__list.getSize() > 2) {
                folder = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "object_id": {
                    try {
                        objectId = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    break;
                }
                case "user_id": {
                    try {
                        userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    break;
                }
                case "folder": {
                    folder = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setFolder(final com.google.common.base.Optional<String> folder) {
            this.folder = com.google.common.base.Preconditions.checkNotNull(folder);
            return this;
        }

        public Builder setFolder(@javax.annotation.Nullable final String folder) {
            this.folder = com.google.common.base.Optional.fromNullable(folder);
            return this;
        }

        public Builder setIfPresent(final UserBookmark other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setObjectId(other.getObjectId());
            setUserId(other.getUserId());
            if (other.getFolder().isPresent()) {
                setFolder(other.getFolder());
            }

            return this;
        }

        public Builder setObjectId(final net.lab1318.costume.api.models.object.ObjectId objectId) {
            this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId);
            return this;
        }

        public Builder setUserId(final net.lab1318.costume.api.models.user.UserId userId) {
            this.userId = com.google.common.base.Preconditions.checkNotNull(userId);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "object_id": setObjectId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "user_id": setUserId((net.lab1318.costume.api.models.user.UserId)value); return this;
            case "folder": setFolder((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFolder() {
            this.folder = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetObjectId() {
            this.objectId = null;
            return this;
        }

        public Builder unsetUserId() {
            this.userId = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "object_id": return unsetObjectId();
            case "user_id": return unsetUserId();
            case "folder": return unsetFolder();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.object.ObjectId objectId;
        private net.lab1318.costume.api.models.user.UserId userId;
        private com.google.common.base.Optional<String> folder;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, true, 0, "object_id", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING),
        FOLDER("folder", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "folder", org.thryft.protocol.Type.STRING);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public int getThriftId() {
            return thriftId;
        }

        @Override
        public String getThriftProtocolKey() {
            return thriftProtocolKey;
        }

        @Override
        public org.thryft.protocol.Type getThriftProtocolType() {
            return thriftProtocolType;
        }

        @Override
        public String getThriftName() {
            return thriftName;
        }

        @Override
        public boolean hasThriftId() {
            return thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID;
        }

        @Override
        public boolean isRequired()  {
            return required;
        }

        public static FieldMetadata valueOfJavaName(final String javaName) {
            switch (javaName) {
            case "objectId": return OBJECT_ID;
            case "userId": return USER_ID;
            case "folder": return FOLDER;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "object_id": return OBJECT_ID;
            case "user_id": return USER_ID;
            case "folder": return FOLDER;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            if (thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID) {
                this.thriftProtocolKey = Integer.toString(thriftId) + ":" + thriftName;
            } else {
                this.thriftProtocolKey = thriftName;
            }
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final int thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    /**
     * Copy constructor
     */
    public UserBookmark(final UserBookmark other) {
        this(other.getObjectId(), other.getUserId(), other.getFolder());
    }

    /**
     * Required constructor
     */
    public UserBookmark(final net.lab1318.costume.api.models.object.ObjectId objectId, final net.lab1318.costume.api.models.user.UserId userId) {
        this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public UserBookmark(final net.lab1318.costume.api.models.object.ObjectId objectId, final net.lab1318.costume.api.models.user.UserId userId, final @javax.annotation.Nullable String folder) {
        this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(folder), "net.lab1318.costume.api.models.user.UserBookmark: folder is empty");
    }

    /**
     * Optional constructor
     */
    public UserBookmark(final net.lab1318.costume.api.models.object.ObjectId objectId, final net.lab1318.costume.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder) {
        this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(folder, "net.lab1318.costume.api.models.user.UserBookmark: missing folder"), "net.lab1318.costume.api.models.user.UserBookmark: folder is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final UserBookmark other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<UserBookmark> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof UserBookmark)) {
            return false;
        }

        final UserBookmark other = (UserBookmark)otherObject;
        return
            getObjectId().equals(other.getObjectId()) &&
            getUserId().equals(other.getUserId()) &&
            getFolder().equals(other.getFolder());
    }

    @Override
    public java.lang.Object get(final String fieldThriftName) {
        return get(FieldMetadata.valueOfThriftName(fieldThriftName));
    }

    @Override
    public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
        if (!(fieldMetadata instanceof FieldMetadata)) {
            throw new IllegalArgumentException();
        }
        return get((FieldMetadata)fieldMetadata);
    }

    public java.lang.Object get(final FieldMetadata fieldMetadata) {
        switch (fieldMetadata) {
        case OBJECT_ID: return getObjectId();
        case USER_ID: return getUserId();
        case FOLDER: return getFolder();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getFolder() {
        return folder;
    }

    public final net.lab1318.costume.api.models.object.ObjectId getObjectId() {
        return objectId;
    }

    public final net.lab1318.costume.api.models.user.UserId getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getObjectId().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        if (getFolder().isPresent()) {
            hashCode = 31 * hashCode + getFolder().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static UserBookmark readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static UserBookmark readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.object.ObjectId objectId = null;
        net.lab1318.costume.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            objectId = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        try {
            userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        if (__list.getSize() > 2) {
            folder = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new UserBookmark(objectId, userId, folder);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.object.ObjectId objectId = null;
        net.lab1318.costume.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "object_id": {
                try {
                    objectId = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                break;
            }
            case "user_id": {
                try {
                    userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                break;
            }
            case "folder": {
                folder = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            default:
                if (unknownFieldCallback.isPresent()) {
                    unknownFieldCallback.get().apply(ifield);
                }
                break;
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new UserBookmark(objectId, userId, folder);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public UserBookmark replaceFolder(final com.google.common.base.Optional<String> folder) {
        return new UserBookmark(this.objectId, this.userId, folder);
    }

    public UserBookmark replaceFolder(final String folder) {
        return replaceFolder(com.google.common.base.Optional.fromNullable(folder));
    }

    public UserBookmark replaceObjectId(final net.lab1318.costume.api.models.object.ObjectId objectId) {
        return new UserBookmark(objectId, this.userId, this.folder);
    }

    public UserBookmark replaceUserId(final net.lab1318.costume.api.models.user.UserId userId) {
        return new UserBookmark(this.objectId, userId, this.folder);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object_id", getObjectId()).add("user_id", getUserId()).add("folder", getFolder().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getObjectId().toString());

        oprot.writeString(getUserId().toString());

        if (getFolder().isPresent()) {
            oprot.writeString(getFolder().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.user.UserBookmark");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("object_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getObjectId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        if (getFolder().isPresent()) {
            oprot.writeFieldBegin("folder", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getFolder().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.object.ObjectId objectId;

    private final net.lab1318.costume.api.models.user.UserId userId;

    private final com.google.common.base.Optional<String> folder;
}
