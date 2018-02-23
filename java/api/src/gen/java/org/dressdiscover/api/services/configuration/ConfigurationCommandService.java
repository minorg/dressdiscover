package org.dressdiscover.api.services.configuration;

public interface ConfigurationCommandService {
    public enum FunctionMetadata {
        PUT_COLLECTION_CONFIGURATION("put_collection_configuration"),
        PUT_INSTITUTION_CONFIGURATION("put_institution_configuration");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class PutCollectionConfigurationRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    collectionConfiguration = null;
                    collectionId = null;
                }

                public Builder(final PutCollectionConfigurationRequest other) {
                    this.collectionConfiguration = other.getCollectionConfiguration();
                    this.collectionId = other.getCollectionId();
                }

                protected PutCollectionConfigurationRequest _build(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    return new PutCollectionConfigurationRequest(collectionConfiguration, collectionId);
                }

                public PutCollectionConfigurationRequest build() {
                    UncheckedValidator.validate(collectionConfiguration, collectionId);

                    return _build(collectionConfiguration, collectionId);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration() {
                    return collectionConfiguration;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
                    return collectionId;
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
                        collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
                        try {
                            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
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
                            case "collection_configuration": {
                                collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback);
                                break;
                            }
                            case "collection_id": {
                                try {
                                    collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
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
                    case COLLECTION_CONFIGURATION: setCollectionConfiguration((org.dressdiscover.api.models.configuration.CollectionConfiguration)value); return this;
                    case COLLECTION_ID: setCollectionId((org.dressdiscover.api.models.collection.CollectionId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    UncheckedValidator.validateCollectionConfiguration(collectionConfiguration);
                    this.collectionConfiguration = collectionConfiguration;
                    return this;
                }

                public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    UncheckedValidator.validateCollectionId(collectionId);
                    this.collectionId = collectionId;
                    return this;
                }

                public Builder setIfPresent(final PutCollectionConfigurationRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setCollectionConfiguration(other.getCollectionConfiguration());
                    setCollectionId(other.getCollectionId());

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
                    case COLLECTION_CONFIGURATION: return unsetCollectionConfiguration();
                    case COLLECTION_ID: return unsetCollectionId();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetCollectionConfiguration() {
                    this.collectionConfiguration = null;
                    return this;
                }

                public Builder unsetCollectionId() {
                    this.collectionId = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration;
                private @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId collectionId;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutCollectionConfigurationRequest> {
                @Override
                public PutCollectionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAs(iprot, type);
                }

                @Override
                public PutCollectionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutCollectionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsList(iprot);
                }

                @Override
                public PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsStruct(iprot);
                }

                @Override
                public PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                COLLECTION_CONFIGURATION("collectionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionConfiguration>() {}, true, (short)0, "collection_configuration", org.thryft.protocol.Type.STRUCT),
                COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, (short)0, "collection_id", org.thryft.protocol.Type.STRING);

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
                    case "collectionConfiguration": return COLLECTION_CONFIGURATION;
                    case "collectionId": return COLLECTION_ID;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "collection_configuration": return COLLECTION_CONFIGURATION;
                    case "collection_id": return COLLECTION_ID;
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
                public static void validate(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
                    validateCollectionConfiguration(collectionConfiguration);
                    validateCollectionId(collectionId);
                }

                public static void validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws org.thryft.protocol.InputProtocolException {
                    if (collectionConfiguration == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_CONFIGURATION, "org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionConfiguration is null");
                    }
                }

                public static void validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
                    if (collectionId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionId is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    validateCollectionConfiguration(collectionConfiguration);
                    validateCollectionId(collectionId);
                }

                public static void validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    if (collectionConfiguration == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionConfiguration is null");
                    }
                }

                public static void validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    if (collectionId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionId is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutCollectionConfigurationRequest(final PutCollectionConfigurationRequest other) {
                this(other.getCollectionConfiguration(), other.getCollectionId());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected PutCollectionConfigurationRequest(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                this.collectionConfiguration = collectionConfiguration;
                this.collectionId = collectionId;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutCollectionConfigurationRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutCollectionConfigurationRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static PutCollectionConfigurationRequest create(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                UncheckedValidator.validate(collectionConfiguration, collectionId);
                return new PutCollectionConfigurationRequest(collectionConfiguration, collectionId);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutCollectionConfigurationRequest)) {
                    return false;
                }

                final PutCollectionConfigurationRequest other = (PutCollectionConfigurationRequest)otherObject;

                if (!(getCollectionConfiguration().equals(other.getCollectionConfiguration()))) {
                    return false;
                }

                if (!(getCollectionId().equals(other.getCollectionId()))) {
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
                case COLLECTION_CONFIGURATION: return getCollectionConfiguration();
                case COLLECTION_ID: return getCollectionId();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration() {
                return collectionConfiguration;
            }

            public final org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
                return collectionId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCollectionConfiguration().hashCode();
                hashCode = 31 * hashCode + getCollectionId().hashCode();
                return hashCode;
            }

            public static PutCollectionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutCollectionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutCollectionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration;
                org.dressdiscover.api.models.collection.CollectionId collectionId;

                try {
                    iprot.readListBegin();
                    collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
                    try {
                        collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(collectionConfiguration, collectionId);

                return new PutCollectionConfigurationRequest(collectionConfiguration, collectionId);
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration = null;
                @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId collectionId = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "collection_configuration": {
                            collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback);
                            break;
                        }
                        case "collection_id": {
                            try {
                                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
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

                ReadValidator.validate(collectionConfiguration, collectionId);

                return new PutCollectionConfigurationRequest(collectionConfiguration, collectionId);
            }

            public PutCollectionConfigurationRequest replaceCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                UncheckedValidator.validateCollectionConfiguration(collectionConfiguration);
                return new PutCollectionConfigurationRequest(collectionConfiguration, this.collectionId);
            }

            public PutCollectionConfigurationRequest replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                UncheckedValidator.validateCollectionId(collectionId);
                return new PutCollectionConfigurationRequest(this.collectionConfiguration, collectionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_configuration", getCollectionConfiguration()).add("collection_id", getCollectionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                getCollectionConfiguration().writeAsStruct(oprot);

                oprot.writeString(getCollectionId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            public void writeCollectionConfigurationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.COLLECTION_CONFIGURATION);
                getCollectionConfiguration().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            public void writeCollectionIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.COLLECTION_ID);
                oprot.writeString(getCollectionId().toString());
                oprot.writeFieldEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeCollectionConfigurationField(oprot);

                writeCollectionIdField(oprot);

                oprot.writeFieldStop();
            }

            private final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration;

            private final org.dressdiscover.api.models.collection.CollectionId collectionId;
        }

        public final static class PutCollectionConfigurationResponse implements org.thryft.Struct {
            public final static class Factory implements org.thryft.CompoundType.Factory<PutCollectionConfigurationResponse> {
                @Override
                public PutCollectionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationResponse.readAs(iprot, type);
                }

                @Override
                public PutCollectionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutCollectionConfigurationResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationResponse.readAsList(iprot);
                }

                @Override
                public PutCollectionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationResponse.readAsStruct(iprot);
                }

                @Override
                public PutCollectionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            private PutCollectionConfigurationResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutCollectionConfigurationResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            public static PutCollectionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutCollectionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutCollectionConfigurationResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readListBegin();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            public static PutCollectionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutCollectionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutCollectionConfigurationResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutCollectionConfigurationResponse INSTANCE = new PutCollectionConfigurationResponse();
        }

        public final static class PutInstitutionConfigurationRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    institutionConfiguration = null;
                    institutionId = null;
                }

