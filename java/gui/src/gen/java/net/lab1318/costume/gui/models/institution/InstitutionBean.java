package net.lab1318.costume.gui.models.institution;

public class InstitutionBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.ModelMetadataBean>() {}, true, 4, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        DATA_RIGHTS("dataRights", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.rights.RightsSetBean>() {}, false, 5, "data_rights", org.thryft.protocol.Type.STRUCT),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 6, "hidden", org.thryft.protocol.Type.BOOL),
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
            case "modelMetadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "dataRights": return DATA_RIGHTS;
            case "hidden": return HIDDEN;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "model_metadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "data_rights": return DATA_RIGHTS;
            case "hidden": return HIDDEN;
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
        modelMetadata = null;
        title = null;
        dataRights = null;
        hidden = null;
        url = null;
    }

    public InstitutionBean(final net.lab1318.costume.api.models.institution.Institution other) {
        this.modelMetadata = new net.lab1318.costume.gui.models.ModelMetadataBean(other.getModelMetadata());
        this.title = other.getTitle();
        this.dataRights = other.getDataRights().isPresent() ? new net.lab1318.costume.gui.models.rights.RightsSetBean(other.getDataRights().get()) : null;
        this.hidden = other.getHidden().isPresent() ? other.getHidden().get() : null;
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            ((getDataRights() != null && other.getDataRights() != null) ? (getDataRights().equals(other.getDataRights())) : (getDataRights() == null && other.getDataRights() == null)) &&
            ((getHidden() != null && other.getHidden() != null) ? (getHidden() == other.getHidden()) : (getHidden() == null && other.getHidden() == null)) &&
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
        case MODEL_METADATA: return getModelMetadata();
        case TITLE: return getTitle();
        case DATA_RIGHTS: return getDataRights();
        case HIDDEN: return getHidden();
        case URL: return getUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public net.lab1318.costume.gui.models.rights.RightsSetBean getDataRights() {
        return dataRights;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public net.lab1318.costume.gui.models.ModelMetadataBean getModelMetadata() {
        return modelMetadata;
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
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDataRights() != null) {
            hashCode = 31 * hashCode + getDataRights().hashCode();
        }
        if (getHidden() != null) {
            hashCode = 31 * hashCode + (getHidden() ? 1 : 0);
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

    public void setDataRights(final net.lab1318.costume.gui.models.rights.RightsSetBean dataRights) {
        this.dataRights = dataRights;
    }

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public void setModelMetadata(final net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setUrl(final org.thryft.native_.Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("model_metadata", getModelMetadata()).add("title", getTitle()).add("data_rights", getDataRights()).add("hidden", getHidden()).add("url", getUrl()).toString();
    }

    private net.lab1318.costume.gui.models.ModelMetadataBean modelMetadata;

    private String title;

    private net.lab1318.costume.gui.models.rights.RightsSetBean dataRights;

    private Boolean hidden;

    private org.thryft.native_.Url url;
}
