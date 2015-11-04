package net.lab1318.costume.api.models.institution;

public class InstitutionEntry implements org.thryft.Struct, org.notaweb.api.models.ModelEntry<net.lab1318.costume.api.models.institution.Institution, net.lab1318.costume.api.models.institution.InstitutionId> {
    public static class Builder {
        public Builder() {
            id = null;
            model = null;
        }

        public Builder(final InstitutionEntry other) {
            this.id = other.getId();
            this.model = other.getModel();
        }

        protected InstitutionEntry _build(final net.lab1318.costume.api.models.institution.InstitutionId id, final net.lab1318.costume.api.models.institution.Institution model) {
            return new InstitutionEntry(id, model);
        }

        public InstitutionEntry build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.models.institution.InstitutionEntry: missing id"), com.google.common.base.Preconditions.checkNotNull(model, "net.lab1318.costume.api.models.institution.InstitutionEntry: missing model"));
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
            return id;
        }

        public final net.lab1318.costume.api.models.institution.Institution getModel() {
            return model;
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
            id = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
            model = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
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
                case "id": {
                    id = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
                    break;
                }
                case "model": {
                    model = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
            this.id = com.google.common.base.Preconditions.checkNotNull(id);
            return this;
        }

        public Builder setIfPresent(final InstitutionEntry other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setModel(other.getModel());

            return this;
        }

        public Builder setModel(final net.lab1318.costume.api.models.institution.Institution model) {
            this.model = com.google.common.base.Preconditions.checkNotNull(model);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "id": setId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "model": setModel((net.lab1318.costume.api.models.institution.Institution)value); return this;
            default:
                throw new IllegalArgumentException(name);
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

        private net.lab1318.costume.api.models.institution.InstitutionId id;
        private net.lab1318.costume.api.models.institution.Institution model;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        MODEL("model", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.Institution>() {}, true, 0, "model", org.thryft.protocol.Type.STRUCT);

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

    /**
     * Copy constructor
     */
    public InstitutionEntry(final InstitutionEntry other) {
        this(other.getId(), other.getModel());
    }

    /**
     * Optional constructor
     */
    public InstitutionEntry(final net.lab1318.costume.api.models.institution.InstitutionId id, final net.lab1318.costume.api.models.institution.Institution model) {
        this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.models.institution.InstitutionEntry: missing id");
        this.model = com.google.common.base.Preconditions.checkNotNull(model, "net.lab1318.costume.api.models.institution.InstitutionEntry: missing model");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InstitutionEntry)) {
            return false;
        }

        final InstitutionEntry other = (InstitutionEntry)otherObject;
        return
            getId().equals(other.getId()) &&
            getModel().equals(other.getModel());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "id": return getId();
        case "model": return getModel();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getId() {
        return id;
    }

    public final net.lab1318.costume.api.models.institution.Institution getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().ordinal();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public static InstitutionEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InstitutionEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId id = null;
        net.lab1318.costume.api.models.institution.Institution model = null;

        iprot.readListBegin();
        id = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
        model = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
        iprot.readListEnd();
        try {
            return new InstitutionEntry(id, model);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static InstitutionEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.institution.InstitutionId id = null;
        net.lab1318.costume.api.models.institution.Institution model = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "id": {
                id = iprot.readEnum(net.lab1318.costume.api.models.institution.InstitutionId.class);
                break;
            }
            case "model": {
                model = net.lab1318.costume.api.models.institution.Institution.readAsStruct(iprot);
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new InstitutionEntry(id, model);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public InstitutionEntry replaceId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
        return new InstitutionEntry(id, this.model);
    }

    public InstitutionEntry replaceModel(final net.lab1318.costume.api.models.institution.Institution model) {
        return new InstitutionEntry(this.id, model);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeEnum(getId());

        getModel().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.institution.InstitutionEntry");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeEnum(getId());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("model", org.thryft.protocol.Type.STRUCT, (short)0);
        getModel().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.institution.InstitutionId id;

    private final net.lab1318.costume.api.models.institution.Institution model;
}
