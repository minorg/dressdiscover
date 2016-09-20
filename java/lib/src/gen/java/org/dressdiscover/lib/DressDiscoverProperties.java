package org.dressdiscover.lib;

public final class DressDiscoverProperties implements org.thryft.Struct, org.thryft.waf.lib.Properties {
    public final static class Builder {
        public Builder() {
            apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            cacheCollections = true;
            cacheInstitutions = true;
            elasticSearchHost = "elasticsearch";
            elasticSearchPort = ((int)9300);
            environment = null;
            googleApiKey = null;
            googleOauthKey = null;
            googleOauthSecret = null;
            homeDirectoryPath = null;
            objectSummariesResultCacheSize = ((int)1024);
            objectSummaryCacheSize = ((int)1024);
            resummarizeObjectsBulkRequestSize = ((int)1000);
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

        protected DressDiscoverProperties _build(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final int elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
            return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
        }

        public DressDiscoverProperties build() {
            return _build(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
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

        public final int getElasticSearchPort() {
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

        public final int getObjectSummariesResultCacheSize() {
            return objectSummariesResultCacheSize;
        }

        public final int getObjectSummaryCacheSize() {
            return objectSummaryCacheSize;
        }

        public final int getResummarizeObjectsBulkRequestSize() {
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
            try {
                iprot.readListBegin();
                try {
                    apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                } catch (final java.lang.IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.API_URL, e);
                }
                cacheCollections = iprot.readBool();
                cacheInstitutions = iprot.readBool();
                elasticSearchHost = iprot.readString();
                try {
                    elasticSearchPort = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
                }
                environment = iprot.readString();
                googleApiKey = iprot.readString();
                googleOauthKey = iprot.readString();
                googleOauthSecret = iprot.readString();
                homeDirectoryPath = iprot.readString();
                try {
                    objectSummariesResultCacheSize = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE, e);
                }
                try {
                    objectSummaryCacheSize = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE, e);
                }
                try {
                    resummarizeObjectsBulkRequestSize = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE, e);
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
                    case "api_url": {
                        try {
                            apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                        } catch (final java.lang.IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.API_URL, e);
                        }
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
                        try {
                            elasticSearchPort = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
                        }
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
                        try {
                            objectSummariesResultCacheSize = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE, e);
                        }
                        break;
                    }
                    case "object_summary_cache_size": {
                        try {
                            objectSummaryCacheSize = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE, e);
                        }
                        break;
                    }
                    case "resummarize_objects_bulk_request_size": {
                        try {
                            resummarizeObjectsBulkRequestSize = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE, e);
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
            case API_URL: setApiUrl((org.thryft.native_.Url)value); return this;
            case CACHE_COLLECTIONS: setCacheCollections((boolean)value); return this;
            case CACHE_INSTITUTIONS: setCacheInstitutions((boolean)value); return this;
            case ELASTIC_SEARCH_HOST: setElasticSearchHost((String)value); return this;
            case ELASTIC_SEARCH_PORT: setElasticSearchPort((int)value); return this;
            case ENVIRONMENT: setEnvironment((String)value); return this;
            case GOOGLE_API_KEY: setGoogleApiKey((String)value); return this;
            case GOOGLE_OAUTH_KEY: setGoogleOauthKey((String)value); return this;
            case GOOGLE_OAUTH_SECRET: setGoogleOauthSecret((String)value); return this;
            case HOME_DIRECTORY_PATH: setHomeDirectoryPath((String)value); return this;
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: setObjectSummariesResultCacheSize((int)value); return this;
            case OBJECT_SUMMARY_CACHE_SIZE: setObjectSummaryCacheSize((int)value); return this;
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: setResummarizeObjectsBulkRequestSize((int)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setApiUrl(final org.thryft.native_.Url apiUrl) {
            this.apiUrl = DefaultConstructionValidator.getInstance().validateApiUrl(apiUrl);
            return this;
        }

        public Builder setCacheCollections(final boolean cacheCollections) {
            this.cacheCollections = DefaultConstructionValidator.getInstance().validateCacheCollections(cacheCollections);
            return this;
        }

        public Builder setCacheInstitutions(final boolean cacheInstitutions) {
            this.cacheInstitutions = DefaultConstructionValidator.getInstance().validateCacheInstitutions(cacheInstitutions);
            return this;
        }

        public Builder setElasticSearchHost(final String elasticSearchHost) {
            this.elasticSearchHost = DefaultConstructionValidator.getInstance().validateElasticSearchHost(elasticSearchHost);
            return this;
        }

        public Builder setElasticSearchPort(final int elasticSearchPort) {
            this.elasticSearchPort = DefaultConstructionValidator.getInstance().validateElasticSearchPort(elasticSearchPort);
            return this;
        }

        public Builder setEnvironment(final String environment) {
            this.environment = DefaultConstructionValidator.getInstance().validateEnvironment(environment);
            return this;
        }

        public Builder setGoogleApiKey(final String googleApiKey) {
            this.googleApiKey = DefaultConstructionValidator.getInstance().validateGoogleApiKey(googleApiKey);
            return this;
        }

        public Builder setGoogleOauthKey(final String googleOauthKey) {
            this.googleOauthKey = DefaultConstructionValidator.getInstance().validateGoogleOauthKey(googleOauthKey);
            return this;
        }

        public Builder setGoogleOauthSecret(final String googleOauthSecret) {
            this.googleOauthSecret = DefaultConstructionValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret);
            return this;
        }

        public Builder setHomeDirectoryPath(final String homeDirectoryPath) {
            this.homeDirectoryPath = DefaultConstructionValidator.getInstance().validateHomeDirectoryPath(homeDirectoryPath);
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

        public Builder setObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
            this.objectSummariesResultCacheSize = DefaultConstructionValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
            return this;
        }

        public Builder setObjectSummaryCacheSize(final int objectSummaryCacheSize) {
            this.objectSummaryCacheSize = DefaultConstructionValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize);
            return this;
        }

