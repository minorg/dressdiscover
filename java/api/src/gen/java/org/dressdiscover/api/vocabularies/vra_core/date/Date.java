package org.dressdiscover.api.vocabularies.vra_core.date;

/**
 * VRA Core 4.0 date element
 */
public final class Date implements org.thryft.Struct, org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
        public Builder() {
            earliestDate = null;
            latestDate = null;
            type = null;
            href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            source = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final Date other) {
            this.earliestDate = other.getEarliestDate();
            this.latestDate = other.getLatestDate();
            this.type = other.getType();
            this.href = other.getHref();
            this.source = other.getSource();
        }

        protected Date _build(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<String> source) {
            return new Date(earliestDate, latestDate, type, href, source, DefaultConstructionValidator.getInstance());
        }

        public Date build() {
            return _build(earliestDate, latestDate, type, href, source);
        }

        public final org.dressdiscover.api.vocabularies.vra_core.date.DateBound getEarliestDate() {
            return earliestDate;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final org.dressdiscover.api.vocabularies.vra_core.date.DateBound getLatestDate() {
            return latestDate;
        }

        public final com.google.common.base.Optional<String> getSource() {
            return source;
        }

        public final org.dressdiscover.api.vocabularies.vra_core.date.DateType getType() {
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
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                earliestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                latestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateType.class);
                if (__list.getSize() > 3) {
                    try {
                        href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 4) {
                    source = com.google.common.base.Optional.of(iprot.readString());
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
                    case "earliest_date": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            earliestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                        }
                        break;
                    }
                    case "latest_date": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            latestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateType.class);
                        }
                        break;
                    }
                    case "href": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            try {
                                href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                            } catch (final java.lang.IllegalArgumentException e) {
                            }
                        }
                        break;
                    }
                    case "source": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            source = com.google.common.base.Optional.of(iprot.readString());
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
            case EARLIEST_DATE: setEarliestDate((org.dressdiscover.api.vocabularies.vra_core.date.DateBound)value); return this;
            case LATEST_DATE: setLatestDate((org.dressdiscover.api.vocabularies.vra_core.date.DateBound)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.date.DateType)value); return this;
            case HREF: setHref((org.thryft.native_.Url)value); return this;
            case SOURCE: setSource((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) {
            this.earliestDate = DefaultConstructionValidator.getInstance().validateEarliestDate(earliestDate);
            return this;
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            this.href = DefaultConstructionValidator.getInstance().validateHref(href);
            return this;
        }

        public Builder setHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
            return setHref(com.google.common.base.Optional.fromNullable(href));
        }

        public Builder setIfPresent(final Date other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setEarliestDate(other.getEarliestDate());
            setLatestDate(other.getLatestDate());
            setType(other.getType());
            if (other.getHref().isPresent()) {
                setHref(other.getHref());
            }
            if (other.getSource().isPresent()) {
                setSource(other.getSource());
            }

            return this;
        }

        public Builder setLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) {
            this.latestDate = DefaultConstructionValidator.getInstance().validateLatestDate(latestDate);
            return this;
        }

        public Builder setSource(final com.google.common.base.Optional<String> source) {
            this.source = DefaultConstructionValidator.getInstance().validateSource(source);
            return this;
        }

        public Builder setSource(@javax.annotation.Nullable final String source) {
            return setSource(com.google.common.base.Optional.fromNullable(source));
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
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
            case EARLIEST_DATE: return unsetEarliestDate();
            case LATEST_DATE: return unsetLatestDate();
            case TYPE: return unsetType();
            case HREF: return unsetHref();
            case SOURCE: return unsetSource();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetEarliestDate() {
            this.earliestDate = null;
            return this;
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            return this;
        }

        public Builder unsetLatestDate() {
            this.latestDate = null;
            return this;
        }

        public Builder unsetSource() {
            this.source = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate;
        private org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate;
        private org.dressdiscover.api.vocabularies.vra_core.date.DateType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
        private com.google.common.base.Optional<String> source;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Date> {
        @Override
        public Date readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Date.readAs(iprot, type);
        }

        @Override
        public Date readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Date.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Date readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Date.readAsList(iprot);
        }

        @Override
        public Date readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Date.readAsStruct(iprot);
        }

        @Override
        public Date readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Date.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EARLIEST_DATE("earliestDate", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.date.DateBound>() {}, true, 1, "earliest_date", org.thryft.protocol.Type.STRUCT),
        LATEST_DATE("latestDate", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.date.DateBound>() {}, true, 2, "latest_date", org.thryft.protocol.Type.STRUCT),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.date.DateType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
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

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) throws ExceptionT;

        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) throws ExceptionT;

        public org.dressdiscover.api.vocabularies.vra_core.date.DateType validateType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) throws ExceptionT;

        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws ExceptionT;

        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws ExceptionT;
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
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) throws RuntimeException {
            if (earliestDate == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.date.Date: earliestDate is null");
            }
            return earliestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) throws RuntimeException {
            if (latestDate == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.date.Date: latestDate is null");
            }
            return latestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateType validateType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.date.Date: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws RuntimeException {
            if (href == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.date.Date: href is null");
            }
            if (!href.isPresent()) {
                return href;
            }
            return href;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws RuntimeException {
            if (source == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.date.Date: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.date.Date: source is less than min length 1");
            }
            return source;
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
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) {
            return earliestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) {
            return latestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateType validateType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return href;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) {
            return source;
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
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) throws org.thryft.protocol.InputProtocolException {
            if (earliestDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EARLIEST_DATE, "org.dressdiscover.api.vocabularies.vra_core.date.Date: earliestDate is null");
            }
            return earliestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) throws org.thryft.protocol.InputProtocolException {
            if (latestDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LATEST_DATE, "org.dressdiscover.api.vocabularies.vra_core.date.Date: latestDate is null");
            }
            return latestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateType validateType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.date.Date: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws org.thryft.protocol.InputProtocolException {
            if (href == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HREF, "org.dressdiscover.api.vocabularies.vra_core.date.Date: href is null");
            }
            if (!href.isPresent()) {
                return href;
            }
            return href;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws org.thryft.protocol.InputProtocolException {
            if (source == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.vra_core.date.Date: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.vra_core.date.Date: source is less than min length 1");
            }
            return source;
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
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) {
            return earliestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateBound validateLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) {
            return latestDate;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.date.DateType validateType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return href;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) {
            return source;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Date(final Date other) {
        this(other.getEarliestDate(), other.getLatestDate(), other.getType(), other.getHref(), other.getSource(), NopConstructionValidator.getInstance());
    }

    protected Date(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<String> source, ConstructionValidator validator) {
        this.earliestDate = validator.validateEarliestDate(earliestDate);
        this.latestDate = validator.validateLatestDate(latestDate);
        this.type = validator.validateType(type);
        this.href = validator.validateHref(href);
        this.source = validator.validateSource(source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Date other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Date> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Date create(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) {
        return new Date(earliestDate, latestDate, type, com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Date create(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateType type, final @javax.annotation.Nullable org.thryft.native_.Url href, final @javax.annotation.Nullable String source) {
        return new Date(earliestDate, latestDate, type, com.google.common.base.Optional.fromNullable(href), com.google.common.base.Optional.fromNullable(source), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Date create(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate, final org.dressdiscover.api.vocabularies.vra_core.date.DateType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<String> source) {
        return new Date(earliestDate, latestDate, type, href, source, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Date)) {
            return false;
        }

        final Date other = (Date)otherObject;

        if (!(getEarliestDate().equals(other.getEarliestDate()))) {
            return false;
        }

        if (!(getLatestDate().equals(other.getLatestDate()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getHref().isPresent() && other.getHref().isPresent()) ? (getHref().get().equals(other.getHref().get())) : (!getHref().isPresent() && !other.getHref().isPresent())))) {
            return false;
        }

        if (!(((getSource().isPresent() && other.getSource().isPresent()) ? (getSource().get().equals(other.getSource().get())) : (!getSource().isPresent() && !other.getSource().isPresent())))) {
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
        case EARLIEST_DATE: return getEarliestDate();
        case LATEST_DATE: return getLatestDate();
        case TYPE: return getType();
        case HREF: return getHref();
        case SOURCE: return getSource();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.vocabularies.vra_core.date.DateBound getEarliestDate() {
        return earliestDate;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
        return href;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.date.DateBound getLatestDate() {
        return latestDate;
    }

    public final com.google.common.base.Optional<String> getSource() {
        return source;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.date.DateType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getEarliestDate().hashCode();
        hashCode = 31 * hashCode + getLatestDate().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getHref().isPresent()) {
            hashCode = 31 * hashCode + getHref().get().hashCode();
        }
        if (getSource().isPresent()) {
            hashCode = 31 * hashCode + getSource().get().hashCode();
        }
        return hashCode;
    }

    public static Date readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Date readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Date readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate = null;
        org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate = null;
        org.dressdiscover.api.vocabularies.vra_core.date.DateType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            earliestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
            latestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateType.class);
            if (__list.getSize() > 3) {
                try {
                    href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 4) {
                source = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Date(DefaultReadValidator.getInstance().validateEarliestDate(earliestDate), DefaultReadValidator.getInstance().validateLatestDate(latestDate), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateHref(href), DefaultReadValidator.getInstance().validateSource(source), NopConstructionValidator.getInstance());
    }

    public static Date readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Date readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate = null;
        org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate = null;
        org.dressdiscover.api.vocabularies.vra_core.date.DateType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "earliest_date": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        earliestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                    }
                    break;
                }
                case "latest_date": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        latestDate = org.dressdiscover.api.vocabularies.vra_core.date.DateBound.readAsStruct(iprot);
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.date.DateType.class);
                    }
                    break;
                }
                case "href": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "source": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        source = com.google.common.base.Optional.of(iprot.readString());
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
        return new Date(DefaultReadValidator.getInstance().validateEarliestDate(earliestDate), DefaultReadValidator.getInstance().validateLatestDate(latestDate), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateHref(href), DefaultReadValidator.getInstance().validateSource(source), NopConstructionValidator.getInstance());
    }

    public Date replaceEarliestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate) {
        return new Date(DefaultConstructionValidator.getInstance().validateEarliestDate(earliestDate), this.latestDate, this.type, this.href, this.source, NopConstructionValidator.getInstance());
    }

    public Date replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        return new Date(this.earliestDate, this.latestDate, this.type, DefaultConstructionValidator.getInstance().validateHref(href), this.source, NopConstructionValidator.getInstance());
    }

    public Date replaceHref(final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public Date replaceLatestDate(final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate) {
        return new Date(this.earliestDate, DefaultConstructionValidator.getInstance().validateLatestDate(latestDate), this.type, this.href, this.source, NopConstructionValidator.getInstance());
    }

    public Date replaceSource(final com.google.common.base.Optional<String> source) {
        return new Date(this.earliestDate, this.latestDate, this.type, this.href, DefaultConstructionValidator.getInstance().validateSource(source), NopConstructionValidator.getInstance());
    }

    public Date replaceSource(final String source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public Date replaceType(final org.dressdiscover.api.vocabularies.vra_core.date.DateType type) {
        return new Date(this.earliestDate, this.latestDate, DefaultConstructionValidator.getInstance().validateType(type), this.href, this.source, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("earliest_date", getEarliestDate()).add("latest_date", getLatestDate()).add("type", getType()).add("href", getHref().orNull()).add("source", getSource().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        getEarliestDate().writeAsStruct(oprot);

        getLatestDate().writeAsStruct(oprot);

        oprot.writeEnum(getType());

        if (getHref().isPresent()) {
            oprot.writeString(getHref().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getSource().isPresent()) {
            oprot.writeString(getSource().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.date.Date");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("earliest_date", org.thryft.protocol.Type.STRUCT, (short)1);
        getEarliestDate().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("latest_date", org.thryft.protocol.Type.STRUCT, (short)2);
        getLatestDate().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getHref().isPresent()) {
            oprot.writeFieldBegin("href", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getHref().get().toString());
            oprot.writeFieldEnd();
        }

        if (getSource().isPresent()) {
            oprot.writeFieldBegin("source", org.thryft.protocol.Type.STRING, (short)5);
            oprot.writeString(getSource().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.date.DateBound earliestDate;

    private final org.dressdiscover.api.vocabularies.vra_core.date.DateBound latestDate;

    private final org.dressdiscover.api.vocabularies.vra_core.date.DateType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;

    private final com.google.common.base.Optional<String> source;
}
