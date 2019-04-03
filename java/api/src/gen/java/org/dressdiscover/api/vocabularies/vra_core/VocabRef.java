package org.dressdiscover.api.vocabularies.vra_core;

public final class VocabRef implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, VocabRef> {
        public Builder() {
            vocab = null;
            refid = com.google.common.base.Optional.<String> absent();
            uri = com.google.common.base.Optional.<org.thryft.native_.Uri> absent();
        }

        public Builder(final VocabRef other) {
            this.vocab = other.getVocab();
            this.refid = other.getRefid();
            this.uri = other.getUri();
        }

        protected VocabRef _build(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            return new VocabRef(vocab, refid, uri);
        }

        public VocabRef build() {
            Validator.validate(vocab, refid, uri);

            return _build(vocab, refid, uri);
        }

        public final com.google.common.base.Optional<String> getRefid() {
            return refid;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Uri> getUri() {
            return uri;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.Vocab getVocab() {
            return vocab;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setVocab(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.Vocab.Factory.getInstance()));
                if (__list.getSize() > 1) {
                    this.setRefid(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setUri(com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString())));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "vocab": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setVocab(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.Vocab.Factory.getInstance()));
                        }
                        break;
                    }
                    case "refid": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setRefid(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "uri": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setUri(com.google.common.base.Optional.of(org.thryft.native_.Uri.parse(iprot.readString())));
                                } catch (final java.lang.IllegalArgumentException e) {
                                }
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case VOCAB: setVocab((org.dressdiscover.api.vocabularies.vra_core.Vocab)value); return this;
            case REFID: setRefid((String)value); return this;
            case URI: setUri((org.thryft.native_.Uri)value); return this;
            default:
                throw new IllegalStateException();
            }
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
            Validator.validateRefid(refid);
            this.refid = refid;
            return this;
        }

        public Builder setRefid(final @javax.annotation.Nullable String refid) {
            return setRefid(com.google.common.base.Optional.fromNullable(refid));
        }

        public Builder setUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            Validator.validateUri(uri);
            this.uri = uri;
            return this;
        }

        public Builder setUri(final @javax.annotation.Nullable org.thryft.native_.Uri uri) {
            return setUri(com.google.common.base.Optional.fromNullable(uri));
        }

        public Builder setVocab(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab) {
            Validator.validateVocab(vocab);
            this.vocab = vocab;
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
            case VOCAB: return unsetVocab();
            case REFID: return unsetRefid();
            case URI: return unsetUri();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetRefid() {
            this.refid = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetUri() {
            this.uri = com.google.common.base.Optional.<org.thryft.native_.Uri> absent();
            return this;
        }

        public Builder unsetVocab() {
            this.vocab = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.Vocab vocab;
        private com.google.common.base.Optional<String> refid;
        private com.google.common.base.Optional<org.thryft.native_.Uri> uri;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<VocabRef> {
        @Override
        public VocabRef readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsList(iprot);
        }

        @Override
        public VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsStruct(iprot);
        }

        @Override
        public VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        VOCAB("vocab", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.Vocab>() {}, true, (short)2, "vocab", "2:vocab", org.thryft.protocol.Type.STRING),
        REFID("refid", new com.google.common.reflect.TypeToken<String>() {}, false, (short)1, "refid", "1:refid", org.thryft.protocol.Type.STRING),
        URI("uri", new com.google.common.reflect.TypeToken<org.thryft.native_.Uri>() {}, false, (short)3, "uri", "3:uri", org.thryft.protocol.Type.STRING);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            validateVocab(vocab);
            validateRefid(refid);
            validateUri(uri);
        }

        public static void validateVocab(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab) {
            if (vocab == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VocabRef: vocab is missing");
            }
        }

        public static void validateRefid(final com.google.common.base.Optional<String> refid) {
            if (refid == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VocabRef: refid is missing");
            }
            if (refid.isPresent()) {
                if (refid.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VocabRef: refid: less than min length 1");
                }
            }
        }

        public static void validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            if (uri == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VocabRef: uri is missing");
            }
        }
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
    public VocabRef(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab) {
        this(vocab, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.thryft.native_.Uri> absent());
    }

    /**
     * Total constructor
     */
    public VocabRef(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        Validator.validate(vocab, refid, uri);
        this.vocab = vocab;
        this.refid = refid;
        this.uri = uri;
    }

    /**
     * Total Nullable constructor
     */
    public VocabRef(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab, @javax.annotation.Nullable final String refid, @javax.annotation.Nullable final org.thryft.native_.Uri uri) {
        this(vocab, com.google.common.base.Optional.fromNullable(refid), com.google.common.base.Optional.fromNullable(uri));
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
        }
        if (!(otherObject instanceof VocabRef)) {
            return false;
        }

        final VocabRef other = (VocabRef)otherObject;

        if (!(getVocab().equals(other.getVocab()))) {
            return false;
        }

        if (!(((getRefid().isPresent() && other.getRefid().isPresent()) ? (getRefid().get().equals(other.getRefid().get())) : (!getRefid().isPresent() && !other.getRefid().isPresent())))) {
            return false;
        }

        if (!(((getUri().isPresent() && other.getUri().isPresent()) ? (getUri().get().equals(other.getUri().get())) : (!getUri().isPresent() && !other.getUri().isPresent())))) {
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

    public final org.dressdiscover.api.vocabularies.vra_core.Vocab getVocab() {
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

    public static VocabRef readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public VocabRef replaceRefid(final com.google.common.base.Optional<String> refid) {
        Validator.validateRefid(refid);
        return new VocabRef(this.vocab, refid, this.uri);
    }

    public VocabRef replaceRefid(@javax.annotation.Nullable final String refid) {
        return replaceRefid(com.google.common.base.Optional.fromNullable(refid));
    }

    public VocabRef replaceUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        Validator.validateUri(uri);
        return new VocabRef(this.vocab, this.refid, uri);
    }

    public VocabRef replaceUri(@javax.annotation.Nullable final org.thryft.native_.Uri uri) {
        return replaceUri(com.google.common.base.Optional.fromNullable(uri));
    }

    public VocabRef replaceVocab(final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab) {
        Validator.validateVocab(vocab);
        return new VocabRef(vocab, this.refid, this.uri);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("vocab", getVocab()).add("refid", getRefid().orNull()).add("uri", getUri().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.VocabRef");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeVocabField(oprot);

        writeRefidField(oprot);

        writeUriField(oprot);

        oprot.writeFieldStop();
    }

    public void writeRefidField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRefid().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.REFID);
            oprot.writeString(getRefid().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeUriField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUri().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.URI);
            oprot.writeString(getUri().get().toString());
            oprot.writeFieldEnd();
        }
    }

    public void writeVocabField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.VOCAB);
        oprot.writeEnum(getVocab());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.Vocab vocab;

    private final com.google.common.base.Optional<String> refid;

    private final com.google.common.base.Optional<org.thryft.native_.Uri> uri;
}
