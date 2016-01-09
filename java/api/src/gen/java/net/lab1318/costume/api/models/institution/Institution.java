package net.lab1318.costume.api.models.institution;

public class Institution implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            modelMetadata = null;
            title = null;
            dataRights = com.google.common.base.Optional.absent();
            hidden = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
        }

        public Builder(final Institution other) {
            this.modelMetadata = other.getModelMetadata();
            this.title = other.getTitle();
            this.dataRights = other.getDataRights();
            this.hidden = other.getHidden();
            this.url = other.getUrl();
        }

        protected Institution _build(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return new Institution(modelMetadata, title, dataRights, hidden, url);
        }

        public Institution build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title"), com.google.common.base.Preconditions.checkNotNull(dataRights, "net.lab1318.costume.api.models.institution.Institution: missing dataRights"), com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.institution.Institution: missing hidden"), com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.institution.Institution: missing url"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getDataRights() {
            return dataRights;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            title = iprot.readString();
            if (__list.getSize() > 2) {
                dataRights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 4) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
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
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
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
                case "data_rights": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        dataRights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setDataRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights) {
            this.dataRights = com.google.common.base.Preconditions.checkNotNull(dataRights);
            return this;
        }

        public Builder setDataRights(@javax.annotation.Nullable final net.lab1318.costume.api.models.rights.RightsSet dataRights) {
            this.dataRights = com.google.common.base.Optional.fromNullable(dataRights);
            return this;
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = com.google.common.base.Preconditions.checkNotNull(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            this.hidden = com.google.common.base.Optional.fromNullable(hidden);
            return this;
        }

        public Builder setIfPresent(final Institution other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setModelMetadata(other.getModelMetadata());
            setTitle(other.getTitle());
            if (other.getDataRights().isPresent()) {
                setDataRights(other.getDataRights());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }

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

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            this.url = com.google.common.base.Preconditions.checkNotNull(url);
            return this;
        }

        public Builder setUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
            this.url = com.google.common.base.Optional.fromNullable(url);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "title": setTitle((String)value); return this;
            case "data_rights": setDataRights((net.lab1318.costume.api.models.rights.RightsSet)value); return this;
            case "hidden": setHidden((Boolean)value); return this;
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetDataRights() {
            this.dataRights = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.absent();
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
            this.url = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "model_metadata": return unsetModelMetadata();
            case "title": return unsetTitle();
            case "data_rights": return unsetDataRights();
            case "hidden": return unsetHidden();
            case "url": return unsetUrl();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        private String title;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 4, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        DATA_RIGHTS("dataRights", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsSet>() {}, false, 5, "data_rights", org.thryft.protocol.Type.STRUCT),
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

    /**
     * Copy constructor
     */
    public Institution(final Institution other) {
        this(other.getModelMetadata(), other.getTitle(), other.getDataRights(), other.getHidden(), other.getUrl());
    }

    /**
     * Required constructor
     */
    public Institution(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title) {
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata");
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title");
        this.dataRights = com.google.common.base.Optional.absent();
        this.hidden = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Institution(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final @javax.annotation.Nullable net.lab1318.costume.api.models.rights.RightsSet dataRights, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable org.thryft.native_.Url url) {
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata");
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title");
        this.dataRights = com.google.common.base.Optional.fromNullable(dataRights);
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(hidden), "net.lab1318.costume.api.models.institution.Institution: hidden must be true");
        this.url = com.google.common.base.Optional.fromNullable(url);
    }

    /**
     * Optional constructor
     */
    public Institution(final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.institution.Institution: missing modelMetadata");
        this.title = com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title");
        this.dataRights = com.google.common.base.Preconditions.checkNotNull(dataRights, "net.lab1318.costume.api.models.institution.Institution: missing dataRights");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(hidden, "net.lab1318.costume.api.models.institution.Institution: missing hidden"), "net.lab1318.costume.api.models.institution.Institution: hidden must be true");
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getDataRights().equals(other.getDataRights()) &&
            getHidden().equals(other.getHidden()) &&
            getUrl().equals(other.getUrl());
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getDataRights() {
        return dataRights;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDataRights().isPresent()) {
            hashCode = 31 * hashCode + getDataRights().get().hashCode();
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        title = iprot.readString();
        if (__list.getSize() > 2) {
            dataRights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            hidden = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 4) {
            try {
                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new Institution(modelMetadata, title, dataRights, hidden, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 4) {
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
            case "data_rights": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    dataRights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                }
                break;
            }
            case "hidden": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Institution(modelMetadata, title, dataRights, hidden, url);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Institution replaceDataRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights) {
        return new Institution(this.modelMetadata, this.title, dataRights, this.hidden, this.url);
    }

    public Institution replaceDataRights(final net.lab1318.costume.api.models.rights.RightsSet dataRights) {
        return replaceDataRights(com.google.common.base.Optional.fromNullable(dataRights));
    }

    public Institution replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Institution(this.modelMetadata, this.title, this.dataRights, hidden, this.url);
    }

    public Institution replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Institution replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new Institution(modelMetadata, this.title, this.dataRights, this.hidden, this.url);
    }

    public Institution replaceTitle(final String title) {
        return new Institution(this.modelMetadata, title, this.dataRights, this.hidden, this.url);
    }

    public Institution replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Institution(this.modelMetadata, this.title, this.dataRights, this.hidden, url);
    }

    public Institution replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("model_metadata", getModelMetadata()).add("title", getTitle()).add("data_rights", getDataRights().orNull()).add("hidden", getHidden().orNull()).add("url", getUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        getModelMetadata().writeAsStruct(oprot);

        oprot.writeString(getTitle());

        if (getDataRights().isPresent()) {
            getDataRights().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getUrl().isPresent()) {
            oprot.writeString(getUrl().get().toString());
        } else {
            oprot.writeNull();
        }

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
        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)4);
        getModelMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDataRights().isPresent()) {
            oprot.writeFieldBegin("data_rights", org.thryft.protocol.Type.STRUCT, (short)5);
            getDataRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)6);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    private final String title;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> dataRights;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;
}
