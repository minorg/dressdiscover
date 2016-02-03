package net.lab1318.costume.api.services.object;

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
            public static class Builder {
                public Builder() {
                    options = com.google.common.base.Optional.absent();
                    query = com.google.common.base.Optional.absent();
                }

                public Builder(final GetObjectSummariesRequest other) {
                    this.options = other.getOptions();
                    this.query = other.getQuery();
                }

                protected GetObjectSummariesRequest _build(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) {
                    return new GetObjectSummariesRequest(options, query);
                }

                public GetObjectSummariesRequest build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing options"), com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing query"));
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> getOptions() {
                    return options;
                }

                public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> getQuery() {
                    return query;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                    if (__list.getSize() > 0) {
                        options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                    }
                    if (__list.getSize() > 1) {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "options": {
                            options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                            break;
                        }
                        case "query": {
                            query = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                    return this;
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

                public Builder setOptions(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) {
                    this.options = com.google.common.base.Preconditions.checkNotNull(options);
                    return this;
                }

                public Builder setOptions(@javax.annotation.Nullable final net.lab1318.costume.api.services.object.GetObjectSummariesOptions options) {
                    this.options = com.google.common.base.Optional.fromNullable(options);
                    return this;
                }

                public Builder setQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) {
                    this.query = com.google.common.base.Preconditions.checkNotNull(query);
                    return this;
                }

                public Builder setQuery(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectQuery query) {
                    this.query = com.google.common.base.Optional.fromNullable(query);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "options": setOptions((net.lab1318.costume.api.services.object.GetObjectSummariesOptions)value); return this;
                    case "query": setQuery((net.lab1318.costume.api.models.object.ObjectQuery)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetOptions() {
                    this.options = com.google.common.base.Optional.absent();
                    return this;
                }

                public Builder unsetQuery() {
                    this.query = com.google.common.base.Optional.absent();
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "options": return unsetOptions();
                    case "query": return unsetQuery();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options;
                private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                OPTIONS("options", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.GetObjectSummariesOptions>() {}, false, 0, "options", org.thryft.protocol.Type.STRUCT),
                QUERY("query", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectQuery>() {}, false, 0, "query", org.thryft.protocol.Type.STRUCT);

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

            /**
             * Default constructor
             */
            public GetObjectSummariesRequest() {
                options = com.google.common.base.Optional.absent();
                query = com.google.common.base.Optional.absent();
            }

            /**
             * Copy constructor
             */
            public GetObjectSummariesRequest(final GetObjectSummariesRequest other) {
                this(other.getOptions(), other.getQuery());
            }

            /**
             * Total Nullable constructor
             */
            public GetObjectSummariesRequest(final @javax.annotation.Nullable net.lab1318.costume.api.services.object.GetObjectSummariesOptions options, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectQuery query) {
                this.options = com.google.common.base.Optional.fromNullable(options);
                this.query = com.google.common.base.Optional.fromNullable(query);
            }

            /**
             * Optional constructor
             */
            public GetObjectSummariesRequest(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) {
                this.options = com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing options");
                this.query = com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.GetObjectSummariesRequest: missing query");
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
                } else if (!(otherObject instanceof GetObjectSummariesRequest)) {
                    return false;
                }

                final GetObjectSummariesRequest other = (GetObjectSummariesRequest)otherObject;
                return
                    getOptions().equals(other.getOptions()) &&
                    getQuery().equals(other.getQuery());
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

            public final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> getOptions() {
                return options;
            }

            public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> getQuery() {
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

            @Override
            public boolean isEmpty() {
                return !getOptions().isPresent() && !getQuery().isPresent();
            }

            public static GetObjectSummariesRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                }
                if (__list.getSize() > 1) {
                    query = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
                }
                iprot.readListEnd();
                try {
                    return new GetObjectSummariesRequest(options, query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query = com.google.common.base.Optional.absent();

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "options": {
                        options = com.google.common.base.Optional.of(net.lab1318.costume.api.services.object.GetObjectSummariesOptions.readAsStruct(iprot));
                        break;
                    }
                    case "query": {
                        query = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectQuery.readAsStruct(iprot));
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
                try {
                    return new GetObjectSummariesRequest(options, query);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectSummariesRequest replaceOptions(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) {
                return new GetObjectSummariesRequest(options, this.query);
            }

            public GetObjectSummariesRequest replaceOptions(final net.lab1318.costume.api.services.object.GetObjectSummariesOptions options) {
                return replaceOptions(com.google.common.base.Optional.fromNullable(options));
            }

            public GetObjectSummariesRequest replaceQuery(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) {
                return new GetObjectSummariesRequest(this.options, query);
            }

            public GetObjectSummariesRequest replaceQuery(final net.lab1318.costume.api.models.object.ObjectQuery query) {
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesRequest");
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

            private final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options;

            private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query;
        }

        public final static class GetObjectSummariesResponse implements org.thryft.Struct {
            public static class Builder {
                public Builder() {
                    returnValue = null;
                }

                public Builder(final GetObjectSummariesResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetObjectSummariesResponse _build(final net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue) {
                    return new GetObjectSummariesResponse(returnValue);
                }

                public GetObjectSummariesResponse build() {
                    return _build(com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.GetObjectSummariesResponse: missing returnValue"));
                }

                public final net.lab1318.costume.api.services.object.GetObjectSummariesResult getReturnValue() {
                    return returnValue;
                }

                public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    switch (type) {
                    case LIST:
                        return readAsList(iprot);
                    case STRUCT:
                        return readAsStruct(iprot);
                    default:
                        throw new IllegalArgumentException("cannot read as " + type);
                    }
                }

                public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    iprot.readListBegin();
                    returnValue = net.lab1318.costume.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
                    iprot.readListEnd();
                    return this;
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
                }

                public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "return_value": {
                            returnValue = net.lab1318.costume.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
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
                    return this;
                }

                public Builder setIfPresent(final GetObjectSummariesResponse other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setReturnValue(other.getReturnValue());

                    return this;
                }

                public Builder setReturnValue(final net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue) {
                    this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
                    return this;
                }

                public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": setReturnValue((net.lab1318.costume.api.services.object.GetObjectSummariesResult)value); return this;
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                public Builder unsetReturnValue() {
                    this.returnValue = null;
                    return this;
                }

                public Builder unset(final String name) {
                    com.google.common.base.Preconditions.checkNotNull(name);

                    switch (name.toLowerCase()) {
                    case "return_value": return unsetReturnValue();
                    default:
                        throw new IllegalArgumentException(name);
                    }
                }

                private net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue;
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                RETURN_VALUE("returnValue", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.services.object.GetObjectSummariesResult>() {}, true, 0, "return_value", org.thryft.protocol.Type.STRUCT);

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

            /**
             * Copy constructor
             */
            public GetObjectSummariesResponse(final GetObjectSummariesResponse other) {
                this(other.getReturnValue());
            }

            /**
             * Optional constructor
             */
            public GetObjectSummariesResponse(final net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "net.lab1318.costume.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing returnValue");
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

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetObjectSummariesResponse)) {
                    return false;
                }

                final GetObjectSummariesResponse other = (GetObjectSummariesResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
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

            public final net.lab1318.costume.api.services.object.GetObjectSummariesResult getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public static GetObjectSummariesResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static GetObjectSummariesResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue = null;

                iprot.readListBegin();
                returnValue = net.lab1318.costume.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
                iprot.readListEnd();
                try {
                    return new GetObjectSummariesResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static GetObjectSummariesResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue = null;

                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "return_value": {
                        returnValue = net.lab1318.costume.api.services.object.GetObjectSummariesResult.readAsStruct(iprot);
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
                try {
                    return new GetObjectSummariesResponse(returnValue);
                } catch (final IllegalArgumentException | NullPointerException e) {
                    throw new org.thryft.protocol.InputProtocolException(e);
                }
            }

            public GetObjectSummariesResponse replaceReturnValue(final net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue) {
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
                oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectSummariesResponse");
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

            private final net.lab1318.costume.api.services.object.GetObjectSummariesResult returnValue;
        }
    }

    public default net.lab1318.costume.api.services.object.GetObjectSummariesResult getObjectSummaries() throws net.lab1318.costume.api.services.IoException {
        return getObjectSummaries(com.google.common.base.Optional.<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> absent(), com.google.common.base.Optional.<net.lab1318.costume.api.models.object.ObjectQuery> absent());
    }

    public default net.lab1318.costume.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options) throws net.lab1318.costume.api.services.IoException {
        return getObjectSummaries(options, com.google.common.base.Optional.<net.lab1318.costume.api.models.object.ObjectQuery> absent());
    }

    public net.lab1318.costume.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException;
}
