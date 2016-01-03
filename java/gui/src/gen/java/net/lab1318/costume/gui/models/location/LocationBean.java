package net.lab1318.costume.gui.models.location;

/**
 * VRA Core 4.0 location element
 */
public class LocationBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.location.LocationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        NAMES("names", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean>>() {}, false, 2, "names", org.thryft.protocol.Type.LIST),
        REFIDS("refids", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean>>() {}, false, 3, "refids", org.thryft.protocol.Type.LIST);

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

    public LocationBean() {
        type = null;
        names = null;
        refids = null;
    }

    public LocationBean(final net.lab1318.costume.api.models.location.Location other) {
        this.type = other.getType();
        this.names = other.getNames().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName>, java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationName> other) {
                final java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.location.LocationNameBean>();
                for (final net.lab1318.costume.api.models.location.LocationName element : other) {
                    copy.add(new net.lab1318.costume.gui.models.location.LocationNameBean(element));
                }
                return copy;
            }
        }).apply(other.getNames().get()) : null;
        this.refids = other.getRefids().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid>, java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.location.LocationRefid> other) {
                final java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.location.LocationRefidBean>();
                for (final net.lab1318.costume.api.models.location.LocationRefid element : other) {
                    copy.add(new net.lab1318.costume.gui.models.location.LocationRefidBean(element));
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
            (getNames() != null ? getNames().equals(other.getNames()) : other.getNames() == null) &&
            (getRefids() != null ? getRefids().equals(other.getRefids()) : other.getRefids() == null);
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
        case NAMES: return getNames();
        case REFIDS: return getRefids();
        default:
            throw new IllegalStateException();
        }
    }

    public java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean> getNames() {
        return names;
    }

    public java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean> getRefids() {
        return refids;
    }

    public net.lab1318.costume.api.models.location.LocationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getNames() != null) {
            hashCode = 31 * hashCode + getNames().hashCode();
        }
        if (getRefids() != null) {
            hashCode = 31 * hashCode + getRefids().hashCode();
        }
        return hashCode;
    }

    public void setNames(final java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean> names) {
        this.names = names;
    }

    public void setRefids(final java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean> refids) {
        this.refids = refids;
    }

    public void setType(final net.lab1318.costume.api.models.location.LocationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("names", getNames()).add("refids", getRefids()).toString();
    }

    private net.lab1318.costume.api.models.location.LocationType type;

    private java.util.List<net.lab1318.costume.gui.models.location.LocationNameBean> names;

    private java.util.List<net.lab1318.costume.gui.models.location.LocationRefidBean> refids;
}
