package org.dressdiscover.api.vocabularies.vra_core.location;

public final class LocationCoordinates implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, LocationCoordinates> {
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
            Validator.validate(latitude, longitude);

            return _build(latitude, longitude);
        }

        public final @javax.annotation.Nullable java.math.BigDecimal getLatitude() {
            return latitude;
        }

        public final @javax.annotation.Nullable java.math.BigDecimal getLongitude() {
            return longitude;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                try {
                    this.setLatitude(iprot.readDecimal());
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
                }
                try {
                    this.setLongitude(iprot.readDecimal());
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                                    this.setLatitude(iprot.readDecimal());
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LATITUDE, e);
                                }
                        }
                        break;
                    }
                    case "longitude": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setLongitude(iprot.readDecimal());
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LONGITUDE, e);
                                }
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            Validator.validateLatitude(latitude);
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(final java.math.BigDecimal longitude) {
            Validator.validateLongitude(longitude);
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
        public LocationCoordinates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsList(iprot);
        }

        @Override
        public LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsStruct(iprot);
        }

        @Override
        public LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return LocationCoordinates.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        LATITUDE("latitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, (short)1, "latitude", "1:latitude", org.thryft.protocol.Type.STRING),
        LONGITUDE("longitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, (short)2, "longitude", "2:longitude", org.thryft.protocol.Type.STRING);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
            validateLatitude(latitude);
            validateLongitude(longitude);
        }

        public static void validateLatitude(final java.math.BigDecimal latitude) {
            if (latitude == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: latitude is missing");
            }
        }

        public static void validateLongitude(final java.math.BigDecimal longitude) {
            if (longitude == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates: longitude is missing");
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
     */
    public LocationCoordinates(final java.math.BigDecimal latitude, final java.math.BigDecimal longitude) {
        Validator.validate(latitude, longitude);
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

    public static LocationCoordinates readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static LocationCoordinates readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public LocationCoordinates replaceLatitude(final java.math.BigDecimal latitude) {
        Validator.validateLatitude(latitude);
        return new LocationCoordinates(latitude, this.longitude);
    }

    public LocationCoordinates replaceLongitude(final java.math.BigDecimal longitude) {
        Validator.validateLongitude(longitude);
        return new LocationCoordinates(this.latitude, longitude);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("latitude", getLatitude()).add("longitude", getLongitude()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.location.LocationCoordinates");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeDecimal(getLatitude());
        oprot.writeDecimal(getLongitude());
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
