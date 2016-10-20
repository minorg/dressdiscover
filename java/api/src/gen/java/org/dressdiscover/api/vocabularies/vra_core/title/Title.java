package org.dressdiscover.api.vocabularies.vra_core.title;

/**
 * VRA Core 4.0 title element
 */
public final class Title implements org.thryft.Struct, org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
        public Builder() {
            text = null;
            type = null;
            pref = com.google.common.base.Optional.<Boolean> absent();
        }

        public Builder(final Title other) {
            this.text = other.getText();
            this.type = other.getType();
            this.pref = other.getPref();
        }

        protected Title _build(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
            return new Title(text, type, pref, DefaultConstructionValidator.getInstance());
        }

        public Title build() {
            return _build(text, type, pref);
        }

        public final com.google.common.base.Optional<Boolean> getPref() {
            return pref;
        }

        public final String getText() {
            return text;
        }

        public final org.dressdiscover.api.vocabularies.vra_core.title.TitleType getType() {
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
                type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.class);
                if (__list.getSize() > 2) {
                    pref = com.google.common.base.Optional.of(iprot.readBool());
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
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            text = iprot.readString();
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.class);
                        }
                        break;
                    }
                    case "pref": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            pref = com.google.common.base.Optional.of(iprot.readBool());
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
            case TYPE: setType((org.dressdiscover.api.vocabularies.vra_core.title.TitleType)value); return this;
            case PREF: setPref((Boolean)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final Title other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setText(other.getText());
            setType(other.getType());
            if (other.getPref().isPresent()) {
                setPref(other.getPref());
            }

            return this;
        }

        public Builder setPref(final com.google.common.base.Optional<Boolean> pref) {
            this.pref = DefaultConstructionValidator.getInstance().validatePref(pref);
            return this;
        }

        public Builder setPref(@javax.annotation.Nullable final Boolean pref) {
            return setPref(com.google.common.base.Optional.fromNullable(pref));
        }

        public Builder setText(final String text) {
            this.text = DefaultConstructionValidator.getInstance().validateText(text);
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
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
            case PREF: return unsetPref();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetPref() {
            this.pref = com.google.common.base.Optional.<Boolean> absent();
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
        private org.dressdiscover.api.vocabularies.vra_core.title.TitleType type;
        private com.google.common.base.Optional<Boolean> pref;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Title> {
        @Override
        public Title readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Title.readAs(iprot, type);
        }

        @Override
        public Title readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Title.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Title readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsList(iprot);
        }

        @Override
        public Title readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsStruct(iprot);
        }

        @Override
        public Title readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.title.TitleType>() {}, true, 2, "type", org.thryft.protocol.Type.STRING),
        PREF("pref", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 3, "pref", org.thryft.protocol.Type.BOOL);

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
            case "pref": return PREF;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "text": return TEXT;
            case "type": return TYPE;
            case "pref": return PREF;
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

        public org.dressdiscover.api.vocabularies.vra_core.title.TitleType validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validatePref(final com.google.common.base.Optional<Boolean> pref) throws ExceptionT;
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
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.title.Title: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.title.Title: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.title.TitleType validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.title.Title: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validatePref(final com.google.common.base.Optional<Boolean> pref) throws RuntimeException {
            if (!pref.isPresent()) {
                return pref;
            }
            if (!pref.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.title.Title: pref is not true");
            }
            return pref;
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
        public org.dressdiscover.api.vocabularies.vra_core.title.TitleType validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validatePref(final com.google.common.base.Optional<Boolean> pref) {
            return pref;
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
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.title.Title: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.vocabularies.vra_core.title.Title: text is less than min length 1");
            }
            return text;
        }

        @Override
        public org.dressdiscover.api.vocabularies.vra_core.title.TitleType validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.vra_core.title.Title: type is null");
            }
            return type;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validatePref(final com.google.common.base.Optional<Boolean> pref) throws org.thryft.protocol.InputProtocolException {
            if (!pref.isPresent()) {
                return pref;
            }
            if (!pref.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PREF, "org.dressdiscover.api.vocabularies.vra_core.title.Title: pref is not true");
            }
            return pref;
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
        public org.dressdiscover.api.vocabularies.vra_core.title.TitleType validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
            return type;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validatePref(final com.google.common.base.Optional<Boolean> pref) {
            return pref;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Title(final Title other) {
        this(other.getText(), other.getType(), other.getPref(), NopConstructionValidator.getInstance());
    }

    protected Title(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final com.google.common.base.Optional<Boolean> pref, ConstructionValidator validator) {
        this.text = validator.validateText(text);
        this.type = validator.validateType(type);
        this.pref = validator.validatePref(pref);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Title other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Title> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Title create(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
        return new Title(text, type, com.google.common.base.Optional.<Boolean> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Title create(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final @javax.annotation.Nullable Boolean pref) {
        return new Title(text, type, com.google.common.base.Optional.fromNullable(pref), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Title create(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
        return new Title(text, type, pref, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Title)) {
            return false;
        }

        final Title other = (Title)otherObject;

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        if (!(getType().equals(other.getType()))) {
            return false;
        }

        if (!(((getPref().isPresent() && other.getPref().isPresent()) ? (getPref().get().booleanValue() == other.getPref().get().booleanValue()) : (!getPref().isPresent() && !other.getPref().isPresent())))) {
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
        case PREF: return getPref();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<Boolean> getPref() {
        return pref;
    }

    public final String getText() {
        return text;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.title.TitleType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getPref().isPresent()) {
            hashCode = 31 * hashCode + (getPref().get() ? 1 : 0);
        }
        return hashCode;
    }

    public static Title readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Title readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Title readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.vocabularies.vra_core.title.TitleType type = null;
        com.google.common.base.Optional<Boolean> pref = com.google.common.base.Optional.<Boolean> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            text = iprot.readString();
            type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.class);
            if (__list.getSize() > 2) {
                pref = com.google.common.base.Optional.of(iprot.readBool());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Title(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validatePref(pref), NopConstructionValidator.getInstance());
    }

    public static Title readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Title readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String text = null;
        org.dressdiscover.api.vocabularies.vra_core.title.TitleType type = null;
        com.google.common.base.Optional<Boolean> pref = com.google.common.base.Optional.<Boolean> absent();

        try {
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
                        type = iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.class);
                    }
                    break;
                }
                case "pref": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        pref = com.google.common.base.Optional.of(iprot.readBool());
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
        return new Title(DefaultReadValidator.getInstance().validateText(text), DefaultReadValidator.getInstance().validateType(type), DefaultReadValidator.getInstance().validatePref(pref), NopConstructionValidator.getInstance());
    }

    public Title replacePref(final com.google.common.base.Optional<Boolean> pref) {
        return new Title(this.text, this.type, DefaultConstructionValidator.getInstance().validatePref(pref), NopConstructionValidator.getInstance());
    }

    public Title replacePref(final boolean pref) {
        return replacePref(com.google.common.base.Optional.fromNullable(pref));
    }

    public Title replaceText(final String text) {
        return new Title(DefaultConstructionValidator.getInstance().validateText(text), this.type, this.pref, NopConstructionValidator.getInstance());
    }

    public Title replaceType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
        return new Title(this.text, DefaultConstructionValidator.getInstance().validateType(type), this.pref, NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("pref", getPref().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getText());

        oprot.writeEnum(getType());

        if (getPref().isPresent()) {
            oprot.writeBool(getPref().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.title.Title");
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

        if (getPref().isPresent()) {
            oprot.writeFieldBegin("pref", org.thryft.protocol.Type.BOOL, (short)3);
            oprot.writeBool(getPref().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String text;

    private final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type;

    private final com.google.common.base.Optional<Boolean> pref;
}
