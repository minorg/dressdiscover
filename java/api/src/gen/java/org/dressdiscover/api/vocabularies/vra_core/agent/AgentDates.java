package org.dressdiscover.api.vocabularies.vra_core.agent;

/**
 * VRA Core 4.0 agent.dates element
 */
public final class AgentDates implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, AgentDates> {
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

        protected AgentDates _build(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
            return new AgentDates(type, earliestDate, latestDate);
        }

        public AgentDates build() {
            Validator.validate(type, earliestDate, latestDate);

            return _build(type, earliestDate, latestDate);
        }

        public final com.google.common.base.Optional<java.util.Date> getEarliestDate() {
            return earliestDate;
        }

        public final com.google.common.base.Optional<java.util.Date> getLatestDate() {
            return latestDate;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType.Factory.getInstance()));
                if (__list.getSize() > 1) {
                    try {
                        this.setEarliestDate(com.google.common.base.Optional.of(iprot.readDateTime()));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setLatestDate(com.google.common.base.Optional.of(iprot.readDateTime()));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType.Factory.getInstance()));
                        }
                        break;
                    }
                    case "earliest_date": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setEarliestDate(com.google.common.base.Optional.of(iprot.readDateTime()));
                                } catch (final IllegalArgumentException e) {
                                }
                        }
                        break;
                    }
                    case "latest_date": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setLatestDate(com.google.common.base.Optional.of(iprot.readDateTime()));
                                } catch (final IllegalArgumentException e) {
                                }
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType)value); return this;
            case EARLIEST_DATE: setEarliestDate((java.util.Date)value); return this;
            case LATEST_DATE: setLatestDate((java.util.Date)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setEarliestDate(final com.google.common.base.Optional<java.util.Date> earliestDate) {
            Validator.validateEarliestDate(earliestDate);
            this.earliestDate = earliestDate;
            return this;
        }

        public Builder setEarliestDate(final @javax.annotation.Nullable java.util.Date earliestDate) {
            return setEarliestDate(com.google.common.base.Optional.fromNullable(earliestDate));
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
            Validator.validateLatestDate(latestDate);
            this.latestDate = latestDate;
            return this;
        }

        public Builder setLatestDate(final @javax.annotation.Nullable java.util.Date latestDate) {
            return setLatestDate(com.google.common.base.Optional.fromNullable(latestDate));
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type) {
            Validator.validateType(type);
            this.type = type;
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

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type;
        private com.google.common.base.Optional<java.util.Date> earliestDate;
        private com.google.common.base.Optional<java.util.Date> latestDate;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<AgentDates> {
        @Override
        public AgentDates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsList(iprot);
        }

        @Override
        public AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsStruct(iprot);
        }

        @Override
        public AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AgentDates.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType>() {}, true, (short)1, "type", "1:type", org.thryft.protocol.Type.STRING),
        EARLIEST_DATE("earliestDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)2, "earliest_date", "2:earliest_date", org.thryft.protocol.Type.I64),
        LATEST_DATE("latestDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)3, "latest_date", "3:latest_date", org.thryft.protocol.Type.I64);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class Validator {
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
            validateType(type);
            validateEarliestDate(earliestDate);
            validateLatestDate(latestDate);
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates: type is missing");
            }
        }

        public static void validateEarliestDate(final com.google.common.base.Optional<java.util.Date> earliestDate) {
            if (earliestDate == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates: earliestDate is missing");
            }
        }

        public static void validateLatestDate(final com.google.common.base.Optional<java.util.Date> latestDate) {
            if (latestDate == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates: latestDate is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public AgentDates(final AgentDates other) {
        this(other.getType(), other.getEarliestDate(), other.getLatestDate());
    }

    /**
     * Required constructor
     */
    public AgentDates(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type) {
        this(type, com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<java.util.Date> absent());
    }

    /**
     * Total constructor
     */
    public AgentDates(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type, final com.google.common.base.Optional<java.util.Date> earliestDate, final com.google.common.base.Optional<java.util.Date> latestDate) {
        Validator.validate(type, earliestDate, latestDate);
        this.type = type;
        this.earliestDate = earliestDate;
        this.latestDate = latestDate;
    }

    /**
     * Total Nullable constructor
     */
    public AgentDates(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type, @javax.annotation.Nullable final java.util.Date earliestDate, @javax.annotation.Nullable final java.util.Date latestDate) {
        this(type, com.google.common.base.Optional.fromNullable(earliestDate), com.google.common.base.Optional.fromNullable(latestDate));
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof AgentDates)) {
            return false;
        }

        final AgentDates other = (AgentDates)otherObject;

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getEarliestDate().isPresent() && other.getEarliestDate().isPresent()) ? (getEarliestDate().get().equals(other.getEarliestDate().get())) : (!getEarliestDate().isPresent() && !other.getEarliestDate().isPresent())))) {
            return false;
        }

        if (!(((getLatestDate().isPresent() && other.getLatestDate().isPresent()) ? (getLatestDate().get().equals(other.getLatestDate().get())) : (!getLatestDate().isPresent() && !other.getLatestDate().isPresent())))) {
            return false;
        }

        return true;
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

    public final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType getType() {
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

    public static AgentDates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static AgentDates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public AgentDates replaceEarliestDate(final com.google.common.base.Optional<java.util.Date> earliestDate) {
        Validator.validateEarliestDate(earliestDate);
        return new AgentDates(this.type, earliestDate, this.latestDate);
    }

    public AgentDates replaceEarliestDate(@javax.annotation.Nullable final java.util.Date earliestDate) {
        return replaceEarliestDate(com.google.common.base.Optional.fromNullable(earliestDate));
    }

    public AgentDates replaceLatestDate(final com.google.common.base.Optional<java.util.Date> latestDate) {
        Validator.validateLatestDate(latestDate);
        return new AgentDates(this.type, this.earliestDate, latestDate);
    }

    public AgentDates replaceLatestDate(@javax.annotation.Nullable final java.util.Date latestDate) {
        return replaceLatestDate(com.google.common.base.Optional.fromNullable(latestDate));
    }

    public AgentDates replaceType(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type) {
        Validator.validateType(type);
        return new AgentDates(type, this.earliestDate, this.latestDate);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("earliest_date", getEarliestDate().orNull()).add("latest_date", getLatestDate().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeEarliestDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getEarliestDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EARLIEST_DATE);
            oprot.writeDateTime(getEarliestDate().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTypeField(oprot);

        writeEarliestDateField(oprot);

        writeLatestDateField(oprot);

        oprot.writeFieldStop();
    }

    public void writeLatestDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLatestDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LATEST_DATE);
            oprot.writeDateTime(getLatestDate().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDatesType type;

    private final com.google.common.base.Optional<java.util.Date> earliestDate;

    private final com.google.common.base.Optional<java.util.Date> latestDate;
}
