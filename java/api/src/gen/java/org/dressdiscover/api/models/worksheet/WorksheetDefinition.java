package org.dressdiscover.api.models.worksheet;

public final class WorksheetDefinition implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            featureSets = null;
        }

        public Builder(final WorksheetDefinition other) {
            this.featureSets = other.getFeatureSets();
        }

        protected WorksheetDefinition _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
            return new WorksheetDefinition(featureSets);
        }

        public WorksheetDefinition build() {
            UncheckedValidator.validate(featureSets);

            return _build(featureSets);
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> getFeatureSets() {
            return featureSets;
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
                    featureSets = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_SETS, e.getCause());
                }
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
                    case "feature_sets": {
                        try {
                            featureSets = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_SETS, e.getCause());
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case FEATURE_SETS: setFeatureSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFeatureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
            UncheckedValidator.validateFeatureSets(featureSets);
            this.featureSets = featureSets;
            return this;
        }

        public Builder setIfPresent(final WorksheetDefinition other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setFeatureSets(other.getFeatureSets());

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
            case FEATURE_SETS: return unsetFeatureSets();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFeatureSets() {
            this.featureSets = null;
            return this;
        }

        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets;
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
        FEATURE_SETS("featureSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {}, true, (short)0, "feature_sets", org.thryft.protocol.Type.LIST);

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
            case "featureSets": return FEATURE_SETS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "feature_sets": return FEATURE_SETS;
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
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) throws org.thryft.protocol.InputProtocolException {
            validateFeatureSets(featureSets);
        }

        public static void validateFeatureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) throws org.thryft.protocol.InputProtocolException {
            if (featureSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FEATURE_SETS, "org.dressdiscover.api.models.worksheet.WorksheetDefinition: featureSets is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
            validateFeatureSets(featureSets);
        }

        public static void validateFeatureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
            if (featureSets == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetDefinition: featureSets is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetDefinition(final WorksheetDefinition other) {
        this(other.getFeatureSets());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetDefinition(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
        this.featureSets = featureSets;
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
    public static WorksheetDefinition create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
        UncheckedValidator.validate(featureSets);
        return new WorksheetDefinition(featureSets);
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

        if (!(getFeatureSets().equals(other.getFeatureSets()))) {
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
        case FEATURE_SETS: return getFeatureSets();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> getFeatureSets() {
        return featureSets;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getFeatureSets().hashCode();
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
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets;

        try {
            iprot.readListBegin();
            try {
                featureSets = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_SETS, e.getCause());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(featureSets);

        return new WorksheetDefinition(featureSets);
    }

    public static WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "feature_sets": {
                    try {
                        featureSets = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_SETS, e.getCause());
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(featureSets);

        return new WorksheetDefinition(featureSets);
    }

    public WorksheetDefinition replaceFeatureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets) {
        UncheckedValidator.validateFeatureSets(featureSets);
        return new WorksheetDefinition(featureSets);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("feature_sets", getFeatureSets()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getFeatureSets().size());
        for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition _iter0 : getFeatureSets()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetDefinition");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeFeatureSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.FEATURE_SETS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getFeatureSets().size());
        for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition _iter0 : getFeatureSets()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeFeatureSetsField(oprot);

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> featureSets;
}
