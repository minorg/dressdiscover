package org.dressdiscover.api.vocabularies.vra_core.description;

/**
 * VRA Core 4.0 description element
 */
public final class Description implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Description> {
        public Builder() {
            text = null;
            source = com.google.common.base.Optional.<String> absent();
            type = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent();
        }

        public Builder(final Description other) {
            this.text = other.getText();
            this.source = other.getSource();
            this.type = other.getType();
        }

        protected Description _build(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            return new Description(text, source, type);
        }

        public Description build() {
            Validator.validate(text, source, type);

            return _build(text, source, type);
        }

        public final com.google.common.base.Optional<String> getSource() {
            return source;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setText(iprot.readString());
                if (__list.getSize() > 1) {
                    this.setSource(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 2) {
                    this.setType(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.Factory.getInstance())));
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
                    case "text": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setText(iprot.readString());
                        }
                        break;
                    }
                    case "source": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setSource(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setType(com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.Factory.getInstance())));
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TEXT: setText((String)value); return this;
            case SOURCE: setSource((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Description other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            if (other.getSource().isPresent()) {
                setSource(other.getSource());
            }
            if (other.getType().isPresent()) {
                setType(other.getType());
            }

            return this;
        }

        public Builder setSource(final com.google.common.base.Optional<String> source) {
            Validator.validateSource(source);
            this.source = source;
            return this;
        }

        public Builder setSource(final @javax.annotation.Nullable String source) {
            return setSource(com.google.common.base.Optional.fromNullable(source));
        }

        public Builder setText(final String text) {
            Validator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            Validator.validateType(type);
            this.type = type;
            return this;
        }

        public Builder setType(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
            return setType(com.google.common.base.Optional.fromNullable(type));
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
            case SOURCE: return unsetSource();
            case TYPE: return unsetType();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetSource() {
            this.source = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType() {
            this.type = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent();
            return this;
        }

        private @javax.annotation.Nullable String text;
        private com.google.common.base.Optional<String> source;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Description> {
        @Override
        public Description readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsList(iprot);
        }

        @Override
        public Description readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsStruct(iprot);
        }

        @Override
        public Description readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", "1:text", org.thryft.protocol.Type.STRING),
        SOURCE("source", new com.google.common.reflect.TypeToken<String>() {}, false, (short)2, "source", "2:source", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType>() {}, false, (short)3, "type", "3:type", org.thryft.protocol.Type.STRING);

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
            case "source": return SOURCE;
            case "type": return TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "source": return SOURCE;
            case "type": return TYPE;
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
        public static void validate(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            validateText(text);
            validateSource(source);
            validateType(type);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.description.Description: text is missing");
            }
            if (text.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.description.Description: text: less than min length 1");
            }
        }

        public static void validateSource(final com.google.common.base.Optional<String> source) {
            if (source == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.description.Description: source is missing");
            }
            if (source.isPresent()) {
                if (source.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.description.Description: source: less than min length 1");
                }
            }
        }

        public static void validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.description.Description: type is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public Description(final Description other) {
        this(other.getText(), other.getSource(), other.getType());
    }

    /**
     * Required constructor
     */
    public Description(final String text) {
        this(text, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent());
    }

    /**
     * Total constructor
     */
    public Description(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
        Validator.validate(text, source, type);
        this.text = text;
        this.source = source;
        this.type = type;
    }

    /**
     * Total Nullable constructor
     */
    public Description(final String text, @javax.annotation.Nullable final String source, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
        this(text, com.google.common.base.Optional.fromNullable(source), com.google.common.base.Optional.fromNullable(type));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Description other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Description> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Description)) {
            return false;
        }

        final Description other = (Description)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(((getSource().isPresent() && other.getSource().isPresent()) ? (getSource().get().equals(other.getSource().get())) : (!getSource().isPresent() && !other.getSource().isPresent())))) {
            return false;
        }

        if (!(((getType().isPresent() && other.getType().isPresent()) ? (getType().get().equals(other.getType().get())) : (!getType().isPresent() && !other.getType().isPresent())))) {
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
        case SOURCE: return getSource();
        case TYPE: return getType();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getSource() {
        return source;
    }

    public final String getText() {
        return text;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        if (getSource().isPresent()) {
            hashCode = 31 * hashCode + getSource().get().hashCode();
        }
        if (getType().isPresent()) {
            hashCode = 31 * hashCode + getType().get().ordinal();
        }
        return hashCode;
    }

    public static Description readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Description readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Description readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Description replaceSource(final com.google.common.base.Optional<String> source) {
        Validator.validateSource(source);
        return new Description(this.text, source, this.type);
    }

    public Description replaceSource(@javax.annotation.Nullable final String source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public Description replaceText(final String text) {
        Validator.validateText(text);
        return new Description(text, this.source, this.type);
    }

    public Description replaceType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
        Validator.validateType(type);
        return new Description(this.text, this.source, type);
    }

    public Description replaceType(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
        return replaceType(com.google.common.base.Optional.fromNullable(type));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("source", getSource().orNull()).add("type", getType().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.description.Description");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getText());
        if (getSource().isPresent()) {
            oprot.writeString(getSource().get());
        } else {
            oprot.writeNull();
        }
        if (getType().isPresent()) {
            oprot.writeEnum(getType().get());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeSourceField(oprot);

        writeTypeField(oprot);

        oprot.writeFieldStop();
    }

    public void writeSourceField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSource().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SOURCE);
            oprot.writeString(getSource().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getType().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TYPE);
            oprot.writeEnum(getType().get());
            oprot.writeFieldEnd();
        }
    }

    private final String text;

    private final com.google.common.base.Optional<String> source;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type;
}
