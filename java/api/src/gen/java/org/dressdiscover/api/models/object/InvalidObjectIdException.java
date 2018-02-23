package org.dressdiscover.api.models.object;

@SuppressWarnings({"serial"})
public final class InvalidObjectIdException extends org.thryft.ThryftException {
    public final static class Builder {
        public Builder() {
            causeMessage = null;
        }

        public Builder(final InvalidObjectIdException other) {
            this.causeMessage = other.getCauseMessage();
        }

        protected InvalidObjectIdException _build(final String causeMessage) {
            return new InvalidObjectIdException(causeMessage);
        }

        public InvalidObjectIdException build() {
            UncheckedValidator.validate(causeMessage);

            return _build(causeMessage);
        }

        public final @javax.annotation.Nullable String getCauseMessage() {
            return causeMessage;
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
                causeMessage = iprot.readString();
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
                    case "cause_message": {
                        causeMessage = iprot.readString();
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
            case CAUSE_MESSAGE: setCauseMessage((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCauseMessage(final String causeMessage) {
            UncheckedValidator.validateCauseMessage(causeMessage);
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setIfPresent(final InvalidObjectIdException other) {
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

    public final static class Factory implements org.thryft.CompoundType.Factory<InvalidObjectIdException> {
        @Override
        public InvalidObjectIdException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return InvalidObjectIdException.readAs(iprot, type);
        }

        @Override
        public InvalidObjectIdException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InvalidObjectIdException.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public InvalidObjectIdException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InvalidObjectIdException.readAsList(iprot);
        }

        @Override
        public InvalidObjectIdException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InvalidObjectIdException.readAsStruct(iprot);
        }

        @Override
        public InvalidObjectIdException readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InvalidObjectIdException.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CAUSE_MESSAGE("causeMessage", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "cause_message", org.thryft.protocol.Type.STRING);

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
        public static void validate(final String causeMessage) throws org.thryft.protocol.InputProtocolException {
            validateCauseMessage(causeMessage);
        }

        public static void validateCauseMessage(final String causeMessage) throws org.thryft.protocol.InputProtocolException {
            if (causeMessage == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CAUSE_MESSAGE, "org.dressdiscover.api.models.object.InvalidObjectIdException: causeMessage is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String causeMessage) {
            validateCauseMessage(causeMessage);
        }

        public static void validateCauseMessage(final String causeMessage) {
            if (causeMessage == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.InvalidObjectIdException: causeMessage is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public InvalidObjectIdException(final InvalidObjectIdException other) {
        this(other.getCauseMessage());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected InvalidObjectIdException(final String causeMessage) {
        this.causeMessage = causeMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InvalidObjectIdException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InvalidObjectIdException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static InvalidObjectIdException create(final String causeMessage) {
        UncheckedValidator.validate(causeMessage);
        return new InvalidObjectIdException(causeMessage);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof InvalidObjectIdException)) {
            return false;
        }

        final InvalidObjectIdException other = (InvalidObjectIdException)otherObject;

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
        return "dressdiscover.api.models.object.invalid_object_id_exception.InvalidObjectIdException";
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        return hashCode;
    }

    public static InvalidObjectIdException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InvalidObjectIdException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InvalidObjectIdException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String causeMessage;

        try {
            iprot.readListBegin();
            causeMessage = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(causeMessage);

        return new InvalidObjectIdException(causeMessage);
    }

    public static InvalidObjectIdException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InvalidObjectIdException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String causeMessage = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "cause_message": {
                    causeMessage = iprot.readString();
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

        ReadValidator.validate(causeMessage);

        return new InvalidObjectIdException(causeMessage);
    }

    public InvalidObjectIdException replaceCauseMessage(final String causeMessage) {
        UncheckedValidator.validateCauseMessage(causeMessage);
        return new InvalidObjectIdException(causeMessage);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("cause_message", getCauseMessage()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        oprot.writeString(getCauseMessage());

        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("org.dressdiscover.api.models.object.InvalidObjectIdException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldBegin(FieldMetadata.CAUSE_MESSAGE);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.object.InvalidObjectIdException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCauseMessageField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.CAUSE_MESSAGE);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCauseMessageField(oprot);

        oprot.writeFieldStop();
    }

    private final String causeMessage;
}
