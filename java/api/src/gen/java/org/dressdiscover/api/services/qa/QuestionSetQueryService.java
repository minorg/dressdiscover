package org.dressdiscover.api.services.qa;

public interface QuestionSetQueryService {
    public enum FunctionMetadata {
        GET_QUESTION_SETS("get_question_sets");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetQuestionSetsRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    ids = null;
                }

                public Builder(final GetQuestionSetsRequest other) {
                    this.ids = other.getIds();
                }

                protected GetQuestionSetsRequest _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                    return new GetQuestionSetsRequest(ids, DefaultConstructionValidator.getInstance());
                }

                public GetQuestionSetsRequest build() {
                    return _build(ids);
                }

                public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> getIds() {
                    return ids;
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
                            ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDS, e.getCause());
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
                            case "ids": {
                                try {
                                    ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    try {
                                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
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
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDS, e.getCause());
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
                    case IDS: setIds((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                    this.ids = DefaultConstructionValidator.getInstance().validateIds(ids);
                    return this;
                }

                public Builder setIfPresent(final GetQuestionSetsRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setIds(other.getIds());

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
                    case IDS: return unsetIds();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetIds() {
                    this.ids = null;
                    return this;
                }

                private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetQuestionSetsRequest> {
                @Override
                public GetQuestionSetsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsRequest.readAs(iprot, type);
                }

                @Override
                public GetQuestionSetsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetQuestionSetsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsRequest.readAsList(iprot);
                }

                @Override
                public GetQuestionSetsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsRequest.readAsStruct(iprot);
                }

                @Override
                public GetQuestionSetsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                IDS("ids", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>>() {}, true, 0, "ids", org.thryft.protocol.Type.LIST);

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
                    case "ids": return IDS;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "ids": return IDS;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> validateIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws ExceptionT;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> validateIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws RuntimeException {
                    if (ids == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetQuestionSetsRequest: ids is null");
                    }
                    return ids;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> validateIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                    return ids;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> validateIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws org.thryft.protocol.InputProtocolException {
                    if (ids == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IDS, "org.dressdiscover.api.services.qa.GetQuestionSetsRequest: ids is null");
                    }
                    return ids;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> validateIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                    return ids;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetQuestionSetsRequest(final GetQuestionSetsRequest other) {
                this(other.getIds(), NopConstructionValidator.getInstance());
            }

            protected GetQuestionSetsRequest(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids, ConstructionValidator validator) {
                this.ids = validator.validateIds(ids);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetQuestionSetsRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetQuestionSetsRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetQuestionSetsRequest create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                return new GetQuestionSetsRequest(ids, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetQuestionSetsRequest)) {
                    return false;
                }

                final GetQuestionSetsRequest other = (GetQuestionSetsRequest)otherObject;

                if (!(getIds().equals(other.getIds()))) {
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
                case IDS: return getIds();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> getIds() {
                return ids;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getIds().hashCode();
                return hashCode;
            }

            public static GetQuestionSetsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetQuestionSetsRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetQuestionSetsRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids = null;

                try {
                    iprot.readListBegin();
                    try {
                        ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDS, e.getCause());
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetQuestionSetsRequest(DefaultReadValidator.getInstance().validateIds(ids), NopConstructionValidator.getInstance());
            }

            public static GetQuestionSetsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetQuestionSetsRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "ids": {
                            try {
                                ids = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSetId> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                try {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSetId.parse(iprot.readString()));
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDS, e.getCause());
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
                return new GetQuestionSetsRequest(DefaultReadValidator.getInstance().validateIds(ids), NopConstructionValidator.getInstance());
            }

            public GetQuestionSetsRequest replaceIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
                return new GetQuestionSetsRequest(DefaultConstructionValidator.getInstance().validateIds(ids), NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ids", getIds()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIds().size());
                for (final org.dressdiscover.api.models.qa.QuestionSetId _iter0 : getIds()) {
                    oprot.writeString(_iter0.toString());
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetQuestionSetsRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("ids", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIds().size());
                for (final org.dressdiscover.api.models.qa.QuestionSetId _iter0 : getIds()) {
                    oprot.writeString(_iter0.toString());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids;
        }

        public final static class GetQuestionSetsResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetQuestionSetsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetQuestionSetsResponse _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
                    return new GetQuestionSetsResponse(returnValue, DefaultConstructionValidator.getInstance());
                }

                public GetQuestionSetsResponse build() {
                    return _build(returnValue);
                }

                public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getReturnValue() {
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
                            returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSet.readAsStruct(iprot));
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
                                    returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSet.readAsStruct(iprot));
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
                    case RETURN_VALUE: setReturnValue((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetQuestionSetsResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
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

                private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetQuestionSetsResponse> {
                @Override
                public GetQuestionSetsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsResponse.readAs(iprot, type);
                }

                @Override
                public GetQuestionSetsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetQuestionSetsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsResponse.readAsList(iprot);
                }

                @Override
                public GetQuestionSetsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsResponse.readAsStruct(iprot);
                }

                @Override
                public GetQuestionSetsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetQuestionSetsResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>>() {}, true, 0, "return_value", org.thryft.protocol.Type.LIST);

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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) throws ExceptionT;
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) throws RuntimeException {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.qa.GetQuestionSetsResponse: returnValue is null");
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.qa.GetQuestionSetsResponse: returnValue is null");
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
                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> validateReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
                    return returnValue;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetQuestionSetsResponse(final GetQuestionSetsResponse other) {
                this(other.getReturnValue(), NopConstructionValidator.getInstance());
            }

            protected GetQuestionSetsResponse(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue, ConstructionValidator validator) {
                this.returnValue = validator.validateReturnValue(returnValue);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetQuestionSetsResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetQuestionSetsResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetQuestionSetsResponse create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
                return new GetQuestionSetsResponse(returnValue, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetQuestionSetsResponse)) {
                    return false;
                }

                final GetQuestionSetsResponse other = (GetQuestionSetsResponse)otherObject;

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

            public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetQuestionSetsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetQuestionSetsResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetQuestionSetsResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue = null;

                try {
                    iprot.readListBegin();
                    try {
                        returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSet.readAsStruct(iprot));
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
                return new GetQuestionSetsResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public static GetQuestionSetsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetQuestionSetsResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue = null;

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
                                returnValue = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.qa.QuestionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.qa.QuestionSet.readAsStruct(iprot));
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
                return new GetQuestionSetsResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public GetQuestionSetsResponse replaceReturnValue(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue) {
                return new GetQuestionSetsResponse(DefaultConstructionValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.QuestionSet _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.qa.GetQuestionSetsResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.LIST, (short)0);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getReturnValue().size());
                for (final org.dressdiscover.api.models.qa.QuestionSet _iter0 : getReturnValue()) {
                    _iter0.writeAsStruct(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> returnValue;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getQuestionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionSetException;
}
