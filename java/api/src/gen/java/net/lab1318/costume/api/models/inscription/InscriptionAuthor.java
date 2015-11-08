package net.lab1318.costume.api.models.inscription;

public class InscriptionAuthor implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            title = null;
            refid = com.google.common.base.Optional.absent();
            vocab = com.google.common.base.Optional.absent();
        }

        public Builder(final InscriptionAuthor other) {
            this.title = other.getTitle();
            this.refid = other.getRefid();
            this.vocab = other.getVocab();
        }

        protected InscriptionAuthor _build(final String title, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
            return new InscriptionAuthor(title, refid, vocab);
        }

        public InscriptionAuthor build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing title"), com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing refid"), com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing vocab"));
        }

        public final com.google.common.base.Optional<String> getRefid() {
            return refid;
        }

        public final String getTitle() {
            return title;
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
            title = iprot.readString();
            if (__list.getSize() > 1) {
                refid = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
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
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "refid": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        refid = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "vocab": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
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

        public Builder setIfPresent(final InscriptionAuthor other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTitle(other.getTitle());
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

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
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
            case "title": setTitle((String)value); return this;
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

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetVocab() {
            this.vocab = com.google.common.base.Optional.absent();
            return this;
        }

        private String title;
        private com.google.common.base.Optional<String> refid;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "refid", org.thryft.protocol.Type.STRING),
        VOCAB("vocab", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.Vocab>() {}, false, 3, "vocab", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            case "refid": return REFID;
            case "vocab": return VOCAB;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
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
    public InscriptionAuthor(final InscriptionAuthor other) {
        this(other.getTitle(), other.getRefid(), other.getVocab());
    }

    /**
     * Required constructor
     */
    public InscriptionAuthor(final String title) {
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing title"), "net.lab1318.costume.api.models.inscription.InscriptionAuthor: title is empty");
        this.refid = com.google.common.base.Optional.absent();
        this.vocab = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public InscriptionAuthor(final String title, final @javax.annotation.Nullable String refid, final @javax.annotation.Nullable net.lab1318.costume.api.models.Vocab vocab) {
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing title"), "net.lab1318.costume.api.models.inscription.InscriptionAuthor: title is empty");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(refid), "net.lab1318.costume.api.models.inscription.InscriptionAuthor: refid is empty");
        this.vocab = com.google.common.base.Optional.fromNullable(vocab);
    }

    /**
     * Optional constructor
     */
    public InscriptionAuthor(final String title, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing title"), "net.lab1318.costume.api.models.inscription.InscriptionAuthor: title is empty");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing refid"), "net.lab1318.costume.api.models.inscription.InscriptionAuthor: refid is empty");
        this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.inscription.InscriptionAuthor: missing vocab");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InscriptionAuthor other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InscriptionAuthor> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionAuthor)) {
            return false;
        }

        final InscriptionAuthor other = (InscriptionAuthor)otherObject;
        return
            getTitle().equals(other.getTitle()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "title": return getTitle();
        case "refid": return getRefid();
        case "vocab": return getVocab();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getRefid() {
        return refid;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getRefid().isPresent()) {
            hashCode = 31 * hashCode + getRefid().get().hashCode();
        }
        if (getVocab().isPresent()) {
            hashCode = 31 * hashCode + getVocab().get().ordinal();
        }
        return hashCode;
    }

    public static InscriptionAuthor readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InscriptionAuthor readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        title = iprot.readString();
        if (__list.getSize() > 1) {
            refid = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            try {
                vocab = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.Vocab.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new InscriptionAuthor(title, refid, vocab);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static InscriptionAuthor readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    title = iprot.readString();
                }
                break;
            }
            case "refid": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    refid = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "vocab": {
                if (!ifield.hasId() || ifield.getId() == 3) {
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
            return new InscriptionAuthor(title, refid, vocab);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public InscriptionAuthor replaceRefid(final com.google.common.base.Optional<String> refid) {
        return new InscriptionAuthor(this.title, refid, this.vocab);
    }

    public InscriptionAuthor replaceRefid(final String refid) {
        return replaceRefid(com.google.common.base.Optional.fromNullable(refid));
    }

    public InscriptionAuthor replaceTitle(final String title) {
        return new InscriptionAuthor(title, this.refid, this.vocab);
    }

    public InscriptionAuthor replaceVocab(final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab) {
        return new InscriptionAuthor(this.title, this.refid, vocab);
    }

    public InscriptionAuthor replaceVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        return replaceVocab(com.google.common.base.Optional.fromNullable(vocab));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("refid", getRefid().orNull()).add("vocab", getVocab().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getTitle());

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
        oprot.writeStructBegin("net.lab1318.costume.api.models.inscription.InscriptionAuthor");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getRefid().isPresent()) {
            oprot.writeFieldBegin("refid", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getRefid().get());
            oprot.writeFieldEnd();
        }

        if (getVocab().isPresent()) {
            oprot.writeFieldBegin("vocab", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeEnum(getVocab().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String title;

    private final com.google.common.base.Optional<String> refid;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.Vocab> vocab;
}
