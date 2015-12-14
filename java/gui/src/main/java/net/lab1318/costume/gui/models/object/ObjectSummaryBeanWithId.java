package net.lab1318.costume.gui.models.object;

import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;

public final class ObjectSummaryBeanWithId extends ObjectSummaryBean {
    public ObjectSummaryBeanWithId(final ObjectSummaryEntry other) {
        super(other.getModel());
        this.id = other.getId();
    }

    @Override
    public boolean equals(final java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObjectSummaryBeanWithId other = (ObjectSummaryBeanWithId) obj;
        if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public ObjectId getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public void setId(final ObjectId id) {
        this.id = id;
    }

    private ObjectId id;
}
