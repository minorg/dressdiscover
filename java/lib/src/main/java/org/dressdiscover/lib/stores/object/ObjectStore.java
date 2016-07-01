package org.dressdiscover.lib.stores.object;

import java.io.IOException;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectId;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

public interface ObjectStore {
    public long deleteObjectsByCollectionId(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException;

    public Object getObjectById(final Logger logger, final Marker logMarker, final ObjectId objectId)
            throws InvalidModelException, IOException, NoSuchModelException;

    public Iterable<ObjectEntry> getObjectsByCollectionId(final CollectionId collectionId, final Logger logger,
            final Marker logMarker);

    public void putObject(final Logger logger, final Marker logMarker, final Object object, final ObjectId objectId)
            throws IOException;
}
