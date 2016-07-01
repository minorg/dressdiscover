package org.dressdiscover.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.object.LoggingObjectQueryService.Markers;
import org.dressdiscover.lib.stores.object.ObjectStoreCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@Singleton
public class StoreObjectQueryService implements ObjectQueryService {
    @Inject
    public StoreObjectQueryService(final ObjectStoreCache objectStoreCache) {
        this.objectStoreCache = checkNotNull(objectStoreCache);
    }

    @Override
    public Object getObjectById(final ObjectId id)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException, NoSuchObjectException {
        try {
            return objectStoreCache.getObjectStore(id).getObjectById(logger, Markers.GET_OBJECT_BY_ID, id);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_OBJECT_BY_ID, "invalid object model {}: ", id, e);
            throw new NoSuchObjectException();
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting object" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchObjectException();
        }
    }

    private final ObjectStoreCache objectStoreCache;
    private final static Logger logger = LoggerFactory.getLogger(StoreObjectQueryService.class);
}
