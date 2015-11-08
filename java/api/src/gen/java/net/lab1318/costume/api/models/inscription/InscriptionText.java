package net.lab1318.costume.api.models.inscription;

public class InscriptionText implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            type = null;
            value = null;
            lang = com.google.common.base.Optional.absent();
        }

        public Builder(final InscriptionText other) {
            this.type = other.getType();
            this.value = other.getValue();
            this.lang = other.getLang();
        }

        protected InscriptionText _build(final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final String value, final com.google.common.base.Optional<String> lang) {
            return new InscriptionText(type, value, lang);
        }

        public InscriptionText build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type"), com.google.common.base.Preconditions.checkNotNull(value, "net.lab1318.costume.api.models.inscription.InscriptionText: missing value"), com.google.common.base.Preconditions.checkNotNull(lang, "net.lab1318.costume.api.models.inscription.InscriptionText: missing lang"));
        }

        public final com.google.common.base.Optional<String> getLang() {
            return lang;
        }

        public final net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
            return type;
        }

        public final String getValue() {
            return value;
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
            type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
            value = iprot.readString();
            if (__list.getSize() > 2) {
                lang = com.google.common.base.Optional.of(iprot.readString());
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
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
                    }
                    break;
                }
                case "value": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        value = iprot.readString();
                    }
                    break;
                }
                case "lang": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        lang = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final InscriptionText other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            setValue(other.getValue());
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

        public Builder setType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setValue(final String value) {
            this.value = com.google.common.base.Preconditions.checkNotNull(value);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": setType((net.lab1318.costume.api.models.inscription.InscriptionTextType)value); return this;
            case "value": setValue((String)value); return this;
            case "lang": setLang((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetLang() {
            this.lang = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unsetValue() {
            this.value = null;
            return this;
        }

        private net.lab1318.costume.api.models.inscription.InscriptionTextType type;
        private String value;
        private com.google.common.base.Optional<String> lang;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.inscription.InscriptionTextType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        VALUE("value", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "value", org.thryft.protocol.Type.STRING),
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
            case "type": return TYPE;
            case "value": return VALUE;
            case "lang": return LANG;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "value": return VALUE;
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
        this(other.getType(), other.getValue(), other.getLang());
    }

    /**
     * Required constructor
     */
    public InscriptionText(final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final String value) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.value = com.google.common.base.Preconditions.checkNotNull(value, "net.lab1318.costume.api.models.inscription.InscriptionText: missing value");
        this.lang = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public InscriptionText(final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final String value, final @javax.annotation.Nullable String lang) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.value = com.google.common.base.Preconditions.checkNotNull(value, "net.lab1318.costume.api.models.inscription.InscriptionText: missing value");
        this.lang = org.thryft.Preconditions.checkOptionalStringMinLength(org.thryft.Preconditions.checkOptionalStringMaxLength(com.google.common.base.Optional.fromNullable(lang), 3, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a maximum length of 3"), 2, "net.lab1318.costume.api.models.inscription.InscriptionText: lang must have a minimum length of 2");
    }

    /**
     * Optional constructor
     */
    public InscriptionText(final net.lab1318.costume.api.models.inscription.InscriptionTextType type, final String value, final com.google.common.base.Optional<String> lang) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.inscription.InscriptionText: missing type");
        this.value = com.google.common.base.Preconditions.checkNotNull(value, "net.lab1318.costume.api.models.inscription.InscriptionText: missing value");
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
            getType().equals(other.getType()) &&
            getValue().equals(other.getValue()) &&
            getLang().equals(other.getLang());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "type": return getType();
        case "value": return getValue();
        case "lang": return getLang();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getLang() {
        return lang;
    }

    public final net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
        return type;
    }

    public final String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        hashCode = 31 * hashCode + getValue().hashCode();
        if (getLang().isPresent()) {
            hashCode = 31 * hashCode + getLang().get().hashCode();
        }
        return hashCode;
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
        net.lab1318.costume.api.models.inscription.InscriptionTextType type = null;
        String value = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
        value = iprot.readString();
        if (__list.getSize() > 2) {
            lang = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new InscriptionText(type, value, lang);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.inscription.InscriptionTextType type = null;
        String value = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.inscription.InscriptionTextType.class);
                }
                break;
            }
            case "value": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    value = iprot.readString();
                }
                break;
            }
            case "lang": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    lang = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new InscriptionText(type, value, lang);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public InscriptionText replaceLang(final com.google.common.base.Optional<String> lang) {
        return new InscriptionText(this.type, this.value, lang);
    }

    public InscriptionText replaceLang(final String lang) {
        return replaceLang(com.google.common.base.Optional.fromNullable(lang));
    }

    public InscriptionText replaceType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
        return new InscriptionText(type, this.value, this.lang);
    }

    public InscriptionText replaceValue(final String value) {
        return new InscriptionText(this.type, value, this.lang);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("value", getValue()).add("lang", getLang().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeEnum(getType());

        oprot.writeString(getValue());

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
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("value", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getValue());
        oprot.writeFieldEnd();

        if (getLang().isPresent()) {
            oprot.writeFieldBegin("lang", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getLang().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.inscription.InscriptionTextType type;

    private final String value;

    private final com.google.common.base.Optional<String> lang;
}