                public Builder(final PutInstitutionConfigurationRequest other) {
                    this.institutionConfiguration = other.getInstitutionConfiguration();
                    this.institutionId = other.getInstitutionId();
                }

                protected PutInstitutionConfigurationRequest _build(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    return new PutInstitutionConfigurationRequest(institutionConfiguration, institutionId);
                }

                public PutInstitutionConfigurationRequest build() {
                    UncheckedValidator.validate(institutionConfiguration, institutionId);

                    return _build(institutionConfiguration, institutionId);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration() {
                    return institutionConfiguration;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
                    return institutionId;
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
                        institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
                        try {
                            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
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
                            case "institution_configuration": {
                                institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot, unknownFieldCallback);
                                break;
                            }
                            case "institution_id": {
                                try {
                                    institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
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
                    case INSTITUTION_CONFIGURATION: setInstitutionConfiguration((org.dressdiscover.api.models.configuration.InstitutionConfiguration)value); return this;
                    case INSTITUTION_ID: setInstitutionId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final PutInstitutionConfigurationRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setInstitutionConfiguration(other.getInstitutionConfiguration());
                    setInstitutionId(other.getInstitutionId());

                    return this;
                }

                public Builder setInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    UncheckedValidator.validateInstitutionConfiguration(institutionConfiguration);
                    this.institutionConfiguration = institutionConfiguration;
                    return this;
                }

                public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    UncheckedValidator.validateInstitutionId(institutionId);
                    this.institutionId = institutionId;
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
                    case INSTITUTION_CONFIGURATION: return unsetInstitutionConfiguration();
                    case INSTITUTION_ID: return unsetInstitutionId();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetInstitutionConfiguration() {
                    this.institutionConfiguration = null;
                    return this;
                }

                public Builder unsetInstitutionId() {
                    this.institutionId = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration;
                private @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId institutionId;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutInstitutionConfigurationRequest> {
                @Override
                public PutInstitutionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAs(iprot, type);
                }

                @Override
                public PutInstitutionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutInstitutionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsList(iprot);
                }

                @Override
                public PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsStruct(iprot);
                }

                @Override
                public PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                INSTITUTION_CONFIGURATION("institutionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.InstitutionConfiguration>() {}, true, (short)0, "institution_configuration", org.thryft.protocol.Type.STRUCT),
                INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, (short)0, "institution_id", org.thryft.protocol.Type.STRING);

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
                    case "institutionConfiguration": return INSTITUTION_CONFIGURATION;
                    case "institutionId": return INSTITUTION_ID;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "institution_configuration": return INSTITUTION_CONFIGURATION;
                    case "institution_id": return INSTITUTION_ID;
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
                public static void validate(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
                    validateInstitutionConfiguration(institutionConfiguration);
                    validateInstitutionId(institutionId);
                }

                public static void validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws org.thryft.protocol.InputProtocolException {
                    if (institutionConfiguration == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_CONFIGURATION, "org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionConfiguration is null");
                    }
                }

