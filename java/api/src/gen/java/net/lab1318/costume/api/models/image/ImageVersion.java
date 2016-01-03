package net.lab1318.costume.api.models.image;

public class ImageVersion implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            url = null;
            heightPx = com.google.common.base.Optional.absent();
            widthPx = com.google.common.base.Optional.absent();
        }

        public Builder(final ImageVersion other) {
            this.url = other.getUrl();
            this.heightPx = other.getHeightPx();
            this.widthPx = other.getWidthPx();
        }

        protected ImageVersion _build(final org.thryft.native_.Url url, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx) {
            return new ImageVersion(url, heightPx, widthPx);
        }

        public ImageVersion build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.image.ImageVersion: missing url"), com.google.common.base.Preconditions.checkNotNull(heightPx, "net.lab1318.costume.api.models.image.ImageVersion: missing heightPx"), com.google.common.base.Preconditions.checkNotNull(widthPx, "net.lab1318.costume.api.models.image.ImageVersion: missing widthPx"));
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getHeightPx() {
            return heightPx;
        }

        public final org.thryft.native_.Url getUrl() {
            return url;
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getWidthPx() {
            return widthPx;
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
            url = org.thryft.native_.Url.parse(iprot.readString());
            if (__list.getSize() > 1) {
                try {
                    heightPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 2) {
                try {
                    widthPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
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
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        url = org.thryft.native_.Url.parse(iprot.readString());
                    }
                    break;
                }
                case "height_px": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            heightPx = com.google.common.base.Optional.of(iprot.readU32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                case "width_px": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            widthPx = com.google.common.base.Optional.of(iprot.readU32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setHeightPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx) {
            this.heightPx = com.google.common.base.Preconditions.checkNotNull(heightPx);
            return this;
        }

        public Builder setHeightPx(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger heightPx) {
            this.heightPx = com.google.common.base.Optional.fromNullable(heightPx);
            return this;
        }

        public Builder setIfPresent(final ImageVersion other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setUrl(other.getUrl());
            if (other.getHeightPx().isPresent()) {
                setHeightPx(other.getHeightPx());
            }
            if (other.getWidthPx().isPresent()) {
                setWidthPx(other.getWidthPx());
            }

            return this;
        }

        public Builder setUrl(final org.thryft.native_.Url url) {
            this.url = com.google.common.base.Preconditions.checkNotNull(url);
            return this;
        }

        public Builder setWidthPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx) {
            this.widthPx = com.google.common.base.Preconditions.checkNotNull(widthPx);
            return this;
        }

        public Builder setWidthPx(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger widthPx) {
            this.widthPx = com.google.common.base.Optional.fromNullable(widthPx);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            case "height_px": setHeightPx((com.google.common.primitives.UnsignedInteger)value); return this;
            case "width_px": setWidthPx((com.google.common.primitives.UnsignedInteger)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetHeightPx() {
            this.heightPx = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetUrl() {
            this.url = null;
            return this;
        }

        public Builder unsetWidthPx() {
            this.widthPx = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "url": return unsetUrl();
            case "height_px": return unsetHeightPx();
            case "width_px": return unsetWidthPx();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private org.thryft.native_.Url url;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, 1, "url", org.thryft.protocol.Type.STRING),
        HEIGHT_PX("heightPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 2, "height_px", org.thryft.protocol.Type.I32),
        WIDTH_PX("widthPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 3, "width_px", org.thryft.protocol.Type.I32);

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
            case "url": return URL;
            case "heightPx": return HEIGHT_PX;
            case "widthPx": return WIDTH_PX;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "url": return URL;
            case "height_px": return HEIGHT_PX;
            case "width_px": return WIDTH_PX;
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
     * Copy constructor
     */
    public ImageVersion(final ImageVersion other) {
        this(other.getUrl(), other.getHeightPx(), other.getWidthPx());
    }

    /**
     * Required constructor
     */
    public ImageVersion(final org.thryft.native_.Url url) {
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.image.ImageVersion: missing url");
        this.heightPx = com.google.common.base.Optional.absent();
        this.widthPx = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public ImageVersion(final org.thryft.native_.Url url, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger heightPx, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger widthPx) {
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.image.ImageVersion: missing url");
        this.heightPx = com.google.common.base.Optional.fromNullable(heightPx);
        this.widthPx = com.google.common.base.Optional.fromNullable(widthPx);
    }

    /**
     * Optional constructor
     */
    public ImageVersion(final org.thryft.native_.Url url, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx) {
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.image.ImageVersion: missing url");
        this.heightPx = com.google.common.base.Preconditions.checkNotNull(heightPx, "net.lab1318.costume.api.models.image.ImageVersion: missing heightPx");
        this.widthPx = com.google.common.base.Preconditions.checkNotNull(widthPx, "net.lab1318.costume.api.models.image.ImageVersion: missing widthPx");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ImageVersion other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ImageVersion> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ImageVersion)) {
            return false;
        }

        final ImageVersion other = (ImageVersion)otherObject;
        return
            getUrl().equals(other.getUrl()) &&
            getHeightPx().equals(other.getHeightPx()) &&
            getWidthPx().equals(other.getWidthPx());
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
        case URL: return getUrl();
        case HEIGHT_PX: return getHeightPx();
        case WIDTH_PX: return getWidthPx();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getHeightPx() {
        return heightPx;
    }

    public final org.thryft.native_.Url getUrl() {
        return url;
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getWidthPx() {
        return widthPx;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getUrl().hashCode();
        if (getHeightPx().isPresent()) {
            hashCode = 31 * hashCode + getHeightPx().get().hashCode();
        }
        if (getWidthPx().isPresent()) {
            hashCode = 31 * hashCode + getWidthPx().get().hashCode();
        }
        return hashCode;
    }

    public static ImageVersion readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ImageVersion readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url url = null;
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        url = org.thryft.native_.Url.parse(iprot.readString());
        if (__list.getSize() > 1) {
            try {
                heightPx = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        if (__list.getSize() > 2) {
            try {
                widthPx = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new ImageVersion(url, heightPx, widthPx);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ImageVersion readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.Url url = null;
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    url = org.thryft.native_.Url.parse(iprot.readString());
                }
                break;
            }
            case "height_px": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        heightPx = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                }
                break;
            }
            case "width_px": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        widthPx = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ImageVersion(url, heightPx, widthPx);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ImageVersion replaceHeightPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx) {
        return new ImageVersion(this.url, heightPx, this.widthPx);
    }

    public ImageVersion replaceHeightPx(final com.google.common.primitives.UnsignedInteger heightPx) {
        return replaceHeightPx(com.google.common.base.Optional.fromNullable(heightPx));
    }

    public ImageVersion replaceUrl(final org.thryft.native_.Url url) {
        return new ImageVersion(url, this.heightPx, this.widthPx);
    }

    public ImageVersion replaceWidthPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx) {
        return new ImageVersion(this.url, this.heightPx, widthPx);
    }

    public ImageVersion replaceWidthPx(final com.google.common.primitives.UnsignedInteger widthPx) {
        return replaceWidthPx(com.google.common.base.Optional.fromNullable(widthPx));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("url", getUrl()).add("height_px", getHeightPx().orNull()).add("width_px", getWidthPx().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getUrl().toString());

        if (getHeightPx().isPresent()) {
            oprot.writeU32(getHeightPx().get());
        } else {
            oprot.writeNull();
        }

        if (getWidthPx().isPresent()) {
            oprot.writeU32(getWidthPx().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.image.ImageVersion");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getUrl().toString());
        oprot.writeFieldEnd();

        if (getHeightPx().isPresent()) {
            oprot.writeFieldBegin("height_px", org.thryft.protocol.Type.I32, (short)2);
            oprot.writeU32(getHeightPx().get());
            oprot.writeFieldEnd();
        }

        if (getWidthPx().isPresent()) {
            oprot.writeFieldBegin("width_px", org.thryft.protocol.Type.I32, (short)3);
            oprot.writeU32(getWidthPx().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.thryft.native_.Url url;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> heightPx;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> widthPx;
}
