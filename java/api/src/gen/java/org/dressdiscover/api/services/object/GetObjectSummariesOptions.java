package org.dressdiscover.api.services.object;

public final class GetObjectSummariesOptions implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            from_ = com.google.common.base.Optional.<Integer> absent();
            includeFacets = com.google.common.base.Optional.<Boolean> absent();
            size = com.google.common.base.Optional.<Integer> absent();
            sorts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> absent();
        }

        public Builder(final GetObjectSummariesOptions other) {
            this.from_ = other.getFrom_();
            this.includeFacets = other.getIncludeFacets();
            this.size = other.getSize();
            this.sorts = other.getSorts();
        }

        protected GetObjectSummariesOptions _build(final com.google.common.base.Optional<Integer> from_, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<Integer> size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
            return new GetObjectSummariesOptions(from_, includeFacets, size, sorts);
        }

        public GetObjectSummariesOptions build() {
            UncheckedValidator.validate(from_, includeFacets, size, sorts);

            return _build(from_, includeFacets, size, sorts);
        }

        public final com.google.common.base.Optional<Integer> getFrom_() {
            return from_;
        }

        public final com.google.common.base.Optional<Boolean> getIncludeFacets() {
            return includeFacets;
        }

        public final com.google.common.base.Optional<Integer> getSize() {
            return size;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> getSorts() {
            return sorts;
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
                        from_ = org.thryft.Optionals.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 1) {
                    includeFacets = org.thryft.Optionals.of(iprot.readBool());
                }
                if (__list.getSize() > 2) {
                    try {
                        size = org.thryft.Optionals.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SORTS, e.getCause());
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
                    case "from_": {
                        try {
                            from_ = org.thryft.Optionals.of(iprot.readI32());
                        } catch (final NumberFormatException e) {
                        }
                        break;
                    }
                    case "include_facets": {
                        includeFacets = org.thryft.Optionals.of(iprot.readBool());
                        break;
                    }
                    case "size": {
                        try {
                            size = org.thryft.Optionals.of(iprot.readI32());
                        } catch (final NumberFormatException e) {
                        }
                        break;
                    }
                    case "sorts": {
                        try {
                            sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.services.object.ObjectSummarySort.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SORTS, e.getCause());
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
            case FROM_: setFrom_((Integer)value); return this;
            case INCLUDE_FACETS: setIncludeFacets((Boolean)value); return this;
            case SIZE: setSize((Integer)value); return this;
            case SORTS: setSorts((com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFrom_(final com.google.common.base.Optional<Integer> from_) {
            UncheckedValidator.validateFrom_(from_);
            this.from_ = from_;
            return this;
        }

        public Builder setFrom_(final @javax.annotation.Nullable Integer from_) {
            return setFrom_(org.thryft.Optionals.fromNullable(from_));
        }

        public Builder setFrom_(final int from_) {
            return setFrom_(org.thryft.Optionals.of(from_));
        }

        public Builder setIfPresent(final GetObjectSummariesOptions other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getFrom_().isPresent()) {
                setFrom_(other.getFrom_());
            }
            if (other.getIncludeFacets().isPresent()) {
                setIncludeFacets(other.getIncludeFacets());
            }
            if (other.getSize().isPresent()) {
                setSize(other.getSize());
            }
            if (other.getSorts().isPresent()) {
                setSorts(other.getSorts());
            }

            return this;
        }

        public Builder setIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) {
            UncheckedValidator.validateIncludeFacets(includeFacets);
            this.includeFacets = includeFacets;
            return this;
        }

        public Builder setIncludeFacets(final @javax.annotation.Nullable Boolean includeFacets) {
            return setIncludeFacets(org.thryft.Optionals.fromNullable(includeFacets));
        }

        public Builder setIncludeFacets(final boolean includeFacets) {
            return setIncludeFacets(org.thryft.Optionals.of(includeFacets));
        }

        public Builder setSize(final com.google.common.base.Optional<Integer> size) {
            UncheckedValidator.validateSize(size);
            this.size = size;
            return this;
        }

        public Builder setSize(final @javax.annotation.Nullable Integer size) {
            return setSize(org.thryft.Optionals.fromNullable(size));
        }

        public Builder setSize(final int size) {
            return setSize(org.thryft.Optionals.of(size));
        }

        public Builder setSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
            UncheckedValidator.validateSorts(sorts);
            this.sorts = sorts;
            return this;
        }

        public Builder setSorts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> sorts) {
            return setSorts(com.google.common.base.Optional.fromNullable(sorts));
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
            case FROM_: return unsetFrom_();
            case INCLUDE_FACETS: return unsetIncludeFacets();
            case SIZE: return unsetSize();
            case SORTS: return unsetSorts();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFrom_() {
            this.from_ = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        public Builder unsetIncludeFacets() {
            this.includeFacets = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetSize() {
            this.size = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        public Builder unsetSorts() {
            this.sorts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> absent();
            return this;
        }

        private com.google.common.base.Optional<Integer> from_;
        private com.google.common.base.Optional<Boolean> includeFacets;
        private com.google.common.base.Optional<Integer> size;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectSummariesOptions> {
        @Override
        public GetObjectSummariesOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesOptions.readAs(iprot, type);
        }

        @Override
        public GetObjectSummariesOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesOptions.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public GetObjectSummariesOptions readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesOptions.readAsList(iprot);
        }

        @Override
        public GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesOptions.readAsStruct(iprot);
        }

        @Override
        public GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesOptions.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FROM_("from_", new com.google.common.reflect.TypeToken<Integer>() {}, false, (short)0, "from_", org.thryft.protocol.Type.I32),
        INCLUDE_FACETS("includeFacets", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "include_facets", org.thryft.protocol.Type.BOOL),
        SIZE("size", new com.google.common.reflect.TypeToken<Integer>() {}, false, (short)0, "size", org.thryft.protocol.Type.I32),
        SORTS("sorts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>>() {}, false, (short)0, "sorts", org.thryft.protocol.Type.LIST);

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
            case "from_": return FROM_;
            case "includeFacets": return INCLUDE_FACETS;
            case "size": return SIZE;
            case "sorts": return SORTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "from_": return FROM_;
            case "include_facets": return INCLUDE_FACETS;
            case "size": return SIZE;
            case "sorts": return SORTS;
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
        public static void validate(final com.google.common.base.Optional<Integer> from_, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<Integer> size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) throws org.thryft.protocol.InputProtocolException {
            validateFrom_(from_);
            validateIncludeFacets(includeFacets);
            validateSize(size);
            validateSorts(sorts);
        }

        public static void validateFrom_(final com.google.common.base.Optional<Integer> from_) throws org.thryft.protocol.InputProtocolException {
            if (from_ == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FROM_, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: from_ is null");
            }
        }

        public static void validateIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) throws org.thryft.protocol.InputProtocolException {
            if (includeFacets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_FACETS, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: includeFacets is null");
            }
            if (includeFacets.isPresent()) {
                if (!includeFacets.get()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_FACETS, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: includeFacets: not true");
                }
            }
        }

        public static void validateSize(final com.google.common.base.Optional<Integer> size) throws org.thryft.protocol.InputProtocolException {
            if (size == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SIZE, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: size is null");
            }
        }

        public static void validateSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) throws org.thryft.protocol.InputProtocolException {
            if (sorts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SORTS, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: sorts is null");
            }
            if (sorts.isPresent()) {
                if (sorts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SORTS, "org.dressdiscover.api.services.object.GetObjectSummariesOptions: sorts: less than min length 1");
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<Integer> from_, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<Integer> size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
            validateFrom_(from_);
            validateIncludeFacets(includeFacets);
            validateSize(size);
            validateSorts(sorts);
        }

        public static void validateFrom_(final com.google.common.base.Optional<Integer> from_) {
            if (from_ == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: from_ is null");
            }
        }

        public static void validateIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) {
            if (includeFacets == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: includeFacets is null");
            }
            if (includeFacets.isPresent()) {
                if (!includeFacets.get()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: includeFacets: not true");
                }
            }
        }

        public static void validateSize(final com.google.common.base.Optional<Integer> size) {
            if (size == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: size is null");
            }
        }

        public static void validateSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
            if (sorts == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: sorts is null");
            }
            if (sorts.isPresent()) {
                if (sorts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.services.object.GetObjectSummariesOptions: sorts: less than min length 1");
                }
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public GetObjectSummariesOptions() {
        from_ = com.google.common.base.Optional.<Integer> absent();
        includeFacets = com.google.common.base.Optional.<Boolean> absent();
        size = com.google.common.base.Optional.<Integer> absent();
        sorts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> absent();
    }

    /**
     * Copy constructor
     */
    public GetObjectSummariesOptions(final GetObjectSummariesOptions other) {
        this(other.getFrom_(), other.getIncludeFacets(), other.getSize(), other.getSorts());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected GetObjectSummariesOptions(final com.google.common.base.Optional<Integer> from_, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<Integer> size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
        this.from_ = from_;
        this.includeFacets = includeFacets;
        this.size = size;
        this.sorts = sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GetObjectSummariesOptions other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesOptions> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static GetObjectSummariesOptions create() {
        return new GetObjectSummariesOptions();
    }

    /**
     * Total Nullable factory method
     */
    public static GetObjectSummariesOptions create(@javax.annotation.Nullable final Integer from_, @javax.annotation.Nullable final Boolean includeFacets, @javax.annotation.Nullable final Integer size, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> sorts) {
        final com.google.common.base.Optional<Integer> from_Optional = org.thryft.Optionals.fromNullable(from_);
        final com.google.common.base.Optional<Boolean> includeFacetsOptional = org.thryft.Optionals.fromNullable(includeFacets);
        final com.google.common.base.Optional<Integer> sizeOptional = org.thryft.Optionals.fromNullable(size);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sortsOptional = com.google.common.base.Optional.fromNullable(sorts);
        UncheckedValidator.validate(from_Optional, includeFacetsOptional, sizeOptional, sortsOptional);
        return new GetObjectSummariesOptions(from_Optional, includeFacetsOptional, sizeOptional, sortsOptional);
    }

    /**
     * Optional factory method
     */
    public static GetObjectSummariesOptions create(final com.google.common.base.Optional<Integer> from_, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<Integer> size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
        UncheckedValidator.validate(from_, includeFacets, size, sorts);
        return new GetObjectSummariesOptions(from_, includeFacets, size, sorts);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof GetObjectSummariesOptions)) {
            return false;
        }

        final GetObjectSummariesOptions other = (GetObjectSummariesOptions)otherObject;

        if (!(((getFrom_().isPresent() && other.getFrom_().isPresent()) ? (getFrom_().get().intValue() == other.getFrom_().get().intValue()) : (!getFrom_().isPresent() && !other.getFrom_().isPresent())))) {
            return false;
        }

        if (!(((getIncludeFacets().isPresent() && other.getIncludeFacets().isPresent()) ? (getIncludeFacets().get().booleanValue() == other.getIncludeFacets().get().booleanValue()) : (!getIncludeFacets().isPresent() && !other.getIncludeFacets().isPresent())))) {
            return false;
        }

        if (!(((getSize().isPresent() && other.getSize().isPresent()) ? (getSize().get().intValue() == other.getSize().get().intValue()) : (!getSize().isPresent() && !other.getSize().isPresent())))) {
            return false;
        }

        if (!(((getSorts().isPresent() && other.getSorts().isPresent()) ? (getSorts().get().equals(other.getSorts().get())) : (!getSorts().isPresent() && !other.getSorts().isPresent())))) {
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
        case FROM_: return getFrom_();
        case INCLUDE_FACETS: return getIncludeFacets();
        case SIZE: return getSize();
        case SORTS: return getSorts();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<Integer> getFrom_() {
        return from_;
    }

    public final com.google.common.base.Optional<Boolean> getIncludeFacets() {
        return includeFacets;
    }

    public final com.google.common.base.Optional<Integer> getSize() {
        return size;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> getSorts() {
        return sorts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFrom_().isPresent()) {
            hashCode = 31 * hashCode + getFrom_().get().hashCode();
        }
        if (getIncludeFacets().isPresent()) {
            hashCode = 31 * hashCode + (getIncludeFacets().get() ? 1 : 0);
        }
        if (getSize().isPresent()) {
            hashCode = 31 * hashCode + getSize().get().hashCode();
        }
        if (getSorts().isPresent()) {
            hashCode = 31 * hashCode + getSorts().get().hashCode();
        }
        return hashCode;
    }

    public static GetObjectSummariesOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectSummariesOptions readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<Integer> from_ = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<Boolean> includeFacets = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Integer> size = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    from_ = org.thryft.Optionals.of(iprot.readI32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 1) {
                includeFacets = org.thryft.Optionals.of(iprot.readBool());
            }
            if (__list.getSize() > 2) {
                try {
                    size = org.thryft.Optionals.of(iprot.readI32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 3) {
                try {
                    sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SORTS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(from_, includeFacets, size, sorts);

        return new GetObjectSummariesOptions(from_, includeFacets, size, sorts);
    }

    public static GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<Integer> from_ = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<Boolean> includeFacets = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Integer> size = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "from_": {
                    try {
                        from_ = org.thryft.Optionals.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                    break;
                }
                case "include_facets": {
                    includeFacets = org.thryft.Optionals.of(iprot.readBool());
                    break;
                }
                case "size": {
                    try {
                        size = org.thryft.Optionals.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                    break;
                }
                case "sorts": {
                    try {
                        sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.services.object.ObjectSummarySort.readAsStruct(iprot, unknownFieldCallback));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SORTS, e.getCause());
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

        ReadValidator.validate(from_, includeFacets, size, sorts);

        return new GetObjectSummariesOptions(from_, includeFacets, size, sorts);
    }

    public GetObjectSummariesOptions replaceFrom_(final com.google.common.base.Optional<Integer> from_) {
        UncheckedValidator.validateFrom_(from_);
        return new GetObjectSummariesOptions(from_, this.includeFacets, this.size, this.sorts);
    }

    public GetObjectSummariesOptions replaceFrom_(@javax.annotation.Nullable final Integer from_) {
        return replaceFrom_(org.thryft.Optionals.fromNullable(from_));
    }

    public GetObjectSummariesOptions replaceFrom_(final int from_) {
        return replaceFrom_(org.thryft.Optionals.of(from_));
    }

    public GetObjectSummariesOptions replaceIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) {
        UncheckedValidator.validateIncludeFacets(includeFacets);
        return new GetObjectSummariesOptions(this.from_, includeFacets, this.size, this.sorts);
    }

    public GetObjectSummariesOptions replaceIncludeFacets(@javax.annotation.Nullable final Boolean includeFacets) {
        return replaceIncludeFacets(org.thryft.Optionals.fromNullable(includeFacets));
    }

    public GetObjectSummariesOptions replaceIncludeFacets(final boolean includeFacets) {
        return replaceIncludeFacets(org.thryft.Optionals.of(includeFacets));
    }

    public GetObjectSummariesOptions replaceSize(final com.google.common.base.Optional<Integer> size) {
        UncheckedValidator.validateSize(size);
        return new GetObjectSummariesOptions(this.from_, this.includeFacets, size, this.sorts);
    }

    public GetObjectSummariesOptions replaceSize(@javax.annotation.Nullable final Integer size) {
        return replaceSize(org.thryft.Optionals.fromNullable(size));
    }

    public GetObjectSummariesOptions replaceSize(final int size) {
        return replaceSize(org.thryft.Optionals.of(size));
    }

    public GetObjectSummariesOptions replaceSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts) {
        UncheckedValidator.validateSorts(sorts);
        return new GetObjectSummariesOptions(this.from_, this.includeFacets, this.size, sorts);
    }

    public GetObjectSummariesOptions replaceSorts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort> sorts) {
        return replaceSorts(com.google.common.base.Optional.fromNullable(sorts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("from_", getFrom_().orNull()).add("include_facets", getIncludeFacets().orNull()).add("size", getSize().orNull()).add("sorts", getSorts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        if (getFrom_().isPresent()) {
            oprot.writeI32(getFrom_().get());
        } else {
            oprot.writeNull();
        }

        if (getIncludeFacets().isPresent()) {
            oprot.writeBool(getIncludeFacets().get());
        } else {
            oprot.writeNull();
        }

        if (getSize().isPresent()) {
            oprot.writeI32(getSize().get());
        } else {
            oprot.writeNull();
        }

        if (getSorts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final org.dressdiscover.api.services.object.ObjectSummarySort _iter0 : getSorts().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesOptions");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeFrom_Field(oprot);

        writeIncludeFacetsField(oprot);

        writeSizeField(oprot);

        writeSortsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeFrom_Field(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFrom_().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FROM_);
            oprot.writeI32(getFrom_().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeFacetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeFacets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_FACETS);
            oprot.writeBool(getIncludeFacets().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeSizeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSize().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SIZE);
            oprot.writeI32(getSize().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeSortsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSorts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SORTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final org.dressdiscover.api.services.object.ObjectSummarySort _iter0 : getSorts().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public final static GetObjectSummariesOptions EMPTY = new GetObjectSummariesOptions();

    private final com.google.common.base.Optional<Integer> from_;

    private final com.google.common.base.Optional<Boolean> includeFacets;

    private final com.google.common.base.Optional<Integer> size;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.services.object.ObjectSummarySort>> sorts;
}
