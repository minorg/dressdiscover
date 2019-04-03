package org.dressdiscover.api.vocabularies.vra_core.measurements;

/**
 * VRA Core 4.0 measurements element
 */
public final class Measurements implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Measurements> {
        public Builder() {
            text = null;
            type = null;
            extent = com.google.common.base.Optional.<String> absent();
            unit = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> absent();
        }

        public Builder(final Measurements other) {
            this.text = other.getText();
            this.type = other.getType();
            this.extent = other.getExtent();
            this.unit = other.getUnit();
        }

        protected Measurements _build(final String text, final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
            return new Measurements(text, type, extent, unit);
        }

        public Measurements build() {
            Validator.validate(text, type, extent, unit);

            return _build(text, type, extent, unit);
        }

        public final com.google.common.base.Optional<String> getExtent() {
            return extent;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType getType() {
            return type;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> getUnit() {
            return unit;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setText(iprot.readString());
                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType.Factory.getInstance()));
                if (__list.getSize() > 2) {
                    this.setExtent(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 3) {
                    this.setUnit(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit.Factory.getInstance())));
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
                    case "text": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setText(iprot.readString());
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType.Factory.getInstance()));
                        }
                        break;
                    }
                    case "extent": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setExtent(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "unit": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                this.setUnit(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit.Factory.getInstance())));
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
            case TEXT: setText((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType)value); return this;
            case EXTENT: setExtent((String)value); return this;
            case UNIT: setUnit((org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setExtent(final com.google.common.base.Optional<String> extent) {
            Validator.validateExtent(extent);
            this.extent = extent;
            return this;
        }

        public Builder setExtent(final @javax.annotation.Nullable String extent) {
            return setExtent(com.google.common.base.Optional.fromNullable(extent));
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
            Validator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type) {
            Validator.validateType(type);
            this.type = type;
            return this;
        }

        public Builder setUnit(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
            Validator.validateUnit(unit);
            this.unit = unit;
            return this;
        }

        public Builder setUnit(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit unit) {
            return setUnit(com.google.common.base.Optional.fromNullable(unit));
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
            this.unit = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> absent();
            return this;
        }

        private @javax.annotation.Nullable String text;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type;
        private com.google.common.base.Optional<String> extent;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Measurements> {
        @Override
        public Measurements readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsList(iprot);
        }

        @Override
        public Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsStruct(iprot);
        }

        @Override
        public Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Measurements.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", "1:text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType>() {}, true, (short)2, "type", "2:type", org.thryft.protocol.Type.STRING),
        EXTENT("extent", new com.google.common.reflect.TypeToken<String>() {}, false, (short)3, "extent", "3:extent", org.thryft.protocol.Type.STRING),
        UNIT("unit", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit>() {}, false, (short)4, "unit", "4:unit", org.thryft.protocol.Type.STRING);

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
        public static void validate(final String text, final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
            validateText(text);
            validateType(type);
            validateExtent(extent);
            validateUnit(unit);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: text is missing");
            }
            if (text.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: text: less than min length 1");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: type is missing");
            }
        }

        public static void validateExtent(final com.google.common.base.Optional<String> extent) {
            if (extent == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: extent is missing");
            }
            if (extent.isPresent()) {
                if (extent.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: extent: less than min length 1");
                }
            }
        }

        public static void validateUnit(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
            if (unit == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements: unit is missing");
            }
        }
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
    public Measurements(final String text, final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type) {
        this(text, type, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> absent());
    }

    /**
     * Total constructor
     */
    public Measurements(final String text, final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
        Validator.validate(text, type, extent, unit);
        this.text = text;
        this.type = type;
        this.extent = extent;
        this.unit = unit;
    }

    /**
     * Total Nullable constructor
     */
    public Measurements(final String text, final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type, @javax.annotation.Nullable final String extent, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit unit) {
        this(text, type, com.google.common.base.Optional.fromNullable(extent), com.google.common.base.Optional.fromNullable(unit));
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
        }
        if (!(otherObject instanceof Measurements)) {
            return false;
        }

        final Measurements other = (Measurements)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getExtent().isPresent() && other.getExtent().isPresent()) ? (getExtent().get().equals(other.getExtent().get())) : (!getExtent().isPresent() && !other.getExtent().isPresent())))) {
            return false;
        }

        if (!(((getUnit().isPresent() && other.getUnit().isPresent()) ? (getUnit().get().equals(other.getUnit().get())) : (!getUnit().isPresent() && !other.getUnit().isPresent())))) {
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

    public final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType getType() {
        return type;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> getUnit() {
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

    public static Measurements readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Measurements readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Measurements replaceExtent(final com.google.common.base.Optional<String> extent) {
        Validator.validateExtent(extent);
        return new Measurements(this.text, this.type, extent, this.unit);
    }

    public Measurements replaceExtent(@javax.annotation.Nullable final String extent) {
        return replaceExtent(com.google.common.base.Optional.fromNullable(extent));
    }

    public Measurements replaceText(final String text) {
        Validator.validateText(text);
        return new Measurements(text, this.type, this.extent, this.unit);
    }

    public Measurements replaceType(final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type) {
        Validator.validateType(type);
        return new Measurements(this.text, type, this.extent, this.unit);
    }

    public Measurements replaceUnit(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit) {
        Validator.validateUnit(unit);
        return new Measurements(this.text, this.type, this.extent, unit);
    }

    public Measurements replaceUnit(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit unit) {
        return replaceUnit(com.google.common.base.Optional.fromNullable(unit));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("extent", getExtent().orNull()).add("unit", getUnit().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeExtentField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExtent().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXTENT);
            oprot.writeString(getExtent().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeTypeField(oprot);

        writeExtentField(oprot);

        writeUnitField(oprot);

        oprot.writeFieldStop();
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    public void writeUnitField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUnit().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.UNIT);
            oprot.writeEnum(getUnit().get());
            oprot.writeFieldEnd();
        }
    }

    private final String text;

    private final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsType type;

    private final com.google.common.base.Optional<String> extent;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsUnit> unit;
}
