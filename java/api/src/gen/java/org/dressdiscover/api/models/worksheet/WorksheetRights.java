package org.dressdiscover.api.models.worksheet;

public final class WorksheetRights implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            author = null;
            license = null;
            sourceName = null;
            sourceUrl = null;
        }

        public Builder(final WorksheetRights other) {
            this.author = other.getAuthor();
            this.license = other.getLicense();
            this.sourceName = other.getSourceName();
            this.sourceUrl = other.getSourceUrl();
        }

        protected WorksheetRights _build(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
            return new WorksheetRights(author, license, sourceName, sourceUrl);
        }

        public WorksheetRights build() {
            UncheckedValidator.validate(author, license, sourceName, sourceUrl);

            return _build(author, license, sourceName, sourceUrl);
        }

        public final @javax.annotation.Nullable String getAuthor() {
            return author;
        }

        public final @javax.annotation.Nullable String getLicense() {
            return license;
        }

        public final @javax.annotation.Nullable String getSourceName() {
            return sourceName;
        }

        public final @javax.annotation.Nullable org.thryft.native_.Url getSourceUrl() {
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
            UncheckedValidator.validateAuthor(author);
            this.author = author;
            return this;
        }

        public Builder setIfPresent(final WorksheetRights other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setAuthor(other.getAuthor());
            setLicense(other.getLicense());
            setSourceName(other.getSourceName());
            setSourceUrl(other.getSourceUrl());

            return this;
        }

        public Builder setLicense(final String license) {
            UncheckedValidator.validateLicense(license);
            this.license = license;
            return this;
        }

        public Builder setSourceName(final String sourceName) {
            UncheckedValidator.validateSourceName(sourceName);
            this.sourceName = sourceName;
            return this;
        }

        public Builder setSourceUrl(final org.thryft.native_.Url sourceUrl) {
            UncheckedValidator.validateSourceUrl(sourceUrl);
            this.sourceUrl = sourceUrl;
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

        private @javax.annotation.Nullable String author;
        private @javax.annotation.Nullable String license;
        private @javax.annotation.Nullable String sourceName;
        private @javax.annotation.Nullable org.thryft.native_.Url sourceUrl;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetRights> {
        @Override
        public WorksheetRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetRights.readAs(iprot, type);
        }

        @Override
        public WorksheetRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetRights.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetRights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetRights.readAsList(iprot);
        }

        @Override
        public WorksheetRights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetRights.readAsStruct(iprot);
        }

        @Override
        public WorksheetRights readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetRights.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AUTHOR("author", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "author", org.thryft.protocol.Type.STRING),
        LICENSE("license", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "license", org.thryft.protocol.Type.STRING),
        SOURCE_NAME("sourceName", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "source_name", org.thryft.protocol.Type.STRING),
        SOURCE_URL("sourceUrl", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, (short)0, "source_url", org.thryft.protocol.Type.STRING);

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
        public static void validate(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) throws org.thryft.protocol.InputProtocolException {
            validateAuthor(author);
            validateLicense(license);
            validateSourceName(sourceName);
            validateSourceUrl(sourceUrl);
        }

        public static void validateAuthor(final String author) throws org.thryft.protocol.InputProtocolException {
            if (author == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AUTHOR, "org.dressdiscover.api.models.worksheet.WorksheetRights: author is null");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUTHOR, String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.author: blank '%s' (length=%d)", author, __strLen));
                }
            }
            if (author.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUTHOR, "org.dressdiscover.api.models.worksheet.WorksheetRights.author: less than min length 1");
            }
        }

        public static void validateLicense(final String license) throws org.thryft.protocol.InputProtocolException {
            if (license == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LICENSE, "org.dressdiscover.api.models.worksheet.WorksheetRights: license is null");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LICENSE, String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.license: blank '%s' (length=%d)", license, __strLen));
                }
            }
            if (license.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LICENSE, "org.dressdiscover.api.models.worksheet.WorksheetRights.license: less than min length 1");
            }
        }

        public static void validateSourceName(final String sourceName) throws org.thryft.protocol.InputProtocolException {
            if (sourceName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE_NAME, "org.dressdiscover.api.models.worksheet.WorksheetRights: sourceName is null");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_NAME, String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.sourceName: blank '%s' (length=%d)", sourceName, __strLen));
                }
            }
            if (sourceName.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE_NAME, "org.dressdiscover.api.models.worksheet.WorksheetRights.sourceName: less than min length 1");
            }
        }

        public static void validateSourceUrl(final org.thryft.native_.Url sourceUrl) throws org.thryft.protocol.InputProtocolException {
            if (sourceUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE_URL, "org.dressdiscover.api.models.worksheet.WorksheetRights: sourceUrl is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
            validateAuthor(author);
            validateLicense(license);
            validateSourceName(sourceName);
            validateSourceUrl(sourceUrl);
        }

        public static void validateAuthor(final String author) {
            if (author == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetRights: author is null");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.author: blank '%s' (length=%d)", author, __strLen));
                }
            }
            if (author.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetRights.author: less than min length 1");
            }
        }

        public static void validateLicense(final String license) {
            if (license == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetRights: license is null");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.license: blank '%s' (length=%d)", license, __strLen));
                }
            }
            if (license.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetRights.license: less than min length 1");
            }
        }

        public static void validateSourceName(final String sourceName) {
            if (sourceName == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetRights: sourceName is null");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetRights.sourceName: blank '%s' (length=%d)", sourceName, __strLen));
                }
            }
            if (sourceName.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetRights.sourceName: less than min length 1");
            }
        }

        public static void validateSourceUrl(final org.thryft.native_.Url sourceUrl) {
            if (sourceUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetRights: sourceUrl is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetRights(final WorksheetRights other) {
        this(other.getAuthor(), other.getLicense(), other.getSourceName(), other.getSourceUrl());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetRights(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
        this.author = author;
        this.license = license;
        this.sourceName = sourceName;
        this.sourceUrl = sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetRights other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetRights> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static WorksheetRights create(final String author, final String license, final String sourceName, final org.thryft.native_.Url sourceUrl) {
        UncheckedValidator.validate(author, license, sourceName, sourceUrl);
        return new WorksheetRights(author, license, sourceName, sourceUrl);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetRights)) {
            return false;
        }

        final WorksheetRights other = (WorksheetRights)otherObject;

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

    public static WorksheetRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetRights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetRights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String author;
        String license;
        String sourceName;
        org.thryft.native_.Url sourceUrl;

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

        ReadValidator.validate(author, license, sourceName, sourceUrl);

        return new WorksheetRights(author, license, sourceName, sourceUrl);
    }

    public static WorksheetRights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetRights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String author = null;
        @javax.annotation.Nullable String license = null;
        @javax.annotation.Nullable String sourceName = null;
        @javax.annotation.Nullable org.thryft.native_.Url sourceUrl = null;

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

        ReadValidator.validate(author, license, sourceName, sourceUrl);

        return new WorksheetRights(author, license, sourceName, sourceUrl);
    }

    public WorksheetRights replaceAuthor(final String author) {
        UncheckedValidator.validateAuthor(author);
        return new WorksheetRights(author, this.license, this.sourceName, this.sourceUrl);
    }

    public WorksheetRights replaceLicense(final String license) {
        UncheckedValidator.validateLicense(license);
        return new WorksheetRights(this.author, license, this.sourceName, this.sourceUrl);
    }

    public WorksheetRights replaceSourceName(final String sourceName) {
        UncheckedValidator.validateSourceName(sourceName);
        return new WorksheetRights(this.author, this.license, sourceName, this.sourceUrl);
    }

    public WorksheetRights replaceSourceUrl(final org.thryft.native_.Url sourceUrl) {
        UncheckedValidator.validateSourceUrl(sourceUrl);
        return new WorksheetRights(this.author, this.license, this.sourceName, sourceUrl);
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
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetRights");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeAuthorField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.AUTHOR);
        oprot.writeString(getAuthor());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeAuthorField(oprot);

        writeLicenseField(oprot);

        writeSourceNameField(oprot);

        writeSourceUrlField(oprot);

        oprot.writeFieldStop();
    }

    public void writeLicenseField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.LICENSE);
        oprot.writeString(getLicense());
        oprot.writeFieldEnd();
    }

    public void writeSourceNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.SOURCE_NAME);
        oprot.writeString(getSourceName());
        oprot.writeFieldEnd();
    }

    public void writeSourceUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.SOURCE_URL);
        oprot.writeString(getSourceUrl().toString());
        oprot.writeFieldEnd();
    }

    private final String author;

    private final String license;

    private final String sourceName;

    private final org.thryft.native_.Url sourceUrl;
}
