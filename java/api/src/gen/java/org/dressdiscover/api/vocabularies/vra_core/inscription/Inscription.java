package org.dressdiscover.api.vocabularies.vra_core.inscription;

/**
 * VRA Core 4.0 inscription element
 */
public final class Inscription implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Inscription> {
        public Builder() {
            texts = null;
            author = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> absent();
            position = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final Inscription other) {
            this.texts = other.getTexts();
            this.author = other.getAuthor();
            this.position = other.getPosition();
        }

        protected Inscription _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
            return new Inscription(texts, author, position);
        }

        public Inscription build() {
            Validator.validate(texts, author, position);

            return _build(texts, author, position);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> getAuthor() {
            return author;
        }

        public final com.google.common.base.Optional<String> getPosition() {
            return position;
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> getTexts() {
            return texts;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                try {
                    this.setTexts((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
                }
                if (__list.getSize() > 1) {
                    this.setAuthor(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor.readAsStruct(iprot)));
                }
                if (__list.getSize() > 2) {
                    this.setPosition(com.google.common.base.Optional.of(iprot.readString()));
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
                    case "texts": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                try {
                                    this.setTexts((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "author": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setAuthor(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor.readAsStruct(iprot, unknownFieldCallback)));
                        }
                        break;
                    }
                    case "position": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setPosition(com.google.common.base.Optional.of(iprot.readString()));
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TEXTS: setTexts((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText>)value); return this;
            case AUTHOR: setAuthor((org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor)value); return this;
            case POSITION: setPosition((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAuthor(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author) {
            Validator.validateAuthor(author);
            this.author = author;
            return this;
        }

        public Builder setAuthor(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor author) {
            return setAuthor(com.google.common.base.Optional.fromNullable(author));
        }

        public Builder setIfPresent(final Inscription other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTexts(other.getTexts());
            if (other.getAuthor().isPresent()) {
                setAuthor(other.getAuthor());
            }
            if (other.getPosition().isPresent()) {
                setPosition(other.getPosition());
            }

            return this;
        }

        public Builder setPosition(final com.google.common.base.Optional<String> position) {
            Validator.validatePosition(position);
            this.position = position;
            return this;
        }

        public Builder setPosition(final @javax.annotation.Nullable String position) {
            return setPosition(com.google.common.base.Optional.fromNullable(position));
        }

        public Builder setTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts) {
            Validator.validateTexts(texts);
            this.texts = texts;
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
            case TEXTS: return unsetTexts();
            case AUTHOR: return unsetAuthor();
            case POSITION: return unsetPosition();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAuthor() {
            this.author = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> absent();
            return this;
        }

        public Builder unsetPosition() {
            this.position = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetTexts() {
            this.texts = null;
            return this;
        }

        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author;
        private com.google.common.base.Optional<String> position;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Inscription> {
        @Override
        public Inscription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsList(iprot);
        }

        @Override
        public Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsStruct(iprot);
        }

        @Override
        public Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXTS("texts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText>>() {}, true, (short)1, "texts", "1:texts", org.thryft.protocol.Type.LIST),
        AUTHOR("author", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor>() {}, false, (short)2, "author", "2:author", org.thryft.protocol.Type.STRUCT),
        POSITION("position", new com.google.common.reflect.TypeToken<String>() {}, false, (short)3, "position", "3:position", org.thryft.protocol.Type.STRING);

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
            case "texts": return TEXTS;
            case "author": return AUTHOR;
            case "position": return POSITION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "texts": return TEXTS;
            case "author": return AUTHOR;
            case "position": return POSITION;
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
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
            validateTexts(texts);
            validateAuthor(author);
            validatePosition(position);
        }

        public static void validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts) {
            if (texts == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription: texts is missing");
            }
            if (texts.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription: texts: less than min length 1");
            }
        }

        public static void validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author) {
            if (author == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription: author is missing");
            }
        }

        public static void validatePosition(final com.google.common.base.Optional<String> position) {
            if (position == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription: position is missing");
            }
            if (position.isPresent()) {
                if (position.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription: position: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public Inscription(final Inscription other) {
        this(other.getTexts(), other.getAuthor(), other.getPosition());
    }

    /**
     * Required constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts) {
        this(texts, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> absent(), com.google.common.base.Optional.<String> absent());
    }

    /**
     * Total constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
        Validator.validate(texts, author, position);
        this.texts = texts;
        this.author = author;
        this.position = position;
    }

    /**
     * Total Nullable constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor author, @javax.annotation.Nullable final String position) {
        this(texts, com.google.common.base.Optional.fromNullable(author), com.google.common.base.Optional.fromNullable(position));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Inscription other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Inscription> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Inscription)) {
            return false;
        }

        final Inscription other = (Inscription)otherObject;

        if (!(getTexts().equals(other.getTexts()))) {
            return false;
        }

        if (!(((getAuthor().isPresent() && other.getAuthor().isPresent()) ? (getAuthor().get().equals(other.getAuthor().get())) : (!getAuthor().isPresent() && !other.getAuthor().isPresent())))) {
            return false;
        }

        if (!(((getPosition().isPresent() && other.getPosition().isPresent()) ? (getPosition().get().equals(other.getPosition().get())) : (!getPosition().isPresent() && !other.getPosition().isPresent())))) {
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
        case TEXTS: return getTexts();
        case AUTHOR: return getAuthor();
        case POSITION: return getPosition();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> getAuthor() {
        return author;
    }

    public final com.google.common.base.Optional<String> getPosition() {
        return position;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> getTexts() {
        return texts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTexts().hashCode();
        if (getAuthor().isPresent()) {
            hashCode = 31 * hashCode + getAuthor().get().hashCode();
        }
        if (getPosition().isPresent()) {
            hashCode = 31 * hashCode + getPosition().get().hashCode();
        }
        return hashCode;
    }

    public static Inscription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Inscription replaceAuthor(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author) {
        Validator.validateAuthor(author);
        return new Inscription(this.texts, author, this.position);
    }

    public Inscription replaceAuthor(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor author) {
        return replaceAuthor(com.google.common.base.Optional.fromNullable(author));
    }

    public Inscription replacePosition(final com.google.common.base.Optional<String> position) {
        Validator.validatePosition(position);
        return new Inscription(this.texts, this.author, position);
    }

    public Inscription replacePosition(@javax.annotation.Nullable final String position) {
        return replacePosition(com.google.common.base.Optional.fromNullable(position));
    }

    public Inscription replaceTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts) {
        Validator.validateTexts(texts);
        return new Inscription(texts, this.author, this.position);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("texts", getTexts()).add("author", getAuthor().orNull()).add("position", getPosition().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeAuthorField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAuthor().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.AUTHOR);
            getAuthor().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText _iter0 : getTexts()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        if (getAuthor().isPresent()) {
            getAuthor().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }
        if (getPosition().isPresent()) {
            oprot.writeString(getPosition().get());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextsField(oprot);

        writeAuthorField(oprot);

        writePositionField(oprot);

        oprot.writeFieldStop();
    }

    public void writePositionField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPosition().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.POSITION);
            oprot.writeString(getPosition().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXTS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText _iter0 : getTexts()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionText> texts;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionAuthor> author;

    private final com.google.common.base.Optional<String> position;
}
