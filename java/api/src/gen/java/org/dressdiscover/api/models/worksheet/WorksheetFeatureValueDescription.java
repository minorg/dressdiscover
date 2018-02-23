package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureValueDescription implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            rights = null;
            text = null;
        }

        public Builder(final WorksheetFeatureValueDescription other) {
            this.rights = other.getRights();
            this.text = other.getText();
        }

        protected WorksheetFeatureValueDescription _build(final org.dressdiscover.api.models.worksheet.WorksheetRights rights, final String text) {
            return new WorksheetFeatureValueDescription(rights, text);
        }

        public WorksheetFeatureValueDescription build() {
            UncheckedValidator.validate(rights, text);

            return _build(rights, text);
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetRights getRights() {
            return rights;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
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
                iprot.readListBegin();
                rights = org.dressdiscover.api.models.worksheet.WorksheetRights.readAsStruct(iprot);
                text = iprot.readString();
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
                    case "rights": {
                        rights = org.dressdiscover.api.models.worksheet.WorksheetRights.readAsStruct(iprot, unknownFieldCallback);
                        break;
                    }
                    case "text": {
                        text = iprot.readString();
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
            case RIGHTS: setRights((org.dressdiscover.api.models.worksheet.WorksheetRights)value); return this;
            case TEXT: setText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final WorksheetFeatureValueDescription other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setRights(other.getRights());
            setText(other.getText());

            return this;
        }

        public Builder setRights(final org.dressdiscover.api.models.worksheet.WorksheetRights rights) {
            UncheckedValidator.validateRights(rights);
            this.rights = rights;
            return this;
        }

        public Builder setText(final String text) {
            UncheckedValidator.validateText(text);
            this.text = text;
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
            case RIGHTS: return unsetRights();
            case TEXT: return unsetText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetRights() {
            this.rights = null;
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetRights rights;
        private @javax.annotation.Nullable String text;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureValueDescription> {
        @Override
        public WorksheetFeatureValueDescription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDescription.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureValueDescription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDescription.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureValueDescription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDescription.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureValueDescription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDescription.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureValueDescription readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDescription.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetRights>() {}, true, (short)0, "rights", org.thryft.protocol.Type.STRUCT),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "text", org.thryft.protocol.Type.STRING);

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
            case "rights": return RIGHTS;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "rights": return RIGHTS;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetRights rights, final String text) throws org.thryft.protocol.InputProtocolException {
            validateRights(rights);
            validateText(text);
        }

        public static void validateRights(final org.dressdiscover.api.models.worksheet.WorksheetRights rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription: rights is null");
            }
        }

        public static void validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription: text is null");
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription.text: less than min length 1");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription.text: blank '%s' (length=%d)", text, __strLen));
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetRights rights, final String text) {
            validateRights(rights);
            validateText(text);
        }

        public static void validateRights(final org.dressdiscover.api.models.worksheet.WorksheetRights rights) {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription: rights is null");
            }
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription: text is null");
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription.text: less than min length 1");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription.text: blank '%s' (length=%d)", text, __strLen));
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureValueDescription(final WorksheetFeatureValueDescription other) {
        this(other.getRights(), other.getText());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureValueDescription(final org.dressdiscover.api.models.worksheet.WorksheetRights rights, final String text) {
        this.rights = rights;
        this.text = text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureValueDescription other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureValueDescription> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureValueDescription create(final org.dressdiscover.api.models.worksheet.WorksheetRights rights, final String text) {
        UncheckedValidator.validate(rights, text);
        return new WorksheetFeatureValueDescription(rights, text);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureValueDescription)) {
            return false;
        }

        final WorksheetFeatureValueDescription other = (WorksheetFeatureValueDescription)otherObject;

        if (!(getRights().equals(other.getRights()))) {
            return false;
        }

        if (!(getText().equals(other.getText()))) {
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
        case RIGHTS: return getRights();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.dressdiscover.api.models.worksheet.WorksheetRights getRights() {
        return rights;
    }

    public final String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRights().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        return hashCode;
    }

    public static WorksheetFeatureValueDescription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueDescription readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureValueDescription readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.worksheet.WorksheetRights rights;
        String text;

        try {
            iprot.readListBegin();
            rights = org.dressdiscover.api.models.worksheet.WorksheetRights.readAsStruct(iprot);
            text = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(rights, text);

        return new WorksheetFeatureValueDescription(rights, text);
    }

    public static WorksheetFeatureValueDescription readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueDescription readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetRights rights = null;
        @javax.annotation.Nullable String text = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "rights": {
                    rights = org.dressdiscover.api.models.worksheet.WorksheetRights.readAsStruct(iprot, unknownFieldCallback);
                    break;
                }
                case "text": {
                    text = iprot.readString();
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

        ReadValidator.validate(rights, text);

        return new WorksheetFeatureValueDescription(rights, text);
    }

    public WorksheetFeatureValueDescription replaceRights(final org.dressdiscover.api.models.worksheet.WorksheetRights rights) {
        UncheckedValidator.validateRights(rights);
        return new WorksheetFeatureValueDescription(rights, this.text);
    }

    public WorksheetFeatureValueDescription replaceText(final String text) {
        UncheckedValidator.validateText(text);
        return new WorksheetFeatureValueDescription(this.rights, text);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights", getRights()).add("text", getText()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        getRights().writeAsStruct(oprot);

        oprot.writeString(getText());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDescription");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeRightsField(oprot);

        writeTextField(oprot);

        oprot.writeFieldStop();
    }

    public void writeRightsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.RIGHTS);
        getRights().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    private final org.dressdiscover.api.models.worksheet.WorksheetRights rights;

    private final String text;
}
