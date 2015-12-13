package net.lab1318.costume.api.models.image;

public class Image implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            alt = com.google.common.base.Optional.absent();
            fullSize = com.google.common.base.Optional.absent();
            original = com.google.common.base.Optional.absent();
            squareThumbnail = com.google.common.base.Optional.absent();
            thumbnail = com.google.common.base.Optional.absent();
            title = com.google.common.base.Optional.absent();
        }

        public Builder(final Image other) {
            this.alt = other.getAlt();
            this.fullSize = other.getFullSize();
            this.original = other.getOriginal();
            this.squareThumbnail = other.getSquareThumbnail();
            this.thumbnail = other.getThumbnail();
            this.title = other.getTitle();
        }

        protected Image _build(final com.google.common.base.Optional<String> alt, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail, final com.google.common.base.Optional<String> title) {
            return new Image(alt, fullSize, original, squareThumbnail, thumbnail, title);
        }

        public Image build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(alt, "net.lab1318.costume.api.models.image.Image: missing alt"), com.google.common.base.Preconditions.checkNotNull(fullSize, "net.lab1318.costume.api.models.image.Image: missing fullSize"), com.google.common.base.Preconditions.checkNotNull(original, "net.lab1318.costume.api.models.image.Image: missing original"), com.google.common.base.Preconditions.checkNotNull(squareThumbnail, "net.lab1318.costume.api.models.image.Image: missing squareThumbnail"), com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.image.Image: missing thumbnail"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.image.Image: missing title"));
        }

        public final com.google.common.base.Optional<String> getAlt() {
            return alt;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getFullSize() {
            return fullSize;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getOriginal() {
            return original;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getSquareThumbnail() {
            return squareThumbnail;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
            return thumbnail;
        }

        public final com.google.common.base.Optional<String> getTitle() {
            return title;
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
                alt = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 1) {
                fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 5) {
                title = com.google.common.base.Optional.of(iprot.readString());
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
                case "alt": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        alt = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
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
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        title = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setAlt(final com.google.common.base.Optional<String> alt) {
            this.alt = com.google.common.base.Preconditions.checkNotNull(alt);
            return this;
        }

        public Builder setAlt(@javax.annotation.Nullable final String alt) {
            this.alt = com.google.common.base.Optional.fromNullable(alt);
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

            if (other.getAlt().isPresent()) {
                setAlt(other.getAlt());
            }
            if (other.getFullSize().isPresent()) {
                setFullSize(other.getFullSize());
            }
            if (other.getOriginal().isPresent()) {
                setOriginal(other.getOriginal());
            }
            if (other.getSquareThumbnail().isPresent()) {
                setSquareThumbnail(other.getSquareThumbnail());
            }
            if (other.getThumbnail().isPresent()) {
                setThumbnail(other.getThumbnail());
            }
            if (other.getTitle().isPresent()) {
                setTitle(other.getTitle());
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

        public Builder setTitle(final com.google.common.base.Optional<String> title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder setTitle(@javax.annotation.Nullable final String title) {
            this.title = com.google.common.base.Optional.fromNullable(title);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "alt": setAlt((String)value); return this;
            case "full_size": setFullSize((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "original": setOriginal((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "square_thumbnail": setSquareThumbnail((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "thumbnail": setThumbnail((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "title": setTitle((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetAlt() {
            this.alt = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetFullSize() {
            this.fullSize = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetOriginal() {
            this.original = com.google.common.base.Optional.absent();
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

        public Builder unsetTitle() {
            this.title = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.base.Optional<String> alt;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;
        private com.google.common.base.Optional<String> title;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ALT("alt", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "alt", org.thryft.protocol.Type.STRING),
        FULL_SIZE("fullSize", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 2, "full_size", org.thryft.protocol.Type.STRUCT),
        ORIGINAL("original", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 3, "original", org.thryft.protocol.Type.STRUCT),
        SQUARE_THUMBNAIL("squareThumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 4, "square_thumbnail", org.thryft.protocol.Type.STRUCT),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 5, "thumbnail", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, false, 6, "title", org.thryft.protocol.Type.STRING);

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
            case "alt": return ALT;
            case "fullSize": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "squareThumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            case "title": return TITLE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "alt": return ALT;
            case "full_size": return FULL_SIZE;
            case "original": return ORIGINAL;
            case "square_thumbnail": return SQUARE_THUMBNAIL;
            case "thumbnail": return THUMBNAIL;
            case "title": return TITLE;
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
        alt = com.google.common.base.Optional.absent();
        fullSize = com.google.common.base.Optional.absent();
        original = com.google.common.base.Optional.absent();
        squareThumbnail = com.google.common.base.Optional.absent();
        thumbnail = com.google.common.base.Optional.absent();
        title = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public Image(final Image other) {
        this(other.getAlt(), other.getFullSize(), other.getOriginal(), other.getSquareThumbnail(), other.getThumbnail(), other.getTitle());
    }

    /**
     * Total Nullable constructor
     */
    public Image(final @javax.annotation.Nullable String alt, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion fullSize, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion original, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion squareThumbnail, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion thumbnail, final @javax.annotation.Nullable String title) {
        this.alt = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(alt), "net.lab1318.costume.api.models.image.Image: alt is empty");
        this.fullSize = com.google.common.base.Optional.fromNullable(fullSize);
        this.original = com.google.common.base.Optional.fromNullable(original);
        this.squareThumbnail = com.google.common.base.Optional.fromNullable(squareThumbnail);
        this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
        this.title = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(title), "net.lab1318.costume.api.models.image.Image: title is empty");
    }

    /**
     * Optional constructor
     */
    public Image(final com.google.common.base.Optional<String> alt, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail, final com.google.common.base.Optional<String> title) {
        this.alt = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(alt, "net.lab1318.costume.api.models.image.Image: missing alt"), "net.lab1318.costume.api.models.image.Image: alt is empty");
        this.fullSize = com.google.common.base.Preconditions.checkNotNull(fullSize, "net.lab1318.costume.api.models.image.Image: missing fullSize");
        this.original = com.google.common.base.Preconditions.checkNotNull(original, "net.lab1318.costume.api.models.image.Image: missing original");
        this.squareThumbnail = com.google.common.base.Preconditions.checkNotNull(squareThumbnail, "net.lab1318.costume.api.models.image.Image: missing squareThumbnail");
        this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.image.Image: missing thumbnail");
        this.title = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.image.Image: missing title"), "net.lab1318.costume.api.models.image.Image: title is empty");
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
            getAlt().equals(other.getAlt()) &&
            getFullSize().equals(other.getFullSize()) &&
            getOriginal().equals(other.getOriginal()) &&
            getSquareThumbnail().equals(other.getSquareThumbnail()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getTitle().equals(other.getTitle());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "alt": return getAlt();
        case "full_size": return getFullSize();
        case "original": return getOriginal();
        case "square_thumbnail": return getSquareThumbnail();
        case "thumbnail": return getThumbnail();
        case "title": return getTitle();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getAlt() {
        return alt;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getFullSize() {
        return fullSize;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getOriginal() {
        return original;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getSquareThumbnail() {
        return squareThumbnail;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
        return thumbnail;
    }

    public final com.google.common.base.Optional<String> getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAlt().isPresent()) {
            hashCode = 31 * hashCode + getAlt().get().hashCode();
        }
        if (getFullSize().isPresent()) {
            hashCode = 31 * hashCode + getFullSize().get().hashCode();
        }
        if (getOriginal().isPresent()) {
            hashCode = 31 * hashCode + getOriginal().get().hashCode();
        }
        if (getSquareThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getSquareThumbnail().get().hashCode();
        }
        if (getThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getThumbnail().get().hashCode();
        }
        if (getTitle().isPresent()) {
            hashCode = 31 * hashCode + getTitle().get().hashCode();
        }
        return hashCode;
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
        com.google.common.base.Optional<String> alt = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> title = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            alt = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 1) {
            fullSize = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 2) {
            original = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            squareThumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 4) {
            thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 5) {
            title = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Image(alt, fullSize, original, squareThumbnail, thumbnail, title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Image readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> alt = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> title = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "alt": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    alt = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
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
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 6) {
                    title = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Image(alt, fullSize, original, squareThumbnail, thumbnail, title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Image replaceAlt(final com.google.common.base.Optional<String> alt) {
        return new Image(alt, this.fullSize, this.original, this.squareThumbnail, this.thumbnail, this.title);
    }

    public Image replaceAlt(final String alt) {
        return replaceAlt(com.google.common.base.Optional.fromNullable(alt));
    }

    public Image replaceFullSize(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize) {
        return new Image(this.alt, fullSize, this.original, this.squareThumbnail, this.thumbnail, this.title);
    }

    public Image replaceFullSize(final net.lab1318.costume.api.models.image.ImageVersion fullSize) {
        return replaceFullSize(com.google.common.base.Optional.fromNullable(fullSize));
    }

    public Image replaceOriginal(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original) {
        return new Image(this.alt, this.fullSize, original, this.squareThumbnail, this.thumbnail, this.title);
    }

    public Image replaceOriginal(final net.lab1318.costume.api.models.image.ImageVersion original) {
        return replaceOriginal(com.google.common.base.Optional.fromNullable(original));
    }

    public Image replaceSquareThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail) {
        return new Image(this.alt, this.fullSize, this.original, squareThumbnail, this.thumbnail, this.title);
    }

    public Image replaceSquareThumbnail(final net.lab1318.costume.api.models.image.ImageVersion squareThumbnail) {
        return replaceSquareThumbnail(com.google.common.base.Optional.fromNullable(squareThumbnail));
    }

    public Image replaceThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
        return new Image(this.alt, this.fullSize, this.original, this.squareThumbnail, thumbnail, this.title);
    }

    public Image replaceThumbnail(final net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
        return replaceThumbnail(com.google.common.base.Optional.fromNullable(thumbnail));
    }

    public Image replaceTitle(final com.google.common.base.Optional<String> title) {
        return new Image(this.alt, this.fullSize, this.original, this.squareThumbnail, this.thumbnail, title);
    }

    public Image replaceTitle(final String title) {
        return replaceTitle(com.google.common.base.Optional.fromNullable(title));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("alt", getAlt().orNull()).add("full_size", getFullSize().orNull()).add("original", getOriginal().orNull()).add("square_thumbnail", getSquareThumbnail().orNull()).add("thumbnail", getThumbnail().orNull()).add("title", getTitle().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 6);

        if (getAlt().isPresent()) {
            oprot.writeString(getAlt().get());
        } else {
            oprot.writeNull();
        }

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

        if (getTitle().isPresent()) {
            oprot.writeString(getTitle().get());
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
        if (getAlt().isPresent()) {
            oprot.writeFieldBegin("alt", org.thryft.protocol.Type.STRING, (short)1);
            oprot.writeString(getAlt().get());
            oprot.writeFieldEnd();
        }

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

        if (getTitle().isPresent()) {
            oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)6);
            oprot.writeString(getTitle().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<String> alt;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> fullSize;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> original;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> squareThumbnail;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;

    private final com.google.common.base.Optional<String> title;
}
