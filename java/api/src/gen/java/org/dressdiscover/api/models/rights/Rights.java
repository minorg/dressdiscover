package org.dressdiscover.api.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public class Rights implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public static class Builder {
        public Builder() {
            text = null;
            type = null;
            licenseVocabRef = com.google.common.base.Optional.absent();
            notes = com.google.common.base.Optional.absent();
            rightsHolder = com.google.common.base.Optional.absent();
        }

        public Builder(final Rights other) {
            this.text = other.getText();
            this.type = other.getType();
            this.licenseVocabRef = other.getLicenseVocabRef();
            this.notes = other.getNotes();
            this.rightsHolder = other.getRightsHolder();
        }

        protected Rights _build(final String text, final org.dressdiscover.api.models.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
            return new Rights(text, type, licenseVocabRef, notes, rightsHolder);
        }

        public Rights build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.rights.Rights: missing text"), com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.rights.Rights: missing type"), com.google.common.base.Preconditions.checkNotNull(licenseVocabRef, "org.dressdiscover.api.models.rights.Rights: missing licenseVocabRef"), com.google.common.base.Preconditions.checkNotNull(notes, "org.dressdiscover.api.models.rights.Rights: missing notes"), com.google.common.base.Preconditions.checkNotNull(rightsHolder, "org.dressdiscover.api.models.rights.Rights: missing rightsHolder"));
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> getLicenseVocabRef() {
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

        public final org.dressdiscover.api.models.rights.RightsType getType() {
            return type;
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            type = iprot.readEnum(org.dressdiscover.api.models.rights.RightsType.class);
            if (__list.getSize() > 2) {
                licenseVocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
            }
            if (__list.getSize() > 3) {
                notes = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 4) {
                rightsHolder = com.google.common.base.Optional.of(iprot.readString());
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
                case "text": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        text = iprot.readString();
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        type = iprot.readEnum(org.dressdiscover.api.models.rights.RightsType.class);
                    }
                    break;
                }
                case "license_vocab_ref": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        licenseVocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
                    }
                    break;
                }
                case "notes": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        notes = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "rights_holder": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        rightsHolder = com.google.common.base.Optional.of(iprot.readString());
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
            case TEXT: setText((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.models.rights.RightsType)value); return this;
            case LICENSE_VOCAB_REF: setLicenseVocabRef((org.dressdiscover.api.models.VocabRef)value); return this;
            case NOTES: setNotes((String)value); return this;
            case RIGHTS_HOLDER: setRightsHolder((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Rights other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getLicenseVocabRef().isPresent()) {
                setLicenseVocabRef(other.getLicenseVocabRef());
            }
            if (other.getNotes().isPresent()) {
                setNotes(other.getNotes());
            }
            if (other.getRightsHolder().isPresent()) {
                setRightsHolder(other.getRightsHolder());
            }

            return this;
        }

        public Builder setLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) {
            this.licenseVocabRef = com.google.common.base.Preconditions.checkNotNull(licenseVocabRef);
            return this;
        }

        public Builder setLicenseVocabRef(@javax.annotation.Nullable final org.dressdiscover.api.models.VocabRef licenseVocabRef) {
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

        public Builder setType(final org.dressdiscover.api.models.rights.RightsType type) {
            this.type = com.google.common.base.Preconditions.checkNotNull(type);
            return this;
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
            case TEXT: return unsetText();
            case TYPE: return unsetType();
            case LICENSE_VOCAB_REF: return unsetLicenseVocabRef();
            case NOTES: return unsetNotes();
            case RIGHTS_HOLDER: return unsetRightsHolder();
            default:
                throw new IllegalStateException();
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

        private String text;
        private org.dressdiscover.api.models.rights.RightsType type;
        private com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef;
        private com.google.common.base.Optional<String> notes;
        private com.google.common.base.Optional<String> rightsHolder;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 2, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.rights.RightsType>() {}, true, 3, "type", org.thryft.protocol.Type.STRING),
        LICENSE_VOCAB_REF("licenseVocabRef", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.VocabRef>() {}, false, 5, "license_vocab_ref", org.thryft.protocol.Type.STRUCT),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "notes", org.thryft.protocol.Type.STRING),
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<String>() {}, false, 1, "rights_holder", org.thryft.protocol.Type.STRING);

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
            case "notes": return NOTES;
            case "rightsHolder": return RIGHTS_HOLDER;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "license_vocab_ref": return LICENSE_VOCAB_REF;
            case "notes": return NOTES;
            case "rights_holder": return RIGHTS_HOLDER;
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
        this(other.getText(), other.getType(), other.getLicenseVocabRef(), other.getNotes(), other.getRightsHolder());
    }

    /**
     * Required constructor
     */
    public Rights(final String text, final org.dressdiscover.api.models.rights.RightsType type) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.rights.Rights: missing text"), "org.dressdiscover.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Optional.absent();
        this.notes = com.google.common.base.Optional.absent();
        this.rightsHolder = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Rights(final String text, final org.dressdiscover.api.models.rights.RightsType type, final @javax.annotation.Nullable org.dressdiscover.api.models.VocabRef licenseVocabRef, final @javax.annotation.Nullable String notes, final @javax.annotation.Nullable String rightsHolder) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.rights.Rights: missing text"), "org.dressdiscover.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Optional.fromNullable(licenseVocabRef);
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "org.dressdiscover.api.models.rights.Rights: notes is empty");
        this.rightsHolder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(rightsHolder), "org.dressdiscover.api.models.rights.Rights: rightsHolder is empty");
    }

    /**
     * Optional constructor
     */
    public Rights(final String text, final org.dressdiscover.api.models.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
        this.text = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(text, "org.dressdiscover.api.models.rights.Rights: missing text"), "org.dressdiscover.api.models.rights.Rights: text is empty");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "org.dressdiscover.api.models.rights.Rights: missing type");
        this.licenseVocabRef = com.google.common.base.Preconditions.checkNotNull(licenseVocabRef, "org.dressdiscover.api.models.rights.Rights: missing licenseVocabRef");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(notes, "org.dressdiscover.api.models.rights.Rights: missing notes"), "org.dressdiscover.api.models.rights.Rights: notes is empty");
        this.rightsHolder = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(rightsHolder, "org.dressdiscover.api.models.rights.Rights: missing rightsHolder"), "org.dressdiscover.api.models.rights.Rights: rightsHolder is empty");
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
            ((getLicenseVocabRef().isPresent() && other.getLicenseVocabRef().isPresent()) ? (getLicenseVocabRef().get().equals(other.getLicenseVocabRef().get())) : (!getLicenseVocabRef().isPresent() && !other.getLicenseVocabRef().isPresent())) &&
            ((getNotes().isPresent() && other.getNotes().isPresent()) ? (getNotes().get().equals(other.getNotes().get())) : (!getNotes().isPresent() && !other.getNotes().isPresent())) &&
            ((getRightsHolder().isPresent() && other.getRightsHolder().isPresent()) ? (getRightsHolder().get().equals(other.getRightsHolder().get())) : (!getRightsHolder().isPresent() && !other.getRightsHolder().isPresent()));
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
        case NOTES: return getNotes();
        case RIGHTS_HOLDER: return getRightsHolder();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> getLicenseVocabRef() {
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

    public final org.dressdiscover.api.models.rights.RightsType getType() {
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
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        if (getRightsHolder().isPresent()) {
            hashCode = 31 * hashCode + getRightsHolder().get().hashCode();
        }
        return hashCode;
    }

    public static Rights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Rights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Rights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        text = iprot.readString();
        type = iprot.readEnum(org.dressdiscover.api.models.rights.RightsType.class);
        if (__list.getSize() > 2) {
            licenseVocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
        }
        if (__list.getSize() > 3) {
            notes = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 4) {
            rightsHolder = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new Rights(text, type, licenseVocabRef, notes, rightsHolder);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.absent();

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
                    type = iprot.readEnum(org.dressdiscover.api.models.rights.RightsType.class);
                }
                break;
            }
            case "license_vocab_ref": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    licenseVocabRef = com.google.common.base.Optional.of(org.dressdiscover.api.models.VocabRef.readAsStruct(iprot));
                }
                break;
            }
            case "notes": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    notes = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "rights_holder": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    rightsHolder = com.google.common.base.Optional.of(iprot.readString());
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
            return new Rights(text, type, licenseVocabRef, notes, rightsHolder);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Rights replaceLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) {
        return new Rights(this.text, this.type, licenseVocabRef, this.notes, this.rightsHolder);
    }

    public Rights replaceLicenseVocabRef(final org.dressdiscover.api.models.VocabRef licenseVocabRef) {
        return replaceLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
    }

    public Rights replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new Rights(this.text, this.type, this.licenseVocabRef, notes, this.rightsHolder);
    }

    public Rights replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public Rights replaceRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
        return new Rights(this.text, this.type, this.licenseVocabRef, this.notes, rightsHolder);
    }

    public Rights replaceRightsHolder(final String rightsHolder) {
        return replaceRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
    }

    public Rights replaceText(final String text) {
        return new Rights(text, this.type, this.licenseVocabRef, this.notes, this.rightsHolder);
    }

    public Rights replaceType(final org.dressdiscover.api.models.rights.RightsType type) {
        return new Rights(this.text, type, this.licenseVocabRef, this.notes, this.rightsHolder);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("license_vocab_ref", getLicenseVocabRef().orNull()).add("notes", getNotes().orNull()).add("rights_holder", getRightsHolder().orNull()).toString();
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

        if (getNotes().isPresent()) {
            oprot.writeString(getNotes().get());
        } else {
            oprot.writeNull();
        }

        if (getRightsHolder().isPresent()) {
            oprot.writeString(getRightsHolder().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.rights.Rights");
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

        if (getNotes().isPresent()) {
            oprot.writeFieldBegin("notes", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }

        if (getRightsHolder().isPresent()) {
            oprot.writeFieldBegin("rights_holder", org.thryft.protocol.Type.STRING, (short)1);
            oprot.writeString(getRightsHolder().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final org.dressdiscover.api.models.rights.RightsType type;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef;

    private final com.google.common.base.Optional<String> notes;

    private final com.google.common.base.Optional<String> rightsHolder;
}
