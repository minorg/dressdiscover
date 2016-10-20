package org.dressdiscover.api.vocabularies.vra_core.relation;

/**
 * VRA Core 4.0 relation element
 */
public final class Relation implements org.thryft.Struct, org.dressdiscover.api.vocabularies.vra_core.Element {
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
            return new Relation(type, href, relids, text, DefaultConstructionValidator.getInstance());
        }

        public Relation build() {
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

        public final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType getType() {
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
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.class);
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
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.class);
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
            this.href = DefaultConstructionValidator.getInstance().validateHref(href);
            return this;
        }

        public Builder setHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
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
            this.relids = DefaultConstructionValidator.getInstance().validateRelids(relids);
            return this;
        }

        public Builder setRelids(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids) {
            return setRelids(com.google.common.base.Optional.fromNullable(relids));
        }

        public Builder setText(final com.google.common.base.Optional<String> text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setText(@javax.annotation.Nullable final String text) {
            return setText(com.google.common.base.Optional.fromNullable(text));
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
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

        private org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type;
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
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.relation.RelationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 2, "href", org.thryft.protocol.Type.STRING),
        RELIDS("relids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {}, false, 3, "relids", org.thryft.protocol.Type.SET),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "text", org.thryft.protocol.Type.STRING);

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
        public org.dressdiscover.api.vocabularies.vra_core.relation.RelationType validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) throws ExceptionT;

        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) throws ExceptionT;

        public com.google.common.base.Optional<String> validateText(final com.google.common.base.Optional<String> text) throws ExceptionT;
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
        public org.dressdiscover.api.vocabularies.vra_core.relation.RelationType validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws RuntimeException {
            if (href == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: href is null");
            }
            if (!href.isPresent()) {
                return href;
            }
            return href;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) throws RuntimeException {
            if (relids == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is null");
            }
            if (!relids.isPresent()) {
                return relids;
            }
            if (relids.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is less than min length 1");
            }
            return relids;
        }

        @Override
        public com.google.common.base.Optional<String> validateText(final com.google.common.base.Optional<String> text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is null");
            }
            if (!text.isPresent()) {
                return text;
            }
            if (text.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is less than min length 1");
            }
            return text;
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
        public org.dressdiscover.api.vocabularies.vra_core.relation.RelationType validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return href;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
            return relids;
        }

        @Override
        public com.google.common.base.Optional<String> validateText(final com.google.common.base.Optional<String> text) {
            return text;
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
        public org.dressdiscover.api.vocabularies.vra_core.relation.RelationType validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) throws org.thryft.protocol.InputProtocolException {
            if (href == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HREF, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: href is null");
            }
            if (!href.isPresent()) {
                return href;
            }
            return href;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) throws org.thryft.protocol.InputProtocolException {
            if (relids == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELIDS, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is null");
            }
            if (!relids.isPresent()) {
                return relids;
            }
            if (relids.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELIDS, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: relids is less than min length 1");
            }
            return relids;
        }

        @Override
        public com.google.common.base.Optional<String> validateText(final com.google.common.base.Optional<String> text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is null");
            }
            if (!text.isPresent()) {
                return text;
            }
            if (text.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.relation.Relation: text is less than min length 1");
            }
            return text;
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
        public org.dressdiscover.api.vocabularies.vra_core.relation.RelationType validateType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            return href;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
            return relids;
        }

        @Override
        public com.google.common.base.Optional<String> validateText(final com.google.common.base.Optional<String> text) {
            return text;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Relation(final Relation other) {
        this(other.getType(), other.getHref(), other.getRelids(), other.getText(), NopConstructionValidator.getInstance());
    }

    protected Relation(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text, ConstructionValidator validator) {
        this.type = validator.validateType(type);
        this.href = validator.validateHref(href);
        this.relids = validator.validateRelids(relids);
        this.text = validator.validateText(text);
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
        return new Relation(type, com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent(), com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Relation create(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final @javax.annotation.Nullable org.thryft.native_.Url href, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids, final @javax.annotation.Nullable String text) {
        return new Relation(type, com.google.common.base.Optional.fromNullable(href), com.google.common.base.Optional.fromNullable(relids), com.google.common.base.Optional.fromNullable(text), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Relation create(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
        return new Relation(type, href, relids, text, DefaultConstructionValidator.getInstance());
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
        org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.class);
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
        return new Relation(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateHref(href), DefaultReadValidator.getInstance().validateRelids(relids), DefaultReadValidator.getInstance().validateText(text), NopConstructionValidator.getInstance());
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type = null;
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
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.relation.RelationType.class);
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
        return new Relation(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateHref(href), DefaultReadValidator.getInstance().validateRelids(relids), DefaultReadValidator.getInstance().validateText(text), NopConstructionValidator.getInstance());
    }

    public Relation replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        return new Relation(this.type, DefaultConstructionValidator.getInstance().validateHref(href), this.relids, this.text, NopConstructionValidator.getInstance());
    }

    public Relation replaceHref(final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public Relation replaceRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids) {
        return new Relation(this.type, this.href, DefaultConstructionValidator.getInstance().validateRelids(relids), this.text, NopConstructionValidator.getInstance());
    }

    public Relation replaceRelids(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> relids) {
        return replaceRelids(com.google.common.base.Optional.fromNullable(relids));
    }

    public Relation replaceText(final com.google.common.base.Optional<String> text) {
        return new Relation(this.type, this.href, this.relids, DefaultConstructionValidator.getInstance().validateText(text), NopConstructionValidator.getInstance());
    }

    public Relation replaceText(final String text) {
        return replaceText(com.google.common.base.Optional.fromNullable(text));
    }

    public Relation replaceType(final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type) {
        return new Relation(DefaultConstructionValidator.getInstance().validateType(type), this.href, this.relids, this.text, NopConstructionValidator.getInstance());
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
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getHref().isPresent()) {
            oprot.writeFieldBegin("href", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getHref().get().toString());
            oprot.writeFieldEnd();
        }

        if (getRelids().isPresent()) {
            oprot.writeFieldBegin("relids", org.thryft.protocol.Type.SET, (short)3);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getRelids().get().size());
            for (final org.dressdiscover.api.models.object.ObjectId _iter0 : getRelids().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getText().isPresent()) {
            oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getText().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.vocabularies.vra_core.relation.RelationType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> relids;

    private final com.google.common.base.Optional<String> text;
}
