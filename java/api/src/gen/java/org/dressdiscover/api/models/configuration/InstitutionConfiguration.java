package org.dressdiscover.api.models.configuration;

public final class InstitutionConfiguration implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            storeType = null;
            defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
            storeParameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
        }

        public Builder(final InstitutionConfiguration other) {
            this.storeType = other.getStoreType();
            this.defaultCollectionConfiguration = other.getDefaultCollectionConfiguration();
            this.storeParameters = other.getStoreParameters();
        }

        protected InstitutionConfiguration _build(final String storeType, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
            return new InstitutionConfiguration(storeType, defaultCollectionConfiguration, storeParameters, DefaultConstructionValidator.getInstance());
        }

        public InstitutionConfiguration build() {
            return _build(storeType, defaultCollectionConfiguration, storeParameters);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> getDefaultCollectionConfiguration() {
            return defaultCollectionConfiguration;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStoreParameters() {
            return storeParameters;
        }

        public final String getStoreType() {
            return storeType;
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                storeType = iprot.readString();
                if (__list.getSize() > 1) {
                    defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
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
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, e.getCause());
                    }
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
                    case "store_type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            storeType = iprot.readString();
                        }
                        break;
                    }
                    case "default_collection_configuration": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "store_parameters": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
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
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, e.getCause());
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
            case STORE_TYPE: setStoreType((String)value); return this;
            case DEFAULT_COLLECTION_CONFIGURATION: setDefaultCollectionConfiguration((org.dressdiscover.api.models.configuration.CollectionConfiguration)value); return this;
            case STORE_PARAMETERS: setStoreParameters((com.google.common.collect.ImmutableMap<String, String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            this.defaultCollectionConfiguration = DefaultConstructionValidator.getInstance().validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
            return this;
        }

        public Builder setDefaultCollectionConfiguration(@javax.annotation.Nullable final org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration) {
            return setDefaultCollectionConfiguration(com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration));
        }

        public Builder setIfPresent(final InstitutionConfiguration other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setStoreType(other.getStoreType());
            if (other.getDefaultCollectionConfiguration().isPresent()) {
                setDefaultCollectionConfiguration(other.getDefaultCollectionConfiguration());
            }
            if (other.getStoreParameters().isPresent()) {
                setStoreParameters(other.getStoreParameters());
            }

            return this;
        }

        public Builder setStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
            this.storeParameters = DefaultConstructionValidator.getInstance().validateStoreParameters(storeParameters);
            return this;
        }

        public Builder setStoreParameters(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> storeParameters) {
            return setStoreParameters(com.google.common.base.Optional.fromNullable(storeParameters));
        }

        public Builder setStoreType(final String storeType) {
            this.storeType = DefaultConstructionValidator.getInstance().validateStoreType(storeType);
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
            case STORE_TYPE: return unsetStoreType();
            case DEFAULT_COLLECTION_CONFIGURATION: return unsetDefaultCollectionConfiguration();
            case STORE_PARAMETERS: return unsetStoreParameters();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDefaultCollectionConfiguration() {
            this.defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
            return this;
        }

        public Builder unsetStoreParameters() {
            this.storeParameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
            return this;
        }

        public Builder unsetStoreType() {
            this.storeType = null;
            return this;
        }

        private String storeType;
        private com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<InstitutionConfiguration> {
        @Override
        public InstitutionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return InstitutionConfiguration.readAs(iprot, type);
        }

        @Override
        public InstitutionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InstitutionConfiguration.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public InstitutionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InstitutionConfiguration.readAsList(iprot);
        }

        @Override
        public InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InstitutionConfiguration.readAsStruct(iprot);
        }

        @Override
        public InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InstitutionConfiguration.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        STORE_TYPE("storeType", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "store_type", org.thryft.protocol.Type.STRING),
        DEFAULT_COLLECTION_CONFIGURATION("defaultCollectionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionConfiguration>() {}, false, 2, "default_collection_configuration", org.thryft.protocol.Type.STRUCT),
        STORE_PARAMETERS("storeParameters", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, 3, "store_parameters", org.thryft.protocol.Type.MAP);

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
            case "storeType": return STORE_TYPE;
            case "defaultCollectionConfiguration": return DEFAULT_COLLECTION_CONFIGURATION;
            case "storeParameters": return STORE_PARAMETERS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "store_type": return STORE_TYPE;
            case "default_collection_configuration": return DEFAULT_COLLECTION_CONFIGURATION;
            case "store_parameters": return STORE_PARAMETERS;
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
        public String validateStoreType(final String storeType) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) throws ExceptionT;
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
        public String validateStoreType(final String storeType) throws RuntimeException {
            if (storeType == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeType is null");
            }
            return storeType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) throws RuntimeException {
            if (defaultCollectionConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: defaultCollectionConfiguration is null");
            }
            if (!defaultCollectionConfiguration.isPresent()) {
                return defaultCollectionConfiguration;
            }
            return defaultCollectionConfiguration;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) throws RuntimeException {
            if (storeParameters == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeParameters is null");
            }
            if (!storeParameters.isPresent()) {
                return storeParameters;
            }
            if (storeParameters.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeParameters is less than min length 1");
            }
            return storeParameters;
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
        public String validateStoreType(final String storeType) {
            return storeType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            return defaultCollectionConfiguration;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
            return storeParameters;
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
        public String validateStoreType(final String storeType) throws org.thryft.protocol.InputProtocolException {
            if (storeType == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STORE_TYPE, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeType is null");
            }
            return storeType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) throws org.thryft.protocol.InputProtocolException {
            if (defaultCollectionConfiguration == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DEFAULT_COLLECTION_CONFIGURATION, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: defaultCollectionConfiguration is null");
            }
            if (!defaultCollectionConfiguration.isPresent()) {
                return defaultCollectionConfiguration;
            }
            return defaultCollectionConfiguration;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) throws org.thryft.protocol.InputProtocolException {
            if (storeParameters == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeParameters is null");
            }
            if (!storeParameters.isPresent()) {
                return storeParameters;
            }
            if (storeParameters.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: storeParameters is less than min length 1");
            }
            return storeParameters;
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
        public String validateStoreType(final String storeType) {
            return storeType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            return defaultCollectionConfiguration;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
            return storeParameters;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public InstitutionConfiguration(final InstitutionConfiguration other) {
        this(other.getStoreType(), other.getDefaultCollectionConfiguration(), other.getStoreParameters(), NopConstructionValidator.getInstance());
    }

    protected InstitutionConfiguration(final String storeType, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters, ConstructionValidator validator) {
        this.storeType = validator.validateStoreType(storeType);
        this.defaultCollectionConfiguration = validator.validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
        this.storeParameters = validator.validateStoreParameters(storeParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InstitutionConfiguration other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InstitutionConfiguration> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static InstitutionConfiguration create(final String storeType) {
        return new InstitutionConfiguration(storeType, com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static InstitutionConfiguration create(final String storeType, final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> storeParameters) {
        return new InstitutionConfiguration(storeType, com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration), com.google.common.base.Optional.fromNullable(storeParameters), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static InstitutionConfiguration create(final String storeType, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
        return new InstitutionConfiguration(storeType, defaultCollectionConfiguration, storeParameters, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof InstitutionConfiguration)) {
            return false;
        }

        final InstitutionConfiguration other = (InstitutionConfiguration)otherObject;

        if (!(getStoreType().equals(other.getStoreType()))) {
            return false;
        }

        if (!(((getDefaultCollectionConfiguration().isPresent() && other.getDefaultCollectionConfiguration().isPresent()) ? (getDefaultCollectionConfiguration().get().equals(other.getDefaultCollectionConfiguration().get())) : (!getDefaultCollectionConfiguration().isPresent() && !other.getDefaultCollectionConfiguration().isPresent())))) {
            return false;
        }

        if (!(((getStoreParameters().isPresent() && other.getStoreParameters().isPresent()) ? (getStoreParameters().get().equals(other.getStoreParameters().get())) : (!getStoreParameters().isPresent() && !other.getStoreParameters().isPresent())))) {
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
        case STORE_TYPE: return getStoreType();
        case DEFAULT_COLLECTION_CONFIGURATION: return getDefaultCollectionConfiguration();
        case STORE_PARAMETERS: return getStoreParameters();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> getDefaultCollectionConfiguration() {
        return defaultCollectionConfiguration;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStoreParameters() {
        return storeParameters;
    }

    public final String getStoreType() {
        return storeType;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getStoreType().hashCode();
        if (getDefaultCollectionConfiguration().isPresent()) {
            hashCode = 31 * hashCode + getDefaultCollectionConfiguration().get().hashCode();
        }
        if (getStoreParameters().isPresent()) {
            hashCode = 31 * hashCode + getStoreParameters().get().hashCode();
        }
        return hashCode;
    }

    public static InstitutionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InstitutionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InstitutionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String storeType = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            storeType = iprot.readString();
            if (__list.getSize() > 1) {
                defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
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
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InstitutionConfiguration(DefaultReadValidator.getInstance().validateStoreType(storeType), DefaultReadValidator.getInstance().validateDefaultCollectionConfiguration(defaultCollectionConfiguration), DefaultReadValidator.getInstance().validateStoreParameters(storeParameters), NopConstructionValidator.getInstance());
    }

    public static InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String storeType = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "store_type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        storeType = iprot.readString();
                    }
                    break;
                }
                case "default_collection_configuration": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
                    }
                    break;
                }
                case "store_parameters": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
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
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STORE_PARAMETERS, e.getCause());
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InstitutionConfiguration(DefaultReadValidator.getInstance().validateStoreType(storeType), DefaultReadValidator.getInstance().validateDefaultCollectionConfiguration(defaultCollectionConfiguration), DefaultReadValidator.getInstance().validateStoreParameters(storeParameters), NopConstructionValidator.getInstance());
    }

    public InstitutionConfiguration replaceDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
        return new InstitutionConfiguration(this.storeType, DefaultConstructionValidator.getInstance().validateDefaultCollectionConfiguration(defaultCollectionConfiguration), this.storeParameters, NopConstructionValidator.getInstance());
    }

    public InstitutionConfiguration replaceDefaultCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration) {
        return replaceDefaultCollectionConfiguration(com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration));
    }

    public InstitutionConfiguration replaceStoreParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters) {
        return new InstitutionConfiguration(this.storeType, this.defaultCollectionConfiguration, DefaultConstructionValidator.getInstance().validateStoreParameters(storeParameters), NopConstructionValidator.getInstance());
    }

    public InstitutionConfiguration replaceStoreParameters(final com.google.common.collect.ImmutableMap<String, String> storeParameters) {
        return replaceStoreParameters(com.google.common.base.Optional.fromNullable(storeParameters));
    }

    public InstitutionConfiguration replaceStoreType(final String storeType) {
        return new InstitutionConfiguration(DefaultConstructionValidator.getInstance().validateStoreType(storeType), this.defaultCollectionConfiguration, this.storeParameters, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("store_type", getStoreType()).add("default_collection_configuration", getDefaultCollectionConfiguration().orNull()).add("store_parameters", getStoreParameters().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getStoreType());

        if (getDefaultCollectionConfiguration().isPresent()) {
            getDefaultCollectionConfiguration().get().writeAsStruct(oprot);
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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.configuration.InstitutionConfiguration");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("store_type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getStoreType());
        oprot.writeFieldEnd();

        if (getDefaultCollectionConfiguration().isPresent()) {
            oprot.writeFieldBegin("default_collection_configuration", org.thryft.protocol.Type.STRUCT, (short)2);
            getDefaultCollectionConfiguration().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getStoreParameters().isPresent()) {
            oprot.writeFieldBegin("store_parameters", org.thryft.protocol.Type.MAP, (short)3);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStoreParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStoreParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String storeType;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> storeParameters;
}
