package net.lab1318.costume.gui.models.date;

/**
 * VRA Core 4.0 date element
 */
public class DateBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EARLIEST_DATE("earliestDate", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.date.DateBoundBean>() {}, true, 1, "earliest_date", org.thryft.protocol.Type.STRUCT),
        LATEST_DATE("latestDate", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.date.DateBoundBean>() {}, true, 2, "latest_date", org.thryft.protocol.Type.STRUCT),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.date.DateType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 4, "href", org.thryft.protocol.Type.STRING),
        SOURCE("source", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "source", org.thryft.protocol.Type.STRING);

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
            case "earliestDate": return EARLIEST_DATE;
            case "latestDate": return LATEST_DATE;
            case "type": return TYPE;
            case "href": return HREF;
            case "source": return SOURCE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "earliest_date": return EARLIEST_DATE;
            case "latest_date": return LATEST_DATE;
            case "type": return TYPE;
            case "href": return HREF;
            case "source": return SOURCE;
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

    public DateBean() {
        earliestDate = null;
        latestDate = null;
        type = null;
        href = null;
        source = null;
    }

    public DateBean(final net.lab1318.costume.api.models.date.Date other) {
        this.earliestDate = new net.lab1318.costume.gui.models.date.DateBoundBean(other.getEarliestDate());
        this.latestDate = new net.lab1318.costume.gui.models.date.DateBoundBean(other.getLatestDate());
        this.type = other.getType();
        this.href = other.getHref().isPresent() ? other.getHref().get() : null;
        this.source = other.getSource().isPresent() ? other.getSource().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof DateBean)) {
            return false;
        }

        final DateBean other = (DateBean)otherObject;
        return
            getEarliestDate().equals(other.getEarliestDate()) &&
            getLatestDate().equals(other.getLatestDate()) &&
            getType().equals(other.getType()) &&
            (getHref() != null ? getHref().equals(other.getHref()) : other.getHref() == null) &&
            (getSource() != null ? getSource().equals(other.getSource()) : other.getSource() == null);
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
        case EARLIEST_DATE: return getEarliestDate();
        case LATEST_DATE: return getLatestDate();
        case TYPE: return getType();
        case HREF: return getHref();
        case SOURCE: return getSource();
        default:
            throw new IllegalStateException();
        }
    }

    public net.lab1318.costume.gui.models.date.DateBoundBean getEarliestDate() {
        return earliestDate;
    }

    public org.thryft.native_.Url getHref() {
        return href;
    }

    public net.lab1318.costume.gui.models.date.DateBoundBean getLatestDate() {
        return latestDate;
    }

    public String getSource() {
        return source;
    }

    public net.lab1318.costume.api.models.date.DateType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getEarliestDate().hashCode();
        hashCode = 31 * hashCode + getLatestDate().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getHref() != null) {
            hashCode = 31 * hashCode + getHref().hashCode();
        }
        if (getSource() != null) {
            hashCode = 31 * hashCode + getSource().hashCode();
        }
        return hashCode;
    }

    public void setEarliestDate(final net.lab1318.costume.gui.models.date.DateBoundBean earliestDate) {
        this.earliestDate = earliestDate;
    }

    public void setHref(final org.thryft.native_.Url href) {
        this.href = href;
    }

    public void setLatestDate(final net.lab1318.costume.gui.models.date.DateBoundBean latestDate) {
        this.latestDate = latestDate;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    public void setType(final net.lab1318.costume.api.models.date.DateType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("earliest_date", getEarliestDate()).add("latest_date", getLatestDate()).add("type", getType()).add("href", getHref()).add("source", getSource()).toString();
    }

    private net.lab1318.costume.gui.models.date.DateBoundBean earliestDate;

    private net.lab1318.costume.gui.models.date.DateBoundBean latestDate;

    private net.lab1318.costume.api.models.date.DateType type;

    private org.thryft.native_.Url href;

    private String source;
}
