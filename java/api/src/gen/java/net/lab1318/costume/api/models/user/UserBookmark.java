package net.lab1318.costume.api.models.user;

public class UserBookmark implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            name = null;
            userId = null;
            folder = com.google.common.base.Optional.absent();
            objectId = com.google.common.base.Optional.absent();
            objectQuery = com.google.common.base.Optional.absent();
        }

        public Builder(final UserBookmark other) {
            this.name = other.getName();
            this.userId = other.getUserId();
            this.folder = other.getFolder();
            this.objectId = other.getObjectId();
            this.objectQuery = other.getObjectQuery();
        }

        protected UserBookmark _build(final String name, final net.lab1318.costume.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery) {
            return new UserBookmark(name, userId, folder, objectId, objectQuery);
        }

        public UserBookmark build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.user.UserBookmark: missing name"), com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId"), com.google.common.base.Preconditions.checkNotNull(folder, "net.lab1318.costume.api.models.user.UserBookmark: missing folder"), com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId"), com.google.common.base.Preconditions.checkNotNull(objectQuery, "net.lab1318.costume.api.models.user.UserBookmark: missing objectQuery"));
        }

        public final com.google.common.base.Optional<String> getFolder() {
            return folder;
        }

        public final String getName() {
            return name;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getObjectId() {
            return objectId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> getObjectQuery() {
            return objectQuery;
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
            name = iprot.readString();
            try {
                userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            if (__list.getSize() > 2) {
                folder = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    objectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 4) {
                objectQuery = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                case "name": {
                    name = iprot.readString();
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
                case "object_id": {
                    try {
                        objectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                    }
                    break;
                }
                case "object_query": {
                    objectQuery = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
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

            setName(other.getName());
            setUserId(other.getUserId());
            if (other.getFolder().isPresent()) {
                setFolder(other.getFolder());
            }
            if (other.getObjectId().isPresent()) {
                setObjectId(other.getObjectId());
            }
            if (other.getObjectQuery().isPresent()) {
                setObjectQuery(other.getObjectQuery());
            }

            return this;
        }

        public Builder setName(final String name) {
            this.name = com.google.common.base.Preconditions.checkNotNull(name);
            return this;
        }

        public Builder setObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId) {
            this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId);
            return this;
        }

        public Builder setObjectId(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectId objectId) {
            this.objectId = com.google.common.base.Optional.fromNullable(objectId);
            return this;
        }

        public Builder setObjectQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery) {
            this.objectQuery = com.google.common.base.Preconditions.checkNotNull(objectQuery);
            return this;
        }

        public Builder setObjectQuery(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectQuery objectQuery) {
            this.objectQuery = com.google.common.base.Optional.fromNullable(objectQuery);
            return this;
        }

        public Builder setUserId(final net.lab1318.costume.api.models.user.UserId userId) {
            this.userId = com.google.common.base.Preconditions.checkNotNull(userId);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": setName((String)value); return this;
            case "user_id": setUserId((net.lab1318.costume.api.models.user.UserId)value); return this;
            case "folder": setFolder((String)value); return this;
            case "object_id": setObjectId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "object_query": setObjectQuery((net.lab1318.costume.api.models.object.ObjectQuery)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFolder() {
            this.folder = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetName() {
            this.name = null;
            return this;
        }

        public Builder unsetObjectId() {
            this.objectId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetObjectQuery() {
            this.objectQuery = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetUserId() {
            this.userId = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": return unsetName();
            case "user_id": return unsetUserId();
            case "folder": return unsetFolder();
            case "object_id": return unsetObjectId();
            case "object_query": return unsetObjectQuery();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String name;
        private net.lab1318.costume.api.models.user.UserId userId;
        private com.google.common.base.Optional<String> folder;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "name", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING),
        FOLDER("folder", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "folder", org.thryft.protocol.Type.STRING),
        OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, false, 0, "object_id", org.thryft.protocol.Type.STRING),
        OBJECT_QUERY("objectQuery", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectQuery>() {}, false, 0, "object_query", org.thryft.protocol.Type.STRUCT);

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
            case "name": return NAME;
            case "userId": return USER_ID;
            case "folder": return FOLDER;
            case "objectId": return OBJECT_ID;
            case "objectQuery": return OBJECT_QUERY;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "name": return NAME;
            case "user_id": return USER_ID;
            case "folder": return FOLDER;
            case "object_id": return OBJECT_ID;
            case "object_query": return OBJECT_QUERY;
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
        this(other.getName(), other.getUserId(), other.getFolder(), other.getObjectId(), other.getObjectQuery());
    }

    /**
     * Required constructor
     */
    public UserBookmark(final String name, final net.lab1318.costume.api.models.user.UserId userId) {
        this.name = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.user.UserBookmark: missing name"), "net.lab1318.costume.api.models.user.UserBookmark: name is empty");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = com.google.common.base.Optional.absent();
        this.objectId = com.google.common.base.Optional.absent();
        this.objectQuery = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public UserBookmark(final String name, final net.lab1318.costume.api.models.user.UserId userId, final @javax.annotation.Nullable String folder, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectId objectId, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectQuery objectQuery) {
        this.name = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.user.UserBookmark: missing name"), "net.lab1318.costume.api.models.user.UserBookmark: name is empty");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(folder), "net.lab1318.costume.api.models.user.UserBookmark: folder is empty");
        this.objectId = com.google.common.base.Optional.fromNullable(objectId);
        this.objectQuery = com.google.common.base.Optional.fromNullable(objectQuery);
    }

    /**
     * Optional constructor
     */
    public UserBookmark(final String name, final net.lab1318.costume.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery) {
        this.name = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.user.UserBookmark: missing name"), "net.lab1318.costume.api.models.user.UserBookmark: name is empty");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.models.user.UserBookmark: missing userId");
        this.folder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(folder, "net.lab1318.costume.api.models.user.UserBookmark: missing folder"), "net.lab1318.costume.api.models.user.UserBookmark: folder is empty");
        this.objectId = com.google.common.base.Preconditions.checkNotNull(objectId, "net.lab1318.costume.api.models.user.UserBookmark: missing objectId");
        this.objectQuery = com.google.common.base.Preconditions.checkNotNull(objectQuery, "net.lab1318.costume.api.models.user.UserBookmark: missing objectQuery");
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
            getName().equals(other.getName()) &&
            getUserId().equals(other.getUserId()) &&
            getFolder().equals(other.getFolder()) &&
            getObjectId().equals(other.getObjectId()) &&
            getObjectQuery().equals(other.getObjectQuery());
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
        case NAME: return getName();
        case USER_ID: return getUserId();
        case FOLDER: return getFolder();
        case OBJECT_ID: return getObjectId();
        case OBJECT_QUERY: return getObjectQuery();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getFolder() {
        return folder;
    }

    public final String getName() {
        return name;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getObjectId() {
        return objectId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> getObjectQuery() {
        return objectQuery;
    }

    public final net.lab1318.costume.api.models.user.UserId getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        if (getFolder().isPresent()) {
            hashCode = 31 * hashCode + getFolder().get().hashCode();
        }
        if (getObjectId().isPresent()) {
            hashCode = 31 * hashCode + getObjectId().get().hashCode();
        }
        if (getObjectQuery().isPresent()) {
            hashCode = 31 * hashCode + getObjectQuery().get().hashCode();
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
        String name = null;
        net.lab1318.costume.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        name = iprot.readString();
        try {
            userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        if (__list.getSize() > 2) {
            folder = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            try {
                objectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
            }
        }
        if (__list.getSize() > 4) {
            objectQuery = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new UserBookmark(name, userId, folder, objectId, objectQuery);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String name = null;
        net.lab1318.costume.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "name": {
                name = iprot.readString();
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
            case "object_id": {
                try {
                    objectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
                break;
            }
            case "object_query": {
                objectQuery = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
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
            return new UserBookmark(name, userId, folder, objectId, objectQuery);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public UserBookmark replaceFolder(final com.google.common.base.Optional<String> folder) {
        return new UserBookmark(this.name, this.userId, folder, this.objectId, this.objectQuery);
    }

    public UserBookmark replaceFolder(final String folder) {
        return replaceFolder(com.google.common.base.Optional.fromNullable(folder));
    }

    public UserBookmark replaceName(final String name) {
        return new UserBookmark(name, this.userId, this.folder, this.objectId, this.objectQuery);
    }

    public UserBookmark replaceObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId) {
        return new UserBookmark(this.name, this.userId, this.folder, objectId, this.objectQuery);
    }

    public UserBookmark replaceObjectId(final net.lab1318.costume.api.models.object.ObjectId objectId) {
        return replaceObjectId(com.google.common.base.Optional.fromNullable(objectId));
    }

    public UserBookmark replaceObjectQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery) {
        return new UserBookmark(this.name, this.userId, this.folder, this.objectId, objectQuery);
    }

    public UserBookmark replaceObjectQuery(final net.lab1318.costume.api.models.object.ObjectQuery objectQuery) {
        return replaceObjectQuery(com.google.common.base.Optional.fromNullable(objectQuery));
    }

    public UserBookmark replaceUserId(final net.lab1318.costume.api.models.user.UserId userId) {
        return new UserBookmark(this.name, userId, this.folder, this.objectId, this.objectQuery);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("user_id", getUserId()).add("folder", getFolder().orNull()).add("object_id", getObjectId().orNull()).add("object_query", getObjectQuery().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        oprot.writeString(getName());

        oprot.writeString(getUserId().toString());

        if (getFolder().isPresent()) {
            oprot.writeString(getFolder().get());
        } else {
            oprot.writeNull();
        }

        if (getObjectId().isPresent()) {
            oprot.writeString(getObjectId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getObjectQuery().isPresent()) {
            getObjectQuery().get().writeAsStruct(oprot);
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
        oprot.writeFieldBegin("name", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getName());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        if (getFolder().isPresent()) {
            oprot.writeFieldBegin("folder", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getFolder().get());
            oprot.writeFieldEnd();
        }

        if (getObjectId().isPresent()) {
            oprot.writeFieldBegin("object_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getObjectId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getObjectQuery().isPresent()) {
            oprot.writeFieldBegin("object_query", org.thryft.protocol.Type.STRUCT, (short)0);
            getObjectQuery().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String name;

    private final net.lab1318.costume.api.models.user.UserId userId;

    private final com.google.common.base.Optional<String> folder;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> objectId;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> objectQuery;
}
