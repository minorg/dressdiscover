package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;

public interface CollectionStore {
    public boolean deleteCollectionById(CollectionId collectionId, Marker logMarker) throws IoException;

    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Marker logMarker)
            throws IoException;

    public Collection getCollectionById(final CollectionId collectionId, final Marker logMarker)
            throws InvalidModelException, IoException, NoSuchCollectionException;

    public ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Marker logMarker) throws IoException;

    public void putCollection(final Collection collection, final CollectionId collectionId, final Marker logMarker)
            throws IoException;
}
