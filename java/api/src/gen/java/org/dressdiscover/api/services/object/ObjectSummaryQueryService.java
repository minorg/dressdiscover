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
                    return new GetObjectSummariesRequest(options, query);
                }

                public GetObjectSummariesRequest build() {
                    UncheckedValidator.validate(options, query);

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
                                options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot, unknownFieldCallback));
                                break;
                            }
                            case "query": {
                                query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot, unknownFieldCallback));
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
                    UncheckedValidator.validateOptions(options);
                    this.options = options;
                    return this;
                }

                public Builder setOptions(final @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                    return setOptions(com.google.common.base.Optional.fromNullable(options));
                }

                public Builder setQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    UncheckedValidator.validateQuery(query);
                    this.query = query;
                    return this;
                }

                public Builder setQuery(final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectQuery query) {
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
                OPTIONS("options", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesOptions>() {}, false, (short)0, "options", org.thryft.protocol.Type.STRUCT),
                QUERY("query", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectQuery>() {}, false, (short)0, "query", org.thryft.protocol.Type.STRUCT);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.thryft.protocol.InputProtocolException {
                    validateOptions(options);
                    validateQuery(query);
                }

                public static void validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws org.thryft.protocol.InputProtocolException {
                    if (options == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OPTIONS, "org.dressdiscover.api.services.object.GetObjectSummariesRequest: options is null");
                    }
                    if (!options.isPresent()) {
                        return;
                    }
                }

                public static void validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.thryft.protocol.InputProtocolException {
                    if (query == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERY, "org.dressdiscover.api.services.object.GetObjectSummariesRequest: query is null");
                    }
                    if (!query.isPresent()) {
                        return;
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    validateOptions(options);
                    validateQuery(query);
                }

                public static void validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                    if (options == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: options is null");
                    }
                    if (!options.isPresent()) {
                        return;
                    }
                }

                public static void validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    if (query == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: query is null");
                    }
                    if (!query.isPresent()) {
                        return;
                    }
                }
            }

            /**
             * Default constructor
             */
            @Deprecated
            public GetObjectSummariesRequest() {
                options = com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent();
                query = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesRequest(final GetObjectSummariesRequest other) {
                this(other.getOptions(), other.getQuery());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetObjectSummariesRequest(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                this.options = options;
                this.query = query;
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

            @Deprecated
            public static GetObjectSummariesRequest create() {
                return new GetObjectSummariesRequest();
            }

            /**
             * Total Nullable factory method
             */
            public static GetObjectSummariesRequest create(@javax.annotation.Nullable final org.dressdiscover.api.services.object.GetObjectSummariesOptions options, @javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectQuery query) {
                final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> optionsOptional = com.google.common.base.Optional.fromNullable(options);
                final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> queryOptional = com.google.common.base.Optional.fromNullable(query);
                UncheckedValidator.validate(optionsOptional, queryOptional);
                return new GetObjectSummariesRequest(optionsOptional, queryOptional);
            }

            /**
             * Optional factory method
             */
            public static GetObjectSummariesRequest create(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                UncheckedValidator.validate(options, query);
                return new GetObjectSummariesRequest(options, query);
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

                ReadValidator.validate(options, query);

                return new GetObjectSummariesRequest(options, query);
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
                            options = com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot, unknownFieldCallback));
                            break;
                        }
                        case "query": {
                            query = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot, unknownFieldCallback));
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

                ReadValidator.validate(options, query);

                return new GetObjectSummariesRequest(options, query);
            }

            public GetObjectSummariesRequest replaceOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                UncheckedValidator.validateOptions(options);
                return new GetObjectSummariesRequest(options, this.query);
            }

            public GetObjectSummariesRequest replaceOptions(@javax.annotation.Nullable final org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                return replaceOptions(com.google.common.base.Optional.fromNullable(options));
            }

            public GetObjectSummariesRequest replaceQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                UncheckedValidator.validateQuery(query);
                return new GetObjectSummariesRequest(this.options, query);
            }

            public GetObjectSummariesRequest replaceQuery(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectQuery query) {
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
                writeOptionsField(oprot);

                writeQueryField(oprot);

                oprot.writeFieldStop();
            }

            public void writeOptionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getOptions().isPresent()) {
                    oprot.writeFieldBegin(FieldMetadata.OPTIONS);
                    getOptions().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }
            }

            public void writeQueryField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                if (getQuery().isPresent()) {
                    oprot.writeFieldBegin(FieldMetadata.QUERY);
                    getQuery().get().writeAsStruct(oprot);
                    oprot.writeFieldEnd();
                }
            }

            public final static GetObjectSummariesRequest EMPTY = new GetObjectSummariesRequest();

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
                    return new GetObjectSummariesResponse(returnValue);
                }

                public GetObjectSummariesResponse build() {
                    UncheckedValidator.validate(returnValue);

                    return _build(returnValue);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesResult getReturnValue() {
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
                                returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot, unknownFieldCallback);
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
                    UncheckedValidator.validateReturnValue(returnValue);
                    this.returnValue = returnValue;
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

                private @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue;
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
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesResult>() {}, true, (short)0, "return_value", org.thryft.protocol.Type.STRUCT);

                @Override
                public String getJavaName() {
                    return javaName;
                }

                @Override
                public com.google.common.reflect.TypeToken<?> getJavaType() {
                    return javaType;
                }

                @Override
                public short getThriftId() {
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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
                private final short thriftId;
                private final String thriftName;
                private final String thriftProtocolKey;
                private final org.thryft.protocol.Type thriftProtocolType;
            }

            public final static class ReadValidator {
                public static void validate(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) throws org.thryft.protocol.InputProtocolException {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) throws org.thryft.protocol.InputProtocolException {
                    if (returnValue == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RETURN_VALUE, "org.dressdiscover.api.services.object.GetObjectSummariesResponse: returnValue is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    if (returnValue == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.object.GetObjectSummariesResponse: returnValue is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesResponse(final GetObjectSummariesResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected GetObjectSummariesResponse(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                this.returnValue = returnValue;
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
                UncheckedValidator.validate(returnValue);
                return new GetObjectSummariesResponse(returnValue);
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
                org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue;

                try {
                    iprot.readListBegin();
                    returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(returnValue);

                return new GetObjectSummariesResponse(returnValue);
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = org.dressdiscover.api.services.object.GetObjectSummariesResult.readAsStruct(iprot, unknownFieldCallback);
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

                ReadValidator.validate(returnValue);

                return new GetObjectSummariesResponse(returnValue);
            }

            public GetObjectSummariesResponse replaceReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                UncheckedValidator.validateReturnValue(returnValue);
                return new GetObjectSummariesResponse(returnValue);
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
                writeReturnValueField(oprot);

                oprot.writeFieldStop();
            }

            public void writeReturnValueField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.RETURN_VALUE);
                getReturnValue().writeAsStruct(oprot);
                oprot.writeFieldEnd();
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
