package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureSetState implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            features = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> absent();
        }

        public Builder(final WorksheetFeatureSetState other) {
            this.features = other.getFeatures();
        }

        protected WorksheetFeatureSetState _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
            return new WorksheetFeatureSetState(features);
        }

        public WorksheetFeatureSetState build() {
            UncheckedValidator.validate(features);

            return _build(features);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> getFeatures() {
            return features;
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final org.dressdiscover.api.models.worksheet.WorksheetFeatureState value;
                                        value = org.dressdiscover.api.models.worksheet.WorksheetFeatureState.readAsStruct(iprot);
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
                    }
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
                    case "features": {
                        try {
                            features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final org.dressdiscover.api.models.worksheet.WorksheetFeatureState value;
                                            value = org.dressdiscover.api.models.worksheet.WorksheetFeatureState.readAsStruct(iprot, unknownFieldCallback);
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
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
            case FEATURES: setFeatures((com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
            UncheckedValidator.validateFeatures(features);
            this.features = features;
            return this;
        }

        public Builder setFeatures(final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> features) {
            return setFeatures(com.google.common.base.Optional.fromNullable(features));
        }

        public Builder setIfPresent(final WorksheetFeatureSetState other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getFeatures().isPresent()) {
                setFeatures(other.getFeatures());
            }

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
            case FEATURES: return unsetFeatures();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFeatures() {
            this.features = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureSetState> {
        @Override
        public WorksheetFeatureSetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetState.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureSetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetState.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureSetState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetState.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureSetState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetState.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureSetState readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetState.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FEATURES("features", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>>() {}, false, (short)0, "features", org.thryft.protocol.Type.MAP);

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
            case "features": return FEATURES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "features": return FEATURES;
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
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) throws org.thryft.protocol.InputProtocolException {
            validateFeatures(features);
        }

        public static void validateFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) throws org.thryft.protocol.InputProtocolException {
            if (features == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FEATURES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState: features is null");
            }
            if (!features.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
            validateFeatures(features);
        }

        public static void validateFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
            if (features == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState: features is null");
            }
            if (!features.isPresent()) {
                return;
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public WorksheetFeatureSetState() {
        features = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> absent();
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureSetState(final WorksheetFeatureSetState other) {
        this(other.getFeatures());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureSetState(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
        this.features = features;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureSetState other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureSetState> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static WorksheetFeatureSetState create() {
        return new WorksheetFeatureSetState();
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureSetState create(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> features) {
        final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> featuresOptional = com.google.common.base.Optional.fromNullable(features);
        UncheckedValidator.validate(featuresOptional);
        return new WorksheetFeatureSetState(featuresOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureSetState create(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
        UncheckedValidator.validate(features);
        return new WorksheetFeatureSetState(features);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureSetState)) {
            return false;
        }

        final WorksheetFeatureSetState other = (WorksheetFeatureSetState)otherObject;

        if (!(((getFeatures().isPresent() && other.getFeatures().isPresent()) ? (getFeatures().get().equals(other.getFeatures().get())) : (!getFeatures().isPresent() && !other.getFeatures().isPresent())))) {
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
        case FEATURES: return getFeatures();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> getFeatures() {
        return features;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFeatures().isPresent()) {
            hashCode = 31 * hashCode + getFeatures().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetFeatureSetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureSetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureSetState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final org.dressdiscover.api.models.worksheet.WorksheetFeatureState value;
                                    value = org.dressdiscover.api.models.worksheet.WorksheetFeatureState.readAsStruct(iprot);
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(features);

        return new WorksheetFeatureSetState(features);
    }

    public static WorksheetFeatureSetState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureSetState readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "features": {
                    try {
                        features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final org.dressdiscover.api.models.worksheet.WorksheetFeatureState value;
                                        value = org.dressdiscover.api.models.worksheet.WorksheetFeatureState.readAsStruct(iprot, unknownFieldCallback);
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
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

        ReadValidator.validate(features);

        return new WorksheetFeatureSetState(features);
    }

    public WorksheetFeatureSetState replaceFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features) {
        UncheckedValidator.validateFeatures(features);
        return new WorksheetFeatureSetState(features);
    }

    public WorksheetFeatureSetState replaceFeatures(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> features) {
        return replaceFeatures(com.google.common.base.Optional.fromNullable(features));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("features", getFeatures().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        if (getFeatures().isPresent()) {
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRUCT, getFeatures().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> _iter0 : getFeatures().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                _iter0.getValue().writeAsStruct(oprot);
            }
            oprot.writeMapEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeFeaturesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFeatures().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FEATURES);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRUCT, getFeatures().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState> _iter0 : getFeatures().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                _iter0.getValue().writeAsStruct(oprot);
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeFeaturesField(oprot);

        oprot.writeFieldStop();
    }

    public final static WorksheetFeatureSetState EMPTY = new WorksheetFeatureSetState();

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, org.dressdiscover.api.models.worksheet.WorksheetFeatureState>> features;
}
