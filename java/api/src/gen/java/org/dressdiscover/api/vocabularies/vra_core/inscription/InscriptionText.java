package org.dressdiscover.api.vocabularies.vra_core.inscription;

public final class InscriptionText implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            text = null;
            type = null;
            lang = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final InscriptionText other) {
            this.text = other.getText();
            this.type = other.getType();
            this.lang = other.getLang();
        }

        protected InscriptionText _build(final String text, final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type, final com.google.common.base.Optional<String> lang) {
            return new InscriptionText(text, type, lang, DefaultConstructionValidator.getInstance());
        }

        public InscriptionText build() {
            return _build(text, type, lang);
        }

        public final com.google.common.base.Optional<String> getLang() {
            return lang;
        }

        public final String getText() {
            return text;
        }

        public final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType getType() {
            return type;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot, unknownFieldCallback);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                text = iprot.readString();
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType.class);
                if (__list.getSize() > 2) {
                    lang = com.google.common.base.Optional.of(iprot.readString());
                }
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
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
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType.class);
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
            return set(FieldMetadata.valueOfThriftName(fieldThriftName), value);
        }

        public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return set((FieldMetadata)fieldMetadata, value);
        }

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TEXT: setText((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType)value); return this;
            case LANG: setLang((String)value); return this;
            default:
                throw new IllegalStateException();
            }
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
            this.lang = DefaultConstructionValidator.getInstance().validateLang(lang);
            return this;
        }

        public Builder setLang(@javax.annotation.Nullable final String lang) {
            return setLang(com.google.common.base.Optional.fromNullable(lang));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
            return this;
        }

        public Builder unset(final String fieldThriftName) {
            return unset(FieldMetadata.valueOfThriftName(fieldThriftName));
        }

        public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return unset((FieldMetadata)fieldMetadata);
        }

        public Builder unset(final FieldMetadata fieldMetadata) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TEXT: return unsetText();
            case TYPE: return unsetType();
            case LANG: return unsetLang();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetLang() {
            this.lang = com.google.common.base.Optional.<String> absent();
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

        private String text;
        private org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type;
        private com.google.common.base.Optional<String> lang;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<InscriptionText> {
        @Override
        public InscriptionText readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return InscriptionText.readAs(iprot, type);
        }

        @Override
        public InscriptionText readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InscriptionText.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public InscriptionText readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InscriptionText.readAsList(iprot);
        }

        @Override
        public InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InscriptionText.readAsStruct(iprot);
        }

        @Override
        public InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InscriptionText.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
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

    public interface Validator<ExceptionT extends Exception> {
        public String validateText(final String text) throws ExceptionT;

        public org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType validateType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) throws ExceptionT;

        public com.google.common.base.Optional<String> validateLang(final com.google.common.base.Optional<String> lang) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType validateType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<String> validateLang(final com.google.common.base.Optional<String> lang) throws RuntimeException {
            if (lang == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is null");
            }
            if (!lang.isPresent()) {
                return lang;
            }
            if (lang.get().length() < 2) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is less than min length 2");
            }
            if (lang.get().length() > 3) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is greater than max length 3");
            }
            return lang;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType validateType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<String> validateLang(final com.google.common.base.Optional<String> lang) {
            return lang;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType validateType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<String> validateLang(final com.google.common.base.Optional<String> lang) throws org.thryft.protocol.InputProtocolException {
            if (lang == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LANG, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is null");
            }
            if (!lang.isPresent()) {
                return lang;
            }
            if (lang.get().length() < 2) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANG, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is less than min length 2");
            }
            if (lang.get().length() > 3) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANG, "org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText: lang is greater than max length 3");
            }
            return lang;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType validateType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<String> validateLang(final com.google.common.base.Optional<String> lang) {
            return lang;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public InscriptionText(final InscriptionText other) {
        this(other.getText(), other.getType(), other.getLang(), NopConstructionValidator.getInstance());
    }

    protected InscriptionText(final String text, final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type, final com.google.common.base.Optional<String> lang, ConstructionValidator validator) {
        this.text = validator.validateText(text);
        this.type = validator.validateType(type);
        this.lang = validator.validateLang(lang);
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

    /**
     * Required factory method
     */
    public static InscriptionText create(final String text, final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) {
        return new InscriptionText(text, type, com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static InscriptionText create(final String text, final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type, final @javax.annotation.Nullable String lang) {
        return new InscriptionText(text, type, com.google.common.base.Optional.fromNullable(lang), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static InscriptionText create(final String text, final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type, final com.google.common.base.Optional<String> lang) {
        return new InscriptionText(text, type, lang, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof InscriptionText)) {
            return false;
        }

        final InscriptionText other = (InscriptionText)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getLang().isPresent() && other.getLang().isPresent()) ? (getLang().get().equals(other.getLang().get())) : (!getLang().isPresent() && !other.getLang().isPresent())))) {
            return false;
        }

        return true;
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

    public final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType getType() {
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

    public static InscriptionText readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InscriptionText readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InscriptionText readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType.class);
            if (__list.getSize() > 2) {
                lang = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InscriptionText(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateLang(lang), NopConstructionValidator.getInstance());
    }

    public static InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InscriptionText readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type = null;
        com.google.common.base.Optional<String> lang = com.google.common.base.Optional.<String> absent();

        try {
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
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType.class);
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InscriptionText(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateLang(lang), NopConstructionValidator.getInstance());
    }

    public InscriptionText replaceLang(final com.google.common.base.Optional<String> lang) {
        return new InscriptionText(this.text, this.type, DefaultConstructionValidator.getInstance().validateLang(lang), NopConstructionValidator.getInstance());
    }

    public InscriptionText replaceLang(final String lang) {
        return replaceLang(com.google.common.base.Optional.fromNullable(lang));
    }

    public InscriptionText replaceText(final String text) {
        return new InscriptionText(DefaultConstructionValidator.getInstance().validateText(text), this.type, this.lang, NopConstructionValidator.getInstance());
    }

    public InscriptionText replaceType(final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type) {
        return new InscriptionText(this.text, DefaultConstructionValidator.getInstance().validateType(type), this.lang, NopConstructionValidator.getInstance());
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
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText");
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

    private final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionTextType type;

    private final com.google.common.base.Optional<String> lang;
}
