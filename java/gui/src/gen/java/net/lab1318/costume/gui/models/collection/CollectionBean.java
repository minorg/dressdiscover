package net.lab1318.costume.gui.models.collection;

public class CollectionBean {
    public CollectionBean() {
        modelMetadata = null;
        institutionId = null;
        title = null;
    }

    public CollectionBean(final net.lab1318.costume.api.models.collection.Collection other) {
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle());
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public net.lab1318.costume.gui.models.ModelMetadataBean getModelMetadata() {
        return modelMetadata;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        return hashCode;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setModelMetadata(final net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("model_metadata", getModelMetadata()).add("institution_id", getInstitutionId()).add("title", getTitle()).toString();
    }

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private String title;
}
