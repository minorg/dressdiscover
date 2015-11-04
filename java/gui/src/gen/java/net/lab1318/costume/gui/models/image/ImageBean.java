package net.lab1318.costume.gui.models.image;

public class ImageBean {
    public ImageBean() {
        url = null;
        heightPx = null;
        widthPx = null;
    }

    public ImageBean(final net.lab1318.costume.api.models.image.Image other) {
        this.url = other.getUrl();
        this.heightPx = other.getHeightPx().isPresent() ? other.getHeightPx().get() : null;
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
            getWidthPx().equals(other.getWidthPx());
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
