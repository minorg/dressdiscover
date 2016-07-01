package org.dressdiscover.gui.models.collection;

public class CollectionBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "description", org.thryft.protocol.Type.STRING),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 5, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.location.LocationSetBean>() {}, false, 8, "locations", org.thryft.protocol.Type.STRUCT),
        OBJECT_STORE_URI("objectStoreUri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 10, "object_store_uri", org.thryft.protocol.Type.STRING),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 9, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.work_type.WorkTypeSetBean>() {}, false, 6, "work_types", org.thryft.protocol.Type.STRUCT);

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
            case "institutionId": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "objectStoreUri": return OBJECT_STORE_URI;
            case "url": return URL;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "object_store_uri": return OBJECT_STORE_URI;
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

    public CollectionBean() {
        institutionId = null;
        title = null;
        description = null;
        external = null;
        hidden = null;
        locations = null;
        objectStoreUri = null;
        url = null;
        workTypes = null;
    }

    public CollectionBean(final org.dressdiscover.api.models.collection.Collection other) {
        this.institutionId = other.getInstitutionId();
        this.title = other.getTitle();
        this.description = other.getDescription().isPresent() ? other.getDescription().get() : null;
        this.external = other.getExternal().isPresent() ? other.getExternal().get() : null;
        this.hidden = other.getHidden().isPresent() ? other.getHidden().get() : null;
        this.locations = other.getLocations().isPresent() ? new org.dressdiscover.gui.models.location.LocationSetBean(other.getLocations().get()) : null;
        this.objectStoreUri = other.getObjectStoreUri().isPresent() ? other.getObjectStoreUri().get() : null;
        this.url = other.getUrl().isPresent() ? other.getUrl().get() : null;
        this.workTypes = other.getWorkTypes().isPresent() ? new org.dressdiscover.gui.models.work_type.WorkTypeSetBean(other.getWorkTypes().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof CollectionBean)) {
            return false;
        }

        final CollectionBean other = (CollectionBean)otherObject;
        return
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            ((getDescription() != null && other.getDescription() != null) ? (getDescription().equals(other.getDescription())) : (getDescription() == null && other.getDescription() == null)) &&
            ((getExternal() != null && other.getExternal() != null) ? (getExternal() == other.getExternal()) : (getExternal() == null && other.getExternal() == null)) &&
            ((getHidden() != null && other.getHidden() != null) ? (getHidden() == other.getHidden()) : (getHidden() == null && other.getHidden() == null)) &&
            ((getLocations() != null && other.getLocations() != null) ? (getLocations().equals(other.getLocations())) : (getLocations() == null && other.getLocations() == null)) &&
            ((getObjectStoreUri() != null && other.getObjectStoreUri() != null) ? (getObjectStoreUri().equals(other.getObjectStoreUri())) : (getObjectStoreUri() == null && other.getObjectStoreUri() == null)) &&
            ((getUrl() != null && other.getUrl() != null) ? (getUrl().equals(other.getUrl())) : (getUrl() == null && other.getUrl() == null)) &&
            ((getWorkTypes() != null && other.getWorkTypes() != null) ? (getWorkTypes().equals(other.getWorkTypes())) : (getWorkTypes() == null && other.getWorkTypes() == null));
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
        case INSTITUTION_ID: return getInstitutionId();
        case TITLE: return getTitle();
        case DESCRIPTION: return getDescription();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case OBJECT_STORE_URI: return getObjectStoreUri();
        case URL: return getUrl();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public String getDescription() {
        return description;
    }

    public Boolean getExternal() {
        return external;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public org.dressdiscover.gui.models.location.LocationSetBean getLocations() {
        return locations;
    }

    public org.thryft.native_.Uri getObjectStoreUri() {
        return objectStoreUri;
    }

    public String getTitle() {
        return title;
    }

    public org.thryft.native_.Url getUrl() {
        return url;
    }

    public org.dressdiscover.gui.models.work_type.WorkTypeSetBean getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getExternal() != null) {
            hashCode = 31 * hashCode + (getExternal() ? 1 : 0);
        }
        if (getHidden() != null) {
            hashCode = 31 * hashCode + (getHidden() ? 1 : 0);
        }
        if (getLocations() != null) {
            hashCode = 31 * hashCode + getLocations().hashCode();
        }
        if (getObjectStoreUri() != null) {
            hashCode = 31 * hashCode + getObjectStoreUri().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
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

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setExternal(final Boolean external) {
        this.external = external;
    }

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public void setInstitutionId(final String institutionId) {
        this.institutionId = institutionId;
    }

    public void setLocations(final org.dressdiscover.gui.models.location.LocationSetBean locations) {
        this.locations = locations;
    }

    public void setObjectStoreUri(final org.thryft.native_.Uri objectStoreUri) {
        this.objectStoreUri = objectStoreUri;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    public void setWorkTypes(final org.dressdiscover.gui.models.work_type.WorkTypeSetBean workTypes) {
        this.workTypes = workTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("institution_id", getInstitutionId()).add("title", getTitle()).add("description", getDescription()).add("external", getExternal()).add("hidden", getHidden()).add("locations", getLocations()).add("object_store_uri", getObjectStoreUri()).add("url", getUrl()).add("work_types", getWorkTypes()).toString();
    }

    private String institutionId;

    private String title;

    private String description;

    private Boolean external;

    private Boolean hidden;

    private org.dressdiscover.gui.models.location.LocationSetBean locations;

    private org.thryft.native_.Uri objectStoreUri;

    private org.thryft.native_.Url url;

    private org.dressdiscover.gui.models.work_type.WorkTypeSetBean workTypes;
}
