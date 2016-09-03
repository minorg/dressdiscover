package org.dressdiscover.api.services.object;

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
            iprot.readListBegin();
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

        public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
            throw new IllegalArgumentException();
        }

        public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            throw new IllegalArgumentException();
        }

        public Builder setIfPresent(final NoSuchObjectException other) {
            com.google.common.base.Preconditions.checkNotNull(other);



            return this;
        }

        public Builder unset(final String fieldThriftName) {
            throw new IllegalArgumentException();
        }

        public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
            throw new IllegalArgumentException();
        }
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<NoSuchObjectException> {
        @Override
        public NoSuchObjectException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return NoSuchObjectException.readAs(iprot, type);
        }

        @Override
        public NoSuchObjectException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return NoSuchObjectException.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public NoSuchObjectException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchObjectException.readAsList(iprot);
        }

        @Override
        public NoSuchObjectException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchObjectException.readAsStruct(iprot);
        }

        @Override
        public NoSuchObjectException readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return NoSuchObjectException.readAsStruct(iprot, unknownFieldCallback);
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
        return "dressdiscover.api.services.object.no_such_object_exception.NoSuchObjectException";
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        return hashCode;
    }

    public static NoSuchObjectException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static NoSuchObjectException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
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
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static NoSuchObjectException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
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
        oprot.writeMessageBegin("org.dressdiscover.api.services.object.NoSuchObjectException", org.thryft.protocol.MessageType.EXCEPTION, null);

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.object.NoSuchObjectException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldStop();
    }
}
