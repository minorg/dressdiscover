package net.lab1318.costume.gui.models.material;

/**
 * VRA Core 4.0 materialSet element
 */
public class MaterialSetBean {
    public MaterialSetBean() {
        materials = null;
        display = null;
        notes = null;
    }

    public MaterialSetBean(final net.lab1318.costume.api.models.material.MaterialSet other) {
        this.materials = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.material.Material>, java.util.List<net.lab1318.costume.gui.models.material.MaterialBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.material.MaterialBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.material.Material> other) {
                final java.util.List<net.lab1318.costume.gui.models.material.MaterialBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.material.MaterialBean>();
                for (final net.lab1318.costume.api.models.material.Material element : other) {
                    copy.add(new net.lab1318.costume.gui.models.material.MaterialBean(element));
                }
                return copy;
            }
        }).apply(other.getMaterials());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MaterialSetBean)) {
            return false;
        }

        final MaterialSetBean other = (MaterialSetBean)otherObject;
        return
            getMaterials().equals(other.getMaterials()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public String getDisplay() {
        return display;
    }

    public java.util.List<net.lab1318.costume.gui.models.material.MaterialBean> getMaterials() {
        return materials;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMaterials().hashCode();
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

    public void setMaterials(final java.util.List<net.lab1318.costume.gui.models.material.MaterialBean> materials) {
        this.materials = materials;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("materials", getMaterials()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.material.MaterialBean> materials;

    private String display;

    private String notes;
}
