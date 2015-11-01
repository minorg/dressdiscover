package net.lab1318.costume.gui.models.institution;

public class InstitutionBean {
    public InstitutionBean() {
        title = null;
    }

    public InstitutionBean(final net.lab1318.costume.api.models.institution.Institution other) {
        this.title = other.getTitle();
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
            getTitle().equals(other.getTitle());
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        return hashCode;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).toString();
    }

    private String title;
}
