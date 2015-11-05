package net.lab1318.costume.api.services.object;

public interface ObjectQueryService {
    public enum FunctionMetadata {
        GET_OBJECT_BY_ID("get_object_by_id"),
        GET_OBJECT_COUNT("get_object_count"),
        GET_OBJECT_COUNT_BY_COLLECTION_ID("get_object_count_by_collection_id"),
        GET_OBJECT_COUNT_BY_INSTITUTION_ID("get_object_count_by_institution_id"),
        GET_OBJECTS("get_objects"),
        GET_OBJECTS_BY_COLLECTION_ID("get_objects_by_collection_id"),
        GET_OBJECTS_BY_INSTITUTION_ID("get_objects_by_institution_id");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetObjectByIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final GetObjectByIdRequest other) {
                    this.id = other.getId();
                }

                protected GetObjectByIdRequest _build(final net.lab1318.costume.api.models.object.ObjectId id) {
                    return new GetObjectByIdRequest(id);
                }

                public GetObjectByIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.GetObjectByIdRequest: missing id"));
                }

                public final net.lab1318.costume.api.models.object.ObjectId getId() {
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
                        id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                         throw new IllegalArgumentException(e);
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
                                id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                                 throw new IllegalArgumentException(e);
                            }
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setId(final net.lab1318.costume.api.models.object.ObjectId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final GetObjectByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": setId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                private net.lab1318.costume.api.models.object.ObjectId id;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING);

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
            public GetObjectByIdRequest(final GetObjectByIdRequest other) {
                this(other.getId());
            }

            /**
             * Optional constructor
             */
            public GetObjectByIdRequest(final net.lab1318.costume.api.models.object.ObjectId id) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.GetObjectByIdRequest: missing id");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectByIdRequest)) {
                    return false;
                }

                final GetObjectByIdRequest other = (GetObjectByIdRequest)otherObject;
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

            public final net.lab1318.costume.api.models.object.ObjectId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                return hashCode;
            }

            public static GetObjectByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.ObjectId id = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                     throw new IllegalArgumentException(e);
                }
                iprot.readListEnd();
                try {
                    return new GetObjectByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.ObjectId id = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectByIdRequest replaceId(final net.lab1318.costume.api.models.object.ObjectId id) {
                return new GetObjectByIdRequest(id);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectByIdRequest");
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

            private final net.lab1318.costume.api.models.object.ObjectId id;
        }

        public final static class GetObjectByIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectByIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectByIdResponse _build(final net.lab1318.costume.api.models.object.Object returnValue) {
                    return new GetObjectByIdResponse(returnValue);
                }

                public GetObjectByIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectByIdResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.object.Object getReturnValue() {
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
                    returnValue = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
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
                            returnValue = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectByIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.object.Object returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.object.Object)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private net.lab1318.costume.api.models.object.Object returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.Object>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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
            public GetObjectByIdResponse(final GetObjectByIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectByIdResponse(final net.lab1318.costume.api.models.object.Object returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectByIdResponse)) {
                    return false;
                }

                final GetObjectByIdResponse other = (GetObjectByIdResponse)otherObject;
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

            public final net.lab1318.costume.api.models.object.Object getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.Object returnValue = null;

                iprot.readListBegin();
                returnValue = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectByIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.Object returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectByIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectByIdResponse replaceReturnValue(final net.lab1318.costume.api.models.object.Object returnValue) {
                return new GetObjectByIdResponse(returnValue);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectByIdResponse");
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

            private final net.lab1318.costume.api.models.object.Object returnValue;
        }

        public final static class GetObjectCountRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetObjectCountRequest other) {
                }

                protected GetObjectCountRequest _build() {
                    return new GetObjectCountRequest();
                }

                public GetObjectCountRequest build() {
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

                public Builder setIfPresent(final GetObjectCountRequest other) {
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

            public GetObjectCountRequest() {
            }

            /**
             * Copy constructor
             */
            public GetObjectCountRequest(final GetObjectCountRequest other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountRequest)) {
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

            public static GetObjectCountRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new GetObjectCountRequest();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    return new GetObjectCountRequest();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class GetObjectCountResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectCountResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectCountResponse _build(final com.google.common.primitives.UnsignedInteger returnValue) {
                    return new GetObjectCountResponse(returnValue);
                }

                public GetObjectCountResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectCountResponse: missing returnValue"));
                }

                public final com.google.common.primitives.UnsignedInteger getReturnValue() {
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
                    returnValue = iprot.readU32();
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
                            returnValue = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private com.google.common.primitives.UnsignedInteger returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "return_value", org.thryft.protocol.Type.I32);

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
            public GetObjectCountResponse(final GetObjectCountResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectCountResponse(final com.google.common.primitives.UnsignedInteger returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCount: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountResponse)) {
                    return false;
                }

                final GetObjectCountResponse other = (GetObjectCountResponse)otherObject;
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

            public final com.google.common.primitives.UnsignedInteger getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectCountResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                returnValue = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectCountResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountResponse replaceReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                return new GetObjectCountResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeU32(getReturnValue());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getReturnValue());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.primitives.UnsignedInteger returnValue;
        }

        public final static class GetObjectCountByCollectionIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    collectionId = null;
                }

                public Builder(final GetObjectCountByCollectionIdRequest other) {
                    this.collectionId = other.getCollectionId();
                }

                protected GetObjectCountByCollectionIdRequest _build(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                    return new GetObjectCountByCollectionIdRequest(collectionId);
                }

                public GetObjectCountByCollectionIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.GetObjectCountByCollectionIdRequest: missing collectionId"));
                }

                public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
                    return collectionId;
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
                        collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                         throw new IllegalArgumentException(e);
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
                        case "collection_id": {
                            try {
                                collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                 throw new IllegalArgumentException(e);
                            }
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                    this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountByCollectionIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setCollectionId(other.getCollectionId());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetCollectionId() {
                    this.collectionId = null;
                    return this;
                }

                private net.lab1318.costume.api.models.collection.CollectionId collectionId;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 0, "collection_id", org.thryft.protocol.Type.STRING);

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
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "collection_id": return COLLECTION_ID;
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
            public GetObjectCountByCollectionIdRequest(final GetObjectCountByCollectionIdRequest other) {
                this(other.getCollectionId());
            }

            /**
             * Optional constructor
             */
            public GetObjectCountByCollectionIdRequest(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.GetObjectCountByCollectionIdRequest: missing collectionId");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountByCollectionIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountByCollectionIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountByCollectionIdRequest)) {
                    return false;
                }

                final GetObjectCountByCollectionIdRequest other = (GetObjectCountByCollectionIdRequest)otherObject;
                return
                    getCollectionId().equals(other.getCollectionId());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "collection_id": return getCollectionId();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
                return collectionId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCollectionId().hashCode();
                return hashCode;
            }

            public static GetObjectCountByCollectionIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountByCollectionIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId collectionId = null;

                iprot.readListBegin();
                try {
                    collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                     throw new IllegalArgumentException(e);
                }
                iprot.readListEnd();
                try {
                    return new GetObjectCountByCollectionIdRequest(collectionId);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountByCollectionIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId collectionId = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "collection_id": {
                        try {
                            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountByCollectionIdRequest(collectionId);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountByCollectionIdRequest replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                return new GetObjectCountByCollectionIdRequest(collectionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getCollectionId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountByCollectionIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getCollectionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.collection.CollectionId collectionId;
        }

        public final static class GetObjectCountByCollectionIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectCountByCollectionIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectCountByCollectionIdResponse _build(final com.google.common.primitives.UnsignedInteger returnValue) {
                    return new GetObjectCountByCollectionIdResponse(returnValue);
                }

                public GetObjectCountByCollectionIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectCountByCollectionIdResponse: missing returnValue"));
                }

                public final com.google.common.primitives.UnsignedInteger getReturnValue() {
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
                    returnValue = iprot.readU32();
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
                            returnValue = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountByCollectionIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private com.google.common.primitives.UnsignedInteger returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "return_value", org.thryft.protocol.Type.I32);

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
            public GetObjectCountByCollectionIdResponse(final GetObjectCountByCollectionIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectCountByCollectionIdResponse(final com.google.common.primitives.UnsignedInteger returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByCollectionId: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountByCollectionIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountByCollectionIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountByCollectionIdResponse)) {
                    return false;
                }

                final GetObjectCountByCollectionIdResponse other = (GetObjectCountByCollectionIdResponse)otherObject;
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

            public final com.google.common.primitives.UnsignedInteger getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectCountByCollectionIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountByCollectionIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                returnValue = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectCountByCollectionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountByCollectionIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountByCollectionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountByCollectionIdResponse replaceReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                return new GetObjectCountByCollectionIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeU32(getReturnValue());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountByCollectionIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getReturnValue());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.primitives.UnsignedInteger returnValue;
        }

        public final static class GetObjectCountByInstitutionIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    institutionId = null;
                }

                public Builder(final GetObjectCountByInstitutionIdRequest other) {
                    this.institutionId = other.getInstitutionId();
                }

                protected GetObjectCountByInstitutionIdRequest _build(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                    return new GetObjectCountByInstitutionIdRequest(institutionId);
                }

                public GetObjectCountByInstitutionIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.GetObjectCountByInstitutionIdRequest: missing institutionId"));
                }

                public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
                    return institutionId;
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
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new IllegalArgumentException(e);
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
                        case "institution_id": {
                            try {
                                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new IllegalArgumentException(e);
                            }
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountByInstitutionIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setInstitutionId(other.getInstitutionId());

                    return this;
                }

                public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                    this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetInstitutionId() {
                    this.institutionId = null;
                    return this;
                }

                private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 0, "institution_id", org.thryft.protocol.Type.STRING);

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
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "institution_id": return INSTITUTION_ID;
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
            public GetObjectCountByInstitutionIdRequest(final GetObjectCountByInstitutionIdRequest other) {
                this(other.getInstitutionId());
            }

            /**
             * Optional constructor
             */
            public GetObjectCountByInstitutionIdRequest(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.GetObjectCountByInstitutionIdRequest: missing institutionId");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountByInstitutionIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountByInstitutionIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountByInstitutionIdRequest)) {
                    return false;
                }

                final GetObjectCountByInstitutionIdRequest other = (GetObjectCountByInstitutionIdRequest)otherObject;
                return
                    getInstitutionId().equals(other.getInstitutionId());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "institution_id": return getInstitutionId();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
                return institutionId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getInstitutionId().hashCode();
                return hashCode;
            }

            public static GetObjectCountByInstitutionIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountByInstitutionIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;

                iprot.readListBegin();
                try {
                    institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                     throw new IllegalArgumentException(e);
                }
                iprot.readListEnd();
                try {
                    return new GetObjectCountByInstitutionIdRequest(institutionId);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountByInstitutionIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "institution_id": {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountByInstitutionIdRequest(institutionId);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountByInstitutionIdRequest replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                return new GetObjectCountByInstitutionIdRequest(institutionId);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getInstitutionId().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountByInstitutionIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getInstitutionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        }

        public final static class GetObjectCountByInstitutionIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectCountByInstitutionIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectCountByInstitutionIdResponse _build(final com.google.common.primitives.UnsignedInteger returnValue) {
                    return new GetObjectCountByInstitutionIdResponse(returnValue);
                }

                public GetObjectCountByInstitutionIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectCountByInstitutionIdResponse: missing returnValue"));
                }

                public final com.google.common.primitives.UnsignedInteger getReturnValue() {
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
                    returnValue = iprot.readU32();
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
                            returnValue = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountByInstitutionIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private com.google.common.primitives.UnsignedInteger returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "return_value", org.thryft.protocol.Type.I32);

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
            public GetObjectCountByInstitutionIdResponse(final GetObjectCountByInstitutionIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectCountByInstitutionIdResponse(final com.google.common.primitives.UnsignedInteger returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByInstitutionId: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectCountByInstitutionIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectCountByInstitutionIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectCountByInstitutionIdResponse)) {
                    return false;
                }

                final GetObjectCountByInstitutionIdResponse other = (GetObjectCountByInstitutionIdResponse)otherObject;
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

            public final com.google.common.primitives.UnsignedInteger getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectCountByInstitutionIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectCountByInstitutionIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                returnValue = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectCountByInstitutionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountByInstitutionIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger returnValue = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountByInstitutionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountByInstitutionIdResponse replaceReturnValue(final com.google.common.primitives.UnsignedInteger returnValue) {
                return new GetObjectCountByInstitutionIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeU32(getReturnValue());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectCountByInstitutionIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getReturnValue());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.primitives.UnsignedInteger returnValue;
        }

        public final static class GetObjectsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    from = com.google.common.primitives.UnsignedInteger.ZERO;
                    size = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectsRequest other) {
                    this.from = other.getFrom();
                    this.size = other.getSize();
                }

                protected GetObjectsRequest _build(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                    return new GetObjectsRequest(from, size);
                }

                public GetObjectsRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsRequest: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsRequest: missing size"));
                }

                public final com.google.common.primitives.UnsignedInteger getFrom() {
                    return from;
                }

                public final com.google.common.primitives.UnsignedInteger getSize() {
                    return size;
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
                    from = iprot.readU32();
                    size = iprot.readU32();
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
                        case "from_": {
                            from = iprot.readU32();
                            break;
                        }
                        case "size": {
                            size = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setFrom(final com.google.common.primitives.UnsignedInteger from) {
                    this.from = com.google.common.base.Preconditions.checkNotNull(from);
                    return this;
                }

                public Builder setIfPresent(final GetObjectsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setFrom(other.getFrom());
                    setSize(other.getSize());

                    return this;
                }

                public Builder setSize(final com.google.common.primitives.UnsignedInteger size) {
                    this.size = com.google.common.base.Preconditions.checkNotNull(size);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
                    case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetFrom() {
                    this.from = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                public Builder unsetSize() {
                    this.size = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private com.google.common.primitives.UnsignedInteger from;
                private com.google.common.primitives.UnsignedInteger size;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "from_", org.thryft.protocol.Type.I32),
                SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "size", org.thryft.protocol.Type.I32);

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
                    case "from": return FROM_;
                    case "size": return SIZE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "from_": return FROM_;
                    case "size": return SIZE;
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
            public GetObjectsRequest(final GetObjectsRequest other) {
                this(other.getFrom(), other.getSize());
            }

            /**
             * Optional constructor
             */
            public GetObjectsRequest(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsRequest: missing from");
                this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsRequest: missing size");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsRequest)) {
                    return false;
                }

                final GetObjectsRequest other = (GetObjectsRequest)otherObject;
                return
                    getFrom().equals(other.getFrom()) &&
                    getSize().equals(other.getSize());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "from_": return getFrom();
                case "size": return getSize();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.primitives.UnsignedInteger getFrom() {
                return from;
            }

            public final com.google.common.primitives.UnsignedInteger getSize() {
                return size;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getFrom().hashCode();
                hashCode = 31 * hashCode + getSize().hashCode();
                return hashCode;
            }

            public static GetObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                from = iprot.readU32();
                size = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectsRequest(from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "from_": {
                        from = iprot.readU32();
                        break;
                    }
                    case "size": {
                        size = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectsRequest(from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsRequest replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
                return new GetObjectsRequest(from, this.size);
            }

            public GetObjectsRequest replaceSize(final com.google.common.primitives.UnsignedInteger size) {
                return new GetObjectsRequest(this.from, size);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("from_", getFrom()).add("size", getSize()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeU32(getFrom());

                oprot.writeU32(getSize());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getFrom());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getSize());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.primitives.UnsignedInteger from;

            private final com.google.common.primitives.UnsignedInteger size;
        }

        public final static class GetObjectsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectsResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    return new GetObjectsResponse(returnValue);
                }

                public GetObjectsResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectsResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
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
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableList.of();
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        return com.google.common.collect.ImmutableList.of();
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

                public Builder setIfPresent(final GetObjectsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
            public GetObjectsResponse(final GetObjectsResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectsResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsResponse)) {
                    return false;
                }

                final GetObjectsResponse other = (GetObjectsResponse)otherObject;
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

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    return com.google.common.collect.ImmutableList.of();
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
                    return new GetObjectsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                return new GetObjectsResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
        }

        public final static class GetObjectsByCollectionIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    collectionId = null;
                    from = com.google.common.primitives.UnsignedInteger.ZERO;
                    size = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectsByCollectionIdRequest other) {
                    this.collectionId = other.getCollectionId();
                    this.from = other.getFrom();
                    this.size = other.getSize();
                }

                protected GetObjectsByCollectionIdRequest _build(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                    return new GetObjectsByCollectionIdRequest(collectionId, from, size);
                }

                public GetObjectsByCollectionIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing size"));
                }

                public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
                    return collectionId;
                }

                public final com.google.common.primitives.UnsignedInteger getFrom() {
                    return from;
                }

                public final com.google.common.primitives.UnsignedInteger getSize() {
                    return size;
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
                        collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                         throw new IllegalArgumentException(e);
                    }
                    from = iprot.readU32();
                    size = iprot.readU32();
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
                        case "collection_id": {
                            try {
                                collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                 throw new IllegalArgumentException(e);
                            }
                            break;
                        }
                        case "from_": {
                            from = iprot.readU32();
                            break;
                        }
                        case "size": {
                            size = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                    this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
                    return this;
                }

                public Builder setFrom(final com.google.common.primitives.UnsignedInteger from) {
                    this.from = com.google.common.base.Preconditions.checkNotNull(from);
                    return this;
                }

                public Builder setIfPresent(final GetObjectsByCollectionIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setCollectionId(other.getCollectionId());
                    setFrom(other.getFrom());
                    setSize(other.getSize());

                    return this;
                }

                public Builder setSize(final com.google.common.primitives.UnsignedInteger size) {
                    this.size = com.google.common.base.Preconditions.checkNotNull(size);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
                    case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
                    case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetCollectionId() {
                    this.collectionId = null;
                    return this;
                }

                public Builder unsetFrom() {
                    this.from = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                public Builder unsetSize() {
                    this.size = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private net.lab1318.costume.api.models.collection.CollectionId collectionId;
                private com.google.common.primitives.UnsignedInteger from;
                private com.google.common.primitives.UnsignedInteger size;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 0, "collection_id", org.thryft.protocol.Type.STRING),
                FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "from_", org.thryft.protocol.Type.I32),
                SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "size", org.thryft.protocol.Type.I32);

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
                    case "from": return FROM_;
                    case "size": return SIZE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "collection_id": return COLLECTION_ID;
                    case "from_": return FROM_;
                    case "size": return SIZE;
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
            public GetObjectsByCollectionIdRequest(final GetObjectsByCollectionIdRequest other) {
                this(other.getCollectionId(), other.getFrom(), other.getSize());
            }

            /**
             * Optional constructor
             */
            public GetObjectsByCollectionIdRequest(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing collectionId");
                this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing from");
                this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest: missing size");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsByCollectionIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsByCollectionIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsByCollectionIdRequest)) {
                    return false;
                }

                final GetObjectsByCollectionIdRequest other = (GetObjectsByCollectionIdRequest)otherObject;
                return
                    getCollectionId().equals(other.getCollectionId()) &&
                    getFrom().equals(other.getFrom()) &&
                    getSize().equals(other.getSize());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "collection_id": return getCollectionId();
                case "from_": return getFrom();
                case "size": return getSize();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
                return collectionId;
            }

            public final com.google.common.primitives.UnsignedInteger getFrom() {
                return from;
            }

            public final com.google.common.primitives.UnsignedInteger getSize() {
                return size;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCollectionId().hashCode();
                hashCode = 31 * hashCode + getFrom().hashCode();
                hashCode = 31 * hashCode + getSize().hashCode();
                return hashCode;
            }

            public static GetObjectsByCollectionIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsByCollectionIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                try {
                    collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                     throw new IllegalArgumentException(e);
                }
                from = iprot.readU32();
                size = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectsByCollectionIdRequest(collectionId, from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsByCollectionIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "collection_id": {
                        try {
                            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    case "from_": {
                        from = iprot.readU32();
                        break;
                    }
                    case "size": {
                        size = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectsByCollectionIdRequest(collectionId, from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsByCollectionIdRequest replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
                return new GetObjectsByCollectionIdRequest(collectionId, this.from, this.size);
            }

            public GetObjectsByCollectionIdRequest replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
                return new GetObjectsByCollectionIdRequest(this.collectionId, from, this.size);
            }

            public GetObjectsByCollectionIdRequest replaceSize(final com.google.common.primitives.UnsignedInteger size) {
                return new GetObjectsByCollectionIdRequest(this.collectionId, this.from, size);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("from_", getFrom()).add("size", getSize()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

                oprot.writeString(getCollectionId().toString());

                oprot.writeU32(getFrom());

                oprot.writeU32(getSize());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsByCollectionIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getCollectionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getFrom());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getSize());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.collection.CollectionId collectionId;

            private final com.google.common.primitives.UnsignedInteger from;

            private final com.google.common.primitives.UnsignedInteger size;
        }

        public final static class GetObjectsByCollectionIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectsByCollectionIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectsByCollectionIdResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    return new GetObjectsByCollectionIdResponse(returnValue);
                }

                public GetObjectsByCollectionIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectsByCollectionIdResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
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
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableList.of();
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        return com.google.common.collect.ImmutableList.of();
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

                public Builder setIfPresent(final GetObjectsByCollectionIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
            public GetObjectsByCollectionIdResponse(final GetObjectsByCollectionIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectsByCollectionIdResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsByCollectionIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsByCollectionIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsByCollectionIdResponse)) {
                    return false;
                }

                final GetObjectsByCollectionIdResponse other = (GetObjectsByCollectionIdResponse)otherObject;
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

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectsByCollectionIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsByCollectionIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectsByCollectionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsByCollectionIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    return com.google.common.collect.ImmutableList.of();
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
                    return new GetObjectsByCollectionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsByCollectionIdResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                return new GetObjectsByCollectionIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsByCollectionIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
        }

        public final static class GetObjectsByInstitutionIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    institutionId = null;
                    from = com.google.common.primitives.UnsignedInteger.ZERO;
                    size = com.google.common.primitives.UnsignedInteger.ZERO;
                }

                public Builder(final GetObjectsByInstitutionIdRequest other) {
                    this.institutionId = other.getInstitutionId();
                    this.from = other.getFrom();
                    this.size = other.getSize();
                }

                protected GetObjectsByInstitutionIdRequest _build(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                    return new GetObjectsByInstitutionIdRequest(institutionId, from, size);
                }

                public GetObjectsByInstitutionIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing size"));
                }

                public final com.google.common.primitives.UnsignedInteger getFrom() {
                    return from;
                }

                public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
                    return institutionId;
                }

                public final com.google.common.primitives.UnsignedInteger getSize() {
                    return size;
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
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new IllegalArgumentException(e);
                    }
                    from = iprot.readU32();
                    size = iprot.readU32();
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
                        case "institution_id": {
                            try {
                                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new IllegalArgumentException(e);
                            }
                            break;
                        }
                        case "from_": {
                            from = iprot.readU32();
                            break;
                        }
                        case "size": {
                            size = iprot.readU32();
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setFrom(final com.google.common.primitives.UnsignedInteger from) {
                    this.from = com.google.common.base.Preconditions.checkNotNull(from);
                    return this;
                }

                public Builder setIfPresent(final GetObjectsByInstitutionIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setInstitutionId(other.getInstitutionId());
                    setFrom(other.getFrom());
                    setSize(other.getSize());

                    return this;
                }

                public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                    this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
                    return this;
                }

                public Builder setSize(final com.google.common.primitives.UnsignedInteger size) {
                    this.size = com.google.common.base.Preconditions.checkNotNull(size);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
                    case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
                    case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetFrom() {
                    this.from = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                public Builder unsetInstitutionId() {
                    this.institutionId = null;
                    return this;
                }

                public Builder unsetSize() {
                    this.size = com.google.common.primitives.UnsignedInteger.ZERO;
                    return this;
                }

                private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
                private com.google.common.primitives.UnsignedInteger from;
                private com.google.common.primitives.UnsignedInteger size;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 0, "institution_id", org.thryft.protocol.Type.STRING),
                FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "from_", org.thryft.protocol.Type.I32),
                SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "size", org.thryft.protocol.Type.I32);

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
                    case "from": return FROM_;
                    case "size": return SIZE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "institution_id": return INSTITUTION_ID;
                    case "from_": return FROM_;
                    case "size": return SIZE;
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
            public GetObjectsByInstitutionIdRequest(final GetObjectsByInstitutionIdRequest other) {
                this(other.getInstitutionId(), other.getFrom(), other.getSize());
            }

            /**
             * Optional constructor
             */
            public GetObjectsByInstitutionIdRequest(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
                this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing institutionId");
                this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing from");
                this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest: missing size");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsByInstitutionIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsByInstitutionIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsByInstitutionIdRequest)) {
                    return false;
                }

                final GetObjectsByInstitutionIdRequest other = (GetObjectsByInstitutionIdRequest)otherObject;
                return
                    getInstitutionId().equals(other.getInstitutionId()) &&
                    getFrom().equals(other.getFrom()) &&
                    getSize().equals(other.getSize());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "institution_id": return getInstitutionId();
                case "from_": return getFrom();
                case "size": return getSize();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.primitives.UnsignedInteger getFrom() {
                return from;
            }

            public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
                return institutionId;
            }

            public final com.google.common.primitives.UnsignedInteger getSize() {
                return size;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getInstitutionId().hashCode();
                hashCode = 31 * hashCode + getFrom().hashCode();
                hashCode = 31 * hashCode + getSize().hashCode();
                return hashCode;
            }

            public static GetObjectsByInstitutionIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsByInstitutionIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readListBegin();
                try {
                    institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                     throw new IllegalArgumentException(e);
                }
                from = iprot.readU32();
                size = iprot.readU32();
                iprot.readListEnd();
                try {
                    return new GetObjectsByInstitutionIdRequest(institutionId, from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsByInstitutionIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
                com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
                com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "institution_id": {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    case "from_": {
                        from = iprot.readU32();
                        break;
                    }
                    case "size": {
                        size = iprot.readU32();
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectsByInstitutionIdRequest(institutionId, from, size);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsByInstitutionIdRequest replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
                return new GetObjectsByInstitutionIdRequest(this.institutionId, from, this.size);
            }

            public GetObjectsByInstitutionIdRequest replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
                return new GetObjectsByInstitutionIdRequest(institutionId, this.from, this.size);
            }

            public GetObjectsByInstitutionIdRequest replaceSize(final com.google.common.primitives.UnsignedInteger size) {
                return new GetObjectsByInstitutionIdRequest(this.institutionId, this.from, size);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("from_", getFrom()).add("size", getSize()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

                oprot.writeString(getInstitutionId().toString());

                oprot.writeU32(getFrom());

                oprot.writeU32(getSize());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getInstitutionId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getFrom());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
                oprot.writeU32(getSize());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

            private final com.google.common.primitives.UnsignedInteger from;

            private final com.google.common.primitives.UnsignedInteger size;
        }

        public final static class GetObjectsByInstitutionIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectsByInstitutionIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectsByInstitutionIdResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    return new GetObjectsByInstitutionIdResponse(returnValue);
                }

                public GetObjectsByInstitutionIdResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
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
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableList.of();
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        return com.google.common.collect.ImmutableList.of();
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

                public Builder setIfPresent(final GetObjectsByInstitutionIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
            public GetObjectsByInstitutionIdResponse(final GetObjectsByInstitutionIdResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectsByInstitutionIdResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectsByInstitutionIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectsByInstitutionIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectsByInstitutionIdResponse)) {
                    return false;
                }

                final GetObjectsByInstitutionIdResponse other = (GetObjectsByInstitutionIdResponse)otherObject;
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

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectsByInstitutionIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsByInstitutionIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectsByInstitutionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectsByInstitutionIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    return com.google.common.collect.ImmutableList.of();
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
                    return new GetObjectsByInstitutionIdResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectsByInstitutionIdResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue) {
                return new GetObjectsByInstitutionIdResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsByInstitutionIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> returnValue;
        }
    }

    public net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException;

    public com.google.common.primitives.UnsignedInteger getObjectCount() throws net.lab1318.costume.api.services.IoException;

    public com.google.common.primitives.UnsignedInteger getObjectCountByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException;

    public com.google.common.primitives.UnsignedInteger getObjectCountByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException;

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException;

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException;

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException;
}
