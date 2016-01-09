package net.lab1318.costume.api.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public class Rights implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            licenseVocabRef = com.google.common.base.Optional.absent();
            rightsHolder = com.google.common.base.Optional.absent();
            notes = com.google.common.base.Optional.absent();
        }

        public Builder(final Rights other) {
            this.text = other.getText();
            this.type = other.getType();
            this.licenseVocabRef = other.getLicenseVocabRef();
            this.rightsHolder = other.getRightsHolder();
            this.notes = other.getNotes();
        }

        protected Rights _build(final String text, final net.lab1318.costume.api.models.rights.RightsType type, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> rightsHolder, final com.google.common.base.Optional<String> notes) {
            return new Rights(text, type, licenseVocabRef, rightsHolder, notes);
        }

        public Rights build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type"), com.google.common.base.Preconditions.checkNotNull(licenseVocabRef, "net.lab1318.costume.api.models.rights.Rights: missing licenseVocabRef"), com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.rights.Rights: missing notes"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getLicenseVocabRef() {
            return licenseVocabRef;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public final com.google.common.base.Optional<String> getRightsHolder() {
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
            text = iprot.readString();
            type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
            if (__list.getSize() > 2) {
                licenseVocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                rightsHolder = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 4) {
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
                case "license_vocab_ref": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        licenseVocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                    }
                    break;
                }
                case "rights_holder": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        rightsHolder = com.google.common.base.Optional.of(iprot.readString());
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

            setText(other.getText());
            setType(other.getType());
            if (other.getLicenseVocabRef().isPresent()) {
                setLicenseVocabRef(other.getLicenseVocabRef());
            }
            if (other.getRightsHolder().isPresent()) {
                setRightsHolder(other.getRightsHolder());
            }
            if (other.getNotes().isPresent()) {
                setNotes(other.getNotes());
            }

            return this;
        }

        public Builder setLicenseVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef) {
            this.licenseVocabRef = com.google.common.base.Preconditions.checkNotNull(licenseVocabRef);
            return this;
        }

        public Builder setLicenseVocabRef(@javax.annotation.Nullable final net.lab1318.costume.api.models.VocabRef licenseVocabRef) {
            this.licenseVocabRef = com.google.common.base.Optional.fromNullable(licenseVocabRef);
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

        public Builder setRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            this.rightsHolder = com.google.common.base.Preconditions.checkNotNull(rightsHolder);
            return this;
        }

        public Builder setRightsHolder(@javax.annotation.Nullable final String rightsHolder) {
            this.rightsHolder = com.google.common.base.Optional.fromNullable(rightsHolder);
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
            case "text": setText((String)value); return this;
            case "type": setType((net.lab1318.costume.api.models.rights.RightsType)value); return this;
            case "license_vocab_ref": setLicenseVocabRef((net.lab1318.costume.api.models.VocabRef)value); return this;
            case "rights_holder": setRightsHolder((String)value); return this;
            case "notes": setNotes((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetLicenseVocabRef() {
            this.licenseVocabRef = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRightsHolder() {
            this.rightsHolder = com.google.common.base.Optional.absent();
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
            case "text": return unsetText();
            case "type": return unsetType();
            case "license_vocab_ref": return unsetLicenseVocabRef();
            case "rights_holder": return unsetRightsHolder();
            case "notes": return unsetNotes();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private String text;
        private net.lab1318.costume.api.models.rights.RightsType type;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef;
        private com.google.common.base.Optional<String> rightsHolder;
        private com.google.common.base.Optional<String> notes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
        LICENSE_VOCAB_REF("licenseVocabRef", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.VocabRef>() {}, false, 5, "license_vocab_ref", org.thryft.protocol.Type.STRUCT),
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "rights_holder", org.thryft.protocol.Type.STRING),
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
            case "text": return TEXT;
            case "type": return TYPE;
            case "licenseVocabRef": return LICENSE_VOCAB_REF;
            case "rightsHolder": return RIGHTS_HOLDER;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "license_vocab_ref": return LICENSE_VOCAB_REF;
            case "rights_holder": return RIGHTS_HOLDER;
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
        this(other.getText(), other.getType(), other.getLicenseVocabRef(), other.getRightsHolder(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public Rights(final String text, final net.lab1318.costume.api.models.rights.RightsType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Optional.absent();
        this.rightsHolder = com.google.common.base.Optional.absent();
        this.notes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Rights(final String text, final net.lab1318.costume.api.models.rights.RightsType type, final @javax.annotation.Nullable net.lab1318.costume.api.models.VocabRef licenseVocabRef, final @javax.annotation.Nullable String rightsHolder, final @javax.annotation.Nullable String notes) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Optional.fromNullable(licenseVocabRef);
        this.rightsHolder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(rightsHolder), "net.lab1318.costume.api.models.rights.Rights: rightsHolder is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "net.lab1318.costume.api.models.rights.Rights: notes is empty");
    }

    /**
     * Optional constructor
     */
    public Rights(final String text, final net.lab1318.costume.api.models.rights.RightsType type, final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> rightsHolder, final com.google.common.base.Optional<String> notes) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "net.lab1318.costume.api.models.rights.Rights: missing text"), "net.lab1318.costume.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "net.lab1318.costume.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Preconditions.checkNotNull(licenseVocabRef, "net.lab1318.costume.api.models.rights.Rights: missing licenseVocabRef");
        this.rightsHolder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "net.lab1318.costume.api.models.rights.Rights: missing rightsHolder"), "net.lab1318.costume.api.models.rights.Rights: rightsHolder is empty");
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
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getLicenseVocabRef().equals(other.getLicenseVocabRef()) &&
            getRightsHolder().equals(other.getRightsHolder()) &&
            getNotes().equals(other.getNotes());
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
        case TEXT: return getText();
        case TYPE: return getType();
        case LICENSE_VOCAB_REF: return getLicenseVocabRef();
        case RIGHTS_HOLDER: return getRightsHolder();
        case NOTES: return getNotes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> getLicenseVocabRef() {
        return licenseVocabRef;
    }

    public final com.google.common.base.Optional<String> getNotes() {
        return notes;
    }

    public final com.google.common.base.Optional<String> getRightsHolder() {
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
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getLicenseVocabRef().isPresent()) {
            hashCode = 31 * hashCode + getLicenseVocabRef().get().hashCode();
        }
        if (getRightsHolder().isPresent()) {
            hashCode = 31 * hashCode + getRightsHolder().get().hashCode();
        }
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
        String text = null;
        net.lab1318.costume.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(net.lab1318.costume.api.models.rights.RightsType.class);
        if (__list.getSize() > 2) {
            licenseVocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            rightsHolder = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 4) {
            notes = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Rights(text, type, licenseVocabRef, rightsHolder, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        net.lab1318.costume.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
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
            case "license_vocab_ref": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    licenseVocabRef = com.google.common.base.Optional.of(net.lab1318.costume.api.models.VocabRef.readAsStruct(iprot));
                }
                break;
            }
            case "rights_holder": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    rightsHolder = com.google.common.base.Optional.of(iprot.readString());
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
            return new Rights(text, type, licenseVocabRef, rightsHolder, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Rights replaceLicenseVocabRef(final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef) {
        return new Rights(this.text, this.type, licenseVocabRef, this.rightsHolder, this.notes);
    }

    public Rights replaceLicenseVocabRef(final net.lab1318.costume.api.models.VocabRef licenseVocabRef) {
        return replaceLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
    }

    public Rights replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new Rights(this.text, this.type, this.licenseVocabRef, this.rightsHolder, notes);
    }

    public Rights replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public Rights replaceRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
        return new Rights(this.text, this.type, this.licenseVocabRef, rightsHolder, this.notes);
    }

    public Rights replaceRightsHolder(final String rightsHolder) {
        return replaceRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
    }

    public Rights replaceText(final String text) {
        return new Rights(text, this.type, this.licenseVocabRef, this.rightsHolder, this.notes);
    }

    public Rights replaceType(final net.lab1318.costume.api.models.rights.RightsType type) {
        return new Rights(this.text, type, this.licenseVocabRef, this.rightsHolder, this.notes);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("license_vocab_ref", getLicenseVocabRef().orNull()).add("rights_holder", getRightsHolder().orNull()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getLicenseVocabRef().isPresent()) {
            getLicenseVocabRef().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getRightsHolder().isPresent()) {
            oprot.writeString(getRightsHolder().get());
        } else {
            oprot.writeNull();
        }

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
        oprot.writeFieldBegin("text", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getText());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("type", org.thryft.protocol.Type.STRING, (short)3);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();

        if (getLicenseVocabRef().isPresent()) {
            oprot.writeFieldBegin("license_vocab_ref", org.thryft.protocol.Type.STRUCT, (short)5);
            getLicenseVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getRightsHolder().isPresent()) {
            oprot.writeFieldBegin("rights_holder", org.thryft.protocol.Type.STRING, (short)1);
            oprot.writeString(getRightsHolder().get());
            oprot.writeFieldEnd();
        }

        if (getNotes().isPresent()) {
            oprot.writeFieldBegin("notes", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final net.lab1318.costume.api.models.rights.RightsType type;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.VocabRef> licenseVocabRef;

    private final com.google.common.base.Optional<String> rightsHolder;

    private final com.google.common.base.Optional<String> notes;
}
