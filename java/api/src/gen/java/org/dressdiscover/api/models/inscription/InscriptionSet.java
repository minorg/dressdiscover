package org.dressdiscover.api.models.inscription;

/**
 * VRA Core 4.0 inscriptionSet element
 */
public final class InscriptionSet implements org.thryft.Struct, org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.inscription.Inscription> {
    public final static class Builder {
        public Builder() {
            elements = null;
            display = com.google.common.base.Optional.<String> absent();
            notes = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final InscriptionSet other) {
            this.elements = other.getElements();
            this.display = other.getDisplay();
            this.notes = other.getNotes();
        }

        protected InscriptionSet _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            return new InscriptionSet(elements, display, notes, DefaultConstructionValidator.getInstance());
        }

        public InscriptionSet build() {
            return _build(elements, display, notes);
        }

        public final com.google.common.base.Optional<String> getDisplay() {
            return display;
        }

        public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> getElements() {
            return elements;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
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
                try {
                    elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.Inscription> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.inscription.Inscription.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
                }
                if (__list.getSize() > 1) {
                    display = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    notes = com.google.common.base.Optional.of(iprot.readString());
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
                    case "elements": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.Inscription> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.inscription.Inscription.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot);
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "display": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            display = com.google.common.base.Optional.of(iprot.readString());
                        }
                        break;
                    }
                    case "notes": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            notes = com.google.common.base.Optional.of(iprot.readString());
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case ELEMENTS: setElements((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>)value); return this;
            case DISPLAY: setDisplay((String)value); return this;
            case NOTES: setNotes((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDisplay(final com.google.common.base.Optional<String> display) {
            this.display = DefaultConstructionValidator.getInstance().validateDisplay(display);
            return this;
        }

        public Builder setDisplay(@javax.annotation.Nullable final String display) {
            return setDisplay(com.google.common.base.Optional.fromNullable(display));
        }

        public Builder setElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) {
            this.elements = DefaultConstructionValidator.getInstance().validateElements(elements);
            return this;
        }

        public Builder setIfPresent(final InscriptionSet other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setElements(other.getElements());
            if (other.getDisplay().isPresent()) {
                setDisplay(other.getDisplay());
            }
            if (other.getNotes().isPresent()) {
                setNotes(other.getNotes());
            }

            return this;
        }

        public Builder setNotes(final com.google.common.base.Optional<String> notes) {
            this.notes = DefaultConstructionValidator.getInstance().validateNotes(notes);
            return this;
        }

        public Builder setNotes(@javax.annotation.Nullable final String notes) {
            return setNotes(com.google.common.base.Optional.fromNullable(notes));
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
            case ELEMENTS: return unsetElements();
            case DISPLAY: return unsetDisplay();
            case NOTES: return unsetNotes();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDisplay() {
            this.display = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetElements() {
            this.elements = null;
            return this;
        }

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.<String> absent();
            return this;
        }

        private com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements;
        private com.google.common.base.Optional<String> display;
        private com.google.common.base.Optional<String> notes;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<InscriptionSet> {
        @Override
        public InscriptionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return InscriptionSet.readAs(iprot, type);
        }

        @Override
        public InscriptionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InscriptionSet.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public InscriptionSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InscriptionSet.readAsList(iprot);
        }

        @Override
        public InscriptionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return InscriptionSet.readAsStruct(iprot);
        }

        @Override
        public InscriptionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return InscriptionSet.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ELEMENTS("elements", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>>() {}, true, 1, "elements", org.thryft.protocol.Type.LIST),
        DISPLAY("display", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "display", org.thryft.protocol.Type.STRING),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "notes", org.thryft.protocol.Type.STRING);

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
            case "elements": return ELEMENTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "elements": return ELEMENTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) throws ExceptionT;

        public com.google.common.base.Optional<String> validateDisplay(final com.google.common.base.Optional<String> display) throws ExceptionT;

        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws ExceptionT;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) throws RuntimeException {
            if (elements == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.InscriptionSet: elements is null");
            }
            if (elements.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.inscription.InscriptionSet: elements is less than min length 1");
            }
            return elements;
        }

        @Override
        public com.google.common.base.Optional<String> validateDisplay(final com.google.common.base.Optional<String> display) throws RuntimeException {
            if (display == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.InscriptionSet: display is null");
            }
            if (!display.isPresent()) {
                return display;
            }
            if (display.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.inscription.InscriptionSet: display is less than min length 1");
            }
            return display;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws RuntimeException {
            if (notes == null) {
                throw new NullPointerException("org.dressdiscover.api.models.inscription.InscriptionSet: notes is null");
            }
            if (!notes.isPresent()) {
                return notes;
            }
            if (notes.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.inscription.InscriptionSet: notes is less than min length 1");
            }
            return notes;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) {
            return elements;
        }

        @Override
        public com.google.common.base.Optional<String> validateDisplay(final com.google.common.base.Optional<String> display) {
            return display;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) {
            return notes;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) throws org.thryft.protocol.InputProtocolException {
            if (elements == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ELEMENTS, "org.dressdiscover.api.models.inscription.InscriptionSet: elements is null");
            }
            if (elements.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, "org.dressdiscover.api.models.inscription.InscriptionSet: elements is less than min length 1");
            }
            return elements;
        }

        @Override
        public com.google.common.base.Optional<String> validateDisplay(final com.google.common.base.Optional<String> display) throws org.thryft.protocol.InputProtocolException {
            if (display == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DISPLAY, "org.dressdiscover.api.models.inscription.InscriptionSet: display is null");
            }
            if (!display.isPresent()) {
                return display;
            }
            if (display.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY, "org.dressdiscover.api.models.inscription.InscriptionSet: display is less than min length 1");
            }
            return display;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) throws org.thryft.protocol.InputProtocolException {
            if (notes == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NOTES, "org.dressdiscover.api.models.inscription.InscriptionSet: notes is null");
            }
            if (!notes.isPresent()) {
                return notes;
            }
            if (notes.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NOTES, "org.dressdiscover.api.models.inscription.InscriptionSet: notes is less than min length 1");
            }
            return notes;
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
        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) {
            return elements;
        }

        @Override
        public com.google.common.base.Optional<String> validateDisplay(final com.google.common.base.Optional<String> display) {
            return display;
        }

        @Override
        public com.google.common.base.Optional<String> validateNotes(final com.google.common.base.Optional<String> notes) {
            return notes;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public InscriptionSet(final InscriptionSet other) {
        this(other.getElements(), other.getDisplay(), other.getNotes(), NopConstructionValidator.getInstance());
    }

    protected InscriptionSet(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes, ConstructionValidator validator) {
        this.elements = validator.validateElements(elements);
        this.display = validator.validateDisplay(display);
        this.notes = validator.validateNotes(notes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final InscriptionSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<InscriptionSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static InscriptionSet create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) {
        return new InscriptionSet(elements, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static InscriptionSet create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements, final @javax.annotation.Nullable String display, final @javax.annotation.Nullable String notes) {
        return new InscriptionSet(elements, com.google.common.base.Optional.fromNullable(display), com.google.common.base.Optional.fromNullable(notes), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static InscriptionSet create(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
        return new InscriptionSet(elements, display, notes, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionSet)) {
            return false;
        }

        final InscriptionSet other = (InscriptionSet)otherObject;
        return
            getElements().equals(other.getElements()) &&
            ((getDisplay().isPresent() && other.getDisplay().isPresent()) ? (getDisplay().get().equals(other.getDisplay().get())) : (!getDisplay().isPresent() && !other.getDisplay().isPresent())) &&
            ((getNotes().isPresent() && other.getNotes().isPresent()) ? (getNotes().get().equals(other.getNotes().get())) : (!getNotes().isPresent() && !other.getNotes().isPresent()));
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
        case ELEMENTS: return getElements();
        case DISPLAY: return getDisplay();
        case NOTES: return getNotes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDisplay() {
        return display;
    }

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> getElements() {
        return elements;
    }

    public final com.google.common.base.Optional<String> getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getElements().hashCode();
        if (getDisplay().isPresent()) {
            hashCode = 31 * hashCode + getDisplay().get().hashCode();
        }
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        return hashCode;
    }

    public static InscriptionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InscriptionSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static InscriptionSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.Inscription> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(org.dressdiscover.api.models.inscription.Inscription.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
            }
            if (__list.getSize() > 1) {
                display = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                notes = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new InscriptionSet(DefaultReadValidator.getInstance().validateElements(elements), DefaultReadValidator.getInstance().validateDisplay(display), DefaultReadValidator.getInstance().validateNotes(notes), NopConstructionValidator.getInstance());
    }

    public static InscriptionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static InscriptionSet readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.<String> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "elements": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.inscription.Inscription> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.inscription.Inscription.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
                        }
                    }
                    break;
                }
                case "display": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        display = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "notes": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        notes = com.google.common.base.Optional.of(iprot.readString());
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
        return new InscriptionSet(DefaultReadValidator.getInstance().validateElements(elements), DefaultReadValidator.getInstance().validateDisplay(display), DefaultReadValidator.getInstance().validateNotes(notes), NopConstructionValidator.getInstance());
    }

    public InscriptionSet replaceDisplay(final com.google.common.base.Optional<String> display) {
        return new InscriptionSet(this.elements, DefaultConstructionValidator.getInstance().validateDisplay(display), this.notes, NopConstructionValidator.getInstance());
    }

    public InscriptionSet replaceDisplay(final String display) {
        return replaceDisplay(com.google.common.base.Optional.fromNullable(display));
    }

    public InscriptionSet replaceElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements) {
        return new InscriptionSet(DefaultConstructionValidator.getInstance().validateElements(elements), this.display, this.notes, NopConstructionValidator.getInstance());
    }

    public InscriptionSet replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new InscriptionSet(this.elements, this.display, DefaultConstructionValidator.getInstance().validateNotes(notes), NopConstructionValidator.getInstance());
    }

    public InscriptionSet replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("elements", getElements()).add("display", getDisplay().orNull()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getElements().size());
        for (final org.dressdiscover.api.models.inscription.Inscription _iter0 : getElements()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        if (getDisplay().isPresent()) {
            oprot.writeString(getDisplay().get());
        } else {
            oprot.writeNull();
        }

        if (getNotes().isPresent()) {
            oprot.writeString(getNotes().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.inscription.InscriptionSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("elements", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getElements().size());
        for (final org.dressdiscover.api.models.inscription.Inscription _iter0 : getElements()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        if (getDisplay().isPresent()) {
            oprot.writeFieldBegin("display", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getDisplay().get());
            oprot.writeFieldEnd();
        }

        if (getNotes().isPresent()) {
            oprot.writeFieldBegin("notes", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.inscription.Inscription> elements;

    private final com.google.common.base.Optional<String> display;

    private final com.google.common.base.Optional<String> notes;
}
