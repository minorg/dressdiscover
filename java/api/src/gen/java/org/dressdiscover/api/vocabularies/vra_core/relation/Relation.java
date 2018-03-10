package org.dressdiscover.api.vocabularies.vra_core.relation;

/**
 * VRA Core 4.0 relation element
 */
public final class Relation implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
        public Builder() {
            type = null;
            href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            relids = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
            text = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final Relation other) {
            this.type = other.getType();
            this.href = other.getHref();
            this.relids = other.getRelids();
            this.text = other.getText();
        }

        protected Relation _build(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
            return new Relation(type, href, relids, text);
        }

        public Relation build() {
            UncheckedValidator.validate(type, href, relids, text);

            return _build(type, href, relids, text);
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> getRelids() {
            return relids;
        }

        public final com.google.common.base.Optional<String> getText() {
            return text;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.relation.RelationType getType() {
            return type;
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
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.Factory.getInstance());
                if (__list.getSize() > 1) {
                    try {
                        href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    text = com.google.common.base.Optional.of(iprot.readString());
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
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.Factory.getInstance());
                        }
                        break;
                    }
                    case "href": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                            } catch (final java.lang.IllegalArgumentException e) {
                            }
                        }
                        break;
                    }
                    case "relids": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                try {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                                } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                                     throw new org.thryft.protocol.InputProtocolException(e);
                                                } catch (final IllegalArgumentException e) {
                                                     throw new org.thryft.protocol.InputProtocolException(e);
                                                }
                                            }
                                            iprot.readSetEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "text": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            text = com.google.common.base.Optional.of(iprot.readString());
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
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.relation.RelationType)value); return this;
            case HREF: setHref((org.thryft.native_.Url)value); return this;
            case RELIDS: setRelids((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>)value); return this;
            case TEXT: setText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            UncheckedValidator.validateHref(href);
            this.href = href;
            return this;
        }

        public Builder setHref(final @javax.annotation.Nullable org.thryft.native_.Url href) {
            return setHref(com.google.common.base.Optional.fromNullable(href));
        }

        public Builder setIfPresent(final Relation other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getHref().isPresent()) {
                setHref(other.getHref());
            }
            if (other.getRelids().isPresent()) {
                setRelids(other.getRelids());
            }
            if (other.getText().isPresent()) {
                setText(other.getText());
            }

            return this;
        }

        public Builder setRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
            UncheckedValidator.validateRelids(relids);
            this.relids = relids;
            return this;
        }

        public Builder setRelids(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids) {
            return setRelids(com.google.common.base.Optional.fromNullable(relids));
        }

        public Builder setText(final com.google.common.base.Optional<String> text) {
            UncheckedValidator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setText(final @javax.annotation.Nullable String text) {
            return setText(com.google.common.base.Optional.fromNullable(text));
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
            UncheckedValidator.validateType(type);
            this.type = type;
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
            case TYPE: return unsetType();
            case HREF: return unsetHref();
            case RELIDS: return unsetRelids();
            case TEXT: return unsetText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            return this;
        }

        public Builder unsetRelids() {
            this.relids = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids;
        private com.google.common.base.Optional<String> text;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Relation> {
        @Override
        public Relation readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Relation.readAs(iprot, type);
        }

        @Override
        public Relation readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Relation.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Relation readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Relation.readAsList(iprot);
        }

        @Override
        public Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Relation.readAsStruct(iprot);
        }

        @Override
        public Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Relation.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.relation.RelationType>() {}, true, (short)1, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, (short)2, "href", org.thryft.protocol.Type.STRING),
        RELIDS("relids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {}, false, (short)3, "relids", org.thryft.protocol.Type.SET),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, false, (short)4, "text", org.thryft.protocol.Type.STRING);

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
            case "type": return TYPE;
            case "href": return HREF;
            case "relids": return RELIDS;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "href": return HREF;
            case "relids": return RELIDS;
            case "text": return TEXT;
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
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) throws org.thryft.protocol.InputProtocolException {
            validateType(type);
            validateHref(href);
            validateRelids(relids);
            validateText(text);
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: type is null");
            }
        }

        public static void validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws org.thryft.protocol.InputProtocolException {
            if (href == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HREF, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: href is null");
            }
        }

        public static void validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) throws org.thryft.protocol.InputProtocolException {
            if (relids == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELIDS, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is null");
            }
            if (relids.isPresent()) {
                if (relids.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids: less than min length 1");
                }
            }
        }

        public static void validateText(final com.google.common.base.Optional<String> text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is null");
            }
            if (text.isPresent()) {
                if (text.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text: less than min length 1");
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
            validateType(type);
            validateHref(href);
            validateRelids(relids);
            validateText(text);
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: type is null");
            }
        }

        public static void validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            if (href == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: href is null");
            }
        }

        public static void validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
            if (relids == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is null");
            }
            if (relids.isPresent()) {
                if (relids.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids: less than min length 1");
                }
            }
        }

        public static void validateText(final com.google.common.base.Optional<String> text) {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is null");
            }
            if (text.isPresent()) {
                if (text.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public Relation(final Relation other) {
        this(other.getType(), other.getHref(), other.getRelids(), other.getText());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Relation(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
        this.type = type;
        this.href = href;
        this.relids = relids;
        this.text = text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Relation other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Relation> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Relation create(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
        UncheckedValidator.validate(type, com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent(), com.google.common.base.Optional.<String> absent());
        return new Relation(type, com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent(), com.google.common.base.Optional.<String> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static Relation create(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, @javax.annotation.Nullable final org.thryft.native_.Url href, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids, @javax.annotation.Nullable final String text) {
        final com.google.common.base.Optional<org.thryft.native_.Url> hrefOptional = com.google.common.base.Optional.fromNullable(href);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relidsOptional = com.google.common.base.Optional.fromNullable(relids);
        final com.google.common.base.Optional<String> textOptional = com.google.common.base.Optional.fromNullable(text);
        UncheckedValidator.validate(type, hrefOptional, relidsOptional, textOptional);
        return new Relation(type, hrefOptional, relidsOptional, textOptional);
    }

    /**
     * Optional factory method
     */
    public static Relation create(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
        UncheckedValidator.validate(type, href, relids, text);
        return new Relation(type, href, relids, text);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Relation)) {
            return false;
        }

        final Relation other = (Relation)otherObject;

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getHref().isPresent() && other.getHref().isPresent()) ? (getHref().get().equals(other.getHref().get())) : (!getHref().isPresent() && !other.getHref().isPresent())))) {
            return false;
        }

        if (!(((getRelids().isPresent() && other.getRelids().isPresent()) ? (getRelids().get().equals(other.getRelids().get())) : (!getRelids().isPresent() && !other.getRelids().isPresent())))) {
            return false;
        }

        if (!(((getText().isPresent() && other.getText().isPresent()) ? (getText().get().equals(other.getText().get())) : (!getText().isPresent() && !other.getText().isPresent())))) {
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
        case TYPE: return getType();
        case HREF: return getHref();
        case RELIDS: return getRelids();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
        return href;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> getRelids() {
        return relids;
    }

    public final com.google.common.base.Optional<String> getText() {
        return text;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getHref().isPresent()) {
            hashCode = 31 * hashCode + getHref().get().hashCode();
        }
        if (getRelids().isPresent()) {
            hashCode = 31 * hashCode + getRelids().get().hashCode();
        }
        if (getText().isPresent()) {
            hashCode = 31 * hashCode + getText().get().hashCode();
        }
        return hashCode;
    }

    public static Relation readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Relation readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Relation readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.Factory.getInstance());
            if (__list.getSize() > 1) {
                try {
                    href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 2) {
                try {
                    relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                text = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(type, href, relids, text);

        return new Relation(type, href, relids, text);
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.Factory.getInstance());
                    }
                    break;
                }
                case "href": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "relids": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                            } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            } catch (final IllegalArgumentException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, e.getCause());
                        }
                    }
                    break;
                }
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        text = com.google.common.base.Optional.of(iprot.readString());
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

        ReadValidator.validate(type, href, relids, text);

        return new Relation(type, href, relids, text);
    }

    public Relation replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        UncheckedValidator.validateHref(href);
        return new Relation(this.type, href, this.relids, this.text);
    }

    public Relation replaceHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public Relation replaceRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
        UncheckedValidator.validateRelids(relids);
        return new Relation(this.type, this.href, relids, this.text);
    }

    public Relation replaceRelids(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids) {
        return replaceRelids(com.google.common.base.Optional.fromNullable(relids));
    }

    public Relation replaceText(final com.google.common.base.Optional<String> text) {
        UncheckedValidator.validateText(text);
        return new Relation(this.type, this.href, this.relids, text);
    }

    public Relation replaceText(@javax.annotation.Nullable final String text) {
        return replaceText(com.google.common.base.Optional.fromNullable(text));
    }

    public Relation replaceType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
        UncheckedValidator.validateType(type);
        return new Relation(type, this.href, this.relids, this.text);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("href", getHref().orNull()).add("relids", getRelids().orNull()).add("text", getText().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeEnum(getType());

        if (getHref().isPresent()) {
            oprot.writeString(getHref().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getRelids().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getRelids().get().size());
            for (final org.dressdiscover.api.models.object.ObjectId _iter0 : getRelids().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getText().isPresent()) {
            oprot.writeString(getText().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.relation.Relation");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTypeField(oprot);

        writeHrefField(oprot);

        writeRelidsField(oprot);

        writeTextField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHrefField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHref().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HREF);
            oprot.writeString(getHref().get().toString());
            oprot.writeFieldEnd();
        }
    }

    public void writeRelidsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRelids().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RELIDS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getRelids().get().size());
            for (final org.dressdiscover.api.models.object.ObjectId _iter0 : getRelids().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getText().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TEXT);
            oprot.writeString(getText().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids;

    private final com.google.common.base.Optional<String> text;
}