        public Builder setResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
            this.resummarizeObjectsBulkRequestSize = DefaultConstructionValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
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
            this.elasticSearchPort = ((int)9300);
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
            this.objectSummariesResultCacheSize = ((int)1024);
            return this;
        }

        public Builder unsetObjectSummaryCacheSize() {
            this.objectSummaryCacheSize = ((int)1024);
            return this;
        }

        public Builder unsetResummarizeObjectsBulkRequestSize() {
            this.resummarizeObjectsBulkRequestSize = ((int)1000);
            return this;
        }

        private org.thryft.native_.Url apiUrl;
        private Boolean cacheCollections;
        private Boolean cacheInstitutions;
        private String elasticSearchHost;
        private Integer elasticSearchPort;
        /**
         * dev, staging, production, etc.
         */
        private String environment;
        private String googleApiKey;
        private String googleOauthKey;
        private String googleOauthSecret;
        private String homeDirectoryPath;
        private Integer objectSummariesResultCacheSize;
        private Integer objectSummaryCacheSize;
        private Integer resummarizeObjectsBulkRequestSize;
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
        ELASTIC_SEARCH_PORT("elasticSearchPort", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "elastic_search_port", org.thryft.protocol.Type.I32),
        ENVIRONMENT("environment", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "environment", org.thryft.protocol.Type.STRING),
        GOOGLE_API_KEY("googleApiKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_api_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_KEY("googleOauthKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_SECRET("googleOauthSecret", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_secret", org.thryft.protocol.Type.STRING),
        HOME_DIRECTORY_PATH("homeDirectoryPath", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "home_directory_path", org.thryft.protocol.Type.STRING),
        OBJECT_SUMMARIES_RESULT_CACHE_SIZE("objectSummariesResultCacheSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "object_summaries_result_cache_size", org.thryft.protocol.Type.I32),
        OBJECT_SUMMARY_CACHE_SIZE("objectSummaryCacheSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "object_summary_cache_size", org.thryft.protocol.Type.I32),
        RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE("resummarizeObjectsBulkRequestSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "resummarize_objects_bulk_request_size", org.thryft.protocol.Type.I32);

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

    public interface Validator<ExceptionT extends Exception> {
        public org.thryft.native_.Url validateApiUrl(final org.thryft.native_.Url apiUrl) throws ExceptionT;

        public boolean validateCacheCollections(final boolean cacheCollections) throws ExceptionT;

        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws ExceptionT;

        public String validateElasticSearchHost(final String elasticSearchHost) throws ExceptionT;

        public int validateElasticSearchPort(final int elasticSearchPort) throws ExceptionT;

        public String validateEnvironment(final String environment) throws ExceptionT;

        public String validateGoogleApiKey(final String googleApiKey) throws ExceptionT;

        public String validateGoogleOauthKey(final String googleOauthKey) throws ExceptionT;

        public String validateGoogleOauthSecret(final String googleOauthSecret) throws ExceptionT;

        public String validateHomeDirectoryPath(final String homeDirectoryPath) throws ExceptionT;

        public int validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) throws ExceptionT;

        public int validateObjectSummaryCacheSize(final int objectSummaryCacheSize) throws ExceptionT;

        public int validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) throws ExceptionT;
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
        public org.thryft.native_.Url validateApiUrl(final org.thryft.native_.Url apiUrl) throws RuntimeException {
            if (apiUrl == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: apiUrl is null");
            }
            return apiUrl;
        }

        @Override
        public boolean validateCacheCollections(final boolean cacheCollections) throws RuntimeException {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws RuntimeException {
            return cacheInstitutions;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) throws RuntimeException {
            if (elasticSearchHost == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: elasticSearchHost is null");
            }
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) throws RuntimeException {
            return elasticSearchPort;
        }

        @Override
        public String validateEnvironment(final String environment) throws RuntimeException {
            if (environment == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: environment is null");
            }
            return environment;
        }

        @Override
        public String validateGoogleApiKey(final String googleApiKey) throws RuntimeException {
            if (googleApiKey == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is null");
            }
            if (googleApiKey.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is less than min length 1");
            }
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) throws RuntimeException {
            if (googleOauthKey == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is null");
            }
            if (googleOauthKey.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is less than min length 1");
            }
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) throws RuntimeException {
            if (googleOauthSecret == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is null");
            }
            if (googleOauthSecret.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is less than min length 1");
            }
            return googleOauthSecret;
        }

        @Override
        public String validateHomeDirectoryPath(final String homeDirectoryPath) throws RuntimeException {
            if (homeDirectoryPath == null) {
                throw new NullPointerException("org.dressdiscover.lib.DressDiscoverProperties: homeDirectoryPath is null");
            }
            return homeDirectoryPath;
        }

        @Override
        public int validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) throws RuntimeException {
            return objectSummariesResultCacheSize;
        }

        @Override
        public int validateObjectSummaryCacheSize(final int objectSummaryCacheSize) throws RuntimeException {
            return objectSummaryCacheSize;
        }

        @Override
        public int validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) throws RuntimeException {
            return resummarizeObjectsBulkRequestSize;
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
        public org.thryft.native_.Url validateApiUrl(final org.thryft.native_.Url apiUrl) {
            return apiUrl;
        }

        @Override
        public boolean validateCacheCollections(final boolean cacheCollections) {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) {
            return cacheInstitutions;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) {
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) {
            return elasticSearchPort;
        }

        @Override
        public String validateEnvironment(final String environment) {
            return environment;
        }

        @Override
        public String validateGoogleApiKey(final String googleApiKey) {
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) {
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) {
            return googleOauthSecret;
        }

        @Override
        public String validateHomeDirectoryPath(final String homeDirectoryPath) {
            return homeDirectoryPath;
        }

        @Override
        public int validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
            return objectSummariesResultCacheSize;
        }

        @Override
        public int validateObjectSummaryCacheSize(final int objectSummaryCacheSize) {
            return objectSummaryCacheSize;
        }

        @Override
        public int validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
            return resummarizeObjectsBulkRequestSize;
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
        public org.thryft.native_.Url validateApiUrl(final org.thryft.native_.Url apiUrl) throws org.thryft.protocol.InputProtocolException {
            if (apiUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.API_URL, "org.dressdiscover.lib.DressDiscoverProperties: apiUrl is null");
            }
            return apiUrl;
        }

        @Override
        public boolean validateCacheCollections(final boolean cacheCollections) throws org.thryft.protocol.InputProtocolException {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws org.thryft.protocol.InputProtocolException {
            return cacheInstitutions;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) throws org.thryft.protocol.InputProtocolException {
            if (elasticSearchHost == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, "org.dressdiscover.lib.DressDiscoverProperties: elasticSearchHost is null");
            }
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) throws org.thryft.protocol.InputProtocolException {
            return elasticSearchPort;
        }

        @Override
        public String validateEnvironment(final String environment) throws org.thryft.protocol.InputProtocolException {
            if (environment == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ENVIRONMENT, "org.dressdiscover.lib.DressDiscoverProperties: environment is null");
            }
            return environment;
        }

        @Override
        public String validateGoogleApiKey(final String googleApiKey) throws org.thryft.protocol.InputProtocolException {
            if (googleApiKey == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_API_KEY, "org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is null");
            }
            if (googleApiKey.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_API_KEY, "org.dressdiscover.lib.DressDiscoverProperties: googleApiKey is less than min length 1");
            }
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) throws org.thryft.protocol.InputProtocolException {
            if (googleOauthKey == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_KEY, "org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is null");
            }
            if (googleOauthKey.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_KEY, "org.dressdiscover.lib.DressDiscoverProperties: googleOauthKey is less than min length 1");
            }
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) throws org.thryft.protocol.InputProtocolException {
            if (googleOauthSecret == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_SECRET, "org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is null");
            }
            if (googleOauthSecret.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_SECRET, "org.dressdiscover.lib.DressDiscoverProperties: googleOauthSecret is less than min length 1");
            }
            return googleOauthSecret;
        }

        @Override
        public String validateHomeDirectoryPath(final String homeDirectoryPath) throws org.thryft.protocol.InputProtocolException {
            if (homeDirectoryPath == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HOME_DIRECTORY_PATH, "org.dressdiscover.lib.DressDiscoverProperties: homeDirectoryPath is null");
            }
            return homeDirectoryPath;
        }

        @Override
        public int validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) throws org.thryft.protocol.InputProtocolException {
            return objectSummariesResultCacheSize;
        }

        @Override
        public int validateObjectSummaryCacheSize(final int objectSummaryCacheSize) throws org.thryft.protocol.InputProtocolException {
            return objectSummaryCacheSize;
        }

        @Override
        public int validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) throws org.thryft.protocol.InputProtocolException {
            return resummarizeObjectsBulkRequestSize;
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
        public org.thryft.native_.Url validateApiUrl(final org.thryft.native_.Url apiUrl) {
            return apiUrl;
        }

        @Override
        public boolean validateCacheCollections(final boolean cacheCollections) {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) {
            return cacheInstitutions;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) {
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) {
            return elasticSearchPort;
        }

        @Override
        public String validateEnvironment(final String environment) {
            return environment;
        }

        @Override
        public String validateGoogleApiKey(final String googleApiKey) {
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) {
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) {
            return googleOauthSecret;
        }

        @Override
        public String validateHomeDirectoryPath(final String homeDirectoryPath) {
            return homeDirectoryPath;
        }

        @Override
        public int validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
            return objectSummariesResultCacheSize;
        }

        @Override
        public int validateObjectSummaryCacheSize(final int objectSummaryCacheSize) {
            return objectSummaryCacheSize;
        }

        @Override
        public int validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
            return resummarizeObjectsBulkRequestSize;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public DressDiscoverProperties(final DressDiscoverProperties other) {
        this(other.getApiUrl(), other.getCacheCollections(), other.getCacheInstitutions(), other.getElasticSearchHost(), other.getElasticSearchPort(), other.getEnvironment(), other.getGoogleApiKey(), other.getGoogleOauthKey(), other.getGoogleOauthSecret(), other.getHomeDirectoryPath(), other.getObjectSummariesResultCacheSize(), other.getObjectSummaryCacheSize(), other.getResummarizeObjectsBulkRequestSize(), NopConstructionValidator.getInstance());
    }

    protected DressDiscoverProperties(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final int elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize, ConstructionValidator validator) {
        this.apiUrl = validator.validateApiUrl(apiUrl);
        this.cacheCollections = validator.validateCacheCollections(cacheCollections);
        this.cacheInstitutions = validator.validateCacheInstitutions(cacheInstitutions);
        this.elasticSearchHost = validator.validateElasticSearchHost(elasticSearchHost);
        this.elasticSearchPort = validator.validateElasticSearchPort(elasticSearchPort);
        this.environment = validator.validateEnvironment(environment);
        this.googleApiKey = validator.validateGoogleApiKey(googleApiKey);
        this.googleOauthKey = validator.validateGoogleOauthKey(googleOauthKey);
        this.googleOauthSecret = validator.validateGoogleOauthSecret(googleOauthSecret);
        this.homeDirectoryPath = validator.validateHomeDirectoryPath(homeDirectoryPath);
        this.objectSummariesResultCacheSize = validator.validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
        this.objectSummaryCacheSize = validator.validateObjectSummaryCacheSize(objectSummaryCacheSize);
        this.resummarizeObjectsBulkRequestSize = validator.validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
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
        return new DressDiscoverProperties(org.thryft.native_.Url.parse("http://middleware:8082/api/"), true, true, "elasticsearch", ((int)9300), environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, ((int)1024), ((int)1024), ((int)1000), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total boxed factory method
     */
    public static DressDiscoverProperties create(org.thryft.native_.Url apiUrl, Boolean cacheCollections, Boolean cacheInstitutions, String elasticSearchHost, Integer elasticSearchPort, String environment, String googleApiKey, String googleOauthKey, String googleOauthSecret, String homeDirectoryPath, Integer objectSummariesResultCacheSize, Integer objectSummaryCacheSize, Integer resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static DressDiscoverProperties create(final org.thryft.native_.Url apiUrl, final boolean cacheCollections, final boolean cacheInstitutions, final String elasticSearchHost, final int elasticSearchPort, final String environment, final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, final String homeDirectoryPath, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
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
            getElasticSearchPort() == other.getElasticSearchPort() &&
            getEnvironment().equals(other.getEnvironment()) &&
            getGoogleApiKey().equals(other.getGoogleApiKey()) &&
            getGoogleOauthKey().equals(other.getGoogleOauthKey()) &&
            getGoogleOauthSecret().equals(other.getGoogleOauthSecret()) &&
            getHomeDirectoryPath().equals(other.getHomeDirectoryPath()) &&
            getObjectSummariesResultCacheSize() == other.getObjectSummariesResultCacheSize() &&
            getObjectSummaryCacheSize() == other.getObjectSummaryCacheSize() &&
            getResummarizeObjectsBulkRequestSize() == other.getResummarizeObjectsBulkRequestSize();
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

    public final int getElasticSearchPort() {
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

    public final int getObjectSummariesResultCacheSize() {
        return objectSummariesResultCacheSize;
    }

    public final int getObjectSummaryCacheSize() {
        return objectSummaryCacheSize;
    }

    public final int getResummarizeObjectsBulkRequestSize() {
        return resummarizeObjectsBulkRequestSize;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getApiUrl().hashCode();
        hashCode = 31 * hashCode + (getCacheCollections() ? 1 : 0);
        hashCode = 31 * hashCode + (getCacheInstitutions() ? 1 : 0);
        hashCode = 31 * hashCode + getElasticSearchHost().hashCode();
        hashCode = 31 * hashCode + getElasticSearchPort();
        hashCode = 31 * hashCode + getEnvironment().hashCode();
        hashCode = 31 * hashCode + getGoogleApiKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthSecret().hashCode();
        hashCode = 31 * hashCode + getHomeDirectoryPath().hashCode();
        hashCode = 31 * hashCode + getObjectSummariesResultCacheSize();
        hashCode = 31 * hashCode + getObjectSummaryCacheSize();
        hashCode = 31 * hashCode + getResummarizeObjectsBulkRequestSize();
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

        final Integer elasticSearchPort;
        {
            Object elasticSearchPortObject = __properties.remove("elastic_search_port");
            if (!(elasticSearchPortObject instanceof String)) {
                elasticSearchPort = ((int)9300);
            } else {
                final String elasticSearchPortString = ((String)elasticSearchPortObject).trim();
                if (elasticSearchPortString.isEmpty()) {
                    elasticSearchPort = ((int)9300);
                } else {
                    elasticSearchPort = Integer.parseInt(elasticSearchPortString);
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

        final Integer objectSummariesResultCacheSize;
        {
            Object objectSummariesResultCacheSizeObject = __properties.remove("object_summaries_result_cache_size");
            if (!(objectSummariesResultCacheSizeObject instanceof String)) {
                objectSummariesResultCacheSize = ((int)1024);
            } else {
                final String objectSummariesResultCacheSizeString = ((String)objectSummariesResultCacheSizeObject).trim();
                if (objectSummariesResultCacheSizeString.isEmpty()) {
                    objectSummariesResultCacheSize = ((int)1024);
                } else {
                    objectSummariesResultCacheSize = Integer.parseInt(objectSummariesResultCacheSizeString);
                }
            }
        }

        final Integer objectSummaryCacheSize;
        {
            Object objectSummaryCacheSizeObject = __properties.remove("object_summary_cache_size");
            if (!(objectSummaryCacheSizeObject instanceof String)) {
                objectSummaryCacheSize = ((int)1024);
            } else {
                final String objectSummaryCacheSizeString = ((String)objectSummaryCacheSizeObject).trim();
                if (objectSummaryCacheSizeString.isEmpty()) {
                    objectSummaryCacheSize = ((int)1024);
                } else {
                    objectSummaryCacheSize = Integer.parseInt(objectSummaryCacheSizeString);
                }
            }
        }

        final Integer resummarizeObjectsBulkRequestSize;
        {
            Object resummarizeObjectsBulkRequestSizeObject = __properties.remove("resummarize_objects_bulk_request_size");
            if (!(resummarizeObjectsBulkRequestSizeObject instanceof String)) {
                resummarizeObjectsBulkRequestSize = ((int)1000);
            } else {
                final String resummarizeObjectsBulkRequestSizeString = ((String)resummarizeObjectsBulkRequestSizeObject).trim();
                if (resummarizeObjectsBulkRequestSizeString.isEmpty()) {
                    resummarizeObjectsBulkRequestSize = ((int)1000);
                } else {
                    resummarizeObjectsBulkRequestSize = Integer.parseInt(resummarizeObjectsBulkRequestSizeString);
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return DressDiscoverProperties.create(apiUrl, cacheCollections, cacheInstitutions, elasticSearchHost, elasticSearchPort, environment, googleApiKey, googleOauthKey, googleOauthSecret, homeDirectoryPath, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
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
        int elasticSearchPort = ((int)9300);
        String environment = null;
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;
        String homeDirectoryPath = null;
        int objectSummariesResultCacheSize = ((int)1024);
        int objectSummaryCacheSize = ((int)1024);
        int resummarizeObjectsBulkRequestSize = ((int)1000);

        try {
            iprot.readListBegin();
            try {
                apiUrl = org.thryft.native_.Url.parse(iprot.readString());
            } catch (final java.lang.IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.API_URL, e);
            }
            cacheCollections = iprot.readBool();
            cacheInstitutions = iprot.readBool();
            elasticSearchHost = iprot.readString();
            try {
                elasticSearchPort = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
            }
            environment = iprot.readString();
            googleApiKey = iprot.readString();
            googleOauthKey = iprot.readString();
            googleOauthSecret = iprot.readString();
            homeDirectoryPath = iprot.readString();
            try {
                objectSummariesResultCacheSize = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE, e);
            }
            try {
                objectSummaryCacheSize = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE, e);
            }
            try {
                resummarizeObjectsBulkRequestSize = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE, e);
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new DressDiscoverProperties(DefaultReadValidator.getInstance().validateApiUrl(apiUrl), DefaultReadValidator.getInstance().validateCacheCollections(cacheCollections), DefaultReadValidator.getInstance().validateCacheInstitutions(cacheInstitutions), DefaultReadValidator.getInstance().validateElasticSearchHost(elasticSearchHost), DefaultReadValidator.getInstance().validateElasticSearchPort(elasticSearchPort), DefaultReadValidator.getInstance().validateEnvironment(environment), DefaultReadValidator.getInstance().validateGoogleApiKey(googleApiKey), DefaultReadValidator.getInstance().validateGoogleOauthKey(googleOauthKey), DefaultReadValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), DefaultReadValidator.getInstance().validateHomeDirectoryPath(homeDirectoryPath), DefaultReadValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), DefaultReadValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), DefaultReadValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
    }

    public static DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DressDiscoverProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        String elasticSearchHost = "elasticsearch";
        int elasticSearchPort = ((int)9300);
        String environment = null;
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;
        String homeDirectoryPath = null;
        int objectSummariesResultCacheSize = ((int)1024);
        int objectSummaryCacheSize = ((int)1024);
        int resummarizeObjectsBulkRequestSize = ((int)1000);

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "api_url": {
                    try {
                        apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                    } catch (final java.lang.IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.API_URL, e);
                    }
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
                    try {
                        elasticSearchPort = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
                    }
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
                    try {
                        objectSummariesResultCacheSize = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE, e);
                    }
                    break;
                }
                case "object_summary_cache_size": {
                    try {
                        objectSummaryCacheSize = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE, e);
                    }
                    break;
                }
                case "resummarize_objects_bulk_request_size": {
                    try {
                        resummarizeObjectsBulkRequestSize = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE, e);
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
        return new DressDiscoverProperties(DefaultReadValidator.getInstance().validateApiUrl(apiUrl), DefaultReadValidator.getInstance().validateCacheCollections(cacheCollections), DefaultReadValidator.getInstance().validateCacheInstitutions(cacheInstitutions), DefaultReadValidator.getInstance().validateElasticSearchHost(elasticSearchHost), DefaultReadValidator.getInstance().validateElasticSearchPort(elasticSearchPort), DefaultReadValidator.getInstance().validateEnvironment(environment), DefaultReadValidator.getInstance().validateGoogleApiKey(googleApiKey), DefaultReadValidator.getInstance().validateGoogleOauthKey(googleOauthKey), DefaultReadValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), DefaultReadValidator.getInstance().validateHomeDirectoryPath(homeDirectoryPath), DefaultReadValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), DefaultReadValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), DefaultReadValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceApiUrl(final org.thryft.native_.Url apiUrl) {
        return new DressDiscoverProperties(DefaultConstructionValidator.getInstance().validateApiUrl(apiUrl), this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceCacheCollections(final boolean cacheCollections) {
        return new DressDiscoverProperties(this.apiUrl, DefaultConstructionValidator.getInstance().validateCacheCollections(cacheCollections), this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceCacheInstitutions(final boolean cacheInstitutions) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, DefaultConstructionValidator.getInstance().validateCacheInstitutions(cacheInstitutions), this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceElasticSearchHost(final String elasticSearchHost) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, DefaultConstructionValidator.getInstance().validateElasticSearchHost(elasticSearchHost), this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceElasticSearchPort(final int elasticSearchPort) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, DefaultConstructionValidator.getInstance().validateElasticSearchPort(elasticSearchPort), this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceEnvironment(final String environment) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, DefaultConstructionValidator.getInstance().validateEnvironment(environment), this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceGoogleApiKey(final String googleApiKey) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, DefaultConstructionValidator.getInstance().validateGoogleApiKey(googleApiKey), this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceGoogleOauthKey(final String googleOauthKey) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, DefaultConstructionValidator.getInstance().validateGoogleOauthKey(googleOauthKey), this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceGoogleOauthSecret(final String googleOauthSecret) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, DefaultConstructionValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceHomeDirectoryPath(final String homeDirectoryPath) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, DefaultConstructionValidator.getInstance().validateHomeDirectoryPath(homeDirectoryPath), this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, DefaultConstructionValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceObjectSummaryCacheSize(final int objectSummaryCacheSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, DefaultConstructionValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public DressDiscoverProperties replaceResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
        return new DressDiscoverProperties(this.apiUrl, this.cacheCollections, this.cacheInstitutions, this.elasticSearchHost, this.elasticSearchPort, this.environment, this.googleApiKey, this.googleOauthKey, this.googleOauthSecret, this.homeDirectoryPath, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, DefaultConstructionValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
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

        oprot.writeI32(getElasticSearchPort());

        oprot.writeString(getEnvironment());

        oprot.writeString(getGoogleApiKey());

        oprot.writeString(getGoogleOauthKey());

        oprot.writeString(getGoogleOauthSecret());

        oprot.writeString(getHomeDirectoryPath());

        oprot.writeI32(getObjectSummariesResultCacheSize());

        oprot.writeI32(getObjectSummaryCacheSize());

        oprot.writeI32(getResummarizeObjectsBulkRequestSize());

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
        oprot.writeI32(getElasticSearchPort());
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
        oprot.writeI32(getObjectSummariesResultCacheSize());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("object_summary_cache_size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getObjectSummaryCacheSize());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("resummarize_objects_bulk_request_size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getResummarizeObjectsBulkRequestSize());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.thryft.native_.Url apiUrl;

    private final boolean cacheCollections;

    private final boolean cacheInstitutions;

    private final String elasticSearchHost;

    private final int elasticSearchPort;

    /**
     * dev, staging, production, etc.
     */
    private final String environment;

    private final String googleApiKey;

    private final String googleOauthKey;

    private final String googleOauthSecret;

    private final String homeDirectoryPath;

    private final int objectSummariesResultCacheSize;

    private final int objectSummaryCacheSize;

    private final int resummarizeObjectsBulkRequestSize;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(DressDiscoverProperties.class);
}
