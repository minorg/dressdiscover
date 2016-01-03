package net.lab1318.costume.api.models.component;

/**
 * Costume Core component element
 */
public class Component implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            term = null;
            structures = com.google.common.base.Optional.absent();
        }

        public Builder(final Component other) {
            this.term = other.getTerm();
            this.structures = other.getStructures();
        }

        protected Component _build(final net.lab1318.costume.api.models.component.ComponentTerm term, final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures) {
            return new Component(term, structures);
        }

        public Component build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(term, "net.lab1318.costume.api.models.component.Component: missing term"), com.google.common.base.Preconditions.checkNotNull(structures, "net.lab1318.costume.api.models.component.Component: missing structures"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> getStructures() {
            return structures;
        }

        public final net.lab1318.costume.api.models.component.ComponentTerm getTerm() {
            return term;
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
            term = net.lab1318.costume.api.models.component.ComponentTerm.readAsStruct(iprot);
            if (__list.getSize() > 1) {
                structures = com.google.common.base.Optional.of(net.lab1318.costume.api.models.structure.StructureSet.readAsStruct(iprot));
            }
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
                case "term": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        term = net.lab1318.costume.api.models.component.ComponentTerm.readAsStruct(iprot);
                    }
                    break;
                }
                case "structures": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        structures = com.google.common.base.Optional.of(net.lab1318.costume.api.models.structure.StructureSet.readAsStruct(iprot));
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Component other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTerm(other.getTerm());
            if (other.getStructures().isPresent()) {
                setStructures(other.getStructures());
            }

            return this;
        }

        public Builder setStructures(final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures) {
            this.structures = com.google.common.base.Preconditions.checkNotNull(structures);
            return this;
        }

        public Builder setStructures(@javax.annotation.Nullable final net.lab1318.costume.api.models.structure.StructureSet structures) {
            this.structures = com.google.common.base.Optional.fromNullable(structures);
            return this;
        }

        public Builder setTerm(final net.lab1318.costume.api.models.component.ComponentTerm term) {
            this.term = com.google.common.base.Preconditions.checkNotNull(term);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "term": setTerm((net.lab1318.costume.api.models.component.ComponentTerm)value); return this;
            case "structures": setStructures((net.lab1318.costume.api.models.structure.StructureSet)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetStructures() {
            this.structures = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTerm() {
            this.term = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "term": return unsetTerm();
            case "structures": return unsetStructures();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.component.ComponentTerm term;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERM("term", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.component.ComponentTerm>() {}, true, 1, "term", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.structure.StructureSet>() {}, false, 2, "structures", org.thryft.protocol.Type.STRUCT);

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

    /**
     * Copy constructor
     */
    public Component(final Component other) {
        this(other.getTerm(), other.getStructures());
    }

    /**
     * Required constructor
     */
    public Component(final net.lab1318.costume.api.models.component.ComponentTerm term) {
        this.term = com.google.common.base.Preconditions.checkNotNull(term, "net.lab1318.costume.api.models.component.Component: missing term");
        this.structures = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Component(final net.lab1318.costume.api.models.component.ComponentTerm term, final @javax.annotation.Nullable net.lab1318.costume.api.models.structure.StructureSet structures) {
        this.term = com.google.common.base.Preconditions.checkNotNull(term, "net.lab1318.costume.api.models.component.Component: missing term");
        this.structures = com.google.common.base.Optional.fromNullable(structures);
    }

    /**
     * Optional constructor
     */
    public Component(final net.lab1318.costume.api.models.component.ComponentTerm term, final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures) {
        this.term = com.google.common.base.Preconditions.checkNotNull(term, "net.lab1318.costume.api.models.component.Component: missing term");
        this.structures = com.google.common.base.Preconditions.checkNotNull(structures, "net.lab1318.costume.api.models.component.Component: missing structures");
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
        } else if (!(otherObject instanceof Component)) {
            return false;
        }

        final Component other = (Component)otherObject;
        return
            getTerm().equals(other.getTerm()) &&
            getStructures().equals(other.getStructures());
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> getStructures() {
        return structures;
    }

    public final net.lab1318.costume.api.models.component.ComponentTerm getTerm() {
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Component readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.component.ComponentTerm term = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        term = net.lab1318.costume.api.models.component.ComponentTerm.readAsStruct(iprot);
        if (__list.getSize() > 1) {
            structures = com.google.common.base.Optional.of(net.lab1318.costume.api.models.structure.StructureSet.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Component(term, structures);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Component readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.component.ComponentTerm term = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "term": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    term = net.lab1318.costume.api.models.component.ComponentTerm.readAsStruct(iprot);
                }
                break;
            }
            case "structures": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    structures = com.google.common.base.Optional.of(net.lab1318.costume.api.models.structure.StructureSet.readAsStruct(iprot));
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Component(term, structures);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Component replaceStructures(final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures) {
        return new Component(this.term, structures);
    }

    public Component replaceStructures(final net.lab1318.costume.api.models.structure.StructureSet structures) {
        return replaceStructures(com.google.common.base.Optional.fromNullable(structures));
    }

    public Component replaceTerm(final net.lab1318.costume.api.models.component.ComponentTerm term) {
        return new Component(term, this.structures);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.component.Component");
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

    private final net.lab1318.costume.api.models.component.ComponentTerm term;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.structure.StructureSet> structures;
}
