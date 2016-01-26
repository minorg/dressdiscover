package net.lab1318.costume.api.models.textref;

/**
 * VRA Core 4.0 textref.refid subelement
 */
public class TextrefRefid implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            href = com.google.common.base.Optional.absent();
        }

        public Builder(final TextrefRefid other) {
            this.text = other.getText();
            this.type = other.getType();
            this.href = other.getHref();
        }

        protected TextrefRefid _build(final String text, final net.lab1318.costume.api.models.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return new TextrefRefid(text, type, href);
        }

        public TextrefRefid build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefRefid: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefRefid: missing type"), com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.textref.TextrefRefid: missing href"));
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.textref.TextrefRefidType getType() {
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
            type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefRefidType.class);
            if (__list.getSize() > 2) {
                try {
                    href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
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
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefRefidType.class);
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
            return this;
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            this.href = com.google.common.base.Preconditions.checkNotNull(href);
            return this;
        }

        public Builder setHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
            this.href = com.google.common.base.Optional.fromNullable(href);
            return this;
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
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.textref.TextrefRefidType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.textref.TextrefRefidType)value); return this;
            case "href": setHref((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.absent();
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
            case "href": return unsetHref();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.textref.TextrefRefidType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.textref.TextrefRefidType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 3, "href", org.thryft.protocol.Type.STRING);

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
    public TextrefRefid(final TextrefRefid other) {
        this(other.getText(), other.getType(), other.getHref());
    }

    /**
     * Required constructor
     */
    public TextrefRefid(final String text, final net.lab1318.costume.api.models.textref.TextrefRefidType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefRefid: missing text"), "net.lab1318.costume.api.models.textref.TextrefRefid: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefRefid: missing type");
        this.href = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public TextrefRefid(final String text, final net.lab1318.costume.api.models.textref.TextrefRefidType type, final @javax.annotation.Nullable org.thryft.native_.Url href) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefRefid: missing text"), "net.lab1318.costume.api.models.textref.TextrefRefid: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefRefid: missing type");
        this.href = com.google.common.base.Optional.fromNullable(href);
    }

    /**
     * Optional constructor
     */
    public TextrefRefid(final String text, final net.lab1318.costume.api.models.textref.TextrefRefidType type, final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefRefid: missing text"), "net.lab1318.costume.api.models.textref.TextrefRefid: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefRefid: missing type");
        this.href = com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.textref.TextrefRefid: missing href");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TextrefRefid)) {
            return false;
        }

        final TextrefRefid other = (TextrefRefid)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getHref().equals(other.getHref());
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

    public final net.lab1318.costume.api.models.textref.TextrefRefidType getType() {
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static TextrefRefid readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static TextrefRefid readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.textref.TextrefRefidType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefRefidType.class);
        if (__list.getSize() > 2) {
            try {
                href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new TextrefRefid(text, type, href);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static TextrefRefid readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.textref.TextrefRefidType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();

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
                    type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefRefidType.class);
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
        try {
            return new TextrefRefid(text, type, href);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public TextrefRefid replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        return new TextrefRefid(this.text, this.type, href);
    }

    public TextrefRefid replaceHref(final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public TextrefRefid replaceText(final String text) {
        return new TextrefRefid(text, this.type, this.href);
    }

    public TextrefRefid replaceType(final net.lab1318.costume.api.models.textref.TextrefRefidType type) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.textref.TextrefRefid");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getHref().isPresent()) {
            oprot.writeFieldBegin("href", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getHref().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.textref.TextrefRefidType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;
}
