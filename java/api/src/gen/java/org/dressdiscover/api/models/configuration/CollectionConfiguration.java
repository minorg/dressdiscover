package org.dressdiscover.api.models.configuration;

public final class CollectionConfiguration implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, CollectionConfiguration> {
        public Builder() {
            objectStoreConfiguration = null;
        }

        public Builder(final CollectionConfiguration other) {
            this.objectStoreConfiguration = other.getObjectStoreConfiguration();
        }

        protected CollectionConfiguration _build(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            return new CollectionConfiguration(objectStoreConfiguration);
        }

        public CollectionConfiguration build() {
            Validator.validate(objectStoreConfiguration);

            return _build(objectStoreConfiguration);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.ObjectStoreConfiguration getObjectStoreConfiguration() {
            return objectStoreConfiguration;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                this.setObjectStoreConfiguration(org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot));
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "object_store_configuration": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setObjectStoreConfiguration(org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case OBJECT_STORE_CONFIGURATION: setObjectStoreConfiguration((org.dressdiscover.api.models.configuration.ObjectStoreConfiguration)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final CollectionConfiguration other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setObjectStoreConfiguration(other.getObjectStoreConfiguration());

            return this;
        }

        public Builder setObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            Validator.validateObjectStoreConfiguration(objectStoreConfiguration);
            this.objectStoreConfiguration = objectStoreConfiguration;
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
            case OBJECT_STORE_CONFIGURATION: return unsetObjectStoreConfiguration();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetObjectStoreConfiguration() {
            this.objectStoreConfiguration = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<CollectionConfiguration> {
        @Override
        public CollectionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsList(iprot);
        }

        @Override
        public CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsStruct(iprot);
        }

        @Override
        public CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        OBJECT_STORE_CONFIGURATION("objectStoreConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.ObjectStoreConfiguration>() {}, true, (short)1, "object_store_configuration", "1:object_store_configuration", org.thryft.protocol.Type.STRUCT);

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
            case "objectStoreConfiguration": return OBJECT_STORE_CONFIGURATION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "object_store_configuration": return OBJECT_STORE_CONFIGURATION;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            validateObjectStoreConfiguration(objectStoreConfiguration);
        }

        public static void validateObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            if (objectStoreConfiguration == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.configuration.CollectionConfiguration: objectStoreConfiguration is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public CollectionConfiguration(final CollectionConfiguration other) {
        this(other.getObjectStoreConfiguration());
    }

    /**
     * Total constructor
     */
    public CollectionConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
        Validator.validate(objectStoreConfiguration);
        this.objectStoreConfiguration = objectStoreConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final CollectionConfiguration other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<CollectionConfiguration> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof CollectionConfiguration)) {
            return false;
        }

        final CollectionConfiguration other = (CollectionConfiguration)otherObject;

        if (!(getObjectStoreConfiguration().equals(other.getObjectStoreConfiguration()))) {
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
        case OBJECT_STORE_CONFIGURATION: return getObjectStoreConfiguration();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration getObjectStoreConfiguration() {
        return objectStoreConfiguration;
    }

    @Override
    public int hashCode() {
        return getObjectStoreConfiguration().hashCode();
    }

    public static CollectionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public CollectionConfiguration replaceObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
        Validator.validateObjectStoreConfiguration(objectStoreConfiguration);
        return new CollectionConfiguration(objectStoreConfiguration);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object_store_configuration", getObjectStoreConfiguration()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.configuration.CollectionConfiguration");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        getObjectStoreConfiguration().writeAsStruct(oprot);
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeObjectStoreConfigurationField(oprot);

        oprot.writeFieldStop();
    }

    public void writeObjectStoreConfigurationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.OBJECT_STORE_CONFIGURATION);
        getObjectStoreConfiguration().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration;
}
