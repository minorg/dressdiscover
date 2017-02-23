package org.dressdiscover.lib.properties;

public final class StoreProperties implements org.thryft.Struct, org.thryft.waf.lib.Properties {
    public final static class Builder {
        public Builder() {
            cacheCollections = true;
            cacheInstitutions = true;
            dataDirectoryPath = null;
            elasticSearchHost = "elasticsearch";
            elasticSearchPort = 9300;
            objectSummariesResultCacheSize = 1024;
            objectSummaryCacheSize = 1024;
            resummarizeObjectsBulkRequestSize = 1000;
        }

        public Builder(final StoreProperties other) {
            this.cacheCollections = other.getCacheCollections();
            this.cacheInstitutions = other.getCacheInstitutions();
            this.dataDirectoryPath = other.getDataDirectoryPath();
            this.elasticSearchHost = other.getElasticSearchHost();
            this.elasticSearchPort = other.getElasticSearchPort();
            this.objectSummariesResultCacheSize = other.getObjectSummariesResultCacheSize();
            this.objectSummaryCacheSize = other.getObjectSummaryCacheSize();
            this.resummarizeObjectsBulkRequestSize = other.getResummarizeObjectsBulkRequestSize();
        }

        protected StoreProperties _build(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final String elasticSearchHost, final int elasticSearchPort, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
            return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, elasticSearchPort, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
        }

