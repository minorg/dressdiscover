package org.dressdiscover.api.models.configuration;

public final class ObjectStoreConfiguration implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, ObjectStoreConfiguration> {
        public Builder() {
            type = null;
            parameters = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
        }

        public Builder(final ObjectStoreConfiguration other) {
            this.type = other.getType();
            this.parameters = other.getParameters();
        }

        protected ObjectStoreConfiguration _build(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            return new ObjectStoreConfiguration(type, parameters);
        }

        public ObjectStoreConfiguration build() {
            Validator.validate(type, parameters);

            return _build(type, parameters);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getParameters() {
            return parameters;
        }

        public final @javax.annotation.Nullable String getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setType(iprot.readString());
                if (__list.getSize() > 1) {
                    try {
                        this.setParameters(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
                    }
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
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setType(iprot.readString());
                        }
                        break;
                    }
                    case "parameters": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setParameters(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PARAMETERS, e.getCause());
                                }
                        }
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

        public Builder setIfPresent(final ObjectStoreConfiguration other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setType(other.getType());
            if (other.getParameters().isPresent()) {
                setParameters(other.getParameters());
            }

            return this;
        }

        public Builder setParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            Validator.validateParameters(parameters);
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> parameters) {
            return setParameters(com.google.common.base.Optional.fromNullable(parameters));
        }

        public Builder setType(final String type) {
            Validator.validateType(type);
            this.type = type;
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

        private @javax.annotation.Nullable String type;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectStoreConfiguration> {
        @Override
        public ObjectStoreConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectStoreConfiguration.readAsList(iprot);
        }

        @Override
        public ObjectStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectStoreConfiguration.readAsStruct(iprot);
        }

        @Override
        public ObjectStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectStoreConfiguration.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "type", "1:type", org.thryft.protocol.Type.STRING),
        PARAMETERS("parameters", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, (short)2, "parameters", "2:parameters", org.thryft.protocol.Type.MAP);

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
        public static void validate(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            validateType(type);
            validateParameters(parameters);
        }

        public static void validateType(final String type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.configuration.ObjectStoreConfiguration: type is missing");
            }
        }

        public static void validateParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
            if (parameters == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.configuration.ObjectStoreConfiguration: parameters is missing");
            }
            if (parameters.isPresent()) {
                if (parameters.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.configuration.ObjectStoreConfiguration: parameters: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public ObjectStoreConfiguration(final ObjectStoreConfiguration other) {
        this(other.getType(), other.getParameters());
    }

    /**
     * Required constructor
     */
    public ObjectStoreConfiguration(final String type) {
        this(type, com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent());
    }

    /**
     * Total constructor
     */
    public ObjectStoreConfiguration(final String type, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
        Validator.validate(type, parameters);
        this.type = type;
        this.parameters = parameters;
    }

    /**
     * Total Nullable constructor
     */
    public ObjectStoreConfiguration(final String type, @javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> parameters) {
        this(type, com.google.common.base.Optional.fromNullable(parameters));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectStoreConfiguration other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectStoreConfiguration> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectStoreConfiguration)) {
            return false;
        }

        final ObjectStoreConfiguration other = (ObjectStoreConfiguration)otherObject;

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

    public static ObjectStoreConfiguration readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static ObjectStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static ObjectStoreConfiguration readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public ObjectStoreConfiguration replaceParameters(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters) {
        Validator.validateParameters(parameters);
        return new ObjectStoreConfiguration(this.type, parameters);
    }

    public ObjectStoreConfiguration replaceParameters(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> parameters) {
        return replaceParameters(com.google.common.base.Optional.fromNullable(parameters));
    }

    public ObjectStoreConfiguration replaceType(final String type) {
        Validator.validateType(type);
        return new ObjectStoreConfiguration(type, this.parameters);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("parameters", getParameters().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.configuration.ObjectStoreConfiguration");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTypeField(oprot);

        writeParametersField(oprot);

        oprot.writeFieldStop();
    }

    public void writeParametersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getParameters().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PARAMETERS);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getParameters().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getParameters().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeString(getType());
        oprot.writeFieldEnd();
    }

    private final String type;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> parameters;
}
