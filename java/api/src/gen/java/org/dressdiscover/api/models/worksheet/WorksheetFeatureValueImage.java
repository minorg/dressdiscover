package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureValueImage implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            rights = null;
            thumbnailUrl = null;
            fullSizeUrl = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final WorksheetFeatureValueImage other) {
            this.rights = other.getRights();
            this.thumbnailUrl = other.getThumbnailUrl();
            this.fullSizeUrl = other.getFullSizeUrl();
        }

        protected WorksheetFeatureValueImage _build(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, final com.google.common.base.Optional<String> fullSizeUrl) {
            return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrl);
        }

        public WorksheetFeatureValueImage build() {
            UncheckedValidator.validate(rights, thumbnailUrl, fullSizeUrl);

            return _build(rights, thumbnailUrl, fullSizeUrl);
        }

        public final com.google.common.base.Optional<String> getFullSizeUrl() {
            return fullSizeUrl;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights getRights() {
            return rights;
        }

        /**
         * Thumbnail and full size URLs can be relative
         */
        public final @javax.annotation.Nullable String getThumbnailUrl() {
            return thumbnailUrl;
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
                rights = org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights.readAsStruct(iprot);
                thumbnailUrl = iprot.readString();
                if (__list.getSize() > 2) {
                    fullSizeUrl = com.google.common.base.Optional.of(iprot.readString());
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
                    case "rights": {
                        rights = org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights.readAsStruct(iprot, unknownFieldCallback);
                        break;
                    }
                    case "thumbnail_url": {
                        thumbnailUrl = iprot.readString();
                        break;
                    }
                    case "full_size_url": {
                        fullSizeUrl = com.google.common.base.Optional.of(iprot.readString());
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
            case RIGHTS: setRights((org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights)value); return this;
            case THUMBNAIL_URL: setThumbnailUrl((String)value); return this;
            case FULL_SIZE_URL: setFullSizeUrl((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFullSizeUrl(final com.google.common.base.Optional<String> fullSizeUrl) {
            UncheckedValidator.validateFullSizeUrl(fullSizeUrl);
            this.fullSizeUrl = fullSizeUrl;
            return this;
        }

        public Builder setFullSizeUrl(final @javax.annotation.Nullable String fullSizeUrl) {
            return setFullSizeUrl(com.google.common.base.Optional.fromNullable(fullSizeUrl));
        }

        public Builder setIfPresent(final WorksheetFeatureValueImage other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setRights(other.getRights());
            setThumbnailUrl(other.getThumbnailUrl());
            if (other.getFullSizeUrl().isPresent()) {
                setFullSizeUrl(other.getFullSizeUrl());
            }

            return this;
        }

        public Builder setRights(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights) {
            UncheckedValidator.validateRights(rights);
            this.rights = rights;
            return this;
        }

        public Builder setThumbnailUrl(final String thumbnailUrl) {
            UncheckedValidator.validateThumbnailUrl(thumbnailUrl);
            this.thumbnailUrl = thumbnailUrl;
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
            case RIGHTS: return unsetRights();
            case THUMBNAIL_URL: return unsetThumbnailUrl();
            case FULL_SIZE_URL: return unsetFullSizeUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFullSizeUrl() {
            this.fullSizeUrl = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = null;
            return this;
        }

        public Builder unsetThumbnailUrl() {
            this.thumbnailUrl = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights;
        /**
         * Thumbnail and full size URLs can be relative
         */
        private @javax.annotation.Nullable String thumbnailUrl;
        private com.google.common.base.Optional<String> fullSizeUrl;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureValueImage> {
        @Override
        public WorksheetFeatureValueImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueImage.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureValueImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueImage.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureValueImage readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueImage.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureValueImage readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueImage.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureValueImage readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueImage.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights>() {}, true, (short)0, "rights", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL_URL("thumbnailUrl", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "thumbnail_url", org.thryft.protocol.Type.STRING),
        FULL_SIZE_URL("fullSizeUrl", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "full_size_url", org.thryft.protocol.Type.STRING);

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
            case "rights": return RIGHTS;
            case "thumbnailUrl": return THUMBNAIL_URL;
            case "fullSizeUrl": return FULL_SIZE_URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "rights": return RIGHTS;
            case "thumbnail_url": return THUMBNAIL_URL;
            case "full_size_url": return FULL_SIZE_URL;
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
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, final com.google.common.base.Optional<String> fullSizeUrl) throws org.thryft.protocol.InputProtocolException {
            validateRights(rights);
            validateThumbnailUrl(thumbnailUrl);
            validateFullSizeUrl(fullSizeUrl);
        }

        public static void validateRights(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: rights is null");
            }
        }

        public static void validateThumbnailUrl(final String thumbnailUrl) throws org.thryft.protocol.InputProtocolException {
            if (thumbnailUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: thumbnailUrl is null");
            }
            {
                final int __strLen = thumbnailUrl.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(thumbnailUrl.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.thumbnailUrl: blank '%s' (length=%d)", thumbnailUrl, __strLen));
                }
            }
            if (thumbnailUrl.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.thumbnailUrl: less than min length 1");
            }
        }

        public static void validateFullSizeUrl(final com.google.common.base.Optional<String> fullSizeUrl) throws org.thryft.protocol.InputProtocolException {
            if (fullSizeUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: fullSizeUrl is null");
            }
            if (!fullSizeUrl.isPresent()) {
                return;
            }
            {
                final int __strLen = fullSizeUrl.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(fullSizeUrl.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.fullSizeUrl: blank '%s' (length=%d)", fullSizeUrl.get(), __strLen));
                }
            }
            if (fullSizeUrl.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.fullSizeUrl: less than min length 1");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, final com.google.common.base.Optional<String> fullSizeUrl) {
            validateRights(rights);
            validateThumbnailUrl(thumbnailUrl);
            validateFullSizeUrl(fullSizeUrl);
        }

        public static void validateRights(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights) {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: rights is null");
            }
        }

        public static void validateThumbnailUrl(final String thumbnailUrl) {
            if (thumbnailUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: thumbnailUrl is null");
            }
            {
                final int __strLen = thumbnailUrl.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(thumbnailUrl.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.thumbnailUrl: blank '%s' (length=%d)", thumbnailUrl, __strLen));
                }
            }
            if (thumbnailUrl.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.thumbnailUrl: less than min length 1");
            }
        }

        public static void validateFullSizeUrl(final com.google.common.base.Optional<String> fullSizeUrl) {
            if (fullSizeUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage: fullSizeUrl is null");
            }
            if (!fullSizeUrl.isPresent()) {
                return;
            }
            {
                final int __strLen = fullSizeUrl.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(fullSizeUrl.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.fullSizeUrl: blank '%s' (length=%d)", fullSizeUrl.get(), __strLen));
                }
            }
            if (fullSizeUrl.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.fullSizeUrl: less than min length 1");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureValueImage(final WorksheetFeatureValueImage other) {
        this(other.getRights(), other.getThumbnailUrl(), other.getFullSizeUrl());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureValueImage(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, final com.google.common.base.Optional<String> fullSizeUrl) {
        this.rights = rights;
        this.thumbnailUrl = thumbnailUrl;
        this.fullSizeUrl = fullSizeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureValueImage other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureValueImage> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static WorksheetFeatureValueImage create(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl) {
        UncheckedValidator.validate(rights, thumbnailUrl, com.google.common.base.Optional.<String> absent());
        return new WorksheetFeatureValueImage(rights, thumbnailUrl, com.google.common.base.Optional.<String> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureValueImage create(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, @javax.annotation.Nullable final String fullSizeUrl) {
        final com.google.common.base.Optional<String> fullSizeUrlOptional = com.google.common.base.Optional.fromNullable(fullSizeUrl);
        UncheckedValidator.validate(rights, thumbnailUrl, fullSizeUrlOptional);
        return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrlOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureValueImage create(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights, final String thumbnailUrl, final com.google.common.base.Optional<String> fullSizeUrl) {
        UncheckedValidator.validate(rights, thumbnailUrl, fullSizeUrl);
        return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrl);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureValueImage)) {
            return false;
        }

        final WorksheetFeatureValueImage other = (WorksheetFeatureValueImage)otherObject;

        if (!(getRights().equals(other.getRights()))) {
            return false;
        }

        if (!(getThumbnailUrl().equals(other.getThumbnailUrl()))) {
            return false;
        }

        if (!(((getFullSizeUrl().isPresent() && other.getFullSizeUrl().isPresent()) ? (getFullSizeUrl().get().equals(other.getFullSizeUrl().get())) : (!getFullSizeUrl().isPresent() && !other.getFullSizeUrl().isPresent())))) {
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
        case RIGHTS: return getRights();
        case THUMBNAIL_URL: return getThumbnailUrl();
        case FULL_SIZE_URL: return getFullSizeUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getFullSizeUrl() {
        return fullSizeUrl;
    }

    public final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights getRights() {
        return rights;
    }

    /**
     * Thumbnail and full size URLs can be relative
     */
    public final String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRights().hashCode();
        hashCode = 31 * hashCode + getThumbnailUrl().hashCode();
        if (getFullSizeUrl().isPresent()) {
            hashCode = 31 * hashCode + getFullSizeUrl().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetFeatureValueImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureValueImage readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights;
        String thumbnailUrl;
        com.google.common.base.Optional<String> fullSizeUrl = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            rights = org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights.readAsStruct(iprot);
            thumbnailUrl = iprot.readString();
            if (__list.getSize() > 2) {
                fullSizeUrl = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(rights, thumbnailUrl, fullSizeUrl);

        return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrl);
    }

    public static WorksheetFeatureValueImage readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueImage readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights = null;
        @javax.annotation.Nullable String thumbnailUrl = null;
        com.google.common.base.Optional<String> fullSizeUrl = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "rights": {
                    rights = org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights.readAsStruct(iprot, unknownFieldCallback);
                    break;
                }
                case "thumbnail_url": {
                    thumbnailUrl = iprot.readString();
                    break;
                }
                case "full_size_url": {
                    fullSizeUrl = com.google.common.base.Optional.of(iprot.readString());
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

        ReadValidator.validate(rights, thumbnailUrl, fullSizeUrl);

        return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrl);
    }

    public WorksheetFeatureValueImage replaceFullSizeUrl(final com.google.common.base.Optional<String> fullSizeUrl) {
        UncheckedValidator.validateFullSizeUrl(fullSizeUrl);
        return new WorksheetFeatureValueImage(this.rights, this.thumbnailUrl, fullSizeUrl);
    }

    public WorksheetFeatureValueImage replaceFullSizeUrl(@javax.annotation.Nullable final String fullSizeUrl) {
        return replaceFullSizeUrl(com.google.common.base.Optional.fromNullable(fullSizeUrl));
    }

    public WorksheetFeatureValueImage replaceRights(final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights) {
        UncheckedValidator.validateRights(rights);
        return new WorksheetFeatureValueImage(rights, this.thumbnailUrl, this.fullSizeUrl);
    }

    public WorksheetFeatureValueImage replaceThumbnailUrl(final String thumbnailUrl) {
        UncheckedValidator.validateThumbnailUrl(thumbnailUrl);
        return new WorksheetFeatureValueImage(this.rights, thumbnailUrl, this.fullSizeUrl);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights", getRights()).add("thumbnail_url", getThumbnailUrl()).add("full_size_url", getFullSizeUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        getRights().writeAsStruct(oprot);

        oprot.writeString(getThumbnailUrl());

        if (getFullSizeUrl().isPresent()) {
            oprot.writeString(getFullSizeUrl().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeRightsField(oprot);

        writeThumbnailUrlField(oprot);

        writeFullSizeUrlField(oprot);

        oprot.writeFieldStop();
    }

    public void writeFullSizeUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFullSizeUrl().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FULL_SIZE_URL);
            oprot.writeString(getFullSizeUrl().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.RIGHTS);
        getRights().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeThumbnailUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.THUMBNAIL_URL);
        oprot.writeString(getThumbnailUrl());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImageRights rights;

    /**
     * Thumbnail and full size URLs can be relative
     */
    private final String thumbnailUrl;

    private final com.google.common.base.Optional<String> fullSizeUrl;
}
