package org.dressdiscover.api.vocabularies.costume_core.component;

/**
 * Costume Core component element
 */
public final class Component implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Component> {
        public Builder() {
            term = null;
            structures = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> absent();
        }

        public Builder(final Component other) {
            this.term = other.getTerm();
            this.structures = other.getStructures();
        }

        protected Component _build(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
            return new Component(term, structures);
        }

        public Component build() {
            Validator.validate(term, structures);

            return _build(term, structures);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> getStructures() {
            return structures;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm getTerm() {
            return term;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setTerm(org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm.readAsStruct(iprot));
                if (__list.getSize() > 1) {
                    this.setStructures(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot)));
                }
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
                    case "term": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setTerm(org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "structures": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setStructures(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot, unknownFieldCallback)));
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
            case TERM: setTerm((org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm)value); return this;
            case STRUCTURES: setStructures((org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Component other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTerm(other.getTerm());
            if (other.getStructures().isPresent()) {
                setStructures(other.getStructures());
            }

            return this;
        }

        public Builder setStructures(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
            Validator.validateStructures(structures);
            this.structures = structures;
            return this;
        }

        public Builder setStructures(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet structures) {
            return setStructures(com.google.common.base.Optional.fromNullable(structures));
        }

        public Builder setTerm(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term) {
            Validator.validateTerm(term);
            this.term = term;
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
            case TERM: return unsetTerm();
            case STRUCTURES: return unsetStructures();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetStructures() {
            this.structures = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> absent();
            return this;
        }

        public Builder unsetTerm() {
            this.term = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Component> {
        @Override
        public Component readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsList(iprot);
        }

        @Override
        public Component readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsStruct(iprot);
        }

        @Override
        public Component readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERM("term", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm>() {}, true, (short)1, "term", "1:term", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>() {}, false, (short)2, "structures", "2:structures", org.thryft.protocol.Type.STRUCT);

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
            case "term": return TERM;
            case "structures": return STRUCTURES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "term": return TERM;
            case "structures": return STRUCTURES;
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
        public static void validate(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
            validateTerm(term);
            validateStructures(structures);
        }

        public static void validateTerm(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term) {
            if (term == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.costume_core.component.Component: term is missing");
            }
        }

        public static void validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
            if (structures == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.costume_core.component.Component: structures is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Component(final Component other) {
        this(other.getTerm(), other.getStructures());
    }

    /**
     * Required constructor
     */
    public Component(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term) {
        this(term, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> absent());
    }

    /**
     * Total constructor
     */
    public Component(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
        Validator.validate(term, structures);
        this.term = term;
        this.structures = structures;
    }

    /**
     * Total Nullable constructor
     */
    public Component(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet structures) {
        this(term, com.google.common.base.Optional.fromNullable(structures));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Component other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Component> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Component)) {
            return false;
        }

        final Component other = (Component)otherObject;

        if (!(getTerm().equals(other.getTerm()))) {
            return false;
        }

        if (!(((getStructures().isPresent() && other.getStructures().isPresent()) ? (getStructures().get().equals(other.getStructures().get())) : (!getStructures().isPresent() && !other.getStructures().isPresent())))) {
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
        case TERM: return getTerm();
        case STRUCTURES: return getStructures();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> getStructures() {
        return structures;
    }

    public final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm getTerm() {
        return term;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTerm().hashCode();
        if (getStructures().isPresent()) {
            hashCode = 31 * hashCode + getStructures().get().hashCode();
        }
        return hashCode;
    }

    public static Component readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Component readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Component readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Component replaceStructures(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures) {
        Validator.validateStructures(structures);
        return new Component(this.term, structures);
    }

    public Component replaceStructures(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet structures) {
        return replaceStructures(com.google.common.base.Optional.fromNullable(structures));
    }

    public Component replaceTerm(final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term) {
        Validator.validateTerm(term);
        return new Component(term, this.structures);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("term", getTerm()).add("structures", getStructures().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.costume_core.component.Component");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        getTerm().writeAsStruct(oprot);
        if (getStructures().isPresent()) {
            getStructures().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTermField(oprot);

        writeStructuresField(oprot);

        oprot.writeFieldStop();
    }

    public void writeStructuresField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getStructures().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.STRUCTURES);
            getStructures().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeTermField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TERM);
        getTerm().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.costume_core.component.ComponentTerm term;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structures;
}
