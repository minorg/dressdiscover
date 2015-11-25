package net.lab1318.costume.api.models.subject;

/**
 * VRA Core 4.0 subjectSet element
 */
public class SubjectSet implements org.thryft.Struct, net.lab1318.costume.api.models.ElementSet {
    public static class Builder {
        public Builder() {
            subjects = null;
            display = com.google.common.base.Optional.absent();
            notes = com.google.common.base.Optional.absent();
        }

        public Builder(final SubjectSet other) {
            this.subjects = other.getSubjects();
            this.display = other.getDisplay();
            this.notes = other.getNotes();
        }

        protected SubjectSet _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            return new SubjectSet(subjects, display, notes);
        }

        public SubjectSet build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.subject.SubjectSet: missing subjects"), com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.subject.SubjectSet: missing display"), com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.subject.SubjectSet: missing notes"));
        }

        public final com.google.common.base.Optional<String> getDisplay() {
            return display;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> getSubjects() {
            return subjects;
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
            subjects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.subject.Subject> sequence = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequence.add(net.lab1318.costume.api.models.subject.Subject.readAsStruct(iprot));
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
                case "subjects": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        subjects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.subject.Subject> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.subject.Subject.readAsStruct(iprot));
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

        public Builder setIfPresent(final SubjectSet other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setSubjects(other.getSubjects());
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

        public Builder setSubjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects) {
            this.subjects = com.google.common.base.Preconditions.checkNotNull(subjects);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "subjects": setSubjects((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>)value); return this;
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

        public Builder unsetNotes() {
            this.notes = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSubjects() {
            this.subjects = null;
            return this;
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects;
        private com.google.common.base.Optional<String> display;
        private com.google.common.base.Optional<String> notes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>>() {}, true, 1, "subjects", org.thryft.protocol.Type.LIST),
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
            case "subjects": return SUBJECTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "subjects": return SUBJECTS;
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
    public SubjectSet(final SubjectSet other) {
        this(other.getSubjects(), other.getDisplay(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public SubjectSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects) {
        this.subjects = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.subject.SubjectSet: missing subjects"), "net.lab1318.costume.api.models.subject.SubjectSet: subjects is empty");
        this.display = com.google.common.base.Optional.absent();
        this.notes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public SubjectSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects, final @javax.annotation.Nullable String display, final @javax.annotation.Nullable String notes) {
        this.subjects = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.subject.SubjectSet: missing subjects"), "net.lab1318.costume.api.models.subject.SubjectSet: subjects is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(display), "net.lab1318.costume.api.models.subject.SubjectSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "net.lab1318.costume.api.models.subject.SubjectSet: notes is empty");
    }

    /**
     * Optional constructor
     */
    public SubjectSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
        this.subjects = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.subject.SubjectSet: missing subjects"), "net.lab1318.costume.api.models.subject.SubjectSet: subjects is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.subject.SubjectSet: missing display"), "net.lab1318.costume.api.models.subject.SubjectSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.subject.SubjectSet: missing notes"), "net.lab1318.costume.api.models.subject.SubjectSet: notes is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final SubjectSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<SubjectSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof SubjectSet)) {
            return false;
        }

        final SubjectSet other = (SubjectSet)otherObject;
        return
            getSubjects().equals(other.getSubjects()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "subjects": return getSubjects();
        case "display": return getDisplay();
        case "notes": return getNotes();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<String> getDisplay() {
        return display;
    }

    public final com.google.common.base.Optional<String> getNotes() {
        return notes;
    }

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> getSubjects() {
        return subjects;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getSubjects().hashCode();
        if (getDisplay().isPresent()) {
            hashCode = 31 * hashCode + getDisplay().get().hashCode();
        }
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        return hashCode;
    }

    public static SubjectSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static SubjectSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        subjects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.subject.Subject> sequence = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequence.add(net.lab1318.costume.api.models.subject.Subject.readAsStruct(iprot));
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
            return new SubjectSet(subjects, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static SubjectSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "subjects": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    subjects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.subject.Subject> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.subject.Subject.readAsStruct(iprot));
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
            return new SubjectSet(subjects, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public SubjectSet replaceDisplay(final com.google.common.base.Optional<String> display) {
        return new SubjectSet(this.subjects, display, this.notes);
    }

    public SubjectSet replaceDisplay(final String display) {
        return replaceDisplay(com.google.common.base.Optional.fromNullable(display));
    }

    public SubjectSet replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new SubjectSet(this.subjects, this.display, notes);
    }

    public SubjectSet replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public SubjectSet replaceSubjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects) {
        return new SubjectSet(subjects, this.display, this.notes);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("subjects", getSubjects()).add("display", getDisplay().orNull()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSubjects().size());
        for (final net.lab1318.costume.api.models.subject.Subject _iter0 : getSubjects()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.subject.SubjectSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("subjects", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSubjects().size());
        for (final net.lab1318.costume.api.models.subject.Subject _iter0 : getSubjects()) {
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

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> subjects;

    private final com.google.common.base.Optional<String> display;

    private final com.google.common.base.Optional<String> notes;
}
