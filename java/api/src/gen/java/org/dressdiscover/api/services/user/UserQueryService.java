package org.dressdiscover.api.services.user;

public interface UserQueryService {
    public enum FunctionMetadata {
        GET_USER_BOOKMARKS_BY_USER_ID("get_user_bookmarks_by_user_id"),
        GET_USER_BY_EMAIL_ADDRESS("get_user_by_email_address"),
        GET_USER_BY_ID("get_user_by_id");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetUserBookmarksByUserIdRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    userId = null;
                    objectIdsOnly = com.google.common.base.Optional.<Boolean> absent();
                }

                public Builder(final GetUserBookmarksByUserIdRequest other) {
                    this.userId = other.getUserId();
                    this.objectIdsOnly = other.getObjectIdsOnly();
                }

                protected GetUserBookmarksByUserIdRequest _build(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    return new GetUserBookmarksByUserIdRequest(userId, objectIdsOnly);
                }

                public GetUserBookmarksByUserIdRequest build() {
                    UncheckedValidator.validate(userId, objectIdsOnly);

                    return _build(userId, objectIdsOnly);
                }

                public final com.google.common.base.Optional<Boolean> getObjectIdsOnly() {
                    return objectIdsOnly;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getUserId() {
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
                        try {
                            userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        }
                        if (__list.getSize() > 1) {
                            objectIdsOnly = org.thryft.Optionals.of(iprot.readBool());
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
                            case "user_id": {
                                try {
                                    userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                                }
                                break;
                            }
                            case "object_ids_only": {
                                objectIdsOnly = org.thryft.Optionals.of(iprot.readBool());
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
                    case USER_ID: setUserId((org.dressdiscover.api.models.user.UserId)value); return this;
                    case OBJECT_IDS_ONLY: setObjectIdsOnly((Boolean)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetUserBookmarksByUserIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setUserId(other.getUserId());
                    if (other.getObjectIdsOnly().isPresent()) {
                        setObjectIdsOnly(other.getObjectIdsOnly());
                    }

                    return this;
                }

                public Builder setObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    UncheckedValidator.validateObjectIdsOnly(objectIdsOnly);
                    this.objectIdsOnly = objectIdsOnly;
                    return this;
                }

                public Builder setObjectIdsOnly(final @javax.annotation.Nullable Boolean objectIdsOnly) {
                    return setObjectIdsOnly(org.thryft.Optionals.fromNullable(objectIdsOnly));
                }

                public Builder setObjectIdsOnly(final boolean objectIdsOnly) {
                    return setObjectIdsOnly(org.thryft.Optionals.of(objectIdsOnly));
                }

                public Builder setUserId(final org.dressdiscover.api.models.user.UserId userId) {
                    UncheckedValidator.validateUserId(userId);
                    this.userId = userId;
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
                    case USER_ID: return unsetUserId();
                    case OBJECT_IDS_ONLY: return unsetObjectIdsOnly();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetObjectIdsOnly() {
                    this.objectIdsOnly = com.google.common.base.Optional.<Boolean> absent();
                    return this;
                }

                public Builder unsetUserId() {
                    this.userId = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId userId;
                private com.google.common.base.Optional<Boolean> objectIdsOnly;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserBookmarksByUserIdRequest> {
                @Override
                public GetUserBookmarksByUserIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAs(iprot, type);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsList(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "user_id", org.thryft.protocol.Type.STRING),
                OBJECT_IDS_ONLY("objectIdsOnly", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "object_ids_only", org.thryft.protocol.Type.BOOL);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "userId": return USER_ID;
                    case "objectIdsOnly": return OBJECT_IDS_ONLY;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "user_id": return USER_ID;
                    case "object_ids_only": return OBJECT_IDS_ONLY;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.thryft.protocol.InputProtocolException {
                    validateUserId(userId);
                    validateObjectIdsOnly(objectIdsOnly);
                }

                public static void validateUserId(final org.dressdiscover.api.models.user.UserId userId) throws org.thryft.protocol.InputProtocolException {
                    if (userId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.USER_ID, "org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: userId is null");
                    }
                }

                public static void validateObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.thryft.protocol.InputProtocolException {
                    if (objectIdsOnly == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_IDS_ONLY, "org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: objectIdsOnly is null");
                    }
                    if (!objectIdsOnly.isPresent()) {
                        return;
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    validateUserId(userId);
                    validateObjectIdsOnly(objectIdsOnly);
                }

                public static void validateUserId(final org.dressdiscover.api.models.user.UserId userId) {
                    if (userId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: userId is null");
                    }
                }

                public static void validateObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    if (objectIdsOnly == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: objectIdsOnly is null");
                    }
                    if (!objectIdsOnly.isPresent()) {
                        return;
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserBookmarksByUserIdRequest(final GetUserBookmarksByUserIdRequest other) {
                this(other.getUserId(), other.getObjectIdsOnly());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserBookmarksByUserIdRequest(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                this.userId = userId;
                this.objectIdsOnly = objectIdsOnly;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserBookmarksByUserIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserBookmarksByUserIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Required factory method
             */
            public static GetUserBookmarksByUserIdRequest create(final org.dressdiscover.api.models.user.UserId userId) {
                UncheckedValidator.validate(userId, com.google.common.base.Optional.<Boolean> absent());
                return new GetUserBookmarksByUserIdRequest(userId, com.google.common.base.Optional.<Boolean> absent());
            }

            /**
             * Total Nullable factory method
             */
            public static GetUserBookmarksByUserIdRequest create(final org.dressdiscover.api.models.user.UserId userId, @javax.annotation.Nullable final Boolean objectIdsOnly) {
                final com.google.common.base.Optional<Boolean> objectIdsOnlyOptional = org.thryft.Optionals.fromNullable(objectIdsOnly);
                UncheckedValidator.validate(userId, objectIdsOnlyOptional);
                return new GetUserBookmarksByUserIdRequest(userId, objectIdsOnlyOptional);
            }

            /**
             * Optional factory method
             */
            public static GetUserBookmarksByUserIdRequest create(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                UncheckedValidator.validate(userId, objectIdsOnly);
                return new GetUserBookmarksByUserIdRequest(userId, objectIdsOnly);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserBookmarksByUserIdRequest)) {
                    return false;
                }

                final GetUserBookmarksByUserIdRequest other = (GetUserBookmarksByUserIdRequest)otherObject;

                if (!(getUserId().equals(other.getUserId()))) {
                    return false;
                }

                if (!(((getObjectIdsOnly().isPresent() && other.getObjectIdsOnly().isPresent()) ? (getObjectIdsOnly().get().booleanValue() == other.getObjectIdsOnly().get().booleanValue()) : (!getObjectIdsOnly().isPresent() && !other.getObjectIdsOnly().isPresent())))) {
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
                case USER_ID: return getUserId();
                case OBJECT_IDS_ONLY: return getObjectIdsOnly();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.base.Optional<Boolean> getObjectIdsOnly() {
                return objectIdsOnly;
            }

            public final org.dressdiscover.api.models.user.UserId getUserId() {
                return userId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getUserId().hashCode();
                if (getObjectIdsOnly().isPresent()) {
                    hashCode = 31 * hashCode + (getObjectIdsOnly().get() ? 1 : 0);
                }
                return hashCode;
            }

            public static GetUserBookmarksByUserIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserBookmarksByUserIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserBookmarksByUserIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.user.UserId userId;
                com.google.common.base.Optional<Boolean> objectIdsOnly = com.google.common.base.Optional.<Boolean> absent();

                try {
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    try {
                        userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                    }
                    if (__list.getSize() > 1) {
                        objectIdsOnly = org.thryft.Optionals.of(iprot.readBool());
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(userId, objectIdsOnly);

                return new GetUserBookmarksByUserIdRequest(userId, objectIdsOnly);
            }

            public static GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId userId = null;
                com.google.common.base.Optional<Boolean> objectIdsOnly = com.google.common.base.Optional.<Boolean> absent();

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "user_id": {
                            try {
                                userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                            }
                            break;
                        }
                        case "object_ids_only": {
                            objectIdsOnly = org.thryft.Optionals.of(iprot.readBool());
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

                ReadValidator.validate(userId, objectIdsOnly);

                return new GetUserBookmarksByUserIdRequest(userId, objectIdsOnly);
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                UncheckedValidator.validateObjectIdsOnly(objectIdsOnly);
                return new GetUserBookmarksByUserIdRequest(this.userId, objectIdsOnly);
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(@javax.annotation.Nullable final Boolean objectIdsOnly) {
                return replaceObjectIdsOnly(org.thryft.Optionals.fromNullable(objectIdsOnly));
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(final boolean objectIdsOnly) {
                return replaceObjectIdsOnly(org.thryft.Optionals.of(objectIdsOnly));
            }

            public GetUserBookmarksByUserIdRequest replaceUserId(final org.dressdiscover.api.models.user.UserId userId) {
                UncheckedValidator.validateUserId(userId);
                return new GetUserBookmarksByUserIdRequest(userId, this.objectIdsOnly);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user_id", getUserId()).add("object_ids_only", getObjectIdsOnly().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeString(getUserId().toString());

                if (getObjectIdsOnly().isPresent()) {
                    oprot.writeBool(getObjectIdsOnly().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeUserIdField(oprot);

                writeObjectIdsOnlyField(oprot);

                oprot.writeFieldStop();
            }

            public void writeObjectIdsOnlyField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getObjectIdsOnly().isPresent()) {
                    oprot.writeFieldBegin(FieldMetadata.OBJECT_IDS_ONLY);
                    oprot.writeBool(getObjectIdsOnly().get());
                    oprot.writeFieldEnd();
                }
            }

            public void writeUserIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.USER_ID);
                oprot.writeString(getUserId().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserId userId;

            private final com.google.common.base.Optional<Boolean> objectIdsOnly;
        }

        public final static class GetUserBookmarksByUserIdResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetUserBookmarksByUserIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetUserBookmarksByUserIdResponse _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    return new GetUserBookmarksByUserIdResponse(returnValue);
                }

                public GetUserBookmarksByUserIdResponse build() {
                    UncheckedValidator.validate(returnValue);

                    return _build(returnValue);
                }

                public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getReturnValue() {
                    return returnValue;
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
                        iprot.readListBegin();
                        try {
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.user.UserBookmarkEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.user.UserBookmarkEntry.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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
                            case "return_value": {
                                try {
                                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.user.UserBookmarkEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.user.UserBookmarkEntry.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot);
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                                }
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

                @SuppressWarnings({"unchecked"})
                public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

                    switch (fieldMetadata) {
                    case RETURN_VALUE: setReturnValue((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetUserBookmarksByUserIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    UncheckedValidator.validateReturnValue(returnValue);
                    this.returnValue = returnValue;
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserBookmarksByUserIdResponse> {
                @Override
                public GetUserBookmarksByUserIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdResponse.readAs(iprot, type);
                }

                @Override
                public GetUserBookmarksByUserIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserBookmarksByUserIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdResponse.readAsList(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdResponse.readAsStruct(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {}, true, (short)0, "return_value", org.thryft.protocol.Type.LIST);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) throws org.thryft.protocol.InputProtocolException {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.user.GetUserBookmarksByUserIdResponse: returnValue is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdResponse: returnValue is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserBookmarksByUserIdResponse(final GetUserBookmarksByUserIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserBookmarksByUserIdResponse(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserBookmarksByUserIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserBookmarksByUserIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetUserBookmarksByUserIdResponse create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                UncheckedValidator.validate(returnValue);
                return new GetUserBookmarksByUserIdResponse(returnValue);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserBookmarksByUserIdResponse)) {
                    return false;
                }

                final GetUserBookmarksByUserIdResponse other = (GetUserBookmarksByUserIdResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetUserBookmarksByUserIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserBookmarksByUserIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserBookmarksByUserIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue;

                try {
                    iprot.readListBegin();
                    try {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.user.UserBookmarkEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.user.UserBookmarkEntry.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(returnValue);

                return new GetUserBookmarksByUserIdResponse(returnValue);
            }

            public static GetUserBookmarksByUserIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserBookmarksByUserIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            try {
                                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.user.UserBookmarkEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.user.UserBookmarkEntry.readAsStruct(iprot, unknownFieldCallback));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot);
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                            }
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

                ReadValidator.validate(returnValue);

                return new GetUserBookmarksByUserIdResponse(returnValue);
            }

            public GetUserBookmarksByUserIdResponse replaceReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                UncheckedValidator.validateReturnValue(returnValue);
                return new GetUserBookmarksByUserIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.user.UserBookmarkEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.user.UserBookmarkEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }

            private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue;
        }

        public final static class GetUserByEmailAddressRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    emailAddress = null;
                }

                public Builder(final GetUserByEmailAddressRequest other) {
                    this.emailAddress = other.getEmailAddress();
                }

                protected GetUserByEmailAddressRequest _build(final String emailAddress) {
                    return new GetUserByEmailAddressRequest(emailAddress);
                }

                public GetUserByEmailAddressRequest build() {
                    UncheckedValidator.validate(emailAddress);

                    return _build(emailAddress);
                }

                public final @javax.annotation.Nullable String getEmailAddress() {
                    return emailAddress;
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
                        iprot.readListBegin();
                        emailAddress = iprot.readString();
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
                            case "email_address": {
                                emailAddress = iprot.readString();
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
                    case EMAIL_ADDRESS: setEmailAddress((String)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setEmailAddress(final String emailAddress) {
                    UncheckedValidator.validateEmailAddress(emailAddress);
                    this.emailAddress = emailAddress;
                    return this;
                }

                public Builder setIfPresent(final GetUserByEmailAddressRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setEmailAddress(other.getEmailAddress());

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
                    case EMAIL_ADDRESS: return unsetEmailAddress();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetEmailAddress() {
                    this.emailAddress = null;
                    return this;
                }

                private @javax.annotation.Nullable String emailAddress;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserByEmailAddressRequest> {
                @Override
                public GetUserByEmailAddressRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAs(iprot, type);
                }

                @Override
                public GetUserByEmailAddressRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserByEmailAddressRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsList(iprot);
                }

                @Override
                public GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "email_address", org.thryft.protocol.Type.STRING);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "emailAddress": return EMAIL_ADDRESS;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "email_address": return EMAIL_ADDRESS;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final String emailAddress) throws org.thryft.protocol.InputProtocolException {
                    validateEmailAddress(emailAddress);
                }

                public static void validateEmailAddress(final String emailAddress) throws org.thryft.protocol.InputProtocolException {
                    if (emailAddress == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress is null");
                    }
                    if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: not a valid email address");
                    }
                    if (emailAddress.isEmpty()) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: less than min length 1");
                    }
                    {
                        final int __strLen = emailAddress.length();
                        boolean __blank = true;
                        for (int i = 0; i < __strLen; i++) {
                            if (!Character.isWhitespace(emailAddress.charAt(i))) {
                                __blank = false;
                                break;
                            }
                        }
                        if (__blank) {
                            throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, String.format("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                        }
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final String emailAddress) {
                    validateEmailAddress(emailAddress);
                }

                public static void validateEmailAddress(final String emailAddress) {
                    if (emailAddress == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress is null");
                    }
                    if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                        throw new IllegalArgumentException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: not a valid email address");
                    }
                    if (emailAddress.isEmpty()) {
                        throw new IllegalArgumentException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: less than min length 1");
                    }
                    {
                        final int __strLen = emailAddress.length();
                        boolean __blank = true;
                        for (int i = 0; i < __strLen; i++) {
                            if (!Character.isWhitespace(emailAddress.charAt(i))) {
                                __blank = false;
                                break;
                            }
                        }
                        if (__blank) {
                            throw new IllegalArgumentException(String.format("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest.emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                        }
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserByEmailAddressRequest(final GetUserByEmailAddressRequest other) {
                this(other.getEmailAddress());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserByEmailAddressRequest(final String emailAddress) {
                this.emailAddress = emailAddress;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserByEmailAddressRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserByEmailAddressRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetUserByEmailAddressRequest create(final String emailAddress) {
                UncheckedValidator.validate(emailAddress);
                return new GetUserByEmailAddressRequest(emailAddress);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserByEmailAddressRequest)) {
                    return false;
                }

                final GetUserByEmailAddressRequest other = (GetUserByEmailAddressRequest)otherObject;

                if (!(getEmailAddress().equals(other.getEmailAddress()))) {
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
                case EMAIL_ADDRESS: return getEmailAddress();
                default:
                    throw new IllegalStateException();
                }
            }

            public final String getEmailAddress() {
                return emailAddress;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getEmailAddress().hashCode();
                return hashCode;
            }

            public static GetUserByEmailAddressRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByEmailAddressRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserByEmailAddressRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                String emailAddress;

                try {
                    iprot.readListBegin();
                    emailAddress = iprot.readString();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(emailAddress);

                return new GetUserByEmailAddressRequest(emailAddress);
            }

            public static GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable String emailAddress = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "email_address": {
                            emailAddress = iprot.readString();
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

                ReadValidator.validate(emailAddress);

                return new GetUserByEmailAddressRequest(emailAddress);
            }

            public GetUserByEmailAddressRequest replaceEmailAddress(final String emailAddress) {
                UncheckedValidator.validateEmailAddress(emailAddress);
                return new GetUserByEmailAddressRequest(emailAddress);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("email_address", getEmailAddress()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getEmailAddress());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            public void writeEmailAddressField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.EMAIL_ADDRESS);
                oprot.writeString(getEmailAddress());
                oprot.writeFieldEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeEmailAddressField(oprot);

                oprot.writeFieldStop();
            }

            private final String emailAddress;
        }

        public final static class GetUserByEmailAddressResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetUserByEmailAddressResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetUserByEmailAddressResponse _build(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    return new GetUserByEmailAddressResponse(returnValue);
                }

                public GetUserByEmailAddressResponse build() {
                    UncheckedValidator.validate(returnValue);

                    return _build(returnValue);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserEntry getReturnValue() {
                    return returnValue;
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
                        iprot.readListBegin();
                        returnValue = org.dressdiscover.api.models.user.UserEntry.readAsStruct(iprot);
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
                            case "return_value": {
                                returnValue = org.dressdiscover.api.models.user.UserEntry.readAsStruct(iprot, unknownFieldCallback);
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
                    case RETURN_VALUE: setReturnValue((org.dressdiscover.api.models.user.UserEntry)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetUserByEmailAddressResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    UncheckedValidator.validateReturnValue(returnValue);
                    this.returnValue = returnValue;
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserEntry returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserByEmailAddressResponse> {
                @Override
                public GetUserByEmailAddressResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressResponse.readAs(iprot, type);
                }

                @Override
                public GetUserByEmailAddressResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserByEmailAddressResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressResponse.readAsList(iprot);
                }

                @Override
                public GetUserByEmailAddressResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressResponse.readAsStruct(iprot);
                }

                @Override
                public GetUserByEmailAddressResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserEntry>() {}, true, (short)0, "return_value", org.thryft.protocol.Type.STRUCT);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserEntry returnValue) throws org.thryft.protocol.InputProtocolException {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.user.GetUserByEmailAddressResponse: returnValue is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserByEmailAddressResponse: returnValue is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserByEmailAddressResponse(final GetUserByEmailAddressResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserByEmailAddressResponse(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserByEmailAddressResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserByEmailAddressResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetUserByEmailAddressResponse create(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                UncheckedValidator.validate(returnValue);
                return new GetUserByEmailAddressResponse(returnValue);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserByEmailAddressResponse)) {
                    return false;
                }

                final GetUserByEmailAddressResponse other = (GetUserByEmailAddressResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.UserEntry getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetUserByEmailAddressResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByEmailAddressResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserByEmailAddressResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.user.UserEntry returnValue;

                try {
                    iprot.readListBegin();
                    returnValue = org.dressdiscover.api.models.user.UserEntry.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(returnValue);

                return new GetUserByEmailAddressResponse(returnValue);
            }

            public static GetUserByEmailAddressResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByEmailAddressResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.user.UserEntry returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = org.dressdiscover.api.models.user.UserEntry.readAsStruct(iprot, unknownFieldCallback);
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

                ReadValidator.validate(returnValue);

                return new GetUserByEmailAddressResponse(returnValue);
            }

            public GetUserByEmailAddressResponse replaceReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                UncheckedValidator.validateReturnValue(returnValue);
                return new GetUserByEmailAddressResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getReturnValue().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByEmailAddressResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                getReturnValue().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserEntry returnValue;
        }

        public final static class GetUserByIdRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final GetUserByIdRequest other) {
                    this.id = other.getId();
                }

                protected GetUserByIdRequest _build(final org.dressdiscover.api.models.user.UserId id) {
                    return new GetUserByIdRequest(id);
                }

                public GetUserByIdRequest build() {
                    UncheckedValidator.validate(id);

                    return _build(id);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getId() {
                    return id;
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
                        iprot.readListBegin();
                        try {
                            id = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
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
                            case "id": {
                                try {
                                    id = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                }
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
                    case ID: setId((org.dressdiscover.api.models.user.UserId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.user.UserId id) {
                    UncheckedValidator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final GetUserByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

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
                    case ID: return unsetId();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId id;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserByIdRequest> {
                @Override
                public GetUserByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAs(iprot, type);
                }

                @Override
                public GetUserByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsList(iprot);
                }

                @Override
                public GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "id", org.thryft.protocol.Type.STRING);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "id": return ID;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserId id) throws org.thryft.protocol.InputProtocolException {
                    validateId(id);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserId id) throws org.thryft.protocol.InputProtocolException {
                    if (id == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.services.user.GetUserByIdRequest: id is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.user.UserId id) {
                    validateId(id);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserId id) {
                    if (id == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserByIdRequest: id is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserByIdRequest(final GetUserByIdRequest other) {
                this(other.getId());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserByIdRequest(final org.dressdiscover.api.models.user.UserId id) {
                this.id = id;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetUserByIdRequest create(final org.dressdiscover.api.models.user.UserId id) {
                UncheckedValidator.validate(id);
                return new GetUserByIdRequest(id);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserByIdRequest)) {
                    return false;
                }

                final GetUserByIdRequest other = (GetUserByIdRequest)otherObject;

                if (!(getId().equals(other.getId()))) {
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
                case ID: return getId();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.UserId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                return hashCode;
            }

            public static GetUserByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.user.UserId id;

                try {
                    iprot.readListBegin();
                    try {
                        id = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(id);

                return new GetUserByIdRequest(id);
            }

            public static GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId id = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "id": {
                            try {
                                id = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                            }
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

                ReadValidator.validate(id);

                return new GetUserByIdRequest(id);
            }

            public GetUserByIdRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                UncheckedValidator.validateId(id);
                return new GetUserByIdRequest(id);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeIdField(oprot);

                oprot.writeFieldStop();
            }

            public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ID);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserId id;
        }

        public final static class GetUserByIdResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetUserByIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetUserByIdResponse _build(final org.dressdiscover.api.models.user.User returnValue) {
                    return new GetUserByIdResponse(returnValue);
                }

                public GetUserByIdResponse build() {
                    UncheckedValidator.validate(returnValue);

                    return _build(returnValue);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.User getReturnValue() {
                    return returnValue;
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
                        iprot.readListBegin();
                        returnValue = org.dressdiscover.api.models.user.User.readAsStruct(iprot);
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
                            case "return_value": {
                                returnValue = org.dressdiscover.api.models.user.User.readAsStruct(iprot, unknownFieldCallback);
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
                    case RETURN_VALUE: setReturnValue((org.dressdiscover.api.models.user.User)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetUserByIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final org.dressdiscover.api.models.user.User returnValue) {
                    UncheckedValidator.validateReturnValue(returnValue);
                    this.returnValue = returnValue;
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.User returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserByIdResponse> {
                @Override
                public GetUserByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdResponse.readAs(iprot, type);
                }

                @Override
                public GetUserByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetUserByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdResponse.readAsList(iprot);
                }

                @Override
                public GetUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdResponse.readAsStruct(iprot);
                }

                @Override
                public GetUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.User>() {}, true, (short)0, "return_value", org.thryft.protocol.Type.STRUCT);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final org.dressdiscover.api.models.user.User returnValue) throws org.thryft.protocol.InputProtocolException {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.User returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.user.GetUserByIdResponse: returnValue is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.user.User returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.User returnValue) {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.user.GetUserByIdResponse: returnValue is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserByIdResponse(final GetUserByIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetUserByIdResponse(final org.dressdiscover.api.models.user.User returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetUserByIdResponse create(final org.dressdiscover.api.models.user.User returnValue) {
                UncheckedValidator.validate(returnValue);
                return new GetUserByIdResponse(returnValue);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserByIdResponse)) {
                    return false;
                }

                final GetUserByIdResponse other = (GetUserByIdResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.User getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetUserByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetUserByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.user.User returnValue;

                try {
                    iprot.readListBegin();
                    returnValue = org.dressdiscover.api.models.user.User.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(returnValue);

                return new GetUserByIdResponse(returnValue);
            }

            public static GetUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.user.User returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = org.dressdiscover.api.models.user.User.readAsStruct(iprot, unknownFieldCallback);
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

                ReadValidator.validate(returnValue);

                return new GetUserByIdResponse(returnValue);
            }

            public GetUserByIdResponse replaceReturnValue(final org.dressdiscover.api.models.user.User returnValue) {
                UncheckedValidator.validateReturnValue(returnValue);
                return new GetUserByIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getReturnValue().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                getReturnValue().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.User returnValue;
        }
    }

    public default com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        return getUserBookmarksByUserId(userId, com.google.common.base.Optional.<Boolean> absent());
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;

    public org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final String emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;

    public org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;
}
