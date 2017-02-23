package org.dressdiscover.api.models.qa;

public final class QaObject implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            id = null;
            image = null;
            questionSetIds = null;
        }

        public Builder(final QaObject other) {
            this.id = other.getId();
            this.image = other.getImage();
            this.questionSetIds = other.getQuestionSetIds();
        }

        protected QaObject _build(final org.dressdiscover.api.models.qa.QaObjectId id, final org.dressdiscover.api.models.qa.QaImage image, final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
            return new QaObject(id, image, questionSetIds, DefaultConstructionValidator.getInstance());
        }

        public QaObject build() {
            return _build(id, image, questionSetIds);
        }

        public final org.dressdiscover.api.models.qa.QaObjectId getId() {
            return id;
        }

        public final org.dressdiscover.api.models.qa.QaImage getImage() {
            return image;
        }

        public final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> getQuestionSetIds() {
            return questionSetIds;
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
                    id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                }
                image = org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot);
                try {
                    questionSetIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_IDS, e.getCause());
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
                            id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                        }
                        break;
                    }
                    case "image": {
                        image = org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot);
                        break;
                    }
                    case "question_set_ids": {
                        try {
                            questionSetIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
                                            } catch (final IllegalArgumentException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_IDS, e.getCause());
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
            case ID: setId((org.dressdiscover.api.models.qa.QaObjectId)value); return this;
            case IMAGE: setImage((org.dressdiscover.api.models.qa.QaImage)value); return this;
            case QUESTION_SET_IDS: setQuestionSetIds((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setId(final org.dressdiscover.api.models.qa.QaObjectId id) {
            this.id = DefaultConstructionValidator.getInstance().validateId(id);
            return this;
        }

        public Builder setIfPresent(final QaObject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            setImage(other.getImage());
            setQuestionSetIds(other.getQuestionSetIds());

            return this;
        }

        public Builder setImage(final org.dressdiscover.api.models.qa.QaImage image) {
            this.image = DefaultConstructionValidator.getInstance().validateImage(image);
            return this;
        }

        public Builder setQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
            this.questionSetIds = DefaultConstructionValidator.getInstance().validateQuestionSetIds(questionSetIds);
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
            case IMAGE: return unsetImage();
            case QUESTION_SET_IDS: return unsetQuestionSetIds();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetImage() {
            this.image = null;
            return this;
        }

        public Builder unsetQuestionSetIds() {
            this.questionSetIds = null;
            return this;
        }

        private org.dressdiscover.api.models.qa.QaObjectId id;
        private org.dressdiscover.api.models.qa.QaImage image;
        private com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QaObject> {
        @Override
        public QaObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QaObject.readAs(iprot, type);
        }

        @Override
        public QaObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaObject.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QaObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaObject.readAsList(iprot);
        }

        @Override
        public QaObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaObject.readAsStruct(iprot);
        }

        @Override
        public QaObject readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaObjectId>() {}, true, 0, "id", org.thryft.protocol.Type.STRING),
        IMAGE("image", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaImage>() {}, true, 0, "image", org.thryft.protocol.Type.STRUCT),
        QUESTION_SET_IDS("questionSetIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>>() {}, true, 0, "question_set_ids", org.thryft.protocol.Type.SET);

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
            case "image": return IMAGE;
            case "questionSetIds": return QUESTION_SET_IDS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "image": return IMAGE;
            case "question_set_ids": return QUESTION_SET_IDS;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws ExceptionT;

        public org.dressdiscover.api.models.qa.QaImage validateImage(final org.dressdiscover.api.models.qa.QaImage image) throws ExceptionT;

        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> validateQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) throws ExceptionT;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws RuntimeException {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaObject: id is null");
            }
            return id;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImage validateImage(final org.dressdiscover.api.models.qa.QaImage image) throws RuntimeException {
            if (image == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaObject: image is null");
            }
            return image;
        }

        @Override
        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> validateQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) throws RuntimeException {
            if (questionSetIds == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaObject: questionSetIds is null");
            }
            return questionSetIds;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) {
            return id;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImage validateImage(final org.dressdiscover.api.models.qa.QaImage image) {
            return image;
        }

        @Override
        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> validateQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
            return questionSetIds;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.qa.QaObject: id is null");
            }
            return id;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImage validateImage(final org.dressdiscover.api.models.qa.QaImage image) throws org.thryft.protocol.InputProtocolException {
            if (image == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGE, "org.dressdiscover.api.models.qa.QaObject: image is null");
            }
            return image;
        }

        @Override
        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> validateQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) throws org.thryft.protocol.InputProtocolException {
            if (questionSetIds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUESTION_SET_IDS, "org.dressdiscover.api.models.qa.QaObject: questionSetIds is null");
            }
            return questionSetIds;
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
        public org.dressdiscover.api.models.qa.QaObjectId validateId(final org.dressdiscover.api.models.qa.QaObjectId id) {
            return id;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImage validateImage(final org.dressdiscover.api.models.qa.QaImage image) {
            return image;
        }

        @Override
        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> validateQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
            return questionSetIds;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QaObject(final QaObject other) {
        this(other.getId(), other.getImage(), other.getQuestionSetIds(), NopConstructionValidator.getInstance());
    }

    protected QaObject(final org.dressdiscover.api.models.qa.QaObjectId id, final org.dressdiscover.api.models.qa.QaImage image, final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds, ConstructionValidator validator) {
        this.id = validator.validateId(id);
        this.image = validator.validateImage(image);
        this.questionSetIds = validator.validateQuestionSetIds(questionSetIds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QaObject other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QaObject> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static QaObject create(final org.dressdiscover.api.models.qa.QaObjectId id, final org.dressdiscover.api.models.qa.QaImage image, final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
        return new QaObject(id, image, questionSetIds, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QaObject)) {
            return false;
        }

        final QaObject other = (QaObject)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(getImage().equals(other.getImage()))) {
            return false;
        }

        if (!(getQuestionSetIds().equals(other.getQuestionSetIds()))) {
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
        case IMAGE: return getImage();
        case QUESTION_SET_IDS: return getQuestionSetIds();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.qa.QaObjectId getId() {
        return id;
    }

    public final org.dressdiscover.api.models.qa.QaImage getImage() {
        return image;
    }

    public final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> getQuestionSetIds() {
        return questionSetIds;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getImage().hashCode();
        hashCode = 31 * hashCode + getQuestionSetIds().hashCode();
        return hashCode;
    }

    public static QaObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QaObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QaObjectId id = null;
        org.dressdiscover.api.models.qa.QaImage image = null;
        com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds = null;

        try {
            iprot.readListBegin();
            try {
                id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
            }
            image = org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot);
            try {
                questionSetIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_IDS, e.getCause());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QaObject(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateImage(image), DefaultReadValidator.getInstance().validateQuestionSetIds(questionSetIds), NopConstructionValidator.getInstance());
    }

    public static QaObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.qa.QaObjectId id = null;
        org.dressdiscover.api.models.qa.QaImage image = null;
        com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds = null;

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
                        id = org.dressdiscover.api.models.qa.QaObjectId.parse(iprot.readString());
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, e);
                    }
                    break;
                }
                case "image": {
                    image = org.dressdiscover.api.models.qa.QaImage.readAsStruct(iprot);
                    break;
                }
                case "question_set_ids": {
                    try {
                        questionSetIds = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUESTION_SET_IDS, e.getCause());
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
        return new QaObject(DefaultReadValidator.getInstance().validateId(id), DefaultReadValidator.getInstance().validateImage(image), DefaultReadValidator.getInstance().validateQuestionSetIds(questionSetIds), NopConstructionValidator.getInstance());
    }

    public QaObject replaceId(final org.dressdiscover.api.models.qa.QaObjectId id) {
        return new QaObject(DefaultConstructionValidator.getInstance().validateId(id), this.image, this.questionSetIds, NopConstructionValidator.getInstance());
    }

    public QaObject replaceImage(final org.dressdiscover.api.models.qa.QaImage image) {
        return new QaObject(this.id, DefaultConstructionValidator.getInstance().validateImage(image), this.questionSetIds, NopConstructionValidator.getInstance());
    }

    public QaObject replaceQuestionSetIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds) {
        return new QaObject(this.id, this.image, DefaultConstructionValidator.getInstance().validateQuestionSetIds(questionSetIds), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("image", getImage()).add("question_set_ids", getQuestionSetIds()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getId().toString());

        getImage().writeAsStruct(oprot);

        oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getQuestionSetIds().size());
        for (final org.dressdiscover.api.models.qa.QuestionSetId _iter0 : getQuestionSetIds()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeSetEnd();

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QaObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("id", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("image", org.thryft.protocol.Type.STRUCT, (short)0);
        getImage().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("question_set_ids", org.thryft.protocol.Type.SET, (short)0);
        oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getQuestionSetIds().size());
        for (final org.dressdiscover.api.models.qa.QuestionSetId _iter0 : getQuestionSetIds()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeSetEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.qa.QaObjectId id;

    private final org.dressdiscover.api.models.qa.QaImage image;

    private final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.qa.QuestionSetId> questionSetIds;
}
