package net.lab1318.costume.api.services.object;

public class GetObjectsOptions implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            from = com.google.common.primitives.UnsignedInteger.ZERO;
            size = com.google.common.primitives.UnsignedInteger.ZERO;
        }

        public Builder(final GetObjectsOptions other) {
            this.from = other.getFrom();
            this.size = other.getSize();
        }

        protected GetObjectsOptions _build(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
            return new GetObjectsOptions(from, size);
        }

        public GetObjectsOptions build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size"));
        }

        public final com.google.common.primitives.UnsignedInteger getFrom() {
            return from;
        }

        public final com.google.common.primitives.UnsignedInteger getSize() {
            return size;
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
            from = iprot.readU32();
            size = iprot.readU32();
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
                case "from_": {
                    from = iprot.readU32();
                    break;
                }
                case "size": {
                    size = iprot.readU32();
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setFrom(final com.google.common.primitives.UnsignedInteger from) {
            this.from = com.google.common.base.Preconditions.checkNotNull(from);
            return this;
        }

        public Builder setIfPresent(final GetObjectsOptions other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setFrom(other.getFrom());
            setSize(other.getSize());

            return this;
        }

        public Builder setSize(final com.google.common.primitives.UnsignedInteger size) {
            this.size = com.google.common.base.Preconditions.checkNotNull(size);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
            case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFrom() {
            this.from = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        public Builder unsetSize() {
            this.size = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        private com.google.common.primitives.UnsignedInteger from;
        private com.google.common.primitives.UnsignedInteger size;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "from_", org.thryft.protocol.Type.I32),
        SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "size", org.thryft.protocol.Type.I32);

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
            case "from": return FROM_;
            case "size": return SIZE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "from_": return FROM_;
            case "size": return SIZE;
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
    public GetObjectsOptions(final GetObjectsOptions other) {
        this(other.getFrom(), other.getSize());
    }

    /**
     * Optional constructor
     */
    public GetObjectsOptions(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
        this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from");
        this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GetObjectsOptions other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GetObjectsOptions> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof GetObjectsOptions)) {
            return false;
        }

        final GetObjectsOptions other = (GetObjectsOptions)otherObject;
        return
            getFrom().equals(other.getFrom()) &&
            getSize().equals(other.getSize());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "from_": return getFrom();
        case "size": return getSize();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.primitives.UnsignedInteger getFrom() {
        return from;
    }

    public final com.google.common.primitives.UnsignedInteger getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getFrom().hashCode();
        hashCode = 31 * hashCode + getSize().hashCode();
        return hashCode;
    }

    public static GetObjectsOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectsOptions readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

        iprot.readListBegin();
        from = iprot.readU32();
        size = iprot.readU32();
        iprot.readListEnd();
        try {
            return new GetObjectsOptions(from, size);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static GetObjectsOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "from_": {
                from = iprot.readU32();
                break;
            }
            case "size": {
                size = iprot.readU32();
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new GetObjectsOptions(from, size);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public GetObjectsOptions replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
        return new GetObjectsOptions(from, this.size);
    }

    public GetObjectsOptions replaceSize(final com.google.common.primitives.UnsignedInteger size) {
        return new GetObjectsOptions(this.from, size);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("from_", getFrom()).add("size", getSize()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeU32(getFrom());

        oprot.writeU32(getSize());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsOptions");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getFrom());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getSize());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final com.google.common.primitives.UnsignedInteger from;

    private final com.google.common.primitives.UnsignedInteger size;
}
