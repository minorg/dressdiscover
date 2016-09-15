package org.dressdiscover.api.services.object;

public final class GetObjectSummariesResult implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            hits = null;
            totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
            facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();
        }

        public Builder(final GetObjectSummariesResult other) {
            this.hits = other.getHits();
            this.totalHits = other.getTotalHits();
            this.facets = other.getFacets();
        }

        protected GetObjectSummariesResult _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            return new GetObjectSummariesResult(hits, totalHits, facets, DefaultConstructionValidator.getInstance());
        }

        public GetObjectSummariesResult build() {
            return _build(hits, totalHits, facets);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> getFacets() {
            return facets;
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> getHits() {
            return hits;
        }

        public final com.google.common.primitives.UnsignedInteger getTotalHits() {
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
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
            totalHits = iprot.readU32();
            if (__list.getSize() > 2) {
                facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "hits": {
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
                    break;
                }
                case "total_hits": {
                    totalHits = iprot.readU32();
                    break;
                }
                case "facets": {
                    facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
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
            case TOTAL_HITS: setTotalHits((com.google.common.primitives.UnsignedInteger)value); return this;
            case FACETS: setFacets((org.dressdiscover.api.models.object.ObjectFacets)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            this.facets = DefaultConstructionValidator.getInstance().validateFacets(facets);
            return this;
        }

        public Builder setFacets(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectFacets facets) {
            return setFacets(com.google.common.base.Optional.fromNullable(facets));
        }

        public Builder setHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
            this.hits = DefaultConstructionValidator.getInstance().validateHits(hits);
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

        public Builder setTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
            this.totalHits = DefaultConstructionValidator.getInstance().validateTotalHits(totalHits);
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
            this.totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits;
        private com.google.common.primitives.UnsignedInteger totalHits;
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
        HITS("hits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry>>() {}, true, 0, "hits", org.thryft.protocol.Type.LIST),
        TOTAL_HITS("totalHits", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "total_hits", org.thryft.protocol.Type.I32),
        FACETS("facets", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectFacets>() {}, false, 0, "facets", org.thryft.protocol.Type.STRUCT);

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

    public interface Validator<ExceptionT extends Exception> {
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) throws ExceptionT;

        public com.google.common.primitives.UnsignedInteger validateTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) throws RuntimeException {
            if (hits == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResult: hits is null");
            }
            return hits;
        }

        @Override
        public com.google.common.primitives.UnsignedInteger validateTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) throws RuntimeException {
            if (totalHits == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResult: totalHits is null");
            }
            return totalHits;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) throws RuntimeException {
            if (facets == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResult: facets is null");
            }
            if (!facets.isPresent()) {
                return facets;
            }
            return facets;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
            return hits;
        }

        @Override
        public com.google.common.primitives.UnsignedInteger validateTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
            return totalHits;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            return facets;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) throws org.thryft.protocol.InputProtocolException {
            if (hits == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HITS, "org.dressdiscover.api.services.object.GetObjectSummariesResult: hits is null");
            }
            return hits;
        }

        @Override
        public com.google.common.primitives.UnsignedInteger validateTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) throws org.thryft.protocol.InputProtocolException {
            if (totalHits == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TOTAL_HITS, "org.dressdiscover.api.services.object.GetObjectSummariesResult: totalHits is null");
            }
            return totalHits;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) throws org.thryft.protocol.InputProtocolException {
            if (facets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FACETS, "org.dressdiscover.api.services.object.GetObjectSummariesResult: facets is null");
            }
            if (!facets.isPresent()) {
                return facets;
            }
            return facets;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> validateHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
            return hits;
        }

        @Override
        public com.google.common.primitives.UnsignedInteger validateTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
            return totalHits;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> validateFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
            return facets;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public GetObjectSummariesResult(final GetObjectSummariesResult other) {
        this(other.getHits(), other.getTotalHits(), other.getFacets(), NopConstructionValidator.getInstance());
    }

    protected GetObjectSummariesResult(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets, ConstructionValidator validator) {
        this.hits = validator.validateHits(hits);
        this.totalHits = validator.validateTotalHits(totalHits);
        this.facets = validator.validateFacets(facets);
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
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits) {
        return new GetObjectSummariesResult(hits, totalHits, com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectFacets facets) {
        return new GetObjectSummariesResult(hits, totalHits, com.google.common.base.Optional.fromNullable(facets), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static GetObjectSummariesResult create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        return new GetObjectSummariesResult(hits, totalHits, facets, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof GetObjectSummariesResult)) {
            return false;
        }

        final GetObjectSummariesResult other = (GetObjectSummariesResult)otherObject;
        return
            getHits().equals(other.getHits()) &&
            getTotalHits().equals(other.getTotalHits()) &&
            ((getFacets().isPresent() && other.getFacets().isPresent()) ? (getFacets().get().equals(other.getFacets().get())) : (!getFacets().isPresent() && !other.getFacets().isPresent()));
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

    public final com.google.common.primitives.UnsignedInteger getTotalHits() {
        return totalHits;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getHits().hashCode();
        hashCode = 31 * hashCode + getTotalHits().hashCode();
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
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
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
        totalHits = iprot.readU32();
        if (__list.getSize() > 2) {
            facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
        }
        iprot.readListEnd();
        return new GetObjectSummariesResult(DefaultReadValidator.getInstance().validateHits(hits), DefaultReadValidator.getInstance().validateTotalHits(totalHits), DefaultReadValidator.getInstance().validateFacets(facets), NopConstructionValidator.getInstance());
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacets> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "hits": {
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
                break;
            }
            case "total_hits": {
                totalHits = iprot.readU32();
                break;
            }
            case "facets": {
                facets = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacets.readAsStruct(iprot));
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
        return new GetObjectSummariesResult(DefaultReadValidator.getInstance().validateHits(hits), DefaultReadValidator.getInstance().validateTotalHits(totalHits), DefaultReadValidator.getInstance().validateFacets(facets), NopConstructionValidator.getInstance());
    }

    public GetObjectSummariesResult replaceFacets(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets) {
        return new GetObjectSummariesResult(this.hits, this.totalHits, DefaultConstructionValidator.getInstance().validateFacets(facets), NopConstructionValidator.getInstance());
    }

    public GetObjectSummariesResult replaceFacets(final org.dressdiscover.api.models.object.ObjectFacets facets) {
        return replaceFacets(com.google.common.base.Optional.fromNullable(facets));
    }

    public GetObjectSummariesResult replaceHits(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits) {
        return new GetObjectSummariesResult(DefaultConstructionValidator.getInstance().validateHits(hits), this.totalHits, this.facets, NopConstructionValidator.getInstance());
    }

    public GetObjectSummariesResult replaceTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
        return new GetObjectSummariesResult(this.hits, DefaultConstructionValidator.getInstance().validateTotalHits(totalHits), this.facets, NopConstructionValidator.getInstance());
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

        oprot.writeU32(getTotalHits());

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

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("hits", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getHits().size());
        for (final org.dressdiscover.api.models.object.ObjectSummaryEntry _iter0 : getHits()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("total_hits", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getTotalHits());
        oprot.writeFieldEnd();

        if (getFacets().isPresent()) {
            oprot.writeFieldBegin("facets", org.thryft.protocol.Type.STRUCT, (short)0);
            getFacets().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectSummaryEntry> hits;

    private final com.google.common.primitives.UnsignedInteger totalHits;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacets> facets;
}
