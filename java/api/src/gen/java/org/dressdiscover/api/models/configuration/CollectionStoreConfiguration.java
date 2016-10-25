package org.dressdiscover.api.models.configuration;

public final class CollectionStoreConfiguration implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            type = null;
            parameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
        }

        public Builder(final CollectionStoreConfiguration other) {
            this.type = other.getType();
            this.parameters = other.getParameters();
        }

        protected CollectionStoreConfiguration _build(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            return new CollectionStoreConfiguration(type, parameters, DefaultConstructionValidator.getInstance());
        }

        public CollectionStoreConfiguration build() {
            return _build(type, parameters);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getParameters() {
            return parameters;
        }

        public final String getType() {
            return type;
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
                type = iprot.readString();
                if (__list.getSize() > 1) {
                    try {
                        parameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final String value;
                                        value = iprot.readString();
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
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
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            type = iprot.readString();
                        }
                        break;
                    }
                    case "parameters": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                parameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                            final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                                final String key;
                                                key = iprot.readString();
                                                final String value;
                                                value = iprot.readString();
                                                map.put(key, value);
                                            }
                                            iprot.readMapEnd();
                                            return map.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
                            }
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
            case TYPE: setType((String)value); return this;
            case PARAMETERS: setParameters((com.google.common.collect.ImmutableMap<String, String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final CollectionStoreConfiguration other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getParameters().isPresent()) {
                setParameters(other.getParameters());
            }

            return this;
        }

        public Builder setParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            this.parameters = DefaultConstructionValidator.getInstance().validateParameters(parameters);
            return this;
        }

        public Builder setParameters(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> parameters) {
            return setParameters(com.google.common.base.Optional.fromNullable(parameters));
        }

        public Builder setType(final String type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
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
            case TYPE: return unsetType();
            case PARAMETERS: return unsetParameters();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetParameters() {
            this.parameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        private String type;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<CollectionStoreConfiguration> {
        @Override
        public CollectionStoreConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return CollectionStoreConfiguration.readAs(iprot, type);
        }

        @Override
        public CollectionStoreConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CollectionStoreConfiguration.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public CollectionStoreConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionStoreConfiguration.readAsList(iprot);
        }

        @Override
        public CollectionStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CollectionStoreConfiguration.readAsStruct(iprot);
        }

        @Override
        public CollectionStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CollectionStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        PARAMETERS("parameters", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, 2, "parameters", org.thryft.protocol.Type.MAP);

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
            case "type": return TYPE;
            case "parameters": return PARAMETERS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "parameters": return PARAMETERS;
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
        public String validateType(final String type) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) throws ExceptionT;
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
        public String validateType(final String type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) throws RuntimeException {
            if (parameters == null) {
                throw new NullPointerException("org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: parameters is null");
            }
            if (!parameters.isPresent()) {
                return parameters;
            }
            if (parameters.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: parameters is less than min length 1");
            }
            return parameters;
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
        public String validateType(final String type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            return parameters;
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
        public String validateType(final String type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) throws org.thryft.protocol.InputProtocolException {
            if (parameters == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PARAMETERS, "org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: parameters is null");
            }
            if (!parameters.isPresent()) {
                return parameters;
            }
            if (parameters.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, "org.dressdiscover.api.models.configuration.CollectionStoreConfiguration: parameters is less than min length 1");
            }
            return parameters;
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
        public String validateType(final String type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            return parameters;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public CollectionStoreConfiguration(final CollectionStoreConfiguration other) {
        this(other.getType(), other.getParameters(), NopConstructionValidator.getInstance());
    }

    protected CollectionStoreConfiguration(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters, ConstructionValidator validator) {
        this.type = validator.validateType(type);
        this.parameters = validator.validateParameters(parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final CollectionStoreConfiguration other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<CollectionStoreConfiguration> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static CollectionStoreConfiguration create(final String type) {
        return new CollectionStoreConfiguration(type, com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static CollectionStoreConfiguration create(final String type, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> parameters) {
        return new CollectionStoreConfiguration(type, com.google.common.base.Optional.fromNullable(parameters), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static CollectionStoreConfiguration create(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
        return new CollectionStoreConfiguration(type, parameters, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof CollectionStoreConfiguration)) {
            return false;
        }

        final CollectionStoreConfiguration other = (CollectionStoreConfiguration)otherObject;

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getParameters().isPresent() && other.getParameters().isPresent()) ? (getParameters().get().equals(other.getParameters().get())) : (!getParameters().isPresent() && !other.getParameters().isPresent())))) {
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
        case TYPE: return getType();
        case PARAMETERS: return getParameters();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getParameters() {
        return parameters;
    }

    public final String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().hashCode();
        if (getParameters().isPresent()) {
            hashCode = 31 * hashCode + getParameters().get().hashCode();
        }
        return hashCode;
    }

    public static CollectionStoreConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CollectionStoreConfiguration readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static CollectionStoreConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String type = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            type = iprot.readString();
            if (__list.getSize() > 1) {
                try {
                    parameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final String value;
                                    value = iprot.readString();
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new CollectionStoreConfiguration(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateParameters(parameters), NopConstructionValidator.getInstance());
    }

    public static CollectionStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CollectionStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String type = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        type = iprot.readString();
                    }
                    break;
                }
                case "parameters": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            parameters = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final String value;
                                            value = iprot.readString();
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
                        }
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
        return new CollectionStoreConfiguration(DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateParameters(parameters), NopConstructionValidator.getInstance());
    }

    public CollectionStoreConfiguration replaceParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
        return new CollectionStoreConfiguration(this.type, DefaultConstructionValidator.getInstance().validateParameters(parameters), NopConstructionValidator.getInstance());
    }

    public CollectionStoreConfiguration replaceParameters(final com.google.common.collect.ImmutableMap<String, String> parameters) {
        return replaceParameters(com.google.common.base.Optional.fromNullable(parameters));
    }

    public CollectionStoreConfiguration replaceType(final String type) {
        return new CollectionStoreConfiguration(DefaultConstructionValidator.getInstance().validateType(type), this.parameters, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("parameters", getParameters().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getType());

        if (getParameters().isPresent()) {
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.configuration.CollectionStoreConfiguration");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getType());
        oprot.writeFieldEnd();

        if (getParameters().isPresent()) {
            oprot.writeFieldBegin("parameters", org.thryft.protocol.Type.MAP, (short)2);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String type;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters;
}
