package net.lab1318.costume.gui.models.object;

public class ObjectBean {
    public ObjectBean() {
        collectionId = null;
        institutionId = null;
        title = null;
        description = null;
        provenance = null;
        sourceId = null;
        summary = null;
        thumbnailUrl = null;
        url = null;
    }

    public ObjectBean(final net.lab1318.costume.api.models.object.Object other) {
        this.collectionId = other.getCollectionId();
        this.institutionId = other.getInstitutionId();
        this.title = other.getTitle();
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.provenance = other.getProvenance().isPresent() ? other.getProvenance().get() : null;
        this.sourceId = other.getSourceId().isPresent() ? other.getSourceId().get() : null;
        this.summary = other.getSummary().isPresent() ? other.getSummary().get() : null;
        this.thumbnailUrl = other.getThumbnailUrl().isPresent() ? other.getThumbnailUrl().get() : null;
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
            getTitle().equals(other.getTitle()) &&
            getDescription().equals(other.getDescription()) &&
            getProvenance().equals(other.getProvenance()) &&
            getSourceId().equals(other.getSourceId()) &&
            getSummary().equals(other.getSummary()) &&
            getThumbnailUrl().equals(other.getThumbnailUrl()) &&
            getUrl().equals(other.getUrl());
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

    public String getProvenance() {
        return provenance;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getSummary() {
        return summary;
    }

    public org.thryft.native_.Url getThumbnailUrl() {
        return thumbnailUrl;
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
        hashCode = 31 * hashCode + getInstitutionId().ordinal();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getProvenance() != null) {
            hashCode = 31 * hashCode + getProvenance().hashCode();
        }
        if (getSourceId() != null) {
            hashCode = 31 * hashCode + getSourceId().hashCode();
        }
        if (getSummary() != null) {
            hashCode = 31 * hashCode + getSummary().hashCode();
        }
        if (getThumbnailUrl() != null) {
            hashCode = 31 * hashCode + getThumbnailUrl().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
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

    public void setProvenance(final String provenance) {
        this.provenance = provenance;
    }

    public void setSourceId(final String sourceId) {
        this.sourceId = sourceId;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public void setThumbnailUrl(final org.thryft.native_.Url thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("title", getTitle()).add("description", getDescription()).add("provenance", getProvenance()).add("source_id", getSourceId()).add("summary", getSummary()).add("thumbnail_url", getThumbnailUrl()).add("url", getUrl()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private String title;

    private String description;

    private String provenance;

    private String sourceId;

    private String summary;

    private org.thryft.native_.Url thumbnailUrl;

    private org.thryft.native_.Url url;
}
