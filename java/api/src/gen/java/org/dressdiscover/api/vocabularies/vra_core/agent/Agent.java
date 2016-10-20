package org.dressdiscover.api.vocabularies.vra_core.agent;

/**
 * VRA Core 4.0 agent element
 */
public final class Agent implements org.thryft.Struct, org.dressdiscover.api.vocabularies.vra_core.Element {
    public final static class Builder {
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
            return new Agent(name, attribution, culture, dates, role, DefaultConstructionValidator.getInstance());
        }

        public Agent build() {
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

        public final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName getName() {
            return name;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> getRole() {
            return role;
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
                name = org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot);
                if (__list.getSize() > 1) {
                    attribution = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    culture = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 3) {
                    try {
                        dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
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
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    role = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot));
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
                    case "name": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            name = org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot);
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
                                dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
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
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "role": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            role = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot));
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
            this.attribution = DefaultConstructionValidator.getInstance().validateAttribution(attribution);
            return this;
        }

        public Builder setAttribution(@javax.annotation.Nullable final String attribution) {
            return setAttribution(com.google.common.base.Optional.fromNullable(attribution));
        }

        public Builder setCulture(final com.google.common.base.Optional<String> culture) {
            this.culture = DefaultConstructionValidator.getInstance().validateCulture(culture);
            return this;
        }

        public Builder setCulture(@javax.annotation.Nullable final String culture) {
            return setCulture(com.google.common.base.Optional.fromNullable(culture));
        }

        public Builder setDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
            this.dates = DefaultConstructionValidator.getInstance().validateDates(dates);
            return this;
        }

        public Builder setDates(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates) {
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
            this.name = DefaultConstructionValidator.getInstance().validateName(name);
            return this;
        }

        public Builder setRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            this.role = DefaultConstructionValidator.getInstance().validateRole(role);
            return this;
        }

        public Builder setRole(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
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

        private org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name;
        private com.google.common.base.Optional<String> attribution;
        private com.google.common.base.Optional<String> culture;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Agent> {
        @Override
        public Agent readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAs(iprot, type);
        }

        @Override
        public Agent readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Agent readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsList(iprot);
        }

        @Override
        public Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsStruct(iprot);
        }

        @Override
        public Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Agent.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.agent.AgentName>() {}, true, 1, "name", org.thryft.protocol.Type.STRUCT),
        ATTRIBUTION("attribution", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "attribution", org.thryft.protocol.Type.STRING),
        CULTURE("culture", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "culture", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {}, false, 4, "dates", org.thryft.protocol.Type.LIST),
        ROLE("role", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole>() {}, false, 5, "role", org.thryft.protocol.Type.STRUCT);

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

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.vocabularies.vra_core.agent.AgentName validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) throws ExceptionT;

        public com.google.common.base.Optional<String> validateAttribution(final com.google.common.base.Optional<String> attribution) throws ExceptionT;

        public com.google.common.base.Optional<String> validateCulture(final com.google.common.base.Optional<String> culture) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) throws ExceptionT;
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
        public org.dressdiscover.api.vocabularies.vra_core.agent.AgentName validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) throws RuntimeException {
            if (name == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: name is null");
            }
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateAttribution(final com.google.common.base.Optional<String> attribution) throws RuntimeException {
            if (attribution == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution is null");
            }
            if (!attribution.isPresent()) {
                return attribution;
            }
            if (attribution.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution is less than min length 1");
            }
            return attribution;
        }

        @Override
        public com.google.common.base.Optional<String> validateCulture(final com.google.common.base.Optional<String> culture) throws RuntimeException {
            if (culture == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture is null");
            }
            if (!culture.isPresent()) {
                return culture;
            }
            if (culture.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture is less than min length 1");
            }
            return culture;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) throws RuntimeException {
            if (dates == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            if (dates.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates is less than min length 1");
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) throws RuntimeException {
            if (role == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.agent.Agent: role is null");
            }
            if (!role.isPresent()) {
                return role;
            }
            return role;
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
        public org.dressdiscover.api.vocabularies.vra_core.agent.AgentName validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateAttribution(final com.google.common.base.Optional<String> attribution) {
            return attribution;
        }

        @Override
        public com.google.common.base.Optional<String> validateCulture(final com.google.common.base.Optional<String> culture) {
            return culture;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            return role;
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
        public org.dressdiscover.api.vocabularies.vra_core.agent.AgentName validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) throws org.thryft.protocol.InputProtocolException {
            if (name == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NAME, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: name is null");
            }
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateAttribution(final com.google.common.base.Optional<String> attribution) throws org.thryft.protocol.InputProtocolException {
            if (attribution == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ATTRIBUTION, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution is null");
            }
            if (!attribution.isPresent()) {
                return attribution;
            }
            if (attribution.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ATTRIBUTION, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: attribution is less than min length 1");
            }
            return attribution;
        }

        @Override
        public com.google.common.base.Optional<String> validateCulture(final com.google.common.base.Optional<String> culture) throws org.thryft.protocol.InputProtocolException {
            if (culture == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURE, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture is null");
            }
            if (!culture.isPresent()) {
                return culture;
            }
            if (culture.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURE, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: culture is less than min length 1");
            }
            return culture;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) throws org.thryft.protocol.InputProtocolException {
            if (dates == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATES, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            if (dates.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: dates is less than min length 1");
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) throws org.thryft.protocol.InputProtocolException {
            if (role == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ROLE, "org.dressdiscover.api.vocabularies.vra_core.agent.Agent: role is null");
            }
            if (!role.isPresent()) {
                return role;
            }
            return role;
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
        public org.dressdiscover.api.vocabularies.vra_core.agent.AgentName validateName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateAttribution(final com.google.common.base.Optional<String> attribution) {
            return attribution;
        }

        @Override
        public com.google.common.base.Optional<String> validateCulture(final com.google.common.base.Optional<String> culture) {
            return culture;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> validateRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
            return role;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Agent(final Agent other) {
        this(other.getName(), other.getAttribution(), other.getCulture(), other.getDates(), other.getRole(), NopConstructionValidator.getInstance());
    }

    protected Agent(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role, ConstructionValidator validator) {
        this.name = validator.validateName(name);
        this.attribution = validator.validateAttribution(attribution);
        this.culture = validator.validateCulture(culture);
        this.dates = validator.validateDates(dates);
        this.role = validator.validateRole(role);
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

    /**
     * Required factory method
     */
    public static Agent create(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
        return new Agent(name, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Agent create(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final @javax.annotation.Nullable String attribution, final @javax.annotation.Nullable String culture, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
        return new Agent(name, com.google.common.base.Optional.fromNullable(attribution), com.google.common.base.Optional.fromNullable(culture), com.google.common.base.Optional.fromNullable(dates), com.google.common.base.Optional.fromNullable(role), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Agent create(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name, final com.google.common.base.Optional<String> attribution, final com.google.common.base.Optional<String> culture, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
        return new Agent(name, attribution, culture, dates, role, DefaultConstructionValidator.getInstance());
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

    public static Agent readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Agent readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Agent readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name = null;
        com.google.common.base.Optional<String> attribution = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> culture = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            name = org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot);
            if (__list.getSize() > 1) {
                attribution = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                culture = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
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
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                role = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Agent(DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateAttribution(attribution), DefaultReadValidator.getInstance().validateCulture(culture), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateRole(role), NopConstructionValidator.getInstance());
    }

    public static Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Agent readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name = null;
        com.google.common.base.Optional<String> attribution = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> culture = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> absent();

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
                        name = org.dressdiscover.api.vocabularies.vra_core.agent.AgentName.readAsStruct(iprot);
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
                            dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>>() {
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
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                        }
                    }
                    break;
                }
                case "role": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        role = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole.readAsStruct(iprot));
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
        return new Agent(DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateAttribution(attribution), DefaultReadValidator.getInstance().validateCulture(culture), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateRole(role), NopConstructionValidator.getInstance());
    }

    public Agent replaceAttribution(final com.google.common.base.Optional<String> attribution) {
        return new Agent(this.name, DefaultConstructionValidator.getInstance().validateAttribution(attribution), this.culture, this.dates, this.role, NopConstructionValidator.getInstance());
    }

    public Agent replaceAttribution(final String attribution) {
        return replaceAttribution(com.google.common.base.Optional.fromNullable(attribution));
    }

    public Agent replaceCulture(final com.google.common.base.Optional<String> culture) {
        return new Agent(this.name, this.attribution, DefaultConstructionValidator.getInstance().validateCulture(culture), this.dates, this.role, NopConstructionValidator.getInstance());
    }

    public Agent replaceCulture(final String culture) {
        return replaceCulture(com.google.common.base.Optional.fromNullable(culture));
    }

    public Agent replaceDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates) {
        return new Agent(this.name, this.attribution, this.culture, DefaultConstructionValidator.getInstance().validateDates(dates), this.role, NopConstructionValidator.getInstance());
    }

    public Agent replaceDates(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates> dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public Agent replaceName(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name) {
        return new Agent(DefaultConstructionValidator.getInstance().validateName(name), this.attribution, this.culture, this.dates, this.role, NopConstructionValidator.getInstance());
    }

    public Agent replaceRole(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role) {
        return new Agent(this.name, this.attribution, this.culture, this.dates, DefaultConstructionValidator.getInstance().validateRole(role), NopConstructionValidator.getInstance());
    }

    public Agent replaceRole(final org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole role) {
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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.agent.Agent");
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
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates _iter0 : getDates().get()) {
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

    private final org.dressdiscover.api.vocabularies.vra_core.agent.AgentName name;

    private final com.google.common.base.Optional<String> attribution;

    private final com.google.common.base.Optional<String> culture;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentDates>> dates;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.agent.AgentRole> role;
}