                public static void validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
                    if (institutionId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionId is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    validateInstitutionConfiguration(institutionConfiguration);
                    validateInstitutionId(institutionId);
                }

                public static void validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    if (institutionConfiguration == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionConfiguration is null");
                    }
                }

                public static void validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    if (institutionId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionId is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutInstitutionConfigurationRequest(final PutInstitutionConfigurationRequest other) {
                this(other.getInstitutionConfiguration(), other.getInstitutionId());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected PutInstitutionConfigurationRequest(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                this.institutionConfiguration = institutionConfiguration;
                this.institutionId = institutionId;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutInstitutionConfigurationRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutInstitutionConfigurationRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static PutInstitutionConfigurationRequest create(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                UncheckedValidator.validate(institutionConfiguration, institutionId);
                return new PutInstitutionConfigurationRequest(institutionConfiguration, institutionId);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutInstitutionConfigurationRequest)) {
                    return false;
                }

                final PutInstitutionConfigurationRequest other = (PutInstitutionConfigurationRequest)otherObject;

                if (!(getInstitutionConfiguration().equals(other.getInstitutionConfiguration()))) {
                    return false;
                }

                if (!(getInstitutionId().equals(other.getInstitutionId()))) {
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
                case INSTITUTION_CONFIGURATION: return getInstitutionConfiguration();
                case INSTITUTION_ID: return getInstitutionId();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration() {
                return institutionConfiguration;
            }

            public final org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
                return institutionId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getInstitutionConfiguration().hashCode();
                hashCode = 31 * hashCode + getInstitutionId().hashCode();
                return hashCode;
            }

            public static PutInstitutionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionConfigurationRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutInstitutionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration;
                org.dressdiscover.api.models.institution.InstitutionId institutionId;

                try {
                    iprot.readListBegin();
                    institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
                    try {
                        institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(institutionConfiguration, institutionId);

                return new PutInstitutionConfigurationRequest(institutionConfiguration, institutionId);
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration = null;
                @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId institutionId = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "institution_configuration": {
                            institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot, unknownFieldCallback);
                            break;
                        }
                        case "institution_id": {
                            try {
                                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
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

                ReadValidator.validate(institutionConfiguration, institutionId);

                return new PutInstitutionConfigurationRequest(institutionConfiguration, institutionId);
            }

            public PutInstitutionConfigurationRequest replaceInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                UncheckedValidator.validateInstitutionConfiguration(institutionConfiguration);
                return new PutInstitutionConfigurationRequest(institutionConfiguration, this.institutionId);
            }

            public PutInstitutionConfigurationRequest replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                UncheckedValidator.validateInstitutionId(institutionId);
                return new PutInstitutionConfigurationRequest(this.institutionConfiguration, institutionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_configuration", getInstitutionConfiguration()).add("institution_id", getInstitutionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                getInstitutionConfiguration().writeAsStruct(oprot);

                oprot.writeString(getInstitutionId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeInstitutionConfigurationField(oprot);

                writeInstitutionIdField(oprot);

                oprot.writeFieldStop();
            }

            public void writeInstitutionConfigurationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.INSTITUTION_CONFIGURATION);
                getInstitutionConfiguration().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            public void writeInstitutionIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.INSTITUTION_ID);
                oprot.writeString(getInstitutionId().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration;

            private final org.dressdiscover.api.models.institution.InstitutionId institutionId;
        }

        public final static class PutInstitutionConfigurationResponse implements org.thryft.Struct {
            public final static class Factory implements org.thryft.CompoundType.Factory<PutInstitutionConfigurationResponse> {
                @Override
                public PutInstitutionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationResponse.readAs(iprot, type);
                }

                @Override
                public PutInstitutionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutInstitutionConfigurationResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationResponse.readAsList(iprot);
                }

                @Override
                public PutInstitutionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationResponse.readAsStruct(iprot);
                }

                @Override
                public PutInstitutionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            private PutInstitutionConfigurationResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutInstitutionConfigurationResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            public static PutInstitutionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionConfigurationResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutInstitutionConfigurationResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readListBegin();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            public static PutInstitutionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionConfigurationResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutInstitutionConfigurationResponse INSTANCE = new PutInstitutionConfigurationResponse();
        }
    }

    public void putCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException;

    public void putInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException;
}
