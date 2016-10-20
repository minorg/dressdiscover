package org.dressdiscover.api.services.user;

@SuppressWarnings({"serial"})
public final class NoSuchUserBookmarkException extends org.thryft.Exception {
    public final static class Builder {
        public Builder() {
            id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserBookmarkId> absent();
        }

        public Builder(final NoSuchUserBookmarkException other) {
            this.id = other.getId();
        }

        protected NoSuchUserBookmarkException _build(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
            return new NoSuchUserBookmarkException(id, DefaultConstructionValidator.getInstance());
        }

        public NoSuchUserBookmarkException build() {
            return _build(id);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> getId() {
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        id = com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
                    }
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
                            id = com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
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
            case ID: setId((org.dressdiscover.api.models.user.UserBookmarkId)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setId(@javax.annotation.Nullable final org.dressdiscover.api.models.user.UserBookmarkId id) {
            return setId(com.google.common.base.Optional.fromNullable(id));
        }

        public Builder setIfPresent(final NoSuchUserBookmarkException other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getId().isPresent()) {
                setId(other.getId());
            }

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
            this.id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserBookmarkId> absent();
            return this;
        }

        private com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<NoSuchUserBookmarkException> {
        @Override
        public NoSuchUserBookmarkException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserBookmarkException.readAs(iprot, type);
        }

        @Override
        public NoSuchUserBookmarkException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserBookmarkException.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public NoSuchUserBookmarkException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserBookmarkException.readAsList(iprot);
        }

        @Override
        public NoSuchUserBookmarkException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserBookmarkException.readAsStruct(iprot);
        }

        @Override
        public NoSuchUserBookmarkException readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return NoSuchUserBookmarkException.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmarkId>() {}, false, 0, "id", org.thryft.protocol.Type.STRING);

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
        public com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) throws ExceptionT;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.services.user.NoSuchUserBookmarkException: id is null");
            }
            if (!id.isPresent()) {
                return id;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.services.user.NoSuchUserBookmarkException: id is null");
            }
            if (!id.isPresent()) {
                return id;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> validateId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
            return id;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public NoSuchUserBookmarkException() {
        id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserBookmarkId> absent();
    }

    /**
     * Copy constructor
     */
    public NoSuchUserBookmarkException(final NoSuchUserBookmarkException other) {
        this(other.getId(), NopConstructionValidator.getInstance());
    }

    protected NoSuchUserBookmarkException(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id, ConstructionValidator validator) {
        this.id = validator.validateId(id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final NoSuchUserBookmarkException other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<NoSuchUserBookmarkException> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    public static NoSuchUserBookmarkException create() {
        return new NoSuchUserBookmarkException();
    }

    /**
     * Total Nullable factory method
     */
    public static NoSuchUserBookmarkException create(final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmarkId id) {
        return new NoSuchUserBookmarkException(com.google.common.base.Optional.fromNullable(id), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static NoSuchUserBookmarkException create(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
        return new NoSuchUserBookmarkException(id, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof NoSuchUserBookmarkException)) {
            return false;
        }

        final NoSuchUserBookmarkException other = (NoSuchUserBookmarkException)otherObject;

        if (!(((getId().isPresent() && other.getId().isPresent()) ? (getId().get().equals(other.getId().get())) : (!getId().isPresent() && !other.getId().isPresent())))) {
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String getThriftQualifiedClassName() {
        return "dressdiscover.api.services.user.no_such_user_bookmark_exception.NoSuchUserBookmarkException";
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getId().isPresent()) {
            hashCode = 31 * hashCode + getId().get().hashCode();
        }
        return hashCode;
    }

    public static NoSuchUserBookmarkException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static NoSuchUserBookmarkException readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static NoSuchUserBookmarkException readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserBookmarkId> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    id = com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new NoSuchUserBookmarkException(DefaultReadValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
    }

    public static NoSuchUserBookmarkException readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static NoSuchUserBookmarkException readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id = com.google.common.base.Optional.<org.dressdiscover.api.models.user.UserBookmarkId> absent();

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
                        id = com.google.common.base.Optional.of(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
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
        return new NoSuchUserBookmarkException(DefaultReadValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
    }

    public NoSuchUserBookmarkException replaceId(final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id) {
        return new NoSuchUserBookmarkException(DefaultConstructionValidator.getInstance().validateId(id), NopConstructionValidator.getInstance());
    }

    public NoSuchUserBookmarkException replaceId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
        return replaceId(com.google.common.base.Optional.fromNullable(id));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        if (getId().isPresent()) {
            oprot.writeString(getId().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    public void writeAsMessage(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeMessageBegin("org.dressdiscover.api.services.user.NoSuchUserBookmarkException", org.thryft.protocol.MessageType.EXCEPTION, null);

        if (getId().isPresent()) {
            oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();

        oprot.writeMessageEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.user.NoSuchUserBookmarkException");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getId().isPresent()) {
            oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getId().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<org.dressdiscover.api.models.user.UserBookmarkId> id;
}
