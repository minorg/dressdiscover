package net.lab1318.costume.api.services.user;

@SuppressWarnings({"serial"})
public class NoSuchUserException extends org.thryft.Exception {
    public static class Builder {
        public Builder() {
            id = com.google.common.base.Optional.absent();
        }

        public Builder(final NoSuchUserException other) {
            this.id = other.getId();
        }

        protected NoSuchUserException _build(final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id) {
            return new NoSuchUserException(id);
        }

        public NoSuchUserException build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.NoSuchUserException: missing id"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> getId() {
            return id;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    id = com.google.common.base.Optional.of(net.lab1318.costume.api.models.user.UserId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                }
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
                case "id": {
                    try {
                        id = com.google.common.base.Optional.of(net.lab1318.costume.api.models.user.UserId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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

        public Builder setId(final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id) {
            this.id = com.google.common.base.Preconditions.checkNotNull(id);
            return this;
        }

        public Builder setId(@javax.annotation.Nullable final net.lab1318.costume.api.models.user.UserId id) {
            this.id = com.google.common.base.Optional.fromNullable(id);
            return this;
        }

        public Builder setIfPresent(final NoSuchUserException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getId().isPresent()) {
                setId(other.getId());
            }

            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "id": setId((net.lab1318.costume.api.models.user.UserId)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetId() {
            this.id = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "id": return unsetId();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id;
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, false, 0, "id", org.thryft.protocol.Type.STRING);

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
     * Default constructor
     */
    public NoSuchUserException() {
        id = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public NoSuchUserException(final NoSuchUserException other) {
        this(other.getId());
    }

    /**
     * Total Nullable constructor
     */
    public NoSuchUserException(final @javax.annotation.Nullable net.lab1318.costume.api.models.user.UserId id) {
        this.id = com.google.common.base.Optional.fromNullable(id);
    }

    /**
     * Optional constructor
     */
    public NoSuchUserException(final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id) {
        this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.NoSuchUserException: missing id");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final NoSuchUserException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<NoSuchUserException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchUserException)) {
            return false;
        }

        final NoSuchUserException other = (NoSuchUserException)otherObject;
        return
            getId().equals(other.getId());
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "costume.api.services.user.no_such_user_exception.NoSuchUserException";
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getId().isPresent()) {
            hashCode = 31 * hashCode + getId().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return !getId().isPresent();
    }

    public static NoSuchUserException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static NoSuchUserException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            try {
                id = com.google.common.base.Optional.of(net.lab1318.costume.api.models.user.UserId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new NoSuchUserException(id);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static NoSuchUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static NoSuchUserException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "id": {
                try {
                    id = com.google.common.base.Optional.of(net.lab1318.costume.api.models.user.UserId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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
            return new NoSuchUserException(id);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public NoSuchUserException replaceId(final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id) {
        return new NoSuchUserException(id);
    }

    public NoSuchUserException replaceId(final net.lab1318.costume.api.models.user.UserId id) {
        return replaceId(com.google.common.base.Optional.fromNullable(id));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        if (getId().isPresent()) {
            oprot.writeString(getId().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("net.lab1318.costume.api.services.user.NoSuchUserException", org.thryft.protocol.MessageType.EXCEPTION, null);

        if (getId().isPresent()) {
            oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.user.NoSuchUserException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getId().isPresent()) {
            oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.user.UserId> id;
}