package net.lab1318.costume.gui.models.technique;

/**
 * VRA Core 4.0 technique element
 */
public class TechniqueBean {
    public TechniqueBean() {
        text = null;
        refid = null;
        vocab = null;
    }

    public TechniqueBean(final net.lab1318.costume.api.models.technique.Technique other) {
        this.text = other.getText();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TechniqueBean)) {
            return false;
        }

        final TechniqueBean other = (TechniqueBean)otherObject;
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
