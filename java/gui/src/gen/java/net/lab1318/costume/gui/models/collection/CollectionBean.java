package net.lab1318.costume.gui.models.collection;

public class CollectionBean {
    public CollectionBean() {
        institutionId = null;
        title = null;
    }

    public CollectionBean(final net.lab1318.costume.api.models.collection.Collection other) {
        this.institutionId = other.getInstitutionId();
        this.title = other.getTitle();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof CollectionBean)) {
            return false;
        }

        final CollectionBean other = (CollectionBean)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle());
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInstitutionId().ordinal();
        hashCode = 31 * hashCode + getTitle().hashCode();
        return hashCode;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("title", getTitle()).toString();
    }

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private String title;
}
