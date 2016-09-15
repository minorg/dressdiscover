package org.dressdiscover.lib;

public final class DressDiscoverProperties implements org.thryft.Struct, org.thryft.waf.lib.Properties {
    public final static class Builder {
        public Builder() {
            apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            cacheCollections = true;
            cacheInstitutions = true;
            elasticSearchHost = "elasticsearch";
            elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            environment = null;
            googleApiKey = null;
            googleOauthKey = null;
            googleOauthSecret = null;
            homeDirectoryPath = null;
            objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);
        }

        public Builder(final DressDiscoverProperties other) {
            this.apiUrl = other.getApiUrl();
            this.cacheCollections = other.getCacheCollections();
            this.cacheInstitutions = other.getCacheInstitutions();
            this.elasticSearchHost = other.getElasticSearchHost();
            this.elasticSearchPort = other.getElasticSearchPort();
            this.environment = other.getEnvironment();
            this.googleApiKey = other.getGoogleApiKey();
            this.googleOauthKey = other.getGoogleOauthKey();
            this.googleOauthSecret = other.getGoogleOauthSecret();
            this.homeDirectoryPath = other.getHomeDirectoryPath();
            this.objectSummariesResultCacheSize = other.getObjectSummariesResultCacheSize();
            this.objectSummaryCacheSize = other.getObjectSummaryCacheSize();
            this.resummarizeObjectsBulkRequestSize = other.getResummarizeObjectsBulkRequestSize();
        }

        protected DressDiscoverProperties _build(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize, final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize, final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
            return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        }

