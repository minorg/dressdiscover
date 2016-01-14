package net.lab1318.costume.gui.models.location;

/**
 * VRA Core 4.0 location.name subelement
 */
public class LocationNameBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.location.LocationNameType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        EXTENT("extent", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "extent", org.thryft.protocol.Type.STRING),
        VOCAB_REF("vocabRef", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.VocabRefBean>() {}, false, 4, "vocab_ref", org.thryft.protocol.Type.STRUCT);

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
            case "vocabRef": return VOCAB_REF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "extent": return EXTENT;
            case "vocab_ref": return VOCAB_REF;
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

    public LocationNameBean() {
        text = null;
        type = null;
        extent = null;
        vocabRef = null;
    }

    public LocationNameBean(final net.lab1318.costume.api.models.location.LocationName other) {
        this.text = other.getText();
        this.type = other.getType();
        this.extent = other.getExtent().isPresent() ? other.getExtent().get() : null;
        this.vocabRef = other.getVocabRef().isPresent() ? new net.lab1318.costume.gui.models.VocabRefBean(other.getVocabRef().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof LocationNameBean)) {
            return false;
        }

        final LocationNameBean other = (LocationNameBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            (getExtent() != null ? getExtent().equals(other.getExtent()) : other.getExtent() == null) &&
            (getVocabRef() != null ? getVocabRef().equals(other.getVocabRef()) : other.getVocabRef() == null);
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
        case VOCAB_REF: return getVocabRef();
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

    public net.lab1318.costume.api.models.location.LocationNameType getType() {
        return type;
    }

    public net.lab1318.costume.gui.models.VocabRefBean getVocabRef() {
        return vocabRef;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getExtent() != null) {
            hashCode = 31 * hashCode + getExtent().hashCode();
        }
        if (getVocabRef() != null) {
            hashCode = 31 * hashCode + getVocabRef().hashCode();
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

    public void setType(final net.lab1318.costume.api.models.location.LocationNameType type) {
        this.type = type;
    }

    public void setVocabRef(final net.lab1318.costume.gui.models.VocabRefBean vocabRef) {
        this.vocabRef = vocabRef;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("extent", getExtent()).add("vocab_ref", getVocabRef()).toString();
    }

    private String text;

    private net.lab1318.costume.api.models.location.LocationNameType type;

    private String extent;

    private net.lab1318.costume.gui.models.VocabRefBean vocabRef;
}