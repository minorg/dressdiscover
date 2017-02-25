package org.dressdiscover.api.services.qa;

public interface QaObjectQueryService {
    public enum FunctionMetadata {
        GET_OBJECT_BY_ID("get_object_by_id"),
        GET_OBJECTS("get_objects");

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
            public final static class Builder {
                public Builder() {
                    id = null;
                }

                public Builder(final GetObjectByIdRequest other) {
                    this.id = other.getId();
                }

                protected GetObjectByIdRequest _build(final org.dressdiscover.api.models.qa.QaObjectId id) {
                    return new GetObjectByIdRequest(id, DefaultConstructionValidator.getInstance());
                }

                public GetObjectByIdRequest build() {
                    return _build(id);
                }

                public final org.dressdiscover.api.models.qa.QaObjectId getId() {
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
                    try {
                        iprot.readListBegin();
                        try {
                            id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
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
                            case "id": {
                                try {
                                    id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
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
                    case ID: setId((org.dressdiscover.api.models.qa.QaObjectId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setId(final org.dressdiscover.api.models.qa.QaObjectId id) {
                    this.id = DefaultConstructionValidator.getInstance().validateId(id);
                    return this;
                }

                public Builder setIfPresent(final GetObjectByIdRequest other) {
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

                private org.dressdiscover.api.models.qa.QaObjectId id;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectByIdRequest> {
                @Override
                public GetObjectByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdRequest.readAs(iprot, type);
                }

                @Override
                public GetObjectByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdRequest.readAsList(iprot);
                }

                @Override
                public GetObjectByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdRequest.readAsStruct(iprot);
                }

                @Override
                public GetObjectByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaObjectId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING);

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

            public interface Validator<ExceptionT extends Exception> {
                public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws ExceptionT;
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
                public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws RuntimeException {
                    if (id == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetObjectByIdRequest: id is null");
                    }
                    return id;
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
                public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) {
                    return id;
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
                public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.thryft.protocol.InputProtocolException {
                    if (id == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.services.qa.GetObjectByIdRequest: id is null");
                    }
                    return id;
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
                public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) {
                    return id;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetObjectByIdRequest(final GetObjectByIdRequest other) {
                this(other.getId(), NopConstructionValidator.getInstance());
            }

            protected GetObjectByIdRequest(final org.dressdiscover.api.models.qa.QaObjectId id, ConstructionValidator validator) {
                this.id = validator.validateId(id);
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

            /**
             * Optional factory method
             */
            public static GetObjectByIdRequest create(final org.dressdiscover.api.models.qa.QaObjectId id) {
                return new GetObjectByIdRequest(id, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectByIdRequest)) {
                    return false;
                }

                final GetObjectByIdRequest other = (GetObjectByIdRequest)otherObject;

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

            public final org.dressdiscover.api.models.qa.QaObjectId getId() {
                return id;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getId().hashCode();
                return hashCode;
            }

            public static GetObjectByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectByIdRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectByIdRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObjectId id = null;

                try {
                    iprot.readListBegin();
                    try {
                        id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectByIdRequest(DefaultReadValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
            }

            public static GetObjectByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectByIdRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObjectId id = null;

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
                                id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
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
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectByIdRequest(DefaultReadValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
            }

            public GetObjectByIdRequest replaceId(final org.dressdiscover.api.models.qa.QaObjectId id) {
                return new GetObjectByIdRequest(DefaultConstructionValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
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
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetObjectByIdRequest");
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

            private final org.dressdiscover.api.models.qa.QaObjectId id;
        }

        public final static class GetObjectByIdResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectByIdResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectByIdResponse _build(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                    return new GetObjectByIdResponse(returnValue, DefaultConstructionValidator.getInstance());
                }

                public GetObjectByIdResponse build() {
                    return _build(returnValue);
                }

                public final org.dressdiscover.api.models.qa.QaObject getReturnValue() {
                    return returnValue;
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
                        returnValue = org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot);
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
                            case "return_value": {
                                returnValue = org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot);
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
                    case RETURN_VALUE: setReturnValue((org.dressdiscover.api.models.qa.QaObject)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetObjectByIdResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                    this.returnValue = DefaultConstructionValidator.getInstance().validateReturnValue(returnValue);
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private org.dressdiscover.api.models.qa.QaObject returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectByIdResponse> {
                @Override
                public GetObjectByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdResponse.readAs(iprot, type);
                }

                @Override
                public GetObjectByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdResponse.readAsList(iprot);
                }

                @Override
                public GetObjectByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdResponse.readAsStruct(iprot);
                }

                @Override
                public GetObjectByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectByIdResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaObject>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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

            public interface Validator<ExceptionT extends Exception> {
                public org.dressdiscover.api.models.qa.QaObject validateReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) throws ExceptionT;
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
                public org.dressdiscover.api.models.qa.QaObject validateReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) throws RuntimeException {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetObjectByIdResponse: returnValue is null");
                    }
                    return returnValue;
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
                public org.dressdiscover.api.models.qa.QaObject validateReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                    return returnValue;
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
                public org.dressdiscover.api.models.qa.QaObject validateReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.qa.GetObjectByIdResponse: returnValue is null");
                    }
                    return returnValue;
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
                public org.dressdiscover.api.models.qa.QaObject validateReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                    return returnValue;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetObjectByIdResponse(final GetObjectByIdResponse other) {
                this(other.getReturnValue(), NopConstructionValidator.getInstance());
            }

            protected GetObjectByIdResponse(final org.dressdiscover.api.models.qa.QaObject returnValue, ConstructionValidator validator) {
                this.returnValue = validator.validateReturnValue(returnValue);
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

            /**
             * Optional factory method
             */
            public static GetObjectByIdResponse create(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                return new GetObjectByIdResponse(returnValue, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectByIdResponse)) {
                    return false;
                }

                final GetObjectByIdResponse other = (GetObjectByIdResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.qa.QaObject getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectByIdResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectByIdResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObject returnValue = null;

                try {
                    iprot.readListBegin();
                    returnValue = org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectByIdResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public static GetObjectByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectByIdResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObject returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot);
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
                return new GetObjectByIdResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public GetObjectByIdResponse replaceReturnValue(final org.dressdiscover.api.models.qa.QaObject returnValue) {
                return new GetObjectByIdResponse(DefaultConstructionValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
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
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetObjectByIdResponse");
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

            private final org.dressdiscover.api.models.qa.QaObject returnValue;
        }

        public final static class GetObjectsRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                }

                public Builder(final GetObjectsRequest other) {
                }

                protected GetObjectsRequest _build() {
                    return new GetObjectsRequest();
                }

                public GetObjectsRequest build() {
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
                            if (unknownFieldCallback.isPresent()) {
                                unknownFieldCallback.get().apply(ifield);
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

                public Builder setIfPresent(final GetObjectsRequest other) {
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

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectsRequest> {
                @Override
                public GetObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsRequest.readAs(iprot, type);
                }

                @Override
                public GetObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsRequest.readAsList(iprot);
                }

                @Override
                public GetObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsRequest.readAsStruct(iprot);
                }

                @Override
                public GetObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsRequest.readAsStruct(iprot, unknownFieldCallback);
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

            public GetObjectsRequest() {
            }

            /**
             * Copy constructor
             */
            public GetObjectsRequest(final GetObjectsRequest other) {
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

            public static GetObjectsRequest create() {
                return new GetObjectsRequest();
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectsRequest)) {
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

            public static GetObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readListBegin();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectsRequest();
            }

            public static GetObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectsRequest();
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
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetObjectsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }
        }

        public final static class GetObjectsResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectsResponse _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                    return new GetObjectsResponse(returnValue, DefaultConstructionValidator.getInstance());
                }

                public GetObjectsResponse build() {
                    return _build(returnValue);
                }

                public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getReturnValue() {
                    return returnValue;
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QaObject> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                        }
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
                            case "return_value": {
                                try {
                                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QaObject> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot);
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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

                @SuppressWarnings({"unchecked"})
                public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

                    switch (fieldMetadata) {
                    case RETURN_VALUE: setReturnValue((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetObjectsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                    this.returnValue = DefaultConstructionValidator.getInstance().validateReturnValue(returnValue);
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectsResponse> {
                @Override
                public GetObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsResponse.readAs(iprot, type);
                }

                @Override
                public GetObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsResponse.readAsList(iprot);
                }

                @Override
                public GetObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsResponse.readAsStruct(iprot);
                }

                @Override
                public GetObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectsResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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

            public interface Validator<ExceptionT extends Exception> {
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) throws ExceptionT;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) throws RuntimeException {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetObjectsResponse: returnValue is null");
                    }
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.qa.GetObjectsResponse: returnValue is null");
                    }
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                    return returnValue;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetObjectsResponse(final GetObjectsResponse other) {
                this(other.getReturnValue(), NopConstructionValidator.getInstance());
            }

            protected GetObjectsResponse(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue, ConstructionValidator validator) {
                this.returnValue = validator.validateReturnValue(returnValue);
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

            /**
             * Optional factory method
             */
            public static GetObjectsResponse create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                return new GetObjectsResponse(returnValue, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectsResponse)) {
                    return false;
                }

                final GetObjectsResponse other = (GetObjectsResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue = null;

                try {
                    iprot.readListBegin();
                    try {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QaObject> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectsResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public static GetObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            try {
                                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QaObject> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.QaObject.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot);
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectsResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public GetObjectsResponse replaceReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue) {
                return new GetObjectsResponse(DefaultConstructionValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.QaObject _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetObjectsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.QaObject _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> returnValue;
        }
    }

    public org.dressdiscover.api.models.qa.QaObject getObjectById(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchObjectException;

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getObjects() throws org.dressdiscover.api.services.IoException;
}
