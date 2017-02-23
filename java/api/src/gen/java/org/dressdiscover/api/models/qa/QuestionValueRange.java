package org.dressdiscover.api.models.qa;

public final class QuestionValueRange implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            start = 0;
            step = 0;
            stop = 0;
        }

        public Builder(final QuestionValueRange other) {
            this.start = other.getStart();
            this.step = other.getStep();
            this.stop = other.getStop();
        }

        protected QuestionValueRange _build(final int start, final int step, final int stop) {
            return new QuestionValueRange(start, step, stop, DefaultConstructionValidator.getInstance());
        }

        public QuestionValueRange build() {
            return _build(start, step, stop);
        }

        public final int getStart() {
            return start;
        }

        public final int getStep() {
            return step;
        }

        public final int getStop() {
            return stop;
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
                try {
                    start = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.START, e);
                }
                try {
                    step = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STEP, e);
                }
                try {
                    stop = iprot.readI32();
                } catch (final NumberFormatException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STOP, e);
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
                    case "start": {
                        try {
                            start = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.START, e);
                        }
                        break;
                    }
                    case "step": {
                        try {
                            step = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STEP, e);
                        }
                        break;
                    }
                    case "stop": {
                        try {
                            stop = iprot.readI32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STOP, e);
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
            case START: setStart((int)value); return this;
            case STEP: setStep((int)value); return this;
            case STOP: setStop((int)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final QuestionValueRange other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setStart(other.getStart());
            setStep(other.getStep());
            setStop(other.getStop());

            return this;
        }

        public Builder setStart(final int start) {
            this.start = DefaultConstructionValidator.getInstance().validateStart(start);
            return this;
        }

        public Builder setStep(final int step) {
            this.step = DefaultConstructionValidator.getInstance().validateStep(step);
            return this;
        }

        public Builder setStop(final int stop) {
            this.stop = DefaultConstructionValidator.getInstance().validateStop(stop);
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
            case START: return unsetStart();
            case STEP: return unsetStep();
            case STOP: return unsetStop();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetStart() {
            this.start = 0;
            return this;
        }

        public Builder unsetStep() {
            this.step = 0;
            return this;
        }

        public Builder unsetStop() {
            this.stop = 0;
            return this;
        }

        private Integer start;
        private Integer step;
        private Integer stop;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<QuestionValueRange> {
        @Override
        public QuestionValueRange readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return QuestionValueRange.readAs(iprot, type);
        }

        @Override
        public QuestionValueRange readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionValueRange.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public QuestionValueRange readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionValueRange.readAsList(iprot);
        }

        @Override
        public QuestionValueRange readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return QuestionValueRange.readAsStruct(iprot);
        }

        @Override
        public QuestionValueRange readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return QuestionValueRange.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        START("start", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "start", org.thryft.protocol.Type.I32),
        STEP("step", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "step", org.thryft.protocol.Type.I32),
        STOP("stop", new com.google.common.reflect.TypeToken<Integer>() {}, true, 0, "stop", org.thryft.protocol.Type.I32);

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
            case "start": return START;
            case "step": return STEP;
            case "stop": return STOP;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "start": return START;
            case "step": return STEP;
            case "stop": return STOP;
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
        public int validateStart(final int start) throws ExceptionT;

        public int validateStep(final int step) throws ExceptionT;

        public int validateStop(final int stop) throws ExceptionT;
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
        public int validateStart(final int start) throws RuntimeException {
            return start;
        }

        @Override
        public int validateStep(final int step) throws RuntimeException {
            return step;
        }

        @Override
        public int validateStop(final int stop) throws RuntimeException {
            return stop;
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
        public int validateStart(final int start) {
            return start;
        }

        @Override
        public int validateStep(final int step) {
            return step;
        }

        @Override
        public int validateStop(final int stop) {
            return stop;
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
        public int validateStart(final int start) throws org.thryft.protocol.InputProtocolException {
            return start;
        }

        @Override
        public int validateStep(final int step) throws org.thryft.protocol.InputProtocolException {
            return step;
        }

        @Override
        public int validateStop(final int stop) throws org.thryft.protocol.InputProtocolException {
            return stop;
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
        public int validateStart(final int start) {
            return start;
        }

        @Override
        public int validateStep(final int step) {
            return step;
        }

        @Override
        public int validateStop(final int stop) {
            return stop;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public QuestionValueRange(final QuestionValueRange other) {
        this(other.getStart(), other.getStep(), other.getStop(), NopConstructionValidator.getInstance());
    }

    protected QuestionValueRange(final int start, final int step, final int stop, ConstructionValidator validator) {
        this.start = validator.validateStart(start);
        this.step = validator.validateStep(step);
        this.stop = validator.validateStop(stop);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final QuestionValueRange other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<QuestionValueRange> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Total boxed factory method
     */
    public static QuestionValueRange create(Integer start, Integer step, Integer stop) {
        return new QuestionValueRange(start, step, stop, DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static QuestionValueRange create(final int start, final int step, final int stop) {
        return new QuestionValueRange(start, step, stop, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof QuestionValueRange)) {
            return false;
        }

        final QuestionValueRange other = (QuestionValueRange)otherObject;

        if (!(getStart() == other.getStart())) {
            return false;
        }

        if (!(getStep() == other.getStep())) {
            return false;
        }

        if (!(getStop() == other.getStop())) {
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
        case START: return getStart();
        case STEP: return getStep();
        case STOP: return getStop();
        default:
            throw new IllegalStateException();
        }
    }

    public final int getStart() {
        return start;
    }

    public final int getStep() {
        return step;
    }

    public final int getStop() {
        return stop;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getStart();
        hashCode = 31 * hashCode + getStep();
        hashCode = 31 * hashCode + getStop();
        return hashCode;
    }

    public static QuestionValueRange readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionValueRange readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static QuestionValueRange readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        int start = 0;
        int step = 0;
        int stop = 0;

        try {
            iprot.readListBegin();
            try {
                start = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.START, e);
            }
            try {
                step = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STEP, e);
            }
            try {
                stop = iprot.readI32();
            } catch (final NumberFormatException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STOP, e);
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new QuestionValueRange(DefaultReadValidator.getInstance().validateStart(start), DefaultReadValidator.getInstance().validateStep(step), DefaultReadValidator.getInstance().validateStop(stop), NopConstructionValidator.getInstance());
    }

    public static QuestionValueRange readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static QuestionValueRange readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        int start = 0;
        int step = 0;
        int stop = 0;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "start": {
                    try {
                        start = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.START, e);
                    }
                    break;
                }
                case "step": {
                    try {
                        step = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STEP, e);
                    }
                    break;
                }
                case "stop": {
                    try {
                        stop = iprot.readI32();
                    } catch (final NumberFormatException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STOP, e);
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
        return new QuestionValueRange(DefaultReadValidator.getInstance().validateStart(start), DefaultReadValidator.getInstance().validateStep(step), DefaultReadValidator.getInstance().validateStop(stop), NopConstructionValidator.getInstance());
    }

    public QuestionValueRange replaceStart(final int start) {
        return new QuestionValueRange(DefaultConstructionValidator.getInstance().validateStart(start), this.step, this.stop, NopConstructionValidator.getInstance());
    }

    public QuestionValueRange replaceStep(final int step) {
        return new QuestionValueRange(this.start, DefaultConstructionValidator.getInstance().validateStep(step), this.stop, NopConstructionValidator.getInstance());
    }

    public QuestionValueRange replaceStop(final int stop) {
        return new QuestionValueRange(this.start, this.step, DefaultConstructionValidator.getInstance().validateStop(stop), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("start", getStart()).add("step", getStep()).add("stop", getStop()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeI32(getStart());

        oprot.writeI32(getStep());

        oprot.writeI32(getStop());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.qa.QuestionValueRange");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("start", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getStart());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("step", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getStep());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("stop", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeI32(getStop());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final int start;

    private final int step;

    private final int stop;
}
