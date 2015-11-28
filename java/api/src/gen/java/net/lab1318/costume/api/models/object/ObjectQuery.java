package net.lab1318.costume.api.models.object;

public class ObjectQuery implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            includeAgentNameText = com.google.common.base.Optional.absent();
            includeCategory = com.google.common.base.Optional.absent();
            includeCollectionId = com.google.common.base.Optional.absent();
            includeInstitutionId = com.google.common.base.Optional.absent();
            includeSubjectTermText = com.google.common.base.Optional.absent();
            moreLikeObjectId = com.google.common.base.Optional.absent();
            queryString = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectQuery other) {
            this.includeAgentNameText = other.getIncludeAgentNameText();
            this.includeCategory = other.getIncludeCategory();
            this.includeCollectionId = other.getIncludeCollectionId();
            this.includeInstitutionId = other.getIncludeInstitutionId();
            this.includeSubjectTermText = other.getIncludeSubjectTermText();
            this.moreLikeObjectId = other.getMoreLikeObjectId();
            this.queryString = other.getQueryString();
        }

        protected ObjectQuery _build(final com.google.common.base.Optional<String> includeAgentNameText, final com.google.common.base.Optional<String> includeCategory, final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId, final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId, final com.google.common.base.Optional<String> includeSubjectTermText, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
            return new ObjectQuery(includeAgentNameText, includeCategory, includeCollectionId, includeInstitutionId, includeSubjectTermText, moreLikeObjectId, queryString);
        }

        public ObjectQuery build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(includeAgentNameText, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeAgentNameText"), com.google.common.base.Preconditions.checkNotNull(includeCategory, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCategory"), com.google.common.base.Preconditions.checkNotNull(includeCollectionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionId"), com.google.common.base.Preconditions.checkNotNull(includeInstitutionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionId"), com.google.common.base.Preconditions.checkNotNull(includeSubjectTermText, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeSubjectTermText"), com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId, "net.lab1318.costume.api.models.object.ObjectQuery: missing moreLikeObjectId"), com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"));
        }

        public final com.google.common.base.Optional<String> getIncludeAgentNameText() {
            return includeAgentNameText;
        }

        public final com.google.common.base.Optional<String> getIncludeCategory() {
            return includeCategory;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getIncludeCollectionId() {
            return includeCollectionId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> getIncludeInstitutionId() {
            return includeInstitutionId;
        }

        public final com.google.common.base.Optional<String> getIncludeSubjectTermText() {
            return includeSubjectTermText;
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
                includeAgentNameText = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 1) {
                includeCategory = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                try {
                    includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                }
            }
            if (__list.getSize() > 3) {
                try {
                    includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                }
            }
            if (__list.getSize() > 4) {
                includeSubjectTermText = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 5) {
                try {
                    moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 6) {
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
                case "include_agent_name_text": {
                    includeAgentNameText = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "include_category": {
                    includeCategory = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
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
                case "include_subject_term_text": {
                    includeSubjectTermText = com.google.common.base.Optional.of(iprot.readString());
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

        public Builder setIfPresent(final ObjectQuery other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getIncludeAgentNameText().isPresent()) {
                setIncludeAgentNameText(other.getIncludeAgentNameText());
            }
            if (other.getIncludeCategory().isPresent()) {
                setIncludeCategory(other.getIncludeCategory());
            }
            if (other.getIncludeCollectionId().isPresent()) {
                setIncludeCollectionId(other.getIncludeCollectionId());
            }
            if (other.getIncludeInstitutionId().isPresent()) {
                setIncludeInstitutionId(other.getIncludeInstitutionId());
            }
            if (other.getIncludeSubjectTermText().isPresent()) {
                setIncludeSubjectTermText(other.getIncludeSubjectTermText());
            }
            if (other.getMoreLikeObjectId().isPresent()) {
                setMoreLikeObjectId(other.getMoreLikeObjectId());
            }
            if (other.getQueryString().isPresent()) {
                setQueryString(other.getQueryString());
            }

            return this;
        }

        public Builder setIncludeAgentNameText(final com.google.common.base.Optional<String> includeAgentNameText) {
            this.includeAgentNameText = com.google.common.base.Preconditions.checkNotNull(includeAgentNameText);
            return this;
        }

        public Builder setIncludeAgentNameText(@javax.annotation.Nullable final String includeAgentNameText) {
            this.includeAgentNameText = com.google.common.base.Optional.fromNullable(includeAgentNameText);
            return this;
        }

        public Builder setIncludeCategory(final com.google.common.base.Optional<String> includeCategory) {
            this.includeCategory = com.google.common.base.Preconditions.checkNotNull(includeCategory);
            return this;
        }

        public Builder setIncludeCategory(@javax.annotation.Nullable final String includeCategory) {
            this.includeCategory = com.google.common.base.Optional.fromNullable(includeCategory);
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

        public Builder setIncludeSubjectTermText(final com.google.common.base.Optional<String> includeSubjectTermText) {
            this.includeSubjectTermText = com.google.common.base.Preconditions.checkNotNull(includeSubjectTermText);
            return this;
        }

        public Builder setIncludeSubjectTermText(@javax.annotation.Nullable final String includeSubjectTermText) {
            this.includeSubjectTermText = com.google.common.base.Optional.fromNullable(includeSubjectTermText);
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
            case "include_agent_name_text": setIncludeAgentNameText((String)value); return this;
            case "include_category": setIncludeCategory((String)value); return this;
            case "include_collection_id": setIncludeCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "include_institution_id": setIncludeInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "include_subject_term_text": setIncludeSubjectTermText((String)value); return this;
            case "more_like_object_id": setMoreLikeObjectId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "query_string": setQueryString((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetIncludeAgentNameText() {
            this.includeAgentNameText = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCategory() {
            this.includeCategory = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCollectionId() {
            this.includeCollectionId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeInstitutionId() {
            this.includeInstitutionId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeSubjectTermText() {
            this.includeSubjectTermText = com.google.common.base.Optional.absent();
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

        private com.google.common.base.Optional<String> includeAgentNameText;
        private com.google.common.base.Optional<String> includeCategory;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId;
        private com.google.common.base.Optional<String> includeSubjectTermText;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;
        private com.google.common.base.Optional<String> queryString;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INCLUDE_AGENT_NAME_TEXT("includeAgentNameText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "include_agent_name_text", org.thryft.protocol.Type.STRING),
        INCLUDE_CATEGORY("includeCategory", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "include_category", org.thryft.protocol.Type.STRING),
        INCLUDE_COLLECTION_ID("includeCollectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, false, 0, "include_collection_id", org.thryft.protocol.Type.STRING),
        INCLUDE_INSTITUTION_ID("includeInstitutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, false, 0, "include_institution_id", org.thryft.protocol.Type.STRING),
        INCLUDE_SUBJECT_TERM_TEXT("includeSubjectTermText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "include_subject_term_text", org.thryft.protocol.Type.STRING),
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
            case "includeAgentNameText": return INCLUDE_AGENT_NAME_TEXT;
            case "includeCategory": return INCLUDE_CATEGORY;
            case "includeCollectionId": return INCLUDE_COLLECTION_ID;
            case "includeInstitutionId": return INCLUDE_INSTITUTION_ID;
            case "includeSubjectTermText": return INCLUDE_SUBJECT_TERM_TEXT;
            case "moreLikeObjectId": return MORE_LIKE_OBJECT_ID;
            case "queryString": return QUERY_STRING;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "include_agent_name_text": return INCLUDE_AGENT_NAME_TEXT;
            case "include_category": return INCLUDE_CATEGORY;
            case "include_collection_id": return INCLUDE_COLLECTION_ID;
            case "include_institution_id": return INCLUDE_INSTITUTION_ID;
            case "include_subject_term_text": return INCLUDE_SUBJECT_TERM_TEXT;
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
        includeAgentNameText = com.google.common.base.Optional.absent();
        includeCategory = com.google.common.base.Optional.absent();
        includeCollectionId = com.google.common.base.Optional.absent();
        includeInstitutionId = com.google.common.base.Optional.absent();
        includeSubjectTermText = com.google.common.base.Optional.absent();
        moreLikeObjectId = com.google.common.base.Optional.absent();
        queryString = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectQuery(final ObjectQuery other) {
        this(other.getIncludeAgentNameText(), other.getIncludeCategory(), other.getIncludeCollectionId(), other.getIncludeInstitutionId(), other.getIncludeSubjectTermText(), other.getMoreLikeObjectId(), other.getQueryString());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectQuery(final @javax.annotation.Nullable String includeAgentNameText, final @javax.annotation.Nullable String includeCategory, final @javax.annotation.Nullable net.lab1318.costume.api.models.collection.CollectionId includeCollectionId, final @javax.annotation.Nullable net.lab1318.costume.api.models.institution.InstitutionId includeInstitutionId, final @javax.annotation.Nullable String includeSubjectTermText, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId, final @javax.annotation.Nullable String queryString) {
        this.includeAgentNameText = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(includeAgentNameText), "net.lab1318.costume.api.models.object.ObjectQuery: includeAgentNameText is empty");
        this.includeCategory = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(includeCategory), "net.lab1318.costume.api.models.object.ObjectQuery: includeCategory is empty");
        this.includeCollectionId = com.google.common.base.Optional.fromNullable(includeCollectionId);
        this.includeInstitutionId = com.google.common.base.Optional.fromNullable(includeInstitutionId);
        this.includeSubjectTermText = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(includeSubjectTermText), "net.lab1318.costume.api.models.object.ObjectQuery: includeSubjectTermText is empty");
        this.moreLikeObjectId = com.google.common.base.Optional.fromNullable(moreLikeObjectId);
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(queryString), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectQuery(final com.google.common.base.Optional<String> includeAgentNameText, final com.google.common.base.Optional<String> includeCategory, final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId, final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId, final com.google.common.base.Optional<String> includeSubjectTermText, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
        this.includeAgentNameText = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeAgentNameText, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeAgentNameText"), "net.lab1318.costume.api.models.object.ObjectQuery: includeAgentNameText is empty");
        this.includeCategory = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCategory, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCategory"), "net.lab1318.costume.api.models.object.ObjectQuery: includeCategory is empty");
        this.includeCollectionId = com.google.common.base.Preconditions.checkNotNull(includeCollectionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionId");
        this.includeInstitutionId = com.google.common.base.Preconditions.checkNotNull(includeInstitutionId, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionId");
        this.includeSubjectTermText = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeSubjectTermText, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeSubjectTermText"), "net.lab1318.costume.api.models.object.ObjectQuery: includeSubjectTermText is empty");
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
            getIncludeAgentNameText().equals(other.getIncludeAgentNameText()) &&
            getIncludeCategory().equals(other.getIncludeCategory()) &&
            getIncludeCollectionId().equals(other.getIncludeCollectionId()) &&
            getIncludeInstitutionId().equals(other.getIncludeInstitutionId()) &&
            getIncludeSubjectTermText().equals(other.getIncludeSubjectTermText()) &&
            getMoreLikeObjectId().equals(other.getMoreLikeObjectId()) &&
            getQueryString().equals(other.getQueryString());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "include_agent_name_text": return getIncludeAgentNameText();
        case "include_category": return getIncludeCategory();
        case "include_collection_id": return getIncludeCollectionId();
        case "include_institution_id": return getIncludeInstitutionId();
        case "include_subject_term_text": return getIncludeSubjectTermText();
        case "more_like_object_id": return getMoreLikeObjectId();
        case "query_string": return getQueryString();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getIncludeAgentNameText() {
        return includeAgentNameText;
    }

    public final com.google.common.base.Optional<String> getIncludeCategory() {
        return includeCategory;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getIncludeCollectionId() {
        return includeCollectionId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> getIncludeInstitutionId() {
        return includeInstitutionId;
    }

    public final com.google.common.base.Optional<String> getIncludeSubjectTermText() {
        return includeSubjectTermText;
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
        if (getIncludeAgentNameText().isPresent()) {
            hashCode = 31 * hashCode + getIncludeAgentNameText().get().hashCode();
        }
        if (getIncludeCategory().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCategory().get().hashCode();
        }
        if (getIncludeCollectionId().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCollectionId().get().hashCode();
        }
        if (getIncludeInstitutionId().isPresent()) {
            hashCode = 31 * hashCode + getIncludeInstitutionId().get().hashCode();
        }
        if (getIncludeSubjectTermText().isPresent()) {
            hashCode = 31 * hashCode + getIncludeSubjectTermText().get().hashCode();
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
        com.google.common.base.Optional<String> includeAgentNameText = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> includeCategory = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> includeSubjectTermText = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            includeAgentNameText = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 1) {
            includeCategory = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            try {
                includeCollectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
            }
        }
        if (__list.getSize() > 3) {
            try {
                includeInstitutionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
            }
        }
        if (__list.getSize() > 4) {
            includeSubjectTermText = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 5) {
            try {
                moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
            }
        }
        if (__list.getSize() > 6) {
            queryString = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new ObjectQuery(includeAgentNameText, includeCategory, includeCollectionId, includeInstitutionId, includeSubjectTermText, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> includeAgentNameText = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> includeCategory = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> includeSubjectTermText = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "include_agent_name_text": {
                includeAgentNameText = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            case "include_category": {
                includeCategory = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
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
            case "include_subject_term_text": {
                includeSubjectTermText = com.google.common.base.Optional.of(iprot.readString());
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
            return new ObjectQuery(includeAgentNameText, includeCategory, includeCollectionId, includeInstitutionId, includeSubjectTermText, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectQuery replaceIncludeAgentNameText(final com.google.common.base.Optional<String> includeAgentNameText) {
        return new ObjectQuery(includeAgentNameText, this.includeCategory, this.includeCollectionId, this.includeInstitutionId, this.includeSubjectTermText, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeAgentNameText(final String includeAgentNameText) {
        return replaceIncludeAgentNameText(com.google.common.base.Optional.fromNullable(includeAgentNameText));
    }

    public ObjectQuery replaceIncludeCategory(final com.google.common.base.Optional<String> includeCategory) {
        return new ObjectQuery(this.includeAgentNameText, includeCategory, this.includeCollectionId, this.includeInstitutionId, this.includeSubjectTermText, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeCategory(final String includeCategory) {
        return replaceIncludeCategory(com.google.common.base.Optional.fromNullable(includeCategory));
    }

    public ObjectQuery replaceIncludeCollectionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId) {
        return new ObjectQuery(this.includeAgentNameText, this.includeCategory, includeCollectionId, this.includeInstitutionId, this.includeSubjectTermText, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeCollectionId(final net.lab1318.costume.api.models.collection.CollectionId includeCollectionId) {
        return replaceIncludeCollectionId(com.google.common.base.Optional.fromNullable(includeCollectionId));
    }

    public ObjectQuery replaceIncludeInstitutionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId) {
        return new ObjectQuery(this.includeAgentNameText, this.includeCategory, this.includeCollectionId, includeInstitutionId, this.includeSubjectTermText, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId includeInstitutionId) {
        return replaceIncludeInstitutionId(com.google.common.base.Optional.fromNullable(includeInstitutionId));
    }

    public ObjectQuery replaceIncludeSubjectTermText(final com.google.common.base.Optional<String> includeSubjectTermText) {
        return new ObjectQuery(this.includeAgentNameText, this.includeCategory, this.includeCollectionId, this.includeInstitutionId, includeSubjectTermText, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeSubjectTermText(final String includeSubjectTermText) {
        return replaceIncludeSubjectTermText(com.google.common.base.Optional.fromNullable(includeSubjectTermText));
    }

    public ObjectQuery replaceMoreLikeObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId) {
        return new ObjectQuery(this.includeAgentNameText, this.includeCategory, this.includeCollectionId, this.includeInstitutionId, this.includeSubjectTermText, moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceMoreLikeObjectId(final net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId) {
        return replaceMoreLikeObjectId(com.google.common.base.Optional.fromNullable(moreLikeObjectId));
    }

    public ObjectQuery replaceQueryString(final com.google.common.base.Optional<String> queryString) {
        return new ObjectQuery(this.includeAgentNameText, this.includeCategory, this.includeCollectionId, this.includeInstitutionId, this.includeSubjectTermText, this.moreLikeObjectId, queryString);
    }

    public ObjectQuery replaceQueryString(final String queryString) {
        return replaceQueryString(com.google.common.base.Optional.fromNullable(queryString));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("include_agent_name_text", getIncludeAgentNameText().orNull()).add("include_category", getIncludeCategory().orNull()).add("include_collection_id", getIncludeCollectionId().orNull()).add("include_institution_id", getIncludeInstitutionId().orNull()).add("include_subject_term_text", getIncludeSubjectTermText().orNull()).add("more_like_object_id", getMoreLikeObjectId().orNull()).add("query_string", getQueryString().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 7);

        if (getIncludeAgentNameText().isPresent()) {
            oprot.writeString(getIncludeAgentNameText().get());
        } else {
            oprot.writeNull();
        }

        if (getIncludeCategory().isPresent()) {
            oprot.writeString(getIncludeCategory().get());
        } else {
            oprot.writeNull();
        }

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

        if (getIncludeSubjectTermText().isPresent()) {
            oprot.writeString(getIncludeSubjectTermText().get());
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
        if (getIncludeAgentNameText().isPresent()) {
            oprot.writeFieldBegin("include_agent_name_text", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getIncludeAgentNameText().get());
            oprot.writeFieldEnd();
        }

        if (getIncludeCategory().isPresent()) {
            oprot.writeFieldBegin("include_category", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getIncludeCategory().get());
            oprot.writeFieldEnd();
        }

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

        if (getIncludeSubjectTermText().isPresent()) {
            oprot.writeFieldBegin("include_subject_term_text", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getIncludeSubjectTermText().get());
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

    private final com.google.common.base.Optional<String> includeAgentNameText;

    private final com.google.common.base.Optional<String> includeCategory;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionId;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionId;

    private final com.google.common.base.Optional<String> includeSubjectTermText;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;

    private final com.google.common.base.Optional<String> queryString;
}
