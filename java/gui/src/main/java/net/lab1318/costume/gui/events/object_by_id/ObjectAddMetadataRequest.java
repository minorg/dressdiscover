package net.lab1318.costume.gui.events.object_by_id;

import net.lab1318.costume.api.models.object.ObjectId;

public final class ObjectAddMetadataRequest extends AbstractObjectByIdRequest {
    public ObjectAddMetadataRequest(final ObjectId objectId) {
        super(objectId);
    }
}
