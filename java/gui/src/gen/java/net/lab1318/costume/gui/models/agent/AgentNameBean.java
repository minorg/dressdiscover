package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agent.name element
 */
public class AgentNameBean {
    public AgentNameBean() {
        text = null;
        type = null;
        refid = null;
        vocab = null;
    }

    public AgentNameBean(final net.lab1318.costume.api.models.agent.AgentName other) {
        this.text = other.getText();
        this.type = other.getType();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentNameBean)) {
            return false;
        }

        final AgentNameBean other = (AgentNameBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    public String getRefid() {
        return refid;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.agent.AgentNameType getType() {
        return type;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getRefid() != null) {
            hashCode = 31 * hashCode + getRefid().hashCode();
        }
        if (getVocab() != null) {
            hashCode = 31 * hashCode + getVocab().ordinal();
        }
        return hashCode;
    }

    public void setRefid(final String refid) {
        this.refid = refid;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.agent.AgentNameType type) {
        this.type = type;
    }

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("type", getType()).add("refid", getRefid()).add("vocab", getVocab()).toString();
    }

    private String text;

    private net.lab1318.costume.api.models.agent.AgentNameType type;

    private String refid;

    private net.lab1318.costume.api.models.Vocab vocab;
}
