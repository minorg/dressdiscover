package net.lab1318.costume.gui.models.institution;

public class InstitutionEntryBean {
    public InstitutionEntryBean() {
        id = null;
        model = null;
    }

    public InstitutionEntryBean(final net.lab1318.costume.api.models.institution.InstitutionEntry other) {
        this.id = other.getId();
        this.model = new net.lab1318.costume.gui.models.institution.InstitutionBean(other.getModel());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InstitutionEntryBean)) {
            return false;
        }

        final InstitutionEntryBean other = (InstitutionEntryBean)otherObject;
        return
            getId().equals(other.getId()) &&
            getModel().equals(other.getModel());
    }

    public net.lab1318.costume.api.models.institution.InstitutionId getId() {
        return id;
    }

    public net.lab1318.costume.gui.models.institution.InstitutionBean getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public void setId(final net.lab1318.costume.api.models.institution.InstitutionId id) {
        this.id = id;
    }

    public void setModel(final net.lab1318.costume.gui.models.institution.InstitutionBean model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    private net.lab1318.costume.api.models.institution.InstitutionId id;

    private net.lab1318.costume.gui.models.institution.InstitutionBean model;
}
