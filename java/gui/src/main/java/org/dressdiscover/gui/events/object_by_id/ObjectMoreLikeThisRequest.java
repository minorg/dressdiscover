package org.dressdiscover.gui.events.object_by_id;

import org.dressdiscover.api.models.object.ObjectId;

public final class ObjectMoreLikeThisRequest extends AbstractObjectByIdRequest {
    public ObjectMoreLikeThisRequest(final ObjectId objectId) {
        super(objectId);
    }
}
