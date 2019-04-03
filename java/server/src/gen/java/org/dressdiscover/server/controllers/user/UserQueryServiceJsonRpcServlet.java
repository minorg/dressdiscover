package org.dressdiscover.server.controllers.user;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class UserQueryServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public UserQueryServiceJsonRpcServlet(final org.dressdiscover.api.services.user.UserQueryService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "get_user_bookmarks_by_user_id": return __dispatchGetUserBookmarksByUserId(iprot);
        case "get_user_by_email_address": return __dispatchGetUserByEmailAddress(iprot);
        case "get_user_by_id": return __dispatchGetUserById(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.GetUserBookmarksByUserIdResponse __dispatchGetUserBookmarksByUserId(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.GetUserBookmarksByUserIdRequest serviceRequest = _readRequest(iprot, Messages.GetUserBookmarksByUserIdRequest.Factory.INSTANCE);
        try {
            return new Messages.GetUserBookmarksByUserIdResponse(service.getUserBookmarksByUserId(serviceRequest.getUserId(), serviceRequest.getObjectIdsOnly()));
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.GetUserByEmailAddressResponse __dispatchGetUserByEmailAddress(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.GetUserByEmailAddressRequest serviceRequest = _readRequest(iprot, Messages.GetUserByEmailAddressRequest.Factory.INSTANCE);
        try {
            return new Messages.GetUserByEmailAddressResponse(service.getUserByEmailAddress(serviceRequest.getEmailAddress()));
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.GetUserByIdResponse __dispatchGetUserById(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.GetUserByIdRequest serviceRequest = _readRequest(iprot, Messages.GetUserByIdRequest.Factory.INSTANCE);
        try {
            return new Messages.GetUserByIdResponse(service.getUserById(serviceRequest.getId()));
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.user.UserQueryService service;

    private final static class Messages {
        public final static class GetUserBookmarksByUserIdRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GetUserBookmarksByUserIdRequest> {
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
                    Validator.validate(userId, objectIdsOnly);

                    return _build(userId, objectIdsOnly);
                }

                public final com.google.common.base.Optional<Boolean> getObjectIdsOnly() {
                    return objectIdsOnly;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getUserId() {
                    return userId;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                        try {
                            this.setUserId(org.dressdiscover.api.models.user.UserId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        }
                        if (__list.getSize() > 1) {
                            this.setObjectIdsOnly(org.thryft.Optionals.of(iprot.readBool()));
                        }
                        iprot.readListEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                                    this.setUserId(org.dressdiscover.api.models.user.UserId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                                }
                                break;
                            }
                            case "object_ids_only": {
                                this.setObjectIdsOnly(org.thryft.Optionals.of(iprot.readBool()));
                                break;
                            }
                            default:
                                unknownFieldCallback.apply(ifield);
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
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
                    Validator.validateObjectIdsOnly(objectIdsOnly);
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
                    Validator.validateUserId(userId);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public GetUserBookmarksByUserIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsList(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserBookmarksByUserIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "user_id", "user_id", org.thryft.protocol.Type.STRING),
                OBJECT_IDS_ONLY("objectIdsOnly", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "object_ids_only", "object_ids_only", org.thryft.protocol.Type.BOOL);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    validateUserId(userId);
                    validateObjectIdsOnly(objectIdsOnly);
                }

                public static void validateUserId(final org.dressdiscover.api.models.user.UserId userId) {
                    if (userId == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: userId is missing");
                    }
                }

                public static void validateObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                    if (objectIdsOnly == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest: objectIdsOnly is missing");
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
             * Required constructor
             */
            public GetUserBookmarksByUserIdRequest(final org.dressdiscover.api.models.user.UserId userId) {
                this(userId, com.google.common.base.Optional.<Boolean> absent());
            }

            /**
             * Total constructor
             */
            public GetUserBookmarksByUserIdRequest(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                Validator.validate(userId, objectIdsOnly);
                this.userId = userId;
                this.objectIdsOnly = objectIdsOnly;
            }

            /**
             * Total Nullable constructor
             */
            public GetUserBookmarksByUserIdRequest(final org.dressdiscover.api.models.user.UserId userId, @javax.annotation.Nullable final Boolean objectIdsOnly) {
                this(userId, org.thryft.Optionals.fromNullable(objectIdsOnly));
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

            public static GetUserBookmarksByUserIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static GetUserBookmarksByUserIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(final com.google.common.base.Optional<Boolean> objectIdsOnly) {
                Validator.validateObjectIdsOnly(objectIdsOnly);
                return new GetUserBookmarksByUserIdRequest(this.userId, objectIdsOnly);
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(@javax.annotation.Nullable final Boolean objectIdsOnly) {
                return replaceObjectIdsOnly(org.thryft.Optionals.fromNullable(objectIdsOnly));
            }

            public GetUserBookmarksByUserIdRequest replaceObjectIdsOnly(final boolean objectIdsOnly) {
                return replaceObjectIdsOnly(org.thryft.Optionals.of(objectIdsOnly));
            }

            public GetUserBookmarksByUserIdRequest replaceUserId(final org.dressdiscover.api.models.user.UserId userId) {
                Validator.validateUserId(userId);
                return new GetUserBookmarksByUserIdRequest(userId, this.objectIdsOnly);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user_id", getUserId()).add("object_ids_only", getObjectIdsOnly().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getUserId().toString());
                if (getObjectIdsOnly().isPresent()) {
                    oprot.writeBool(getObjectIdsOnly().get());
                } else {
                    oprot.writeNull();
                }
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
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry>>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.LIST);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdResponse: returnValue is missing");
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
             */
            public GetUserBookmarksByUserIdResponse(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
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
                return getReturnValue().hashCode();
            }

            public GetUserBookmarksByUserIdResponse replaceReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> returnValue) {
                Validator.validateReturnValue(returnValue);
                return new GetUserBookmarksByUserIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserBookmarksByUserIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.user.UserBookmarkEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
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
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GetUserByEmailAddressRequest> {
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
                    Validator.validate(emailAddress);

                    return _build(emailAddress);
                }

                public final @javax.annotation.Nullable String getEmailAddress() {
                    return emailAddress;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        this.setEmailAddress(iprot.readString());
                        iprot.readListEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                                break;
                            }
                            switch (ifield.getName()) {
                            case "email_address": {
                                this.setEmailAddress(iprot.readString());
                                break;
                            }
                            default:
                                unknownFieldCallback.apply(ifield);
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
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
                    Validator.validateEmailAddress(emailAddress);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public GetUserByEmailAddressRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsList(iprot);
                }

                @Override
                public GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByEmailAddressRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "email_address", "email_address", org.thryft.protocol.Type.STRING);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final String emailAddress) {
                    validateEmailAddress(emailAddress);
                }

                public static void validateEmailAddress(final String emailAddress) {
                    if (emailAddress == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress is missing");
                    }
                    if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress: not a valid email address");
                    }
                    if (emailAddress.isEmpty()) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress: less than min length 1");
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
                            throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.services.user.GetUserByEmailAddressRequest: emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
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
             */
            public GetUserByEmailAddressRequest(final String emailAddress) {
                Validator.validate(emailAddress);
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
                return getEmailAddress().hashCode();
            }

            public static GetUserByEmailAddressRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static GetUserByEmailAddressRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public GetUserByEmailAddressRequest replaceEmailAddress(final String emailAddress) {
                Validator.validateEmailAddress(emailAddress);
                return new GetUserByEmailAddressRequest(emailAddress);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("email_address", getEmailAddress()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
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
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getEmailAddress());
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeEmailAddressField(oprot);

                oprot.writeFieldStop();
            }

            private final String emailAddress;
        }

        public final static class GetUserByEmailAddressResponse implements org.thryft.Struct {
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserEntry>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRUCT);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByEmailAddressResponse: returnValue is missing");
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
             */
            public GetUserByEmailAddressResponse(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
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
                return getReturnValue().hashCode();
            }

            public GetUserByEmailAddressResponse replaceReturnValue(final org.dressdiscover.api.models.user.UserEntry returnValue) {
                Validator.validateReturnValue(returnValue);
                return new GetUserByEmailAddressResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByEmailAddressResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getReturnValue().writeAsStruct(oprot);
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
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GetUserByIdRequest> {
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
                    Validator.validate(id);

                    return _build(id);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getId() {
                    return id;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        try {
                            this.setId(org.dressdiscover.api.models.user.UserId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        iprot.readListEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                                    this.setId(org.dressdiscover.api.models.user.UserId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                }
                                break;
                            }
                            default:
                                unknownFieldCallback.apply(ifield);
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
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
                    Validator.validateId(id);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public GetUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsList(iprot);
                }

                @Override
                public GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserByIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final org.dressdiscover.api.models.user.UserId id) {
                    validateId(id);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByIdRequest: id is missing");
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
             */
            public GetUserByIdRequest(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validate(id);
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
                return getId().hashCode();
            }

            public static GetUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static GetUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public GetUserByIdRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validateId(id);
                return new GetUserByIdRequest(id);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getId().toString());
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
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.User>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRUCT);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final org.dressdiscover.api.models.user.User returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.User returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserByIdResponse: returnValue is missing");
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
             */
            public GetUserByIdResponse(final org.dressdiscover.api.models.user.User returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
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
                return getReturnValue().hashCode();
            }

            public GetUserByIdResponse replaceReturnValue(final org.dressdiscover.api.models.user.User returnValue) {
                Validator.validateReturnValue(returnValue);
                return new GetUserByIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getReturnValue().writeAsStruct(oprot);
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
}
