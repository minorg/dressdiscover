package net.lab1318.costume.gui.models.institution;

public class InstitutionBean {
    public InstitutionBean() {
        dataRights = null;
        modelMetadata = null;
        title = null;
        url = null;
    }

    public InstitutionBean(final net.lab1318.costume.api.models.institution.Institution other) {
        this.dataRights = new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getDataRights());
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
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
            getDataRights().equals(other.getDataRights()) &&
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getUrl().equals(other.getUrl());
    }

    public net.lab1318.costume.gui.models.rights.RightsSetBean getDataRights() {
        return dataRights;
    }

    public net.lab1318.costume.gui.models.ModelMetadataBean getModelMetadata() {
        return modelMetadata;
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
        hashCode = 31 * hashCode + getDataRights().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        hashCode = 31 * hashCode + getUrl().hashCode();
        return hashCode;
    }

    public void setDataRights(final net.lab1318.costume.gui.models.rights.RightsSetBean dataRights) {
        this.dataRights = dataRights;
    }

    public void setModelMetadata(final net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("data_rights", getDataRights()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("url", getUrl()).toString();
    }

    private net.lab1318.costume.gui.models.rights.RightsSetBean dataRights;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private String title;

    private org.thryft.native_.Url url;
}
