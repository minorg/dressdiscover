package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 locationSet element
 */
public final class LocationSet implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.location.Location> {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, LocationSet> {
        public Builder() {
            elements = null;
            display = com.google.common.base.Optional.<String> absent();
            notes = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final LocationSet other) {
            this.elements = other.getElements();
            this.display = other.getDisplay();
            this.notes = other.getNotes();
        }

        protected LocationSet _build(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            return new LocationSet(elements, display, notes);
        }

        public LocationSet build() {
            Validator.validate(elements, display, notes);

            return _build(elements, display, notes);
        }

        public final com.google.common.base.Optional<String> getDisplay() {
            return display;
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> getElements() {
            return elements;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                try {
                    this.setElements((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.Location> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.Location.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
                }
                if (__list.getSize() > 1) {
                    this.setDisplay(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 2) {
                    this.setNotes(com.google.common.base.Optional.of(iprot.readString()));
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
                    case "elements": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                try {
                                    this.setElements((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.Location> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.Location.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ELEMENTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "display": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setDisplay(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "notes": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setNotes(com.google.common.base.Optional.of(iprot.readString()));
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case ELEMENTS: setElements((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location>)value); return this;
            case DISPLAY: setDisplay((String)value); return this;
            case NOTES: setNotes((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDisplay(final com.google.common.base.Optional<String> display) {
            Validator.validateDisplay(display);
            this.display = display;
            return this;
        }

        public Builder setDisplay(final @javax.annotation.Nullable String display) {
            return setDisplay(com.google.common.base.Optional.fromNullable(display));
        }

        public Builder setElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements) {
            Validator.validateElements(elements);
            this.elements = elements;
            return this;
        }

        public Builder setIfPresent(final LocationSet other) {
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
            Validator.validateNotes(notes);
            this.notes = notes;
            return this;
        }

        public Builder setNotes(final @javax.annotation.Nullable String notes) {
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

        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements;
        private com.google.common.base.Optional<String> display;
        private com.google.common.base.Optional<String> notes;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<LocationSet> {
        @Override
        public LocationSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationSet.readAsList(iprot);
        }

        @Override
        public LocationSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return LocationSet.readAsStruct(iprot);
        }

        @Override
        public LocationSet readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return LocationSet.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ELEMENTS("elements", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location>>() {}, true, (short)1, "elements", "1:elements", org.thryft.protocol.Type.LIST),
        DISPLAY("display", new com.google.common.reflect.TypeToken<String>() {}, false, (short)2, "display", "2:display", org.thryft.protocol.Type.STRING),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, (short)3, "notes", "3:notes", org.thryft.protocol.Type.STRING);

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
        public static void validate(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            validateElements(elements);
            validateDisplay(display);
            validateNotes(notes);
        }

        public static void validateElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements) {
            if (elements == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: elements is missing");
            }
            if (elements.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: elements: less than min length 1");
            }
        }

        public static void validateDisplay(final com.google.common.base.Optional<String> display) {
            if (display == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: display is missing");
            }
            if (display.isPresent()) {
                if (display.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: display: less than min length 1");
                }
            }
        }

        public static void validateNotes(final com.google.common.base.Optional<String> notes) {
            if (notes == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: notes is missing");
            }
            if (notes.isPresent()) {
                if (notes.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet: notes: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public LocationSet(final LocationSet other) {
        this(other.getElements(), other.getDisplay(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public LocationSet(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements) {
        this(elements, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent());
    }

    /**
     * Total constructor
     */
    public LocationSet(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
        Validator.validate(elements, display, notes);
        this.elements = elements;
        this.display = display;
        this.notes = notes;
    }

    /**
     * Total Nullable constructor
     */
    public LocationSet(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements, @javax.annotation.Nullable final String display, @javax.annotation.Nullable final String notes) {
        this(elements, com.google.common.base.Optional.fromNullable(display), com.google.common.base.Optional.fromNullable(notes));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final LocationSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<LocationSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof LocationSet)) {
            return false;
        }

        final LocationSet other = (LocationSet)otherObject;

        if (!(getElements().equals(other.getElements()))) {
            return false;
        }

        if (!(((getDisplay().isPresent() && other.getDisplay().isPresent()) ? (getDisplay().get().equals(other.getDisplay().get())) : (!getDisplay().isPresent() && !other.getDisplay().isPresent())))) {
            return false;
        }

        if (!(((getNotes().isPresent() && other.getNotes().isPresent()) ? (getNotes().get().equals(other.getNotes().get())) : (!getNotes().isPresent() && !other.getNotes().isPresent())))) {
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

    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> getElements() {
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

    public static LocationSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static LocationSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static LocationSet readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public LocationSet replaceDisplay(final com.google.common.base.Optional<String> display) {
        Validator.validateDisplay(display);
        return new LocationSet(this.elements, display, this.notes);
    }

    public LocationSet replaceDisplay(@javax.annotation.Nullable final String display) {
        return replaceDisplay(com.google.common.base.Optional.fromNullable(display));
    }

    public LocationSet replaceElements(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements) {
        Validator.validateElements(elements);
        return new LocationSet(elements, this.display, this.notes);
    }

    public LocationSet replaceNotes(final com.google.common.base.Optional<String> notes) {
        Validator.validateNotes(notes);
        return new LocationSet(this.elements, this.display, notes);
    }

    public LocationSet replaceNotes(@javax.annotation.Nullable final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("elements", getElements()).add("display", getDisplay().orNull()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.location.LocationSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeDisplayField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDisplay().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DISPLAY);
            oprot.writeString(getDisplay().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeElementsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ELEMENTS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getElements().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.location.Location _iter0 : getElements()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getElements().size());
        for (final org.dressdiscover.api.vocabularies.vra_core.location.Location _iter0 : getElements()) {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeElementsField(oprot);

        writeDisplayField(oprot);

        writeNotesField(oprot);

        oprot.writeFieldStop();
    }

    public void writeNotesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getNotes().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.NOTES);
            oprot.writeString(getNotes().get());
            oprot.writeFieldEnd();
        }
    }

    private final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.Location> elements;

    private final com.google.common.base.Optional<String> display;

    private final com.google.common.base.Optional<String> notes;
}
