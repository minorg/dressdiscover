package net.lab1318.costume.gui.models.rights;

/**
 * VRA Core 4.0 rights element
 */
public class RightsBean {
    public RightsBean() {
        rightsHolder = null;
        text = null;
        type = null;
        notes = null;
    }

    public RightsBean(final net.lab1318.costume.api.models.rights.Rights other) {
        this.rightsHolder = other.getRightsHolder();
        this.text = other.getText();
        this.type = other.getType();
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RightsBean)) {
            return false;
        }

        final RightsBean other = (RightsBean)otherObject;
        return
            getRightsHolder().equals(other.getRightsHolder()) &&
            getText().equals(other.getText()) &&
            getType().equals(other.getType()) &&
            getNotes().equals(other.getNotes());
    }

    public String getNotes() {
        return notes;
    }

    public String getRightsHolder() {
        return rightsHolder;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.rights.RightsType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRightsHolder().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        hashCode = 31 * hashCode + getType().ordinal();
        if (getNotes() != null) {
            hashCode = 31 * hashCode + getNotes().hashCode();
        }
        return hashCode;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public void setRightsHolder(final String rightsHolder) {
        this.rightsHolder = rightsHolder;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.rights.RightsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights_holder", getRightsHolder()).add("text", getText()).add("type", getType()).add("notes", getNotes()).toString();
    }

    private String rightsHolder;

    private String text;

    private net.lab1318.costume.api.models.rights.RightsType type;

    private String notes;
}
