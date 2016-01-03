package net.lab1318.costume.api.models.object;

public class ObjectSummaryEntry implements org.thryft.Struct, org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.object.ObjectSummary, net.lab1318.costume.api.models.object.ObjectId> {
    public static class Builder {
        public Builder() {
            id = null;
            model = null;
        }

        public Builder(final ObjectSummaryEntry other) {
            this.id = other.getId();
            this.model = other.getModel();
        }

        protected ObjectSummaryEntry _build(final net.lab1318.costume.api.models.object.ObjectId id, final net.lab1318.costume.api.models.object.ObjectSummary model) {
            return new ObjectSummaryEntry(id, model);
        }

        public ObjectSummaryEntry build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.models.object.ObjectSummaryEntry: missing id"), com.google.common.base.Preconditions.checkNotNull(model, "net.lab1318.costume.api.models.object.ObjectSummaryEntry: missing model"));
        }

        public final net.lab1318.costume.api.models.object.ObjectId getId() {
            return id;
        }

        public final net.lab1318.costume.api.models.object.ObjectSummary getModel() {
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
            try {
                id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            model = net.lab1318.costume.api.models.object.ObjectSummary.readAsStruct(iprot);
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
                    try {
                        id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                    break;
                }
                case "model": {
                    model = net.lab1318.costume.api.models.object.ObjectSummary.readAsStruct(iprot);
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setId(final net.lab1318.costume.api.models.object.ObjectId id) {
            this.id = com.google.common.base.Preconditions.checkNotNull(id);
            return this;
        }

        public Builder setIfPresent(final ObjectSummaryEntry other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setModel(other.getModel());

            return this;
        }

        public Builder setModel(final net.lab1318.costume.api.models.object.ObjectSummary model) {
            this.model = com.google.common.base.Preconditions.checkNotNull(model);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "id": setId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "model": setModel((net.lab1318.costume.api.models.object.ObjectSummary)value); return this;
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

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "id": return unsetId();
            case "model": return unsetModel();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.object.ObjectId id;
        private net.lab1318.costume.api.models.object.ObjectSummary model;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        MODEL("model", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectSummary>() {}, true, 0, "model", org.thryft.protocol.Type.STRUCT);

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
    public ObjectSummaryEntry(final ObjectSummaryEntry other) {
        this(other.getId(), other.getModel());
    }

    /**
     * Optional constructor
     */
    public ObjectSummaryEntry(final net.lab1318.costume.api.models.object.ObjectId id, final net.lab1318.costume.api.models.object.ObjectSummary model) {
        this.id = com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.models.object.ObjectSummaryEntry: missing id");
        this.model = com.google.common.base.Preconditions.checkNotNull(model, "net.lab1318.costume.api.models.object.ObjectSummaryEntry: missing model");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectSummaryEntry other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectSummaryEntry> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectSummaryEntry)) {
            return false;
        }

        final ObjectSummaryEntry other = (ObjectSummaryEntry)otherObject;
        return
            getId().equals(other.getId()) &&
            getModel().equals(other.getModel());
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

    public final net.lab1318.costume.api.models.object.ObjectId getId() {
        return id;
    }

    public final net.lab1318.costume.api.models.object.ObjectSummary getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public static ObjectSummaryEntry readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectSummaryEntry readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.object.ObjectId id = null;
        net.lab1318.costume.api.models.object.ObjectSummary model = null;

        iprot.readListBegin();
        try {
            id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        model = net.lab1318.costume.api.models.object.ObjectSummary.readAsStruct(iprot);
        iprot.readListEnd();
        try {
            return new ObjectSummaryEntry(id, model);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectSummaryEntry readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.object.ObjectId id = null;
        net.lab1318.costume.api.models.object.ObjectSummary model = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "id": {
                try {
                    id = net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString());
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                     throw new org.thryft.protocol.InputProtocolException(e);
                }
                break;
            }
            case "model": {
                model = net.lab1318.costume.api.models.object.ObjectSummary.readAsStruct(iprot);
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectSummaryEntry(id, model);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectSummaryEntry replaceId(final net.lab1318.costume.api.models.object.ObjectId id) {
        return new ObjectSummaryEntry(id, this.model);
    }

    public ObjectSummaryEntry replaceModel(final net.lab1318.costume.api.models.object.ObjectSummary model) {
        return new ObjectSummaryEntry(this.id, model);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.ObjectSummaryEntry");
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

    private final net.lab1318.costume.api.models.object.ObjectId id;

    private final net.lab1318.costume.api.models.object.ObjectSummary model;
}
