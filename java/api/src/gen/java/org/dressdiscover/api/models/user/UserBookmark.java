package org.dressdiscover.api.models.user;

public final class UserBookmark implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            name = null;
            userId = null;
            folder = com.google.common.base.Optional.<String> absent();
            objectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
            objectQuery = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
        }

        public Builder(final UserBookmark other) {
            this.name = other.getName();
            this.userId = other.getUserId();
            this.folder = other.getFolder();
            this.objectId = other.getObjectId();
            this.objectQuery = other.getObjectQuery();
        }

        protected UserBookmark _build(final String name, final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
            return new UserBookmark(name, userId, folder, objectId, objectQuery, DefaultConstructionValidator.getInstance());
        }

        public UserBookmark build() {
            return _build(name, userId, folder, objectId, objectQuery);
        }

        public final com.google.common.base.Optional<String> getFolder() {
            return folder;
        }

        public final String getName() {
            return name;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> getObjectId() {
            return objectId;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> getObjectQuery() {
            return objectQuery;
        }

        public final org.dressdiscover.api.models.user.UserId getUserId() {
            return userId;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot, unknownFieldCallback);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                name = iprot.readString();
                try {
                    userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                }
                if (__list.getSize() > 2) {
                    folder = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 3) {
                    try {
                        objectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                    }
                }
                if (__list.getSize() > 4) {
                    objectQuery = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
                }
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
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
                            userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        }
                        break;
                    }
                    case "folder": {
                        folder = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "object_id": {
                        try {
                            objectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                        }
                        break;
                    }
                    case "object_query": {
                        objectQuery = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
            return set(FieldMetadata.valueOfThriftName(fieldThriftName), value);
        }

        public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return set((FieldMetadata)fieldMetadata, value);
        }

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case NAME: setName((String)value); return this;
            case USER_ID: setUserId((org.dressdiscover.api.models.user.UserId)value); return this;
            case FOLDER: setFolder((String)value); return this;
            case OBJECT_ID: setObjectId((org.dressdiscover.api.models.object.ObjectId)value); return this;
            case OBJECT_QUERY: setObjectQuery((org.dressdiscover.api.models.object.ObjectQuery)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFolder(final com.google.common.base.Optional<String> folder) {
            this.folder = DefaultConstructionValidator.getInstance().validateFolder(folder);
            return this;
        }

        public Builder setFolder(@javax.annotation.Nullable final String folder) {
            return setFolder(com.google.common.base.Optional.fromNullable(folder));
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
            this.name = DefaultConstructionValidator.getInstance().validateName(name);
            return this;
        }

        public Builder setObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) {
            this.objectId = DefaultConstructionValidator.getInstance().validateObjectId(objectId);
            return this;
        }

        public Builder setObjectId(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectId objectId) {
            return setObjectId(com.google.common.base.Optional.fromNullable(objectId));
        }

        public Builder setObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
            this.objectQuery = DefaultConstructionValidator.getInstance().validateObjectQuery(objectQuery);
            return this;
        }

        public Builder setObjectQuery(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectQuery objectQuery) {
            return setObjectQuery(com.google.common.base.Optional.fromNullable(objectQuery));
        }

        public Builder setUserId(final org.dressdiscover.api.models.user.UserId userId) {
            this.userId = DefaultConstructionValidator.getInstance().validateUserId(userId);
            return this;
        }

        public Builder unset(final String fieldThriftName) {
            return unset(FieldMetadata.valueOfThriftName(fieldThriftName));
        }

        public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return unset((FieldMetadata)fieldMetadata);
        }

        public Builder unset(final FieldMetadata fieldMetadata) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case NAME: return unsetName();
            case USER_ID: return unsetUserId();
            case FOLDER: return unsetFolder();
            case OBJECT_ID: return unsetObjectId();
            case OBJECT_QUERY: return unsetObjectQuery();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFolder() {
            this.folder = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetName() {
            this.name = null;
            return this;
        }

        public Builder unsetObjectId() {
            this.objectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
            return this;
        }

        public Builder unsetObjectQuery() {
            this.objectQuery = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
            return this;
        }

        public Builder unsetUserId() {
            this.userId = null;
            return this;
        }

        private String name;
        private org.dressdiscover.api.models.user.UserId userId;
        private com.google.common.base.Optional<String> folder;
        private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId;
        private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<UserBookmark> {
        @Override
        public UserBookmark readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return UserBookmark.readAs(iprot, type);
        }

        @Override
        public UserBookmark readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return UserBookmark.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public UserBookmark readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return UserBookmark.readAsList(iprot);
        }

        @Override
        public UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return UserBookmark.readAsStruct(iprot);
        }

        @Override
        public UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return UserBookmark.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "name", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING),
        FOLDER("folder", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "folder", org.thryft.protocol.Type.STRING),
        OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectId>() {}, false, 0, "object_id", org.thryft.protocol.Type.STRING),
        OBJECT_QUERY("objectQuery", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectQuery>() {}, false, 0, "object_query", org.thryft.protocol.Type.STRUCT);

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

    public interface Validator<ExceptionT extends Exception> {
        public String validateName(final String name) throws ExceptionT;

        public org.dressdiscover.api.models.user.UserId validateUserId(final org.dressdiscover.api.models.user.UserId userId) throws ExceptionT;

        public com.google.common.base.Optional<String> validateFolder(final com.google.common.base.Optional<String> folder) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public String validateName(final String name) throws RuntimeException {
            if (name == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.UserBookmark: name is null");
            }
            if (name.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.user.UserBookmark: name is less than min length 1");
            }
            return name;
        }

        @Override
        public org.dressdiscover.api.models.user.UserId validateUserId(final org.dressdiscover.api.models.user.UserId userId) throws RuntimeException {
            if (userId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.UserBookmark: userId is null");
            }
            return userId;
        }

        @Override
        public com.google.common.base.Optional<String> validateFolder(final com.google.common.base.Optional<String> folder) throws RuntimeException {
            if (folder == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.UserBookmark: folder is null");
            }
            if (!folder.isPresent()) {
                return folder;
            }
            if (folder.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.user.UserBookmark: folder is less than min length 1");
            }
            return folder;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) throws RuntimeException {
            if (objectId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.UserBookmark: objectId is null");
            }
            if (!objectId.isPresent()) {
                return objectId;
            }
            return objectId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) throws RuntimeException {
            if (objectQuery == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.UserBookmark: objectQuery is null");
            }
            if (!objectQuery.isPresent()) {
                return objectQuery;
            }
            return objectQuery;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public String validateName(final String name) {
            return name;
        }

        @Override
        public org.dressdiscover.api.models.user.UserId validateUserId(final org.dressdiscover.api.models.user.UserId userId) {
            return userId;
        }

        @Override
        public com.google.common.base.Optional<String> validateFolder(final com.google.common.base.Optional<String> folder) {
            return folder;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) {
            return objectId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
            return objectQuery;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public String validateName(final String name) throws org.thryft.protocol.InputProtocolException {
            if (name == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NAME, "org.dressdiscover.api.models.user.UserBookmark: name is null");
            }
            if (name.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAME, "org.dressdiscover.api.models.user.UserBookmark: name is less than min length 1");
            }
            return name;
        }

        @Override
        public org.dressdiscover.api.models.user.UserId validateUserId(final org.dressdiscover.api.models.user.UserId userId) throws org.thryft.protocol.InputProtocolException {
            if (userId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.USER_ID, "org.dressdiscover.api.models.user.UserBookmark: userId is null");
            }
            return userId;
        }

        @Override
        public com.google.common.base.Optional<String> validateFolder(final com.google.common.base.Optional<String> folder) throws org.thryft.protocol.InputProtocolException {
            if (folder == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FOLDER, "org.dressdiscover.api.models.user.UserBookmark: folder is null");
            }
            if (!folder.isPresent()) {
                return folder;
            }
            if (folder.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FOLDER, "org.dressdiscover.api.models.user.UserBookmark: folder is less than min length 1");
            }
            return folder;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) throws org.thryft.protocol.InputProtocolException {
            if (objectId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_ID, "org.dressdiscover.api.models.user.UserBookmark: objectId is null");
            }
            if (!objectId.isPresent()) {
                return objectId;
            }
            return objectId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) throws org.thryft.protocol.InputProtocolException {
            if (objectQuery == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_QUERY, "org.dressdiscover.api.models.user.UserBookmark: objectQuery is null");
            }
            if (!objectQuery.isPresent()) {
                return objectQuery;
            }
            return objectQuery;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public String validateName(final String name) {
            return name;
        }

        @Override
        public org.dressdiscover.api.models.user.UserId validateUserId(final org.dressdiscover.api.models.user.UserId userId) {
            return userId;
        }

        @Override
        public com.google.common.base.Optional<String> validateFolder(final com.google.common.base.Optional<String> folder) {
            return folder;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) {
            return objectId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
            return objectQuery;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public UserBookmark(final UserBookmark other) {
        this(other.getName(), other.getUserId(), other.getFolder(), other.getObjectId(), other.getObjectQuery(), NopConstructionValidator.getInstance());
    }

    protected UserBookmark(final String name, final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery, ConstructionValidator validator) {
        this.name = validator.validateName(name);
        this.userId = validator.validateUserId(userId);
        this.folder = validator.validateFolder(folder);
        this.objectId = validator.validateObjectId(objectId);
        this.objectQuery = validator.validateObjectQuery(objectQuery);
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

    /**
     * Required factory method
     */
    public static UserBookmark create(final String name, final org.dressdiscover.api.models.user.UserId userId) {
        return new UserBookmark(name, userId, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static UserBookmark create(final String name, final org.dressdiscover.api.models.user.UserId userId, final @javax.annotation.Nullable String folder, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectId objectId, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectQuery objectQuery) {
        return new UserBookmark(name, userId, com.google.common.base.Optional.fromNullable(folder), com.google.common.base.Optional.fromNullable(objectId), com.google.common.base.Optional.fromNullable(objectQuery), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static UserBookmark create(final String name, final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<String> folder, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
        return new UserBookmark(name, userId, folder, objectId, objectQuery, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof UserBookmark)) {
            return false;
        }

        final UserBookmark other = (UserBookmark)otherObject;

        if (!(getName().equals(other.getName()))) {
            return false;
        }

        if (!(getUserId().equals(other.getUserId()))) {
            return false;
        }

        if (!(((getFolder().isPresent() && other.getFolder().isPresent()) ? (getFolder().get().equals(other.getFolder().get())) : (!getFolder().isPresent() && !other.getFolder().isPresent())))) {
            return false;
        }

        if (!(((getObjectId().isPresent() && other.getObjectId().isPresent()) ? (getObjectId().get().equals(other.getObjectId().get())) : (!getObjectId().isPresent() && !other.getObjectId().isPresent())))) {
            return false;
        }

        if (!(((getObjectQuery().isPresent() && other.getObjectQuery().isPresent()) ? (getObjectQuery().get().equals(other.getObjectQuery().get())) : (!getObjectQuery().isPresent() && !other.getObjectQuery().isPresent())))) {
            return false;
        }

        return true;
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> getObjectId() {
        return objectId;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> getObjectQuery() {
        return objectQuery;
    }

    public final org.dressdiscover.api.models.user.UserId getUserId() {
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

    public static UserBookmark readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static UserBookmark readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static UserBookmark readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String name = null;
        org.dressdiscover.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            name = iprot.readString();
            try {
                userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
            }
            if (__list.getSize() > 2) {
                folder = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    objectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 4) {
                objectQuery = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new UserBookmark(DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateUserId(userId), DefaultReadValidator.getInstance().validateFolder(folder), DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateObjectQuery(objectQuery), NopConstructionValidator.getInstance());
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static UserBookmark readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String name = null;
        org.dressdiscover.api.models.user.UserId userId = null;
        com.google.common.base.Optional<String> folder = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();

        try {
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
                        userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                    }
                    break;
                }
                case "folder": {
                    folder = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "object_id": {
                    try {
                        objectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                    }
                    break;
                }
                case "object_query": {
                    objectQuery = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new UserBookmark(DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateUserId(userId), DefaultReadValidator.getInstance().validateFolder(folder), DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateObjectQuery(objectQuery), NopConstructionValidator.getInstance());
    }

    public UserBookmark replaceFolder(final com.google.common.base.Optional<String> folder) {
        return new UserBookmark(this.name, this.userId, DefaultConstructionValidator.getInstance().validateFolder(folder), this.objectId, this.objectQuery, NopConstructionValidator.getInstance());
    }

    public UserBookmark replaceFolder(final String folder) {
        return replaceFolder(com.google.common.base.Optional.fromNullable(folder));
    }

    public UserBookmark replaceName(final String name) {
        return new UserBookmark(DefaultConstructionValidator.getInstance().validateName(name), this.userId, this.folder, this.objectId, this.objectQuery, NopConstructionValidator.getInstance());
    }

    public UserBookmark replaceObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId) {
        return new UserBookmark(this.name, this.userId, this.folder, DefaultConstructionValidator.getInstance().validateObjectId(objectId), this.objectQuery, NopConstructionValidator.getInstance());
    }

    public UserBookmark replaceObjectId(final org.dressdiscover.api.models.object.ObjectId objectId) {
        return replaceObjectId(com.google.common.base.Optional.fromNullable(objectId));
    }

    public UserBookmark replaceObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery) {
        return new UserBookmark(this.name, this.userId, this.folder, this.objectId, DefaultConstructionValidator.getInstance().validateObjectQuery(objectQuery), NopConstructionValidator.getInstance());
    }

    public UserBookmark replaceObjectQuery(final org.dressdiscover.api.models.object.ObjectQuery objectQuery) {
        return replaceObjectQuery(com.google.common.base.Optional.fromNullable(objectQuery));
    }

    public UserBookmark replaceUserId(final org.dressdiscover.api.models.user.UserId userId) {
        return new UserBookmark(this.name, DefaultConstructionValidator.getInstance().validateUserId(userId), this.folder, this.objectId, this.objectQuery, NopConstructionValidator.getInstance());
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
        oprot.writeStructBegin("org.dressdiscover.api.models.user.UserBookmark");
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

    private final org.dressdiscover.api.models.user.UserId userId;

    private final com.google.common.base.Optional<String> folder;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> objectId;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> objectQuery;
}
