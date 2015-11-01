package net.lab1318.costume.api.services.collection;

public interface CollectionCommandService {
    public enum FunctionMetadata {
        DELETE_COLLECTIONS("delete_collections"),
        POST_COLLECTION("post_collection");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class DeleteCollectionsRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteCollectionsRequest other) {
                }

                protected DeleteCollectionsRequest _build() {
                    return new DeleteCollectionsRequest();
                }

                public DeleteCollectionsRequest build() {
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

                public Builder setIfPresent(final DeleteCollectionsRequest other) {
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

            public DeleteCollectionsRequest() {
            }

            /**
             * Copy constructor
             */
            public DeleteCollectionsRequest(final DeleteCollectionsRequest other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteCollectionsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteCollectionsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteCollectionsRequest)) {
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

            public static DeleteCollectionsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteCollectionsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteCollectionsRequest();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteCollectionsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteCollectionsRequest();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.collection.DeleteCollectionsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class DeleteCollectionsResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteCollectionsResponse other) {
                }

                protected DeleteCollectionsResponse _build() {
                    return new DeleteCollectionsResponse();
                }

                public DeleteCollectionsResponse build() {
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

                public Builder setIfPresent(final DeleteCollectionsResponse other) {
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

            public DeleteCollectionsResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteCollectionsResponse(final DeleteCollectionsResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteCollectionsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteCollectionsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteCollectionsResponse)) {
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

            public static DeleteCollectionsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteCollectionsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteCollectionsResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteCollectionsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteCollectionsResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.collection.DeleteCollectionsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class PostCollectionRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    collection = null;
                }

                public Builder(final PostCollectionRequest other) {
                    this.collection = other.getCollection();
                }

                protected PostCollectionRequest _build(final net.lab1318.costume.api.models.collection.Collection collection) {
                    return new PostCollectionRequest(collection);
                }

                public PostCollectionRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(collection, "net.lab1318.costume.api.services.collection.PostCollectionRequest: missing collection"));
                }

                public final net.lab1318.costume.api.models.collection.Collection getCollection() {
                    return collection;
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
                    collection = net.lab1318.costume.api.models.collection.Collection.readAsStruct(iprot);
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
                        case "collection": {
                            collection = net.lab1318.costume.api.models.collection.Collection.readAsStruct(iprot);
                            break;
                        }
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                    return this;
                }

                public Builder setCollection(final net.lab1318.costume.api.models.collection.Collection collection) {
                    this.collection = com.google.common.base.Preconditions.checkNotNull(collection);
                    return this;
                }

                public Builder setIfPresent(final PostCollectionRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setCollection(other.getCollection());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "collection": setCollection((net.lab1318.costume.api.models.collection.Collection)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetCollection() {
                    this.collection = null;
                    return this;
                }

                private net.lab1318.costume.api.models.collection.Collection collection;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                COLLECTION(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.Collection>() {}, true, 0, "collection", org.thryft.protocol.Type.STRUCT);

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
                    case "collection": return COLLECTION;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "collection": return COLLECTION;
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
            public PostCollectionRequest(final PostCollectionRequest other) {
                this(other.getCollection());
            }

            /**
             * Optional constructor
             */
            public PostCollectionRequest(final net.lab1318.costume.api.models.collection.Collection collection) {
                this.collection = com.google.common.base.Preconditions.checkNotNull(collection, "net.lab1318.costume.api.services.collection.PostCollectionRequest: missing collection");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostCollectionRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostCollectionRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostCollectionRequest)) {
                    return false;
                }

                final PostCollectionRequest other = (PostCollectionRequest)otherObject;
                return
                    getCollection().equals(other.getCollection());
            }

            @Override
            public java.lang.Object get(final String fieldName) {
                switch (fieldName) {
                case "collection": return getCollection();
                default:
                    throw new IllegalArgumentException(fieldName);
                }
            }

            public final net.lab1318.costume.api.models.collection.Collection getCollection() {
                return collection;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCollection().hashCode();
                return hashCode;
            }

            public static PostCollectionRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostCollectionRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.Collection collection = null;

                iprot.readListBegin();
                collection = net.lab1318.costume.api.models.collection.Collection.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PostCollectionRequest(collection);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostCollectionRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.Collection collection = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "collection": {
                        collection = net.lab1318.costume.api.models.collection.Collection.readAsStruct(iprot);
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new PostCollectionRequest(collection);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostCollectionRequest replaceCollection(final net.lab1318.costume.api.models.collection.Collection collection) {
                return new PostCollectionRequest(collection);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection", getCollection()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getCollection().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.collection.PostCollectionRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("collection", org.thryft.protocol.Type.STRUCT, (short)0);
                getCollection().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.collection.Collection collection;
        }

        public final static class PostCollectionResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final PostCollectionResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PostCollectionResponse _build(final net.lab1318.costume.api.models.collection.CollectionId returnValue) {
                    return new PostCollectionResponse(returnValue);
                }

                public PostCollectionResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.collection.PostCollectionResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.collection.CollectionId getReturnValue() {
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
                        returnValue = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
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
                                returnValue = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
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

                public Builder setIfPresent(final PostCollectionResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.collection.CollectionId returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private net.lab1318.costume.api.models.collection.CollectionId returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRING);

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
            public PostCollectionResponse(final PostCollectionResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public PostCollectionResponse(final net.lab1318.costume.api.models.collection.CollectionId returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.collection.CollectionCommandService.postCollection: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostCollectionResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostCollectionResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostCollectionResponse)) {
                    return false;
                }

                final PostCollectionResponse other = (PostCollectionResponse)otherObject;
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

            public final net.lab1318.costume.api.models.collection.CollectionId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static PostCollectionResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostCollectionResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId returnValue = null;

                iprot.readListBegin();
                try {
                    returnValue = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
                     throw new IllegalArgumentException(e);
                }
                iprot.readListEnd();
                try {
                    return new PostCollectionResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostCollectionResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.collection.CollectionId returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        try {
                            returnValue = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                        break;
                    }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                try {
                    return new PostCollectionResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostCollectionResponse replaceReturnValue(final net.lab1318.costume.api.models.collection.CollectionId returnValue) {
                return new PostCollectionResponse(returnValue);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.collection.PostCollectionResponse");
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

            private final net.lab1318.costume.api.models.collection.CollectionId returnValue;
        }
    }

    public void deleteCollections() throws net.lab1318.costume.api.services.IoException;

    public net.lab1318.costume.api.models.collection.CollectionId postCollection(final net.lab1318.costume.api.models.collection.Collection collection) throws net.lab1318.costume.api.services.IoException;
}
