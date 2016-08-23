package org.dressdiscover.gui.models.image;

public class ImageVersionBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 1, "url", org.thryft.protocol.Type.STRING),
        HEIGHT_PX("heightPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 2, "height_px", org.thryft.protocol.Type.I32),
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
            case "widthPx": return WIDTH_PX;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "url": return URL;
            case "height_px": return HEIGHT_PX;
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

    public ImageVersionBean() {
        url = null;
        heightPx = null;
        widthPx = null;
    }

    public ImageVersionBean(final org.dressdiscover.api.models.image.ImageVersion other) {
        this.url = other.getUrl();
        this.heightPx = other.getHeightPx().isPresent() ? other.getHeightPx().get() : null;
        this.widthPx = other.getWidthPx().isPresent() ? other.getWidthPx().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ImageVersionBean)) {
            return false;
        }

        final ImageVersionBean other = (ImageVersionBean)otherObject;
        return
            getUrl().equals(other.getUrl()) &&
            ((getHeightPx() != null && other.getHeightPx() != null) ? (getHeightPx().equals(other.getHeightPx())) : (getHeightPx() == null && other.getHeightPx() == null)) &&
            ((getWidthPx() != null && other.getWidthPx() != null) ? (getWidthPx().equals(other.getWidthPx())) : (getWidthPx() == null && other.getWidthPx() == null));
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
        case URL: return getUrl();
        case HEIGHT_PX: return getHeightPx();
        case WIDTH_PX: return getWidthPx();
        default:
            throw new IllegalStateException();
        }
    }

    public com.google.common.primitives.UnsignedInteger getHeightPx() {
        return heightPx;
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
        if (getWidthPx() != null) {
            hashCode = 31 * hashCode + getWidthPx().hashCode();
        }
        return hashCode;
    }

    public void setHeightPx(final com.google.common.primitives.UnsignedInteger heightPx) {
        this.heightPx = heightPx;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    public void setWidthPx(final com.google.common.primitives.UnsignedInteger widthPx) {
        this.widthPx = widthPx;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("url", getUrl()).add("height_px", getHeightPx()).add("width_px", getWidthPx()).toString();
    }

    private org.thryft.native_.Url url;

    private com.google.common.primitives.UnsignedInteger heightPx;

    private com.google.common.primitives.UnsignedInteger widthPx;
}
