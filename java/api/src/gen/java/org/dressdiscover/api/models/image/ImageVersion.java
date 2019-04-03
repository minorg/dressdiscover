package org.dressdiscover.api.models.image;

public final class ImageVersion implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, ImageVersion> {
        public Builder() {
            url = null;
            heightPx = com.google.common.base.Optional.<Integer> absent();
            widthPx = com.google.common.base.Optional.<Integer> absent();
        }

        public Builder(final ImageVersion other) {
            this.url = other.getUrl();
            this.heightPx = other.getHeightPx();
            this.widthPx = other.getWidthPx();
        }

        protected ImageVersion _build(final org.thryft.native_.Url url, final com.google.common.base.Optional<Integer> heightPx, final com.google.common.base.Optional<Integer> widthPx) {
            return new ImageVersion(url, heightPx, widthPx);
        }

        public ImageVersion build() {
            Validator.validate(url, heightPx, widthPx);

            return _build(url, heightPx, widthPx);
        }

        public final com.google.common.base.Optional<Integer> getHeightPx() {
            return heightPx;
        }

        public final @javax.annotation.Nullable org.thryft.native_.Url getUrl() {
            return url;
        }

        public final com.google.common.base.Optional<Integer> getWidthPx() {
            return widthPx;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                try {
                    this.setUrl(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.URL, e);
                }
                if (__list.getSize() > 1) {
                    try {
                        this.setHeightPx(org.thryft.Optionals.of(iprot.readI32()));
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setWidthPx(org.thryft.Optionals.of(iprot.readI32()));
                    } catch (final NumberFormatException e) {
                    }
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "url": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                try {
                                    this.setUrl(org.thryft.native_.Url.parse(iprot.readString()));
                                } catch (final java.lang.IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.URL, e);
                                }
                        }
                        break;
                    }
                    case "height_px": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setHeightPx(org.thryft.Optionals.of(iprot.readI32()));
                                } catch (final NumberFormatException e) {
                                }
                        }
                        break;
                    }
                    case "width_px": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setWidthPx(org.thryft.Optionals.of(iprot.readI32()));
                                } catch (final NumberFormatException e) {
                                }
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case URL: setUrl((org.thryft.native_.Url)value); return this;
            case HEIGHT_PX: setHeightPx((Integer)value); return this;
            case WIDTH_PX: setWidthPx((Integer)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setHeightPx(final com.google.common.base.Optional<Integer> heightPx) {
            Validator.validateHeightPx(heightPx);
            this.heightPx = heightPx;
            return this;
        }

        public Builder setHeightPx(final @javax.annotation.Nullable Integer heightPx) {
            return setHeightPx(org.thryft.Optionals.fromNullable(heightPx));
        }

        public Builder setHeightPx(final int heightPx) {
            return setHeightPx(org.thryft.Optionals.of(heightPx));
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
            Validator.validateUrl(url);
            this.url = url;
            return this;
        }

        public Builder setWidthPx(final com.google.common.base.Optional<Integer> widthPx) {
            Validator.validateWidthPx(widthPx);
            this.widthPx = widthPx;
            return this;
        }

        public Builder setWidthPx(final @javax.annotation.Nullable Integer widthPx) {
            return setWidthPx(org.thryft.Optionals.fromNullable(widthPx));
        }

        public Builder setWidthPx(final int widthPx) {
            return setWidthPx(org.thryft.Optionals.of(widthPx));
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
            case URL: return unsetUrl();
            case HEIGHT_PX: return unsetHeightPx();
            case WIDTH_PX: return unsetWidthPx();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetHeightPx() {
            this.heightPx = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        public Builder unsetUrl() {
            this.url = null;
            return this;
        }

        public Builder unsetWidthPx() {
            this.widthPx = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        private @javax.annotation.Nullable org.thryft.native_.Url url;
        private com.google.common.base.Optional<Integer> heightPx;
        private com.google.common.base.Optional<Integer> widthPx;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ImageVersion> {
        @Override
        public ImageVersion readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ImageVersion.readAsList(iprot);
        }

        @Override
        public ImageVersion readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ImageVersion.readAsStruct(iprot);
        }

        @Override
        public ImageVersion readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ImageVersion.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, true, (short)1, "url", "1:url", org.thryft.protocol.Type.STRING),
        HEIGHT_PX("heightPx", new com.google.common.reflect.TypeToken<Integer>() {}, false, (short)2, "height_px", "2:height_px", org.thryft.protocol.Type.I32),
        WIDTH_PX("widthPx", new com.google.common.reflect.TypeToken<Integer>() {}, false, (short)3, "width_px", "3:width_px", org.thryft.protocol.Type.I32);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final org.thryft.native_.Url url, final com.google.common.base.Optional<Integer> heightPx, final com.google.common.base.Optional<Integer> widthPx) {
            validateUrl(url);
            validateHeightPx(heightPx);
            validateWidthPx(widthPx);
        }

        public static void validateUrl(final org.thryft.native_.Url url) {
            if (url == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.image.ImageVersion: url is missing");
            }
        }

        public static void validateHeightPx(final com.google.common.base.Optional<Integer> heightPx) {
            if (heightPx == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.image.ImageVersion: heightPx is missing");
            }
        }

        public static void validateWidthPx(final com.google.common.base.Optional<Integer> widthPx) {
            if (widthPx == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.image.ImageVersion: widthPx is missing");
            }
        }
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
        this(url, com.google.common.base.Optional.<Integer> absent(), com.google.common.base.Optional.<Integer> absent());
    }

    /**
     * Total constructor
     */
    public ImageVersion(final org.thryft.native_.Url url, final com.google.common.base.Optional<Integer> heightPx, final com.google.common.base.Optional<Integer> widthPx) {
        Validator.validate(url, heightPx, widthPx);
        this.url = url;
        this.heightPx = heightPx;
        this.widthPx = widthPx;
    }

    /**
     * Total Nullable constructor
     */
    public ImageVersion(final org.thryft.native_.Url url, @javax.annotation.Nullable final Integer heightPx, @javax.annotation.Nullable final Integer widthPx) {
        this(url, org.thryft.Optionals.fromNullable(heightPx), org.thryft.Optionals.fromNullable(widthPx));
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
        }
        if (!(otherObject instanceof ImageVersion)) {
            return false;
        }

        final ImageVersion other = (ImageVersion)otherObject;

        if (!(getUrl().equals(other.getUrl()))) {
            return false;
        }

        if (!(((getHeightPx().isPresent() && other.getHeightPx().isPresent()) ? (getHeightPx().get().intValue() == other.getHeightPx().get().intValue()) : (!getHeightPx().isPresent() && !other.getHeightPx().isPresent())))) {
            return false;
        }

        if (!(((getWidthPx().isPresent() && other.getWidthPx().isPresent()) ? (getWidthPx().get().intValue() == other.getWidthPx().get().intValue()) : (!getWidthPx().isPresent() && !other.getWidthPx().isPresent())))) {
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
        case URL: return getUrl();
        case HEIGHT_PX: return getHeightPx();
        case WIDTH_PX: return getWidthPx();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<Integer> getHeightPx() {
        return heightPx;
    }

    public final org.thryft.native_.Url getUrl() {
        return url;
    }

    public final com.google.common.base.Optional<Integer> getWidthPx() {
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

    public static ImageVersion readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static ImageVersion readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static ImageVersion readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public ImageVersion replaceHeightPx(final com.google.common.base.Optional<Integer> heightPx) {
        Validator.validateHeightPx(heightPx);
        return new ImageVersion(this.url, heightPx, this.widthPx);
    }

    public ImageVersion replaceHeightPx(@javax.annotation.Nullable final Integer heightPx) {
        return replaceHeightPx(org.thryft.Optionals.fromNullable(heightPx));
    }

    public ImageVersion replaceHeightPx(final int heightPx) {
        return replaceHeightPx(org.thryft.Optionals.of(heightPx));
    }

    public ImageVersion replaceUrl(final org.thryft.native_.Url url) {
        Validator.validateUrl(url);
        return new ImageVersion(url, this.heightPx, this.widthPx);
    }

    public ImageVersion replaceWidthPx(final com.google.common.base.Optional<Integer> widthPx) {
        Validator.validateWidthPx(widthPx);
        return new ImageVersion(this.url, this.heightPx, widthPx);
    }

    public ImageVersion replaceWidthPx(@javax.annotation.Nullable final Integer widthPx) {
        return replaceWidthPx(org.thryft.Optionals.fromNullable(widthPx));
    }

    public ImageVersion replaceWidthPx(final int widthPx) {
        return replaceWidthPx(org.thryft.Optionals.of(widthPx));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("url", getUrl()).add("height_px", getHeightPx().orNull()).add("width_px", getWidthPx().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.image.ImageVersion");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getUrl().toString());
        if (getHeightPx().isPresent()) {
            oprot.writeI32(getHeightPx().get());
        } else {
            oprot.writeNull();
        }
        if (getWidthPx().isPresent()) {
            oprot.writeI32(getWidthPx().get());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeUrlField(oprot);

        writeHeightPxField(oprot);

        writeWidthPxField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHeightPxField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHeightPx().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HEIGHT_PX);
            oprot.writeI32(getHeightPx().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.URL);
        oprot.writeString(getUrl().toString());
        oprot.writeFieldEnd();
    }

    public void writeWidthPxField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getWidthPx().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.WIDTH_PX);
            oprot.writeI32(getWidthPx().get());
            oprot.writeFieldEnd();
        }
    }

    private final org.thryft.native_.Url url;

    private final com.google.common.base.Optional<Integer> heightPx;

    private final com.google.common.base.Optional<Integer> widthPx;
}
