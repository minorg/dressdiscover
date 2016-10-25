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
                    collectionId = null;
                    collectionConfiguration = null;
                }

                public Builder(final PutCollectionConfigurationRequest other) {
                    this.collectionId = other.getCollectionId();
                    this.collectionConfiguration = other.getCollectionConfiguration();
                }

                protected PutCollectionConfigurationRequest _build(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    return new PutCollectionConfigurationRequest(collectionId, collectionConfiguration, DefaultConstructionValidator.getInstance());
                }

                public PutCollectionConfigurationRequest build() {
                    return _build(collectionId, collectionConfiguration);
                }

                public final org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration() {
                    return collectionConfiguration;
                }

                public final org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
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
                        try {
                            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        }
                        collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
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
                            case "collection_id": {
                                try {
                                    collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                                }
                                break;
                            }
                            case "collection_configuration": {
                                collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
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
                    case COLLECTION_ID: setCollectionId((org.dressdiscover.api.models.collection.CollectionId)value); return this;
                    case COLLECTION_CONFIGURATION: setCollectionConfiguration((org.dressdiscover.api.models.configuration.CollectionConfiguration)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    this.collectionConfiguration = DefaultConstructionValidator.getInstance().validateCollectionConfiguration(collectionConfiguration);
                    return this;
                }

                public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    this.collectionId = DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
                    return this;
                }

                public Builder setIfPresent(final PutCollectionConfigurationRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setCollectionId(other.getCollectionId());
                    setCollectionConfiguration(other.getCollectionConfiguration());

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
                    case COLLECTION_ID: return unsetCollectionId();
                    case COLLECTION_CONFIGURATION: return unsetCollectionConfiguration();
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

                private org.dressdiscover.api.models.collection.CollectionId collectionId;
                private org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration;
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
                COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, 0, "collection_id", org.thryft.protocol.Type.STRING),
                COLLECTION_CONFIGURATION("collectionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionConfiguration>() {}, true, 0, "collection_configuration", org.thryft.protocol.Type.STRUCT);

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
                    case "collectionId": return COLLECTION_ID;
                    case "collectionConfiguration": return COLLECTION_CONFIGURATION;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "collection_id": return COLLECTION_ID;
                    case "collection_configuration": return COLLECTION_CONFIGURATION;
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
                public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws ExceptionT;

                public org.dressdiscover.api.models.configuration.CollectionConfiguration validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws ExceptionT;
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
                public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws RuntimeException {
                    if (collectionId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionId is null");
                    }
                    return collectionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.CollectionConfiguration validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws RuntimeException {
                    if (collectionConfiguration == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionConfiguration is null");
                    }
                    return collectionConfiguration;
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
                public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    return collectionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.CollectionConfiguration validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    return collectionConfiguration;
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
                public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
                    if (collectionId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionId is null");
                    }
                    return collectionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.CollectionConfiguration validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws org.thryft.protocol.InputProtocolException {
                    if (collectionConfiguration == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_CONFIGURATION, "org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionConfiguration is null");
                    }
                    return collectionConfiguration;
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
                public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    return collectionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.CollectionConfiguration validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    return collectionConfiguration;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public PutCollectionConfigurationRequest(final PutCollectionConfigurationRequest other) {
                this(other.getCollectionId(), other.getCollectionConfiguration(), NopConstructionValidator.getInstance());
            }

            protected PutCollectionConfigurationRequest(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, ConstructionValidator validator) {
                this.collectionId = validator.validateCollectionId(collectionId);
                this.collectionConfiguration = validator.validateCollectionConfiguration(collectionConfiguration);
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
            public static PutCollectionConfigurationRequest create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                return new PutCollectionConfigurationRequest(collectionId, collectionConfiguration, DefaultConstructionValidator.getInstance());
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

                if (!(getCollectionId().equals(other.getCollectionId()))) {
                    return false;
                }

                if (!(getCollectionConfiguration().equals(other.getCollectionConfiguration()))) {
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
                case COLLECTION_ID: return getCollectionId();
                case COLLECTION_CONFIGURATION: return getCollectionConfiguration();
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
                hashCode = 31 * hashCode + getCollectionId().hashCode();
                hashCode = 31 * hashCode + getCollectionConfiguration().hashCode();
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
                org.dressdiscover.api.models.collection.CollectionId collectionId = null;
                org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration = null;

                try {
                    iprot.readListBegin();
                    try {
                        collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                    }
                    collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new PutCollectionConfigurationRequest(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateCollectionConfiguration(collectionConfiguration), NopConstructionValidator.getInstance());
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.collection.CollectionId collectionId = null;
                org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "collection_id": {
                            try {
                                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                            }
                            break;
                        }
                        case "collection_configuration": {
                            collectionConfiguration = org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot);
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
                return new PutCollectionConfigurationRequest(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateCollectionConfiguration(collectionConfiguration), NopConstructionValidator.getInstance());
            }

            public PutCollectionConfigurationRequest replaceCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                return new PutCollectionConfigurationRequest(this.collectionId, DefaultConstructionValidator.getInstance().validateCollectionConfiguration(collectionConfiguration), NopConstructionValidator.getInstance());
            }

            public PutCollectionConfigurationRequest replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                return new PutCollectionConfigurationRequest(DefaultConstructionValidator.getInstance().validateCollectionId(collectionId), this.collectionConfiguration, NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("collection_configuration", getCollectionConfiguration()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeString(getCollectionId().toString());

                getCollectionConfiguration().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getCollectionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("collection_configuration", org.thryft.protocol.Type.STRUCT, (short)0);
                getCollectionConfiguration().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final org.dressdiscover.api.models.collection.CollectionId collectionId;

            private final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration;
        }

        public final static class PutCollectionConfigurationResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                }

                public Builder(final PutCollectionConfigurationResponse other) {
                }

                protected PutCollectionConfigurationResponse _build() {
                    return new PutCollectionConfigurationResponse();
                }

                public PutCollectionConfigurationResponse build() {
                    return _build();
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
                    throw new IllegalArgumentException();
                }

                public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder setIfPresent(final PutCollectionConfigurationResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);



                    return this;
                }

                public Builder unset(final String fieldThriftName) {
                    throw new IllegalArgumentException();
                }

                public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
                    throw new IllegalArgumentException();
                }
            }

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

            public interface Validator<ExceptionT extends Exception> {
            }

            public interface ConstructionValidator extends Validator<RuntimeException> {
            }

            public static class DefaultConstructionValidator implements ConstructionValidator {
                public static DefaultConstructionValidator getInstance() {
                    return instance;
                }

                public DefaultConstructionValidator() {
                }

                private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
            }

            public static class NopConstructionValidator implements ConstructionValidator {
                public static NopConstructionValidator getInstance() {
                    return instance;
                }

                public NopConstructionValidator() {
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

                private final static DefaultReadValidator instance = new DefaultReadValidator();
            }

            public static class NopReadValidator implements ReadValidator {
                public static NopReadValidator getInstance() {
                    return instance;
                }

                public NopReadValidator() {
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            public PutCollectionConfigurationResponse() {
            }

            /**
             * Copy constructor
             */
            public PutCollectionConfigurationResponse(final PutCollectionConfigurationResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutCollectionConfigurationResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutCollectionConfigurationResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            public static PutCollectionConfigurationResponse create() {
                return new PutCollectionConfigurationResponse();
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
                return new PutCollectionConfigurationResponse();
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
                        switch (ifield.getName()) {
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
                return new PutCollectionConfigurationResponse();
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
        }

        public final static class PutInstitutionConfigurationRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    institutionId = null;
                    institutionConfiguration = null;
                }

                public Builder(final PutInstitutionConfigurationRequest other) {
                    this.institutionId = other.getInstitutionId();
                    this.institutionConfiguration = other.getInstitutionConfiguration();
                }

                protected PutInstitutionConfigurationRequest _build(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    return new PutInstitutionConfigurationRequest(institutionId, institutionConfiguration, DefaultConstructionValidator.getInstance());
                }

                public PutInstitutionConfigurationRequest build() {
                    return _build(institutionId, institutionConfiguration);
                }

                public final org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration() {
                    return institutionConfiguration;
                }

                public final org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
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
                        try {
                            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        }
                        institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
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
                            case "institution_id": {
                                try {
                                    institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                                }
                                break;
                            }
                            case "institution_configuration": {
                                institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
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
                    case INSTITUTION_ID: setInstitutionId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
                    case INSTITUTION_CONFIGURATION: setInstitutionConfiguration((org.dressdiscover.api.models.configuration.InstitutionConfiguration)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final PutInstitutionConfigurationRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setInstitutionId(other.getInstitutionId());
                    setInstitutionConfiguration(other.getInstitutionConfiguration());

                    return this;
                }

                public Builder setInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    this.institutionConfiguration = DefaultConstructionValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration);
                    return this;
                }

                public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    this.institutionId = DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
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
                    case INSTITUTION_ID: return unsetInstitutionId();
                    case INSTITUTION_CONFIGURATION: return unsetInstitutionConfiguration();
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

                private org.dressdiscover.api.models.institution.InstitutionId institutionId;
                private org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration;
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
                INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, 0, "institution_id", org.thryft.protocol.Type.STRING),
                INSTITUTION_CONFIGURATION("institutionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.InstitutionConfiguration>() {}, true, 0, "institution_configuration", org.thryft.protocol.Type.STRUCT);

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
                    case "institutionId": return INSTITUTION_ID;
                    case "institutionConfiguration": return INSTITUTION_CONFIGURATION;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "institution_id": return INSTITUTION_ID;
                    case "institution_configuration": return INSTITUTION_CONFIGURATION;
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
                public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws ExceptionT;

                public org.dressdiscover.api.models.configuration.InstitutionConfiguration validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws ExceptionT;
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
                public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws RuntimeException {
                    if (institutionId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionId is null");
                    }
                    return institutionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.InstitutionConfiguration validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws RuntimeException {
                    if (institutionConfiguration == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionConfiguration is null");
                    }
                    return institutionConfiguration;
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
                public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    return institutionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.InstitutionConfiguration validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    return institutionConfiguration;
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
                public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
                    if (institutionId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionId is null");
                    }
                    return institutionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.InstitutionConfiguration validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws org.thryft.protocol.InputProtocolException {
                    if (institutionConfiguration == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_CONFIGURATION, "org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionConfiguration is null");
                    }
                    return institutionConfiguration;
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
                public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    return institutionId;
                }

                @Override
                public org.dressdiscover.api.models.configuration.InstitutionConfiguration validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    return institutionConfiguration;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public PutInstitutionConfigurationRequest(final PutInstitutionConfigurationRequest other) {
                this(other.getInstitutionId(), other.getInstitutionConfiguration(), NopConstructionValidator.getInstance());
            }

            protected PutInstitutionConfigurationRequest(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, ConstructionValidator validator) {
                this.institutionId = validator.validateInstitutionId(institutionId);
                this.institutionConfiguration = validator.validateInstitutionConfiguration(institutionConfiguration);
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
            public static PutInstitutionConfigurationRequest create(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                return new PutInstitutionConfigurationRequest(institutionId, institutionConfiguration, DefaultConstructionValidator.getInstance());
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

                if (!(getInstitutionId().equals(other.getInstitutionId()))) {
                    return false;
                }

                if (!(getInstitutionConfiguration().equals(other.getInstitutionConfiguration()))) {
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
                case INSTITUTION_ID: return getInstitutionId();
                case INSTITUTION_CONFIGURATION: return getInstitutionConfiguration();
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
                hashCode = 31 * hashCode + getInstitutionId().hashCode();
                hashCode = 31 * hashCode + getInstitutionConfiguration().hashCode();
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
                org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
                org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration = null;

                try {
                    iprot.readListBegin();
                    try {
                        institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                    }
                    institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new PutInstitutionConfigurationRequest(DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration), NopConstructionValidator.getInstance());
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
                org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "institution_id": {
                            try {
                                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                            }
                            break;
                        }
                        case "institution_configuration": {
                            institutionConfiguration = org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot);
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
                return new PutInstitutionConfigurationRequest(DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration), NopConstructionValidator.getInstance());
            }

            public PutInstitutionConfigurationRequest replaceInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                return new PutInstitutionConfigurationRequest(this.institutionId, DefaultConstructionValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration), NopConstructionValidator.getInstance());
            }

            public PutInstitutionConfigurationRequest replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                return new PutInstitutionConfigurationRequest(DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId), this.institutionConfiguration, NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("institution_configuration", getInstitutionConfiguration()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeString(getInstitutionId().toString());

                getInstitutionConfiguration().writeAsStruct(oprot);

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
                oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getInstitutionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("institution_configuration", org.thryft.protocol.Type.STRUCT, (short)0);
                getInstitutionConfiguration().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final org.dressdiscover.api.models.institution.InstitutionId institutionId;

            private final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration;
        }

        public final static class PutInstitutionConfigurationResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                }

                public Builder(final PutInstitutionConfigurationResponse other) {
                }

                protected PutInstitutionConfigurationResponse _build() {
                    return new PutInstitutionConfigurationResponse();
                }

                public PutInstitutionConfigurationResponse build() {
                    return _build();
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
                    throw new IllegalArgumentException();
                }

                public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder setIfPresent(final PutInstitutionConfigurationResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);



                    return this;
                }

                public Builder unset(final String fieldThriftName) {
                    throw new IllegalArgumentException();
                }

                public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
                    throw new IllegalArgumentException();
                }
            }

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

            public interface Validator<ExceptionT extends Exception> {
            }

            public interface ConstructionValidator extends Validator<RuntimeException> {
            }

            public static class DefaultConstructionValidator implements ConstructionValidator {
                public static DefaultConstructionValidator getInstance() {
                    return instance;
                }

                public DefaultConstructionValidator() {
                }

                private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
            }

            public static class NopConstructionValidator implements ConstructionValidator {
                public static NopConstructionValidator getInstance() {
                    return instance;
                }

                public NopConstructionValidator() {
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

                private final static DefaultReadValidator instance = new DefaultReadValidator();
            }

            public static class NopReadValidator implements ReadValidator {
                public static NopReadValidator getInstance() {
                    return instance;
                }

                public NopReadValidator() {
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            public PutInstitutionConfigurationResponse() {
            }

            /**
             * Copy constructor
             */
            public PutInstitutionConfigurationResponse(final PutInstitutionConfigurationResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutInstitutionConfigurationResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutInstitutionConfigurationResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            public static PutInstitutionConfigurationResponse create() {
                return new PutInstitutionConfigurationResponse();
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
                return new PutInstitutionConfigurationResponse();
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
                        switch (ifield.getName()) {
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
                return new PutInstitutionConfigurationResponse();
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
        }
    }

    public void putCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws org.dressdiscover.api.services.IoException;

    public void putInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws org.dressdiscover.api.services.IoException;
}