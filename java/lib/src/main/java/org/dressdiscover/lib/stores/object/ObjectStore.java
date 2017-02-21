package org.dressdiscover.lib.stores.object;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.object.NoSuchObjectException;
import org.slf4j.Marker;
import org.thryft.waf.lib.store.InvalidModelException;

public interface ObjectStore {
    public int deleteObjectsByCollectionId(final CollectionId collectionId, final Marker logMarker) throws IoException;

    public Object getObjectById(final Marker logMarker, final ObjectId objectId)
            throws InvalidModelException, IoException, NoSuchObjectException;

    public Iterable<ObjectEntry> getObjectsByCollectionId(final CollectionId collectionId, final Marker logMarker);

    public void putObject(final Marker logMarker, final Object object, final ObjectId objectId) throws IoException;
}
