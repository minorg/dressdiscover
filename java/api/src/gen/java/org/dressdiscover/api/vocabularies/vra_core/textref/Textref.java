package org.dressdiscover.api.vocabularies.vra_core.textref;

/**
 * VRA Core 4.0 textref element
 */
public final class Textref implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Textref> {
        public Builder() {
            name = null;
            refid = null;
        }

        public Builder(final Textref other) {
            this.name = other.getName();
            this.refid = other.getRefid();
        }

        protected Textref _build(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
            return new Textref(name, refid);
        }

        public Textref build() {
            Validator.validate(name, refid);

            return _build(name, refid);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName getName() {
            return name;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid getRefid() {
            return refid;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                this.setName(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName.readAsStruct(iprot));
                this.setRefid(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid.readAsStruct(iprot));
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
                    case "name": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setName(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "refid": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setRefid(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid.readAsStruct(iprot, unknownFieldCallback));
                        }
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
            case NAME: setName((org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName)value); return this;
            case REFID: setRefid((org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Textref other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setName(other.getName());
            setRefid(other.getRefid());

            return this;
        }

        public Builder setName(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name) {
            Validator.validateName(name);
            this.name = name;
            return this;
        }

        public Builder setRefid(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
            Validator.validateRefid(refid);
            this.refid = refid;
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
            case NAME: return unsetName();
            case REFID: return unsetRefid();
            default:
                throw new IllegalStateException();
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

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Textref> {
        @Override
        public Textref readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Textref.readAsList(iprot);
        }

        @Override
        public Textref readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Textref.readAsStruct(iprot);
        }

        @Override
        public Textref readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Textref.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName>() {}, true, (short)1, "name", "1:name", org.thryft.protocol.Type.STRUCT),
        REFID("refid", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid>() {}, true, (short)2, "refid", "2:refid", org.thryft.protocol.Type.STRUCT);

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
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
            validateName(name);
            validateRefid(refid);
        }

        public static void validateName(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name) {
            if (name == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.textref.Textref: name is missing");
            }
        }

        public static void validateRefid(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
            if (refid == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.textref.Textref: refid is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Textref(final Textref other) {
        this(other.getName(), other.getRefid());
    }

    /**
     * Total constructor
     */
    public Textref(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
        Validator.validate(name, refid);
        this.name = name;
        this.refid = refid;
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
        }
        if (!(otherObject instanceof Textref)) {
            return false;
        }

        final Textref other = (Textref)otherObject;

        if (!(getName().equals(other.getName()))) {
            return false;
        }

        if (!(getRefid().equals(other.getRefid()))) {
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
        case NAME: return getName();
        case REFID: return getRefid();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName getName() {
        return name;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid getRefid() {
        return refid;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        hashCode = 31 * hashCode + getRefid().hashCode();
        return hashCode;
    }

    public static Textref readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Textref readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Textref readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Textref replaceName(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name) {
        Validator.validateName(name);
        return new Textref(name, this.refid);
    }

    public Textref replaceRefid(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid) {
        Validator.validateRefid(refid);
        return new Textref(this.name, refid);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("refid", getRefid()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.textref.Textref");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        getName().writeAsStruct(oprot);
        getRefid().writeAsStruct(oprot);
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeNameField(oprot);

        writeRefidField(oprot);

        oprot.writeFieldStop();
    }

    public void writeNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.NAME);
        getName().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeRefidField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.REFID);
        getRefid().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefName name;

    private final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid refid;
}
