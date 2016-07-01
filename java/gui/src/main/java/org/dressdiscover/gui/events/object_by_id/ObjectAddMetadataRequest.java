package org.dressdiscover.gui.events.object_by_id;

import org.dressdiscover.api.models.object.ObjectId;

public final class ObjectAddMetadataRequest extends AbstractObjectByIdRequest {
    public ObjectAddMetadataRequest(final ObjectId objectId) {
        super(objectId);
    }
}
