package net.lab1318.costume.api.models.inscription;

/**
 * VRA Core 4.0 inscription element
 */
public class Inscription implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            texts = null;
            author = com.google.common.base.Optional.absent();
            position = com.google.common.base.Optional.absent();
        }

        public Builder(final Inscription other) {
            this.texts = other.getTexts();
            this.author = other.getAuthor();
            this.position = other.getPosition();
        }

        protected Inscription _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts, final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
            return new Inscription(texts, author, position);
        }

        public Inscription build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(texts, "net.lab1318.costume.api.models.inscription.Inscription: missing texts"), com.google.common.base.Preconditions.checkNotNull(author, "net.lab1318.costume.api.models.inscription.Inscription: missing author"), com.google.common.base.Preconditions.checkNotNull(position, "net.lab1318.costume.api.models.inscription.Inscription: missing position"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> getAuthor() {
            return author;
        }

        public final com.google.common.base.Optional<String> getPosition() {
            return position;
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> getTexts() {
            return texts;
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
            texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequenceBuilder.add(net.lab1318.costume.api.models.inscription.InscriptionText.readAsStruct(iprot));
                        }
                        iprot.readListEnd();
                        return sequenceBuilder.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                    }
                }
            }).apply(iprot);
            if (__list.getSize() > 1) {
                author = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                position = com.google.common.base.Optional.of(iprot.readString());
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
                case "texts": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.inscription.InscriptionText.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    }
                    break;
                }
                case "author": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        author = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
                    }
                    break;
                }
                case "position": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        position = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setAuthor(final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author) {
            this.author = com.google.common.base.Preconditions.checkNotNull(author);
            return this;
        }

        public Builder setAuthor(@javax.annotation.Nullable final net.lab1318.costume.api.models.inscription.InscriptionAuthor author) {
            this.author = com.google.common.base.Optional.fromNullable(author);
            return this;
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
            this.position = com.google.common.base.Preconditions.checkNotNull(position);
            return this;
        }

        public Builder setPosition(@javax.annotation.Nullable final String position) {
            this.position = com.google.common.base.Optional.fromNullable(position);
            return this;
        }

        public Builder setTexts(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts) {
            this.texts = com.google.common.base.Preconditions.checkNotNull(texts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "texts": setTexts((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>)value); return this;
            case "author": setAuthor((net.lab1318.costume.api.models.inscription.InscriptionAuthor)value); return this;
            case "position": setPosition((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetAuthor() {
            this.author = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetPosition() {
            this.position = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTexts() {
            this.texts = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "texts": return unsetTexts();
            case "author": return unsetAuthor();
            case "position": return unsetPosition();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author;
        private com.google.common.base.Optional<String> position;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXTS("texts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>>() {}, true, 1, "texts", org.thryft.protocol.Type.LIST),
        AUTHOR("author", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.inscription.InscriptionAuthor>() {}, false, 2, "author", org.thryft.protocol.Type.STRUCT),
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

    /**
     * Copy constructor
     */
    public Inscription(final Inscription other) {
        this(other.getTexts(), other.getAuthor(), other.getPosition());
    }

    /**
     * Required constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts) {
        this.texts = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(texts, "net.lab1318.costume.api.models.inscription.Inscription: missing texts"), "net.lab1318.costume.api.models.inscription.Inscription: texts is empty");
        this.author = com.google.common.base.Optional.absent();
        this.position = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts, final @javax.annotation.Nullable net.lab1318.costume.api.models.inscription.InscriptionAuthor author, final @javax.annotation.Nullable String position) {
        this.texts = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(texts, "net.lab1318.costume.api.models.inscription.Inscription: missing texts"), "net.lab1318.costume.api.models.inscription.Inscription: texts is empty");
        this.author = com.google.common.base.Optional.fromNullable(author);
        this.position = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(position), "net.lab1318.costume.api.models.inscription.Inscription: position is empty");
    }

    /**
     * Optional constructor
     */
    public Inscription(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts, final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author, final com.google.common.base.Optional<String> position) {
        this.texts = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(texts, "net.lab1318.costume.api.models.inscription.Inscription: missing texts"), "net.lab1318.costume.api.models.inscription.Inscription: texts is empty");
        this.author = com.google.common.base.Preconditions.checkNotNull(author, "net.lab1318.costume.api.models.inscription.Inscription: missing author");
        this.position = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(position, "net.lab1318.costume.api.models.inscription.Inscription: missing position"), "net.lab1318.costume.api.models.inscription.Inscription: position is empty");
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
        } else if (!(otherObject instanceof Inscription)) {
            return false;
        }

        final Inscription other = (Inscription)otherObject;
        return
            getTexts().equals(other.getTexts()) &&
            getAuthor().equals(other.getAuthor()) &&
            getPosition().equals(other.getPosition());
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> getAuthor() {
        return author;
    }

    public final com.google.common.base.Optional<String> getPosition() {
        return position;
    }

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> getTexts() {
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Inscription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> position = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequenceBuilder.add(net.lab1318.costume.api.models.inscription.InscriptionText.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                    return sequenceBuilder.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                }
            }
        }).apply(iprot);
        if (__list.getSize() > 1) {
            author = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
        }
        if (__list.getSize() > 2) {
            position = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Inscription(texts, author, position);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Inscription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> position = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "texts": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    texts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.inscription.InscriptionText> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.inscription.InscriptionText.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                }
                break;
            }
            case "author": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    author = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionAuthor.readAsStruct(iprot));
                }
                break;
            }
            case "position": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    position = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Inscription(texts, author, position);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Inscription replaceAuthor(final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author) {
        return new Inscription(this.texts, author, this.position);
    }

    public Inscription replaceAuthor(final net.lab1318.costume.api.models.inscription.InscriptionAuthor author) {
        return replaceAuthor(com.google.common.base.Optional.fromNullable(author));
    }

    public Inscription replacePosition(final com.google.common.base.Optional<String> position) {
        return new Inscription(this.texts, this.author, position);
    }

    public Inscription replacePosition(final String position) {
        return replacePosition(com.google.common.base.Optional.fromNullable(position));
    }

    public Inscription replaceTexts(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts) {
        return new Inscription(texts, this.author, this.position);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("texts", getTexts()).add("author", getAuthor().orNull()).add("position", getPosition().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final net.lab1318.costume.api.models.inscription.InscriptionText _iter0 : getTexts()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.inscription.Inscription");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("texts", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTexts().size());
        for (final net.lab1318.costume.api.models.inscription.InscriptionText _iter0 : getTexts()) {
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

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> texts;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionAuthor> author;

    private final com.google.common.base.Optional<String> position;
}
