package net.lab1318.costume.gui.models.institution;

public class InstitutionBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        COLLECTION_STORE_URI("collectionStoreUri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 9, "collection_store_uri", org.thryft.protocol.Type.STRING),
        DATA_RIGHTS("dataRights", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.rights.RightsSetBean>() {}, false, 5, "data_rights", org.thryft.protocol.Type.STRUCT),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 6, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.location.LocationSetBean>() {}, false, 8, "locations", org.thryft.protocol.Type.STRUCT),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 3, "url", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            case "collectionStoreUri": return COLLECTION_STORE_URI;
            case "dataRights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
            case "collection_store_uri": return COLLECTION_STORE_URI;
            case "data_rights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
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

    public InstitutionBean() {
        title = null;
        collectionStoreUri = null;
        dataRights = null;
        external = null;
        hidden = null;
        locations = null;
        url = null;
    }

    public InstitutionBean(final net.lab1318.costume.api.models.institution.Institution other) {
        this.title = other.getTitle();
        this.collectionStoreUri = other.getCollectionStoreUri().isPresent() ? other.getCollectionStoreUri().get() : null;
        this.dataRights = other.getDataRights().isPresent() ? new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getDataRights().get()) : null;
        this.external = other.getExternal().isPresent() ? other.getExternal().get() : null;
        this.hidden = other.getHidden().isPresent() ? other.getHidden().get() : null;
        this.locations = other.getLocations().isPresent() ? new net.lab1318.costume.gui.models.location.LocationSetBean(other.getLocations().get()) : null;
        this.url = other.getUrl().isPresent() ? other.getUrl().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InstitutionBean)) {
            return false;
        }

        final InstitutionBean other = (InstitutionBean)otherObject;
        return
            getTitle().equals(other.getTitle()) &&
            ((getCollectionStoreUri() != null && other.getCollectionStoreUri() != null) ? (getCollectionStoreUri().equals(other.getCollectionStoreUri())) : (getCollectionStoreUri() == null && other.getCollectionStoreUri() == null)) &&
            ((getDataRights() != null && other.getDataRights() != null) ? (getDataRights().equals(other.getDataRights())) : (getDataRights() == null && other.getDataRights() == null)) &&
            ((getExternal() != null && other.getExternal() != null) ? (getExternal() == other.getExternal()) : (getExternal() == null && other.getExternal() == null)) &&
            ((getHidden() != null && other.getHidden() != null) ? (getHidden() == other.getHidden()) : (getHidden() == null && other.getHidden() == null)) &&
            ((getLocations() != null && other.getLocations() != null) ? (getLocations().equals(other.getLocations())) : (getLocations() == null && other.getLocations() == null)) &&
            ((getUrl() != null && other.getUrl() != null) ? (getUrl().equals(other.getUrl())) : (getUrl() == null && other.getUrl() == null));
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
        case TITLE: return getTitle();
        case COLLECTION_STORE_URI: return getCollectionStoreUri();
        case DATA_RIGHTS: return getDataRights();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case URL: return getUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public org.thryft.native_.Uri getCollectionStoreUri() {
        return collectionStoreUri;
    }

    public net.lab1318.costume.gui.models.rights.RightsSetBean getDataRights() {
        return dataRights;
    }

    public Boolean getExternal() {
        return external;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public net.lab1318.costume.gui.models.location.LocationSetBean getLocations() {
        return locations;
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
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getCollectionStoreUri() != null) {
            hashCode = 31 * hashCode + getCollectionStoreUri().hashCode();
        }
        if (getDataRights() != null) {
            hashCode = 31 * hashCode + getDataRights().hashCode();
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
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setCollectionStoreUri(final org.thryft.native_.Uri collectionStoreUri) {
        this.collectionStoreUri = collectionStoreUri;
    }

    public void setDataRights(final net.lab1318.costume.gui.models.rights.RightsSetBean dataRights) {
        this.dataRights = dataRights;
    }

    public void setExternal(final Boolean external) {
        this.external = external;
    }

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public void setLocations(final net.lab1318.costume.gui.models.location.LocationSetBean locations) {
        this.locations = locations;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("collection_store_uri", getCollectionStoreUri()).add("data_rights", getDataRights()).add("external", getExternal()).add("hidden", getHidden()).add("locations", getLocations()).add("url", getUrl()).toString();
    }

    private String title;

    private org.thryft.native_.Uri collectionStoreUri;

    private net.lab1318.costume.gui.models.rights.RightsSetBean dataRights;

    private Boolean external;

    private Boolean hidden;

    private net.lab1318.costume.gui.models.location.LocationSetBean locations;

    private org.thryft.native_.Url url;
}
