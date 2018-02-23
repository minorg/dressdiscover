package org.dressdiscover.api.models.configuration;

public final class InstitutionConfiguration implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            collectionStoreConfiguration = null;
            defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
        }

        public Builder(final InstitutionConfiguration other) {
            this.collectionStoreConfiguration = other.getCollectionStoreConfiguration();
            this.defaultCollectionConfiguration = other.getDefaultCollectionConfiguration();
        }

        protected InstitutionConfiguration _build(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            return new InstitutionConfiguration(collectionStoreConfiguration, defaultCollectionConfiguration);
        }

        public InstitutionConfiguration build() {
            UncheckedValidator.validate(collectionStoreConfiguration, defaultCollectionConfiguration);

            return _build(collectionStoreConfiguration, defaultCollectionConfiguration);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionStoreConfiguration getCollectionStoreConfiguration() {
            return collectionStoreConfiguration;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> getDefaultCollectionConfiguration() {
            return defaultCollectionConfiguration;
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
                collectionStoreConfiguration = org.dressdiscover.api.models.configuration.CollectionStoreConfiguration.readAsStruct(iprot);
                if (__list.getSize() > 1) {
                    defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
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
                    case "collection_store_configuration": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            collectionStoreConfiguration = org.dressdiscover.api.models.configuration.CollectionStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
                        }
                        break;
                    }
                    case "default_collection_configuration": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback));
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
            case COLLECTION_STORE_CONFIGURATION: setCollectionStoreConfiguration((org.dressdiscover.api.models.configuration.CollectionStoreConfiguration)value); return this;
            case DEFAULT_COLLECTION_CONFIGURATION: setDefaultCollectionConfiguration((org.dressdiscover.api.models.configuration.CollectionConfiguration)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCollectionStoreConfiguration(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration) {
            UncheckedValidator.validateCollectionStoreConfiguration(collectionStoreConfiguration);
            this.collectionStoreConfiguration = collectionStoreConfiguration;
            return this;
        }

        public Builder setDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            UncheckedValidator.validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
            this.defaultCollectionConfiguration = defaultCollectionConfiguration;
            return this;
        }

        public Builder setDefaultCollectionConfiguration(final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration) {
            return setDefaultCollectionConfiguration(com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration));
        }

        public Builder setIfPresent(final InstitutionConfiguration other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionStoreConfiguration(other.getCollectionStoreConfiguration());
            if (other.getDefaultCollectionConfiguration().isPresent()) {
                setDefaultCollectionConfiguration(other.getDefaultCollectionConfiguration());
            }

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
            case COLLECTION_STORE_CONFIGURATION: return unsetCollectionStoreConfiguration();
            case DEFAULT_COLLECTION_CONFIGURATION: return unsetDefaultCollectionConfiguration();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCollectionStoreConfiguration() {
            this.collectionStoreConfiguration = null;
            return this;
        }

        public Builder unsetDefaultCollectionConfiguration() {
            this.defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration;
        private com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration;
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
        COLLECTION_STORE_CONFIGURATION("collectionStoreConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionStoreConfiguration>() {}, true, (short)1, "collection_store_configuration", org.thryft.protocol.Type.STRUCT),
        DEFAULT_COLLECTION_CONFIGURATION("defaultCollectionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionConfiguration>() {}, false, (short)2, "default_collection_configuration", org.thryft.protocol.Type.STRUCT);

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
            case "collectionStoreConfiguration": return COLLECTION_STORE_CONFIGURATION;
            case "defaultCollectionConfiguration": return DEFAULT_COLLECTION_CONFIGURATION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_store_configuration": return COLLECTION_STORE_CONFIGURATION;
            case "default_collection_configuration": return DEFAULT_COLLECTION_CONFIGURATION;
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
        public static void validate(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) throws org.thryft.protocol.InputProtocolException {
            validateCollectionStoreConfiguration(collectionStoreConfiguration);
            validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
        }

        public static void validateCollectionStoreConfiguration(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration) throws org.thryft.protocol.InputProtocolException {
            if (collectionStoreConfiguration == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_STORE_CONFIGURATION, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: collectionStoreConfiguration is null");
            }
        }

        public static void validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) throws org.thryft.protocol.InputProtocolException {
            if (defaultCollectionConfiguration == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DEFAULT_COLLECTION_CONFIGURATION, "org.dressdiscover.api.models.configuration.InstitutionConfiguration: defaultCollectionConfiguration is null");
            }
            if (!defaultCollectionConfiguration.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            validateCollectionStoreConfiguration(collectionStoreConfiguration);
            validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
        }

        public static void validateCollectionStoreConfiguration(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration) {
            if (collectionStoreConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: collectionStoreConfiguration is null");
            }
        }

        public static void validateDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
            if (defaultCollectionConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.InstitutionConfiguration: defaultCollectionConfiguration is null");
            }
            if (!defaultCollectionConfiguration.isPresent()) {
                return;
            }
        }
    }

    /**
     * Copy constructor
     */
    public InstitutionConfiguration(final InstitutionConfiguration other) {
        this(other.getCollectionStoreConfiguration(), other.getDefaultCollectionConfiguration());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected InstitutionConfiguration(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
        this.collectionStoreConfiguration = collectionStoreConfiguration;
        this.defaultCollectionConfiguration = defaultCollectionConfiguration;
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
    public static InstitutionConfiguration create(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration) {
        UncheckedValidator.validate(collectionStoreConfiguration, com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent());
        return new InstitutionConfiguration(collectionStoreConfiguration, com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static InstitutionConfiguration create(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, @javax.annotation.Nullable final org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration) {
        final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfigurationOptional = com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration);
        UncheckedValidator.validate(collectionStoreConfiguration, defaultCollectionConfigurationOptional);
        return new InstitutionConfiguration(collectionStoreConfiguration, defaultCollectionConfigurationOptional);
    }

    /**
     * Optional factory method
     */
    public static InstitutionConfiguration create(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration, final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
        UncheckedValidator.validate(collectionStoreConfiguration, defaultCollectionConfiguration);
        return new InstitutionConfiguration(collectionStoreConfiguration, defaultCollectionConfiguration);
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

        if (!(getCollectionStoreConfiguration().equals(other.getCollectionStoreConfiguration()))) {
            return false;
        }

        if (!(((getDefaultCollectionConfiguration().isPresent() && other.getDefaultCollectionConfiguration().isPresent()) ? (getDefaultCollectionConfiguration().get().equals(other.getDefaultCollectionConfiguration().get())) : (!getDefaultCollectionConfiguration().isPresent() && !other.getDefaultCollectionConfiguration().isPresent())))) {
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
        case COLLECTION_STORE_CONFIGURATION: return getCollectionStoreConfiguration();
        case DEFAULT_COLLECTION_CONFIGURATION: return getDefaultCollectionConfiguration();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration getCollectionStoreConfiguration() {
        return collectionStoreConfiguration;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> getDefaultCollectionConfiguration() {
        return defaultCollectionConfiguration;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionStoreConfiguration().hashCode();
        if (getDefaultCollectionConfiguration().isPresent()) {
            hashCode = 31 * hashCode + getDefaultCollectionConfiguration().get().hashCode();
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
        org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration;
        com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            collectionStoreConfiguration = org.dressdiscover.api.models.configuration.CollectionStoreConfiguration.readAsStruct(iprot);
            if (__list.getSize() > 1) {
                defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(collectionStoreConfiguration, defaultCollectionConfiguration);

        return new InstitutionConfiguration(collectionStoreConfiguration, defaultCollectionConfiguration);
    }

    public static InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InstitutionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration = com.google.common.base.Optional.<org.dressdiscover.api.models.configuration.CollectionConfiguration> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "collection_store_configuration": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        collectionStoreConfiguration = org.dressdiscover.api.models.configuration.CollectionStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
                    }
                    break;
                }
                case "default_collection_configuration": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        defaultCollectionConfiguration = com.google.common.base.Optional.of(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(collectionStoreConfiguration, defaultCollectionConfiguration);

        return new InstitutionConfiguration(collectionStoreConfiguration, defaultCollectionConfiguration);
    }

    public InstitutionConfiguration replaceCollectionStoreConfiguration(final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration) {
        UncheckedValidator.validateCollectionStoreConfiguration(collectionStoreConfiguration);
        return new InstitutionConfiguration(collectionStoreConfiguration, this.defaultCollectionConfiguration);
    }

    public InstitutionConfiguration replaceDefaultCollectionConfiguration(final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration) {
        UncheckedValidator.validateDefaultCollectionConfiguration(defaultCollectionConfiguration);
        return new InstitutionConfiguration(this.collectionStoreConfiguration, defaultCollectionConfiguration);
    }

    public InstitutionConfiguration replaceDefaultCollectionConfiguration(@javax.annotation.Nullable final org.dressdiscover.api.models.configuration.CollectionConfiguration defaultCollectionConfiguration) {
        return replaceDefaultCollectionConfiguration(com.google.common.base.Optional.fromNullable(defaultCollectionConfiguration));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_store_configuration", getCollectionStoreConfiguration()).add("default_collection_configuration", getDefaultCollectionConfiguration().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        getCollectionStoreConfiguration().writeAsStruct(oprot);

        if (getDefaultCollectionConfiguration().isPresent()) {
            getDefaultCollectionConfiguration().get().writeAsStruct(oprot);
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

    public void writeCollectionStoreConfigurationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.COLLECTION_STORE_CONFIGURATION);
        getCollectionStoreConfiguration().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeDefaultCollectionConfigurationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDefaultCollectionConfiguration().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DEFAULT_COLLECTION_CONFIGURATION);
            getDefaultCollectionConfiguration().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCollectionStoreConfigurationField(oprot);

        writeDefaultCollectionConfigurationField(oprot);

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.configuration.CollectionStoreConfiguration collectionStoreConfiguration;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.configuration.CollectionConfiguration> defaultCollectionConfiguration;
}
