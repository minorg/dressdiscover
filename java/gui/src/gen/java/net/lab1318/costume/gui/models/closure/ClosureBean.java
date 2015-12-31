package net.lab1318.costume.gui.models.closure;

/**
 * Costume Core closure* elements
 */
public class ClosureBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        PLACEMENT("placement", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.closure.ClosurePlacementBean>() {}, true, 1, "placement", org.thryft.protocol.Type.STRUCT),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.closure.ClosureTypeBean>() {}, true, 2, "type", org.thryft.protocol.Type.STRUCT);

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
            case "placement": return PLACEMENT;
            case "type": return TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "placement": return PLACEMENT;
            case "type": return TYPE;
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

    public ClosureBean() {
        placement = null;
        type = null;
    }

    public ClosureBean(final net.lab1318.costume.api.models.closure.Closure other) {
        this.placement = new net.lab1318.costume.gui.models.closure.ClosurePlacementBean(other.getPlacement());
        this.type = new net.lab1318.costume.gui.models.closure.ClosureTypeBean(other.getType());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ClosureBean)) {
            return false;
        }

        final ClosureBean other = (ClosureBean)otherObject;
        return
            getPlacement().equals(other.getPlacement()) &&
            getType().equals(other.getType());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "placement": return getPlacement();
        case "type": return getType();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public net.lab1318.costume.gui.models.closure.ClosurePlacementBean getPlacement() {
        return placement;
    }

    public net.lab1318.costume.gui.models.closure.ClosureTypeBean getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getPlacement().hashCode();
        hashCode = 31 * hashCode + getType().hashCode();
        return hashCode;
    }

    public void setPlacement(final net.lab1318.costume.gui.models.closure.ClosurePlacementBean placement) {
        this.placement = placement;
    }

    public void setType(final net.lab1318.costume.gui.models.closure.ClosureTypeBean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("placement", getPlacement()).add("type", getType()).toString();
    }

    private net.lab1318.costume.gui.models.closure.ClosurePlacementBean placement;

    private net.lab1318.costume.gui.models.closure.ClosureTypeBean type;
}
