package net.lab1318.costume.api.models.object;

public class ObjectQuery implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            includeCollectionId = com.google.common.base.Optional.absent();
            includeInstitutionId = com.google.common.base.Optional.absent();
            queryString = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectQuery other) {
            this.includeCollectionId = other.getIncludeCollectionId();
            this.includeInstitutionId = other.getIncludeInstitutionId();
            this.queryString = other.getQueryString();
        }

        protected ObjectQuery _build(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId, final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId, final com.google.common.base.Optional<String> queryString) {
            return new ObjectQuery(includeCollectionId, includeInstitutionId, queryString);
        }

        public ObjectQuery build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(includeCollectionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionId"), com.google.common.base.Preconditions.checkNotNull(includeInstitutionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionId"), com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getIncludeCollectionId() {
            return includeCollectionId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> getIncludeInstitutionId() {
            return includeInstitutionId;
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
                try {
                    includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                }
            }
            if (__list.getSize() > 1) {
                try {
                    includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
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
                case "include_collection_id": {
                    try {
                        includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                    }
                    break;
                }
                case "include_institution_id": {
                    try {
                        includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
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

        public Builder setIfPresent(final ObjectQuery other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getIncludeCollectionId().isPresent()) {
                setIncludeCollectionId(other.getIncludeCollectionId());
            }
            if (other.getIncludeInstitutionId().isPresent()) {
                setIncludeInstitutionId(other.getIncludeInstitutionId());
            }
            if (other.getQueryString().isPresent()) {
                setQueryString(other.getQueryString());
            }

            return this;
        }

        public Builder setIncludeCollectionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId) {
            this.includeCollectionId = com.google.common.base.Preconditions.checkNotNull(includeCollectionId);
            return this;
        }

        public Builder setIncludeCollectionId(@javax.annotation.Nullable final net.lab1318.costume.api.models.collection.CollectionId includeCollectionId) {
            this.includeCollectionId = com.google.common.base.Optional.fromNullable(includeCollectionId);
            return this;
        }

        public Builder setIncludeInstitutionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId) {
            this.includeInstitutionId = com.google.common.base.Preconditions.checkNotNull(includeInstitutionId);
            return this;
        }

        public Builder setIncludeInstitutionId(@javax.annotation.Nullable final net.lab1318.costume.api.models.institution.InstitutionId includeInstitutionId) {
            this.includeInstitutionId = com.google.common.base.Optional.fromNullable(includeInstitutionId);
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
            case "include_collection_id": setIncludeCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "include_institution_id": setIncludeInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "query_string": setQueryString((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetIncludeCollectionId() {
            this.includeCollectionId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeInstitutionId() {
            this.includeInstitutionId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetQueryString() {
            this.queryString = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId;
        private com.google.common.base.Optional<String> queryString;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INCLUDE_COLLECTION_ID("includeCollectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, false, 0, "include_collection_id", org.thryft.protocol.Type.STRING),
        INCLUDE_INSTITUTION_ID("includeInstitutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, false, 0, "include_institution_id", org.thryft.protocol.Type.STRING),
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
            case "includeCollectionId": return INCLUDE_COLLECTION_ID;
            case "includeInstitutionId": return INCLUDE_INSTITUTION_ID;
            case "queryString": return QUERY_STRING;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "include_collection_id": return INCLUDE_COLLECTION_ID;
            case "include_institution_id": return INCLUDE_INSTITUTION_ID;
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
        includeCollectionId = com.google.common.base.Optional.absent();
        includeInstitutionId = com.google.common.base.Optional.absent();
        queryString = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectQuery(final ObjectQuery other) {
        this(other.getIncludeCollectionId(), other.getIncludeInstitutionId(), other.getQueryString());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectQuery(final @javax.annotation.Nullable net.lab1318.costume.api.models.collection.CollectionId includeCollectionId, final @javax.annotation.Nullable net.lab1318.costume.api.models.institution.InstitutionId includeInstitutionId, final @javax.annotation.Nullable String queryString) {
        this.includeCollectionId = com.google.common.base.Optional.fromNullable(includeCollectionId);
        this.includeInstitutionId = com.google.common.base.Optional.fromNullable(includeInstitutionId);
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(queryString), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId, final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId, final com.google.common.base.Optional<String> queryString) {
        this.includeCollectionId = com.google.common.base.Preconditions.checkNotNull(includeCollectionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionId");
        this.includeInstitutionId = com.google.common.base.Preconditions.checkNotNull(includeInstitutionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionId");
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
            getIncludeCollectionId().equals(other.getIncludeCollectionId()) &&
            getIncludeInstitutionId().equals(other.getIncludeInstitutionId()) &&
            getQueryString().equals(other.getQueryString());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "include_collection_id": return getIncludeCollectionId();
        case "include_institution_id": return getIncludeInstitutionId();
        case "query_string": return getQueryString();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getIncludeCollectionId() {
        return includeCollectionId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> getIncludeInstitutionId() {
        return includeInstitutionId;
    }

    public final com.google.common.base.Optional<String> getQueryString() {
        return queryString;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getIncludeCollectionId().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCollectionId().get().hashCode();
        }
        if (getIncludeInstitutionId().isPresent()) {
            hashCode = 31 * hashCode + getIncludeInstitutionId().get().hashCode();
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
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            try {
                includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
            }
        }
        if (__list.getSize() > 1) {
            try {
                includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
            }
        }
        if (__list.getSize() > 2) {
            queryString = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new ObjectQuery(includeCollectionId, includeInstitutionId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "include_collection_id": {
                try {
                    includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                }
                break;
            }
            case "include_institution_id": {
                try {
                    includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
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
            return new ObjectQuery(includeCollectionId, includeInstitutionId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectQuery replaceIncludeCollectionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId) {
        return new ObjectQuery(includeCollectionId, this.includeInstitutionId, this.queryString);
    }

    public ObjectQuery replaceIncludeCollectionId(final net.lab1318.costume.api.models.collection.CollectionId includeCollectionId) {
        return replaceIncludeCollectionId(com.google.common.base.Optional.fromNullable(includeCollectionId));
    }

    public ObjectQuery replaceIncludeInstitutionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId) {
        return new ObjectQuery(this.includeCollectionId, includeInstitutionId, this.queryString);
    }

    public ObjectQuery replaceIncludeInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId includeInstitutionId) {
        return replaceIncludeInstitutionId(com.google.common.base.Optional.fromNullable(includeInstitutionId));
    }

    public ObjectQuery replaceQueryString(final com.google.common.base.Optional<String> queryString) {
        return new ObjectQuery(this.includeCollectionId, this.includeInstitutionId, queryString);
    }

    public ObjectQuery replaceQueryString(final String queryString) {
        return replaceQueryString(com.google.common.base.Optional.fromNullable(queryString));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("include_collection_id", getIncludeCollectionId().orNull()).add("include_institution_id", getIncludeInstitutionId().orNull()).add("query_string", getQueryString().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        if (getIncludeCollectionId().isPresent()) {
            oprot.writeString(getIncludeCollectionId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getIncludeInstitutionId().isPresent()) {
            oprot.writeString(getIncludeInstitutionId().get().toString());
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
        if (getIncludeCollectionId().isPresent()) {
            oprot.writeFieldBegin("include_collection_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getIncludeCollectionId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getIncludeInstitutionId().isPresent()) {
            oprot.writeFieldBegin("include_institution_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getIncludeInstitutionId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getQueryString().isPresent()) {
            oprot.writeFieldBegin("query_string", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getQueryString().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId;

    private final com.google.common.base.Optional<String> queryString;
}
