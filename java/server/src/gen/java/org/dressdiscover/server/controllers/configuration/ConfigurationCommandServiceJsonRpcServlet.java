package org.dressdiscover.server.controllers.configuration;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class ConfigurationCommandServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public ConfigurationCommandServiceJsonRpcServlet(final org.dressdiscover.api.services.configuration.ConfigurationCommandService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "put_collection_configuration": return __dispatchPutCollectionConfiguration(iprot);
        case "put_institution_configuration": return __dispatchPutInstitutionConfiguration(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.PutCollectionConfigurationResponse __dispatchPutCollectionConfiguration(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PutCollectionConfigurationRequest serviceRequest = _readRequest(iprot, Messages.PutCollectionConfigurationRequest.Factory.INSTANCE);
        try {
            service.putCollectionConfiguration(serviceRequest.getCollectionConfiguration(), serviceRequest.getCollectionId()); return Messages.PutCollectionConfigurationResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.PutInstitutionConfigurationResponse __dispatchPutInstitutionConfiguration(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PutInstitutionConfigurationRequest serviceRequest = _readRequest(iprot, Messages.PutInstitutionConfigurationRequest.Factory.INSTANCE);
        try {
            service.putInstitutionConfiguration(serviceRequest.getInstitutionConfiguration(), serviceRequest.getInstitutionId()); return Messages.PutInstitutionConfigurationResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService service;

    private final static class Messages {
        public final static class PutCollectionConfigurationRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PutCollectionConfigurationRequest> {
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
                    Validator.validate(collectionConfiguration, collectionId);

                    return _build(collectionConfiguration, collectionId);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration() {
                    return collectionConfiguration;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
                    return collectionId;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        this.setCollectionConfiguration(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot));
                        try {
                            this.setCollectionId(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        }
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
                            case "collection_configuration": {
                                this.setCollectionConfiguration(org.dressdiscover.api.models.configuration.CollectionConfiguration.readAsStruct(iprot, unknownFieldCallback));
                                break;
                            }
                            case "collection_id": {
                                try {
                                    this.setCollectionId(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
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
                    case COLLECTION_CONFIGURATION: setCollectionConfiguration((org.dressdiscover.api.models.configuration.CollectionConfiguration)value); return this;
                    case COLLECTION_ID: setCollectionId((org.dressdiscover.api.models.collection.CollectionId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    Validator.validateCollectionConfiguration(collectionConfiguration);
                    this.collectionConfiguration = collectionConfiguration;
                    return this;
                }

                public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    Validator.validateCollectionId(collectionId);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public PutCollectionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsList(iprot);
                }

                @Override
                public PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsStruct(iprot);
                }

                @Override
                public PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutCollectionConfigurationRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                COLLECTION_CONFIGURATION("collectionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.CollectionConfiguration>() {}, true, (short)0, "collection_configuration", "collection_configuration", org.thryft.protocol.Type.STRUCT),
                COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, (short)0, "collection_id", "collection_id", org.thryft.protocol.Type.STRING);

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
                public static void validate(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    validateCollectionConfiguration(collectionConfiguration);
                    validateCollectionId(collectionId);
                }

                public static void validateCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                    if (collectionConfiguration == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionConfiguration is missing");
                    }
                }

                public static void validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                    if (collectionId == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.configuration.PutCollectionConfigurationRequest: collectionId is missing");
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
             */
            public PutCollectionConfigurationRequest(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                Validator.validate(collectionConfiguration, collectionId);
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

            public static PutCollectionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PutCollectionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PutCollectionConfigurationRequest replaceCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) {
                Validator.validateCollectionConfiguration(collectionConfiguration);
                return new PutCollectionConfigurationRequest(collectionConfiguration, this.collectionId);
            }

            public PutCollectionConfigurationRequest replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
                Validator.validateCollectionId(collectionId);
                return new PutCollectionConfigurationRequest(this.collectionConfiguration, collectionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_configuration", getCollectionConfiguration()).add("collection_id", getCollectionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
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
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getCollectionConfiguration().writeAsStruct(oprot);
                oprot.writeString(getCollectionId().toString());
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
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutCollectionConfigurationResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutCollectionConfigurationResponse INSTANCE = new PutCollectionConfigurationResponse();
        }

        public final static class PutInstitutionConfigurationRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PutInstitutionConfigurationRequest> {
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
                    Validator.validate(institutionConfiguration, institutionId);

                    return _build(institutionConfiguration, institutionId);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration() {
                    return institutionConfiguration;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
                    return institutionId;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        this.setInstitutionConfiguration(org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot));
                        try {
                            this.setInstitutionId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        }
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
                            case "institution_configuration": {
                                this.setInstitutionConfiguration(org.dressdiscover.api.models.configuration.InstitutionConfiguration.readAsStruct(iprot, unknownFieldCallback));
                                break;
                            }
                            case "institution_id": {
                                try {
                                    this.setInstitutionId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
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
                    Validator.validateInstitutionConfiguration(institutionConfiguration);
                    this.institutionConfiguration = institutionConfiguration;
                    return this;
                }

                public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    Validator.validateInstitutionId(institutionId);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public PutInstitutionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsList(iprot);
                }

                @Override
                public PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsStruct(iprot);
                }

                @Override
                public PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionConfigurationRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                INSTITUTION_CONFIGURATION("institutionConfiguration", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.configuration.InstitutionConfiguration>() {}, true, (short)0, "institution_configuration", "institution_configuration", org.thryft.protocol.Type.STRUCT),
                INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, (short)0, "institution_id", "institution_id", org.thryft.protocol.Type.STRING);

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
                public static void validate(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    validateInstitutionConfiguration(institutionConfiguration);
                    validateInstitutionId(institutionId);
                }

                public static void validateInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                    if (institutionConfiguration == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionConfiguration is missing");
                    }
                }

                public static void validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                    if (institutionId == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest: institutionId is missing");
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
             */
            public PutInstitutionConfigurationRequest(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                Validator.validate(institutionConfiguration, institutionId);
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

            public static PutInstitutionConfigurationRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PutInstitutionConfigurationRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PutInstitutionConfigurationRequest replaceInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
                Validator.validateInstitutionConfiguration(institutionConfiguration);
                return new PutInstitutionConfigurationRequest(institutionConfiguration, this.institutionId);
            }

            public PutInstitutionConfigurationRequest replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
                Validator.validateInstitutionId(institutionId);
                return new PutInstitutionConfigurationRequest(this.institutionConfiguration, institutionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_configuration", getInstitutionConfiguration()).add("institution_id", getInstitutionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getInstitutionConfiguration().writeAsStruct(oprot);
                oprot.writeString(getInstitutionId().toString());
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
                return 17;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.configuration.PutInstitutionConfigurationResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutInstitutionConfigurationResponse INSTANCE = new PutInstitutionConfigurationResponse();
        }
    }
}
