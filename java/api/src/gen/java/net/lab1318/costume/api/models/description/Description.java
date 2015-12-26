package net.lab1318.costume.api.models.description;

/**
 * VRA Core 4.0 description element
 */
public class Description implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            source = com.google.common.base.Optional.absent();
            type = com.google.common.base.Optional.absent();
        }

        public Builder(final Description other) {
            this.text = other.getText();
            this.source = other.getSource();
            this.type = other.getType();
        }

        protected Description _build(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type) {
            return new Description(text, source, type);
        }

        public Description build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.description.Description: missing text"), com.google.common.base.Preconditions.checkNotNull(source, "net.lab1318.costume.api.models.description.Description: missing source"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.description.Description: missing type"));
        }

        public final com.google.common.base.Optional<String> getSource() {
            return source;
        }

        public final String getText() {
            return text;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> getType() {
            return type;
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
            if (__list.getSize() > 1) {
                source = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                try {
                    type = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.description.DescriptionType.class));
                } catch (final IllegalArgumentException e) {
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "source": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        source = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            type = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.description.DescriptionType.class));
                        } catch (final IllegalArgumentException e) {
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

        public Builder setIfPresent(final Description other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            if (other.getSource().isPresent()) {
                setSource(other.getSource());
            }
            if (other.getType().isPresent()) {
                setType(other.getType());
            }

            return this;
        }

        public Builder setSource(final com.google.common.base.Optional<String> source) {
            this.source = com.google.common.base.Preconditions.checkNotNull(source);
            return this;
        }

        public Builder setSource(@javax.annotation.Nullable final String source) {
            this.source = com.google.common.base.Optional.fromNullable(source);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder setType(@javax.annotation.Nullable final net.lab1318.costume.api.models.description.DescriptionType type) {
            this.type = com.google.common.base.Optional.fromNullable(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": setText((String)value); return this;
            case "source": setSource((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.description.DescriptionType)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetSource() {
            this.source = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        public Builder unsetType() {
            this.type = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "text": return unsetText();
            case "source": return unsetSource();
            case "type": return unsetType();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private com.google.common.base.Optional<String> source;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        SOURCE("source", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "source", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.description.DescriptionType>() {}, false, 3, "type", org.thryft.protocol.Type.STRING);

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
            case "source": return SOURCE;
            case "type": return TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "source": return SOURCE;
            case "type": return TYPE;
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
    public Description(final Description other) {
        this(other.getText(), other.getSource(), other.getType());
    }

    /**
     * Required constructor
     */
    public Description(final String text) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.description.Description: missing text"), "net.lab1318.costume.api.models.description.Description: text is empty");
        this.source = com.google.common.base.Optional.absent();
        this.type = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Description(final String text, final @javax.annotation.Nullable String source, final @javax.annotation.Nullable net.lab1318.costume.api.models.description.DescriptionType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.description.Description: missing text"), "net.lab1318.costume.api.models.description.Description: text is empty");
        this.source = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(source), "net.lab1318.costume.api.models.description.Description: source is empty");
        this.type = com.google.common.base.Optional.fromNullable(type);
    }

    /**
     * Optional constructor
     */
    public Description(final String text, final com.google.common.base.Optional<String> source, final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.description.Description: missing text"), "net.lab1318.costume.api.models.description.Description: text is empty");
        this.source = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(source, "net.lab1318.costume.api.models.description.Description: missing source"), "net.lab1318.costume.api.models.description.Description: source is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.description.Description: missing type");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Description other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Description> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Description)) {
            return false;
        }

        final Description other = (Description)otherObject;
        return
            getText().equals(other.getText()) &&
            getSource().equals(other.getSource()) &&
            getType().equals(other.getType());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "text": return getText();
        case "source": return getSource();
        case "type": return getType();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getSource() {
        return source;
    }

    public final String getText() {
        return text;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        if (getSource().isPresent()) {
            hashCode = 31 * hashCode + getSource().get().hashCode();
        }
        if (getType().isPresent()) {
            hashCode = 31 * hashCode + getType().get().ordinal();
        }
        return hashCode;
    }

    public static Description readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Description readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        if (__list.getSize() > 1) {
            source = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            try {
                type = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.description.DescriptionType.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new Description(text, source, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Description readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        com.google.common.base.Optional<String> source = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type = com.google.common.base.Optional.absent();

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
            case "source": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    source = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    try {
                        type = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.description.DescriptionType.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Description(text, source, type);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Description replaceSource(final com.google.common.base.Optional<String> source) {
        return new Description(this.text, source, this.type);
    }

    public Description replaceSource(final String source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public Description replaceText(final String text) {
        return new Description(text, this.source, this.type);
    }

    public Description replaceType(final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type) {
        return new Description(this.text, this.source, type);
    }

    public Description replaceType(final net.lab1318.costume.api.models.description.DescriptionType type) {
        return replaceType(com.google.common.base.Optional.fromNullable(type));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("source", getSource().orNull()).add("type", getType().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getText());

        if (getSource().isPresent()) {
            oprot.writeString(getSource().get());
        } else {
            oprot.writeNull();
        }

        if (getType().isPresent()) {
            oprot.writeEnum(getType().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.description.Description");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        if (getSource().isPresent()) {
            oprot.writeFieldBegin("source", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getSource().get());
            oprot.writeFieldEnd();
        }

        if (getType().isPresent()) {
            oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeEnum(getType().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final com.google.common.base.Optional<String> source;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionType> type;
}
