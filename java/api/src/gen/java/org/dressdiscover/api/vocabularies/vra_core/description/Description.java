package org.dressdiscover.api.vocabularies.vra_core.description;

/**
 * VRA Core 4.0 description element
 */
public final class Description implements org.thryft.Struct, org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
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
            return new Description(text, source, type, DefaultConstructionValidator.getInstance());
        }

        public Description build() {
            return _build(text, source, type);
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
                    source = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    type = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.class));
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
                    case "source": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            source = com.google.common.base.Optional.of(iprot.readString());
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            type = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.class));
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
            this.source = DefaultConstructionValidator.getInstance().validateSource(source);
            return this;
        }

        public Builder setSource(@javax.annotation.Nullable final String source) {
            return setSource(com.google.common.base.Optional.fromNullable(source));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
            return this;
        }

        public Builder setType(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
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

        private String text;
        private com.google.common.base.Optional<String> source;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Description> {
        @Override
        public Description readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Description.readAs(iprot, type);
        }

        @Override
        public Description readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Description.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Description readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsList(iprot);
        }

        @Override
        public Description readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsStruct(iprot);
        }

        @Override
        public Description readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Description.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        SOURCE("source", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "source", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType>() {}, false, 3, "type", org.thryft.protocol.Type.STRING);

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
        public String validateText(final String text) throws ExceptionT;

        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) throws ExceptionT;
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
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.description.Description: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.description.Description: text is less than min length 1");
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws RuntimeException {
            if (source == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.description.Description: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.description.Description: source is less than min length 1");
            }
            return source;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.description.Description: type is null");
            }
            if (!type.isPresent()) {
                return type;
            }
            return type;
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
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) {
            return source;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            return type;
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
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.description.Description: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.description.Description: text is less than min length 1");
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) throws org.thryft.protocol.InputProtocolException {
            if (source == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.vra_core.description.Description: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.vra_core.description.Description: source is less than min length 1");
            }
            return source;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.description.Description: type is null");
            }
            if (!type.isPresent()) {
                return type;
            }
            return type;
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
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<String> validateSource(final com.google.common.base.Optional<String> source) {
            return source;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> validateType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
            return type;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Description(final Description other) {
        this(other.getText(), other.getSource(), other.getType(), NopConstructionValidator.getInstance());
    }

    protected Description(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type, ConstructionValidator validator) {
        this.text = validator.validateText(text);
        this.source = validator.validateSource(source);
        this.type = validator.validateType(type);
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

    /**
     * Required factory method
     */
    public static Description create(final String text) {
        return new Description(text, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Description create(final String text, final @javax.annotation.Nullable String source, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
        return new Description(text, com.google.common.base.Optional.fromNullable(source), com.google.common.base.Optional.fromNullable(type), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Description create(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
        return new Description(text, source, type, DefaultConstructionValidator.getInstance());
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

    public static Description readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Description readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Description readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            if (__list.getSize() > 1) {
                source = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                type = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.class));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Description(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateSource(source), DefaultReadValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public static Description readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Description readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> absent();

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
                case "source": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        source = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        type = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType.class));
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
        return new Description(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateSource(source), DefaultReadValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public Description replaceSource(final com.google.common.base.Optional<String> source) {
        return new Description(this.text, DefaultConstructionValidator.getInstance().validateSource(source), this.type, NopConstructionValidator.getInstance());
    }

    public Description replaceSource(final String source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public Description replaceText(final String text) {
        return new Description(DefaultConstructionValidator.getInstance().validateText(text), this.source, this.type, NopConstructionValidator.getInstance());
    }

    public Description replaceType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type) {
        return new Description(this.text, this.source, DefaultConstructionValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public Description replaceType(final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType type) {
        return replaceType(com.google.common.base.Optional.fromNullable(type));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("source", getSource().orNull()).add("type", getType().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.description.Description");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getSource().isPresent()) {
            oprot.writeFieldBegin("source", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getSource().get());
            oprot.writeFieldEnd();
        }

        if (getType().isPresent()) {
            oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeEnum(getType().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final com.google.common.base.Optional<String> source;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType> type;
}
