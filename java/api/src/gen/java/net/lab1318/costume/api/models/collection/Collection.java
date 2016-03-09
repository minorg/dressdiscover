package net.lab1318.costume.api.models.collection;

public class Collection implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            institutionId = null;
            modelMetadata = null;
            title = null;
            description = com.google.common.base.Optional.absent();
            hidden = com.google.common.base.Optional.absent();
            workTypes = com.google.common.base.Optional.absent();
        }

        public Builder(final Collection other) {
            this.institutionId = other.getInstitutionId();
            this.modelMetadata = other.getModelMetadata();
            this.title = other.getTitle();
            this.description = other.getDescription();
            this.hidden = other.getHidden();
            this.workTypes = other.getWorkTypes();
        }

        protected Collection _build(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            return new Collection(institutionId, modelMetadata, title, description, hidden, workTypes);
        }

        public Collection build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.collection.Collection: missing description"), com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.collection.Collection: missing hidden"), com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.collection.Collection: missing workTypes"));
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
            return workTypes;
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
            try {
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            title = iprot.readString();
            if (__list.getSize() > 3) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 4) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 5) {
                workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "work_types": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = com.google.common.base.Preconditions.checkNotNull(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            this.description = com.google.common.base.Optional.fromNullable(description);
            return this;
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = com.google.common.base.Preconditions.checkNotNull(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            this.hidden = com.google.common.base.Optional.fromNullable(hidden);
            return this;
        }

        public Builder setIfPresent(final Collection other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setInstitutionId(other.getInstitutionId());
            setModelMetadata(other.getModelMetadata());
            setTitle(other.getTitle());
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getWorkTypes().isPresent()) {
                setWorkTypes(other.getWorkTypes());
            }

            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder setWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes);
            return this;
        }

        public Builder setWorkTypes(@javax.annotation.Nullable final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
            this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "title": setTitle((String)value); return this;
            case "description": setDescription((String)value); return this;
            case "hidden": setHidden((Boolean)value); return this;
            case "work_types": setWorkTypes((net.lab1318.costume.api.models.work_type.WorkTypeSet)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetModelMetadata() {
            this.modelMetadata = null;
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetWorkTypes() {
            this.workTypes = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "institution_id": return unsetInstitutionId();
            case "model_metadata": return unsetModelMetadata();
            case "title": return unsetTitle();
            case "description": return unsetDescription();
            case "hidden": return unsetHidden();
            case "work_types": return unsetWorkTypes();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        private String title;
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 1, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 5, "hidden", org.thryft.protocol.Type.BOOL),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.work_type.WorkTypeSet>() {}, false, 6, "work_types", org.thryft.protocol.Type.STRUCT);

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
            case "modelMetadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "hidden": return HIDDEN;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "institution_id": return INSTITUTION_ID;
            case "model_metadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "hidden": return HIDDEN;
            case "work_types": return WORK_TYPES;
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
    public Collection(final Collection other) {
        this(other.getInstitutionId(), other.getModelMetadata(), other.getTitle(), other.getDescription(), other.getHidden(), other.getWorkTypes());
    }

    /**
     * Required constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = com.google.common.base.Optional.absent();
        this.hidden = com.google.common.base.Optional.absent();
        this.workTypes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(description), "net.lab1318.costume.api.models.collection.Collection: description is empty");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(hidden), "net.lab1318.costume.api.models.collection.Collection: hidden must be true");
        this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
    }

    /**
     * Optional constructor
     */
    public Collection(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.collection.Collection: missing description"), "net.lab1318.costume.api.models.collection.Collection: description is empty");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.collection.Collection: missing hidden"), "net.lab1318.costume.api.models.collection.Collection: hidden must be true");
        this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.collection.Collection: missing workTypes");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Collection other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Collection> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Collection)) {
            return false;
        }

        final Collection other = (Collection)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            ((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())) &&
            ((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get() == other.getHidden().get()) : (!getHidden().isPresent() && !other.getHidden().isPresent())) &&
            ((getWorkTypes().isPresent() && other.getWorkTypes().isPresent()) ? (getWorkTypes().get().equals(other.getWorkTypes().get())) : (!getWorkTypes().isPresent() && !other.getWorkTypes().isPresent()));
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
        case INSTITUTION_ID: return getInstitutionId();
        case MODEL_METADATA: return getModelMetadata();
        case TITLE: return getTitle();
        case DESCRIPTION: return getDescription();
        case HIDDEN: return getHidden();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getWorkTypes().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypes().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Collection readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        title = iprot.readString();
        if (__list.getSize() > 3) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 4) {
            hidden = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 5) {
            workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Collection(institutionId, modelMetadata, title, description, hidden, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    title = iprot.readString();
                }
                break;
            }
            case "description": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "hidden": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "work_types": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
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
            return new Collection(institutionId, modelMetadata, title, description, hidden, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Collection replaceDescription(final com.google.common.base.Optional<String> description) {
        return new Collection(this.institutionId, this.modelMetadata, this.title, description, this.hidden, this.workTypes);
    }

    public Collection replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public Collection replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Collection(this.institutionId, this.modelMetadata, this.title, this.description, hidden, this.workTypes);
    }

    public Collection replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Collection replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Collection(institutionId, this.modelMetadata, this.title, this.description, this.hidden, this.workTypes);
    }

    public Collection replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new Collection(this.institutionId, modelMetadata, this.title, this.description, this.hidden, this.workTypes);
    }

    public Collection replaceTitle(final String title) {
        return new Collection(this.institutionId, this.modelMetadata, title, this.description, this.hidden, this.workTypes);
    }

    public Collection replaceWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        return new Collection(this.institutionId, this.modelMetadata, this.title, this.description, this.hidden, workTypes);
    }

    public Collection replaceWorkTypes(final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        return replaceWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("description", getDescription().orNull()).add("hidden", getHidden().orNull()).add("work_types", getWorkTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 6);

        oprot.writeString(getInstitutionId().toString());

        getModelMetadata().writeAsStruct(oprot);

        oprot.writeString(getTitle());

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getWorkTypes().isPresent()) {
            getWorkTypes().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.collection.Collection");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)3);
        getModelMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)5);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getWorkTypes().isPresent()) {
            oprot.writeFieldBegin("work_types", org.thryft.protocol.Type.STRUCT, (short)6);
            getWorkTypes().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    private final String title;

    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
}
