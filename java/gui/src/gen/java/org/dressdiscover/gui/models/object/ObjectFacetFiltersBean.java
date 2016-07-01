package org.dressdiscover.gui.models.object;

public class ObjectFacetFiltersBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EXCLUDE_ALL("excludeAll", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "exclude_all", org.thryft.protocol.Type.BOOL),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTIONS("excludeCollections", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_collections", org.thryft.protocol.Type.SET),
        EXCLUDE_COLOR_TEXTS("excludeColorTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_color_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_CULTURAL_CONTEXT_TEXTS("excludeCulturalContextTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_cultural_context_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_GENDERS("excludeGenders", new com.google.common.reflect.TypeToken<java.util.Set<org.dressdiscover.api.models.gender.Gender>>() {}, false, 0, "exclude_genders", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTIONS("excludeInstitutions", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_institutions", org.thryft.protocol.Type.SET),
        EXCLUDE_LOCATION_NAME_TEXTS("excludeLocationNameTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_location_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_MATERIAL_TEXTS("excludeMaterialTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_material_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_TECHNIQUE_TEXTS("excludeTechniqueTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_technique_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_WORK_TYPE_TEXTS("excludeWorkTypeTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "exclude_work_type_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTIONS("includeCollections", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_collections", org.thryft.protocol.Type.SET),
        INCLUDE_COLOR_TEXTS("includeColorTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_color_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CULTURAL_CONTEXT_TEXTS("includeCulturalContextTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_cultural_context_texts", org.thryft.protocol.Type.SET),
        INCLUDE_GENDERS("includeGenders", new com.google.common.reflect.TypeToken<java.util.Set<org.dressdiscover.api.models.gender.Gender>>() {}, false, 0, "include_genders", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTIONS("includeInstitutions", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_institutions", org.thryft.protocol.Type.SET),
        INCLUDE_LOCATION_NAME_TEXTS("includeLocationNameTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_location_name_texts", org.thryft.protocol.Type.SET),
        INCLUDE_MATERIAL_TEXTS("includeMaterialTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_material_texts", org.thryft.protocol.Type.SET),
        INCLUDE_SUBJECT_TERM_TEXTS("includeSubjectTermTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_subject_term_texts", org.thryft.protocol.Type.SET),
        INCLUDE_TECHNIQUE_TEXTS("includeTechniqueTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_technique_texts", org.thryft.protocol.Type.SET),
        INCLUDE_WORK_TYPE_TEXTS("includeWorkTypeTexts", new com.google.common.reflect.TypeToken<java.util.Set<String>>() {}, false, 0, "include_work_type_texts", org.thryft.protocol.Type.SET);

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
            case "excludeAll": return EXCLUDE_ALL;
            case "excludeCategories": return EXCLUDE_CATEGORIES;
            case "excludeCollections": return EXCLUDE_COLLECTIONS;
            case "excludeColorTexts": return EXCLUDE_COLOR_TEXTS;
            case "excludeCulturalContextTexts": return EXCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "excludeGenders": return EXCLUDE_GENDERS;
            case "excludeInstitutions": return EXCLUDE_INSTITUTIONS;
            case "excludeLocationNameTexts": return EXCLUDE_LOCATION_NAME_TEXTS;
            case "excludeMaterialTexts": return EXCLUDE_MATERIAL_TEXTS;
            case "excludeSubjectTermTexts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "excludeTechniqueTexts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "excludeWorkTypeTexts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "includeCategories": return INCLUDE_CATEGORIES;
            case "includeCollections": return INCLUDE_COLLECTIONS;
            case "includeColorTexts": return INCLUDE_COLOR_TEXTS;
            case "includeCulturalContextTexts": return INCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "includeGenders": return INCLUDE_GENDERS;
            case "includeInstitutions": return INCLUDE_INSTITUTIONS;
            case "includeLocationNameTexts": return INCLUDE_LOCATION_NAME_TEXTS;
            case "includeMaterialTexts": return INCLUDE_MATERIAL_TEXTS;
            case "includeSubjectTermTexts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "includeTechniqueTexts": return INCLUDE_TECHNIQUE_TEXTS;
            case "includeWorkTypeTexts": return INCLUDE_WORK_TYPE_TEXTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "exclude_all": return EXCLUDE_ALL;
            case "exclude_categories": return EXCLUDE_CATEGORIES;
            case "exclude_collections": return EXCLUDE_COLLECTIONS;
            case "exclude_color_texts": return EXCLUDE_COLOR_TEXTS;
            case "exclude_cultural_context_texts": return EXCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "exclude_genders": return EXCLUDE_GENDERS;
            case "exclude_institutions": return EXCLUDE_INSTITUTIONS;
            case "exclude_location_name_texts": return EXCLUDE_LOCATION_NAME_TEXTS;
            case "exclude_material_texts": return EXCLUDE_MATERIAL_TEXTS;
            case "exclude_subject_term_texts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "exclude_technique_texts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "exclude_work_type_texts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "include_categories": return INCLUDE_CATEGORIES;
            case "include_collections": return INCLUDE_COLLECTIONS;
            case "include_color_texts": return INCLUDE_COLOR_TEXTS;
            case "include_cultural_context_texts": return INCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "include_genders": return INCLUDE_GENDERS;
            case "include_institutions": return INCLUDE_INSTITUTIONS;
            case "include_location_name_texts": return INCLUDE_LOCATION_NAME_TEXTS;
            case "include_material_texts": return INCLUDE_MATERIAL_TEXTS;
            case "include_subject_term_texts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "include_technique_texts": return INCLUDE_TECHNIQUE_TEXTS;
            case "include_work_type_texts": return INCLUDE_WORK_TYPE_TEXTS;
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

    public ObjectFacetFiltersBean() {
        excludeAll = null;
        excludeCategories = null;
        excludeCollections = null;
        excludeColorTexts = null;
        excludeCulturalContextTexts = null;
        excludeGenders = null;
        excludeInstitutions = null;
        excludeLocationNameTexts = null;
        excludeMaterialTexts = null;
        excludeSubjectTermTexts = null;
        excludeTechniqueTexts = null;
        excludeWorkTypeTexts = null;
        includeCategories = null;
        includeCollections = null;
        includeColorTexts = null;
        includeCulturalContextTexts = null;
        includeGenders = null;
        includeInstitutions = null;
        includeLocationNameTexts = null;
        includeMaterialTexts = null;
        includeSubjectTermTexts = null;
        includeTechniqueTexts = null;
        includeWorkTypeTexts = null;
    }

    public ObjectFacetFiltersBean(final org.dressdiscover.api.models.object.ObjectFacetFilters other) {
        this.excludeAll = other.getExcludeAll().isPresent() ? other.getExcludeAll().get() : null;
        this.excludeCategories = other.getExcludeCategories().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeCategories().get()) : null;
        this.excludeCollections = other.getExcludeCollections().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeCollections().get()) : null;
        this.excludeColorTexts = other.getExcludeColorTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeColorTexts().get()) : null;
        this.excludeCulturalContextTexts = other.getExcludeCulturalContextTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeCulturalContextTexts().get()) : null;
        this.excludeGenders = other.getExcludeGenders().isPresent() ? new java.util.LinkedHashSet<org.dressdiscover.api.models.gender.Gender>(other.getExcludeGenders().get()) : null;
        this.excludeInstitutions = other.getExcludeInstitutions().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeInstitutions().get()) : null;
        this.excludeLocationNameTexts = other.getExcludeLocationNameTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeLocationNameTexts().get()) : null;
        this.excludeMaterialTexts = other.getExcludeMaterialTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeMaterialTexts().get()) : null;
        this.excludeSubjectTermTexts = other.getExcludeSubjectTermTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeSubjectTermTexts().get()) : null;
        this.excludeTechniqueTexts = other.getExcludeTechniqueTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeTechniqueTexts().get()) : null;
        this.excludeWorkTypeTexts = other.getExcludeWorkTypeTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getExcludeWorkTypeTexts().get()) : null;
        this.includeCategories = other.getIncludeCategories().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeCategories().get()) : null;
        this.includeCollections = other.getIncludeCollections().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeCollections().get()) : null;
        this.includeColorTexts = other.getIncludeColorTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeColorTexts().get()) : null;
        this.includeCulturalContextTexts = other.getIncludeCulturalContextTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeCulturalContextTexts().get()) : null;
        this.includeGenders = other.getIncludeGenders().isPresent() ? new java.util.LinkedHashSet<org.dressdiscover.api.models.gender.Gender>(other.getIncludeGenders().get()) : null;
        this.includeInstitutions = other.getIncludeInstitutions().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeInstitutions().get()) : null;
        this.includeLocationNameTexts = other.getIncludeLocationNameTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeLocationNameTexts().get()) : null;
        this.includeMaterialTexts = other.getIncludeMaterialTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeMaterialTexts().get()) : null;
        this.includeSubjectTermTexts = other.getIncludeSubjectTermTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeSubjectTermTexts().get()) : null;
        this.includeTechniqueTexts = other.getIncludeTechniqueTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeTechniqueTexts().get()) : null;
        this.includeWorkTypeTexts = other.getIncludeWorkTypeTexts().isPresent() ? new java.util.LinkedHashSet<String>(other.getIncludeWorkTypeTexts().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectFacetFiltersBean)) {
            return false;
        }

        final ObjectFacetFiltersBean other = (ObjectFacetFiltersBean)otherObject;
        return
            ((getExcludeAll() != null && other.getExcludeAll() != null) ? (getExcludeAll() == other.getExcludeAll()) : (getExcludeAll() == null && other.getExcludeAll() == null)) &&
            ((getExcludeCategories() != null && other.getExcludeCategories() != null) ? (getExcludeCategories().equals(other.getExcludeCategories())) : (getExcludeCategories() == null && other.getExcludeCategories() == null)) &&
            ((getExcludeCollections() != null && other.getExcludeCollections() != null) ? (getExcludeCollections().equals(other.getExcludeCollections())) : (getExcludeCollections() == null && other.getExcludeCollections() == null)) &&
            ((getExcludeColorTexts() != null && other.getExcludeColorTexts() != null) ? (getExcludeColorTexts().equals(other.getExcludeColorTexts())) : (getExcludeColorTexts() == null && other.getExcludeColorTexts() == null)) &&
            ((getExcludeCulturalContextTexts() != null && other.getExcludeCulturalContextTexts() != null) ? (getExcludeCulturalContextTexts().equals(other.getExcludeCulturalContextTexts())) : (getExcludeCulturalContextTexts() == null && other.getExcludeCulturalContextTexts() == null)) &&
            ((getExcludeGenders() != null && other.getExcludeGenders() != null) ? (getExcludeGenders().equals(other.getExcludeGenders())) : (getExcludeGenders() == null && other.getExcludeGenders() == null)) &&
            ((getExcludeInstitutions() != null && other.getExcludeInstitutions() != null) ? (getExcludeInstitutions().equals(other.getExcludeInstitutions())) : (getExcludeInstitutions() == null && other.getExcludeInstitutions() == null)) &&
            ((getExcludeLocationNameTexts() != null && other.getExcludeLocationNameTexts() != null) ? (getExcludeLocationNameTexts().equals(other.getExcludeLocationNameTexts())) : (getExcludeLocationNameTexts() == null && other.getExcludeLocationNameTexts() == null)) &&
            ((getExcludeMaterialTexts() != null && other.getExcludeMaterialTexts() != null) ? (getExcludeMaterialTexts().equals(other.getExcludeMaterialTexts())) : (getExcludeMaterialTexts() == null && other.getExcludeMaterialTexts() == null)) &&
            ((getExcludeSubjectTermTexts() != null && other.getExcludeSubjectTermTexts() != null) ? (getExcludeSubjectTermTexts().equals(other.getExcludeSubjectTermTexts())) : (getExcludeSubjectTermTexts() == null && other.getExcludeSubjectTermTexts() == null)) &&
            ((getExcludeTechniqueTexts() != null && other.getExcludeTechniqueTexts() != null) ? (getExcludeTechniqueTexts().equals(other.getExcludeTechniqueTexts())) : (getExcludeTechniqueTexts() == null && other.getExcludeTechniqueTexts() == null)) &&
            ((getExcludeWorkTypeTexts() != null && other.getExcludeWorkTypeTexts() != null) ? (getExcludeWorkTypeTexts().equals(other.getExcludeWorkTypeTexts())) : (getExcludeWorkTypeTexts() == null && other.getExcludeWorkTypeTexts() == null)) &&
            ((getIncludeCategories() != null && other.getIncludeCategories() != null) ? (getIncludeCategories().equals(other.getIncludeCategories())) : (getIncludeCategories() == null && other.getIncludeCategories() == null)) &&
            ((getIncludeCollections() != null && other.getIncludeCollections() != null) ? (getIncludeCollections().equals(other.getIncludeCollections())) : (getIncludeCollections() == null && other.getIncludeCollections() == null)) &&
            ((getIncludeColorTexts() != null && other.getIncludeColorTexts() != null) ? (getIncludeColorTexts().equals(other.getIncludeColorTexts())) : (getIncludeColorTexts() == null && other.getIncludeColorTexts() == null)) &&
            ((getIncludeCulturalContextTexts() != null && other.getIncludeCulturalContextTexts() != null) ? (getIncludeCulturalContextTexts().equals(other.getIncludeCulturalContextTexts())) : (getIncludeCulturalContextTexts() == null && other.getIncludeCulturalContextTexts() == null)) &&
            ((getIncludeGenders() != null && other.getIncludeGenders() != null) ? (getIncludeGenders().equals(other.getIncludeGenders())) : (getIncludeGenders() == null && other.getIncludeGenders() == null)) &&
            ((getIncludeInstitutions() != null && other.getIncludeInstitutions() != null) ? (getIncludeInstitutions().equals(other.getIncludeInstitutions())) : (getIncludeInstitutions() == null && other.getIncludeInstitutions() == null)) &&
            ((getIncludeLocationNameTexts() != null && other.getIncludeLocationNameTexts() != null) ? (getIncludeLocationNameTexts().equals(other.getIncludeLocationNameTexts())) : (getIncludeLocationNameTexts() == null && other.getIncludeLocationNameTexts() == null)) &&
            ((getIncludeMaterialTexts() != null && other.getIncludeMaterialTexts() != null) ? (getIncludeMaterialTexts().equals(other.getIncludeMaterialTexts())) : (getIncludeMaterialTexts() == null && other.getIncludeMaterialTexts() == null)) &&
            ((getIncludeSubjectTermTexts() != null && other.getIncludeSubjectTermTexts() != null) ? (getIncludeSubjectTermTexts().equals(other.getIncludeSubjectTermTexts())) : (getIncludeSubjectTermTexts() == null && other.getIncludeSubjectTermTexts() == null)) &&
            ((getIncludeTechniqueTexts() != null && other.getIncludeTechniqueTexts() != null) ? (getIncludeTechniqueTexts().equals(other.getIncludeTechniqueTexts())) : (getIncludeTechniqueTexts() == null && other.getIncludeTechniqueTexts() == null)) &&
            ((getIncludeWorkTypeTexts() != null && other.getIncludeWorkTypeTexts() != null) ? (getIncludeWorkTypeTexts().equals(other.getIncludeWorkTypeTexts())) : (getIncludeWorkTypeTexts() == null && other.getIncludeWorkTypeTexts() == null));
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
        case EXCLUDE_ALL: return getExcludeAll();
        case EXCLUDE_CATEGORIES: return getExcludeCategories();
        case EXCLUDE_COLLECTIONS: return getExcludeCollections();
        case EXCLUDE_COLOR_TEXTS: return getExcludeColorTexts();
        case EXCLUDE_CULTURAL_CONTEXT_TEXTS: return getExcludeCulturalContextTexts();
        case EXCLUDE_GENDERS: return getExcludeGenders();
        case EXCLUDE_INSTITUTIONS: return getExcludeInstitutions();
        case EXCLUDE_LOCATION_NAME_TEXTS: return getExcludeLocationNameTexts();
        case EXCLUDE_MATERIAL_TEXTS: return getExcludeMaterialTexts();
        case EXCLUDE_SUBJECT_TERM_TEXTS: return getExcludeSubjectTermTexts();
        case EXCLUDE_TECHNIQUE_TEXTS: return getExcludeTechniqueTexts();
        case EXCLUDE_WORK_TYPE_TEXTS: return getExcludeWorkTypeTexts();
        case INCLUDE_CATEGORIES: return getIncludeCategories();
        case INCLUDE_COLLECTIONS: return getIncludeCollections();
        case INCLUDE_COLOR_TEXTS: return getIncludeColorTexts();
        case INCLUDE_CULTURAL_CONTEXT_TEXTS: return getIncludeCulturalContextTexts();
        case INCLUDE_GENDERS: return getIncludeGenders();
        case INCLUDE_INSTITUTIONS: return getIncludeInstitutions();
        case INCLUDE_LOCATION_NAME_TEXTS: return getIncludeLocationNameTexts();
        case INCLUDE_MATERIAL_TEXTS: return getIncludeMaterialTexts();
        case INCLUDE_SUBJECT_TERM_TEXTS: return getIncludeSubjectTermTexts();
        case INCLUDE_TECHNIQUE_TEXTS: return getIncludeTechniqueTexts();
        case INCLUDE_WORK_TYPE_TEXTS: return getIncludeWorkTypeTexts();
        default:
            throw new IllegalStateException();
        }
    }

    public Boolean getExcludeAll() {
        return excludeAll;
    }

    public java.util.Set<String> getExcludeCategories() {
        return excludeCategories;
    }

    public java.util.Set<String> getExcludeCollections() {
        return excludeCollections;
    }

    public java.util.Set<String> getExcludeColorTexts() {
        return excludeColorTexts;
    }

    public java.util.Set<String> getExcludeCulturalContextTexts() {
        return excludeCulturalContextTexts;
    }

    public java.util.Set<org.dressdiscover.api.models.gender.Gender> getExcludeGenders() {
        return excludeGenders;
    }

    public java.util.Set<String> getExcludeInstitutions() {
        return excludeInstitutions;
    }

    public java.util.Set<String> getExcludeLocationNameTexts() {
        return excludeLocationNameTexts;
    }

    public java.util.Set<String> getExcludeMaterialTexts() {
        return excludeMaterialTexts;
    }

    public java.util.Set<String> getExcludeSubjectTermTexts() {
        return excludeSubjectTermTexts;
    }

    public java.util.Set<String> getExcludeTechniqueTexts() {
        return excludeTechniqueTexts;
    }

    public java.util.Set<String> getExcludeWorkTypeTexts() {
        return excludeWorkTypeTexts;
    }

    public java.util.Set<String> getIncludeCategories() {
        return includeCategories;
    }

    public java.util.Set<String> getIncludeCollections() {
        return includeCollections;
    }

    public java.util.Set<String> getIncludeColorTexts() {
        return includeColorTexts;
    }

    public java.util.Set<String> getIncludeCulturalContextTexts() {
        return includeCulturalContextTexts;
    }

    public java.util.Set<org.dressdiscover.api.models.gender.Gender> getIncludeGenders() {
        return includeGenders;
    }

    public java.util.Set<String> getIncludeInstitutions() {
        return includeInstitutions;
    }

    public java.util.Set<String> getIncludeLocationNameTexts() {
        return includeLocationNameTexts;
    }

    public java.util.Set<String> getIncludeMaterialTexts() {
        return includeMaterialTexts;
    }

    public java.util.Set<String> getIncludeSubjectTermTexts() {
        return includeSubjectTermTexts;
    }

    public java.util.Set<String> getIncludeTechniqueTexts() {
        return includeTechniqueTexts;
    }

    public java.util.Set<String> getIncludeWorkTypeTexts() {
        return includeWorkTypeTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getExcludeAll() != null) {
            hashCode = 31 * hashCode + (getExcludeAll() ? 1 : 0);
        }
        if (getExcludeCategories() != null) {
            hashCode = 31 * hashCode + getExcludeCategories().hashCode();
        }
        if (getExcludeCollections() != null) {
            hashCode = 31 * hashCode + getExcludeCollections().hashCode();
        }
        if (getExcludeColorTexts() != null) {
            hashCode = 31 * hashCode + getExcludeColorTexts().hashCode();
        }
        if (getExcludeCulturalContextTexts() != null) {
            hashCode = 31 * hashCode + getExcludeCulturalContextTexts().hashCode();
        }
        if (getExcludeGenders() != null) {
            hashCode = 31 * hashCode + getExcludeGenders().hashCode();
        }
        if (getExcludeInstitutions() != null) {
            hashCode = 31 * hashCode + getExcludeInstitutions().hashCode();
        }
        if (getExcludeLocationNameTexts() != null) {
            hashCode = 31 * hashCode + getExcludeLocationNameTexts().hashCode();
        }
        if (getExcludeMaterialTexts() != null) {
            hashCode = 31 * hashCode + getExcludeMaterialTexts().hashCode();
        }
        if (getExcludeSubjectTermTexts() != null) {
            hashCode = 31 * hashCode + getExcludeSubjectTermTexts().hashCode();
        }
        if (getExcludeTechniqueTexts() != null) {
            hashCode = 31 * hashCode + getExcludeTechniqueTexts().hashCode();
        }
        if (getExcludeWorkTypeTexts() != null) {
            hashCode = 31 * hashCode + getExcludeWorkTypeTexts().hashCode();
        }
        if (getIncludeCategories() != null) {
            hashCode = 31 * hashCode + getIncludeCategories().hashCode();
        }
        if (getIncludeCollections() != null) {
            hashCode = 31 * hashCode + getIncludeCollections().hashCode();
        }
        if (getIncludeColorTexts() != null) {
            hashCode = 31 * hashCode + getIncludeColorTexts().hashCode();
        }
        if (getIncludeCulturalContextTexts() != null) {
            hashCode = 31 * hashCode + getIncludeCulturalContextTexts().hashCode();
        }
        if (getIncludeGenders() != null) {
            hashCode = 31 * hashCode + getIncludeGenders().hashCode();
        }
        if (getIncludeInstitutions() != null) {
            hashCode = 31 * hashCode + getIncludeInstitutions().hashCode();
        }
        if (getIncludeLocationNameTexts() != null) {
            hashCode = 31 * hashCode + getIncludeLocationNameTexts().hashCode();
        }
        if (getIncludeMaterialTexts() != null) {
            hashCode = 31 * hashCode + getIncludeMaterialTexts().hashCode();
        }
        if (getIncludeSubjectTermTexts() != null) {
            hashCode = 31 * hashCode + getIncludeSubjectTermTexts().hashCode();
        }
        if (getIncludeTechniqueTexts() != null) {
            hashCode = 31 * hashCode + getIncludeTechniqueTexts().hashCode();
        }
        if (getIncludeWorkTypeTexts() != null) {
            hashCode = 31 * hashCode + getIncludeWorkTypeTexts().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return getExcludeAll() == null && getExcludeCategories() == null && getExcludeCollections() == null && getExcludeColorTexts() == null && getExcludeCulturalContextTexts() == null && getExcludeGenders() == null && getExcludeInstitutions() == null && getExcludeLocationNameTexts() == null && getExcludeMaterialTexts() == null && getExcludeSubjectTermTexts() == null && getExcludeTechniqueTexts() == null && getExcludeWorkTypeTexts() == null && getIncludeCategories() == null && getIncludeCollections() == null && getIncludeColorTexts() == null && getIncludeCulturalContextTexts() == null && getIncludeGenders() == null && getIncludeInstitutions() == null && getIncludeLocationNameTexts() == null && getIncludeMaterialTexts() == null && getIncludeSubjectTermTexts() == null && getIncludeTechniqueTexts() == null && getIncludeWorkTypeTexts() == null;
    }

    public void setExcludeAll(final Boolean excludeAll) {
        this.excludeAll = excludeAll;
    }

    public void setExcludeCategories(final java.util.Set<String> excludeCategories) {
        this.excludeCategories = excludeCategories;
    }

    public void setExcludeCollections(final java.util.Set<String> excludeCollections) {
        this.excludeCollections = excludeCollections;
    }

    public void setExcludeColorTexts(final java.util.Set<String> excludeColorTexts) {
        this.excludeColorTexts = excludeColorTexts;
    }

    public void setExcludeCulturalContextTexts(final java.util.Set<String> excludeCulturalContextTexts) {
        this.excludeCulturalContextTexts = excludeCulturalContextTexts;
    }

    public void setExcludeGenders(final java.util.Set<org.dressdiscover.api.models.gender.Gender> excludeGenders) {
        this.excludeGenders = excludeGenders;
    }

    public void setExcludeInstitutions(final java.util.Set<String> excludeInstitutions) {
        this.excludeInstitutions = excludeInstitutions;
    }

    public void setExcludeLocationNameTexts(final java.util.Set<String> excludeLocationNameTexts) {
        this.excludeLocationNameTexts = excludeLocationNameTexts;
    }

    public void setExcludeMaterialTexts(final java.util.Set<String> excludeMaterialTexts) {
        this.excludeMaterialTexts = excludeMaterialTexts;
    }

    public void setExcludeSubjectTermTexts(final java.util.Set<String> excludeSubjectTermTexts) {
        this.excludeSubjectTermTexts = excludeSubjectTermTexts;
    }

    public void setExcludeTechniqueTexts(final java.util.Set<String> excludeTechniqueTexts) {
        this.excludeTechniqueTexts = excludeTechniqueTexts;
    }

    public void setExcludeWorkTypeTexts(final java.util.Set<String> excludeWorkTypeTexts) {
        this.excludeWorkTypeTexts = excludeWorkTypeTexts;
    }

    public void setIncludeCategories(final java.util.Set<String> includeCategories) {
        this.includeCategories = includeCategories;
    }

    public void setIncludeCollections(final java.util.Set<String> includeCollections) {
        this.includeCollections = includeCollections;
    }

    public void setIncludeColorTexts(final java.util.Set<String> includeColorTexts) {
        this.includeColorTexts = includeColorTexts;
    }

    public void setIncludeCulturalContextTexts(final java.util.Set<String> includeCulturalContextTexts) {
        this.includeCulturalContextTexts = includeCulturalContextTexts;
    }

    public void setIncludeGenders(final java.util.Set<org.dressdiscover.api.models.gender.Gender> includeGenders) {
        this.includeGenders = includeGenders;
    }

    public void setIncludeInstitutions(final java.util.Set<String> includeInstitutions) {
        this.includeInstitutions = includeInstitutions;
    }

    public void setIncludeLocationNameTexts(final java.util.Set<String> includeLocationNameTexts) {
        this.includeLocationNameTexts = includeLocationNameTexts;
    }

    public void setIncludeMaterialTexts(final java.util.Set<String> includeMaterialTexts) {
        this.includeMaterialTexts = includeMaterialTexts;
    }

    public void setIncludeSubjectTermTexts(final java.util.Set<String> includeSubjectTermTexts) {
        this.includeSubjectTermTexts = includeSubjectTermTexts;
    }

    public void setIncludeTechniqueTexts(final java.util.Set<String> includeTechniqueTexts) {
        this.includeTechniqueTexts = includeTechniqueTexts;
    }

    public void setIncludeWorkTypeTexts(final java.util.Set<String> includeWorkTypeTexts) {
        this.includeWorkTypeTexts = includeWorkTypeTexts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("exclude_all", getExcludeAll()).add("exclude_categories", getExcludeCategories()).add("exclude_collections", getExcludeCollections()).add("exclude_color_texts", getExcludeColorTexts()).add("exclude_cultural_context_texts", getExcludeCulturalContextTexts()).add("exclude_genders", getExcludeGenders()).add("exclude_institutions", getExcludeInstitutions()).add("exclude_location_name_texts", getExcludeLocationNameTexts()).add("exclude_material_texts", getExcludeMaterialTexts()).add("exclude_subject_term_texts", getExcludeSubjectTermTexts()).add("exclude_technique_texts", getExcludeTechniqueTexts()).add("exclude_work_type_texts", getExcludeWorkTypeTexts()).add("include_categories", getIncludeCategories()).add("include_collections", getIncludeCollections()).add("include_color_texts", getIncludeColorTexts()).add("include_cultural_context_texts", getIncludeCulturalContextTexts()).add("include_genders", getIncludeGenders()).add("include_institutions", getIncludeInstitutions()).add("include_location_name_texts", getIncludeLocationNameTexts()).add("include_material_texts", getIncludeMaterialTexts()).add("include_subject_term_texts", getIncludeSubjectTermTexts()).add("include_technique_texts", getIncludeTechniqueTexts()).add("include_work_type_texts", getIncludeWorkTypeTexts()).toString();
    }

    private Boolean excludeAll;

    private java.util.Set<String> excludeCategories;

    private java.util.Set<String> excludeCollections;

    private java.util.Set<String> excludeColorTexts;

    private java.util.Set<String> excludeCulturalContextTexts;

    private java.util.Set<org.dressdiscover.api.models.gender.Gender> excludeGenders;

    private java.util.Set<String> excludeInstitutions;

    private java.util.Set<String> excludeLocationNameTexts;

    private java.util.Set<String> excludeMaterialTexts;

    private java.util.Set<String> excludeSubjectTermTexts;

    private java.util.Set<String> excludeTechniqueTexts;

    private java.util.Set<String> excludeWorkTypeTexts;

    private java.util.Set<String> includeCategories;

    private java.util.Set<String> includeCollections;

    private java.util.Set<String> includeColorTexts;

    private java.util.Set<String> includeCulturalContextTexts;

    private java.util.Set<org.dressdiscover.api.models.gender.Gender> includeGenders;

    private java.util.Set<String> includeInstitutions;

    private java.util.Set<String> includeLocationNameTexts;

    private java.util.Set<String> includeMaterialTexts;

    private java.util.Set<String> includeSubjectTermTexts;

    private java.util.Set<String> includeTechniqueTexts;

    private java.util.Set<String> includeWorkTypeTexts;
}
