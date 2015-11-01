package net.lab1318.costume.gui.models.collection;

public class CollectionEntryBean {
    public CollectionEntryBean() {
        id = null;
        model = null;
    }

    public CollectionEntryBean(final net.lab1318.costume.api.models.collection.CollectionEntry other) {
        this.id = other.getId();
        this.model = new net.lab1318.costume.gui.models.collection.CollectionBean(other.getModel());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof CollectionEntryBean)) {
            return false;
        }

        final CollectionEntryBean other = (CollectionEntryBean)otherObject;
        return
            getId().equals(other.getId()) &&
            getModel().equals(other.getModel());
    }

    public net.lab1318.costume.api.models.collection.CollectionId getId() {
        return id;
    }

    public net.lab1318.costume.gui.models.collection.CollectionBean getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        hashCode = 31 * hashCode + getModel().hashCode();
        return hashCode;
    }

    public void setId(final net.lab1318.costume.api.models.collection.CollectionId id) {
        this.id = id;
    }

    public void setModel(final net.lab1318.costume.gui.models.collection.CollectionBean model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("model", getModel()).toString();
    }

    private net.lab1318.costume.api.models.collection.CollectionId id;

    private net.lab1318.costume.gui.models.collection.CollectionBean model;
}
