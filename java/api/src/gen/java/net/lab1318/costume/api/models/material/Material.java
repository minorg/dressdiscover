package net.lab1318.costume.api.models.material;

/**
 * VRA Core 4.0 material element
 */
public class Material implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            type = null;
            text = null;
            vocabRef = com.google.common.base.Optional.absent();
        }

        public Builder(final Material other) {
            this.type = other.getType();
            this.text = other.getText();
            this.vocabRef = other.getVocabRef();
        }

        protected Material _build(final net.lab1318.costume.api.models.material.MaterialType type, final String text, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
            return new Material(type, text, vocabRef);
        }

        public Material build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.material.Material: missing type"), com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.material.Material: missing text"), com.google.common.base.Preconditions.checkNotNull(vocabRef, "net.lab1318.costume.api.models.material.Material: missing vocabRef"));
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.material.MaterialType getType() {
            return type;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getVocabRef() {
            return vocabRef;
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
            type = iprot.readEnum(net.lab1318.costume.api.models.material.MaterialType.class);
            text = iprot.readString();
            if (__list.getSize() > 2) {
                vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
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
                        type = iprot.readEnum(net.lab1318.costume.api.models.material.MaterialType.class);
                    }
                    break;
                }
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "vocab_ref": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Material other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            setText(other.getText());
            if (other.getVocabRef().isPresent()) {
                setVocabRef(other.getVocabRef());
            }

            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.material.MaterialType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
            this.vocabRef = com.google.common.base.Preconditions.checkNotNull(vocabRef);
            return this;
        }

        public Builder setVocabRef(@javax.annotation.Nullable final net.lab1318.costume.api.models.VocabRef vocabRef) {
            this.vocabRef = com.google.common.base.Optional.fromNullable(vocabRef);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": setType((net.lab1318.costume.api.models.material.MaterialType)value); return this;
            case "text": setText((String)value); return this;
            case "vocab_ref": setVocabRef((net.lab1318.costume.api.models.VocabRef)value); return this;
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

        public Builder unsetVocabRef() {
            this.vocabRef = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": return unsetType();
            case "text": return unsetText();
            case "vocab_ref": return unsetVocabRef();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.material.MaterialType type;
        private String text;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.material.MaterialType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        VOCAB_REF("vocabRef", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.VocabRef>() {}, false, 5, "vocab_ref", org.thryft.protocol.Type.STRUCT);

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
            case "text": return TEXT;
            case "vocabRef": return VOCAB_REF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "text": return TEXT;
            case "vocab_ref": return VOCAB_REF;
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
    public Material(final Material other) {
        this(other.getType(), other.getText(), other.getVocabRef());
    }

    /**
     * Required constructor
     */
    public Material(final net.lab1318.costume.api.models.material.MaterialType type, final String text) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.material.Material: missing type");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.material.Material: missing text"), "net.lab1318.costume.api.models.material.Material: text is empty");
        this.vocabRef = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Material(final net.lab1318.costume.api.models.material.MaterialType type, final String text, final @javax.annotation.Nullable net.lab1318.costume.api.models.VocabRef vocabRef) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.material.Material: missing type");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.material.Material: missing text"), "net.lab1318.costume.api.models.material.Material: text is empty");
        this.vocabRef = com.google.common.base.Optional.fromNullable(vocabRef);
    }

    /**
     * Optional constructor
     */
    public Material(final net.lab1318.costume.api.models.material.MaterialType type, final String text, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.material.Material: missing type");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.material.Material: missing text"), "net.lab1318.costume.api.models.material.Material: text is empty");
        this.vocabRef = com.google.common.base.Preconditions.checkNotNull(vocabRef, "net.lab1318.costume.api.models.material.Material: missing vocabRef");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Material other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Material> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Material)) {
            return false;
        }

        final Material other = (Material)otherObject;
        return
            getType().equals(other.getType()) &&
            getText().equals(other.getText()) &&
            getVocabRef().equals(other.getVocabRef());
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
        case TYPE: return getType();
        case TEXT: return getText();
        case VOCAB_REF: return getVocabRef();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.material.MaterialType getType() {
        return type;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getVocabRef() {
        return vocabRef;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        hashCode = 31 * hashCode + getText().hashCode();
        if (getVocabRef().isPresent()) {
            hashCode = 31 * hashCode + getVocabRef().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Material readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Material readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.material.MaterialType type = null;
        String text = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(net.lab1318.costume.api.models.material.MaterialType.class);
        text = iprot.readString();
        if (__list.getSize() > 2) {
            vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Material(type, text, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Material readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.material.MaterialType type = null;
        String text = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.material.MaterialType.class);
                }
                break;
            }
            case "text": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    text = iprot.readString();
                }
                break;
            }
            case "vocab_ref": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Material(type, text, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Material replaceText(final String text) {
        return new Material(this.type, text, this.vocabRef);
    }

    public Material replaceType(final net.lab1318.costume.api.models.material.MaterialType type) {
        return new Material(type, this.text, this.vocabRef);
    }

    public Material replaceVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
        return new Material(this.type, this.text, vocabRef);
    }

    public Material replaceVocabRef(final net.lab1318.costume.api.models.VocabRef vocabRef) {
        return replaceVocabRef(com.google.common.base.Optional.fromNullable(vocabRef));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("text", getText()).add("vocab_ref", getVocabRef().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeEnum(getType());

        oprot.writeString(getText());

        if (getVocabRef().isPresent()) {
            getVocabRef().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.material.Material");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getVocabRef().isPresent()) {
            oprot.writeFieldBegin("vocab_ref", org.thryft.protocol.Type.STRUCT, (short)5);
            getVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.material.MaterialType type;

    private final String text;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef;
}
