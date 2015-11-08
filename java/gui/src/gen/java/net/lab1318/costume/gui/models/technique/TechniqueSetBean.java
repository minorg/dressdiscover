package net.lab1318.costume.gui.models.technique;

/**
 * VRA Core 4.0 techniqueSet element
 */
public class TechniqueSetBean {
    public TechniqueSetBean() {
        techniques = null;
        display = null;
        notes = null;
    }

    public TechniqueSetBean(final net.lab1318.costume.api.models.technique.TechniqueSet other) {
        this.techniques = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.technique.Technique>, java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.technique.Technique> other) {
                final java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.technique.TechniqueBean>();
                for (final net.lab1318.costume.api.models.technique.Technique element : other) {
                    copy.add(new net.lab1318.costume.gui.models.technique.TechniqueBean(element));
                }
                return copy;
            }
        }).apply(other.getTechniques());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TechniqueSetBean)) {
            return false;
        }

        final TechniqueSetBean other = (TechniqueSetBean)otherObject;
        return
            getTechniques().equals(other.getTechniques()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public String getDisplay() {
        return display;
    }

    public String getNotes() {
        return notes;
    }

    public java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean> getTechniques() {
        return techniques;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTechniques().hashCode();
        if (getDisplay() != null) {
            hashCode = 31 * hashCode + getDisplay().hashCode();
        }
        if (getNotes() != null) {
            hashCode = 31 * hashCode + getNotes().hashCode();
        }
        return hashCode;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public void setTechniques(final java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean> techniques) {
        this.techniques = techniques;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("techniques", getTechniques()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.technique.TechniqueBean> techniques;

    private String display;

    private String notes;
}
