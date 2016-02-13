package net.lab1318.costume.gui.models.object;

public class ObjectBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 14, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLES("titles", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.title.TitleSetBean>() {}, true, 3, "titles", org.thryft.protocol.Type.STRUCT),
        AGENTS("agents", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.agent.AgentSetBean>() {}, false, 20, "agents", org.thryft.protocol.Type.STRUCT),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<java.util.List<String>>() {}, false, 18, "categories", org.thryft.protocol.Type.LIST),
        CLOSURES("closures", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.closure.ClosureSetBean>() {}, false, 34, "closures", org.thryft.protocol.Type.STRUCT),
        COLORS("colors", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.color.ColorSetBean>() {}, false, 30, "colors", org.thryft.protocol.Type.STRUCT),
        COMPONENTS("components", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.component.ComponentSetBean>() {}, false, 32, "components", org.thryft.protocol.Type.STRUCT),
        CONDITION("condition", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.condition.Condition>() {}, false, 27, "condition", org.thryft.protocol.Type.STRING),
        CULTURAL_CONTEXTS("culturalContexts", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.cultural_context.CulturalContextSetBean>() {}, false, 35, "cultural_contexts", org.thryft.protocol.Type.STRUCT),
        DATES("dates", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.date.DateSetBean>() {}, false, 10, "dates", org.thryft.protocol.Type.STRUCT),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.description.DescriptionSetBean>() {}, false, 4, "descriptions", org.thryft.protocol.Type.STRUCT),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 25, "gender", org.thryft.protocol.Type.STRING),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 37, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGES("images", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.image.ImageBean>>() {}, false, 23, "images", org.thryft.protocol.Type.LIST),
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.inscription.InscriptionSetBean>() {}, false, 17, "inscriptions", org.thryft.protocol.Type.STRUCT),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.location.LocationSetBean>() {}, false, 36, "locations", org.thryft.protocol.Type.STRUCT),
        MATERIALS("materials", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.material.MaterialSetBean>() {}, false, 15, "materials", org.thryft.protocol.Type.STRUCT),
        MEASUREMENTS("measurements", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.measurements.MeasurementsSetBean>() {}, false, 31, "measurements", org.thryft.protocol.Type.STRUCT),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 26, "quantity", org.thryft.protocol.Type.I32),
        RELATIONS("relations", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.relation.RelationSetBean>() {}, false, 29, "relations", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.rights.RightsSetBean>() {}, false, 22, "rights", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.structure.StructureSetBean>() {}, false, 33, "structures", org.thryft.protocol.Type.STRUCT),
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
            case "closures": return CLOSURES;
            case "colors": return COLORS;
            case "components": return COMPONENTS;
            case "condition": return CONDITION;
            case "culturalContexts": return CULTURAL_CONTEXTS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "locations": return LOCATIONS;
            case "materials": return MATERIALS;
            case "measurements": return MEASUREMENTS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "structures": return STRUCTURES;
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
            case "closures": return CLOSURES;
            case "colors": return COLORS;
            case "components": return COMPONENTS;
            case "condition": return CONDITION;
            case "cultural_contexts": return CULTURAL_CONTEXTS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "locations": return LOCATIONS;
            case "materials": return MATERIALS;
            case "measurements": return MEASUREMENTS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "structures": return STRUCTURES;
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
        closures = null;
        colors = null;
        components = null;
        condition = null;
        culturalContexts = null;
        dates = null;
        descriptions = null;
        gender = null;
        hidden = null;
        images = null;
        inscriptions = null;
        locations = null;
        materials = null;
        measurements = null;
        provenance = null;
        quantity = null;
        relations = null;
        rights = null;
        structures = null;
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
        this.closures = other.getClosures().isPresent() ? new net.lab1318.costume.gui.models.closure.ClosureSetBean(other.getClosures().get()) : null;
        this.colors = other.getColors().isPresent() ? new net.lab1318.costume.gui.models.color.ColorSetBean(other.getColors().get()) : null;
        this.components = other.getComponents().isPresent() ? new net.lab1318.costume.gui.models.component.ComponentSetBean(other.getComponents().get()) : null;
        this.condition = other.getCondition().isPresent() ? other.getCondition().get() : null;
        this.culturalContexts = other.getCulturalContexts().isPresent() ? new net.lab1318.costume.gui.models.cultural_context.CulturalContextSetBean(other.getCulturalContexts().get()) : null;
        this.dates = other.getDates().isPresent() ? new net.lab1318.costume.gui.models.date.DateSetBean(other.getDates().get()) : null;
        this.descriptions = other.getDescriptions().isPresent() ? new net.lab1318.costume.gui.models.description.DescriptionSetBean(other.getDescriptions().get()) : null;
        this.gender = other.getGender().isPresent() ? other.getGender().get() : null;
        this.hidden = other.getHidden().isPresent() ? other.getHidden().get() : null;
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
        this.locations = other.getLocations().isPresent() ? new net.lab1318.costume.gui.models.location.LocationSetBean(other.getLocations().get()) : null;
        this.materials = other.getMaterials().isPresent() ? new net.lab1318.costume.gui.models.material.MaterialSetBean(other.getMaterials().get()) : null;
        this.measurements = other.getMeasurements().isPresent() ? new net.lab1318.costume.gui.models.measurements.MeasurementsSetBean(other.getMeasurements().get()) : null;
        this.provenance = other.getProvenance().isPresent() ? other.getProvenance().get() : null;
        this.quantity = other.getQuantity().isPresent() ? other.getQuantity().get() : null;
        this.relations = other.getRelations().isPresent() ? new net.lab1318.costume.gui.models.relation.RelationSetBean(other.getRelations().get()) : null;
        this.rights = other.getRights().isPresent() ? new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getRights().get()) : null;
        this.structures = other.getStructures().isPresent() ? new net.lab1318.costume.gui.models.structure.StructureSetBean(other.getStructures().get()) : null;
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
            (getAgents() != null ? getAgents().equals(other.getAgents()) : other.getAgents() == null) &&
            (getCategories() != null ? getCategories().equals(other.getCategories()) : other.getCategories() == null) &&
            (getClosures() != null ? getClosures().equals(other.getClosures()) : other.getClosures() == null) &&
            (getColors() != null ? getColors().equals(other.getColors()) : other.getColors() == null) &&
            (getComponents() != null ? getComponents().equals(other.getComponents()) : other.getComponents() == null) &&
            (getCondition() != null ? getCondition().equals(other.getCondition()) : other.getCondition() == null) &&
            (getCulturalContexts() != null ? getCulturalContexts().equals(other.getCulturalContexts()) : other.getCulturalContexts() == null) &&
            (getDates() != null ? getDates().equals(other.getDates()) : other.getDates() == null) &&
            (getDescriptions() != null ? getDescriptions().equals(other.getDescriptions()) : other.getDescriptions() == null) &&
            (getGender() != null ? getGender().equals(other.getGender()) : other.getGender() == null) &&
            (getHidden() != null ? getHidden().equals(other.getHidden()) : other.getHidden() == null) &&
            (getImages() != null ? getImages().equals(other.getImages()) : other.getImages() == null) &&
            (getInscriptions() != null ? getInscriptions().equals(other.getInscriptions()) : other.getInscriptions() == null) &&
            (getLocations() != null ? getLocations().equals(other.getLocations()) : other.getLocations() == null) &&
            (getMaterials() != null ? getMaterials().equals(other.getMaterials()) : other.getMaterials() == null) &&
            (getMeasurements() != null ? getMeasurements().equals(other.getMeasurements()) : other.getMeasurements() == null) &&
            (getProvenance() != null ? getProvenance().equals(other.getProvenance()) : other.getProvenance() == null) &&
            (getQuantity() != null ? getQuantity().equals(other.getQuantity()) : other.getQuantity() == null) &&
            (getRelations() != null ? getRelations().equals(other.getRelations()) : other.getRelations() == null) &&
            (getRights() != null ? getRights().equals(other.getRights()) : other.getRights() == null) &&
            (getStructures() != null ? getStructures().equals(other.getStructures()) : other.getStructures() == null) &&
            (getSubjects() != null ? getSubjects().equals(other.getSubjects()) : other.getSubjects() == null) &&
            (getTechniques() != null ? getTechniques().equals(other.getTechniques()) : other.getTechniques() == null) &&
            (getTextrefs() != null ? getTextrefs().equals(other.getTextrefs()) : other.getTextrefs() == null) &&
            (getViewType() != null ? getViewType().equals(other.getViewType()) : other.getViewType() == null) &&
            (getWorkTypes() != null ? getWorkTypes().equals(other.getWorkTypes()) : other.getWorkTypes() == null);
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
        case TITLES: return getTitles();
        case AGENTS: return getAgents();
        case CATEGORIES: return getCategories();
        case CLOSURES: return getClosures();
        case COLORS: return getColors();
        case COMPONENTS: return getComponents();
        case CONDITION: return getCondition();
        case CULTURAL_CONTEXTS: return getCulturalContexts();
        case DATES: return getDates();
        case DESCRIPTIONS: return getDescriptions();
        case GENDER: return getGender();
        case HIDDEN: return getHidden();
        case IMAGES: return getImages();
        case INSCRIPTIONS: return getInscriptions();
        case LOCATIONS: return getLocations();
        case MATERIALS: return getMaterials();
        case MEASUREMENTS: return getMeasurements();
        case PROVENANCE: return getProvenance();
        case QUANTITY: return getQuantity();
        case RELATIONS: return getRelations();
        case RIGHTS: return getRights();
        case STRUCTURES: return getStructures();
        case SUBJECTS: return getSubjects();
        case TECHNIQUES: return getTechniques();
        case TEXTREFS: return getTextrefs();
        case VIEW_TYPE: return getViewType();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public net.lab1318.costume.gui.models.agent.AgentSetBean getAgents() {
        return agents;
    }

    public java.util.List<String> getCategories() {
        return categories;
    }

    public net.lab1318.costume.gui.models.closure.ClosureSetBean getClosures() {
        return closures;
    }

    public net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public net.lab1318.costume.gui.models.color.ColorSetBean getColors() {
        return colors;
    }

    public net.lab1318.costume.gui.models.component.ComponentSetBean getComponents() {
        return components;
    }

    public net.lab1318.costume.api.models.condition.Condition getCondition() {
        return condition;
    }

    public net.lab1318.costume.gui.models.cultural_context.CulturalContextSetBean getCulturalContexts() {
        return culturalContexts;
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

    public Boolean getHidden() {
        return hidden;
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

    public net.lab1318.costume.gui.models.location.LocationSetBean getLocations() {
        return locations;
    }

    public net.lab1318.costume.gui.models.material.MaterialSetBean getMaterials() {
        return materials;
    }

    public net.lab1318.costume.gui.models.measurements.MeasurementsSetBean getMeasurements() {
        return measurements;
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

    public net.lab1318.costume.gui.models.structure.StructureSetBean getStructures() {
        return structures;
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
        if (getClosures() != null) {
            hashCode = 31 * hashCode + getClosures().hashCode();
        }
        if (getColors() != null) {
            hashCode = 31 * hashCode + getColors().hashCode();
        }
        if (getComponents() != null) {
            hashCode = 31 * hashCode + getComponents().hashCode();
        }
        if (getCondition() != null) {
            hashCode = 31 * hashCode + getCondition().ordinal();
        }
        if (getCulturalContexts() != null) {
            hashCode = 31 * hashCode + getCulturalContexts().hashCode();
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
        if (getHidden() != null) {
            hashCode = 31 * hashCode + (getHidden() ? 1 : 0);
        }
        if (getImages() != null) {
            hashCode = 31 * hashCode + getImages().hashCode();
        }
        if (getInscriptions() != null) {
            hashCode = 31 * hashCode + getInscriptions().hashCode();
        }
        if (getLocations() != null) {
            hashCode = 31 * hashCode + getLocations().hashCode();
        }
        if (getMaterials() != null) {
            hashCode = 31 * hashCode + getMaterials().hashCode();
        }
        if (getMeasurements() != null) {
            hashCode = 31 * hashCode + getMeasurements().hashCode();
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
        if (getStructures() != null) {
            hashCode = 31 * hashCode + getStructures().hashCode();
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setAgents(final net.lab1318.costume.gui.models.agent.AgentSetBean agents) {
        this.agents = agents;
    }

    public void setCategories(final java.util.List<String> categories) {
        this.categories = categories;
    }

    public void setClosures(final net.lab1318.costume.gui.models.closure.ClosureSetBean closures) {
        this.closures = closures;
    }

    public void setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        this.collectionId = collectionId;
    }

    public void setColors(final net.lab1318.costume.gui.models.color.ColorSetBean colors) {
        this.colors = colors;
    }

    public void setComponents(final net.lab1318.costume.gui.models.component.ComponentSetBean components) {
        this.components = components;
    }

    public void setCondition(final net.lab1318.costume.api.models.condition.Condition condition) {
        this.condition = condition;
    }

    public void setCulturalContexts(final net.lab1318.costume.gui.models.cultural_context.CulturalContextSetBean culturalContexts) {
        this.culturalContexts = culturalContexts;
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

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
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

    public void setLocations(final net.lab1318.costume.gui.models.location.LocationSetBean locations) {
        this.locations = locations;
    }

    public void setMaterials(final net.lab1318.costume.gui.models.material.MaterialSetBean materials) {
        this.materials = materials;
    }

    public void setMeasurements(final net.lab1318.costume.gui.models.measurements.MeasurementsSetBean measurements) {
        this.measurements = measurements;
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

    public void setStructures(final net.lab1318.costume.gui.models.structure.StructureSetBean structures) {
        this.structures = structures;
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
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("titles", getTitles()).add("agents", getAgents()).add("categories", getCategories()).add("closures", getClosures()).add("colors", getColors()).add("components", getComponents()).add("condition", getCondition()).add("cultural_contexts", getCulturalContexts()).add("dates", getDates()).add("descriptions", getDescriptions()).add("gender", getGender()).add("hidden", getHidden()).add("images", getImages()).add("inscriptions", getInscriptions()).add("locations", getLocations()).add("materials", getMaterials()).add("measurements", getMeasurements()).add("provenance", getProvenance()).add("quantity", getQuantity()).add("relations", getRelations()).add("rights", getRights()).add("structures", getStructures()).add("subjects", getSubjects()).add("techniques", getTechniques()).add("textrefs", getTextrefs()).add("view_type", getViewType()).add("work_types", getWorkTypes()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private net.lab1318.costume.gui.models.title.TitleSetBean titles;

    private net.lab1318.costume.gui.models.agent.AgentSetBean agents;

    private java.util.List<String> categories;

    private net.lab1318.costume.gui.models.closure.ClosureSetBean closures;

    private net.lab1318.costume.gui.models.color.ColorSetBean colors;

    private net.lab1318.costume.gui.models.component.ComponentSetBean components;

    private net.lab1318.costume.api.models.condition.Condition condition;

    private net.lab1318.costume.gui.models.cultural_context.CulturalContextSetBean culturalContexts;

    private net.lab1318.costume.gui.models.date.DateSetBean dates;

    private net.lab1318.costume.gui.models.description.DescriptionSetBean descriptions;

    private net.lab1318.costume.api.models.gender.Gender gender;

    private Boolean hidden;

    private java.util.List<net.lab1318.costume.gui.models.image.ImageBean> images;

    private net.lab1318.costume.gui.models.inscription.InscriptionSetBean inscriptions;

    private net.lab1318.costume.gui.models.location.LocationSetBean locations;

    private net.lab1318.costume.gui.models.material.MaterialSetBean materials;

    private net.lab1318.costume.gui.models.measurements.MeasurementsSetBean measurements;

    /**
     * Dublin Core freetext provenance
     */
    private String provenance;

    private com.google.common.primitives.UnsignedInteger quantity;

    private net.lab1318.costume.gui.models.relation.RelationSetBean relations;

    private net.lab1318.costume.gui.models.rights.RightsSetBean rights;

    private net.lab1318.costume.gui.models.structure.StructureSetBean structures;

    private net.lab1318.costume.gui.models.subject.SubjectSetBean subjects;

    private net.lab1318.costume.gui.models.technique.TechniqueSetBean techniques;

    private net.lab1318.costume.gui.models.textref.TextrefSetBean textrefs;

    private net.lab1318.costume.api.models.view_type.ViewType viewType;

    private net.lab1318.costume.gui.models.work_type.WorkTypeSetBean workTypes;
}
