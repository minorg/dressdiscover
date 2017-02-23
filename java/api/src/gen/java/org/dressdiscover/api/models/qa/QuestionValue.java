package org.dressdiscover.api.models.qa;

public final class QuestionValue implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            text = null;
            image = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaImage> absent();
        }

        public Builder(final QuestionValue other) {
            this.id = other.getId();
            this.text = other.getText();
            this.image = other.getImage();
        }

        protected QuestionValue _build(final org.dressdiscover.api.models.qa.QuestionValueId id, final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
            return new QuestionValue(id, text, image, DefaultConstructionValidator.getInstance());
        }

        public QuestionValue build() {
            return _build(id, text, image);
        }

        public final org.dressdiscover.api.models.qa.QuestionValueId getId() {
            return id;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> getImage() {
            return image;
        }

        public final String getText() {
            return text;
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
                    id = org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                text = iprot.readString();
                if (__list.getSize() > 2) {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot));
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
                    case "id": {
                        try {
                            id = org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "text": {
                        text = iprot.readString();
                        break;
                    }
                    case "image": {
                        image = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot));
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
            case ID: setId((org.dressdiscover.api.models.qa.QuestionValueId)value); return this;
            case TEXT: setText((String)value); return this;
            case IMAGE: setImage((org.dressdiscover.api.models.qa.QaImage)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.qa.QuestionValueId id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setIfPresent(final QuestionValue other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setText(other.getText());
            if (other.getImage().isPresent()) {
                setImage(other.getImage());
            }

            return this;
        }

        public Builder setImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
            this.image = DefaultConstructionValidator.getInstance().validateImage(image);
            return this;
        }

        public Builder setImage(@javax.annotation.Nullable final org.dressdiscover.api.models.qa.QaImage image) {
            return setImage(com.google.common.base.Optional.fromNullable(image));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
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
            case ID: return unsetId();
            case TEXT: return unsetText();
            case IMAGE: return unsetImage();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetImage() {
            this.image = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaImage> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private org.dressdiscover.api.models.qa.QuestionValueId id;
        private String text;
        private com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QuestionValue> {
        @Override
        public QuestionValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QuestionValue.readAs(iprot, type);
        }

        @Override
        public QuestionValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionValue.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QuestionValue readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionValue.readAsList(iprot);
        }

        @Override
        public QuestionValue readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionValue.readAsStruct(iprot);
        }

        @Override
        public QuestionValue readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionValue.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionValueId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "text", org.thryft.protocol.Type.STRING),
        IMAGE("image", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaImage>() {}, false, 0, "image", org.thryft.protocol.Type.STRUCT);

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
            case "id": return ID;
            case "text": return TEXT;
            case "image": return IMAGE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "text": return TEXT;
            case "image": return IMAGE;
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
        public org.dressdiscover.api.models.qa.QuestionValueId validateId(final org.dressdiscover.api.models.qa.QuestionValueId id) throws ExceptionT;

        public String validateText(final String text) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) throws ExceptionT;
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
        public org.dressdiscover.api.models.qa.QuestionValueId validateId(final org.dressdiscover.api.models.qa.QuestionValueId id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionValue: id is null");
            }
            return id;
        }

        @Override
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionValue: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QuestionValue: text is less than min length 1");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QuestionValue: text is blank: '%s' (length=%d)", text, __strLen));
                }
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) throws RuntimeException {
            if (image == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionValue: image is null");
            }
            if (!image.isPresent()) {
                return image;
            }
            return image;
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
        public org.dressdiscover.api.models.qa.QuestionValueId validateId(final org.dressdiscover.api.models.qa.QuestionValueId id) {
            return id;
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
            return image;
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
        public org.dressdiscover.api.models.qa.QuestionValueId validateId(final org.dressdiscover.api.models.qa.QuestionValueId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.qa.QuestionValue: id is null");
            }
            return id;
        }

        @Override
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.qa.QuestionValue: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.qa.QuestionValue: text is less than min length 1");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, String.format("org.dressdiscover.api.models.qa.QuestionValue: text is blank: '%s' (length=%d)", text, __strLen));
                }
            }
            return text;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) throws org.thryft.protocol.InputProtocolException {
            if (image == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGE, "org.dressdiscover.api.models.qa.QuestionValue: image is null");
            }
            if (!image.isPresent()) {
                return image;
            }
            return image;
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
        public org.dressdiscover.api.models.qa.QuestionValueId validateId(final org.dressdiscover.api.models.qa.QuestionValueId id) {
            return id;
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
            return image;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QuestionValue(final QuestionValue other) {
        this(other.getId(), other.getText(), other.getImage(), NopConstructionValidator.getInstance());
    }

    protected QuestionValue(final org.dressdiscover.api.models.qa.QuestionValueId id, final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image, ConstructionValidator validator) {
        this.id = validator.validateId(id);
        this.text = validator.validateText(text);
        this.image = validator.validateImage(image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QuestionValue other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QuestionValue> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static QuestionValue create(final org.dressdiscover.api.models.qa.QuestionValueId id, final String text) {
        return new QuestionValue(id, text, com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaImage> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static QuestionValue create(final org.dressdiscover.api.models.qa.QuestionValueId id, final String text, final @javax.annotation.Nullable org.dressdiscover.api.models.qa.QaImage image) {
        return new QuestionValue(id, text, com.google.common.base.Optional.fromNullable(image), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static QuestionValue create(final org.dressdiscover.api.models.qa.QuestionValueId id, final String text, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
        return new QuestionValue(id, text, image, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QuestionValue)) {
            return false;
        }

        final QuestionValue other = (QuestionValue)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(((getImage().isPresent() && other.getImage().isPresent()) ? (getImage().get().equals(other.getImage().get())) : (!getImage().isPresent() && !other.getImage().isPresent())))) {
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
        case ID: return getId();
        case TEXT: return getText();
        case IMAGE: return getImage();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.qa.QuestionValueId getId() {
        return id;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> getImage() {
        return image;
    }

    public final String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        if (getImage().isPresent()) {
            hashCode = 31 * hashCode + getImage().get().hashCode();
        }
        return hashCode;
    }

    public static QuestionValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QuestionValue readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionValueId id = null;
        String text = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaImage> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            text = iprot.readString();
            if (__list.getSize() > 2) {
                image = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QuestionValue(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateImage(image), NopConstructionValidator.getInstance());
    }

    public static QuestionValue readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionValue readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionValueId id = null;
        String text = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaImage> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "id": {
                    try {
                        id = org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "text": {
                    text = iprot.readString();
                    break;
                }
                case "image": {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot));
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
        return new QuestionValue(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateImage(image), NopConstructionValidator.getInstance());
    }

    public QuestionValue replaceId(final org.dressdiscover.api.models.qa.QuestionValueId id) {
        return new QuestionValue(DefaultConstructionValidator.getInstance().validateId(id), this.text, this.image, NopConstructionValidator.getInstance());
    }

    public QuestionValue replaceImage(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image) {
        return new QuestionValue(this.id, this.text, DefaultConstructionValidator.getInstance().validateImage(image), NopConstructionValidator.getInstance());
    }

    public QuestionValue replaceImage(final org.dressdiscover.api.models.qa.QaImage image) {
        return replaceImage(com.google.common.base.Optional.fromNullable(image));
    }

    public QuestionValue replaceText(final String text) {
        return new QuestionValue(this.id, DefaultConstructionValidator.getInstance().validateText(text), this.image, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("text", getText()).add("image", getImage().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getId().toString());

        oprot.writeString(getText());

        if (getImage().isPresent()) {
            getImage().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QuestionValue");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getImage().isPresent()) {
            oprot.writeFieldBegin("image", org.thryft.protocol.Type.STRUCT, (short)0);
            getImage().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.qa.QuestionValueId id;

    private final String text;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaImage> image;
}
