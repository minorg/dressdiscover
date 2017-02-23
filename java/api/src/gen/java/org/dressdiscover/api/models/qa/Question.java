package org.dressdiscover.api.models.qa;

public final class Question implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            text = null;
            type_ = null;
            valueRange = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueRange> absent();
            values = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> absent();
        }

        public Builder(final Question other) {
            this.id = other.getId();
            this.text = other.getText();
            this.type_ = other.getType_();
            this.valueRange = other.getValueRange();
            this.values = other.getValues();
        }

        protected Question _build(final org.dressdiscover.api.models.qa.QuestionId id, final String text, final org.dressdiscover.api.models.qa.QuestionType type_, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
            return new Question(id, text, type_, valueRange, values, DefaultConstructionValidator.getInstance());
        }

        public Question build() {
            return _build(id, text, type_, valueRange, values);
        }

        public final org.dressdiscover.api.models.qa.QuestionId getId() {
            return id;
        }

        public final String getText() {
            return text;
        }

        public final org.dressdiscover.api.models.qa.QuestionType getType_() {
            return type_;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> getValueRange() {
            return valueRange;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> getValues() {
            return values;
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
                    id = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                text = iprot.readString();
                type_ = iprot.readEnum(org.dressdiscover.api.models.qa.QuestionType.class);
                if (__list.getSize() > 3) {
                    valueRange = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueRange.readAsStruct(iprot));
                }
                if (__list.getSize() > 4) {
                    try {
                        values = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionValue.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
                    }
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
                            id = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "text": {
                        text = iprot.readString();
                        break;
                    }
                    case "type_": {
                        type_ = iprot.readEnum(org.dressdiscover.api.models.qa.QuestionType.class);
                        break;
                    }
                    case "value_range": {
                        valueRange = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueRange.readAsStruct(iprot));
                        break;
                    }
                    case "values": {
                        try {
                            values = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionValue.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
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
            case ID: setId((org.dressdiscover.api.models.qa.QuestionId)value); return this;
            case TEXT: setText((String)value); return this;
            case TYPE_: setType_((org.dressdiscover.api.models.qa.QuestionType)value); return this;
            case VALUE_RANGE: setValueRange((org.dressdiscover.api.models.qa.QuestionValueRange)value); return this;
            case VALUES: setValues((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.qa.QuestionId id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setIfPresent(final Question other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setText(other.getText());
            setType_(other.getType_());
            if (other.getValueRange().isPresent()) {
                setValueRange(other.getValueRange());
            }
            if (other.getValues().isPresent()) {
                setValues(other.getValues());
            }

            return this;
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setType_(final org.dressdiscover.api.models.qa.QuestionType type_) {
            this.type_ = DefaultConstructionValidator.getInstance().validateType_(type_);
            return this;
        }

        public Builder setValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) {
            this.valueRange = DefaultConstructionValidator.getInstance().validateValueRange(valueRange);
            return this;
        }

        public Builder setValueRange(@javax.annotation.Nullable final org.dressdiscover.api.models.qa.QuestionValueRange valueRange) {
            return setValueRange(com.google.common.base.Optional.fromNullable(valueRange));
        }

        public Builder setValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
            this.values = DefaultConstructionValidator.getInstance().validateValues(values);
            return this;
        }

        public Builder setValues(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> values) {
            return setValues(com.google.common.base.Optional.fromNullable(values));
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
            case TYPE_: return unsetType_();
            case VALUE_RANGE: return unsetValueRange();
            case VALUES: return unsetValues();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType_() {
            this.type_ = null;
            return this;
        }

        public Builder unsetValueRange() {
            this.valueRange = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueRange> absent();
            return this;
        }

        public Builder unsetValues() {
            this.values = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> absent();
            return this;
        }

        private org.dressdiscover.api.models.qa.QuestionId id;
        private String text;
        private org.dressdiscover.api.models.qa.QuestionType type_;
        private com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Question> {
        @Override
        public Question readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Question.readAs(iprot, type);
        }

        @Override
        public Question readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Question.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Question readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Question.readAsList(iprot);
        }

        @Override
        public Question readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Question.readAsStruct(iprot);
        }

        @Override
        public Question readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Question.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "text", org.thryft.protocol.Type.STRING),
        TYPE_("type_", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionType>() {}, true, 0, "type_", org.thryft.protocol.Type.STRING),
        VALUE_RANGE("valueRange", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionValueRange>() {}, false, 0, "value_range", org.thryft.protocol.Type.STRUCT),
        VALUES("values", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>>() {}, false, 0, "values", org.thryft.protocol.Type.LIST);

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
            case "type_": return TYPE_;
            case "valueRange": return VALUE_RANGE;
            case "values": return VALUES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "text": return TEXT;
            case "type_": return TYPE_;
            case "value_range": return VALUE_RANGE;
            case "values": return VALUES;
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
        public org.dressdiscover.api.models.qa.QuestionId validateId(final org.dressdiscover.api.models.qa.QuestionId id) throws ExceptionT;

        public String validateText(final String text) throws ExceptionT;

        public org.dressdiscover.api.models.qa.QuestionType validateType_(final org.dressdiscover.api.models.qa.QuestionType type_) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> validateValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> validateValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) throws ExceptionT;
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
        public org.dressdiscover.api.models.qa.QuestionId validateId(final org.dressdiscover.api.models.qa.QuestionId id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Question: id is null");
            }
            return id;
        }

        @Override
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Question: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.Question: text is less than min length 1");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.Question: text is blank: '%s' (length=%d)", text, __strLen));
                }
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionType validateType_(final org.dressdiscover.api.models.qa.QuestionType type_) throws RuntimeException {
            if (type_ == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Question: type_ is null");
            }
            return type_;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> validateValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) throws RuntimeException {
            if (valueRange == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Question: valueRange is null");
            }
            if (!valueRange.isPresent()) {
                return valueRange;
            }
            return valueRange;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> validateValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) throws RuntimeException {
            if (values == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Question: values is null");
            }
            if (!values.isPresent()) {
                return values;
            }
            if (values.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.Question: values is less than min length 1");
            }
            return values;
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
        public org.dressdiscover.api.models.qa.QuestionId validateId(final org.dressdiscover.api.models.qa.QuestionId id) {
            return id;
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionType validateType_(final org.dressdiscover.api.models.qa.QuestionType type_) {
            return type_;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> validateValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) {
            return valueRange;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> validateValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
            return values;
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
        public org.dressdiscover.api.models.qa.QuestionId validateId(final org.dressdiscover.api.models.qa.QuestionId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.qa.Question: id is null");
            }
            return id;
        }

        @Override
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.qa.Question: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.qa.Question: text is less than min length 1");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, String.format("org.dressdiscover.api.models.qa.Question: text is blank: '%s' (length=%d)", text, __strLen));
                }
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionType validateType_(final org.dressdiscover.api.models.qa.QuestionType type_) throws org.thryft.protocol.InputProtocolException {
            if (type_ == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE_, "org.dressdiscover.api.models.qa.Question: type_ is null");
            }
            return type_;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> validateValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) throws org.thryft.protocol.InputProtocolException {
            if (valueRange == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUE_RANGE, "org.dressdiscover.api.models.qa.Question: valueRange is null");
            }
            if (!valueRange.isPresent()) {
                return valueRange;
            }
            return valueRange;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> validateValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) throws org.thryft.protocol.InputProtocolException {
            if (values == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUES, "org.dressdiscover.api.models.qa.Question: values is null");
            }
            if (!values.isPresent()) {
                return values;
            }
            if (values.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, "org.dressdiscover.api.models.qa.Question: values is less than min length 1");
            }
            return values;
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
        public org.dressdiscover.api.models.qa.QuestionId validateId(final org.dressdiscover.api.models.qa.QuestionId id) {
            return id;
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionType validateType_(final org.dressdiscover.api.models.qa.QuestionType type_) {
            return type_;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> validateValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) {
            return valueRange;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> validateValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
            return values;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Question(final Question other) {
        this(other.getId(), other.getText(), other.getType_(), other.getValueRange(), other.getValues(), NopConstructionValidator.getInstance());
    }

    protected Question(final org.dressdiscover.api.models.qa.QuestionId id, final String text, final org.dressdiscover.api.models.qa.QuestionType type_, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values, ConstructionValidator validator) {
        this.id = validator.validateId(id);
        this.text = validator.validateText(text);
        this.type_ = validator.validateType_(type_);
        this.valueRange = validator.validateValueRange(valueRange);
        this.values = validator.validateValues(values);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Question other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Question> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Question create(final org.dressdiscover.api.models.qa.QuestionId id, final String text, final org.dressdiscover.api.models.qa.QuestionType type_) {
        return new Question(id, text, type_, com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueRange> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Question create(final org.dressdiscover.api.models.qa.QuestionId id, final String text, final org.dressdiscover.api.models.qa.QuestionType type_, final @javax.annotation.Nullable org.dressdiscover.api.models.qa.QuestionValueRange valueRange, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> values) {
        return new Question(id, text, type_, com.google.common.base.Optional.fromNullable(valueRange), com.google.common.base.Optional.fromNullable(values), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Question create(final org.dressdiscover.api.models.qa.QuestionId id, final String text, final org.dressdiscover.api.models.qa.QuestionType type_, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
        return new Question(id, text, type_, valueRange, values, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Question)) {
            return false;
        }

        final Question other = (Question)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType_().equals(other.getType_()))) {
            return false;
        }

        if (!(((getValueRange().isPresent() && other.getValueRange().isPresent()) ? (getValueRange().get().equals(other.getValueRange().get())) : (!getValueRange().isPresent() && !other.getValueRange().isPresent())))) {
            return false;
        }

        if (!(((getValues().isPresent() && other.getValues().isPresent()) ? (getValues().get().equals(other.getValues().get())) : (!getValues().isPresent() && !other.getValues().isPresent())))) {
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
        case TYPE_: return getType_();
        case VALUE_RANGE: return getValueRange();
        case VALUES: return getValues();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.qa.QuestionId getId() {
        return id;
    }

    public final String getText() {
        return text;
    }

    public final org.dressdiscover.api.models.qa.QuestionType getType_() {
        return type_;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> getValueRange() {
        return valueRange;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> getValues() {
        return values;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType_().ordinal();
        if (getValueRange().isPresent()) {
            hashCode = 31 * hashCode + getValueRange().get().hashCode();
        }
        if (getValues().isPresent()) {
            hashCode = 31 * hashCode + getValues().get().hashCode();
        }
        return hashCode;
    }

    public static Question readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Question readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Question readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionId id = null;
        String text = null;
        org.dressdiscover.api.models.qa.QuestionType type_ = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueRange> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            text = iprot.readString();
            type_ = iprot.readEnum(org.dressdiscover.api.models.qa.QuestionType.class);
            if (__list.getSize() > 3) {
                valueRange = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueRange.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                try {
                    values = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionValue.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Question(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType_(type_), DefaultReadValidator.getInstance().validateValueRange(valueRange), DefaultReadValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    public static Question readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Question readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionId id = null;
        String text = null;
        org.dressdiscover.api.models.qa.QuestionType type_ = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueRange> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> absent();

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
                        id = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "text": {
                    text = iprot.readString();
                    break;
                }
                case "type_": {
                    type_ = iprot.readEnum(org.dressdiscover.api.models.qa.QuestionType.class);
                    break;
                }
                case "value_range": {
                    valueRange = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueRange.readAsStruct(iprot));
                    break;
                }
                case "values": {
                    try {
                        values = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionValue.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
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
        return new Question(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType_(type_), DefaultReadValidator.getInstance().validateValueRange(valueRange), DefaultReadValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    public Question replaceId(final org.dressdiscover.api.models.qa.QuestionId id) {
        return new Question(DefaultConstructionValidator.getInstance().validateId(id), this.text, this.type_, this.valueRange, this.values, NopConstructionValidator.getInstance());
    }

    public Question replaceText(final String text) {
        return new Question(this.id, DefaultConstructionValidator.getInstance().validateText(text), this.type_, this.valueRange, this.values, NopConstructionValidator.getInstance());
    }

    public Question replaceType_(final org.dressdiscover.api.models.qa.QuestionType type_) {
        return new Question(this.id, this.text, DefaultConstructionValidator.getInstance().validateType_(type_), this.valueRange, this.values, NopConstructionValidator.getInstance());
    }

    public Question replaceValueRange(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange) {
        return new Question(this.id, this.text, this.type_, DefaultConstructionValidator.getInstance().validateValueRange(valueRange), this.values, NopConstructionValidator.getInstance());
    }

    public Question replaceValueRange(final org.dressdiscover.api.models.qa.QuestionValueRange valueRange) {
        return replaceValueRange(com.google.common.base.Optional.fromNullable(valueRange));
    }

    public Question replaceValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values) {
        return new Question(this.id, this.text, this.type_, this.valueRange, DefaultConstructionValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    public Question replaceValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue> values) {
        return replaceValues(com.google.common.base.Optional.fromNullable(values));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("text", getText()).add("type_", getType_()).add("value_range", getValueRange().orNull()).add("values", getValues().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        oprot.writeString(getId().toString());

        oprot.writeString(getText());

        oprot.writeEnum(getType_());

        if (getValueRange().isPresent()) {
            getValueRange().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getValues().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getValues().get().size());
            for (final org.dressdiscover.api.models.qa.QuestionValue _iter0 : getValues().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.Question");
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

        oprot.writeFieldBegin("type_", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeEnum(getType_());
        oprot.writeFieldEnd();

        if (getValueRange().isPresent()) {
            oprot.writeFieldBegin("value_range", org.thryft.protocol.Type.STRUCT, (short)0);
            getValueRange().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getValues().isPresent()) {
            oprot.writeFieldBegin("values", org.thryft.protocol.Type.LIST, (short)0);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getValues().get().size());
            for (final org.dressdiscover.api.models.qa.QuestionValue _iter0 : getValues().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.qa.QuestionId id;

    private final String text;

    private final org.dressdiscover.api.models.qa.QuestionType type_;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueRange> valueRange;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionValue>> values;
}
