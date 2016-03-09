package net.lab1318.costume.api.models.image;

public class Image implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            fullSize = com.google.common.base.Optional.absent();
            original = com.google.common.base.Optional.absent();
            rights = com.google.common.base.Optional.absent();
            squareThumbnail = com.google.common.base.Optional.absent();
            thumbnail = com.google.common.base.Optional.absent();
        }

        public Builder(final Image other) {
            this.fullSize = other.getFullSize();
            this.original = other.getOriginal();
            this.rights = other.getRights();
            this.squareThumbnail = other.getSquareThumbnail();
            this.thumbnail = other.getThumbnail();
        }

        protected Image _build(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
            return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
        }

        public Image build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(fullSize, "net.lab1318.costume.api.models.image.Image: missing fullSize"), com.google.common.base.Preconditions.checkNotNull(original, "net.lab1318.costume.api.models.image.Image: missing original"), com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.image.Image: missing rights"), com.google.common.base.Preconditions.checkNotNull(squareThumbnail, "net.lab1318.costume.api.models.image.Image: missing squareThumbnail"), com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.image.Image: missing thumbnail"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getFullSize() {
            return fullSize;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getOriginal() {
            return original;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getSquareThumbnail() {
            return squareThumbnail;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
            return thumbnail;
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
            if (__list.getSize() > 0) {
                fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 1) {
                original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "full_size": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "original": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "square_thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                    }
                    break;
                }
                case "thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
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
            return this;
        }

        public Builder setFullSize(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize) {
            this.fullSize = com.google.common.base.Preconditions.checkNotNull(fullSize);
            return this;
        }

        public Builder setFullSize(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.ImageVersion fullSize) {
            this.fullSize = com.google.common.base.Optional.fromNullable(fullSize);
            return this;
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

        public Builder setOriginal(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original) {
            this.original = com.google.common.base.Preconditions.checkNotNull(original);
            return this;
        }

        public Builder setOriginal(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.ImageVersion original) {
            this.original = com.google.common.base.Optional.fromNullable(original);
            return this;
        }

        public Builder setRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights) {
            this.rights = com.google.common.base.Preconditions.checkNotNull(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final net.lab1318.costume.api.models.rights.RightsSet rights) {
            this.rights = com.google.common.base.Optional.fromNullable(rights);
            return this;
        }

        public Builder setSquareThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail) {
            this.squareThumbnail = com.google.common.base.Preconditions.checkNotNull(squareThumbnail);
            return this;
        }

        public Builder setSquareThumbnail(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.ImageVersion squareThumbnail) {
            this.squareThumbnail = com.google.common.base.Optional.fromNullable(squareThumbnail);
            return this;
        }

        public Builder setThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
            this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail);
            return this;
        }

        public Builder setThumbnail(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
            this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "full_size": setFullSize((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "original": setOriginal((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "rights": setRights((net.lab1318.costume.api.models.rights.RightsSet)value); return this;
            case "square_thumbnail": setSquareThumbnail((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "thumbnail": setThumbnail((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetFullSize() {
            this.fullSize = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetOriginal() {
            this.original = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSquareThumbnail() {
            this.squareThumbnail = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetThumbnail() {
            this.thumbnail = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "full_size": return unsetFullSize();
            case "original": return unsetOriginal();
            case "rights": return unsetRights();
            case "square_thumbnail": return unsetSquareThumbnail();
            case "thumbnail": return unsetThumbnail();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 3, "original", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsSet>() {}, false, 6, "rights", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 5, "thumbnail", org.thryft.protocol.Type.STRUCT);

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

    /**
     * Default constructor
     */
    public Image() {
        fullSize = com.google.common.base.Optional.absent();
        original = com.google.common.base.Optional.absent();
        rights = com.google.common.base.Optional.absent();
        squareThumbnail = com.google.common.base.Optional.absent();
        thumbnail = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public Image(final Image other) {
        this(other.getFullSize(), other.getOriginal(), other.getRights(), other.getSquareThumbnail(), other.getThumbnail());
    }

    /**
     * Total Nullable constructor
     */
    public Image(final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion fullSize, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion original, final @javax.annotation.Nullable net.lab1318.costume.api.models.rights.RightsSet rights, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion squareThumbnail, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
        this.fullSize = com.google.common.base.Optional.fromNullable(fullSize);
        this.original = com.google.common.base.Optional.fromNullable(original);
        this.rights = com.google.common.base.Optional.fromNullable(rights);
        this.squareThumbnail = com.google.common.base.Optional.fromNullable(squareThumbnail);
        this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
    }

    /**
     * Optional constructor
     */
    public Image(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
        this.fullSize = com.google.common.base.Preconditions.checkNotNull(fullSize, "net.lab1318.costume.api.models.image.Image: missing fullSize");
        this.original = com.google.common.base.Preconditions.checkNotNull(original, "net.lab1318.costume.api.models.image.Image: missing original");
        this.rights = com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.image.Image: missing rights");
        this.squareThumbnail = com.google.common.base.Preconditions.checkNotNull(squareThumbnail, "net.lab1318.costume.api.models.image.Image: missing squareThumbnail");
        this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.image.Image: missing thumbnail");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Image)) {
            return false;
        }

        final Image other = (Image)otherObject;
        return
            ((getFullSize().isPresent() && other.getFullSize().isPresent()) ? (getFullSize().get().equals(other.getFullSize().get())) : (!getFullSize().isPresent() && !other.getFullSize().isPresent())) &&
            ((getOriginal().isPresent() && other.getOriginal().isPresent()) ? (getOriginal().get().equals(other.getOriginal().get())) : (!getOriginal().isPresent() && !other.getOriginal().isPresent())) &&
            ((getRights().isPresent() && other.getRights().isPresent()) ? (getRights().get().equals(other.getRights().get())) : (!getRights().isPresent() && !other.getRights().isPresent())) &&
            ((getSquareThumbnail().isPresent() && other.getSquareThumbnail().isPresent()) ? (getSquareThumbnail().get().equals(other.getSquareThumbnail().get())) : (!getSquareThumbnail().isPresent() && !other.getSquareThumbnail().isPresent())) &&
            ((getThumbnail().isPresent() && other.getThumbnail().isPresent()) ? (getThumbnail().get().equals(other.getThumbnail().get())) : (!getThumbnail().isPresent() && !other.getThumbnail().isPresent()));
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getFullSize() {
        return fullSize;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getOriginal() {
        return original;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getSquareThumbnail() {
        return squareThumbnail;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
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

    @Override
    public boolean isEmpty() {
        return !getFullSize().isPresent() && !getOriginal().isPresent() && !getRights().isPresent() && !getSquareThumbnail().isPresent() && !getThumbnail().isPresent();
    }

    public static Image readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Image readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 1) {
            original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 2) {
            rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 4) {
            thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Image readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Image readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "full_size": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                break;
            }
            case "original": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                break;
            }
            case "rights": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                }
                break;
            }
            case "square_thumbnail": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
                }
                break;
            }
            case "thumbnail": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
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
        try {
            return new Image(fullSize, original, rights, squareThumbnail, thumbnail);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Image replaceFullSize(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize) {
        return new Image(fullSize, this.original, this.rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceFullSize(final net.lab1318.costume.api.models.image.ImageVersion fullSize) {
        return replaceFullSize(com.google.common.base.Optional.fromNullable(fullSize));
    }

    public Image replaceOriginal(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original) {
        return new Image(this.fullSize, original, this.rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceOriginal(final net.lab1318.costume.api.models.image.ImageVersion original) {
        return replaceOriginal(com.google.common.base.Optional.fromNullable(original));
    }

    public Image replaceRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights) {
        return new Image(this.fullSize, this.original, rights, this.squareThumbnail, this.thumbnail);
    }

    public Image replaceRights(final net.lab1318.costume.api.models.rights.RightsSet rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public Image replaceSquareThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail) {
        return new Image(this.fullSize, this.original, this.rights, squareThumbnail, this.thumbnail);
    }

    public Image replaceSquareThumbnail(final net.lab1318.costume.api.models.image.ImageVersion squareThumbnail) {
        return replaceSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
    }

    public Image replaceThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
        return new Image(this.fullSize, this.original, this.rights, this.squareThumbnail, thumbnail);
    }

    public Image replaceThumbnail(final net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.image.Image");
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

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;
}
