package org.dressdiscover.gui.events.object_by_id;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.object.ObjectId;

import org.dressdiscover.api.models.object.ObjectFacetFilters;

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
