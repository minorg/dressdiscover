package net.lab1318.costume.api.models;

public class ModelMetadata implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            ctime = null;
            mtime = null;
        }

        public Builder(final ModelMetadata other) {
            this.ctime = other.getCtime();
            this.mtime = other.getMtime();
        }

        protected ModelMetadata _build(final java.util.Date ctime, final java.util.Date mtime) {
            return new ModelMetadata(ctime, mtime);
        }

        public ModelMetadata build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(ctime, "net.lab1318.costume.api.models.ModelMetadata: missing ctime"), com.google.common.base.Preconditions.checkNotNull(mtime, "net.lab1318.costume.api.models.ModelMetadata: missing mtime"));
        }

        public final java.util.Date getCtime() {
            return ctime;
        }

        public final java.util.Date getMtime() {
            return mtime;
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
            ctime = iprot.readDateTime();
            mtime = iprot.readDateTime();
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
                case "ctime": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        ctime = iprot.readDateTime();
                    }
                    break;
                }
                case "mtime": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        mtime = iprot.readDateTime();
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

        public Builder setCtime(final java.util.Date ctime) {
            this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime);
            return this;
        }

        public Builder setIfPresent(final ModelMetadata other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCtime(other.getCtime());
            setMtime(other.getMtime());

            return this;
        }

        public Builder setMtime(final java.util.Date mtime) {
            this.mtime = com.google.common.base.Preconditions.checkNotNull(mtime);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "ctime": setCtime((java.util.Date)value); return this;
            case "mtime": setMtime((java.util.Date)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetCtime() {
            this.ctime = null;
            return this;
        }

        public Builder unsetMtime() {
            this.mtime = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "ctime": return unsetCtime();
            case "mtime": return unsetMtime();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private java.util.Date ctime;
        private java.util.Date mtime;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CTIME("ctime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 1, "ctime", org.thryft.protocol.Type.I64),
        MTIME("mtime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 2, "mtime", org.thryft.protocol.Type.I64);

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
            case "ctime": return CTIME;
            case "mtime": return MTIME;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "ctime": return CTIME;
            case "mtime": return MTIME;
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
    public ModelMetadata(final ModelMetadata other) {
        this(other.getCtime(), other.getMtime());
    }

    /**
     * Optional constructor
     */
    public ModelMetadata(final java.util.Date ctime, final java.util.Date mtime) {
        this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime, "net.lab1318.costume.api.models.ModelMetadata: missing ctime");
        this.mtime = com.google.common.base.Preconditions.checkNotNull(mtime, "net.lab1318.costume.api.models.ModelMetadata: missing mtime");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ModelMetadata other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ModelMetadata> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ModelMetadata)) {
            return false;
        }

        final ModelMetadata other = (ModelMetadata)otherObject;
        return
            getCtime().equals(other.getCtime()) &&
            getMtime().equals(other.getMtime());
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
        case CTIME: return getCtime();
        case MTIME: return getMtime();
        default:
            throw new IllegalStateException();
        }
    }

    public final java.util.Date getCtime() {
        return ctime;
    }

    public final java.util.Date getMtime() {
        return mtime;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCtime().hashCode();
        hashCode = 31 * hashCode + getMtime().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static ModelMetadata readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ModelMetadata readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        java.util.Date ctime = null;
        java.util.Date mtime = null;

        iprot.readListBegin();
        ctime = iprot.readDateTime();
        mtime = iprot.readDateTime();
        iprot.readListEnd();
        try {
            return new ModelMetadata(ctime, mtime);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ModelMetadata readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ModelMetadata readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        java.util.Date ctime = null;
        java.util.Date mtime = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "ctime": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    ctime = iprot.readDateTime();
                }
                break;
            }
            case "mtime": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    mtime = iprot.readDateTime();
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
            return new ModelMetadata(ctime, mtime);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ModelMetadata replaceCtime(final java.util.Date ctime) {
        return new ModelMetadata(ctime, this.mtime);
    }

    public ModelMetadata replaceMtime(final java.util.Date mtime) {
        return new ModelMetadata(this.ctime, mtime);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ctime", getCtime()).add("mtime", getMtime()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeDateTime(getCtime());

        oprot.writeDateTime(getMtime());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.ModelMetadata");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("ctime", org.thryft.protocol.Type.I64, (short)1);
        oprot.writeDateTime(getCtime());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("mtime", org.thryft.protocol.Type.I64, (short)2);
        oprot.writeDateTime(getMtime());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final java.util.Date ctime;

    private final java.util.Date mtime;
}
