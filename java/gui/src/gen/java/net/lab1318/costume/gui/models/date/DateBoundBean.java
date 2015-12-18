package net.lab1318.costume.gui.models.date;

/**
 * VRA Core 4.0 date earliestDate or latestDate subelement
 */
public class DateBoundBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        CIRCA("circa", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 2, "circa", org.thryft.protocol.Type.BOOL),
        PARSED_DATE_TIME("parsedDateTime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 3, "parsed_date_time", org.thryft.protocol.Type.I64);

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
            case "circa": return CIRCA;
            case "parsedDateTime": return PARSED_DATE_TIME;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "circa": return CIRCA;
            case "parsed_date_time": return PARSED_DATE_TIME;
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

    public DateBoundBean() {
        text = null;
        circa = null;
        parsedDateTime = null;
    }

    public DateBoundBean(final net.lab1318.costume.api.models.date.DateBound other) {
        this.text = other.getText();
        this.circa = other.getCirca().isPresent() ? other.getCirca().get() : null;
        this.parsedDateTime = other.getParsedDateTime().isPresent() ? other.getParsedDateTime().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof DateBoundBean)) {
            return false;
        }

        final DateBoundBean other = (DateBoundBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getCirca().equals(other.getCirca()) &&
            getParsedDateTime().equals(other.getParsedDateTime());
    }

    public Boolean getCirca() {
        return circa;
    }

    public java.util.Date getParsedDateTime() {
        return parsedDateTime;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        if (getCirca() != null) {
            hashCode = 31 * hashCode + (getCirca() ? 1 : 0);
        }
        if (getParsedDateTime() != null) {
            hashCode = 31 * hashCode + getParsedDateTime().hashCode();
        }
        return hashCode;
    }

    public void setCirca(final Boolean circa) {
        this.circa = circa;
    }

    public void setParsedDateTime(final java.util.Date parsedDateTime) {
        this.parsedDateTime = parsedDateTime;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("circa", getCirca()).add("parsed_date_time", getParsedDateTime()).toString();
    }

    private String text;

    private Boolean circa;

    private java.util.Date parsedDateTime;
}
