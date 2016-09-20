package org.dressdiscover.api.models.inscription;

/**
 * VRA Core 4.0 inscription element
 */
public final class Inscription implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public final static class Builder {
        public Builder() {
            texts = null;
            author = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionAuthor> absent();
            position = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final Inscription other) {
            this.texts = other.getTexts();
            this.author = other.getAuthor();
            this.position = other.getPosition();
        }

        protected Inscription _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
            return new Inscription(texts, author, position, DefaultConstructionValidator.getInstance());
        }

        public Inscription build() {
            return _build(texts, author, position);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> getAuthor() {
            return author;
        }

        public final com.google.common.base.Optional<String> getPosition() {
            return position;
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> getTexts() {
            return texts;
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
                try {
                    texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.inscription.InscriptionText.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
                }
                if (__list.getSize() > 1) {
                    author = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    position = com.google.common.base.Optional.of(iprot.readString());
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
                    case "texts": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.inscription.InscriptionText.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot);
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "author": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            author = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "position": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            position = com.google.common.base.Optional.of(iprot.readString());
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TEXTS: setTexts((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>)value); return this;
            case AUTHOR: setAuthor((org.dressdiscover.api.models.inscription.InscriptionAuthor)value); return this;
            case POSITION: setPosition((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) {
            this.author = DefaultConstructionValidator.getInstance().validateAuthor(author);
            return this;
        }

        public Builder setAuthor(@javax.annotation.Nullable final org.dressdiscover.api.models.inscription.InscriptionAuthor author) {
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
            this.position = DefaultConstructionValidator.getInstance().validatePosition(position);
            return this;
        }

        public Builder setPosition(@javax.annotation.Nullable final String position) {
            return setPosition(com.google.common.base.Optional.fromNullable(position));
        }

        public Builder setTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) {
            this.texts = DefaultConstructionValidator.getInstance().validateTexts(texts);
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
            this.author = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionAuthor> absent();
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

        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts;
        private com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author;
        private com.google.common.base.Optional<String> position;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Inscription> {
        @Override
        public Inscription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAs(iprot, type);
        }

        @Override
        public Inscription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Inscription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsList(iprot);
        }

        @Override
        public Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsStruct(iprot);
        }

        @Override
        public Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Inscription.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXTS("texts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>>() {}, true, 1, "texts", org.thryft.protocol.Type.LIST),
        AUTHOR("author", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.inscription.InscriptionAuthor>() {}, false, 2, "author", org.thryft.protocol.Type.STRUCT),
        POSITION("position", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "position", org.thryft.protocol.Type.STRING);

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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) throws ExceptionT;

        public com.google.common.base.Optional<String> validatePosition(final com.google.common.base.Optional<String> position) throws ExceptionT;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) throws RuntimeException {
            if (texts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.Inscription: texts is null");
            }
            if (texts.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.inscription.Inscription: texts is less than min length 1");
            }
            return texts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) throws RuntimeException {
            if (author == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.Inscription: author is null");
            }
            if (!author.isPresent()) {
                return author;
            }
            return author;
        }

        @Override
        public com.google.common.base.Optional<String> validatePosition(final com.google.common.base.Optional<String> position) throws RuntimeException {
            if (position == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.Inscription: position is null");
            }
            if (!position.isPresent()) {
                return position;
            }
            if (position.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.inscription.Inscription: position is less than min length 1");
            }
            return position;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) {
            return texts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) {
            return author;
        }

        @Override
        public com.google.common.base.Optional<String> validatePosition(final com.google.common.base.Optional<String> position) {
            return position;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) throws org.thryft.protocol.InputProtocolException {
            if (texts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXTS, "org.dressdiscover.api.models.inscription.Inscription: texts is null");
            }
            if (texts.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, "org.dressdiscover.api.models.inscription.Inscription: texts is less than min length 1");
            }
            return texts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) throws org.thryft.protocol.InputProtocolException {
            if (author == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AUTHOR, "org.dressdiscover.api.models.inscription.Inscription: author is null");
            }
            if (!author.isPresent()) {
                return author;
            }
            return author;
        }

        @Override
        public com.google.common.base.Optional<String> validatePosition(final com.google.common.base.Optional<String> position) throws org.thryft.protocol.InputProtocolException {
            if (position == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.POSITION, "org.dressdiscover.api.models.inscription.Inscription: position is null");
            }
            if (!position.isPresent()) {
                return position;
            }
            if (position.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.POSITION, "org.dressdiscover.api.models.inscription.Inscription: position is less than min length 1");
            }
            return position;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> validateTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) {
            return texts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> validateAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) {
            return author;
        }

        @Override
        public com.google.common.base.Optional<String> validatePosition(final com.google.common.base.Optional<String> position) {
            return position;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Inscription(final Inscription other) {
        this(other.getTexts(), other.getAuthor(), other.getPosition(), NopConstructionValidator.getInstance());
    }

    protected Inscription(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position, ConstructionValidator validator) {
        this.texts = validator.validateTexts(texts);
        this.author = validator.validateAuthor(author);
        this.position = validator.validatePosition(position);
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

    /**
     * Required factory method
     */
    public static Inscription create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) {
        return new Inscription(texts, com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionAuthor> absent(), com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Inscription create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts, final @javax.annotation.Nullable org.dressdiscover.api.models.inscription.InscriptionAuthor author, final @javax.annotation.Nullable String position) {
        return new Inscription(texts, com.google.common.base.Optional.fromNullable(author), com.google.common.base.Optional.fromNullable(position), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Inscription create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
        return new Inscription(texts, author, position, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Inscription)) {
            return false;
        }

        final Inscription other = (Inscription)otherObject;
        return
            getTexts().equals(other.getTexts()) &&
            ((getAuthor().isPresent() && other.getAuthor().isPresent()) ? (getAuthor().get().equals(other.getAuthor().get())) : (!getAuthor().isPresent() && !other.getAuthor().isPresent())) &&
            ((getPosition().isPresent() && other.getPosition().isPresent()) ? (getPosition().get().equals(other.getPosition().get())) : (!getPosition().isPresent() && !other.getPosition().isPresent()));
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> getAuthor() {
        return author;
    }

    public final com.google.common.base.Optional<String> getPosition() {
        return position;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> getTexts() {
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

    public static Inscription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Inscription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Inscription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionAuthor> absent();
        com.google.common.base.Optional<String> position = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.inscription.InscriptionText.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
            }
            if (__list.getSize() > 1) {
                author = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                position = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Inscription(DefaultReadValidator.getInstance().validateTexts(texts), DefaultReadValidator.getInstance().validateAuthor(author), DefaultReadValidator.getInstance().validatePosition(position), NopConstructionValidator.getInstance());
    }

    public static Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionAuthor> absent();
        com.google.common.base.Optional<String> position = com.google.common.base.Optional.<String> absent();

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
                            texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.inscription.InscriptionText.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTS, e.getCause());
                        }
                    }
                    break;
                }
                case "author": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        author = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
                    }
                    break;
                }
                case "position": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        position = com.google.common.base.Optional.of(iprot.readString());
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
        return new Inscription(DefaultReadValidator.getInstance().validateTexts(texts), DefaultReadValidator.getInstance().validateAuthor(author), DefaultReadValidator.getInstance().validatePosition(position), NopConstructionValidator.getInstance());
    }

    public Inscription replaceAuthor(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author) {
        return new Inscription(this.texts, DefaultConstructionValidator.getInstance().validateAuthor(author), this.position, NopConstructionValidator.getInstance());
    }

    public Inscription replaceAuthor(final org.dressdiscover.api.models.inscription.InscriptionAuthor author) {
        return replaceAuthor(com.google.common.base.Optional.fromNullable(author));
    }

    public Inscription replacePosition(final com.google.common.base.Optional<String> position) {
        return new Inscription(this.texts, this.author, DefaultConstructionValidator.getInstance().validatePosition(position), NopConstructionValidator.getInstance());
    }

    public Inscription replacePosition(final String position) {
        return replacePosition(com.google.common.base.Optional.fromNullable(position));
    }

    public Inscription replaceTexts(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts) {
        return new Inscription(DefaultConstructionValidator.getInstance().validateTexts(texts), this.author, this.position, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("texts", getTexts()).add("author", getAuthor().orNull()).add("position", getPosition().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final org.dressdiscover.api.models.inscription.InscriptionText _iter0 : getTexts()) {
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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.inscription.Inscription");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("texts", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final org.dressdiscover.api.models.inscription.InscriptionText _iter0 : getTexts()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        if (getAuthor().isPresent()) {
            oprot.writeFieldBegin("author", org.thryft.protocol.Type.STRUCT, (short)2);
            getAuthor().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getPosition().isPresent()) {
            oprot.writeFieldBegin("position", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getPosition().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.InscriptionText> texts;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionAuthor> author;

    private final com.google.common.base.Optional<String> position;
}
