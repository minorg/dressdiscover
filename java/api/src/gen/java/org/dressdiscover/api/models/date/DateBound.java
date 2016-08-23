package org.dressdiscover.api.models.date;

/**
 * VRA Core 4.0 date earliestDate or latestDate subelement
 */
public class DateBound implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            circa = com.google.common.base.Optional.absent();
            parsedDateTime = com.google.common.base.Optional.absent();
            parsedDateTimeGranularity = com.google.common.base.Optional.absent();
        }

        public Builder(final DateBound other) {
            this.text = other.getText();
            this.circa = other.getCirca();
            this.parsedDateTime = other.getParsedDateTime();
            this.parsedDateTimeGranularity = other.getParsedDateTimeGranularity();
        }

        protected DateBound _build(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity);
        }

        public DateBound build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.date.DateBound: missing text"), com.google.common.base.Preconditions.checkNotNull(circa, "org.dressdiscover.api.models.date.DateBound: missing circa"), com.google.common.base.Preconditions.checkNotNull(parsedDateTime, "org.dressdiscover.api.models.date.DateBound: missing parsedDateTime"), com.google.common.base.Preconditions.checkNotNull(parsedDateTimeGranularity, "org.dressdiscover.api.models.date.DateBound: missing parsedDateTimeGranularity"));
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
                try {
                    parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
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
                        try {
                            parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
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
            case TEXT: setText((String)value); return this;
            case CIRCA: setCirca((Boolean)value); return this;
            case PARSED_DATE_TIME: setParsedDateTime((java.util.Date)value); return this;
            case PARSED_DATE_TIME_GRANULARITY: setParsedDateTimeGranularity((org.dressdiscover.api.models.date.DateTimeGranularity)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCirca(final com.google.common.base.Optional<Boolean> circa) {
            this.circa = com.google.common.base.Preconditions.checkNotNull(circa);
            return this;
        }

        public Builder setCirca(@javax.annotation.Nullable final Boolean circa) {
            this.circa = com.google.common.base.Optional.fromNullable(circa);
            return this;
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
            this.parsedDateTime = com.google.common.base.Preconditions.checkNotNull(parsedDateTime);
            return this;
        }

        public Builder setParsedDateTime(@javax.annotation.Nullable final java.util.Date parsedDateTime) {
            this.parsedDateTime = com.google.common.base.Optional.fromNullable(parsedDateTime);
            return this;
        }

        public Builder setParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
            this.parsedDateTimeGranularity = com.google.common.base.Preconditions.checkNotNull(parsedDateTimeGranularity);
            return this;
        }

        public Builder setParsedDateTimeGranularity(@javax.annotation.Nullable final org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
            this.parsedDateTimeGranularity = com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
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
            this.circa = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetParsedDateTime() {
            this.parsedDateTime = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetParsedDateTimeGranularity() {
            this.parsedDateTimeGranularity = com.google.common.base.Optional.absent();
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
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.date.DateBound: missing text"), "org.dressdiscover.api.models.date.DateBound: text is empty");
        this.circa = com.google.common.base.Optional.absent();
        this.parsedDateTime = com.google.common.base.Optional.absent();
        this.parsedDateTimeGranularity = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public DateBound(final String text, final @javax.annotation.Nullable Boolean circa, final @javax.annotation.Nullable java.util.Date parsedDateTime, final @javax.annotation.Nullable org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.date.DateBound: missing text"), "org.dressdiscover.api.models.date.DateBound: text is empty");
        this.circa = com.google.common.base.Optional.fromNullable(circa);
        this.parsedDateTime = com.google.common.base.Optional.fromNullable(parsedDateTime);
        this.parsedDateTimeGranularity = com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity);
    }

    /**
     * Optional constructor
     */
    public DateBound(final String text, final com.google.common.base.Optional<Boolean> circa, final com.google.common.base.Optional<java.util.Date> parsedDateTime, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.date.DateBound: missing text"), "org.dressdiscover.api.models.date.DateBound: text is empty");
        this.circa = com.google.common.base.Preconditions.checkNotNull(circa, "org.dressdiscover.api.models.date.DateBound: missing circa");
        this.parsedDateTime = com.google.common.base.Preconditions.checkNotNull(parsedDateTime, "org.dressdiscover.api.models.date.DateBound: missing parsedDateTime");
        this.parsedDateTimeGranularity = com.google.common.base.Preconditions.checkNotNull(parsedDateTimeGranularity, "org.dressdiscover.api.models.date.DateBound: missing parsedDateTimeGranularity");
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
        com.google.common.base.Optional<Boolean> circa = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.util.Date> parsedDateTime = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity = com.google.common.base.Optional.absent();

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
            try {
                parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DateBound readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<Boolean> circa = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.util.Date> parsedDateTime = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity = com.google.common.base.Optional.absent();

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
                    try {
                        parsedDateTimeGranularity = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.date.DateTimeGranularity.class));
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
            return new DateBound(text, circa, parsedDateTime, parsedDateTimeGranularity);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public DateBound replaceCirca(final com.google.common.base.Optional<Boolean> circa) {
        return new DateBound(this.text, circa, this.parsedDateTime, this.parsedDateTimeGranularity);
    }

    public DateBound replaceCirca(final boolean circa) {
        return replaceCirca(com.google.common.base.Optional.fromNullable(circa));
    }

    public DateBound replaceParsedDateTime(final com.google.common.base.Optional<java.util.Date> parsedDateTime) {
        return new DateBound(this.text, this.circa, parsedDateTime, this.parsedDateTimeGranularity);
    }

    public DateBound replaceParsedDateTime(final java.util.Date parsedDateTime) {
        return replaceParsedDateTime(com.google.common.base.Optional.fromNullable(parsedDateTime));
    }

    public DateBound replaceParsedDateTimeGranularity(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateTimeGranularity> parsedDateTimeGranularity) {
        return new DateBound(this.text, this.circa, this.parsedDateTime, parsedDateTimeGranularity);
    }

    public DateBound replaceParsedDateTimeGranularity(final org.dressdiscover.api.models.date.DateTimeGranularity parsedDateTimeGranularity) {
        return replaceParsedDateTimeGranularity(com.google.common.base.Optional.fromNullable(parsedDateTimeGranularity));
    }

    public DateBound replaceText(final String text) {
        return new DateBound(text, this.circa, this.parsedDateTime, this.parsedDateTimeGranularity);
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
