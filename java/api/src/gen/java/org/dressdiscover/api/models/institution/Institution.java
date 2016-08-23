package org.dressdiscover.api.models.institution;

public class Institution implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            title = null;
            collectionStoreUri = com.google.common.base.Optional.absent();
            dataRights = com.google.common.base.Optional.absent();
            external = com.google.common.base.Optional.absent();
            hidden = com.google.common.base.Optional.absent();
            locations = com.google.common.base.Optional.absent();
            storeParameters = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
        }

        public Builder(final Institution other) {
            this.title = other.getTitle();
            this.collectionStoreUri = other.getCollectionStoreUri();
            this.dataRights = other.getDataRights();
            this.external = other.getExternal();
            this.hidden = other.getHidden();
            this.locations = other.getLocations();
            this.storeParameters = other.getStoreParameters();
            this.url = other.getUrl();
        }

        protected Institution _build(final String title, final com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri, final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return new Institution(title, collectionStoreUri, dataRights, external, hidden, locations, storeParameters, url);
        }

        public Institution build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.institution.Institution: missing title"), com.google.common.base.Preconditions.checkNotNull(collectionStoreUri, "org.dressdiscover.api.models.institution.Institution: missing collectionStoreUri"), com.google.common.base.Preconditions.checkNotNull(dataRights, "org.dressdiscover.api.models.institution.Institution: missing dataRights"), com.google.common.base.Preconditions.checkNotNull(external, "org.dressdiscover.api.models.institution.Institution: missing external"), com.google.common.base.Preconditions.checkNotNull(hidden, "org.dressdiscover.api.models.institution.Institution: missing hidden"), com.google.common.base.Preconditions.checkNotNull(locations, "org.dressdiscover.api.models.institution.Institution: missing locations"), com.google.common.base.Preconditions.checkNotNull(storeParameters, "org.dressdiscover.api.models.institution.Institution: missing storeParameters"), com.google.common.base.Preconditions.checkNotNull(url, "org.dressdiscover.api.models.institution.Institution: missing url"));
        }

        public final com.google.common.base.Optional<org.thryft.native_.Uri> getCollectionStoreUri() {
            return collectionStoreUri;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> getDataRights() {
            return dataRights;
        }

        public final com.google.common.base.Optional<Boolean> getExternal() {
            return external;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> getLocations() {
            return locations;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStoreParameters() {
            return storeParameters;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
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
            title = iprot.readString();
            if (__list.getSize() > 1) {
                try {
                    collectionStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 2) {
                dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                external = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 4) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 5) {
                locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 6) {
                try {
                    storeParameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final String value;
                                    value = iprot.readString();
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 7) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
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
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "collection_store_uri": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            collectionStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "data_rights": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
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
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "locations": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "store_parameters": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        try {
                            storeParameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final String value;
                                            value = iprot.readString();
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        return com.google.common.collect.ImmutableMap.of();
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                        }
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TITLE: setTitle((String)value); return this;
            case COLLECTION_STORE_URI: setCollectionStoreUri((org.thryft.native_.Uri)value); return this;
            case DATA_RIGHTS: setDataRights((org.dressdiscover.api.models.rights.RightsSet)value); return this;
            case EXTERNAL: setExternal((Boolean)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case LOCATIONS: setLocations((org.dressdiscover.api.models.location.LocationSet)value); return this;
            case STORE_PARAMETERS: setStoreParameters((com.google.common.collect.ImmutableMap<String, String>)value); return this;
            case URL: setUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCollectionStoreUri(final com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri) {
            this.collectionStoreUri = com.google.common.base.Preconditions.checkNotNull(collectionStoreUri);
            return this;
        }

        public Builder setCollectionStoreUri(@javax.annotation.Nullable final org.thryft.native_.Uri collectionStoreUri) {
            this.collectionStoreUri = com.google.common.base.Optional.fromNullable(collectionStoreUri);
            return this;
        }

        public Builder setDataRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights) {
            this.dataRights = com.google.common.base.Preconditions.checkNotNull(dataRights);
            return this;
        }

        public Builder setDataRights(@javax.annotation.Nullable final org.dressdiscover.api.models.rights.RightsSet dataRights) {
            this.dataRights = com.google.common.base.Optional.fromNullable(dataRights);
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

        public Builder setIfPresent(final Institution other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTitle(other.getTitle());
            if (other.getCollectionStoreUri().isPresent()) {
                setCollectionStoreUri(other.getCollectionStoreUri());
            }
            if (other.getDataRights().isPresent()) {
                setDataRights(other.getDataRights());
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
            if (other.getStoreParameters().isPresent()) {
                setStoreParameters(other.getStoreParameters());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }

            return this;
        }

        public Builder setLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
            this.locations = com.google.common.base.Preconditions.checkNotNull(locations);
            return this;
        }

        public Builder setLocations(@javax.annotation.Nullable final org.dressdiscover.api.models.location.LocationSet locations) {
            this.locations = com.google.common.base.Optional.fromNullable(locations);
            return this;
        }

        public Builder setStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
            this.storeParameters = com.google.common.base.Preconditions.checkNotNull(storeParameters);
            return this;
        }

        public Builder setStoreParameters(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> storeParameters) {
            this.storeParameters = com.google.common.base.Optional.fromNullable(storeParameters);
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
            case TITLE: return unsetTitle();
            case COLLECTION_STORE_URI: return unsetCollectionStoreUri();
            case DATA_RIGHTS: return unsetDataRights();
            case EXTERNAL: return unsetExternal();
            case HIDDEN: return unsetHidden();
            case LOCATIONS: return unsetLocations();
            case STORE_PARAMETERS: return unsetStoreParameters();
            case URL: return unsetUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCollectionStoreUri() {
            this.collectionStoreUri = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDataRights() {
            this.dataRights = com.google.common.base.Optional.absent();
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

        public Builder unsetLocations() {
            this.locations = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetStoreParameters() {
            this.storeParameters = com.google.common.base.Optional.absent();
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

        private String title;
        private com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri;
        private com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights;
        private com.google.common.base.Optional<Boolean> external;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        COLLECTION_STORE_URI("collectionStoreUri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 9, "collection_store_uri", org.thryft.protocol.Type.STRING),
        DATA_RIGHTS("dataRights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.rights.RightsSet>() {}, false, 5, "data_rights", org.thryft.protocol.Type.STRUCT),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 6, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.location.LocationSet>() {}, false, 8, "locations", org.thryft.protocol.Type.STRUCT),
        STORE_PARAMETERS("storeParameters", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, 10, "store_parameters", org.thryft.protocol.Type.MAP),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 3, "url", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            case "collectionStoreUri": return COLLECTION_STORE_URI;
            case "dataRights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "storeParameters": return STORE_PARAMETERS;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
            case "collection_store_uri": return COLLECTION_STORE_URI;
            case "data_rights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "store_parameters": return STORE_PARAMETERS;
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
    public Institution(final Institution other) {
        this(other.getTitle(), other.getCollectionStoreUri(), other.getDataRights(), other.getExternal(), other.getHidden(), other.getLocations(), other.getStoreParameters(), other.getUrl());
    }

    /**
     * Required constructor
     */
    public Institution(final String title) {
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.institution.Institution: missing title");
        this.collectionStoreUri = com.google.common.base.Optional.absent();
        this.dataRights = com.google.common.base.Optional.absent();
        this.external = com.google.common.base.Optional.absent();
        this.hidden = com.google.common.base.Optional.absent();
        this.locations = com.google.common.base.Optional.absent();
        this.storeParameters = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Institution(final String title, final @javax.annotation.Nullable org.thryft.native_.Uri collectionStoreUri, final @javax.annotation.Nullable org.dressdiscover.api.models.rights.RightsSet dataRights, final @javax.annotation.Nullable Boolean external, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable org.dressdiscover.api.models.location.LocationSet locations, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> storeParameters, final @javax.annotation.Nullable org.thryft.native_.Url url) {
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.institution.Institution: missing title");
        this.collectionStoreUri = com.google.common.base.Optional.fromNullable(collectionStoreUri);
        this.dataRights = com.google.common.base.Optional.fromNullable(dataRights);
        this.external = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(external), "org.dressdiscover.api.models.institution.Institution: external must be true");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(hidden), "org.dressdiscover.api.models.institution.Institution: hidden must be true");
        this.locations = com.google.common.base.Optional.fromNullable(locations);
        this.storeParameters = org.thryft.Preconditions.checkOptionalMapNotEmpty(com.google.common.base.Optional.fromNullable(storeParameters), "org.dressdiscover.api.models.institution.Institution: storeParameters is empty");
        this.url = com.google.common.base.Optional.fromNullable(url);
    }

    /**
     * Optional constructor
     */
    public Institution(final String title, final com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri, final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.institution.Institution: missing title");
        this.collectionStoreUri = com.google.common.base.Preconditions.checkNotNull(collectionStoreUri, "org.dressdiscover.api.models.institution.Institution: missing collectionStoreUri");
        this.dataRights = com.google.common.base.Preconditions.checkNotNull(dataRights, "org.dressdiscover.api.models.institution.Institution: missing dataRights");
        this.external = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(external, "org.dressdiscover.api.models.institution.Institution: missing external"), "org.dressdiscover.api.models.institution.Institution: external must be true");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(hidden, "org.dressdiscover.api.models.institution.Institution: missing hidden"), "org.dressdiscover.api.models.institution.Institution: hidden must be true");
        this.locations = com.google.common.base.Preconditions.checkNotNull(locations, "org.dressdiscover.api.models.institution.Institution: missing locations");
        this.storeParameters = org.thryft.Preconditions.checkOptionalMapNotEmpty(com.google.common.base.Preconditions.checkNotNull(storeParameters, "org.dressdiscover.api.models.institution.Institution: missing storeParameters"), "org.dressdiscover.api.models.institution.Institution: storeParameters is empty");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "org.dressdiscover.api.models.institution.Institution: missing url");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Institution other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Institution> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Institution)) {
            return false;
        }

        final Institution other = (Institution)otherObject;
        return
            getTitle().equals(other.getTitle()) &&
            ((getCollectionStoreUri().isPresent() && other.getCollectionStoreUri().isPresent()) ? (getCollectionStoreUri().get().equals(other.getCollectionStoreUri().get())) : (!getCollectionStoreUri().isPresent() && !other.getCollectionStoreUri().isPresent())) &&
            ((getDataRights().isPresent() && other.getDataRights().isPresent()) ? (getDataRights().get().equals(other.getDataRights().get())) : (!getDataRights().isPresent() && !other.getDataRights().isPresent())) &&
            ((getExternal().isPresent() && other.getExternal().isPresent()) ? (getExternal().get() == other.getExternal().get()) : (!getExternal().isPresent() && !other.getExternal().isPresent())) &&
            ((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get() == other.getHidden().get()) : (!getHidden().isPresent() && !other.getHidden().isPresent())) &&
            ((getLocations().isPresent() && other.getLocations().isPresent()) ? (getLocations().get().equals(other.getLocations().get())) : (!getLocations().isPresent() && !other.getLocations().isPresent())) &&
            ((getStoreParameters().isPresent() && other.getStoreParameters().isPresent()) ? (getStoreParameters().get().equals(other.getStoreParameters().get())) : (!getStoreParameters().isPresent() && !other.getStoreParameters().isPresent())) &&
            ((getUrl().isPresent() && other.getUrl().isPresent()) ? (getUrl().get().equals(other.getUrl().get())) : (!getUrl().isPresent() && !other.getUrl().isPresent()));
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
        case TITLE: return getTitle();
        case COLLECTION_STORE_URI: return getCollectionStoreUri();
        case DATA_RIGHTS: return getDataRights();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case STORE_PARAMETERS: return getStoreParameters();
        case URL: return getUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.thryft.native_.Uri> getCollectionStoreUri() {
        return collectionStoreUri;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> getDataRights() {
        return dataRights;
    }

    public final com.google.common.base.Optional<Boolean> getExternal() {
        return external;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> getLocations() {
        return locations;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStoreParameters() {
        return storeParameters;
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
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getCollectionStoreUri().isPresent()) {
            hashCode = 31 * hashCode + getCollectionStoreUri().get().hashCode();
        }
        if (getDataRights().isPresent()) {
            hashCode = 31 * hashCode + getDataRights().get().hashCode();
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
        if (getStoreParameters().isPresent()) {
            hashCode = 31 * hashCode + getStoreParameters().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        return hashCode;
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Institution readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        title = iprot.readString();
        if (__list.getSize() > 1) {
            try {
                collectionStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 2) {
            dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            external = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 4) {
            hidden = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 5) {
            locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 6) {
            try {
                storeParameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final String value;
                                value = iprot.readString();
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 7) {
            try {
                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new Institution(title, collectionStoreUri, dataRights, external, hidden, locations, storeParameters, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    title = iprot.readString();
                }
                break;
            }
            case "collection_store_uri": {
                if (!ifield.hasId() || ifield.getId() == 9) {
                    try {
                        collectionStoreUri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "data_rights": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
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
                if (!ifield.hasId() || ifield.getId() == 6) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "locations": {
                if (!ifield.hasId() || ifield.getId() == 8) {
                    locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
                }
                break;
            }
            case "store_parameters": {
                if (!ifield.hasId() || ifield.getId() == 10) {
                    try {
                        storeParameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final String value;
                                        value = iprot.readString();
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    return com.google.common.collect.ImmutableMap.of();
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                }
                break;
            }
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
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
            return new Institution(title, collectionStoreUri, dataRights, external, hidden, locations, storeParameters, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Institution replaceCollectionStoreUri(final com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri) {
        return new Institution(this.title, collectionStoreUri, this.dataRights, this.external, this.hidden, this.locations, this.storeParameters, this.url);
    }

    public Institution replaceCollectionStoreUri(final org.thryft.native_.Uri collectionStoreUri) {
        return replaceCollectionStoreUri(com.google.common.base.Optional.fromNullable(collectionStoreUri));
    }

    public Institution replaceDataRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights) {
        return new Institution(this.title, this.collectionStoreUri, dataRights, this.external, this.hidden, this.locations, this.storeParameters, this.url);
    }

    public Institution replaceDataRights(final org.dressdiscover.api.models.rights.RightsSet dataRights) {
        return replaceDataRights(com.google.common.base.Optional.fromNullable(dataRights));
    }

    public Institution replaceExternal(final com.google.common.base.Optional<Boolean> external) {
        return new Institution(this.title, this.collectionStoreUri, this.dataRights, external, this.hidden, this.locations, this.storeParameters, this.url);
    }

    public Institution replaceExternal(final boolean external) {
        return replaceExternal(com.google.common.base.Optional.fromNullable(external));
    }

    public Institution replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Institution(this.title, this.collectionStoreUri, this.dataRights, this.external, hidden, this.locations, this.storeParameters, this.url);
    }

    public Institution replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Institution replaceLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
        return new Institution(this.title, this.collectionStoreUri, this.dataRights, this.external, this.hidden, locations, this.storeParameters, this.url);
    }

    public Institution replaceLocations(final org.dressdiscover.api.models.location.LocationSet locations) {
        return replaceLocations(com.google.common.base.Optional.fromNullable(locations));
    }

    public Institution replaceStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
        return new Institution(this.title, this.collectionStoreUri, this.dataRights, this.external, this.hidden, this.locations, storeParameters, this.url);
    }

    public Institution replaceStoreParameters(final com.google.common.collect.ImmutableMap<String, String> storeParameters) {
        return replaceStoreParameters(com.google.common.base.Optional.fromNullable(storeParameters));
    }

    public Institution replaceTitle(final String title) {
        return new Institution(title, this.collectionStoreUri, this.dataRights, this.external, this.hidden, this.locations, this.storeParameters, this.url);
    }

    public Institution replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Institution(this.title, this.collectionStoreUri, this.dataRights, this.external, this.hidden, this.locations, this.storeParameters, url);
    }

    public Institution replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("collection_store_uri", getCollectionStoreUri().orNull()).add("data_rights", getDataRights().orNull()).add("external", getExternal().orNull()).add("hidden", getHidden().orNull()).add("locations", getLocations().orNull()).add("store_parameters", getStoreParameters().orNull()).add("url", getUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

        oprot.writeString(getTitle());

        if (getCollectionStoreUri().isPresent()) {
            oprot.writeString(getCollectionStoreUri().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getDataRights().isPresent()) {
            getDataRights().get().writeAsStruct(oprot);
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

        if (getStoreParameters().isPresent()) {
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStoreParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStoreParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
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
        oprot.writeStructBegin("org.dressdiscover.api.models.institution.Institution");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getCollectionStoreUri().isPresent()) {
            oprot.writeFieldBegin("collection_store_uri", org.thryft.protocol.Type.STRING, (short)9);
            oprot.writeString(getCollectionStoreUri().get().toString());
            oprot.writeFieldEnd();
        }

        if (getDataRights().isPresent()) {
            oprot.writeFieldBegin("data_rights", org.thryft.protocol.Type.STRUCT, (short)5);
            getDataRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getExternal().isPresent()) {
            oprot.writeFieldBegin("external", org.thryft.protocol.Type.BOOL, (short)7);
            oprot.writeBool(getExternal().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)6);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getLocations().isPresent()) {
            oprot.writeFieldBegin("locations", org.thryft.protocol.Type.STRUCT, (short)8);
            getLocations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getStoreParameters().isPresent()) {
            oprot.writeFieldBegin("store_parameters", org.thryft.protocol.Type.MAP, (short)10);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStoreParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStoreParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String title;

    private final com.google.common.base.Optional<org.thryft.native_.Uri> collectionStoreUri;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> dataRights;

    private final com.google.common.base.Optional<Boolean> external;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;
}
