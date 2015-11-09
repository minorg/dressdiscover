package net.lab1318.costume.api.models.subject;

/**
 * VRA Core 4.0 subject term element
 */
public class SubjectTerm implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            refid = com.google.common.base.Optional.absent();
            vocab = com.google.common.base.Optional.absent();
        }

        public Builder(final SubjectTerm other) {
            this.text = other.getText();
            this.type = other.getType();
            this.refid = other.getRefid();
            this.vocab = other.getVocab();
        }

        protected SubjectTerm _build(final String text, final net.lab1318.costume.api.models.subject.SubjectTermType type, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
            return new SubjectTerm(text, type, refid, vocab);
        }

        public SubjectTerm build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.subject.SubjectTerm: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.subject.SubjectTerm: missing type"), com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.subject.SubjectTerm: missing refid"), com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.subject.SubjectTerm: missing vocab"));
        }

        public final com.google.common.base.Optional<String> getRefid() {
            return refid;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.subject.SubjectTermType getType() {
            return type;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> getVocab() {
            return vocab;
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
            type = iprot.readEnum(net.lab1318.costume.api.models.subject.SubjectTermType.class);
            if (__list.getSize() > 2) {
                refid = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    vocab = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.Vocab.class));
                } catch (final IllegalArgumentException e) {
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.subject.SubjectTermType.class);
                    }
                    break;
                }
                case "refid": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        refid = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "vocab": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            vocab = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.Vocab.class));
                        } catch (final IllegalArgumentException e) {
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

        public Builder setIfPresent(final SubjectTerm other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getRefid().isPresent()) {
                setRefid(other.getRefid());
            }
            if (other.getVocab().isPresent()) {
                setVocab(other.getVocab());
            }

            return this;
        }

        public Builder setRefid(final com.google.common.base.Optional<String> refid) {
            this.refid = com.google.common.base.Preconditions.checkNotNull(refid);
            return this;
        }

        public Builder setRefid(@javax.annotation.Nullable final String refid) {
            this.refid = com.google.common.base.Optional.fromNullable(refid);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.subject.SubjectTermType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setVocab(final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
            this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab);
            return this;
        }

        public Builder setVocab(@javax.annotation.Nullable final net.lab1318.costume.api.models.Vocab vocab) {
            this.vocab = com.google.common.base.Optional.fromNullable(vocab);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.subject.SubjectTermType)value); return this;
            case "refid": setRefid((String)value); return this;
            case "vocab": setVocab((net.lab1318.costume.api.models.Vocab)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetRefid() {
            this.refid = com.google.common.base.Optional.absent();
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

        public Builder unsetVocab() {
            this.vocab = com.google.common.base.Optional.absent();
            return this;
        }

        private String text;
        private net.lab1318.costume.api.models.subject.SubjectTermType type;
        private com.google.common.base.Optional<String> refid;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.subject.SubjectTermType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "refid", org.thryft.protocol.Type.STRING),
        VOCAB("vocab", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.Vocab>() {}, false, 4, "vocab", org.thryft.protocol.Type.STRING);

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
            case "refid": return REFID;
            case "vocab": return VOCAB;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "refid": return REFID;
            case "vocab": return VOCAB;
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
    public SubjectTerm(final SubjectTerm other) {
        this(other.getText(), other.getType(), other.getRefid(), other.getVocab());
    }

    /**
     * Required constructor
     */
    public SubjectTerm(final String text, final net.lab1318.costume.api.models.subject.SubjectTermType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.subject.SubjectTerm: missing text"), "net.lab1318.costume.api.models.subject.SubjectTerm: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.subject.SubjectTerm: missing type");
        this.refid = com.google.common.base.Optional.absent();
        this.vocab = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public SubjectTerm(final String text, final net.lab1318.costume.api.models.subject.SubjectTermType type, final @javax.annotation.Nullable String refid, final @javax.annotation.Nullable net.lab1318.costume.api.models.Vocab vocab) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.subject.SubjectTerm: missing text"), "net.lab1318.costume.api.models.subject.SubjectTerm: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.subject.SubjectTerm: missing type");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(refid), "net.lab1318.costume.api.models.subject.SubjectTerm: refid is empty");
        this.vocab = com.google.common.base.Optional.fromNullable(vocab);
    }

    /**
     * Optional constructor
     */
    public SubjectTerm(final String text, final net.lab1318.costume.api.models.subject.SubjectTermType type, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.subject.SubjectTerm: missing text"), "net.lab1318.costume.api.models.subject.SubjectTerm: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.subject.SubjectTerm: missing type");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.subject.SubjectTerm: missing refid"), "net.lab1318.costume.api.models.subject.SubjectTerm: refid is empty");
        this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.subject.SubjectTerm: missing vocab");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final SubjectTerm other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<SubjectTerm> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof SubjectTerm)) {
            return false;
        }

        final SubjectTerm other = (SubjectTerm)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "text": return getText();
        case "type": return getType();
        case "refid": return getRefid();
        case "vocab": return getVocab();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getRefid() {
        return refid;
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.subject.SubjectTermType getType() {
        return type;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getRefid().isPresent()) {
            hashCode = 31 * hashCode + getRefid().get().hashCode();
        }
        if (getVocab().isPresent()) {
            hashCode = 31 * hashCode + getVocab().get().ordinal();
        }
        return hashCode;
    }

    public static SubjectTerm readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static SubjectTerm readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.subject.SubjectTermType type = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.subject.SubjectTermType.class);
        if (__list.getSize() > 2) {
            refid = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            try {
                vocab = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.Vocab.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new SubjectTerm(text, type, refid, vocab);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static SubjectTerm readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.subject.SubjectTermType type = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab = com.google.common.base.Optional.absent();

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
                    type = iprot.readEnum(net.lab1318.costume.api.models.subject.SubjectTermType.class);
                }
                break;
            }
            case "refid": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    refid = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "vocab": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    try {
                        vocab = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.Vocab.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new SubjectTerm(text, type, refid, vocab);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public SubjectTerm replaceRefid(final com.google.common.base.Optional<String> refid) {
        return new SubjectTerm(this.text, this.type, refid, this.vocab);
    }

    public SubjectTerm replaceRefid(final String refid) {
        return replaceRefid(com.google.common.base.Optional.fromNullable(refid));
    }

    public SubjectTerm replaceText(final String text) {
        return new SubjectTerm(text, this.type, this.refid, this.vocab);
    }

    public SubjectTerm replaceType(final net.lab1318.costume.api.models.subject.SubjectTermType type) {
        return new SubjectTerm(this.text, type, this.refid, this.vocab);
    }

    public SubjectTerm replaceVocab(final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
        return new SubjectTerm(this.text, this.type, this.refid, vocab);
    }

    public SubjectTerm replaceVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        return replaceVocab(com.google.common.base.Optional.fromNullable(vocab));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("refid", getRefid().orNull()).add("vocab", getVocab().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getRefid().isPresent()) {
            oprot.writeString(getRefid().get());
        } else {
            oprot.writeNull();
        }

        if (getVocab().isPresent()) {
            oprot.writeEnum(getVocab().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.subject.SubjectTerm");
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

        if (getRefid().isPresent()) {
            oprot.writeFieldBegin("refid", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getRefid().get());
            oprot.writeFieldEnd();
        }

        if (getVocab().isPresent()) {
            oprot.writeFieldBegin("vocab", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeEnum(getVocab().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.subject.SubjectTermType type;

    private final com.google.common.base.Optional<String> refid;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab;
}
