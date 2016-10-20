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
            return new Image(fullSize, original, rights, squareThumbnail, thumbnail, DefaultConstructionValidator.getInstance());
        }

        public Image build() {
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
                            fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "original": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "rights": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "square_thumbnail": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "thumbnail": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
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
            this.fullSize = DefaultConstructionValidator.getInstance().validateFullSize(fullSize);
            return this;
        }

        public Builder setFullSize(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion fullSize) {
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
            this.original = DefaultConstructionValidator.getInstance().validateOriginal(original);
            return this;
        }

        public Builder setOriginal(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion original) {
            return setOriginal(com.google.common.base.Optional.fromNullable(original));
        }

        public Builder setRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
            this.rights = DefaultConstructionValidator.getInstance().validateRights(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
            this.squareThumbnail = DefaultConstructionValidator.getInstance().validateSquareThumbnail(squareThumbnail);
            return this;
        }

        public Builder setSquareThumbnail(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion squareThumbnail) {
            return setSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
        }

        public Builder setThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            this.thumbnail = DefaultConstructionValidator.getInstance().validateThumbnail(thumbnail);
            return this;
        }

        public Builder setThumbnail(@javax.annotation.Nullable final org.dressdiscover.api.models.image.ImageVersion thumbnail) {
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
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, 2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, 3, "original", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>() {}, false, 6, "rights", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, 4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.ImageVersion>() {}, false, 5, "thumbnail", org.thryft.protocol.Type.STRUCT);

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
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) throws ExceptionT;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) throws RuntimeException {
            if (fullSize == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: fullSize is null");
            }
            if (!fullSize.isPresent()) {
                return fullSize;
            }
            return fullSize;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) throws RuntimeException {
            if (original == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: original is null");
            }
            if (!original.isPresent()) {
                return original;
            }
            return original;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) throws RuntimeException {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) throws RuntimeException {
            if (squareThumbnail == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: squareThumbnail is null");
            }
            if (!squareThumbnail.isPresent()) {
                return squareThumbnail;
            }
            return squareThumbnail;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) throws RuntimeException {
            if (thumbnail == null) {
                throw new NullPointerException("org.dressdiscover.api.models.image.Image: thumbnail is null");
            }
            if (!thumbnail.isPresent()) {
                return thumbnail;
            }
            return thumbnail;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
            return fullSize;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
            return original;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
            return squareThumbnail;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            return thumbnail;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) throws org.thryft.protocol.InputProtocolException {
            if (fullSize == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FULL_SIZE, "org.dressdiscover.api.models.image.Image: fullSize is null");
            }
            if (!fullSize.isPresent()) {
                return fullSize;
            }
            return fullSize;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) throws org.thryft.protocol.InputProtocolException {
            if (original == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ORIGINAL, "org.dressdiscover.api.models.image.Image: original is null");
            }
            if (!original.isPresent()) {
                return original;
            }
            return original;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.image.Image: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) throws org.thryft.protocol.InputProtocolException {
            if (squareThumbnail == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SQUARE_THUMBNAIL, "org.dressdiscover.api.models.image.Image: squareThumbnail is null");
            }
            if (!squareThumbnail.isPresent()) {
                return squareThumbnail;
            }
            return squareThumbnail;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) throws org.thryft.protocol.InputProtocolException {
            if (thumbnail == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.THUMBNAIL, "org.dressdiscover.api.models.image.Image: thumbnail is null");
            }
            if (!thumbnail.isPresent()) {
                return thumbnail;
            }
            return thumbnail;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
            return fullSize;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
            return original;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
            return squareThumbnail;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> validateThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
            return thumbnail;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
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
        this(other.getFullSize(), other.getOriginal(), other.getRights(), other.getSquareThumbnail(), other.getThumbnail(), NopConstructionValidator.getInstance());
    }

    protected Image(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail, ConstructionValidator validator) {
        this.fullSize = validator.validateFullSize(fullSize);
        this.original = validator.validateOriginal(original);
        this.rights = validator.validateRights(rights);
        this.squareThumbnail = validator.validateSquareThumbnail(squareThumbnail);
        this.thumbnail = validator.validateThumbnail(thumbnail);
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

    public static Image create() {
        return new Image();
    }

    /**
     * Total Nullable factory method
     */
    public static Image create(final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion fullSize, final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion original, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights, final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion squareThumbnail, final @javax.annotation.Nullable org.dressdiscover.api.models.image.ImageVersion thumbnail) {
        return new Image(com.google.common.base.Optional.fromNullable(fullSize), com.google.common.base.Optional.fromNullable(original), com.google.common.base.Optional.fromNullable(rights), com.google.common.base.Optional.fromNullable(squareThumbnail), com.google.common.base.Optional.fromNullable(thumbnail), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Image create(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
        return new Image(fullSize, original, rights, squareThumbnail, thumbnail, DefaultConstructionValidator.getInstance());
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
        return new Image(DefaultReadValidator.getInstance().validateFullSize(fullSize), DefaultReadValidator.getInstance().validateOriginal(original), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateSquareThumbnail(squareThumbnail), DefaultReadValidator.getInstance().validateThumbnail(thumbnail), NopConstructionValidator.getInstance());
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
                        fullSize = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "original": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        original = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        rights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "square_thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        squareThumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        thumbnail = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.ImageVersion.readAsStruct(iprot));
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
        return new Image(DefaultReadValidator.getInstance().validateFullSize(fullSize), DefaultReadValidator.getInstance().validateOriginal(original), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateSquareThumbnail(squareThumbnail), DefaultReadValidator.getInstance().validateThumbnail(thumbnail), NopConstructionValidator.getInstance());
    }

    public Image replaceFullSize(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize) {
        return new Image(DefaultConstructionValidator.getInstance().validateFullSize(fullSize), this.original, this.rights, this.squareThumbnail, this.thumbnail, NopConstructionValidator.getInstance());
    }

    public Image replaceFullSize(final org.dressdiscover.api.models.image.ImageVersion fullSize) {
        return replaceFullSize(com.google.common.base.Optional.fromNullable(fullSize));
    }

    public Image replaceOriginal(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original) {
        return new Image(this.fullSize, DefaultConstructionValidator.getInstance().validateOriginal(original), this.rights, this.squareThumbnail, this.thumbnail, NopConstructionValidator.getInstance());
    }

    public Image replaceOriginal(final org.dressdiscover.api.models.image.ImageVersion original) {
        return replaceOriginal(com.google.common.base.Optional.fromNullable(original));
    }

    public Image replaceRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights) {
        return new Image(this.fullSize, this.original, DefaultConstructionValidator.getInstance().validateRights(rights), this.squareThumbnail, this.thumbnail, NopConstructionValidator.getInstance());
    }

    public Image replaceRights(final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public Image replaceSquareThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail) {
        return new Image(this.fullSize, this.original, this.rights, DefaultConstructionValidator.getInstance().validateSquareThumbnail(squareThumbnail), this.thumbnail, NopConstructionValidator.getInstance());
    }

    public Image replaceSquareThumbnail(final org.dressdiscover.api.models.image.ImageVersion squareThumbnail) {
        return replaceSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
    }

    public Image replaceThumbnail(final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail) {
        return new Image(this.fullSize, this.original, this.rights, this.squareThumbnail, DefaultConstructionValidator.getInstance().validateThumbnail(thumbnail), NopConstructionValidator.getInstance());
    }

    public Image replaceThumbnail(final org.dressdiscover.api.models.image.ImageVersion thumbnail) {
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
        if (getFullSize().isPresent()) {
            oprot.writeFieldBegin("full_size", org.thryft.protocol.Type.STRUCT, (short)2);
            getFullSize().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getOriginal().isPresent()) {
            oprot.writeFieldBegin("original", org.thryft.protocol.Type.STRUCT, (short)3);
            getOriginal().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getRights().isPresent()) {
            oprot.writeFieldBegin("rights", org.thryft.protocol.Type.STRUCT, (short)6);
            getRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getSquareThumbnail().isPresent()) {
            oprot.writeFieldBegin("square_thumbnail", org.thryft.protocol.Type.STRUCT, (short)4);
            getSquareThumbnail().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getThumbnail().isPresent()) {
            oprot.writeFieldBegin("thumbnail", org.thryft.protocol.Type.STRUCT, (short)5);
            getThumbnail().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> fullSize;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> original;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rights;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> squareThumbnail;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.ImageVersion> thumbnail;
}
