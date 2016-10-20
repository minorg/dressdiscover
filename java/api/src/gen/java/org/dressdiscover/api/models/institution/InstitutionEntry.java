package org.dressdiscover.api.models.institution;

public final class InstitutionEntry implements org.thryft.Struct, org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.institution.Institution, org.dressdiscover.api.models.institution.InstitutionId> {
    public final static class Builder {
        public Builder() {
            id = null;
            model = null;
        }

        public Builder(final InstitutionEntry other) {
            this.id = other.getId();
            this.model = other.getModel();
        }

        protected InstitutionEntry _build(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution model) {
            return new InstitutionEntry(id, model, DefaultConstructionValidator.getInstance());
        }

        public InstitutionEntry build() {
            return _build(id, model);
        }

        public final org.dressdiscover.api.models.institution.InstitutionId getId() {
            return id;
        }

        public final org.dressdiscover.api.models.institution.Institution getModel() {
            return model;
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
                    id = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                model = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
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
                            id = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "model": {
                        model = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
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
            case ID: setId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
            case MODEL: setModel((org.dressdiscover.api.models.institution.Institution)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.institution.InstitutionId id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setIfPresent(final InstitutionEntry other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setModel(other.getModel());

            return this;
        }

        public Builder setModel(final org.dressdiscover.api.models.institution.Institution model) {
            this.model = DefaultConstructionValidator.getInstance().validateModel(model);
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
            case MODEL: return unsetModel();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetModel() {
            this.model = null;
            return this;
        }

        private org.dressdiscover.api.models.institution.InstitutionId id;
        private org.dressdiscover.api.models.institution.Institution model;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<InstitutionEntry> {
        @Override
        public InstitutionEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return InstitutionEntry.readAs(iprot, type);
        }

        @Override
        public InstitutionEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InstitutionEntry.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public InstitutionEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InstitutionEntry.readAsList(iprot);
        }

        @Override
        public InstitutionEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InstitutionEntry.readAsStruct(iprot);
        }

        @Override
        public InstitutionEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InstitutionEntry.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        MODEL("model", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.Institution>() {}, true, 0, "model", org.thryft.protocol.Type.STRUCT);

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
            case "model": return MODEL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "model": return MODEL;
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
        public org.dressdiscover.api.models.institution.InstitutionId validateId(final org.dressdiscover.api.models.institution.InstitutionId id) throws ExceptionT;

        public org.dressdiscover.api.models.institution.Institution validateModel(final org.dressdiscover.api.models.institution.Institution model) throws ExceptionT;
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
        public org.dressdiscover.api.models.institution.InstitutionId validateId(final org.dressdiscover.api.models.institution.InstitutionId id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.InstitutionEntry: id is null");
            }
            return id;
        }

        @Override
        public org.dressdiscover.api.models.institution.Institution validateModel(final org.dressdiscover.api.models.institution.Institution model) throws RuntimeException {
            if (model == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.InstitutionEntry: model is null");
            }
            return model;
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
        public org.dressdiscover.api.models.institution.InstitutionId validateId(final org.dressdiscover.api.models.institution.InstitutionId id) {
            return id;
        }

        @Override
        public org.dressdiscover.api.models.institution.Institution validateModel(final org.dressdiscover.api.models.institution.Institution model) {
            return model;
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
        public org.dressdiscover.api.models.institution.InstitutionId validateId(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.institution.InstitutionEntry: id is null");
            }
            return id;
        }

        @Override
        public org.dressdiscover.api.models.institution.Institution validateModel(final org.dressdiscover.api.models.institution.Institution model) throws org.thryft.protocol.InputProtocolException {
            if (model == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MODEL, "org.dressdiscover.api.models.institution.InstitutionEntry: model is null");
            }
            return model;
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
        public org.dressdiscover.api.models.institution.InstitutionId validateId(final org.dressdiscover.api.models.institution.InstitutionId id) {
            return id;
        }

        @Override
        public org.dressdiscover.api.models.institution.Institution validateModel(final org.dressdiscover.api.models.institution.Institution model) {
            return model;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public InstitutionEntry(final InstitutionEntry other) {
        this(other.getId(), other.getModel(), NopConstructionValidator.getInstance());
    }

    protected InstitutionEntry(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution model, ConstructionValidator validator) {
        this.id = validator.validateId(id);
        this.model = validator.validateModel(model);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InstitutionEntry other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InstitutionEntry> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static InstitutionEntry create(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution model) {
        return new InstitutionEntry(id, model, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof InstitutionEntry)) {
            return false;
        }

        final InstitutionEntry other = (InstitutionEntry)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(getModel().equals(other.getModel()))) {
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
        case MODEL: return getModel();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.institution.InstitutionId getId() {
        return id;
    }

    public final org.dressdiscover.api.models.institution.Institution getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public static InstitutionEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InstitutionEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InstitutionEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.institution.InstitutionId id = null;
        org.dressdiscover.api.models.institution.Institution model = null;

        try {
            iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            model = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InstitutionEntry(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateModel(model), NopConstructionValidator.getInstance());
    }

    public static InstitutionEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InstitutionEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.institution.InstitutionId id = null;
        org.dressdiscover.api.models.institution.Institution model = null;

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
                        id = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "model": {
                    model = org.dressdiscover.api.models.institution.Institution.readAsStruct(iprot);
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
        return new InstitutionEntry(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateModel(model), NopConstructionValidator.getInstance());
    }

    public InstitutionEntry replaceId(final org.dressdiscover.api.models.institution.InstitutionId id) {
        return new InstitutionEntry(DefaultConstructionValidator.getInstance().validateId(id), this.model, NopConstructionValidator.getInstance());
    }

    public InstitutionEntry replaceModel(final org.dressdiscover.api.models.institution.Institution model) {
        return new InstitutionEntry(this.id, DefaultConstructionValidator.getInstance().validateModel(model), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getId().toString());

        getModel().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.institution.InstitutionEntry");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("model", org.thryft.protocol.Type.STRUCT, (short)0);
        getModel().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.institution.InstitutionId id;

    private final org.dressdiscover.api.models.institution.Institution model;
}
