package net.lab1318.costume.gui.models.object;

public class ObjectSummaryBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 4, "title", org.thryft.protocol.Type.STRING),
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 6, "agent_name_texts", org.thryft.protocol.Type.LIST),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 7, "categories", org.thryft.protocol.Type.LIST),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 17, "color_texts", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<String>() {}, false, 12, "date", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "description", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 8, "gender", org.thryft.protocol.Type.STRING),
        RELATION_TEXTS("relationTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 16, "relation_texts", org.thryft.protocol.Type.LIST),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 14, "material_texts", org.thryft.protocol.Type.LIST),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 9, "subject_term_texts", org.thryft.protocol.Type.LIST),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 15, "technique_texts", org.thryft.protocol.Type.LIST),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageVersionBean>() {}, false, 10, "thumbnail", org.thryft.protocol.Type.STRUCT),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 13, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPE_TEXTS("workTypeTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 11, "work_type_texts", org.thryft.protocol.Type.LIST);

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
            case "agentNameTexts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "colorTexts": return COLOR_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "relationTexts": return RELATION_TEXTS;
            case "materialTexts": return MATERIAL_TEXTS;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            case "techniqueTexts": return TECHNIQUE_TEXTS;
            case "thumbnail": return THUMBNAIL;
            case "url": return URL;
            case "workTypeTexts": return WORK_TYPE_TEXTS;
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
            case "agent_name_texts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "color_texts": return COLOR_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "relation_texts": return RELATION_TEXTS;
            case "material_texts": return MATERIAL_TEXTS;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
            case "technique_texts": return TECHNIQUE_TEXTS;
            case "thumbnail": return THUMBNAIL;
            case "url": return URL;
            case "work_type_texts": return WORK_TYPE_TEXTS;
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

    public ObjectSummaryBean() {
        collectionId = null;
        institutionId = null;
        modelMetadata = null;
        title = null;
        agentNameTexts = null;
        categories = null;
        colorTexts = null;
        date = null;
        description = null;
        gender = null;
        relationTexts = null;
        materialTexts = null;
        subjectTermTexts = null;
        techniqueTexts = null;
        thumbnail = null;
        url = null;
        workTypeTexts = null;
    }

    public ObjectSummaryBean(final net.lab1318.costume.api.models.object.ObjectSummary other) {
        this.collectionId = other.getCollectionId();
        this.institutionId = other.getInstitutionId();
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
        this.title = other.getTitle();
        this.agentNameTexts = other.getAgentNameTexts().isPresent() ? new java.util.ArrayList<String>(other.getAgentNameTexts().get()) : null;
        this.categories = other.getCategories().isPresent() ? new java.util.ArrayList<String>(other.getCategories().get()) : null;
        this.colorTexts = other.getColorTexts().isPresent() ? new java.util.ArrayList<String>(other.getColorTexts().get()) : null;
        this.date = other.getDate().isPresent() ? other.getDate().get() : null;
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.gender = other.getGender().isPresent() ? other.getGender().get() : null;
        this.relationTexts = other.getRelationTexts().isPresent() ? new java.util.ArrayList<String>(other.getRelationTexts().get()) : null;
        this.materialTexts = other.getMaterialTexts().isPresent() ? new java.util.ArrayList<String>(other.getMaterialTexts().get()) : null;
        this.subjectTermTexts = other.getSubjectTermTexts().isPresent() ? new java.util.ArrayList<String>(other.getSubjectTermTexts().get()) : null;
        this.techniqueTexts = other.getTechniqueTexts().isPresent() ? new java.util.ArrayList<String>(other.getTechniqueTexts().get()) : null;
        this.thumbnail = other.getThumbnail().isPresent() ? new net.lab1318.costume.gui.models.image.ImageVersionBean(other.getThumbnail().get()) : null;
        this.url = other.getUrl().isPresent() ? other.getUrl().get() : null;
        this.workTypeTexts = other.getWorkTypeTexts().isPresent() ? new java.util.ArrayList<String>(other.getWorkTypeTexts().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectSummaryBean)) {
            return false;
        }

        final ObjectSummaryBean other = (ObjectSummaryBean)otherObject;
        return
            getCollectionId().equals(other.getCollectionId()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getAgentNameTexts().equals(other.getAgentNameTexts()) &&
            getCategories().equals(other.getCategories()) &&
            getColorTexts().equals(other.getColorTexts()) &&
            getDate().equals(other.getDate()) &&
            getDescription().equals(other.getDescription()) &&
            getGender().equals(other.getGender()) &&
            getRelationTexts().equals(other.getRelationTexts()) &&
            getMaterialTexts().equals(other.getMaterialTexts()) &&
            getSubjectTermTexts().equals(other.getSubjectTermTexts()) &&
            getTechniqueTexts().equals(other.getTechniqueTexts()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getUrl().equals(other.getUrl()) &&
            getWorkTypeTexts().equals(other.getWorkTypeTexts());
    }

    public java.util.List<String> getAgentNameTexts() {
        return agentNameTexts;
    }

    public java.util.List<String> getCategories() {
        return categories;
    }

    public net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public java.util.List<String> getColorTexts() {
        return colorTexts;
    }

    /**
     * Dublin Core date
     */
    public String getDate() {
        return date;
    }

    /**
     * Dublin Core description
     */
    public String getDescription() {
        return description;
    }

    public net.lab1318.costume.api.models.gender.Gender getGender() {
        return gender;
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public java.util.List<String> getMaterialTexts() {
        return materialTexts;
    }

    public net.lab1318.costume.gui.models.ModelMetadataBean getModelMetadata() {
        return modelMetadata;
    }

    public java.util.List<String> getRelationTexts() {
        return relationTexts;
    }

    public java.util.List<String> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public java.util.List<String> getTechniqueTexts() {
        return techniqueTexts;
    }

    public net.lab1318.costume.gui.models.image.ImageVersionBean getThumbnail() {
        return thumbnail;
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

    public java.util.List<String> getWorkTypeTexts() {
        return workTypeTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getAgentNameTexts() != null) {
            hashCode = 31 * hashCode + getAgentNameTexts().hashCode();
        }
        if (getCategories() != null) {
            hashCode = 31 * hashCode + getCategories().hashCode();
        }
        if (getColorTexts() != null) {
            hashCode = 31 * hashCode + getColorTexts().hashCode();
        }
        if (getDate() != null) {
            hashCode = 31 * hashCode + getDate().hashCode();
        }
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getGender() != null) {
            hashCode = 31 * hashCode + getGender().ordinal();
        }
        if (getRelationTexts() != null) {
            hashCode = 31 * hashCode + getRelationTexts().hashCode();
        }
        if (getMaterialTexts() != null) {
            hashCode = 31 * hashCode + getMaterialTexts().hashCode();
        }
        if (getSubjectTermTexts() != null) {
            hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        }
        if (getTechniqueTexts() != null) {
            hashCode = 31 * hashCode + getTechniqueTexts().hashCode();
        }
        if (getThumbnail() != null) {
            hashCode = 31 * hashCode + getThumbnail().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        if (getWorkTypeTexts() != null) {
            hashCode = 31 * hashCode + getWorkTypeTexts().hashCode();
        }
        return hashCode;
    }

    public void setAgentNameTexts(final java.util.List<String> agentNameTexts) {
        this.agentNameTexts = agentNameTexts;
    }

    public void setCategories(final java.util.List<String> categories) {
        this.categories = categories;
    }

    public void setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        this.collectionId = collectionId;
    }

    public void setColorTexts(final java.util.List<String> colorTexts) {
        this.colorTexts = colorTexts;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setGender(final net.lab1318.costume.api.models.gender.Gender gender) {
        this.gender = gender;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setMaterialTexts(final java.util.List<String> materialTexts) {
        this.materialTexts = materialTexts;
    }

    public void setModelMetadata(final net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public void setRelationTexts(final java.util.List<String> relationTexts) {
        this.relationTexts = relationTexts;
    }

    public void setSubjectTermTexts(final java.util.List<String> subjectTermTexts) {
        this.subjectTermTexts = subjectTermTexts;
    }

    public void setTechniqueTexts(final java.util.List<String> techniqueTexts) {
        this.techniqueTexts = techniqueTexts;
    }

    public void setThumbnail(final net.lab1318.costume.gui.models.image.ImageVersionBean thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    public void setWorkTypeTexts(final java.util.List<String> workTypeTexts) {
        this.workTypeTexts = workTypeTexts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("agent_name_texts", getAgentNameTexts()).add("categories", getCategories()).add("color_texts", getColorTexts()).add("date", getDate()).add("description", getDescription()).add("gender", getGender()).add("relation_texts", getRelationTexts()).add("material_texts", getMaterialTexts()).add("subject_term_texts", getSubjectTermTexts()).add("technique_texts", getTechniqueTexts()).add("thumbnail", getThumbnail()).add("url", getUrl()).add("work_type_texts", getWorkTypeTexts()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    /**
     * Dublin Core title
     */
    private String title;

    private java.util.List<String> agentNameTexts;

    private java.util.List<String> categories;

    private java.util.List<String> colorTexts;

    /**
     * Dublin Core date
     */
    private String date;

    /**
     * Dublin Core description
     */
    private String description;

    private net.lab1318.costume.api.models.gender.Gender gender;

    private java.util.List<String> relationTexts;

    private java.util.List<String> materialTexts;

    private java.util.List<String> subjectTermTexts;

    private java.util.List<String> techniqueTexts;

    private net.lab1318.costume.gui.models.image.ImageVersionBean thumbnail;

    private org.thryft.native_.Url url;

    private java.util.List<String> workTypeTexts;
}
