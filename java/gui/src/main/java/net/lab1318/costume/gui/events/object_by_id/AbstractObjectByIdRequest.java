package net.lab1318.costume.gui.events.object_by_id;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.api.models.object.ObjectId;

abstract class AbstractObjectByIdRequest {
    protected AbstractObjectByIdRequest(final ObjectId objectId) {
        this.objectId = checkNotNull(objectId);
    }

    public final ObjectId getObjectId() {
        return objectId;
    }

    private final ObjectId objectId;
}
