package net.lab1318.costume.api.services.user;

@SuppressWarnings({"serial"})
public class DuplicateUserException extends org.thryft.Exception {
    public static class Builder {
        public Builder() {
            causeMessage = null;
            userId = null;
        }

        public Builder(final DuplicateUserException other) {
            this.causeMessage = other.getCauseMessage();
            this.userId = other.getUserId();
        }

        protected DuplicateUserException _build(final String causeMessage, final net.lab1318.costume.api.models.user.UserId userId) {
            return new DuplicateUserException(causeMessage, userId);
        }

        public DuplicateUserException build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(causeMessage, "net.lab1318.costume.api.services.user.DuplicateUserException: missing causeMessage"), com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.services.user.DuplicateUserException: missing userId"));
        }

        /**
         * validation {"minLength": 1}
         */
        public final String getCauseMessage() {
            return causeMessage;
        }

        public final net.lab1318.costume.api.models.user.UserId getUserId() {
            return userId;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readListBegin();
            causeMessage = iprot.readString();
            try {
                userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                        userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
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
            return this;
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage);
            return this;
        }

        public Builder setIfPresent(final DuplicateUserException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCauseMessage(other.getCauseMessage());
            setUserId(other.getUserId());

            return this;
        }

        public Builder setUserId(final net.lab1318.costume.api.models.user.UserId userId) {
            this.userId = com.google.common.base.Preconditions.checkNotNull(userId);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "cause_message": setCauseMessage((String)value); return this;
            case "user_id": setUserId((net.lab1318.costume.api.models.user.UserId)value); return this;
            default:
                throw new IllegalArgumentException(name);
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

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "cause_message": return unsetCauseMessage();
            case "user_id": return unsetUserId();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        /**
         * validation {"minLength": 1}
         */
        private String causeMessage;
        private net.lab1318.costume.api.models.user.UserId userId;
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CAUSE_MESSAGE("causeMessage", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "cause_message", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING);

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

    /**
     * Copy constructor
     */
    public DuplicateUserException(final DuplicateUserException other) {
        this(other.getCauseMessage(), other.getUserId());
    }

    /**
     * Optional constructor
     */
    public DuplicateUserException(final String causeMessage, final net.lab1318.costume.api.models.user.UserId userId) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "net.lab1318.costume.api.services.user.DuplicateUserException: missing causeMessage");
        this.userId = com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.services.user.DuplicateUserException: missing userId");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof DuplicateUserException)) {
            return false;
        }

        final DuplicateUserException other = (DuplicateUserException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            getUserId().equals(other.getUserId());
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
        return "costume.api.services.user.duplicate_user_exception.DuplicateUserException";
    }

    public final net.lab1318.costume.api.models.user.UserId getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static DuplicateUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static DuplicateUserException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String causeMessage = null;
        net.lab1318.costume.api.models.user.UserId userId = null;

        iprot.readListBegin();
        causeMessage = iprot.readString();
        try {
            userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        iprot.readListEnd();
        try {
            return new DuplicateUserException(causeMessage, userId);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DuplicateUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String causeMessage = null;
        net.lab1318.costume.api.models.user.UserId userId = null;

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
                    userId = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
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
        try {
            return new DuplicateUserException(causeMessage, userId);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public DuplicateUserException replaceCauseMessage(final String causeMessage) {
        return new DuplicateUserException(causeMessage, this.userId);
    }

    public DuplicateUserException replaceUserId(final net.lab1318.costume.api.models.user.UserId userId) {
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
        oprot.writeMessageBegin("net.lab1318.costume.api.services.user.DuplicateUserException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldBegin("cause_message", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.user.DuplicateUserException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("cause_message", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getCauseMessage());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    /**
     * validation {"minLength": 1}
     */
    private final String causeMessage;

    private final net.lab1318.costume.api.models.user.UserId userId;
}