package org.dressdiscover.api.models.qa;

public final class Answer implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            objectId = null;
            questionId = null;
            userId = null;
            values = null;
        }

        public Builder(final Answer other) {
            this.objectId = other.getObjectId();
            this.questionId = other.getQuestionId();
            this.userId = other.getUserId();
            this.values = other.getValues();
        }

        protected Answer _build(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionId questionId, final org.dressdiscover.api.models.qa.QaUserId userId, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
            return new Answer(objectId, questionId, userId, values, DefaultConstructionValidator.getInstance());
        }

        public Answer build() {
            return _build(objectId, questionId, userId, values);
        }

        public final org.dressdiscover.api.models.qa.QaObjectId getObjectId() {
            return objectId;
        }

        public final org.dressdiscover.api.models.qa.QuestionId getQuestionId() {
            return questionId;
        }

        public final org.dressdiscover.api.models.qa.QaUserId getUserId() {
            return userId;
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> getValues() {
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
                iprot.readListBegin();
                try {
                    objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                }
                try {
                    questionId = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_ID, e);
                }
                try {
                    userId = org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                }
                try {
                    values = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.AnswerValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.AnswerValue.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
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
                    case "object_id": {
                        try {
                            objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                        }
                        break;
                    }
                    case "question_id": {
                        try {
                            questionId = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_ID, e);
                        }
                        break;
                    }
                    case "user_id": {
                        try {
                            userId = org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                        }
                        break;
                    }
                    case "values": {
                        try {
                            values = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.AnswerValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.AnswerValue.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
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
            case OBJECT_ID: setObjectId((org.dressdiscover.api.models.qa.QaObjectId)value); return this;
            case QUESTION_ID: setQuestionId((org.dressdiscover.api.models.qa.QuestionId)value); return this;
            case USER_ID: setUserId((org.dressdiscover.api.models.qa.QaUserId)value); return this;
            case VALUES: setValues((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Answer other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setObjectId(other.getObjectId());
            setQuestionId(other.getQuestionId());
            setUserId(other.getUserId());
            setValues(other.getValues());

            return this;
        }

        public Builder setObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
            this.objectId = DefaultConstructionValidator.getInstance().validateObjectId(objectId);
            return this;
        }

        public Builder setQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) {
            this.questionId = DefaultConstructionValidator.getInstance().validateQuestionId(questionId);
            return this;
        }

        public Builder setUserId(final org.dressdiscover.api.models.qa.QaUserId userId) {
            this.userId = DefaultConstructionValidator.getInstance().validateUserId(userId);
            return this;
        }

        public Builder setValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
            this.values = DefaultConstructionValidator.getInstance().validateValues(values);
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
            case OBJECT_ID: return unsetObjectId();
            case QUESTION_ID: return unsetQuestionId();
            case USER_ID: return unsetUserId();
            case VALUES: return unsetValues();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetObjectId() {
            this.objectId = null;
            return this;
        }

        public Builder unsetQuestionId() {
            this.questionId = null;
            return this;
        }

        public Builder unsetUserId() {
            this.userId = null;
            return this;
        }

        public Builder unsetValues() {
            this.values = null;
            return this;
        }

        private org.dressdiscover.api.models.qa.QaObjectId objectId;
        private org.dressdiscover.api.models.qa.QuestionId questionId;
        private org.dressdiscover.api.models.qa.QaUserId userId;
        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Answer> {
        @Override
        public Answer readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Answer.readAs(iprot, type);
        }

        @Override
        public Answer readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Answer.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Answer readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Answer.readAsList(iprot);
        }

        @Override
        public Answer readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Answer.readAsStruct(iprot);
        }

        @Override
        public Answer readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Answer.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaObjectId>() {}, true, 0, "object_id", org.thryft.protocol.Type.STRING),
        QUESTION_ID("questionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionId>() {}, true, 0, "question_id", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaUserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING),
        VALUES("values", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>>() {}, true, 0, "values", org.thryft.protocol.Type.LIST);

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
            case "objectId": return OBJECT_ID;
            case "questionId": return QUESTION_ID;
            case "userId": return USER_ID;
            case "values": return VALUES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "object_id": return OBJECT_ID;
            case "question_id": return QUESTION_ID;
            case "user_id": return USER_ID;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) throws ExceptionT;

        public org.dressdiscover.api.models.qa.QuestionId validateQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) throws ExceptionT;

        public org.dressdiscover.api.models.qa.QaUserId validateUserId(final org.dressdiscover.api.models.qa.QaUserId userId) throws ExceptionT;

        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> validateValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) throws ExceptionT;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) throws RuntimeException {
            if (objectId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Answer: objectId is null");
            }
            return objectId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionId validateQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) throws RuntimeException {
            if (questionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Answer: questionId is null");
            }
            return questionId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaUserId validateUserId(final org.dressdiscover.api.models.qa.QaUserId userId) throws RuntimeException {
            if (userId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Answer: userId is null");
            }
            return userId;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> validateValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) throws RuntimeException {
            if (values == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.Answer: values is null");
            }
            if (values.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.Answer: values is less than min length 1");
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
        public org.dressdiscover.api.models.qa.QaObjectId validateObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
            return objectId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionId validateQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) {
            return questionId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaUserId validateUserId(final org.dressdiscover.api.models.qa.QaUserId userId) {
            return userId;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> validateValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
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
        public org.dressdiscover.api.models.qa.QaObjectId validateObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) throws org.thryft.protocol.InputProtocolException {
            if (objectId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_ID, "org.dressdiscover.api.models.qa.Answer: objectId is null");
            }
            return objectId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionId validateQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) throws org.thryft.protocol.InputProtocolException {
            if (questionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUESTION_ID, "org.dressdiscover.api.models.qa.Answer: questionId is null");
            }
            return questionId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaUserId validateUserId(final org.dressdiscover.api.models.qa.QaUserId userId) throws org.thryft.protocol.InputProtocolException {
            if (userId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.USER_ID, "org.dressdiscover.api.models.qa.Answer: userId is null");
            }
            return userId;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> validateValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) throws org.thryft.protocol.InputProtocolException {
            if (values == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VALUES, "org.dressdiscover.api.models.qa.Answer: values is null");
            }
            if (values.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, "org.dressdiscover.api.models.qa.Answer: values is less than min length 1");
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
        public org.dressdiscover.api.models.qa.QaObjectId validateObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
            return objectId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QuestionId validateQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) {
            return questionId;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaUserId validateUserId(final org.dressdiscover.api.models.qa.QaUserId userId) {
            return userId;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> validateValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
            return values;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Answer(final Answer other) {
        this(other.getObjectId(), other.getQuestionId(), other.getUserId(), other.getValues(), NopConstructionValidator.getInstance());
    }

    protected Answer(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionId questionId, final org.dressdiscover.api.models.qa.QaUserId userId, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values, ConstructionValidator validator) {
        this.objectId = validator.validateObjectId(objectId);
        this.questionId = validator.validateQuestionId(questionId);
        this.userId = validator.validateUserId(userId);
        this.values = validator.validateValues(values);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Answer other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Answer> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static Answer create(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionId questionId, final org.dressdiscover.api.models.qa.QaUserId userId, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
        return new Answer(objectId, questionId, userId, values, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Answer)) {
            return false;
        }

        final Answer other = (Answer)otherObject;

        if (!(getObjectId().equals(other.getObjectId()))) {
            return false;
        }

        if (!(getQuestionId().equals(other.getQuestionId()))) {
            return false;
        }

        if (!(getUserId().equals(other.getUserId()))) {
            return false;
        }

        if (!(getValues().equals(other.getValues()))) {
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
        case OBJECT_ID: return getObjectId();
        case QUESTION_ID: return getQuestionId();
        case USER_ID: return getUserId();
        case VALUES: return getValues();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.qa.QaObjectId getObjectId() {
        return objectId;
    }

    public final org.dressdiscover.api.models.qa.QuestionId getQuestionId() {
        return questionId;
    }

    public final org.dressdiscover.api.models.qa.QaUserId getUserId() {
        return userId;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> getValues() {
        return values;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getObjectId().hashCode();
        hashCode = 31 * hashCode + getQuestionId().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        hashCode = 31 * hashCode + getValues().hashCode();
        return hashCode;
    }

    public static Answer readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Answer readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Answer readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QaObjectId objectId = null;
        org.dressdiscover.api.models.qa.QuestionId questionId = null;
        org.dressdiscover.api.models.qa.QaUserId userId = null;
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values = null;

        try {
            iprot.readListBegin();
            try {
                objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
            }
            try {
                questionId = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_ID, e);
            }
            try {
                userId = org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
            }
            try {
                values = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.AnswerValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.qa.AnswerValue.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.VALUES, e.getCause());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Answer(DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateQuestionId(questionId), DefaultReadValidator.getInstance().validateUserId(userId), DefaultReadValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    public static Answer readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Answer readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QaObjectId objectId = null;
        org.dressdiscover.api.models.qa.QuestionId questionId = null;
        org.dressdiscover.api.models.qa.QaUserId userId = null;
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "object_id": {
                    try {
                        objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                    }
                    break;
                }
                case "question_id": {
                    try {
                        questionId = org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_ID, e);
                    }
                    break;
                }
                case "user_id": {
                    try {
                        userId = org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.USER_ID, e);
                    }
                    break;
                }
                case "values": {
                    try {
                        values = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.AnswerValue> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.AnswerValue.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
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
        return new Answer(DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateQuestionId(questionId), DefaultReadValidator.getInstance().validateUserId(userId), DefaultReadValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    public Answer replaceObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
        return new Answer(DefaultConstructionValidator.getInstance().validateObjectId(objectId), this.questionId, this.userId, this.values, NopConstructionValidator.getInstance());
    }

    public Answer replaceQuestionId(final org.dressdiscover.api.models.qa.QuestionId questionId) {
        return new Answer(this.objectId, DefaultConstructionValidator.getInstance().validateQuestionId(questionId), this.userId, this.values, NopConstructionValidator.getInstance());
    }

    public Answer replaceUserId(final org.dressdiscover.api.models.qa.QaUserId userId) {
        return new Answer(this.objectId, this.questionId, DefaultConstructionValidator.getInstance().validateUserId(userId), this.values, NopConstructionValidator.getInstance());
    }

    public Answer replaceValues(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values) {
        return new Answer(this.objectId, this.questionId, this.userId, DefaultConstructionValidator.getInstance().validateValues(values), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object_id", getObjectId()).add("question_id", getQuestionId()).add("user_id", getUserId()).add("values", getValues()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getObjectId().toString());

        oprot.writeString(getQuestionId().toString());

        oprot.writeString(getUserId().toString());

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getValues().size());
        for (final org.dressdiscover.api.models.qa.AnswerValue _iter0 : getValues()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.Answer");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("object_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getObjectId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("question_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getQuestionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getUserId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("values", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getValues().size());
        for (final org.dressdiscover.api.models.qa.AnswerValue _iter0 : getValues()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.qa.QaObjectId objectId;

    private final org.dressdiscover.api.models.qa.QuestionId questionId;

    private final org.dressdiscover.api.models.qa.QaUserId userId;

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.AnswerValue> values;
}
