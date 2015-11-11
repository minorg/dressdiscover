package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agentSet element
 */
public class AgentSetBean {
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
