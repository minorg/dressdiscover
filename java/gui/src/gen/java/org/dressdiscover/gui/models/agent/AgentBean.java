package org.dressdiscover.gui.models.agent;

/**
 * VRA Core 4.0 agent element
 */
public class AgentBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.agent.AgentNameBean>() {}, true, 1, "name", org.thryft.protocol.Type.STRUCT),
        ATTRIBUTION("attribution", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "attribution", org.thryft.protocol.Type.STRING),
        CULTURE("culture", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "culture", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean>>() {}, false, 4, "dates", org.thryft.protocol.Type.LIST),
        ROLE("role", new com.google.common.reflect.TypeToken<org.dressdiscover.gui.models.agent.AgentRoleBean>() {}, false, 5, "role", org.thryft.protocol.Type.STRUCT);

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

    public AgentBean() {
        name = null;
        attribution = null;
        culture = null;
        dates = null;
        role = null;
    }

    public AgentBean(final org.dressdiscover.api.models.agent.Agent other) {
        this.name = new org.dressdiscover.gui.models.agent.AgentNameBean(other.getName());
        this.attribution = other.getAttribution().isPresent() ? other.getAttribution().get() : null;
        this.culture = other.getCulture().isPresent() ? other.getCulture().get() : null;
        this.dates = other.getDates().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.agent.AgentDates>, java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean>>() {
            @Override
            public java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean> apply(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.agent.AgentDates> other) {
                final java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean> copy = new java.util.ArrayList<org.dressdiscover.gui.models.agent.AgentDatesBean>();
                for (final org.dressdiscover.api.models.agent.AgentDates element : other) {
                    copy.add(new org.dressdiscover.gui.models.agent.AgentDatesBean(element));
                }
                return copy;
            }
        }).apply(other.getDates().get()) : null;
        this.role = other.getRole().isPresent() ? new org.dressdiscover.gui.models.agent.AgentRoleBean(other.getRole().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentBean)) {
            return false;
        }

        final AgentBean other = (AgentBean)otherObject;
        return
            getName().equals(other.getName()) &&
            ((getAttribution() != null && other.getAttribution() != null) ? (getAttribution().equals(other.getAttribution())) : (getAttribution() == null && other.getAttribution() == null)) &&
            ((getCulture() != null && other.getCulture() != null) ? (getCulture().equals(other.getCulture())) : (getCulture() == null && other.getCulture() == null)) &&
            ((getDates() != null && other.getDates() != null) ? (getDates().equals(other.getDates())) : (getDates() == null && other.getDates() == null)) &&
            ((getRole() != null && other.getRole() != null) ? (getRole().equals(other.getRole())) : (getRole() == null && other.getRole() == null));
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

    public String getAttribution() {
        return attribution;
    }

    public String getCulture() {
        return culture;
    }

    public java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean> getDates() {
        return dates;
    }

    public org.dressdiscover.gui.models.agent.AgentNameBean getName() {
        return name;
    }

    public org.dressdiscover.gui.models.agent.AgentRoleBean getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        if (getAttribution() != null) {
            hashCode = 31 * hashCode + getAttribution().hashCode();
        }
        if (getCulture() != null) {
            hashCode = 31 * hashCode + getCulture().hashCode();
        }
        if (getDates() != null) {
            hashCode = 31 * hashCode + getDates().hashCode();
        }
        if (getRole() != null) {
            hashCode = 31 * hashCode + getRole().hashCode();
        }
        return hashCode;
    }

    public void setAttribution(final String attribution) {
        this.attribution = attribution;
    }

    public void setCulture(final String culture) {
        this.culture = culture;
    }

    public void setDates(final java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean> dates) {
        this.dates = dates;
    }

    public void setName(final org.dressdiscover.gui.models.agent.AgentNameBean name) {
        this.name = name;
    }

    public void setRole(final org.dressdiscover.gui.models.agent.AgentRoleBean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("attribution", getAttribution()).add("culture", getCulture()).add("dates", getDates()).add("role", getRole()).toString();
    }

    private org.dressdiscover.gui.models.agent.AgentNameBean name;

    private String attribution;

    private String culture;

    private java.util.List<org.dressdiscover.gui.models.agent.AgentDatesBean> dates;

    private org.dressdiscover.gui.models.agent.AgentRoleBean role;
}
