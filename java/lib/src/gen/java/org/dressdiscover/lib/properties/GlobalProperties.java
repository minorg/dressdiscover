package org.dressdiscover.lib.properties;

public final class GlobalProperties implements org.thryft.waf.lib.Properties {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, GlobalProperties> {
        public Builder() {
            environment = null;
            pythonPath = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final GlobalProperties other) {
            this.environment = other.getEnvironment();
            this.pythonPath = other.getPythonPath();
        }

        protected GlobalProperties _build(final org.dressdiscover.lib.properties.Environment environment, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
            return new GlobalProperties(environment, pythonPath);
        }

        public GlobalProperties build() {
            Validator.validate(environment, pythonPath);

            return _build(environment, pythonPath);
        }

        public final @javax.annotation.Nullable org.dressdiscover.lib.properties.Environment getEnvironment() {
            return environment;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPythonPath() {
            return pythonPath;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setEnvironment(iprot.readEnum(org.dressdiscover.lib.properties.Environment.Factory.getInstance()));
                if (__list.getSize() > 1) {
                    try {
                        this.setPythonPath(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PYTHON_PATH, e.getCause());
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
                    case "environment": {
                        this.setEnvironment(iprot.readEnum(org.dressdiscover.lib.properties.Environment.Factory.getInstance()));
                        break;
                    }
                    case "python_path": {
                        try {
                            this.setPythonPath(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot)));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PYTHON_PATH, e.getCause());
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
            case ENVIRONMENT: setEnvironment((org.dressdiscover.lib.properties.Environment)value); return this;
            case PYTHON_PATH: setPythonPath((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setEnvironment(final org.dressdiscover.lib.properties.Environment environment) {
            Validator.validateEnvironment(environment);
            this.environment = environment;
            return this;
        }

        public Builder setIfPresent(final GlobalProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setEnvironment(other.getEnvironment());
            if (other.getPythonPath().isPresent()) {
                setPythonPath(other.getPythonPath());
            }

            return this;
        }

        public Builder setPythonPath(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
            Validator.validatePythonPath(pythonPath);
            this.pythonPath = pythonPath;
            return this;
        }

        public Builder setPythonPath(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> pythonPath) {
            return setPythonPath(com.google.common.base.Optional.fromNullable(pythonPath));
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
            case ENVIRONMENT: return unsetEnvironment();
            case PYTHON_PATH: return unsetPythonPath();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetEnvironment() {
            this.environment = null;
            return this;
        }

        public Builder unsetPythonPath() {
            this.pythonPath = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.lib.properties.Environment environment;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<GlobalProperties> {
        @Override
        public GlobalProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GlobalProperties.readAsList(iprot);
        }

        @Override
        public GlobalProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return GlobalProperties.readAsStruct(iprot);
        }

        @Override
        public GlobalProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return GlobalProperties.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ENVIRONMENT("environment", new com.google.common.reflect.TypeToken<org.dressdiscover.lib.properties.Environment>() {}, true, (short)0, "environment", "environment", org.thryft.protocol.Type.STRING),
        PYTHON_PATH("pythonPath", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "python_path", "python_path", org.thryft.protocol.Type.LIST);

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
            case "environment": return ENVIRONMENT;
            case "pythonPath": return PYTHON_PATH;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "environment": return ENVIRONMENT;
            case "python_path": return PYTHON_PATH;
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
        public static void validate(final org.dressdiscover.lib.properties.Environment environment, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
            validateEnvironment(environment);
            validatePythonPath(pythonPath);
        }

        public static void validateEnvironment(final org.dressdiscover.lib.properties.Environment environment) {
            if (environment == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.lib.properties.GlobalProperties: environment is missing");
            }
        }

        public static void validatePythonPath(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
            if (pythonPath == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.lib.properties.GlobalProperties: pythonPath is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public GlobalProperties(final GlobalProperties other) {
        this(other.getEnvironment(), other.getPythonPath());
    }

    /**
     * Required constructor
     */
    public GlobalProperties(final org.dressdiscover.lib.properties.Environment environment) {
        this(environment, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent());
    }

    /**
     * Total constructor
     */
    public GlobalProperties(final org.dressdiscover.lib.properties.Environment environment, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
        Validator.validate(environment, pythonPath);
        this.environment = environment;
        this.pythonPath = pythonPath;
    }

    /**
     * Total Nullable constructor
     */
    public GlobalProperties(final org.dressdiscover.lib.properties.Environment environment, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> pythonPath) {
        this(environment, com.google.common.base.Optional.fromNullable(pythonPath));
    }

    private static java.util.Properties __mergeProperties(
            final java.util.Properties leftProperties, final java.util.Properties rightProperties) {
        final java.util.Properties mergedProperties = new java.util.Properties();
        mergedProperties.putAll(leftProperties);
        for (final java.util.Map.Entry<Object, Object> rightEntry : rightProperties
                .entrySet()) {
            if (!(rightEntry.getKey() instanceof String)) {
                continue;
            }
            mergedProperties.put(rightEntry.getKey(), rightEntry.getValue());
        }
        return mergedProperties;
    }

    private static java.util.Properties __readProperties(final java.io.File propertiesFilePath) {
        final java.util.Properties properties = new java.util.Properties();
        try (final java.io.FileReader propertiesFileReader = new java.io.FileReader(
                propertiesFilePath)) {
            properties.load(propertiesFileReader);
            logger.debug("read properties file {}", propertiesFilePath);
        } catch (final java.io.FileNotFoundException e) {
            logger.debug("properties file {} not found", propertiesFilePath);
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {}: ", propertiesFilePath, e);
        }
        return properties;
    }

    private static java.util.Properties __readProperties(final String propertiesResourceName) {
        final java.util.Properties properties = new java.util.Properties();

        try (final java.io.InputStream propertiesInputStream = GlobalProperties.class
                .getResourceAsStream(propertiesResourceName)) {
            if (propertiesInputStream == null) {
                logger.debug("properties file {} not found in the CLASSPATH", propertiesResourceName);
                return properties;
            }

            properties.load(propertiesInputStream);
            logger.debug("read properties file {} from CLASSPATH", propertiesResourceName);
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {} from the CLASSPATH: ", propertiesResourceName, e);
        }
        return properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GlobalProperties other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GlobalProperties> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof GlobalProperties)) {
            return false;
        }

        final GlobalProperties other = (GlobalProperties)otherObject;

        if (!(getEnvironment().equals(other.getEnvironment()))) {
            return false;
        }

        if (!(((getPythonPath().isPresent() && other.getPythonPath().isPresent()) ? (getPythonPath().get().equals(other.getPythonPath().get())) : (!getPythonPath().isPresent() && !other.getPythonPath().isPresent())))) {
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
        case ENVIRONMENT: return getEnvironment();
        case PYTHON_PATH: return getPythonPath();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.lib.properties.Environment getEnvironment() {
        return environment;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPythonPath() {
        return pythonPath;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getEnvironment().ordinal();
        if (getPythonPath().isPresent()) {
            hashCode = 31 * hashCode + getPythonPath().get().hashCode();
        }
        return hashCode;
    }


    public static GlobalProperties load() {
        return load(com.google.common.base.Optional.<java.io.File> absent());
    }

    public static GlobalProperties load(final com.google.common.base.Optional<java.io.File> commandLinePropertiesFilePath) {
        java.util.Properties __properties = new java.util.Properties();

        String[] __propertyNames = {"environment", "python_path"};
        for (final String propertyName : __propertyNames) {
            final String propertyValue = System.getenv("DRESSDISCOVER_" + propertyName.toUpperCase());
            if (propertyValue != null) {
                __properties.put(propertyName, propertyValue);
            }
        }

        __properties = __mergeProperties(__properties, __readProperties("global.properties"));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                "/etc/dressdiscover/global.properties")));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                new java.io.File(new java.io.File(System.getProperty("user.home")),
                        ".dressdiscover"), "global.properties")));
        if (commandLinePropertiesFilePath.isPresent()) {
            __properties = __mergeProperties(__properties,
                    __readProperties(commandLinePropertiesFilePath.get()));
        }

        final org.dressdiscover.lib.properties.Environment environment;
        {
            Object environmentObject = __properties.remove("environment");
            if (!(environmentObject instanceof String)) {
                throw new RuntimeException("no such property environment");
            } else {
                final String environmentString = ((String)environmentObject).trim();
                if (environmentString.isEmpty()) {
                    throw new RuntimeException("property environment is empty");
                } else {
                    environment = org.dressdiscover.lib.properties.Environment.valueOf(environmentString.toUpperCase());
                }
            }
        }

        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath;
        {
            Object pythonPathObject = __properties.remove("python_path");
            if (!(pythonPathObject instanceof String)) {
                pythonPath = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>>absent();
            } else {
                final String pythonPathString = ((String)pythonPathObject).trim();
                if (pythonPathString.isEmpty()) {
                    pythonPath = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>>absent();
                } else {
                    pythonPath = com.google.common.base.Optional.of((new com.google.common.base.Function<String, com.google.common.collect.ImmutableList<String>>() {
            @Override
            public com.google.common.collect.ImmutableList<String> apply(final String value) {
                final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                for (final String elementString : value.split(",")) {
                    sequenceBuilder.add(elementString);
                }
                return sequenceBuilder.build();
            }
        }).apply(pythonPathString.toString()));
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return new GlobalProperties(environment, pythonPath);
    }

    public static GlobalProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static GlobalProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static GlobalProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public GlobalProperties replaceEnvironment(final org.dressdiscover.lib.properties.Environment environment) {
        Validator.validateEnvironment(environment);
        return new GlobalProperties(environment, this.pythonPath);
    }

    public GlobalProperties replacePythonPath(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath) {
        Validator.validatePythonPath(pythonPath);
        return new GlobalProperties(this.environment, pythonPath);
    }

    public GlobalProperties replacePythonPath(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> pythonPath) {
        return replacePythonPath(com.google.common.base.Optional.fromNullable(pythonPath));
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("environment", getEnvironment());
        if (getPythonPath().isPresent()) {
            builder.put("python_path", getPythonPath().get());
        }
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("environment", getEnvironment()).add("python_path", getPythonPath().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.lib.properties.GlobalProperties");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeEnvironmentField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ENVIRONMENT);
        oprot.writeEnum(getEnvironment());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeEnum(getEnvironment());
        if (getPythonPath().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPythonPath().get().size());
            for (final String _iter0 : getPythonPath().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeEnvironmentField(oprot);

        writePythonPathField(oprot);

        oprot.writeFieldStop();
    }

    public void writePythonPathField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPythonPath().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PYTHON_PATH);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPythonPath().get().size());
            for (final String _iter0 : getPythonPath().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    private final org.dressdiscover.lib.properties.Environment environment;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> pythonPath;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(GlobalProperties.class);
}
