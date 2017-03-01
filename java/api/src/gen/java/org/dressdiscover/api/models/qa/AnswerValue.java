package org.dressdiscover.api.models.qa;

public final class AnswerValue implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            valueColor = com.google.common.base.Optional.<String> absent();
            valueI32 = com.google.common.base.Optional.<Integer> absent();
            valueId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueId> absent();
            valueString = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final AnswerValue other) {
            this.valueColor = other.getValueColor();
            this.valueI32 = other.getValueI32();
            this.valueId = other.getValueId();
            this.valueString = other.getValueString();
        }

        protected AnswerValue _build(final com.google.common.base.Optional<String> valueColor, final com.google.common.base.Optional<Integer> valueI32, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId, final com.google.common.base.Optional<String> valueString) {
            return new AnswerValue(valueColor, valueI32, valueId, valueString, DefaultConstructionValidator.getInstance());
        }

        public AnswerValue build() {
            return _build(valueColor, valueI32, valueId, valueString);
        }

        /**
         * 24-bit RGB color as a hex string: FF0000, no leading #
         */
        public final com.google.common.base.Optional<String> getValueColor() {
            return valueColor;
        }

        public final com.google.common.base.Optional<Integer> getValueI32() {
            return valueI32;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> getValueId() {
            return valueId;
        }

        public final com.google.common.base.Optional<String> getValueString() {
            return valueString;
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
                if (__list.getSize() > 0) {
                    valueColor = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 1) {
                    try {
                        valueI32 = com.google.common.base.Optional.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        valueId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString()));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 3) {
                    valueString = com.google.common.base.Optional.of(iprot.readString());
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
                    case "value_color": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            valueColor = com.google.common.base.Optional.of(iprot.readString());
                        }
                        break;
                    }
                    case "value_i32": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                valueI32 = com.google.common.base.Optional.of(iprot.readI32());
                            } catch (final NumberFormatException e) {
                            }
                        }
                        break;
                    }
                    case "value_id": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                valueId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString()));
                            } catch (final IllegalArgumentException e) {
                            }
                        }
                        break;
                    }
                    case "value_string": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            valueString = com.google.common.base.Optional.of(iprot.readString());
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
            case VALUE_COLOR: setValueColor((String)value); return this;
            case VALUE_I32: setValueI32((Integer)value); return this;
            case VALUE_ID: setValueId((org.dressdiscover.api.models.qa.QuestionValueId)value); return this;
            case VALUE_STRING: setValueString((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final AnswerValue other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getValueColor().isPresent()) {
                setValueColor(other.getValueColor());
            }
            if (other.getValueI32().isPresent()) {
                setValueI32(other.getValueI32());
            }
            if (other.getValueId().isPresent()) {
                setValueId(other.getValueId());
            }
            if (other.getValueString().isPresent()) {
                setValueString(other.getValueString());
            }

            return this;
        }

        public Builder setValueColor(final com.google.common.base.Optional<String> valueColor) {
            this.valueColor = DefaultConstructionValidator.getInstance().validateValueColor(valueColor);
            return this;
        }

        public Builder setValueColor(@javax.annotation.Nullable final String valueColor) {
            return setValueColor(com.google.common.base.Optional.fromNullable(valueColor));
        }

        public Builder setValueI32(final com.google.common.base.Optional<Integer> valueI32) {
            this.valueI32 = DefaultConstructionValidator.getInstance().validateValueI32(valueI32);
            return this;
        }

        public Builder setValueI32(@javax.annotation.Nullable final Integer valueI32) {
            return setValueI32(com.google.common.base.Optional.fromNullable(valueI32));
        }

        public Builder setValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) {
            this.valueId = DefaultConstructionValidator.getInstance().validateValueId(valueId);
            return this;
        }

        public Builder setValueId(@javax.annotation.Nullable final org.dressdiscover.api.models.qa.QuestionValueId valueId) {
            return setValueId(com.google.common.base.Optional.fromNullable(valueId));
        }

        public Builder setValueString(final com.google.common.base.Optional<String> valueString) {
            this.valueString = DefaultConstructionValidator.getInstance().validateValueString(valueString);
            return this;
        }

        public Builder setValueString(@javax.annotation.Nullable final String valueString) {
            return setValueString(com.google.common.base.Optional.fromNullable(valueString));
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
            case VALUE_COLOR: return unsetValueColor();
            case VALUE_I32: return unsetValueI32();
            case VALUE_ID: return unsetValueId();
            case VALUE_STRING: return unsetValueString();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetValueColor() {
            this.valueColor = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetValueI32() {
            this.valueI32 = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        public Builder unsetValueId() {
            this.valueId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueId> absent();
            return this;
        }

        public Builder unsetValueString() {
            this.valueString = com.google.common.base.Optional.<String> absent();
            return this;
        }

        /**
         * 24-bit RGB color as a hex string: FF0000, no leading #
         */
        private com.google.common.base.Optional<String> valueColor;
        private com.google.common.base.Optional<Integer> valueI32;
        private com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId;
        private com.google.common.base.Optional<String> valueString;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<AnswerValue> {
        @Override
        public AnswerValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return AnswerValue.readAs(iprot, type);
        }

        @Override
        public AnswerValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AnswerValue.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public AnswerValue readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AnswerValue.readAsList(iprot);
        }

        @Override
        public AnswerValue readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return AnswerValue.readAsStruct(iprot);
        }

        @Override
        public AnswerValue readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return AnswerValue.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        VALUE_COLOR("valueColor", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "value_color", org.thryft.protocol.Type.STRING),
        VALUE_I32("valueI32", new com.google.common.reflect.TypeToken<Integer>() {}, false, 1, "value_i32", org.thryft.protocol.Type.I32),
        VALUE_ID("valueId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionValueId>() {}, false, 2, "value_id", org.thryft.protocol.Type.STRING),
        VALUE_STRING("valueString", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "value_string", org.thryft.protocol.Type.STRING);

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
            case "valueColor": return VALUE_COLOR;
            case "valueI32": return VALUE_I32;
            case "valueId": return VALUE_ID;
            case "valueString": return VALUE_STRING;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "value_color": return VALUE_COLOR;
            case "value_i32": return VALUE_I32;
            case "value_id": return VALUE_ID;
            case "value_string": return VALUE_STRING;
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
        public com.google.common.base.Optional<String> validateValueColor(final com.google.common.base.Optional<String> valueColor) throws ExceptionT;

        public com.google.common.base.Optional<Integer> validateValueI32(final com.google.common.base.Optional<Integer> valueI32) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> validateValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) throws ExceptionT;

        public com.google.common.base.Optional<String> validateValueString(final com.google.common.base.Optional<String> valueString) throws ExceptionT;
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
        public com.google.common.base.Optional<String> validateValueColor(final com.google.common.base.Optional<String> valueColor) throws RuntimeException {
            if (valueColor == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.AnswerValue: valueColor is null");
            }
            if (!valueColor.isPresent()) {
                return valueColor;
            }
            if (valueColor.get().length() < 6) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.AnswerValue: valueColor is less than min length 6");
            }
            {
                final int __strLen = valueColor.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(valueColor.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.AnswerValue: valueColor is blank: '%s' (length=%d)", valueColor.get(), __strLen));
                }
            }
            if (valueColor.get().length() > 6) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.AnswerValue: valueColor is greater than max length 6");
            }
            return valueColor;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateValueI32(final com.google.common.base.Optional<Integer> valueI32) throws RuntimeException {
            if (!valueI32.isPresent()) {
                return valueI32;
            }
            return valueI32;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> validateValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) throws RuntimeException {
            if (valueId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.AnswerValue: valueId is null");
            }
            if (!valueId.isPresent()) {
                return valueId;
            }
            return valueId;
        }

        @Override
        public com.google.common.base.Optional<String> validateValueString(final com.google.common.base.Optional<String> valueString) throws RuntimeException {
            if (valueString == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.AnswerValue: valueString is null");
            }
            if (!valueString.isPresent()) {
                return valueString;
            }
            if (valueString.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.AnswerValue: valueString is less than min length 1");
            }
            {
                final int __strLen = valueString.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(valueString.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.AnswerValue: valueString is blank: '%s' (length=%d)", valueString.get(), __strLen));
                }
            }
            return valueString;
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
        public com.google.common.base.Optional<String> validateValueColor(final com.google.common.base.Optional<String> valueColor) {
            return valueColor;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateValueI32(final com.google.common.base.Optional<Integer> valueI32) {
            return valueI32;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> validateValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) {
            return valueId;
        }

        @Override
        public com.google.common.base.Optional<String> validateValueString(final com.google.common.base.Optional<String> valueString) {
            return valueString;
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
        public com.google.common.base.Optional<String> validateValueColor(final com.google.common.base.Optional<String> valueColor) throws org.thryft.protocol.InputProtocolException {
            if (valueColor == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUE_COLOR, "org.dressdiscover.api.models.qa.AnswerValue: valueColor is null");
            }
            if (!valueColor.isPresent()) {
                return valueColor;
            }
            if (valueColor.get().length() < 6) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUE_COLOR, "org.dressdiscover.api.models.qa.AnswerValue: valueColor is less than min length 6");
            }
            {
                final int __strLen = valueColor.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(valueColor.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUE_COLOR, String.format("org.dressdiscover.api.models.qa.AnswerValue: valueColor is blank: '%s' (length=%d)", valueColor.get(), __strLen));
                }
            }
            if (valueColor.get().length() > 6) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUE_COLOR, "org.dressdiscover.api.models.qa.AnswerValue: valueColor is greater than max length 6");
            }
            return valueColor;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateValueI32(final com.google.common.base.Optional<Integer> valueI32) throws org.thryft.protocol.InputProtocolException {
            if (!valueI32.isPresent()) {
                return valueI32;
            }
            return valueI32;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> validateValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) throws org.thryft.protocol.InputProtocolException {
            if (valueId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUE_ID, "org.dressdiscover.api.models.qa.AnswerValue: valueId is null");
            }
            if (!valueId.isPresent()) {
                return valueId;
            }
            return valueId;
        }

        @Override
        public com.google.common.base.Optional<String> validateValueString(final com.google.common.base.Optional<String> valueString) throws org.thryft.protocol.InputProtocolException {
            if (valueString == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUE_STRING, "org.dressdiscover.api.models.qa.AnswerValue: valueString is null");
            }
            if (!valueString.isPresent()) {
                return valueString;
            }
            if (valueString.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUE_STRING, "org.dressdiscover.api.models.qa.AnswerValue: valueString is less than min length 1");
            }
            {
                final int __strLen = valueString.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(valueString.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUE_STRING, String.format("org.dressdiscover.api.models.qa.AnswerValue: valueString is blank: '%s' (length=%d)", valueString.get(), __strLen));
                }
            }
            return valueString;
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
        public com.google.common.base.Optional<String> validateValueColor(final com.google.common.base.Optional<String> valueColor) {
            return valueColor;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateValueI32(final com.google.common.base.Optional<Integer> valueI32) {
            return valueI32;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> validateValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) {
            return valueId;
        }

        @Override
        public com.google.common.base.Optional<String> validateValueString(final com.google.common.base.Optional<String> valueString) {
            return valueString;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public AnswerValue() {
        valueColor = com.google.common.base.Optional.<String> absent();
        valueI32 = com.google.common.base.Optional.<Integer> absent();
        valueId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueId> absent();
        valueString = com.google.common.base.Optional.<String> absent();
    }

    /**
     * Copy constructor
     */
    public AnswerValue(final AnswerValue other) {
        this(other.getValueColor(), other.getValueI32(), other.getValueId(), other.getValueString(), NopConstructionValidator.getInstance());
    }

    protected AnswerValue(final com.google.common.base.Optional<String> valueColor, final com.google.common.base.Optional<Integer> valueI32, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId, final com.google.common.base.Optional<String> valueString, ConstructionValidator validator) {
        this.valueColor = validator.validateValueColor(valueColor);
        this.valueI32 = validator.validateValueI32(valueI32);
        this.valueId = validator.validateValueId(valueId);
        this.valueString = validator.validateValueString(valueString);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final AnswerValue other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<AnswerValue> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    public static AnswerValue create() {
        return new AnswerValue();
    }

    /**
     * Total Nullable factory method
     */
    public static AnswerValue create(final @javax.annotation.Nullable String valueColor, final @javax.annotation.Nullable Integer valueI32, final @javax.annotation.Nullable org.dressdiscover.api.models.qa.QuestionValueId valueId, final @javax.annotation.Nullable String valueString) {
        return new AnswerValue(com.google.common.base.Optional.fromNullable(valueColor), com.google.common.base.Optional.fromNullable(valueI32), com.google.common.base.Optional.fromNullable(valueId), com.google.common.base.Optional.fromNullable(valueString), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static AnswerValue create(final com.google.common.base.Optional<String> valueColor, final com.google.common.base.Optional<Integer> valueI32, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId, final com.google.common.base.Optional<String> valueString) {
        return new AnswerValue(valueColor, valueI32, valueId, valueString, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof AnswerValue)) {
            return false;
        }

        final AnswerValue other = (AnswerValue)otherObject;

        if (!(((getValueColor().isPresent() && other.getValueColor().isPresent()) ? (getValueColor().get().equals(other.getValueColor().get())) : (!getValueColor().isPresent() && !other.getValueColor().isPresent())))) {
            return false;
        }

        if (!(((getValueI32().isPresent() && other.getValueI32().isPresent()) ? (getValueI32().get().intValue() == other.getValueI32().get().intValue()) : (!getValueI32().isPresent() && !other.getValueI32().isPresent())))) {
            return false;
        }

        if (!(((getValueId().isPresent() && other.getValueId().isPresent()) ? (getValueId().get().equals(other.getValueId().get())) : (!getValueId().isPresent() && !other.getValueId().isPresent())))) {
            return false;
        }

        if (!(((getValueString().isPresent() && other.getValueString().isPresent()) ? (getValueString().get().equals(other.getValueString().get())) : (!getValueString().isPresent() && !other.getValueString().isPresent())))) {
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
        case VALUE_COLOR: return getValueColor();
        case VALUE_I32: return getValueI32();
        case VALUE_ID: return getValueId();
        case VALUE_STRING: return getValueString();
        default:
            throw new IllegalStateException();
        }
    }

    /**
     * 24-bit RGB color as a hex string: FF0000, no leading #
     */
    public final com.google.common.base.Optional<String> getValueColor() {
        return valueColor;
    }

    public final com.google.common.base.Optional<Integer> getValueI32() {
        return valueI32;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> getValueId() {
        return valueId;
    }

    public final com.google.common.base.Optional<String> getValueString() {
        return valueString;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getValueColor().isPresent()) {
            hashCode = 31 * hashCode + getValueColor().get().hashCode();
        }
        if (getValueI32().isPresent()) {
            hashCode = 31 * hashCode + getValueI32().get().hashCode();
        }
        if (getValueId().isPresent()) {
            hashCode = 31 * hashCode + getValueId().get().hashCode();
        }
        if (getValueString().isPresent()) {
            hashCode = 31 * hashCode + getValueString().get().hashCode();
        }
        return hashCode;
    }

    public static AnswerValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static AnswerValue readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static AnswerValue readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> valueColor = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<Integer> valueI32 = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueId> absent();
        com.google.common.base.Optional<String> valueString = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                valueColor = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 1) {
                try {
                    valueI32 = com.google.common.base.Optional.of(iprot.readI32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 2) {
                try {
                    valueId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString()));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 3) {
                valueString = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new AnswerValue(DefaultReadValidator.getInstance().validateValueColor(valueColor), DefaultReadValidator.getInstance().validateValueI32(valueI32), DefaultReadValidator.getInstance().validateValueId(valueId), DefaultReadValidator.getInstance().validateValueString(valueString), NopConstructionValidator.getInstance());
    }

    public static AnswerValue readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static AnswerValue readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> valueColor = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<Integer> valueI32 = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QuestionValueId> absent();
        com.google.common.base.Optional<String> valueString = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "value_color": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        valueColor = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "value_i32": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            valueI32 = com.google.common.base.Optional.of(iprot.readI32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                case "value_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            valueId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QuestionValueId.parse(iprot.readString()));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "value_string": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        valueString = com.google.common.base.Optional.of(iprot.readString());
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
        return new AnswerValue(DefaultReadValidator.getInstance().validateValueColor(valueColor), DefaultReadValidator.getInstance().validateValueI32(valueI32), DefaultReadValidator.getInstance().validateValueId(valueId), DefaultReadValidator.getInstance().validateValueString(valueString), NopConstructionValidator.getInstance());
    }

    public AnswerValue replaceValueColor(final com.google.common.base.Optional<String> valueColor) {
        return new AnswerValue(DefaultConstructionValidator.getInstance().validateValueColor(valueColor), this.valueI32, this.valueId, this.valueString, NopConstructionValidator.getInstance());
    }

    public AnswerValue replaceValueColor(final String valueColor) {
        return replaceValueColor(com.google.common.base.Optional.fromNullable(valueColor));
    }

    public AnswerValue replaceValueI32(final com.google.common.base.Optional<Integer> valueI32) {
        return new AnswerValue(this.valueColor, DefaultConstructionValidator.getInstance().validateValueI32(valueI32), this.valueId, this.valueString, NopConstructionValidator.getInstance());
    }

    public AnswerValue replaceValueI32(final int valueI32) {
        return replaceValueI32(com.google.common.base.Optional.fromNullable(valueI32));
    }

    public AnswerValue replaceValueId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId) {
        return new AnswerValue(this.valueColor, this.valueI32, DefaultConstructionValidator.getInstance().validateValueId(valueId), this.valueString, NopConstructionValidator.getInstance());
    }

    public AnswerValue replaceValueId(final org.dressdiscover.api.models.qa.QuestionValueId valueId) {
        return replaceValueId(com.google.common.base.Optional.fromNullable(valueId));
    }

    public AnswerValue replaceValueString(final com.google.common.base.Optional<String> valueString) {
        return new AnswerValue(this.valueColor, this.valueI32, this.valueId, DefaultConstructionValidator.getInstance().validateValueString(valueString), NopConstructionValidator.getInstance());
    }

    public AnswerValue replaceValueString(final String valueString) {
        return replaceValueString(com.google.common.base.Optional.fromNullable(valueString));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("value_color", getValueColor().orNull()).add("value_i32", getValueI32().orNull()).add("value_id", getValueId().orNull()).add("value_string", getValueString().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        if (getValueColor().isPresent()) {
            oprot.writeString(getValueColor().get());
        } else {
            oprot.writeNull();
        }

        if (getValueI32().isPresent()) {
            oprot.writeI32(getValueI32().get());
        } else {
            oprot.writeNull();
        }

        if (getValueId().isPresent()) {
            oprot.writeString(getValueId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getValueString().isPresent()) {
            oprot.writeString(getValueString().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.AnswerValue");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getValueColor().isPresent()) {
            oprot.writeFieldBegin("value_color", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getValueColor().get());
            oprot.writeFieldEnd();
        }

        if (getValueI32().isPresent()) {
            oprot.writeFieldBegin("value_i32", org.thryft.protocol.Type.I32, (short)1);
            oprot.writeI32(getValueI32().get());
            oprot.writeFieldEnd();
        }

        if (getValueId().isPresent()) {
            oprot.writeFieldBegin("value_id", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getValueId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getValueString().isPresent()) {
            oprot.writeFieldBegin("value_string", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getValueString().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    /**
     * 24-bit RGB color as a hex string: FF0000, no leading #
     */
    private final com.google.common.base.Optional<String> valueColor;

    private final com.google.common.base.Optional<Integer> valueI32;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QuestionValueId> valueId;

    private final com.google.common.base.Optional<String> valueString;
}
