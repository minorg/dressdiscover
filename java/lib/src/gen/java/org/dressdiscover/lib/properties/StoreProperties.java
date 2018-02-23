package org.dressdiscover.lib.properties;

public final class StoreProperties implements org.thryft.waf.lib.Properties {
    public final static class Builder {
        public Builder() {
            cacheCollections = true;
            cacheInstitutions = true;
            dataDirectoryPath = null;
            elasticSearchHost = com.google.common.net.HostAndPort.fromString("elasticsearch:9300");
            mongoHosts = com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017"));
            objectSummariesResultCacheSize = 1024;
            objectSummaryCacheSize = 1024;
            resummarizeObjectsBulkRequestSize = 1000;
        }

        public Builder(final StoreProperties other) {
            this.cacheCollections = other.getCacheCollections();
            this.cacheInstitutions = other.getCacheInstitutions();
            this.dataDirectoryPath = other.getDataDirectoryPath();
            this.elasticSearchHost = other.getElasticSearchHost();
            this.mongoHosts = other.getMongoHosts();
            this.objectSummariesResultCacheSize = other.getObjectSummariesResultCacheSize();
            this.objectSummaryCacheSize = other.getObjectSummaryCacheSize();
            this.resummarizeObjectsBulkRequestSize = other.getResummarizeObjectsBulkRequestSize();
        }

        protected StoreProperties _build(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final com.google.common.net.HostAndPort elasticSearchHost, final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
            return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        }

