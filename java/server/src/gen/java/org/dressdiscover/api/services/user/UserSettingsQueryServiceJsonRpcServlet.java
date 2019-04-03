package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class UserSettingsQueryServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public UserSettingsQueryServiceJsonRpcServlet(final org.dressdiscover.api.services.user.UserSettingsQueryService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "get_user_settings": return __dispatchGetUserSettings(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.GetUserSettingsResponse __dispatchGetUserSettings(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.GetUserSettingsRequest serviceRequest = _readRequest(iprot, Messages.GetUserSettingsRequest.Factory.INSTANCE);
        try {
            return new Messages.GetUserSettingsResponse(service.getUserSettings(serviceRequest.getId()));
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException | org.dressdiscover.api.services.user.NoSuchUserSettingsException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.user.UserSettingsQueryService service;

    private final static class Messages {
        public final static class GetUserSettingsRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GetUserSettingsRequest> {
                public Builder() {
                    id = null;
                }

                public Builder(final GetUserSettingsRequest other) {
                    this.id = other.getId();
                }

                protected GetUserSettingsRequest _build(final org.dressdiscover.api.models.user.UserId id) {
                    return new GetUserSettingsRequest(id);
                }

                public GetUserSettingsRequest build() {
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

                public Builder setIfPresent(final GetUserSettingsRequest other) {
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

            public final static class Factory implements org.thryft.CompoundType.Factory<GetUserSettingsRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public GetUserSettingsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserSettingsRequest.readAsList(iprot);
                }

                @Override
                public GetUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetUserSettingsRequest.readAsStruct(iprot);
                }

                @Override
                public GetUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetUserSettingsRequest.readAsStruct(iprot, unknownFieldCallback);
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
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserSettingsRequest: id is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserSettingsRequest(final GetUserSettingsRequest other) {
                this(other.getId());
            }

            /**
             * Total constructor
             */
            public GetUserSettingsRequest(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validate(id);
                this.id = id;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetUserSettingsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetUserSettingsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserSettingsRequest)) {
                    return false;
                }

                final GetUserSettingsRequest other = (GetUserSettingsRequest)otherObject;

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

            public static GetUserSettingsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static GetUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static GetUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public GetUserSettingsRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validateId(id);
                return new GetUserSettingsRequest(id);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserSettingsRequest");
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

        public final static class GetUserSettingsResponse implements org.thryft.Struct {
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserSettings>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRUCT);

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
                public static void validate(final org.dressdiscover.api.models.user.UserSettings returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.models.user.UserSettings returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.GetUserSettingsResponse: returnValue is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetUserSettingsResponse(final GetUserSettingsResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             */
            public GetUserSettingsResponse(final org.dressdiscover.api.models.user.UserSettings returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetUserSettingsResponse)) {
                    return false;
                }

                final GetUserSettingsResponse other = (GetUserSettingsResponse)otherObject;

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

            public final org.dressdiscover.api.models.user.UserSettings getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                return getReturnValue().hashCode();
            }

            public GetUserSettingsResponse replaceReturnValue(final org.dressdiscover.api.models.user.UserSettings returnValue) {
                Validator.validateReturnValue(returnValue);
                return new GetUserSettingsResponse(returnValue);
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.GetUserSettingsResponse");
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

            private final org.dressdiscover.api.models.user.UserSettings returnValue;
        }
    }
}
