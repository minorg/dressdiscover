package org.dressdiscover.api.models.component;

/**
 * Costume Core component element
 */
public final class Component implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public final static class Builder {
        public Builder() {
            term = null;
            structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
        }

        public Builder(final Component other) {
            this.term = other.getTerm();
            this.structures = other.getStructures();
        }

        protected Component _build(final org.dressdiscover.api.models.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            return new Component(term, structures, DefaultConstructionValidator.getInstance());
        }

        public Component build() {
            return _build(term, structures);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> getStructures() {
            return structures;
        }

        public final org.dressdiscover.api.models.component.ComponentTerm getTerm() {
            return term;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            term = org.dressdiscover.api.models.component.ComponentTerm.readAsStruct(iprot);
            if (__list.getSize() > 1) {
                structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
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
                case "term": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        term = org.dressdiscover.api.models.component.ComponentTerm.readAsStruct(iprot);
                    }
                    break;
                }
                case "structures": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
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
            case TERM: setTerm((org.dressdiscover.api.models.component.ComponentTerm)value); return this;
            case STRUCTURES: setStructures((org.dressdiscover.api.models.structure.StructureSet)value); return this;
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

        public Builder setStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            this.structures = DefaultConstructionValidator.getInstance().validateStructures(structures);
            return this;
        }

        public Builder setStructures(@javax.annotation.Nullable final org.dressdiscover.api.models.structure.StructureSet structures) {
            return setStructures(com.google.common.base.Optional.fromNullable(structures));
        }

        public Builder setTerm(final org.dressdiscover.api.models.component.ComponentTerm term) {
            this.term = DefaultConstructionValidator.getInstance().validateTerm(term);
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
            this.structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
            return this;
        }

        public Builder unsetTerm() {
            this.term = null;
            return this;
        }

        private org.dressdiscover.api.models.component.ComponentTerm term;
        private com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Component> {
        @Override
        public Component readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Component.readAs(iprot, type);
        }

        @Override
        public Component readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Component.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Component readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsList(iprot);
        }

        @Override
        public Component readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsStruct(iprot);
        }

        @Override
        public Component readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Component.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERM("term", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.component.ComponentTerm>() {}, true, 1, "term", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.structure.StructureSet>() {}, false, 2, "structures", org.thryft.protocol.Type.STRUCT);

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

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.models.component.ComponentTerm validateTerm(final org.dressdiscover.api.models.component.ComponentTerm term) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public org.dressdiscover.api.models.component.ComponentTerm validateTerm(final org.dressdiscover.api.models.component.ComponentTerm term) throws RuntimeException {
            if (term == null) {
                throw new NullPointerException("org.dressdiscover.api.models.component.Component: term is null");
            }
            return term;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws RuntimeException {
            if (structures == null) {
                throw new NullPointerException("org.dressdiscover.api.models.component.Component: structures is null");
            }
            if (!structures.isPresent()) {
                return structures;
            }
            return structures;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public org.dressdiscover.api.models.component.ComponentTerm validateTerm(final org.dressdiscover.api.models.component.ComponentTerm term) {
            return term;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            return structures;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public org.dressdiscover.api.models.component.ComponentTerm validateTerm(final org.dressdiscover.api.models.component.ComponentTerm term) throws org.thryft.protocol.InputProtocolException {
            if (term == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TERM, "org.dressdiscover.api.models.component.Component: term is null");
            }
            return term;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws org.thryft.protocol.InputProtocolException {
            if (structures == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURES, "org.dressdiscover.api.models.component.Component: structures is null");
            }
            if (!structures.isPresent()) {
                return structures;
            }
            return structures;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public org.dressdiscover.api.models.component.ComponentTerm validateTerm(final org.dressdiscover.api.models.component.ComponentTerm term) {
            return term;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            return structures;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Component(final Component other) {
        this(other.getTerm(), other.getStructures(), NopConstructionValidator.getInstance());
    }

    protected Component(final org.dressdiscover.api.models.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures, ConstructionValidator validator) {
        this.term = validator.validateTerm(term);
        this.structures = validator.validateStructures(structures);
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

    /**
     * Required factory method
     */
    public static Component create(final org.dressdiscover.api.models.component.ComponentTerm term) {
        return new Component(term, com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Component create(final org.dressdiscover.api.models.component.ComponentTerm term, final @javax.annotation.Nullable org.dressdiscover.api.models.structure.StructureSet structures) {
        return new Component(term, com.google.common.base.Optional.fromNullable(structures), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Component create(final org.dressdiscover.api.models.component.ComponentTerm term, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
        return new Component(term, structures, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Component)) {
            return false;
        }

        final Component other = (Component)otherObject;
        return
            getTerm().equals(other.getTerm()) &&
            ((getStructures().isPresent() && other.getStructures().isPresent()) ? (getStructures().get().equals(other.getStructures().get())) : (!getStructures().isPresent() && !other.getStructures().isPresent()));
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> getStructures() {
        return structures;
    }

    public final org.dressdiscover.api.models.component.ComponentTerm getTerm() {
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

    public static Component readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Component readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Component readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.component.ComponentTerm term = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        term = org.dressdiscover.api.models.component.ComponentTerm.readAsStruct(iprot);
        if (__list.getSize() > 1) {
            structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
        }
        iprot.readListEnd();
        return new Component(DefaultReadValidator.getInstance().validateTerm(term), DefaultReadValidator.getInstance().validateStructures(structures), NopConstructionValidator.getInstance());
    }

    public static Component readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Component readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.component.ComponentTerm term = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "term": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    term = org.dressdiscover.api.models.component.ComponentTerm.readAsStruct(iprot);
                }
                break;
            }
            case "structures": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
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
        return new Component(DefaultReadValidator.getInstance().validateTerm(term), DefaultReadValidator.getInstance().validateStructures(structures), NopConstructionValidator.getInstance());
    }

    public Component replaceStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
        return new Component(this.term, DefaultConstructionValidator.getInstance().validateStructures(structures), NopConstructionValidator.getInstance());
    }

    public Component replaceStructures(final org.dressdiscover.api.models.structure.StructureSet structures) {
        return replaceStructures(com.google.common.base.Optional.fromNullable(structures));
    }

    public Component replaceTerm(final org.dressdiscover.api.models.component.ComponentTerm term) {
        return new Component(DefaultConstructionValidator.getInstance().validateTerm(term), this.structures, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("term", getTerm()).add("structures", getStructures().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        getTerm().writeAsStruct(oprot);

        if (getStructures().isPresent()) {
            getStructures().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.component.Component");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("term", org.thryft.protocol.Type.STRUCT, (short)1);
        getTerm().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        if (getStructures().isPresent()) {
            oprot.writeFieldBegin("structures", org.thryft.protocol.Type.STRUCT, (short)2);
            getStructures().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.component.ComponentTerm term;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures;
}
