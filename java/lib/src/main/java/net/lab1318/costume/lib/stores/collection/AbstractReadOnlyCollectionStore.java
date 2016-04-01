package net.lab1318.costume.lib.stores.collection;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;

public abstract class AbstractReadOnlyCollectionStore implements CollectionStore {
    @Override
    public boolean deleteCollectionById(final CollectionId collectionId, final Logger logger, final Marker logMarker)
            throws IOException {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }

    @Override
    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }

    @Override
    public void putCollection(final Collection collection, final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException {
        throw new UnsupportedOperationException(getClass().getName() + " is read-only");
    }
}
