package net.lab1318.costume.api.models.agent;

/**
 * VRA Core 4.0 agent element
 */
public class Agent implements org.thryft.Struct, net.lab1318.costume.api.models.Element {
    public static class Builder {
        public Builder() {
            name = null;
            attribution = com.google.common.base.Optional.absent();
            culture = com.google.common.base.Optional.absent();
            dates = com.google.common.base.Optional.absent();
            role = com.google.common.base.Optional.absent();
        }

        public Builder(final Agent other) {
            this.name = other.getName();
            this.attribution = other.getAttribution();
            this.culture = other.getCulture();
            this.dates = other.getDates();
            this.role = other.getRole();
        }

        protected Agent _build(final net.lab1318.costume.api.models.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates, final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role) {
            return new Agent(name, attribution, culture, dates, role);
        }

        public Agent build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.agent.Agent: missing name"), com.google.common.base.Preconditions.checkNotNull(attribution, "net.lab1318.costume.api.models.agent.Agent: missing attribution"), com.google.common.base.Preconditions.checkNotNull(culture, "net.lab1318.costume.api.models.agent.Agent: missing culture"), com.google.common.base.Preconditions.checkNotNull(dates, "net.lab1318.costume.api.models.agent.Agent: missing dates"), com.google.common.base.Preconditions.checkNotNull(role, "net.lab1318.costume.api.models.agent.Agent: missing role"));
        }

        public final com.google.common.base.Optional<String> getAttribution() {
            return attribution;
        }

