package net.lab1318.costume.api.models.object;

public class Object implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            title = null;
            description = com.google.common.base.Optional.absent();
            provenance = com.google.common.base.Optional.absent();
            sourceId = com.google.common.base.Optional.absent();
            summary = com.google.common.base.Optional.absent();
            thumbnail = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
        }

        public Builder(final Object other) {
            this.collectionId = other.getCollectionId();
            this.institutionId = other.getInstitutionId();
            this.title = other.getTitle();
            this.description = other.getDescription();
            this.provenance = other.getProvenance();
            this.sourceId = other.getSourceId();
            this.summary = other.getSummary();
            this.thumbnail = other.getThumbnail();
            this.url = other.getUrl();
        }

        protected Object _build(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<String> sourceId, final com.google.common.base.Optional<String> summary, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return new Object(collectionId, institutionId, title, description, provenance, sourceId, summary, thumbnail, url);
        }

        public Object build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.Object: missing description"), com.google.common.base.Preconditions.checkNotNull(provenance, "net.lab1318.costume.api.models.object.Object: missing provenance"), com.google.common.base.Preconditions.checkNotNull(sourceId, "net.lab1318.costume.api.models.object.Object: missing sourceId"), com.google.common.base.Preconditions.checkNotNull(summary, "net.lab1318.costume.api.models.object.Object: missing summary"), com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.object.Object: missing thumbnail"), com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.object.Object: missing url"));
        }

        public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<String> getProvenance() {
            return provenance;
        }

        public final com.google.common.base.Optional<String> getSourceId() {
            return sourceId;
        }

        public final com.google.common.base.Optional<String> getSummary() {
            return summary;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> getThumbnail() {
            return thumbnail;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
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
            try {
                collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                 throw new IllegalArgumentException(e);
            }
            try {
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new IllegalArgumentException(e);
            }
            title = iprot.readString();
            if (__list.getSize() > 3) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 4) {
                provenance = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 5) {
                sourceId = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 6) {
                summary = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 7) {
                thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
            }
            if (__list.getSize() > 8) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
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
                case "collection_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "provenance": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        provenance = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "source_id": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        sourceId = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "summary": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        summary = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
            this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
            return this;
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = com.google.common.base.Preconditions.checkNotNull(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            this.description = com.google.common.base.Optional.fromNullable(description);
            return this;
        }

        public Builder setIfPresent(final Object other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionId(other.getCollectionId());
            setInstitutionId(other.getInstitutionId());
            setTitle(other.getTitle());
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }
            if (other.getProvenance().isPresent()) {
                setProvenance(other.getProvenance());
            }
            if (other.getSourceId().isPresent()) {
                setSourceId(other.getSourceId());
            }
            if (other.getSummary().isPresent()) {
                setSummary(other.getSummary());
            }
            if (other.getThumbnail().isPresent()) {
                setThumbnail(other.getThumbnail());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }

            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setProvenance(final com.google.common.base.Optional<String> provenance) {
            this.provenance = com.google.common.base.Preconditions.checkNotNull(provenance);
            return this;
        }

        public Builder setProvenance(@javax.annotation.Nullable final String provenance) {
            this.provenance = com.google.common.base.Optional.fromNullable(provenance);
            return this;
        }

        public Builder setSourceId(final com.google.common.base.Optional<String> sourceId) {
            this.sourceId = com.google.common.base.Preconditions.checkNotNull(sourceId);
            return this;
        }

        public Builder setSourceId(@javax.annotation.Nullable final String sourceId) {
            this.sourceId = com.google.common.base.Optional.fromNullable(sourceId);
            return this;
        }

        public Builder setSummary(final com.google.common.base.Optional<String> summary) {
            this.summary = com.google.common.base.Preconditions.checkNotNull(summary);
            return this;
        }

        public Builder setSummary(@javax.annotation.Nullable final String summary) {
            this.summary = com.google.common.base.Optional.fromNullable(summary);
            return this;
        }

        public Builder setThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail) {
            this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail);
            return this;
        }

        public Builder setThumbnail(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.Image thumbnail) {
            this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            this.url = com.google.common.base.Preconditions.checkNotNull(url);
            return this;
        }

        public Builder setUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
            this.url = com.google.common.base.Optional.fromNullable(url);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "title": setTitle((String)value); return this;
            case "description": setDescription((String)value); return this;
            case "provenance": setProvenance((String)value); return this;
            case "source_id": setSourceId((String)value); return this;
            case "summary": setSummary((String)value); return this;
            case "thumbnail": setThumbnail((net.lab1318.costume.api.models.image.Image)value); return this;
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetCollectionId() {
            this.collectionId = null;
            return this;
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetProvenance() {
            this.provenance = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSourceId() {
            this.sourceId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSummary() {
            this.summary = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetThumbnail() {
            this.thumbnail = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetUrl() {
            this.url = com.google.common.base.Optional.absent();
            return this;
        }

        private net.lab1318.costume.api.models.collection.CollectionId collectionId;
        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private String title;
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<String> provenance;
        private com.google.common.base.Optional<String> sourceId;
        private com.google.common.base.Optional<String> summary;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 3, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        SOURCE_ID("sourceId", new com.google.common.reflect.TypeToken<String>() {}, false, 6, "source_id", org.thryft.protocol.Type.STRING),
        SUMMARY("summary", new com.google.common.reflect.TypeToken<String>() {}, false, 7, "summary", org.thryft.protocol.Type.STRING),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.Image>() {}, false, 8, "thumbnail", org.thryft.protocol.Type.STRUCT),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 9, "url", org.thryft.protocol.Type.STRING);

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
            case "collectionId": return COLLECTION_ID;
            case "institutionId": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "provenance": return PROVENANCE;
            case "sourceId": return SOURCE_ID;
            case "summary": return SUMMARY;
            case "thumbnail": return THUMBNAIL;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "provenance": return PROVENANCE;
            case "source_id": return SOURCE_ID;
            case "summary": return SUMMARY;
            case "thumbnail": return THUMBNAIL;
            case "url": return URL;
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
    public Object(final Object other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getTitle(), other.getDescription(), other.getProvenance(), other.getSourceId(), other.getSummary(), other.getThumbnail(), other.getUrl());
    }

    /**
     * Required constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.description = com.google.common.base.Optional.absent();
        this.provenance = com.google.common.base.Optional.absent();
        this.sourceId = com.google.common.base.Optional.absent();
        this.summary = com.google.common.base.Optional.absent();
        this.thumbnail = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable String provenance, final @javax.annotation.Nullable String sourceId, final @javax.annotation.Nullable String summary, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.Image thumbnail, final @javax.annotation.Nullable org.thryft.native_.Url url) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.description = com.google.common.base.Optional.fromNullable(description);
        this.provenance = com.google.common.base.Optional.fromNullable(provenance);
        this.sourceId = com.google.common.base.Optional.fromNullable(sourceId);
        this.summary = com.google.common.base.Optional.fromNullable(summary);
        this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
        this.url = com.google.common.base.Optional.fromNullable(url);
    }

    /**
     * Optional constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<String> sourceId, final com.google.common.base.Optional<String> summary, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.description = com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.Object: missing description");
        this.provenance = com.google.common.base.Preconditions.checkNotNull(provenance, "net.lab1318.costume.api.models.object.Object: missing provenance");
        this.sourceId = com.google.common.base.Preconditions.checkNotNull(sourceId, "net.lab1318.costume.api.models.object.Object: missing sourceId");
        this.summary = com.google.common.base.Preconditions.checkNotNull(summary, "net.lab1318.costume.api.models.object.Object: missing summary");
        this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.object.Object: missing thumbnail");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.object.Object: missing url");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Object other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Object> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Object)) {
            return false;
        }

        final Object other = (Object)otherObject;
        return
            getCollectionId().equals(other.getCollectionId()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            getDescription().equals(other.getDescription()) &&
            getProvenance().equals(other.getProvenance()) &&
            getSourceId().equals(other.getSourceId()) &&
            getSummary().equals(other.getSummary()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getUrl().equals(other.getUrl());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "collection_id": return getCollectionId();
        case "institution_id": return getInstitutionId();
        case "title": return getTitle();
        case "description": return getDescription();
        case "provenance": return getProvenance();
        case "source_id": return getSourceId();
        case "summary": return getSummary();
        case "thumbnail": return getThumbnail();
        case "url": return getUrl();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<String> getProvenance() {
        return provenance;
    }

    public final com.google.common.base.Optional<String> getSourceId() {
        return sourceId;
    }

    public final com.google.common.base.Optional<String> getSummary() {
        return summary;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> getThumbnail() {
        return thumbnail;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getProvenance().isPresent()) {
            hashCode = 31 * hashCode + getProvenance().get().hashCode();
        }
        if (getSourceId().isPresent()) {
            hashCode = 31 * hashCode + getSourceId().get().hashCode();
        }
        if (getSummary().isPresent()) {
            hashCode = 31 * hashCode + getSummary().get().hashCode();
        }
        if (getThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getThumbnail().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        return hashCode;
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> sourceId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> summary = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
             throw new IllegalArgumentException(e);
        }
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new IllegalArgumentException(e);
        }
        title = iprot.readString();
        if (__list.getSize() > 3) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 4) {
            provenance = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 5) {
            sourceId = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 6) {
            summary = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 7) {
            thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
        }
        if (__list.getSize() > 8) {
            try {
                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new Object(collectionId, institutionId, title, description, provenance, sourceId, summary, thumbnail, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> sourceId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> summary = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "collection_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    try {
                        collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                         throw new IllegalArgumentException(e);
                    }
                }
                break;
            }
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new IllegalArgumentException(e);
                    }
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    title = iprot.readString();
                }
                break;
            }
            case "description": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "provenance": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    provenance = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "source_id": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    sourceId = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "summary": {
                if (!ifield.hasId() || ifield.getId() == 7) {
                    summary = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "thumbnail": {
                if (!ifield.hasId() || ifield.getId() == 8) {
                    thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                }
                break;
            }
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 9) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Object(collectionId, institutionId, title, description, provenance, sourceId, summary, thumbnail, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Object replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        return new Object(collectionId, this.institutionId, this.title, this.description, this.provenance, this.sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceDescription(final com.google.common.base.Optional<String> description) {
        return new Object(this.collectionId, this.institutionId, this.title, description, this.provenance, this.sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public Object replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Object(this.collectionId, institutionId, this.title, this.description, this.provenance, this.sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceProvenance(final com.google.common.base.Optional<String> provenance) {
        return new Object(this.collectionId, this.institutionId, this.title, this.description, provenance, this.sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceProvenance(final String provenance) {
        return replaceProvenance(com.google.common.base.Optional.fromNullable(provenance));
    }

    public Object replaceSourceId(final com.google.common.base.Optional<String> sourceId) {
        return new Object(this.collectionId, this.institutionId, this.title, this.description, this.provenance, sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceSourceId(final String sourceId) {
        return replaceSourceId(com.google.common.base.Optional.fromNullable(sourceId));
    }

    public Object replaceSummary(final com.google.common.base.Optional<String> summary) {
        return new Object(this.collectionId, this.institutionId, this.title, this.description, this.provenance, this.sourceId, summary, this.thumbnail, this.url);
    }

    public Object replaceSummary(final String summary) {
        return replaceSummary(com.google.common.base.Optional.fromNullable(summary));
    }

    public Object replaceThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail) {
        return new Object(this.collectionId, this.institutionId, this.title, this.description, this.provenance, this.sourceId, this.summary, thumbnail, this.url);
    }

    public Object replaceThumbnail(final net.lab1318.costume.api.models.image.Image thumbnail) {
        return replaceThumbnail(com.google.common.base.Optional.fromNullable(thumbnail));
    }

    public Object replaceTitle(final String title) {
        return new Object(this.collectionId, this.institutionId, title, this.description, this.provenance, this.sourceId, this.summary, this.thumbnail, this.url);
    }

    public Object replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Object(this.collectionId, this.institutionId, this.title, this.description, this.provenance, this.sourceId, this.summary, this.thumbnail, url);
    }

    public Object replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("title", getTitle()).add("description", getDescription().orNull()).add("provenance", getProvenance().orNull()).add("source_id", getSourceId().orNull()).add("summary", getSummary().orNull()).add("thumbnail", getThumbnail().orNull()).add("url", getUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 9);

        oprot.writeString(getCollectionId().toString());

        oprot.writeString(getInstitutionId().toString());

        oprot.writeString(getTitle());

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        if (getProvenance().isPresent()) {
            oprot.writeString(getProvenance().get());
        } else {
            oprot.writeNull();
        }

        if (getSourceId().isPresent()) {
            oprot.writeString(getSourceId().get());
        } else {
            oprot.writeNull();
        }

        if (getSummary().isPresent()) {
            oprot.writeString(getSummary().get());
        } else {
            oprot.writeNull();
        }

        if (getThumbnail().isPresent()) {
            getThumbnail().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getUrl().isPresent()) {
            oprot.writeString(getUrl().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.Object");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getCollectionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        if (getProvenance().isPresent()) {
            oprot.writeFieldBegin("provenance", org.thryft.protocol.Type.STRING, (short)5);
            oprot.writeString(getProvenance().get());
            oprot.writeFieldEnd();
        }

        if (getSourceId().isPresent()) {
            oprot.writeFieldBegin("source_id", org.thryft.protocol.Type.STRING, (short)6);
            oprot.writeString(getSourceId().get());
            oprot.writeFieldEnd();
        }

        if (getSummary().isPresent()) {
            oprot.writeFieldBegin("summary", org.thryft.protocol.Type.STRING, (short)7);
            oprot.writeString(getSummary().get());
            oprot.writeFieldEnd();
        }

        if (getThumbnail().isPresent()) {
            oprot.writeFieldBegin("thumbnail", org.thryft.protocol.Type.STRUCT, (short)8);
            getThumbnail().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)9);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final String title;

    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<String> provenance;

    private final com.google.common.base.Optional<String> sourceId;

    private final com.google.common.base.Optional<String> summary;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.Image> thumbnail;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;
}
