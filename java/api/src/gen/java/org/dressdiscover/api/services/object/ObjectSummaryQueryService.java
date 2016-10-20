package org.dressdiscover.api.services.object;

public interface ObjectSummaryQueryService {
    public enum FunctionMetadata {
        GET_OBJECT_SUMMARIES("get_object_summaries");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class GetObjectSummariesRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                    query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
                }

                public Builder(final GetObjectSummariesRequest other) {
                    this.options = other.getOptions();
                    this.query = other.getQuery();
                }

                protected GetObjectSummariesRequest _build(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    return new GetObjectSummariesRequest(options, query, DefaultConstructionValidator.getInstance());
                }

                public GetObjectSummariesRequest build() {
                    return _build(options, query);
                }

                public final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> getOptions() {
                    return options;
                }

                public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> getQuery() {
                    return query;
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
                            options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                        }
                        if (__list.getSize() > 1) {
                            query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                            case "options": {
                                options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                                break;
                            }
                            case "query": {
                                query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                    case OPTIONS: setOptions((org.dressdiscover.api.services.object.GetObjectSummariesOptions)value); return this;
                    case QUERY: setQuery((org.dressdiscover.api.models.object.ObjectQuery)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetObjectSummariesRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    if (other.getOptions().isPresent()) {
                        setOptions(other.getOptions());
                    }
                    if (other.getQuery().isPresent()) {
                        setQuery(other.getQuery());
                    }

                    return this;
                }

                public Builder setOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                    this.options = DefaultConstructionValidator.getInstance().validateOptions(options);
                    return this;
                }

                public Builder setOptions(@javax.annotation.Nullable final org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                    return setOptions(com.google.common.base.Optional.fromNullable(options));
                }

                public Builder setQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    this.query = DefaultConstructionValidator.getInstance().validateQuery(query);
                    return this;
                }

                public Builder setQuery(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectQuery query) {
                    return setQuery(com.google.common.base.Optional.fromNullable(query));
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
                    case OPTIONS: return unsetOptions();
                    case QUERY: return unsetQuery();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetOptions() {
                    this.options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                    return this;
                }

                public Builder unsetQuery() {
                    this.query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
                    return this;
                }

                private com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options;
                private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectSummariesRequest> {
                @Override
                public GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAs(iprot, type);
                }

                @Override
                public GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsList(iprot);
                }

