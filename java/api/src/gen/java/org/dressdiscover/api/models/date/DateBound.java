package org.dressdiscover.api.models.date;

/**
 * VRA Core 4.0 date earliestDate or latestDate subelement
 */
public final class DateBound implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            text = null;
            circa = com.google.common.base.Optional.<Boolean> absent();
            parsedDateTime = com.google.common.base.Optional.<java.util.Date> absent();
            parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateTimeGranularity> absent();
        }

        public Builder(final DateBound other) {
            this.text = other.getText();
            this.circa = other.getCirca();
            this.parsedDateTime = other.getParsedDateTime();
            this.parsedDateTimeGranularity = other.getParsedDateTimeGranularity();
        }

        protected DateBound _build(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity, DefaultConstructionValidator.getInstance());
        }

        public DateBound build() {
            return _build(text, circa, parsedDateTime, parsedDateTimeGranularity);
        }

        public final com.google.common.base.Optional<Boolean> getCirca() {
            return circa;
        }

        public final com.google.common.base.Optional<java.util.Date> getParsedDateTime() {
            return parsedDateTime;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> getParsedDateTimeGranularity() {
            return parsedDateTimeGranularity;
        }

        public final String getText() {
            return text;
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
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                text = iprot.readString();
                if (__list.getSize() > 1) {
                    circa = com.google.common.base.Optional.of(iprot.readBool());
                }
                if (__list.getSize() > 2) {
                    try {
                        parsedDateTime = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 3) {
                    parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
                }
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                            text = iprot.readString();
                        }
                        break;
                    }
                    case "circa": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            circa = com.google.common.base.Optional.of(iprot.readBool());
                        }
                        break;
                    }
                    case "parsed_date_time": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                parsedDateTime = com.google.common.base.Optional.of(iprot.readDateTime());
                            } catch (final IllegalArgumentException e) {
                            }
                        }
                        break;
                    }
                    case "parsed_date_time_granularity": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case TEXT: setText((String)value); return this;
            case CIRCA: setCirca((Boolean)value); return this;
            case PARSED_DATE_TIME: setParsedDateTime((java.util.Date)value); return this;
            case PARSED_DATE_TIME_GRANULARITY: setParsedDateTimeGranularity((org.dressdiscover.api.models.date.DateTimeGranularity)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCirca(final com.google.common.base.Optional<Boolean> circa) {
            this.circa = DefaultConstructionValidator.getInstance().validateCirca(circa);
            return this;
        }

        public Builder setCirca(@javax.annotation.Nullable final Boolean circa) {
            return setCirca(com.google.common.base.Optional.fromNullable(circa));
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
            this.parsedDateTime = DefaultConstructionValidator.getInstance().validateParsedDateTime(parsedDateTime);
            return this;
        }

        public Builder setParsedDateTime(@javax.annotation.Nullable final java.util.Date parsedDateTime) {
            return setParsedDateTime(com.google.common.base.Optional.fromNullable(parsedDateTime));
        }

        public Builder setParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            this.parsedDateTimeGranularity = DefaultConstructionValidator.getInstance().validateParsedDateTimeGranularity(parsedDateTimeGranularity);
            return this;
        }

        public Builder setParsedDateTimeGranularity(@javax.annotation.Nullable final org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
            return setParsedDateTimeGranularity(com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
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
            this.parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateTimeGranularity> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private String text;
        private com.google.common.base.Optional<Boolean> circa;
        private com.google.common.base.Optional<java.util.Date> parsedDateTime;
        private com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<DateBound> {
        @Override
        public DateBound readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAs(iprot, type);
        }

        @Override
        public DateBound readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public DateBound readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsList(iprot);
        }

        @Override
        public DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsStruct(iprot);
        }

        @Override
        public DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DateBound.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        CIRCA("circa", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 2, "circa", org.thryft.protocol.Type.BOOL),
        PARSED_DATE_TIME("parsedDateTime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 3, "parsed_date_time", org.thryft.protocol.Type.I64),
        PARSED_DATE_TIME_GRANULARITY("parsedDateTimeGranularity", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.date.DateTimeGranularity>() {}, false, 4, "parsed_date_time_granularity", org.thryft.protocol.Type.STRING);

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

    public interface Validator<ExceptionT extends Exception> {
        public String validateText(final String text) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateCirca(final com.google.common.base.Optional<Boolean> circa) throws ExceptionT;

        public com.google.common.base.Optional<java.util.Date> validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.date.DateBound: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.date.DateBound: text is less than min length 1");
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateCirca(final com.google.common.base.Optional<Boolean> circa) throws RuntimeException {
            if (!circa.isPresent()) {
                return circa;
            }
            return circa;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) throws RuntimeException {
            if (parsedDateTime == null) {
                throw new NullPointerException("org.dressdiscover.api.models.date.DateBound: parsedDateTime is null");
            }
            if (!parsedDateTime.isPresent()) {
                return parsedDateTime;
            }
            return parsedDateTime;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) throws RuntimeException {
            if (parsedDateTimeGranularity == null) {
                throw new NullPointerException("org.dressdiscover.api.models.date.DateBound: parsedDateTimeGranularity is null");
            }
            if (!parsedDateTimeGranularity.isPresent()) {
                return parsedDateTimeGranularity;
            }
            return parsedDateTimeGranularity;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateCirca(final com.google.common.base.Optional<Boolean> circa) {
            return circa;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
            return parsedDateTime;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            return parsedDateTimeGranularity;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.date.DateBound: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.date.DateBound: text is less than min length 1");
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateCirca(final com.google.common.base.Optional<Boolean> circa) throws org.thryft.protocol.InputProtocolException {
            if (!circa.isPresent()) {
                return circa;
            }
            return circa;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) throws org.thryft.protocol.InputProtocolException {
            if (parsedDateTime == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PARSED_DATE_TIME, "org.dressdiscover.api.models.date.DateBound: parsedDateTime is null");
            }
            if (!parsedDateTime.isPresent()) {
                return parsedDateTime;
            }
            return parsedDateTime;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) throws org.thryft.protocol.InputProtocolException {
            if (parsedDateTimeGranularity == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PARSED_DATE_TIME_GRANULARITY, "org.dressdiscover.api.models.date.DateBound: parsedDateTimeGranularity is null");
            }
            if (!parsedDateTimeGranularity.isPresent()) {
                return parsedDateTimeGranularity;
            }
            return parsedDateTimeGranularity;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateCirca(final com.google.common.base.Optional<Boolean> circa) {
            return circa;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
            return parsedDateTime;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> validateParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            return parsedDateTimeGranularity;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public DateBound(final DateBound other) {
        this(other.getText(), other.getCirca(), other.getParsedDateTime(), other.getParsedDateTimeGranularity(), NopConstructionValidator.getInstance());
    }

    protected DateBound(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity, ConstructionValidator validator) {
        this.text = validator.validateText(text);
        this.circa = validator.validateCirca(circa);
        this.parsedDateTime = validator.validateParsedDateTime(parsedDateTime);
        this.parsedDateTimeGranularity = validator.validateParsedDateTimeGranularity(parsedDateTimeGranularity);
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

    /**
     * Required factory method
     */
    public static DateBound create(final String text) {
        return new DateBound(text, com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateTimeGranularity> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static DateBound create(final String text, final @javax.annotation.Nullable Boolean circa, final @javax.annotation.Nullable java.util.Date parsedDateTime, final @javax.annotation.Nullable org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
        return new DateBound(text, com.google.common.base.Optional.fromNullable(circa), com.google.common.base.Optional.fromNullable(parsedDateTime), com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static DateBound create(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
        return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof DateBound)) {
            return false;
        }

        final DateBound other = (DateBound)otherObject;
        return
            getText().equals(other.getText()) &&
            ((getCirca().isPresent() && other.getCirca().isPresent()) ? (getCirca().get() == other.getCirca().get()) : (!getCirca().isPresent() && !other.getCirca().isPresent())) &&
            ((getParsedDateTime().isPresent() && other.getParsedDateTime().isPresent()) ? (getParsedDateTime().get().equals(other.getParsedDateTime().get())) : (!getParsedDateTime().isPresent() && !other.getParsedDateTime().isPresent())) &&
            ((getParsedDateTimeGranularity().isPresent() && other.getParsedDateTimeGranularity().isPresent()) ? (getParsedDateTimeGranularity().get().equals(other.getParsedDateTimeGranularity().get())) : (!getParsedDateTimeGranularity().isPresent() && !other.getParsedDateTimeGranularity().isPresent()));
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> getParsedDateTimeGranularity() {
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

    public static DateBound readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DateBound readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static DateBound readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<Boolean> circa = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<java.util.Date> parsedDateTime = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateTimeGranularity> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            if (__list.getSize() > 1) {
                circa = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 2) {
                try {
                    parsedDateTime = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 3) {
                parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new DateBound(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateCirca(circa), DefaultReadValidator.getInstance().validateParsedDateTime(parsedDateTime), DefaultReadValidator.getInstance().validateParsedDateTimeGranularity(parsedDateTimeGranularity), NopConstructionValidator.getInstance());
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<Boolean> circa = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<java.util.Date> parsedDateTime = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateTimeGranularity> absent();

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
                        text = iprot.readString();
                    }
                    break;
                }
                case "circa": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        circa = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "parsed_date_time": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            parsedDateTime = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "parsed_date_time_granularity": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new DateBound(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateCirca(circa), DefaultReadValidator.getInstance().validateParsedDateTime(parsedDateTime), DefaultReadValidator.getInstance().validateParsedDateTimeGranularity(parsedDateTimeGranularity), NopConstructionValidator.getInstance());
    }

    public DateBound replaceCirca(final com.google.common.base.Optional<Boolean> circa) {
        return new DateBound(this.text, DefaultConstructionValidator.getInstance().validateCirca(circa), this.parsedDateTime, this.parsedDateTimeGranularity, NopConstructionValidator.getInstance());
    }

    public DateBound replaceCirca(final boolean circa) {
        return replaceCirca(com.google.common.base.Optional.fromNullable(circa));
    }

    public DateBound replaceParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
        return new DateBound(this.text, this.circa, DefaultConstructionValidator.getInstance().validateParsedDateTime(parsedDateTime), this.parsedDateTimeGranularity, NopConstructionValidator.getInstance());
    }

    public DateBound replaceParsedDateTime(final java.util.Date parsedDateTime) {
        return replaceParsedDateTime(com.google.common.base.Optional.fromNullable(parsedDateTime));
    }

    public DateBound replaceParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
        return new DateBound(this.text, this.circa, this.parsedDateTime, DefaultConstructionValidator.getInstance().validateParsedDateTimeGranularity(parsedDateTimeGranularity), NopConstructionValidator.getInstance());
    }

    public DateBound replaceParsedDateTimeGranularity(final org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
        return replaceParsedDateTimeGranularity(com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
    }

    public DateBound replaceText(final String text) {
        return new DateBound(DefaultConstructionValidator.getInstance().validateText(text), this.circa, this.parsedDateTime, this.parsedDateTimeGranularity, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("circa", getCirca().orNull()).add("parsed_date_time", getParsedDateTime().orNull()).add("parsed_date_time_granularity", getParsedDateTimeGranularity().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.date.DateBound");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getCirca().isPresent()) {
            oprot.writeFieldBegin("circa", org.thryft.protocol.Type.BOOL, (short)2);
            oprot.writeBool(getCirca().get());
            oprot.writeFieldEnd();
        }

        if (getParsedDateTime().isPresent()) {
            oprot.writeFieldBegin("parsed_date_time", org.thryft.protocol.Type.I64, (short)3);
            oprot.writeDateTime(getParsedDateTime().get());
            oprot.writeFieldEnd();
        }

        if (getParsedDateTimeGranularity().isPresent()) {
            oprot.writeFieldBegin("parsed_date_time_granularity", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeEnum(getParsedDateTimeGranularity().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final com.google.common.base.Optional<Boolean> circa;

    private final com.google.common.base.Optional<java.util.Date> parsedDateTime;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity;
}
