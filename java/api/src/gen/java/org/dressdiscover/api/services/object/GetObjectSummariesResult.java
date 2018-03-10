package org.dressdiscover.api.services.object;

public final class GetObjectSummariesResult implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            hits = null;
            totalHits = 0;
            facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();
        }

        public Builder(final GetObjectSummariesResult other) {
            this.hits = other.getHits();
            this.totalHits = other.getTotalHits();
            this.facets = other.getFacets();
        }

        protected GetObjectSummariesResult _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            return new GetObjectSummariesResult(hits, totalHits, facets);
        }

        public GetObjectSummariesResult build() {
            UncheckedValidator.validate(hits, totalHits, facets);

            return _build(hits, totalHits, facets);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> getFacets() {
            return facets;
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> getHits() {
            return hits;
        }

        public final int getTotalHits() {
            return totalHits;
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
                try {
                    hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HITS, e.getCause());
                }
                try {
                    totalHits = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TOTAL_HITS, e);
                }
                if (__list.getSize() > 2) {
                    facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
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
                    case "hits": {
                        try {
                            hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectSummaryEntry.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HITS, e.getCause());
                        }
                        break;
                    }
                    case "total_hits": {
                        try {
                            totalHits = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TOTAL_HITS, e);
                        }
                        break;
                    }
                    case "facets": {
                        facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot, unknownFieldCallback));
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
            case HITS: setHits((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>)value); return this;
            case TOTAL_HITS: setTotalHits((int)value); return this;
            case FACETS: setFacets((org.dressdiscover.api.models.object.ObjectFacets)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            UncheckedValidator.validateFacets(facets);
            this.facets = facets;
            return this;
        }

        public Builder setFacets(final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectFacets facets) {
            return setFacets(com.google.common.base.Optional.fromNullable(facets));
        }

        public Builder setHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
            UncheckedValidator.validateHits(hits);
            this.hits = hits;
            return this;
        }

        public Builder setIfPresent(final GetObjectSummariesResult other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setHits(other.getHits());
            setTotalHits(other.getTotalHits());
            if (other.getFacets().isPresent()) {
                setFacets(other.getFacets());
            }

            return this;
        }

        public Builder setTotalHits(final int totalHits) {
            UncheckedValidator.validateTotalHits(totalHits);
            this.totalHits = totalHits;
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
            case HITS: return unsetHits();
            case TOTAL_HITS: return unsetTotalHits();
            case FACETS: return unsetFacets();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFacets() {
            this.facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();
            return this;
        }

        public Builder unsetHits() {
            this.hits = null;
            return this;
        }

        public Builder unsetTotalHits() {
            this.totalHits = 0;
            return this;
        }

        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits;
        private int totalHits;
        private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectSummariesResult> {
        @Override
        public GetObjectSummariesResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesResult.readAs(iprot, type);
        }

        @Override
        public GetObjectSummariesResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesResult.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public GetObjectSummariesResult readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesResult.readAsList(iprot);
        }

        @Override
        public GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesResult.readAsStruct(iprot);
        }

        @Override
        public GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return GetObjectSummariesResult.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        HITS("hits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {}, true, (short)0, "hits", org.thryft.protocol.Type.LIST),
        TOTAL_HITS("totalHits", new com.google.common.reflect.TypeToken<Integer>() {}, true, (short)0, "total_hits", org.thryft.protocol.Type.I32),
        FACETS("facets", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectFacets>() {}, false, (short)0, "facets", org.thryft.protocol.Type.STRUCT);

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
            case "hits": return HITS;
            case "totalHits": return TOTAL_HITS;
            case "facets": return FACETS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "hits": return HITS;
            case "total_hits": return TOTAL_HITS;
            case "facets": return FACETS;
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
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) throws org.thryft.protocol.InputProtocolException {
            validateHits(hits);
            validateTotalHits(totalHits);
            validateFacets(facets);
        }

        public static void validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) throws org.thryft.protocol.InputProtocolException {
            if (hits == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HITS, "org.dressdiscover.api.services.object.GetObjectSummariesResult: hits is null");
            }
        }

        public static void validateTotalHits(final int totalHits) {
        }

        public static void validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) throws org.thryft.protocol.InputProtocolException {
            if (facets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FACETS, "org.dressdiscover.api.services.object.GetObjectSummariesResult: facets is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            validateHits(hits);
            validateTotalHits(totalHits);
            validateFacets(facets);
        }

        public static void validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
            if (hits == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResult: hits is null");
            }
        }

        public static void validateTotalHits(final int totalHits) {
        }

        public static void validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            if (facets == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResult: facets is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public GetObjectSummariesResult(final GetObjectSummariesResult other) {
        this(other.getHits(), other.getTotalHits(), other.getFacets());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected GetObjectSummariesResult(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        this.hits = hits;
        this.totalHits = totalHits;
        this.facets = facets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GetObjectSummariesResult other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesResult> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits) {
        UncheckedValidator.validate(hits, totalHits, com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent());
        return new GetObjectSummariesResult(hits, totalHits, com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent());
    }

    /**
     * Total boxed factory method
     */
    public static GetObjectSummariesResult create(com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, Integer totalHits, com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        UncheckedValidator.validate(hits, totalHits, facets);
        return new GetObjectSummariesResult(hits, totalHits, facets);
    }

    /**
     * Total Nullable factory method
     */
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, @javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectFacets facets) {
        final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facetsOptional = com.google.common.base.Optional.fromNullable(facets);
        UncheckedValidator.validate(hits, totalHits, facetsOptional);
        return new GetObjectSummariesResult(hits, totalHits, facetsOptional);
    }

    /**
     * Optional factory method
     */
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final int totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        UncheckedValidator.validate(hits, totalHits, facets);
        return new GetObjectSummariesResult(hits, totalHits, facets);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof GetObjectSummariesResult)) {
            return false;
        }

        final GetObjectSummariesResult other = (GetObjectSummariesResult)otherObject;

        if (!(getHits().equals(other.getHits()))) {
            return false;
        }

        if (!(getTotalHits() == other.getTotalHits())) {
            return false;
        }

        if (!(((getFacets().isPresent() && other.getFacets().isPresent()) ? (getFacets().get().equals(other.getFacets().get())) : (!getFacets().isPresent() && !other.getFacets().isPresent())))) {
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
        case HITS: return getHits();
        case TOTAL_HITS: return getTotalHits();
        case FACETS: return getFacets();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> getFacets() {
        return facets;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> getHits() {
        return hits;
    }

    public final int getTotalHits() {
        return totalHits;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getHits().hashCode();
        hashCode = 31 * hashCode + getTotalHits();
        if (getFacets().isPresent()) {
            hashCode = 31 * hashCode + getFacets().get().hashCode();
        }
        return hashCode;
    }

    public static GetObjectSummariesResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectSummariesResult readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits;
        int totalHits;
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HITS, e.getCause());
            }
            try {
                totalHits = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TOTAL_HITS, e);
            }
            if (__list.getSize() > 2) {
                facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(hits, totalHits, facets);

        return new GetObjectSummariesResult(hits, totalHits, facets);
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits = null;
        int totalHits = 0;
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "hits": {
                    try {
                        hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectSummaryEntry.readAsStruct(iprot, unknownFieldCallback));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HITS, e.getCause());
                    }
                    break;
                }
                case "total_hits": {
                    try {
                        totalHits = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TOTAL_HITS, e);
                    }
                    break;
                }
                case "facets": {
                    facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(hits, totalHits, facets);

        return new GetObjectSummariesResult(hits, totalHits, facets);
    }

    public GetObjectSummariesResult replaceFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        UncheckedValidator.validateFacets(facets);
        return new GetObjectSummariesResult(this.hits, this.totalHits, facets);
    }

    public GetObjectSummariesResult replaceFacets(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectFacets facets) {
        return replaceFacets(com.google.common.base.Optional.fromNullable(facets));
    }

    public GetObjectSummariesResult replaceHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
        UncheckedValidator.validateHits(hits);
        return new GetObjectSummariesResult(hits, this.totalHits, this.facets);
    }

    public GetObjectSummariesResult replaceTotalHits(final int totalHits) {
        UncheckedValidator.validateTotalHits(totalHits);
        return new GetObjectSummariesResult(this.hits, totalHits, this.facets);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("hits", getHits()).add("total_hits", getTotalHits()).add("facets", getFacets().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getHits().size());
        for (final org.dressdiscover.api.models.object.ObjectSummaryEntry _iter0 : getHits()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        oprot.writeI32(getTotalHits());

        if (getFacets().isPresent()) {
            getFacets().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesResult");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeFacetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFacets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FACETS);
            getFacets().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeHitsField(oprot);

        writeTotalHitsField(oprot);

        writeFacetsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHitsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.HITS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getHits().size());
        for (final org.dressdiscover.api.models.object.ObjectSummaryEntry _iter0 : getHits()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    public void writeTotalHitsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TOTAL_HITS);
        oprot.writeI32(getTotalHits());
        oprot.writeFieldEnd();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits;

    private final int totalHits;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets;
}
