package net.lab1318.costume.api.services.user;

public interface UserCommandService {
    public enum FunctionMetadata {
        DELETE_USER_BOOKMARK_BY_ID("delete_user_bookmark_by_id"),
        DELETE_USER_BY_ID("delete_user_by_id"),
        DELETE_USERS("delete_users"),
        POST_USER("post_user"),
        POST_USER_BOOKMARK("post_user_bookmark"),
        PUT_USER("put_user");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class DeleteUserBookmarkByIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteUserBookmarkByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteUserBookmarkByIdRequest _build(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
                    return new DeleteUserBookmarkByIdRequest(id);
                }

                public DeleteUserBookmarkByIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.DeleteUserBookmarkByIdRequest: missing id"));
                }

                public final net.lab1318.costume.api.models.user.UserBookmarkId getId() {
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
                        id = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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
                                id = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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

                public Builder setId(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final DeleteUserBookmarkByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": setId((net.lab1318.costume.api.models.user.UserBookmarkId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": return unsetId();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserBookmarkId id;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserBookmarkId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING);

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
            public DeleteUserBookmarkByIdRequest(final DeleteUserBookmarkByIdRequest other) {
                this(other.getId());
            }

            /**
             * Optional constructor
             */
            public DeleteUserBookmarkByIdRequest(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.DeleteUserBookmarkByIdRequest: missing id");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserBookmarkByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserBookmarkByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUserBookmarkByIdRequest)) {
                    return false;
                }

                final DeleteUserBookmarkByIdRequest other = (DeleteUserBookmarkByIdRequest)otherObject;
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

            public final net.lab1318.costume.api.models.user.UserBookmarkId getId() {
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

            public static DeleteUserBookmarkByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUserBookmarkByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmarkId id = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new DeleteUserBookmarkByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUserBookmarkByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmarkId id = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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
                    return new DeleteUserBookmarkByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public DeleteUserBookmarkByIdRequest replaceId(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
                return new DeleteUserBookmarkByIdRequest(id);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUserBookmarkByIdRequest");
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

            private final net.lab1318.costume.api.models.user.UserBookmarkId id;
        }

        public final static class DeleteUserBookmarkByIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteUserBookmarkByIdResponse other) {
                }

                protected DeleteUserBookmarkByIdResponse _build() {
                    return new DeleteUserBookmarkByIdResponse();
                }

                public DeleteUserBookmarkByIdResponse build() {
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

                public Builder setIfPresent(final DeleteUserBookmarkByIdResponse other) {
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

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public DeleteUserBookmarkByIdResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteUserBookmarkByIdResponse(final DeleteUserBookmarkByIdResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserBookmarkByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserBookmarkByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUserBookmarkByIdResponse)) {
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

            public static DeleteUserBookmarkByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUserBookmarkByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteUserBookmarkByIdResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUserBookmarkByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUserBookmarkByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteUserBookmarkByIdResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUserBookmarkByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class DeleteUserByIdRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final DeleteUserByIdRequest other) {
                    this.id = other.getId();
                }

                protected DeleteUserByIdRequest _build(final net.lab1318.costume.api.models.user.UserId id) {
                    return new DeleteUserByIdRequest(id);
                }

                public DeleteUserByIdRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.DeleteUserByIdRequest: missing id"));
                }

                public final net.lab1318.costume.api.models.user.UserId getId() {
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
                        id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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
                                id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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

                public Builder setId(final net.lab1318.costume.api.models.user.UserId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final DeleteUserByIdRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());

                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": setId((net.lab1318.costume.api.models.user.UserId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": return unsetId();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserId id;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING);

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
            public DeleteUserByIdRequest(final DeleteUserByIdRequest other) {
                this(other.getId());
            }

            /**
             * Optional constructor
             */
            public DeleteUserByIdRequest(final net.lab1318.costume.api.models.user.UserId id) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.DeleteUserByIdRequest: missing id");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserByIdRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserByIdRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUserByIdRequest)) {
                    return false;
                }

                final DeleteUserByIdRequest other = (DeleteUserByIdRequest)otherObject;
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

