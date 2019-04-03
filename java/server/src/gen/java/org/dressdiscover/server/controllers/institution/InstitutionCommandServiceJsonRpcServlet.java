package org.dressdiscover.server.controllers.institution;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class InstitutionCommandServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public InstitutionCommandServiceJsonRpcServlet(final org.dressdiscover.api.services.institution.InstitutionCommandService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "delete_institution_by_id": return __dispatchDeleteInstitutionById(iprot);
        case "put_institution": return __dispatchPutInstitution(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.DeleteInstitutionByIdResponse __dispatchDeleteInstitutionById(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.DeleteInstitutionByIdRequest serviceRequest = _readRequest(iprot, Messages.DeleteInstitutionByIdRequest.Factory.INSTANCE);
        try {
            service.deleteInstitutionById(serviceRequest.getId()); return Messages.DeleteInstitutionByIdResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException | org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private Messages.PutInstitutionResponse __dispatchPutInstitution(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.PutInstitutionRequest serviceRequest = _readRequest(iprot, Messages.PutInstitutionRequest.Factory.INSTANCE);
        try {
            service.putInstitution(serviceRequest.getId(), serviceRequest.getInstitution()); return Messages.PutInstitutionResponse.INSTANCE;
        } catch (final org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.institution.InstitutionCommandService service;

    private final static class Messages {
        public final static class DeleteInstitutionByIdRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, DeleteInstitutionByIdRequest> {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteInstitutionByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteInstitutionByIdRequest _build(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    return new DeleteInstitutionByIdRequest(id);
                }

                public DeleteInstitutionByIdRequest build() {
                    Validator.validate(id);

                    return _build(id);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId getId() {
                    return id;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        try {
                            this.setId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
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
                            case "id": {
                                try {
                                    this.setId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
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
                    case ID: setId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    Validator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final DeleteInstitutionByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

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
                    case ID: return unsetId();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId id;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteInstitutionByIdRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public DeleteInstitutionByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteInstitutionByIdRequest.readAsList(iprot);
                }

                @Override
                public DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteInstitutionByIdRequest.readAsStruct(iprot);
                }

                @Override
                public DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteInstitutionByIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING);

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
                    case "id": return ID;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
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
                public static void validate(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    validateId(id);
                }

                public static void validateId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.DeleteInstitutionByIdRequest: id is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public DeleteInstitutionByIdRequest(final DeleteInstitutionByIdRequest other) {
                this(other.getId());
            }

            /**
             * Total constructor
             */
            public DeleteInstitutionByIdRequest(final org.dressdiscover.api.models.institution.InstitutionId id) {
                Validator.validate(id);
                this.id = id;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteInstitutionByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteInstitutionByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteInstitutionByIdRequest)) {
                    return false;
                }

                final DeleteInstitutionByIdRequest other = (DeleteInstitutionByIdRequest)otherObject;

                if (!(getId().equals(other.getId()))) {
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
                case ID: return getId();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.institution.InstitutionId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                return getId().hashCode();
            }

            public static DeleteInstitutionByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public DeleteInstitutionByIdRequest replaceId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                Validator.validateId(id);
                return new DeleteInstitutionByIdRequest(id);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.DeleteInstitutionByIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getId().toString());
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeIdField(oprot);

                oprot.writeFieldStop();
            }

            public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ID);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.institution.InstitutionId id;
        }

        public final static class DeleteInstitutionByIdResponse implements org.thryft.Struct {
            private DeleteInstitutionByIdResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteInstitutionByIdResponse)) {
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
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.DeleteInstitutionByIdResponse");
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

            public final static DeleteInstitutionByIdResponse INSTANCE = new DeleteInstitutionByIdResponse();
        }

        public final static class PutInstitutionRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, PutInstitutionRequest> {
                public Builder() {
                    id = null;
                    institution = null;
                }

                public Builder(final PutInstitutionRequest other) {
                    this.id = other.getId();
                    this.institution = other.getInstitution();
                }

                protected PutInstitutionRequest _build(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
                    return new PutInstitutionRequest(id, institution);
                }

                public PutInstitutionRequest build() {
                    Validator.validate(id, institution);

                    return _build(id, institution);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId getId() {
                    return id;
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.Institution getInstitution() {
                    return institution;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readListBegin();
                        try {
                            this.setId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        this.setInstitution(org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot));
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
                            case "id": {
                                try {
                                    this.setId(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                                }
                                break;
                            }
                            case "institution": {
                                this.setInstitution(org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot, unknownFieldCallback));
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
                    case ID: setId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
                    case INSTITUTION: setInstitution((org.dressdiscover.api.models.institution.Institution)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    Validator.validateId(id);
                    this.id = id;
                    return this;
                }

                public Builder setIfPresent(final PutInstitutionRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());
                    setInstitution(other.getInstitution());

                    return this;
                }

                public Builder setInstitution(final org.dressdiscover.api.models.institution.Institution institution) {
                    Validator.validateInstitution(institution);
                    this.institution = institution;
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
                    case ID: return unsetId();
                    case INSTITUTION: return unsetInstitution();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unsetInstitution() {
                    this.institution = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId id;
                private @javax.annotation.Nullable org.dressdiscover.api.models.institution.Institution institution;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutInstitutionRequest> {
                public final static Factory INSTANCE = new Factory();

                @Override
                public PutInstitutionRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionRequest.readAsList(iprot);
                }

                @Override
                public PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionRequest.readAsStruct(iprot);
                }

                @Override
                public PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutInstitutionRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING),
                INSTITUTION("institution", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.Institution>() {}, true, (short)0, "institution", "institution", org.thryft.protocol.Type.STRUCT);

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
                    case "id": return ID;
                    case "institution": return INSTITUTION;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
                    case "institution": return INSTITUTION;
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
                public static void validate(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
                    validateId(id);
                    validateInstitution(institution);
                }

                public static void validateId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                    if (id == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.PutInstitutionRequest: id is missing");
                    }
                }

                public static void validateInstitution(final org.dressdiscover.api.models.institution.Institution institution) {
                    if (institution == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.PutInstitutionRequest: institution is missing");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutInstitutionRequest(final PutInstitutionRequest other) {
                this(other.getId(), other.getInstitution());
            }

            /**
             * Total constructor
             */
            public PutInstitutionRequest(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
                Validator.validate(id, institution);
                this.id = id;
                this.institution = institution;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutInstitutionRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutInstitutionRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutInstitutionRequest)) {
                    return false;
                }

                final PutInstitutionRequest other = (PutInstitutionRequest)otherObject;

                if (!(getId().equals(other.getId()))) {
                    return false;
                }

                if (!(getInstitution().equals(other.getInstitution()))) {
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
                case ID: return getId();
                case INSTITUTION: return getInstitution();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.institution.InstitutionId getId() {
                return id;
            }

            public final org.dressdiscover.api.models.institution.Institution getInstitution() {
                return institution;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                hashCode = 31 * hashCode + getInstitution().hashCode();
                return hashCode;
            }

            public static PutInstitutionRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public PutInstitutionRequest replaceId(final org.dressdiscover.api.models.institution.InstitutionId id) {
                Validator.validateId(id);
                return new PutInstitutionRequest(id, this.institution);
            }

            public PutInstitutionRequest replaceInstitution(final org.dressdiscover.api.models.institution.Institution institution) {
                Validator.validateInstitution(institution);
                return new PutInstitutionRequest(this.id, institution);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("institution", getInstitution()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.PutInstitutionRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeString(getId().toString());
                getInstitution().writeAsStruct(oprot);
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeIdField(oprot);

                writeInstitutionField(oprot);

                oprot.writeFieldStop();
            }

            public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ID);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();
            }

            public void writeInstitutionField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.INSTITUTION);
                getInstitution().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.institution.InstitutionId id;

            private final org.dressdiscover.api.models.institution.Institution institution;
        }

        public final static class PutInstitutionResponse implements org.thryft.Struct {
            private PutInstitutionResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutInstitutionResponse)) {
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
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.PutInstitutionResponse");
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

            public final static PutInstitutionResponse INSTANCE = new PutInstitutionResponse();
        }
    }
}
