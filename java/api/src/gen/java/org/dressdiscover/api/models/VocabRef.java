package org.dressdiscover.api.models;

public final class VocabRef implements org.thryft.Struct {
    public final static class Builder {
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

        protected VocabRef _build(final org.dressdiscover.api.models.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            return new VocabRef(vocab, refid, uri, DefaultConstructionValidator.getInstance());
        }

        public VocabRef build() {
            return _build(vocab, refid, uri);
        }

        public final com.google.common.base.Optional<String> getRefid() {
            return refid;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Uri> getUri() {
            return uri;
        }

        public final org.dressdiscover.api.models.Vocab getVocab() {
            return vocab;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            vocab = iprot.readEnum(org.dressdiscover.api.models.Vocab.class);
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
                        vocab = iprot.readEnum(org.dressdiscover.api.models.Vocab.class);
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
            case VOCAB: setVocab((org.dressdiscover.api.models.Vocab)value); return this;
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
            this.refid = DefaultConstructionValidator.getInstance().validateRefid(refid);
            return this;
        }

        public Builder setRefid(@javax.annotation.Nullable final String refid) {
            return setRefid(com.google.common.base.Optional.fromNullable(refid));
        }

        public Builder setUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            this.uri = DefaultConstructionValidator.getInstance().validateUri(uri);
            return this;
        }

        public Builder setUri(@javax.annotation.Nullable final org.thryft.native_.Uri uri) {
            return setUri(com.google.common.base.Optional.fromNullable(uri));
        }

        public Builder setVocab(final org.dressdiscover.api.models.Vocab vocab) {
            this.vocab = DefaultConstructionValidator.getInstance().validateVocab(vocab);
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

        private org.dressdiscover.api.models.Vocab vocab;
        private com.google.common.base.Optional<String> refid;
        private com.google.common.base.Optional<org.thryft.native_.Uri> uri;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<VocabRef> {
        @Override
        public VocabRef readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAs(iprot, type);
        }

        @Override
        public VocabRef readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public VocabRef readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsList(iprot);
        }

        @Override
        public VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsStruct(iprot);
        }

        @Override
        public VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VocabRef.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        VOCAB("vocab", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.Vocab>() {}, true, 2, "vocab", org.thryft.protocol.Type.STRING),
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

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.models.Vocab validateVocab(final org.dressdiscover.api.models.Vocab vocab) throws ExceptionT;

        public com.google.common.base.Optional<String> validateRefid(final com.google.common.base.Optional<String> refid) throws ExceptionT;

