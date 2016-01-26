package net.lab1318.costume.api.models;

public class VocabRef implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            vocab = null;
            refid = com.google.common.base.Optional.absent();
            uri = com.google.common.base.Optional.absent();
        }

        public Builder(final VocabRef other) {
            this.vocab = other.getVocab();
            this.refid = other.getRefid();
            this.uri = other.getUri();
        }

        protected VocabRef _build(final net.lab1318.costume.api.models.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            return new VocabRef(vocab, refid, uri);
        }

        public VocabRef build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.VocabRef: missing vocab"), com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.VocabRef: missing refid"), com.google.common.base.Preconditions.checkNotNull(uri, "net.lab1318.costume.api.models.VocabRef: missing uri"));
        }

        public final com.google.common.base.Optional<String> getRefid() {
            return refid;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Uri> getUri() {
            return uri;
        }

        public final net.lab1318.costume.api.models.Vocab getVocab() {
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
            vocab = iprot.readEnum(net.lab1318.costume.api.models.Vocab.class);
            if (__list.getSize() > 1) {
                refid = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                try {
                    uri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
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
                case "vocab": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        vocab = iprot.readEnum(net.lab1318.costume.api.models.Vocab.class);
                    }
                    break;
                }
                case "refid": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        refid = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "uri": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            uri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
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

        public Builder setIfPresent(final VocabRef other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setVocab(other.getVocab());
            if (other.getRefid().isPresent()) {
                setRefid(other.getRefid());
            }
            if (other.getUri().isPresent()) {
                setUri(other.getUri());
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

        public Builder setUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            this.uri = com.google.common.base.Preconditions.checkNotNull(uri);
            return this;
        }

        public Builder setUri(@javax.annotation.Nullable final org.thryft.native_.Uri uri) {
            this.uri = com.google.common.base.Optional.fromNullable(uri);
            return this;
        }

        public Builder setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
            this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "vocab": setVocab((net.lab1318.costume.api.models.Vocab)value); return this;
            case "refid": setRefid((String)value); return this;
            case "uri": setUri((org.thryft.native_.Uri)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetRefid() {
            this.refid = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetUri() {
            this.uri = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetVocab() {
            this.vocab = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "vocab": return unsetVocab();
            case "refid": return unsetRefid();
            case "uri": return unsetUri();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.Vocab vocab;
        private com.google.common.base.Optional<String> refid;
        private com.google.common.base.Optional<org.thryft.native_.Uri> uri;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        VOCAB("vocab", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.Vocab>() {}, true, 2, "vocab", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "refid", org.thryft.protocol.Type.STRING),
        URI("uri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, 3, "uri", org.thryft.protocol.Type.STRING);

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
            case "vocab": return VOCAB;
            case "refid": return REFID;
            case "uri": return URI;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "vocab": return VOCAB;
            case "refid": return REFID;
            case "uri": return URI;
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
    public VocabRef(final VocabRef other) {
        this(other.getVocab(), other.getRefid(), other.getUri());
    }

    /**
     * Required constructor
     */
    public VocabRef(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.VocabRef: missing vocab");
        this.refid = com.google.common.base.Optional.absent();
        this.uri = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public VocabRef(final net.lab1318.costume.api.models.Vocab vocab, final @javax.annotation.Nullable String refid, final @javax.annotation.Nullable org.thryft.native_.Uri uri) {
        this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.VocabRef: missing vocab");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(refid), "net.lab1318.costume.api.models.VocabRef: refid is empty");
        this.uri = com.google.common.base.Optional.fromNullable(uri);
    }

    /**
     * Optional constructor
     */
    public VocabRef(final net.lab1318.costume.api.models.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        this.vocab = com.google.common.base.Preconditions.checkNotNull(vocab, "net.lab1318.costume.api.models.VocabRef: missing vocab");
        this.refid = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(refid, "net.lab1318.costume.api.models.VocabRef: missing refid"), "net.lab1318.costume.api.models.VocabRef: refid is empty");
        this.uri = com.google.common.base.Preconditions.checkNotNull(uri, "net.lab1318.costume.api.models.VocabRef: missing uri");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final VocabRef other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<VocabRef> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof VocabRef)) {
            return false;
        }

        final VocabRef other = (VocabRef)otherObject;
        return
            getVocab().equals(other.getVocab()) &&
            getRefid().equals(other.getRefid()) &&
            getUri().equals(other.getUri());
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
        case VOCAB: return getVocab();
        case REFID: return getRefid();
        case URI: return getUri();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getRefid() {
        return refid;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Uri> getUri() {
        return uri;
    }

    public final net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getVocab().ordinal();
        if (getRefid().isPresent()) {
            hashCode = 31 * hashCode + getRefid().get().hashCode();
        }
        if (getUri().isPresent()) {
            hashCode = 31 * hashCode + getUri().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static VocabRef readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static VocabRef readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.Vocab vocab = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> uri = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        vocab = iprot.readEnum(net.lab1318.costume.api.models.Vocab.class);
        if (__list.getSize() > 1) {
            refid = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            try {
                uri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new VocabRef(vocab, refid, uri);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.Vocab vocab = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> uri = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "vocab": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    vocab = iprot.readEnum(net.lab1318.costume.api.models.Vocab.class);
                }
                break;
            }
            case "refid": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    refid = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "uri": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        uri = com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString()));
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
            return new VocabRef(vocab, refid, uri);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public VocabRef replaceRefid(final com.google.common.base.Optional<String> refid) {
        return new VocabRef(this.vocab, refid, this.uri);
    }

    public VocabRef replaceRefid(final String refid) {
        return replaceRefid(com.google.common.base.Optional.fromNullable(refid));
    }

    public VocabRef replaceUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        return new VocabRef(this.vocab, this.refid, uri);
    }

    public VocabRef replaceUri(final org.thryft.native_.Uri uri) {
        return replaceUri(com.google.common.base.Optional.fromNullable(uri));
    }

    public VocabRef replaceVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        return new VocabRef(vocab, this.refid, this.uri);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("vocab", getVocab()).add("refid", getRefid().orNull()).add("uri", getUri().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeEnum(getVocab());

        if (getRefid().isPresent()) {
            oprot.writeString(getRefid().get());
        } else {
            oprot.writeNull();
        }

        if (getUri().isPresent()) {
            oprot.writeString(getUri().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.VocabRef");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("vocab", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeEnum(getVocab());
        oprot.writeFieldEnd();

        if (getRefid().isPresent()) {
            oprot.writeFieldBegin("refid", org.thryft.protocol.Type.STRING, (short)1);
            oprot.writeString(getRefid().get());
            oprot.writeFieldEnd();
        }

        if (getUri().isPresent()) {
            oprot.writeFieldBegin("uri", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getUri().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.Vocab vocab;

    private final com.google.common.base.Optional<String> refid;

    private final com.google.common.base.Optional<org.thryft.native_.Uri> uri;
}