                @Override
                public GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsStruct(iprot);
                }

                @Override
                public GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OPTIONS("options", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesOptions>() {}, false, 0, "options", org.thryft.protocol.Type.STRUCT),
                QUERY("query", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectQuery>() {}, false, 0, "query", org.thryft.protocol.Type.STRUCT);

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
                    case "options": return OPTIONS;
                    case "query": return QUERY;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "options": return OPTIONS;
                    case "query": return QUERY;
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
                public com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws ExceptionT;

                public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws ExceptionT;
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
                public com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws RuntimeException {
                    if (options == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: options is null");
                    }
                    if (!options.isPresent()) {
                        return options;
                    }
                    return options;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws RuntimeException {
                    if (query == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: query is null");
                    }
                    if (!query.isPresent()) {
                        return query;
                    }
                    return query;
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
                public com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                    return options;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    return query;
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
                public com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws org.thryft.protocol.InputProtocolException {
                    if (options == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OPTIONS, "org.dressdiscover.api.services.object.GetObjectSummariesRequest: options is null");
                    }
                    if (!options.isPresent()) {
                        return options;
                    }
                    return options;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.thryft.protocol.InputProtocolException {
                    if (query == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERY, "org.dressdiscover.api.services.object.GetObjectSummariesRequest: query is null");
                    }
                    if (!query.isPresent()) {
                        return query;
                    }
                    return query;
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
                public com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                    return options;
                }

                @Override
                public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    return query;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Default constructor
             */
            public GetObjectSummariesRequest() {
                options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesRequest(final GetObjectSummariesRequest other) {
                this(other.getOptions(), other.getQuery(), NopConstructionValidator.getInstance());
            }

            protected GetObjectSummariesRequest(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query, ConstructionValidator validator) {
                this.options = validator.validateOptions(options);
                this.query = validator.validateQuery(query);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectSummariesRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            public static GetObjectSummariesRequest create() {
                return new GetObjectSummariesRequest();
            }

            /**
             * Total Nullable factory method
             */
            public static GetObjectSummariesRequest create(final @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesOptions options, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectQuery query) {
                return new GetObjectSummariesRequest(com.google.common.base.Optional.fromNullable(options), com.google.common.base.Optional.fromNullable(query), DefaultConstructionValidator.getInstance());
            }

            /**
             * Optional factory method
             */
            public static GetObjectSummariesRequest create(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                return new GetObjectSummariesRequest(options, query, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectSummariesRequest)) {
                    return false;
                }

                final GetObjectSummariesRequest other = (GetObjectSummariesRequest)otherObject;

                if (!(((getOptions().isPresent() && other.getOptions().isPresent()) ? (getOptions().get().equals(other.getOptions().get())) : (!getOptions().isPresent() && !other.getOptions().isPresent())))) {
                    return false;
                }

                if (!(((getQuery().isPresent() && other.getQuery().isPresent()) ? (getQuery().get().equals(other.getQuery().get())) : (!getQuery().isPresent() && !other.getQuery().isPresent())))) {
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
                case OPTIONS: return getOptions();
                case QUERY: return getQuery();
                default:
                    throw new IllegalStateException();
                }
            }

            public final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> getOptions() {
                return options;
            }

            public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getOptions().isPresent()) {
                    hashCode = 31 * hashCode + getOptions().get().hashCode();
                }
                if (getQuery().isPresent()) {
                    hashCode = 31 * hashCode + getQuery().get().hashCode();
                }
                return hashCode;
            }

            public static GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();

                try {
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    if (__list.getSize() > 0) {
                        options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                    }
                    if (__list.getSize() > 1) {
                        query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectSummariesRequest(DefaultReadValidator.getInstance().validateOptions(options), DefaultReadValidator.getInstance().validateQuery(query), NopConstructionValidator.getInstance());
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "options": {
                            options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                            break;
                        }
                        case "query": {
                            query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                return new GetObjectSummariesRequest(DefaultReadValidator.getInstance().validateOptions(options), DefaultReadValidator.getInstance().validateQuery(query), NopConstructionValidator.getInstance());
            }

            public GetObjectSummariesRequest replaceOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                return new GetObjectSummariesRequest(DefaultConstructionValidator.getInstance().validateOptions(options), this.query, NopConstructionValidator.getInstance());
            }

            public GetObjectSummariesRequest replaceOptions(final org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                return replaceOptions(com.google.common.base.Optional.fromNullable(options));
            }

            public GetObjectSummariesRequest replaceQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                return new GetObjectSummariesRequest(this.options, DefaultConstructionValidator.getInstance().validateQuery(query), NopConstructionValidator.getInstance());
            }

            public GetObjectSummariesRequest replaceQuery(final org.dressdiscover.api.models.object.ObjectQuery query) {
                return replaceQuery(com.google.common.base.Optional.fromNullable(query));
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("options", getOptions().orNull()).add("query", getQuery().orNull()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

                if (getOptions().isPresent()) {
                    getOptions().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

                if (getQuery().isPresent()) {
                    getQuery().get().writeAsStruct(oprot);
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getOptions().isPresent()) {
                    oprot.writeFieldBegin("options", org.thryft.protocol.Type.STRUCT, (short)0);
                    getOptions().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                if (getQuery().isPresent()) {
                    oprot.writeFieldBegin("query", org.thryft.protocol.Type.STRUCT, (short)0);
                    getQuery().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();
            }

            private final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options;

            private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query;
        }

        public final static class GetObjectSummariesResponse implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectSummariesResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectSummariesResponse _build(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    return new GetObjectSummariesResponse(returnValue, DefaultConstructionValidator.getInstance());
                }

                public GetObjectSummariesResponse build() {
                    return _build(returnValue);
                }

                public final org.dressdiscover.api.services.object.GetObjectSummariesResult getReturnValue() {
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
                        returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
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
                                returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
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
                    case RETURN_VALUE: setReturnValue((org.dressdiscover.api.services.object.GetObjectSummariesResult)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final GetObjectSummariesResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
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

                private org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<GetObjectSummariesResponse> {
                @Override
                public GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesResponse.readAs(iprot, type);
                }

                @Override
                public GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public GetObjectSummariesResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesResponse.readAsList(iprot);
                }

                @Override
                public GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesResponse.readAsStruct(iprot);
                }

                @Override
                public GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesResult>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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
                public org.dressdiscover.api.services.object.GetObjectSummariesResult validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) throws ExceptionT;
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
                public org.dressdiscover.api.services.object.GetObjectSummariesResult validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) throws RuntimeException {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResponse: returnValue is null");
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
                public org.dressdiscover.api.services.object.GetObjectSummariesResult validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
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
                public org.dressdiscover.api.services.object.GetObjectSummariesResult validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.object.GetObjectSummariesResponse: returnValue is null");
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
                public org.dressdiscover.api.services.object.GetObjectSummariesResult validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    return returnValue;
                }

                private final static NopReadValidator instance = new NopReadValidator();
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesResponse(final GetObjectSummariesResponse other) {
                this(other.getReturnValue(), NopConstructionValidator.getInstance());
            }

            protected GetObjectSummariesResponse(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue, ConstructionValidator validator) {
                this.returnValue = validator.validateReturnValue(returnValue);
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final GetObjectSummariesResponse other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<GetObjectSummariesResponse> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static GetObjectSummariesResponse create(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                return new GetObjectSummariesResponse(returnValue, DefaultConstructionValidator.getInstance());
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof GetObjectSummariesResponse)) {
                    return false;
                }

                final GetObjectSummariesResponse other = (GetObjectSummariesResponse)otherObject;

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

            public final org.dressdiscover.api.services.object.GetObjectSummariesResult getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public static GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue = null;

                try {
                    iprot.readListBegin();
                    returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }
                return new GetObjectSummariesResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
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
                return new GetObjectSummariesResponse(DefaultReadValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            public GetObjectSummariesResponse replaceReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                return new GetObjectSummariesResponse(DefaultConstructionValidator.getInstance().validateReturnValue(returnValue), NopConstructionValidator.getInstance());
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getReturnValue().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin("return_value", org.thryft.protocol.Type.STRUCT, (short)0);
                getReturnValue().writeAsStruct(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();
            }

            private final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue;
        }
    }

    public default org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries() throws org.dressdiscover.api.services.IoException {
        return getObjectSummaries(com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent());
    }

    public default org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws org.dressdiscover.api.services.IoException {
        return getObjectSummaries(options, com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent());
    }

    public org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.dressdiscover.api.services.IoException;
}
