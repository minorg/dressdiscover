package net.lab1318.costume.gui.models.object;

public class ObjectEntryBean {
    public ObjectEntryBean() {
        id = null;
        model = null;
    }

    public ObjectEntryBean(final net.lab1318.costume.api.models.object.ObjectEntry other) {
        this.id = other.getId();
        this.model = new net.lab1318.costume.gui.models.object.ObjectBean(other.getModel());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectEntryBean)) {
            return false;
        }

        final ObjectEntryBean other = (ObjectEntryBean)otherObject;
        return
            getId().equals(other.getId()) &&
            getModel().equals(other.getModel());
    }

    public net.lab1318.costume.api.models.object.ObjectId getId() {
        return id;
    }

    public net.lab1318.costume.gui.models.object.ObjectBean getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public void setId(final net.lab1318.costume.api.models.object.ObjectId id) {
        this.id = id;
    }

    public void setModel(final net.lab1318.costume.gui.models.object.ObjectBean model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    private net.lab1318.costume.api.models.object.ObjectId id;

    private net.lab1318.costume.gui.models.object.ObjectBean model;
}
