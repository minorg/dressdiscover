package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agent.dates element
 */
public class AgentDatesBean {
    public AgentDatesBean() {
        type = null;
        earliestDate = null;
        latestDate = null;
    }

    public AgentDatesBean(final net.lab1318.costume.api.models.agent.AgentDates other) {
        this.type = other.getType();
        this.earliestDate = other.getEarliestDate().isPresent() ? other.getEarliestDate().get() : null;
        this.latestDate = other.getLatestDate().isPresent() ? other.getLatestDate().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentDatesBean)) {
            return false;
        }

        final AgentDatesBean other = (AgentDatesBean)otherObject;
        return
            getType().equals(other.getType()) &&
            getEarliestDate().equals(other.getEarliestDate()) &&
            getLatestDate().equals(other.getLatestDate());
    }

    public java.util.Date getEarliestDate() {
        return earliestDate;
    }

    public java.util.Date getLatestDate() {
        return latestDate;
    }

    public net.lab1318.costume.api.models.agent.AgentDatesType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getEarliestDate() != null) {
            hashCode = 31 * hashCode + getEarliestDate().hashCode();
        }
        if (getLatestDate() != null) {
            hashCode = 31 * hashCode + getLatestDate().hashCode();
        }
        return hashCode;
    }

    public void setEarliestDate(final java.util.Date earliestDate) {
        this.earliestDate = earliestDate;
    }

    public void setLatestDate(final java.util.Date latestDate) {
        this.latestDate = latestDate;
    }

    public void setType(final net.lab1318.costume.api.models.agent.AgentDatesType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("earliest_date", getEarliestDate()).add("latest_date", getLatestDate()).toString();
    }

    private net.lab1318.costume.api.models.agent.AgentDatesType type;

    private java.util.Date earliestDate;

    private java.util.Date latestDate;
}
