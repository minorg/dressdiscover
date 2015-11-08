package net.lab1318.costume.gui.models.object;

public class ObjectBean {
    public ObjectBean() {
        collectionId = null;
        institutionId = null;
        modelMetadata = null;
        title = null;
        date = null;
        dateText = null;
        description = null;
        materials = null;
        physicalDescription = null;
        provenance = null;
        summary = null;
        techniques = null;
        thumbnail = null;
        url = null;
    }

    public ObjectBean(final net.lab1318.costume.api.models.object.Object other) {
        this.collectionId = other.getCollectionId();
        this.institutionId = other.getInstitutionId();
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
        this.title = other.getTitle();
        this.date = other.getDate().isPresent() ? other.getDate().get() : null;
        this.dateText = other.getDateText().isPresent() ? other.getDateText().get() : null;
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.materials = other.getMaterials().isPresent() ? new net.lab1318.costume.gui.models.material.MaterialSetBean(other.getMaterials().get()) : null;
        this.physicalDescription = other.getPhysicalDescription().isPresent() ? other.getPhysicalDescription().get() : null;
        this.provenance = other.getProvenance().isPresent() ? other.getProvenance().get() : null;
        this.summary = other.getSummary().isPresent() ? other.getSummary().get() : null;
        this.techniques = other.getTechniques().isPresent() ? new net.lab1318.costume.gui.models.technique.TechniqueSetBean(other.getTechniques().get()) : null;
        this.thumbnail = other.getThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageBean(other.getThumbnail().get()) : null;
        this.url = other.getUrl().isPresent() ? other.getUrl().get() : null;
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
            getCollectionId().equals(other.getCollectionId()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getDate().equals(other.getDate()) &&
            getDateText().equals(other.getDateText()) &&
            getDescription().equals(other.getDescription()) &&
            getMaterials().equals(other.getMaterials()) &&
            getPhysicalDescription().equals(other.getPhysicalDescription()) &&
            getProvenance().equals(other.getProvenance()) &&
            getSummary().equals(other.getSummary()) &&
            getTechniques().equals(other.getTechniques()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getUrl().equals(other.getUrl());
    }

    public net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public java.util.Date getDate() {
        return date;
    }

    public String getDateText() {
        return dateText;
    }

    public String getDescription() {
        return description;
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public net.lab1318.costume.gui.models.material.MaterialSetBean getMaterials() {
        return materials;
    }

    public net.lab1318.costume.gui.models.ModelMetadataBean getModelMetadata() {
        return modelMetadata;
    }

    public String getPhysicalDescription() {
        return physicalDescription;
    }

    public String getProvenance() {
        return provenance;
    }

    public String getSummary() {
        return summary;
    }

    public net.lab1318.costume.gui.models.technique.TechniqueSetBean getTechniques() {
        return techniques;
    }

    public net.lab1318.costume.gui.models.image.ImageBean getThumbnail() {
        return thumbnail;
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
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDate() != null) {
            hashCode = 31 * hashCode + getDate().hashCode();
        }
        if (getDateText() != null) {
            hashCode = 31 * hashCode + getDateText().hashCode();
        }
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getMaterials() != null) {
            hashCode = 31 * hashCode + getMaterials().hashCode();
        }
        if (getPhysicalDescription() != null) {
            hashCode = 31 * hashCode + getPhysicalDescription().hashCode();
        }
        if (getProvenance() != null) {
            hashCode = 31 * hashCode + getProvenance().hashCode();
        }
        if (getSummary() != null) {
            hashCode = 31 * hashCode + getSummary().hashCode();
        }
        if (getTechniques() != null) {
            hashCode = 31 * hashCode + getTechniques().hashCode();
        }
        if (getThumbnail() != null) {
            hashCode = 31 * hashCode + getThumbnail().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        return hashCode;
    }

    public void setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        this.collectionId = collectionId;
    }

    public void setDate(final java.util.Date date) {
        this.date = date;
    }

    public void setDateText(final String dateText) {
        this.dateText = dateText;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setMaterials(final net.lab1318.costume.gui.models.material.MaterialSetBean materials) {
        this.materials = materials;
    }

    public void setModelMetadata(final net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public void setPhysicalDescription(final String physicalDescription) {
        this.physicalDescription = physicalDescription;
    }

    public void setProvenance(final String provenance) {
        this.provenance = provenance;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public void setTechniques(final net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques) {
        this.techniques = techniques;
    }

    public void setThumbnail(final net.lab1318.costume.gui.models.image.ImageBean thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("date", getDate()).add("date_text", getDateText()).add("description", getDescription()).add("materials", getMaterials()).add("physical_description", getPhysicalDescription()).add("provenance", getProvenance()).add("summary", getSummary()).add("techniques", getTechniques()).add("thumbnail", getThumbnail()).add("url", getUrl()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private String title;

    private java.util.Date date;

    private String dateText;

    private String description;

    private net.lab1318.costume.gui.models.material.MaterialSetBean materials;

    private String physicalDescription;

    private String provenance;

    private String summary;

    private net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques;

    private net.lab1318.costume.gui.models.image.ImageBean thumbnail;

    private org.thryft.native_.Url url;
}
