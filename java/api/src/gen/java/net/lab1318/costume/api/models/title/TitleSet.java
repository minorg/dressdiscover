package net.lab1318.costume.api.models.title;

/**
 * VRA Core 4.0 titleSet element
 */
public class TitleSet implements org.thryft.Struct, net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.title.Title> {
    public static class Builder {
        public Builder() {
            elements = null;
            display = com.google.common.base.Optional.absent();
            notes = com.google.common.base.Optional.absent();
        }

        public Builder(final TitleSet other) {
            this.elements = other.getElements();
            this.display = other.getDisplay();
            this.notes = other.getNotes();
        }

        protected TitleSet _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            return new TitleSet(elements, display, notes);
        }

        public TitleSet build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(elements, "net.lab1318.costume.api.models.title.TitleSet: missing elements"), com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.title.TitleSet: missing display"), com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.title.TitleSet: missing notes"));
        }

        public final com.google.common.base.Optional<String> getDisplay() {
            return display;
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> getElements() {
            return elements;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.title.Title> sequence = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequence.add(net.lab1318.costume.api.models.title.Title.readAsStruct(iprot));
                        }
                        iprot.readListEnd();
                        return sequence.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                    }
                }
            }).apply(iprot);
            if (__list.getSize() > 1) {
                display = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                notes = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "elements": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.title.Title> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.title.Title.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
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
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setDisplay(final com.google.common.base.Optional<String> display) {
            this.display = com.google.common.base.Preconditions.checkNotNull(display);
            return this;
        }

        public Builder setDisplay(@javax.annotation.Nullable final String display) {
            this.display = com.google.common.base.Optional.fromNullable(display);
            return this;
        }

        public Builder setElements(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements) {
            this.elements = com.google.common.base.Preconditions.checkNotNull(elements);
            return this;
        }

        public Builder setIfPresent(final TitleSet other) {
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
            this.notes = com.google.common.base.Preconditions.checkNotNull(notes);
            return this;
        }

        public Builder setNotes(@javax.annotation.Nullable final String notes) {
            this.notes = com.google.common.base.Optional.fromNullable(notes);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "elements": setElements((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>)value); return this;
            case "display": setDisplay((String)value); return this;
            case "notes": setNotes((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetDisplay() {
            this.display = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetElements() {
            this.elements = null;
            return this;
        }

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements;
        private com.google.common.base.Optional<String> display;
        private com.google.common.base.Optional<String> notes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ELEMENTS("elements", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>>() {}, true, 1, "elements", org.thryft.protocol.Type.LIST),
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

    /**
     * Copy constructor
     */
    public TitleSet(final TitleSet other) {
        this(other.getElements(), other.getDisplay(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public TitleSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements) {
        this.elements = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(elements, "net.lab1318.costume.api.models.title.TitleSet: missing elements"), "net.lab1318.costume.api.models.title.TitleSet: elements is empty");
        this.display = com.google.common.base.Optional.absent();
        this.notes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public TitleSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements, final @javax.annotation.Nullable String display, final @javax.annotation.Nullable String notes) {
        this.elements = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(elements, "net.lab1318.costume.api.models.title.TitleSet: missing elements"), "net.lab1318.costume.api.models.title.TitleSet: elements is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(display), "net.lab1318.costume.api.models.title.TitleSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "net.lab1318.costume.api.models.title.TitleSet: notes is empty");
    }

    /**
     * Optional constructor
     */
    public TitleSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
        this.elements = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(elements, "net.lab1318.costume.api.models.title.TitleSet: missing elements"), "net.lab1318.costume.api.models.title.TitleSet: elements is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.title.TitleSet: missing display"), "net.lab1318.costume.api.models.title.TitleSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.title.TitleSet: missing notes"), "net.lab1318.costume.api.models.title.TitleSet: notes is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final TitleSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<TitleSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TitleSet)) {
            return false;
        }

        final TitleSet other = (TitleSet)otherObject;
        return
            getElements().equals(other.getElements()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "elements": return getElements();
        case "display": return getDisplay();
        case "notes": return getNotes();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getDisplay() {
        return display;
    }

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> getElements() {
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

    public static TitleSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static TitleSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.title.Title> sequence = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequence.add(net.lab1318.costume.api.models.title.Title.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                    return sequence.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                }
            }
        }).apply(iprot);
        if (__list.getSize() > 1) {
            display = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            notes = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new TitleSet(elements, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static TitleSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "elements": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    elements = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.title.Title> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.title.Title.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
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
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new TitleSet(elements, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public TitleSet replaceDisplay(final com.google.common.base.Optional<String> display) {
        return new TitleSet(this.elements, display, this.notes);
    }

    public TitleSet replaceDisplay(final String display) {
        return replaceDisplay(com.google.common.base.Optional.fromNullable(display));
    }

    public TitleSet replaceElements(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements) {
        return new TitleSet(elements, this.display, this.notes);
    }

    public TitleSet replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new TitleSet(this.elements, this.display, notes);
    }

    public TitleSet replaceNotes(final String notes) {
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
        for (final net.lab1318.costume.api.models.title.Title _iter0 : getElements()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.title.TitleSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("elements", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getElements().size());
        for (final net.lab1318.costume.api.models.title.Title _iter0 : getElements()) {
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

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.title.Title> elements;

    private final com.google.common.base.Optional<String> display;

    private final com.google.common.base.Optional<String> notes;
}