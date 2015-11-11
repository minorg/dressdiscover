package net.lab1318.costume.gui.models.agent;

/**
 * VRA Core 4.0 agent role= attribute
 */
public class AgentRoleBean {
    public AgentRoleBean() {
        text = null;
        refid = null;
        vocab = null;
    }

    public AgentRoleBean(final net.lab1318.costume.api.models.agent.AgentRole other) {
        this.text = other.getText();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentRoleBean)) {
            return false;
        }

        final AgentRoleBean other = (AgentRoleBean)otherObject;
        return
            getText().equals(other.getText()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    public String getRefid() {
        return refid;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getText().hashCode();
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

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("text", getText()).add("refid", getRefid()).add("vocab", getVocab()).toString();
    }

    private String text;

    private String refid;

    private net.lab1318.costume.api.models.Vocab vocab;
}
