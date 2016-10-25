package org.dressdiscover.server.properties;

public final class ServerProperties implements org.thryft.Struct, org.thryft.waf.lib.Properties {
    public final static class Builder {
        public Builder() {
            googleApiKey = null;
            googleOauthKey = null;
            googleOauthSecret = null;
        }

        public Builder(final ServerProperties other) {
            this.googleApiKey = other.getGoogleApiKey();
            this.googleOauthKey = other.getGoogleOauthKey();
            this.googleOauthSecret = other.getGoogleOauthSecret();
        }

        protected ServerProperties _build(final String googleApiKey, final String googleOauthKey, final String googleOauthSecret) {
            return new ServerProperties(googleApiKey, googleOauthKey, googleOauthSecret, DefaultConstructionValidator.getInstance());
        }

        public ServerProperties build() {
            return _build(googleApiKey, googleOauthKey, googleOauthSecret);
        }

        public final String getGoogleApiKey() {
            return googleApiKey;
        }

        public final String getGoogleOauthKey() {
            return googleOauthKey;
        }

        public final String getGoogleOauthSecret() {
            return googleOauthSecret;
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
                googleApiKey = iprot.readString();
                googleOauthKey = iprot.readString();
                googleOauthSecret = iprot.readString();
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
                    case "google_api_key": {
                        googleApiKey = iprot.readString();
                        break;
                    }
                    case "google_oauth_key": {
                        googleOauthKey = iprot.readString();
                        break;
                    }
                    case "google_oauth_secret": {
                        googleOauthSecret = iprot.readString();
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
            case GOOGLE_API_KEY: setGoogleApiKey((String)value); return this;
            case GOOGLE_OAUTH_KEY: setGoogleOauthKey((String)value); return this;
            case GOOGLE_OAUTH_SECRET: setGoogleOauthSecret((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setGoogleApiKey(final String googleApiKey) {
            this.googleApiKey = DefaultConstructionValidator.getInstance().validateGoogleApiKey(googleApiKey);
            return this;
        }

        public Builder setGoogleOauthKey(final String googleOauthKey) {
            this.googleOauthKey = DefaultConstructionValidator.getInstance().validateGoogleOauthKey(googleOauthKey);
            return this;
        }

        public Builder setGoogleOauthSecret(final String googleOauthSecret) {
            this.googleOauthSecret = DefaultConstructionValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret);
            return this;
        }

        public Builder setIfPresent(final ServerProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setGoogleApiKey(other.getGoogleApiKey());
            setGoogleOauthKey(other.getGoogleOauthKey());
            setGoogleOauthSecret(other.getGoogleOauthSecret());

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
            case GOOGLE_API_KEY: return unsetGoogleApiKey();
            case GOOGLE_OAUTH_KEY: return unsetGoogleOauthKey();
            case GOOGLE_OAUTH_SECRET: return unsetGoogleOauthSecret();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetGoogleApiKey() {
            this.googleApiKey = null;
            return this;
        }

        public Builder unsetGoogleOauthKey() {
            this.googleOauthKey = null;
            return this;
        }

        public Builder unsetGoogleOauthSecret() {
            this.googleOauthSecret = null;
            return this;
        }

        private String googleApiKey;
        private String googleOauthKey;
        private String googleOauthSecret;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ServerProperties> {
        @Override
        public ServerProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ServerProperties.readAs(iprot, type);
        }

        @Override
        public ServerProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ServerProperties.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ServerProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ServerProperties.readAsList(iprot);
        }

        @Override
        public ServerProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ServerProperties.readAsStruct(iprot);
        }

        @Override
        public ServerProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ServerProperties.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        GOOGLE_API_KEY("googleApiKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_api_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_KEY("googleOauthKey", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_key", org.thryft.protocol.Type.STRING),
        GOOGLE_OAUTH_SECRET("googleOauthSecret", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "google_oauth_secret", org.thryft.protocol.Type.STRING);

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
            case "googleApiKey": return GOOGLE_API_KEY;
            case "googleOauthKey": return GOOGLE_OAUTH_KEY;
            case "googleOauthSecret": return GOOGLE_OAUTH_SECRET;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "google_api_key": return GOOGLE_API_KEY;
            case "google_oauth_key": return GOOGLE_OAUTH_KEY;
            case "google_oauth_secret": return GOOGLE_OAUTH_SECRET;
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
        public String validateGoogleApiKey(final String googleApiKey) throws ExceptionT;

        public String validateGoogleOauthKey(final String googleOauthKey) throws ExceptionT;

        public String validateGoogleOauthSecret(final String googleOauthSecret) throws ExceptionT;
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
        public String validateGoogleApiKey(final String googleApiKey) throws RuntimeException {
            if (googleApiKey == null) {
                throw new NullPointerException("org.dressdiscover.server.properties.ServerProperties: googleApiKey is null");
            }
            if (googleApiKey.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.server.properties.ServerProperties: googleApiKey is less than min length 1");
            }
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) throws RuntimeException {
            if (googleOauthKey == null) {
                throw new NullPointerException("org.dressdiscover.server.properties.ServerProperties: googleOauthKey is null");
            }
            if (googleOauthKey.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.server.properties.ServerProperties: googleOauthKey is less than min length 1");
            }
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) throws RuntimeException {
            if (googleOauthSecret == null) {
                throw new NullPointerException("org.dressdiscover.server.properties.ServerProperties: googleOauthSecret is null");
            }
            if (googleOauthSecret.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.server.properties.ServerProperties: googleOauthSecret is less than min length 1");
            }
            return googleOauthSecret;
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
        public String validateGoogleApiKey(final String googleApiKey) {
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) {
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) {
            return googleOauthSecret;
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
        public String validateGoogleApiKey(final String googleApiKey) throws org.thryft.protocol.InputProtocolException {
            if (googleApiKey == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_API_KEY, "org.dressdiscover.server.properties.ServerProperties: googleApiKey is null");
            }
            if (googleApiKey.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_API_KEY, "org.dressdiscover.server.properties.ServerProperties: googleApiKey is less than min length 1");
            }
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) throws org.thryft.protocol.InputProtocolException {
            if (googleOauthKey == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_KEY, "org.dressdiscover.server.properties.ServerProperties: googleOauthKey is null");
            }
            if (googleOauthKey.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_KEY, "org.dressdiscover.server.properties.ServerProperties: googleOauthKey is less than min length 1");
            }
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) throws org.thryft.protocol.InputProtocolException {
            if (googleOauthSecret == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_SECRET, "org.dressdiscover.server.properties.ServerProperties: googleOauthSecret is null");
            }
            if (googleOauthSecret.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GOOGLE_OAUTH_SECRET, "org.dressdiscover.server.properties.ServerProperties: googleOauthSecret is less than min length 1");
            }
            return googleOauthSecret;
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
        public String validateGoogleApiKey(final String googleApiKey) {
            return googleApiKey;
        }

