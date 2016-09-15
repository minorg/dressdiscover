package org.dressdiscover.api.models.closure;

/**
 * Costume Core closure* elements
 */
public class Closure implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public static class Builder {
        public Builder() {
            placement = null;
            type = null;
        }

        public Builder(final Closure other) {
            this.placement = other.getPlacement();
            this.type = other.getType();
        }

        protected Closure _build(final org.dressdiscover.api.models.closure.ClosurePlacement placement, final org.dressdiscover.api.models.closure.ClosureType type) {
            return new Closure(placement, type);
        }

        public Closure build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(placement, "org.dressdiscover.api.models.closure.Closure: missing placement"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.closure.Closure: missing type"));
        }

        public final org.dressdiscover.api.models.closure.ClosurePlacement getPlacement() {
            return placement;
        }

        public final org.dressdiscover.api.models.closure.ClosureType getType() {
            return type;
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
            placement = org.dressdiscover.api.models.closure.ClosurePlacement.readAsStruct(iprot);
            type = org.dressdiscover.api.models.closure.ClosureType.readAsStruct(iprot);
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
                case "placement": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        placement = org.dressdiscover.api.models.closure.ClosurePlacement.readAsStruct(iprot);
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = org.dressdiscover.api.models.closure.ClosureType.readAsStruct(iprot);
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
            case PLACEMENT: setPlacement((org.dressdiscover.api.models.closure.ClosurePlacement)value); return this;
            case TYPE: setType((org.dressdiscover.api.models.closure.ClosureType)value); return this;
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

        public Builder setPlacement(final org.dressdiscover.api.models.closure.ClosurePlacement placement) {
            this.placement = com.google.common.base.Preconditions.checkNotNull(placement);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.models.closure.ClosureType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
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

        private org.dressdiscover.api.models.closure.ClosurePlacement placement;
        private org.dressdiscover.api.models.closure.ClosureType type;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Closure> {
        @Override
        public Closure readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAs(iprot, type);
        }

        @Override
        public Closure readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Closure readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsList(iprot);
        }

        @Override
        public Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsStruct(iprot);
        }

        @Override
        public Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Closure.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        PLACEMENT("placement", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.closure.ClosurePlacement>() {}, true, 1, "placement", org.thryft.protocol.Type.STRUCT),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.closure.ClosureType>() {}, true, 2, "type", org.thryft.protocol.Type.STRUCT);

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
    public Closure(final Closure other) {
        this(other.getPlacement(), other.getType());
    }

    protected Closure(final org.dressdiscover.api.models.closure.ClosurePlacement placement, final org.dressdiscover.api.models.closure.ClosureType type) {
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

    /**
     * Optional factory method
     */
    public static Closure create(final org.dressdiscover.api.models.closure.ClosurePlacement placement, final org.dressdiscover.api.models.closure.ClosureType type) {
        return new Closure(com.google.common.base.Preconditions.checkNotNull(placement, "org.dressdiscover.api.models.closure.Closure: missing placement"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.closure.Closure: missing type"));
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Closure)) {
            return false;
        }

        final Closure other = (Closure)otherObject;
        return
            getPlacement().equals(other.getPlacement()) &&
            getType().equals(other.getType());
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

    public final org.dressdiscover.api.models.closure.ClosurePlacement getPlacement() {
        return placement;
    }

    public final org.dressdiscover.api.models.closure.ClosureType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getPlacement().hashCode();
        hashCode = 31 * hashCode + getType().hashCode();
        return hashCode;
    }

    public static Closure readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Closure readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Closure readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.closure.ClosurePlacement placement = null;
        org.dressdiscover.api.models.closure.ClosureType type = null;

        iprot.readListBegin();
        placement = org.dressdiscover.api.models.closure.ClosurePlacement.readAsStruct(iprot);
        type = org.dressdiscover.api.models.closure.ClosureType.readAsStruct(iprot);
        iprot.readListEnd();
        try {
            return new Closure(placement, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Closure readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.closure.ClosurePlacement placement = null;
        org.dressdiscover.api.models.closure.ClosureType type = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "placement": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    placement = org.dressdiscover.api.models.closure.ClosurePlacement.readAsStruct(iprot);
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    type = org.dressdiscover.api.models.closure.ClosureType.readAsStruct(iprot);
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
            return new Closure(placement, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Closure replacePlacement(final org.dressdiscover.api.models.closure.ClosurePlacement placement) {
        return new Closure(placement, this.type);
    }

    public Closure replaceType(final org.dressdiscover.api.models.closure.ClosureType type) {
        return new Closure(this.placement, type);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("placement", getPlacement()).add("type", getType()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        getPlacement().writeAsStruct(oprot);

        getType().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.closure.Closure");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("placement", org.thryft.protocol.Type.STRUCT, (short)1);
        getPlacement().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRUCT, (short)2);
        getType().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.closure.ClosurePlacement placement;

    private final org.dressdiscover.api.models.closure.ClosureType type;
}
