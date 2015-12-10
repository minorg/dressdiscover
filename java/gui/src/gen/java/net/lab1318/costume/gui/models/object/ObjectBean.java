package net.lab1318.costume.gui.models.object;

public class ObjectBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 14, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 3, "title", org.thryft.protocol.Type.STRING),
        AGENTS("agents", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.agent.AgentSetBean>() {}, false, 20, "agents", org.thryft.protocol.Type.STRUCT),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 18, "categories", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 10, "date", org.thryft.protocol.Type.I64),
        DATE_TEXT("dateText", new com.google.common.reflect.TypeToken<String>() {}, false, 11, "date_text", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING),
        HISTORY_NOTES("historyNotes", new com.google.common.reflect.TypeToken<String>() {}, false, 19, "history_notes", org.thryft.protocol.Type.STRING),
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.inscription.InscriptionSetBean>() {}, false, 17, "inscriptions", org.thryft.protocol.Type.STRUCT),
        MATERIALS("materials", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.material.MaterialSetBean>() {}, false, 15, "materials", org.thryft.protocol.Type.STRUCT),
        PHYSICAL_DESCRIPTION("physicalDescription", new com.google.common.reflect.TypeToken<String>() {}, false, 12, "physical_description", org.thryft.protocol.Type.STRING),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.rights.RightsSetBean>() {}, false, 22, "rights", org.thryft.protocol.Type.STRUCT),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.subject.SubjectSetBean>() {}, false, 21, "subjects", org.thryft.protocol.Type.STRUCT),
        SUMMARY("summary", new com.google.common.reflect.TypeToken<String>() {}, false, 7, "summary", org.thryft.protocol.Type.STRING),
        TECHNIQUES("techniques", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.technique.TechniqueSetBean>() {}, false, 16, "techniques", org.thryft.protocol.Type.STRUCT),
        IMAGES("images", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.image.ImageBean>>() {}, false, 23, "images", org.thryft.protocol.Type.LIST),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 9, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.work_type.WorkTypeSetBean>() {}, false, 24, "work_types", org.thryft.protocol.Type.STRUCT);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public int getThriftId() {
            return thriftId;
        }

        @Override
        public String getThriftProtocolKey() {
            return thriftProtocolKey;
        }

        @Override
        public org.thryft.protocol.Type getThriftProtocolType() {
            return thriftProtocolType;
        }

        @Override
        public String getThriftName() {
            return thriftName;
        }

        @Override
        public boolean hasThriftId() {
            return thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID;
        }

        @Override
        public boolean isRequired()  {
            return required;
        }

        public static FieldMetadata valueOfJavaName(final String javaName) {
            switch (javaName) {
            case "collectionId": return COLLECTION_ID;
            case "institutionId": return INSTITUTION_ID;
            case "modelMetadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "date": return DATE;
            case "dateText": return DATE_TEXT;
            case "description": return DESCRIPTION;
            case "historyNotes": return HISTORY_NOTES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "physicalDescription": return PHYSICAL_DESCRIPTION;
            case "provenance": return PROVENANCE;
            case "rights": return RIGHTS;
            case "subjects": return SUBJECTS;
            case "summary": return SUMMARY;
            case "techniques": return TECHNIQUES;
            case "images": return IMAGES;
            case "url": return URL;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "institution_id": return INSTITUTION_ID;
            case "model_metadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "date": return DATE;
            case "date_text": return DATE_TEXT;
            case "description": return DESCRIPTION;
            case "history_notes": return HISTORY_NOTES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "physical_description": return PHYSICAL_DESCRIPTION;
            case "provenance": return PROVENANCE;
            case "rights": return RIGHTS;
            case "subjects": return SUBJECTS;
            case "summary": return SUMMARY;
            case "techniques": return TECHNIQUES;
            case "images": return IMAGES;
            case "url": return URL;
            case "work_types": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            if (thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID) {
                this.thriftProtocolKey = Integer.toString(thriftId) + ":" + thriftName;
            } else {
                this.thriftProtocolKey = thriftName;
            }
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final int thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public ObjectBean() {
        collectionId = null;
        institutionId = null;
        modelMetadata = null;
        title = null;
        agents = null;
        categories = null;
        date = null;
        dateText = null;
        description = null;
        historyNotes = null;
        inscriptions = null;
        materials = null;
        physicalDescription = null;
        provenance = null;
        rights = null;
        subjects = null;
        summary = null;
        techniques = null;
        images = null;
        url = null;
        workTypes = null;
    }

    public ObjectBean(final net.lab1318.costume.api.models.object.Object other) {
        this.collectionId = other.getCollectionId();
        this.institutionId = other.getInstitutionId();
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
        this.title = other.getTitle();
        this.agents = other.getAgents().isPresent() ? new net.lab1318.costume.gui.models.agent.AgentSetBean(other.getAgents().get()) : null;
        this.categories = other.getCategories().isPresent() ? new java.util.ArrayList<String>(other.getCategories().get()) : null;
        this.date = other.getDate().isPresent() ? other.getDate().get() : null;
        this.dateText = other.getDateText().isPresent() ? other.getDateText().get() : null;
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.historyNotes = other.getHistoryNotes().isPresent() ? other.getHistoryNotes().get() : null;
        this.inscriptions = other.getInscriptions().isPresent() ? new net.lab1318.costume.gui.models.inscription.InscriptionSetBean(other.getInscriptions().get()) : null;
        this.materials = other.getMaterials().isPresent() ? new net.lab1318.costume.gui.models.material.MaterialSetBean(other.getMaterials().get()) : null;
        this.physicalDescription = other.getPhysicalDescription().isPresent() ? other.getPhysicalDescription().get() : null;
        this.provenance = other.getProvenance().isPresent() ? other.getProvenance().get() : null;
        this.rights = other.getRights().isPresent() ? new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getRights().get()) : null;
        this.subjects = other.getSubjects().isPresent() ? new net.lab1318.costume.gui.models.subject.SubjectSetBean(other.getSubjects().get()) : null;
        this.summary = other.getSummary().isPresent() ? other.getSummary().get() : null;
        this.techniques = other.getTechniques().isPresent() ? new net.lab1318.costume.gui.models.technique.TechniqueSetBean(other.getTechniques().get()) : null;
        this.images = other.getImages().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>, java.util.List<net.lab1318.costume.gui.models.image.ImageBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.image.ImageBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> other) {
                final java.util.List<net.lab1318.costume.gui.models.image.ImageBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.image.ImageBean>();
                for (final net.lab1318.costume.api.models.image.Image element : other) {
                    copy.add(new net.lab1318.costume.gui.models.image.ImageBean(element));
                }
                return copy;
            }
        }).apply(other.getImages().get()) : null;
        this.url = other.getUrl().isPresent() ? other.getUrl().get() : null;
        this.workTypes = other.getWorkTypes().isPresent() ? new net.lab1318.costume.gui.models.work_type.WorkTypeSetBean(other.getWorkTypes().get()) : null;
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
            getAgents().equals(other.getAgents()) &&
            getCategories().equals(other.getCategories()) &&
            getDate().equals(other.getDate()) &&
            getDateText().equals(other.getDateText()) &&
            getDescription().equals(other.getDescription()) &&
            getHistoryNotes().equals(other.getHistoryNotes()) &&
            getInscriptions().equals(other.getInscriptions()) &&
            getMaterials().equals(other.getMaterials()) &&
            getPhysicalDescription().equals(other.getPhysicalDescription()) &&
            getProvenance().equals(other.getProvenance()) &&
            getRights().equals(other.getRights()) &&
            getSubjects().equals(other.getSubjects()) &&
            getSummary().equals(other.getSummary()) &&
            getTechniques().equals(other.getTechniques()) &&
            getImages().equals(other.getImages()) &&
            getUrl().equals(other.getUrl()) &&
            getWorkTypes().equals(other.getWorkTypes());
    }

    public net.lab1318.costume.gui.models.agent.AgentSetBean getAgents() {
        return agents;
    }

    public java.util.List<String> getCategories() {
        return categories;
    }

    public net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public java.util.Date getDate() {
        return date;
    }

    /**
     * Dublin Core freetext date
     */
    public String getDateText() {
        return dateText;
    }

    /**
     * Dublin Core description
     */
    public String getDescription() {
        return description;
    }

    public String getHistoryNotes() {
        return historyNotes;
    }

    public java.util.List<net.lab1318.costume.gui.models.image.ImageBean> getImages() {
        return images;
    }

    public net.lab1318.costume.gui.models.inscription.InscriptionSetBean getInscriptions() {
        return inscriptions;
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

    /**
     * Dublin Core freetext provenance
     */
    public String getProvenance() {
        return provenance;
    }

    public net.lab1318.costume.gui.models.rights.RightsSetBean getRights() {
        return rights;
    }

    public net.lab1318.costume.gui.models.subject.SubjectSetBean getSubjects() {
        return subjects;
    }

    public String getSummary() {
        return summary;
    }

    public net.lab1318.costume.gui.models.technique.TechniqueSetBean getTechniques() {
        return techniques;
    }

    /**
     * Dublin Core title
     */
    public String getTitle() {
        return title;
    }

    public org.thryft.native_.Url getUrl() {
        return url;
    }

    public net.lab1318.costume.gui.models.work_type.WorkTypeSetBean getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getAgents() != null) {
            hashCode = 31 * hashCode + getAgents().hashCode();
        }
        if (getCategories() != null) {
            hashCode = 31 * hashCode + getCategories().hashCode();
        }
        if (getDate() != null) {
            hashCode = 31 * hashCode + getDate().hashCode();
        }
        if (getDateText() != null) {
            hashCode = 31 * hashCode + getDateText().hashCode();
        }
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getHistoryNotes() != null) {
            hashCode = 31 * hashCode + getHistoryNotes().hashCode();
        }
        if (getInscriptions() != null) {
            hashCode = 31 * hashCode + getInscriptions().hashCode();
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
        if (getRights() != null) {
            hashCode = 31 * hashCode + getRights().hashCode();
        }
        if (getSubjects() != null) {
            hashCode = 31 * hashCode + getSubjects().hashCode();
        }
        if (getSummary() != null) {
            hashCode = 31 * hashCode + getSummary().hashCode();
        }
        if (getTechniques() != null) {
            hashCode = 31 * hashCode + getTechniques().hashCode();
        }
        if (getImages() != null) {
            hashCode = 31 * hashCode + getImages().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        if (getWorkTypes() != null) {
            hashCode = 31 * hashCode + getWorkTypes().hashCode();
        }
        return hashCode;
    }

    public void setAgents(final net.lab1318.costume.gui.models.agent.AgentSetBean agents) {
        this.agents = agents;
    }

    public void setCategories(final java.util.List<String> categories) {
        this.categories = categories;
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

    public void setHistoryNotes(final String historyNotes) {
        this.historyNotes = historyNotes;
    }

    public void setImages(final java.util.List<net.lab1318.costume.gui.models.image.ImageBean> images) {
        this.images = images;
    }

    public void setInscriptions(final net.lab1318.costume.gui.models.inscription.InscriptionSetBean inscriptions) {
        this.inscriptions = inscriptions;
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

    public void setRights(final net.lab1318.costume.gui.models.rights.RightsSetBean rights) {
        this.rights = rights;
    }

    public void setSubjects(final net.lab1318.costume.gui.models.subject.SubjectSetBean subjects) {
        this.subjects = subjects;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public void setTechniques(final net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques) {
        this.techniques = techniques;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    public void setWorkTypes(final net.lab1318.costume.gui.models.work_type.WorkTypeSetBean workTypes) {
        this.workTypes = workTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("agents", getAgents()).add("categories", getCategories()).add("date", getDate()).add("date_text", getDateText()).add("description", getDescription()).add("history_notes", getHistoryNotes()).add("inscriptions", getInscriptions()).add("materials", getMaterials()).add("physical_description", getPhysicalDescription()).add("provenance", getProvenance()).add("rights", getRights()).add("subjects", getSubjects()).add("summary", getSummary()).add("techniques", getTechniques()).add("images", getImages()).add("url", getUrl()).add("work_types", getWorkTypes()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    /**
     * Dublin Core title
     */
    private String title;

    private net.lab1318.costume.gui.models.agent.AgentSetBean agents;

    private java.util.List<String> categories;

    private java.util.Date date;

    /**
     * Dublin Core freetext date
     */
    private String dateText;

    /**
     * Dublin Core description
     */
    private String description;

    private String historyNotes;

    private net.lab1318.costume.gui.models.inscription.InscriptionSetBean inscriptions;

    private net.lab1318.costume.gui.models.material.MaterialSetBean materials;

    private String physicalDescription;

    /**
     * Dublin Core freetext provenance
     */
    private String provenance;

    private net.lab1318.costume.gui.models.rights.RightsSetBean rights;

    private net.lab1318.costume.gui.models.subject.SubjectSetBean subjects;

    private String summary;

    private net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques;

    private java.util.List<net.lab1318.costume.gui.models.image.ImageBean> images;

    private org.thryft.native_.Url url;

    private net.lab1318.costume.gui.models.work_type.WorkTypeSetBean workTypes;
}
