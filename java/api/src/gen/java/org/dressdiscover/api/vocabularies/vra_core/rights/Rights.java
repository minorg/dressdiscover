package org.dressdiscover.api.vocabularies.vra_core.rights;

/**
 * VRA Core 4.0 rights element
 */
public final class Rights implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Rights> {
        public Builder() {
            text = null;
            type = null;
            licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();
            notes = com.google.common.base.Optional.<String> absent();
            rightsHolder = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final Rights other) {
            this.text = other.getText();
            this.type = other.getType();
            this.licenseVocabRef = other.getLicenseVocabRef();
            this.notes = other.getNotes();
            this.rightsHolder = other.getRightsHolder();
        }

        protected Rights _build(final String text, final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
            return new Rights(text, type, licenseVocabRef, notes, rightsHolder);
        }

        public Rights build() {
            Validator.validate(text, type, licenseVocabRef, notes, rightsHolder);

            return _build(text, type, licenseVocabRef, notes, rightsHolder);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> getLicenseVocabRef() {
            return licenseVocabRef;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public final com.google.common.base.Optional<String> getRightsHolder() {
            return rightsHolder;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.rights.RightsType getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setText(iprot.readString());
                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.rights.RightsType.Factory.getInstance()));
                if (__list.getSize() > 2) {
                    this.setLicenseVocabRef(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot)));
                }
                if (__list.getSize() > 3) {
                    this.setNotes(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 4) {
                    this.setRightsHolder(com.google.common.base.Optional.of(iprot.readString()));
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
                    case "text": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setText(iprot.readString());
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.rights.RightsType.Factory.getInstance()));
                        }
                        break;
                    }
                    case "license_vocab_ref": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                                this.setLicenseVocabRef(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VocabRef.readAsStruct(iprot, unknownFieldCallback)));
                        }
                        break;
                    }
                    case "notes": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                this.setNotes(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "rights_holder": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setRightsHolder(com.google.common.base.Optional.of(iprot.readString()));
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
            case TEXT: setText((String)value); return this;
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.rights.RightsType)value); return this;
            case LICENSE_VOCAB_REF: setLicenseVocabRef((org.dressdiscover.api.vocabularies.vra_core.VocabRef)value); return this;
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

        public Builder setLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef) {
            Validator.validateLicenseVocabRef(licenseVocabRef);
            this.licenseVocabRef = licenseVocabRef;
            return this;
        }

        public Builder setLicenseVocabRef(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.VocabRef licenseVocabRef) {
            return setLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
        }

        public Builder setNotes(final com.google.common.base.Optional<String> notes) {
            Validator.validateNotes(notes);
            this.notes = notes;
            return this;
        }

        public Builder setNotes(final @javax.annotation.Nullable String notes) {
            return setNotes(com.google.common.base.Optional.fromNullable(notes));
        }

        public Builder setRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            Validator.validateRightsHolder(rightsHolder);
            this.rightsHolder = rightsHolder;
            return this;
        }

        public Builder setRightsHolder(final @javax.annotation.Nullable String rightsHolder) {
            return setRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
        }

        public Builder setText(final String text) {
            Validator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type) {
            Validator.validateType(type);
            this.type = type;
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
            this.licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent();
            return this;
        }

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetRightsHolder() {
            this.rightsHolder = com.google.common.base.Optional.<String> absent();
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

        private @javax.annotation.Nullable String text;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef;
        private com.google.common.base.Optional<String> notes;
        private com.google.common.base.Optional<String> rightsHolder;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Rights> {
        @Override
        public Rights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsList(iprot);
        }

        @Override
        public Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsStruct(iprot);
        }

        @Override
        public Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)2, "text", "2:text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.rights.RightsType>() {}, true, (short)3, "type", "3:type", org.thryft.protocol.Type.STRING),
        LICENSE_VOCAB_REF("licenseVocabRef", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.VocabRef>() {}, false, (short)5, "license_vocab_ref", "5:license_vocab_ref", org.thryft.protocol.Type.STRUCT),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, (short)4, "notes", "4:notes", org.thryft.protocol.Type.STRING),
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<String>() {}, false, (short)1, "rights_holder", "1:rights_holder", org.thryft.protocol.Type.STRING);

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
        public static void validate(final String text, final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
            validateText(text);
            validateType(type);
            validateLicenseVocabRef(licenseVocabRef);
            validateNotes(notes);
            validateRightsHolder(rightsHolder);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: text is missing");
            }
            if (text.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: text: less than min length 1");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: type is missing");
            }
        }

        public static void validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef) {
            if (licenseVocabRef == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: licenseVocabRef is missing");
            }
        }

        public static void validateNotes(final com.google.common.base.Optional<String> notes) {
            if (notes == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: notes is missing");
            }
            if (notes.isPresent()) {
                if (notes.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: notes: less than min length 1");
                }
            }
        }

        public static void validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            if (rightsHolder == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: rightsHolder is missing");
            }
            if (rightsHolder.isPresent()) {
                if (rightsHolder.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.rights.Rights: rightsHolder: less than min length 1");
                }
            }
        }
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
    public Rights(final String text, final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type) {
        this(text, type, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VocabRef> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent());
    }

    /**
     * Total constructor
     */
    public Rights(final String text, final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
        Validator.validate(text, type, licenseVocabRef, notes, rightsHolder);
        this.text = text;
        this.type = type;
        this.licenseVocabRef = licenseVocabRef;
        this.notes = notes;
        this.rightsHolder = rightsHolder;
    }

    /**
     * Total Nullable constructor
     */
    public Rights(final String text, final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VocabRef licenseVocabRef, @javax.annotation.Nullable final String notes, @javax.annotation.Nullable final String rightsHolder) {
        this(text, type, com.google.common.base.Optional.fromNullable(licenseVocabRef), com.google.common.base.Optional.fromNullable(notes), com.google.common.base.Optional.fromNullable(rightsHolder));
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
        }
        if (!(otherObject instanceof Rights)) {
            return false;
        }

        final Rights other = (Rights)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getLicenseVocabRef().isPresent() && other.getLicenseVocabRef().isPresent()) ? (getLicenseVocabRef().get().equals(other.getLicenseVocabRef().get())) : (!getLicenseVocabRef().isPresent() && !other.getLicenseVocabRef().isPresent())))) {
            return false;
        }

        if (!(((getNotes().isPresent() && other.getNotes().isPresent()) ? (getNotes().get().equals(other.getNotes().get())) : (!getNotes().isPresent() && !other.getNotes().isPresent())))) {
            return false;
        }

        if (!(((getRightsHolder().isPresent() && other.getRightsHolder().isPresent()) ? (getRightsHolder().get().equals(other.getRightsHolder().get())) : (!getRightsHolder().isPresent() && !other.getRightsHolder().isPresent())))) {
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
        case TEXT: return getText();
        case TYPE: return getType();
        case LICENSE_VOCAB_REF: return getLicenseVocabRef();
        case NOTES: return getNotes();
        case RIGHTS_HOLDER: return getRightsHolder();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> getLicenseVocabRef() {
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

    public final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType getType() {
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

    public static Rights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Rights replaceLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef) {
        Validator.validateLicenseVocabRef(licenseVocabRef);
        return new Rights(this.text, this.type, licenseVocabRef, this.notes, this.rightsHolder);
    }

    public Rights replaceLicenseVocabRef(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VocabRef licenseVocabRef) {
        return replaceLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
    }

    public Rights replaceNotes(final com.google.common.base.Optional<String> notes) {
        Validator.validateNotes(notes);
        return new Rights(this.text, this.type, this.licenseVocabRef, notes, this.rightsHolder);
    }

    public Rights replaceNotes(@javax.annotation.Nullable final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public Rights replaceRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
        Validator.validateRightsHolder(rightsHolder);
        return new Rights(this.text, this.type, this.licenseVocabRef, this.notes, rightsHolder);
    }

    public Rights replaceRightsHolder(@javax.annotation.Nullable final String rightsHolder) {
        return replaceRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
    }

    public Rights replaceText(final String text) {
        Validator.validateText(text);
        return new Rights(text, this.type, this.licenseVocabRef, this.notes, this.rightsHolder);
    }

    public Rights replaceType(final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type) {
        Validator.validateType(type);
        return new Rights(this.text, type, this.licenseVocabRef, this.notes, this.rightsHolder);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("license_vocab_ref", getLicenseVocabRef().orNull()).add("notes", getNotes().orNull()).add("rights_holder", getRightsHolder().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.rights.Rights");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeTypeField(oprot);

        writeLicenseVocabRefField(oprot);

        writeNotesField(oprot);

        writeRightsHolderField(oprot);

        oprot.writeFieldStop();
    }

    public void writeLicenseVocabRefField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLicenseVocabRef().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LICENSE_VOCAB_REF);
            getLicenseVocabRef().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeNotesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getNotes().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.NOTES);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsHolderField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRightsHolder().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RIGHTS_HOLDER);
            oprot.writeString(getRightsHolder().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    public void writeTypeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TYPE);
        oprot.writeEnum(getType());
        oprot.writeFieldEnd();
    }

    private final String text;

    private final org.dressdiscover.api.vocabularies.vra_core.rights.RightsType type;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VocabRef> licenseVocabRef;

    private final com.google.common.base.Optional<String> notes;

    private final com.google.common.base.Optional<String> rightsHolder;
}