            public final net.lab1318.costume.api.models.user.UserId getId() {
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

            public static DeleteUserByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUserByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId id = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new DeleteUserByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUserByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId id = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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
                    return new DeleteUserByIdRequest(id);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public DeleteUserByIdRequest replaceId(final net.lab1318.costume.api.models.user.UserId id) {
                return new DeleteUserByIdRequest(id);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUserByIdRequest");
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

            private final net.lab1318.costume.api.models.user.UserId id;
        }

        public final static class DeleteUserByIdResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteUserByIdResponse other) {
                }

                protected DeleteUserByIdResponse _build() {
                    return new DeleteUserByIdResponse();
                }

                public DeleteUserByIdResponse build() {
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

                public Builder setIfPresent(final DeleteUserByIdResponse other) {
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

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public DeleteUserByIdResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteUserByIdResponse(final DeleteUserByIdResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUserByIdResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUserByIdResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUserByIdResponse)) {
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

            public static DeleteUserByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUserByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteUserByIdResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUserByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteUserByIdResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUserByIdResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class DeleteUsersRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteUsersRequest other) {
                }

                protected DeleteUsersRequest _build() {
                    return new DeleteUsersRequest();
                }

                public DeleteUsersRequest build() {
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

                public Builder setIfPresent(final DeleteUsersRequest other) {
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

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public DeleteUsersRequest() {
            }

            /**
             * Copy constructor
             */
            public DeleteUsersRequest(final DeleteUsersRequest other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUsersRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUsersRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUsersRequest)) {
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

            public static DeleteUsersRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUsersRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteUsersRequest();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUsersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteUsersRequest();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUsersRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class DeleteUsersResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteUsersResponse other) {
                }

                protected DeleteUsersResponse _build() {
                    return new DeleteUsersResponse();
                }

                public DeleteUsersResponse build() {
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

                public Builder setIfPresent(final DeleteUsersResponse other) {
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

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public DeleteUsersResponse() {
            }

            /**
             * Copy constructor
             */
            public DeleteUsersResponse(final DeleteUsersResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteUsersResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteUsersResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteUsersResponse)) {
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

            public static DeleteUsersResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteUsersResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new DeleteUsersResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static DeleteUsersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteUsersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return new DeleteUsersResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.DeleteUsersResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class PostUserRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    user = null;
                }

                public Builder(final PostUserRequest other) {
                    this.user = other.getUser();
                }

                protected PostUserRequest _build(final net.lab1318.costume.api.models.user.User user) {
                    return new PostUserRequest(user);
                }

                public PostUserRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.PostUserRequest: missing user"));
                }

                public final net.lab1318.costume.api.models.user.User getUser() {
                    return user;
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
                    user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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
                        case "user": {
                            user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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

                public Builder setIfPresent(final PostUserRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setUser(other.getUser());

                    return this;
                }

                public Builder setUser(final net.lab1318.costume.api.models.user.User user) {
                    this.user = com.google.common.base.Preconditions.checkNotNull(user);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "user": setUser((net.lab1318.costume.api.models.user.User)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetUser() {
                    this.user = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "user": return unsetUser();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.User user;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER("user", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.User>() {}, true, 0, "user", org.thryft.protocol.Type.STRUCT);

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
                    case "user": return USER;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "user": return USER;
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
            public PostUserRequest(final PostUserRequest other) {
                this(other.getUser());
            }

            /**
             * Optional constructor
             */
            public PostUserRequest(final net.lab1318.costume.api.models.user.User user) {
                this.user = com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.PostUserRequest: missing user");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostUserRequest)) {
                    return false;
                }

                final PostUserRequest other = (PostUserRequest)otherObject;
                return
                    getUser().equals(other.getUser());
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
                case USER: return getUser();
                default:
                    throw new IllegalStateException();
                }
            }

            public final net.lab1318.costume.api.models.user.User getUser() {
                return user;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getUser().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PostUserRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.User user = null;

                iprot.readListBegin();
                user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PostUserRequest(user);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PostUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.User user = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "user": {
                        user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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
                    return new PostUserRequest(user);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostUserRequest replaceUser(final net.lab1318.costume.api.models.user.User user) {
                return new PostUserRequest(user);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user", getUser()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getUser().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PostUserRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("user", org.thryft.protocol.Type.STRUCT, (short)0);
                getUser().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.user.User user;
        }

        public final static class PostUserResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final PostUserResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PostUserResponse _build(final net.lab1318.costume.api.models.user.UserId returnValue) {
                    return new PostUserResponse(returnValue);
                }

                public PostUserResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.user.PostUserResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.user.UserId getReturnValue() {
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
                        returnValue = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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
                        case "return_value": {
                            try {
                                returnValue = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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

                public Builder setIfPresent(final PostUserResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.user.UserId returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.user.UserId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": return unsetReturnValue();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserId returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRING);

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
            public PostUserResponse(final PostUserResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public PostUserResponse(final net.lab1318.costume.api.models.user.UserId returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.user.UserCommandService.postUser: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostUserResponse)) {
                    return false;
                }

                final PostUserResponse other = (PostUserResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final net.lab1318.costume.api.models.user.UserId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PostUserResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostUserResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId returnValue = null;

                iprot.readListBegin();
                try {
                    returnValue = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new PostUserResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostUserResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PostUserResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        try {
                            returnValue = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
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
                    return new PostUserResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostUserResponse replaceReturnValue(final net.lab1318.costume.api.models.user.UserId returnValue) {
                return new PostUserResponse(returnValue);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PostUserResponse");
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

            private final net.lab1318.costume.api.models.user.UserId returnValue;
        }

        public final static class PostUserBookmarkRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    userBookmark = null;
                }

                public Builder(final PostUserBookmarkRequest other) {
                    this.userBookmark = other.getUserBookmark();
                }

                protected PostUserBookmarkRequest _build(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) {
                    return new PostUserBookmarkRequest(userBookmark);
                }

                public PostUserBookmarkRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(userBookmark, "net.lab1318.costume.api.services.user.PostUserBookmarkRequest: missing userBookmark"));
                }

                public final net.lab1318.costume.api.models.user.UserBookmark getUserBookmark() {
                    return userBookmark;
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
                    userBookmark = net.lab1318.costume.api.models.user.UserBookmark.readAsStruct(iprot);
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
                        case "user_bookmark": {
                            userBookmark = net.lab1318.costume.api.models.user.UserBookmark.readAsStruct(iprot);
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

                public Builder setIfPresent(final PostUserBookmarkRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setUserBookmark(other.getUserBookmark());

                    return this;
                }

                public Builder setUserBookmark(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) {
                    this.userBookmark = com.google.common.base.Preconditions.checkNotNull(userBookmark);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "user_bookmark": setUserBookmark((net.lab1318.costume.api.models.user.UserBookmark)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetUserBookmark() {
                    this.userBookmark = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "user_bookmark": return unsetUserBookmark();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserBookmark userBookmark;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                USER_BOOKMARK("userBookmark", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserBookmark>() {}, true, 0, "user_bookmark", org.thryft.protocol.Type.STRUCT);

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
                    case "userBookmark": return USER_BOOKMARK;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "user_bookmark": return USER_BOOKMARK;
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
            public PostUserBookmarkRequest(final PostUserBookmarkRequest other) {
                this(other.getUserBookmark());
            }

            /**
             * Optional constructor
             */
            public PostUserBookmarkRequest(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) {
                this.userBookmark = com.google.common.base.Preconditions.checkNotNull(userBookmark, "net.lab1318.costume.api.services.user.PostUserBookmarkRequest: missing userBookmark");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserBookmarkRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserBookmarkRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostUserBookmarkRequest)) {
                    return false;
                }

                final PostUserBookmarkRequest other = (PostUserBookmarkRequest)otherObject;
                return
                    getUserBookmark().equals(other.getUserBookmark());
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
                case USER_BOOKMARK: return getUserBookmark();
                default:
                    throw new IllegalStateException();
                }
            }

            public final net.lab1318.costume.api.models.user.UserBookmark getUserBookmark() {
                return userBookmark;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getUserBookmark().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PostUserBookmarkRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostUserBookmarkRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmark userBookmark = null;

                iprot.readListBegin();
                userBookmark = net.lab1318.costume.api.models.user.UserBookmark.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PostUserBookmarkRequest(userBookmark);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PostUserBookmarkRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmark userBookmark = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "user_bookmark": {
                        userBookmark = net.lab1318.costume.api.models.user.UserBookmark.readAsStruct(iprot);
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
                    return new PostUserBookmarkRequest(userBookmark);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostUserBookmarkRequest replaceUserBookmark(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) {
                return new PostUserBookmarkRequest(userBookmark);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("user_bookmark", getUserBookmark()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getUserBookmark().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PostUserBookmarkRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("user_bookmark", org.thryft.protocol.Type.STRUCT, (short)0);
                getUserBookmark().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.user.UserBookmark userBookmark;
        }

        public final static class PostUserBookmarkResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final PostUserBookmarkResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PostUserBookmarkResponse _build(final net.lab1318.costume.api.models.user.UserBookmarkId returnValue) {
                    return new PostUserBookmarkResponse(returnValue);
                }

                public PostUserBookmarkResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.user.PostUserBookmarkResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.models.user.UserBookmarkId getReturnValue() {
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
                        returnValue = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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
                        case "return_value": {
                            try {
                                returnValue = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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

                public Builder setIfPresent(final PostUserBookmarkResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.models.user.UserBookmarkId returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.models.user.UserBookmarkId)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": return unsetReturnValue();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserBookmarkId returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserBookmarkId>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRING);

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
            public PostUserBookmarkResponse(final PostUserBookmarkResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public PostUserBookmarkResponse(final net.lab1318.costume.api.models.user.UserBookmarkId returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.user.UserCommandService.postUserBookmark: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PostUserBookmarkResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PostUserBookmarkResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostUserBookmarkResponse)) {
                    return false;
                }

                final PostUserBookmarkResponse other = (PostUserBookmarkResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final net.lab1318.costume.api.models.user.UserBookmarkId getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PostUserBookmarkResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PostUserBookmarkResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmarkId returnValue = null;

                iprot.readListBegin();
                try {
                    returnValue = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                iprot.readListEnd();
                try {
                    return new PostUserBookmarkResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PostUserBookmarkResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PostUserBookmarkResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserBookmarkId returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        try {
                            returnValue = net.lab1318.costume.api.models.user.UserBookmarkId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException e) {
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
                    return new PostUserBookmarkResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PostUserBookmarkResponse replaceReturnValue(final net.lab1318.costume.api.models.user.UserBookmarkId returnValue) {
                return new PostUserBookmarkResponse(returnValue);
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PostUserBookmarkResponse");
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

            private final net.lab1318.costume.api.models.user.UserBookmarkId returnValue;
        }

        public final static class PutUserRequest implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    id = null;
                    user = null;
                }

                public Builder(final PutUserRequest other) {
                    this.id = other.getId();
                    this.user = other.getUser();
                }

                protected PutUserRequest _build(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) {
                    return new PutUserRequest(id, user);
                }

                public PutUserRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.PutUserRequest: missing id"), com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.PutUserRequest: missing user"));
                }

                public final net.lab1318.costume.api.models.user.UserId getId() {
                    return id;
                }

                public final net.lab1318.costume.api.models.user.User getUser() {
                    return user;
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
                        id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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
                                id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                                 throw new org.thryft.protocol.InputProtocolException(e);
                            }
                            break;
                        }
                        case "user": {
                            user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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

                public Builder setId(final net.lab1318.costume.api.models.user.UserId id) {
                    this.id = com.google.common.base.Preconditions.checkNotNull(id);
                    return this;
                }

                public Builder setIfPresent(final PutUserRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setId(other.getId());
                    setUser(other.getUser());

                    return this;
                }

                public Builder setUser(final net.lab1318.costume.api.models.user.User user) {
                    this.user = com.google.common.base.Preconditions.checkNotNull(user);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": setId((net.lab1318.costume.api.models.user.UserId)value); return this;
                    case "user": setUser((net.lab1318.costume.api.models.user.User)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetId() {
                    this.id = null;
                    return this;
                }

                public Builder unsetUser() {
                    this.user = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "id": return unsetId();
                    case "user": return unsetUser();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.models.user.UserId id;
                private net.lab1318.costume.api.models.user.User user;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
                USER("user", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.User>() {}, true, 0, "user", org.thryft.protocol.Type.STRUCT);

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
                    case "user": return USER;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "id": return ID;
                    case "user": return USER;
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
            public PutUserRequest(final PutUserRequest other) {
                this(other.getId(), other.getUser());
            }

            /**
             * Optional constructor
             */
            public PutUserRequest(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) {
                this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.PutUserRequest: missing id");
                this.user = com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.PutUserRequest: missing user");
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutUserRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutUserRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutUserRequest)) {
                    return false;
                }

                final PutUserRequest other = (PutUserRequest)otherObject;
                return
                    getId().equals(other.getId()) &&
                    getUser().equals(other.getUser());
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
                case USER: return getUser();
                default:
                    throw new IllegalStateException();
                }
            }

            public final net.lab1318.costume.api.models.user.UserId getId() {
                return id;
            }

            public final net.lab1318.costume.api.models.user.User getUser() {
                return user;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                hashCode = 31 * hashCode + getUser().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static PutUserRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutUserRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId id = null;
                net.lab1318.costume.api.models.user.User user = null;

                iprot.readListBegin();
                try {
                    id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new PutUserRequest(id, user);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutUserRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.models.user.UserId id = null;
                net.lab1318.costume.api.models.user.User user = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "id": {
                        try {
                            id = net.lab1318.costume.api.models.user.UserId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.user.InvalidUserIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                        break;
                    }
                    case "user": {
                        user = net.lab1318.costume.api.models.user.User.readAsStruct(iprot);
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
                    return new PutUserRequest(id, user);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public PutUserRequest replaceId(final net.lab1318.costume.api.models.user.UserId id) {
                return new PutUserRequest(id, this.user);
            }

            public PutUserRequest replaceUser(final net.lab1318.costume.api.models.user.User user) {
                return new PutUserRequest(this.id, user);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("user", getUser()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                oprot.writeString(getId().toString());

                getUser().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PutUserRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("user", org.thryft.protocol.Type.STRUCT, (short)0);
                getUser().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final net.lab1318.costume.api.models.user.UserId id;

            private final net.lab1318.costume.api.models.user.User user;
        }

        public final static class PutUserResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutUserResponse other) {
                }

                protected PutUserResponse _build() {
                    return new PutUserResponse();
                }

                public PutUserResponse build() {
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

                public Builder setIfPresent(final PutUserResponse other) {
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

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }
            }

            public PutUserResponse() {
            }

            /**
             * Copy constructor
             */
            public PutUserResponse(final PutUserResponse other) {
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutUserResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutUserResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutUserResponse)) {
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

            public static PutUserResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutUserResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                iprot.readListBegin();
                iprot.readListEnd();
                try {
                    return new PutUserResponse();
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static PutUserResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutUserResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                    return new PutUserResponse();
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.user.PutUserResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }
    }

    public void deleteUserBookmarkById(final net.lab1318.costume.api.models.user.UserBookmarkId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserBookmarkException;

    public void deleteUserById(final net.lab1318.costume.api.models.user.UserId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException;

    public void deleteUsers() throws net.lab1318.costume.api.services.IoException;

    public net.lab1318.costume.api.models.user.UserId postUser(final net.lab1318.costume.api.models.user.User user) throws net.lab1318.costume.api.services.user.DuplicateUserException, net.lab1318.costume.api.services.IoException;

    public net.lab1318.costume.api.models.user.UserBookmarkId postUserBookmark(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) throws net.lab1318.costume.api.services.IoException;

    public void putUser(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException;
}
