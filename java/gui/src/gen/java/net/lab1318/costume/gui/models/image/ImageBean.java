package net.lab1318.costume.gui.models.image;

public class ImageBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 1, "url", org.thryft.protocol.Type.STRING),
        HEIGHT_PX("heightPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 2, "height_px", org.thryft.protocol.Type.I32),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageType>() {}, false, 4, "type", org.thryft.protocol.Type.STRING),
        WIDTH_PX("widthPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 3, "width_px", org.thryft.protocol.Type.I32);

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
            case "url": return URL;
            case "heightPx": return HEIGHT_PX;
            case "type": return TYPE;
            case "widthPx": return WIDTH_PX;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "url": return URL;
            case "height_px": return HEIGHT_PX;
            case "type": return TYPE;
            case "width_px": return WIDTH_PX;
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

    public ImageBean() {
        url = null;
        heightPx = null;
        type = null;
        widthPx = null;
    }

    public ImageBean(final net.lab1318.costume.api.models.image.Image other) {
        this.url = other.getUrl();
        this.heightPx = other.getHeightPx().isPresent() ? other.getHeightPx().get() : null;
        this.type = other.getType().isPresent() ? other.getType().get() : null;
        this.widthPx = other.getWidthPx().isPresent() ? other.getWidthPx().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ImageBean)) {
            return false;
        }

        final ImageBean other = (ImageBean)otherObject;
        return
            getUrl().equals(other.getUrl()) &&
            getHeightPx().equals(other.getHeightPx()) &&
            getType().equals(other.getType()) &&
            getWidthPx().equals(other.getWidthPx());
    }

    public com.google.common.primitives.UnsignedInteger getHeightPx() {
        return heightPx;
    }

    public net.lab1318.costume.api.models.image.ImageType getType() {
        return type;
    }

    public org.thryft.native_.Url getUrl() {
        return url;
    }

    public com.google.common.primitives.UnsignedInteger getWidthPx() {
        return widthPx;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getUrl().hashCode();
        if (getHeightPx() != null) {
            hashCode = 31 * hashCode + getHeightPx().hashCode();
        }
        if (getType() != null) {
            hashCode = 31 * hashCode + getType().ordinal();
        }
        if (getWidthPx() != null) {
            hashCode = 31 * hashCode + getWidthPx().hashCode();
        }
        return hashCode;
    }

    public void setHeightPx(final com.google.common.primitives.UnsignedInteger heightPx) {
        this.heightPx = heightPx;
    }

    public void setType(final net.lab1318.costume.api.models.image.ImageType type) {
        this.type = type;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    public void setWidthPx(final com.google.common.primitives.UnsignedInteger widthPx) {
        this.widthPx = widthPx;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("url", getUrl()).add("height_px", getHeightPx()).add("type", getType()).add("width_px", getWidthPx()).toString();
    }

    private org.thryft.native_.Url url;

    private com.google.common.primitives.UnsignedInteger heightPx;

    private net.lab1318.costume.api.models.image.ImageType type;

    private com.google.common.primitives.UnsignedInteger widthPx;
}
