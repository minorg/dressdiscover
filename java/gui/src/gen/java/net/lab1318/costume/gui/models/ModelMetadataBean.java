package net.lab1318.costume.gui.models;

public class ModelMetadataBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CTIME("ctime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 1, "ctime", org.thryft.protocol.Type.I64),
        MTIME("mtime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 2, "mtime", org.thryft.protocol.Type.I64);

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
            case "ctime": return CTIME;
            case "mtime": return MTIME;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "ctime": return CTIME;
            case "mtime": return MTIME;
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

    public ModelMetadataBean() {
        ctime = null;
        mtime = null;
    }

    public ModelMetadataBean(final net.lab1318.costume.api.models.ModelMetadata other) {
        this.ctime = other.getCtime();
        this.mtime = other.getMtime();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ModelMetadataBean)) {
            return false;
        }

        final ModelMetadataBean other = (ModelMetadataBean)otherObject;
        return
            getCtime().equals(other.getCtime()) &&
            getMtime().equals(other.getMtime());
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
        case CTIME: return getCtime();
        case MTIME: return getMtime();
        default:
            throw new IllegalStateException();
        }
    }

    public java.util.Date getCtime() {
        return ctime;
    }

    public java.util.Date getMtime() {
        return mtime;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCtime().hashCode();
        hashCode = 31 * hashCode + getMtime().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setCtime(final java.util.Date ctime) {
        this.ctime = ctime;
    }

    public void setMtime(final java.util.Date mtime) {
        this.mtime = mtime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ctime", getCtime()).add("mtime", getMtime()).toString();
    }

    private java.util.Date ctime;

    private java.util.Date mtime;
}
