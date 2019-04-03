package org.dressdiscover.api.vocabularies.vra_core.agent;

/**
 * VRA Core 4.0 agent element
 */
public final class Agent implements org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, Agent> {
        public Builder() {
            name = null;
            attribution = com.google.common.base.Optional.<String> absent();
            culture = com.google.common.base.Optional.<String> absent();
            dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent();
            role = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent();
        }

        public Builder(final Agent other) {
            this.name = other.getName();
            this.attribution = other.getAttribution();
            this.culture = other.getCulture();
            this.dates = other.getDates();
            this.role = other.getRole();
        }

        protected Agent _build(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            return new Agent(name, attribution, culture, dates, role);
        }

        public Agent build() {
            Validator.validate(name, attribution, culture, dates, role);

            return _build(name, attribution, culture, dates, role);
        }

        public final com.google.common.base.Optional<String> getAttribution() {
            return attribution;
        }

        public final com.google.common.base.Optional<String> getCulture() {
            return culture;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> getDates() {
            return dates;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentName getName() {
            return name;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> getRole() {
            return role;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setName(org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot));
                if (__list.getSize() > 1) {
                    this.setAttribution(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 2) {
                    this.setCulture(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 3) {
                    try {
                        this.setDates(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    this.setRole(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot)));
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
                    case "name": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                this.setName(org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "attribution": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                this.setAttribution(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "culture": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                this.setCulture(com.google.common.base.Optional.of(iprot.readString()));
                        }
                        break;
                    }
                    case "dates": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                try {
                                    this.setDates(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "role": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                                this.setRole(com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot, unknownFieldCallback)));
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
            case NAME: setName((org.dressdiscover.api.vocabularies.vra_core.agent.AgentName)value); return this;
            case ATTRIBUTION: setAttribution((String)value); return this;
            case CULTURE: setCulture((String)value); return this;
            case DATES: setDates((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>)value); return this;
            case ROLE: setRole((org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAttribution(final com.google.common.base.Optional<String> attribution) {
            Validator.validateAttribution(attribution);
            this.attribution = attribution;
            return this;
        }

        public Builder setAttribution(final @javax.annotation.Nullable String attribution) {
            return setAttribution(com.google.common.base.Optional.fromNullable(attribution));
        }

        public Builder setCulture(final com.google.common.base.Optional<String> culture) {
            Validator.validateCulture(culture);
            this.culture = culture;
            return this;
        }

        public Builder setCulture(final @javax.annotation.Nullable String culture) {
            return setCulture(com.google.common.base.Optional.fromNullable(culture));
        }

        public Builder setDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
            Validator.validateDates(dates);
            this.dates = dates;
            return this;
        }

        public Builder setDates(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates) {
            return setDates(com.google.common.base.Optional.fromNullable(dates));
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

        public Builder setName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
            Validator.validateName(name);
            this.name = name;
            return this;
        }

        public Builder setRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            Validator.validateRole(role);
            this.role = role;
            return this;
        }

        public Builder setRole(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
            return setRole(com.google.common.base.Optional.fromNullable(role));
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
            case NAME: return unsetName();
            case ATTRIBUTION: return unsetAttribution();
            case CULTURE: return unsetCulture();
            case DATES: return unsetDates();
            case ROLE: return unsetRole();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAttribution() {
            this.attribution = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetCulture() {
            this.culture = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetDates() {
            this.dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent();
            return this;
        }

        public Builder unsetName() {
            this.name = null;
            return this;
        }

        public Builder unsetRole() {
            this.role = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent();
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name;
        private com.google.common.base.Optional<String> attribution;
        private com.google.common.base.Optional<String> culture;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Agent> {
        @Override
        public Agent readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsList(iprot);
        }

        @Override
        public Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsStruct(iprot);
        }

        @Override
        public Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.agent.AgentName>() {}, true, (short)1, "name", "1:name", org.thryft.protocol.Type.STRUCT),
        ATTRIBUTION("attribution", new com.google.common.reflect.TypeToken<String>() {}, false, (short)2, "attribution", "2:attribution", org.thryft.protocol.Type.STRING),
        CULTURE("culture", new com.google.common.reflect.TypeToken<String>() {}, false, (short)3, "culture", "3:culture", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {}, false, (short)4, "dates", "4:dates", org.thryft.protocol.Type.LIST),
        ROLE("role", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole>() {}, false, (short)5, "role", "5:role", org.thryft.protocol.Type.STRUCT);

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
        public static void validate(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            validateName(name);
            validateAttribution(attribution);
            validateCulture(culture);
            validateDates(dates);
            validateRole(role);
        }

        public static void validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
            if (name == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: name is missing");
            }
        }

        public static void validateAttribution(final com.google.common.base.Optional<String> attribution) {
            if (attribution == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution is missing");
            }
            if (attribution.isPresent()) {
                if (attribution.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution: less than min length 1");
                }
            }
        }

        public static void validateCulture(final com.google.common.base.Optional<String> culture) {
            if (culture == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture is missing");
            }
            if (culture.isPresent()) {
                if (culture.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture: less than min length 1");
                }
            }
        }

        public static void validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
            if (dates == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates is missing");
            }
            if (dates.isPresent()) {
                if (dates.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates: less than min length 1");
                }
            }
        }

        public static void validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            if (role == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: role is missing");
            }
        }
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
    public Agent(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
        this(name, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent());
    }

    /**
     * Total constructor
     */
    public Agent(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
        Validator.validate(name, attribution, culture, dates, role);
        this.name = name;
        this.attribution = attribution;
        this.culture = culture;
        this.dates = dates;
        this.role = role;
    }

    /**
     * Total Nullable constructor
     */
    public Agent(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, @javax.annotation.Nullable final String attribution, @javax.annotation.Nullable final String culture, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
        this(name, com.google.common.base.Optional.fromNullable(attribution), com.google.common.base.Optional.fromNullable(culture), com.google.common.base.Optional.fromNullable(dates), com.google.common.base.Optional.fromNullable(role));
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
        }
        if (!(otherObject instanceof Agent)) {
            return false;
        }

        final Agent other = (Agent)otherObject;

        if (!(getName().equals(other.getName()))) {
            return false;
        }

        if (!(((getAttribution().isPresent() && other.getAttribution().isPresent()) ? (getAttribution().get().equals(other.getAttribution().get())) : (!getAttribution().isPresent() && !other.getAttribution().isPresent())))) {
            return false;
        }

        if (!(((getCulture().isPresent() && other.getCulture().isPresent()) ? (getCulture().get().equals(other.getCulture().get())) : (!getCulture().isPresent() && !other.getCulture().isPresent())))) {
            return false;
        }

        if (!(((getDates().isPresent() && other.getDates().isPresent()) ? (getDates().get().equals(other.getDates().get())) : (!getDates().isPresent() && !other.getDates().isPresent())))) {
            return false;
        }

        if (!(((getRole().isPresent() && other.getRole().isPresent()) ? (getRole().get().equals(other.getRole().get())) : (!getRole().isPresent() && !other.getRole().isPresent())))) {
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> getDates() {
        return dates;
    }

    public final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName getName() {
        return name;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> getRole() {
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

    public static Agent readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public Agent replaceAttribution(final com.google.common.base.Optional<String> attribution) {
        Validator.validateAttribution(attribution);
        return new Agent(this.name, attribution, this.culture, this.dates, this.role);
    }

    public Agent replaceAttribution(@javax.annotation.Nullable final String attribution) {
        return replaceAttribution(com.google.common.base.Optional.fromNullable(attribution));
    }

    public Agent replaceCulture(final com.google.common.base.Optional<String> culture) {
        Validator.validateCulture(culture);
        return new Agent(this.name, this.attribution, culture, this.dates, this.role);
    }

    public Agent replaceCulture(@javax.annotation.Nullable final String culture) {
        return replaceCulture(com.google.common.base.Optional.fromNullable(culture));
    }

    public Agent replaceDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
        Validator.validateDates(dates);
        return new Agent(this.name, this.attribution, this.culture, dates, this.role);
    }

    public Agent replaceDates(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public Agent replaceName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
        Validator.validateName(name);
        return new Agent(name, this.attribution, this.culture, this.dates, this.role);
    }

    public Agent replaceRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
        Validator.validateRole(role);
        return new Agent(this.name, this.attribution, this.culture, this.dates, role);
    }

    public Agent replaceRole(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
        return replaceRole(com.google.common.base.Optional.fromNullable(role));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("attribution", getAttribution().orNull()).add("culture", getCulture().orNull()).add("dates", getDates().orNull()).add("role", getRole().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.agent.Agent");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeAttributionField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAttribution().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ATTRIBUTION);
            oprot.writeString(getAttribution().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeCultureField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCulture().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CULTURE);
            oprot.writeString(getCulture().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeDatesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDates().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DATES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDates().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates _iter0 : getDates().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates _iter0 : getDates().get()) {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeNameField(oprot);

        writeAttributionField(oprot);

        writeCultureField(oprot);

        writeDatesField(oprot);

        writeRoleField(oprot);

        oprot.writeFieldStop();
    }

    public void writeNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.NAME);
        getName().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeRoleField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRole().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ROLE);
            getRole().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    private final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name;

    private final com.google.common.base.Optional<String> attribution;

    private final com.google.common.base.Optional<String> culture;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role;
}
