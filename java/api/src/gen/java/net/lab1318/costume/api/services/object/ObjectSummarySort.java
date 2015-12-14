package net.lab1318.costume.api.services.object;

public class ObjectSummarySort implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            field = null;
            order = null;
        }

        public Builder(final ObjectSummarySort other) {
            this.field = other.getField();
            this.order = other.getOrder();
        }

        protected ObjectSummarySort _build(final net.lab1318.costume.api.services.object.ObjectSummarySortField field, final net.lab1318.costume.api.models.SortOrder order) {
            return new ObjectSummarySort(field, order);
        }

        public ObjectSummarySort build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(field, "net.lab1318.costume.api.services.object.ObjectSummarySort: missing field"), com.google.common.base.Preconditions.checkNotNull(order, "net.lab1318.costume.api.services.object.ObjectSummarySort: missing order"));
        }

        public final net.lab1318.costume.api.services.object.ObjectSummarySortField getField() {
            return field;
        }

        public final net.lab1318.costume.api.models.SortOrder getOrder() {
            return order;
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
            field = iprot.readEnum(net.lab1318.costume.api.services.object.ObjectSummarySortField.class);
            order = iprot.readEnum(net.lab1318.costume.api.models.SortOrder.class);
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
                case "field": {
                    field = iprot.readEnum(net.lab1318.costume.api.services.object.ObjectSummarySortField.class);
                    break;
                }
                case "order": {
                    order = iprot.readEnum(net.lab1318.costume.api.models.SortOrder.class);
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setField(final net.lab1318.costume.api.services.object.ObjectSummarySortField field) {
            this.field = com.google.common.base.Preconditions.checkNotNull(field);
            return this;
        }

        public Builder setIfPresent(final ObjectSummarySort other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setField(other.getField());
            setOrder(other.getOrder());

            return this;
        }

        public Builder setOrder(final net.lab1318.costume.api.models.SortOrder order) {
            this.order = com.google.common.base.Preconditions.checkNotNull(order);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "field": setField((net.lab1318.costume.api.services.object.ObjectSummarySortField)value); return this;
            case "order": setOrder((net.lab1318.costume.api.models.SortOrder)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetField() {
            this.field = null;
            return this;
        }

        public Builder unsetOrder() {
            this.order = null;
            return this;
        }

        private net.lab1318.costume.api.services.object.ObjectSummarySortField field;
        private net.lab1318.costume.api.models.SortOrder order;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FIELD("field", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectSummarySortField>() {}, true, 0, "field", org.thryft.protocol.Type.STRING),
        ORDER("order", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.SortOrder>() {}, true, 0, "order", org.thryft.protocol.Type.STRING);

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
            case "field": return FIELD;
            case "order": return ORDER;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "field": return FIELD;
            case "order": return ORDER;
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
    public ObjectSummarySort(final ObjectSummarySort other) {
        this(other.getField(), other.getOrder());
    }

    /**
     * Optional constructor
     */
    public ObjectSummarySort(final net.lab1318.costume.api.services.object.ObjectSummarySortField field, final net.lab1318.costume.api.models.SortOrder order) {
        this.field = com.google.common.base.Preconditions.checkNotNull(field, "net.lab1318.costume.api.services.object.ObjectSummarySort: missing field");
        this.order = com.google.common.base.Preconditions.checkNotNull(order, "net.lab1318.costume.api.services.object.ObjectSummarySort: missing order");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectSummarySort other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectSummarySort> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectSummarySort)) {
            return false;
        }

        final ObjectSummarySort other = (ObjectSummarySort)otherObject;
        return
            getField().equals(other.getField()) &&
            getOrder().equals(other.getOrder());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "field": return getField();
        case "order": return getOrder();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final net.lab1318.costume.api.services.object.ObjectSummarySortField getField() {
        return field;
    }

    public final net.lab1318.costume.api.models.SortOrder getOrder() {
        return order;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getField().ordinal();
        hashCode = 31 * hashCode + getOrder().ordinal();
        return hashCode;
    }

    public static ObjectSummarySort readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectSummarySort readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.services.object.ObjectSummarySortField field = null;
        net.lab1318.costume.api.models.SortOrder order = null;

        iprot.readListBegin();
        field = iprot.readEnum(net.lab1318.costume.api.services.object.ObjectSummarySortField.class);
        order = iprot.readEnum(net.lab1318.costume.api.models.SortOrder.class);
        iprot.readListEnd();
        try {
            return new ObjectSummarySort(field, order);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectSummarySort readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.services.object.ObjectSummarySortField field = null;
        net.lab1318.costume.api.models.SortOrder order = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "field": {
                field = iprot.readEnum(net.lab1318.costume.api.services.object.ObjectSummarySortField.class);
                break;
            }
            case "order": {
                order = iprot.readEnum(net.lab1318.costume.api.models.SortOrder.class);
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectSummarySort(field, order);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectSummarySort replaceField(final net.lab1318.costume.api.services.object.ObjectSummarySortField field) {
        return new ObjectSummarySort(field, this.order);
    }

    public ObjectSummarySort replaceOrder(final net.lab1318.costume.api.models.SortOrder order) {
        return new ObjectSummarySort(this.field, order);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("field", getField()).add("order", getOrder()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeEnum(getField());

        oprot.writeEnum(getOrder());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.ObjectSummarySort");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("field", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeEnum(getField());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("order", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeEnum(getOrder());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.services.object.ObjectSummarySortField field;

    private final net.lab1318.costume.api.models.SortOrder order;
}
