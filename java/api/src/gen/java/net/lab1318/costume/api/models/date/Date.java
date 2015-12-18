package net.lab1318.costume.api.models.date;

/**
 * VRA Core 4.0 date element
 */
public class Date implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            earliestDate = null;
            latestDate = null;
            type = null;
            href = com.google.common.base.Optional.absent();
            source = com.google.common.base.Optional.absent();
        }

        public Builder(final Date other) {
            this.earliestDate = other.getEarliestDate();
            this.latestDate = other.getLatestDate();
            this.type = other.getType();
            this.href = other.getHref();
            this.source = other.getSource();
        }

        protected Date _build(final net.lab1318.costume.api.models.date.DateBound earliestDate, final net.lab1318.costume.api.models.date.DateBound latestDate, final net.lab1318.costume.api.models.date.DateType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<String> source) {
            return new Date(earliestDate, latestDate, type, href, source);
        }

        public Date build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(earliestDate, "net.lab1318.costume.api.models.date.Date: missing earliestDate"), com.google.common.base.Preconditions.checkNotNull(latestDate, "net.lab1318.costume.api.models.date.Date: missing latestDate"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.date.Date: missing type"), com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.date.Date: missing href"), com.google.common.base.Preconditions.checkNotNull(source, "net.lab1318.costume.api.models.date.Date: missing source"));
        }

        public final net.lab1318.costume.api.models.date.DateBound getEarliestDate() {
            return earliestDate;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final net.lab1318.costume.api.models.date.DateBound getLatestDate() {
            return latestDate;
        }

        public final com.google.common.base.Optional<String> getSource() {
            return source;
        }

        public final net.lab1318.costume.api.models.date.DateType getType() {
            return type;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            earliestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
            latestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
            type = iprot.readEnum(net.lab1318.costume.api.models.date.DateType.class);
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
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "earliest_date": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        earliestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
                    }
                    break;
                }
                case "latest_date": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        latestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.date.DateType.class);
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
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setEarliestDate(final net.lab1318.costume.api.models.date.DateBound earliestDate) {
            this.earliestDate = com.google.common.base.Preconditions.checkNotNull(earliestDate);
            return this;
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            this.href = com.google.common.base.Preconditions.checkNotNull(href);
            return this;
        }

        public Builder setHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
            this.href = com.google.common.base.Optional.fromNullable(href);
            return this;
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

        public Builder setLatestDate(final net.lab1318.costume.api.models.date.DateBound latestDate) {
            this.latestDate = com.google.common.base.Preconditions.checkNotNull(latestDate);
            return this;
        }

        public Builder setSource(final com.google.common.base.Optional<String> source) {
            this.source = com.google.common.base.Preconditions.checkNotNull(source);
            return this;
        }

        public Builder setSource(@javax.annotation.Nullable final String source) {
            this.source = com.google.common.base.Optional.fromNullable(source);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.date.DateType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "earliest_date": setEarliestDate((net.lab1318.costume.api.models.date.DateBound)value); return this;
            case "latest_date": setLatestDate((net.lab1318.costume.api.models.date.DateBound)value); return this;
            case "type": setType((net.lab1318.costume.api.models.date.DateType)value); return this;
            case "href": setHref((org.thryft.native_.Url)value); return this;
            case "source": setSource((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetEarliestDate() {
            this.earliestDate = null;
            return this;
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetLatestDate() {
            this.latestDate = null;
            return this;
        }

        public Builder unsetSource() {
            this.source = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private net.lab1318.costume.api.models.date.DateBound earliestDate;
        private net.lab1318.costume.api.models.date.DateBound latestDate;
        private net.lab1318.costume.api.models.date.DateType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
        private com.google.common.base.Optional<String> source;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EARLIEST_DATE("earliestDate", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.date.DateBound>() {}, true, 1, "earliest_date", org.thryft.protocol.Type.STRUCT),
        LATEST_DATE("latestDate", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.date.DateBound>() {}, true, 2, "latest_date", org.thryft.protocol.Type.STRUCT),
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

    /**
     * Copy constructor
     */
    public Date(final Date other) {
        this(other.getEarliestDate(), other.getLatestDate(), other.getType(), other.getHref(), other.getSource());
    }

    /**
     * Required constructor
     */
    public Date(final net.lab1318.costume.api.models.date.DateBound earliestDate, final net.lab1318.costume.api.models.date.DateBound latestDate, final net.lab1318.costume.api.models.date.DateType type) {
        this.earliestDate = com.google.common.base.Preconditions.checkNotNull(earliestDate, "net.lab1318.costume.api.models.date.Date: missing earliestDate");
        this.latestDate = com.google.common.base.Preconditions.checkNotNull(latestDate, "net.lab1318.costume.api.models.date.Date: missing latestDate");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.date.Date: missing type");
        this.href = com.google.common.base.Optional.absent();
        this.source = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Date(final net.lab1318.costume.api.models.date.DateBound earliestDate, final net.lab1318.costume.api.models.date.DateBound latestDate, final net.lab1318.costume.api.models.date.DateType type, final @javax.annotation.Nullable org.thryft.native_.Url href, final @javax.annotation.Nullable String source) {
        this.earliestDate = com.google.common.base.Preconditions.checkNotNull(earliestDate, "net.lab1318.costume.api.models.date.Date: missing earliestDate");
        this.latestDate = com.google.common.base.Preconditions.checkNotNull(latestDate, "net.lab1318.costume.api.models.date.Date: missing latestDate");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.date.Date: missing type");
        this.href = com.google.common.base.Optional.fromNullable(href);
        this.source = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(source), "net.lab1318.costume.api.models.date.Date: source is empty");
    }

    /**
     * Optional constructor
     */
    public Date(final net.lab1318.costume.api.models.date.DateBound earliestDate, final net.lab1318.costume.api.models.date.DateBound latestDate, final net.lab1318.costume.api.models.date.DateType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<String> source) {
        this.earliestDate = com.google.common.base.Preconditions.checkNotNull(earliestDate, "net.lab1318.costume.api.models.date.Date: missing earliestDate");
        this.latestDate = com.google.common.base.Preconditions.checkNotNull(latestDate, "net.lab1318.costume.api.models.date.Date: missing latestDate");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.date.Date: missing type");
        this.href = com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.date.Date: missing href");
        this.source = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(source, "net.lab1318.costume.api.models.date.Date: missing source"), "net.lab1318.costume.api.models.date.Date: source is empty");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Date)) {
            return false;
        }

        final Date other = (Date)otherObject;
        return
            getEarliestDate().equals(other.getEarliestDate()) &&
            getLatestDate().equals(other.getLatestDate()) &&
            getType().equals(other.getType()) &&
            getHref().equals(other.getHref()) &&
            getSource().equals(other.getSource());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "earliest_date": return getEarliestDate();
        case "latest_date": return getLatestDate();
        case "type": return getType();
        case "href": return getHref();
        case "source": return getSource();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final net.lab1318.costume.api.models.date.DateBound getEarliestDate() {
        return earliestDate;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
        return href;
    }

    public final net.lab1318.costume.api.models.date.DateBound getLatestDate() {
        return latestDate;
    }

    public final com.google.common.base.Optional<String> getSource() {
        return source;
    }

    public final net.lab1318.costume.api.models.date.DateType getType() {
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Date readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.date.DateBound earliestDate = null;
        net.lab1318.costume.api.models.date.DateBound latestDate = null;
        net.lab1318.costume.api.models.date.DateType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        earliestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
        latestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
        type = iprot.readEnum(net.lab1318.costume.api.models.date.DateType.class);
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
        try {
            return new Date(earliestDate, latestDate, type, href, source);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Date readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.date.DateBound earliestDate = null;
        net.lab1318.costume.api.models.date.DateBound latestDate = null;
        net.lab1318.costume.api.models.date.DateType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "earliest_date": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    earliestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
                }
                break;
            }
            case "latest_date": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    latestDate = net.lab1318.costume.api.models.date.DateBound.readAsStruct(iprot);
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.date.DateType.class);
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
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Date(earliestDate, latestDate, type, href, source);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Date replaceEarliestDate(final net.lab1318.costume.api.models.date.DateBound earliestDate) {
        return new Date(earliestDate, this.latestDate, this.type, this.href, this.source);
    }

    public Date replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        return new Date(this.earliestDate, this.latestDate, this.type, href, this.source);
    }

    public Date replaceHref(final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public Date replaceLatestDate(final net.lab1318.costume.api.models.date.DateBound latestDate) {
        return new Date(this.earliestDate, latestDate, this.type, this.href, this.source);
    }

    public Date replaceSource(final com.google.common.base.Optional<String> source) {
        return new Date(this.earliestDate, this.latestDate, this.type, this.href, source);
    }

    public Date replaceSource(final String source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public Date replaceType(final net.lab1318.costume.api.models.date.DateType type) {
        return new Date(this.earliestDate, this.latestDate, type, this.href, this.source);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.date.Date");
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

    private final net.lab1318.costume.api.models.date.DateBound earliestDate;

    private final net.lab1318.costume.api.models.date.DateBound latestDate;

    private final net.lab1318.costume.api.models.date.DateType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;

    private final com.google.common.base.Optional<String> source;
}
