package net.lab1318.costume.api.models.textref;

/**
 * VRA Core 4.0 textref.name subelement
 */
public class TextrefName implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
        }

        public Builder(final TextrefName other) {
            this.text = other.getText();
            this.type = other.getType();
        }

        protected TextrefName _build(final String text, final net.lab1318.costume.api.models.textref.TextrefNameType type) {
            return new TextrefName(text, type);
        }

        public TextrefName build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefName: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefName: missing type"));
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.textref.TextrefNameType getType() {
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
            iprot.readListBegin();
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefNameType.class);
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefNameType.class);
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final TextrefName other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());

            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.textref.TextrefNameType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.textref.TextrefNameType)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
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
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.textref.TextrefNameType type;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.textref.TextrefNameType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING);

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
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
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
    public TextrefName(final TextrefName other) {
        this(other.getText(), other.getType());
    }

    /**
     * Optional constructor
     */
    public TextrefName(final String text, final net.lab1318.costume.api.models.textref.TextrefNameType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.textref.TextrefName: missing text"), "net.lab1318.costume.api.models.textref.TextrefName: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.textref.TextrefName: missing type");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final TextrefName other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<TextrefName> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TextrefName)) {
            return false;
        }

        final TextrefName other = (TextrefName)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType());
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
        default:
            throw new IllegalStateException();
        }
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.textref.TextrefNameType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static TextrefName readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static TextrefName readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.textref.TextrefNameType type = null;

        iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefNameType.class);
        iprot.readListEnd();
        try {
            return new TextrefName(text, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static TextrefName readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.textref.TextrefNameType type = null;

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
                    type = iprot.readEnum(net.lab1318.costume.api.models.textref.TextrefNameType.class);
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new TextrefName(text, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public TextrefName replaceText(final String text) {
        return new TextrefName(text, this.type);
    }

    public TextrefName replaceType(final net.lab1318.costume.api.models.textref.TextrefNameType type) {
        return new TextrefName(this.text, type);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.textref.TextrefName");
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

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.textref.TextrefNameType type;
}