        public com.google.common.base.Optional<org.thryft.native_.Uri> validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) throws ExceptionT;
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
        public org.dressdiscover.api.models.Vocab validateVocab(final org.dressdiscover.api.models.Vocab vocab) throws RuntimeException {
            if (vocab == null) {
                throw new NullPointerException("org.dressdiscover.api.models.VocabRef: vocab is null");
            }
            return vocab;
        }

        @Override
        public com.google.common.base.Optional<String> validateRefid(final com.google.common.base.Optional<String> refid) throws RuntimeException {
            if (refid == null) {
                throw new NullPointerException("org.dressdiscover.api.models.VocabRef: refid is null");
            }
            if (!refid.isPresent()) {
                return refid;
            }
            if (refid.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.VocabRef: refid is less than min length 1");
            }
            return refid;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Uri> validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) throws RuntimeException {
            if (uri == null) {
                throw new NullPointerException("org.dressdiscover.api.models.VocabRef: uri is null");
            }
            if (!uri.isPresent()) {
                return uri;
            }
            return uri;
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
        public org.dressdiscover.api.models.Vocab validateVocab(final org.dressdiscover.api.models.Vocab vocab) {
            return vocab;
        }

        @Override
        public com.google.common.base.Optional<String> validateRefid(final com.google.common.base.Optional<String> refid) {
            return refid;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Uri> validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            return uri;
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
        public org.dressdiscover.api.models.Vocab validateVocab(final org.dressdiscover.api.models.Vocab vocab) throws org.thryft.protocol.InputProtocolException {
            if (vocab == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VOCAB, "org.dressdiscover.api.models.VocabRef: vocab is null");
            }
            return vocab;
        }

        @Override
        public com.google.common.base.Optional<String> validateRefid(final com.google.common.base.Optional<String> refid) throws org.thryft.protocol.InputProtocolException {
            if (refid == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REFID, "org.dressdiscover.api.models.VocabRef: refid is null");
            }
            if (!refid.isPresent()) {
                return refid;
            }
            if (refid.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFID, "org.dressdiscover.api.models.VocabRef: refid is less than min length 1");
            }
            return refid;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Uri> validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) throws org.thryft.protocol.InputProtocolException {
            if (uri == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.URI, "org.dressdiscover.api.models.VocabRef: uri is null");
            }
            if (!uri.isPresent()) {
                return uri;
            }
            return uri;
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
        public org.dressdiscover.api.models.Vocab validateVocab(final org.dressdiscover.api.models.Vocab vocab) {
            return vocab;
        }

        @Override
        public com.google.common.base.Optional<String> validateRefid(final com.google.common.base.Optional<String> refid) {
            return refid;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Uri> validateUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
            return uri;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public VocabRef(final VocabRef other) {
        this(other.getVocab(), other.getRefid(), other.getUri(), NopConstructionValidator.getInstance());
    }

    protected VocabRef(final org.dressdiscover.api.models.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri, ConstructionValidator validator) {
        this.vocab = validator.validateVocab(vocab);
        this.refid = validator.validateRefid(refid);
        this.uri = validator.validateUri(uri);
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

    /**
     * Required factory method
     */
    public static VocabRef create(final org.dressdiscover.api.models.Vocab vocab) {
        return new VocabRef(vocab, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.thryft.native_.Uri> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static VocabRef create(final org.dressdiscover.api.models.Vocab vocab, final @javax.annotation.Nullable String refid, final @javax.annotation.Nullable org.thryft.native_.Uri uri) {
        return new VocabRef(vocab, com.google.common.base.Optional.fromNullable(refid), com.google.common.base.Optional.fromNullable(uri), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static VocabRef create(final org.dressdiscover.api.models.Vocab vocab, final com.google.common.base.Optional<String> refid, final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        return new VocabRef(vocab, refid, uri, DefaultConstructionValidator.getInstance());
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
            ((getRefid().isPresent() && other.getRefid().isPresent()) ? (getRefid().get().equals(other.getRefid().get())) : (!getRefid().isPresent() && !other.getRefid().isPresent())) &&
            ((getUri().isPresent() && other.getUri().isPresent()) ? (getUri().get().equals(other.getUri().get())) : (!getUri().isPresent() && !other.getUri().isPresent()));
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

    public final org.dressdiscover.api.models.Vocab getVocab() {
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

    public static VocabRef readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static VocabRef readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static VocabRef readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.Vocab vocab = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> uri = com.google.common.base.Optional.<org.thryft.native_.Uri> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        vocab = iprot.readEnum(org.dressdiscover.api.models.Vocab.class);
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
        return new VocabRef(DefaultReadValidator.getInstance().validateVocab(vocab), DefaultReadValidator.getInstance().validateRefid(refid), DefaultReadValidator.getInstance().validateUri(uri), NopConstructionValidator.getInstance());
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static VocabRef readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.Vocab vocab = null;
        com.google.common.base.Optional<String> refid = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.thryft.native_.Uri> uri = com.google.common.base.Optional.<org.thryft.native_.Uri> absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "vocab": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    vocab = iprot.readEnum(org.dressdiscover.api.models.Vocab.class);
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
        return new VocabRef(DefaultReadValidator.getInstance().validateVocab(vocab), DefaultReadValidator.getInstance().validateRefid(refid), DefaultReadValidator.getInstance().validateUri(uri), NopConstructionValidator.getInstance());
    }

    public VocabRef replaceRefid(final com.google.common.base.Optional<String> refid) {
        return new VocabRef(this.vocab, DefaultConstructionValidator.getInstance().validateRefid(refid), this.uri, NopConstructionValidator.getInstance());
    }

    public VocabRef replaceRefid(final String refid) {
        return replaceRefid(com.google.common.base.Optional.fromNullable(refid));
    }

    public VocabRef replaceUri(final com.google.common.base.Optional<org.thryft.native_.Uri> uri) {
        return new VocabRef(this.vocab, this.refid, DefaultConstructionValidator.getInstance().validateUri(uri), NopConstructionValidator.getInstance());
    }

    public VocabRef replaceUri(final org.thryft.native_.Uri uri) {
        return replaceUri(com.google.common.base.Optional.fromNullable(uri));
    }

    public VocabRef replaceVocab(final org.dressdiscover.api.models.Vocab vocab) {
        return new VocabRef(DefaultConstructionValidator.getInstance().validateVocab(vocab), this.refid, this.uri, NopConstructionValidator.getInstance());
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
        oprot.writeStructBegin("org.dressdiscover.api.models.VocabRef");
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

    private final org.dressdiscover.api.models.Vocab vocab;

    private final com.google.common.base.Optional<String> refid;

    private final com.google.common.base.Optional<org.thryft.native_.Uri> uri;
}
