package net.lab1318.costume.gui.models.material;

/**
 * VRA Core 4.0 material element
 */
public class MaterialBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.material.MaterialType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "refid", org.thryft.protocol.Type.STRING),
        VOCAB("vocab", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.Vocab>() {}, false, 4, "vocab", org.thryft.protocol.Type.STRING);

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
            case "type": return TYPE;
            case "text": return TEXT;
            case "refid": return REFID;
            case "vocab": return VOCAB;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "text": return TEXT;
            case "refid": return REFID;
            case "vocab": return VOCAB;
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

    public MaterialBean() {
        type = null;
        text = null;
        refid = null;
        vocab = null;
    }

    public MaterialBean(final net.lab1318.costume.api.models.material.Material other) {
        this.type = other.getType();
        this.text = other.getText();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MaterialBean)) {
            return false;
        }

        final MaterialBean other = (MaterialBean)otherObject;
        return
            getType().equals(other.getType()) &&
            getText().equals(other.getText()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    public String getRefid() {
        return refid;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.material.MaterialType getType() {
        return type;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        hashCode = 31 * hashCode + getText().hashCode();
        if (getRefid() != null) {
            hashCode = 31 * hashCode + getRefid().hashCode();
        }
        if (getVocab() != null) {
            hashCode = 31 * hashCode + getVocab().ordinal();
        }
        return hashCode;
    }

    public void setRefid(final String refid) {
        this.refid = refid;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.material.MaterialType type) {
        this.type = type;
    }

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("text", getText()).add("refid", getRefid()).add("vocab", getVocab()).toString();
    }

    private net.lab1318.costume.api.models.material.MaterialType type;

    private String text;

    private String refid;

    private net.lab1318.costume.api.models.Vocab vocab;
}
