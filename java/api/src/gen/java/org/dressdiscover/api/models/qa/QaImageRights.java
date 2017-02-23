package org.dressdiscover.api.models.qa;

public final class QaImageRights implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            author = null;
            license = null;
            sourceName = null;
            sourceUrl = null;
        }

        public Builder(final QaImageRights other) {
            this.author = other.getAuthor();
            this.license = other.getLicense();
            this.sourceName = other.getSourceName();
            this.sourceUrl = other.getSourceUrl();
        }

        protected QaImageRights _build(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
            return new QaImageRights(author, license, sourceName, sourceUrl, DefaultConstructionValidator.getInstance());
        }

        public QaImageRights build() {
            return _build(author, license, sourceName, sourceUrl);
        }

        public final String getAuthor() {
            return author;
        }

        public final String getLicense() {
            return license;
        }

        public final String getSourceName() {
            return sourceName;
        }

        public final org.thryft.native_.Url getSourceUrl() {
            return sourceUrl;
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
                author = iprot.readString();
                license = iprot.readString();
                sourceName = iprot.readString();
                try {
                    sourceUrl = org.thryft.native_.Url.parse(iprot.readString());
                } catch (final java.lang.IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_URL, e);
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
                    case "author": {
                        author = iprot.readString();
                        break;
                    }
                    case "license": {
                        license = iprot.readString();
                        break;
                    }
                    case "source_name": {
                        sourceName = iprot.readString();
                        break;
                    }
                    case "source_url": {
                        try {
                            sourceUrl = org.thryft.native_.Url.parse(iprot.readString());
                        } catch (final java.lang.IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_URL, e);
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case AUTHOR: setAuthor((String)value); return this;
            case LICENSE: setLicense((String)value); return this;
            case SOURCE_NAME: setSourceName((String)value); return this;
            case SOURCE_URL: setSourceUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAuthor(final String author) {
            this.author = DefaultConstructionValidator.getInstance().validateAuthor(author);
            return this;
        }

        public Builder setIfPresent(final QaImageRights other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setAuthor(other.getAuthor());
            setLicense(other.getLicense());
            setSourceName(other.getSourceName());
            setSourceUrl(other.getSourceUrl());

            return this;
        }

        public Builder setLicense(final String license) {
            this.license = DefaultConstructionValidator.getInstance().validateLicense(license);
            return this;
        }

        public Builder setSourceName(final String sourceName) {
            this.sourceName = DefaultConstructionValidator.getInstance().validateSourceName(sourceName);
            return this;
        }

        public Builder setSourceUrl(final org.thryft.native_.Url sourceUrl) {
            this.sourceUrl = DefaultConstructionValidator.getInstance().validateSourceUrl(sourceUrl);
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
            case AUTHOR: return unsetAuthor();
            case LICENSE: return unsetLicense();
            case SOURCE_NAME: return unsetSourceName();
            case SOURCE_URL: return unsetSourceUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAuthor() {
            this.author = null;
            return this;
        }

        public Builder unsetLicense() {
            this.license = null;
            return this;
        }

        public Builder unsetSourceName() {
            this.sourceName = null;
            return this;
        }

        public Builder unsetSourceUrl() {
            this.sourceUrl = null;
            return this;
        }

        private String author;
        private String license;
        private String sourceName;
        private org.thryft.native_.Url sourceUrl;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QaImageRights> {
        @Override
        public QaImageRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QaImageRights.readAs(iprot, type);
        }

        @Override
        public QaImageRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaImageRights.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QaImageRights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaImageRights.readAsList(iprot);
        }

        @Override
        public QaImageRights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaImageRights.readAsStruct(iprot);
        }

        @Override
        public QaImageRights readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaImageRights.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AUTHOR("author", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "author", org.thryft.protocol.Type.STRING),
        LICENSE("license", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "license", org.thryft.protocol.Type.STRING),
        SOURCE_NAME("sourceName", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "source_name", org.thryft.protocol.Type.STRING),
        SOURCE_URL("sourceUrl", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 0, "source_url", org.thryft.protocol.Type.STRING);

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
            case "author": return AUTHOR;
            case "license": return LICENSE;
            case "sourceName": return SOURCE_NAME;
            case "sourceUrl": return SOURCE_URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "author": return AUTHOR;
            case "license": return LICENSE;
            case "source_name": return SOURCE_NAME;
            case "source_url": return SOURCE_URL;
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
        public String validateAuthor(final String author) throws ExceptionT;

        public String validateLicense(final String license) throws ExceptionT;

        public String validateSourceName(final String sourceName) throws ExceptionT;

        public org.thryft.native_.Url validateSourceUrl(final org.thryft.native_.Url sourceUrl) throws ExceptionT;
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
        public String validateAuthor(final String author) throws RuntimeException {
            if (author == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImageRights: author is null");
            }
            if (author.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QaImageRights: author is less than min length 1");
            }
            {
                final int __strLen = author.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(author.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QaImageRights: author is blank: '%s' (length=%d)", author, __strLen));
                }
            }
            return author;
        }

        @Override
        public String validateLicense(final String license) throws RuntimeException {
            if (license == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImageRights: license is null");
            }
            if (license.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QaImageRights: license is less than min length 1");
            }
            {
                final int __strLen = license.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(license.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QaImageRights: license is blank: '%s' (length=%d)", license, __strLen));
                }
            }
            return license;
        }

        @Override
        public String validateSourceName(final String sourceName) throws RuntimeException {
            if (sourceName == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImageRights: sourceName is null");
            }
            if (sourceName.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QaImageRights: sourceName is less than min length 1");
            }
            {
                final int __strLen = sourceName.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(sourceName.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QaImageRights: sourceName is blank: '%s' (length=%d)", sourceName, __strLen));
                }
            }
            return sourceName;
        }

        @Override
        public org.thryft.native_.Url validateSourceUrl(final org.thryft.native_.Url sourceUrl) throws RuntimeException {
            if (sourceUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImageRights: sourceUrl is null");
            }
            return sourceUrl;
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
        public String validateAuthor(final String author) {
            return author;
        }

        @Override
        public String validateLicense(final String license) {
            return license;
        }

        @Override
        public String validateSourceName(final String sourceName) {
            return sourceName;
        }

        @Override
        public org.thryft.native_.Url validateSourceUrl(final org.thryft.native_.Url sourceUrl) {
            return sourceUrl;
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
        public String validateAuthor(final String author) throws org.thryft.protocol.InputProtocolException {
            if (author == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AUTHOR, "org.dressdiscover.api.models.qa.QaImageRights: author is null");
            }
            if (author.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUTHOR, "org.dressdiscover.api.models.qa.QaImageRights: author is less than min length 1");
            }
            {
                final int __strLen = author.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(author.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUTHOR, String.format("org.dressdiscover.api.models.qa.QaImageRights: author is blank: '%s' (length=%d)", author, __strLen));
                }
            }
            return author;
        }

        @Override
        public String validateLicense(final String license) throws org.thryft.protocol.InputProtocolException {
            if (license == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LICENSE, "org.dressdiscover.api.models.qa.QaImageRights: license is null");
            }
            if (license.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LICENSE, "org.dressdiscover.api.models.qa.QaImageRights: license is less than min length 1");
            }
            {
                final int __strLen = license.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(license.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LICENSE, String.format("org.dressdiscover.api.models.qa.QaImageRights: license is blank: '%s' (length=%d)", license, __strLen));
                }
            }
            return license;
        }

        @Override
        public String validateSourceName(final String sourceName) throws org.thryft.protocol.InputProtocolException {
            if (sourceName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE_NAME, "org.dressdiscover.api.models.qa.QaImageRights: sourceName is null");
            }
            if (sourceName.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_NAME, "org.dressdiscover.api.models.qa.QaImageRights: sourceName is less than min length 1");
            }
            {
                final int __strLen = sourceName.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(sourceName.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_NAME, String.format("org.dressdiscover.api.models.qa.QaImageRights: sourceName is blank: '%s' (length=%d)", sourceName, __strLen));
                }
            }
            return sourceName;
        }

        @Override
        public org.thryft.native_.Url validateSourceUrl(final org.thryft.native_.Url sourceUrl) throws org.thryft.protocol.InputProtocolException {
            if (sourceUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE_URL, "org.dressdiscover.api.models.qa.QaImageRights: sourceUrl is null");
            }
            return sourceUrl;
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
        public String validateAuthor(final String author) {
            return author;
        }

        @Override
        public String validateLicense(final String license) {
            return license;
        }

        @Override
        public String validateSourceName(final String sourceName) {
            return sourceName;
        }

        @Override
        public org.thryft.native_.Url validateSourceUrl(final org.thryft.native_.Url sourceUrl) {
            return sourceUrl;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QaImageRights(final QaImageRights other) {
        this(other.getAuthor(), other.getLicense(), other.getSourceName(), other.getSourceUrl(), NopConstructionValidator.getInstance());
    }

    protected QaImageRights(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl, ConstructionValidator validator) {
        this.author = validator.validateAuthor(author);
        this.license = validator.validateLicense(license);
        this.sourceName = validator.validateSourceName(sourceName);
        this.sourceUrl = validator.validateSourceUrl(sourceUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QaImageRights other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QaImageRights> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static QaImageRights create(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
        return new QaImageRights(author, license, sourceName, sourceUrl, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QaImageRights)) {
            return false;
        }

        final QaImageRights other = (QaImageRights)otherObject;

        if (!(getAuthor().equals(other.getAuthor()))) {
            return false;
        }

        if (!(getLicense().equals(other.getLicense()))) {
            return false;
        }

        if (!(getSourceName().equals(other.getSourceName()))) {
            return false;
        }

        if (!(getSourceUrl().equals(other.getSourceUrl()))) {
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
        case AUTHOR: return getAuthor();
        case LICENSE: return getLicense();
        case SOURCE_NAME: return getSourceName();
        case SOURCE_URL: return getSourceUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getAuthor() {
        return author;
    }

    public final String getLicense() {
        return license;
    }

    public final String getSourceName() {
        return sourceName;
    }

    public final org.thryft.native_.Url getSourceUrl() {
        return sourceUrl;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAuthor().hashCode();
        hashCode = 31 * hashCode + getLicense().hashCode();
        hashCode = 31 * hashCode + getSourceName().hashCode();
        hashCode = 31 * hashCode + getSourceUrl().hashCode();
        return hashCode;
    }

    public static QaImageRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaImageRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QaImageRights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String author = null;
        String license = null;
        String sourceName = null;
        org.thryft.native_.Url sourceUrl = null;

        try {
            iprot.readListBegin();
            author = iprot.readString();
            license = iprot.readString();
            sourceName = iprot.readString();
            try {
                sourceUrl = org.thryft.native_.Url.parse(iprot.readString());
            } catch (final java.lang.IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_URL, e);
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QaImageRights(DefaultReadValidator.getInstance().validateAuthor(author), DefaultReadValidator.getInstance().validateLicense(license), DefaultReadValidator.getInstance().validateSourceName(sourceName), DefaultReadValidator.getInstance().validateSourceUrl(sourceUrl), NopConstructionValidator.getInstance());
    }

    public static QaImageRights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaImageRights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String author = null;
        String license = null;
        String sourceName = null;
        org.thryft.native_.Url sourceUrl = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "author": {
                    author = iprot.readString();
                    break;
                }
                case "license": {
                    license = iprot.readString();
                    break;
                }
                case "source_name": {
                    sourceName = iprot.readString();
                    break;
                }
                case "source_url": {
                    try {
                        sourceUrl = org.thryft.native_.Url.parse(iprot.readString());
                    } catch (final java.lang.IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_URL, e);
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
        return new QaImageRights(DefaultReadValidator.getInstance().validateAuthor(author), DefaultReadValidator.getInstance().validateLicense(license), DefaultReadValidator.getInstance().validateSourceName(sourceName), DefaultReadValidator.getInstance().validateSourceUrl(sourceUrl), NopConstructionValidator.getInstance());
    }

    public QaImageRights replaceAuthor(final String author) {
        return new QaImageRights(DefaultConstructionValidator.getInstance().validateAuthor(author), this.license, this.sourceName, this.sourceUrl, NopConstructionValidator.getInstance());
    }

    public QaImageRights replaceLicense(final String license) {
        return new QaImageRights(this.author, DefaultConstructionValidator.getInstance().validateLicense(license), this.sourceName, this.sourceUrl, NopConstructionValidator.getInstance());
    }

    public QaImageRights replaceSourceName(final String sourceName) {
        return new QaImageRights(this.author, this.license, DefaultConstructionValidator.getInstance().validateSourceName(sourceName), this.sourceUrl, NopConstructionValidator.getInstance());
    }

    public QaImageRights replaceSourceUrl(final org.thryft.native_.Url sourceUrl) {
        return new QaImageRights(this.author, this.license, this.sourceName, DefaultConstructionValidator.getInstance().validateSourceUrl(sourceUrl), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("author", getAuthor()).add("license", getLicense()).add("source_name", getSourceName()).add("source_url", getSourceUrl()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getAuthor());

        oprot.writeString(getLicense());

        oprot.writeString(getSourceName());

        oprot.writeString(getSourceUrl().toString());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QaImageRights");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("author", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getAuthor());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("license", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getLicense());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("source_name", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getSourceName());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("source_url", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getSourceUrl().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final String author;

    private final String license;

    private final String sourceName;

    private final org.thryft.native_.Url sourceUrl;
}
