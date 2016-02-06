package net.lab1318.costume.gui.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public class RightsBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
        LICENSE_VOCAB_REF("licenseVocabRef", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.VocabRefBean>() {}, false, 5, "license_vocab_ref", org.thryft.protocol.Type.STRUCT),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "notes", org.thryft.protocol.Type.STRING),
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "rights_holder", org.thryft.protocol.Type.STRING);

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
            case "licenseVocabRef": return LICENSE_VOCAB_REF;
            case "notes": return NOTES;
            case "rightsHolder": return RIGHTS_HOLDER;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "license_vocab_ref": return LICENSE_VOCAB_REF;
            case "notes": return NOTES;
            case "rights_holder": return RIGHTS_HOLDER;
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

    public RightsBean() {
        text = null;
        type = null;
        licenseVocabRef = null;
        notes = null;
        rightsHolder = null;
    }

    public RightsBean(final net.lab1318.costume.api.models.rights.Rights other) {
        this.text = other.getText();
        this.type = other.getType();
        this.licenseVocabRef = other.getLicenseVocabRef().isPresent() ? new net.lab1318.costume.gui.models.VocabRefBean(other.getLicenseVocabRef().get()) : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
        this.rightsHolder = other.getRightsHolder().isPresent() ? other.getRightsHolder().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RightsBean)) {
            return false;
        }

        final RightsBean other = (RightsBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            (getLicenseVocabRef() != null ? getLicenseVocabRef().equals(other.getLicenseVocabRef()) : other.getLicenseVocabRef() == null) &&
            (getNotes() != null ? getNotes().equals(other.getNotes()) : other.getNotes() == null) &&
            (getRightsHolder() != null ? getRightsHolder().equals(other.getRightsHolder()) : other.getRightsHolder() == null);
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
        case LICENSE_VOCAB_REF: return getLicenseVocabRef();
        case NOTES: return getNotes();
        case RIGHTS_HOLDER: return getRightsHolder();
        default:
            throw new IllegalStateException();
        }
    }

    public net.lab1318.costume.gui.models.VocabRefBean getLicenseVocabRef() {
        return licenseVocabRef;
    }

    public String getNotes() {
        return notes;
    }

    public String getRightsHolder() {
        return rightsHolder;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.rights.RightsType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getLicenseVocabRef() != null) {
            hashCode = 31 * hashCode + getLicenseVocabRef().hashCode();
        }
        if (getNotes() != null) {
            hashCode = 31 * hashCode + getNotes().hashCode();
        }
        if (getRightsHolder() != null) {
            hashCode = 31 * hashCode + getRightsHolder().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setLicenseVocabRef(final net.lab1318.costume.gui.models.VocabRefBean licenseVocabRef) {
        this.licenseVocabRef = licenseVocabRef;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public void setRightsHolder(final String rightsHolder) {
        this.rightsHolder = rightsHolder;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.rights.RightsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("license_vocab_ref", getLicenseVocabRef()).add("notes", getNotes()).add("rights_holder", getRightsHolder()).toString();
    }

    private String text;

    private net.lab1318.costume.api.models.rights.RightsType type;

    private net.lab1318.costume.gui.models.VocabRefBean licenseVocabRef;

    private String notes;

    private String rightsHolder;
}
