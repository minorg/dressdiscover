package net.lab1318.costume.lib;

public class CostumeProperties implements org.thryft.Struct, org.notaweb.lib.Properties {
    public static class Builder {
        public Builder() {
            apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            environment = null;
            elasticSearchHost = "elasticsearch";
            elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            homeDirectoryPath = null;
            logbackXmlFilePath = com.google.common.base.Optional.absent();
            powerhouseMuseumApiKey = com.google.common.base.Optional.absent();
        }

        public Builder(final CostumeProperties other) {
            this.apiUrl = other.getApiUrl();
            this.environment = other.getEnvironment();
            this.elasticSearchHost = other.getElasticSearchHost();
            this.elasticSearchPort = other.getElasticSearchPort();
            this.homeDirectoryPath = other.getHomeDirectoryPath();
            this.logbackXmlFilePath = other.getLogbackXmlFilePath();
            this.powerhouseMuseumApiKey = other.getPowerhouseMuseumApiKey();
        }

        protected CostumeProperties _build(final org.thryft.native_.Url apiUrl, final String environment, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String homeDirectoryPath, final com.google.common.base.Optional<String> logbackXmlFilePath, final com.google.common.base.Optional<String> powerhouseMuseumApiKey) {
            return new CostumeProperties(apiUrl, environment, elasticSearchHost, elasticSearchPort, homeDirectoryPath, logbackXmlFilePath, powerhouseMuseumApiKey);
        }

