package net.lab1318.costume.api.models.title;

/**
 * VRA Core 4.0 title element
 */
public class Title implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            pref = com.google.common.base.Optional.absent();
        }

        public Builder(final Title other) {
            this.text = other.getText();
            this.type = other.getType();
            this.pref = other.getPref();
        }

        protected Title _build(final String text, final net.lab1318.costume.api.models.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
            return new Title(text, type, pref);
        }

        public Title build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.title.Title: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.title.Title: missing type"), com.google.common.base.Preconditions.checkNotNull(pref, "net.lab1318.costume.api.models.title.Title: missing pref"));
        }

        public final com.google.common.base.Optional<Boolean> getPref() {
            return pref;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.title.TitleType getType() {
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
            type = iprot.readEnum(net.lab1318.costume.api.models.title.TitleType.class);
            if (__list.getSize() > 2) {
                pref = com.google.common.base.Optional.of(iprot.readBool());
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.title.TitleType.class);
                    }
                    break;
                }
                case "pref": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        pref = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Title other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getPref().isPresent()) {
                setPref(other.getPref());
            }

            return this;
        }

        public Builder setPref(final com.google.common.base.Optional<Boolean> pref) {
            this.pref = com.google.common.base.Preconditions.checkNotNull(pref);
            return this;
        }

        public Builder setPref(@javax.annotation.Nullable final Boolean pref) {
            this.pref = com.google.common.base.Optional.fromNullable(pref);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.title.TitleType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.title.TitleType)value); return this;
            case "pref": setPref((Boolean)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetPref() {
            this.pref = com.google.common.base.Optional.absent();
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
            case "pref": return unsetPref();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.title.TitleType type;
        private com.google.common.base.Optional<Boolean> pref;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.title.TitleType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        PREF("pref", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 3, "pref", org.thryft.protocol.Type.BOOL);

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
            case "pref": return PREF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "pref": return PREF;
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
    public Title(final Title other) {
        this(other.getText(), other.getType(), other.getPref());
    }

    /**
     * Required constructor
     */
    public Title(final String text, final net.lab1318.costume.api.models.title.TitleType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.title.Title: missing text"), "net.lab1318.costume.api.models.title.Title: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.title.Title: missing type");
        this.pref = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Title(final String text, final net.lab1318.costume.api.models.title.TitleType type, final @javax.annotation.Nullable Boolean pref) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.title.Title: missing text"), "net.lab1318.costume.api.models.title.Title: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.title.Title: missing type");
        this.pref = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(pref), "net.lab1318.costume.api.models.title.Title: pref must be true");
    }

    /**
     * Optional constructor
     */
    public Title(final String text, final net.lab1318.costume.api.models.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.title.Title: missing text"), "net.lab1318.costume.api.models.title.Title: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.title.Title: missing type");
        this.pref = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(pref, "net.lab1318.costume.api.models.title.Title: missing pref"), "net.lab1318.costume.api.models.title.Title: pref must be true");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Title other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Title> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Title)) {
            return false;
        }

        final Title other = (Title)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getPref().equals(other.getPref());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "text": return getText();
        case "type": return getType();
        case "pref": return getPref();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<Boolean> getPref() {
        return pref;
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.title.TitleType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getPref().isPresent()) {
            hashCode = 31 * hashCode + (getPref().get() ? 1 : 0);
        }
        return hashCode;
    }

    public static Title readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Title readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.title.TitleType type = null;
        com.google.common.base.Optional<Boolean> pref = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.title.TitleType.class);
        if (__list.getSize() > 2) {
            pref = com.google.common.base.Optional.of(iprot.readBool());
        }
        iprot.readListEnd();
        try {
            return new Title(text, type, pref);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Title readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.title.TitleType type = null;
        com.google.common.base.Optional<Boolean> pref = com.google.common.base.Optional.absent();

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
                    type = iprot.readEnum(net.lab1318.costume.api.models.title.TitleType.class);
                }
                break;
            }
            case "pref": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    pref = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Title(text, type, pref);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Title replacePref(final com.google.common.base.Optional<Boolean> pref) {
        return new Title(this.text, this.type, pref);
    }

    public Title replacePref(final boolean pref) {
        return replacePref(com.google.common.base.Optional.fromNullable(pref));
    }

    public Title replaceText(final String text) {
        return new Title(text, this.type, this.pref);
    }

    public Title replaceType(final net.lab1318.costume.api.models.title.TitleType type) {
        return new Title(this.text, type, this.pref);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("pref", getPref().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getPref().isPresent()) {
            oprot.writeBool(getPref().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.title.Title");
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

        if (getPref().isPresent()) {
            oprot.writeFieldBegin("pref", org.thryft.protocol.Type.BOOL, (short)3);
            oprot.writeBool(getPref().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.title.TitleType type;

    private final com.google.common.base.Optional<Boolean> pref;
}
