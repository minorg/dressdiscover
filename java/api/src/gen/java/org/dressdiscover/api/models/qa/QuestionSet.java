package org.dressdiscover.api.models.qa;

public final class QuestionSet implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            questionIds = null;
            title = null;
            description = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final QuestionSet other) {
            this.id = other.getId();
            this.questionIds = other.getQuestionIds();
            this.title = other.getTitle();
            this.description = other.getDescription();
        }

        protected QuestionSet _build(final org.dressdiscover.api.models.qa.QuestionSetId id, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final String title, final com.google.common.base.Optional<String> description) {
            return new QuestionSet(id, questionIds, title, description, DefaultConstructionValidator.getInstance());
        }

        public QuestionSet build() {
            return _build(id, questionIds, title, description);
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final org.dressdiscover.api.models.qa.QuestionSetId getId() {
            return id;
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> getQuestionIds() {
            return questionIds;
        }

        public final String getTitle() {
            return title;
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
                    id = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                try {
                    questionIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
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
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                }
                title = iprot.readString();
                if (__list.getSize() > 3) {
                    description = com.google.common.base.Optional.of(iprot.readString());
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
                            id = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "question_ids": {
                        try {
                            questionIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
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
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                        }
                        break;
                    }
                    case "title": {
                        title = iprot.readString();
                        break;
                    }
                    case "description": {
                        description = com.google.common.base.Optional.of(iprot.readString());
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
            case ID: setId((org.dressdiscover.api.models.qa.QuestionSetId)value); return this;
            case QUESTION_IDS: setQuestionIds((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>)value); return this;
            case TITLE: setTitle((String)value); return this;
            case DESCRIPTION: setDescription((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = DefaultConstructionValidator.getInstance().validateDescription(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            return setDescription(com.google.common.base.Optional.fromNullable(description));
        }

        public Builder setId(final org.dressdiscover.api.models.qa.QuestionSetId id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setIfPresent(final QuestionSet other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setQuestionIds(other.getQuestionIds());
            setTitle(other.getTitle());
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }

            return this;
        }

        public Builder setQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
            this.questionIds = DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = DefaultConstructionValidator.getInstance().validateTitle(title);
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
            case QUESTION_IDS: return unsetQuestionIds();
            case TITLE: return unsetTitle();
            case DESCRIPTION: return unsetDescription();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetQuestionIds() {
            this.questionIds = null;
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        private org.dressdiscover.api.models.qa.QuestionSetId id;
        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds;
        private String title;
        private com.google.common.base.Optional<String> description;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QuestionSet> {
        @Override
        public QuestionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QuestionSet.readAs(iprot, type);
        }

        @Override
        public QuestionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionSet.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QuestionSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionSet.readAsList(iprot);
        }

        @Override
        public QuestionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionSet.readAsStruct(iprot);
        }

        @Override
        public QuestionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionSet.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QuestionSetId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        QUESTION_IDS("questionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {}, true, 0, "question_ids", org.thryft.protocol.Type.LIST),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "description", org.thryft.protocol.Type.STRING);

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
            case "questionIds": return QUESTION_IDS;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "question_ids": return QUESTION_IDS;
            case "title": return TITLE;
            case "description": return DESCRIPTION;
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
        public org.dressdiscover.api.models.qa.QuestionSetId validateId(final org.dressdiscover.api.models.qa.QuestionSetId id) throws ExceptionT;

        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> validateQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) throws ExceptionT;

        public String validateTitle(final String title) throws ExceptionT;

        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws ExceptionT;
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
        public org.dressdiscover.api.models.qa.QuestionSetId validateId(final org.dressdiscover.api.models.qa.QuestionSetId id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionSet: id is null");
            }
            return id;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> validateQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) throws RuntimeException {
            if (questionIds == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionSet: questionIds is null");
            }
            if (questionIds.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QuestionSet: questionIds is less than min length 1");
            }
            return questionIds;
        }

        @Override
        public String validateTitle(final String title) throws RuntimeException {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionSet: title is null");
            }
            if (title.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QuestionSet: title is less than min length 1");
            }
            {
                final int __strLen = title.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(title.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QuestionSet: title is blank: '%s' (length=%d)", title, __strLen));
                }
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws RuntimeException {
            if (description == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QuestionSet: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QuestionSet: description is less than min length 1");
            }
            {
                final int __strLen = description.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(description.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QuestionSet: description is blank: '%s' (length=%d)", description.get(), __strLen));
                }
            }
            return description;
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
        public org.dressdiscover.api.models.qa.QuestionSetId validateId(final org.dressdiscover.api.models.qa.QuestionSetId id) {
            return id;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> validateQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
            return questionIds;
        }

        @Override
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) {
            return description;
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
        public org.dressdiscover.api.models.qa.QuestionSetId validateId(final org.dressdiscover.api.models.qa.QuestionSetId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.qa.QuestionSet: id is null");
            }
            return id;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> validateQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) throws org.thryft.protocol.InputProtocolException {
            if (questionIds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUESTION_IDS, "org.dressdiscover.api.models.qa.QuestionSet: questionIds is null");
            }
            if (questionIds.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, "org.dressdiscover.api.models.qa.QuestionSet: questionIds is less than min length 1");
            }
            return questionIds;
        }

        @Override
        public String validateTitle(final String title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.qa.QuestionSet: title is null");
            }
            if (title.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.qa.QuestionSet: title is less than min length 1");
            }
            {
                final int __strLen = title.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(title.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, String.format("org.dressdiscover.api.models.qa.QuestionSet: title is blank: '%s' (length=%d)", title, __strLen));
                }
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws org.thryft.protocol.InputProtocolException {
            if (description == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.qa.QuestionSet: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.qa.QuestionSet: description is less than min length 1");
            }
            {
                final int __strLen = description.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(description.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, String.format("org.dressdiscover.api.models.qa.QuestionSet: description is blank: '%s' (length=%d)", description.get(), __strLen));
                }
            }
            return description;
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
        public org.dressdiscover.api.models.qa.QuestionSetId validateId(final org.dressdiscover.api.models.qa.QuestionSetId id) {
            return id;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> validateQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
            return questionIds;
        }

        @Override
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) {
            return description;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QuestionSet(final QuestionSet other) {
        this(other.getId(), other.getQuestionIds(), other.getTitle(), other.getDescription(), NopConstructionValidator.getInstance());
    }

    protected QuestionSet(final org.dressdiscover.api.models.qa.QuestionSetId id, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final String title, final com.google.common.base.Optional<String> description, ConstructionValidator validator) {
        this.id = validator.validateId(id);
        this.questionIds = validator.validateQuestionIds(questionIds);
        this.title = validator.validateTitle(title);
        this.description = validator.validateDescription(description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QuestionSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QuestionSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static QuestionSet create(final org.dressdiscover.api.models.qa.QuestionSetId id, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final String title) {
        return new QuestionSet(id, questionIds, title, com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static QuestionSet create(final org.dressdiscover.api.models.qa.QuestionSetId id, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final String title, final @javax.annotation.Nullable String description) {
        return new QuestionSet(id, questionIds, title, com.google.common.base.Optional.fromNullable(description), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static QuestionSet create(final org.dressdiscover.api.models.qa.QuestionSetId id, final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds, final String title, final com.google.common.base.Optional<String> description) {
        return new QuestionSet(id, questionIds, title, description, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QuestionSet)) {
            return false;
        }

        final QuestionSet other = (QuestionSet)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(getQuestionIds().equals(other.getQuestionIds()))) {
            return false;
        }

        if (!(getTitle().equals(other.getTitle()))) {
            return false;
        }

        if (!(((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())))) {
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
        case QUESTION_IDS: return getQuestionIds();
        case TITLE: return getTitle();
        case DESCRIPTION: return getDescription();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final org.dressdiscover.api.models.qa.QuestionSetId getId() {
        return id;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> getQuestionIds() {
        return questionIds;
    }

    public final String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getQuestionIds().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        return hashCode;
    }

    public static QuestionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QuestionSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionSetId id = null;
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            try {
                questionIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
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
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
            }
            title = iprot.readString();
            if (__list.getSize() > 3) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QuestionSet(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateQuestionIds(questionIds), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateDescription(description), NopConstructionValidator.getInstance());
    }

    public static QuestionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QuestionSetId id = null;
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds = null;
        String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();

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
                        id = org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "question_ids": {
                    try {
                        questionIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>>() {
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
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_IDS, e.getCause());
                    }
                    break;
                }
                case "title": {
                    title = iprot.readString();
                    break;
                }
                case "description": {
                    description = com.google.common.base.Optional.of(iprot.readString());
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
        return new QuestionSet(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateQuestionIds(questionIds), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateDescription(description), NopConstructionValidator.getInstance());
    }

    public QuestionSet replaceDescription(final com.google.common.base.Optional<String> description) {
        return new QuestionSet(this.id, this.questionIds, this.title, DefaultConstructionValidator.getInstance().validateDescription(description), NopConstructionValidator.getInstance());
    }

    public QuestionSet replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public QuestionSet replaceId(final org.dressdiscover.api.models.qa.QuestionSetId id) {
        return new QuestionSet(DefaultConstructionValidator.getInstance().validateId(id), this.questionIds, this.title, this.description, NopConstructionValidator.getInstance());
    }

    public QuestionSet replaceQuestionIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds) {
        return new QuestionSet(this.id, DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds), this.title, this.description, NopConstructionValidator.getInstance());
    }

    public QuestionSet replaceTitle(final String title) {
        return new QuestionSet(this.id, this.questionIds, DefaultConstructionValidator.getInstance().validateTitle(title), this.description, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("question_ids", getQuestionIds()).add("title", getTitle()).add("description", getDescription().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getId().toString());

        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQuestionIds().size());
        for (final org.dressdiscover.api.models.qa.QuestionId _iter0 : getQuestionIds()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();

        oprot.writeString(getTitle());

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QuestionSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("question_ids", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQuestionIds().size());
        for (final org.dressdiscover.api.models.qa.QuestionId _iter0 : getQuestionIds()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.qa.QuestionSetId id;

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> questionIds;

    private final String title;

    private final com.google.common.base.Optional<String> description;
}
