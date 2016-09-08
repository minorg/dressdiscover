package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.slf4j.Logger;
import org.slf4j.Marker;

public abstract class AbstractReadOnlyCollectionStore implements CollectionStore {
    @Override
    public final boolean deleteCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }

    @Override
    public final void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }

    @Override
    public final void putCollection(final Collection collection, final CollectionId collectionId, final Logger logger,
            final Marker logMarker) {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }
}
