package org.dressdiscover.api.services.worksheet;

public interface WorksheetCommandService {
    public enum FunctionMetadata {
        DELETE_WORKSHEET_STATE("delete_worksheet_state"),
        PUT_WORKSHEET_STATE("put_worksheet_state");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public static class Messages {
        public final static class DeleteWorksheetStateRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    accessionNumber = null;
                }

                public Builder(final DeleteWorksheetStateRequest other) {
                    this.accessionNumber = other.getAccessionNumber();
                }

                protected DeleteWorksheetStateRequest _build(final String accessionNumber) {
                    return new DeleteWorksheetStateRequest(accessionNumber);
                }

                public DeleteWorksheetStateRequest build() {
                    UncheckedValidator.validate(accessionNumber);

                    return _build(accessionNumber);
                }

                public final @javax.annotation.Nullable String getAccessionNumber() {
                    return accessionNumber;
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
                        accessionNumber = iprot.readString();
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
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setAccessionNumber(final String accessionNumber) {
                    UncheckedValidator.validateAccessionNumber(accessionNumber);
                    this.accessionNumber = accessionNumber;
                    return this;
                }

                public Builder setIfPresent(final DeleteWorksheetStateRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setAccessionNumber(other.getAccessionNumber());

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
                    case ACCESSION_NUMBER: return unsetAccessionNumber();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetAccessionNumber() {
                    this.accessionNumber = null;
                    return this;
                }

                private @javax.annotation.Nullable String accessionNumber;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteWorksheetStateRequest> {
                @Override
                public DeleteWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateRequest.readAs(iprot, type);
                }

                @Override
                public DeleteWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public DeleteWorksheetStateRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateRequest.readAsList(iprot);
                }

                @Override
                public DeleteWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateRequest.readAsStruct(iprot);
                }

                @Override
                public DeleteWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                ACCESSION_NUMBER("accessionNumber", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "accession_number", org.thryft.protocol.Type.STRING);

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
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "accession_number": return ACCESSION_NUMBER;
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
                public static void validate(final String accessionNumber) throws org.thryft.protocol.InputProtocolException {
                    validateAccessionNumber(accessionNumber);
                }

