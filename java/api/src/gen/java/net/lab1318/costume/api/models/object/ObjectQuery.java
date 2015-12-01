package net.lab1318.costume.api.models.object;

public class ObjectQuery implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            filters = com.google.common.base.Optional.absent();
            moreLikeObjectId = com.google.common.base.Optional.absent();
            queryString = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectQuery other) {
            this.filters = other.getFilters();
            this.moreLikeObjectId = other.getMoreLikeObjectId();
            this.queryString = other.getQueryString();
        }

        protected ObjectQuery _build(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
            return new ObjectQuery(filters, moreLikeObjectId, queryString);
        }

        public ObjectQuery build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(filters, "net.lab1318.costume.api.models.object.ObjectQuery: missing filters"), com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId, "net.lab1318.costume.api.models.object.ObjectQuery: missing moreLikeObjectId"), com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> getFilters() {
            return filters;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getMoreLikeObjectId() {
            return moreLikeObjectId;
        }

        public final com.google.common.base.Optional<String> getQueryString() {
            return queryString;
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
            if (__list.getSize() > 0) {
                filters = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectFilters.readAsStruct(iprot));
            }
            if (__list.getSize() > 1) {
                try {
                    moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 2) {
                queryString = com.google.common.base.Optional.of(iprot.readString());
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
                case "filters": {
                    filters = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectFilters.readAsStruct(iprot));
                    break;
                }
                case "more_like_object_id": {
                    try {
                        moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                    }
                    break;
                }
                case "query_string": {
                    queryString = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setFilters(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters) {
            this.filters = com.google.common.base.Preconditions.checkNotNull(filters);
            return this;
        }

        public Builder setFilters(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectFilters filters) {
            this.filters = com.google.common.base.Optional.fromNullable(filters);
            return this;
        }

        public Builder setIfPresent(final ObjectQuery other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getFilters().isPresent()) {
                setFilters(other.getFilters());
            }
            if (other.getMoreLikeObjectId().isPresent()) {
                setMoreLikeObjectId(other.getMoreLikeObjectId());
            }
            if (other.getQueryString().isPresent()) {
                setQueryString(other.getQueryString());
            }

            return this;
        }

        public Builder setMoreLikeObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId) {
            this.moreLikeObjectId = com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId);
            return this;
        }

        public Builder setMoreLikeObjectId(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId) {
            this.moreLikeObjectId = com.google.common.base.Optional.fromNullable(moreLikeObjectId);
            return this;
        }

        public Builder setQueryString(final com.google.common.base.Optional<String> queryString) {
            this.queryString = com.google.common.base.Preconditions.checkNotNull(queryString);
            return this;
        }

        public Builder setQueryString(@javax.annotation.Nullable final String queryString) {
            this.queryString = com.google.common.base.Optional.fromNullable(queryString);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "filters": setFilters((net.lab1318.costume.api.models.object.ObjectFilters)value); return this;
            case "more_like_object_id": setMoreLikeObjectId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "query_string": setQueryString((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFilters() {
            this.filters = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetMoreLikeObjectId() {
            this.moreLikeObjectId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetQueryString() {
            this.queryString = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;
        private com.google.common.base.Optional<String> queryString;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FILTERS("filters", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectFilters>() {}, false, 0, "filters", org.thryft.protocol.Type.STRUCT),
        MORE_LIKE_OBJECT_ID("moreLikeObjectId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, false, 0, "more_like_object_id", org.thryft.protocol.Type.STRING),
        QUERY_STRING("queryString", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "query_string", org.thryft.protocol.Type.STRING);

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
            case "filters": return FILTERS;
            case "moreLikeObjectId": return MORE_LIKE_OBJECT_ID;
            case "queryString": return QUERY_STRING;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "filters": return FILTERS;
            case "more_like_object_id": return MORE_LIKE_OBJECT_ID;
            case "query_string": return QUERY_STRING;
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
     * Default constructor
     */
    public ObjectQuery() {
        filters = com.google.common.base.Optional.absent();
        moreLikeObjectId = com.google.common.base.Optional.absent();
        queryString = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectQuery(final ObjectQuery other) {
        this(other.getFilters(), other.getMoreLikeObjectId(), other.getQueryString());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectQuery(final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectFilters filters, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId, final @javax.annotation.Nullable String queryString) {
        this.filters = com.google.common.base.Optional.fromNullable(filters);
        this.moreLikeObjectId = com.google.common.base.Optional.fromNullable(moreLikeObjectId);
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(queryString), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
        this.filters = com.google.common.base.Preconditions.checkNotNull(filters, "net.lab1318.costume.api.models.object.ObjectQuery: missing filters");
        this.moreLikeObjectId = com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId, "net.lab1318.costume.api.models.object.ObjectQuery: missing moreLikeObjectId");
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectQuery other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectQuery> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectQuery)) {
            return false;
        }

        final ObjectQuery other = (ObjectQuery)otherObject;
        return
            getFilters().equals(other.getFilters()) &&
            getMoreLikeObjectId().equals(other.getMoreLikeObjectId()) &&
            getQueryString().equals(other.getQueryString());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "filters": return getFilters();
        case "more_like_object_id": return getMoreLikeObjectId();
        case "query_string": return getQueryString();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> getFilters() {
        return filters;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getMoreLikeObjectId() {
        return moreLikeObjectId;
    }

    public final com.google.common.base.Optional<String> getQueryString() {
        return queryString;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFilters().isPresent()) {
            hashCode = 31 * hashCode + getFilters().get().hashCode();
        }
        if (getMoreLikeObjectId().isPresent()) {
            hashCode = 31 * hashCode + getMoreLikeObjectId().get().hashCode();
        }
        if (getQueryString().isPresent()) {
            hashCode = 31 * hashCode + getQueryString().get().hashCode();
        }
        return hashCode;
    }

    public static ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectQuery readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            filters = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectFilters.readAsStruct(iprot));
        }
        if (__list.getSize() > 1) {
            try {
                moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
            }
        }
        if (__list.getSize() > 2) {
            queryString = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new ObjectQuery(filters, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "filters": {
                filters = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectFilters.readAsStruct(iprot));
                break;
            }
            case "more_like_object_id": {
                try {
                    moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
                break;
            }
            case "query_string": {
                queryString = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectQuery(filters, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectQuery replaceFilters(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters) {
        return new ObjectQuery(filters, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceFilters(final net.lab1318.costume.api.models.object.ObjectFilters filters) {
        return replaceFilters(com.google.common.base.Optional.fromNullable(filters));
    }

    public ObjectQuery replaceMoreLikeObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId) {
        return new ObjectQuery(this.filters, moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceMoreLikeObjectId(final net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId) {
        return replaceMoreLikeObjectId(com.google.common.base.Optional.fromNullable(moreLikeObjectId));
    }

    public ObjectQuery replaceQueryString(final com.google.common.base.Optional<String> queryString) {
        return new ObjectQuery(this.filters, this.moreLikeObjectId, queryString);
    }

    public ObjectQuery replaceQueryString(final String queryString) {
        return replaceQueryString(com.google.common.base.Optional.fromNullable(queryString));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("filters", getFilters().orNull()).add("more_like_object_id", getMoreLikeObjectId().orNull()).add("query_string", getQueryString().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        if (getFilters().isPresent()) {
            getFilters().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeString(getMoreLikeObjectId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getQueryString().isPresent()) {
            oprot.writeString(getQueryString().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.ObjectQuery");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFilters().isPresent()) {
            oprot.writeFieldBegin("filters", org.thryft.protocol.Type.STRUCT, (short)0);
            getFilters().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeFieldBegin("more_like_object_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getMoreLikeObjectId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getQueryString().isPresent()) {
            oprot.writeFieldBegin("query_string", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getQueryString().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectFilters> filters;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;

    private final com.google.common.base.Optional<String> queryString;
}
