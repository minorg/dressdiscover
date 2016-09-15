package org.dressdiscover.api.models.location;

/**
 * VRA Core 4.0 location element
 */
public final class Location implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public final static class Builder {
        public Builder() {
            type = null;
            coordinates = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationCoordinates> absent();
            names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> absent();
            refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> absent();
        }

        public Builder(final Location other) {
            this.type = other.getType();
            this.coordinates = other.getCoordinates();
            this.names = other.getNames();
            this.refids = other.getRefids();
        }

        protected Location _build(final org.dressdiscover.api.models.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
            return new Location(type, coordinates, names, refids, DefaultConstructionValidator.getInstance());
        }

        public Location build() {
            return _build(type, coordinates, names, refids);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> getCoordinates() {
            return coordinates;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> getNames() {
            return names;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> getRefids() {
            return refids;
        }

        public final org.dressdiscover.api.models.location.LocationType getType() {
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readEnum(org.dressdiscover.api.models.location.LocationType.class);
            if (__list.getSize() > 1) {
                coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationCoordinates.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                try {
                    names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.location.LocationName.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 3) {
                try {
                    refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.location.LocationRefid.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw e.getCause();
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
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(org.dressdiscover.api.models.location.LocationType.class);
                    }
                    break;
                }
                case "coordinates": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationCoordinates.readAsStruct(iprot));
                    }
                    break;
                }
                case "names": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.location.LocationName.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "refids": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.location.LocationRefid.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw e.getCause();
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
            case TYPE: setType((org.dressdiscover.api.models.location.LocationType)value); return this;
            case COORDINATES: setCoordinates((org.dressdiscover.api.models.location.LocationCoordinates)value); return this;
            case NAMES: setNames((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>)value); return this;
            case REFIDS: setRefids((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) {
            this.coordinates = DefaultConstructionValidator.getInstance().validateCoordinates(coordinates);
            return this;
        }

        public Builder setCoordinates(@javax.annotation.Nullable final org.dressdiscover.api.models.location.LocationCoordinates coordinates) {
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

        public Builder setNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) {
            this.names = DefaultConstructionValidator.getInstance().validateNames(names);
            return this;
        }

        public Builder setNames(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> names) {
            return setNames(com.google.common.base.Optional.fromNullable(names));
        }

        public Builder setRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
            this.refids = DefaultConstructionValidator.getInstance().validateRefids(refids);
            return this;
        }

        public Builder setRefids(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> refids) {
            return setRefids(com.google.common.base.Optional.fromNullable(refids));
        }

        public Builder setType(final org.dressdiscover.api.models.location.LocationType type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
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
            this.coordinates = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationCoordinates> absent();
            return this;
        }

        public Builder unsetNames() {
            this.names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> absent();
            return this;
        }

        public Builder unsetRefids() {
            this.refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private org.dressdiscover.api.models.location.LocationType type;
        private com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids;
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
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.location.LocationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        COORDINATES("coordinates", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.location.LocationCoordinates>() {}, false, 4, "coordinates", org.thryft.protocol.Type.STRUCT),
        NAMES("names", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>>() {}, false, 2, "names", org.thryft.protocol.Type.LIST),
        REFIDS("refids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>>() {}, false, 3, "refids", org.thryft.protocol.Type.LIST);

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
        public org.dressdiscover.api.models.location.LocationType validateType(final org.dressdiscover.api.models.location.LocationType type) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) throws ExceptionT;
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
        public org.dressdiscover.api.models.location.LocationType validateType(final org.dressdiscover.api.models.location.LocationType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.models.location.Location: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) throws RuntimeException {
            if (coordinates == null) {
                throw new NullPointerException("org.dressdiscover.api.models.location.Location: coordinates is null");
            }
            if (!coordinates.isPresent()) {
                return coordinates;
            }
            return coordinates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) throws RuntimeException {
            if (names == null) {
                throw new NullPointerException("org.dressdiscover.api.models.location.Location: names is null");
            }
            if (!names.isPresent()) {
                return names;
            }
            if (names.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.location.Location: names is less than min length 1");
            }
            return names;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) throws RuntimeException {
            if (refids == null) {
                throw new NullPointerException("org.dressdiscover.api.models.location.Location: refids is null");
            }
            if (!refids.isPresent()) {
                return refids;
            }
            if (refids.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.location.Location: refids is less than min length 1");
            }
            return refids;
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
        public org.dressdiscover.api.models.location.LocationType validateType(final org.dressdiscover.api.models.location.LocationType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) {
            return coordinates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) {
            return names;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
            return refids;
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
        public org.dressdiscover.api.models.location.LocationType validateType(final org.dressdiscover.api.models.location.LocationType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.models.location.Location: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) throws org.thryft.protocol.InputProtocolException {
            if (coordinates == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COORDINATES, "org.dressdiscover.api.models.location.Location: coordinates is null");
            }
            if (!coordinates.isPresent()) {
                return coordinates;
            }
            return coordinates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) throws org.thryft.protocol.InputProtocolException {
            if (names == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NAMES, "org.dressdiscover.api.models.location.Location: names is null");
            }
            if (!names.isPresent()) {
                return names;
            }
            if (names.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAMES, "org.dressdiscover.api.models.location.Location: names is less than min length 1");
            }
            return names;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) throws org.thryft.protocol.InputProtocolException {
            if (refids == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REFIDS, "org.dressdiscover.api.models.location.Location: refids is null");
            }
            if (!refids.isPresent()) {
                return refids;
            }
            if (refids.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFIDS, "org.dressdiscover.api.models.location.Location: refids is less than min length 1");
            }
            return refids;
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
        public org.dressdiscover.api.models.location.LocationType validateType(final org.dressdiscover.api.models.location.LocationType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> validateCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) {
            return coordinates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> validateNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) {
            return names;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> validateRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
            return refids;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Location(final Location other) {
        this(other.getType(), other.getCoordinates(), other.getNames(), other.getRefids(), NopConstructionValidator.getInstance());
    }

    protected Location(final org.dressdiscover.api.models.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids, ConstructionValidator validator) {
        this.type = validator.validateType(type);
        this.coordinates = validator.validateCoordinates(coordinates);
        this.names = validator.validateNames(names);
        this.refids = validator.validateRefids(refids);
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
    public static Location create(final org.dressdiscover.api.models.location.LocationType type) {
        return new Location(type, com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationCoordinates> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Location create(final org.dressdiscover.api.models.location.LocationType type, final @javax.annotation.Nullable org.dressdiscover.api.models.location.LocationCoordinates coordinates, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> names, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> refids) {
        return new Location(type, com.google.common.base.Optional.fromNullable(coordinates), com.google.common.base.Optional.fromNullable(names), com.google.common.base.Optional.fromNullable(refids), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Location create(final org.dressdiscover.api.models.location.LocationType type, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
        return new Location(type, coordinates, names, refids, DefaultConstructionValidator.getInstance());
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
            ((getCoordinates().isPresent() && other.getCoordinates().isPresent()) ? (getCoordinates().get().equals(other.getCoordinates().get())) : (!getCoordinates().isPresent() && !other.getCoordinates().isPresent())) &&
            ((getNames().isPresent() && other.getNames().isPresent()) ? (getNames().get().equals(other.getNames().get())) : (!getNames().isPresent() && !other.getNames().isPresent())) &&
            ((getRefids().isPresent() && other.getRefids().isPresent()) ? (getRefids().get().equals(other.getRefids().get())) : (!getRefids().isPresent() && !other.getRefids().isPresent()));
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> getCoordinates() {
        return coordinates;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> getNames() {
        return names;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> getRefids() {
        return refids;
    }

    public final org.dressdiscover.api.models.location.LocationType getType() {
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
        org.dressdiscover.api.models.location.LocationType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationCoordinates> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(org.dressdiscover.api.models.location.LocationType.class);
        if (__list.getSize() > 1) {
            coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationCoordinates.readAsStruct(iprot));
        }
        if (__list.getSize() > 2) {
            try {
                names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.location.LocationName.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 3) {
            try {
                refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.location.LocationRefid.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw e.getCause();
            }
        }
        iprot.readListEnd();
        return new Location(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateCoordinates(coordinates), DefaultReadValidator.getInstance().validateNames(names), DefaultReadValidator.getInstance().validateRefids(refids), NopConstructionValidator.getInstance());
    }

    public static Location readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Location readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.location.LocationType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationCoordinates> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(org.dressdiscover.api.models.location.LocationType.class);
                }
                break;
            }
            case "coordinates": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    coordinates = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationCoordinates.readAsStruct(iprot));
                }
                break;
            }
            case "names": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        names = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.location.LocationName.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw e.getCause();
                    }
                }
                break;
            }
            case "refids": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        refids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.location.LocationRefid> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.location.LocationRefid.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw e.getCause();
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
        return new Location(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateCoordinates(coordinates), DefaultReadValidator.getInstance().validateNames(names), DefaultReadValidator.getInstance().validateRefids(refids), NopConstructionValidator.getInstance());
    }

    public Location replaceCoordinates(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates) {
        return new Location(this.type, DefaultConstructionValidator.getInstance().validateCoordinates(coordinates), this.names, this.refids, NopConstructionValidator.getInstance());
    }

    public Location replaceCoordinates(final org.dressdiscover.api.models.location.LocationCoordinates coordinates) {
        return replaceCoordinates(com.google.common.base.Optional.fromNullable(coordinates));
    }

    public Location replaceNames(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names) {
        return new Location(this.type, this.coordinates, DefaultConstructionValidator.getInstance().validateNames(names), this.refids, NopConstructionValidator.getInstance());
    }

    public Location replaceNames(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> names) {
        return replaceNames(com.google.common.base.Optional.fromNullable(names));
    }

    public Location replaceRefids(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids) {
        return new Location(this.type, this.coordinates, this.names, DefaultConstructionValidator.getInstance().validateRefids(refids), NopConstructionValidator.getInstance());
    }

    public Location replaceRefids(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> refids) {
        return replaceRefids(com.google.common.base.Optional.fromNullable(refids));
    }

    public Location replaceType(final org.dressdiscover.api.models.location.LocationType type) {
        return new Location(DefaultConstructionValidator.getInstance().validateType(type), this.coordinates, this.names, this.refids, NopConstructionValidator.getInstance());
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
            for (final org.dressdiscover.api.models.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRefids().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final org.dressdiscover.api.models.location.LocationRefid _iter0 : getRefids().get()) {
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
        oprot.writeStructBegin("org.dressdiscover.api.models.location.Location");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getCoordinates().isPresent()) {
            oprot.writeFieldBegin("coordinates", org.thryft.protocol.Type.STRUCT, (short)4);
            getCoordinates().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getNames().isPresent()) {
            oprot.writeFieldBegin("names", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getNames().get().size());
            for (final org.dressdiscover.api.models.location.LocationName _iter0 : getNames().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRefids().isPresent()) {
            oprot.writeFieldBegin("refids", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRefids().get().size());
            for (final org.dressdiscover.api.models.location.LocationRefid _iter0 : getRefids().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.location.LocationType type;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationCoordinates> coordinates;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>> names;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>> refids;
}
