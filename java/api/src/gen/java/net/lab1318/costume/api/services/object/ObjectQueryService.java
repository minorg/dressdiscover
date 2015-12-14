package net.lab1318.costume.api.services.object;

public interface ObjectQueryService {
    public enum FunctionMetadata {
        GET_OBJECT_BY_ID("get_object_by_id"),
        GET_OBJECT_COUNT("get_object_count"),
        GET_OBJECT_FACETS("get_object_facets"),
        GET_OBJECT_SUMMARIES("get_object_summaries");

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
                                id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
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
                     throw new org.thryft.protocol.InputProtocolException(e);
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
                             throw new org.thryft.protocol.InputProtocolException(e);
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
                    query = com.google.common.base.Optional.absent();
                }

                public Builder(final GetObjectCountRequest other) {
                    this.query = other.getQuery();
                }

                protected GetObjectCountRequest _build(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    return new GetObjectCountRequest(query);
                }

                public GetObjectCountRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectCountRequest: missing query"));
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                    return query;
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
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    if (__list.getSize() > 0) {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
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
                        case "query": {
                            query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectCountRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    if (other.getQuery().isPresent()) {
                        setQuery(other.getQuery());
                    }

                    return this;
                }

                public Builder setQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    this.query = com.google.common.base.Preconditions.checkNotNull(query);
                    return this;
                }

