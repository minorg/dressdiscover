package net.lab1318.costume.gui.models.inscription;

public class InscriptionTextBean {
    public InscriptionTextBean() {
        type = null;
        value = null;
        lang = null;
    }

    public InscriptionTextBean(final net.lab1318.costume.api.models.inscription.InscriptionText other) {
        this.type = other.getType();
        this.value = other.getValue();
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
            getValue().equals(other.getValue()) &&
            getLang().equals(other.getLang());
    }

    public String getLang() {
        return lang;
    }

    public net.lab1318.costume.api.models.inscription.InscriptionTextType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        hashCode = 31 * hashCode + getValue().hashCode();
        if (getLang() != null) {
            hashCode = 31 * hashCode + getLang().hashCode();
        }
        return hashCode;
    }

    public void setLang(final String lang) {
        this.lang = lang;
    }

    public void setType(final net.lab1318.costume.api.models.inscription.InscriptionTextType type) {
        this.type = type;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("value", getValue()).add("lang", getLang()).toString();
    }

    private net.lab1318.costume.api.models.inscription.InscriptionTextType type;

    private String value;

    private String lang;
}
