package net.lab1318.costume.api.models.institution;

public class Institution implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            title = null;
        }

        public Builder(final Institution other) {
            this.title = other.getTitle();
        }

        protected Institution _build(final String title) {
            return new Institution(title);
        }

        public Institution build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title"));
        }

        public final String getTitle() {
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
            iprot.readListBegin();
            title = iprot.readString();
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
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        title = iprot.readString();
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Institution other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTitle(other.getTitle());

            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "title": setTitle((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        private String title;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE(new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
    public Institution(final Institution other) {
        this(other.getTitle());
    }

    /**
     * Optional constructor
     */
    public Institution(final String title) {
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.institution.Institution: missing title"), "net.lab1318.costume.api.models.institution.Institution: title is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Institution other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Institution> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Institution)) {
            return false;
        }

        final Institution other = (Institution)otherObject;
        return
            getTitle().equals(other.getTitle());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "title": return getTitle();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        return hashCode;
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Institution readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;

        iprot.readListBegin();
        title = iprot.readString();
        iprot.readListEnd();
        try {
            return new Institution(title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    title = iprot.readString();
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Institution(title);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Institution replaceTitle(final String title) {
        return new Institution(title);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

        oprot.writeString(getTitle());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.institution.Institution");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final String title;
}
