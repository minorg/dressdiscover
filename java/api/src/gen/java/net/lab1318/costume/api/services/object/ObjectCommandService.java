package net.lab1318.costume.api.services.object;

public interface ObjectCommandService {
    public enum FunctionMetadata {
        DELETE_OBJECTS("delete_objects"),
        POST_OBJECT("post_object");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class DeleteObjectsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteObjectsRequest other) {
                }

                protected DeleteObjectsRequest _build() {
                    return new DeleteObjectsRequest();
                }

                public DeleteObjectsRequest build() {
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

                public Builder setIfPresent(final DeleteObjectsRequest other) {
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

            public DeleteObjectsRequest() {
            }

            /**
             * Copy constructor
             */
            public DeleteObjectsRequest(final DeleteObjectsRequest other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteObjectsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteObjectsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteObjectsRequest)) {
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

            public static DeleteObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteObjectsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteObjectsRequest();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteObjectsRequest();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.DeleteObjectsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class DeleteObjectsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteObjectsResponse other) {
                }

                protected DeleteObjectsResponse _build() {
                    return new DeleteObjectsResponse();
                }

                public DeleteObjectsResponse build() {
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

                public Builder setIfPresent(final DeleteObjectsResponse other) {
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

            public DeleteObjectsResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteObjectsResponse(final DeleteObjectsResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteObjectsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteObjectsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteObjectsResponse)) {
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

            public static DeleteObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteObjectsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteObjectsResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteObjectsResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.DeleteObjectsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class PostObjectRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    object = null;
                }

                public Builder(final PostObjectRequest other) {
                    this.object = other.getObject();
                }

                protected PostObjectRequest _build(final net.lab1318.costume.api.models.object.Object object) {
                    return new PostObjectRequest(object);
                }

                public PostObjectRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(object, "net.lab1318.costume.api.services.object.PostObjectRequest: missing object"));
                }

                public final net.lab1318.costume.api.models.object.Object getObject() {
                    return object;
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
                    object = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
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
                        case "object": {
                            object = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setIfPresent(final PostObjectRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setObject(other.getObject());

                    return this;
                }

                public Builder setObject(final net.lab1318.costume.api.models.object.Object object) {
                    this.object = com.google.common.base.Preconditions.checkNotNull(object);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "object": setObject((net.lab1318.costume.api.models.object.Object)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetObject() {
                    this.object = null;
                    return this;
                }

                private net.lab1318.costume.api.models.object.Object object;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OBJECT(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.Object>() {}, true, 0, "object", org.thryft.protocol.Type.STRUCT);

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
                    case "object": return OBJECT;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "object": return OBJECT;
                    default:
                        throw new IllegalArgumentException(thriftName);
                    }
                }

                private FieldMetadata(final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
            public PostObjectRequest(final PostObjectRequest other) {
                this(other.getObject());
            }

            /**
             * Optional constructor
             */
            public PostObjectRequest(final net.lab1318.costume.api.models.object.Object object) {
                this.object = com.google.common.base.Preconditions.checkNotNull(object, "net.lab1318.costume.api.services.object.PostObjectRequest: missing object");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostObjectRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostObjectRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostObjectRequest)) {
                    return false;
                }

                final PostObjectRequest other = (PostObjectRequest)otherObject;
                return
                    getObject().equals(other.getObject());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "object": return getObject();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.object.Object getObject() {
                return object;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getObject().hashCode();
                return hashCode;
            }

            public static PostObjectRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostObjectRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.Object object = null;

                iprot.readListBegin();
                object = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PostObjectRequest(object);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostObjectRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.Object object = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "object": {
                        object = net.lab1318.costume.api.models.object.Object.readAsStruct(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new PostObjectRequest(object);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostObjectRequest replaceObject(final net.lab1318.costume.api.models.object.Object object) {
                return new PostObjectRequest(object);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object", getObject()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getObject().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.PostObjectRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("object", org.thryft.protocol.Type.STRUCT, (short)0);
                getObject().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.object.Object object;
        }

        public final static class PostObjectResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final PostObjectResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PostObjectResponse _build(final net.lab1318.costume.api.models.object.ObjectId returnValue) {
                    return new PostObjectResponse(returnValue);
                }

                public PostObjectResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.PostObjectResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.object.ObjectId getReturnValue() {
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
                    try {
                        returnValue = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.services.object.InvalidObjectIdException e) {
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
                        case "return_value": {
                            try {
                                returnValue = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.services.object.InvalidObjectIdException e) {
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

                public Builder setIfPresent(final PostObjectResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.object.ObjectId returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.object.ObjectId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private net.lab1318.costume.api.models.object.ObjectId returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRING);

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

                private FieldMetadata(final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
            public PostObjectResponse(final PostObjectResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public PostObjectResponse(final net.lab1318.costume.api.models.object.ObjectId returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectCommandService.postObject: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostObjectResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostObjectResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostObjectResponse)) {
                    return false;
                }

                final PostObjectResponse other = (PostObjectResponse)otherObject;
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

            public final net.lab1318.costume.api.models.object.ObjectId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static PostObjectResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostObjectResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.ObjectId returnValue = null;

                iprot.readListBegin();
                try {
                    returnValue = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.services.object.InvalidObjectIdException e) {
                     throw new IllegalArgumentException(e);
                }
                iprot.readListEnd();
                try {
                    return new PostObjectResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostObjectResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.object.ObjectId returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        try {
                            returnValue = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.services.object.InvalidObjectIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new PostObjectResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostObjectResponse replaceReturnValue(final net.lab1318.costume.api.models.object.ObjectId returnValue) {
                return new PostObjectResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getReturnValue().toString());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.PostObjectResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getReturnValue().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.object.ObjectId returnValue;
        }
    }

    public void deleteObjects() throws net.lab1318.costume.api.services.IoException;

    public net.lab1318.costume.api.models.object.ObjectId postObject(final net.lab1318.costume.api.models.object.Object object) throws net.lab1318.costume.api.services.IoException;
}