        @Override
        public String validateGoogleOauthKey(final String googleOauthKey) {
            return googleOauthKey;
        }

        @Override
        public String validateGoogleOauthSecret(final String googleOauthSecret) {
            return googleOauthSecret;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public ServerProperties(final ServerProperties other) {
        this(other.getGoogleApiKey(), other.getGoogleOauthKey(), other.getGoogleOauthSecret(), NopConstructionValidator.getInstance());
    }

    protected ServerProperties(final String googleApiKey, final String googleOauthKey, final String googleOauthSecret, ConstructionValidator validator) {
        this.googleApiKey = validator.validateGoogleApiKey(googleApiKey);
        this.googleOauthKey = validator.validateGoogleOauthKey(googleOauthKey);
        this.googleOauthSecret = validator.validateGoogleOauthSecret(googleOauthSecret);
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

        final java.io.InputStream propertiesInputStream = ServerProperties.class
                .getResourceAsStream(propertiesResourceName);
        if (propertiesInputStream == null) {
            logger.debug("properties file {} not found in the CLASSPATH", propertiesResourceName);
            return properties;
        }

        try {
            try {
                properties.load(propertiesInputStream);
                logger.debug("read properties file {} from CLASSPATH", propertiesResourceName);
            } finally {
                propertiesInputStream.close();
            }
        } catch (final java.io.IOException e) {
            logger.warn("unable to read properties file {} from the CLASSPATH: ", propertiesResourceName, e);
        }
        return properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ServerProperties other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ServerProperties> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static ServerProperties create(final String googleApiKey, final String googleOauthKey, final String googleOauthSecret) {
        return new ServerProperties(googleApiKey, googleOauthKey, googleOauthSecret, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ServerProperties)) {
            return false;
        }

        final ServerProperties other = (ServerProperties)otherObject;

        if (!(getGoogleApiKey().equals(other.getGoogleApiKey()))) {
            return false;
        }

        if (!(getGoogleOauthKey().equals(other.getGoogleOauthKey()))) {
            return false;
        }

        if (!(getGoogleOauthSecret().equals(other.getGoogleOauthSecret()))) {
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
        case GOOGLE_API_KEY: return getGoogleApiKey();
        case GOOGLE_OAUTH_KEY: return getGoogleOauthKey();
        case GOOGLE_OAUTH_SECRET: return getGoogleOauthSecret();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getGoogleApiKey() {
        return googleApiKey;
    }

    public final String getGoogleOauthKey() {
        return googleOauthKey;
    }

    public final String getGoogleOauthSecret() {
        return googleOauthSecret;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getGoogleApiKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthKey().hashCode();
        hashCode = 31 * hashCode + getGoogleOauthSecret().hashCode();
        return hashCode;
    }


    public static ServerProperties load() {
        return load(com.google.common.base.Optional.<java.io.File> absent());
    }

    public static ServerProperties load(final com.google.common.base.Optional<java.io.File> commandLinePropertiesFilePath) {
        java.util.Properties __properties = new java.util.Properties();

        String[] __propertyNames = {"google_api_key", "google_oauth_key", "google_oauth_secret"};
        for (final String propertyName : __propertyNames) {
            final String propertyValue = System.getenv("DRESSDISCOVER_" + propertyName.toUpperCase());
            if (propertyValue != null) {
                __properties.put(propertyName, propertyValue);
            }
        }

        __properties = __mergeProperties(__properties, __readProperties("server.properties"));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                "/etc/dressdiscover/server.properties")));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                new java.io.File(new java.io.File(System.getProperty("user.home")),
                        ".dressdiscover"), "server.properties")));
        if (commandLinePropertiesFilePath.isPresent()) {
            __properties = __mergeProperties(__properties,
                    __readProperties(commandLinePropertiesFilePath.get()));
        }

        final String googleApiKey;
        {
            Object googleApiKeyObject = __properties.remove("google_api_key");
            if (!(googleApiKeyObject instanceof String)) {
                throw new RuntimeException("no such property google_api_key");
            } else {
                final String googleApiKeyString = ((String)googleApiKeyObject).trim();
                if (googleApiKeyString.isEmpty()) {
                    throw new RuntimeException("property google_api_key is empty");
                } else {
                    googleApiKey = googleApiKeyString;
                }
            }
        }

        final String googleOauthKey;
        {
            Object googleOauthKeyObject = __properties.remove("google_oauth_key");
            if (!(googleOauthKeyObject instanceof String)) {
                throw new RuntimeException("no such property google_oauth_key");
            } else {
                final String googleOauthKeyString = ((String)googleOauthKeyObject).trim();
                if (googleOauthKeyString.isEmpty()) {
                    throw new RuntimeException("property google_oauth_key is empty");
                } else {
                    googleOauthKey = googleOauthKeyString;
                }
            }
        }

        final String googleOauthSecret;
        {
            Object googleOauthSecretObject = __properties.remove("google_oauth_secret");
            if (!(googleOauthSecretObject instanceof String)) {
                throw new RuntimeException("no such property google_oauth_secret");
            } else {
                final String googleOauthSecretString = ((String)googleOauthSecretObject).trim();
                if (googleOauthSecretString.isEmpty()) {
                    throw new RuntimeException("property google_oauth_secret is empty");
                } else {
                    googleOauthSecret = googleOauthSecretString;
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return ServerProperties.create(googleApiKey, googleOauthKey, googleOauthSecret);
    }

    public static ServerProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ServerProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ServerProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;

        try {
            iprot.readListBegin();
            googleApiKey = iprot.readString();
            googleOauthKey = iprot.readString();
            googleOauthSecret = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new ServerProperties(DefaultReadValidator.getInstance().validateGoogleApiKey(googleApiKey), DefaultReadValidator.getInstance().validateGoogleOauthKey(googleOauthKey), DefaultReadValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), NopConstructionValidator.getInstance());
    }

    public static ServerProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ServerProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String googleApiKey = null;
        String googleOauthKey = null;
        String googleOauthSecret = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "google_api_key": {
                    googleApiKey = iprot.readString();
                    break;
                }
                case "google_oauth_key": {
                    googleOauthKey = iprot.readString();
                    break;
                }
                case "google_oauth_secret": {
                    googleOauthSecret = iprot.readString();
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
        return new ServerProperties(DefaultReadValidator.getInstance().validateGoogleApiKey(googleApiKey), DefaultReadValidator.getInstance().validateGoogleOauthKey(googleOauthKey), DefaultReadValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), NopConstructionValidator.getInstance());
    }

    public ServerProperties replaceGoogleApiKey(final String googleApiKey) {
        return new ServerProperties(DefaultConstructionValidator.getInstance().validateGoogleApiKey(googleApiKey), this.googleOauthKey, this.googleOauthSecret, NopConstructionValidator.getInstance());
    }

    public ServerProperties replaceGoogleOauthKey(final String googleOauthKey) {
        return new ServerProperties(this.googleApiKey, DefaultConstructionValidator.getInstance().validateGoogleOauthKey(googleOauthKey), this.googleOauthSecret, NopConstructionValidator.getInstance());
    }

    public ServerProperties replaceGoogleOauthSecret(final String googleOauthSecret) {
        return new ServerProperties(this.googleApiKey, this.googleOauthKey, DefaultConstructionValidator.getInstance().validateGoogleOauthSecret(googleOauthSecret), NopConstructionValidator.getInstance());
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("google_api_key", getGoogleApiKey());
        builder.put("google_oauth_key", getGoogleOauthKey());
        builder.put("google_oauth_secret", getGoogleOauthSecret());
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("google_api_key", getGoogleApiKey()).add("google_oauth_key", getGoogleOauthKey()).add("google_oauth_secret", getGoogleOauthSecret()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getGoogleApiKey());

        oprot.writeString(getGoogleOauthKey());

        oprot.writeString(getGoogleOauthSecret());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.server.properties.ServerProperties");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("google_api_key", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleApiKey());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("google_oauth_key", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleOauthKey());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("google_oauth_secret", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getGoogleOauthSecret());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final String googleApiKey;

    private final String googleOauthKey;

    private final String googleOauthSecret;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ServerProperties.class);
}
