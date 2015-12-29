package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agent.dates element
 */
public class AgentDatesBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.agent.AgentDatesType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        EARLIEST_DATE("earliestDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 2, "earliest_date", org.thryft.protocol.Type.I64),
        LATEST_DATE("latestDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 3, "latest_date", org.thryft.protocol.Type.I64);

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
            case "earliestDate": return EARLIEST_DATE;
            case "latestDate": return LATEST_DATE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "earliest_date": return EARLIEST_DATE;
            case "latest_date": return LATEST_DATE;
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

    public AgentDatesBean() {
        type = null;
        earliestDate = null;
        latestDate = null;
    }

    public AgentDatesBean(final net.lab1318.costume.api.models.agent.AgentDates other) {
        this.type = other.getType();
        this.earliestDate = other.getEarliestDate().isPresent() ? other.getEarliestDate().get() : null;
        this.latestDate = other.getLatestDate().isPresent() ? other.getLatestDate().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentDatesBean)) {
            return false;
        }

        final AgentDatesBean other = (AgentDatesBean)otherObject;
        return
            getType().equals(other.getType()) &&
            (getEarliestDate() != null ? getEarliestDate().equals(other.getEarliestDate()) : other.getEarliestDate() == null) &&
            (getLatestDate() != null ? getLatestDate().equals(other.getLatestDate()) : other.getLatestDate() == null);
    }

    public java.util.Date getEarliestDate() {
        return earliestDate;
    }

    public java.util.Date getLatestDate() {
        return latestDate;
    }

    public net.lab1318.costume.api.models.agent.AgentDatesType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getEarliestDate() != null) {
            hashCode = 31 * hashCode + getEarliestDate().hashCode();
        }
        if (getLatestDate() != null) {
            hashCode = 31 * hashCode + getLatestDate().hashCode();
        }
        return hashCode;
    }

    public void setEarliestDate(final java.util.Date earliestDate) {
        this.earliestDate = earliestDate;
    }

    public void setLatestDate(final java.util.Date latestDate) {
        this.latestDate = latestDate;
    }

    public void setType(final net.lab1318.costume.api.models.agent.AgentDatesType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("earliest_date", getEarliestDate()).add("latest_date", getLatestDate()).toString();
    }

    private net.lab1318.costume.api.models.agent.AgentDatesType type;

    private java.util.Date earliestDate;

    private java.util.Date latestDate;
}
