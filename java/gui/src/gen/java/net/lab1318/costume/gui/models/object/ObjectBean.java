package net.lab1318.costume.gui.models.object;

public class ObjectBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 14, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLES("titles", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.title.TitleSetBean>() {}, true, 3, "titles", org.thryft.protocol.Type.STRUCT),
        AGENTS("agents", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.agent.AgentSetBean>() {}, false, 20, "agents", org.thryft.protocol.Type.STRUCT),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 18, "categories", org.thryft.protocol.Type.LIST),
        CONDITION("condition", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.condition.Condition>() {}, false, 27, "condition", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.date.DateSetBean>() {}, false, 10, "dates", org.thryft.protocol.Type.STRUCT),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.description.DescriptionSetBean>() {}, false, 4, "descriptions", org.thryft.protocol.Type.STRUCT),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 25, "gender", org.thryft.protocol.Type.STRING),
        IMAGES("images", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.image.ImageBean>>() {}, false, 23, "images", org.thryft.protocol.Type.LIST),
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.inscription.InscriptionSetBean>() {}, false, 17, "inscriptions", org.thryft.protocol.Type.STRUCT),
        MATERIALS("materials", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.material.MaterialSetBean>() {}, false, 15, "materials", org.thryft.protocol.Type.STRUCT),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 26, "quantity", org.thryft.protocol.Type.I32),
        RELATIONS("relations", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.relation.RelationSetBean>() {}, false, 29, "relations", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.rights.RightsSetBean>() {}, false, 22, "rights", org.thryft.protocol.Type.STRUCT),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.subject.SubjectSetBean>() {}, false, 21, "subjects", org.thryft.protocol.Type.STRUCT),
        TECHNIQUES("techniques", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.technique.TechniqueSetBean>() {}, false, 16, "techniques", org.thryft.protocol.Type.STRUCT),
        TEXTREFS("textrefs", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.textref.TextrefSetBean>() {}, false, 9, "textrefs", org.thryft.protocol.Type.STRUCT),
        VIEW_TYPE("viewType", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.view_type.ViewType>() {}, false, 28, "view_type", org.thryft.protocol.Type.STRING),
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
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "condition": return CONDITION;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "subjects": return SUBJECTS;
            case "techniques": return TECHNIQUES;
            case "textrefs": return TEXTREFS;
            case "viewType": return VIEW_TYPE;
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
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "condition": return CONDITION;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "subjects": return SUBJECTS;
            case "techniques": return TECHNIQUES;
            case "textrefs": return TEXTREFS;
            case "view_type": return VIEW_TYPE;
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
        titles = null;
        agents = null;
        categories = null;
        condition = null;
        dates = null;
        descriptions = null;
        gender = null;
        images = null;
        inscriptions = null;
        materials = null;
        provenance = null;
        quantity = null;
        relations = null;
        rights = null;
        subjects = null;
        techniques = null;
        textrefs = null;
        viewType = null;
        workTypes = null;
    }

    public ObjectBean(final net.lab1318.costume.api.models.object.Object other) {
        this.collectionId = other.getCollectionId();
        this.institutionId = other.getInstitutionId();
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
        this.titles = new net.lab1318.costume.gui.models.title.TitleSetBean(other.getTitles());
        this.agents = other.getAgents().isPresent() ? new net.lab1318.costume.gui.models.agent.AgentSetBean(other.getAgents().get()) : null;
        this.categories = other.getCategories().isPresent() ? new java.util.ArrayList<String>(other.getCategories().get()) : null;
        this.condition = other.getCondition().isPresent() ? other.getCondition().get() : null;
        this.dates = other.getDates().isPresent() ? new net.lab1318.costume.gui.models.date.DateSetBean(other.getDates().get()) : null;
        this.descriptions = other.getDescriptions().isPresent() ? new net.lab1318.costume.gui.models.description.DescriptionSetBean(other.getDescriptions().get()) : null;
        this.gender = other.getGender().isPresent() ? other.getGender().get() : null;
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
        this.inscriptions = other.getInscriptions().isPresent() ? new net.lab1318.costume.gui.models.inscription.InscriptionSetBean(other.getInscriptions().get()) : null;
        this.materials = other.getMaterials().isPresent() ? new net.lab1318.costume.gui.models.material.MaterialSetBean(other.getMaterials().get()) : null;
        this.provenance = other.getProvenance().isPresent() ? other.getProvenance().get() : null;
        this.quantity = other.getQuantity().isPresent() ? other.getQuantity().get() : null;
        this.relations = other.getRelations().isPresent() ? new net.lab1318.costume.gui.models.relation.RelationSetBean(other.getRelations().get()) : null;
        this.rights = other.getRights().isPresent() ? new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getRights().get()) : null;
        this.subjects = other.getSubjects().isPresent() ? new net.lab1318.costume.gui.models.subject.SubjectSetBean(other.getSubjects().get()) : null;
        this.techniques = other.getTechniques().isPresent() ? new net.lab1318.costume.gui.models.technique.TechniqueSetBean(other.getTechniques().get()) : null;
        this.textrefs = other.getTextrefs().isPresent() ? new net.lab1318.costume.gui.models.textref.TextrefSetBean(other.getTextrefs().get()) : null;
        this.viewType = other.getViewType().isPresent() ? other.getViewType().get() : null;
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
            getTitles().equals(other.getTitles()) &&
            getAgents().equals(other.getAgents()) &&
            getCategories().equals(other.getCategories()) &&
            getCondition().equals(other.getCondition()) &&
            getDates().equals(other.getDates()) &&
            getDescriptions().equals(other.getDescriptions()) &&
            getGender().equals(other.getGender()) &&
            getImages().equals(other.getImages()) &&
            getInscriptions().equals(other.getInscriptions()) &&
            getMaterials().equals(other.getMaterials()) &&
            getProvenance().equals(other.getProvenance()) &&
            getQuantity().equals(other.getQuantity()) &&
            getRelations().equals(other.getRelations()) &&
            getRights().equals(other.getRights()) &&
            getSubjects().equals(other.getSubjects()) &&
            getTechniques().equals(other.getTechniques()) &&
            getTextrefs().equals(other.getTextrefs()) &&
            getViewType().equals(other.getViewType()) &&
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

    public net.lab1318.costume.api.models.condition.Condition getCondition() {
        return condition;
    }

    public net.lab1318.costume.gui.models.date.DateSetBean getDates() {
        return dates;
    }

    public net.lab1318.costume.gui.models.description.DescriptionSetBean getDescriptions() {
        return descriptions;
    }

    public net.lab1318.costume.api.models.gender.Gender getGender() {
        return gender;
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

    /**
     * Dublin Core freetext provenance
     */
    public String getProvenance() {
        return provenance;
    }

    public com.google.common.primitives.UnsignedInteger getQuantity() {
        return quantity;
    }

    public net.lab1318.costume.gui.models.relation.RelationSetBean getRelations() {
        return relations;
    }

    public net.lab1318.costume.gui.models.rights.RightsSetBean getRights() {
        return rights;
    }

    public net.lab1318.costume.gui.models.subject.SubjectSetBean getSubjects() {
        return subjects;
    }

    public net.lab1318.costume.gui.models.technique.TechniqueSetBean getTechniques() {
        return techniques;
    }

    public net.lab1318.costume.gui.models.textref.TextrefSetBean getTextrefs() {
        return textrefs;
    }

    public net.lab1318.costume.gui.models.title.TitleSetBean getTitles() {
        return titles;
    }

    public net.lab1318.costume.api.models.view_type.ViewType getViewType() {
        return viewType;
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
        hashCode = 31 * hashCode + getTitles().hashCode();
        if (getAgents() != null) {
            hashCode = 31 * hashCode + getAgents().hashCode();
        }
        if (getCategories() != null) {
            hashCode = 31 * hashCode + getCategories().hashCode();
        }
        if (getCondition() != null) {
            hashCode = 31 * hashCode + getCondition().ordinal();
        }
        if (getDates() != null) {
            hashCode = 31 * hashCode + getDates().hashCode();
        }
        if (getDescriptions() != null) {
            hashCode = 31 * hashCode + getDescriptions().hashCode();
        }
        if (getGender() != null) {
            hashCode = 31 * hashCode + getGender().ordinal();
        }
        if (getImages() != null) {
            hashCode = 31 * hashCode + getImages().hashCode();
        }
        if (getInscriptions() != null) {
            hashCode = 31 * hashCode + getInscriptions().hashCode();
        }
        if (getMaterials() != null) {
            hashCode = 31 * hashCode + getMaterials().hashCode();
        }
        if (getProvenance() != null) {
            hashCode = 31 * hashCode + getProvenance().hashCode();
        }
        if (getQuantity() != null) {
            hashCode = 31 * hashCode + getQuantity().hashCode();
        }
        if (getRelations() != null) {
            hashCode = 31 * hashCode + getRelations().hashCode();
        }
        if (getRights() != null) {
            hashCode = 31 * hashCode + getRights().hashCode();
        }
        if (getSubjects() != null) {
            hashCode = 31 * hashCode + getSubjects().hashCode();
        }
        if (getTechniques() != null) {
            hashCode = 31 * hashCode + getTechniques().hashCode();
        }
        if (getTextrefs() != null) {
            hashCode = 31 * hashCode + getTextrefs().hashCode();
        }
        if (getViewType() != null) {
            hashCode = 31 * hashCode + getViewType().ordinal();
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

    public void setCondition(final net.lab1318.costume.api.models.condition.Condition condition) {
        this.condition = condition;
    }

    public void setDates(final net.lab1318.costume.gui.models.date.DateSetBean dates) {
        this.dates = dates;
    }

    public void setDescriptions(final net.lab1318.costume.gui.models.description.DescriptionSetBean descriptions) {
        this.descriptions = descriptions;
    }

    public void setGender(final net.lab1318.costume.api.models.gender.Gender gender) {
        this.gender = gender;
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

    public void setProvenance(final String provenance) {
        this.provenance = provenance;
    }

    public void setQuantity(final com.google.common.primitives.UnsignedInteger quantity) {
        this.quantity = quantity;
    }

    public void setRelations(final net.lab1318.costume.gui.models.relation.RelationSetBean relations) {
        this.relations = relations;
    }

    public void setRights(final net.lab1318.costume.gui.models.rights.RightsSetBean rights) {
        this.rights = rights;
    }

    public void setSubjects(final net.lab1318.costume.gui.models.subject.SubjectSetBean subjects) {
        this.subjects = subjects;
    }

    public void setTechniques(final net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques) {
        this.techniques = techniques;
    }

    public void setTextrefs(final net.lab1318.costume.gui.models.textref.TextrefSetBean textrefs) {
        this.textrefs = textrefs;
    }

    public void setTitles(final net.lab1318.costume.gui.models.title.TitleSetBean titles) {
        this.titles = titles;
    }

    public void setViewType(final net.lab1318.costume.api.models.view_type.ViewType viewType) {
        this.viewType = viewType;
    }

    public void setWorkTypes(final net.lab1318.costume.gui.models.work_type.WorkTypeSetBean workTypes) {
        this.workTypes = workTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("titles", getTitles()).add("agents", getAgents()).add("categories", getCategories()).add("condition", getCondition()).add("dates", getDates()).add("descriptions", getDescriptions()).add("gender", getGender()).add("images", getImages()).add("inscriptions", getInscriptions()).add("materials", getMaterials()).add("provenance", getProvenance()).add("quantity", getQuantity()).add("relations", getRelations()).add("rights", getRights()).add("subjects", getSubjects()).add("techniques", getTechniques()).add("textrefs", getTextrefs()).add("view_type", getViewType()).add("work_types", getWorkTypes()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private net.lab1318.costume.gui.models.title.TitleSetBean titles;

    private net.lab1318.costume.gui.models.agent.AgentSetBean agents;

    private java.util.List<String> categories;

    private net.lab1318.costume.api.models.condition.Condition condition;

    private net.lab1318.costume.gui.models.date.DateSetBean dates;

    private net.lab1318.costume.gui.models.description.DescriptionSetBean descriptions;

    private net.lab1318.costume.api.models.gender.Gender gender;

    private java.util.List<net.lab1318.costume.gui.models.image.ImageBean> images;

    private net.lab1318.costume.gui.models.inscription.InscriptionSetBean inscriptions;

    private net.lab1318.costume.gui.models.material.MaterialSetBean materials;

    /**
     * Dublin Core freetext provenance
     */
    private String provenance;

    private com.google.common.primitives.UnsignedInteger quantity;

    private net.lab1318.costume.gui.models.relation.RelationSetBean relations;

    private net.lab1318.costume.gui.models.rights.RightsSetBean rights;

    private net.lab1318.costume.gui.models.subject.SubjectSetBean subjects;

    private net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques;

    private net.lab1318.costume.gui.models.textref.TextrefSetBean textrefs;

    private net.lab1318.costume.api.models.view_type.ViewType viewType;

    private net.lab1318.costume.gui.models.work_type.WorkTypeSetBean workTypes;
}
