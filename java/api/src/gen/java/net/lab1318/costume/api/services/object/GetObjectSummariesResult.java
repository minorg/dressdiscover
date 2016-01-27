package net.lab1318.costume.api.services.object;

public class GetObjectSummariesResult implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            hits = null;
            totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
            facets = com.google.common.base.Optional.absent();
        }

        public Builder(final GetObjectSummariesResult other) {
            this.hits = other.getHits();
            this.totalHits = other.getTotalHits();
            this.facets = other.getFacets();
        }

        protected GetObjectSummariesResult _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets) {
            return new GetObjectSummariesResult(hits, totalHits, facets);
        }

        public GetObjectSummariesResult build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(hits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing hits"), com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing totalHits"), com.google.common.base.Preconditions.checkNotNull(facets, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing facets"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> getFacets() {
            return facets;
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getHits() {
            return hits;
        }

        public final com.google.common.primitives.UnsignedInteger getTotalHits() {
            return totalHits;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                facets = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot));
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
                    hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                    facets = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot));
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

        public Builder setFacets(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets) {
            this.facets = com.google.common.base.Preconditions.checkNotNull(facets);
            return this;
        }

        public Builder setFacets(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.ObjectFacets facets) {
            this.facets = com.google.common.base.Optional.fromNullable(facets);
            return this;
        }

        public Builder setHits(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits) {
            this.hits = com.google.common.base.Preconditions.checkNotNull(hits);
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
            this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "hits": setHits((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>)value); return this;
            case "total_hits": setTotalHits((com.google.common.primitives.UnsignedInteger)value); return this;
            case "facets": setFacets((net.lab1318.costume.api.services.object.ObjectFacets)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFacets() {
            this.facets = com.google.common.base.Optional.absent();
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

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "hits": return unsetHits();
            case "total_hits": return unsetTotalHits();
            case "facets": return unsetFacets();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits;
        private com.google.common.primitives.UnsignedInteger totalHits;
        private com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        HITS("hits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {}, true, 0, "hits", org.thryft.protocol.Type.LIST),
        TOTAL_HITS("totalHits", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "total_hits", org.thryft.protocol.Type.I32),
        FACETS("facets", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.ObjectFacets>() {}, false, 0, "facets", org.thryft.protocol.Type.STRUCT);

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

    /**
     * Copy constructor
     */
    public GetObjectSummariesResult(final GetObjectSummariesResult other) {
        this(other.getHits(), other.getTotalHits(), other.getFacets());
    }

    /**
     * Required constructor
     */
    public GetObjectSummariesResult(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits) {
        this.hits = com.google.common.base.Preconditions.checkNotNull(hits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing hits");
        this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing totalHits");
        this.facets = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public GetObjectSummariesResult(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final @javax.annotation.Nullable net.lab1318.costume.api.services.object.ObjectFacets facets) {
        this.hits = com.google.common.base.Preconditions.checkNotNull(hits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing hits");
        this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing totalHits");
        this.facets = com.google.common.base.Optional.fromNullable(facets);
    }

    /**
     * Optional constructor
     */
    public GetObjectSummariesResult(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits, final com.google.common.primitives.UnsignedInteger totalHits, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets) {
        this.hits = com.google.common.base.Preconditions.checkNotNull(hits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing hits");
        this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing totalHits");
        this.facets = com.google.common.base.Preconditions.checkNotNull(facets, "net.lab1318.costume.api.services.object.GetObjectSummariesResult: missing facets");
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
            getFacets().equals(other.getFacets());
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> getFacets() {
        return facets;
    }

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> getHits() {
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static GetObjectSummariesResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectSummariesResult readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
            facets = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new GetObjectSummariesResult(hits, totalHits, facets);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesResult readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "hits": {
                hits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectSummaryEntry> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectSummaryEntry.readAsStruct(iprot));
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
                facets = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.ObjectFacets.readAsStruct(iprot));
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
        try {
            return new GetObjectSummariesResult(hits, totalHits, facets);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public GetObjectSummariesResult replaceFacets(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets) {
        return new GetObjectSummariesResult(this.hits, this.totalHits, facets);
    }

    public GetObjectSummariesResult replaceFacets(final net.lab1318.costume.api.services.object.ObjectFacets facets) {
        return replaceFacets(com.google.common.base.Optional.fromNullable(facets));
    }

    public GetObjectSummariesResult replaceHits(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits) {
        return new GetObjectSummariesResult(hits, this.totalHits, this.facets);
    }

    public GetObjectSummariesResult replaceTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
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
        for (final net.lab1318.costume.api.models.object.ObjectSummaryEntry _iter0 : getHits()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesResult");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("hits", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getHits().size());
        for (final net.lab1318.costume.api.models.object.ObjectSummaryEntry _iter0 : getHits()) {
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

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectSummaryEntry> hits;

    private final com.google.common.primitives.UnsignedInteger totalHits;

    private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectFacets> facets;
}
