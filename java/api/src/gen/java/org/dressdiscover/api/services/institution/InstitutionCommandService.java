package org.dressdiscover.api.services.institution;

public interface InstitutionCommandService {
    public enum FunctionMetadata {
        DELETE_INSTITUTION_BY_ID("delete_institution_by_id"),
        PUT_INSTITUTION("put_institution");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class DeleteInstitutionByIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteInstitutionByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteInstitutionByIdRequest _build(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                    return new DeleteInstitutionByIdRequest(id);
                }

                public DeleteInstitutionByIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.DeleteInstitutionByIdRequest: missing id"));
                }

                public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
                    return id;
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
                    iprot.readListBegin();
                    try {
                        id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "id": {
                            try {
                                id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.InputProtocolException(e);
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
                    case ID: setId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
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

                private net.lab1318.costume.api.models.institution.InstitutionId id;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING);

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

            /**
             * Copy constructor
             */
            public DeleteInstitutionByIdRequest(final DeleteInstitutionByIdRequest other) {
                this(other.getId());
            }

            /**
             * Optional constructor
             */
            public DeleteInstitutionByIdRequest(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.DeleteInstitutionByIdRequest: missing id");
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
                } else if (!(otherObject instanceof DeleteInstitutionByIdRequest)) {
                    return false;
                }

                final DeleteInstitutionByIdRequest other = (DeleteInstitutionByIdRequest)otherObject;
                return
                    getId().equals(other.getId());
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

            public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static DeleteInstitutionByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteInstitutionByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteInstitutionByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId id = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new DeleteInstitutionByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId id = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
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
                try {
                    return new DeleteInstitutionByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public DeleteInstitutionByIdRequest replaceId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                return new DeleteInstitutionByIdRequest(id);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.DeleteInstitutionByIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.institution.InstitutionId id;
        }

        public final static class DeleteInstitutionByIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteInstitutionByIdResponse other) {
                }

                protected DeleteInstitutionByIdResponse _build() {
                    return new DeleteInstitutionByIdResponse();
                }

                public DeleteInstitutionByIdResponse build() {
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
                    iprot.readListBegin();
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return this;
                }

                public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder setIfPresent(final DeleteInstitutionByIdResponse other) {
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

            public DeleteInstitutionByIdResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteInstitutionByIdResponse(final DeleteInstitutionByIdResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteInstitutionByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteInstitutionByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteInstitutionByIdResponse)) {
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

            @Override
            public boolean isEmpty() {
                return true;
            }

            public static DeleteInstitutionByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteInstitutionByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteInstitutionByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteInstitutionByIdResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteInstitutionByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteInstitutionByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                try {
                    return new DeleteInstitutionByIdResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
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
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.DeleteInstitutionByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class PutInstitutionRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                    institution = null;
                }

                public Builder(final PutInstitutionRequest other) {
                    this.id = other.getId();
                    this.institution = other.getInstitution();
                }

                protected PutInstitutionRequest _build(final net.lab1318.costume.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
                    return new PutInstitutionRequest(id, institution);
                }

                public PutInstitutionRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.PutInstitutionRequest: missing id"), com.google.common.base.Preconditions.checkNotNull(institution, "org.dressdiscover.api.services.institution.PutInstitutionRequest: missing institution"));
                }

                public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
                    return id;
                }

                public final org.dressdiscover.api.models.institution.Institution getInstitution() {
                    return institution;
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
                    iprot.readListBegin();
                    try {
                        id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    institution = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "id": {
                            try {
                                id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.InputProtocolException(e);
                            }
                            break;
                        }
                        case "institution": {
                            institution = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
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
                    case ID: setId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
                    case INSTITUTION: setInstitution((org.dressdiscover.api.models.institution.Institution)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final PutInstitutionRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());
                    setInstitution(other.getInstitution());

                    return this;
                }

                public Builder setInstitution(final org.dressdiscover.api.models.institution.Institution institution) {
                    this.institution = com.google.common.base.Preconditions.checkNotNull(institution);
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

                private net.lab1318.costume.api.models.institution.InstitutionId id;
                private org.dressdiscover.api.models.institution.Institution institution;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
                INSTITUTION("institution", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.Institution>() {}, true, 0, "institution", org.thryft.protocol.Type.STRUCT);

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

            /**
             * Copy constructor
             */
            public PutInstitutionRequest(final PutInstitutionRequest other) {
                this(other.getId(), other.getInstitution());
            }

            /**
             * Optional constructor
             */
            public PutInstitutionRequest(final net.lab1318.costume.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.PutInstitutionRequest: missing id");
                this.institution = com.google.common.base.Preconditions.checkNotNull(institution, "org.dressdiscover.api.services.institution.PutInstitutionRequest: missing institution");
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
                } else if (!(otherObject instanceof PutInstitutionRequest)) {
                    return false;
                }

                final PutInstitutionRequest other = (PutInstitutionRequest)otherObject;
                return
                    getId().equals(other.getId()) &&
                    getInstitution().equals(other.getInstitution());
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

            public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
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

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PutInstitutionRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutInstitutionRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId id = null;
                org.dressdiscover.api.models.institution.Institution institution = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                institution = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PutInstitutionRequest(id, institution);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId id = null;
                org.dressdiscover.api.models.institution.Institution institution = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                        break;
                    }
                    case "institution": {
                        institution = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
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
                try {
                    return new PutInstitutionRequest(id, institution);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PutInstitutionRequest replaceId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                return new PutInstitutionRequest(id, this.institution);
            }

            public PutInstitutionRequest replaceInstitution(final org.dressdiscover.api.models.institution.Institution institution) {
                return new PutInstitutionRequest(this.id, institution);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("institution", getInstitution()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeString(getId().toString());

                getInstitution().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.PutInstitutionRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("institution", org.thryft.protocol.Type.STRUCT, (short)0);
                getInstitution().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.institution.InstitutionId id;

            private final org.dressdiscover.api.models.institution.Institution institution;
        }

        public final static class PutInstitutionResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutInstitutionResponse other) {
                }

                protected PutInstitutionResponse _build() {
                    return new PutInstitutionResponse();
                }

                public PutInstitutionResponse build() {
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
                    iprot.readListBegin();
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return this;
                }

                public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    throw new IllegalArgumentException();
                }

                public Builder setIfPresent(final PutInstitutionResponse other) {
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

            public PutInstitutionResponse() {
            }

            /**
             * Copy constructor
             */
            public PutInstitutionResponse(final PutInstitutionResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutInstitutionResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutInstitutionResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutInstitutionResponse)) {
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

            @Override
            public boolean isEmpty() {
                return true;
            }

            public static PutInstitutionResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutInstitutionResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new PutInstitutionResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PutInstitutionResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutInstitutionResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                try {
                    return new PutInstitutionResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
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
                oprot.writeStructBegin("org.dressdiscover.api.services.institution.PutInstitutionResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }
    }

    public void deleteInstitutionById(final net.lab1318.costume.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;

    public void putInstitution(final net.lab1318.costume.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) throws org.dressdiscover.api.services.IoException;
}
