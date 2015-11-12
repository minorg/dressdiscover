package net.lab1318.costume.api.services.institution;

public interface InstitutionQueryService {
    public enum FunctionMetadata {
        GET_INSTITUTION_BY_ID("get_institution_by_id"),
        GET_INSTITUTIONS("get_institutions"),
        GET_INSTITUTIONS_BY_IDS("get_institutions_by_ids");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetInstitutionByIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final GetInstitutionByIdRequest other) {
                    this.id = other.getId();
                }

                protected GetInstitutionByIdRequest _build(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                    return new GetInstitutionByIdRequest(id);
                }

                public GetInstitutionByIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.GetInstitutionByIdRequest: missing id"));
                }

                public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
                    return id;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
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
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": setId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
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
            public GetInstitutionByIdRequest(final GetInstitutionByIdRequest other) {
                this(other.getId());
            }

            /**
             * Optional constructor
             */
            public GetInstitutionByIdRequest(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.GetInstitutionByIdRequest: missing id");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionByIdRequest)) {
                    return false;
                }

                final GetInstitutionByIdRequest other = (GetInstitutionByIdRequest)otherObject;
                return
                    getId().equals(other.getId());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "id": return getId();
                default:
                    throw new IllegalArgumentException(fieldName);
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

            public static GetInstitutionByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId id = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new GetInstitutionByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetInstitutionByIdRequest replaceId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
                return new GetInstitutionByIdRequest(id);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionByIdRequest");
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

        public final static class GetInstitutionByIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetInstitutionByIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetInstitutionByIdResponse _build(final net.lab1318.costume.api.models.institution.Institution returnValue) {
                    return new GetInstitutionByIdResponse(returnValue);
                }

                public GetInstitutionByIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.GetInstitutionByIdResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.institution.Institution getReturnValue() {
                    return returnValue;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readListBegin();
                    returnValue = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionByIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.institution.Institution returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.institution.Institution)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private net.lab1318.costume.api.models.institution.Institution returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.Institution>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
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
            public GetInstitutionByIdResponse(final GetInstitutionByIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetInstitutionByIdResponse(final net.lab1318.costume.api.models.institution.Institution returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionById: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionByIdResponse)) {
                    return false;
                }

                final GetInstitutionByIdResponse other = (GetInstitutionByIdResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "return_value": return getReturnValue();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.institution.Institution getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetInstitutionByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.Institution returnValue = null;

                iprot.readListBegin();
                returnValue = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new GetInstitutionByIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.Institution returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionByIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetInstitutionByIdResponse replaceReturnValue(final net.lab1318.costume.api.models.institution.Institution returnValue) {
                return new GetInstitutionByIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getReturnValue().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.STRUCT, (short)0);
                getReturnValue().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.institution.Institution returnValue;
        }

        public final static class GetInstitutionsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetInstitutionsRequest other) {
                }

                protected GetInstitutionsRequest _build() {
                    return new GetInstitutionsRequest();
                }

                public GetInstitutionsRequest build() {
                    return _build();
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
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
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);



                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public GetInstitutionsRequest() {
            }

            /**
             * Copy constructor
             */
            public GetInstitutionsRequest(final GetInstitutionsRequest other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionsRequest)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            public static GetInstitutionsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new GetInstitutionsRequest();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionsRequest();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class GetInstitutionsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetInstitutionsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetInstitutionsResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue) {
                    return new GetInstitutionsResponse(returnValue);
                }

                public GetInstitutionsResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.GetInstitutionsResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> getReturnValue() {
                    return returnValue;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readListBegin();
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.institution.InstitutionEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.institution.InstitutionEntry.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
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
            public GetInstitutionsResponse(final GetInstitutionsResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetInstitutionsResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutions: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionsResponse)) {
                    return false;
                }

                final GetInstitutionsResponse other = (GetInstitutionsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "return_value": return getReturnValue();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetInstitutionsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.institution.InstitutionEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetInstitutionsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionEntry.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetInstitutionsResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue) {
                return new GetInstitutionsResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.institution.InstitutionEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.institution.InstitutionEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> returnValue;
        }

        public final static class GetInstitutionsByIdsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    ids = null;
                }

                public Builder(final GetInstitutionsByIdsRequest other) {
                    this.ids = other.getIds();
                }

                protected GetInstitutionsByIdsRequest _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids) {
                    return new GetInstitutionsByIdsRequest(ids);
                }

                public GetInstitutionsByIdsRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(ids, "net.lab1318.costume.api.services.institution.GetInstitutionsByIdsRequest: missing ids"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> getIds() {
                    return ids;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readListBegin();
                    ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "ids": {
                            ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIds(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids) {
                    this.ids = com.google.common.base.Preconditions.checkNotNull(ids);
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionsByIdsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setIds(other.getIds());

                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "ids": setIds((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetIds() {
                    this.ids = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                IDS("ids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, true, 0, "ids", org.thryft.protocol.Type.LIST);

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
                    case "ids": return IDS;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "ids": return IDS;
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
            public GetInstitutionsByIdsRequest(final GetInstitutionsByIdsRequest other) {
                this(other.getIds());
            }

            /**
             * Optional constructor
             */
            public GetInstitutionsByIdsRequest(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids) {
                this.ids = com.google.common.base.Preconditions.checkNotNull(ids, "net.lab1318.costume.api.services.institution.GetInstitutionsByIdsRequest: missing ids");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionsByIdsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionsByIdsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionsByIdsRequest)) {
                    return false;
                }

                final GetInstitutionsByIdsRequest other = (GetInstitutionsByIdsRequest)otherObject;
                return
                    getIds().equals(other.getIds());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "ids": return getIds();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> getIds() {
                return ids;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getIds().hashCode();
                return hashCode;
            }

            public static GetInstitutionsByIdsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionsByIdsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids = null;

                iprot.readListBegin();
                ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetInstitutionsByIdsRequest(ids);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionsByIdsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "ids": {
                        ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionsByIdsRequest(ids);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetInstitutionsByIdsRequest replaceIds(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids) {
                return new GetInstitutionsByIdsRequest(ids);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ids", getIds()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIds().size());
                for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIds()) {
                    oprot.writeString(_iter0.toString());
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionsByIdsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("ids", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIds().size());
                for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIds()) {
                    oprot.writeString(_iter0.toString());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids;
        }

        public final static class GetInstitutionsByIdsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetInstitutionsByIdsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetInstitutionsByIdsResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue) {
                    return new GetInstitutionsByIdsResponse(returnValue);
                }

                public GetInstitutionsByIdsResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.GetInstitutionsByIdsResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> getReturnValue() {
                    return returnValue;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readListBegin();
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.Institution> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.Institution> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetInstitutionsByIdsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
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
            public GetInstitutionsByIdsResponse(final GetInstitutionsByIdsResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetInstitutionsByIdsResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionsByIds: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetInstitutionsByIdsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetInstitutionsByIdsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetInstitutionsByIdsResponse)) {
                    return false;
                }

                final GetInstitutionsByIdsResponse other = (GetInstitutionsByIdsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "return_value": return getReturnValue();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetInstitutionsByIdsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetInstitutionsByIdsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.Institution> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetInstitutionsByIdsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetInstitutionsByIdsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.institution.Institution> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetInstitutionsByIdsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetInstitutionsByIdsResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue) {
                return new GetInstitutionsByIdsResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.institution.Institution _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.institution.GetInstitutionsByIdsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.institution.Institution _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> returnValue;
        }
    }

    public net.lab1318.costume.api.models.institution.Institution getInstitutionById(final net.lab1318.costume.api.models.institution.InstitutionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException;

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> getInstitutions() throws net.lab1318.costume.api.services.IoException;

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionId> ids) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
}
