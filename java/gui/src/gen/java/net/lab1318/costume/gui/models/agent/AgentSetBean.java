package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agentSet element
 */
public class AgentSetBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENTS("agents", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.agent.AgentBean>>() {}, true, 1, "agents", org.thryft.protocol.Type.LIST),
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
            case "agents": return AGENTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "agents": return AGENTS;
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

    public AgentSetBean() {
        agents = null;
        display = null;
        notes = null;
    }

    public AgentSetBean(final net.lab1318.costume.api.models.agent.AgentSet other) {
        this.agents = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.Agent>, java.util.List<net.lab1318.costume.gui.models.agent.AgentBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.agent.AgentBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.Agent> other) {
                final java.util.List<net.lab1318.costume.gui.models.agent.AgentBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.agent.AgentBean>();
                for (final net.lab1318.costume.api.models.agent.Agent element : other) {
                    copy.add(new net.lab1318.costume.gui.models.agent.AgentBean(element));
                }
                return copy;
            }
        }).apply(other.getAgents());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentSetBean)) {
            return false;
        }

        final AgentSetBean other = (AgentSetBean)otherObject;
        return
            getAgents().equals(other.getAgents()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public java.util.List<net.lab1318.costume.gui.models.agent.AgentBean> getAgents() {
        return agents;
    }

    public String getDisplay() {
        return display;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAgents().hashCode();
        if (getDisplay() != null) {
            hashCode = 31 * hashCode + getDisplay().hashCode();
        }
        if (getNotes() != null) {
            hashCode = 31 * hashCode + getNotes().hashCode();
        }
        return hashCode;
    }

    public void setAgents(final java.util.List<net.lab1318.costume.gui.models.agent.AgentBean> agents) {
        this.agents = agents;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agents", getAgents()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.agent.AgentBean> agents;

    private String display;

    private String notes;
}