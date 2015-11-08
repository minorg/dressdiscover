package net.lab1318.costume.gui.models.inscription;

public class InscriptionTextBean {
    public InscriptionTextBean() {
        type = null;
        text = null;
        lang = null;
    }

    public InscriptionTextBean(final net.lab1318.costume.api.models.inscription.InscriptionText other) {
        this.type = other.getType();
        this.text = other.getText();
        this.lang = other.getLang().isPresent() ? other.getLang().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionTextBean)) {
            return false;
        }

        final InscriptionTextBean other = (InscriptionTextBean)otherObject;
        return
            getType().equals(other.getType()) &&
            getText().equals(other.getText()) &&
            getLang().equals(other.getLang());
    }

    public String getLang() {
        return lang;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        hashCode = 31 * hashCode + getText().hashCode();
        if (getLang() != null) {
            hashCode = 31 * hashCode + getLang().hashCode();
        }
        return hashCode;
    }

    public void setLang(final String lang) {
        this.lang = lang;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("text", getText()).add("lang", getLang()).toString();
    }

    private net.lab1318.costume.api.models.inscription.InscriptionTextType type;

    private String text;

    private String lang;
}