        public StoreProperties build() {
            UncheckedValidator.validate(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);

            return _build(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        }

        public final boolean getCacheCollections() {
            return cacheCollections;
        }

        public final boolean getCacheInstitutions() {
            return cacheInstitutions;
        }

        public final @javax.annotation.Nullable String getDataDirectoryPath() {
            return dataDirectoryPath;
        }

        public final @javax.annotation.Nullable com.google.common.net.HostAndPort getElasticSearchHost() {
            return elasticSearchHost;
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> getMongoHosts() {
            return mongoHosts;
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
                cacheCollections = iprot.readBool();
                cacheInstitutions = iprot.readBool();
                dataDirectoryPath = iprot.readString();
                try {
                    elasticSearchHost = com.google.common.net.HostAndPort.fromString(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, e);
                }
                try {
                    mongoHosts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<com.google.common.net.HostAndPort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(com.google.common.net.HostAndPort.fromString(iprot.readString()));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MONGO_HOSTS, e.getCause());
                }
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
                    case "cache_collections": {
                        cacheCollections = iprot.readBool();
                        break;
                    }
                    case "cache_institutions": {
                        cacheInstitutions = iprot.readBool();
                        break;
                    }
                    case "data_directory_path": {
                        dataDirectoryPath = iprot.readString();
                        break;
                    }
                    case "elastic_search_host": {
                        try {
                            elasticSearchHost = com.google.common.net.HostAndPort.fromString(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, e);
                        }
                        break;
                    }
                    case "mongo_hosts": {
                        try {
                            mongoHosts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<com.google.common.net.HostAndPort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(com.google.common.net.HostAndPort.fromString(iprot.readString()));
                                            } catch (final IllegalArgumentException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MONGO_HOSTS, e.getCause());
                        }
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case CACHE_COLLECTIONS: setCacheCollections((boolean)value); return this;
            case CACHE_INSTITUTIONS: setCacheInstitutions((boolean)value); return this;
            case DATA_DIRECTORY_PATH: setDataDirectoryPath((String)value); return this;
            case ELASTIC_SEARCH_HOST: setElasticSearchHost((com.google.common.net.HostAndPort)value); return this;
            case MONGO_HOSTS: setMongoHosts((com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>)value); return this;
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: setObjectSummariesResultCacheSize((int)value); return this;
            case OBJECT_SUMMARY_CACHE_SIZE: setObjectSummaryCacheSize((int)value); return this;
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: setResummarizeObjectsBulkRequestSize((int)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCacheCollections(final boolean cacheCollections) {
            UncheckedValidator.validateCacheCollections(cacheCollections);
            this.cacheCollections = cacheCollections;
            return this;
        }

        public Builder setCacheInstitutions(final boolean cacheInstitutions) {
            UncheckedValidator.validateCacheInstitutions(cacheInstitutions);
            this.cacheInstitutions = cacheInstitutions;
            return this;
        }

        public Builder setDataDirectoryPath(final String dataDirectoryPath) {
            UncheckedValidator.validateDataDirectoryPath(dataDirectoryPath);
            this.dataDirectoryPath = dataDirectoryPath;
            return this;
        }

        public Builder setElasticSearchHost(final com.google.common.net.HostAndPort elasticSearchHost) {
            UncheckedValidator.validateElasticSearchHost(elasticSearchHost);
            this.elasticSearchHost = elasticSearchHost;
            return this;
        }

        public Builder setIfPresent(final StoreProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCacheCollections(other.getCacheCollections());
            setCacheInstitutions(other.getCacheInstitutions());
            setDataDirectoryPath(other.getDataDirectoryPath());
            setElasticSearchHost(other.getElasticSearchHost());
            setMongoHosts(other.getMongoHosts());
            setObjectSummariesResultCacheSize(other.getObjectSummariesResultCacheSize());
            setObjectSummaryCacheSize(other.getObjectSummaryCacheSize());
            setResummarizeObjectsBulkRequestSize(other.getResummarizeObjectsBulkRequestSize());

            return this;
        }

        public Builder setMongoHosts(final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts) {
            UncheckedValidator.validateMongoHosts(mongoHosts);
            this.mongoHosts = mongoHosts;
            return this;
        }

        public Builder setObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
            UncheckedValidator.validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
            this.objectSummariesResultCacheSize = objectSummariesResultCacheSize;
            return this;
        }

        public Builder setObjectSummaryCacheSize(final int objectSummaryCacheSize) {
            UncheckedValidator.validateObjectSummaryCacheSize(objectSummaryCacheSize);
            this.objectSummaryCacheSize = objectSummaryCacheSize;
            return this;
        }

        public Builder setResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
            UncheckedValidator.validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
            this.resummarizeObjectsBulkRequestSize = resummarizeObjectsBulkRequestSize;
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
            case CACHE_COLLECTIONS: return unsetCacheCollections();
            case CACHE_INSTITUTIONS: return unsetCacheInstitutions();
            case DATA_DIRECTORY_PATH: return unsetDataDirectoryPath();
            case ELASTIC_SEARCH_HOST: return unsetElasticSearchHost();
            case MONGO_HOSTS: return unsetMongoHosts();
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: return unsetObjectSummariesResultCacheSize();
            case OBJECT_SUMMARY_CACHE_SIZE: return unsetObjectSummaryCacheSize();
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: return unsetResummarizeObjectsBulkRequestSize();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCacheCollections() {
            this.cacheCollections = true;
            return this;
        }

        public Builder unsetCacheInstitutions() {
            this.cacheInstitutions = true;
            return this;
        }

        public Builder unsetDataDirectoryPath() {
            this.dataDirectoryPath = null;
            return this;
        }

        public Builder unsetElasticSearchHost() {
            this.elasticSearchHost = com.google.common.net.HostAndPort.fromString("elasticsearch:9300");
            return this;
        }

        public Builder unsetMongoHosts() {
            this.mongoHosts = com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017"));
            return this;
        }

        public Builder unsetObjectSummariesResultCacheSize() {
            this.objectSummariesResultCacheSize = 1024;
            return this;
        }

        public Builder unsetObjectSummaryCacheSize() {
            this.objectSummaryCacheSize = 1024;
            return this;
        }

        public Builder unsetResummarizeObjectsBulkRequestSize() {
            this.resummarizeObjectsBulkRequestSize = 1000;
            return this;
        }

        private boolean cacheCollections;
        private boolean cacheInstitutions;
        private @javax.annotation.Nullable String dataDirectoryPath;
        private @javax.annotation.Nullable com.google.common.net.HostAndPort elasticSearchHost;
        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts;
        private int objectSummariesResultCacheSize;
        private int objectSummaryCacheSize;
        private int resummarizeObjectsBulkRequestSize;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<StoreProperties> {
        @Override
        public StoreProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return StoreProperties.readAs(iprot, type);
        }

        @Override
        public StoreProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return StoreProperties.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public StoreProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return StoreProperties.readAsList(iprot);
        }

        @Override
        public StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return StoreProperties.readAsStruct(iprot);
        }

