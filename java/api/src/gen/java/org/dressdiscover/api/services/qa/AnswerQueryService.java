package org.dressdiscover.api.services.qa;

public interface AnswerQueryService {
    public enum FunctionMetadata {
        GET_ANSWERS("get_answers");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetAnswersRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    objectId = null;
                    questionSetId = null;
                    questionIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent();
                    userId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent();
                }

                public Builder(final GetAnswersRequest other) {
                    this.objectId = other.getObjectId();
                    this.questionSetId = other.getQuestionSetId();
                    this.questionIds = other.getQuestionIds();
                    this.userId = other.getUserId();
                }

                protected GetAnswersRequest _build(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                    return new GetAnswersRequest(objectId, questionSetId, questionIds, userId, DefaultConstructionValidator.getInstance());
                }

                public GetAnswersRequest build() {
                    return _build(objectId, questionSetId, questionIds, userId);
                }

                public final org.dressdiscover.api.models.qa.QaObjectId getObjectId() {
                    return objectId;
                }

                public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> getQuestionIds() {
                    return questionIds;
                }

                public final org.dressdiscover.api.models.qa.QuestionSetId getQuestionSetId() {
                    return questionSetId;
                }

                public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> getUserId() {
                    return userId;
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
                            objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                        }
                        try {
                            questionSetId = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_ID, e);
                        }
                        if (__list.getSize() > 2) {
                            try {
                                questionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                try {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString()));
                                                } catch (final IllegalArgumentException e) {
                                                     throw new org.thryft.protocol.InputProtocolException(e);
                                                }
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                            }
                        }
                        if (__list.getSize() > 3) {
                            try {
                                userId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString()));
                            } catch (final IllegalArgumentException e) {
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
                            case "object_id": {
                                try {
                                    objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                                }
                                break;
                            }
                            case "question_set_id": {
                                try {
                                    questionSetId = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_ID, e);
                                }
                                break;
                            }
                            case "question_ids": {
                                try {
                                    questionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    try {
                                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString()));
                                                    } catch (final IllegalArgumentException e) {
                                                         throw new org.thryft.protocol.InputProtocolException(e);
                                                    }
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                                }
                                break;
                            }
                            case "user_id": {
                                try {
                                    userId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString()));
                                } catch (final IllegalArgumentException e) {
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
                    case QUESTION_SET_ID: setQuestionSetId((org.dressdiscover.api.models.qa.QuestionSetId)value); return this;
                    case QUESTION_IDS: setQuestionIds((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>)value); return this;
                    case USER_ID: setUserId((org.dressdiscover.api.models.qa.QaUserId)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetAnswersRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setObjectId(other.getObjectId());
                    setQuestionSetId(other.getQuestionSetId());
                    if (other.getQuestionIds().isPresent()) {
                        setQuestionIds(other.getQuestionIds());
                    }
                    if (other.getUserId().isPresent()) {
                        setUserId(other.getUserId());
                    }

                    return this;
                }

                public Builder setObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
                    this.objectId = DefaultConstructionValidator.getInstance().validateObjectId(objectId);
                    return this;
                }

                public Builder setQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) {
                    this.questionIds = DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds);
                    return this;
                }

                public Builder setQuestionIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
                    return setQuestionIds(com.google.common.base.Optional.fromNullable(questionIds));
                }

                public Builder setQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) {
                    this.questionSetId = DefaultConstructionValidator.getInstance().validateQuestionSetId(questionSetId);
                    return this;
                }

                public Builder setUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                    this.userId = DefaultConstructionValidator.getInstance().validateUserId(userId);
                    return this;
                }

                public Builder setUserId(@javax.annotation.Nullable final org.dressdiscover.api.models.qa.QaUserId userId) {
                    return setUserId(com.google.common.base.Optional.fromNullable(userId));
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
                    case QUESTION_SET_ID: return unsetQuestionSetId();
                    case QUESTION_IDS: return unsetQuestionIds();
                    case USER_ID: return unsetUserId();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetObjectId() {
                    this.objectId = null;
                    return this;
                }

                public Builder unsetQuestionIds() {
                    this.questionIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent();
                    return this;
                }

                public Builder unsetQuestionSetId() {
                    this.questionSetId = null;
                    return this;
                }

                public Builder unsetUserId() {
                    this.userId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent();
                    return this;
                }

                private org.dressdiscover.api.models.qa.QaObjectId objectId;
                private org.dressdiscover.api.models.qa.QuestionSetId questionSetId;
                private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds;
                private com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetAnswersRequest> {
                @Override
                public GetAnswersRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersRequest.readAs(iprot, type);
                }

                @Override
                public GetAnswersRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetAnswersRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersRequest.readAsList(iprot);
                }

                @Override
                public GetAnswersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersRequest.readAsStruct(iprot);
                }

                @Override
                public GetAnswersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaObjectId>() {}, true, 0, "object_id", org.thryft.protocol.Type.STRING),
                QUESTION_SET_ID("questionSetId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionSetId>() {}, true, 0, "question_set_id", org.thryft.protocol.Type.STRING),
                QUESTION_IDS("questionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {}, false, 0, "question_ids", org.thryft.protocol.Type.LIST),
                USER_ID("userId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaUserId>() {}, false, 0, "user_id", org.thryft.protocol.Type.STRING);

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
                    case "questionSetId": return QUESTION_SET_ID;
                    case "questionIds": return QUESTION_IDS;
                    case "userId": return USER_ID;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "object_id": return OBJECT_ID;
                    case "question_set_id": return QUESTION_SET_ID;
                    case "question_ids": return QUESTION_IDS;
                    case "user_id": return USER_ID;
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

                public org.dressdiscover.api.models.qa.QuestionSetId validateQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) throws ExceptionT;

                public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> validateQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) throws ExceptionT;

                public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> validateUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws ExceptionT;
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
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetAnswersRequest: objectId is null");
                    }
                    return objectId;
                }

                @Override
                public org.dressdiscover.api.models.qa.QuestionSetId validateQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) throws RuntimeException {
                    if (questionSetId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetAnswersRequest: questionSetId is null");
                    }
                    return questionSetId;
                }

                @Override
                public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> validateQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) throws RuntimeException {
                    if (questionIds == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetAnswersRequest: questionIds is null");
                    }
                    if (!questionIds.isPresent()) {
                        return questionIds;
                    }
                    if (questionIds.get().isEmpty()) {
                        throw new IllegalArgumentException("org.dressdiscover.api.services.qa.GetAnswersRequest: questionIds is less than min length 1");
                    }
                    return questionIds;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> validateUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws RuntimeException {
                    if (userId == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetAnswersRequest: userId is null");
                    }
                    if (!userId.isPresent()) {
                        return userId;
                    }
                    return userId;
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
                public org.dressdiscover.api.models.qa.QuestionSetId validateQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) {
                    return questionSetId;
                }

                @Override
                public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> validateQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) {
                    return questionIds;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> validateUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                    return userId;
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
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_ID, "org.dressdiscover.api.services.qa.GetAnswersRequest: objectId is null");
                    }
                    return objectId;
                }

                @Override
                public org.dressdiscover.api.models.qa.QuestionSetId validateQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) throws org.thryft.protocol.InputProtocolException {
                    if (questionSetId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUESTION_SET_ID, "org.dressdiscover.api.services.qa.GetAnswersRequest: questionSetId is null");
                    }
                    return questionSetId;
                }

                @Override
                public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> validateQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) throws org.thryft.protocol.InputProtocolException {
                    if (questionIds == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUESTION_IDS, "org.dressdiscover.api.services.qa.GetAnswersRequest: questionIds is null");
                    }
                    if (!questionIds.isPresent()) {
                        return questionIds;
                    }
                    if (questionIds.get().isEmpty()) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, "org.dressdiscover.api.services.qa.GetAnswersRequest: questionIds is less than min length 1");
                    }
                    return questionIds;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> validateUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws org.thryft.protocol.InputProtocolException {
                    if (userId == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.USER_ID, "org.dressdiscover.api.services.qa.GetAnswersRequest: userId is null");
                    }
                    if (!userId.isPresent()) {
                        return userId;
                    }
                    return userId;
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
                public org.dressdiscover.api.models.qa.QuestionSetId validateQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) {
                    return questionSetId;
                }

                @Override
                public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> validateQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) {
                    return questionIds;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> validateUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                    return userId;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetAnswersRequest(final GetAnswersRequest other) {
                this(other.getObjectId(), other.getQuestionSetId(), other.getQuestionIds(), other.getUserId(), NopConstructionValidator.getInstance());
            }

            protected GetAnswersRequest(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId, ConstructionValidator validator) {
                this.objectId = validator.validateObjectId(objectId);
                this.questionSetId = validator.validateQuestionSetId(questionSetId);
                this.questionIds = validator.validateQuestionIds(questionIds);
                this.userId = validator.validateUserId(userId);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetAnswersRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetAnswersRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Required factory method
             */
            public static GetAnswersRequest create(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) {
                return new GetAnswersRequest(objectId, questionSetId, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent(), DefaultConstructionValidator.getInstance());
            }

            /**
             * Total Nullable factory method
             */
            public static GetAnswersRequest create(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final @javax.annotation.Nullable org.dressdiscover.api.models.qa.QaUserId userId) {
                return new GetAnswersRequest(objectId, questionSetId, com.google.common.base.Optional.fromNullable(questionIds), com.google.common.base.Optional.fromNullable(userId), DefaultConstructionValidator.getInstance());
            }

            /**
             * Optional factory method
             */
            public static GetAnswersRequest create(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                return new GetAnswersRequest(objectId, questionSetId, questionIds, userId, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetAnswersRequest)) {
                    return false;
                }

                final GetAnswersRequest other = (GetAnswersRequest)otherObject;

                if (!(getObjectId().equals(other.getObjectId()))) {
                    return false;
                }

                if (!(getQuestionSetId().equals(other.getQuestionSetId()))) {
                    return false;
                }

                if (!(((getQuestionIds().isPresent() && other.getQuestionIds().isPresent()) ? (getQuestionIds().get().equals(other.getQuestionIds().get())) : (!getQuestionIds().isPresent() && !other.getQuestionIds().isPresent())))) {
                    return false;
                }

                if (!(((getUserId().isPresent() && other.getUserId().isPresent()) ? (getUserId().get().equals(other.getUserId().get())) : (!getUserId().isPresent() && !other.getUserId().isPresent())))) {
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
                case QUESTION_SET_ID: return getQuestionSetId();
                case QUESTION_IDS: return getQuestionIds();
                case USER_ID: return getUserId();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.qa.QaObjectId getObjectId() {
                return objectId;
            }

            public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> getQuestionIds() {
                return questionIds;
            }

            public final org.dressdiscover.api.models.qa.QuestionSetId getQuestionSetId() {
                return questionSetId;
            }

            public final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> getUserId() {
                return userId;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getObjectId().hashCode();
                hashCode = 31 * hashCode + getQuestionSetId().hashCode();
                if (getQuestionIds().isPresent()) {
                    hashCode = 31 * hashCode + getQuestionIds().get().hashCode();
                }
                if (getUserId().isPresent()) {
                    hashCode = 31 * hashCode + getUserId().get().hashCode();
                }
                return hashCode;
            }

            public static GetAnswersRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetAnswersRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetAnswersRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObjectId objectId = null;
                org.dressdiscover.api.models.qa.QuestionSetId questionSetId = null;
                com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent();
                com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent();

                try {
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    try {
                        objectId = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_ID, e);
                    }
                    try {
                        questionSetId = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_ID, e);
                    }
                    if (__list.getSize() > 2) {
                        try {
                            questionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString()));
                                            } catch (final IllegalArgumentException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                        }
                    }
                    if (__list.getSize() > 3) {
                        try {
                            userId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString()));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetAnswersRequest(DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateQuestionSetId(questionSetId), DefaultReadValidator.getInstance().validateQuestionIds(questionIds), DefaultReadValidator.getInstance().validateUserId(userId), NopConstructionValidator.getInstance());
            }

            public static GetAnswersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetAnswersRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.qa.QaObjectId objectId = null;
                org.dressdiscover.api.models.qa.QuestionSetId questionSetId = null;
                com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent();
                com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId = com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent();

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
                        case "question_set_id": {
                            try {
                                questionSetId = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                            } catch (final IllegalArgumentException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_ID, e);
                            }
                            break;
                        }
                        case "question_ids": {
                            try {
                                questionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                try {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionId.parse(iprot.readString()));
                                                } catch (final IllegalArgumentException e) {
                                                     throw new org.thryft.protocol.InputProtocolException(e);
                                                }
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                            }
                            break;
                        }
                        case "user_id": {
                            try {
                                userId = com.google.common.base.Optional.of(org.dressdiscover.api.models.qa.QaUserId.parse(iprot.readString()));
                            } catch (final IllegalArgumentException e) {
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
                return new GetAnswersRequest(DefaultReadValidator.getInstance().validateObjectId(objectId), DefaultReadValidator.getInstance().validateQuestionSetId(questionSetId), DefaultReadValidator.getInstance().validateQuestionIds(questionIds), DefaultReadValidator.getInstance().validateUserId(userId), NopConstructionValidator.getInstance());
            }

            public GetAnswersRequest replaceObjectId(final org.dressdiscover.api.models.qa.QaObjectId objectId) {
                return new GetAnswersRequest(DefaultConstructionValidator.getInstance().validateObjectId(objectId), this.questionSetId, this.questionIds, this.userId, NopConstructionValidator.getInstance());
            }

            public GetAnswersRequest replaceQuestionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) {
                return new GetAnswersRequest(this.objectId, this.questionSetId, DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds), this.userId, NopConstructionValidator.getInstance());
            }

            public GetAnswersRequest replaceQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
                return replaceQuestionIds(com.google.common.base.Optional.fromNullable(questionIds));
            }

            public GetAnswersRequest replaceQuestionSetId(final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) {
                return new GetAnswersRequest(this.objectId, DefaultConstructionValidator.getInstance().validateQuestionSetId(questionSetId), this.questionIds, this.userId, NopConstructionValidator.getInstance());
            }

            public GetAnswersRequest replaceUserId(final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
                return new GetAnswersRequest(this.objectId, this.questionSetId, this.questionIds, DefaultConstructionValidator.getInstance().validateUserId(userId), NopConstructionValidator.getInstance());
            }

            public GetAnswersRequest replaceUserId(final org.dressdiscover.api.models.qa.QaUserId userId) {
                return replaceUserId(com.google.common.base.Optional.fromNullable(userId));
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("object_id", getObjectId()).add("question_set_id", getQuestionSetId()).add("question_ids", getQuestionIds().orNull()).add("user_id", getUserId().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

                oprot.writeString(getObjectId().toString());

                oprot.writeString(getQuestionSetId().toString());

                if (getQuestionIds().isPresent()) {
                    oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQuestionIds().get().size());
                    for (final org.dressdiscover.api.models.qa.QuestionId _iter0 : getQuestionIds().get()) {
                        oprot.writeString(_iter0.toString());
                    }
                    oprot.writeListEnd();
                } else {
                    oprot.writeNull();
                }

                if (getUserId().isPresent()) {
                    oprot.writeString(getUserId().get().toString());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetAnswersRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("object_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getObjectId().toString());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin("question_set_id", org.thryft.protocol.Type.STRING, (short)0);
                oprot.writeString(getQuestionSetId().toString());
                oprot.writeFieldEnd();

                if (getQuestionIds().isPresent()) {
                    oprot.writeFieldBegin("question_ids", org.thryft.protocol.Type.LIST, (short)0);
                    oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQuestionIds().get().size());
                    for (final org.dressdiscover.api.models.qa.QuestionId _iter0 : getQuestionIds().get()) {
                        oprot.writeString(_iter0.toString());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                if (getUserId().isPresent()) {
                    oprot.writeFieldBegin("user_id", org.thryft.protocol.Type.STRING, (short)0);
                    oprot.writeString(getUserId().get().toString());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();
            }

            private final org.dressdiscover.api.models.qa.QaObjectId objectId;

            private final org.dressdiscover.api.models.qa.QuestionSetId questionSetId;

            private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds;

            private final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId;
        }

        public final static class GetAnswersResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetAnswersResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetAnswersResponse _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                    return new GetAnswersResponse(returnValue, DefaultConstructionValidator.getInstance());
                }

                public GetAnswersResponse build() {
                    return _build(returnValue);
                }

                public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getReturnValue() {
                    return returnValue;
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.Answer> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.Answer.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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
                            case "return_value": {
                                try {
                                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.Answer> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.Answer.readAsStruct(iprot));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot);
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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
                    case RETURN_VALUE: setReturnValue((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetAnswersResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                    this.returnValue = DefaultConstructionValidator.getInstance().validateReturnValue(returnValue);
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
                    case RETURN_VALUE: return unsetReturnValue();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetAnswersResponse> {
                @Override
                public GetAnswersResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersResponse.readAs(iprot, type);
                }

                @Override
                public GetAnswersResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetAnswersResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersResponse.readAsList(iprot);
                }

                @Override
                public GetAnswersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersResponse.readAsStruct(iprot);
                }

                @Override
                public GetAnswersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetAnswersResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
                    case "returnValue": return RETURN_VALUE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "return_value": return RETURN_VALUE;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) throws ExceptionT;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) throws RuntimeException {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetAnswersResponse: returnValue is null");
                    }
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.qa.GetAnswersResponse: returnValue is null");
                    }
                    return returnValue;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                    return returnValue;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetAnswersResponse(final GetAnswersResponse other) {
                this(other.getReturnValue(), NopConstructionValidator.getInstance());
            }

            protected GetAnswersResponse(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue, ConstructionValidator validator) {
                this.returnValue = validator.validateReturnValue(returnValue);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetAnswersResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetAnswersResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetAnswersResponse create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                return new GetAnswersResponse(returnValue, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetAnswersResponse)) {
                    return false;
                }

                final GetAnswersResponse other = (GetAnswersResponse)otherObject;

                if (!(getReturnValue().equals(other.getReturnValue()))) {
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
                case RETURN_VALUE: return getReturnValue();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetAnswersResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetAnswersResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetAnswersResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue = null;

                try {
                    iprot.readListBegin();
                    try {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.Answer> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.Answer.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetAnswersResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public static GetAnswersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetAnswersResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            try {
                                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.Answer> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.Answer.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot);
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RETURN_VALUE, e.getCause());
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
                return new GetAnswersResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public GetAnswersResponse replaceReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue) {
                return new GetAnswersResponse(DefaultConstructionValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.Answer _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetAnswersResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.Answer _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> returnValue;
        }
    }

    public default com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId) throws org.dressdiscover.api.services.IoException {
        return getAnswers(objectId, questionSetId, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent());
    }

    public default com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds) throws org.dressdiscover.api.services.IoException {
        return getAnswers(objectId, questionSetId, questionIds, com.google.common.base.Optional.<org.dressdiscover.api.models.qa.QaUserId> absent());
    }

    /**
     * @param questionIds
     */
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws org.dressdiscover.api.services.IoException;
}
