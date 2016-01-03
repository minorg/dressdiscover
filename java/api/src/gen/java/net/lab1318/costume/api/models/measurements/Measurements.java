package net.lab1318.costume.api.models.measurements;

/**
 * VRA Core 4.0 measurements element
 */
public class Measurements implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            extent = com.google.common.base.Optional.absent();
            unit = com.google.common.base.Optional.absent();
        }

        public Builder(final Measurements other) {
            this.text = other.getText();
            this.type = other.getType();
            this.extent = other.getExtent();
            this.unit = other.getUnit();
        }

        protected Measurements _build(final String text, final net.lab1318.costume.api.models.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit) {
            return new Measurements(text, type, extent, unit);
        }

        public Measurements build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.measurements.Measurements: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.measurements.Measurements: missing type"), com.google.common.base.Preconditions.checkNotNull(extent, "net.lab1318.costume.api.models.measurements.Measurements: missing extent"), com.google.common.base.Preconditions.checkNotNull(unit, "net.lab1318.costume.api.models.measurements.Measurements: missing unit"));
        }

        public final com.google.common.base.Optional<String> getExtent() {
            return extent;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.measurements.MeasurementsType getType() {
            return type;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> getUnit() {
            return unit;
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
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsType.class);
            if (__list.getSize() > 2) {
                extent = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    unit = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsUnit.class));
                } catch (final IllegalArgumentException e) {
                }
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsType.class);
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
                            unit = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsUnit.class));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
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

        public Builder setType(final net.lab1318.costume.api.models.measurements.MeasurementsType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setUnit(final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit) {
            this.unit = com.google.common.base.Preconditions.checkNotNull(unit);
            return this;
        }

        public Builder setUnit(@javax.annotation.Nullable final net.lab1318.costume.api.models.measurements.MeasurementsUnit unit) {
            this.unit = com.google.common.base.Optional.fromNullable(unit);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.measurements.MeasurementsType)value); return this;
            case "extent": setExtent((String)value); return this;
            case "unit": setUnit((net.lab1318.costume.api.models.measurements.MeasurementsUnit)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetExtent() {
            this.extent = com.google.common.base.Optional.absent();
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
            this.unit = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": return unsetText();
            case "type": return unsetType();
            case "extent": return unsetExtent();
            case "unit": return unsetUnit();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.measurements.MeasurementsType type;
        private com.google.common.base.Optional<String> extent;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.measurements.MeasurementsType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        EXTENT("extent", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "extent", org.thryft.protocol.Type.STRING),
        UNIT("unit", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.measurements.MeasurementsUnit>() {}, false, 4, "unit", org.thryft.protocol.Type.STRING);

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

    /**
     * Required constructor
     */
    public Measurements(final String text, final net.lab1318.costume.api.models.measurements.MeasurementsType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.measurements.Measurements: missing text"), "net.lab1318.costume.api.models.measurements.Measurements: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.measurements.Measurements: missing type");
        this.extent = com.google.common.base.Optional.absent();
        this.unit = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Measurements(final String text, final net.lab1318.costume.api.models.measurements.MeasurementsType type, final @javax.annotation.Nullable String extent, final @javax.annotation.Nullable net.lab1318.costume.api.models.measurements.MeasurementsUnit unit) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.measurements.Measurements: missing text"), "net.lab1318.costume.api.models.measurements.Measurements: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.measurements.Measurements: missing type");
        this.extent = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(extent), "net.lab1318.costume.api.models.measurements.Measurements: extent is empty");
        this.unit = com.google.common.base.Optional.fromNullable(unit);
    }

    /**
     * Optional constructor
     */
    public Measurements(final String text, final net.lab1318.costume.api.models.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.measurements.Measurements: missing text"), "net.lab1318.costume.api.models.measurements.Measurements: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.measurements.Measurements: missing type");
        this.extent = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(extent, "net.lab1318.costume.api.models.measurements.Measurements: missing extent"), "net.lab1318.costume.api.models.measurements.Measurements: extent is empty");
        this.unit = com.google.common.base.Preconditions.checkNotNull(unit, "net.lab1318.costume.api.models.measurements.Measurements: missing unit");
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
            getExtent().equals(other.getExtent()) &&
            getUnit().equals(other.getUnit());
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

    public final net.lab1318.costume.api.models.measurements.MeasurementsType getType() {
        return type;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> getUnit() {
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Measurements readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.measurements.MeasurementsType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsType.class);
        if (__list.getSize() > 2) {
            extent = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            try {
                unit = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsUnit.class));
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
        String text = null;
        net.lab1318.costume.api.models.measurements.MeasurementsType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit = com.google.common.base.Optional.absent();

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
                    type = iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsType.class);
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
                        unit = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.measurements.MeasurementsUnit.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
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

    public Measurements replaceType(final net.lab1318.costume.api.models.measurements.MeasurementsType type) {
        return new Measurements(this.text, type, this.extent, this.unit);
    }

    public Measurements replaceUnit(final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit) {
        return new Measurements(this.text, this.type, this.extent, unit);
    }

    public Measurements replaceUnit(final net.lab1318.costume.api.models.measurements.MeasurementsUnit unit) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.measurements.Measurements");
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

    private final net.lab1318.costume.api.models.measurements.MeasurementsType type;

    private final com.google.common.base.Optional<String> extent;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.measurements.MeasurementsUnit> unit;
}
