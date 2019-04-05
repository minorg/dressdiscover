package org.dressdiscover.api.services.user;

@SuppressWarnings({"serial"})
public final class NoSuchUserSettingsException extends org.thryft.waf.api.services.NoSuchModelException {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, NoSuchUserSettingsException> {
        public Builder() {
            id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserId> absent();
        }

        public Builder(final NoSuchUserSettingsException other) {
            this.id = other.getId();
        }

        protected NoSuchUserSettingsException _build(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
            return new NoSuchUserSettingsException(id);
        }

        public NoSuchUserSettingsException build() {
            Validator.validate(id);

            return _build(id);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> getId() {
            return id;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        this.setId(com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserId.parse(iprot.readString())));
                    } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                    } catch (final IllegalArgumentException e) {
                    }
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
                            this.setId(com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserId.parse(iprot.readString())));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                        } catch (final IllegalArgumentException e) {
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

        public Builder setId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
            Validator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setId(final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId id) {
            return setId(com.google.common.base.Optional.fromNullable(id));
        }

        public Builder setIfPresent(final NoSuchUserSettingsException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getId().isPresent()) {
                setId(other.getId());
            }

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
            this.id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserId> absent();
            return this;
        }

        private com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<NoSuchUserSettingsException> {
        @Override
        public NoSuchUserSettingsException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserSettingsException.readAsList(iprot);
        }

        @Override
        public NoSuchUserSettingsException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserSettingsException.readAsStruct(iprot);
        }

        @Override
        public NoSuchUserSettingsException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserSettingsException.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, false, (short)0, "id", "id", org.thryft.protocol.Type.STRING);

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
        public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
            validateId(id);
        }

        public static void validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.NoSuchUserSettingsException: id is missing");
            }
        }
    }

    /**
     * Default constructor
     */
    public NoSuchUserSettingsException() {
        id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserId> absent();
    }

    /**
     * Copy constructor
     */
    public NoSuchUserSettingsException(final NoSuchUserSettingsException other) {
        this(other.getId());
    }

    /**
     * Total constructor
     */
    public NoSuchUserSettingsException(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
        Validator.validate(id);
        this.id = id;
    }

    /**
     * Total Nullable constructor
     */
    public NoSuchUserSettingsException(@javax.annotation.Nullable final org.dressdiscover.api.models.user.UserId id) {
        this(com.google.common.base.Optional.fromNullable(id));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final NoSuchUserSettingsException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<NoSuchUserSettingsException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof NoSuchUserSettingsException)) {
            return false;
        }

        final NoSuchUserSettingsException other = (NoSuchUserSettingsException)otherObject;

        if (!(((getId().isPresent() && other.getId().isPresent()) ? (getId().get().equals(other.getId().get())) : (!getId().isPresent() && !other.getId().isPresent())))) {
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "dressdiscover.api.services.user.no_such_user_settings_exception.NoSuchUserSettingsException";
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    public static NoSuchUserSettingsException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static NoSuchUserSettingsException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static NoSuchUserSettingsException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public NoSuchUserSettingsException replaceId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id) {
        Validator.validateId(id);
        return new NoSuchUserSettingsException(id);
    }

    public NoSuchUserSettingsException replaceId(@javax.annotation.Nullable final org.dressdiscover.api.models.user.UserId id) {
        return replaceId(com.google.common.base.Optional.fromNullable(id));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("org.dressdiscover.api.services.user.NoSuchUserSettingsException", org.thryft.protocol.MessageType.EXCEPTION, null);

        if (getId().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ID);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.user.NoSuchUserSettingsException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getId().isPresent()) {
            oprot.writeString(getId().get().toString());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeIdField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getId().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ID);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }
    }

    private final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserId> id;
}