package org.dressdiscover.api.models.object;

public final class ObjectEntry implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.object.Object, org.dressdiscover.api.models.object.ObjectId> {
    public final static class Builder {
        public Builder() {
            id = null;
            model = null;
        }

        public Builder(final ObjectEntry other) {
            this.id = other.getId();
            this.model = other.getModel();
        }

        protected ObjectEntry _build(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object model) {
            return new ObjectEntry(id, model);
        }

        public ObjectEntry build() {
            UncheckedValidator.validate(id, model);

            return _build(id, model);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectId getId() {
            return id;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.object.Object getModel() {
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
                    id = org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                model = org.dressdiscover.api.models.object.Object.readAsStruct(iprot);
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
                            id = org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "model": {
                        model = org.dressdiscover.api.models.object.Object.readAsStruct(iprot, unknownFieldCallback);
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
            case ID: setId((org.dressdiscover.api.models.object.ObjectId)value); return this;
            case MODEL: setModel((org.dressdiscover.api.models.object.Object)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.object.ObjectId id) {
            UncheckedValidator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setIfPresent(final ObjectEntry other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setModel(other.getModel());

            return this;
        }

        public Builder setModel(final org.dressdiscover.api.models.object.Object model) {
            UncheckedValidator.validateModel(model);
            this.model = model;
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

        private @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectId id;
        private @javax.annotation.Nullable org.dressdiscover.api.models.object.Object model;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectEntry> {
        @Override
        public ObjectEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectEntry.readAs(iprot, type);
        }

        @Override
        public ObjectEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectEntry.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectEntry.readAsList(iprot);
        }

        @Override
        public ObjectEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectEntry.readAsStruct(iprot);
        }

        @Override
        public ObjectEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectEntry.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectId>() {}, true, (short)0, "id", org.thryft.protocol.Type.STRING),
        MODEL("model", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.Object>() {}, true, (short)0, "model", org.thryft.protocol.Type.STRUCT);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object model) throws org.thryft.protocol.InputProtocolException {
            validateId(id);
            validateModel(model);
        }

        public static void validateId(final org.dressdiscover.api.models.object.ObjectId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.object.ObjectEntry: id is null");
            }
        }

        public static void validateModel(final org.dressdiscover.api.models.object.Object model) throws org.thryft.protocol.InputProtocolException {
            if (model == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MODEL, "org.dressdiscover.api.models.object.ObjectEntry: model is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object model) {
            validateId(id);
            validateModel(model);
        }

        public static void validateId(final org.dressdiscover.api.models.object.ObjectId id) {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectEntry: id is null");
            }
        }

        public static void validateModel(final org.dressdiscover.api.models.object.Object model) {
            if (model == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectEntry: model is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public ObjectEntry(final ObjectEntry other) {
        this(other.getId(), other.getModel());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected ObjectEntry(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object model) {
        this.id = id;
        this.model = model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectEntry other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectEntry> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static ObjectEntry create(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object model) {
        UncheckedValidator.validate(id, model);
        return new ObjectEntry(id, model);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectEntry)) {
            return false;
        }

        final ObjectEntry other = (ObjectEntry)otherObject;

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

    public final org.dressdiscover.api.models.object.ObjectId getId() {
        return id;
    }

    public final org.dressdiscover.api.models.object.Object getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public static ObjectEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.object.ObjectId id;
        org.dressdiscover.api.models.object.Object model;

        try {
            iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            model = org.dressdiscover.api.models.object.Object.readAsStruct(iprot);
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(id, model);

        return new ObjectEntry(id, model);
    }

    public static ObjectEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectId id = null;
        @javax.annotation.Nullable org.dressdiscover.api.models.object.Object model = null;

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
                        id = org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "model": {
                    model = org.dressdiscover.api.models.object.Object.readAsStruct(iprot, unknownFieldCallback);
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

        ReadValidator.validate(id, model);

        return new ObjectEntry(id, model);
    }

    public ObjectEntry replaceId(final org.dressdiscover.api.models.object.ObjectId id) {
        UncheckedValidator.validateId(id);
        return new ObjectEntry(id, this.model);
    }

    public ObjectEntry replaceModel(final org.dressdiscover.api.models.object.Object model) {
        UncheckedValidator.validateModel(model);
        return new ObjectEntry(this.id, model);
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
        oprot.writeStructBegin("org.dressdiscover.api.models.object.ObjectEntry");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeIdField(oprot);

        writeModelField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ID);
        oprot.writeString(getId().toString());
        oprot.writeFieldEnd();
    }

    public void writeModelField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.MODEL);
        getModel().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.models.object.ObjectId id;

    private final org.dressdiscover.api.models.object.Object model;
}
