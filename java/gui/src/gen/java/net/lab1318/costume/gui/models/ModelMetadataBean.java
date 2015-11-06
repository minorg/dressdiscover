package net.lab1318.costume.gui.models;

public class ModelMetadataBean {
    public ModelMetadataBean() {
        ctime = null;
        mtime = null;
    }

    public ModelMetadataBean(final net.lab1318.costume.api.models.ModelMetadata other) {
        this.ctime = other.getCtime();
        this.mtime = other.getMtime();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ModelMetadataBean)) {
            return false;
        }

        final ModelMetadataBean other = (ModelMetadataBean)otherObject;
        return
            getCtime().equals(other.getCtime()) &&
            getMtime().equals(other.getMtime());
    }

    public java.util.Date getCtime() {
        return ctime;
    }

    public java.util.Date getMtime() {
        return mtime;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCtime().hashCode();
        hashCode = 31 * hashCode + getMtime().hashCode();
        return hashCode;
    }

    public void setCtime(final java.util.Date ctime) {
        this.ctime = ctime;
    }

    public void setMtime(final java.util.Date mtime) {
        this.mtime = mtime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ctime", getCtime()).add("mtime", getMtime()).toString();
    }

    private java.util.Date ctime;

    private java.util.Date mtime;
}
