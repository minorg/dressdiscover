package net.lab1318.costume.gui.models.object;

public class ObjectBean {
    public ObjectBean() {
        institutionId = null;
        title = null;
        collectionId = null;
        description = null;
    }

    public ObjectBean(final net.lab1318.costume.api.models.object.Object other) {
        this.institutionId = other.getInstitutionId();
        this.title = other.getTitle();
        this.collectionId = other.getCollectionId().isPresent() ? other.getCollectionId().get() : null;
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectBean)) {
            return false;
        }

        final ObjectBean other = (ObjectBean)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            getCollectionId().equals(other.getCollectionId()) &&
            getDescription().equals(other.getDescription());
    }

    public net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public String getDescription() {
        return description;
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
        if (getCollectionId() != null) {
            hashCode = 31 * hashCode + getCollectionId().hashCode();
        }
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        return hashCode;
    }

    public void setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        this.collectionId = collectionId;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("title", getTitle()).add("collection_id", getCollectionId()).add("description", getDescription()).toString();
    }

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private String title;

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private String description;
}
