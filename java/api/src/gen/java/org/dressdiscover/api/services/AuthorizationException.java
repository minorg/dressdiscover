package org.dressdiscover.api.services;

@SuppressWarnings({"serial"})
public final class AuthorizationException extends org.thryft.ThryftException {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, AuthorizationException> {
        public Builder() {
            causeMessage = null;
        }

        public Builder(final AuthorizationException other) {
            this.causeMessage = other.getCauseMessage();
        }

        protected AuthorizationException _build(final String causeMessage) {
            return new AuthorizationException(causeMessage);
        }

        public AuthorizationException build() {
            Validator.validate(causeMessage);

            return _build(causeMessage);
        }

        public final @javax.annotation.Nullable String getCauseMessage() {
            return causeMessage;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                this.setCauseMessage(iprot.readString());
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
                    case "cause_message": {
                        this.setCauseMessage(iprot.readString());
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
            case CAUSE_MESSAGE: setCauseMessage((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCauseMessage(final String causeMessage) {
            Validator.validateCauseMessage(causeMessage);
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setIfPresent(final AuthorizationException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCauseMessage(other.getCauseMessage());

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
            case CAUSE_MESSAGE: return unsetCauseMessage();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCauseMessage() {
            this.causeMessage = null;
            return this;
        }

        private @javax.annotation.Nullable String causeMessage;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<AuthorizationException> {
        @Override
        public AuthorizationException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AuthorizationException.readAsList(iprot);
        }

        @Override
        public AuthorizationException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AuthorizationException.readAsStruct(iprot);
        }

        @Override
        public AuthorizationException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AuthorizationException.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CAUSE_MESSAGE("causeMessage", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "cause_message", "cause_message", org.thryft.protocol.Type.STRING);

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
            case "causeMessage": return CAUSE_MESSAGE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "cause_message": return CAUSE_MESSAGE;
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
        public static void validate(final String causeMessage) {
            validateCauseMessage(causeMessage);
        }

        public static void validateCauseMessage(final String causeMessage) {
            if (causeMessage == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.AuthorizationException: causeMessage is missing");
            }
            if (causeMessage.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.AuthorizationException: causeMessage: less than min length 1");
            }
            {
                final int __strLen = causeMessage.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(causeMessage.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.services.AuthorizationException: causeMessage: blank '%s' (length=%d)", causeMessage, __strLen));
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public AuthorizationException(final AuthorizationException other) {
        this(other.getCauseMessage());
    }

    /**
     * Total constructor
     */
    public AuthorizationException(final String causeMessage) {
        Validator.validate(causeMessage);
        this.causeMessage = causeMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final AuthorizationException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<AuthorizationException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof AuthorizationException)) {
            return false;
        }

        final AuthorizationException other = (AuthorizationException)otherObject;

        if (!(getCauseMessage().equals(other.getCauseMessage()))) {
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
        case CAUSE_MESSAGE: return getCauseMessage();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "dressdiscover.api.services.authorization_exception.AuthorizationException";
    }

    @Override
    public int hashCode() {
        return getCauseMessage().hashCode();
    }

    public static AuthorizationException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static AuthorizationException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static AuthorizationException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public AuthorizationException replaceCauseMessage(final String causeMessage) {
        Validator.validateCauseMessage(causeMessage);
        return new AuthorizationException(causeMessage);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("cause_message", getCauseMessage()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("org.dressdiscover.api.services.AuthorizationException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldBegin(FieldMetadata.CAUSE_MESSAGE);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.AuthorizationException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCauseMessageField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.CAUSE_MESSAGE);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getCauseMessage());
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCauseMessageField(oprot);

        oprot.writeFieldStop();
    }

    private final String causeMessage;
}