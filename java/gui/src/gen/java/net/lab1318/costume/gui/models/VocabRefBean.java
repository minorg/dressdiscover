package net.lab1318.costume.gui.models;

public class VocabRefBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        VOCAB("vocab", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.Vocab>() {}, true, 2, "vocab", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "refid", org.thryft.protocol.Type.STRING),
        URI("uri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 3, "uri", org.thryft.protocol.Type.STRING);

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
            case "vocab": return VOCAB;
            case "refid": return REFID;
            case "uri": return URI;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "vocab": return VOCAB;
            case "refid": return REFID;
            case "uri": return URI;
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

    public VocabRefBean() {
        vocab = null;
        refid = null;
        uri = null;
    }

    public VocabRefBean(final net.lab1318.costume.api.models.VocabRef other) {
        this.vocab = other.getVocab();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.uri = other.getUri().isPresent() ? other.getUri().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof VocabRefBean)) {
            return false;
        }

        final VocabRefBean other = (VocabRefBean)otherObject;
        return
            getVocab().equals(other.getVocab()) &&
            (getRefid() != null ? getRefid().equals(other.getRefid()) : other.getRefid() == null) &&
            (getUri() != null ? getUri().equals(other.getUri()) : other.getUri() == null);
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
        case VOCAB: return getVocab();
        case REFID: return getRefid();
        case URI: return getUri();
        default:
            throw new IllegalStateException();
        }
    }

    public String getRefid() {
        return refid;
    }

    public org.thryft.native_.Uri getUri() {
        return uri;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getVocab().ordinal();
        if (getRefid() != null) {
            hashCode = 31 * hashCode + getRefid().hashCode();
        }
        if (getUri() != null) {
            hashCode = 31 * hashCode + getUri().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setRefid(final String refid) {
        this.refid = refid;
    }

    public void setUri(final org.thryft.native_.Uri uri) {
        this.uri = uri;
    }

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("vocab", getVocab()).add("refid", getRefid()).add("uri", getUri()).toString();
    }

    private net.lab1318.costume.api.models.Vocab vocab;

    private String refid;

    private org.thryft.native_.Uri uri;
}
