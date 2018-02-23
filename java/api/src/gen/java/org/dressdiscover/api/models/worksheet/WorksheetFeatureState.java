package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureState implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            selectedValues = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            text = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final WorksheetFeatureState other) {
            this.selectedValues = other.getSelectedValues();
            this.text = other.getText();
        }

        protected WorksheetFeatureState _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues, final com.google.common.base.Optional<String> text) {
            return new WorksheetFeatureState(selectedValues, text);
        }

        public WorksheetFeatureState build() {
            UncheckedValidator.validate(selectedValues, text);

            return _build(selectedValues, text);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSelectedValues() {
            return selectedValues;
        }

        public final com.google.common.base.Optional<String> getText() {
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        selectedValues = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    text = com.google.common.base.Optional.of(iprot.readString());
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
                    case "selected_values": {
                        try {
                            selectedValues = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, e.getCause());
                        }
                        break;
                    }
                    case "text": {
                        text = com.google.common.base.Optional.of(iprot.readString());
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case SELECTED_VALUES: setSelectedValues((com.google.common.collect.ImmutableList<String>)value); return this;
            case TEXT: setText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final WorksheetFeatureState other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getSelectedValues().isPresent()) {
                setSelectedValues(other.getSelectedValues());
            }
            if (other.getText().isPresent()) {
                setText(other.getText());
            }

            return this;
        }

        public Builder setSelectedValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues) {
            UncheckedValidator.validateSelectedValues(selectedValues);
            this.selectedValues = selectedValues;
            return this;
        }

        public Builder setSelectedValues(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> selectedValues) {
            return setSelectedValues(com.google.common.base.Optional.fromNullable(selectedValues));
        }

        public Builder setText(final com.google.common.base.Optional<String> text) {
            UncheckedValidator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder setText(final @javax.annotation.Nullable String text) {
            return setText(com.google.common.base.Optional.fromNullable(text));
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
            case SELECTED_VALUES: return unsetSelectedValues();
            case TEXT: return unsetText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetSelectedValues() {
            this.selectedValues = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetText() {
            this.text = com.google.common.base.Optional.<String> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues;
        private com.google.common.base.Optional<String> text;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureState> {
        @Override
        public WorksheetFeatureState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureState.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureState.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureState.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureState.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureState readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureState.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        SELECTED_VALUES("selectedValues", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "selected_values", org.thryft.protocol.Type.LIST),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "text", org.thryft.protocol.Type.STRING);

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
            case "selectedValues": return SELECTED_VALUES;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "selected_values": return SELECTED_VALUES;
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
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues, final com.google.common.base.Optional<String> text) throws org.thryft.protocol.InputProtocolException {
            validateSelectedValues(selectedValues);
            validateText(text);
        }

        public static void validateSelectedValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues) throws org.thryft.protocol.InputProtocolException {
            if (selectedValues == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureState: selectedValues is null");
            }
            if (!selectedValues.isPresent()) {
                return;
            }
            if (selectedValues.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: less than min length 1");
            }
            for (final String __element0 : selectedValues.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: element: less than min length 1");
                }
            }
        }

        public static void validateText(final com.google.common.base.Optional<String> text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.worksheet.WorksheetFeatureState: text is null");
            }
            if (!text.isPresent()) {
                return;
            }
            {
                final int __strLen = text.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.text: blank '%s' (length=%d)", text.get(), __strLen));
                }
            }
            if (text.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "org.dressdiscover.api.models.worksheet.WorksheetFeatureState.text: less than min length 1");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues, final com.google.common.base.Optional<String> text) {
            validateSelectedValues(selectedValues);
            validateText(text);
        }

        public static void validateSelectedValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues) {
            if (selectedValues == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureState: selectedValues is null");
            }
            if (!selectedValues.isPresent()) {
                return;
            }
            if (selectedValues.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: less than min length 1");
            }
            for (final String __element0 : selectedValues.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.selectedValues: element: less than min length 1");
                }
            }
        }

        public static void validateText(final com.google.common.base.Optional<String> text) {
            if (text == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureState: text is null");
            }
            if (!text.isPresent()) {
                return;
            }
            {
                final int __strLen = text.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.text: blank '%s' (length=%d)", text.get(), __strLen));
                }
            }
            if (text.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureState.text: less than min length 1");
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public WorksheetFeatureState() {
        selectedValues = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        text = com.google.common.base.Optional.<String> absent();
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureState(final WorksheetFeatureState other) {
        this(other.getSelectedValues(), other.getText());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureState(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues, final com.google.common.base.Optional<String> text) {
        this.selectedValues = selectedValues;
        this.text = text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureState other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureState> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static WorksheetFeatureState create() {
        return new WorksheetFeatureState();
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureState create(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> selectedValues, @javax.annotation.Nullable final String text) {
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValuesOptional = com.google.common.base.Optional.fromNullable(selectedValues);
        final com.google.common.base.Optional<String> textOptional = com.google.common.base.Optional.fromNullable(text);
        UncheckedValidator.validate(selectedValuesOptional, textOptional);
        return new WorksheetFeatureState(selectedValuesOptional, textOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureState create(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues, final com.google.common.base.Optional<String> text) {
        UncheckedValidator.validate(selectedValues, text);
        return new WorksheetFeatureState(selectedValues, text);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureState)) {
            return false;
        }

        final WorksheetFeatureState other = (WorksheetFeatureState)otherObject;

        if (!(((getSelectedValues().isPresent() && other.getSelectedValues().isPresent()) ? (getSelectedValues().get().equals(other.getSelectedValues().get())) : (!getSelectedValues().isPresent() && !other.getSelectedValues().isPresent())))) {
            return false;
        }

        if (!(((getText().isPresent() && other.getText().isPresent()) ? (getText().get().equals(other.getText().get())) : (!getText().isPresent() && !other.getText().isPresent())))) {
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
        case SELECTED_VALUES: return getSelectedValues();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSelectedValues() {
        return selectedValues;
    }

    public final com.google.common.base.Optional<String> getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getSelectedValues().isPresent()) {
            hashCode = 31 * hashCode + getSelectedValues().get().hashCode();
        }
        if (getText().isPresent()) {
            hashCode = 31 * hashCode + getText().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetFeatureState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    selectedValues = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, e.getCause());
                }
            }
            if (__list.getSize() > 1) {
                text = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(selectedValues, text);

        return new WorksheetFeatureState(selectedValues, text);
    }

    public static WorksheetFeatureState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureState readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> text = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "selected_values": {
                    try {
                        selectedValues = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SELECTED_VALUES, e.getCause());
                    }
                    break;
                }
                case "text": {
                    text = com.google.common.base.Optional.of(iprot.readString());
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

        ReadValidator.validate(selectedValues, text);

        return new WorksheetFeatureState(selectedValues, text);
    }

    public WorksheetFeatureState replaceSelectedValues(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues) {
        UncheckedValidator.validateSelectedValues(selectedValues);
        return new WorksheetFeatureState(selectedValues, this.text);
    }

    public WorksheetFeatureState replaceSelectedValues(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> selectedValues) {
        return replaceSelectedValues(com.google.common.base.Optional.fromNullable(selectedValues));
    }

    public WorksheetFeatureState replaceText(final com.google.common.base.Optional<String> text) {
        UncheckedValidator.validateText(text);
        return new WorksheetFeatureState(this.selectedValues, text);
    }

    public WorksheetFeatureState replaceText(@javax.annotation.Nullable final String text) {
        return replaceText(com.google.common.base.Optional.fromNullable(text));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("selected_values", getSelectedValues().orNull()).add("text", getText().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        if (getSelectedValues().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSelectedValues().get().size());
            for (final String _iter0 : getSelectedValues().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getText().isPresent()) {
            oprot.writeString(getText().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureState");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeSelectedValuesField(oprot);

        writeTextField(oprot);

        oprot.writeFieldStop();
    }

    public void writeSelectedValuesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSelectedValues().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SELECTED_VALUES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSelectedValues().get().size());
            for (final String _iter0 : getSelectedValues().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getText().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TEXT);
            oprot.writeString(getText().get());
            oprot.writeFieldEnd();
        }
    }

    public final static WorksheetFeatureState EMPTY = new WorksheetFeatureState();

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> selectedValues;

    private final com.google.common.base.Optional<String> text;
}