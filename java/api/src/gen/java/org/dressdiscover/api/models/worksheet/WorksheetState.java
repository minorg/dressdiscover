package org.dressdiscover.api.models.worksheet;

public final class WorksheetState implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            accessionNumber = null;
            rootFeatureSet = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent();
        }

        public Builder(final WorksheetState other) {
            this.accessionNumber = other.getAccessionNumber();
            this.rootFeatureSet = other.getRootFeatureSet();
        }

        protected WorksheetState _build(final String accessionNumber, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
            return new WorksheetState(accessionNumber, rootFeatureSet);
        }

        public WorksheetState build() {
            UncheckedValidator.validate(accessionNumber, rootFeatureSet);

            return _build(accessionNumber, rootFeatureSet);
        }

        public final @javax.annotation.Nullable String getAccessionNumber() {
            return accessionNumber;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> getRootFeatureSet() {
            return rootFeatureSet;
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
                accessionNumber = iprot.readString();
                if (__list.getSize() > 1) {
                    rootFeatureSet = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState.readAsStruct(iprot));
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
                    case "accession_number": {
                        accessionNumber = iprot.readString();
                        break;
                    }
                    case "root_feature_set": {
                        rootFeatureSet = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState.readAsStruct(iprot, unknownFieldCallback));
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
            case ACCESSION_NUMBER: setAccessionNumber((String)value); return this;
            case ROOT_FEATURE_SET: setRootFeatureSet((org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAccessionNumber(final String accessionNumber) {
            UncheckedValidator.validateAccessionNumber(accessionNumber);
            this.accessionNumber = accessionNumber;
            return this;
        }

        public Builder setIfPresent(final WorksheetState other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setAccessionNumber(other.getAccessionNumber());
            if (other.getRootFeatureSet().isPresent()) {
                setRootFeatureSet(other.getRootFeatureSet());
            }

            return this;
        }

        public Builder setRootFeatureSet(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
            UncheckedValidator.validateRootFeatureSet(rootFeatureSet);
            this.rootFeatureSet = rootFeatureSet;
            return this;
        }

        public Builder setRootFeatureSet(final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState rootFeatureSet) {
            return setRootFeatureSet(com.google.common.base.Optional.fromNullable(rootFeatureSet));
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
            case ACCESSION_NUMBER: return unsetAccessionNumber();
            case ROOT_FEATURE_SET: return unsetRootFeatureSet();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAccessionNumber() {
            this.accessionNumber = null;
            return this;
        }

        public Builder unsetRootFeatureSet() {
            this.rootFeatureSet = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent();
            return this;
        }

        private @javax.annotation.Nullable String accessionNumber;
        private com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetState> {
        @Override
        public WorksheetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetState.readAs(iprot, type);
        }

        @Override
        public WorksheetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetState.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetState.readAsList(iprot);
        }

        @Override
        public WorksheetState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetState.readAsStruct(iprot);
        }

        @Override
        public WorksheetState readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetState.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ACCESSION_NUMBER("accessionNumber", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "accession_number", org.thryft.protocol.Type.STRING),
        ROOT_FEATURE_SET("rootFeatureSet", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState>() {}, false, (short)0, "root_feature_set", org.thryft.protocol.Type.STRUCT);

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
            case "accessionNumber": return ACCESSION_NUMBER;
            case "rootFeatureSet": return ROOT_FEATURE_SET;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "accession_number": return ACCESSION_NUMBER;
            case "root_feature_set": return ROOT_FEATURE_SET;
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
        public static void validate(final String accessionNumber, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) throws org.thryft.protocol.InputProtocolException {
            validateAccessionNumber(accessionNumber);
            validateRootFeatureSet(rootFeatureSet);
        }

        public static void validateAccessionNumber(final String accessionNumber) throws org.thryft.protocol.InputProtocolException {
            if (accessionNumber == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, "org.dressdiscover.api.models.worksheet.WorksheetState: accessionNumber is null");
            }
            {
                final int __strLen = accessionNumber.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(accessionNumber.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, String.format("org.dressdiscover.api.models.worksheet.WorksheetState.accessionNumber: blank '%s' (length=%d)", accessionNumber, __strLen));
                }
            }
            if (accessionNumber.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, "org.dressdiscover.api.models.worksheet.WorksheetState.accessionNumber: less than min length 1");
            }
        }

        public static void validateRootFeatureSet(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) throws org.thryft.protocol.InputProtocolException {
            if (rootFeatureSet == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ROOT_FEATURE_SET, "org.dressdiscover.api.models.worksheet.WorksheetState: rootFeatureSet is null");
            }
            if (!rootFeatureSet.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String accessionNumber, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
            validateAccessionNumber(accessionNumber);
            validateRootFeatureSet(rootFeatureSet);
        }

        public static void validateAccessionNumber(final String accessionNumber) {
            if (accessionNumber == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetState: accessionNumber is null");
            }
            {
                final int __strLen = accessionNumber.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(accessionNumber.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetState.accessionNumber: blank '%s' (length=%d)", accessionNumber, __strLen));
                }
            }
            if (accessionNumber.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetState.accessionNumber: less than min length 1");
            }
        }

        public static void validateRootFeatureSet(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
            if (rootFeatureSet == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetState: rootFeatureSet is null");
            }
            if (!rootFeatureSet.isPresent()) {
                return;
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetState(final WorksheetState other) {
        this(other.getAccessionNumber(), other.getRootFeatureSet());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetState(final String accessionNumber, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
        this.accessionNumber = accessionNumber;
        this.rootFeatureSet = rootFeatureSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetState other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetState> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static WorksheetState create(final String accessionNumber) {
        UncheckedValidator.validate(accessionNumber, com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent());
        return new WorksheetState(accessionNumber, com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetState create(final String accessionNumber, @javax.annotation.Nullable final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState rootFeatureSet) {
        final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSetOptional = com.google.common.base.Optional.fromNullable(rootFeatureSet);
        UncheckedValidator.validate(accessionNumber, rootFeatureSetOptional);
        return new WorksheetState(accessionNumber, rootFeatureSetOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetState create(final String accessionNumber, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
        UncheckedValidator.validate(accessionNumber, rootFeatureSet);
        return new WorksheetState(accessionNumber, rootFeatureSet);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetState)) {
            return false;
        }

        final WorksheetState other = (WorksheetState)otherObject;

        if (!(getAccessionNumber().equals(other.getAccessionNumber()))) {
            return false;
        }

        if (!(((getRootFeatureSet().isPresent() && other.getRootFeatureSet().isPresent()) ? (getRootFeatureSet().get().equals(other.getRootFeatureSet().get())) : (!getRootFeatureSet().isPresent() && !other.getRootFeatureSet().isPresent())))) {
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
        case ACCESSION_NUMBER: return getAccessionNumber();
        case ROOT_FEATURE_SET: return getRootFeatureSet();
        default:
            throw new IllegalStateException();
        }
    }

    public final String getAccessionNumber() {
        return accessionNumber;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> getRootFeatureSet() {
        return rootFeatureSet;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAccessionNumber().hashCode();
        if (getRootFeatureSet().isPresent()) {
            hashCode = 31 * hashCode + getRootFeatureSet().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetState readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetState readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String accessionNumber;
        com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            accessionNumber = iprot.readString();
            if (__list.getSize() > 1) {
                rootFeatureSet = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(accessionNumber, rootFeatureSet);

        return new WorksheetState(accessionNumber, rootFeatureSet);
    }

    public static WorksheetState readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetState readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String accessionNumber = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "accession_number": {
                    accessionNumber = iprot.readString();
                    break;
                }
                case "root_feature_set": {
                    rootFeatureSet = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(accessionNumber, rootFeatureSet);

        return new WorksheetState(accessionNumber, rootFeatureSet);
    }

    public WorksheetState replaceAccessionNumber(final String accessionNumber) {
        UncheckedValidator.validateAccessionNumber(accessionNumber);
        return new WorksheetState(accessionNumber, this.rootFeatureSet);
    }

    public WorksheetState replaceRootFeatureSet(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet) {
        UncheckedValidator.validateRootFeatureSet(rootFeatureSet);
        return new WorksheetState(this.accessionNumber, rootFeatureSet);
    }

    public WorksheetState replaceRootFeatureSet(@javax.annotation.Nullable final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState rootFeatureSet) {
        return replaceRootFeatureSet(com.google.common.base.Optional.fromNullable(rootFeatureSet));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("accession_number", getAccessionNumber()).add("root_feature_set", getRootFeatureSet().orNull()).toString();
    }

    public void writeAccessionNumberField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ACCESSION_NUMBER);
        oprot.writeString(getAccessionNumber());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getAccessionNumber());

        if (getRootFeatureSet().isPresent()) {
            getRootFeatureSet().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetState");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeAccessionNumberField(oprot);

        writeRootFeatureSetField(oprot);

        oprot.writeFieldStop();
    }

    public void writeRootFeatureSetField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRootFeatureSet().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ROOT_FEATURE_SET);
            getRootFeatureSet().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    private final String accessionNumber;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetState> rootFeatureSet;
}
