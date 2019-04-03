package org.dressdiscover.api.vocabularies.costume_core.closure;

/**
 * Costume Core closure* elements
 */
public final class Closure implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Closure> {
        public Builder() {
            placement = null;
            type = null;
        }

        public Builder(final Closure other) {
            this.placement = other.getPlacement();
            this.type = other.getType();
        }

        protected Closure _build(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement, final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
            return new Closure(placement, type);
        }

        public Closure build() {
            Validator.validate(placement, type);

            return _build(placement, type);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement getPlacement() {
            return placement;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                this.setPlacement(org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement.readAsStruct(iprot));
                this.setType(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType.readAsStruct(iprot));
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
                    case "placement": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setPlacement(org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setType(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType.readAsStruct(iprot, unknownFieldCallback));
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
            case PLACEMENT: setPlacement((org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Closure other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setPlacement(other.getPlacement());
            setType(other.getType());

            return this;
        }

        public Builder setPlacement(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement) {
            Validator.validatePlacement(placement);
            this.placement = placement;
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
            Validator.validateType(type);
            this.type = type;
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
            case PLACEMENT: return unsetPlacement();
            case TYPE: return unsetType();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetPlacement() {
            this.placement = null;
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Closure> {
        @Override
        public Closure readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsList(iprot);
        }

        @Override
        public Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsStruct(iprot);
        }

        @Override
        public Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        PLACEMENT("placement", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement>() {}, true, (short)1, "placement", "1:placement", org.thryft.protocol.Type.STRUCT),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType>() {}, true, (short)2, "type", "2:type", org.thryft.protocol.Type.STRUCT);

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
            case "placement": return PLACEMENT;
            case "type": return TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "placement": return PLACEMENT;
            case "type": return TYPE;
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
        public static void validate(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement, final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
            validatePlacement(placement);
            validateType(type);
        }

        public static void validatePlacement(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement) {
            if (placement == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.costume_core.closure.Closure: placement is missing");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.costume_core.closure.Closure: type is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Closure(final Closure other) {
        this(other.getPlacement(), other.getType());
    }

    /**
     * Total constructor
     */
    public Closure(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement, final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
        Validator.validate(placement, type);
        this.placement = placement;
        this.type = type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Closure other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Closure> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Closure)) {
            return false;
        }

        final Closure other = (Closure)otherObject;

        if (!(getPlacement().equals(other.getPlacement()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
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
        case PLACEMENT: return getPlacement();
        case TYPE: return getType();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement getPlacement() {
        return placement;
    }

    public final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getPlacement().hashCode();
        hashCode = 31 * hashCode + getType().hashCode();
        return hashCode;
    }

    public static Closure readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Closure replacePlacement(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement) {
        Validator.validatePlacement(placement);
        return new Closure(placement, this.type);
    }

    public Closure replaceType(final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type) {
        Validator.validateType(type);
        return new Closure(this.placement, type);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("placement", getPlacement()).add("type", getType()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.costume_core.closure.Closure");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        getPlacement().writeAsStruct(oprot);
        getType().writeAsStruct(oprot);
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writePlacementField(oprot);

        writeTypeField(oprot);

        oprot.writeFieldStop();
    }

    public void writePlacementField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.PLACEMENT);
        getPlacement().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        getType().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.costume_core.closure.ClosurePlacement placement;

    private final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureType type;
}
