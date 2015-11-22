package net.lab1318.costume.api.services.object;

public class GetObjectsOptions implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            from = com.google.common.primitives.UnsignedInteger.ZERO;
            size = com.google.common.primitives.UnsignedInteger.ZERO;
            sorts = com.google.common.base.Optional.absent();
        }

        public Builder(final GetObjectsOptions other) {
            this.from = other.getFrom();
            this.size = other.getSize();
            this.sorts = other.getSorts();
        }

        protected GetObjectsOptions _build(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts) {
            return new GetObjectsOptions(from, size, sorts);
        }

        public GetObjectsOptions build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from"), com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size"), com.google.common.base.Preconditions.checkNotNull(sorts, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing sorts"));
        }

        public final com.google.common.primitives.UnsignedInteger getFrom() {
            return from;
        }

        public final com.google.common.primitives.UnsignedInteger getSize() {
            return size;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> getSorts() {
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
            from = iprot.readU32();
            size = iprot.readU32();
            if (__list.getSize() > 2) {
                try {
                    sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSort> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.services.object.ObjectSort.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
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
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "from_": {
                    from = iprot.readU32();
                    break;
                }
                case "size": {
                    size = iprot.readU32();
                    break;
                }
                case "sorts": {
                    try {
                        sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSort> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.services.object.ObjectSort.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setFrom(final com.google.common.primitives.UnsignedInteger from) {
            this.from = com.google.common.base.Preconditions.checkNotNull(from);
            return this;
        }

        public Builder setIfPresent(final GetObjectsOptions other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setFrom(other.getFrom());
            setSize(other.getSize());
            if (other.getSorts().isPresent()) {
                setSorts(other.getSorts());
            }

            return this;
        }

        public Builder setSize(final com.google.common.primitives.UnsignedInteger size) {
            this.size = com.google.common.base.Preconditions.checkNotNull(size);
            return this;
        }

        public Builder setSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts) {
            this.sorts = com.google.common.base.Preconditions.checkNotNull(sorts);
            return this;
        }

        public Builder setSorts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> sorts) {
            this.sorts = com.google.common.base.Optional.fromNullable(sorts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "from_": setFrom((com.google.common.primitives.UnsignedInteger)value); return this;
            case "size": setSize((com.google.common.primitives.UnsignedInteger)value); return this;
            case "sorts": setSorts((com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFrom() {
            this.from = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        public Builder unsetSize() {
            this.size = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        public Builder unsetSorts() {
            this.sorts = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.primitives.UnsignedInteger from;
        private com.google.common.primitives.UnsignedInteger size;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FROM_("from", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "from_", org.thryft.protocol.Type.I32),
        SIZE("size", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "size", org.thryft.protocol.Type.I32),
        SORTS("sorts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>>() {}, false, 0, "sorts", org.thryft.protocol.Type.LIST);

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
            case "sorts": return SORTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "from_": return FROM_;
            case "size": return SIZE;
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
     * Copy constructor
     */
    public GetObjectsOptions(final GetObjectsOptions other) {
        this(other.getFrom(), other.getSize(), other.getSorts());
    }

    /**
     * Required constructor
     */
    public GetObjectsOptions(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
        this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from");
        this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size");
        this.sorts = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public GetObjectsOptions(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> sorts) {
        this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from");
        this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size");
        this.sorts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(sorts), "net.lab1318.costume.api.services.object.GetObjectsOptions: sorts is empty");
    }

    /**
     * Optional constructor
     */
    public GetObjectsOptions(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts) {
        this.from = com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing from");
        this.size = com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing size");
        this.sorts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(sorts, "net.lab1318.costume.api.services.object.GetObjectsOptions: missing sorts"), "net.lab1318.costume.api.services.object.GetObjectsOptions: sorts is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GetObjectsOptions other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GetObjectsOptions> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof GetObjectsOptions)) {
            return false;
        }

        final GetObjectsOptions other = (GetObjectsOptions)otherObject;
        return
            getFrom().equals(other.getFrom()) &&
            getSize().equals(other.getSize()) &&
            getSorts().equals(other.getSorts());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "from_": return getFrom();
        case "size": return getSize();
        case "sorts": return getSorts();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.primitives.UnsignedInteger getFrom() {
        return from;
    }

    public final com.google.common.primitives.UnsignedInteger getSize() {
        return size;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> getSorts() {
        return sorts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getFrom().hashCode();
        hashCode = 31 * hashCode + getSize().hashCode();
        if (getSorts().isPresent()) {
            hashCode = 31 * hashCode + getSorts().get().hashCode();
        }
        return hashCode;
    }

    public static GetObjectsOptions readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectsOptions readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        from = iprot.readU32();
        size = iprot.readU32();
        if (__list.getSize() > 2) {
            try {
                sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSort> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.services.object.ObjectSort.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
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
            return new GetObjectsOptions(from, size, sorts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static GetObjectsOptions readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.primitives.UnsignedInteger from = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.primitives.UnsignedInteger size = com.google.common.primitives.UnsignedInteger.ZERO;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "from_": {
                from = iprot.readU32();
                break;
            }
            case "size": {
                size = iprot.readU32();
                break;
            }
            case "sorts": {
                try {
                    sorts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.services.object.ObjectSort> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.services.object.ObjectSort.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new GetObjectsOptions(from, size, sorts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public GetObjectsOptions replaceFrom(final com.google.common.primitives.UnsignedInteger from) {
        return new GetObjectsOptions(from, this.size, this.sorts);
    }

    public GetObjectsOptions replaceSize(final com.google.common.primitives.UnsignedInteger size) {
        return new GetObjectsOptions(this.from, size, this.sorts);
    }

    public GetObjectsOptions replaceSorts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts) {
        return new GetObjectsOptions(this.from, this.size, sorts);
    }

    public GetObjectsOptions replaceSorts(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort> sorts) {
        return replaceSorts(com.google.common.base.Optional.fromNullable(sorts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("from_", getFrom()).add("size", getSize()).add("sorts", getSorts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeU32(getFrom());

        oprot.writeU32(getSize());

        if (getSorts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final net.lab1318.costume.api.services.object.ObjectSort _iter0 : getSorts().get()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsOptions");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("from_", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getFrom());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("size", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getSize());
        oprot.writeFieldEnd();

        if (getSorts().isPresent()) {
            oprot.writeFieldBegin("sorts", org.thryft.protocol.Type.LIST, (short)0);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSorts().get().size());
            for (final net.lab1318.costume.api.services.object.ObjectSort _iter0 : getSorts().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.primitives.UnsignedInteger from;

    private final com.google.common.primitives.UnsignedInteger size;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.services.object.ObjectSort>> sorts;
}