                public static void validateAccessionNumber(final String accessionNumber) throws org.thryft.protocol.InputProtocolException {
                    if (accessionNumber == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, "org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest: accessionNumber is null");
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
                            throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, String.format("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest.accessionNumber: blank '%s' (length=%d)", accessionNumber, __strLen));
                        }
                    }
                    if (accessionNumber.isEmpty()) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ACCESSION_NUMBER, "org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest.accessionNumber: less than min length 1");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final String accessionNumber) {
                    validateAccessionNumber(accessionNumber);
                }

                public static void validateAccessionNumber(final String accessionNumber) {
                    if (accessionNumber == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest: accessionNumber is null");
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
                            throw new IllegalArgumentException(String.format("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest.accessionNumber: blank '%s' (length=%d)", accessionNumber, __strLen));
                        }
                    }
                    if (accessionNumber.isEmpty()) {
                        throw new IllegalArgumentException("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest.accessionNumber: less than min length 1");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public DeleteWorksheetStateRequest(final DeleteWorksheetStateRequest other) {
                this(other.getAccessionNumber());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected DeleteWorksheetStateRequest(final String accessionNumber) {
                this.accessionNumber = accessionNumber;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final DeleteWorksheetStateRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<DeleteWorksheetStateRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static DeleteWorksheetStateRequest create(final String accessionNumber) {
                UncheckedValidator.validate(accessionNumber);
                return new DeleteWorksheetStateRequest(accessionNumber);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteWorksheetStateRequest)) {
                    return false;
                }

                final DeleteWorksheetStateRequest other = (DeleteWorksheetStateRequest)otherObject;

                if (!(getAccessionNumber().equals(other.getAccessionNumber()))) {
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
                default:
                    throw new IllegalStateException();
                }
            }

            public final String getAccessionNumber() {
                return accessionNumber;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getAccessionNumber().hashCode();
                return hashCode;
            }

            public static DeleteWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteWorksheetStateRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                String accessionNumber;

                try {
                    iprot.readListBegin();
                    accessionNumber = iprot.readString();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(accessionNumber);

                return new DeleteWorksheetStateRequest(accessionNumber);
            }

            public static DeleteWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable String accessionNumber = null;

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

                ReadValidator.validate(accessionNumber);

                return new DeleteWorksheetStateRequest(accessionNumber);
            }

            public DeleteWorksheetStateRequest replaceAccessionNumber(final String accessionNumber) {
                UncheckedValidator.validateAccessionNumber(accessionNumber);
                return new DeleteWorksheetStateRequest(accessionNumber);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("accession_number", getAccessionNumber()).toString();
            }

            public void writeAccessionNumberField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.ACCESSION_NUMBER);
                oprot.writeString(getAccessionNumber());
                oprot.writeFieldEnd();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                oprot.writeString(getAccessionNumber());

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeAccessionNumberField(oprot);

                oprot.writeFieldStop();
            }

            private final String accessionNumber;
        }

        public final static class DeleteWorksheetStateResponse implements org.thryft.Struct {
            public final static class Factory implements org.thryft.CompoundType.Factory<DeleteWorksheetStateResponse> {
                @Override
                public DeleteWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateResponse.readAs(iprot, type);
                }

                @Override
                public DeleteWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public DeleteWorksheetStateResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateResponse.readAsList(iprot);
                }

                @Override
                public DeleteWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateResponse.readAsStruct(iprot);
                }

                @Override
                public DeleteWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return DeleteWorksheetStateResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            private DeleteWorksheetStateResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof DeleteWorksheetStateResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            public static DeleteWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static DeleteWorksheetStateResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readListBegin();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            public static DeleteWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static DeleteWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.worksheet.DeleteWorksheetStateResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static DeleteWorksheetStateResponse INSTANCE = new DeleteWorksheetStateResponse();
        }

        public final static class PutWorksheetStateRequest implements org.thryft.Struct {
            public final static class Builder {
                public Builder() {
                    state = null;
                }

                public Builder(final PutWorksheetStateRequest other) {
                    this.state = other.getState();
                }

                protected PutWorksheetStateRequest _build(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                    return new PutWorksheetStateRequest(state);
                }

                public PutWorksheetStateRequest build() {
                    UncheckedValidator.validate(state);

                    return _build(state);
                }

                public final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetState getState() {
                    return state;
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
                        state = org.dressdiscover.api.models.worksheet.WorksheetState.readAsStruct(iprot);
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
                            case "state": {
                                state = org.dressdiscover.api.models.worksheet.WorksheetState.readAsStruct(iprot, unknownFieldCallback);
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
                    case STATE: setState((org.dressdiscover.api.models.worksheet.WorksheetState)value); return this;
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder setIfPresent(final PutWorksheetStateRequest other) {
                    com.google.common.base.Preconditions.checkNotNull(other);

                    setState(other.getState());

                    return this;
                }

                public Builder setState(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                    UncheckedValidator.validateState(state);
                    this.state = state;
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
                    case STATE: return unsetState();
                    default:
                        throw new IllegalStateException();
                    }
                }

                public Builder unsetState() {
                    this.state = null;
                    return this;
                }

                private @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetState state;
            }

            public final static class Factory implements org.thryft.CompoundType.Factory<PutWorksheetStateRequest> {
                @Override
                public PutWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateRequest.readAs(iprot, type);
                }

                @Override
                public PutWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateRequest.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutWorksheetStateRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateRequest.readAsList(iprot);
                }

                @Override
                public PutWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateRequest.readAsStruct(iprot);
                }

                @Override
                public PutWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateRequest.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            @SuppressWarnings("serial")
            public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
                STATE("state", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetState>() {}, true, (short)0, "state", org.thryft.protocol.Type.STRUCT);

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
                    case "state": return STATE;
                    default:
                        throw new IllegalArgumentException(javaName);
                    }
                }

                public static FieldMetadata valueOfThriftName(final String thriftName) {
                    switch (thriftName) {
                    case "state": return STATE;
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
                public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetState state) throws org.thryft.protocol.InputProtocolException {
                    validateState(state);
                }

                public static void validateState(final org.dressdiscover.api.models.worksheet.WorksheetState state) throws org.thryft.protocol.InputProtocolException {
                    if (state == null) {
                        throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STATE, "org.dressdiscover.api.services.worksheet.PutWorksheetStateRequest: state is null");
                    }
                }
            }

            public final static class UncheckedValidator {
                public static void validate(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                    validateState(state);
                }

                public static void validateState(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                    if (state == null) {
                        throw new NullPointerException("org.dressdiscover.api.services.worksheet.PutWorksheetStateRequest: state is null");
                    }
                }
            }

            /**
             * Copy constructor
             */
            public PutWorksheetStateRequest(final PutWorksheetStateRequest other) {
                this(other.getState());
            }

            /**
             * Total constructor
             *
             * All fields should have been validated before calling this.
             */
            protected PutWorksheetStateRequest(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                this.state = state;
            }

            public static Builder builder() {
                return new Builder();
            }

            public static Builder builder(final PutWorksheetStateRequest other) {
                return new Builder(other);
            }

            public static Builder builder(final com.google.common.base.Optional<PutWorksheetStateRequest> other) {
                return other.isPresent() ? new Builder(other.get()) : new Builder();
            }

            /**
             * Optional factory method
             */
            public static PutWorksheetStateRequest create(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                UncheckedValidator.validate(state);
                return new PutWorksheetStateRequest(state);
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutWorksheetStateRequest)) {
                    return false;
                }

                final PutWorksheetStateRequest other = (PutWorksheetStateRequest)otherObject;

                if (!(getState().equals(other.getState()))) {
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
                case STATE: return getState();
                default:
                    throw new IllegalStateException();
                }
            }

            public final org.dressdiscover.api.models.worksheet.WorksheetState getState() {
                return state;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getState().hashCode();
                return hashCode;
            }

            public static PutWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutWorksheetStateRequest readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutWorksheetStateRequest readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                org.dressdiscover.api.models.worksheet.WorksheetState state;

                try {
                    iprot.readListBegin();
                    state = org.dressdiscover.api.models.worksheet.WorksheetState.readAsStruct(iprot);
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                ReadValidator.validate(state);

                return new PutWorksheetStateRequest(state);
            }

            public static PutWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutWorksheetStateRequest readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetState state = null;

                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        switch (ifield.getName()) {
                        case "state": {
                            state = org.dressdiscover.api.models.worksheet.WorksheetState.readAsStruct(iprot, unknownFieldCallback);
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

                ReadValidator.validate(state);

                return new PutWorksheetStateRequest(state);
            }

            public PutWorksheetStateRequest replaceState(final org.dressdiscover.api.models.worksheet.WorksheetState state) {
                UncheckedValidator.validateState(state);
                return new PutWorksheetStateRequest(state);
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("state", getState()).toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 1);

                getState().writeAsStruct(oprot);

                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.worksheet.PutWorksheetStateRequest");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                writeStateField(oprot);

                oprot.writeFieldStop();
            }

            public void writeStateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldBegin(FieldMetadata.STATE);
                getState().writeAsStruct(oprot);
                oprot.writeFieldEnd();
            }

            private final org.dressdiscover.api.models.worksheet.WorksheetState state;
        }

        public final static class PutWorksheetStateResponse implements org.thryft.Struct {
            public final static class Factory implements org.thryft.CompoundType.Factory<PutWorksheetStateResponse> {
                @Override
                public PutWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateResponse.readAs(iprot, type);
                }

                @Override
                public PutWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateResponse.readAs(iprot, type, unknownFieldCallback);
                }

                @Override
                public PutWorksheetStateResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateResponse.readAsList(iprot);
                }

                @Override
                public PutWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateResponse.readAsStruct(iprot);
                }

                @Override
                public PutWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                        final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                    return PutWorksheetStateResponse.readAsStruct(iprot, unknownFieldCallback);
                }
            }

            private PutWorksheetStateResponse() {
            }

            @Override
            public boolean equals(final java.lang.Object otherObject) {
                if (otherObject == this) {
                    return true;
                }
                if (!(otherObject instanceof PutWorksheetStateResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public java.lang.Object get(final String fieldThriftName) {
                throw new IllegalArgumentException(fieldThriftName);
            }

            @Override
            public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
                throw new IllegalArgumentException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            public static PutWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
                return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutWorksheetStateResponse readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                switch (type) {
                case LIST:
                    return readAsList(iprot);
                case STRUCT:
                    return readAsStruct(iprot, unknownFieldCallback);
                default:
                    throw new IllegalArgumentException("cannot read as " + type);
                }
            }

            public static PutWorksheetStateResponse readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readListBegin();
                    iprot.readListEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            public static PutWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
                return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
            }

            public static PutWorksheetStateResponse readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
                try {
                    iprot.readStructBegin();
                    while (true) {
                        final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                        if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                            break;
                        }
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        iprot.readFieldEnd();
                    }
                    iprot.readStructEnd();
                } catch (final RuntimeException e) {
                    throw new IllegalStateException(e);
                }

                return INSTANCE;
            }

            @Override
            public String toString() {
                return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().toString();
            }

            @Override
            public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 0);
                oprot.writeListEnd();
            }

            @Override
            public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeStructBegin("org.dressdiscover.api.services.worksheet.PutWorksheetStateResponse");
                writeFields(oprot);
                oprot.writeStructEnd();
            }

            @Override
            public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
                oprot.writeFieldStop();
            }

            public final static PutWorksheetStateResponse INSTANCE = new PutWorksheetStateResponse();
        }
    }

    public void deleteWorksheetState(final String accessionNumber) throws org.dressdiscover.api.services.IoException;

    public void putWorksheetState(final org.dressdiscover.api.models.worksheet.WorksheetState state) throws org.dressdiscover.api.services.IoException;
}
