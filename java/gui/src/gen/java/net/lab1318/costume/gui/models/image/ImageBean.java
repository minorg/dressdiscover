package net.lab1318.costume.gui.models.image;

public class ImageBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 3, "original", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 5, "thumbnail", org.thryft.protocol.Type.STRUCT);

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
            case "fullSize": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "squareThumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "full_size": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "square_thumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
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
        fullSize = null;
        original = null;
        squareThumbnail = null;
        thumbnail = null;
    }

    public ImageBean(final net.lab1318.costume.api.models.image.Image other) {
        this.fullSize = other.getFullSize().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getFullSize().get()) : null;
        this.original = other.getOriginal().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getOriginal().get()) : null;
        this.squareThumbnail = other.getSquareThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getSquareThumbnail().get()) : null;
        this.thumbnail = other.getThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getThumbnail().get()) : null;
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
            (getFullSize() != null ? getFullSize().equals(other.getFullSize()) : other.getFullSize() == null) &&
            (getOriginal() != null ? getOriginal().equals(other.getOriginal()) : other.getOriginal() == null) &&
            (getSquareThumbnail() != null ? getSquareThumbnail().equals(other.getSquareThumbnail()) : other.getSquareThumbnail() == null) &&
            (getThumbnail() != null ? getThumbnail().equals(other.getThumbnail()) : other.getThumbnail() == null);
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
        case FULL_SIZE: return getFullSize();
        case ORIGINAL: return getOriginal();
        case SQUARE_THUMBNAIL: return getSquareThumbnail();
        case THUMBNAIL: return getThumbnail();
        default:
            throw new IllegalStateException();
        }
    }

    public net.lab1318.costume.gui.models.image.ImageVersionBean getFullSize() {
        return fullSize;
    }

    public net.lab1318.costume.gui.models.image.ImageVersionBean getOriginal() {
        return original;
    }

    public net.lab1318.costume.gui.models.image.ImageVersionBean getSquareThumbnail() {
        return squareThumbnail;
    }

    public net.lab1318.costume.gui.models.image.ImageVersionBean getThumbnail() {
        return thumbnail;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFullSize() != null) {
            hashCode = 31 * hashCode + getFullSize().hashCode();
        }
        if (getOriginal() != null) {
            hashCode = 31 * hashCode + getOriginal().hashCode();
        }
        if (getSquareThumbnail() != null) {
            hashCode = 31 * hashCode + getSquareThumbnail().hashCode();
        }
        if (getThumbnail() != null) {
            hashCode = 31 * hashCode + getThumbnail().hashCode();
        }
        return hashCode;
    }

    public void setFullSize(final net.lab1318.costume.gui.models.image.ImageVersionBean fullSize) {
        this.fullSize = fullSize;
    }

    public void setOriginal(final net.lab1318.costume.gui.models.image.ImageVersionBean original) {
        this.original = original;
    }

    public void setSquareThumbnail(final net.lab1318.costume.gui.models.image.ImageVersionBean squareThumbnail) {
        this.squareThumbnail = squareThumbnail;
    }

    public void setThumbnail(final net.lab1318.costume.gui.models.image.ImageVersionBean thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("full_size", getFullSize()).add("original", getOriginal()).add("square_thumbnail", getSquareThumbnail()).add("thumbnail", getThumbnail()).toString();
    }

    private net.lab1318.costume.gui.models.image.ImageVersionBean fullSize;

    private net.lab1318.costume.gui.models.image.ImageVersionBean original;

    private net.lab1318.costume.gui.models.image.ImageVersionBean squareThumbnail;

    private net.lab1318.costume.gui.models.image.ImageVersionBean thumbnail;
}
