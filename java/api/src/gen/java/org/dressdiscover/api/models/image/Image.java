package org.dressdiscover.api.models.image;

public final class Image implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            fullSize = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            original = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            rights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
            squareThumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            thumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        }

        public Builder(final Image other) {
            this.fullSize = other.getFullSize();
            this.original = other.getOriginal();
            this.rights = other.getRights();
            this.squareThumbnail = other.getSquareThumbnail();
            this.thumbnail = other.getThumbnail();
        }

        protected Image _build(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
        }

        public Image build() {
            UncheckedValidator.validate(fullSize, original, rights, squareThumbnail, thumbnail);

            return _build(fullSize, original, rights, squareThumbnail, thumbnail);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getFullSize() {
            return fullSize;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getOriginal() {
            return original;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getSquareThumbnail() {
            return squareThumbnail;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getThumbnail() {
            return thumbnail;
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
                if (__list.getSize() > 0) {
                    fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                if (__list.getSize() > 1) {
                    original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 3) {
                    squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                if (__list.getSize() > 4) {
                    thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
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
                    case "full_size": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "original": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "rights": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "square_thumbnail": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "thumbnail": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
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
            case FULL_SIZE: setFullSize((org.dressdiscover.api.models.image.ImageVersion)value); return this;
            case ORIGINAL: setOriginal((org.dressdiscover.api.models.image.ImageVersion)value); return this;
            case RIGHTS: setRights((org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet)value); return this;
            case SQUARE_THUMBNAIL: setSquareThumbnail((org.dressdiscover.api.models.image.ImageVersion)value); return this;
            case THUMBNAIL: setThumbnail((org.dressdiscover.api.models.image.ImageVersion)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
            UncheckedValidator.validateFullSize(fullSize);
            this.fullSize = fullSize;
            return this;
        }

        public Builder setFullSize(final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion fullSize) {
            return setFullSize(com.google.common.base.Optional.fromNullable(fullSize));
        }

        public Builder setIfPresent(final Image other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getFullSize().isPresent()) {
                setFullSize(other.getFullSize());
            }
            if (other.getOriginal().isPresent()) {
                setOriginal(other.getOriginal());
            }
            if (other.getRights().isPresent()) {
                setRights(other.getRights());
            }
            if (other.getSquareThumbnail().isPresent()) {
                setSquareThumbnail(other.getSquareThumbnail());
            }
            if (other.getThumbnail().isPresent()) {
                setThumbnail(other.getThumbnail());
            }

            return this;
        }

        public Builder setOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
            UncheckedValidator.validateOriginal(original);
            this.original = original;
            return this;
        }

        public Builder setOriginal(final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion original) {
            return setOriginal(com.google.common.base.Optional.fromNullable(original));
        }

        public Builder setRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
            UncheckedValidator.validateRights(rights);
            this.rights = rights;
            return this;
        }

        public Builder setRights(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
            UncheckedValidator.validateSquareThumbnail(squareThumbnail);
            this.squareThumbnail = squareThumbnail;
            return this;
        }

        public Builder setSquareThumbnail(final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion squareThumbnail) {
            return setSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
        }

        public Builder setThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            UncheckedValidator.validateThumbnail(thumbnail);
            this.thumbnail = thumbnail;
            return this;
        }

        public Builder setThumbnail(final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion thumbnail) {
            return setThumbnail(com.google.common.base.Optional.fromNullable(thumbnail));
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
            case FULL_SIZE: return unsetFullSize();
            case ORIGINAL: return unsetOriginal();
            case RIGHTS: return unsetRights();
            case SQUARE_THUMBNAIL: return unsetSquareThumbnail();
            case THUMBNAIL: return unsetThumbnail();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetFullSize() {
            this.fullSize = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            return this;
        }

        public Builder unsetOriginal() {
            this.original = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
            return this;
        }

        public Builder unsetSquareThumbnail() {
            this.squareThumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            return this;
        }

        public Builder unsetThumbnail() {
            this.thumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
            return this;
        }

        private com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize;
        private com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights;
        private com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail;
        private com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Image> {
        @Override
        public Image readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Image.readAs(iprot, type);
        }

        @Override
        public Image readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Image.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Image readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Image.readAsList(iprot);
        }

        @Override
        public Image readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Image.readAsStruct(iprot);
        }

        @Override
        public Image readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Image.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, (short)2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, (short)3, "original", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>() {}, false, (short)6, "rights", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, (short)4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, (short)5, "thumbnail", org.thryft.protocol.Type.STRUCT);

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
            case "fullSize": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "rights": return RIGHTS;
            case "squareThumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "full_size": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "rights": return RIGHTS;
            case "square_thumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
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
        public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) throws org.thryft.protocol.InputProtocolException {
            validateFullSize(fullSize);
            validateOriginal(original);
            validateRights(rights);
            validateSquareThumbnail(squareThumbnail);
            validateThumbnail(thumbnail);
        }

        public static void validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) throws org.thryft.protocol.InputProtocolException {
            if (fullSize == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FULL_SIZE, "org.dressdiscover.api.models.image.Image: fullSize is null");
            }
            if (!fullSize.isPresent()) {
                return;
            }
        }

        public static void validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) throws org.thryft.protocol.InputProtocolException {
            if (original == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ORIGINAL, "org.dressdiscover.api.models.image.Image: original is null");
            }
            if (!original.isPresent()) {
                return;
            }
        }

        public static void validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.image.Image: rights is null");
            }
            if (!rights.isPresent()) {
                return;
            }
        }

        public static void validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) throws org.thryft.protocol.InputProtocolException {
            if (squareThumbnail == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SQUARE_THUMBNAIL, "org.dressdiscover.api.models.image.Image: squareThumbnail is null");
            }
            if (!squareThumbnail.isPresent()) {
                return;
            }
        }

        public static void validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) throws org.thryft.protocol.InputProtocolException {
            if (thumbnail == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.THUMBNAIL, "org.dressdiscover.api.models.image.Image: thumbnail is null");
            }
            if (!thumbnail.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            validateFullSize(fullSize);
            validateOriginal(original);
            validateRights(rights);
            validateSquareThumbnail(squareThumbnail);
            validateThumbnail(thumbnail);
        }

        public static void validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
            if (fullSize == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: fullSize is null");
            }
            if (!fullSize.isPresent()) {
                return;
            }
        }

        public static void validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
            if (original == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: original is null");
            }
            if (!original.isPresent()) {
                return;
            }
        }

        public static void validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: rights is null");
            }
            if (!rights.isPresent()) {
                return;
            }
        }

        public static void validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
            if (squareThumbnail == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: squareThumbnail is null");
            }
            if (!squareThumbnail.isPresent()) {
                return;
            }
        }

        public static void validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            if (thumbnail == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: thumbnail is null");
            }
            if (!thumbnail.isPresent()) {
                return;
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public Image() {
        fullSize = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        original = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        rights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
        squareThumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        thumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
    }

    /**
     * Copy constructor
     */
    public Image(final Image other) {
        this(other.getFullSize(), other.getOriginal(), other.getRights(), other.getSquareThumbnail(), other.getThumbnail());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Image(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
        this.fullSize = fullSize;
        this.original = original;
        this.rights = rights;
        this.squareThumbnail = squareThumbnail;
        this.thumbnail = thumbnail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Image other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Image> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static Image create() {
        return new Image();
    }

    /**
     * Total Nullable factory method
     */
    public static Image create(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion fullSize, @javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion original, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights, @javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion squareThumbnail, @javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion thumbnail) {
        final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSizeOptional = com.google.common.base.Optional.fromNullable(fullSize);
        final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> originalOptional = com.google.common.base.Optional.fromNullable(original);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightsOptional = com.google.common.base.Optional.fromNullable(rights);
        final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnailOptional = com.google.common.base.Optional.fromNullable(squareThumbnail);
        final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnailOptional = com.google.common.base.Optional.fromNullable(thumbnail);
        UncheckedValidator.validate(fullSizeOptional, originalOptional, rightsOptional, squareThumbnailOptional, thumbnailOptional);
        return new Image(fullSizeOptional, originalOptional, rightsOptional, squareThumbnailOptional, thumbnailOptional);
    }

    /**
     * Optional factory method
     */
    public static Image create(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
        UncheckedValidator.validate(fullSize, original, rights, squareThumbnail, thumbnail);
        return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Image)) {
            return false;
        }

        final Image other = (Image)otherObject;

        if (!(((getFullSize().isPresent() && other.getFullSize().isPresent()) ? (getFullSize().get().equals(other.getFullSize().get())) : (!getFullSize().isPresent() && !other.getFullSize().isPresent())))) {
            return false;
        }

        if (!(((getOriginal().isPresent() && other.getOriginal().isPresent()) ? (getOriginal().get().equals(other.getOriginal().get())) : (!getOriginal().isPresent() && !other.getOriginal().isPresent())))) {
            return false;
        }

        if (!(((getRights().isPresent() && other.getRights().isPresent()) ? (getRights().get().equals(other.getRights().get())) : (!getRights().isPresent() && !other.getRights().isPresent())))) {
            return false;
        }

        if (!(((getSquareThumbnail().isPresent() && other.getSquareThumbnail().isPresent()) ? (getSquareThumbnail().get().equals(other.getSquareThumbnail().get())) : (!getSquareThumbnail().isPresent() && !other.getSquareThumbnail().isPresent())))) {
            return false;
        }

        if (!(((getThumbnail().isPresent() && other.getThumbnail().isPresent()) ? (getThumbnail().get().equals(other.getThumbnail().get())) : (!getThumbnail().isPresent() && !other.getThumbnail().isPresent())))) {
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
        case FULL_SIZE: return getFullSize();
        case ORIGINAL: return getOriginal();
        case RIGHTS: return getRights();
        case SQUARE_THUMBNAIL: return getSquareThumbnail();
        case THUMBNAIL: return getThumbnail();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getFullSize() {
        return fullSize;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getOriginal() {
        return original;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getSquareThumbnail() {
        return squareThumbnail;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> getThumbnail() {
        return thumbnail;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getFullSize().isPresent()) {
            hashCode = 31 * hashCode + getFullSize().get().hashCode();
        }
        if (getOriginal().isPresent()) {
            hashCode = 31 * hashCode + getOriginal().get().hashCode();
        }
        if (getRights().isPresent()) {
            hashCode = 31 * hashCode + getRights().get().hashCode();
        }
        if (getSquareThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getSquareThumbnail().get().hashCode();
        }
        if (getThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getThumbnail().get().hashCode();
        }
        return hashCode;
    }

    public static Image readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Image readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Image readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 1) {
                original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(fullSize, original, rights, squareThumbnail, thumbnail);

        return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
    }

    public static Image readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Image readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.<org.dressdiscover.api.models.image.ImageVersion> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "full_size": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "original": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "square_thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(fullSize, original, rights, squareThumbnail, thumbnail);

        return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
    }

    public Image replaceFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
        UncheckedValidator.validateFullSize(fullSize);
        return new Image(fullSize, this.original, this.rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceFullSize(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion fullSize) {
        return replaceFullSize(com.google.common.base.Optional.fromNullable(fullSize));
    }

    public Image replaceOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
        UncheckedValidator.validateOriginal(original);
        return new Image(this.fullSize, original, this.rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceOriginal(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion original) {
        return replaceOriginal(com.google.common.base.Optional.fromNullable(original));
    }

    public Image replaceRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
        UncheckedValidator.validateRights(rights);
        return new Image(this.fullSize, this.original, rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceRights(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public Image replaceSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
        UncheckedValidator.validateSquareThumbnail(squareThumbnail);
        return new Image(this.fullSize, this.original, this.rights, squareThumbnail, this.thumbnail);
    }

    public Image replaceSquareThumbnail(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion squareThumbnail) {
        return replaceSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
    }

    public Image replaceThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
        UncheckedValidator.validateThumbnail(thumbnail);
        return new Image(this.fullSize, this.original, this.rights, this.squareThumbnail, thumbnail);
    }

    public Image replaceThumbnail(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion thumbnail) {
        return replaceThumbnail(com.google.common.base.Optional.fromNullable(thumbnail));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("full_size", getFullSize().orNull()).add("original", getOriginal().orNull()).add("rights", getRights().orNull()).add("square_thumbnail", getSquareThumbnail().orNull()).add("thumbnail", getThumbnail().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        if (getFullSize().isPresent()) {
            getFullSize().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getOriginal().isPresent()) {
            getOriginal().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getRights().isPresent()) {
            getRights().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getSquareThumbnail().isPresent()) {
            getSquareThumbnail().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getThumbnail().isPresent()) {
            getThumbnail().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.image.Image");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeFullSizeField(oprot);

        writeOriginalField(oprot);

        writeRightsField(oprot);

        writeSquareThumbnailField(oprot);

        writeThumbnailField(oprot);

        oprot.writeFieldStop();
    }

    public void writeFullSizeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFullSize().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FULL_SIZE);
            getFullSize().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeOriginalField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getOriginal().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ORIGINAL);
            getOriginal().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRights().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RIGHTS);
            getRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeSquareThumbnailField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSquareThumbnail().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SQUARE_THUMBNAIL);
            getSquareThumbnail().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeThumbnailField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getThumbnail().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.THUMBNAIL);
            getThumbnail().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public final static Image EMPTY = new Image();

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail;
}
