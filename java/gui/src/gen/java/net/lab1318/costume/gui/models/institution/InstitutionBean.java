package net.lab1318.costume.gui.models.institution;

public class InstitutionBean {
    public InstitutionBean() {
        copyrightNotice = null;
        title = null;
        url = null;
    }

    public InstitutionBean(final net.lab1318.costume.api.models.institution.Institution other) {
        this.copyrightNotice = other.getCopyrightNotice();
        this.title = other.getTitle();
        this.url = other.getUrl();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InstitutionBean)) {
            return false;
        }

        final InstitutionBean other = (InstitutionBean)otherObject;
        return
            getCopyrightNotice().equals(other.getCopyrightNotice()) &&
            getTitle().equals(other.getTitle()) &&
            getUrl().equals(other.getUrl());
    }

    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    public String getTitle() {
        return title;
    }

    public org.thryft.native_.Url getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCopyrightNotice().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        hashCode = 31 * hashCode + getUrl().hashCode();
        return hashCode;
    }

    public void setCopyrightNotice(final String copyrightNotice) {
        this.copyrightNotice = copyrightNotice;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("copyright_notice", getCopyrightNotice()).add("title", getTitle()).add("url", getUrl()).toString();
    }

    private String copyrightNotice;

    private String title;

    private org.thryft.native_.Url url;
}