        public StoreProperties build() {
            return _build(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, elasticSearchPort, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
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

        public final String getElasticSearchHost() {
            return elasticSearchHost;
        }

        public final int getElasticSearchPort() {
            return elasticSearchPort;
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
                elasticSearchHost = iprot.readString();
                try {
                    elasticSearchPort = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
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
            case CACHE_COLLECTIONS: setCacheCollections((boolean)value); return this;
            case CACHE_INSTITUTIONS: setCacheInstitutions((boolean)value); return this;
            case DATA_DIRECTORY_PATH: setDataDirectoryPath((String)value); return this;
            case ELASTIC_SEARCH_HOST: setElasticSearchHost((String)value); return this;
            case ELASTIC_SEARCH_PORT: setElasticSearchPort((int)value); return this;
            case OBJECT_SUMMARIES_RESULT_CACHE_SIZE: setObjectSummariesResultCacheSize((int)value); return this;
            case OBJECT_SUMMARY_CACHE_SIZE: setObjectSummaryCacheSize((int)value); return this;
            case RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE: setResummarizeObjectsBulkRequestSize((int)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCacheCollections(final boolean cacheCollections) {
            this.cacheCollections = DefaultConstructionValidator.getInstance().validateCacheCollections(cacheCollections);
            return this;
        }

        public Builder setCacheInstitutions(final boolean cacheInstitutions) {
            this.cacheInstitutions = DefaultConstructionValidator.getInstance().validateCacheInstitutions(cacheInstitutions);
            return this;
        }

        public Builder setDataDirectoryPath(final String dataDirectoryPath) {
            this.dataDirectoryPath = DefaultConstructionValidator.getInstance().validateDataDirectoryPath(dataDirectoryPath);
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

        public Builder setIfPresent(final StoreProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCacheCollections(other.getCacheCollections());
            setCacheInstitutions(other.getCacheInstitutions());
            setDataDirectoryPath(other.getDataDirectoryPath());
            setElasticSearchHost(other.getElasticSearchHost());
            setElasticSearchPort(other.getElasticSearchPort());
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
            case CACHE_COLLECTIONS: return unsetCacheCollections();
            case CACHE_INSTITUTIONS: return unsetCacheInstitutions();
            case DATA_DIRECTORY_PATH: return unsetDataDirectoryPath();
            case ELASTIC_SEARCH_HOST: return unsetElasticSearchHost();
            case ELASTIC_SEARCH_PORT: return unsetElasticSearchPort();
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
            this.elasticSearchHost = "elasticsearch";
            return this;
        }

        public Builder unsetElasticSearchPort() {
            this.elasticSearchPort = 9300;
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

        private Boolean cacheCollections;
        private Boolean cacheInstitutions;
        private String dataDirectoryPath;
        private String elasticSearchHost;
        private Integer elasticSearchPort;
        private Integer objectSummariesResultCacheSize;
        private Integer objectSummaryCacheSize;
        private Integer resummarizeObjectsBulkRequestSize;
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
        CACHE_COLLECTIONS("cacheCollections", new com.google.common.reflect.TypeToken<Boolean>() {}, true, 0, "cache_collections", org.thryft.protocol.Type.BOOL),
        CACHE_INSTITUTIONS("cacheInstitutions", new com.google.common.reflect.TypeToken<Boolean>() {}, true, 0, "cache_institutions", org.thryft.protocol.Type.BOOL),
        DATA_DIRECTORY_PATH("dataDirectoryPath", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "data_directory_path", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_HOST("elasticSearchHost", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "elastic_search_host", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_PORT("elasticSearchPort", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "elastic_search_port", org.thryft.protocol.Type.I32),
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
            case "cacheCollections": return CACHE_COLLECTIONS;
            case "cacheInstitutions": return CACHE_INSTITUTIONS;
            case "dataDirectoryPath": return DATA_DIRECTORY_PATH;
            case "elasticSearchHost": return ELASTIC_SEARCH_HOST;
            case "elasticSearchPort": return ELASTIC_SEARCH_PORT;
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
            case "elastic_search_port": return ELASTIC_SEARCH_PORT;
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
        public boolean validateCacheCollections(final boolean cacheCollections) throws ExceptionT;

        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws ExceptionT;

        public String validateDataDirectoryPath(final String dataDirectoryPath) throws ExceptionT;

        public String validateElasticSearchHost(final String elasticSearchHost) throws ExceptionT;

        public int validateElasticSearchPort(final int elasticSearchPort) throws ExceptionT;

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
        public boolean validateCacheCollections(final boolean cacheCollections) throws RuntimeException {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws RuntimeException {
            return cacheInstitutions;
        }

        @Override
        public String validateDataDirectoryPath(final String dataDirectoryPath) throws RuntimeException {
            if (dataDirectoryPath == null) {
                throw new NullPointerException("org.dressdiscover.lib.properties.StoreProperties: dataDirectoryPath is null");
            }
            return dataDirectoryPath;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) throws RuntimeException {
            if (elasticSearchHost == null) {
                throw new NullPointerException("org.dressdiscover.lib.properties.StoreProperties: elasticSearchHost is null");
            }
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) throws RuntimeException {
            return elasticSearchPort;
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
        public boolean validateCacheCollections(final boolean cacheCollections) {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) {
            return cacheInstitutions;
        }

        @Override
        public String validateDataDirectoryPath(final String dataDirectoryPath) {
            return dataDirectoryPath;
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
        public boolean validateCacheCollections(final boolean cacheCollections) throws org.thryft.protocol.InputProtocolException {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) throws org.thryft.protocol.InputProtocolException {
            return cacheInstitutions;
        }

        @Override
        public String validateDataDirectoryPath(final String dataDirectoryPath) throws org.thryft.protocol.InputProtocolException {
            if (dataDirectoryPath == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATA_DIRECTORY_PATH, "org.dressdiscover.lib.properties.StoreProperties: dataDirectoryPath is null");
            }
            return dataDirectoryPath;
        }

        @Override
        public String validateElasticSearchHost(final String elasticSearchHost) throws org.thryft.protocol.InputProtocolException {
            if (elasticSearchHost == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_HOST, "org.dressdiscover.lib.properties.StoreProperties: elasticSearchHost is null");
            }
            return elasticSearchHost;
        }

        @Override
        public int validateElasticSearchPort(final int elasticSearchPort) throws org.thryft.protocol.InputProtocolException {
            return elasticSearchPort;
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
        public boolean validateCacheCollections(final boolean cacheCollections) {
            return cacheCollections;
        }

        @Override
        public boolean validateCacheInstitutions(final boolean cacheInstitutions) {
            return cacheInstitutions;
        }

        @Override
        public String validateDataDirectoryPath(final String dataDirectoryPath) {
            return dataDirectoryPath;
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
    public StoreProperties(final StoreProperties other) {
        this(other.getCacheCollections(), other.getCacheInstitutions(), other.getDataDirectoryPath(), other.getElasticSearchHost(), other.getElasticSearchPort(), other.getObjectSummariesResultCacheSize(), other.getObjectSummaryCacheSize(), other.getResummarizeObjectsBulkRequestSize(), NopConstructionValidator.getInstance());
    }

    protected StoreProperties(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final String elasticSearchHost, final int elasticSearchPort, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize, ConstructionValidator validator) {
        this.cacheCollections = validator.validateCacheCollections(cacheCollections);
        this.cacheInstitutions = validator.validateCacheInstitutions(cacheInstitutions);
        this.dataDirectoryPath = validator.validateDataDirectoryPath(dataDirectoryPath);
        this.elasticSearchHost = validator.validateElasticSearchHost(elasticSearchHost);
        this.elasticSearchPort = validator.validateElasticSearchPort(elasticSearchPort);
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

        final java.io.InputStream propertiesInputStream = StoreProperties.class
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
        return new StoreProperties(true, true, dataDirectoryPath, "elasticsearch", 9300, 1024, 1024, 1000, DefaultConstructionValidator.getInstance());
    }

    /**
     * Total boxed factory method
     */
    public static StoreProperties create(Boolean cacheCollections, Boolean cacheInstitutions, String dataDirectoryPath, String elasticSearchHost, Integer elasticSearchPort, Integer objectSummariesResultCacheSize, Integer objectSummaryCacheSize, Integer resummarizeObjectsBulkRequestSize) {
        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, elasticSearchPort, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static StoreProperties create(final boolean cacheCollections, final boolean cacheInstitutions, final String dataDirectoryPath, final String elasticSearchHost, final int elasticSearchPort, final int objectSummariesResultCacheSize, final int objectSummaryCacheSize, final int resummarizeObjectsBulkRequestSize) {
        return new StoreProperties(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, elasticSearchPort, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize, DefaultConstructionValidator.getInstance());
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

        if (!(getElasticSearchPort() == other.getElasticSearchPort())) {
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
        case ELASTIC_SEARCH_PORT: return getElasticSearchPort();
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

    public final String getElasticSearchHost() {
        return elasticSearchHost;
    }

    public final int getElasticSearchPort() {
        return elasticSearchPort;
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
        hashCode = 31 * hashCode + getElasticSearchPort();
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

        String[] __propertyNames = {"cache_collections", "cache_institutions", "data_directory_path", "elastic_search_host", "elastic_search_port", "object_summaries_result_cache_size", "object_summary_cache_size", "resummarize_objects_bulk_request_size"};
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
                elasticSearchPort = 9300;
            } else {
                final String elasticSearchPortString = ((String)elasticSearchPortObject).trim();
                if (elasticSearchPortString.isEmpty()) {
                    elasticSearchPort = 9300;
                } else {
                    elasticSearchPort = Integer.parseInt(elasticSearchPortString);
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

        return StoreProperties.create(cacheCollections, cacheInstitutions, dataDirectoryPath, elasticSearchHost, elasticSearchPort, objectSummariesResultCacheSize, objectSummaryCacheSize, resummarizeObjectsBulkRequestSize);
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
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        String dataDirectoryPath = null;
        String elasticSearchHost = "elasticsearch";
        int elasticSearchPort = 9300;
        int objectSummariesResultCacheSize = 1024;
        int objectSummaryCacheSize = 1024;
        int resummarizeObjectsBulkRequestSize = 1000;

        try {
            iprot.readListBegin();
            cacheCollections = iprot.readBool();
            cacheInstitutions = iprot.readBool();
            dataDirectoryPath = iprot.readString();
            elasticSearchHost = iprot.readString();
            try {
                elasticSearchPort = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELASTIC_SEARCH_PORT, e);
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
        return new StoreProperties(DefaultReadValidator.getInstance().validateCacheCollections(cacheCollections), DefaultReadValidator.getInstance().validateCacheInstitutions(cacheInstitutions), DefaultReadValidator.getInstance().validateDataDirectoryPath(dataDirectoryPath), DefaultReadValidator.getInstance().validateElasticSearchHost(elasticSearchHost), DefaultReadValidator.getInstance().validateElasticSearchPort(elasticSearchPort), DefaultReadValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), DefaultReadValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), DefaultReadValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
    }

    public static StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static StoreProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        boolean cacheCollections = true;
        boolean cacheInstitutions = true;
        String dataDirectoryPath = null;
        String elasticSearchHost = "elasticsearch";
        int elasticSearchPort = 9300;
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
        return new StoreProperties(DefaultReadValidator.getInstance().validateCacheCollections(cacheCollections), DefaultReadValidator.getInstance().validateCacheInstitutions(cacheInstitutions), DefaultReadValidator.getInstance().validateDataDirectoryPath(dataDirectoryPath), DefaultReadValidator.getInstance().validateElasticSearchHost(elasticSearchHost), DefaultReadValidator.getInstance().validateElasticSearchPort(elasticSearchPort), DefaultReadValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), DefaultReadValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), DefaultReadValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceCacheCollections(final boolean cacheCollections) {
        return new StoreProperties(DefaultConstructionValidator.getInstance().validateCacheCollections(cacheCollections), this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.elasticSearchPort, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceCacheInstitutions(final boolean cacheInstitutions) {
        return new StoreProperties(this.cacheCollections, DefaultConstructionValidator.getInstance().validateCacheInstitutions(cacheInstitutions), this.dataDirectoryPath, this.elasticSearchHost, this.elasticSearchPort, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceDataDirectoryPath(final String dataDirectoryPath) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, DefaultConstructionValidator.getInstance().validateDataDirectoryPath(dataDirectoryPath), this.elasticSearchHost, this.elasticSearchPort, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceElasticSearchHost(final String elasticSearchHost) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, DefaultConstructionValidator.getInstance().validateElasticSearchHost(elasticSearchHost), this.elasticSearchPort, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceElasticSearchPort(final int elasticSearchPort) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, DefaultConstructionValidator.getInstance().validateElasticSearchPort(elasticSearchPort), this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceObjectSummariesResultCacheSize(final int objectSummariesResultCacheSize) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.elasticSearchPort, DefaultConstructionValidator.getInstance().validateObjectSummariesResultCacheSize(objectSummariesResultCacheSize), this.objectSummaryCacheSize, this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceObjectSummaryCacheSize(final int objectSummaryCacheSize) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.elasticSearchPort, this.objectSummariesResultCacheSize, DefaultConstructionValidator.getInstance().validateObjectSummaryCacheSize(objectSummaryCacheSize), this.resummarizeObjectsBulkRequestSize, NopConstructionValidator.getInstance());
    }

    public StoreProperties replaceResummarizeObjectsBulkRequestSize(final int resummarizeObjectsBulkRequestSize) {
        return new StoreProperties(this.cacheCollections, this.cacheInstitutions, this.dataDirectoryPath, this.elasticSearchHost, this.elasticSearchPort, this.objectSummariesResultCacheSize, this.objectSummaryCacheSize, DefaultConstructionValidator.getInstance().validateResummarizeObjectsBulkRequestSize(resummarizeObjectsBulkRequestSize), NopConstructionValidator.getInstance());
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("cache_collections", getCacheCollections());
        builder.put("cache_institutions", getCacheInstitutions());
        builder.put("data_directory_path", getDataDirectoryPath());
        builder.put("elastic_search_host", getElasticSearchHost());
        builder.put("elastic_search_port", getElasticSearchPort());
        builder.put("object_summaries_result_cache_size", getObjectSummariesResultCacheSize());
        builder.put("object_summary_cache_size", getObjectSummaryCacheSize());
        builder.put("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize());
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("cache_collections", getCacheCollections()).add("cache_institutions", getCacheInstitutions()).add("data_directory_path", getDataDirectoryPath()).add("elastic_search_host", getElasticSearchHost()).add("elastic_search_port", getElasticSearchPort()).add("object_summaries_result_cache_size", getObjectSummariesResultCacheSize()).add("object_summary_cache_size", getObjectSummaryCacheSize()).add("resummarize_objects_bulk_request_size", getResummarizeObjectsBulkRequestSize()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

        oprot.writeBool(getCacheCollections());

        oprot.writeBool(getCacheInstitutions());

        oprot.writeString(getDataDirectoryPath());

        oprot.writeString(getElasticSearchHost());

        oprot.writeI32(getElasticSearchPort());

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

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("cache_collections", org.thryft.protocol.Type.BOOL, (short)0);
        oprot.writeBool(getCacheCollections());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("cache_institutions", org.thryft.protocol.Type.BOOL, (short)0);
        oprot.writeBool(getCacheInstitutions());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("data_directory_path", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getDataDirectoryPath());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_host", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getElasticSearchHost());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_port", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getElasticSearchPort());
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

    private final boolean cacheCollections;

    private final boolean cacheInstitutions;

    private final String dataDirectoryPath;

    private final String elasticSearchHost;

    private final int elasticSearchPort;

    private final int objectSummariesResultCacheSize;

    private final int objectSummaryCacheSize;

    private final int resummarizeObjectsBulkRequestSize;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(StoreProperties.class);
}
