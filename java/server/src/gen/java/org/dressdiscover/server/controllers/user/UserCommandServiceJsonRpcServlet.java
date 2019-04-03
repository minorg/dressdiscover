package org.dressdiscover.server.controllers.user;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class UserCommandServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public UserCommandServiceJsonRpcServlet(final org.dressdiscover.api.services.user.UserCommandService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "delete_user_bookmark_by_id": return __dispatchDeleteUserBookmarkById(iprot);
        case "delete_user_by_id": return __dispatchDeleteUserById(iprot);
        case "delete_users": return __dispatchDeleteUsers(iprot);
        case "post_user": return __dispatchPostUser(iprot);
        case "post_user_bookmark": return __dispatchPostUserBookmark(iprot);
        case "put_user": return __dispatchPutUser(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.DeleteUserBookmarkByIdResponse __dispatchDeleteUserBookmarkById(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.DeleteUserBookmarkByIdRequest serviceRequest = _readRequest(iprot, Messages.DeleteUserBookmarkByIdRequest.Factory.INSTANCE);
        try {
            service.deleteUserBookmarkById(serviceRequest.getId()); return Messages.DeleteUserBookmarkByIdResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserBookmarkException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.DeleteUserByIdResponse __dispatchDeleteUserById(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.DeleteUserByIdRequest serviceRequest = _readRequest(iprot, Messages.DeleteUserByIdRequest.Factory.INSTANCE);
        try {
            service.deleteUserById(serviceRequest.getId()); return Messages.DeleteUserByIdResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.DeleteUsersResponse __dispatchDeleteUsers(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        try {
            service.deleteUsers(); return Messages.DeleteUsersResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.PostUserResponse __dispatchPostUser(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PostUserRequest serviceRequest = _readRequest(iprot, Messages.PostUserRequest.Factory.INSTANCE);
        try {
            return new Messages.PostUserResponse(service.postUser(serviceRequest.getUser()));
        } catch (final org.dressdiscover.api.services.user.DuplicateUserException | org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.PostUserBookmarkResponse __dispatchPostUserBookmark(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PostUserBookmarkRequest serviceRequest = _readRequest(iprot, Messages.PostUserBookmarkRequest.Factory.INSTANCE);
        try {
            return new Messages.PostUserBookmarkResponse(service.postUserBookmark(serviceRequest.getUserBookmark()));
        } catch (final org.dressdiscover.api.services.user.DuplicateUserBookmarkException | org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.PutUserResponse __dispatchPutUser(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PutUserRequest serviceRequest = _readRequest(iprot, Messages.PutUserRequest.Factory.INSTANCE);
        try {
            service.putUser(serviceRequest.getId(), serviceRequest.getUser()); return Messages.PutUserResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.user.UserCommandService service;

    private final static class Messages {
        public final static class DeleteUserBookmarkByIdRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, DeleteUserBookmarkByIdRequest> {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteUserBookmarkByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteUserBookmarkByIdRequest _build(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                    return new DeleteUserBookmarkByIdRequest(id);
                }

                public DeleteUserBookmarkByIdRequest build() {
                    Validator.validate(id);

                    return _build(id);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmarkId getId() {
                    return id;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        try {
                            this.setId(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
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
                                    this.setId(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
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
                    case ID: setId((org.dressdiscover.api.models.user.UserBookmarkId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                    Validator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final DeleteUserBookmarkByIdRequest other) {
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

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmarkId id;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteUserBookmarkByIdRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public DeleteUserBookmarkByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserBookmarkByIdRequest.readAsList(iprot);
                }

                @Override
                public DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserBookmarkByIdRequest.readAsStruct(iprot);
                }

                @Override
                public DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserBookmarkByIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmarkId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING);

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
                public static void validate(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                    validateId(id);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.DeleteUserBookmarkByIdRequest: id is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public DeleteUserBookmarkByIdRequest(final DeleteUserBookmarkByIdRequest other) {
                this(other.getId());
            }

            /**
             * Total constructor
             */
            public DeleteUserBookmarkByIdRequest(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                Validator.validate(id);
                this.id = id;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserBookmarkByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserBookmarkByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUserBookmarkByIdRequest)) {
                    return false;
                }

                final DeleteUserBookmarkByIdRequest other = (DeleteUserBookmarkByIdRequest)otherObject;

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

            public final org.dressdiscover.api.models.user.UserBookmarkId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                return getId().hashCode();
            }

            public static DeleteUserBookmarkByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public DeleteUserBookmarkByIdRequest replaceId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
                Validator.validateId(id);
                return new DeleteUserBookmarkByIdRequest(id);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUserBookmarkByIdRequest");
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

            private final org.dressdiscover.api.models.user.UserBookmarkId id;
        }

        public final static class DeleteUserBookmarkByIdResponse implements org.thryft.Struct {
            private DeleteUserBookmarkByIdResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUserBookmarkByIdResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUserBookmarkByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static DeleteUserBookmarkByIdResponse INSTANCE = new DeleteUserBookmarkByIdResponse();
        }

        public final static class DeleteUserByIdRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, DeleteUserByIdRequest> {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteUserByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteUserByIdRequest _build(final org.dressdiscover.api.models.user.UserId id) {
                    return new DeleteUserByIdRequest(id);
                }

                public DeleteUserByIdRequest build() {
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

                public Builder setIfPresent(final DeleteUserByIdRequest other) {
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

            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteUserByIdRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public DeleteUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserByIdRequest.readAsList(iprot);
                }

                @Override
                public DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserByIdRequest.readAsStruct(iprot);
                }

                @Override
                public DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUserByIdRequest.readAsStruct(iprot, unknownFieldCallback);
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
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.DeleteUserByIdRequest: id is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public DeleteUserByIdRequest(final DeleteUserByIdRequest other) {
                this(other.getId());
            }

            /**
             * Total constructor
             */
            public DeleteUserByIdRequest(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validate(id);
                this.id = id;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUserByIdRequest)) {
                    return false;
                }

                final DeleteUserByIdRequest other = (DeleteUserByIdRequest)otherObject;

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

            public static DeleteUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public DeleteUserByIdRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validateId(id);
                return new DeleteUserByIdRequest(id);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUserByIdRequest");
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

        public final static class DeleteUserByIdResponse implements org.thryft.Struct {
            private DeleteUserByIdResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUserByIdResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUserByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static DeleteUserByIdResponse INSTANCE = new DeleteUserByIdResponse();
        }

        public final static class DeleteUsersRequest implements org.thryft.Struct {
            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteUsersRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public DeleteUsersRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUsersRequest.readAsList(iprot);
                }

                @Override
                public DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUsersRequest.readAsStruct(iprot);
                }

                @Override
                public DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteUsersRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            private DeleteUsersRequest() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUsersRequest)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                return 17;
            }

            public static DeleteUsersRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                return INSTANCE;
            }

            public static DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    unknownFieldCallback.apply(ifield);
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return INSTANCE;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUsersRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static DeleteUsersRequest INSTANCE = new DeleteUsersRequest();
        }

        public final static class DeleteUsersResponse implements org.thryft.Struct {
            private DeleteUsersResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteUsersResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.DeleteUsersResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static DeleteUsersResponse INSTANCE = new DeleteUsersResponse();
        }

        public final static class PostUserRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PostUserRequest> {
                public Builder() {
                    user = null;
                }

                public Builder(final PostUserRequest other) {
                    this.user = other.getUser();
                }

                protected PostUserRequest _build(final org.dressdiscover.api.models.user.User user) {
                    return new PostUserRequest(user);
                }

                public PostUserRequest build() {
                    Validator.validate(user);

                    return _build(user);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.User getUser() {
                    return user;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        this.setUser(org.dressdiscover.api.models.user.User.readAsStruct(iprot));
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
                            case "user": {
                                this.setUser(org.dressdiscover.api.models.user.User.readAsStruct(iprot, unknownFieldCallback));
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
                    case USER: setUser((org.dressdiscover.api.models.user.User)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final PostUserRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setUser(other.getUser());

                    return this;
                }

                public Builder setUser(final org.dressdiscover.api.models.user.User user) {
                    Validator.validateUser(user);
                    this.user = user;
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
                    case USER: return unsetUser();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetUser() {
                    this.user = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.User user;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PostUserRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public PostUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PostUserRequest.readAsList(iprot);
                }

                @Override
                public PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PostUserRequest.readAsStruct(iprot);
                }

                @Override
                public PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PostUserRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER("user", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.User>() {}, true, (short)0, "user", "user", org.thryft.protocol.Type.STRUCT);

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
                    case "user": return USER;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "user": return USER;
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
                public static void validate(final org.dressdiscover.api.models.user.User user) {
                    validateUser(user);
                }

                public static void validateUser(final org.dressdiscover.api.models.user.User user) {
                    if (user == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PostUserRequest: user is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PostUserRequest(final PostUserRequest other) {
                this(other.getUser());
            }

            /**
             * Total constructor
             */
            public PostUserRequest(final org.dressdiscover.api.models.user.User user) {
                Validator.validate(user);
                this.user = user;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PostUserRequest)) {
                    return false;
                }

                final PostUserRequest other = (PostUserRequest)otherObject;

                if (!(getUser().equals(other.getUser()))) {
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
                case USER: return getUser();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.User getUser() {
                return user;
            }

            @Override
            public int hashCode() {
                return getUser().hashCode();
            }

            public static PostUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PostUserRequest replaceUser(final org.dressdiscover.api.models.user.User user) {
                Validator.validateUser(user);
                return new PostUserRequest(user);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user", getUser()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PostUserRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getUser().writeAsStruct(oprot);
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeUserField(oprot);

                oprot.writeFieldStop();
            }

            public void writeUserField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.USER);
                getUser().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.User user;
        }

        public final static class PostUserResponse implements org.thryft.Struct {
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRING);

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
                public static void validate(final org.dressdiscover.api.models.user.UserId returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserId returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PostUserResponse: returnValue is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PostUserResponse(final PostUserResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             */
            public PostUserResponse(final org.dressdiscover.api.models.user.UserId returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PostUserResponse)) {
                    return false;
                }

                final PostUserResponse other = (PostUserResponse)otherObject;

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

            public final org.dressdiscover.api.models.user.UserId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                return getReturnValue().hashCode();
            }

            public PostUserResponse replaceReturnValue(final org.dressdiscover.api.models.user.UserId returnValue) {
                Validator.validateReturnValue(returnValue);
                return new PostUserResponse(returnValue);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PostUserResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getReturnValue().toString());
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                oprot.writeString(getReturnValue().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserId returnValue;
        }

        public final static class PostUserBookmarkRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PostUserBookmarkRequest> {
                public Builder() {
                    userBookmark = null;
                }

                public Builder(final PostUserBookmarkRequest other) {
                    this.userBookmark = other.getUserBookmark();
                }

                protected PostUserBookmarkRequest _build(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                    return new PostUserBookmarkRequest(userBookmark);
                }

                public PostUserBookmarkRequest build() {
                    Validator.validate(userBookmark);

                    return _build(userBookmark);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmark getUserBookmark() {
                    return userBookmark;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        this.setUserBookmark(org.dressdiscover.api.models.user.UserBookmark.readAsStruct(iprot));
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
                            case "user_bookmark": {
                                this.setUserBookmark(org.dressdiscover.api.models.user.UserBookmark.readAsStruct(iprot, unknownFieldCallback));
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
                    case USER_BOOKMARK: setUserBookmark((org.dressdiscover.api.models.user.UserBookmark)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final PostUserBookmarkRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setUserBookmark(other.getUserBookmark());

                    return this;
                }

                public Builder setUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                    Validator.validateUserBookmark(userBookmark);
                    this.userBookmark = userBookmark;
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
                    case USER_BOOKMARK: return unsetUserBookmark();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetUserBookmark() {
                    this.userBookmark = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmark userBookmark;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PostUserBookmarkRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public PostUserBookmarkRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PostUserBookmarkRequest.readAsList(iprot);
                }

                @Override
                public PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PostUserBookmarkRequest.readAsStruct(iprot);
                }

                @Override
                public PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PostUserBookmarkRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER_BOOKMARK("userBookmark", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmark>() {}, true, (short)0, "user_bookmark", "user_bookmark", org.thryft.protocol.Type.STRUCT);

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
                    case "userBookmark": return USER_BOOKMARK;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "user_bookmark": return USER_BOOKMARK;
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
                public static void validate(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                    validateUserBookmark(userBookmark);
                }

                public static void validateUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                    if (userBookmark == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PostUserBookmarkRequest: userBookmark is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PostUserBookmarkRequest(final PostUserBookmarkRequest other) {
                this(other.getUserBookmark());
            }

            /**
             * Total constructor
             */
            public PostUserBookmarkRequest(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                Validator.validate(userBookmark);
                this.userBookmark = userBookmark;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserBookmarkRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserBookmarkRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PostUserBookmarkRequest)) {
                    return false;
                }

                final PostUserBookmarkRequest other = (PostUserBookmarkRequest)otherObject;

                if (!(getUserBookmark().equals(other.getUserBookmark()))) {
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
                case USER_BOOKMARK: return getUserBookmark();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.UserBookmark getUserBookmark() {
                return userBookmark;
            }

            @Override
            public int hashCode() {
                return getUserBookmark().hashCode();
            }

            public static PostUserBookmarkRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PostUserBookmarkRequest replaceUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
                Validator.validateUserBookmark(userBookmark);
                return new PostUserBookmarkRequest(userBookmark);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user_bookmark", getUserBookmark()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PostUserBookmarkRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getUserBookmark().writeAsStruct(oprot);
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeUserBookmarkField(oprot);

                oprot.writeFieldStop();
            }

            public void writeUserBookmarkField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.USER_BOOKMARK);
                getUserBookmark().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserBookmark userBookmark;
        }

        public final static class PostUserBookmarkResponse implements org.thryft.Struct {
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmarkId>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRING);

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
                public static void validate(final org.dressdiscover.api.models.user.UserBookmarkId returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserBookmarkId returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PostUserBookmarkResponse: returnValue is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PostUserBookmarkResponse(final PostUserBookmarkResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             */
            public PostUserBookmarkResponse(final org.dressdiscover.api.models.user.UserBookmarkId returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PostUserBookmarkResponse)) {
                    return false;
                }

                final PostUserBookmarkResponse other = (PostUserBookmarkResponse)otherObject;

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

            public final org.dressdiscover.api.models.user.UserBookmarkId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                return getReturnValue().hashCode();
            }

            public PostUserBookmarkResponse replaceReturnValue(final org.dressdiscover.api.models.user.UserBookmarkId returnValue) {
                Validator.validateReturnValue(returnValue);
                return new PostUserBookmarkResponse(returnValue);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PostUserBookmarkResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getReturnValue().toString());
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                oprot.writeString(getReturnValue().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserBookmarkId returnValue;
        }

        public final static class PutUserRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PutUserRequest> {
                public Builder() {
                    id = null;
                    user = null;
                }

                public Builder(final PutUserRequest other) {
                    this.id = other.getId();
                    this.user = other.getUser();
                }

                protected PutUserRequest _build(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) {
                    return new PutUserRequest(id, user);
                }

                public PutUserRequest build() {
                    Validator.validate(id, user);

                    return _build(id, user);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getId() {
                    return id;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.User getUser() {
                    return user;
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
                        this.setUser(org.dressdiscover.api.models.user.User.readAsStruct(iprot));
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
                            case "user": {
                                this.setUser(org.dressdiscover.api.models.user.User.readAsStruct(iprot, unknownFieldCallback));
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
                    case USER: setUser((org.dressdiscover.api.models.user.User)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.user.UserId id) {
                    Validator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final PutUserRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());
                    setUser(other.getUser());

                    return this;
                }

                public Builder setUser(final org.dressdiscover.api.models.user.User user) {
                    Validator.validateUser(user);
                    this.user = user;
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
                    case USER: return unsetUser();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unsetUser() {
                    this.user = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId id;
                private @javax.annotation.Nullable org.dressdiscover.api.models.user.User user;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutUserRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public PutUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutUserRequest.readAsList(iprot);
                }

                @Override
                public PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutUserRequest.readAsStruct(iprot);
                }

                @Override
                public PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutUserRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING),
                USER("user", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.User>() {}, true, (short)0, "user", "user", org.thryft.protocol.Type.STRUCT);

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
                    case "user": return USER;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
                    case "user": return USER;
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
                public static void validate(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) {
                    validateId(id);
                    validateUser(user);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PutUserRequest: id is missing");
                    }
                }

                public static void validateUser(final org.dressdiscover.api.models.user.User user) {
                    if (user == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PutUserRequest: user is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutUserRequest(final PutUserRequest other) {
                this(other.getId(), other.getUser());
            }

            /**
             * Total constructor
             */
            public PutUserRequest(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) {
                Validator.validate(id, user);
                this.id = id;
                this.user = user;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutUserRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutUserRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutUserRequest)) {
                    return false;
                }

                final PutUserRequest other = (PutUserRequest)otherObject;

                if (!(getId().equals(other.getId()))) {
                    return false;
                }

                if (!(getUser().equals(other.getUser()))) {
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
                case USER: return getUser();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.UserId getId() {
                return id;
            }

            public final org.dressdiscover.api.models.user.User getUser() {
                return user;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                hashCode = 31 * hashCode + getUser().hashCode();
                return hashCode;
            }

            public static PutUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PutUserRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validateId(id);
                return new PutUserRequest(id, this.user);
            }

            public PutUserRequest replaceUser(final org.dressdiscover.api.models.user.User user) {
                Validator.validateUser(user);
                return new PutUserRequest(this.id, user);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("user", getUser()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PutUserRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getId().toString());
                getUser().writeAsStruct(oprot);
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeIdField(oprot);

                writeUserField(oprot);

                oprot.writeFieldStop();
            }

            public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ID);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();
            }

            public void writeUserField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.USER);
                getUser().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserId id;

            private final org.dressdiscover.api.models.user.User user;
        }

        public final static class PutUserResponse implements org.thryft.Struct {
            private PutUserResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutUserResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PutUserResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutUserResponse INSTANCE = new PutUserResponse();
        }
    }
}
