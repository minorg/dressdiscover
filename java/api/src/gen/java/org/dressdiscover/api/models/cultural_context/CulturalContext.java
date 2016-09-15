package org.dressdiscover.api.models.cultural_context;

/**
 * VRA Core 4.0 culturalContext element
 */
public class CulturalContext implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
        }

        public Builder(final CulturalContext other) {
            this.text = other.getText();
            this.vocabRef = other.getVocabRef();
        }

        protected CulturalContext _build(final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef) {
            return new CulturalContext(text, vocabRef);
        }

        public CulturalContext build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing text"), com.google.common.base.Preconditions.checkNotNull(vocabRef, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing vocabRef"));
        }

        public final String getText() {
            return text;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> getVocabRef() {
            return vocabRef;
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
            text = iprot.readString();
            if (__list.getSize() > 1) {
                vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
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
                case "vocab_ref": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
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
            case TEXT: setText((String)value); return this;
            case VOCAB_REF: setVocabRef((org.dressdiscover.api.models.VocabRef)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final CulturalContext other) {
            com.google.common.base.Preconditions.checkNotNull(other);

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

        public Builder setVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef) {
            this.vocabRef = com.google.common.base.Preconditions.checkNotNull(vocabRef);
            return this;
        }

        public Builder setVocabRef(@javax.annotation.Nullable final org.dressdiscover.api.models.VocabRef vocabRef) {
            this.vocabRef = com.google.common.base.Optional.fromNullable(vocabRef);
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
            case VOCAB_REF: return unsetVocabRef();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetVocabRef() {
            this.vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
            return this;
        }

        private String text;
        private com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<CulturalContext> {
        @Override
        public CulturalContext readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return CulturalContext.readAs(iprot, type);
        }

        @Override
        public CulturalContext readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CulturalContext.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public CulturalContext readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CulturalContext.readAsList(iprot);
        }

        @Override
        public CulturalContext readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CulturalContext.readAsStruct(iprot);
        }

        @Override
        public CulturalContext readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CulturalContext.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        VOCAB_REF("vocabRef", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.VocabRef>() {}, false, 2, "vocab_ref", org.thryft.protocol.Type.STRUCT);

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
            case "vocabRef": return VOCAB_REF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
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
    public CulturalContext(final CulturalContext other) {
        this(other.getText(), other.getVocabRef());
    }

    protected CulturalContext(final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef) {
        this.text = text;
        this.vocabRef = vocabRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final CulturalContext other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<CulturalContext> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static CulturalContext create(final String text) {
        return new CulturalContext(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing text"), "org.dressdiscover.api.models.cultural_context.CulturalContext: text is empty"), com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static CulturalContext create(final String text, final @javax.annotation.Nullable org.dressdiscover.api.models.VocabRef vocabRef) {
        return new CulturalContext(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing text"), "org.dressdiscover.api.models.cultural_context.CulturalContext: text is empty"), com.google.common.base.Optional.fromNullable(vocabRef));
    }

    /**
     * Optional factory method
     */
    public static CulturalContext create(final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef) {
        return new CulturalContext(org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing text"), "org.dressdiscover.api.models.cultural_context.CulturalContext: text is empty"), com.google.common.base.Preconditions.checkNotNull(vocabRef, "org.dressdiscover.api.models.cultural_context.CulturalContext: missing vocabRef"));
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof CulturalContext)) {
            return false;
        }

        final CulturalContext other = (CulturalContext)otherObject;
        return
            getText().equals(other.getText()) &&
            ((getVocabRef().isPresent() && other.getVocabRef().isPresent()) ? (getVocabRef().get().equals(other.getVocabRef().get())) : (!getVocabRef().isPresent() && !other.getVocabRef().isPresent()));
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
        case VOCAB_REF: return getVocabRef();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getText() {
        return text;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> getVocabRef() {
        return vocabRef;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        if (getVocabRef().isPresent()) {
            hashCode = 31 * hashCode + getVocabRef().get().hashCode();
        }
        return hashCode;
    }

    public static CulturalContext readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CulturalContext readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static CulturalContext readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        if (__list.getSize() > 1) {
            vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new CulturalContext(text, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static CulturalContext readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CulturalContext readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();

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
            case "vocab_ref": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
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
            return new CulturalContext(text, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public CulturalContext replaceText(final String text) {
        return new CulturalContext(text, this.vocabRef);
    }

    public CulturalContext replaceVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef) {
        return new CulturalContext(this.text, vocabRef);
    }

    public CulturalContext replaceVocabRef(final org.dressdiscover.api.models.VocabRef vocabRef) {
        return replaceVocabRef(com.google.common.base.Optional.fromNullable(vocabRef));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("vocab_ref", getVocabRef().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

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
        oprot.writeStructBegin("org.dressdiscover.api.models.cultural_context.CulturalContext");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getVocabRef().isPresent()) {
            oprot.writeFieldBegin("vocab_ref", org.thryft.protocol.Type.STRUCT, (short)2);
            getVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> vocabRef;
}