                public Builder setQuery(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.ObjectQuery query) {
                    this.query = com.google.common.base.Optional.fromNullable(query);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "query": setQuery((net.lab1318.costume.api.services.object.ObjectQuery)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetQuery() {
                    this.query = com.google.common.base.Optional.absent();
                    return this;
                }

                private com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                QUERY("query", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectQuery>() {}, false, 0, "query", org.thryft.protocol.Type.STRUCT);

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
                    case "query": return QUERY;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "query": return QUERY;
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
             * Default constructor
             */
            public GetObjectCountRequest() {
                query = com.google.common.base.Optional.absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectCountRequest(final GetObjectCountRequest other) {
                this(other.getQuery());
            }

            /**
             * Total Nullable constructor
             */
            public GetObjectCountRequest(final @javax.annotation.Nullable net.lab1318.costume.api.services.object.ObjectQuery query) {
                this.query = com.google.common.base.Optional.fromNullable(query);
            }

            /**
             * Optional constructor
             */
            public GetObjectCountRequest(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                this.query = com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectCountRequest: missing query");
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

                final GetObjectCountRequest other = (GetObjectCountRequest)otherObject;
                return
                    getQuery().equals(other.getQuery());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "query": return getQuery();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getQuery().isPresent()) {
                    hashCode = 31 * hashCode + getQuery().get().hashCode();
                }
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
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                }
                iprot.readListEnd();
                try {
                    return new GetObjectCountRequest(query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectCountRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "query": {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectCountRequest(query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectCountRequest replaceQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                return new GetObjectCountRequest(query);
            }

            public GetObjectCountRequest replaceQuery(final net.lab1318.costume.api.services.object.ObjectQuery query) {
                return replaceQuery(com.google.common.base.Optional.fromNullable(query));
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("query", getQuery().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                if (getQuery().isPresent()) {
                    getQuery().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

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
                if (getQuery().isPresent()) {
                    oprot.writeFieldBegin("query", org.thryft.protocol.Type.STRUCT, (short)0);
                    getQuery().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();
            }

            private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
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

        public final static class GetObjectFacetsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    query = com.google.common.base.Optional.absent();
                }

                public Builder(final GetObjectFacetsRequest other) {
                    this.query = other.getQuery();
                }

                protected GetObjectFacetsRequest _build(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    return new GetObjectFacetsRequest(query);
                }

                public GetObjectFacetsRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectFacetsRequest: missing query"));
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                    return query;
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
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    if (__list.getSize() > 0) {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
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
                        case "query": {
                            query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectFacetsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    if (other.getQuery().isPresent()) {
                        setQuery(other.getQuery());
                    }

                    return this;
                }

                public Builder setQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    this.query = com.google.common.base.Preconditions.checkNotNull(query);
                    return this;
                }

                public Builder setQuery(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.ObjectQuery query) {
                    this.query = com.google.common.base.Optional.fromNullable(query);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "query": setQuery((net.lab1318.costume.api.services.object.ObjectQuery)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetQuery() {
                    this.query = com.google.common.base.Optional.absent();
                    return this;
                }

                private com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                QUERY("query", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectQuery>() {}, false, 0, "query", org.thryft.protocol.Type.STRUCT);

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
                    case "query": return QUERY;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "query": return QUERY;
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
             * Default constructor
             */
            public GetObjectFacetsRequest() {
                query = com.google.common.base.Optional.absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectFacetsRequest(final GetObjectFacetsRequest other) {
                this(other.getQuery());
            }

            /**
             * Total Nullable constructor
             */
            public GetObjectFacetsRequest(final @javax.annotation.Nullable net.lab1318.costume.api.services.object.ObjectQuery query) {
                this.query = com.google.common.base.Optional.fromNullable(query);
            }

            /**
             * Optional constructor
             */
            public GetObjectFacetsRequest(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                this.query = com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectFacetsRequest: missing query");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectFacetsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectFacetsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectFacetsRequest)) {
                    return false;
                }

                final GetObjectFacetsRequest other = (GetObjectFacetsRequest)otherObject;
                return
                    getQuery().equals(other.getQuery());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "query": return getQuery();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getQuery().isPresent()) {
                    hashCode = 31 * hashCode + getQuery().get().hashCode();
                }
                return hashCode;
            }

            public static GetObjectFacetsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectFacetsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                }
                iprot.readListEnd();
                try {
                    return new GetObjectFacetsRequest(query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectFacetsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "query": {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectFacetsRequest(query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectFacetsRequest replaceQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                return new GetObjectFacetsRequest(query);
            }

            public GetObjectFacetsRequest replaceQuery(final net.lab1318.costume.api.services.object.ObjectQuery query) {
                return replaceQuery(com.google.common.base.Optional.fromNullable(query));
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("query", getQuery().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                if (getQuery().isPresent()) {
                    getQuery().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectFacetsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getQuery().isPresent()) {
                    oprot.writeFieldBegin("query", org.thryft.protocol.Type.STRUCT, (short)0);
                    getQuery().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();
            }

            private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
        }

        public final static class GetObjectFacetsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectFacetsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectFacetsResponse _build(final net.lab1318.costume.api.services.object.ObjectFacets returnValue) {
                    return new GetObjectFacetsResponse(returnValue);
                }

                public GetObjectFacetsResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectFacetsResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.services.object.ObjectFacets getReturnValue() {
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
                    returnValue = net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot);
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
                            returnValue = net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectFacetsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.services.object.ObjectFacets returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.services.object.ObjectFacets)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private net.lab1318.costume.api.services.object.ObjectFacets returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectFacets>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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
            public GetObjectFacetsResponse(final GetObjectFacetsResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectFacetsResponse(final net.lab1318.costume.api.services.object.ObjectFacets returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectFacets: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectFacetsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectFacetsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectFacetsResponse)) {
                    return false;
                }

                final GetObjectFacetsResponse other = (GetObjectFacetsResponse)otherObject;
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

            public final net.lab1318.costume.api.services.object.ObjectFacets getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectFacetsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectFacetsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.services.object.ObjectFacets returnValue = null;

                iprot.readListBegin();
                returnValue = net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectFacetsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectFacetsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.services.object.ObjectFacets returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectFacetsResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectFacetsResponse replaceReturnValue(final net.lab1318.costume.api.services.object.ObjectFacets returnValue) {
                return new GetObjectFacetsResponse(returnValue);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectFacetsResponse");
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

            private final net.lab1318.costume.api.services.object.ObjectFacets returnValue;
        }

        public final static class GetObjectSummariesRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    options = com.google.common.base.Optional.absent();
                    query = com.google.common.base.Optional.absent();
                }

                public Builder(final GetObjectSummariesRequest other) {
                    this.options = other.getOptions();
                    this.query = other.getQuery();
                }

                protected GetObjectSummariesRequest _build(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    return new GetObjectSummariesRequest(options, query);
                }

                public GetObjectSummariesRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing options"), com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing query"));
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> getOptions() {
                    return options;
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                    return query;
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
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    if (__list.getSize() > 0) {
                        options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                    }
                    if (__list.getSize() > 1) {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
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
                        case "options": {
                            options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                            break;
                        }
                        case "query": {
                            query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final GetObjectSummariesRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    if (other.getOptions().isPresent()) {
                        setOptions(other.getOptions());
                    }
                    if (other.getQuery().isPresent()) {
                        setQuery(other.getQuery());
                    }

                    return this;
                }

                public Builder setOptions(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) {
                    this.options = com.google.common.base.Preconditions.checkNotNull(options);
                    return this;
                }

                public Builder setOptions(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.GetObjectSummariesOptions options) {
                    this.options = com.google.common.base.Optional.fromNullable(options);
                    return this;
                }

                public Builder setQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                    this.query = com.google.common.base.Preconditions.checkNotNull(query);
                    return this;
                }

                public Builder setQuery(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.ObjectQuery query) {
                    this.query = com.google.common.base.Optional.fromNullable(query);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "options": setOptions((net.lab1318.costume.api.services.object.GetObjectSummariesOptions)value); return this;
                    case "query": setQuery((net.lab1318.costume.api.services.object.ObjectQuery)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetOptions() {
                    this.options = com.google.common.base.Optional.absent();
                    return this;
                }

                public Builder unsetQuery() {
                    this.query = com.google.common.base.Optional.absent();
                    return this;
                }

                private com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options;
                private com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OPTIONS("options", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.GetObjectSummariesOptions>() {}, false, 0, "options", org.thryft.protocol.Type.STRUCT),
                QUERY("query", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectQuery>() {}, false, 0, "query", org.thryft.protocol.Type.STRUCT);

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
                    case "options": return OPTIONS;
                    case "query": return QUERY;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "options": return OPTIONS;
                    case "query": return QUERY;
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
             * Default constructor
             */
            public GetObjectSummariesRequest() {
                options = com.google.common.base.Optional.absent();
                query = com.google.common.base.Optional.absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesRequest(final GetObjectSummariesRequest other) {
                this(other.getOptions(), other.getQuery());
            }

            /**
             * Total Nullable constructor
             */
            public GetObjectSummariesRequest(final @javax.annotation.Nullable net.lab1318.costume.api.services.object.GetObjectSummariesOptions options, final @javax.annotation.Nullable net.lab1318.costume.api.services.object.ObjectQuery query) {
                this.options = com.google.common.base.Optional.fromNullable(options);
                this.query = com.google.common.base.Optional.fromNullable(query);
            }

            /**
             * Optional constructor
             */
            public GetObjectSummariesRequest(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                this.options = com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing options");
                this.query = com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing query");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectSummariesRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectSummariesRequest)) {
                    return false;
                }

                final GetObjectSummariesRequest other = (GetObjectSummariesRequest)otherObject;
                return
                    getOptions().equals(other.getOptions()) &&
                    getQuery().equals(other.getQuery());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "options": return getOptions();
                case "query": return getQuery();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> getOptions() {
                return options;
            }

            public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getOptions().isPresent()) {
                    hashCode = 31 * hashCode + getOptions().get().hashCode();
                }
                if (getQuery().isPresent()) {
                    hashCode = 31 * hashCode + getQuery().get().hashCode();
                }
                return hashCode;
            }

            public static GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                }
                if (__list.getSize() > 1) {
                    query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                }
                iprot.readListEnd();
                try {
                    return new GetObjectSummariesRequest(options, query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "options": {
                        options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                        break;
                    }
                    case "query": {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectQuery.readAsStruct(iprot));
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new GetObjectSummariesRequest(options, query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectSummariesRequest replaceOptions(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) {
                return new GetObjectSummariesRequest(options, this.query);
            }

            public GetObjectSummariesRequest replaceOptions(final net.lab1318.costume.api.services.object.GetObjectSummariesOptions options) {
                return replaceOptions(com.google.common.base.Optional.fromNullable(options));
            }

            public GetObjectSummariesRequest replaceQuery(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
                return new GetObjectSummariesRequest(this.options, query);
            }

            public GetObjectSummariesRequest replaceQuery(final net.lab1318.costume.api.services.object.ObjectQuery query) {
                return replaceQuery(com.google.common.base.Optional.fromNullable(query));
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("options", getOptions().orNull()).add("query", getQuery().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                if (getOptions().isPresent()) {
                    getOptions().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

                if (getQuery().isPresent()) {
                    getQuery().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getOptions().isPresent()) {
                    oprot.writeFieldBegin("options", org.thryft.protocol.Type.STRUCT, (short)0);
                    getOptions().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                if (getQuery().isPresent()) {
                    oprot.writeFieldBegin("query", org.thryft.protocol.Type.STRUCT, (short)0);
                    getQuery().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();
            }

            private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options;

            private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query;
        }

        public final static class GetObjectSummariesResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectSummariesResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectSummariesResponse _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue) {
                    return new GetObjectSummariesResponse(returnValue);
                }

                public GetObjectSummariesResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectSummariesResponse: missing returnValue"));
                }

                public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getReturnValue() {
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
                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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

                public Builder setIfPresent(final GetObjectSummariesResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                @SuppressWarnings({"unchecked"})
                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
            public GetObjectSummariesResponse(final GetObjectSummariesResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectSummariesResponse(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectSummaries: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectSummariesResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectSummariesResponse)) {
                    return false;
                }

                final GetObjectSummariesResponse other = (GetObjectSummariesResponse)otherObject;
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

            public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue = null;

                iprot.readListBegin();
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                    return new GetObjectSummariesResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                    return new GetObjectSummariesResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectSummariesResponse replaceReturnValue(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue) {
                return new GetObjectSummariesResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectSummaryEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final net.lab1318.costume.api.models.object.ObjectSummaryEntry _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> returnValue;
        }
    }

    public net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException;

    public default com.google.common.primitives.UnsignedInteger getObjectCount() throws net.lab1318.costume.api.services.IoException {
        return getObjectCount(com.google.common.base.Optional.<net.lab1318.costume.api.services.object.ObjectQuery> absent());
    }

    public com.google.common.primitives.UnsignedInteger getObjectCount(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException;

    public default net.lab1318.costume.api.services.object.ObjectFacets getObjectFacets() throws net.lab1318.costume.api.services.IoException {
        return getObjectFacets(com.google.common.base.Optional.<net.lab1318.costume.api.services.object.ObjectQuery> absent());
    }

    public net.lab1318.costume.api.services.object.ObjectFacets getObjectFacets(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException;

    public default com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getObjectSummaries() throws net.lab1318.costume.api.services.IoException {
        return getObjectSummaries(com.google.common.base.Optional.<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> absent());
    }

    public default com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getObjectSummaries(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) throws net.lab1318.costume.api.services.IoException {
        return getObjectSummaries(com.google.common.base.Optional.<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> absent(), com.google.common.base.Optional.<net.lab1318.costume.api.services.object.ObjectQuery> absent());
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getObjectSummaries(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException;
}
