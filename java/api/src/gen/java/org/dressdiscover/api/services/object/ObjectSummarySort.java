package org.dressdiscover.api.services.object;

public final class ObjectSummarySort implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            field = null;
            order = null;
        }

        public Builder(final ObjectSummarySort other) {
            this.field = other.getField();
            this.order = other.getOrder();
        }

        protected ObjectSummarySort _build(final org.dressdiscover.api.services.object.ObjectSummarySortField field, final org.dressdiscover.api.models.SortOrder order) {
            return new ObjectSummarySort(field, order);
        }

        public ObjectSummarySort build() {
            UncheckedValidator.validate(field, order);

            return _build(field, order);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.services.object.ObjectSummarySortField getField() {
            return field;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.SortOrder getOrder() {
            return order;
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
                field = iprot.readEnum(org.dressdiscover.api.services.object.ObjectSummarySortField.Factory.getInstance());
                order = iprot.readEnum(org.dressdiscover.api.models.SortOrder.Factory.getInstance());
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
                    case "field": {
                        field = iprot.readEnum(org.dressdiscover.api.services.object.ObjectSummarySortField.Factory.getInstance());
                        break;
                    }
                    case "order": {
                        order = iprot.readEnum(org.dressdiscover.api.models.SortOrder.Factory.getInstance());
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
            case FIELD: setField((org.dressdiscover.api.services.object.ObjectSummarySortField)value); return this;
            case ORDER: setOrder((org.dressdiscover.api.models.SortOrder)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setField(final org.dressdiscover.api.services.object.ObjectSummarySortField field) {
            UncheckedValidator.validateField(field);
            this.field = field;
            return this;
        }

        public Builder setIfPresent(final ObjectSummarySort other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setField(other.getField());
            setOrder(other.getOrder());

            return this;
        }

        public Builder setOrder(final org.dressdiscover.api.models.SortOrder order) {
            UncheckedValidator.validateOrder(order);
            this.order = order;
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
            case FIELD: return unsetField();
            case ORDER: return unsetOrder();
            default:
                throw new IllegalStateException();
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

        private @javax.annotation.Nullable org.dressdiscover.api.services.object.ObjectSummarySortField field;
        private @javax.annotation.Nullable org.dressdiscover.api.models.SortOrder order;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectSummarySort> {
        @Override
        public ObjectSummarySort readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummarySort.readAs(iprot, type);
        }

        @Override
        public ObjectSummarySort readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummarySort.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectSummarySort readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummarySort.readAsList(iprot);
        }

        @Override
        public ObjectSummarySort readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummarySort.readAsStruct(iprot);
        }

        @Override
        public ObjectSummarySort readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummarySort.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FIELD("field", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.ObjectSummarySortField>() {}, true, (short)0, "field", org.thryft.protocol.Type.STRING),
        ORDER("order", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.SortOrder>() {}, true, (short)0, "order", org.thryft.protocol.Type.STRING);

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
        public static void validate(final org.dressdiscover.api.services.object.ObjectSummarySortField field, final org.dressdiscover.api.models.SortOrder order) throws org.thryft.protocol.InputProtocolException {
            validateField(field);
            validateOrder(order);
        }

        public static void validateField(final org.dressdiscover.api.services.object.ObjectSummarySortField field) throws org.thryft.protocol.InputProtocolException {
            if (field == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FIELD, "org.dressdiscover.api.services.object.ObjectSummarySort: field is null");
            }
        }

        public static void validateOrder(final org.dressdiscover.api.models.SortOrder order) throws org.thryft.protocol.InputProtocolException {
            if (order == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ORDER, "org.dressdiscover.api.services.object.ObjectSummarySort: order is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.services.object.ObjectSummarySortField field, final org.dressdiscover.api.models.SortOrder order) {
            validateField(field);
            validateOrder(order);
        }

        public static void validateField(final org.dressdiscover.api.services.object.ObjectSummarySortField field) {
            if (field == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ObjectSummarySort: field is null");
            }
        }

        public static void validateOrder(final org.dressdiscover.api.models.SortOrder order) {
            if (order == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ObjectSummarySort: order is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public ObjectSummarySort(final ObjectSummarySort other) {
        this(other.getField(), other.getOrder());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected ObjectSummarySort(final org.dressdiscover.api.services.object.ObjectSummarySortField field, final org.dressdiscover.api.models.SortOrder order) {
        this.field = field;
        this.order = order;
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

    /**
     * Optional factory method
     */
    public static ObjectSummarySort create(final org.dressdiscover.api.services.object.ObjectSummarySortField field, final org.dressdiscover.api.models.SortOrder order) {
        UncheckedValidator.validate(field, order);
        return new ObjectSummarySort(field, order);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectSummarySort)) {
            return false;
        }

        final ObjectSummarySort other = (ObjectSummarySort)otherObject;

        if (!(getField().equals(other.getField()))) {
            return false;
        }

        if (!(getOrder().equals(other.getOrder()))) {
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
        case FIELD: return getField();
        case ORDER: return getOrder();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.services.object.ObjectSummarySortField getField() {
        return field;
    }

    public final org.dressdiscover.api.models.SortOrder getOrder() {
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
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummarySort readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectSummarySort readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.services.object.ObjectSummarySortField field;
        org.dressdiscover.api.models.SortOrder order;

        try {
            iprot.readListBegin();
            field = iprot.readEnum(org.dressdiscover.api.services.object.ObjectSummarySortField.Factory.getInstance());
            order = iprot.readEnum(org.dressdiscover.api.models.SortOrder.Factory.getInstance());
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(field, order);

        return new ObjectSummarySort(field, order);
    }

    public static ObjectSummarySort readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummarySort readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.services.object.ObjectSummarySortField field = null;
        @javax.annotation.Nullable org.dressdiscover.api.models.SortOrder order = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "field": {
                    field = iprot.readEnum(org.dressdiscover.api.services.object.ObjectSummarySortField.Factory.getInstance());
                    break;
                }
                case "order": {
                    order = iprot.readEnum(org.dressdiscover.api.models.SortOrder.Factory.getInstance());
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

        ReadValidator.validate(field, order);

        return new ObjectSummarySort(field, order);
    }

    public ObjectSummarySort replaceField(final org.dressdiscover.api.services.object.ObjectSummarySortField field) {
        UncheckedValidator.validateField(field);
        return new ObjectSummarySort(field, this.order);
    }

    public ObjectSummarySort replaceOrder(final org.dressdiscover.api.models.SortOrder order) {
        UncheckedValidator.validateOrder(order);
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
        oprot.writeStructBegin("org.dressdiscover.api.services.object.ObjectSummarySort");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeFieldField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.FIELD);
        oprot.writeEnum(getField());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeFieldField(oprot);

        writeOrderField(oprot);

        oprot.writeFieldStop();
    }

    public void writeOrderField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ORDER);
        oprot.writeEnum(getOrder());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.services.object.ObjectSummarySortField field;

    private final org.dressdiscover.api.models.SortOrder order;
}
