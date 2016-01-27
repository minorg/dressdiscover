package net.lab1318.costume.api.services.object;

public class GetObjectSummariesOptions implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            from = com.google.common.base.Optional.absent();
            size = com.google.common.base.Optional.absent();
            includeFacets = com.google.common.base.Optional.absent();
            sorts = com.google.common.base.Optional.absent();
        }

        public Builder(final GetObjectSummariesOptions other) {
            this.from = other.getFrom();
            this.size = other.getSize();
            this.includeFacets = other.getIncludeFacets();
            this.sorts = other.getSorts();
        }

        protected GetObjectSummariesOptions _build(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts) {
            return new GetObjectSummariesOptions(from, size, includeFacets, sorts);
        }

        public GetObjectSummariesOptions build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing size"), com.google.common.base.Preconditions.checkNotNull(includeFacets, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing includeFacets"), com.google.common.base.Preconditions.checkNotNull(sorts, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing sorts"));
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getFrom() {
            return from;
        }

        public final com.google.common.base.Optional<Boolean> getIncludeFacets() {
            return includeFacets;
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getSize() {
            return size;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> getSorts() {
            return sorts;
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
            if (__list.getSize() > 0) {
                try {
                    from = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 1) {
                try {
                    size = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 2) {
                includeFacets = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 3) {
                try {
                    sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
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
                case "from_": {
                    try {
                        from = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                    break;
                }
                case "size": {
                    try {
                        size = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                    break;
                }
                case "include_facets": {
                    includeFacets = com.google.common.base.Optional.of(iprot.readBool());
                    break;
                }
                case "sorts": {
                    try {
                        sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
            return this;
        }

        public Builder setFrom(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from) {
            this.from = com.google.common.base.Preconditions.checkNotNull(from);
            return this;
        }

        public Builder setFrom(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger from) {
            this.from = com.google.common.base.Optional.fromNullable(from);
            return this;
        }

        public Builder setIfPresent(final GetObjectSummariesOptions other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getFrom().isPresent()) {
                setFrom(other.getFrom());
            }
            if (other.getSize().isPresent()) {
                setSize(other.getSize());
            }
            if (other.getIncludeFacets().isPresent()) {
                setIncludeFacets(other.getIncludeFacets());
            }
            if (other.getSorts().isPresent()) {
                setSorts(other.getSorts());
            }

            return this;
        }

        public Builder setIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) {
            this.includeFacets = com.google.common.base.Preconditions.checkNotNull(includeFacets);
            return this;
        }

        public Builder setIncludeFacets(@javax.annotation.Nullable final Boolean includeFacets) {
            this.includeFacets = com.google.common.base.Optional.fromNullable(includeFacets);
            return this;
        }

        public Builder setSize(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size) {
            this.size = com.google.common.base.Preconditions.checkNotNull(size);
            return this;
        }

        public Builder setSize(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger size) {
            this.size = com.google.common.base.Optional.fromNullable(size);
            return this;
        }

        public Builder setSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts) {
            this.sorts = com.google.common.base.Preconditions.checkNotNull(sorts);
            return this;
        }

        public Builder setSorts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> sorts) {
            this.sorts = com.google.common.base.Optional.fromNullable(sorts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
            case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
            case "include_facets": setIncludeFacets((Boolean)value); return this;
            case "sorts": setSorts((com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFrom() {
            this.from = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeFacets() {
            this.includeFacets = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSize() {
            this.size = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSorts() {
            this.sorts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "from_": return unsetFrom();
            case "size": return unsetSize();
            case "include_facets": return unsetIncludeFacets();
            case "sorts": return unsetSorts();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size;
        private com.google.common.base.Optional<Boolean> includeFacets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 0, "from_", org.thryft.protocol.Type.I32),
        SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 0, "size", org.thryft.protocol.Type.I32),
        INCLUDE_FACETS("includeFacets", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "include_facets", org.thryft.protocol.Type.BOOL),
        SORTS("sorts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>>() {}, false, 0, "sorts", org.thryft.protocol.Type.LIST);

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
            case "from": return FROM_;
            case "size": return SIZE;
            case "includeFacets": return INCLUDE_FACETS;
            case "sorts": return SORTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "from_": return FROM_;
            case "size": return SIZE;
            case "include_facets": return INCLUDE_FACETS;
            case "sorts": return SORTS;
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
     * Default constructor
     */
    public GetObjectSummariesOptions() {
        from = com.google.common.base.Optional.absent();
        size = com.google.common.base.Optional.absent();
        includeFacets = com.google.common.base.Optional.absent();
        sorts = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public GetObjectSummariesOptions(final GetObjectSummariesOptions other) {
        this(other.getFrom(), other.getSize(), other.getIncludeFacets(), other.getSorts());
    }

    /**
     * Total Nullable constructor
     */
    public GetObjectSummariesOptions(final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger from, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger size, final @javax.annotation.Nullable Boolean includeFacets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> sorts) {
        this.from = com.google.common.base.Optional.fromNullable(from);
        this.size = com.google.common.base.Optional.fromNullable(size);
        this.includeFacets = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(includeFacets), "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: includeFacets must be true");
        this.sorts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(sorts), "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: sorts is empty");
    }

    /**
     * Optional constructor
     */
    public GetObjectSummariesOptions(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size, final com.google.common.base.Optional<Boolean> includeFacets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts) {
        this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing from");
        this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing size");
        this.includeFacets = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(includeFacets, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing includeFacets"), "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: includeFacets must be true");
        this.sorts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(sorts, "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: missing sorts"), "net.lab1318.costume.api.services.object.GetObjectSummariesOptions: sorts is empty");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof GetObjectSummariesOptions)) {
            return false;
        }

        final GetObjectSummariesOptions other = (GetObjectSummariesOptions)otherObject;
        return
            getFrom().equals(other.getFrom()) &&
            getSize().equals(other.getSize()) &&
            getIncludeFacets().equals(other.getIncludeFacets()) &&
            getSorts().equals(other.getSorts());
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
        case FROM_: return getFrom();
        case SIZE: return getSize();
        case INCLUDE_FACETS: return getIncludeFacets();
        case SORTS: return getSorts();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getFrom() {
        return from;
    }

    public final com.google.common.base.Optional<Boolean> getIncludeFacets() {
        return includeFacets;
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getSize() {
        return size;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> getSorts() {
        return sorts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFrom().isPresent()) {
            hashCode = 31 * hashCode + getFrom().get().hashCode();
        }
        if (getSize().isPresent()) {
            hashCode = 31 * hashCode + getSize().get().hashCode();
        }
        if (getIncludeFacets().isPresent()) {
            hashCode = 31 * hashCode + (getIncludeFacets().get() ? 1 : 0);
        }
        if (getSorts().isPresent()) {
            hashCode = 31 * hashCode + getSorts().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return !getFrom().isPresent() && !getSize().isPresent() && !getIncludeFacets().isPresent() && !getSorts().isPresent();
    }

    public static GetObjectSummariesOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectSummariesOptions readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> includeFacets = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            try {
                from = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        if (__list.getSize() > 1) {
            try {
                size = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        if (__list.getSize() > 2) {
            includeFacets = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 3) {
            try {
                sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new GetObjectSummariesOptions(from, size, includeFacets, sorts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static GetObjectSummariesOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> includeFacets = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "from_": {
                try {
                    from = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
                break;
            }
            case "size": {
                try {
                    size = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
                break;
            }
            case "include_facets": {
                includeFacets = com.google.common.base.Optional.of(iprot.readBool());
                break;
            }
            case "sorts": {
                try {
                    sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSummarySort> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.services.object.ObjectSummarySort.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
        try {
            return new GetObjectSummariesOptions(from, size, includeFacets, sorts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public GetObjectSummariesOptions replaceFrom(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from) {
        return new GetObjectSummariesOptions(from, this.size, this.includeFacets, this.sorts);
    }

    public GetObjectSummariesOptions replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
        return replaceFrom(com.google.common.base.Optional.fromNullable(from));
    }

    public GetObjectSummariesOptions replaceIncludeFacets(final com.google.common.base.Optional<Boolean> includeFacets) {
        return new GetObjectSummariesOptions(this.from, this.size, includeFacets, this.sorts);
    }

    public GetObjectSummariesOptions replaceIncludeFacets(final boolean includeFacets) {
        return replaceIncludeFacets(com.google.common.base.Optional.fromNullable(includeFacets));
    }

    public GetObjectSummariesOptions replaceSize(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size) {
        return new GetObjectSummariesOptions(this.from, size, this.includeFacets, this.sorts);
    }

    public GetObjectSummariesOptions replaceSize(final com.google.common.primitives.UnsignedInteger size) {
        return replaceSize(com.google.common.base.Optional.fromNullable(size));
    }

    public GetObjectSummariesOptions replaceSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts) {
        return new GetObjectSummariesOptions(this.from, this.size, this.includeFacets, sorts);
    }

    public GetObjectSummariesOptions replaceSorts(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort> sorts) {
        return replaceSorts(com.google.common.base.Optional.fromNullable(sorts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("from_", getFrom().orNull()).add("size", getSize().orNull()).add("include_facets", getIncludeFacets().orNull()).add("sorts", getSorts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        if (getFrom().isPresent()) {
            oprot.writeU32(getFrom().get());
        } else {
            oprot.writeNull();
        }

        if (getSize().isPresent()) {
            oprot.writeU32(getSize().get());
        } else {
            oprot.writeNull();
        }

        if (getIncludeFacets().isPresent()) {
            oprot.writeBool(getIncludeFacets().get());
        } else {
            oprot.writeNull();
        }

        if (getSorts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final net.lab1318.costume.api.services.object.ObjectSummarySort _iter0 : getSorts().get()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesOptions");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFrom().isPresent()) {
            oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
            oprot.writeU32(getFrom().get());
            oprot.writeFieldEnd();
        }

        if (getSize().isPresent()) {
            oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
            oprot.writeU32(getSize().get());
            oprot.writeFieldEnd();
        }

        if (getIncludeFacets().isPresent()) {
            oprot.writeFieldBegin("include_facets", org.thryft.protocol.Type.BOOL, (short)0);
            oprot.writeBool(getIncludeFacets().get());
            oprot.writeFieldEnd();
        }

        if (getSorts().isPresent()) {
            oprot.writeFieldBegin("sorts", org.thryft.protocol.Type.LIST, (short)0);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final net.lab1318.costume.api.services.object.ObjectSummarySort _iter0 : getSorts().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> from;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> size;

    private final com.google.common.base.Optional<Boolean> includeFacets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSummarySort>> sorts;
}
