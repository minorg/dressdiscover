package org.dressdiscover.gui.models.object;

public class ObjectQueryBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, false, 0, "collection_id", org.thryft.protocol.Type.STRING),
        FACET_FILTERS("facetFilters", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.object.ObjectFacetFiltersBean>() {}, false, 0, "facet_filters", org.thryft.protocol.Type.STRUCT),
        INCLUDE_HIDDEN("includeHidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "include_hidden", org.thryft.protocol.Type.BOOL),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, false, 0, "institution_id", org.thryft.protocol.Type.STRING),
        MORE_LIKE_OBJECT_ID("moreLikeObjectId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectId>() {}, false, 0, "more_like_object_id", org.thryft.protocol.Type.STRING),
        OBJECT_IDS("objectIds", new com.google.common.reflect.TypeToken<java.util.Set<org.dressdiscover.api.models.object.ObjectId>>() {}, false, 0, "object_ids", org.thryft.protocol.Type.SET),
        QUERY_STRING("queryString", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "query_string", org.thryft.protocol.Type.STRING),
        RELATION_TEXT("relationText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "relation_text", org.thryft.protocol.Type.STRING),
        STRUCTURE_TEXTS("structureTexts", new com.google.common.reflect.TypeToken<java.util.Map<String, java.util.List<String>>>() {}, false, 0, "structure_texts", org.thryft.protocol.Type.MAP),
        WORK_TYPE_TEXT("workTypeText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "work_type_text", org.thryft.protocol.Type.STRING);

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
            case "facetFilters": return FACET_FILTERS;
            case "includeHidden": return INCLUDE_HIDDEN;
            case "institutionId": return INSTITUTION_ID;
            case "moreLikeObjectId": return MORE_LIKE_OBJECT_ID;
            case "objectIds": return OBJECT_IDS;
            case "queryString": return QUERY_STRING;
            case "relationText": return RELATION_TEXT;
            case "structureTexts": return STRUCTURE_TEXTS;
            case "workTypeText": return WORK_TYPE_TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "facet_filters": return FACET_FILTERS;
            case "include_hidden": return INCLUDE_HIDDEN;
            case "institution_id": return INSTITUTION_ID;
            case "more_like_object_id": return MORE_LIKE_OBJECT_ID;
            case "object_ids": return OBJECT_IDS;
            case "query_string": return QUERY_STRING;
            case "relation_text": return RELATION_TEXT;
            case "structure_texts": return STRUCTURE_TEXTS;
            case "work_type_text": return WORK_TYPE_TEXT;
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

    public ObjectQueryBean() {
        collectionId = null;
        facetFilters = null;
        includeHidden = null;
        institutionId = null;
        moreLikeObjectId = null;
        objectIds = null;
        queryString = null;
        relationText = null;
        structureTexts = null;
        workTypeText = null;
    }

    public ObjectQueryBean(final org.dressdiscover.api.models.object.ObjectQuery other) {
        this.collectionId = other.getCollectionId().isPresent() ? other.getCollectionId().get() : null;
        this.facetFilters = other.getFacetFilters().isPresent() ? new org.dressdiscover.gui.models.object.ObjectFacetFiltersBean(other.getFacetFilters().get()) : null;
        this.includeHidden = other.getIncludeHidden().isPresent() ? other.getIncludeHidden().get() : null;
        this.institutionId = other.getInstitutionId().isPresent() ? other.getInstitutionId().get() : null;
        this.moreLikeObjectId = other.getMoreLikeObjectId().isPresent() ? other.getMoreLikeObjectId().get() : null;
        this.objectIds = other.getObjectIds().isPresent() ? new java.util.LinkedHashSet<org.dressdiscover.api.models.object.ObjectId>(other.getObjectIds().get()) : null;
        this.queryString = other.getQueryString().isPresent() ? other.getQueryString().get() : null;
        this.relationText = other.getRelationText().isPresent() ? other.getRelationText().get() : null;
        this.structureTexts = other.getStructureTexts().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>, java.util.Map<String, java.util.List<String>>>() {
            @Override
            public java.util.Map<String, java.util.List<String>> apply(final com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> other) {
                final java.util.Map<String, java.util.List<String>> copy = new java.util.HashMap<String, java.util.List<String>>();
                for (final java.util.Map.Entry<String, com.google.common.collect.ImmutableList<String>> entry : other.entrySet()) {
                    copy.put(entry.getKey(), new java.util.ArrayList<String>(entry.getValue()));
                }
                return copy;
            }
        }).apply(other.getStructureTexts().get()) : null;
        this.workTypeText = other.getWorkTypeText().isPresent() ? other.getWorkTypeText().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectQueryBean)) {
            return false;
        }

        final ObjectQueryBean other = (ObjectQueryBean)otherObject;
        return
            ((getCollectionId() != null && other.getCollectionId() != null) ? (getCollectionId().equals(other.getCollectionId())) : (getCollectionId() == null && other.getCollectionId() == null)) &&
            ((getFacetFilters() != null && other.getFacetFilters() != null) ? (getFacetFilters().equals(other.getFacetFilters())) : (getFacetFilters() == null && other.getFacetFilters() == null)) &&
            ((getIncludeHidden() != null && other.getIncludeHidden() != null) ? (getIncludeHidden() == other.getIncludeHidden()) : (getIncludeHidden() == null && other.getIncludeHidden() == null)) &&
            ((getInstitutionId() != null && other.getInstitutionId() != null) ? (getInstitutionId().equals(other.getInstitutionId())) : (getInstitutionId() == null && other.getInstitutionId() == null)) &&
            ((getMoreLikeObjectId() != null && other.getMoreLikeObjectId() != null) ? (getMoreLikeObjectId().equals(other.getMoreLikeObjectId())) : (getMoreLikeObjectId() == null && other.getMoreLikeObjectId() == null)) &&
            ((getObjectIds() != null && other.getObjectIds() != null) ? (getObjectIds().equals(other.getObjectIds())) : (getObjectIds() == null && other.getObjectIds() == null)) &&
            ((getQueryString() != null && other.getQueryString() != null) ? (getQueryString().equals(other.getQueryString())) : (getQueryString() == null && other.getQueryString() == null)) &&
            ((getRelationText() != null && other.getRelationText() != null) ? (getRelationText().equals(other.getRelationText())) : (getRelationText() == null && other.getRelationText() == null)) &&
            ((getStructureTexts() != null && other.getStructureTexts() != null) ? (getStructureTexts().equals(other.getStructureTexts())) : (getStructureTexts() == null && other.getStructureTexts() == null)) &&
            ((getWorkTypeText() != null && other.getWorkTypeText() != null) ? (getWorkTypeText().equals(other.getWorkTypeText())) : (getWorkTypeText() == null && other.getWorkTypeText() == null));
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
        case FACET_FILTERS: return getFacetFilters();
        case INCLUDE_HIDDEN: return getIncludeHidden();
        case INSTITUTION_ID: return getInstitutionId();
        case MORE_LIKE_OBJECT_ID: return getMoreLikeObjectId();
        case OBJECT_IDS: return getObjectIds();
        case QUERY_STRING: return getQueryString();
        case RELATION_TEXT: return getRelationText();
        case STRUCTURE_TEXTS: return getStructureTexts();
        case WORK_TYPE_TEXT: return getWorkTypeText();
        default:
            throw new IllegalStateException();
        }
    }

    public org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public org.dressdiscover.gui.models.object.ObjectFacetFiltersBean getFacetFilters() {
        return facetFilters;
    }

    public Boolean getIncludeHidden() {
        return includeHidden;
    }

    public org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public org.dressdiscover.api.models.object.ObjectId getMoreLikeObjectId() {
        return moreLikeObjectId;
    }

    public java.util.Set<org.dressdiscover.api.models.object.ObjectId> getObjectIds() {
        return objectIds;
    }

    public String getQueryString() {
        return queryString;
    }

    public String getRelationText() {
        return relationText;
    }

    /**
     * key=(value OR value...) AND key=(value OR value...)
     */
    public java.util.Map<String, java.util.List<String>> getStructureTexts() {
        return structureTexts;
    }

    public String getWorkTypeText() {
        return workTypeText;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getCollectionId() != null) {
            hashCode = 31 * hashCode + getCollectionId().hashCode();
        }
        if (getFacetFilters() != null) {
            hashCode = 31 * hashCode + getFacetFilters().hashCode();
        }
        if (getIncludeHidden() != null) {
            hashCode = 31 * hashCode + (getIncludeHidden() ? 1 : 0);
        }
        if (getInstitutionId() != null) {
            hashCode = 31 * hashCode + getInstitutionId().hashCode();
        }
        if (getMoreLikeObjectId() != null) {
            hashCode = 31 * hashCode + getMoreLikeObjectId().hashCode();
        }
        if (getObjectIds() != null) {
            hashCode = 31 * hashCode + getObjectIds().hashCode();
        }
        if (getQueryString() != null) {
            hashCode = 31 * hashCode + getQueryString().hashCode();
        }
        if (getRelationText() != null) {
            hashCode = 31 * hashCode + getRelationText().hashCode();
        }
        if (getStructureTexts() != null) {
            hashCode = 31 * hashCode + getStructureTexts().hashCode();
        }
        if (getWorkTypeText() != null) {
            hashCode = 31 * hashCode + getWorkTypeText().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return getCollectionId() == null && getFacetFilters() == null && getIncludeHidden() == null && getInstitutionId() == null && getMoreLikeObjectId() == null && getObjectIds() == null && getQueryString() == null && getRelationText() == null && getStructureTexts() == null && getWorkTypeText() == null;
    }

    public void setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        this.collectionId = collectionId;
    }

    public void setFacetFilters(final org.dressdiscover.gui.models.object.ObjectFacetFiltersBean facetFilters) {
        this.facetFilters = facetFilters;
    }

    public void setIncludeHidden(final Boolean includeHidden) {
        this.includeHidden = includeHidden;
    }

    public void setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

    public void setMoreLikeObjectId(final org.dressdiscover.api.models.object.ObjectId moreLikeObjectId) {
        this.moreLikeObjectId = moreLikeObjectId;
    }

    public void setObjectIds(final java.util.Set<org.dressdiscover.api.models.object.ObjectId> objectIds) {
        this.objectIds = objectIds;
    }

    public void setQueryString(final String queryString) {
        this.queryString = queryString;
    }

    public void setRelationText(final String relationText) {
        this.relationText = relationText;
    }

    public void setStructureTexts(final java.util.Map<String, java.util.List<String>> structureTexts) {
        this.structureTexts = structureTexts;
    }

    public void setWorkTypeText(final String workTypeText) {
        this.workTypeText = workTypeText;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("facet_filters", getFacetFilters()).add("include_hidden", getIncludeHidden()).add("institution_id", getInstitutionId()).add("more_like_object_id", getMoreLikeObjectId()).add("object_ids", getObjectIds()).add("query_string", getQueryString()).add("relation_text", getRelationText()).add("structure_texts", getStructureTexts()).add("work_type_text", getWorkTypeText()).toString();
    }

    private org.dressdiscover.api.models.collection.CollectionId collectionId;

    private org.dressdiscover.gui.models.object.ObjectFacetFiltersBean facetFilters;

    private Boolean includeHidden;

    private org.dressdiscover.api.models.institution.InstitutionId institutionId;

    private org.dressdiscover.api.models.object.ObjectId moreLikeObjectId;

    private java.util.Set<org.dressdiscover.api.models.object.ObjectId> objectIds;

    private String queryString;

    private String relationText;

    /**
     * key=(value OR value...) AND key=(value OR value...)
     */
    private java.util.Map<String, java.util.List<String>> structureTexts;

    private String workTypeText;
}
