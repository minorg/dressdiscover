package net.lab1318.costume.api.models.collection;

public class Collection implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            institutionId = null;
            title = null;
            description = com.google.common.base.Optional.absent();
            external = com.google.common.base.Optional.absent();
            hidden = com.google.common.base.Optional.absent();
            locations = com.google.common.base.Optional.absent();
            objectStoreUri = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
            workTypes = com.google.common.base.Optional.absent();
        }

        public Builder(final Collection other) {
            this.institutionId = other.getInstitutionId();
            this.title = other.getTitle();
            this.description = other.getDescription();
            this.external = other.getExternal();
            this.hidden = other.getHidden();
            this.locations = other.getLocations();
            this.objectStoreUri = other.getObjectStoreUri();
            this.url = other.getUrl();
            this.workTypes = other.getWorkTypes();
        }

        protected Collection _build(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            return new Collection(institutionId, title, description, external, hidden, locations, objectStoreUri, url, workTypes);
        }

        public Collection build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.collection.Collection: missing description"), com.google.common.base.Preconditions.checkNotNull(external, "net.lab1318.costume.api.models.collection.Collection: missing external"), com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.collection.Collection: missing hidden"), com.google.common.base.Preconditions.checkNotNull(locations, "net.lab1318.costume.api.models.collection.Collection: missing locations"), com.google.common.base.Preconditions.checkNotNull(objectStoreUri, "net.lab1318.costume.api.models.collection.Collection: missing objectStoreUri"), com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.collection.Collection: missing url"), com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.collection.Collection: missing workTypes"));
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final com.google.common.base.Optional<Boolean> getExternal() {
            return external;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> getLocations() {
            return locations;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Uri> getObjectStoreUri() {
            return objectStoreUri;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
            return workTypes;
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
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            title = iprot.readString();
            if (__list.getSize() > 2) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                external = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 4) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 5) {
                locations = com.google.common.base.Optional.of(net.lab1318.costume.api.models.location.LocationSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 6) {
                try {
                    objectStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 7) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 8) {
                workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
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
                case "external": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        external = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "locations": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        locations = com.google.common.base.Optional.of(net.lab1318.costume.api.models.location.LocationSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "object_store_uri": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        try {
                            objectStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
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
                case "work_types": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = com.google.common.base.Preconditions.checkNotNull(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            this.description = com.google.common.base.Optional.fromNullable(description);
            return this;
        }

        public Builder setExternal(final com.google.common.base.Optional<Boolean> external) {
            this.external = com.google.common.base.Preconditions.checkNotNull(external);
            return this;
        }

        public Builder setExternal(@javax.annotation.Nullable final Boolean external) {
            this.external = com.google.common.base.Optional.fromNullable(external);
            return this;
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = com.google.common.base.Preconditions.checkNotNull(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            this.hidden = com.google.common.base.Optional.fromNullable(hidden);
            return this;
        }

        public Builder setIfPresent(final Collection other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setInstitutionId(other.getInstitutionId());
            setTitle(other.getTitle());
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }
            if (other.getExternal().isPresent()) {
                setExternal(other.getExternal());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getLocations().isPresent()) {
                setLocations(other.getLocations());
            }
            if (other.getObjectStoreUri().isPresent()) {
                setObjectStoreUri(other.getObjectStoreUri());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }
            if (other.getWorkTypes().isPresent()) {
                setWorkTypes(other.getWorkTypes());
            }

            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setLocations(final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations) {
            this.locations = com.google.common.base.Preconditions.checkNotNull(locations);
            return this;
        }

        public Builder setLocations(@javax.annotation.Nullable final net.lab1318.costume.api.models.location.LocationSet locations) {
            this.locations = com.google.common.base.Optional.fromNullable(locations);
            return this;
        }

        public Builder setObjectStoreUri(final com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri) {
            this.objectStoreUri = com.google.common.base.Preconditions.checkNotNull(objectStoreUri);
            return this;
        }

        public Builder setObjectStoreUri(@javax.annotation.Nullable final org.thryft.native_.Uri objectStoreUri) {
            this.objectStoreUri = com.google.common.base.Optional.fromNullable(objectStoreUri);
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

        public Builder setWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes);
            return this;
        }

        public Builder setWorkTypes(@javax.annotation.Nullable final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
            this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "title": setTitle((String)value); return this;
            case "description": setDescription((String)value); return this;
            case "external": setExternal((Boolean)value); return this;
            case "hidden": setHidden((Boolean)value); return this;
            case "locations": setLocations((net.lab1318.costume.api.models.location.LocationSet)value); return this;
            case "object_store_uri": setObjectStoreUri((org.thryft.native_.Uri)value); return this;
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            case "work_types": setWorkTypes((net.lab1318.costume.api.models.work_type.WorkTypeSet)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExternal() {
            this.external = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetLocations() {
            this.locations = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetObjectStoreUri() {
            this.objectStoreUri = com.google.common.base.Optional.absent();
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

        public Builder unsetWorkTypes() {
            this.workTypes = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "institution_id": return unsetInstitutionId();
            case "title": return unsetTitle();
            case "description": return unsetDescription();
            case "external": return unsetExternal();
            case "hidden": return unsetHidden();
            case "locations": return unsetLocations();
            case "object_store_uri": return unsetObjectStoreUri();
            case "url": return unsetUrl();
            case "work_types": return unsetWorkTypes();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private String title;
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<Boolean> external;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations;
        private com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 1, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 5, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.location.LocationSet>() {}, false, 8, "locations", org.thryft.protocol.Type.STRUCT),
        OBJECT_STORE_URI("objectStoreUri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 10, "object_store_uri", org.thryft.protocol.Type.STRING),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 9, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.work_type.WorkTypeSet>() {}, false, 6, "work_types", org.thryft.protocol.Type.STRUCT);

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
            case "institutionId": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "objectStoreUri": return OBJECT_STORE_URI;
            case "url": return URL;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "object_store_uri": return OBJECT_STORE_URI;
            case "url": return URL;
            case "work_types": return WORK_TYPES;
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
    public Collection(final Collection other) {
        this(other.getInstitutionId(), other.getTitle(), other.getDescription(), other.getExternal(), other.getHidden(), other.getLocations(), other.getObjectStoreUri(), other.getUrl(), other.getWorkTypes());
    }

    /**
     * Required constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = com.google.common.base.Optional.absent();
        this.external = com.google.common.base.Optional.absent();
        this.hidden = com.google.common.base.Optional.absent();
        this.locations = com.google.common.base.Optional.absent();
        this.objectStoreUri = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
        this.workTypes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable Boolean external, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable net.lab1318.costume.api.models.location.LocationSet locations, final @javax.annotation.Nullable org.thryft.native_.Uri objectStoreUri, final @javax.annotation.Nullable org.thryft.native_.Url url, final @javax.annotation.Nullable net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(description), "net.lab1318.costume.api.models.collection.Collection: description is empty");
        this.external = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(external), "net.lab1318.costume.api.models.collection.Collection: external must be true");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(hidden), "net.lab1318.costume.api.models.collection.Collection: hidden must be true");
        this.locations = com.google.common.base.Optional.fromNullable(locations);
        this.objectStoreUri = com.google.common.base.Optional.fromNullable(objectStoreUri);
        this.url = com.google.common.base.Optional.fromNullable(url);
        this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
    }

    /**
     * Optional constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.collection.Collection: missing description"), "net.lab1318.costume.api.models.collection.Collection: description is empty");
        this.external = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(external, "net.lab1318.costume.api.models.collection.Collection: missing external"), "net.lab1318.costume.api.models.collection.Collection: external must be true");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.collection.Collection: missing hidden"), "net.lab1318.costume.api.models.collection.Collection: hidden must be true");
        this.locations = com.google.common.base.Preconditions.checkNotNull(locations, "net.lab1318.costume.api.models.collection.Collection: missing locations");
        this.objectStoreUri = com.google.common.base.Preconditions.checkNotNull(objectStoreUri, "net.lab1318.costume.api.models.collection.Collection: missing objectStoreUri");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.collection.Collection: missing url");
        this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.collection.Collection: missing workTypes");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Collection other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Collection> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Collection)) {
            return false;
        }

        final Collection other = (Collection)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            ((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())) &&
            ((getExternal().isPresent() && other.getExternal().isPresent()) ? (getExternal().get() == other.getExternal().get()) : (!getExternal().isPresent() && !other.getExternal().isPresent())) &&
            ((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get() == other.getHidden().get()) : (!getHidden().isPresent() && !other.getHidden().isPresent())) &&
            ((getLocations().isPresent() && other.getLocations().isPresent()) ? (getLocations().get().equals(other.getLocations().get())) : (!getLocations().isPresent() && !other.getLocations().isPresent())) &&
            ((getObjectStoreUri().isPresent() && other.getObjectStoreUri().isPresent()) ? (getObjectStoreUri().get().equals(other.getObjectStoreUri().get())) : (!getObjectStoreUri().isPresent() && !other.getObjectStoreUri().isPresent())) &&
            ((getUrl().isPresent() && other.getUrl().isPresent()) ? (getUrl().get().equals(other.getUrl().get())) : (!getUrl().isPresent() && !other.getUrl().isPresent())) &&
            ((getWorkTypes().isPresent() && other.getWorkTypes().isPresent()) ? (getWorkTypes().get().equals(other.getWorkTypes().get())) : (!getWorkTypes().isPresent() && !other.getWorkTypes().isPresent()));
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
        case INSTITUTION_ID: return getInstitutionId();
        case TITLE: return getTitle();
        case DESCRIPTION: return getDescription();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case OBJECT_STORE_URI: return getObjectStoreUri();
        case URL: return getUrl();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final com.google.common.base.Optional<Boolean> getExternal() {
        return external;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> getLocations() {
        return locations;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Uri> getObjectStoreUri() {
        return objectStoreUri;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
        return url;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getExternal().isPresent()) {
            hashCode = 31 * hashCode + (getExternal().get() ? 1 : 0);
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getLocations().isPresent()) {
            hashCode = 31 * hashCode + getLocations().get().hashCode();
        }
        if (getObjectStoreUri().isPresent()) {
            hashCode = 31 * hashCode + getObjectStoreUri().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        if (getWorkTypes().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypes().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Collection readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        title = iprot.readString();
        if (__list.getSize() > 2) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            external = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 4) {
            hidden = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 5) {
            locations = com.google.common.base.Optional.of(net.lab1318.costume.api.models.location.LocationSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 6) {
            try {
                objectStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 7) {
            try {
                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 8) {
            workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Collection(institutionId, title, description, external, hidden, locations, objectStoreUri, url, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 2) {
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
            case "external": {
                if (!ifield.hasId() || ifield.getId() == 7) {
                    external = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "hidden": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "locations": {
                if (!ifield.hasId() || ifield.getId() == 8) {
                    locations = com.google.common.base.Optional.of(net.lab1318.costume.api.models.location.LocationSet.readAsStruct(iprot));
                }
                break;
            }
            case "object_store_uri": {
                if (!ifield.hasId() || ifield.getId() == 10) {
                    try {
                        objectStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
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
            case "work_types": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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
            return new Collection(institutionId, title, description, external, hidden, locations, objectStoreUri, url, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Collection replaceDescription(final com.google.common.base.Optional<String> description) {
        return new Collection(this.institutionId, this.title, description, this.external, this.hidden, this.locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public Collection replaceExternal(final com.google.common.base.Optional<Boolean> external) {
        return new Collection(this.institutionId, this.title, this.description, external, this.hidden, this.locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceExternal(final boolean external) {
        return replaceExternal(com.google.common.base.Optional.fromNullable(external));
    }

    public Collection replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Collection(this.institutionId, this.title, this.description, this.external, hidden, this.locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Collection replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Collection(institutionId, this.title, this.description, this.external, this.hidden, this.locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceLocations(final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations) {
        return new Collection(this.institutionId, this.title, this.description, this.external, this.hidden, locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceLocations(final net.lab1318.costume.api.models.location.LocationSet locations) {
        return replaceLocations(com.google.common.base.Optional.fromNullable(locations));
    }

    public Collection replaceObjectStoreUri(final com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri) {
        return new Collection(this.institutionId, this.title, this.description, this.external, this.hidden, this.locations, objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceObjectStoreUri(final org.thryft.native_.Uri objectStoreUri) {
        return replaceObjectStoreUri(com.google.common.base.Optional.fromNullable(objectStoreUri));
    }

    public Collection replaceTitle(final String title) {
        return new Collection(this.institutionId, title, this.description, this.external, this.hidden, this.locations, this.objectStoreUri, this.url, this.workTypes);
    }

    public Collection replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Collection(this.institutionId, this.title, this.description, this.external, this.hidden, this.locations, this.objectStoreUri, url, this.workTypes);
    }

    public Collection replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public Collection replaceWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        return new Collection(this.institutionId, this.title, this.description, this.external, this.hidden, this.locations, this.objectStoreUri, this.url, workTypes);
    }

    public Collection replaceWorkTypes(final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        return replaceWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("title", getTitle()).add("description", getDescription().orNull()).add("external", getExternal().orNull()).add("hidden", getHidden().orNull()).add("locations", getLocations().orNull()).add("object_store_uri", getObjectStoreUri().orNull()).add("url", getUrl().orNull()).add("work_types", getWorkTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 9);

        oprot.writeString(getInstitutionId().toString());

        oprot.writeString(getTitle());

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        if (getExternal().isPresent()) {
            oprot.writeBool(getExternal().get());
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getLocations().isPresent()) {
            getLocations().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getObjectStoreUri().isPresent()) {
            oprot.writeString(getObjectStoreUri().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getUrl().isPresent()) {
            oprot.writeString(getUrl().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getWorkTypes().isPresent()) {
            getWorkTypes().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.collection.Collection");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        if (getExternal().isPresent()) {
            oprot.writeFieldBegin("external", org.thryft.protocol.Type.BOOL, (short)7);
            oprot.writeBool(getExternal().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)5);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getLocations().isPresent()) {
            oprot.writeFieldBegin("locations", org.thryft.protocol.Type.STRUCT, (short)8);
            getLocations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getObjectStoreUri().isPresent()) {
            oprot.writeFieldBegin("object_store_uri", org.thryft.protocol.Type.STRING, (short)10);
            oprot.writeString(getObjectStoreUri().get().toString());
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)9);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        if (getWorkTypes().isPresent()) {
            oprot.writeFieldBegin("work_types", org.thryft.protocol.Type.STRUCT, (short)6);
            getWorkTypes().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final String title;

    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<Boolean> external;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.location.LocationSet> locations;

    private final com.google.common.base.Optional<org.thryft.native_.Uri> objectStoreUri;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
}
