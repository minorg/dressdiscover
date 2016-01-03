package net.lab1318.costume.api.services.object;

@SuppressWarnings({"serial"})
public class NoSuchObjectException extends org.thryft.Exception {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchObjectException other) {
        }

        protected NoSuchObjectException _build() {
            return new NoSuchObjectException();
        }

        public NoSuchObjectException build() {
            return _build();
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
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final NoSuchObjectException other) {
            com.google.common.base.Preconditions.checkNotNull(other);



            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            default:
                throw new IllegalArgumentException(name);
            }
        }
    }

    public NoSuchObjectException() {
    }

    /**
     * Copy constructor
     */
    public NoSuchObjectException(final NoSuchObjectException other) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final NoSuchObjectException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<NoSuchObjectException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchObjectException)) {
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
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "costume.api.services.object.no_such_object_exception.NoSuchObjectException";
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public static NoSuchObjectException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static NoSuchObjectException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        iprot.readListBegin();
        iprot.readListEnd();
        try {
            return new NoSuchObjectException();
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static NoSuchObjectException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new NoSuchObjectException();
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("net.lab1318.costume.api.services.object.NoSuchObjectException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.NoSuchObjectException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldStop();
    }
}
