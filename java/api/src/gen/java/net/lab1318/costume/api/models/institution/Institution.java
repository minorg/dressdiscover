package net.lab1318.costume.api.models.institution;

public class Institution implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            copyrightNotice = null;
            modelMetadata = null;
            title = null;
            url = null;
        }

        public Builder(final Institution other) {
            this.copyrightNotice = other.getCopyrightNotice();
            this.modelMetadata = other.getModelMetadata();
            this.title = other.getTitle();
            this.url = other.getUrl();
        }

        protected Institution _build(final String copyrightNotice, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final org.thryft.native_.Url url) {
            return new Institution(copyrightNotice, modelMetadata, title, url);
        }

        public Institution build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(copyrightNotice, "net.lab1318.costume.api.models.institution.Institution: missing copyrightNotice"), com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title"), com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.institution.Institution: missing url"));
        }

        public final String getCopyrightNotice() {
            return copyrightNotice;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
        }

        public final String getTitle() {
            return title;
        }

        public final org.thryft.native_.Url getUrl() {
            return url;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readListBegin();
            copyrightNotice = iprot.readString();
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            title = iprot.readString();
            url = org.thryft.native_.Url.parse(iprot.readString());
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "copyright_notice": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        copyrightNotice = iprot.readString();
                    }
                    break;
                }
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        url = org.thryft.native_.Url.parse(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setCopyrightNotice(final String copyrightNotice) {
            this.copyrightNotice = com.google.common.base.Preconditions.checkNotNull(copyrightNotice);
            return this;
        }

        public Builder setIfPresent(final Institution other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCopyrightNotice(other.getCopyrightNotice());
            setModelMetadata(other.getModelMetadata());
            setTitle(other.getTitle());
            setUrl(other.getUrl());

            return this;
        }

        public Builder setModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder setUrl(final org.thryft.native_.Url url) {
            this.url = com.google.common.base.Preconditions.checkNotNull(url);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "copyright_notice": setCopyrightNotice((String)value); return this;
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "title": setTitle((String)value); return this;
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetCopyrightNotice() {
            this.copyrightNotice = null;
            return this;
        }

        public Builder unsetModelMetadata() {
            this.modelMetadata = null;
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetUrl() {
            this.url = null;
            return this;
        }

        private String copyrightNotice;
        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        private String title;
        private org.thryft.native_.Url url;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COPYRIGHT_NOTICE("copyrightNotice", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "copyright_notice", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 3, "url", org.thryft.protocol.Type.STRING);

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
            case "copyrightNotice": return COPYRIGHT_NOTICE;
            case "modelMetadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "copyright_notice": return COPYRIGHT_NOTICE;
            case "model_metadata": return MODEL_METADATA;
            case "title": return TITLE;
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

    /**
     * Copy constructor
     */
    public Institution(final Institution other) {
        this(other.getCopyrightNotice(), other.getModelMetadata(), other.getTitle(), other.getUrl());
    }

    /**
     * Optional constructor
     */
    public Institution(final String copyrightNotice, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final org.thryft.native_.Url url) {
        this.copyrightNotice = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(copyrightNotice, "net.lab1318.costume.api.models.institution.Institution: missing copyrightNotice"), "net.lab1318.costume.api.models.institution.Institution: copyrightNotice is empty");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title"), "net.lab1318.costume.api.models.institution.Institution: title is empty");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.institution.Institution: missing url");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Institution other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Institution> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Institution)) {
            return false;
        }

        final Institution other = (Institution)otherObject;
        return
            getCopyrightNotice().equals(other.getCopyrightNotice()) &&
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getUrl().equals(other.getUrl());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "copyright_notice": return getCopyrightNotice();
        case "model_metadata": return getModelMetadata();
        case "title": return getTitle();
        case "url": return getUrl();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final String getCopyrightNotice() {
        return copyrightNotice;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    public final String getTitle() {
        return title;
    }

    public final org.thryft.native_.Url getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCopyrightNotice().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        hashCode = 31 * hashCode + getUrl().hashCode();
        return hashCode;
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Institution readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String copyrightNotice = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        org.thryft.native_.Url url = null;

        iprot.readListBegin();
        copyrightNotice = iprot.readString();
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        title = iprot.readString();
        url = org.thryft.native_.Url.parse(iprot.readString());
        iprot.readListEnd();
        try {
            return new Institution(copyrightNotice, modelMetadata, title, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String copyrightNotice = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        org.thryft.native_.Url url = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "copyright_notice": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    copyrightNotice = iprot.readString();
                }
                break;
            }
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    title = iprot.readString();
                }
                break;
            }
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    url = org.thryft.native_.Url.parse(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Institution(copyrightNotice, modelMetadata, title, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Institution replaceCopyrightNotice(final String copyrightNotice) {
        return new Institution(copyrightNotice, this.modelMetadata, this.title, this.url);
    }

    public Institution replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new Institution(this.copyrightNotice, modelMetadata, this.title, this.url);
    }

    public Institution replaceTitle(final String title) {
        return new Institution(this.copyrightNotice, this.modelMetadata, title, this.url);
    }

    public Institution replaceUrl(final org.thryft.native_.Url url) {
        return new Institution(this.copyrightNotice, this.modelMetadata, this.title, url);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("copyright_notice", getCopyrightNotice()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("url", getUrl()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getCopyrightNotice());

        getModelMetadata().writeAsStruct(oprot);

        oprot.writeString(getTitle());

        oprot.writeString(getUrl().toString());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.institution.Institution");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("copyright_notice", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getCopyrightNotice());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)3);
        getModelMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeString(getUrl().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final String copyrightNotice;

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    private final String title;

    private final org.thryft.native_.Url url;
}
