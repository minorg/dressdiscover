package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agent element
 */
public class AgentBean {
    public AgentBean() {
        name = null;
        attribution = null;
        culture = null;
        dates = null;
        role = null;
    }

    public AgentBean(final net.lab1318.costume.api.models.agent.Agent other) {
        this.name = new net.lab1318.costume.gui.models.agent.AgentNameBean(other.getName());
        this.attribution = other.getAttribution().isPresent() ? other.getAttribution().get() : null;
        this.culture = other.getCulture().isPresent() ? other.getCulture().get() : null;
        this.dates = other.getDates().isPresent() ? (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates>, java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.agent.AgentDates> other) {
                final java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.agent.AgentDatesBean>();
                for (final net.lab1318.costume.api.models.agent.AgentDates element : other) {
                    copy.add(new net.lab1318.costume.gui.models.agent.AgentDatesBean(element));
                }
                return copy;
            }
        }).apply(other.getDates().get()) : null;
        this.role = other.getRole().isPresent() ? new net.lab1318.costume.gui.models.agent.AgentRoleBean(other.getRole().get()) : null;
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
            getAttribution().equals(other.getAttribution()) &&
            getCulture().equals(other.getCulture()) &&
            getDates().equals(other.getDates()) &&
            getRole().equals(other.getRole());
    }

    public String getAttribution() {
        return attribution;
    }

    public String getCulture() {
        return culture;
    }

    public java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean> getDates() {
        return dates;
    }

    public net.lab1318.costume.gui.models.agent.AgentNameBean getName() {
        return name;
    }

    public net.lab1318.costume.gui.models.agent.AgentRoleBean getRole() {
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

    public void setDates(final java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean> dates) {
        this.dates = dates;
    }

    public void setName(final net.lab1318.costume.gui.models.agent.AgentNameBean name) {
        this.name = name;
    }

    public void setRole(final net.lab1318.costume.gui.models.agent.AgentRoleBean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("attribution", getAttribution()).add("culture", getCulture()).add("dates", getDates()).add("role", getRole()).toString();
    }

    private net.lab1318.costume.gui.models.agent.AgentNameBean name;

    private String attribution;

    private String culture;

    private java.util.List<net.lab1318.costume.gui.models.agent.AgentDatesBean> dates;

    private net.lab1318.costume.gui.models.agent.AgentRoleBean role;
}
