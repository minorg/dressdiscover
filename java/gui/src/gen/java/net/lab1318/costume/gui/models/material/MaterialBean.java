package net.lab1318.costume.gui.models.material;

/**
 * VRA Core 4.0 material element
 */
public class MaterialBean {
    public MaterialBean() {
        type = null;
        text = null;
        refid = null;
        vocab = null;
    }

    public MaterialBean(final net.lab1318.costume.api.models.material.Material other) {
        this.type = other.getType();
        this.text = other.getText();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MaterialBean)) {
            return false;
        }

        final MaterialBean other = (MaterialBean)otherObject;
        return
            getType().equals(other.getType()) &&
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

    public net.lab1318.costume.api.models.material.MaterialType getType() {
        return type;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
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

    public void setType(final net.lab1318.costume.api.models.material.MaterialType type) {
        this.type = type;
    }

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("text", getText()).add("refid", getRefid()).add("vocab", getVocab()).toString();
    }

    private net.lab1318.costume.api.models.material.MaterialType type;

    private String text;

    private String refid;

    private net.lab1318.costume.api.models.Vocab vocab;
}
