package org.dressdiscover.api.models.configuration;

public final class CollectionConfiguration implements org.thryft.Struct {
    public final static class Builder {
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
            UncheckedValidator.validate(objectStoreConfiguration);

            return _build(objectStoreConfiguration);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.ObjectStoreConfiguration getObjectStoreConfiguration() {
            return objectStoreConfiguration;
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
                objectStoreConfiguration = org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot);
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
                    case "object_store_configuration": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            objectStoreConfiguration = org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
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
            UncheckedValidator.validateObjectStoreConfiguration(objectStoreConfiguration);
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
        public CollectionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAs(iprot, type);
        }

        @Override
        public CollectionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public CollectionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsList(iprot);
        }

        @Override
        public CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsStruct(iprot);
        }

        @Override
        public CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        OBJECT_STORE_CONFIGURATION("objectStoreConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.ObjectStoreConfiguration>() {}, true, (short)1, "object_store_configuration", org.thryft.protocol.Type.STRUCT);

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
        public static void validate(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) throws org.thryft.protocol.InputProtocolException {
            validateObjectStoreConfiguration(objectStoreConfiguration);
        }

        public static void validateObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) throws org.thryft.protocol.InputProtocolException {
            if (objectStoreConfiguration == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_STORE_CONFIGURATION, "org.dressdiscover.api.models.configuration.CollectionConfiguration: objectStoreConfiguration is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            validateObjectStoreConfiguration(objectStoreConfiguration);
        }

        public static void validateObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
            if (objectStoreConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.CollectionConfiguration: objectStoreConfiguration is null");
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
     *
     * All fields should have been validated before calling this.
     */
    protected CollectionConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
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

    /**
     * Optional factory method
     */
    public static CollectionConfiguration create(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
        UncheckedValidator.validate(objectStoreConfiguration);
        return new CollectionConfiguration(objectStoreConfiguration);
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
        int hashCode = 17;
        hashCode = 31 * hashCode + getObjectStoreConfiguration().hashCode();
        return hashCode;
    }

    public static CollectionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CollectionConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static CollectionConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration;

        try {
            iprot.readListBegin();
            objectStoreConfiguration = org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot);
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(objectStoreConfiguration);

        return new CollectionConfiguration(objectStoreConfiguration);
    }

    public static CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CollectionConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration = null;

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
                        objectStoreConfiguration = org.dressdiscover.api.models.configuration.ObjectStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
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

        ReadValidator.validate(objectStoreConfiguration);

        return new CollectionConfiguration(objectStoreConfiguration);
    }

    public CollectionConfiguration replaceObjectStoreConfiguration(final org.dressdiscover.api.models.configuration.ObjectStoreConfiguration objectStoreConfiguration) {
        UncheckedValidator.validateObjectStoreConfiguration(objectStoreConfiguration);
        return new CollectionConfiguration(objectStoreConfiguration);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object_store_configuration", getObjectStoreConfiguration()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        getObjectStoreConfiguration().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.configuration.CollectionConfiguration");
        writeFields(oprot);
        oprot.writeStructEnd();
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
