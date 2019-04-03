package org.dressdiscover.api.vocabularies.vra_core.date;

/**
 * VRA Core 4.0 date earliestDate or latestDate subelement
 */
public final class DateBound implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, DateBound> {
        public Builder() {
            text = null;
            circa = com.google.common.base.Optional.<Boolean> absent();
            parsedDateTime = com.google.common.base.Optional.<java.util.Date> absent();
            parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> absent();
        }

        public Builder(final DateBound other) {
            this.text = other.getText();
            this.circa = other.getCirca();
            this.parsedDateTime = other.getParsedDateTime();
            this.parsedDateTimeGranularity = other.getParsedDateTimeGranularity();
        }

        protected DateBound _build(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
            return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity);
        }

        public DateBound build() {
            Validator.validate(text, circa, parsedDateTime, parsedDateTimeGranularity);

            return _build(text, circa, parsedDateTime, parsedDateTimeGranularity);
        }

        public final com.google.common.base.Optional<Boolean> getCirca() {
            return circa;
        }

        public final com.google.common.base.Optional<java.util.Date> getParsedDateTime() {
            return parsedDateTime;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> getParsedDateTimeGranularity() {
            return parsedDateTimeGranularity;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setText(iprot.readString());
                if (__list.getSize() > 1) {
                    this.setCirca(org.thryft.Optionals.of(iprot.readBool()));
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setParsedDateTime(com.google.common.base.Optional.of(iprot.readDateTime()));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 3) {
                    this.setParsedDateTimeGranularity(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity.Factory.getInstance())));
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
                    case "text": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setText(iprot.readString());
                        }
                        break;
                    }
                    case "circa": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setCirca(org.thryft.Optionals.of(iprot.readBool()));
                        }
                        break;
                    }
                    case "parsed_date_time": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setParsedDateTime(com.google.common.base.Optional.of(iprot.readDateTime()));
                                } catch (final IllegalArgumentException e) {
                                }
                        }
                        break;
                    }
                    case "parsed_date_time_granularity": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                this.setParsedDateTimeGranularity(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity.Factory.getInstance())));
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
            case TEXT: setText((String)value); return this;
            case CIRCA: setCirca((Boolean)value); return this;
            case PARSED_DATE_TIME: setParsedDateTime((java.util.Date)value); return this;
            case PARSED_DATE_TIME_GRANULARITY: setParsedDateTimeGranularity((org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCirca(final com.google.common.base.Optional<Boolean> circa) {
            Validator.validateCirca(circa);
            this.circa = circa;
            return this;
        }

        public Builder setCirca(final @javax.annotation.Nullable Boolean circa) {
            return setCirca(org.thryft.Optionals.fromNullable(circa));
        }

        public Builder setCirca(final boolean circa) {
            return setCirca(org.thryft.Optionals.of(circa));
        }

        public Builder setIfPresent(final DateBound other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            if (other.getCirca().isPresent()) {
                setCirca(other.getCirca());
            }
            if (other.getParsedDateTime().isPresent()) {
                setParsedDateTime(other.getParsedDateTime());
            }
            if (other.getParsedDateTimeGranularity().isPresent()) {
                setParsedDateTimeGranularity(other.getParsedDateTimeGranularity());
            }

            return this;
        }

        public Builder setParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
            Validator.validateParsedDateTime(parsedDateTime);
            this.parsedDateTime = parsedDateTime;
            return this;
        }

        public Builder setParsedDateTime(final @javax.annotation.Nullable java.util.Date parsedDateTime) {
            return setParsedDateTime(com.google.common.base.Optional.fromNullable(parsedDateTime));
        }

        public Builder setParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
            Validator.validateParsedDateTimeGranularity(parsedDateTimeGranularity);
            this.parsedDateTimeGranularity = parsedDateTimeGranularity;
            return this;
        }

        public Builder setParsedDateTimeGranularity(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity parsedDateTimeGranularity) {
            return setParsedDateTimeGranularity(com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
        }

        public Builder setText(final String text) {
            Validator.validateText(text);
            this.text = text;
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
            case TEXT: return unsetText();
            case CIRCA: return unsetCirca();
            case PARSED_DATE_TIME: return unsetParsedDateTime();
            case PARSED_DATE_TIME_GRANULARITY: return unsetParsedDateTimeGranularity();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCirca() {
            this.circa = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetParsedDateTime() {
            this.parsedDateTime = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        public Builder unsetParsedDateTimeGranularity() {
            this.parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private @javax.annotation.Nullable String text;
        private com.google.common.base.Optional<Boolean> circa;
        private com.google.common.base.Optional<java.util.Date> parsedDateTime;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<DateBound> {
        @Override
        public DateBound readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsList(iprot);
        }

        @Override
        public DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsStruct(iprot);
        }

        @Override
        public DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", "1:text", org.thryft.protocol.Type.STRING),
        CIRCA("circa", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)2, "circa", "2:circa", org.thryft.protocol.Type.BOOL),
        PARSED_DATE_TIME("parsedDateTime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)3, "parsed_date_time", "3:parsed_date_time", org.thryft.protocol.Type.I64),
        PARSED_DATE_TIME_GRANULARITY("parsedDateTimeGranularity", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity>() {}, false, (short)4, "parsed_date_time_granularity", "4:parsed_date_time_granularity", org.thryft.protocol.Type.STRING);

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
            case "text": return TEXT;
            case "circa": return CIRCA;
            case "parsedDateTime": return PARSED_DATE_TIME;
            case "parsedDateTimeGranularity": return PARSED_DATE_TIME_GRANULARITY;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "circa": return CIRCA;
            case "parsed_date_time": return PARSED_DATE_TIME;
            case "parsed_date_time_granularity": return PARSED_DATE_TIME_GRANULARITY;
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
        public static void validate(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
            validateText(text);
            validateCirca(circa);
            validateParsedDateTime(parsedDateTime);
            validateParsedDateTimeGranularity(parsedDateTimeGranularity);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.date.DateBound: text is missing");
            }
            if (text.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.date.DateBound: text: less than min length 1");
            }
        }

        public static void validateCirca(final com.google.common.base.Optional<Boolean> circa) {
            if (circa == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.date.DateBound: circa is missing");
            }
        }

        public static void validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
            if (parsedDateTime == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.date.DateBound: parsedDateTime is missing");
            }
        }

        public static void validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
            if (parsedDateTimeGranularity == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.date.DateBound: parsedDateTimeGranularity is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public DateBound(final DateBound other) {
        this(other.getText(), other.getCirca(), other.getParsedDateTime(), other.getParsedDateTimeGranularity());
    }

    /**
     * Required constructor
     */
    public DateBound(final String text) {
        this(text, com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> absent());
    }

    /**
     * Total constructor
     */
    public DateBound(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
        Validator.validate(text, circa, parsedDateTime, parsedDateTimeGranularity);
        this.text = text;
        this.circa = circa;
        this.parsedDateTime = parsedDateTime;
        this.parsedDateTimeGranularity = parsedDateTimeGranularity;
    }

    /**
     * Total Nullable constructor
     */
    public DateBound(final String text, @javax.annotation.Nullable final Boolean circa, @javax.annotation.Nullable final java.util.Date parsedDateTime, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity parsedDateTimeGranularity) {
        this(text, org.thryft.Optionals.fromNullable(circa), com.google.common.base.Optional.fromNullable(parsedDateTime), com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final DateBound other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<DateBound> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof DateBound)) {
            return false;
        }

        final DateBound other = (DateBound)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(((getCirca().isPresent() && other.getCirca().isPresent()) ? (getCirca().get().booleanValue() == other.getCirca().get().booleanValue()) : (!getCirca().isPresent() && !other.getCirca().isPresent())))) {
            return false;
        }

        if (!(((getParsedDateTime().isPresent() && other.getParsedDateTime().isPresent()) ? (getParsedDateTime().get().equals(other.getParsedDateTime().get())) : (!getParsedDateTime().isPresent() && !other.getParsedDateTime().isPresent())))) {
            return false;
        }

        if (!(((getParsedDateTimeGranularity().isPresent() && other.getParsedDateTimeGranularity().isPresent()) ? (getParsedDateTimeGranularity().get().equals(other.getParsedDateTimeGranularity().get())) : (!getParsedDateTimeGranularity().isPresent() && !other.getParsedDateTimeGranularity().isPresent())))) {
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
        case TEXT: return getText();
        case CIRCA: return getCirca();
        case PARSED_DATE_TIME: return getParsedDateTime();
        case PARSED_DATE_TIME_GRANULARITY: return getParsedDateTimeGranularity();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<Boolean> getCirca() {
        return circa;
    }

    public final com.google.common.base.Optional<java.util.Date> getParsedDateTime() {
        return parsedDateTime;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> getParsedDateTimeGranularity() {
        return parsedDateTimeGranularity;
    }

    public final String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        if (getCirca().isPresent()) {
            hashCode = 31 * hashCode + (getCirca().get() ? 1 : 0);
        }
        if (getParsedDateTime().isPresent()) {
            hashCode = 31 * hashCode + getParsedDateTime().get().hashCode();
        }
        if (getParsedDateTimeGranularity().isPresent()) {
            hashCode = 31 * hashCode + getParsedDateTimeGranularity().get().ordinal();
        }
        return hashCode;
    }

    public static DateBound readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public DateBound replaceCirca(final com.google.common.base.Optional<Boolean> circa) {
        Validator.validateCirca(circa);
        return new DateBound(this.text, circa, this.parsedDateTime, this.parsedDateTimeGranularity);
    }

    public DateBound replaceCirca(@javax.annotation.Nullable final Boolean circa) {
        return replaceCirca(org.thryft.Optionals.fromNullable(circa));
    }

    public DateBound replaceCirca(final boolean circa) {
        return replaceCirca(org.thryft.Optionals.of(circa));
    }

    public DateBound replaceParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
        Validator.validateParsedDateTime(parsedDateTime);
        return new DateBound(this.text, this.circa, parsedDateTime, this.parsedDateTimeGranularity);
    }

    public DateBound replaceParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity) {
        Validator.validateParsedDateTimeGranularity(parsedDateTimeGranularity);
        return new DateBound(this.text, this.circa, this.parsedDateTime, parsedDateTimeGranularity);
    }

    public DateBound replaceParsedDateTimeGranularity(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity parsedDateTimeGranularity) {
        return replaceParsedDateTimeGranularity(com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
    }

    public DateBound replaceParsedDateTime(@javax.annotation.Nullable final java.util.Date parsedDateTime) {
        return replaceParsedDateTime(com.google.common.base.Optional.fromNullable(parsedDateTime));
    }

    public DateBound replaceText(final String text) {
        Validator.validateText(text);
        return new DateBound(text, this.circa, this.parsedDateTime, this.parsedDateTimeGranularity);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("circa", getCirca().orNull()).add("parsed_date_time", getParsedDateTime().orNull()).add("parsed_date_time_granularity", getParsedDateTimeGranularity().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.date.DateBound");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCircaField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCirca().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CIRCA);
            oprot.writeBool(getCirca().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getText());
        if (getCirca().isPresent()) {
            oprot.writeBool(getCirca().get());
        } else {
            oprot.writeNull();
        }
        if (getParsedDateTime().isPresent()) {
            oprot.writeDateTime(getParsedDateTime().get());
        } else {
            oprot.writeNull();
        }
        if (getParsedDateTimeGranularity().isPresent()) {
            oprot.writeEnum(getParsedDateTimeGranularity().get());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeCircaField(oprot);

        writeParsedDateTimeField(oprot);

        writeParsedDateTimeGranularityField(oprot);

        oprot.writeFieldStop();
    }

    public void writeParsedDateTimeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getParsedDateTime().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PARSED_DATE_TIME);
            oprot.writeDateTime(getParsedDateTime().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeParsedDateTimeGranularityField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getParsedDateTimeGranularity().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PARSED_DATE_TIME_GRANULARITY);
            oprot.writeEnum(getParsedDateTimeGranularity().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    private final String text;

    private final com.google.common.base.Optional<Boolean> circa;

    private final com.google.common.base.Optional<java.util.Date> parsedDateTime;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.date.DateTimeGranularity> parsedDateTimeGranularity;
}
