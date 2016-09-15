package org.dressdiscover.api.models.measurements;

/**
 * VRA Core 4.0 measurements element
 */
public final class Measurements implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public final static class Builder {
        public Builder() {
            text = null;
            type = null;
            extent = com.google.common.base.Optional.<String> absent();
            unit = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsUnit> absent();
        }

        public Builder(final Measurements other) {
            this.text = other.getText();
            this.type = other.getType();
            this.extent = other.getExtent();
            this.unit = other.getUnit();
        }

        protected Measurements _build(final String text, final org.dressdiscover.api.models.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit) {
            return new Measurements(text, type, extent, unit);
        }

        public Measurements build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.measurements.Measurements: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.measurements.Measurements: missing type"), com.google.common.base.Preconditions.checkNotNull(extent, "org.dressdiscover.api.models.measurements.Measurements: missing extent"), com.google.common.base.Preconditions.checkNotNull(unit, "org.dressdiscover.api.models.measurements.Measurements: missing unit"));
        }

        public final com.google.common.base.Optional<String> getExtent() {
            return extent;
        }

        public final String getText() {
            return text;
        }

        public final org.dressdiscover.api.models.measurements.MeasurementsType getType() {
            return type;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> getUnit() {
            return unit;
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
            text = iprot.readString();
            type = iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsType.class);
            if (__list.getSize() > 2) {
                extent = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    unit = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsUnit.class));
                } catch (final IllegalArgumentException e) {
                }
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsType.class);
                    }
                    break;
                }
                case "extent": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        extent = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "unit": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            unit = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsUnit.class));
                        } catch (final IllegalArgumentException e) {
                        }
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
            case TEXT: setText((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.models.measurements.MeasurementsType)value); return this;
            case EXTENT: setExtent((String)value); return this;
            case UNIT: setUnit((org.dressdiscover.api.models.measurements.MeasurementsUnit)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setExtent(final com.google.common.base.Optional<String> extent) {
            this.extent = com.google.common.base.Preconditions.checkNotNull(extent);
            return this;
        }

        public Builder setExtent(@javax.annotation.Nullable final String extent) {
            this.extent = com.google.common.base.Optional.fromNullable(extent);
            return this;
        }

        public Builder setIfPresent(final Measurements other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getExtent().isPresent()) {
                setExtent(other.getExtent());
            }
            if (other.getUnit().isPresent()) {
                setUnit(other.getUnit());
            }

            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.models.measurements.MeasurementsType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setUnit(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit) {
            this.unit = com.google.common.base.Preconditions.checkNotNull(unit);
            return this;
        }

        public Builder setUnit(@javax.annotation.Nullable final org.dressdiscover.api.models.measurements.MeasurementsUnit unit) {
            this.unit = com.google.common.base.Optional.fromNullable(unit);
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
            case TEXT: return unsetText();
            case TYPE: return unsetType();
            case EXTENT: return unsetExtent();
            case UNIT: return unsetUnit();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetExtent() {
            this.extent = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unsetUnit() {
            this.unit = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsUnit> absent();
            return this;
        }

        private String text;
        private org.dressdiscover.api.models.measurements.MeasurementsType type;
        private com.google.common.base.Optional<String> extent;
        private com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Measurements> {
        @Override
        public Measurements readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAs(iprot, type);
        }

        @Override
        public Measurements readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Measurements readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsList(iprot);
        }

        @Override
        public Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsStruct(iprot);
        }

        @Override
        public Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.measurements.MeasurementsType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        EXTENT("extent", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "extent", org.thryft.protocol.Type.STRING),
        UNIT("unit", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.measurements.MeasurementsUnit>() {}, false, 4, "unit", org.thryft.protocol.Type.STRING);

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
            case "text": return TEXT;
            case "type": return TYPE;
            case "extent": return EXTENT;
            case "unit": return UNIT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "extent": return EXTENT;
            case "unit": return UNIT;
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
    public Measurements(final Measurements other) {
        this(other.getText(), other.getType(), other.getExtent(), other.getUnit());
    }

    protected Measurements(final String text, final org.dressdiscover.api.models.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit) {
        this.text = text;
        this.type = type;
        this.extent = extent;
        this.unit = unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Measurements other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Measurements> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Measurements create(final String text, final org.dressdiscover.api.models.measurements.MeasurementsType type) {
        return new Measurements(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.measurements.Measurements: missing text"), "org.dressdiscover.api.models.measurements.Measurements: text is empty"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.measurements.Measurements: missing type"), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsUnit> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static Measurements create(final String text, final org.dressdiscover.api.models.measurements.MeasurementsType type, final @javax.annotation.Nullable String extent, final @javax.annotation.Nullable org.dressdiscover.api.models.measurements.MeasurementsUnit unit) {
        return new Measurements(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.measurements.Measurements: missing text"), "org.dressdiscover.api.models.measurements.Measurements: text is empty"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.measurements.Measurements: missing type"), org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(extent), "org.dressdiscover.api.models.measurements.Measurements: extent is empty"), com.google.common.base.Optional.fromNullable(unit));
    }

    /**
     * Optional factory method
     */
    public static Measurements create(final String text, final org.dressdiscover.api.models.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit) {
        return new Measurements(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.measurements.Measurements: missing text"), "org.dressdiscover.api.models.measurements.Measurements: text is empty"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.measurements.Measurements: missing type"), org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(extent, "org.dressdiscover.api.models.measurements.Measurements: missing extent"), "org.dressdiscover.api.models.measurements.Measurements: extent is empty"), com.google.common.base.Preconditions.checkNotNull(unit, "org.dressdiscover.api.models.measurements.Measurements: missing unit"));
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Measurements)) {
            return false;
        }

        final Measurements other = (Measurements)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            ((getExtent().isPresent() && other.getExtent().isPresent()) ? (getExtent().get().equals(other.getExtent().get())) : (!getExtent().isPresent() && !other.getExtent().isPresent())) &&
            ((getUnit().isPresent() && other.getUnit().isPresent()) ? (getUnit().get().equals(other.getUnit().get())) : (!getUnit().isPresent() && !other.getUnit().isPresent()));
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
        case TEXT: return getText();
        case TYPE: return getType();
        case EXTENT: return getExtent();
        case UNIT: return getUnit();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getExtent() {
        return extent;
    }

    public final String getText() {
        return text;
    }

    public final org.dressdiscover.api.models.measurements.MeasurementsType getType() {
        return type;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> getUnit() {
        return unit;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getExtent().isPresent()) {
            hashCode = 31 * hashCode + getExtent().get().hashCode();
        }
        if (getUnit().isPresent()) {
            hashCode = 31 * hashCode + getUnit().get().ordinal();
        }
        return hashCode;
    }

    public static Measurements readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Measurements readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Measurements readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.models.measurements.MeasurementsType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsUnit> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsType.class);
        if (__list.getSize() > 2) {
            extent = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            try {
                unit = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsUnit.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new Measurements(text, type, extent, unit);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.models.measurements.MeasurementsType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsUnit> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "text": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    text = iprot.readString();
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    type = iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsType.class);
                }
                break;
            }
            case "extent": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    extent = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "unit": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    try {
                        unit = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.measurements.MeasurementsUnit.class));
                    } catch (final IllegalArgumentException e) {
                    }
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
            return new Measurements(text, type, extent, unit);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Measurements replaceExtent(final com.google.common.base.Optional<String> extent) {
        return new Measurements(this.text, this.type, extent, this.unit);
    }

    public Measurements replaceExtent(final String extent) {
        return replaceExtent(com.google.common.base.Optional.fromNullable(extent));
    }

    public Measurements replaceText(final String text) {
        return new Measurements(text, this.type, this.extent, this.unit);
    }

    public Measurements replaceType(final org.dressdiscover.api.models.measurements.MeasurementsType type) {
        return new Measurements(this.text, type, this.extent, this.unit);
    }

    public Measurements replaceUnit(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit) {
        return new Measurements(this.text, this.type, this.extent, unit);
    }

    public Measurements replaceUnit(final org.dressdiscover.api.models.measurements.MeasurementsUnit unit) {
        return replaceUnit(com.google.common.base.Optional.fromNullable(unit));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("extent", getExtent().orNull()).add("unit", getUnit().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getExtent().isPresent()) {
            oprot.writeString(getExtent().get());
        } else {
            oprot.writeNull();
        }

        if (getUnit().isPresent()) {
            oprot.writeEnum(getUnit().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.measurements.Measurements");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getExtent().isPresent()) {
            oprot.writeFieldBegin("extent", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getExtent().get());
            oprot.writeFieldEnd();
        }

        if (getUnit().isPresent()) {
            oprot.writeFieldBegin("unit", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeEnum(getUnit().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final org.dressdiscover.api.models.measurements.MeasurementsType type;

    private final com.google.common.base.Optional<String> extent;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsUnit> unit;
}