        @Override
        public StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return StoreProperties.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CACHE_COLLECTIONS("cacheCollections", new com.google.common.reflect.TypeToken<Boolean>() {}, true, (short)0, "cache_collections", org.thryft.protocol.Type.BOOL),
        CACHE_INSTITUTIONS("cacheInstitutions", new com.google.common.reflect.TypeToken<Boolean>() {}, true, (short)0, "cache_institutions", org.thryft.protocol.Type.BOOL),
        DATA_DIRECTORY_PATH("dataDirectoryPath", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "data_directory_path", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_HOST("elasticSearchHost", new com.google.common.reflect.TypeToken<com.google.common.net.HostAndPort>() {}, true, (short)0, "elastic_search_host", org.thryft.protocol.Type.STRING),
        MONGO_HOSTS("mongoHosts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {}, true, (short)0, "mongo_hosts", org.thryft.protocol.Type.LIST),
        OBJECT_SUMMARIES_RESULT_CACHE_SIZE("objectSummariesResultCacheSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, (short)0, "object_summaries_result_cache_size", org.thryft.protocol.Type.I32),
        OBJECT_SUMMARY_CACHE_SIZE("objectSummaryCacheSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, (short)0, "object_summary_cache_size", org.thryft.protocol.Type.I32),
        RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE("resummarizeObjectsBulkRequestSize", new com.google.common.reflect.TypeToken<Integer>() {}, true, (short)0, "resummarize_objects_bulk_request_size", org.thryft.protocol.Type.I32);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
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
            case "cacheCollections": return CACHE_COLLECTIONS;
            case "cacheInstitutions": return CACHE_INSTITUTIONS;
            case "dataDirectoryPath": return DATA_DIRECTORY_PATH;
            case "elasticSearchHost": return ELASTIC_SEARCH_HOST;
            case "mongoHosts": return MONGO_HOSTS;
            case "objectSummariesResultCacheSize": return OBJECT_SUMMARIES_RESULT_CACHE_SIZE;
            case "objectSummaryCacheSize": return OBJECT_SUMMARY_CACHE_SIZE;
            case "resummarizeObjectsBulkRequestSize": return RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "cache_collections": return CACHE_COLLECTIONS;
            case "cache_institutions": return CACHE_INSTITUTIONS;
            case "data_directory_path": return DATA_DIRECTORY_PATH;
            case "elastic_search_host": return ELASTIC_SEARCH_HOST;
            case "mongo_hosts": return MONGO_HOSTS;
            case "object_summaries_result_cache_size": return OBJECT_SUMMARIES_RESULT_CACHE_SIZE;
            case "object_summary_cache_size": return OBJECT_SUMMARY_CACHE_SIZE;
            case "resummarize_objects_bulk_request_size": return RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final com.google.common.net.HostAndPort elasticSearchHost, final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) throws org.thryft.protocol.InputProtocolException {
            validateCacheCollections(cacheCollections);
            validateCacheInstitutions(cacheInstitutions);
            validateDataDirectoryPath(dataDirectoryPath);
            validateElasticSearchHost(elasticSearchHost);
            validateMongoHosts(mongoHosts);
            validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
            validateObjectSummaryCacheSize(objectSummaryCacheSize);
            validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
        }

        public static void validateCacheCollections(final boolean cacheCollections) {
        }

        public static void validateCacheInstitutions(final boolean cacheInstitutions) {
        }

        public static void validateDataDirectoryPath(final String dataDirectoryPath) throws org.thryft.protocol.InputProtocolException {
            if (dataDirectoryPath == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATA_DIRECTORY_PATH, "org.dressdiscover.lib.properties.StoreProperties: dataDirectoryPath is null");
            }
        }

        public static void validateElasticSearchHost(final com.google.common.net.HostAndPort elasticSearchHost) throws org.thryft.protocol.InputProtocolException {
            if (elasticSearchHost == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, "org.dressdiscover.lib.properties.StoreProperties: elasticSearchHost is null");
            }
        }

        public static void validateMongoHosts(final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts) throws org.thryft.protocol.InputProtocolException {
            if (mongoHosts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MONGO_HOSTS, "org.dressdiscover.lib.properties.StoreProperties: mongoHosts is null");
            }
        }

