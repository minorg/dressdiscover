package org.dressdiscover.api.models.agent;

/**
 * VRA Core 4.0 agent.dates element
 */
public class AgentDates implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            type = null;
            earliestDate = com.google.common.base.Optional.<java.util.Date> absent();
            latestDate = com.google.common.base.Optional.<java.util.Date> absent();
        }

        public Builder(final AgentDates other) {
            this.type = other.getType();
            this.earliestDate = other.getEarliestDate();
            this.latestDate = other.getLatestDate();
        }

        protected AgentDates _build(final org.dressdiscover.api.models.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
            return new AgentDates(type, earliestDate, latestDate);
        }

        public AgentDates build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.agent.AgentDates: missing type"), com.google.common.base.Preconditions.checkNotNull(earliestDate, "org.dressdiscover.api.models.agent.AgentDates: missing earliestDate"), com.google.common.base.Preconditions.checkNotNull(latestDate, "org.dressdiscover.api.models.agent.AgentDates: missing latestDate"));
        }

        public final com.google.common.base.Optional<java.util.Date> getEarliestDate() {
            return earliestDate;
        }

        public final com.google.common.base.Optional<java.util.Date> getLatestDate() {
            return latestDate;
        }

        public final org.dressdiscover.api.models.agent.AgentDatesType getType() {
            return type;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot, unknownFieldCallback);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readEnum(org.dressdiscover.api.models.agent.AgentDatesType.class);
            if (__list.getSize() > 1) {
                try {
                    earliestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 2) {
                try {
                    latestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(org.dressdiscover.api.models.agent.AgentDatesType.class);
                    }
                    break;
                }
                case "earliest_date": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            earliestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "latest_date": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            latestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
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
            case TYPE: setType((org.dressdiscover.api.models.agent.AgentDatesType)value); return this;
            case EARLIEST_DATE: setEarliestDate((java.util.Date)value); return this;
            case LATEST_DATE: setLatestDate((java.util.Date)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setEarliestDate(final com.google.common.base.Optional<java.util.Date> earliestDate) {
            this.earliestDate = com.google.common.base.Preconditions.checkNotNull(earliestDate);
            return this;
        }

        public Builder setEarliestDate(@javax.annotation.Nullable final java.util.Date earliestDate) {
            this.earliestDate = com.google.common.base.Optional.fromNullable(earliestDate);
            return this;
        }

        public Builder setIfPresent(final AgentDates other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getEarliestDate().isPresent()) {
                setEarliestDate(other.getEarliestDate());
            }
            if (other.getLatestDate().isPresent()) {
                setLatestDate(other.getLatestDate());
            }

            return this;
        }

        public Builder setLatestDate(final com.google.common.base.Optional<java.util.Date> latestDate) {
            this.latestDate = com.google.common.base.Preconditions.checkNotNull(latestDate);
            return this;
        }

        public Builder setLatestDate(@javax.annotation.Nullable final java.util.Date latestDate) {
            this.latestDate = com.google.common.base.Optional.fromNullable(latestDate);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.models.agent.AgentDatesType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
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
            case TYPE: return unsetType();
            case EARLIEST_DATE: return unsetEarliestDate();
            case LATEST_DATE: return unsetLatestDate();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetEarliestDate() {
            this.earliestDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        public Builder unsetLatestDate() {
            this.latestDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private org.dressdiscover.api.models.agent.AgentDatesType type;
        private com.google.common.base.Optional<java.util.Date> earliestDate;
        private com.google.common.base.Optional<java.util.Date> latestDate;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<AgentDates> {
        @Override
        public AgentDates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAs(iprot, type);
        }

        @Override
        public AgentDates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public AgentDates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsList(iprot);
        }

        @Override
        public AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsStruct(iprot);
        }

        @Override
        public AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.agent.AgentDatesType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
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

    /**
     * Copy constructor
     */
    public AgentDates(final AgentDates other) {
        this(other.getType(), other.getEarliestDate(), other.getLatestDate());
    }

    protected AgentDates(final org.dressdiscover.api.models.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
        this.type = type;
        this.earliestDate = earliestDate;
        this.latestDate = latestDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final AgentDates other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<AgentDates> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static AgentDates create(final org.dressdiscover.api.models.agent.AgentDatesType type) {
        return new AgentDates(com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.agent.AgentDates: missing type"), com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<java.util.Date> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static AgentDates create(final org.dressdiscover.api.models.agent.AgentDatesType type, final @javax.annotation.Nullable java.util.Date earliestDate, final @javax.annotation.Nullable java.util.Date latestDate) {
        return new AgentDates(com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.agent.AgentDates: missing type"), com.google.common.base.Optional.fromNullable(earliestDate), com.google.common.base.Optional.fromNullable(latestDate));
    }

    /**
     * Optional factory method
     */
    public static AgentDates create(final org.dressdiscover.api.models.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
        return new AgentDates(com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.agent.AgentDates: missing type"), com.google.common.base.Preconditions.checkNotNull(earliestDate, "org.dressdiscover.api.models.agent.AgentDates: missing earliestDate"), com.google.common.base.Preconditions.checkNotNull(latestDate, "org.dressdiscover.api.models.agent.AgentDates: missing latestDate"));
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentDates)) {
            return false;
        }

        final AgentDates other = (AgentDates)otherObject;
        return
            getType().equals(other.getType()) &&
            ((getEarliestDate().isPresent() && other.getEarliestDate().isPresent()) ? (getEarliestDate().get().equals(other.getEarliestDate().get())) : (!getEarliestDate().isPresent() && !other.getEarliestDate().isPresent())) &&
            ((getLatestDate().isPresent() && other.getLatestDate().isPresent()) ? (getLatestDate().get().equals(other.getLatestDate().get())) : (!getLatestDate().isPresent() && !other.getLatestDate().isPresent()));
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
        case TYPE: return getType();
        case EARLIEST_DATE: return getEarliestDate();
        case LATEST_DATE: return getLatestDate();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<java.util.Date> getEarliestDate() {
        return earliestDate;
    }

    public final com.google.common.base.Optional<java.util.Date> getLatestDate() {
        return latestDate;
    }

    public final org.dressdiscover.api.models.agent.AgentDatesType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getEarliestDate().isPresent()) {
            hashCode = 31 * hashCode + getEarliestDate().get().hashCode();
        }
        if (getLatestDate().isPresent()) {
            hashCode = 31 * hashCode + getLatestDate().get().hashCode();
        }
        return hashCode;
    }

    public static AgentDates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static AgentDates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static AgentDates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.agent.AgentDatesType type = null;
        com.google.common.base.Optional<java.util.Date> earliestDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> latestDate = com.google.common.base.Optional.<java.util.Date> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(org.dressdiscover.api.models.agent.AgentDatesType.class);
        if (__list.getSize() > 1) {
            try {
                earliestDate = com.google.common.base.Optional.of(iprot.readDateTime());
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 2) {
            try {
                latestDate = com.google.common.base.Optional.of(iprot.readDateTime());
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new AgentDates(type, earliestDate, latestDate);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.agent.AgentDatesType type = null;
        com.google.common.base.Optional<java.util.Date> earliestDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> latestDate = com.google.common.base.Optional.<java.util.Date> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(org.dressdiscover.api.models.agent.AgentDatesType.class);
                }
                break;
            }
            case "earliest_date": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        earliestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "latest_date": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        latestDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            default:
                if (unknownFieldCallback.isPresent()) {
                    unknownFieldCallback.get().apply(ifield);
                }
                break;
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new AgentDates(type, earliestDate, latestDate);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public AgentDates replaceEarliestDate(final com.google.common.base.Optional<java.util.Date> earliestDate) {
        return new AgentDates(this.type, earliestDate, this.latestDate);
    }

    public AgentDates replaceEarliestDate(final java.util.Date earliestDate) {
        return replaceEarliestDate(com.google.common.base.Optional.fromNullable(earliestDate));
    }

    public AgentDates replaceLatestDate(final com.google.common.base.Optional<java.util.Date> latestDate) {
        return new AgentDates(this.type, this.earliestDate, latestDate);
    }

    public AgentDates replaceLatestDate(final java.util.Date latestDate) {
        return replaceLatestDate(com.google.common.base.Optional.fromNullable(latestDate));
    }

    public AgentDates replaceType(final org.dressdiscover.api.models.agent.AgentDatesType type) {
        return new AgentDates(type, this.earliestDate, this.latestDate);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("earliest_date", getEarliestDate().orNull()).add("latest_date", getLatestDate().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeEnum(getType());

        if (getEarliestDate().isPresent()) {
            oprot.writeDateTime(getEarliestDate().get());
        } else {
            oprot.writeNull();
        }

        if (getLatestDate().isPresent()) {
            oprot.writeDateTime(getLatestDate().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.agent.AgentDates");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getEarliestDate().isPresent()) {
            oprot.writeFieldBegin("earliest_date", org.thryft.protocol.Type.I64, (short)2);
            oprot.writeDateTime(getEarliestDate().get());
            oprot.writeFieldEnd();
        }

        if (getLatestDate().isPresent()) {
            oprot.writeFieldBegin("latest_date", org.thryft.protocol.Type.I64, (short)3);
            oprot.writeDateTime(getLatestDate().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.agent.AgentDatesType type;

    private final com.google.common.base.Optional<java.util.Date> earliestDate;

    private final com.google.common.base.Optional<java.util.Date> latestDate;
}
