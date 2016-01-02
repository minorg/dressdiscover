package net.lab1318.costume.api.models.location;

/**
 * VRA Core 4.0 location.name subelement
 */
public class LocationName implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            extent = com.google.common.base.Optional.absent();
            vocabRef = com.google.common.base.Optional.absent();
        }

        public Builder(final LocationName other) {
            this.text = other.getText();
            this.type = other.getType();
            this.extent = other.getExtent();
            this.vocabRef = other.getVocabRef();
        }

        protected LocationName _build(final String text, final net.lab1318.costume.api.models.location.LocationNameType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
            return new LocationName(text, type, extent, vocabRef);
        }

        public LocationName build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.location.LocationName: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.LocationName: missing type"), com.google.common.base.Preconditions.checkNotNull(extent, "net.lab1318.costume.api.models.location.LocationName: missing extent"), com.google.common.base.Preconditions.checkNotNull(vocabRef, "net.lab1318.costume.api.models.location.LocationName: missing vocabRef"));
        }

        public final com.google.common.base.Optional<String> getExtent() {
            return extent;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.location.LocationNameType getType() {
            return type;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getVocabRef() {
            return vocabRef;
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
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationNameType.class);
            if (__list.getSize() > 2) {
                extent = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationNameType.class);
                    }
                    break;
                }
                case "extent": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        extent = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "vocab_ref": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setExtent(final com.google.common.base.Optional<String> extent) {
            this.extent = com.google.common.base.Preconditions.checkNotNull(extent);
            return this;
        }

        public Builder setExtent(@javax.annotation.Nullable final String extent) {
            this.extent = com.google.common.base.Optional.fromNullable(extent);
            return this;
        }

        public Builder setIfPresent(final LocationName other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getExtent().isPresent()) {
                setExtent(other.getExtent());
            }
            if (other.getVocabRef().isPresent()) {
                setVocabRef(other.getVocabRef());
            }

            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.location.LocationNameType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
            this.vocabRef = com.google.common.base.Preconditions.checkNotNull(vocabRef);
            return this;
        }

        public Builder setVocabRef(@javax.annotation.Nullable final net.lab1318.costume.api.models.VocabRef vocabRef) {
            this.vocabRef = com.google.common.base.Optional.fromNullable(vocabRef);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.location.LocationNameType)value); return this;
            case "extent": setExtent((String)value); return this;
            case "vocab_ref": setVocabRef((net.lab1318.costume.api.models.VocabRef)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetExtent() {
            this.extent = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType() {
            this.type = null;
            return this;
        }

        public Builder unsetVocabRef() {
            this.vocabRef = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": return unsetText();
            case "type": return unsetType();
            case "extent": return unsetExtent();
            case "vocab_ref": return unsetVocabRef();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.location.LocationNameType type;
        private com.google.common.base.Optional<String> extent;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.location.LocationNameType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        EXTENT("extent", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "extent", org.thryft.protocol.Type.STRING),
        VOCAB_REF("vocabRef", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.VocabRef>() {}, false, 4, "vocab_ref", org.thryft.protocol.Type.STRUCT);

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
            case "text": return TEXT;
            case "type": return TYPE;
            case "extent": return EXTENT;
            case "vocabRef": return VOCAB_REF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "extent": return EXTENT;
            case "vocab_ref": return VOCAB_REF;
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
    public LocationName(final LocationName other) {
        this(other.getText(), other.getType(), other.getExtent(), other.getVocabRef());
    }

    /**
     * Required constructor
     */
    public LocationName(final String text, final net.lab1318.costume.api.models.location.LocationNameType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.location.LocationName: missing text"), "net.lab1318.costume.api.models.location.LocationName: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.LocationName: missing type");
        this.extent = com.google.common.base.Optional.absent();
        this.vocabRef = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public LocationName(final String text, final net.lab1318.costume.api.models.location.LocationNameType type, final @javax.annotation.Nullable String extent, final @javax.annotation.Nullable net.lab1318.costume.api.models.VocabRef vocabRef) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.location.LocationName: missing text"), "net.lab1318.costume.api.models.location.LocationName: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.LocationName: missing type");
        this.extent = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(extent), "net.lab1318.costume.api.models.location.LocationName: extent is empty");
        this.vocabRef = com.google.common.base.Optional.fromNullable(vocabRef);
    }

    /**
     * Optional constructor
     */
    public LocationName(final String text, final net.lab1318.costume.api.models.location.LocationNameType type, final com.google.common.base.Optional<String> extent, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.location.LocationName: missing text"), "net.lab1318.costume.api.models.location.LocationName: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.location.LocationName: missing type");
        this.extent = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(extent, "net.lab1318.costume.api.models.location.LocationName: missing extent"), "net.lab1318.costume.api.models.location.LocationName: extent is empty");
        this.vocabRef = com.google.common.base.Preconditions.checkNotNull(vocabRef, "net.lab1318.costume.api.models.location.LocationName: missing vocabRef");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final LocationName other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<LocationName> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof LocationName)) {
            return false;
        }

        final LocationName other = (LocationName)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getExtent().equals(other.getExtent()) &&
            getVocabRef().equals(other.getVocabRef());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "text": return getText();
        case "type": return getType();
        case "extent": return getExtent();
        case "vocab_ref": return getVocabRef();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getExtent() {
        return extent;
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.location.LocationNameType getType() {
        return type;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getVocabRef() {
        return vocabRef;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getExtent().isPresent()) {
            hashCode = 31 * hashCode + getExtent().get().hashCode();
        }
        if (getVocabRef().isPresent()) {
            hashCode = 31 * hashCode + getVocabRef().get().hashCode();
        }
        return hashCode;
    }

    public static LocationName readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static LocationName readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.location.LocationNameType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationNameType.class);
        if (__list.getSize() > 2) {
            extent = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new LocationName(text, type, extent, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static LocationName readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.location.LocationNameType type = null;
        com.google.common.base.Optional<String> extent = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "text": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    text = iprot.readString();
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.location.LocationNameType.class);
                }
                break;
            }
            case "extent": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    extent = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "vocab_ref": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    vocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new LocationName(text, type, extent, vocabRef);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public LocationName replaceExtent(final com.google.common.base.Optional<String> extent) {
        return new LocationName(this.text, this.type, extent, this.vocabRef);
    }

    public LocationName replaceExtent(final String extent) {
        return replaceExtent(com.google.common.base.Optional.fromNullable(extent));
    }

    public LocationName replaceText(final String text) {
        return new LocationName(text, this.type, this.extent, this.vocabRef);
    }

    public LocationName replaceType(final net.lab1318.costume.api.models.location.LocationNameType type) {
        return new LocationName(this.text, type, this.extent, this.vocabRef);
    }

    public LocationName replaceVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef) {
        return new LocationName(this.text, this.type, this.extent, vocabRef);
    }

    public LocationName replaceVocabRef(final net.lab1318.costume.api.models.VocabRef vocabRef) {
        return replaceVocabRef(com.google.common.base.Optional.fromNullable(vocabRef));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("extent", getExtent().orNull()).add("vocab_ref", getVocabRef().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getExtent().isPresent()) {
            oprot.writeString(getExtent().get());
        } else {
            oprot.writeNull();
        }

        if (getVocabRef().isPresent()) {
            getVocabRef().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.location.LocationName");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getExtent().isPresent()) {
            oprot.writeFieldBegin("extent", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getExtent().get());
            oprot.writeFieldEnd();
        }

        if (getVocabRef().isPresent()) {
            oprot.writeFieldBegin("vocab_ref", org.thryft.protocol.Type.STRUCT, (short)4);
            getVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.location.LocationNameType type;

    private final com.google.common.base.Optional<String> extent;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> vocabRef;
}
