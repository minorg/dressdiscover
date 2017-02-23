package org.dressdiscover.api.models.qa;

public final class QaImage implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            fullSizeUrl = null;
            rights = null;
            thumbnailUrl = null;
        }

        public Builder(final QaImage other) {
            this.fullSizeUrl = other.getFullSizeUrl();
            this.rights = other.getRights();
            this.thumbnailUrl = other.getThumbnailUrl();
        }

        protected QaImage _build(final String fullSizeUrl, final org.dressdiscover.api.models.qa.QaImageRights rights, final String thumbnailUrl) {
            return new QaImage(fullSizeUrl, rights, thumbnailUrl, DefaultConstructionValidator.getInstance());
        }

        public QaImage build() {
            return _build(fullSizeUrl, rights, thumbnailUrl);
        }

        /**
         * Thumbnail and full size URLs can be relative
         */
        public final String getFullSizeUrl() {
            return fullSizeUrl;
        }

        public final org.dressdiscover.api.models.qa.QaImageRights getRights() {
            return rights;
        }

        public final String getThumbnailUrl() {
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
                iprot.readListBegin();
                fullSizeUrl = iprot.readString();
                rights = org.dressdiscover.api.models.qa.QaImageRights.readAsStruct(iprot);
                thumbnailUrl = iprot.readString();
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
                    case "full_size_url": {
                        fullSizeUrl = iprot.readString();
                        break;
                    }
                    case "rights": {
                        rights = org.dressdiscover.api.models.qa.QaImageRights.readAsStruct(iprot);
                        break;
                    }
                    case "thumbnail_url": {
                        thumbnailUrl = iprot.readString();
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
            case FULL_SIZE_URL: setFullSizeUrl((String)value); return this;
            case RIGHTS: setRights((org.dressdiscover.api.models.qa.QaImageRights)value); return this;
            case THUMBNAIL_URL: setThumbnailUrl((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFullSizeUrl(final String fullSizeUrl) {
            this.fullSizeUrl = DefaultConstructionValidator.getInstance().validateFullSizeUrl(fullSizeUrl);
            return this;
        }

        public Builder setIfPresent(final QaImage other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setFullSizeUrl(other.getFullSizeUrl());
            setRights(other.getRights());
            setThumbnailUrl(other.getThumbnailUrl());

            return this;
        }

        public Builder setRights(final org.dressdiscover.api.models.qa.QaImageRights rights) {
            this.rights = DefaultConstructionValidator.getInstance().validateRights(rights);
            return this;
        }

        public Builder setThumbnailUrl(final String thumbnailUrl) {
            this.thumbnailUrl = DefaultConstructionValidator.getInstance().validateThumbnailUrl(thumbnailUrl);
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
            case FULL_SIZE_URL: return unsetFullSizeUrl();
            case RIGHTS: return unsetRights();
            case THUMBNAIL_URL: return unsetThumbnailUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFullSizeUrl() {
            this.fullSizeUrl = null;
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

        /**
         * Thumbnail and full size URLs can be relative
         */
        private String fullSizeUrl;
        private org.dressdiscover.api.models.qa.QaImageRights rights;
        private String thumbnailUrl;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QaImage> {
        @Override
        public QaImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QaImage.readAs(iprot, type);
        }

        @Override
        public QaImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaImage.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QaImage readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaImage.readAsList(iprot);
        }

        @Override
        public QaImage readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QaImage.readAsStruct(iprot);
        }

        @Override
        public QaImage readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QaImage.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FULL_SIZE_URL("fullSizeUrl", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "full_size_url", org.thryft.protocol.Type.STRING),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.qa.QaImageRights>() {}, true, 0, "rights", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL_URL("thumbnailUrl", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "thumbnail_url", org.thryft.protocol.Type.STRING);

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
            case "fullSizeUrl": return FULL_SIZE_URL;
            case "rights": return RIGHTS;
            case "thumbnailUrl": return THUMBNAIL_URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "full_size_url": return FULL_SIZE_URL;
            case "rights": return RIGHTS;
            case "thumbnail_url": return THUMBNAIL_URL;
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
        public String validateFullSizeUrl(final String fullSizeUrl) throws ExceptionT;

        public org.dressdiscover.api.models.qa.QaImageRights validateRights(final org.dressdiscover.api.models.qa.QaImageRights rights) throws ExceptionT;

        public String validateThumbnailUrl(final String thumbnailUrl) throws ExceptionT;
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
        public String validateFullSizeUrl(final String fullSizeUrl) throws RuntimeException {
            if (fullSizeUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is null");
            }
            if (fullSizeUrl.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is less than min length 1");
            }
            {
                final int __strLen = fullSizeUrl.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(fullSizeUrl.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is blank: '%s' (length=%d)", fullSizeUrl, __strLen));
                }
            }
            return fullSizeUrl;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImageRights validateRights(final org.dressdiscover.api.models.qa.QaImageRights rights) throws RuntimeException {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImage: rights is null");
            }
            return rights;
        }

        @Override
        public String validateThumbnailUrl(final String thumbnailUrl) throws RuntimeException {
            if (thumbnailUrl == null) {
                throw new NullPointerException("org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is null");
            }
            if (thumbnailUrl.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is less than min length 1");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is blank: '%s' (length=%d)", thumbnailUrl, __strLen));
                }
            }
            return thumbnailUrl;
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
        public String validateFullSizeUrl(final String fullSizeUrl) {
            return fullSizeUrl;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImageRights validateRights(final org.dressdiscover.api.models.qa.QaImageRights rights) {
            return rights;
        }

        @Override
        public String validateThumbnailUrl(final String thumbnailUrl) {
            return thumbnailUrl;
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
        public String validateFullSizeUrl(final String fullSizeUrl) throws org.thryft.protocol.InputProtocolException {
            if (fullSizeUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, "org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is null");
            }
            if (fullSizeUrl.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, "org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is less than min length 1");
            }
            {
                final int __strLen = fullSizeUrl.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(fullSizeUrl.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FULL_SIZE_URL, String.format("org.dressdiscover.api.models.qa.QaImage: fullSizeUrl is blank: '%s' (length=%d)", fullSizeUrl, __strLen));
                }
            }
            return fullSizeUrl;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImageRights validateRights(final org.dressdiscover.api.models.qa.QaImageRights rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.qa.QaImage: rights is null");
            }
            return rights;
        }

        @Override
        public String validateThumbnailUrl(final String thumbnailUrl) throws org.thryft.protocol.InputProtocolException {
            if (thumbnailUrl == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, "org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is null");
            }
            if (thumbnailUrl.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, "org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is less than min length 1");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.THUMBNAIL_URL, String.format("org.dressdiscover.api.models.qa.QaImage: thumbnailUrl is blank: '%s' (length=%d)", thumbnailUrl, __strLen));
                }
            }
            return thumbnailUrl;
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
        public String validateFullSizeUrl(final String fullSizeUrl) {
            return fullSizeUrl;
        }

        @Override
        public org.dressdiscover.api.models.qa.QaImageRights validateRights(final org.dressdiscover.api.models.qa.QaImageRights rights) {
            return rights;
        }

        @Override
        public String validateThumbnailUrl(final String thumbnailUrl) {
            return thumbnailUrl;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QaImage(final QaImage other) {
        this(other.getFullSizeUrl(), other.getRights(), other.getThumbnailUrl(), NopConstructionValidator.getInstance());
    }

    protected QaImage(final String fullSizeUrl, final org.dressdiscover.api.models.qa.QaImageRights rights, final String thumbnailUrl, ConstructionValidator validator) {
        this.fullSizeUrl = validator.validateFullSizeUrl(fullSizeUrl);
        this.rights = validator.validateRights(rights);
        this.thumbnailUrl = validator.validateThumbnailUrl(thumbnailUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QaImage other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QaImage> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static QaImage create(final String fullSizeUrl, final org.dressdiscover.api.models.qa.QaImageRights rights, final String thumbnailUrl) {
        return new QaImage(fullSizeUrl, rights, thumbnailUrl, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QaImage)) {
            return false;
        }

        final QaImage other = (QaImage)otherObject;

        if (!(getFullSizeUrl().equals(other.getFullSizeUrl()))) {
            return false;
        }

        if (!(getRights().equals(other.getRights()))) {
            return false;
        }

        if (!(getThumbnailUrl().equals(other.getThumbnailUrl()))) {
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
        case FULL_SIZE_URL: return getFullSizeUrl();
        case RIGHTS: return getRights();
        case THUMBNAIL_URL: return getThumbnailUrl();
        default:
            throw new IllegalStateException();
        }
    }

    /**
     * Thumbnail and full size URLs can be relative
     */
    public final String getFullSizeUrl() {
        return fullSizeUrl;
    }

    public final org.dressdiscover.api.models.qa.QaImageRights getRights() {
        return rights;
    }

    public final String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getFullSizeUrl().hashCode();
        hashCode = 31 * hashCode + getRights().hashCode();
        hashCode = 31 * hashCode + getThumbnailUrl().hashCode();
        return hashCode;
    }

    public static QaImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaImage readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QaImage readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String fullSizeUrl = null;
        org.dressdiscover.api.models.qa.QaImageRights rights = null;
        String thumbnailUrl = null;

        try {
            iprot.readListBegin();
            fullSizeUrl = iprot.readString();
            rights = org.dressdiscover.api.models.qa.QaImageRights.readAsStruct(iprot);
            thumbnailUrl = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QaImage(DefaultReadValidator.getInstance().validateFullSizeUrl(fullSizeUrl), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateThumbnailUrl(thumbnailUrl), NopConstructionValidator.getInstance());
    }

    public static QaImage readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QaImage readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String fullSizeUrl = null;
        org.dressdiscover.api.models.qa.QaImageRights rights = null;
        String thumbnailUrl = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "full_size_url": {
                    fullSizeUrl = iprot.readString();
                    break;
                }
                case "rights": {
                    rights = org.dressdiscover.api.models.qa.QaImageRights.readAsStruct(iprot);
                    break;
                }
                case "thumbnail_url": {
                    thumbnailUrl = iprot.readString();
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
        return new QaImage(DefaultReadValidator.getInstance().validateFullSizeUrl(fullSizeUrl), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateThumbnailUrl(thumbnailUrl), NopConstructionValidator.getInstance());
    }

    public QaImage replaceFullSizeUrl(final String fullSizeUrl) {
        return new QaImage(DefaultConstructionValidator.getInstance().validateFullSizeUrl(fullSizeUrl), this.rights, this.thumbnailUrl, NopConstructionValidator.getInstance());
    }

    public QaImage replaceRights(final org.dressdiscover.api.models.qa.QaImageRights rights) {
        return new QaImage(this.fullSizeUrl, DefaultConstructionValidator.getInstance().validateRights(rights), this.thumbnailUrl, NopConstructionValidator.getInstance());
    }

    public QaImage replaceThumbnailUrl(final String thumbnailUrl) {
        return new QaImage(this.fullSizeUrl, this.rights, DefaultConstructionValidator.getInstance().validateThumbnailUrl(thumbnailUrl), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("full_size_url", getFullSizeUrl()).add("rights", getRights()).add("thumbnail_url", getThumbnailUrl()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getFullSizeUrl());

        getRights().writeAsStruct(oprot);

        oprot.writeString(getThumbnailUrl());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QaImage");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("full_size_url", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getFullSizeUrl());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("rights", org.thryft.protocol.Type.STRUCT, (short)0);
        getRights().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("thumbnail_url", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getThumbnailUrl());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    /**
     * Thumbnail and full size URLs can be relative
     */
    private final String fullSizeUrl;

    private final org.dressdiscover.api.models.qa.QaImageRights rights;

    private final String thumbnailUrl;
}