        public final com.google.common.base.Optional<String> getCulture() {
            return culture;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> getDates() {
            return dates;
        }

        public final net.lab1318.costume.api.models.agent.AgentName getName() {
            return name;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> getRole() {
            return role;
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
            name = net.lab1318.costume.api.models.agent.AgentName.readAsStruct(iprot);
            if (__list.getSize() > 1) {
                attribution = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                culture = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.agent.AgentDates.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 4) {
                role = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentRole.readAsStruct(iprot));
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
                case "name": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        name = net.lab1318.costume.api.models.agent.AgentName.readAsStruct(iprot);
                    }
                    break;
                }
                case "attribution": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        attribution = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "culture": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        culture = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "dates": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.agent.AgentDates.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                        }
                    }
                    break;
                }
                case "role": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        role = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentRole.readAsStruct(iprot));
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setAttribution(final com.google.common.base.Optional<String> attribution) {
            this.attribution = com.google.common.base.Preconditions.checkNotNull(attribution);
            return this;
        }

        public Builder setAttribution(@javax.annotation.Nullable final String attribution) {
            this.attribution = com.google.common.base.Optional.fromNullable(attribution);
            return this;
        }

        public Builder setCulture(final com.google.common.base.Optional<String> culture) {
            this.culture = com.google.common.base.Preconditions.checkNotNull(culture);
            return this;
        }

        public Builder setCulture(@javax.annotation.Nullable final String culture) {
            this.culture = com.google.common.base.Optional.fromNullable(culture);
            return this;
        }

        public Builder setDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates) {
            this.dates = com.google.common.base.Preconditions.checkNotNull(dates);
            return this;
        }

        public Builder setDates(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> dates) {
            this.dates = com.google.common.base.Optional.fromNullable(dates);
            return this;
        }

        public Builder setIfPresent(final Agent other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setName(other.getName());
            if (other.getAttribution().isPresent()) {
                setAttribution(other.getAttribution());
            }
            if (other.getCulture().isPresent()) {
                setCulture(other.getCulture());
            }
            if (other.getDates().isPresent()) {
                setDates(other.getDates());
            }
            if (other.getRole().isPresent()) {
                setRole(other.getRole());
            }

            return this;
        }

        public Builder setName(final net.lab1318.costume.api.models.agent.AgentName name) {
            this.name = com.google.common.base.Preconditions.checkNotNull(name);
            return this;
        }

        public Builder setRole(final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role) {
            this.role = com.google.common.base.Preconditions.checkNotNull(role);
            return this;
        }

        public Builder setRole(@javax.annotation.Nullable final net.lab1318.costume.api.models.agent.AgentRole role) {
            this.role = com.google.common.base.Optional.fromNullable(role);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": setName((net.lab1318.costume.api.models.agent.AgentName)value); return this;
            case "attribution": setAttribution((String)value); return this;
            case "culture": setCulture((String)value); return this;
            case "dates": setDates((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>)value); return this;
            case "role": setRole((net.lab1318.costume.api.models.agent.AgentRole)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetAttribution() {
            this.attribution = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCulture() {
            this.culture = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDates() {
            this.dates = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetName() {
            this.name = null;
            return this;
        }

        public Builder unsetRole() {
            this.role = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "name": return unsetName();
            case "attribution": return unsetAttribution();
            case "culture": return unsetCulture();
            case "dates": return unsetDates();
            case "role": return unsetRole();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private net.lab1318.costume.api.models.agent.AgentName name;
        private com.google.common.base.Optional<String> attribution;
        private com.google.common.base.Optional<String> culture;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.agent.AgentName>() {}, true, 1, "name", org.thryft.protocol.Type.STRUCT),
        ATTRIBUTION("attribution", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "attribution", org.thryft.protocol.Type.STRING),
        CULTURE("culture", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "culture", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>>() {}, false, 4, "dates", org.thryft.protocol.Type.LIST),
        ROLE("role", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.agent.AgentRole>() {}, false, 5, "role", org.thryft.protocol.Type.STRUCT);

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
            case "name": return NAME;
            case "attribution": return ATTRIBUTION;
            case "culture": return CULTURE;
            case "dates": return DATES;
            case "role": return ROLE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "name": return NAME;
            case "attribution": return ATTRIBUTION;
            case "culture": return CULTURE;
            case "dates": return DATES;
            case "role": return ROLE;
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
    public Agent(final Agent other) {
        this(other.getName(), other.getAttribution(), other.getCulture(), other.getDates(), other.getRole());
    }

    /**
     * Required constructor
     */
    public Agent(final net.lab1318.costume.api.models.agent.AgentName name) {
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.agent.Agent: missing name");
        this.attribution = com.google.common.base.Optional.absent();
        this.culture = com.google.common.base.Optional.absent();
        this.dates = com.google.common.base.Optional.absent();
        this.role = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Agent(final net.lab1318.costume.api.models.agent.AgentName name, final @javax.annotation.Nullable String attribution, final @javax.annotation.Nullable String culture, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> dates, final @javax.annotation.Nullable net.lab1318.costume.api.models.agent.AgentRole role) {
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.agent.Agent: missing name");
        this.attribution = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(attribution), "net.lab1318.costume.api.models.agent.Agent: attribution is empty");
        this.culture = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(culture), "net.lab1318.costume.api.models.agent.Agent: culture is empty");
        this.dates = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(dates), "net.lab1318.costume.api.models.agent.Agent: dates is empty");
        this.role = com.google.common.base.Optional.fromNullable(role);
    }

    /**
     * Optional constructor
     */
    public Agent(final net.lab1318.costume.api.models.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates, final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role) {
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "net.lab1318.costume.api.models.agent.Agent: missing name");
        this.attribution = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(attribution, "net.lab1318.costume.api.models.agent.Agent: missing attribution"), "net.lab1318.costume.api.models.agent.Agent: attribution is empty");
        this.culture = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(culture, "net.lab1318.costume.api.models.agent.Agent: missing culture"), "net.lab1318.costume.api.models.agent.Agent: culture is empty");
        this.dates = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(dates, "net.lab1318.costume.api.models.agent.Agent: missing dates"), "net.lab1318.costume.api.models.agent.Agent: dates is empty");
        this.role = com.google.common.base.Preconditions.checkNotNull(role, "net.lab1318.costume.api.models.agent.Agent: missing role");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Agent other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Agent> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Agent)) {
            return false;
        }

        final Agent other = (Agent)otherObject;
        return
            getName().equals(other.getName()) &&
            getAttribution().equals(other.getAttribution()) &&
            getCulture().equals(other.getCulture()) &&
            getDates().equals(other.getDates()) &&
            getRole().equals(other.getRole());
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
        case NAME: return getName();
        case ATTRIBUTION: return getAttribution();
        case CULTURE: return getCulture();
        case DATES: return getDates();
        case ROLE: return getRole();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getAttribution() {
        return attribution;
    }

    public final com.google.common.base.Optional<String> getCulture() {
        return culture;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> getDates() {
        return dates;
    }

    public final net.lab1318.costume.api.models.agent.AgentName getName() {
        return name;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        if (getAttribution().isPresent()) {
            hashCode = 31 * hashCode + getAttribution().get().hashCode();
        }
        if (getCulture().isPresent()) {
            hashCode = 31 * hashCode + getCulture().get().hashCode();
        }
        if (getDates().isPresent()) {
            hashCode = 31 * hashCode + getDates().get().hashCode();
        }
        if (getRole().isPresent()) {
            hashCode = 31 * hashCode + getRole().get().hashCode();
        }
        return hashCode;
    }

    public static Agent readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Agent readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.agent.AgentName name = null;
        com.google.common.base.Optional<String> attribution = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> culture = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        name = net.lab1318.costume.api.models.agent.AgentName.readAsStruct(iprot);
        if (__list.getSize() > 1) {
            attribution = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 2) {
            culture = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 3) {
            try {
                dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.models.agent.AgentDates.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 4) {
            role = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentRole.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Agent(name, attribution, culture, dates, role);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.agent.AgentName name = null;
        com.google.common.base.Optional<String> attribution = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> culture = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "name": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    name = net.lab1318.costume.api.models.agent.AgentName.readAsStruct(iprot);
                }
                break;
            }
            case "attribution": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    attribution = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "culture": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    culture = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "dates": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    try {
                        dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.agent.AgentDates.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                }
                break;
            }
            case "role": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    role = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentRole.readAsStruct(iprot));
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Agent(name, attribution, culture, dates, role);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Agent replaceAttribution(final com.google.common.base.Optional<String> attribution) {
        return new Agent(this.name, attribution, this.culture, this.dates, this.role);
    }

    public Agent replaceAttribution(final String attribution) {
        return replaceAttribution(com.google.common.base.Optional.fromNullable(attribution));
    }

    public Agent replaceCulture(final com.google.common.base.Optional<String> culture) {
        return new Agent(this.name, this.attribution, culture, this.dates, this.role);
    }

    public Agent replaceCulture(final String culture) {
        return replaceCulture(com.google.common.base.Optional.fromNullable(culture));
    }

    public Agent replaceDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates) {
        return new Agent(this.name, this.attribution, this.culture, dates, this.role);
    }

    public Agent replaceDates(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public Agent replaceName(final net.lab1318.costume.api.models.agent.AgentName name) {
        return new Agent(name, this.attribution, this.culture, this.dates, this.role);
    }

    public Agent replaceRole(final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role) {
        return new Agent(this.name, this.attribution, this.culture, this.dates, role);
    }

    public Agent replaceRole(final net.lab1318.costume.api.models.agent.AgentRole role) {
        return replaceRole(com.google.common.base.Optional.fromNullable(role));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("attribution", getAttribution().orNull()).add("culture", getCulture().orNull()).add("dates", getDates().orNull()).add("role", getRole().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        getName().writeAsStruct(oprot);

        if (getAttribution().isPresent()) {
            oprot.writeString(getAttribution().get());
        } else {
            oprot.writeNull();
        }

        if (getCulture().isPresent()) {
            oprot.writeString(getCulture().get());
        } else {
            oprot.writeNull();
        }

        if (getDates().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDates().get().size());
            for (final net.lab1318.costume.api.models.agent.AgentDates _iter0 : getDates().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRole().isPresent()) {
            getRole().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.agent.Agent");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("name", org.thryft.protocol.Type.STRUCT, (short)1);
        getName().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        if (getAttribution().isPresent()) {
            oprot.writeFieldBegin("attribution", org.thryft.protocol.Type.STRING, (short)2);
            oprot.writeString(getAttribution().get());
            oprot.writeFieldEnd();
        }

        if (getCulture().isPresent()) {
            oprot.writeFieldBegin("culture", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getCulture().get());
            oprot.writeFieldEnd();
        }

        if (getDates().isPresent()) {
            oprot.writeFieldBegin("dates", org.thryft.protocol.Type.LIST, (short)4);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDates().get().size());
            for (final net.lab1318.costume.api.models.agent.AgentDates _iter0 : getDates().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRole().isPresent()) {
            oprot.writeFieldBegin("role", org.thryft.protocol.Type.STRUCT, (short)5);
            getRole().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final net.lab1318.costume.api.models.agent.AgentName name;

    private final com.google.common.base.Optional<String> attribution;

    private final com.google.common.base.Optional<String> culture;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>> dates;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentRole> role;
}
