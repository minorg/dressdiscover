package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class UserSettingsCommandServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public UserSettingsCommandServiceJsonRpcServlet(final org.dressdiscover.api.services.user.UserSettingsCommandService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "put_user_settings": return __dispatchPutUserSettings(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.PutUserSettingsResponse __dispatchPutUserSettings(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PutUserSettingsRequest serviceRequest = _readRequest(iprot, Messages.PutUserSettingsRequest.Factory.INSTANCE);
        try {
            service.putUserSettings(serviceRequest.getId(), serviceRequest.getUserSettings()); return Messages.PutUserSettingsResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.user.NoSuchUserException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.user.UserSettingsCommandService service;

    private final static class Messages {
        public final static class PutUserSettingsRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PutUserSettingsRequest> {
                public Builder() {
                    id = null;
                    userSettings = null;
                }

                public Builder(final PutUserSettingsRequest other) {
                    this.id = other.getId();
                    this.userSettings = other.getUserSettings();
                }

                protected PutUserSettingsRequest _build(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) {
                    return new PutUserSettingsRequest(id, userSettings);
                }

                public PutUserSettingsRequest build() {
                    Validator.validate(id, userSettings);

                    return _build(id, userSettings);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId getId() {
                    return id;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserSettings getUserSettings() {
                    return userSettings;
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
                        this.setUserSettings(org.dressdiscover.api.models.user.UserSettings.readAsStruct(iprot));
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
                            case "user_settings": {
                                this.setUserSettings(org.dressdiscover.api.models.user.UserSettings.readAsStruct(iprot, unknownFieldCallback));
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
                    case USER_SETTINGS: setUserSettings((org.dressdiscover.api.models.user.UserSettings)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.user.UserId id) {
                    Validator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final PutUserSettingsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());
                    setUserSettings(other.getUserSettings());

                    return this;
                }

                public Builder setUserSettings(final org.dressdiscover.api.models.user.UserSettings userSettings) {
                    Validator.validateUserSettings(userSettings);
                    this.userSettings = userSettings;
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
                    case USER_SETTINGS: return unsetUserSettings();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unsetUserSettings() {
                    this.userSettings = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId id;
                private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserSettings userSettings;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutUserSettingsRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public PutUserSettingsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutUserSettingsRequest.readAsList(iprot);
                }

                @Override
                public PutUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutUserSettingsRequest.readAsStruct(iprot);
                }

                @Override
                public PutUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutUserSettingsRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING),
                USER_SETTINGS("userSettings", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserSettings>() {}, true, (short)0, "user_settings", "user_settings", org.thryft.protocol.Type.STRUCT);

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
                    case "userSettings": return USER_SETTINGS;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
                    case "user_settings": return USER_SETTINGS;
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
                public static void validate(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) {
                    validateId(id);
                    validateUserSettings(userSettings);
                }

                public static void validateId(final org.dressdiscover.api.models.user.UserId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PutUserSettingsRequest: id is missing");
                    }
                }

                public static void validateUserSettings(final org.dressdiscover.api.models.user.UserSettings userSettings) {
                    if (userSettings == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.PutUserSettingsRequest: userSettings is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutUserSettingsRequest(final PutUserSettingsRequest other) {
                this(other.getId(), other.getUserSettings());
            }

            /**
             * Total constructor
             */
            public PutUserSettingsRequest(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) {
                Validator.validate(id, userSettings);
                this.id = id;
                this.userSettings = userSettings;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutUserSettingsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutUserSettingsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutUserSettingsRequest)) {
                    return false;
                }

                final PutUserSettingsRequest other = (PutUserSettingsRequest)otherObject;

                if (!(getId().equals(other.getId()))) {
                    return false;
                }

                if (!(getUserSettings().equals(other.getUserSettings()))) {
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
                case USER_SETTINGS: return getUserSettings();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.user.UserId getId() {
                return id;
            }

            public final org.dressdiscover.api.models.user.UserSettings getUserSettings() {
                return userSettings;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                hashCode = 31 * hashCode + getUserSettings().hashCode();
                return hashCode;
            }

            public static PutUserSettingsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PutUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PutUserSettingsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PutUserSettingsRequest replaceId(final org.dressdiscover.api.models.user.UserId id) {
                Validator.validateId(id);
                return new PutUserSettingsRequest(id, this.userSettings);
            }

            public PutUserSettingsRequest replaceUserSettings(final org.dressdiscover.api.models.user.UserSettings userSettings) {
                Validator.validateUserSettings(userSettings);
                return new PutUserSettingsRequest(this.id, userSettings);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("user_settings", getUserSettings()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PutUserSettingsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getId().toString());
                getUserSettings().writeAsStruct(oprot);
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeIdField(oprot);

                writeUserSettingsField(oprot);

                oprot.writeFieldStop();
            }

            public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ID);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();
            }

            public void writeUserSettingsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.USER_SETTINGS);
                getUserSettings().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.user.UserId id;

            private final org.dressdiscover.api.models.user.UserSettings userSettings;
        }

        public final static class PutUserSettingsResponse implements org.thryft.Struct {
            private PutUserSettingsResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutUserSettingsResponse)) {
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
                oprot.writeStructBegin("org.dressdiscover.api.services.user.PutUserSettingsResponse");
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

            public final static PutUserSettingsResponse INSTANCE = new PutUserSettingsResponse();
        }
    }
}
