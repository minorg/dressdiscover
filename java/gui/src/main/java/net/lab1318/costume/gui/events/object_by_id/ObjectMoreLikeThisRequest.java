package net.lab1318.costume.gui.events.object_by_id;

import net.lab1318.costume.api.models.object.ObjectId;

public final class ObjectMoreLikeThisRequest extends AbstractObjectByIdRequest {
    public ObjectMoreLikeThisRequest(final ObjectId objectId) {
        super(objectId);
    }
}