        public static void validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
        }

        public static void validateObjectSummaryCacheSize(final int objectSummaryCacheSize) {
        }

        public static void validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final com.google.common.net.HostAndPort elasticSearchHost, final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
            validateCacheCollections(cacheCollections);
            validateCacheInstitutions(cacheInstitutions);
            validateDataDirectoryPath(dataDirectoryPath);
            validateElasticSearchHost(elasticSearchHost);
            validateMongoHosts(mongoHosts);
            validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
            validateObjectSummaryCacheSize(objectSummaryCacheSize);
            validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
        }

        public static void validateCacheCollections(final boolean cacheCollections) {
        }

        public static void validateCacheInstitutions(final boolean cacheInstitutions) {
        }

        public static void validateDataDirectoryPath(final String dataDirectoryPath) {
            if (dataDirectoryPath == null) {
                throw new NullPointerException("org.dressdiscover.lib.properties.StoreProperties: dataDirectoryPath is null");
            }
        }

        public static void validateElasticSearchHost(final com.google.common.net.HostAndPort elasticSearchHost) {
            if (elasticSearchHost == null) {
                throw new NullPointerException("org.dressdiscover.lib.properties.StoreProperties: elasticSearchHost is null");
            }
        }

        public static void validateMongoHosts(final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts) {
            if (mongoHosts == null) {
                throw new NullPointerException("org.dressdiscover.lib.properties.StoreProperties: mongoHosts is null");
            }
        }

        public static void validateObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
        }

        public static void validateObjectSummaryCacheSize(final int objectSummaryCacheSize) {
        }

        public static void validateResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
        }
    }

    /**
     * Copy constructor
     */
    public StoreProperties(final StoreProperties other) {
        this(other.getCacheCollections(), other.getCacheInstitutions(), other.getDataDirectoryPath(), other.getElasticSearchHost(), other.getMongoHosts(), other.getObjectSummariesResultCacheSize(), other.getObjectSummaryCacheSize(), other.getResummarizeObjectsBulkRequestSize());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected StoreProperties(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final com.google.common.net.HostAndPort elasticSearchHost, final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
        this.cacheCollections = cacheCollections;
        this.cacheInstitutions = cacheInstitutions;
        this.dataDirectoryPath = dataDirectoryPath;
        this.elasticSearchHost = elasticSearchHost;
        this.mongoHosts = mongoHosts;
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

        try (final java.io.InputStream propertiesInputStream = StoreProperties.class
                .getResourceAsStream(propertiesResourceName)) {
            if (propertiesInputStream == null) {
                logger.debug("properties file {} not found in the CLASSPATH", propertiesResourceName);
                return properties;
            }

            properties.load(propertiesInputStream);
            logger.debug("read properties file {} from CLASSPATH", propertiesResourceName);
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {} from the CLASSPATH: ", propertiesResourceName, e);
        }
        return properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final StoreProperties other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<StoreProperties> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static StoreProperties create(final String dataDirectoryPath) {
        UncheckedValidator.validate(true, true, dataDirectoryPath, com.google.common.net.HostAndPort.fromString("elasticsearch:9300"), com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017")), 1024, 1024, 1000);
        return new StoreProperties(true, true, dataDirectoryPath, com.google.common.net.HostAndPort.fromString("elasticsearch:9300"), com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017")), 1024, 1024, 1000);
    }

    /**
     * Total boxed factory method
     */
    public static StoreProperties create(Boolean cacheCollections, Boolean cacheInstitutions, String dataDirectoryPath, com.google.common.net.HostAndPort elasticSearchHost, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, Integer objectSummariesResultCacheSize, Integer objectSummaryCacheSize, Integer resummarizeObjectsBulkRequestSize) {
        UncheckedValidator.validate(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    /**
     * Optional factory method
     */
    public static StoreProperties create(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final com.google.common.net.HostAndPort elasticSearchHost, final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
        UncheckedValidator.validate(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof StoreProperties)) {
            return false;
        }

        final StoreProperties other = (StoreProperties)otherObject;

        if (!(getCacheCollections() == other.getCacheCollections())) {
            return false;
        }

        if (!(getCacheInstitutions() == other.getCacheInstitutions())) {
            return false;
        }

        if (!(getDataDirectoryPath().equals(other.getDataDirectoryPath()))) {
            return false;
        }

        if (!(getElasticSearchHost().equals(other.getElasticSearchHost()))) {
            return false;
        }

        if (!(getMongoHosts().equals(other.getMongoHosts()))) {
            return false;
        }

        if (!(getObjectSummariesResultCacheSize() == other.getObjectSummariesResultCacheSize())) {
            return false;
        }

        if (!(getObjectSummaryCacheSize() == other.getObjectSummaryCacheSize())) {
            return false;
        }

        if (!(getResummarizeObjectsBulkRequestSize() == other.getResummarizeObjectsBulkRequestSize())) {
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
        case CACHE_COLLECTIONS: return getCacheCollections();
        case CACHE_INSTITUTIONS: return getCacheInstitutions();
        case DATA_DIRECTORY_PATH: return getDataDirectoryPath();
        case ELASTIC_SEARCH_HOST: return getElasticSearchHost();
        case MONGO_HOSTS: return getMongoHosts();
        case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: return getObjectSummariesResultCacheSize();
        case OBJECT_SUMMARY_CACHE_SIZE: return getObjectSummaryCacheSize();
        case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: return getResummarizeObjectsBulkRequestSize();
        default:
            throw new IllegalStateException();
        }
    }

    public final boolean getCacheCollections() {
        return cacheCollections;
    }

    public final boolean getCacheInstitutions() {
        return cacheInstitutions;
    }

    public final String getDataDirectoryPath() {
        return dataDirectoryPath;
    }

    public final com.google.common.net.HostAndPort getElasticSearchHost() {
        return elasticSearchHost;
    }

    public final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> getMongoHosts() {
        return mongoHosts;
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
        hashCode = 31 * hashCode + (getCacheCollections() ? 1 : 0);
        hashCode = 31 * hashCode + (getCacheInstitutions() ? 1 : 0);
        hashCode = 31 * hashCode + getDataDirectoryPath().hashCode();
        hashCode = 31 * hashCode + getElasticSearchHost().hashCode();
        hashCode = 31 * hashCode + getMongoHosts().hashCode();
        hashCode = 31 * hashCode + getObjectSummariesResultCacheSize();
        hashCode = 31 * hashCode + getObjectSummaryCacheSize();
        hashCode = 31 * hashCode + getResummarizeObjectsBulkRequestSize();
        return hashCode;
    }


    public static StoreProperties load() {
        return load(com.google.common.base.Optional.<java.io.File> absent());
    }

    public static StoreProperties load(final com.google.common.base.Optional<java.io.File> commandLinePropertiesFilePath) {
        java.util.Properties __properties = new java.util.Properties();

        String[] __propertyNames = {"cache_collections", "cache_institutions", "data_directory_path", "elastic_search_host", "mongo_hosts", "object_summaries_result_cache_size", "object_summary_cache_size", "resummarize_objects_bulk_request_size"};
        for (final String propertyName : __propertyNames) {
            final String propertyValue = System.getenv("DRESSDISCOVER_" + propertyName.toUpperCase());
            if (propertyValue != null) {
                __properties.put(propertyName, propertyValue);
            }
        }

        __properties = __mergeProperties(__properties, __readProperties("store.properties"));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                "/etc/dressdiscover/store.properties")));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                new java.io.File(new java.io.File(System.getProperty("user.home")),
                        ".dressdiscover"), "store.properties")));
        if (commandLinePropertiesFilePath.isPresent()) {
            __properties = __mergeProperties(__properties,
                    __readProperties(commandLinePropertiesFilePath.get()));
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

        final String dataDirectoryPath;
        {
            Object dataDirectoryPathObject = __properties.remove("data_directory_path");
            if (!(dataDirectoryPathObject instanceof String)) {
                throw new RuntimeException("no such property data_directory_path");
            } else {
                final String dataDirectoryPathString = ((String)dataDirectoryPathObject).trim();
                if (dataDirectoryPathString.isEmpty()) {
                    throw new RuntimeException("property data_directory_path is empty");
                } else {
                    dataDirectoryPath = dataDirectoryPathString;
                }
            }
        }

        final com.google.common.net.HostAndPort elasticSearchHost;
        {
            Object elasticSearchHostObject = __properties.remove("elastic_search_host");
            if (!(elasticSearchHostObject instanceof String)) {
                elasticSearchHost = com.google.common.net.HostAndPort.fromString("elasticsearch:9300");
            } else {
                final String elasticSearchHostString = ((String)elasticSearchHostObject).trim();
                if (elasticSearchHostString.isEmpty()) {
                    elasticSearchHost = com.google.common.net.HostAndPort.fromString("elasticsearch:9300");
                } else {
                    elasticSearchHost = com.google.common.net.HostAndPort.fromString(elasticSearchHostString);
                }
            }
        }

        final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts;
        {
            Object mongoHostsObject = __properties.remove("mongo_hosts");
            if (!(mongoHostsObject instanceof String)) {
                mongoHosts = com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017"));
            } else {
                final String mongoHostsString = ((String)mongoHostsObject).trim();
                if (mongoHostsString.isEmpty()) {
                    mongoHosts = com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017"));
                } else {
                    mongoHosts = (new com.google.common.base.Function<String, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {
            @Override
            public com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> apply(final String value) {
                final com.google.common.collect.ImmutableList.Builder<com.google.common.net.HostAndPort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                for (final String elementString : value.split(",")) {
                    sequenceBuilder.add(com.google.common.net.HostAndPort.fromString(elementString));
                }
                return sequenceBuilder.build();
            }
        }).apply(mongoHostsString.toString());
                }
            }
        }

        final Integer objectSummariesResultCacheSize;
        {
            Object objectSummariesResultCacheSizeObject = __properties.remove("object_summaries_result_cache_size");
            if (!(objectSummariesResultCacheSizeObject instanceof String)) {
                objectSummariesResultCacheSize = 1024;
            } else {
                final String objectSummariesResultCacheSizeString = ((String)objectSummariesResultCacheSizeObject).trim();
                if (objectSummariesResultCacheSizeString.isEmpty()) {
                    objectSummariesResultCacheSize = 1024;
                } else {
                    objectSummariesResultCacheSize = Integer.parseInt(objectSummariesResultCacheSizeString);
                }
            }
        }

        final Integer objectSummaryCacheSize;
        {
            Object objectSummaryCacheSizeObject = __properties.remove("object_summary_cache_size");
            if (!(objectSummaryCacheSizeObject instanceof String)) {
                objectSummaryCacheSize = 1024;
            } else {
                final String objectSummaryCacheSizeString = ((String)objectSummaryCacheSizeObject).trim();
                if (objectSummaryCacheSizeString.isEmpty()) {
                    objectSummaryCacheSize = 1024;
                } else {
                    objectSummaryCacheSize = Integer.parseInt(objectSummaryCacheSizeString);
                }
            }
        }

        final Integer resummarizeObjectsBulkRequestSize;
        {
            Object resummarizeObjectsBulkRequestSizeObject = __properties.remove("resummarize_objects_bulk_request_size");
            if (!(resummarizeObjectsBulkRequestSizeObject instanceof String)) {
                resummarizeObjectsBulkRequestSize = 1000;
            } else {
                final String resummarizeObjectsBulkRequestSizeString = ((String)resummarizeObjectsBulkRequestSizeObject).trim();
                if (resummarizeObjectsBulkRequestSizeString.isEmpty()) {
                    resummarizeObjectsBulkRequestSize = 1000;
                } else {
                    resummarizeObjectsBulkRequestSize = Integer.parseInt(resummarizeObjectsBulkRequestSizeString);
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return StoreProperties.create(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public static StoreProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static StoreProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static StoreProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        boolean cacheCollections;
        boolean cacheInstitutions;
        String dataDirectoryPath;
        com.google.common.net.HostAndPort elasticSearchHost;
        com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts;
        int objectSummariesResultCacheSize;
        int objectSummaryCacheSize;
        int resummarizeObjectsBulkRequestSize;

        try {
            iprot.readListBegin();
            cacheCollections = iprot.readBool();
            cacheInstitutions = iprot.readBool();
            dataDirectoryPath = iprot.readString();
            try {
                elasticSearchHost = com.google.common.net.HostAndPort.fromString(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, e);
            }
            try {
                mongoHosts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<com.google.common.net.HostAndPort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(com.google.common.net.HostAndPort.fromString(iprot.readString()));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MONGO_HOSTS, e.getCause());
            }
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

        ReadValidator.validate(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);

        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public static StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        @javax.annotation.Nullable String dataDirectoryPath = null;
        com.google.common.net.HostAndPort elasticSearchHost = com.google.common.net.HostAndPort.fromString("elasticsearch:9300");
        com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts = com.google.common.collect.ImmutableList.<com.google.common.net.HostAndPort> of(com.google.common.net.HostAndPort.fromString("mongodb:27017"));
        int objectSummariesResultCacheSize = 1024;
        int objectSummaryCacheSize = 1024;
        int resummarizeObjectsBulkRequestSize = 1000;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "cache_collections": {
                    cacheCollections = iprot.readBool();
                    break;
                }
                case "cache_institutions": {
                    cacheInstitutions = iprot.readBool();
                    break;
                }
                case "data_directory_path": {
                    dataDirectoryPath = iprot.readString();
                    break;
                }
                case "elastic_search_host": {
                    try {
                        elasticSearchHost = com.google.common.net.HostAndPort.fromString(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, e);
                    }
                    break;
                }
                case "mongo_hosts": {
                    try {
                        mongoHosts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<com.google.common.net.HostAndPort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(com.google.common.net.HostAndPort.fromString(iprot.readString()));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MONGO_HOSTS, e.getCause());
                    }
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

        ReadValidator.validate(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);

        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, mongoHosts, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceCacheCollections(final boolean cacheCollections) {
        UncheckedValidator.validateCacheCollections(cacheCollections);
        return new StoreProperties(cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceCacheInstitutions(final boolean cacheInstitutions) {
        UncheckedValidator.validateCacheInstitutions(cacheInstitutions);
        return new StoreProperties(this.cacheCollections, cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceDataDirectoryPath(final String dataDirectoryPath) {
        UncheckedValidator.validateDataDirectoryPath(dataDirectoryPath);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceElasticSearchHost(final com.google.common.net.HostAndPort elasticSearchHost) {
        UncheckedValidator.validateElasticSearchHost(elasticSearchHost);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceMongoHosts(final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts) {
        UncheckedValidator.validateMongoHosts(mongoHosts);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
        UncheckedValidator.validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceObjectSummaryCacheSize(final int objectSummaryCacheSize) {
        UncheckedValidator.validateObjectSummaryCacheSize(objectSummaryCacheSize);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize);
    }

    public StoreProperties replaceResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
        UncheckedValidator.validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize);
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.mongoHosts, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("cache_collections", getCacheCollections());
        builder.put("cache_institutions", getCacheInstitutions());
        builder.put("data_directory_path", getDataDirectoryPath());
        builder.put("elastic_search_host", getElasticSearchHost());
        builder.put("mongo_hosts", getMongoHosts());
        builder.put("object_summaries_result_cache_size", getObjectSummariesResultCacheSize());
        builder.put("object_summary_cache_size", getObjectSummaryCacheSize());
        builder.put("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize());
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("cache_collections", getCacheCollections()).add("cache_institutions", getCacheInstitutions()).add("data_directory_path", getDataDirectoryPath()).add("elastic_search_host", getElasticSearchHost()).add("mongo_hosts", getMongoHosts()).add("object_summaries_result_cache_size", getObjectSummariesResultCacheSize()).add("object_summary_cache_size", getObjectSummaryCacheSize()).add("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

        oprot.writeBool(getCacheCollections());

        oprot.writeBool(getCacheInstitutions());

        oprot.writeString(getDataDirectoryPath());

        oprot.writeString(getElasticSearchHost().toString());

        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMongoHosts().size());
        for (final com.google.common.net.HostAndPort _iter0 : getMongoHosts()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();

        oprot.writeI32(getObjectSummariesResultCacheSize());

        oprot.writeI32(getObjectSummaryCacheSize());

        oprot.writeI32(getResummarizeObjectsBulkRequestSize());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.lib.properties.StoreProperties");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCacheCollectionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.CACHE_COLLECTIONS);
        oprot.writeBool(getCacheCollections());
        oprot.writeFieldEnd();
    }

    public void writeCacheInstitutionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.CACHE_INSTITUTIONS);
        oprot.writeBool(getCacheInstitutions());
        oprot.writeFieldEnd();
    }

    public void writeDataDirectoryPathField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.DATA_DIRECTORY_PATH);
        oprot.writeString(getDataDirectoryPath());
        oprot.writeFieldEnd();
    }

    public void writeElasticSearchHostField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ELASTIC_SEARCH_HOST);
        oprot.writeString(getElasticSearchHost().toString());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCacheCollectionsField(oprot);

        writeCacheInstitutionsField(oprot);

        writeDataDirectoryPathField(oprot);

        writeElasticSearchHostField(oprot);

        writeMongoHostsField(oprot);

        writeObjectSummariesResultCacheSizeField(oprot);

        writeObjectSummaryCacheSizeField(oprot);

        writeResummarizeObjectsBulkRequestSizeField(oprot);

        oprot.writeFieldStop();
    }

    public void writeMongoHostsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.MONGO_HOSTS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMongoHosts().size());
        for (final com.google.common.net.HostAndPort _iter0 : getMongoHosts()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    public void writeObjectSummariesResultCacheSizeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE);
        oprot.writeI32(getObjectSummariesResultCacheSize());
        oprot.writeFieldEnd();
    }

    public void writeObjectSummaryCacheSizeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE);
        oprot.writeI32(getObjectSummaryCacheSize());
        oprot.writeFieldEnd();
    }

    public void writeResummarizeObjectsBulkRequestSizeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE);
        oprot.writeI32(getResummarizeObjectsBulkRequestSize());
        oprot.writeFieldEnd();
    }

    private final boolean cacheCollections;

    private final boolean cacheInstitutions;

    private final String dataDirectoryPath;

    private final com.google.common.net.HostAndPort elasticSearchHost;

    private final com.google.common.collect.ImmutableList<com.google.common.net.HostAndPort> mongoHosts;

    private final int objectSummariesResultCacheSize;

    private final int objectSummaryCacheSize;

    private final int resummarizeObjectsBulkRequestSize;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(StoreProperties.class);
}
