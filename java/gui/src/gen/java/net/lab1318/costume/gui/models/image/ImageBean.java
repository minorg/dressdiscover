package net.lab1318.costume.gui.models.image;

public class ImageBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ALT("alt", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "alt", org.thryft.protocol.Type.STRING),
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 3, "original", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 5, "thumbnail", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, false, 6, "title", org.thryft.protocol.Type.STRING);

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
            case "alt": return ALT;
            case "fullSize": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "squareThumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            case "title": return TITLE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "alt": return ALT;
            case "full_size": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "square_thumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            case "title": return TITLE;
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
        alt = null;
        fullSize = null;
        original = null;
        squareThumbnail = null;
        thumbnail = null;
        title = null;
    }

    public ImageBean(final net.lab1318.costume.api.models.image.Image other) {
        this.alt = other.getAlt().isPresent() ? other.getAlt().get() : null;
        this.fullSize = other.getFullSize().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getFullSize().get()) : null;
        this.original = other.getOriginal().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getOriginal().get()) : null;
        this.squareThumbnail = other.getSquareThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getSquareThumbnail().get()) : null;
        this.thumbnail = other.getThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getThumbnail().get()) : null;
        this.title = other.getTitle().isPresent() ? other.getTitle().get() : null;
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
            getAlt().equals(other.getAlt()) &&
            getFullSize().equals(other.getFullSize()) &&
            getOriginal().equals(other.getOriginal()) &&
            getSquareThumbnail().equals(other.getSquareThumbnail()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getTitle().equals(other.getTitle());
    }

    public String getAlt() {
        return alt;
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

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAlt() != null) {
            hashCode = 31 * hashCode + getAlt().hashCode();
        }
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
        if (getTitle() != null) {
            hashCode = 31 * hashCode + getTitle().hashCode();
        }
        return hashCode;
    }

    public void setAlt(final String alt) {
        this.alt = alt;
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

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("alt", getAlt()).add("full_size", getFullSize()).add("original", getOriginal()).add("square_thumbnail", getSquareThumbnail()).add("thumbnail", getThumbnail()).add("title", getTitle()).toString();
    }

    private String alt;

    private net.lab1318.costume.gui.models.image.ImageVersionBean fullSize;

    private net.lab1318.costume.gui.models.image.ImageVersionBean original;

    private net.lab1318.costume.gui.models.image.ImageVersionBean squareThumbnail;

    private net.lab1318.costume.gui.models.image.ImageVersionBean thumbnail;

    private String title;
}
