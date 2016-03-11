package net.lab1318.costume.gui.models.measurements;

/**
 * VRA Core 4.0 measurements element
 */
public class MeasurementsBean implements org.thryft.StructBean {
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

    public MeasurementsBean() {
        text = null;
        type = null;
        extent = null;
        unit = null;
    }

    public MeasurementsBean(final net.lab1318.costume.api.models.measurements.Measurements other) {
        this.text = other.getText();
        this.type = other.getType();
        this.extent = other.getExtent().isPresent() ? other.getExtent().get() : null;
        this.unit = other.getUnit().isPresent() ? other.getUnit().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MeasurementsBean)) {
            return false;
        }

        final MeasurementsBean other = (MeasurementsBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            ((getExtent() != null && other.getExtent() != null) ? (getExtent().equals(other.getExtent())) : (getExtent() == null && other.getExtent() == null)) &&
            ((getUnit() != null && other.getUnit() != null) ? (getUnit().equals(other.getUnit())) : (getUnit() == null && other.getUnit() == null));
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

    public String getExtent() {
        return extent;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.measurements.MeasurementsType getType() {
        return type;
    }

    public net.lab1318.costume.api.models.measurements.MeasurementsUnit getUnit() {
        return unit;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getExtent() != null) {
            hashCode = 31 * hashCode + getExtent().hashCode();
        }
        if (getUnit() != null) {
            hashCode = 31 * hashCode + getUnit().ordinal();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setExtent(final String extent) {
        this.extent = extent;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.measurements.MeasurementsType type) {
        this.type = type;
    }

    public void setUnit(final net.lab1318.costume.api.models.measurements.MeasurementsUnit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("extent", getExtent()).add("unit", getUnit()).toString();
    }

    private String text;

    private net.lab1318.costume.api.models.measurements.MeasurementsType type;

    private String extent;

    private net.lab1318.costume.api.models.measurements.MeasurementsUnit unit;
}
