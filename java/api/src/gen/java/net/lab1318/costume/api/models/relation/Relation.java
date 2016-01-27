package net.lab1318.costume.api.models.relation;

/**
 * VRA Core 4.0 relation element
 */
public class Relation implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            type = null;
            href = com.google.common.base.Optional.absent();
            relids = com.google.common.base.Optional.absent();
            text = com.google.common.base.Optional.absent();
        }

        public Builder(final Relation other) {
            this.type = other.getType();
            this.href = other.getHref();
            this.relids = other.getRelids();
            this.text = other.getText();
        }

        protected Relation _build(final net.lab1318.costume.api.models.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
            return new Relation(type, href, relids, text);
        }

        public Relation build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.relation.Relation: missing type"), com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.relation.Relation: missing href"), com.google.common.base.Preconditions.checkNotNull(relids, "net.lab1318.costume.api.models.relation.Relation: missing relids"), com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.relation.Relation: missing text"));
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getHref() {
            return href;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> getRelids() {
            return relids;
        }

        public final com.google.common.base.Optional<String> getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.relation.RelationType getType() {
            return type;
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
            type = iprot.readEnum(net.lab1318.costume.api.models.relation.RelationType.class);
            if (__list.getSize() > 1) {
                try {
                    href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 2) {
                try {
                    relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
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
                }
            }
            if (__list.getSize() > 3) {
                text = com.google.common.base.Optional.of(iprot.readString());
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
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.relation.RelationType.class);
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
                            relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                                            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
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
            return this;
        }

        public Builder setHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
            this.href = com.google.common.base.Preconditions.checkNotNull(href);
            return this;
        }

        public Builder setHref(@javax.annotation.Nullable final org.thryft.native_.Url href) {
            this.href = com.google.common.base.Optional.fromNullable(href);
            return this;
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

        public Builder setRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids) {
            this.relids = com.google.common.base.Preconditions.checkNotNull(relids);
            return this;
        }

        public Builder setRelids(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> relids) {
            this.relids = com.google.common.base.Optional.fromNullable(relids);
            return this;
        }

        public Builder setText(final com.google.common.base.Optional<String> text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setText(@javax.annotation.Nullable final String text) {
            this.text = com.google.common.base.Optional.fromNullable(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.relation.RelationType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": setType((net.lab1318.costume.api.models.relation.RelationType)value); return this;
            case "href": setHref((org.thryft.native_.Url)value); return this;
            case "relids": setRelids((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>)value); return this;
            case "text": setText((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetHref() {
            this.href = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRelids() {
            this.relids = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetText() {
            this.text = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "type": return unsetType();
            case "href": return unsetHref();
            case "relids": return unsetRelids();
            case "text": return unsetText();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.relation.RelationType type;
        private com.google.common.base.Optional<org.thryft.native_.Url> href;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids;
        private com.google.common.base.Optional<String> text;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.relation.RelationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 2, "href", org.thryft.protocol.Type.STRING),
        RELIDS("relids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>>() {}, false, 3, "relids", org.thryft.protocol.Type.SET),
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

    /**
     * Copy constructor
     */
    public Relation(final Relation other) {
        this(other.getType(), other.getHref(), other.getRelids(), other.getText());
    }

    /**
     * Required constructor
     */
    public Relation(final net.lab1318.costume.api.models.relation.RelationType type) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.relation.Relation: missing type");
        this.href = com.google.common.base.Optional.absent();
        this.relids = com.google.common.base.Optional.absent();
        this.text = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Relation(final net.lab1318.costume.api.models.relation.RelationType type, final @javax.annotation.Nullable org.thryft.native_.Url href, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> relids, final @javax.annotation.Nullable String text) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.relation.Relation: missing type");
        this.href = com.google.common.base.Optional.fromNullable(href);
        this.relids = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(relids), "net.lab1318.costume.api.models.relation.Relation: relids is empty");
        this.text = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(text), "net.lab1318.costume.api.models.relation.Relation: text is empty");
    }

    /**
     * Optional constructor
     */
    public Relation(final net.lab1318.costume.api.models.relation.RelationType type, final com.google.common.base.Optional<org.thryft.native_.Url> href, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids, final com.google.common.base.Optional<String> text) {
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.relation.Relation: missing type");
        this.href = com.google.common.base.Preconditions.checkNotNull(href, "net.lab1318.costume.api.models.relation.Relation: missing href");
        this.relids = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(relids, "net.lab1318.costume.api.models.relation.Relation: missing relids"), "net.lab1318.costume.api.models.relation.Relation: relids is empty");
        this.text = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.relation.Relation: missing text"), "net.lab1318.costume.api.models.relation.Relation: text is empty");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Relation)) {
            return false;
        }

        final Relation other = (Relation)otherObject;
        return
            getType().equals(other.getType()) &&
            getHref().equals(other.getHref()) &&
            getRelids().equals(other.getRelids()) &&
            getText().equals(other.getText());
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> getRelids() {
        return relids;
    }

    public final com.google.common.base.Optional<String> getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.relation.RelationType getType() {
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Relation readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Relation readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.relation.RelationType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        type = iprot.readEnum(net.lab1318.costume.api.models.relation.RelationType.class);
        if (__list.getSize() > 1) {
            try {
                href = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 2) {
            try {
                relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
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
            }
        }
        if (__list.getSize() > 3) {
            text = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Relation(type, href, relids, text);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Relation readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.relation.RelationType type = null;
        com.google.common.base.Optional<org.thryft.native_.Url> href = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.relation.RelationType.class);
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
                        relids = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
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
        try {
            return new Relation(type, href, relids, text);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Relation replaceHref(final com.google.common.base.Optional<org.thryft.native_.Url> href) {
        return new Relation(this.type, href, this.relids, this.text);
    }

    public Relation replaceHref(final org.thryft.native_.Url href) {
        return replaceHref(com.google.common.base.Optional.fromNullable(href));
    }

    public Relation replaceRelids(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids) {
        return new Relation(this.type, this.href, relids, this.text);
    }

    public Relation replaceRelids(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId> relids) {
        return replaceRelids(com.google.common.base.Optional.fromNullable(relids));
    }

    public Relation replaceText(final com.google.common.base.Optional<String> text) {
        return new Relation(this.type, this.href, this.relids, text);
    }

    public Relation replaceText(final String text) {
        return replaceText(com.google.common.base.Optional.fromNullable(text));
    }

    public Relation replaceType(final net.lab1318.costume.api.models.relation.RelationType type) {
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
            for (final net.lab1318.costume.api.models.object.ObjectId _iter0 : getRelids().get()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.relation.Relation");
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
            for (final net.lab1318.costume.api.models.object.ObjectId _iter0 : getRelids().get()) {
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

    private final net.lab1318.costume.api.models.relation.RelationType type;

    private final com.google.common.base.Optional<org.thryft.native_.Url> href;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.object.ObjectId>> relids;

    private final com.google.common.base.Optional<String> text;
}
