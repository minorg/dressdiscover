package org.dressdiscover.gui.models.location;

public class LocationCoordinatesBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        LATITUDE("latitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, 1, "latitude", org.thryft.protocol.Type.STRING),
        LONGITUDE("longitude", new com.google.common.reflect.TypeToken<java.math.BigDecimal>() {}, true, 2, "longitude", org.thryft.protocol.Type.STRING);

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

    public LocationCoordinatesBean() {
        latitude = null;
        longitude = null;
    }

    public LocationCoordinatesBean(final org.dressdiscover.api.models.location.LocationCoordinates other) {
        this.latitude = other.getLatitude();
        this.longitude = other.getLongitude();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof LocationCoordinatesBean)) {
            return false;
        }

        final LocationCoordinatesBean other = (LocationCoordinatesBean)otherObject;
        return
            getLatitude().equals(other.getLatitude()) &&
            getLongitude().equals(other.getLongitude());
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

    public java.math.BigDecimal getLatitude() {
        return latitude;
    }

    public java.math.BigDecimal getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getLatitude().hashCode();
        hashCode = 31 * hashCode + getLongitude().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setLatitude(final java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(final java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("latitude", getLatitude()).add("longitude", getLongitude()).toString();
    }

    private java.math.BigDecimal latitude;

    private java.math.BigDecimal longitude;
}
