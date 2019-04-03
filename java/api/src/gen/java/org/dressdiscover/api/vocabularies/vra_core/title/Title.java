package org.dressdiscover.api.vocabularies.vra_core.title;

/**
 * VRA Core 4.0 title element
 */
public final class Title implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Title> {
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
            return new Title(text, type, pref);
        }

        public Title build() {
            Validator.validate(text, type, pref);

            return _build(text, type, pref);
        }

        public final com.google.common.base.Optional<Boolean> getPref() {
            return pref;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.title.TitleType getType() {
            return type;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setText(iprot.readString());
                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.Factory.getInstance()));
                if (__list.getSize() > 2) {
                    this.setPref(org.thryft.Optionals.of(iprot.readBool()));
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
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setText(iprot.readString());
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setType(iprot.readEnum(org.dressdiscover.api.vocabularies.vra_core.title.TitleType.Factory.getInstance()));
                        }
                        break;
                    }
                    case "pref": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setPref(org.thryft.Optionals.of(iprot.readBool()));
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
            Validator.validatePref(pref);
            this.pref = pref;
            return this;
        }

        public Builder setPref(final @javax.annotation.Nullable Boolean pref) {
            return setPref(org.thryft.Optionals.fromNullable(pref));
        }

        public Builder setPref(final boolean pref) {
            return setPref(org.thryft.Optionals.of(pref));
        }

        public Builder setText(final String text) {
            Validator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
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

        private @javax.annotation.Nullable String text;
        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.title.TitleType type;
        private com.google.common.base.Optional<Boolean> pref;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Title> {
        @Override
        public Title readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsList(iprot);
        }

        @Override
        public Title readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsStruct(iprot);
        }

        @Override
        public Title readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Title.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)1, "text", "1:text", org.thryft.protocol.Type.STRING),
        TYPE("type", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.title.TitleType>() {}, true, (short)2, "type", "2:type", org.thryft.protocol.Type.STRING),
        PREF("pref", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)3, "pref", "3:pref", org.thryft.protocol.Type.BOOL);

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
        public static void validate(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
            validateText(text);
            validateType(type);
            validatePref(pref);
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.title.Title: text is missing");
            }
            if (text.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.title.Title: text: less than min length 1");
            }
        }

        public static void validateType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
            if (type == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.title.Title: type is missing");
            }
        }

        public static void validatePref(final com.google.common.base.Optional<Boolean> pref) {
            if (pref == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.title.Title: pref is missing");
            }
            if (pref.isPresent()) {
                if (!pref.get()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.title.Title: pref: not true");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public Title(final Title other) {
        this(other.getText(), other.getType(), other.getPref());
    }

    /**
     * Required constructor
     */
    public Title(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
        this(text, type, com.google.common.base.Optional.<Boolean> absent());
    }

    /**
     * Total constructor
     */
    public Title(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, final com.google.common.base.Optional<Boolean> pref) {
        Validator.validate(text, type, pref);
        this.text = text;
        this.type = type;
        this.pref = pref;
    }

    /**
     * Total Nullable constructor
     */
    public Title(final String text, final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type, @javax.annotation.Nullable final Boolean pref) {
        this(text, type, org.thryft.Optionals.fromNullable(pref));
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

    public static Title readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Title readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Title readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Title replacePref(final com.google.common.base.Optional<Boolean> pref) {
        Validator.validatePref(pref);
        return new Title(this.text, this.type, pref);
    }

    public Title replacePref(@javax.annotation.Nullable final Boolean pref) {
        return replacePref(org.thryft.Optionals.fromNullable(pref));
    }

    public Title replacePref(final boolean pref) {
        return replacePref(org.thryft.Optionals.of(pref));
    }

    public Title replaceText(final String text) {
        Validator.validateText(text);
        return new Title(text, this.type, this.pref);
    }

    public Title replaceType(final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type) {
        Validator.validateType(type);
        return new Title(this.text, type, this.pref);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("pref", getPref().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.title.Title");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getText());
        oprot.writeEnum(getType());
        if (getPref().isPresent()) {
            oprot.writeBool(getPref().get());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTextField(oprot);

        writeTypeField(oprot);

        writePrefField(oprot);

        oprot.writeFieldStop();
    }

    public void writePrefField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPref().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PREF);
            oprot.writeBool(getPref().get());
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

    private final org.dressdiscover.api.vocabularies.vra_core.title.TitleType type;

    private final com.google.common.base.Optional<Boolean> pref;
}
