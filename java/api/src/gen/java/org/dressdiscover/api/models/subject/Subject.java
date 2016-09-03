package org.dressdiscover.api.models.subject;

/**
 * VRA Core 4.0 subject element
 */
public class Subject implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public static class Builder {
        public Builder() {
            terms = null;
        }

        public Builder(final Subject other) {
            this.terms = other.getTerms();
        }

        protected Subject _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms) {
            return new Subject(terms);
        }

        public Subject build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(terms, "org.dressdiscover.api.models.subject.Subject: missing terms"));
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> getTerms() {
            return terms;
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
            iprot.readListBegin();
            terms = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>>() {
                @Override
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequenceBuilder.add(org.dressdiscover.api.models.subject.SubjectTerm.readAsStruct(iprot));
                        }
                        iprot.readListEnd();
                        return sequenceBuilder.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                    }
                }
            }).apply(iprot);
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
                case "terms": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        terms = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.subject.SubjectTerm.readAsStruct(iprot));
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TERMS: setTerms((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Subject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTerms(other.getTerms());

            return this;
        }

        public Builder setTerms(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms) {
            this.terms = com.google.common.base.Preconditions.checkNotNull(terms);
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
            case TERMS: return unsetTerms();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetTerms() {
            this.terms = null;
            return this;
        }

        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Subject> {
        @Override
        public Subject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAs(iprot, type);
        }

        @Override
        public Subject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Subject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsList(iprot);
        }

        @Override
        public Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsStruct(iprot);
        }

        @Override
        public Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERMS("terms", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>>() {}, true, 1, "terms", org.thryft.protocol.Type.LIST);

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
            case "terms": return TERMS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "terms": return TERMS;
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
    public Subject(final Subject other) {
        this(other.getTerms());
    }

    /**
     * Optional constructor
     */
    public Subject(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms) {
        this.terms = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(terms, "org.dressdiscover.api.models.subject.Subject: missing terms"), "org.dressdiscover.api.models.subject.Subject: terms is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Subject other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Subject> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Subject)) {
            return false;
        }

        final Subject other = (Subject)otherObject;
        return
            getTerms().equals(other.getTerms());
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
        case TERMS: return getTerms();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> getTerms() {
        return terms;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTerms().hashCode();
        return hashCode;
    }

    public static Subject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Subject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Subject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms = null;

        iprot.readListBegin();
        terms = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>>() {
            @Override
            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequenceBuilder.add(org.dressdiscover.api.models.subject.SubjectTerm.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                    return sequenceBuilder.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                }
            }
        }).apply(iprot);
        iprot.readListEnd();
        try {
            return new Subject(terms);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "terms": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    terms = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.subject.SubjectTerm.readAsStruct(iprot));
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
            return new Subject(terms);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Subject replaceTerms(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms) {
        return new Subject(terms);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("terms", getTerms()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTerms().size());
        for (final org.dressdiscover.api.models.subject.SubjectTerm _iter0 : getTerms()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.subject.Subject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("terms", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTerms().size());
        for (final org.dressdiscover.api.models.subject.SubjectTerm _iter0 : getTerms()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.subject.SubjectTerm> terms;
}
