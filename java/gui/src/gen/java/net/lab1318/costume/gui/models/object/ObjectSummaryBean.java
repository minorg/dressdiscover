package net.lab1318.costume.gui.models.object;

public class ObjectSummaryBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 4, "title", org.thryft.protocol.Type.STRING),
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 6, "agent_name_texts", org.thryft.protocol.Type.LIST),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 7, "categories", org.thryft.protocol.Type.LIST),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 17, "color_texts", org.thryft.protocol.Type.LIST),
        CULTURAL_CONTEXT_TEXTS("culturalContextTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 18, "cultural_context_texts", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<String>() {}, false, 12, "date", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "description", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 8, "gender", org.thryft.protocol.Type.STRING),
        IMAGE("image", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.image.ImageBean>() {}, false, 21, "image", org.thryft.protocol.Type.STRUCT),
        LOCATION_NAME_TEXTS("locationNameTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 19, "location_name_texts", org.thryft.protocol.Type.LIST),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 14, "material_texts", org.thryft.protocol.Type.LIST),
        RELATION_TEXTS("relationTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 16, "relation_texts", org.thryft.protocol.Type.LIST),
        STRUCTURE_TEXTS("structureTexts", new com.google.common.reflect.TypeToken<java.util.Map<String, String>>() {}, false, 20, "structure_texts", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 9, "subject_term_texts", org.thryft.protocol.Type.LIST),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 15, "technique_texts", org.thryft.protocol.Type.LIST),
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
            case "culturalContextTexts": return CULTURAL_CONTEXT_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "image": return IMAGE;
            case "locationNameTexts": return LOCATION_NAME_TEXTS;
            case "materialTexts": return MATERIAL_TEXTS;
            case "relationTexts": return RELATION_TEXTS;
            case "structureTexts": return STRUCTURE_TEXTS;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            case "techniqueTexts": return TECHNIQUE_TEXTS;
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
            case "cultural_context_texts": return CULTURAL_CONTEXT_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "image": return IMAGE;
            case "location_name_texts": return LOCATION_NAME_TEXTS;
            case "material_texts": return MATERIAL_TEXTS;
            case "relation_texts": return RELATION_TEXTS;
            case "structure_texts": return STRUCTURE_TEXTS;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
            case "technique_texts": return TECHNIQUE_TEXTS;
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
        culturalContextTexts = null;
        date = null;
        description = null;
        gender = null;
        image = null;
        locationNameTexts = null;
        materialTexts = null;
        relationTexts = null;
        structureTexts = null;
        subjectTermTexts = null;
        techniqueTexts = null;
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
        this.culturalContextTexts = other.getCulturalContextTexts().isPresent() ? new java.util.ArrayList<String>(other.getCulturalContextTexts().get()) : null;
        this.date = other.getDate().isPresent() ? other.getDate().get() : null;
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.gender = other.getGender().isPresent() ? other.getGender().get() : null;
        this.image = other.getImage().isPresent() ? new net.lab1318.costume.gui.models.image.ImageBean(other.getImage().get()) : null;
        this.locationNameTexts = other.getLocationNameTexts().isPresent() ? new java.util.ArrayList<String>(other.getLocationNameTexts().get()) : null;
        this.materialTexts = other.getMaterialTexts().isPresent() ? new java.util.ArrayList<String>(other.getMaterialTexts().get()) : null;
        this.relationTexts = other.getRelationTexts().isPresent() ? new java.util.ArrayList<String>(other.getRelationTexts().get()) : null;
        this.structureTexts = other.getStructureTexts().isPresent() ? new java.util.HashMap<String, String>(other.getStructureTexts().get()) : null;
        this.subjectTermTexts = other.getSubjectTermTexts().isPresent() ? new java.util.ArrayList<String>(other.getSubjectTermTexts().get()) : null;
        this.techniqueTexts = other.getTechniqueTexts().isPresent() ? new java.util.ArrayList<String>(other.getTechniqueTexts().get()) : null;
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
            (getAgentNameTexts() != null ? getAgentNameTexts().equals(other.getAgentNameTexts()) : other.getAgentNameTexts() == null) &&
            (getCategories() != null ? getCategories().equals(other.getCategories()) : other.getCategories() == null) &&
            (getColorTexts() != null ? getColorTexts().equals(other.getColorTexts()) : other.getColorTexts() == null) &&
            (getCulturalContextTexts() != null ? getCulturalContextTexts().equals(other.getCulturalContextTexts()) : other.getCulturalContextTexts() == null) &&
            (getDate() != null ? getDate().equals(other.getDate()) : other.getDate() == null) &&
            (getDescription() != null ? getDescription().equals(other.getDescription()) : other.getDescription() == null) &&
            (getGender() != null ? getGender().equals(other.getGender()) : other.getGender() == null) &&
            (getImage() != null ? getImage().equals(other.getImage()) : other.getImage() == null) &&
            (getLocationNameTexts() != null ? getLocationNameTexts().equals(other.getLocationNameTexts()) : other.getLocationNameTexts() == null) &&
            (getMaterialTexts() != null ? getMaterialTexts().equals(other.getMaterialTexts()) : other.getMaterialTexts() == null) &&
            (getRelationTexts() != null ? getRelationTexts().equals(other.getRelationTexts()) : other.getRelationTexts() == null) &&
            (getStructureTexts() != null ? getStructureTexts().equals(other.getStructureTexts()) : other.getStructureTexts() == null) &&
            (getSubjectTermTexts() != null ? getSubjectTermTexts().equals(other.getSubjectTermTexts()) : other.getSubjectTermTexts() == null) &&
            (getTechniqueTexts() != null ? getTechniqueTexts().equals(other.getTechniqueTexts()) : other.getTechniqueTexts() == null) &&
            (getUrl() != null ? getUrl().equals(other.getUrl()) : other.getUrl() == null) &&
            (getWorkTypeTexts() != null ? getWorkTypeTexts().equals(other.getWorkTypeTexts()) : other.getWorkTypeTexts() == null);
    }

    @Override
    public java.lang.Object get(final String fieldThriftName) {
        return get(FieldMetadata.valueOfThriftName(fieldThriftName));
    }

    @Override
    public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
        if (!(fieldMetadata instanceof FieldMetadata)) {
            throw new IllegalArgumentException();
        }
        return get((FieldMetadata)fieldMetadata);
    }

    public java.lang.Object get(final FieldMetadata fieldMetadata) {
        switch (fieldMetadata) {
        case COLLECTION_ID: return getCollectionId();
        case INSTITUTION_ID: return getInstitutionId();
        case MODEL_METADATA: return getModelMetadata();
        case TITLE: return getTitle();
        case AGENT_NAME_TEXTS: return getAgentNameTexts();
        case CATEGORIES: return getCategories();
        case COLOR_TEXTS: return getColorTexts();
        case CULTURAL_CONTEXT_TEXTS: return getCulturalContextTexts();
        case DATE: return getDate();
        case DESCRIPTION: return getDescription();
        case GENDER: return getGender();
        case IMAGE: return getImage();
        case LOCATION_NAME_TEXTS: return getLocationNameTexts();
        case MATERIAL_TEXTS: return getMaterialTexts();
        case RELATION_TEXTS: return getRelationTexts();
        case STRUCTURE_TEXTS: return getStructureTexts();
        case SUBJECT_TERM_TEXTS: return getSubjectTermTexts();
        case TECHNIQUE_TEXTS: return getTechniqueTexts();
        case URL: return getUrl();
        case WORK_TYPE_TEXTS: return getWorkTypeTexts();
        default:
            throw new IllegalStateException();
        }
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

    public java.util.List<String> getCulturalContextTexts() {
        return culturalContextTexts;
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

    public net.lab1318.costume.gui.models.image.ImageBean getImage() {
        return image;
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public java.util.List<String> getLocationNameTexts() {
        return locationNameTexts;
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

    public java.util.Map<String, String> getStructureTexts() {
        return structureTexts;
    }

    public java.util.List<String> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public java.util.List<String> getTechniqueTexts() {
        return techniqueTexts;
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
        if (getCulturalContextTexts() != null) {
            hashCode = 31 * hashCode + getCulturalContextTexts().hashCode();
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
        if (getImage() != null) {
            hashCode = 31 * hashCode + getImage().hashCode();
        }
        if (getLocationNameTexts() != null) {
            hashCode = 31 * hashCode + getLocationNameTexts().hashCode();
        }
        if (getMaterialTexts() != null) {
            hashCode = 31 * hashCode + getMaterialTexts().hashCode();
        }
        if (getRelationTexts() != null) {
            hashCode = 31 * hashCode + getRelationTexts().hashCode();
        }
        if (getStructureTexts() != null) {
            hashCode = 31 * hashCode + getStructureTexts().hashCode();
        }
        if (getSubjectTermTexts() != null) {
            hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        }
        if (getTechniqueTexts() != null) {
            hashCode = 31 * hashCode + getTechniqueTexts().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        if (getWorkTypeTexts() != null) {
            hashCode = 31 * hashCode + getWorkTypeTexts().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
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

    public void setCulturalContextTexts(final java.util.List<String> culturalContextTexts) {
        this.culturalContextTexts = culturalContextTexts;
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

    public void setImage(final net.lab1318.costume.gui.models.image.ImageBean image) {
        this.image = image;
    }

    public void setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setLocationNameTexts(final java.util.List<String> locationNameTexts) {
        this.locationNameTexts = locationNameTexts;
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

    public void setStructureTexts(final java.util.Map<String, String> structureTexts) {
        this.structureTexts = structureTexts;
    }

    public void setSubjectTermTexts(final java.util.List<String> subjectTermTexts) {
        this.subjectTermTexts = subjectTermTexts;
    }

    public void setTechniqueTexts(final java.util.List<String> techniqueTexts) {
        this.techniqueTexts = techniqueTexts;
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
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("agent_name_texts", getAgentNameTexts()).add("categories", getCategories()).add("color_texts", getColorTexts()).add("cultural_context_texts", getCulturalContextTexts()).add("date", getDate()).add("description", getDescription()).add("gender", getGender()).add("image", getImage()).add("location_name_texts", getLocationNameTexts()).add("material_texts", getMaterialTexts()).add("relation_texts", getRelationTexts()).add("structure_texts", getStructureTexts()).add("subject_term_texts", getSubjectTermTexts()).add("technique_texts", getTechniqueTexts()).add("url", getUrl()).add("work_type_texts", getWorkTypeTexts()).toString();
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

    private java.util.List<String> culturalContextTexts;

    /**
     * Dublin Core date
     */
    private String date;

    /**
     * Dublin Core description
     */
    private String description;

    private net.lab1318.costume.api.models.gender.Gender gender;

    private net.lab1318.costume.gui.models.image.ImageBean image;

    private java.util.List<String> locationNameTexts;

    private java.util.List<String> materialTexts;

    private java.util.List<String> relationTexts;

    private java.util.Map<String, String> structureTexts;

    private java.util.List<String> subjectTermTexts;

    private java.util.List<String> techniqueTexts;

    private org.thryft.native_.Url url;

    private java.util.List<String> workTypeTexts;
}
