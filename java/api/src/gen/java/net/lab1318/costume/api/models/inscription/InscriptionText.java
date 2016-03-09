package net.lab1318.costume.api.models.inscription;

public class InscriptionText implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            lang = com.google.common.base.Optional.absent();
        }

        public Builder(final InscriptionText other) {
            this.text = other.getText();
            this.type = other.getType();
            this.lang = other.getLang();
        }

        protected InscriptionText _build(final String text, final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final com.google.common.base.Optional<String> lang) {
            return new InscriptionText(text, type, lang);
        }

        public InscriptionText build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.inscription.InscriptionText: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type"), com.google.common.base.Preconditions.checkNotNull(lang, "net.lab1318.costume.api.models.inscription.InscriptionText: missing lang"));
        }

        public final com.google.common.base.Optional<String> getLang() {
            return lang;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
            return type;
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
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
            if (__list.getSize() > 2) {
                lang = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
                    }
                    break;
                }
                case "lang": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        lang = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final InscriptionText other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getLang().isPresent()) {
                setLang(other.getLang());
            }

            return this;
        }

        public Builder setLang(final com.google.common.base.Optional<String> lang) {
            this.lang = com.google.common.base.Preconditions.checkNotNull(lang);
            return this;
        }

        public Builder setLang(@javax.annotation.Nullable final String lang) {
            this.lang = com.google.common.base.Optional.fromNullable(lang);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.inscription.InscriptionTextType)value); return this;
            case "lang": setLang((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetLang() {
            this.lang = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": return unsetText();
            case "type": return unsetType();
            case "lang": return unsetLang();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.inscription.InscriptionTextType type;
        private com.google.common.base.Optional<String> lang;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.inscription.InscriptionTextType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        LANG("lang", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "lang", org.thryft.protocol.Type.STRING);

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
            case "text": return TEXT;
            case "type": return TYPE;
            case "lang": return LANG;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "lang": return LANG;
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
    public InscriptionText(final InscriptionText other) {
        this(other.getText(), other.getType(), other.getLang());
    }

    /**
     * Required constructor
     */
    public InscriptionText(final String text, final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.inscription.InscriptionText: missing text"), "net.lab1318.costume.api.models.inscription.InscriptionText: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.lang = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public InscriptionText(final String text, final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final @javax.annotation.Nullable String lang) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.inscription.InscriptionText: missing text"), "net.lab1318.costume.api.models.inscription.InscriptionText: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.lang = org.thryft.Preconditions.checkOptionalStringMinLength(org.thryft.Preconditions.checkOptionalStringMaxLength(com.google.common.base.Optional.fromNullable(lang), 3, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a maximum length of 3"), 2, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a minimum length of 2");
    }

    /**
     * Optional constructor
     */
    public InscriptionText(final String text, final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final com.google.common.base.Optional<String> lang) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.inscription.InscriptionText: missing text"), "net.lab1318.costume.api.models.inscription.InscriptionText: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.lang = org.thryft.Preconditions.checkOptionalStringMinLength(org.thryft.Preconditions.checkOptionalStringMaxLength(com.google.common.base.Preconditions.checkNotNull(lang, "net.lab1318.costume.api.models.inscription.InscriptionText: missing lang"), 3, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a maximum length of 3"), 2, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a minimum length of 2");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InscriptionText other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InscriptionText> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionText)) {
            return false;
        }

        final InscriptionText other = (InscriptionText)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            ((getLang().isPresent() && other.getLang().isPresent()) ? (getLang().get().equals(other.getLang().get())) : (!getLang().isPresent() && !other.getLang().isPresent()));
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
        case TEXT: return getText();
        case TYPE: return getType();
        case LANG: return getLang();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getLang() {
        return lang;
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getLang().isPresent()) {
            hashCode = 31 * hashCode + getLang().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static InscriptionText readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InscriptionText readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.inscription.InscriptionTextType type = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
        if (__list.getSize() > 2) {
            lang = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new InscriptionText(text, type, lang);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.inscription.InscriptionTextType type = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "text": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    text = iprot.readString();
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
                }
                break;
            }
            case "lang": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    lang = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            default:
                if (unknownFieldCallback.isPresent()) {
                    unknownFieldCallback.get().apply(ifield);
                }
                break;
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new InscriptionText(text, type, lang);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public InscriptionText replaceLang(final com.google.common.base.Optional<String> lang) {
        return new InscriptionText(this.text, this.type, lang);
    }

    public InscriptionText replaceLang(final String lang) {
        return replaceLang(com.google.common.base.Optional.fromNullable(lang));
    }

    public InscriptionText replaceText(final String text) {
        return new InscriptionText(text, this.type, this.lang);
    }

    public InscriptionText replaceType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
        return new InscriptionText(this.text, type, this.lang);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("lang", getLang().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getLang().isPresent()) {
            oprot.writeString(getLang().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.inscription.InscriptionText");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getLang().isPresent()) {
            oprot.writeFieldBegin("lang", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getLang().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.inscription.InscriptionTextType type;

    private final com.google.common.base.Optional<String> lang;
}
