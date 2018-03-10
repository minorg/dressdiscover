package org.dressdiscover.api.vocabularies.vra_core.technique;

/**
 * VRA Core 4.0 technique element
 */
public final class Technique implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
        public Builder() {
            text = null;
            vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();
        }

        public Builder(final Technique other) {
            this.text = other.getText();
            this.vocabRef = other.getVocabRef();
        }

        protected Technique _build(final String text, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
            return new Technique(text, vocabRef);
        }

        public Technique build() {
            UncheckedValidator.validate(text, vocabRef);

            return _build(text, vocabRef);
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> getVocabRef() {
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
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                text = iprot.readString();
                if (__list.getSize() > 1) {
                    vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot));
                }
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
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
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot, unknownFieldCallback));
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case VOCAB_REF: setVocabRef((org.dressdiscover.api.vocabularies.vra_core.VocabRef)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Technique other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            if (other.getVocabRef().isPresent()) {
                setVocabRef(other.getVocabRef());
            }

            return this;
        }

        public Builder setText(final String text) {
            UncheckedValidator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
            UncheckedValidator.validateVocabRef(vocabRef);
            this.vocabRef = vocabRef;
            return this;
        }

        public Builder setVocabRef(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.VocabRef vocabRef) {
            return setVocabRef(com.google.common.base.Optional.fromNullable(vocabRef));
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
            this.vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();
            return this;
        }

        private @javax.annotation.Nullable String text;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Technique> {
        @Override
        public Technique readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Technique.readAs(iprot, type);
        }

        @Override
        public Technique readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Technique.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Technique readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Technique.readAsList(iprot);
        }

        @Override
        public Technique readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Technique.readAsStruct(iprot);
        }

        @Override
        public Technique readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Technique.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", org.thryft.protocol.Type.STRING),
        VOCAB_REF("vocabRef", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.VocabRef>() {}, false, (short)4, "vocab_ref", org.thryft.protocol.Type.STRUCT);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final String text, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) throws org.thryft.protocol.InputProtocolException {
            validateText(text);
            validateVocabRef(vocabRef);
        }

        public static void validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.technique.Technique: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.technique.Technique: text: less than min length 1");
            }
        }

        public static void validateVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) throws org.thryft.protocol.InputProtocolException {
            if (vocabRef == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VOCAB_REF, "org.dressdiscover.api.vocabularies.vra_core.technique.Technique: vocabRef is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String text, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
            validateText(text);
            validateVocabRef(vocabRef);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.technique.Technique: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.technique.Technique: text: less than min length 1");
            }
        }

        public static void validateVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
            if (vocabRef == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.technique.Technique: vocabRef is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Technique(final Technique other) {
        this(other.getText(), other.getVocabRef());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Technique(final String text, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
        this.text = text;
        this.vocabRef = vocabRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Technique other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Technique> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Technique create(final String text) {
        UncheckedValidator.validate(text, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent());
        return new Technique(text, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static Technique create(final String text, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VocabRef vocabRef) {
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRefOptional = com.google.common.base.Optional.fromNullable(vocabRef);
        UncheckedValidator.validate(text, vocabRefOptional);
        return new Technique(text, vocabRefOptional);
    }

    /**
     * Optional factory method
     */
    public static Technique create(final String text, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
        UncheckedValidator.validate(text, vocabRef);
        return new Technique(text, vocabRef);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Technique)) {
            return false;
        }

        final Technique other = (Technique)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(((getVocabRef().isPresent() && other.getVocabRef().isPresent()) ? (getVocabRef().get().equals(other.getVocabRef().get())) : (!getVocabRef().isPresent() && !other.getVocabRef().isPresent())))) {
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
        case TEXT: return getText();
        case VOCAB_REF: return getVocabRef();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getText() {
        return text;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> getVocabRef() {
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

    public static Technique readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Technique readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Technique readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            if (__list.getSize() > 1) {
                vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(text, vocabRef);

        return new Technique(text, vocabRef);
    }

    public static Technique readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Technique readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String text = null;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();

        try {
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
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        vocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot, unknownFieldCallback));
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(text, vocabRef);

        return new Technique(text, vocabRef);
    }

    public Technique replaceText(final String text) {
        UncheckedValidator.validateText(text);
        return new Technique(text, this.vocabRef);
    }

    public Technique replaceVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef) {
        UncheckedValidator.validateVocabRef(vocabRef);
        return new Technique(this.text, vocabRef);
    }

    public Technique replaceVocabRef(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VocabRef vocabRef) {
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
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.technique.Technique");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeVocabRefField(oprot);

        oprot.writeFieldStop();
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    public void writeVocabRefField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getVocabRef().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.VOCAB_REF);
            getVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    private final String text;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> vocabRef;
}
