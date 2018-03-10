package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location element
 */
public final class Location implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
        public Builder() {
            type = null;
            coordinates = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent();
            names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent();
            refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent();
        }

        public Builder(final Location other) {
            this.type = other.getType();
            this.coordinates = other.getCoordinates();
            this.names = other.getNames();
            this.refids = other.getRefids();
        }

        protected Location _build(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
            return new Location(type, coordinates, names, refids);
        }

        public Location build() {
            UncheckedValidator.validate(type, coordinates, names, refids);

            return _build(type, coordinates, names, refids);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> getCoordinates() {
            return coordinates;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> getNames() {
            return names;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> getRefids() {
            return refids;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationType getType() {
            return type;
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
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.location.LocationType.Factory.getInstance());
                if (__list.getSize() > 1) {
                    coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    try {
                        names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationName.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, e.getCause());
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
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.location.LocationType.Factory.getInstance());
                        }
                        break;
                    }
                    case "coordinates": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "names": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationName.readAsStruct(iprot, unknownFieldCallback));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "refids": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid.readAsStruct(iprot, unknownFieldCallback));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, e.getCause());
                            }
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
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.location.LocationType)value); return this;
            case COORDINATES: setCoordinates((org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates)value); return this;
            case NAMES: setNames((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>)value); return this;
            case REFIDS: setRefids((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates) {
            UncheckedValidator.validateCoordinates(coordinates);
            this.coordinates = coordinates;
            return this;
        }

        public Builder setCoordinates(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates coordinates) {
            return setCoordinates(com.google.common.base.Optional.fromNullable(coordinates));
        }

        public Builder setIfPresent(final Location other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getCoordinates().isPresent()) {
                setCoordinates(other.getCoordinates());
            }
            if (other.getNames().isPresent()) {
                setNames(other.getNames());
            }
            if (other.getRefids().isPresent()) {
                setRefids(other.getRefids());
            }

            return this;
        }

        public Builder setNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names) {
            UncheckedValidator.validateNames(names);
            this.names = names;
            return this;
        }

        public Builder setNames(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> names) {
            return setNames(com.google.common.base.Optional.fromNullable(names));
        }

        public Builder setRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
            UncheckedValidator.validateRefids(refids);
            this.refids = refids;
            return this;
        }

        public Builder setRefids(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> refids) {
            return setRefids(com.google.common.base.Optional.fromNullable(refids));
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type) {
            UncheckedValidator.validateType(type);
            this.type = type;
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
            case TYPE: return unsetType();
            case COORDINATES: return unsetCoordinates();
            case NAMES: return unsetNames();
            case REFIDS: return unsetRefids();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCoordinates() {
            this.coordinates = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent();
            return this;
        }

        public Builder unsetNames() {
            this.names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent();
            return this;
        }

        public Builder unsetRefids() {
            this.refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationType type;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Location> {
        @Override
        public Location readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Location.readAs(iprot, type);
        }

        @Override
        public Location readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Location.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Location readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Location.readAsList(iprot);
        }

        @Override
        public Location readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Location.readAsStruct(iprot);
        }

        @Override
        public Location readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Location.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.location.LocationType>() {}, true, (short)1, "type", org.thryft.protocol.Type.STRING),
        COORDINATES("coordinates", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates>() {}, false, (short)4, "coordinates", org.thryft.protocol.Type.STRUCT),
        NAMES("names", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>>() {}, false, (short)2, "names", org.thryft.protocol.Type.LIST),
        REFIDS("refids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>>() {}, false, (short)3, "refids", org.thryft.protocol.Type.LIST);

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
            case "type": return TYPE;
            case "coordinates": return COORDINATES;
            case "names": return NAMES;
            case "refids": return REFIDS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "coordinates": return COORDINATES;
            case "names": return NAMES;
            case "refids": return REFIDS;
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
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) throws org.thryft.protocol.InputProtocolException {
            validateType(type);
            validateCoordinates(coordinates);
            validateNames(names);
            validateRefids(refids);
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.location.Location: type is null");
            }
        }

        public static void validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates) throws org.thryft.protocol.InputProtocolException {
            if (coordinates == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COORDINATES, "org.dressdiscover.api.vocabularies.vra_core.location.Location: coordinates is null");
            }
        }

        public static void validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names) throws org.thryft.protocol.InputProtocolException {
            if (names == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NAMES, "org.dressdiscover.api.vocabularies.vra_core.location.Location: names is null");
            }
            if (names.isPresent()) {
                if (names.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, "org.dressdiscover.api.vocabularies.vra_core.location.Location: names: less than min length 1");
                }
            }
        }

        public static void validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) throws org.thryft.protocol.InputProtocolException {
            if (refids == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REFIDS, "org.dressdiscover.api.vocabularies.vra_core.location.Location: refids is null");
            }
            if (refids.isPresent()) {
                if (refids.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, "org.dressdiscover.api.vocabularies.vra_core.location.Location: refids: less than min length 1");
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
            validateType(type);
            validateCoordinates(coordinates);
            validateNames(names);
            validateRefids(refids);
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type) {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.Location: type is null");
            }
        }

        public static void validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates) {
            if (coordinates == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.Location: coordinates is null");
            }
        }

        public static void validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names) {
            if (names == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.Location: names is null");
            }
            if (names.isPresent()) {
                if (names.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.location.Location: names: less than min length 1");
                }
            }
        }

        public static void validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
            if (refids == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.Location: refids is null");
            }
            if (refids.isPresent()) {
                if (refids.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.location.Location: refids: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public Location(final Location other) {
        this(other.getType(), other.getCoordinates(), other.getNames(), other.getRefids());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Location(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
        this.type = type;
        this.coordinates = coordinates;
        this.names = names;
        this.refids = refids;
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

    /**
     * Required factory method
     */
    public static Location create(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type) {
        UncheckedValidator.validate(type, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent());
        return new Location(type, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static Location create(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates coordinates, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> names, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> refids) {
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinatesOptional = com.google.common.base.Optional.fromNullable(coordinates);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> namesOptional = com.google.common.base.Optional.fromNullable(names);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refidsOptional = com.google.common.base.Optional.fromNullable(refids);
        UncheckedValidator.validate(type, coordinatesOptional, namesOptional, refidsOptional);
        return new Location(type, coordinatesOptional, namesOptional, refidsOptional);
    }

    /**
     * Optional factory method
     */
    public static Location create(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
        UncheckedValidator.validate(type, coordinates, names, refids);
        return new Location(type, coordinates, names, refids);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Location)) {
            return false;
        }

        final Location other = (Location)otherObject;

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getCoordinates().isPresent() && other.getCoordinates().isPresent()) ? (getCoordinates().get().equals(other.getCoordinates().get())) : (!getCoordinates().isPresent() && !other.getCoordinates().isPresent())))) {
            return false;
        }

        if (!(((getNames().isPresent() && other.getNames().isPresent()) ? (getNames().get().equals(other.getNames().get())) : (!getNames().isPresent() && !other.getNames().isPresent())))) {
            return false;
        }

        if (!(((getRefids().isPresent() && other.getRefids().isPresent()) ? (getRefids().get().equals(other.getRefids().get())) : (!getRefids().isPresent() && !other.getRefids().isPresent())))) {
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
        case TYPE: return getType();
        case COORDINATES: return getCoordinates();
        case NAMES: return getNames();
        case REFIDS: return getRefids();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> getCoordinates() {
        return coordinates;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> getNames() {
        return names;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> getRefids() {
        return refids;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.location.LocationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getCoordinates().isPresent()) {
            hashCode = 31 * hashCode + getCoordinates().get().hashCode();
        }
        if (getNames().isPresent()) {
            hashCode = 31 * hashCode + getNames().get().hashCode();
        }
        if (getRefids().isPresent()) {
            hashCode = 31 * hashCode + getRefids().get().hashCode();
        }
        return hashCode;
    }

    public static Location readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Location readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Location readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.location.LocationType type;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.location.LocationType.Factory.getInstance());
            if (__list.getSize() > 1) {
                coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                try {
                    names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationName.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                try {
                    refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(type, coordinates, names, refids);

        return new Location(type, coordinates, names, refids);
    }

    public static Location readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Location readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.location.LocationType.Factory.getInstance());
                    }
                    break;
                }
                case "coordinates": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "names": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationName.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, e.getCause());
                        }
                    }
                    break;
                }
                case "refids": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, e.getCause());
                        }
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

        ReadValidator.validate(type, coordinates, names, refids);

        return new Location(type, coordinates, names, refids);
    }

    public Location replaceCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates) {
        UncheckedValidator.validateCoordinates(coordinates);
        return new Location(this.type, coordinates, this.names, this.refids);
    }

    public Location replaceCoordinates(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates coordinates) {
        return replaceCoordinates(com.google.common.base.Optional.fromNullable(coordinates));
    }

    public Location replaceNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names) {
        UncheckedValidator.validateNames(names);
        return new Location(this.type, this.coordinates, names, this.refids);
    }

    public Location replaceNames(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName> names) {
        return replaceNames(com.google.common.base.Optional.fromNullable(names));
    }

    public Location replaceRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids) {
        UncheckedValidator.validateRefids(refids);
        return new Location(this.type, this.coordinates, this.names, refids);
    }

    public Location replaceRefids(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid> refids) {
        return replaceRefids(com.google.common.base.Optional.fromNullable(refids));
    }

    public Location replaceType(final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type) {
        UncheckedValidator.validateType(type);
        return new Location(type, this.coordinates, this.names, this.refids);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("coordinates", getCoordinates().orNull()).add("names", getNames().orNull()).add("refids", getRefids().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeEnum(getType());

        if (getCoordinates().isPresent()) {
            getCoordinates().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getNames().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getNames().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRefids().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid _iter0 : getRefids().get()) {
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
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.location.Location");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCoordinatesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCoordinates().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.COORDINATES);
            getCoordinates().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTypeField(oprot);

        writeCoordinatesField(oprot);

        writeNamesField(oprot);

        writeRefidsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeNamesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getNames().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.NAMES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getNames().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRefidsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRefids().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.REFIDS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid _iter0 : getRefids().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.location.LocationType type;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates> coordinates;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationName>> names;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationRefid>> refids;
}
