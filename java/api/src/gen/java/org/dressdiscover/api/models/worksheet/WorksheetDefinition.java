package org.dressdiscover.api.models.worksheet;

public final class WorksheetDefinition implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            rootFeatureSet = null;
        }

        public Builder(final WorksheetDefinition other) {
            this.rootFeatureSet = other.getRootFeatureSet();
        }

        protected WorksheetDefinition _build(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
            return new WorksheetDefinition(rootFeatureSet);
        }

        public WorksheetDefinition build() {
            UncheckedValidator.validate(rootFeatureSet);

            return _build(rootFeatureSet);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition getRootFeatureSet() {
            return rootFeatureSet;
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
                rootFeatureSet = org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot);
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
                    case "root_feature_set": {
                        rootFeatureSet = org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback);
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
            case ROOT_FEATURE_SET: setRootFeatureSet((org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final WorksheetDefinition other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setRootFeatureSet(other.getRootFeatureSet());

            return this;
        }

        public Builder setRootFeatureSet(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
            UncheckedValidator.validateRootFeatureSet(rootFeatureSet);
            this.rootFeatureSet = rootFeatureSet;
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
            case ROOT_FEATURE_SET: return unsetRootFeatureSet();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetRootFeatureSet() {
            this.rootFeatureSet = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetDefinition> {
        @Override
        public WorksheetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetDefinition.readAs(iprot, type);
        }

        @Override
        public WorksheetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetDefinition.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetDefinition.readAsList(iprot);
        }

        @Override
        public WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetDefinition.readAsStruct(iprot);
        }

        @Override
        public WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetDefinition.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ROOT_FEATURE_SET("rootFeatureSet", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>() {}, true, (short)0, "root_feature_set", org.thryft.protocol.Type.STRUCT);

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
            case "rootFeatureSet": return ROOT_FEATURE_SET;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "root_feature_set": return ROOT_FEATURE_SET;
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
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) throws org.thryft.protocol.InputProtocolException {
            validateRootFeatureSet(rootFeatureSet);
        }

        public static void validateRootFeatureSet(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) throws org.thryft.protocol.InputProtocolException {
            if (rootFeatureSet == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ROOT_FEATURE_SET, "org.dressdiscover.api.models.worksheet.WorksheetDefinition: rootFeatureSet is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
            validateRootFeatureSet(rootFeatureSet);
        }

        public static void validateRootFeatureSet(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
            if (rootFeatureSet == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetDefinition: rootFeatureSet is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetDefinition(final WorksheetDefinition other) {
        this(other.getRootFeatureSet());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetDefinition(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
        this.rootFeatureSet = rootFeatureSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetDefinition other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetDefinition> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static WorksheetDefinition create(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
        UncheckedValidator.validate(rootFeatureSet);
        return new WorksheetDefinition(rootFeatureSet);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetDefinition)) {
            return false;
        }

        final WorksheetDefinition other = (WorksheetDefinition)otherObject;

        if (!(getRootFeatureSet().equals(other.getRootFeatureSet()))) {
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
        case ROOT_FEATURE_SET: return getRootFeatureSet();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition getRootFeatureSet() {
        return rootFeatureSet;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRootFeatureSet().hashCode();
        return hashCode;
    }

    public static WorksheetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet;

        try {
            iprot.readListBegin();
            rootFeatureSet = org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot);
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(rootFeatureSet);

        return new WorksheetDefinition(rootFeatureSet);
    }

    public static WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "root_feature_set": {
                    rootFeatureSet = org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback);
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

        ReadValidator.validate(rootFeatureSet);

        return new WorksheetDefinition(rootFeatureSet);
    }

    public WorksheetDefinition replaceRootFeatureSet(final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet) {
        UncheckedValidator.validateRootFeatureSet(rootFeatureSet);
        return new WorksheetDefinition(rootFeatureSet);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("root_feature_set", getRootFeatureSet()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        getRootFeatureSet().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetDefinition");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeRootFeatureSetField(oprot);

        oprot.writeFieldStop();
    }

    public void writeRootFeatureSetField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ROOT_FEATURE_SET);
        getRootFeatureSet().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition rootFeatureSet;
}
