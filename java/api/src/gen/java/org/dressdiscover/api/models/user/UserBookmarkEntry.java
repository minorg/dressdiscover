package org.dressdiscover.api.models.user;

public final class UserBookmarkEntry implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.user.UserBookmark, org.dressdiscover.api.models.user.UserBookmarkId> {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, UserBookmarkEntry> {
        public Builder() {
            id = null;
            model = null;
        }

        public Builder(final UserBookmarkEntry other) {
            this.id = other.getId();
            this.model = other.getModel();
        }

        protected UserBookmarkEntry _build(final org.dressdiscover.api.models.user.UserBookmarkId id, final org.dressdiscover.api.models.user.UserBookmark model) {
            return new UserBookmarkEntry(id, model);
        }

        public UserBookmarkEntry build() {
            Validator.validate(id, model);

            return _build(id, model);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmarkId getId() {
            return id;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmark getModel() {
            return model;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                try {
                    this.setId(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                this.setModel(org.dressdiscover.api.models.user.UserBookmark.readAsStruct(iprot));
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                            this.setId(org.dressdiscover.api.models.user.UserBookmarkId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.user.InvalidUserBookmarkIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "model": {
                        this.setModel(org.dressdiscover.api.models.user.UserBookmark.readAsStruct(iprot, unknownFieldCallback));
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case MODEL: setModel((org.dressdiscover.api.models.user.UserBookmark)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
            Validator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setIfPresent(final UserBookmarkEntry other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setModel(other.getModel());

            return this;
        }

        public Builder setModel(final org.dressdiscover.api.models.user.UserBookmark model) {
            Validator.validateModel(model);
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

        private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmarkId id;
        private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserBookmark model;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<UserBookmarkEntry> {
        @Override
        public UserBookmarkEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return UserBookmarkEntry.readAsList(iprot);
        }

        @Override
        public UserBookmarkEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return UserBookmarkEntry.readAsStruct(iprot);
        }

        @Override
        public UserBookmarkEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return UserBookmarkEntry.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmarkId>() {}, true, (short)0, "id", "id", org.thryft.protocol.Type.STRING),
        MODEL("model", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserBookmark>() {}, true, (short)0, "model", "model", org.thryft.protocol.Type.STRUCT);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final org.dressdiscover.api.models.user.UserBookmarkId id, final org.dressdiscover.api.models.user.UserBookmark model) {
            validateId(id);
            validateModel(model);
        }

        public static void validateId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.UserBookmarkEntry: id is missing");
            }
        }

        public static void validateModel(final org.dressdiscover.api.models.user.UserBookmark model) {
            if (model == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.UserBookmarkEntry: model is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public UserBookmarkEntry(final UserBookmarkEntry other) {
        this(other.getId(), other.getModel());
    }

    /**
     * Total constructor
     */
    public UserBookmarkEntry(final org.dressdiscover.api.models.user.UserBookmarkId id, final org.dressdiscover.api.models.user.UserBookmark model) {
        Validator.validate(id, model);
        this.id = id;
        this.model = model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final UserBookmarkEntry other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<UserBookmarkEntry> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof UserBookmarkEntry)) {
            return false;
        }

        final UserBookmarkEntry other = (UserBookmarkEntry)otherObject;

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

    public final org.dressdiscover.api.models.user.UserBookmarkId getId() {
        return id;
    }

    public final org.dressdiscover.api.models.user.UserBookmark getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public static UserBookmarkEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static UserBookmarkEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static UserBookmarkEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public UserBookmarkEntry replaceId(final org.dressdiscover.api.models.user.UserBookmarkId id) {
        Validator.validateId(id);
        return new UserBookmarkEntry(id, this.model);
    }

    public UserBookmarkEntry replaceModel(final org.dressdiscover.api.models.user.UserBookmark model) {
        Validator.validateModel(model);
        return new UserBookmarkEntry(this.id, model);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.user.UserBookmarkEntry");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getId().toString());
        getModel().writeAsStruct(oprot);
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

    private final org.dressdiscover.api.models.user.UserBookmarkId id;

    private final org.dressdiscover.api.models.user.UserBookmark model;
}
