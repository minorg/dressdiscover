package org.dressdiscover.api.vocabularies.vra_core.textref;

/**
 * VRA Core 4.0 textref.refid subelement
 */
public final class TextrefRefid implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            text = null;
            type = null;
            href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        }

        public Builder(final TextrefRefid other) {
            this.text = other.getText();
            this.type = other.getType();
            this.href = other.getHref();
        }

        protected TextrefRefid _build(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return new TextrefRefid(text, type, href);
        }

        public TextrefRefid build() {
            UncheckedValidator.validate(text, type, href);

            return _build(text, type, href);
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType getType() {
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
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType.Factory.getInstance());
                if (__list.getSize() > 2) {
                    try {
                        href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
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
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            text = iprot.readString();
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType.Factory.getInstance());
                        }
                        break;
                    }
                    case "href": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                            } catch (final java.lang.IllegalArgumentException e) {
                            }
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
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType)value); return this;
            case HREF: setHref((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            UncheckedValidator.validateHref(href);
            this.href = href;
            return this;
        }

        public Builder setHref(final @javax.annotation.Nullable org.thryft.native_.Url href) {
            return setHref(com.google.common.base.Optional.fromNullable(href));
        }

        public Builder setIfPresent(final TextrefRefid other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getHref().isPresent()) {
                setHref(other.getHref());
            }

            return this;
        }

        public Builder setText(final String text) {
            UncheckedValidator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type) {
            UncheckedValidator.validateType(type);
            this.type = type;
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
            case HREF: return unsetHref();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
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

        private @javax.annotation.Nullable String text;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<TextrefRefid> {
        @Override
        public TextrefRefid readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return TextrefRefid.readAs(iprot, type);
        }

        @Override
        public TextrefRefid readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return TextrefRefid.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public TextrefRefid readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return TextrefRefid.readAsList(iprot);
        }

        @Override
        public TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return TextrefRefid.readAsStruct(iprot);
        }

        @Override
        public TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return TextrefRefid.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType>() {}, true, (short)2, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, (short)3, "href", org.thryft.protocol.Type.STRING);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
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
            case "href": return HREF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "href": return HREF;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) throws org.thryft.protocol.InputProtocolException {
            validateText(text);
            validateType(type);
            validateHref(href);
        }

        public static void validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: text: less than min length 1");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: type is null");
            }
        }

        public static void validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws org.thryft.protocol.InputProtocolException {
            if (href == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HREF, "org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: href is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            validateText(text);
            validateType(type);
            validateHref(href);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: text: less than min length 1");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type) {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: type is null");
            }
        }

        public static void validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            if (href == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid: href is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public TextrefRefid(final TextrefRefid other) {
        this(other.getText(), other.getType(), other.getHref());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected TextrefRefid(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        this.text = text;
        this.type = type;
        this.href = href;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final TextrefRefid other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<TextrefRefid> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static TextrefRefid create(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type) {
        UncheckedValidator.validate(text, type, com.google.common.base.Optional.<org.thryft.native_.Url> absent());
        return new TextrefRefid(text, type, com.google.common.base.Optional.<org.thryft.native_.Url> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static TextrefRefid create(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, @javax.annotation.Nullable final org.thryft.native_.Url href) {
        final com.google.common.base.Optional<org.thryft.native_.Url> hrefOptional = com.google.common.base.Optional.fromNullable(href);
        UncheckedValidator.validate(text, type, hrefOptional);
        return new TextrefRefid(text, type, hrefOptional);
    }

    /**
     * Optional factory method
     */
    public static TextrefRefid create(final String text, final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        UncheckedValidator.validate(text, type, href);
        return new TextrefRefid(text, type, href);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof TextrefRefid)) {
            return false;
        }

        final TextrefRefid other = (TextrefRefid)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getHref().isPresent() && other.getHref().isPresent()) ? (getHref().get().equals(other.getHref().get())) : (!getHref().isPresent() && !other.getHref().isPresent())))) {
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
        case HREF: return getHref();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
        return href;
    }

    public final String getText() {
        return text;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getHref().isPresent()) {
            hashCode = 31 * hashCode + getHref().get().hashCode();
        }
        return hashCode;
    }

    public static TextrefRefid readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static TextrefRefid readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static TextrefRefid readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text;
        org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType.Factory.getInstance());
            if (__list.getSize() > 2) {
                try {
                    href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(text, type, href);

        return new TextrefRefid(text, type, href);
    }

    public static TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String text = null;
        @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType.Factory.getInstance());
                    }
                    break;
                }
                case "href": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
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

        ReadValidator.validate(text, type, href);

        return new TextrefRefid(text, type, href);
    }

    public TextrefRefid replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        UncheckedValidator.validateHref(href);
        return new TextrefRefid(this.text, this.type, href);
    }

    public TextrefRefid replaceHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public TextrefRefid replaceText(final String text) {
        UncheckedValidator.validateText(text);
        return new TextrefRefid(text, this.type, this.href);
    }

    public TextrefRefid replaceType(final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type) {
        UncheckedValidator.validateType(type);
        return new TextrefRefid(this.text, type, this.href);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("href", getHref().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getHref().isPresent()) {
            oprot.writeString(getHref().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefid");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeTypeField(oprot);

        writeHrefField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHrefField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHref().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HREF);
            oprot.writeString(getHref().get().toString());
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    private final String text;

    private final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;
}