        public DressDiscoverProperties build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(apiUrl, "org.dressdiscover.lib.DressDiscoverProperties: missing apiUrl"), com.google.common.base.Preconditions.checkNotNull(cacheCollections, "org.dressdiscover.lib.DressDiscoverProperties: missing cacheCollections"), com.google.common.base.Preconditions.checkNotNull(cacheInstitutions, "org.dressdiscover.lib.DressDiscoverProperties: missing cacheInstitutions"), com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchHost"), com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchPort"), com.google.common.base.Preconditions.checkNotNull(environment, "org.dressdiscover.lib.DressDiscoverProperties: missing environment"), com.google.common.base.Preconditions.checkNotNull(googleApiKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleApiKey"), com.google.common.base.Preconditions.checkNotNull(googleOauthKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthKey"), com.google.common.base.Preconditions.checkNotNull(googleOauthSecret, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthSecret"), com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "org.dressdiscover.lib.DressDiscoverProperties: missing homeDirectoryPath"), com.google.common.base.Preconditions.checkNotNull(objectSummariesResultCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummariesResultCacheSize"), com.google.common.base.Preconditions.checkNotNull(objectSummaryCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummaryCacheSize"), com.google.common.base.Preconditions.checkNotNull(resummarizeObjectsBulkRequestSize, "org.dressdiscover.lib.DressDiscoverProperties: missing resummarizeObjectsBulkRequestSize"));
        }

        public final org.thryft.native_.Url getApiUrl() {
            return apiUrl;
        }

        public final boolean getCacheCollections() {
            return cacheCollections;
        }

        public final boolean getCacheInstitutions() {
            return cacheInstitutions;
        }

        public final String getElasticSearchHost() {
            return elasticSearchHost;
        }

        public final com.google.common.primitives.UnsignedInteger getElasticSearchPort() {
            return elasticSearchPort;
        }

        /**
         * dev, staging, production, etc.
         */
        public final String getEnvironment() {
            return environment;
        }

        public final String getGoogleApiKey() {
            return googleApiKey;
        }

        public final String getGoogleOauthKey() {
            return googleOauthKey;
        }

        public final String getGoogleOauthSecret() {
            return googleOauthSecret;
        }

        public final String getHomeDirectoryPath() {
            return homeDirectoryPath;
        }

        public final com.google.common.primitives.UnsignedInteger getObjectSummariesResultCacheSize() {
            return objectSummariesResultCacheSize;
        }

        public final com.google.common.primitives.UnsignedInteger getObjectSummaryCacheSize() {
            return objectSummaryCacheSize;
        }

        public final com.google.common.primitives.UnsignedInteger getResummarizeObjectsBulkRequestSize() {
            return resummarizeObjectsBulkRequestSize;
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
            iprot.readListBegin();
            apiUrl = org.thryft.native_.Url.parse(iprot.readString());
            cacheCollections = iprot.readBool();
            cacheInstitutions = iprot.readBool();
            elasticSearchHost = iprot.readString();
            elasticSearchPort = iprot.readU32();
            environment = iprot.readString();
            googleApiKey = iprot.readString();
            googleOauthKey = iprot.readString();
            googleOauthSecret = iprot.readString();
            homeDirectoryPath = iprot.readString();
            objectSummariesResultCacheSize = iprot.readU32();
            objectSummaryCacheSize = iprot.readU32();
            resummarizeObjectsBulkRequestSize = iprot.readU32();
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
                case "api_url": {
                    apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                    break;
                }
                case "cache_collections": {
                    cacheCollections = iprot.readBool();
                    break;
                }
                case "cache_institutions": {
                    cacheInstitutions = iprot.readBool();
                    break;
                }
                case "elastic_search_host": {
                    elasticSearchHost = iprot.readString();
                    break;
                }
                case "elastic_search_port": {
                    elasticSearchPort = iprot.readU32();
                    break;
                }
                case "environment": {
                    environment = iprot.readString();
                    break;
                }
                case "google_api_key": {
                    googleApiKey = iprot.readString();
                    break;
                }
                case "google_oauth_key": {
                    googleOauthKey = iprot.readString();
                    break;
                }
                case "google_oauth_secret": {
                    googleOauthSecret = iprot.readString();
                    break;
                }
                case "home_directory_path": {
                    homeDirectoryPath = iprot.readString();
                    break;
                }
                case "object_summaries_result_cache_size": {
                    objectSummariesResultCacheSize = iprot.readU32();
                    break;
                }
                case "object_summary_cache_size": {
                    objectSummaryCacheSize = iprot.readU32();
                    break;
                }
                case "resummarize_objects_bulk_request_size": {
                    resummarizeObjectsBulkRequestSize = iprot.readU32();
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
            case API_URL: setApiUrl((org.thryft.native_.Url)value); return this;
            case CACHE_COLLECTIONS: setCacheCollections((boolean)value); return this;
            case CACHE_INSTITUTIONS: setCacheInstitutions((boolean)value); return this;
            case ELASTIC_SEARCH_HOST: setElasticSearchHost((String)value); return this;
            case ELASTIC_SEARCH_PORT: setElasticSearchPort((com.google.common.primitives.UnsignedInteger)value); return this;
            case ENVIRONMENT: setEnvironment((String)value); return this;
            case GOOGLE_API_KEY: setGoogleApiKey((String)value); return this;
            case GOOGLE_OAUTH_KEY: setGoogleOauthKey((String)value); return this;
            case GOOGLE_OAUTH_SECRET: setGoogleOauthSecret((String)value); return this;
            case HOME_DIRECTORY_PATH: setHomeDirectoryPath((String)value); return this;
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: setObjectSummariesResultCacheSize((com.google.common.primitives.UnsignedInteger)value); return this;
            case OBJECT_SUMMARY_CACHE_SIZE: setObjectSummaryCacheSize((com.google.common.primitives.UnsignedInteger)value); return this;
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: setResummarizeObjectsBulkRequestSize((com.google.common.primitives.UnsignedInteger)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setApiUrl(final org.thryft.native_.Url apiUrl) {
            this.apiUrl = com.google.common.base.Preconditions.checkNotNull(apiUrl);
            return this;
        }

        public Builder setCacheCollections(final boolean cacheCollections) {
            this.cacheCollections = com.google.common.base.Preconditions.checkNotNull(cacheCollections);
            return this;
        }

        public Builder setCacheInstitutions(final boolean cacheInstitutions) {
            this.cacheInstitutions = com.google.common.base.Preconditions.checkNotNull(cacheInstitutions);
            return this;
        }

        public Builder setElasticSearchHost(final String elasticSearchHost) {
            this.elasticSearchHost = com.google.common.base.Preconditions.checkNotNull(elasticSearchHost);
            return this;
        }

        public Builder setElasticSearchPort(final com.google.common.primitives.UnsignedInteger elasticSearchPort) {
            this.elasticSearchPort = com.google.common.base.Preconditions.checkNotNull(elasticSearchPort);
            return this;
        }

        public Builder setEnvironment(final String environment) {
            this.environment = com.google.common.base.Preconditions.checkNotNull(environment);
            return this;
        }

        public Builder setGoogleApiKey(final String googleApiKey) {
            this.googleApiKey = com.google.common.base.Preconditions.checkNotNull(googleApiKey);
            return this;
        }

        public Builder setGoogleOauthKey(final String googleOauthKey) {
            this.googleOauthKey = com.google.common.base.Preconditions.checkNotNull(googleOauthKey);
            return this;
        }

        public Builder setGoogleOauthSecret(final String googleOauthSecret) {
            this.googleOauthSecret = com.google.common.base.Preconditions.checkNotNull(googleOauthSecret);
            return this;
        }

        public Builder setHomeDirectoryPath(final String homeDirectoryPath) {
            this.homeDirectoryPath = com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath);
            return this;
        }

        public Builder setIfPresent(final DressDiscoverProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setApiUrl(other.getApiUrl());
            setCacheCollections(other.getCacheCollections());
            setCacheInstitutions(other.getCacheInstitutions());
            setElasticSearchHost(other.getElasticSearchHost());
            setElasticSearchPort(other.getElasticSearchPort());
            setEnvironment(other.getEnvironment());
            setGoogleApiKey(other.getGoogleApiKey());
            setGoogleOauthKey(other.getGoogleOauthKey());
            setGoogleOauthSecret(other.getGoogleOauthSecret());
            setHomeDirectoryPath(other.getHomeDirectoryPath());
            setObjectSummariesResultCacheSize(other.getObjectSummariesResultCacheSize());
            setObjectSummaryCacheSize(other.getObjectSummaryCacheSize());
            setResummarizeObjectsBulkRequestSize(other.getResummarizeObjectsBulkRequestSize());

            return this;
        }

        public Builder setObjectSummariesResultCacheSize(final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize) {
            this.objectSummariesResultCacheSize = com.google.common.base.Preconditions.checkNotNull(objectSummariesResultCacheSize);
            return this;
        }

        public Builder setObjectSummaryCacheSize(final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize) {
            this.objectSummaryCacheSize = com.google.common.base.Preconditions.checkNotNull(objectSummaryCacheSize);
            return this;
        }

        public Builder setResummarizeObjectsBulkRequestSize(final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
            this.resummarizeObjectsBulkRequestSize = com.google.common.base.Preconditions.checkNotNull(resummarizeObjectsBulkRequestSize);
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
            case API_URL: return unsetApiUrl();
            case CACHE_COLLECTIONS: return unsetCacheCollections();
            case CACHE_INSTITUTIONS: return unsetCacheInstitutions();
            case ELASTIC_SEARCH_HOST: return unsetElasticSearchHost();
            case ELASTIC_SEARCH_PORT: return unsetElasticSearchPort();
            case ENVIRONMENT: return unsetEnvironment();
            case GOOGLE_API_KEY: return unsetGoogleApiKey();
            case GOOGLE_OAUTH_KEY: return unsetGoogleOauthKey();
            case GOOGLE_OAUTH_SECRET: return unsetGoogleOauthSecret();
            case HOME_DIRECTORY_PATH: return unsetHomeDirectoryPath();
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: return unsetObjectSummariesResultCacheSize();
            case OBJECT_SUMMARY_CACHE_SIZE: return unsetObjectSummaryCacheSize();
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: return unsetResummarizeObjectsBulkRequestSize();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetApiUrl() {
            this.apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            return this;
        }

        public Builder unsetCacheCollections() {
            this.cacheCollections = true;
            return this;
        }

        public Builder unsetCacheInstitutions() {
            this.cacheInstitutions = true;
            return this;
        }

        public Builder unsetElasticSearchHost() {
            this.elasticSearchHost = "elasticsearch";
            return this;
        }

        public Builder unsetElasticSearchPort() {
            this.elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            return this;
        }

        public Builder unsetEnvironment() {
            this.environment = null;
            return this;
        }

        public Builder unsetGoogleApiKey() {
            this.googleApiKey = null;
            return this;
        }

        public Builder unsetGoogleOauthKey() {
            this.googleOauthKey = null;
            return this;
        }

        public Builder unsetGoogleOauthSecret() {
            this.googleOauthSecret = null;
            return this;
        }

        public Builder unsetHomeDirectoryPath() {
            this.homeDirectoryPath = null;
            return this;
        }

        public Builder unsetObjectSummariesResultCacheSize() {
            this.objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            return this;
        }

        public Builder unsetObjectSummaryCacheSize() {
            this.objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            return this;
        }

        public Builder unsetResummarizeObjectsBulkRequestSize() {
            this.resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);
            return this;
        }

        private org.thryft.native_.Url apiUrl;
        private Boolean cacheCollections;
        private Boolean cacheInstitutions;
        private String elasticSearchHost;
        private com.google.common.primitives.UnsignedInteger elasticSearchPort;
        /**
         * dev, staging, production, etc.
         */
        private String environment;
        private String googleApiKey;
        private String googleOauthKey;
        private String googleOauthSecret;
        private String homeDirectoryPath;
        private com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize;
        private com.google.common.primitives.UnsignedInteger objectSummaryCacheSize;
        private com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<DressDiscoverProperties> {
        @Override
        public DressDiscoverProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return DressDiscoverProperties.readAs(iprot, type);
        }

        @Override
        public DressDiscoverProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DressDiscoverProperties.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public DressDiscoverProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DressDiscoverProperties.readAsList(iprot);
        }

        @Override
        public DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DressDiscoverProperties.readAsStruct(iprot);
        }

        @Override
        public DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DressDiscoverProperties.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        API_URL("apiUrl", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 0, "api_url", org.thryft.protocol.Type.STRING),
        CACHE_COLLECTIONS("cacheCollections", new com.google.common.reflect.TypeToken<Boolean>() {}, true, 0, "cache_collections", org.thryft.protocol.Type.BOOL),
        CACHE_INSTITUTIONS("cacheInstitutions", new com.google.common.reflect.TypeToken<Boolean>() {}, true, 0, "cache_institutions", org.thryft.protocol.Type.BOOL),
        ELASTIC_SEARCH_HOST("elasticSearchHost", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "elastic_search_host", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_PORT("elasticSearchPort", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "elastic_search_port", org.thryft.protocol.Type.I32),
        ENVIRONMENT("environment", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "environment", org.thryft.protocol.Type.STRING),
        GOOGLE_API_KEY("googleApiKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_api_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_KEY("googleOauthKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_SECRET("googleOauthSecret", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_secret", org.thryft.protocol.Type.STRING),
        HOME_DIRECTORY_PATH("homeDirectoryPath", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "home_directory_path", org.thryft.protocol.Type.STRING),
        OBJECT_SUMMARIES_RESULT_CACHE_SIZE("objectSummariesResultCacheSize", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "object_summaries_result_cache_size", org.thryft.protocol.Type.I32),
        OBJECT_SUMMARY_CACHE_SIZE("objectSummaryCacheSize", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "object_summary_cache_size", org.thryft.protocol.Type.I32),
        RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE("resummarizeObjectsBulkRequestSize", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "resummarize_objects_bulk_request_size", org.thryft.protocol.Type.I32);

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
            case "apiUrl": return API_URL;
            case "cacheCollections": return CACHE_COLLECTIONS;
            case "cacheInstitutions": return CACHE_INSTITUTIONS;
            case "elasticSearchHost": return ELASTIC_SEARCH_HOST;
            case "elasticSearchPort": return ELASTIC_SEARCH_PORT;
            case "environment": return ENVIRONMENT;
            case "googleApiKey": return GOOGLE_API_KEY;
            case "googleOauthKey": return GOOGLE_OAUTH_KEY;
            case "googleOauthSecret": return GOOGLE_OAUTH_SECRET;
            case "homeDirectoryPath": return HOME_DIRECTORY_PATH;
            case "objectSummariesResultCacheSize": return OBJECT_SUMMARIES_RESULT_CACHE_SIZE;
            case "objectSummaryCacheSize": return OBJECT_SUMMARY_CACHE_SIZE;
            case "resummarizeObjectsBulkRequestSize": return RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "api_url": return API_URL;
            case "cache_collections": return CACHE_COLLECTIONS;
            case "cache_institutions": return CACHE_INSTITUTIONS;
            case "elastic_search_host": return ELASTIC_SEARCH_HOST;
            case "elastic_search_port": return ELASTIC_SEARCH_PORT;
            case "environment": return ENVIRONMENT;
            case "google_api_key": return GOOGLE_API_KEY;
            case "google_oauth_key": return GOOGLE_OAUTH_KEY;
            case "google_oauth_secret": return GOOGLE_OAUTH_SECRET;
            case "home_directory_path": return HOME_DIRECTORY_PATH;
            case "object_summaries_result_cache_size": return OBJECT_SUMMARIES_RESULT_CACHE_SIZE;
            case "object_summary_cache_size": return OBJECT_SUMMARY_CACHE_SIZE;
            case "resummarize_objects_bulk_request_size": return RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE;
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
    public DressDiscoverProperties(final DressDiscoverProperties other) {
        this(other.getApiUrl(), other.getCacheCollections(), other.getCacheInstitutions(), other.getElasticSearchHost(), other.getElasticSearchPort(), other.getEnvironment(), other.getGoogleApiKey(), other.getGoogleOauthKey(), other.getGoogleOauthSecret(), other.getHomeDirectoryPath(), other.getObjectSummariesResultCacheSize(), other.getObjectSummaryCacheSize(), other.getResummarizeObjectsBulkRequestSize());
    }

    protected DressDiscoverProperties(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize, final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize, final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
        this.apiUrl = apiUrl;
        this.cacheCollections = cacheCollections;
        this.cacheInstitutions = cacheInstitutions;
        this.elasticSearchHost = elasticSearchHost;
        this.elasticSearchPort = elasticSearchPort;
        this.environment = environment;
        this.googleApiKey = googleApiKey;
        this.googleOauthKey = googleOauthKey;
        this.googleOauthSecret = googleOauthSecret;
        this.homeDirectoryPath = homeDirectoryPath;
        this.objectSummariesResultCacheSize = objectSummariesResultCacheSize;
        this.objectSummaryCacheSize = objectSummaryCacheSize;
        this.resummarizeObjectsBulkRequestSize = resummarizeObjectsBulkRequestSize;
    }

    private static java.util.Properties __mergeProperties(
            final java.util.Properties leftProperties, final java.util.Properties rightProperties) {
        final java.util.Properties mergedProperties = new java.util.Properties();
        mergedProperties.putAll(leftProperties);
        for (final java.util.Map.Entry<Object, Object> rightEntry : rightProperties
                .entrySet()) {
            if (!(rightEntry.getKey() instanceof String)) {
                continue;
            }
            mergedProperties.put(rightEntry.getKey(), rightEntry.getValue());
        }
        return mergedProperties;
    }

    private static java.util.Properties __readProperties(final java.io.File propertiesFilePath) {
        final java.util.Properties properties = new java.util.Properties();
        try (final java.io.FileReader propertiesFileReader = new java.io.FileReader(
                propertiesFilePath)) {
            properties.load(propertiesFileReader);
            logger.debug("read properties file {}", propertiesFilePath);
        } catch (final java.io.FileNotFoundException e) {
            logger.debug("properties file {} not found", propertiesFilePath);
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {}: ", propertiesFilePath, e);
        }
        return properties;
    }

    private static java.util.Properties __readProperties(final String propertiesResourceName) {
        final java.util.Properties properties = new java.util.Properties();

        final java.io.InputStream propertiesInputStream = DressDiscoverProperties.class
                .getResourceAsStream(propertiesResourceName);
        if (propertiesInputStream == null) {
            logger.debug("properties file {} not found in the CLASSPATH", propertiesResourceName);
            return properties;
        }

        try {
            try {
                properties.load(propertiesInputStream);
                logger.debug("read properties file {} from CLASSPATH", propertiesResourceName);
            } finally {
                propertiesInputStream.close();
            }
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {} from the CLASSPATH: ", propertiesResourceName, e);
        }
        return properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final DressDiscoverProperties other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<DressDiscoverProperties> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static DressDiscoverProperties create(final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath) {
        return new DressDiscoverProperties(org.thryft.native_.Url.parse("http://middleware:8082/api/"), true, true, "elasticsearch", com.google.common.primitives.UnsignedInteger.valueOf(9300), com.google.common.base.Preconditions.checkNotNull(environment, "org.dressdiscover.lib.DressDiscoverProperties: missing environment"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleApiKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleApiKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthSecret, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthSecret"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is empty"), com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "org.dressdiscover.lib.DressDiscoverProperties: missing homeDirectoryPath"), com.google.common.primitives.UnsignedInteger.valueOf(1024), com.google.common.primitives.UnsignedInteger.valueOf(1024), com.google.common.primitives.UnsignedInteger.valueOf(1000));
    }

    /**
     * Total boxed factory method
     */
    public static DressDiscoverProperties create(org.thryft.native_.Url apiUrl, Boolean cacheCollections, Boolean cacheInstitutions, String elasticSearchHost, com.google.common.primitives.UnsignedInteger elasticSearchPort, String environment, String googleApiKey, String googleOauthKey, String googleOauthSecret, String homeDirectoryPath, com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize, com.google.common.primitives.UnsignedInteger objectSummaryCacheSize, com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(com.google.common.base.Preconditions.checkNotNull(apiUrl, "org.dressdiscover.lib.DressDiscoverProperties: missing apiUrl"), com.google.common.base.Preconditions.checkNotNull(cacheCollections, "org.dressdiscover.lib.DressDiscoverProperties: missing cacheCollections"), com.google.common.base.Preconditions.checkNotNull(cacheInstitutions, "org.dressdiscover.lib.DressDiscoverProperties: missing cacheInstitutions"), com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchHost"), com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchPort"), com.google.common.base.Preconditions.checkNotNull(environment, "org.dressdiscover.lib.DressDiscoverProperties: missing environment"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleApiKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleApiKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthSecret, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthSecret"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is empty"), com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "org.dressdiscover.lib.DressDiscoverProperties: missing homeDirectoryPath"), com.google.common.base.Preconditions.checkNotNull(objectSummariesResultCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummariesResultCacheSize"), com.google.common.base.Preconditions.checkNotNull(objectSummaryCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummaryCacheSize"), com.google.common.base.Preconditions.checkNotNull(resummarizeObjectsBulkRequestSize, "org.dressdiscover.lib.DressDiscoverProperties: missing resummarizeObjectsBulkRequestSize"));
    }

    /**
     * Optional factory method
     */
    public static DressDiscoverProperties create(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize, final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize, final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(com.google.common.base.Preconditions.checkNotNull(apiUrl, "org.dressdiscover.lib.DressDiscoverProperties: missing apiUrl"), cacheCollections, cacheInstitutions, com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchHost"), com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "org.dressdiscover.lib.DressDiscoverProperties: missing elasticSearchPort"), com.google.common.base.Preconditions.checkNotNull(environment, "org.dressdiscover.lib.DressDiscoverProperties: missing environment"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleApiKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleApiKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthKey, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthKey"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is empty"), org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(googleOauthSecret, "org.dressdiscover.lib.DressDiscoverProperties: missing googleOauthSecret"), "org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is empty"), com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "org.dressdiscover.lib.DressDiscoverProperties: missing homeDirectoryPath"), com.google.common.base.Preconditions.checkNotNull(objectSummariesResultCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummariesResultCacheSize"), com.google.common.base.Preconditions.checkNotNull(objectSummaryCacheSize, "org.dressdiscover.lib.DressDiscoverProperties: missing objectSummaryCacheSize"), com.google.common.base.Preconditions.checkNotNull(resummarizeObjectsBulkRequestSize, "org.dressdiscover.lib.DressDiscoverProperties: missing resummarizeObjectsBulkRequestSize"));
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof DressDiscoverProperties)) {
            return false;
        }

        final DressDiscoverProperties other = (DressDiscoverProperties)otherObject;
        return
            getApiUrl().equals(other.getApiUrl()) &&
            getCacheCollections() == other.getCacheCollections() &&
            getCacheInstitutions() == other.getCacheInstitutions() &&
            getElasticSearchHost().equals(other.getElasticSearchHost()) &&
            getElasticSearchPort().equals(other.getElasticSearchPort()) &&
            getEnvironment().equals(other.getEnvironment()) &&
            getGoogleApiKey().equals(other.getGoogleApiKey()) &&
            getGoogleOauthKey().equals(other.getGoogleOauthKey()) &&
            getGoogleOauthSecret().equals(other.getGoogleOauthSecret()) &&
            getHomeDirectoryPath().equals(other.getHomeDirectoryPath()) &&
            getObjectSummariesResultCacheSize().equals(other.getObjectSummariesResultCacheSize()) &&
            getObjectSummaryCacheSize().equals(other.getObjectSummaryCacheSize()) &&
            getResummarizeObjectsBulkRequestSize().equals(other.getResummarizeObjectsBulkRequestSize());
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
        case API_URL: return getApiUrl();
        case CACHE_COLLECTIONS: return getCacheCollections();
        case CACHE_INSTITUTIONS: return getCacheInstitutions();
        case ELASTIC_SEARCH_HOST: return getElasticSearchHost();
        case ELASTIC_SEARCH_PORT: return getElasticSearchPort();
        case ENVIRONMENT: return getEnvironment();
        case GOOGLE_API_KEY: return getGoogleApiKey();
        case GOOGLE_OAUTH_KEY: return getGoogleOauthKey();
        case GOOGLE_OAUTH_SECRET: return getGoogleOauthSecret();
        case HOME_DIRECTORY_PATH: return getHomeDirectoryPath();
        case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: return getObjectSummariesResultCacheSize();
        case OBJECT_SUMMARY_CACHE_SIZE: return getObjectSummaryCacheSize();
        case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: return getResummarizeObjectsBulkRequestSize();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.thryft.native_.Url getApiUrl() {
        return apiUrl;
    }

    public final boolean getCacheCollections() {
        return cacheCollections;
    }

    public final boolean getCacheInstitutions() {
        return cacheInstitutions;
    }

    public final String getElasticSearchHost() {
        return elasticSearchHost;
    }

    public final com.google.common.primitives.UnsignedInteger getElasticSearchPort() {
        return elasticSearchPort;
    }

    /**
     * dev, staging, production, etc.
     */
    public final String getEnvironment() {
        return environment;
    }

    public final String getGoogleApiKey() {
        return googleApiKey;
    }

    public final String getGoogleOauthKey() {
        return googleOauthKey;
    }

    public final String getGoogleOauthSecret() {
        return googleOauthSecret;
    }

    public final String getHomeDirectoryPath() {
        return homeDirectoryPath;
    }

    public final com.google.common.primitives.UnsignedInteger getObjectSummariesResultCacheSize() {
        return objectSummariesResultCacheSize;
    }

    public final com.google.common.primitives.UnsignedInteger getObjectSummaryCacheSize() {
        return objectSummaryCacheSize;
    }

    public final com.google.common.primitives.UnsignedInteger getResummarizeObjectsBulkRequestSize() {
        return resummarizeObjectsBulkRequestSize;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getApiUrl().hashCode();
        hashCode = 31 * hashCode + (getCacheCollections() ? 1 : 0);
        hashCode = 31 * hashCode + (getCacheInstitutions() ? 1 : 0);
        hashCode = 31 * hashCode + getElasticSearchHost().hashCode();
        hashCode = 31 * hashCode + getElasticSearchPort().hashCode();
        hashCode = 31 * hashCode + getEnvironment().hashCode();
        hashCode = 31 * hashCode + getGoogleApiKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthSecret().hashCode();
        hashCode = 31 * hashCode + getHomeDirectoryPath().hashCode();
        hashCode = 31 * hashCode + getObjectSummariesResultCacheSize().hashCode();
        hashCode = 31 * hashCode + getObjectSummaryCacheSize().hashCode();
        hashCode = 31 * hashCode + getResummarizeObjectsBulkRequestSize().hashCode();
        return hashCode;
    }


    public static DressDiscoverProperties load() {
        return load(com.google.common.base.Optional.<java.io.File> absent());
    }

    public static DressDiscoverProperties load(final com.google.common.base.Optional<java.io.File> commandLinePropertiesFilePath) {
        java.util.Properties __properties = new java.util.Properties();

        String[] __propertyNames = {"api_url", "cache_collections", "cache_institutions", "elastic_search_host", "elastic_search_port", "environment", "google_api_key", "google_oauth_key", "google_oauth_secret", "home_directory_path", "object_summaries_result_cache_size", "object_summary_cache_size", "resummarize_objects_bulk_request_size"};
        for (final String propertyName : __propertyNames) {
            final String propertyValue = System.getenv("DRESSDISCOVER_" + propertyName.toUpperCase());
            if (propertyValue != null) {
                __properties.put(propertyName, propertyValue);
            }
        }

        __properties = __mergeProperties(__properties, __readProperties("dress_discover.properties"));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                "/etc/dressdiscover/dress_discover.properties")));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                new java.io.File(new java.io.File(System.getProperty("user.home")),
                        ".dressdiscover"), "dress_discover.properties")));
        if (commandLinePropertiesFilePath.isPresent()) {
            __properties = __mergeProperties(__properties,
                    __readProperties(commandLinePropertiesFilePath.get()));
        }

        final org.thryft.native_.Url apiUrl;
        {
            Object apiUrlObject = __properties.remove("api_url");
            if (!(apiUrlObject instanceof String)) {
                apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            } else {
                final String apiUrlString = ((String)apiUrlObject).trim();
                if (apiUrlString.isEmpty()) {
                    apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
                } else {
                    apiUrl = org.thryft.native_.Url.parse(apiUrlString);
                }
            }
        }

        final Boolean cacheCollections;
        {
            Object cacheCollectionsObject = __properties.remove("cache_collections");
            if (!(cacheCollectionsObject instanceof String)) {
                cacheCollections = true;
            } else {
                final String cacheCollectionsString = ((String)cacheCollectionsObject).trim();
                if (cacheCollectionsString.isEmpty()) {
                    cacheCollections = true;
                } else {
                    cacheCollections = (cacheCollectionsString.equals("1") || cacheCollectionsString.equalsIgnoreCase("true"));
                }
            }
        }

        final Boolean cacheInstitutions;
        {
            Object cacheInstitutionsObject = __properties.remove("cache_institutions");
            if (!(cacheInstitutionsObject instanceof String)) {
                cacheInstitutions = true;
            } else {
                final String cacheInstitutionsString = ((String)cacheInstitutionsObject).trim();
                if (cacheInstitutionsString.isEmpty()) {
                    cacheInstitutions = true;
                } else {
                    cacheInstitutions = (cacheInstitutionsString.equals("1") || cacheInstitutionsString.equalsIgnoreCase("true"));
                }
            }
        }

        final String elasticSearchHost;
        {
            Object elasticSearchHostObject = __properties.remove("elastic_search_host");
            if (!(elasticSearchHostObject instanceof String)) {
                elasticSearchHost = "elasticsearch";
            } else {
                final String elasticSearchHostString = ((String)elasticSearchHostObject).trim();
                if (elasticSearchHostString.isEmpty()) {
                    elasticSearchHost = "elasticsearch";
                } else {
                    elasticSearchHost = elasticSearchHostString;
                }
            }
        }

        final com.google.common.primitives.UnsignedInteger elasticSearchPort;
        {
            Object elasticSearchPortObject = __properties.remove("elastic_search_port");
            if (!(elasticSearchPortObject instanceof String)) {
                elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            } else {
                final String elasticSearchPortString = ((String)elasticSearchPortObject).trim();
                if (elasticSearchPortString.isEmpty()) {
                    elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
                } else {
                    elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(elasticSearchPortString);
                }
            }
        }

        final String environment;
        {
            Object environmentObject = __properties.remove("environment");
            if (!(environmentObject instanceof String)) {
                throw new RuntimeException("no such property environment");
            } else {
                final String environmentString = ((String)environmentObject).trim();
                if (environmentString.isEmpty()) {
                    throw new RuntimeException("property environment is empty");
                } else {
                    environment = environmentString;
                }
            }
        }

        final String googleApiKey;
        {
            Object googleApiKeyObject = __properties.remove("google_api_key");
            if (!(googleApiKeyObject instanceof String)) {
                throw new RuntimeException("no such property google_api_key");
            } else {
                final String googleApiKeyString = ((String)googleApiKeyObject).trim();
                if (googleApiKeyString.isEmpty()) {
                    throw new RuntimeException("property google_api_key is empty");
                } else {
                    googleApiKey = googleApiKeyString;
                }
            }
        }

        final String googleOauthKey;
        {
            Object googleOauthKeyObject = __properties.remove("google_oauth_key");
            if (!(googleOauthKeyObject instanceof String)) {
                throw new RuntimeException("no such property google_oauth_key");
            } else {
                final String googleOauthKeyString = ((String)googleOauthKeyObject).trim();
                if (googleOauthKeyString.isEmpty()) {
                    throw new RuntimeException("property google_oauth_key is empty");
                } else {
                    googleOauthKey = googleOauthKeyString;
                }
            }
        }

        final String googleOauthSecret;
        {
            Object googleOauthSecretObject = __properties.remove("google_oauth_secret");
            if (!(googleOauthSecretObject instanceof String)) {
                throw new RuntimeException("no such property google_oauth_secret");
            } else {
                final String googleOauthSecretString = ((String)googleOauthSecretObject).trim();
                if (googleOauthSecretString.isEmpty()) {
                    throw new RuntimeException("property google_oauth_secret is empty");
                } else {
                    googleOauthSecret = googleOauthSecretString;
                }
            }
        }

        final String homeDirectoryPath;
        {
            Object homeDirectoryPathObject = __properties.remove("home_directory_path");
            if (!(homeDirectoryPathObject instanceof String)) {
                throw new RuntimeException("no such property home_directory_path");
            } else {
                final String homeDirectoryPathString = ((String)homeDirectoryPathObject).trim();
                if (homeDirectoryPathString.isEmpty()) {
                    throw new RuntimeException("property home_directory_path is empty");
                } else {
                    homeDirectoryPath = homeDirectoryPathString;
                }
            }
        }

        final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize;
        {
            Object objectSummariesResultCacheSizeObject = __properties.remove("object_summaries_result_cache_size");
            if (!(objectSummariesResultCacheSizeObject instanceof String)) {
                objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            } else {
                final String objectSummariesResultCacheSizeString = ((String)objectSummariesResultCacheSizeObject).trim();
                if (objectSummariesResultCacheSizeString.isEmpty()) {
                    objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
                } else {
                    objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(objectSummariesResultCacheSizeString);
                }
            }
        }

        final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize;
        {
            Object objectSummaryCacheSizeObject = __properties.remove("object_summary_cache_size");
            if (!(objectSummaryCacheSizeObject instanceof String)) {
                objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
            } else {
                final String objectSummaryCacheSizeString = ((String)objectSummaryCacheSizeObject).trim();
                if (objectSummaryCacheSizeString.isEmpty()) {
                    objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
                } else {
                    objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(objectSummaryCacheSizeString);
                }
            }
        }

        final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize;
        {
            Object resummarizeObjectsBulkRequestSizeObject = __properties.remove("resummarize_objects_bulk_request_size");
            if (!(resummarizeObjectsBulkRequestSizeObject instanceof String)) {
                resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);
            } else {
                final String resummarizeObjectsBulkRequestSizeString = ((String)resummarizeObjectsBulkRequestSizeObject).trim();
                if (resummarizeObjectsBulkRequestSizeString.isEmpty()) {
                    resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);
                } else {
                    resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(resummarizeObjectsBulkRequestSizeString);
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public static DressDiscoverProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DressDiscoverProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static DressDiscoverProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        String elasticSearchHost = "elasticsearch";
        com.google.common.primitives.UnsignedInteger elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
        String environment = null;
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;
        String homeDirectoryPath = null;
        com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
        com.google.common.primitives.UnsignedInteger objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
        com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);

        iprot.readListBegin();
        apiUrl = org.thryft.native_.Url.parse(iprot.readString());
        cacheCollections = iprot.readBool();
        cacheInstitutions = iprot.readBool();
        elasticSearchHost = iprot.readString();
        elasticSearchPort = iprot.readU32();
        environment = iprot.readString();
        googleApiKey = iprot.readString();
        googleOauthKey = iprot.readString();
        googleOauthSecret = iprot.readString();
        homeDirectoryPath = iprot.readString();
        objectSummariesResultCacheSize = iprot.readU32();
        objectSummaryCacheSize = iprot.readU32();
        resummarizeObjectsBulkRequestSize = iprot.readU32();
        iprot.readListEnd();
        try {
            return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        String elasticSearchHost = "elasticsearch";
        com.google.common.primitives.UnsignedInteger elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
        String environment = null;
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;
        String homeDirectoryPath = null;
        com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
        com.google.common.primitives.UnsignedInteger objectSummaryCacheSize = com.google.common.primitives.UnsignedInteger.valueOf(1024);
        com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize = com.google.common.primitives.UnsignedInteger.valueOf(1000);

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "api_url": {
                apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                break;
            }
            case "cache_collections": {
                cacheCollections = iprot.readBool();
                break;
            }
            case "cache_institutions": {
                cacheInstitutions = iprot.readBool();
                break;
            }
            case "elastic_search_host": {
                elasticSearchHost = iprot.readString();
                break;
            }
            case "elastic_search_port": {
                elasticSearchPort = iprot.readU32();
                break;
            }
            case "environment": {
                environment = iprot.readString();
                break;
            }
            case "google_api_key": {
                googleApiKey = iprot.readString();
                break;
            }
            case "google_oauth_key": {
                googleOauthKey = iprot.readString();
                break;
            }
            case "google_oauth_secret": {
                googleOauthSecret = iprot.readString();
                break;
            }
            case "home_directory_path": {
                homeDirectoryPath = iprot.readString();
                break;
            }
            case "object_summaries_result_cache_size": {
                objectSummariesResultCacheSize = iprot.readU32();
                break;
            }
            case "object_summary_cache_size": {
                objectSummaryCacheSize = iprot.readU32();
                break;
            }
            case "resummarize_objects_bulk_request_size": {
                resummarizeObjectsBulkRequestSize = iprot.readU32();
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
            return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public DressDiscoverProperties replaceApiUrl(final org.thryft.native_.Url apiUrl) {
        return new DressDiscoverProperties(apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceCacheCollections(final boolean cacheCollections) {
        return new DressDiscoverProperties(this.apiUrl, cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceCacheInstitutions(final boolean cacheInstitutions) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceElasticSearchHost(final String elasticSearchHost) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceElasticSearchPort(final com.google.common.primitives.UnsignedInteger elasticSearchPort) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceEnvironment(final String environment) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceGoogleApiKey(final String googleApiKey) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceGoogleOauthKey(final String googleOauthKey) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceGoogleOauthSecret(final String googleOauthSecret) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceHomeDirectoryPath(final String homeDirectoryPath) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceObjectSummariesResultCacheSize(final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceObjectSummaryCacheSize(final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public DressDiscoverProperties replaceResummarizeObjectsBulkRequestSize(final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("api_url", getApiUrl());
        builder.put("cache_collections", getCacheCollections());
        builder.put("cache_institutions", getCacheInstitutions());
        builder.put("elastic_search_host", getElasticSearchHost());
        builder.put("elastic_search_port", getElasticSearchPort());
        builder.put("environment", getEnvironment());
        builder.put("google_api_key", getGoogleApiKey());
        builder.put("google_oauth_key", getGoogleOauthKey());
        builder.put("google_oauth_secret", getGoogleOauthSecret());
        builder.put("home_directory_path", getHomeDirectoryPath());
        builder.put("object_summaries_result_cache_size", getObjectSummariesResultCacheSize());
        builder.put("object_summary_cache_size", getObjectSummaryCacheSize());
        builder.put("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize());
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("api_url", getApiUrl()).add("cache_collections", getCacheCollections()).add("cache_institutions", getCacheInstitutions()).add("elastic_search_host", getElasticSearchHost()).add("elastic_search_port", getElasticSearchPort()).add("environment", getEnvironment()).add("google_api_key", getGoogleApiKey()).add("google_oauth_key", getGoogleOauthKey()).add("google_oauth_secret", getGoogleOauthSecret()).add("home_directory_path", getHomeDirectoryPath()).add("object_summaries_result_cache_size", getObjectSummariesResultCacheSize()).add("object_summary_cache_size", getObjectSummaryCacheSize()).add("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 13);

        oprot.writeString(getApiUrl().toString());

        oprot.writeBool(getCacheCollections());

        oprot.writeBool(getCacheInstitutions());

        oprot.writeString(getElasticSearchHost());

        oprot.writeU32(getElasticSearchPort());

        oprot.writeString(getEnvironment());

        oprot.writeString(getGoogleApiKey());

        oprot.writeString(getGoogleOauthKey());

        oprot.writeString(getGoogleOauthSecret());

        oprot.writeString(getHomeDirectoryPath());

        oprot.writeU32(getObjectSummariesResultCacheSize());

        oprot.writeU32(getObjectSummaryCacheSize());

        oprot.writeU32(getResummarizeObjectsBulkRequestSize());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.lib.DressDiscoverProperties");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("api_url", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getApiUrl().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("cache_collections", org.thryft.protocol.Type.BOOL, (short)0);
        oprot.writeBool(getCacheCollections());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("cache_institutions", org.thryft.protocol.Type.BOOL, (short)0);
        oprot.writeBool(getCacheInstitutions());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_host", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getElasticSearchHost());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_port", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getElasticSearchPort());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("environment", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getEnvironment());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("google_api_key", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleApiKey());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("google_oauth_key", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleOauthKey());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("google_oauth_secret", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleOauthSecret());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("home_directory_path", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getHomeDirectoryPath());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("object_summaries_result_cache_size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getObjectSummariesResultCacheSize());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("object_summary_cache_size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getObjectSummaryCacheSize());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("resummarize_objects_bulk_request_size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getResummarizeObjectsBulkRequestSize());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.thryft.native_.Url apiUrl;

    private final boolean cacheCollections;

    private final boolean cacheInstitutions;

    private final String elasticSearchHost;

    private final com.google.common.primitives.UnsignedInteger elasticSearchPort;

    /**
     * dev, staging, production, etc.
     */
    private final String environment;

    private final String googleApiKey;

    private final String googleOauthKey;

    private final String googleOauthSecret;

    private final String homeDirectoryPath;

    private final com.google.common.primitives.UnsignedInteger objectSummariesResultCacheSize;

    private final com.google.common.primitives.UnsignedInteger objectSummaryCacheSize;

    private final com.google.common.primitives.UnsignedInteger resummarizeObjectsBulkRequestSize;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(DressDiscoverProperties.class);
}
