package net.lab1318.costume.api.models.collection;

public class Collection implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            modelMetadata = null;
            institutionId = null;
            title = null;
        }

        public Builder(final Collection other) {
            this.modelMetadata = other.getModelMetadata();
            this.institutionId = other.getInstitutionId();
            this.title = other.getTitle();
        }

        protected Collection _build(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title) {
            return new Collection(modelMetadata, institutionId, title);
        }

        public Collection build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"));
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
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            try {
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new IllegalArgumentException(e);
            }
            title = iprot.readString();
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
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new IllegalArgumentException(e);
                        }
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        title = iprot.readString();
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Collection other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setModelMetadata(other.getModelMetadata());
            setInstitutionId(other.getInstitutionId());
            setTitle(other.getTitle());

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

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "title": setTitle((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
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

        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private String title;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 1, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "title", org.thryft.protocol.Type.STRING);

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
            case "modelMetadata": return MODEL_METADATA;
            case "institutionId": return INSTITUTION_ID;
            case "title": return TITLE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "model_metadata": return MODEL_METADATA;
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
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
        this(other.getModelMetadata(), other.getInstitutionId(), other.getTitle());
    }

    /**
     * Optional constructor
     */
    public Collection(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title) {
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.collection.Collection: missing modelMetadata");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.collection.Collection: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.collection.Collection: missing title"), "net.lab1318.costume.api.models.collection.Collection: title is empty");
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "model_metadata": return getModelMetadata();
        case "institution_id": return getInstitutionId();
        case "title": return getTitle();
        default:
            throw new IllegalArgumentException(fieldName);
        }
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

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        return hashCode;
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
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;

        iprot.readListBegin();
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new IllegalArgumentException(e);
        }
        title = iprot.readString();
        iprot.readListEnd();
        try {
            return new Collection(modelMetadata, institutionId, title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                }
                break;
            }
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new IllegalArgumentException(e);
                    }
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    title = iprot.readString();
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Collection(modelMetadata, institutionId, title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Collection replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Collection(this.modelMetadata, institutionId, this.title);
    }

    public Collection replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new Collection(modelMetadata, this.institutionId, this.title);
    }

    public Collection replaceTitle(final String title) {
        return new Collection(this.modelMetadata, this.institutionId, title);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("model_metadata", getModelMetadata()).add("institution_id", getInstitutionId()).add("title", getTitle()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        getModelMetadata().writeAsStruct(oprot);

        oprot.writeString(getInstitutionId().toString());

        oprot.writeString(getTitle());

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
        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)3);
        getModelMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final String title;
}
