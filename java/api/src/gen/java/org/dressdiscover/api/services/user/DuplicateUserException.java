package org.dressdiscover.api.services.user;

@SuppressWarnings({"serial"})
public final class DuplicateUserException extends org.thryft.ThryftException {
    public final static class Builder {
        public Builder() {
            causeMessage = null;
            userId = null;
        }

        public Builder(final DuplicateUserException other) {
            this.causeMessage = other.getCauseMessage();
            this.userId = other.getUserId();
        }

        protected DuplicateUserException _build(final String causeMessage, final org.dressdiscover.api.models.user.UserId userId) {
            return new DuplicateUserException(causeMessage, userId);
        }

        public DuplicateUserException build() {
            UncheckedValidator.validate(causeMessage, userId);

            return _build(causeMessage, userId);
        }

        /**
         * validation {"minLength": 1}
         */
        public final @javax.annotation.Nullable String getCauseMessage() {
            return causeMessage;
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
                iprot.readListBegin();
                causeMessage = iprot.readString();
                try {
                    userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
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
                    case "cause_message": {
                        causeMessage = iprot.readString();
                        break;
                    }
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
            case USER_ID: setUserId((org.dressdiscover.api.models.user.UserId)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCauseMessage(final String causeMessage) {
            UncheckedValidator.validateCauseMessage(causeMessage);
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setIfPresent(final DuplicateUserException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCauseMessage(other.getCauseMessage());
            setUserId(other.getUserId());

            return this;
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
            case CAUSE_MESSAGE: return unsetCauseMessage();
            case USER_ID: return unsetUserId();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCauseMessage() {
            this.causeMessage = null;
            return this;
        }

        public Builder unsetUserId() {
            this.userId = null;
            return this;
        }

        /**
         * validation {"minLength": 1}
         */
        private @javax.annotation.Nullable String causeMessage;
        private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId userId;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<DuplicateUserException> {
        @Override
        public DuplicateUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return DuplicateUserException.readAs(iprot, type);
        }

        @Override
        public DuplicateUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DuplicateUserException.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public DuplicateUserException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DuplicateUserException.readAsList(iprot);
        }

        @Override
        public DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DuplicateUserException.readAsStruct(iprot);
        }

        @Override
        public DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DuplicateUserException.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CAUSE_MESSAGE("causeMessage", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "cause_message", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserId>() {}, true, (short)0, "user_id", org.thryft.protocol.Type.STRING);

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
            case "userId": return USER_ID;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "cause_message": return CAUSE_MESSAGE;
            case "user_id": return USER_ID;
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
        public static void validate(final String causeMessage, final org.dressdiscover.api.models.user.UserId userId) throws org.thryft.protocol.InputProtocolException {
            validateCauseMessage(causeMessage);
            validateUserId(userId);
        }

        public static void validateCauseMessage(final String causeMessage) throws org.thryft.protocol.InputProtocolException {
            if (causeMessage == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CAUSE_MESSAGE, "org.dressdiscover.api.services.user.DuplicateUserException: causeMessage is null");
            }
        }

        public static void validateUserId(final org.dressdiscover.api.models.user.UserId userId) throws org.thryft.protocol.InputProtocolException {
            if (userId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.USER_ID, "org.dressdiscover.api.services.user.DuplicateUserException: userId is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String causeMessage, final org.dressdiscover.api.models.user.UserId userId) {
            validateCauseMessage(causeMessage);
            validateUserId(userId);
        }

        public static void validateCauseMessage(final String causeMessage) {
            if (causeMessage == null) {
                throw new NullPointerException("org.dressdiscover.api.services.user.DuplicateUserException: causeMessage is null");
            }
        }

        public static void validateUserId(final org.dressdiscover.api.models.user.UserId userId) {
            if (userId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.user.DuplicateUserException: userId is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public DuplicateUserException(final DuplicateUserException other) {
        this(other.getCauseMessage(), other.getUserId());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected DuplicateUserException(final String causeMessage, final org.dressdiscover.api.models.user.UserId userId) {
        this.causeMessage = causeMessage;
        this.userId = userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final DuplicateUserException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<DuplicateUserException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static DuplicateUserException create(final String causeMessage, final org.dressdiscover.api.models.user.UserId userId) {
        UncheckedValidator.validate(causeMessage, userId);
        return new DuplicateUserException(causeMessage, userId);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof DuplicateUserException)) {
            return false;
        }

        final DuplicateUserException other = (DuplicateUserException)otherObject;

        if (!(getCauseMessage().equals(other.getCauseMessage()))) {
            return false;
        }

        if (!(getUserId().equals(other.getUserId()))) {
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
        case USER_ID: return getUserId();
        default:
            throw new IllegalStateException();
        }
    }

    /**
     * validation {"minLength": 1}
     */
    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "dressdiscover.api.services.user.duplicate_user_exception.DuplicateUserException";
    }

    public final org.dressdiscover.api.models.user.UserId getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        return hashCode;
    }

    public static DuplicateUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DuplicateUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static DuplicateUserException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String causeMessage;
        org.dressdiscover.api.models.user.UserId userId;

        try {
            iprot.readListBegin();
            causeMessage = iprot.readString();
            try {
                userId = org.dressdiscover.api.models.user.UserId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.user.InvalidUserIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(causeMessage, userId);

        return new DuplicateUserException(causeMessage, userId);
    }

    public static DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String causeMessage = null;
        @javax.annotation.Nullable org.dressdiscover.api.models.user.UserId userId = null;

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

        ReadValidator.validate(causeMessage, userId);

        return new DuplicateUserException(causeMessage, userId);
    }

    public DuplicateUserException replaceCauseMessage(final String causeMessage) {
        UncheckedValidator.validateCauseMessage(causeMessage);
        return new DuplicateUserException(causeMessage, this.userId);
    }

    public DuplicateUserException replaceUserId(final org.dressdiscover.api.models.user.UserId userId) {
        UncheckedValidator.validateUserId(userId);
        return new DuplicateUserException(this.causeMessage, userId);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("cause_message", getCauseMessage()).add("user_id", getUserId()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getCauseMessage());

        oprot.writeString(getUserId().toString());

        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("org.dressdiscover.api.services.user.DuplicateUserException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldBegin(FieldMetadata.CAUSE_MESSAGE);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin(FieldMetadata.USER_ID);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.user.DuplicateUserException");
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

        writeUserIdField(oprot);

        oprot.writeFieldStop();
    }

    public void writeUserIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.USER_ID);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();
    }

    /**
     * validation {"minLength": 1}
     */
    private final String causeMessage;

    private final org.dressdiscover.api.models.user.UserId userId;
}
