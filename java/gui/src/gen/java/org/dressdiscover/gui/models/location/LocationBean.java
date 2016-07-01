package org.dressdiscover.gui.models.location;

/**
 * VRA Core 4.0 location element
 */
public class LocationBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.location.LocationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        COORDINATES("coordinates", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.location.LocationCoordinatesBean>() {}, false, 4, "coordinates", org.thryft.protocol.Type.STRUCT),
        NAMES("names", new com.google.common.reflect.TypeToken<java.util.List<org.dressdiscover.gui.models.location.LocationNameBean>>() {}, false, 2, "names", org.thryft.protocol.Type.LIST),
        REFIDS("refids", new com.google.common.reflect.TypeToken<java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean>>() {}, false, 3, "refids", org.thryft.protocol.Type.LIST);

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

    public LocationBean() {
        type = null;
        coordinates = null;
        names = null;
        refids = null;
    }

    public LocationBean(final org.dressdiscover.api.models.location.Location other) {
        this.type = other.getType();
        this.coordinates = other.getCoordinates().isPresent() ? new org.dressdiscover.gui.models.location.LocationCoordinatesBean(other.getCoordinates().get()) : null;
        this.names = other.getNames().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName>, java.util.List<org.dressdiscover.gui.models.location.LocationNameBean>>() {
            @Override
            public java.util.List<org.dressdiscover.gui.models.location.LocationNameBean> apply(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationName> other) {
                final java.util.List<org.dressdiscover.gui.models.location.LocationNameBean> copy = new java.util.ArrayList<org.dressdiscover.gui.models.location.LocationNameBean>();
                for (final org.dressdiscover.api.models.location.LocationName element : other) {
                    copy.add(new org.dressdiscover.gui.models.location.LocationNameBean(element));
                }
                return copy;
            }
        }).apply(other.getNames().get()) : null;
        this.refids = other.getRefids().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid>, java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean>>() {
            @Override
            public java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean> apply(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.location.LocationRefid> other) {
                final java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean> copy = new java.util.ArrayList<org.dressdiscover.gui.models.location.LocationRefidBean>();
                for (final org.dressdiscover.api.models.location.LocationRefid element : other) {
                    copy.add(new org.dressdiscover.gui.models.location.LocationRefidBean(element));
                }
                return copy;
            }
        }).apply(other.getRefids().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof LocationBean)) {
            return false;
        }

        final LocationBean other = (LocationBean)otherObject;
        return
            getType().equals(other.getType()) &&
            ((getCoordinates() != null && other.getCoordinates() != null) ? (getCoordinates().equals(other.getCoordinates())) : (getCoordinates() == null && other.getCoordinates() == null)) &&
            ((getNames() != null && other.getNames() != null) ? (getNames().equals(other.getNames())) : (getNames() == null && other.getNames() == null)) &&
            ((getRefids() != null && other.getRefids() != null) ? (getRefids().equals(other.getRefids())) : (getRefids() == null && other.getRefids() == null));
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

    public org.dressdiscover.gui.models.location.LocationCoordinatesBean getCoordinates() {
        return coordinates;
    }

    public java.util.List<org.dressdiscover.gui.models.location.LocationNameBean> getNames() {
        return names;
    }

    public java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean> getRefids() {
        return refids;
    }

    public org.dressdiscover.api.models.location.LocationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getCoordinates() != null) {
            hashCode = 31 * hashCode + getCoordinates().hashCode();
        }
        if (getNames() != null) {
            hashCode = 31 * hashCode + getNames().hashCode();
        }
        if (getRefids() != null) {
            hashCode = 31 * hashCode + getRefids().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setCoordinates(final org.dressdiscover.gui.models.location.LocationCoordinatesBean coordinates) {
        this.coordinates = coordinates;
    }

    public void setNames(final java.util.List<org.dressdiscover.gui.models.location.LocationNameBean> names) {
        this.names = names;
    }

    public void setRefids(final java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean> refids) {
        this.refids = refids;
    }

    public void setType(final org.dressdiscover.api.models.location.LocationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("coordinates", getCoordinates()).add("names", getNames()).add("refids", getRefids()).toString();
    }

    private org.dressdiscover.api.models.location.LocationType type;

    private org.dressdiscover.gui.models.location.LocationCoordinatesBean coordinates;

    private java.util.List<org.dressdiscover.gui.models.location.LocationNameBean> names;

    private java.util.List<org.dressdiscover.gui.models.location.LocationRefidBean> refids;
}
