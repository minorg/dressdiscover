package net.lab1318.costume.lib.stores.object;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;

public interface ObjectStore {
    public long deleteObjectsByCollectionId(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException;

    public Object getObjectById(final Logger logger, final Marker logMarker, final ObjectId objectId)
            throws InvalidModelException, IOException, NoSuchModelException;

    public Iterable<ObjectEntry> getObjects(final Logger logger, final Marker logMarker);

    public void putObject(final Logger logger, final Marker logMarker, final Object object, final ObjectId objectId)
            throws IOException;
}
