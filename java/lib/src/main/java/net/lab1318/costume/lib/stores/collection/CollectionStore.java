package net.lab1318.costume.lib.stores.collection;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;

public interface CollectionStore {
    public boolean deleteCollectionById(CollectionId collectionId, Logger logger, Marker logMarker) throws IOException;

    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException;

    public Collection getCollectionById(final CollectionId collectionId, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException;

    public ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException;

    public void putCollection(final Collection collection, final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException;
}
