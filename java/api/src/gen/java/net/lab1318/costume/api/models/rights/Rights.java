package net.lab1318.costume.api.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public class Rights implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            rightsHolder = null;
            text = null;
            type = null;
            notes = com.google.common.base.Optional.absent();
        }

        public Builder(final Rights other) {
            this.rightsHolder = other.getRightsHolder();
            this.text = other.getText();
            this.type = other.getType();
            this.notes = other.getNotes();
        }

        protected Rights _build(final String rightsHolder, final String text, final net.lab1318.costume.api.models.rights.RightsType type, final com.google.common.base.Optional<String> notes) {
            return new Rights(rightsHolder, text, type, notes);
        }

        public Rights build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type"), com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.rights.Rights: missing notes"));
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public final String getRightsHolder() {
            return rightsHolder;
        }

        public final String getText() {
            return text;
        }

        public final net.lab1318.costume.api.models.rights.RightsType getType() {
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
            rightsHolder = iprot.readString();
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
            if (__list.getSize() > 3) {
                notes = com.google.common.base.Optional.of(iprot.readString());
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
                case "rights_holder": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        rightsHolder = iprot.readString();
                    }
                    break;
                }
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
                    }
                    break;
                }
                case "notes": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        notes = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final Rights other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setRightsHolder(other.getRightsHolder());
            setText(other.getText());
            setType(other.getType());
            if (other.getNotes().isPresent()) {
                setNotes(other.getNotes());
            }

            return this;
        }

        public Builder setNotes(final com.google.common.base.Optional<String> notes) {
            this.notes = com.google.common.base.Preconditions.checkNotNull(notes);
            return this;
        }

        public Builder setNotes(@javax.annotation.Nullable final String notes) {
            this.notes = com.google.common.base.Optional.fromNullable(notes);
            return this;
        }

        public Builder setRightsHolder(final String rightsHolder) {
            this.rightsHolder = com.google.common.base.Preconditions.checkNotNull(rightsHolder);
            return this;
        }

        public Builder setText(final String text) {
            this.text = com.google.common.base.Preconditions.checkNotNull(text);
            return this;
        }

        public Builder setType(final net.lab1318.costume.api.models.rights.RightsType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "rights_holder": setRightsHolder((String)value); return this;
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.rights.RightsType)value); return this;
            case "notes": setNotes((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRightsHolder() {
            this.rightsHolder = null;
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

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "rights_holder": return unsetRightsHolder();
            case "text": return unsetText();
            case "type": return unsetType();
            case "notes": return unsetNotes();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String rightsHolder;
        private String text;
        private net.lab1318.costume.api.models.rights.RightsType type;
        private com.google.common.base.Optional<String> notes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "rights_holder", org.thryft.protocol.Type.STRING),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "notes", org.thryft.protocol.Type.STRING);

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
            case "rightsHolder": return RIGHTS_HOLDER;
            case "text": return TEXT;
            case "type": return TYPE;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "rights_holder": return RIGHTS_HOLDER;
            case "text": return TEXT;
            case "type": return TYPE;
            case "notes": return NOTES;
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
    public Rights(final Rights other) {
        this(other.getRightsHolder(), other.getText(), other.getType(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public Rights(final String rightsHolder, final String text, final net.lab1318.costume.api.models.rights.RightsType type) {
        this.rightsHolder = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), "net.lab1318.costume.api.models.rights.Rights: rightsHolder is empty");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.notes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Rights(final String rightsHolder, final String text, final net.lab1318.costume.api.models.rights.RightsType type, final @javax.annotation.Nullable String notes) {
        this.rightsHolder = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), "net.lab1318.costume.api.models.rights.Rights: rightsHolder is empty");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "net.lab1318.costume.api.models.rights.Rights: notes is empty");
    }

    /**
     * Optional constructor
     */
    public Rights(final String rightsHolder, final String text, final net.lab1318.costume.api.models.rights.RightsType type, final com.google.common.base.Optional<String> notes) {
        this.rightsHolder = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), "net.lab1318.costume.api.models.rights.Rights: rightsHolder is empty");
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.rights.Rights: missing notes"), "net.lab1318.costume.api.models.rights.Rights: notes is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Rights other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Rights> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Rights)) {
            return false;
        }

        final Rights other = (Rights)otherObject;
        return
            getRightsHolder().equals(other.getRightsHolder()) &&
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getNotes().equals(other.getNotes());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "rights_holder": return getRightsHolder();
        case "text": return getText();
        case "type": return getType();
        case "notes": return getNotes();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getNotes() {
        return notes;
    }

    public final String getRightsHolder() {
        return rightsHolder;
    }

    public final String getText() {
        return text;
    }

    public final net.lab1318.costume.api.models.rights.RightsType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRightsHolder().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        return hashCode;
    }

    public static Rights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Rights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String rightsHolder = null;
        String text = null;
        net.lab1318.costume.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        rightsHolder = iprot.readString();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
        if (__list.getSize() > 3) {
            notes = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Rights(rightsHolder, text, type, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String rightsHolder = null;
        String text = null;
        net.lab1318.costume.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "rights_holder": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    rightsHolder = iprot.readString();
                }
                break;
            }
            case "text": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    text = iprot.readString();
                }
                break;
            }
            case "type": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
                }
                break;
            }
            case "notes": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    notes = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Rights(rightsHolder, text, type, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Rights replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new Rights(this.rightsHolder, this.text, this.type, notes);
    }

    public Rights replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public Rights replaceRightsHolder(final String rightsHolder) {
        return new Rights(rightsHolder, this.text, this.type, this.notes);
    }

    public Rights replaceText(final String text) {
        return new Rights(this.rightsHolder, text, this.type, this.notes);
    }

    public Rights replaceType(final net.lab1318.costume.api.models.rights.RightsType type) {
        return new Rights(this.rightsHolder, this.text, type, this.notes);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights_holder", getRightsHolder()).add("text", getText()).add("type", getType()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getRightsHolder());

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getNotes().isPresent()) {
            oprot.writeString(getNotes().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.rights.Rights");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("rights_holder", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getRightsHolder());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getNotes().isPresent()) {
            oprot.writeFieldBegin("notes", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String rightsHolder;

    private final String text;

    private final net.lab1318.costume.api.models.rights.RightsType type;

    private final com.google.common.base.Optional<String> notes;
}
