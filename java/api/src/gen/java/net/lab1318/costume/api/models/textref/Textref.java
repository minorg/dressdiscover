package net.lab1318.costume.api.models.textref;

/**
 * VRA Core 4.0 textref element
 */
public class Textref implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            name = null;
            refid = null;
        }

        public Builder(final Textref other) {
            this.name = other.getName();
            this.refid = other.getRefid();
        }

        protected Textref _build(final net.lab1318.costume.api.models.textref.TextrefName name, final net.lab1318.costume.api.models.textref.TextrefRefid refid) {
            return new Textref(name, refid);
        }

        public Textref build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.textref.Textref: missing name"), com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.textref.Textref: missing refid"));
        }

        public final net.lab1318.costume.api.models.textref.TextrefName getName() {
            return name;
        }

        public final net.lab1318.costume.api.models.textref.TextrefRefid getRefid() {
            return refid;
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
            name = net.lab1318.costume.api.models.textref.TextrefName.readAsStruct(iprot);
            refid = net.lab1318.costume.api.models.textref.TextrefRefid.readAsStruct(iprot);
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
                case "name": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        name = net.lab1318.costume.api.models.textref.TextrefName.readAsStruct(iprot);
                    }
                    break;
                }
                case "refid": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        refid = net.lab1318.costume.api.models.textref.TextrefRefid.readAsStruct(iprot);
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Textref other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setName(other.getName());
            setRefid(other.getRefid());

            return this;
        }

        public Builder setName(final net.lab1318.costume.api.models.textref.TextrefName name) {
            this.name = com.google.common.base.Preconditions.checkNotNull(name);
            return this;
        }

        public Builder setRefid(final net.lab1318.costume.api.models.textref.TextrefRefid refid) {
            this.refid = com.google.common.base.Preconditions.checkNotNull(refid);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": setName((net.lab1318.costume.api.models.textref.TextrefName)value); return this;
            case "refid": setRefid((net.lab1318.costume.api.models.textref.TextrefRefid)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetName() {
            this.name = null;
            return this;
        }

        public Builder unsetRefid() {
            this.refid = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": return unsetName();
            case "refid": return unsetRefid();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.textref.TextrefName name;
        private net.lab1318.costume.api.models.textref.TextrefRefid refid;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.textref.TextrefName>() {}, true, 1, "name", org.thryft.protocol.Type.STRUCT),
        REFID("refid", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.textref.TextrefRefid>() {}, true, 2, "refid", org.thryft.protocol.Type.STRUCT);

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
            case "name": return NAME;
            case "refid": return REFID;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "name": return NAME;
            case "refid": return REFID;
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
    public Textref(final Textref other) {
        this(other.getName(), other.getRefid());
    }

    /**
     * Optional constructor
     */
    public Textref(final net.lab1318.costume.api.models.textref.TextrefName name, final net.lab1318.costume.api.models.textref.TextrefRefid refid) {
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.textref.Textref: missing name");
        this.refid = com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.textref.Textref: missing refid");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Textref other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Textref> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Textref)) {
            return false;
        }

        final Textref other = (Textref)otherObject;
        return
            getName().equals(other.getName()) &&
            getRefid().equals(other.getRefid());
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
        case NAME: return getName();
        case REFID: return getRefid();
        default:
            throw new IllegalStateException();
        }
    }

    public final net.lab1318.costume.api.models.textref.TextrefName getName() {
        return name;
    }

    public final net.lab1318.costume.api.models.textref.TextrefRefid getRefid() {
        return refid;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        hashCode = 31 * hashCode + getRefid().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Textref readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Textref readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.textref.TextrefName name = null;
        net.lab1318.costume.api.models.textref.TextrefRefid refid = null;

        iprot.readListBegin();
        name = net.lab1318.costume.api.models.textref.TextrefName.readAsStruct(iprot);
        refid = net.lab1318.costume.api.models.textref.TextrefRefid.readAsStruct(iprot);
        iprot.readListEnd();
        try {
            return new Textref(name, refid);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Textref readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.textref.TextrefName name = null;
        net.lab1318.costume.api.models.textref.TextrefRefid refid = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "name": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    name = net.lab1318.costume.api.models.textref.TextrefName.readAsStruct(iprot);
                }
                break;
            }
            case "refid": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    refid = net.lab1318.costume.api.models.textref.TextrefRefid.readAsStruct(iprot);
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Textref(name, refid);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Textref replaceName(final net.lab1318.costume.api.models.textref.TextrefName name) {
        return new Textref(name, this.refid);
    }

    public Textref replaceRefid(final net.lab1318.costume.api.models.textref.TextrefRefid refid) {
        return new Textref(this.name, refid);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("refid", getRefid()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        getName().writeAsStruct(oprot);

        getRefid().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.textref.Textref");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("name", org.thryft.protocol.Type.STRUCT, (short)1);
        getName().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("refid", org.thryft.protocol.Type.STRUCT, (short)2);
        getRefid().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.textref.TextrefName name;

    private final net.lab1318.costume.api.models.textref.TextrefRefid refid;
}