        public CostumeProperties build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(apiUrl, "net.lab1318.costume.lib.CostumeProperties: missing apiUrl"), com.google.common.base.Preconditions.checkNotNull(environment, "net.lab1318.costume.lib.CostumeProperties: missing environment"), com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchHost"), com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchPort"), com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "net.lab1318.costume.lib.CostumeProperties: missing homeDirectoryPath"), com.google.common.base.Preconditions.checkNotNull(logbackXmlFilePath, "net.lab1318.costume.lib.CostumeProperties: missing logbackXmlFilePath"), com.google.common.base.Preconditions.checkNotNull(powerhouseMuseumApiKey, "net.lab1318.costume.lib.CostumeProperties: missing powerhouseMuseumApiKey"));
        }

        public final org.thryft.native_.Url getApiUrl() {
            return apiUrl;
        }

        public final String getElasticSearchHost() {
            return elasticSearchHost;
        }

        public final com.google.common.primitives.UnsignedInteger getElasticSearchPort() {
            return elasticSearchPort;
        }

        /**
         * dev, staging, production, etc.
         */
        public final String getEnvironment() {
            return environment;
        }

        public final String getHomeDirectoryPath() {
            return homeDirectoryPath;
        }

        public final com.google.common.base.Optional<String> getLogbackXmlFilePath() {
            return logbackXmlFilePath;
        }

        public final com.google.common.base.Optional<String> getPowerhouseMuseumApiKey() {
            return powerhouseMuseumApiKey;
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
            apiUrl = org.thryft.native_.Url.parse(iprot.readString());
            environment = iprot.readString();
            elasticSearchHost = iprot.readString();
            elasticSearchPort = iprot.readU32();
            homeDirectoryPath = iprot.readString();
            if (__list.getSize() > 5) {
                logbackXmlFilePath = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 6) {
                powerhouseMuseumApiKey = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "api_url": {
                    apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                    break;
                }
                case "environment": {
                    environment = iprot.readString();
                    break;
                }
                case "elastic_search_host": {
                    elasticSearchHost = iprot.readString();
                    break;
                }
                case "elastic_search_port": {
                    elasticSearchPort = iprot.readU32();
                    break;
                }
                case "home_directory_path": {
                    homeDirectoryPath = iprot.readString();
                    break;
                }
                case "logback_xml_file_path": {
                    logbackXmlFilePath = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "powerhouse_museum_api_key": {
                    powerhouseMuseumApiKey = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setApiUrl(final org.thryft.native_.Url apiUrl) {
            this.apiUrl = com.google.common.base.Preconditions.checkNotNull(apiUrl);
            return this;
        }

        public Builder setElasticSearchHost(final String elasticSearchHost) {
            this.elasticSearchHost = com.google.common.base.Preconditions.checkNotNull(elasticSearchHost);
            return this;
        }

        public Builder setElasticSearchPort(final com.google.common.primitives.UnsignedInteger elasticSearchPort) {
            this.elasticSearchPort = com.google.common.base.Preconditions.checkNotNull(elasticSearchPort);
            return this;
        }

        public Builder setEnvironment(final String environment) {
            this.environment = com.google.common.base.Preconditions.checkNotNull(environment);
            return this;
        }

        public Builder setHomeDirectoryPath(final String homeDirectoryPath) {
            this.homeDirectoryPath = com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath);
            return this;
        }

        public Builder setIfPresent(final CostumeProperties other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setApiUrl(other.getApiUrl());
            setEnvironment(other.getEnvironment());
            setElasticSearchHost(other.getElasticSearchHost());
            setElasticSearchPort(other.getElasticSearchPort());
            setHomeDirectoryPath(other.getHomeDirectoryPath());
            if (other.getLogbackXmlFilePath().isPresent()) {
                setLogbackXmlFilePath(other.getLogbackXmlFilePath());
            }
            if (other.getPowerhouseMuseumApiKey().isPresent()) {
                setPowerhouseMuseumApiKey(other.getPowerhouseMuseumApiKey());
            }

            return this;
        }

        public Builder setLogbackXmlFilePath(final com.google.common.base.Optional<String> logbackXmlFilePath) {
            this.logbackXmlFilePath = com.google.common.base.Preconditions.checkNotNull(logbackXmlFilePath);
            return this;
        }

        public Builder setLogbackXmlFilePath(@javax.annotation.Nullable final String logbackXmlFilePath) {
            this.logbackXmlFilePath = com.google.common.base.Optional.fromNullable(logbackXmlFilePath);
            return this;
        }

        public Builder setPowerhouseMuseumApiKey(final com.google.common.base.Optional<String> powerhouseMuseumApiKey) {
            this.powerhouseMuseumApiKey = com.google.common.base.Preconditions.checkNotNull(powerhouseMuseumApiKey);
            return this;
        }

        public Builder setPowerhouseMuseumApiKey(@javax.annotation.Nullable final String powerhouseMuseumApiKey) {
            this.powerhouseMuseumApiKey = com.google.common.base.Optional.fromNullable(powerhouseMuseumApiKey);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "api_url": setApiUrl((org.thryft.native_.Url)value); return this;
            case "environment": setEnvironment((String)value); return this;
            case "elastic_search_host": setElasticSearchHost((String)value); return this;
            case "elastic_search_port": setElasticSearchPort((com.google.common.primitives.UnsignedInteger)value); return this;
            case "home_directory_path": setHomeDirectoryPath((String)value); return this;
            case "logback_xml_file_path": setLogbackXmlFilePath((String)value); return this;
            case "powerhouse_museum_api_key": setPowerhouseMuseumApiKey((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetApiUrl() {
            this.apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            return this;
        }

        public Builder unsetElasticSearchHost() {
            this.elasticSearchHost = "elasticsearch";
            return this;
        }

        public Builder unsetElasticSearchPort() {
            this.elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            return this;
        }

        public Builder unsetEnvironment() {
            this.environment = null;
            return this;
        }

        public Builder unsetHomeDirectoryPath() {
            this.homeDirectoryPath = null;
            return this;
        }

        public Builder unsetLogbackXmlFilePath() {
            this.logbackXmlFilePath = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetPowerhouseMuseumApiKey() {
            this.powerhouseMuseumApiKey = com.google.common.base.Optional.absent();
            return this;
        }

        private org.thryft.native_.Url apiUrl;
        /**
         * dev, staging, production, etc.
         */
        private String environment;
        private String elasticSearchHost;
        private com.google.common.primitives.UnsignedInteger elasticSearchPort;
        private String homeDirectoryPath;
        private com.google.common.base.Optional<String> logbackXmlFilePath;
        private com.google.common.base.Optional<String> powerhouseMuseumApiKey;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        API_URL(new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 0, "api_url", org.thryft.protocol.Type.STRING),
        ENVIRONMENT(new com.google.common.reflect.TypeToken<String>() {}, true, 0, "environment", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_HOST(new com.google.common.reflect.TypeToken<String>() {}, true, 0, "elastic_search_host", org.thryft.protocol.Type.STRING),
        ELASTIC_SEARCH_PORT(new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "elastic_search_port", org.thryft.protocol.Type.I32),
        HOME_DIRECTORY_PATH(new com.google.common.reflect.TypeToken<String>() {}, true, 0, "home_directory_path", org.thryft.protocol.Type.STRING),
        LOGBACK_XML_FILE_PATH(new com.google.common.reflect.TypeToken<String>() {}, false, 0, "logback_xml_file_path", org.thryft.protocol.Type.STRING),
        POWERHOUSE_MUSEUM_API_KEY(new com.google.common.reflect.TypeToken<String>() {}, false, 0, "powerhouse_museum_api_key", org.thryft.protocol.Type.STRING);

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
            case "apiUrl": return API_URL;
            case "environment": return ENVIRONMENT;
            case "elasticSearchHost": return ELASTIC_SEARCH_HOST;
            case "elasticSearchPort": return ELASTIC_SEARCH_PORT;
            case "homeDirectoryPath": return HOME_DIRECTORY_PATH;
            case "logbackXmlFilePath": return LOGBACK_XML_FILE_PATH;
            case "powerhouseMuseumApiKey": return POWERHOUSE_MUSEUM_API_KEY;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "api_url": return API_URL;
            case "environment": return ENVIRONMENT;
            case "elastic_search_host": return ELASTIC_SEARCH_HOST;
            case "elastic_search_port": return ELASTIC_SEARCH_PORT;
            case "home_directory_path": return HOME_DIRECTORY_PATH;
            case "logback_xml_file_path": return LOGBACK_XML_FILE_PATH;
            case "powerhouse_museum_api_key": return POWERHOUSE_MUSEUM_API_KEY;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
    public CostumeProperties(final CostumeProperties other) {
        this(other.getApiUrl(), other.getEnvironment(), other.getElasticSearchHost(), other.getElasticSearchPort(), other.getHomeDirectoryPath(), other.getLogbackXmlFilePath(), other.getPowerhouseMuseumApiKey());
    }

    /**
     * Required constructor
     */
    public CostumeProperties(final String environment, final String homeDirectoryPath) {
        this.apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        this.environment = com.google.common.base.Preconditions.checkNotNull(environment, "net.lab1318.costume.lib.CostumeProperties: missing environment");
        this.elasticSearchHost = "elasticsearch";
        this.elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
        this.homeDirectoryPath = com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "net.lab1318.costume.lib.CostumeProperties: missing homeDirectoryPath");
        this.logbackXmlFilePath = com.google.common.base.Optional.absent();
        this.powerhouseMuseumApiKey = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public CostumeProperties(final org.thryft.native_.Url apiUrl, final String environment, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String homeDirectoryPath, final @javax.annotation.Nullable String logbackXmlFilePath, final @javax.annotation.Nullable String powerhouseMuseumApiKey) {
        this.apiUrl = com.google.common.base.Preconditions.checkNotNull(apiUrl, "net.lab1318.costume.lib.CostumeProperties: missing apiUrl");
        this.environment = com.google.common.base.Preconditions.checkNotNull(environment, "net.lab1318.costume.lib.CostumeProperties: missing environment");
        this.elasticSearchHost = com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchHost");
        this.elasticSearchPort = com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchPort");
        this.homeDirectoryPath = com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "net.lab1318.costume.lib.CostumeProperties: missing homeDirectoryPath");
        this.logbackXmlFilePath = com.google.common.base.Optional.fromNullable(logbackXmlFilePath);
        this.powerhouseMuseumApiKey = com.google.common.base.Optional.fromNullable(powerhouseMuseumApiKey);
    }

    /**
     * Optional constructor
     */
    public CostumeProperties(final org.thryft.native_.Url apiUrl, final String environment, final String elasticSearchHost, final com.google.common.primitives.UnsignedInteger elasticSearchPort, final String homeDirectoryPath, final com.google.common.base.Optional<String> logbackXmlFilePath, final com.google.common.base.Optional<String> powerhouseMuseumApiKey) {
        this.apiUrl = com.google.common.base.Preconditions.checkNotNull(apiUrl, "net.lab1318.costume.lib.CostumeProperties: missing apiUrl");
        this.environment = com.google.common.base.Preconditions.checkNotNull(environment, "net.lab1318.costume.lib.CostumeProperties: missing environment");
        this.elasticSearchHost = com.google.common.base.Preconditions.checkNotNull(elasticSearchHost, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchHost");
        this.elasticSearchPort = com.google.common.base.Preconditions.checkNotNull(elasticSearchPort, "net.lab1318.costume.lib.CostumeProperties: missing elasticSearchPort");
        this.homeDirectoryPath = com.google.common.base.Preconditions.checkNotNull(homeDirectoryPath, "net.lab1318.costume.lib.CostumeProperties: missing homeDirectoryPath");
        this.logbackXmlFilePath = com.google.common.base.Preconditions.checkNotNull(logbackXmlFilePath, "net.lab1318.costume.lib.CostumeProperties: missing logbackXmlFilePath");
        this.powerhouseMuseumApiKey = com.google.common.base.Preconditions.checkNotNull(powerhouseMuseumApiKey, "net.lab1318.costume.lib.CostumeProperties: missing powerhouseMuseumApiKey");
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

        final java.io.InputStream propertiesInputStream = CostumeProperties.class
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

    public static Builder builder(final CostumeProperties other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<CostumeProperties> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof CostumeProperties)) {
            return false;
        }

        final CostumeProperties other = (CostumeProperties)otherObject;
        return
            getApiUrl().equals(other.getApiUrl()) &&
            getEnvironment().equals(other.getEnvironment()) &&
            getElasticSearchHost().equals(other.getElasticSearchHost()) &&
            getElasticSearchPort().equals(other.getElasticSearchPort()) &&
            getHomeDirectoryPath().equals(other.getHomeDirectoryPath()) &&
            getLogbackXmlFilePath().equals(other.getLogbackXmlFilePath()) &&
            getPowerhouseMuseumApiKey().equals(other.getPowerhouseMuseumApiKey());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "api_url": return getApiUrl();
        case "environment": return getEnvironment();
        case "elastic_search_host": return getElasticSearchHost();
        case "elastic_search_port": return getElasticSearchPort();
        case "home_directory_path": return getHomeDirectoryPath();
        case "logback_xml_file_path": return getLogbackXmlFilePath();
        case "powerhouse_museum_api_key": return getPowerhouseMuseumApiKey();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final org.thryft.native_.Url getApiUrl() {
        return apiUrl;
    }

    public final String getElasticSearchHost() {
        return elasticSearchHost;
    }

    public final com.google.common.primitives.UnsignedInteger getElasticSearchPort() {
        return elasticSearchPort;
    }

    /**
     * dev, staging, production, etc.
     */
    public final String getEnvironment() {
        return environment;
    }

    public final String getHomeDirectoryPath() {
        return homeDirectoryPath;
    }

    public final com.google.common.base.Optional<String> getLogbackXmlFilePath() {
        return logbackXmlFilePath;
    }

    public final com.google.common.base.Optional<String> getPowerhouseMuseumApiKey() {
        return powerhouseMuseumApiKey;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getApiUrl().hashCode();
        hashCode = 31 * hashCode + getEnvironment().hashCode();
        hashCode = 31 * hashCode + getElasticSearchHost().hashCode();
        hashCode = 31 * hashCode + getElasticSearchPort().hashCode();
        hashCode = 31 * hashCode + getHomeDirectoryPath().hashCode();
        if (getLogbackXmlFilePath().isPresent()) {
            hashCode = 31 * hashCode + getLogbackXmlFilePath().get().hashCode();
        }
        if (getPowerhouseMuseumApiKey().isPresent()) {
            hashCode = 31 * hashCode + getPowerhouseMuseumApiKey().get().hashCode();
        }
        return hashCode;
    }


    public static CostumeProperties load() {
        return load(com.google.common.base.Optional.<java.io.File> absent());
    }

    public static CostumeProperties load(final com.google.common.base.Optional<java.io.File> commandLinePropertiesFilePath) {
        java.util.Properties __properties = new java.util.Properties();

        String[] __propertyNames = {"api_url", "environment", "elastic_search_host", "elastic_search_port", "home_directory_path", "logback_xml_file_path", "powerhouse_museum_api_key"};
        for (final String propertyName : __propertyNames) {
            final String propertyValue = System.getenv("COSTUME_" + propertyName.toUpperCase());
            if (propertyValue != null) {
                __properties.put(propertyName, propertyValue);
            }
        }

        __properties = __mergeProperties(__properties, __readProperties("costume.properties"));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                new java.io.File(new java.io.File(System.getProperty("user.home")),
                        ".costume"), "costume.properties")));
        __properties = __mergeProperties(__properties, __readProperties(new java.io.File(
                "/etc/costume/costume.properties")));
        if (commandLinePropertiesFilePath.isPresent()) {
            __properties = __mergeProperties(__properties,
                    __readProperties(commandLinePropertiesFilePath.get()));
        }

        final org.thryft.native_.Url apiUrl;
        {
            Object apiUrlObject = __properties.remove("api_url");
            if (!(apiUrlObject instanceof String)) {
                apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
            } else {
                final String apiUrlString = ((String)apiUrlObject).trim();
                if (apiUrlString.isEmpty()) {
                    apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
                } else {
                    apiUrl = org.thryft.native_.Url.parse(apiUrlString);
                }
            }
        }

        final String environment;
        {
            Object environmentObject = __properties.remove("environment");
            if (!(environmentObject instanceof String)) {
                throw new RuntimeException("no such property environment");
            } else {
                final String environmentString = ((String)environmentObject).trim();
                if (environmentString.isEmpty()) {
                    throw new RuntimeException("property environment is empty");
                } else {
                    environment = environmentString;
                }
            }
        }

        final String elasticSearchHost;
        {
            Object elasticSearchHostObject = __properties.remove("elastic_search_host");
            if (!(elasticSearchHostObject instanceof String)) {
                elasticSearchHost = "elasticsearch";
            } else {
                final String elasticSearchHostString = ((String)elasticSearchHostObject).trim();
                if (elasticSearchHostString.isEmpty()) {
                    elasticSearchHost = "elasticsearch";
                } else {
                    elasticSearchHost = elasticSearchHostString;
                }
            }
        }

        final com.google.common.primitives.UnsignedInteger elasticSearchPort;
        {
            Object elasticSearchPortObject = __properties.remove("elastic_search_port");
            if (!(elasticSearchPortObject instanceof String)) {
                elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
            } else {
                final String elasticSearchPortString = ((String)elasticSearchPortObject).trim();
                if (elasticSearchPortString.isEmpty()) {
                    elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
                } else {
                    elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(elasticSearchPortString);
                }
            }
        }

        final String homeDirectoryPath;
        {
            Object homeDirectoryPathObject = __properties.remove("home_directory_path");
            if (!(homeDirectoryPathObject instanceof String)) {
                throw new RuntimeException("no such property home_directory_path");
            } else {
                final String homeDirectoryPathString = ((String)homeDirectoryPathObject).trim();
                if (homeDirectoryPathString.isEmpty()) {
                    throw new RuntimeException("property home_directory_path is empty");
                } else {
                    homeDirectoryPath = homeDirectoryPathString;
                }
            }
        }

        final com.google.common.base.Optional<String> logbackXmlFilePath;
        {
            Object logbackXmlFilePathObject = __properties.remove("logback_xml_file_path");
            if (!(logbackXmlFilePathObject instanceof String)) {
                logbackXmlFilePath = com.google.common.base.Optional.<String>absent();
            } else {
                final String logbackXmlFilePathString = ((String)logbackXmlFilePathObject).trim();
                if (logbackXmlFilePathString.isEmpty()) {
                    logbackXmlFilePath = com.google.common.base.Optional.<String>absent();
                } else {
                    logbackXmlFilePath = com.google.common.base.Optional.of(logbackXmlFilePathString);
                }
            }
        }

        final com.google.common.base.Optional<String> powerhouseMuseumApiKey;
        {
            Object powerhouseMuseumApiKeyObject = __properties.remove("powerhouse_museum_api_key");
            if (!(powerhouseMuseumApiKeyObject instanceof String)) {
                powerhouseMuseumApiKey = com.google.common.base.Optional.<String>absent();
            } else {
                final String powerhouseMuseumApiKeyString = ((String)powerhouseMuseumApiKeyObject).trim();
                if (powerhouseMuseumApiKeyString.isEmpty()) {
                    powerhouseMuseumApiKey = com.google.common.base.Optional.<String>absent();
                } else {
                    powerhouseMuseumApiKey = com.google.common.base.Optional.of(powerhouseMuseumApiKeyString);
                }
            }
        }

        for (final java.util.Map.Entry<Object, Object> entry : __properties.entrySet()) {
            throw new RuntimeException("properties file(s) have unknown property " + entry.getKey().toString());
        }

        return new CostumeProperties(apiUrl, environment, elasticSearchHost, elasticSearchPort, homeDirectoryPath, logbackXmlFilePath, powerhouseMuseumApiKey);
    }

    public static CostumeProperties readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static CostumeProperties readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        String environment = null;
        String elasticSearchHost = "elasticsearch";
        com.google.common.primitives.UnsignedInteger elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
        String homeDirectoryPath = null;
        com.google.common.base.Optional<String> logbackXmlFilePath = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> powerhouseMuseumApiKey = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        apiUrl = org.thryft.native_.Url.parse(iprot.readString());
        environment = iprot.readString();
        elasticSearchHost = iprot.readString();
        elasticSearchPort = iprot.readU32();
        homeDirectoryPath = iprot.readString();
        if (__list.getSize() > 5) {
            logbackXmlFilePath = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 6) {
            powerhouseMuseumApiKey = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new CostumeProperties(apiUrl, environment, elasticSearchHost, elasticSearchPort, homeDirectoryPath, logbackXmlFilePath, powerhouseMuseumApiKey);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static CostumeProperties readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url apiUrl = org.thryft.native_.Url.parse("http://middleware:8082/api/");
        String environment = null;
        String elasticSearchHost = "elasticsearch";
        com.google.common.primitives.UnsignedInteger elasticSearchPort = com.google.common.primitives.UnsignedInteger.valueOf(9300);
        String homeDirectoryPath = null;
        com.google.common.base.Optional<String> logbackXmlFilePath = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> powerhouseMuseumApiKey = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "api_url": {
                apiUrl = org.thryft.native_.Url.parse(iprot.readString());
                break;
            }
            case "environment": {
                environment = iprot.readString();
                break;
            }
            case "elastic_search_host": {
                elasticSearchHost = iprot.readString();
                break;
            }
            case "elastic_search_port": {
                elasticSearchPort = iprot.readU32();
                break;
            }
            case "home_directory_path": {
                homeDirectoryPath = iprot.readString();
                break;
            }
            case "logback_xml_file_path": {
                logbackXmlFilePath = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            case "powerhouse_museum_api_key": {
                powerhouseMuseumApiKey = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new CostumeProperties(apiUrl, environment, elasticSearchHost, elasticSearchPort, homeDirectoryPath, logbackXmlFilePath, powerhouseMuseumApiKey);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public CostumeProperties replaceApiUrl(final org.thryft.native_.Url apiUrl) {
        return new CostumeProperties(apiUrl, this.environment, this.elasticSearchHost, this.elasticSearchPort, this.homeDirectoryPath, this.logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceElasticSearchHost(final String elasticSearchHost) {
        return new CostumeProperties(this.apiUrl, this.environment, elasticSearchHost, this.elasticSearchPort, this.homeDirectoryPath, this.logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceElasticSearchPort(final com.google.common.primitives.UnsignedInteger elasticSearchPort) {
        return new CostumeProperties(this.apiUrl, this.environment, this.elasticSearchHost, elasticSearchPort, this.homeDirectoryPath, this.logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceEnvironment(final String environment) {
        return new CostumeProperties(this.apiUrl, environment, this.elasticSearchHost, this.elasticSearchPort, this.homeDirectoryPath, this.logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceHomeDirectoryPath(final String homeDirectoryPath) {
        return new CostumeProperties(this.apiUrl, this.environment, this.elasticSearchHost, this.elasticSearchPort, homeDirectoryPath, this.logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceLogbackXmlFilePath(final com.google.common.base.Optional<String> logbackXmlFilePath) {
        return new CostumeProperties(this.apiUrl, this.environment, this.elasticSearchHost, this.elasticSearchPort, this.homeDirectoryPath, logbackXmlFilePath, this.powerhouseMuseumApiKey);
    }

    public CostumeProperties replaceLogbackXmlFilePath(final String logbackXmlFilePath) {
        return replaceLogbackXmlFilePath(com.google.common.base.Optional.fromNullable(logbackXmlFilePath));
    }

    public CostumeProperties replacePowerhouseMuseumApiKey(final com.google.common.base.Optional<String> powerhouseMuseumApiKey) {
        return new CostumeProperties(this.apiUrl, this.environment, this.elasticSearchHost, this.elasticSearchPort, this.homeDirectoryPath, this.logbackXmlFilePath, powerhouseMuseumApiKey);
    }

    public CostumeProperties replacePowerhouseMuseumApiKey(final String powerhouseMuseumApiKey) {
        return replacePowerhouseMuseumApiKey(com.google.common.base.Optional.fromNullable(powerhouseMuseumApiKey));
    }

    public com.google.common.collect.ImmutableMap<String, Object> toMap() {
        final com.google.common.collect.ImmutableMap.Builder<String, Object> builder = com.google.common.collect.ImmutableMap.builder();
        builder.put("api_url", getApiUrl());
        builder.put("environment", getEnvironment());
        builder.put("elastic_search_host", getElasticSearchHost());
        builder.put("elastic_search_port", getElasticSearchPort());
        builder.put("home_directory_path", getHomeDirectoryPath());
        if (getLogbackXmlFilePath().isPresent()) {
            builder.put("logback_xml_file_path", getLogbackXmlFilePath().get());
        }
        if (getPowerhouseMuseumApiKey().isPresent()) {
            builder.put("powerhouse_museum_api_key", getPowerhouseMuseumApiKey().get());
        }
        return builder.build();
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("api_url", getApiUrl()).add("environment", getEnvironment()).add("elastic_search_host", getElasticSearchHost()).add("elastic_search_port", getElasticSearchPort()).add("home_directory_path", getHomeDirectoryPath()).add("logback_xml_file_path", getLogbackXmlFilePath().orNull()).add("powerhouse_museum_api_key", getPowerhouseMuseumApiKey().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 7);

        oprot.writeString(getApiUrl().toString());

        oprot.writeString(getEnvironment());

        oprot.writeString(getElasticSearchHost());

        oprot.writeU32(getElasticSearchPort());

        oprot.writeString(getHomeDirectoryPath());

        if (getLogbackXmlFilePath().isPresent()) {
            oprot.writeString(getLogbackXmlFilePath().get());
        } else {
            oprot.writeNull();
        }

        if (getPowerhouseMuseumApiKey().isPresent()) {
            oprot.writeString(getPowerhouseMuseumApiKey().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.lib.CostumeProperties");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("api_url", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getApiUrl().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("environment", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getEnvironment());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_host", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getElasticSearchHost());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("elastic_search_port", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getElasticSearchPort());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("home_directory_path", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getHomeDirectoryPath());
        oprot.writeFieldEnd();

        if (getLogbackXmlFilePath().isPresent()) {
            oprot.writeFieldBegin("logback_xml_file_path", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getLogbackXmlFilePath().get());
            oprot.writeFieldEnd();
        }

        if (getPowerhouseMuseumApiKey().isPresent()) {
            oprot.writeFieldBegin("powerhouse_museum_api_key", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getPowerhouseMuseumApiKey().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.thryft.native_.Url apiUrl;

    /**
     * dev, staging, production, etc.
     */
    private final String environment;

    private final String elasticSearchHost;

    private final com.google.common.primitives.UnsignedInteger elasticSearchPort;

    private final String homeDirectoryPath;

    private final com.google.common.base.Optional<String> logbackXmlFilePath;

    private final com.google.common.base.Optional<String> powerhouseMuseumApiKey;

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CostumeProperties.class);
}
