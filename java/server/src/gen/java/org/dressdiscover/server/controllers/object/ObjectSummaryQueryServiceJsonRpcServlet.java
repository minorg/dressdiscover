package org.dressdiscover.server.controllers.object;

@com.google.inject.Singleton
@SuppressWarnings({ "serial", "unused" })
public class ObjectSummaryQueryServiceJsonRpcServlet extends org.thryft.waf.server.controllers.AbstractJsonRpcServlet {
    @com.google.inject.Inject
    public ObjectSummaryQueryServiceJsonRpcServlet(final org.dressdiscover.api.services.object.ObjectSummaryQueryService service) {
        this.service = service;
    }

    @Override
    protected final org.thryft.Struct _dispatch(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final String methodName) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        switch (methodName) {
        case "get_object_summaries": return __dispatchGetObjectSummaries(iprot);
        default:
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", methodName));
        }
    }

    private Messages.GetObjectSummariesResponse __dispatchGetObjectSummaries(final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot) throws org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse {
        final Messages.GetObjectSummariesRequest serviceRequest = _readRequest(iprot, Messages.GetObjectSummariesRequest.Factory.INSTANCE);
        try {
            return new Messages.GetObjectSummariesResponse(service.getObjectSummaries(serviceRequest.getOptions(), serviceRequest.getQuery()));
        } catch (final org.dressdiscover.api.services.IoException e) {
            throw new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e);
        }
    }

    private final org.dressdiscover.api.services.object.ObjectSummaryQueryService service;

    private final static class Messages {
        public final static class GetObjectSummariesRequest implements org.thryft.Struct {
            public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GetObjectSummariesRequest> {
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
                    Validator.validate(options, query);

                    return _build(options, query);
                }

                public final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> getOptions() {
                    return options;
                }

                public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> getQuery() {
                    return query;
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    try {
                        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                        if (__list.getSize() > 0) {
                            this.setOptions(com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot)));
                        }
                        if (__list.getSize() > 1) {
                            this.setQuery(com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot)));
                        }
                        iprot.readListEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    try {
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                                break;
                            }
                            switch (ifield.getName()) {
                            case "options": {
                                this.setOptions(com.google.common.base.Optional.of(org.dressdiscover.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot, unknownFieldCallback)));
                                break;
                            }
                            case "query": {
                                this.setQuery(com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectQuery.readAsStruct(iprot, unknownFieldCallback)));
                                break;
                            }
                            default:
                                unknownFieldCallback.apply(ifield);
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        return this;
                    } catch (final org.thryft.ThryftValidationException e) {
                        throw new org.thryft.protocol.InputProtocolException(e);
                    } catch (final RuntimeException e) {
                        throw new IllegalStateException(e);
                    }
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
                    Validator.validateOptions(options);
                    this.options = options;
                    return this;
                }

                public Builder setOptions(final @javax.annotation.Nullable org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                    return setOptions(com.google.common.base.Optional.fromNullable(options));
                }

                public Builder setQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    Validator.validateQuery(query);
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
                public final static Factory INSTANCE = new Factory();

                @Override
                public GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsList(iprot);
                }

                @Override
                public GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsStruct(iprot);
                }

                @Override
                public GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return GetObjectSummariesRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OPTIONS("options", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesOptions>() {}, false, (short)0, "options", "options", org.thryft.protocol.Type.STRUCT),
                QUERY("query", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectQuery>() {}, false, (short)0, "query", "query", org.thryft.protocol.Type.STRUCT);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    validateOptions(options);
                    validateQuery(query);
                }

                public static void validateOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                    if (options == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: options is missing");
                    }
                }

                public static void validateQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                    if (query == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.object.GetObjectSummariesRequest: query is missing");
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
             */
            public GetObjectSummariesRequest(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                Validator.validate(options, query);
                this.options = options;
                this.query = query;
            }

            /**
             * Total Nullable constructor
             */
            public GetObjectSummariesRequest(@javax.annotation.Nullable final org.dressdiscover.api.services.object.GetObjectSummariesOptions options, @javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectQuery query) {
                this(com.google.common.base.Optional.fromNullable(options), com.google.common.base.Optional.fromNullable(query));
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

            public static GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsList(iprot).build();
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                return builder().readAsStruct(iprot, unknownFieldCallback).build();
            }

            public GetObjectSummariesRequest replaceOptions(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) {
                Validator.validateOptions(options);
                return new GetObjectSummariesRequest(options, this.query);
            }

            public GetObjectSummariesRequest replaceOptions(@javax.annotation.Nullable final org.dressdiscover.api.services.object.GetObjectSummariesOptions options) {
                return replaceOptions(com.google.common.base.Optional.fromNullable(options));
            }

            public GetObjectSummariesRequest replaceQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
                Validator.validateQuery(query);
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
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<org.dressdiscover.api.services.object.GetObjectSummariesResult>() {}, true, (short)0, "return_value", "return_value", org.thryft.protocol.Type.STRUCT);

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

                private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
                    this.javaName = javaName;
                    this.javaType = javaType;
                    this.required = required;
                    this.thriftId = thriftId;
                    this.thriftName = thriftName;
                    this.thriftProtocolKey = thriftProtocolKey;
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

            public final static class Validator {
                public static void validate(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    validateReturnValue(returnValue);
                }

                public static void validateReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                    if (returnValue == null) {
                        throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.object.GetObjectSummariesResponse: returnValue is missing");
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
             */
            public GetObjectSummariesResponse(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                Validator.validate(returnValue);
                this.returnValue = returnValue;
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
                return getReturnValue().hashCode();
            }

            public GetObjectSummariesResponse replaceReturnValue(final org.dressdiscover.api.services.object.GetObjectSummariesResult returnValue) {
                Validator.validateReturnValue(returnValue);
                return new GetObjectSummariesResponse(returnValue);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("return_value", getReturnValue()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);
                writeFieldValues(oprot);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.object.GetObjectSummariesResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                getReturnValue().writeAsStruct(oprot);
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
}
