package org.dressdiscover.api.vocabularies.vra_core.subject;

/**
 * VRA Core 4.0 subject element
 */
public final class Subject implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Subject> {
        public Builder() {
            terms = null;
        }

        public Builder(final Subject other) {
            this.terms = other.getTerms();
        }

        protected Subject _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
            return new Subject(terms);
        }

        public Subject build() {
            Validator.validate(terms);

            return _build(terms);
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> getTerms() {
            return terms;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                try {
                    this.setTerms((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TERMS, e.getCause());
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
                    case "terms": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                try {
                                    this.setTerms((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TERMS, e.getCause());
                                }
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
            case TERMS: setTerms((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Subject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTerms(other.getTerms());

            return this;
        }

        public Builder setTerms(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
            Validator.validateTerms(terms);
            this.terms = terms;
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

        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Subject> {
        @Override
        public Subject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsList(iprot);
        }

        @Override
        public Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsStruct(iprot);
        }

        @Override
        public Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Subject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERMS("terms", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm>>() {}, true, (short)1, "terms", "1:terms", org.thryft.protocol.Type.LIST);

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
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
            validateTerms(terms);
        }

        public static void validateTerms(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
            if (terms == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.subject.Subject: terms is missing");
            }
            if (terms.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.subject.Subject: terms: less than min length 1");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Subject(final Subject other) {
        this(other.getTerms());
    }

    /**
     * Total constructor
     */
    public Subject(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
        Validator.validate(terms);
        this.terms = terms;
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
        }
        if (!(otherObject instanceof Subject)) {
            return false;
        }

        final Subject other = (Subject)otherObject;

        if (!(getTerms().equals(other.getTerms()))) {
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
        case TERMS: return getTerms();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> getTerms() {
        return terms;
    }

    @Override
    public int hashCode() {
        return getTerms().hashCode();
    }

    public static Subject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Subject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Subject replaceTerms(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms) {
        Validator.validateTerms(terms);
        return new Subject(terms);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("terms", getTerms()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.subject.Subject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTerms().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm _iter0 : getTerms()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTermsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeTermsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TERMS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTerms().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm _iter0 : getTerms()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm> terms;
}
