package org.dressdiscover.api.vocabularies.vra_core.location;

public final class LocationCoordinates implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            latitude = null;
            longitude = null;
        }

        public Builder(final LocationCoordinates other) {
            this.latitude = other.getLatitude();
            this.longitude = other.getLongitude();
        }

        protected LocationCoordinates _build(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
            return new LocationCoordinates(latitude, longitude);
        }

        public LocationCoordinates build() {
            UncheckedValidator.validate(latitude, longitude);

            return _build(latitude, longitude);
        }

        public final @javax.annotation.Nullable java.math.BigDecimal getLatitude() {
            return latitude;
        }

        public final @javax.annotation.Nullable java.math.BigDecimal getLongitude() {
            return longitude;
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
                iprot.readListBegin();
                try {
                    latitude = iprot.readDecimal();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
                }
                try {
                    longitude = iprot.readDecimal();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
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
                    case "latitude": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                latitude = iprot.readDecimal();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
                            }
                        }
                        break;
                    }
                    case "longitude": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                longitude = iprot.readDecimal();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case LATITUDE: setLatitude((java.math.BigDecimal)value); return this;
            case LONGITUDE: setLongitude((java.math.BigDecimal)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final LocationCoordinates other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setLatitude(other.getLatitude());
            setLongitude(other.getLongitude());

            return this;
        }

        public Builder setLatitude(final java.math.BigDecimal latitude) {
            UncheckedValidator.validateLatitude(latitude);
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(final java.math.BigDecimal longitude) {
            UncheckedValidator.validateLongitude(longitude);
            this.longitude = longitude;
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
            case LATITUDE: return unsetLatitude();
            case LONGITUDE: return unsetLongitude();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetLatitude() {
            this.latitude = null;
            return this;
        }

        public Builder unsetLongitude() {
            this.longitude = null;
            return this;
        }

        private @javax.annotation.Nullable java.math.BigDecimal latitude;
        private @javax.annotation.Nullable java.math.BigDecimal longitude;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<LocationCoordinates> {
        @Override
        public LocationCoordinates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAs(iprot, type);
        }

        @Override
        public LocationCoordinates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public LocationCoordinates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsList(iprot);
        }

        @Override
        public LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsStruct(iprot);
        }

        @Override
        public LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        LATITUDE("latitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, (short)1, "latitude", org.thryft.protocol.Type.STRING),
        LONGITUDE("longitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, (short)2, "longitude", org.thryft.protocol.Type.STRING);

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
            case "latitude": return LATITUDE;
            case "longitude": return LONGITUDE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "latitude": return LATITUDE;
            case "longitude": return LONGITUDE;
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
        public static void validate(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) throws org.thryft.protocol.InputProtocolException {
            validateLatitude(latitude);
            validateLongitude(longitude);
        }

        public static void validateLatitude(final java.math.BigDecimal latitude) throws org.thryft.protocol.InputProtocolException {
            if (latitude == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LATITUDE, "org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: latitude is null");
            }
        }

        public static void validateLongitude(final java.math.BigDecimal longitude) throws org.thryft.protocol.InputProtocolException {
            if (longitude == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LONGITUDE, "org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: longitude is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
            validateLatitude(latitude);
            validateLongitude(longitude);
        }

        public static void validateLatitude(final java.math.BigDecimal latitude) {
            if (latitude == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: latitude is null");
            }
        }

        public static void validateLongitude(final java.math.BigDecimal longitude) {
            if (longitude == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: longitude is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public LocationCoordinates(final LocationCoordinates other) {
        this(other.getLatitude(), other.getLongitude());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected LocationCoordinates(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final LocationCoordinates other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<LocationCoordinates> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static LocationCoordinates create(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
        UncheckedValidator.validate(latitude, longitude);
        return new LocationCoordinates(latitude, longitude);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof LocationCoordinates)) {
            return false;
        }

        final LocationCoordinates other = (LocationCoordinates)otherObject;

        if (!(getLatitude().equals(other.getLatitude()))) {
            return false;
        }

        if (!(getLongitude().equals(other.getLongitude()))) {
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
        case LATITUDE: return getLatitude();
        case LONGITUDE: return getLongitude();
        default:
            throw new IllegalStateException();
        }
    }

    public final java.math.BigDecimal getLatitude() {
        return latitude;
    }

    public final java.math.BigDecimal getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getLatitude().hashCode();
        hashCode = 31 * hashCode + getLongitude().hashCode();
        return hashCode;
    }

    public static LocationCoordinates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static LocationCoordinates readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static LocationCoordinates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        java.math.BigDecimal latitude;
        java.math.BigDecimal longitude;

        try {
            iprot.readListBegin();
            try {
                latitude = iprot.readDecimal();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
            }
            try {
                longitude = iprot.readDecimal();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(latitude, longitude);

        return new LocationCoordinates(latitude, longitude);
    }

    public static LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable java.math.BigDecimal latitude = null;
        @javax.annotation.Nullable java.math.BigDecimal longitude = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "latitude": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            latitude = iprot.readDecimal();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
                        }
                    }
                    break;
                }
                case "longitude": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            longitude = iprot.readDecimal();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
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

        ReadValidator.validate(latitude, longitude);

        return new LocationCoordinates(latitude, longitude);
    }

    public LocationCoordinates replaceLatitude(final java.math.BigDecimal latitude) {
        UncheckedValidator.validateLatitude(latitude);
        return new LocationCoordinates(latitude, this.longitude);
    }

    public LocationCoordinates replaceLongitude(final java.math.BigDecimal longitude) {
        UncheckedValidator.validateLongitude(longitude);
        return new LocationCoordinates(this.latitude, longitude);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("latitude", getLatitude()).add("longitude", getLongitude()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeDecimal(getLatitude());

        oprot.writeDecimal(getLongitude());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeLatitudeField(oprot);

        writeLongitudeField(oprot);

        oprot.writeFieldStop();
    }

    public void writeLatitudeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.LATITUDE);
        oprot.writeDecimal(getLatitude());
        oprot.writeFieldEnd();
    }

    public void writeLongitudeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.LONGITUDE);
        oprot.writeDecimal(getLongitude());
        oprot.writeFieldEnd();
    }

    private final java.math.BigDecimal latitude;

    private final java.math.BigDecimal longitude;
}
