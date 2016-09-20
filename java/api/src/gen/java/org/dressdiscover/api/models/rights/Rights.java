package org.dressdiscover.api.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public final class Rights implements org.thryft.Struct, org.dressdiscover.api.models.Element {
    public final static class Builder {
        public Builder() {
            text = null;
            type = null;
            licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
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

        protected Rights _build(final String text, final org.dressdiscover.api.models.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
            return new Rights(text, type, licenseVocabRef, notes, rightsHolder, DefaultConstructionValidator.getInstance());
        }

        public Rights build() {
            return _build(text, type, licenseVocabRef, notes, rightsHolder);
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
            try {
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            this.licenseVocabRef = DefaultConstructionValidator.getInstance().validateLicenseVocabRef(licenseVocabRef);
            return this;
        }

        public Builder setLicenseVocabRef(@javax.annotation.Nullable final org.dressdiscover.api.models.VocabRef licenseVocabRef) {
            return setLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
        }

        public Builder setNotes(final com.google.common.base.Optional<String> notes) {
            this.notes = DefaultConstructionValidator.getInstance().validateNotes(notes);
            return this;
        }

        public Builder setNotes(@javax.annotation.Nullable final String notes) {
            return setNotes(com.google.common.base.Optional.fromNullable(notes));
        }

        public Builder setRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            this.rightsHolder = DefaultConstructionValidator.getInstance().validateRightsHolder(rightsHolder);
            return this;
        }

        public Builder setRightsHolder(@javax.annotation.Nullable final String rightsHolder) {
            return setRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.models.rights.RightsType type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
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
            this.licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
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

        private String text;
        private org.dressdiscover.api.models.rights.RightsType type;
        private com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef;
        private com.google.common.base.Optional<String> notes;
        private com.google.common.base.Optional<String> rightsHolder;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Rights> {
        @Override
        public Rights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAs(iprot, type);
        }

        @Override
        public Rights readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Rights readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsList(iprot);
        }

        @Override
        public Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsStruct(iprot);
        }

        @Override
        public Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Rights.readAsStruct(iprot, unknownFieldCallback);
        }
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

    public interface Validator<ExceptionT extends Exception> {
        public String validateText(final String text) throws ExceptionT;

        public org.dressdiscover.api.models.rights.RightsType validateType(final org.dressdiscover.api.models.rights.RightsType type) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) throws ExceptionT;

        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws ExceptionT;

        public com.google.common.base.Optional<String> validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public String validateText(final String text) throws RuntimeException {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.rights.Rights: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.rights.Rights: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.models.rights.RightsType validateType(final org.dressdiscover.api.models.rights.RightsType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.models.rights.Rights: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) throws RuntimeException {
            if (licenseVocabRef == null) {
                throw new NullPointerException("org.dressdiscover.api.models.rights.Rights: licenseVocabRef is null");
            }
            if (!licenseVocabRef.isPresent()) {
                return licenseVocabRef;
            }
            return licenseVocabRef;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws RuntimeException {
            if (notes == null) {
                throw new NullPointerException("org.dressdiscover.api.models.rights.Rights: notes is null");
            }
            if (!notes.isPresent()) {
                return notes;
            }
            if (notes.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.rights.Rights: notes is less than min length 1");
            }
            return notes;
        }

        @Override
        public com.google.common.base.Optional<String> validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) throws RuntimeException {
            if (rightsHolder == null) {
                throw new NullPointerException("org.dressdiscover.api.models.rights.Rights: rightsHolder is null");
            }
            if (!rightsHolder.isPresent()) {
                return rightsHolder;
            }
            if (rightsHolder.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.rights.Rights: rightsHolder is less than min length 1");
            }
            return rightsHolder;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.models.rights.RightsType validateType(final org.dressdiscover.api.models.rights.RightsType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) {
            return licenseVocabRef;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) {
            return notes;
        }

        @Override
        public com.google.common.base.Optional<String> validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            return rightsHolder;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public String validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.rights.Rights: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.rights.Rights: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.models.rights.RightsType validateType(final org.dressdiscover.api.models.rights.RightsType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.models.rights.Rights: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) throws org.thryft.protocol.InputProtocolException {
            if (licenseVocabRef == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LICENSE_VOCAB_REF, "org.dressdiscover.api.models.rights.Rights: licenseVocabRef is null");
            }
            if (!licenseVocabRef.isPresent()) {
                return licenseVocabRef;
            }
            return licenseVocabRef;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws org.thryft.protocol.InputProtocolException {
            if (notes == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NOTES, "org.dressdiscover.api.models.rights.Rights: notes is null");
            }
            if (!notes.isPresent()) {
                return notes;
            }
            if (notes.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NOTES, "org.dressdiscover.api.models.rights.Rights: notes is less than min length 1");
            }
            return notes;
        }

        @Override
        public com.google.common.base.Optional<String> validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) throws org.thryft.protocol.InputProtocolException {
            if (rightsHolder == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, "org.dressdiscover.api.models.rights.Rights: rightsHolder is null");
            }
            if (!rightsHolder.isPresent()) {
                return rightsHolder;
            }
            if (rightsHolder.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, "org.dressdiscover.api.models.rights.Rights: rightsHolder is less than min length 1");
            }
            return rightsHolder;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public String validateText(final String text) {
            return text;
        }

        @Override
        public org.dressdiscover.api.models.rights.RightsType validateType(final org.dressdiscover.api.models.rights.RightsType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> validateLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) {
            return licenseVocabRef;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) {
            return notes;
        }

        @Override
        public com.google.common.base.Optional<String> validateRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
            return rightsHolder;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Rights(final Rights other) {
        this(other.getText(), other.getType(), other.getLicenseVocabRef(), other.getNotes(), other.getRightsHolder(), NopConstructionValidator.getInstance());
    }

    protected Rights(final String text, final org.dressdiscover.api.models.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder, ConstructionValidator validator) {
        this.text = validator.validateText(text);
        this.type = validator.validateType(type);
        this.licenseVocabRef = validator.validateLicenseVocabRef(licenseVocabRef);
        this.notes = validator.validateNotes(notes);
        this.rightsHolder = validator.validateRightsHolder(rightsHolder);
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

    /**
     * Required factory method
     */
    public static Rights create(final String text, final org.dressdiscover.api.models.rights.RightsType type) {
        return new Rights(text, type, com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Rights create(final String text, final org.dressdiscover.api.models.rights.RightsType type, final @javax.annotation.Nullable org.dressdiscover.api.models.VocabRef licenseVocabRef, final @javax.annotation.Nullable String notes, final @javax.annotation.Nullable String rightsHolder) {
        return new Rights(text, type, com.google.common.base.Optional.fromNullable(licenseVocabRef), com.google.common.base.Optional.fromNullable(notes), com.google.common.base.Optional.fromNullable(rightsHolder), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Rights create(final String text, final org.dressdiscover.api.models.rights.RightsType type, final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef, final com.google.common.base.Optional<String> notes, final com.google.common.base.Optional<String> rightsHolder) {
        return new Rights(text, type, licenseVocabRef, notes, rightsHolder, DefaultConstructionValidator.getInstance());
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
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.<String> absent();

        try {
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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Rights(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateLicenseVocabRef(licenseVocabRef), DefaultReadValidator.getInstance().validateNotes(notes), DefaultReadValidator.getInstance().validateRightsHolder(rightsHolder), NopConstructionValidator.getInstance());
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Rights readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.models.rights.RightsType type = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef = com.google.common.base.Optional.<org.dressdiscover.api.models.VocabRef> absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> rightsHolder = com.google.common.base.Optional.<String> absent();

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
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Rights(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validateLicenseVocabRef(licenseVocabRef), DefaultReadValidator.getInstance().validateNotes(notes), DefaultReadValidator.getInstance().validateRightsHolder(rightsHolder), NopConstructionValidator.getInstance());
    }

    public Rights replaceLicenseVocabRef(final com.google.common.base.Optional<org.dressdiscover.api.models.VocabRef> licenseVocabRef) {
        return new Rights(this.text, this.type, DefaultConstructionValidator.getInstance().validateLicenseVocabRef(licenseVocabRef), this.notes, this.rightsHolder, NopConstructionValidator.getInstance());
    }

    public Rights replaceLicenseVocabRef(final org.dressdiscover.api.models.VocabRef licenseVocabRef) {
        return replaceLicenseVocabRef(com.google.common.base.Optional.fromNullable(licenseVocabRef));
    }

    public Rights replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new Rights(this.text, this.type, this.licenseVocabRef, DefaultConstructionValidator.getInstance().validateNotes(notes), this.rightsHolder, NopConstructionValidator.getInstance());
    }

    public Rights replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public Rights replaceRightsHolder(final com.google.common.base.Optional<String> rightsHolder) {
        return new Rights(this.text, this.type, this.licenseVocabRef, this.notes, DefaultConstructionValidator.getInstance().validateRightsHolder(rightsHolder), NopConstructionValidator.getInstance());
    }

    public Rights replaceRightsHolder(final String rightsHolder) {
        return replaceRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
    }

    public Rights replaceText(final String text) {
        return new Rights(DefaultConstructionValidator.getInstance().validateText(text), this.type, this.licenseVocabRef, this.notes, this.rightsHolder, NopConstructionValidator.getInstance());
    }

    public Rights replaceType(final org.dressdiscover.api.models.rights.RightsType type) {
        return new Rights(this.text, DefaultConstructionValidator.getInstance().validateType(type), this.licenseVocabRef, this.notes, this.rightsHolder, NopConstructionValidator.getInstance());
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
