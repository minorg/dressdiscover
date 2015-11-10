package net.lab1318.costume.api.models.rights;

/**
 * VRA Core 4.0 rightsSet element
 */
public class RightsSet implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            rights = null;
            display = com.google.common.base.Optional.absent();
            notes = com.google.common.base.Optional.absent();
        }

        public Builder(final RightsSet other) {
            this.rights = other.getRights();
            this.display = other.getDisplay();
            this.notes = other.getNotes();
        }

        protected RightsSet _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
            return new RightsSet(rights, display, notes);
        }

        public RightsSet build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.rights.RightsSet: missing rights"), com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.rights.RightsSet: missing display"), com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.rights.RightsSet: missing notes"));
        }

        public final com.google.common.base.Optional<String> getDisplay() {
            return display;
        }

        public final com.google.common.base.Optional<String> getNotes() {
            return notes;
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> getRights() {
            return rights;
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
            rights = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.rights.Rights> sequence = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequence.add(net.lab1318.costume.api.models.rights.Rights.readAsStruct(iprot));
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
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        rights = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.rights.Rights> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(net.lab1318.costume.api.models.rights.Rights.readAsStruct(iprot));
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

        public Builder setIfPresent(final RightsSet other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setRights(other.getRights());
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

        public Builder setRights(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights) {
            this.rights = com.google.common.base.Preconditions.checkNotNull(rights);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "rights": setRights((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>)value); return this;
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

        public Builder unsetRights() {
            this.rights = null;
            return this;
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights;
        private com.google.common.base.Optional<String> display;
        private com.google.common.base.Optional<String> notes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        RIGHTS("rights", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>>() {}, true, 1, "rights", org.thryft.protocol.Type.LIST),
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
            case "rights": return RIGHTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "rights": return RIGHTS;
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
    public RightsSet(final RightsSet other) {
        this(other.getRights(), other.getDisplay(), other.getNotes());
    }

    /**
     * Required constructor
     */
    public RightsSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights) {
        this.rights = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.rights.RightsSet: missing rights"), "net.lab1318.costume.api.models.rights.RightsSet: rights is empty");
        this.display = com.google.common.base.Optional.absent();
        this.notes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public RightsSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights, final @javax.annotation.Nullable String display, final @javax.annotation.Nullable String notes) {
        this.rights = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.rights.RightsSet: missing rights"), "net.lab1318.costume.api.models.rights.RightsSet: rights is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(display), "net.lab1318.costume.api.models.rights.RightsSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(notes), "net.lab1318.costume.api.models.rights.RightsSet: notes is empty");
    }

    /**
     * Optional constructor
     */
    public RightsSet(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights, final com.google.common.base.Optional<String> display, final com.google.common.base.Optional<String> notes) {
        this.rights = org.thryft.Preconditions.checkCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.rights.RightsSet: missing rights"), "net.lab1318.costume.api.models.rights.RightsSet: rights is empty");
        this.display = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(display, "net.lab1318.costume.api.models.rights.RightsSet: missing display"), "net.lab1318.costume.api.models.rights.RightsSet: display is empty");
        this.notes = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(notes, "net.lab1318.costume.api.models.rights.RightsSet: missing notes"), "net.lab1318.costume.api.models.rights.RightsSet: notes is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final RightsSet other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<RightsSet> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RightsSet)) {
            return false;
        }

        final RightsSet other = (RightsSet)otherObject;
        return
            getRights().equals(other.getRights()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "rights": return getRights();
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

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> getRights() {
        return rights;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRights().hashCode();
        if (getDisplay().isPresent()) {
            hashCode = 31 * hashCode + getDisplay().get().hashCode();
        }
        if (getNotes().isPresent()) {
            hashCode = 31 * hashCode + getNotes().get().hashCode();
        }
        return hashCode;
    }

    public static RightsSet readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static RightsSet readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        rights = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.rights.Rights> sequence = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequence.add(net.lab1318.costume.api.models.rights.Rights.readAsStruct(iprot));
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
            return new RightsSet(rights, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static RightsSet readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights = null;
        com.google.common.base.Optional<String> display = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> notes = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "rights": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    rights = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.rights.Rights> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.rights.Rights.readAsStruct(iprot));
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
            return new RightsSet(rights, display, notes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public RightsSet replaceDisplay(final com.google.common.base.Optional<String> display) {
        return new RightsSet(this.rights, display, this.notes);
    }

    public RightsSet replaceDisplay(final String display) {
        return replaceDisplay(com.google.common.base.Optional.fromNullable(display));
    }

    public RightsSet replaceNotes(final com.google.common.base.Optional<String> notes) {
        return new RightsSet(this.rights, this.display, notes);
    }

    public RightsSet replaceNotes(final String notes) {
        return replaceNotes(com.google.common.base.Optional.fromNullable(notes));
    }

    public RightsSet replaceRights(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights) {
        return new RightsSet(rights, this.display, this.notes);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights", getRights()).add("display", getDisplay().orNull()).add("notes", getNotes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRights().size());
        for (final net.lab1318.costume.api.models.rights.Rights _iter0 : getRights()) {
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.rights.RightsSet");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("rights", org.thryft.protocol.Type.LIST, (short)1);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRights().size());
        for (final net.lab1318.costume.api.models.rights.Rights _iter0 : getRights()) {
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

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> rights;

    private final com.google.common.base.Optional<String> display;

    private final com.google.common.base.Optional<String> notes;
}
