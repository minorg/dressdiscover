package net.lab1318.costume.api.models.object;

public class Object implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            institutionId = null;
            title = null;
            collectionId = com.google.common.base.Optional.absent();
            description = com.google.common.base.Optional.absent();
        }

        public Builder(final Object other) {
            this.institutionId = other.getInstitutionId();
            this.title = other.getTitle();
            this.collectionId = other.getCollectionId();
            this.description = other.getDescription();
        }

        protected Object _build(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId, final com.google.common.base.Optional<String> description) {
            return new Object(institutionId, title, collectionId, description);
        }

        public Object build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.Object: missing description"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            institutionId = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
            title = iprot.readString();
            if (__list.getSize() > 2) {
                try {
                    collectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
                }
            }
            if (__list.getSize() > 3) {
                description = com.google.common.base.Optional.of(iprot.readString());
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
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        institutionId = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "collection_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            collectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                        } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
                        }
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setCollectionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId) {
            this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
            return this;
        }

        public Builder setCollectionId(@javax.annotation.Nullable final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
            this.collectionId = com.google.common.base.Optional.fromNullable(collectionId);
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

        public Builder setIfPresent(final Object other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setInstitutionId(other.getInstitutionId());
            setTitle(other.getTitle());
            if (other.getCollectionId().isPresent()) {
                setCollectionId(other.getCollectionId());
            }
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }

            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "title": setTitle((String)value); return this;
            case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "description": setDescription((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetCollectionId() {
            this.collectionId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private String title;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId;
        private com.google.common.base.Optional<String> description;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INSTITUTION_ID(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 1, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE(new com.google.common.reflect.TypeToken<String>() {}, true, 3, "title", org.thryft.protocol.Type.STRING),
        COLLECTION_ID(new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, false, 2, "collection_id", org.thryft.protocol.Type.STRING),
        DESCRIPTION(new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            case "collectionId": return COLLECTION_ID;
            case "description": return DESCRIPTION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
            case "collection_id": return COLLECTION_ID;
            case "description": return DESCRIPTION;
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
    public Object(final Object other) {
        this(other.getInstitutionId(), other.getTitle(), other.getCollectionId(), other.getDescription());
    }

    /**
     * Required constructor
     */
    public Object(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.collectionId = com.google.common.base.Optional.absent();
        this.description = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Object(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final @javax.annotation.Nullable net.lab1318.costume.api.models.collection.CollectionId collectionId, final @javax.annotation.Nullable String description) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.collectionId = com.google.common.base.Optional.fromNullable(collectionId);
        this.description = com.google.common.base.Optional.fromNullable(description);
    }

    /**
     * Optional constructor
     */
    public Object(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId, final com.google.common.base.Optional<String> description) {
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.Object: missing title"), "net.lab1318.costume.api.models.object.Object: title is empty");
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.description = com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.Object: missing description");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Object other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Object> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Object)) {
            return false;
        }

        final Object other = (Object)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            getCollectionId().equals(other.getCollectionId()) &&
            getDescription().equals(other.getDescription());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "institution_id": return getInstitutionId();
        case "title": return getTitle();
        case "collection_id": return getCollectionId();
        case "description": return getDescription();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInstitutionId().ordinal();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getCollectionId().isPresent()) {
            hashCode = 31 * hashCode + getCollectionId().get().hashCode();
        }
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        return hashCode;
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        institutionId = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
        title = iprot.readString();
        if (__list.getSize() > 2) {
            try {
                collectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
            }
        }
        if (__list.getSize() > 3) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Object(institutionId, title, collectionId, description);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    institutionId = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    title = iprot.readString();
                }
                break;
            }
            case "collection_id": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        collectionId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.services.collection.InvalidCollectionIdException e) {
                    }
                }
                break;
            }
            case "description": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Object(institutionId, title, collectionId, description);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Object replaceCollectionId(final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId) {
        return new Object(this.institutionId, this.title, collectionId, this.description);
    }

    public Object replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        return replaceCollectionId(com.google.common.base.Optional.fromNullable(collectionId));
    }

    public Object replaceDescription(final com.google.common.base.Optional<String> description) {
        return new Object(this.institutionId, this.title, this.collectionId, description);
    }

    public Object replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public Object replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Object(institutionId, this.title, this.collectionId, this.description);
    }

    public Object replaceTitle(final String title) {
        return new Object(this.institutionId, title, this.collectionId, this.description);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("title", getTitle()).add("collection_id", getCollectionId().orNull()).add("description", getDescription().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeEnum(getInstitutionId());

        oprot.writeString(getTitle());

        if (getCollectionId().isPresent()) {
            oprot.writeString(getCollectionId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.Object");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getInstitutionId());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getCollectionId().isPresent()) {
            oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getCollectionId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final String title;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.collection.CollectionId> collectionId;

    private final com.google.common.base.Optional<String> description;
}
