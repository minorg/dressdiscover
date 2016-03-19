package net.lab1318.costume.gui.events.object_by_id;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.api.models.object.ObjectFacetFilters;
import net.lab1318.costume.api.models.object.ObjectId;

public final class ObjectElementSelectionRequest extends AbstractObjectByIdRequest {
    public ObjectElementSelectionRequest(final ObjectFacetFilters filter, final ObjectId objectId) {
        super(objectId);
        this.filter = checkNotNull(filter);
    }

    public ObjectFacetFilters getFilter() {
        return filter;
    }

    private final ObjectFacetFilters filter;
}
