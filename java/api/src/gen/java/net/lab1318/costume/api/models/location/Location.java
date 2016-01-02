package net.lab1318.costume.api.models.location;

/**
 * VRA Core 4.0 location element
 */
public class Location implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            type = null;
            names = com.google.common.base.Optional.absent();
            refids = com.google.common.base.Optional.absent();
        }

        public Builder(final Location other) {
            this.type = other.getType();
            this.names = other.getNames();
            this.refids = other.getRefids();
        }

        protected Location _build(final net.lab1318.costume.api.models.location.LocationType type, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids) {
            return new Location(type, names, refids);
        }

        public Location build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.Location: missing type"), com.google.common.base.Preconditions.checkNotNull(names, "net.lab1318.costume.api.models.location.Location: missing names"), com.google.common.base.Preconditions.checkNotNull(refids, "net.lab1318.costume.api.models.location.Location: missing refids"));
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> getNames() {
            return names;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> getRefids() {
            return refids;
        }

        public final net.lab1318.costume.api.models.location.LocationType getType() {
            return type;
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
            type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationType.class);
            if (__list.getSize() > 1) {
                try {
                    names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationName.readAsStruct(iprot));
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
            if (__list.getSize() > 2) {
                try {
                    refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationRefid.readAsStruct(iprot));
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
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationType.class);
                    }
                    break;
                }
                case "names": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationName.readAsStruct(iprot));
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
                    break;
                }
                case "refids": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationRefid.readAsStruct(iprot));
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
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Location other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getNames().isPresent()) {
                setNames(other.getNames());
            }
            if (other.getRefids().isPresent()) {
                setRefids(other.getRefids());
            }

            return this;
        }

        public Builder setNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names) {
            this.names = com.google.common.base.Preconditions.checkNotNull(names);
            return this;
        }

        public Builder setNames(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> names) {
            this.names = com.google.common.base.Optional.fromNullable(names);
            return this;
        }

        public Builder setRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids) {
            this.refids = com.google.common.base.Preconditions.checkNotNull(refids);
            return this;
        }

        public Builder setRefids(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> refids) {
            this.refids = com.google.common.base.Optional.fromNullable(refids);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.location.LocationType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": setType((net.lab1318.costume.api.models.location.LocationType)value); return this;
            case "names": setNames((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>)value); return this;
            case "refids": setRefids((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetNames() {
            this.names = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRefids() {
            this.refids = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": return unsetType();
            case "names": return unsetNames();
            case "refids": return unsetRefids();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.location.LocationType type;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.location.LocationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        NAMES("names", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>>() {}, false, 2, "names", org.thryft.protocol.Type.LIST),
        REFIDS("refids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>>() {}, false, 3, "refids", org.thryft.protocol.Type.LIST);

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
            case "type": return TYPE;
            case "names": return NAMES;
            case "refids": return REFIDS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "names": return NAMES;
            case "refids": return REFIDS;
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
    public Location(final Location other) {
        this(other.getType(), other.getNames(), other.getRefids());
    }

    /**
     * Required constructor
     */
    public Location(final net.lab1318.costume.api.models.location.LocationType type) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.Location: missing type");
        this.names = com.google.common.base.Optional.absent();
        this.refids = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Location(final net.lab1318.costume.api.models.location.LocationType type, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> names, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> refids) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.Location: missing type");
        this.names = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(names), "net.lab1318.costume.api.models.location.Location: names is empty");
        this.refids = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(refids), "net.lab1318.costume.api.models.location.Location: refids is empty");
    }

    /**
     * Optional constructor
     */
    public Location(final net.lab1318.costume.api.models.location.LocationType type, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.Location: missing type");
        this.names = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(names, "net.lab1318.costume.api.models.location.Location: missing names"), "net.lab1318.costume.api.models.location.Location: names is empty");
        this.refids = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(refids, "net.lab1318.costume.api.models.location.Location: missing refids"), "net.lab1318.costume.api.models.location.Location: refids is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Location other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Location> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Location)) {
            return false;
        }

        final Location other = (Location)otherObject;
        return
            getType().equals(other.getType()) &&
            getNames().equals(other.getNames()) &&
            getRefids().equals(other.getRefids());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "type": return getType();
        case "names": return getNames();
        case "refids": return getRefids();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> getNames() {
        return names;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> getRefids() {
        return refids;
    }

    public final net.lab1318.costume.api.models.location.LocationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getNames().isPresent()) {
            hashCode = 31 * hashCode + getNames().get().hashCode();
        }
        if (getRefids().isPresent()) {
            hashCode = 31 * hashCode + getRefids().get().hashCode();
        }
        return hashCode;
    }

    public static Location readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Location readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.location.LocationType type = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationType.class);
        if (__list.getSize() > 1) {
            try {
                names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationName.readAsStruct(iprot));
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
        if (__list.getSize() > 2) {
            try {
                refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationRefid.readAsStruct(iprot));
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
            return new Location(type, names, refids);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Location readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.location.LocationType type = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationType.class);
                }
                break;
            }
            case "names": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationName.readAsStruct(iprot));
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
                break;
            }
            case "refids": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.location.LocationRefid.readAsStruct(iprot));
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
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Location(type, names, refids);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Location replaceNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names) {
        return new Location(this.type, names, this.refids);
    }

    public Location replaceNames(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> names) {
        return replaceNames(com.google.common.base.Optional.fromNullable(names));
    }

    public Location replaceRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids) {
        return new Location(this.type, this.names, refids);
    }

    public Location replaceRefids(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> refids) {
        return replaceRefids(com.google.common.base.Optional.fromNullable(refids));
    }

    public Location replaceType(final net.lab1318.costume.api.models.location.LocationType type) {
        return new Location(type, this.names, this.refids);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("names", getNames().orNull()).add("refids", getRefids().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeEnum(getType());

        if (getNames().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getNames().get().size());
            for (final net.lab1318.costume.api.models.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRefids().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final net.lab1318.costume.api.models.location.LocationRefid _iter0 : getRefids().get()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.location.Location");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getNames().isPresent()) {
            oprot.writeFieldBegin("names", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getNames().get().size());
            for (final net.lab1318.costume.api.models.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRefids().isPresent()) {
            oprot.writeFieldBegin("refids", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final net.lab1318.costume.api.models.location.LocationRefid _iter0 : getRefids().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.location.LocationType type;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>> names;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>> refids;
}
