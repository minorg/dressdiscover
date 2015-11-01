package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.notaweb.lib.stores.StringModelIdFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.InvalidCollectionIdException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionElasticSearchIndex;

@Singleton
public class ElasticSearchCollectionCommandService implements CollectionCommandService {
    private final static class CollectionIdFactory implements StringModelIdFactory<CollectionId> {
        public static CollectionIdFactory getInstance() {
            return instance;
        }

        @Override
        public CollectionId createModelId(final String id) {
            try {
                return CollectionId.parse(id);
            } catch (final InvalidCollectionIdException e) {
                throw new IllegalStateException(e);
            }
        }

        private final static CollectionIdFactory instance = new CollectionIdFactory();
    }

    @Inject
    public ElasticSearchCollectionCommandService(final CollectionElasticSearchIndex elasticSearchIndex) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
    }

    @Override
    public void deleteCollections() throws IoException {
        try {
            elasticSearchIndex.deleteIndex(logger, Markers.DELETE_COLLECTIONS);
            elasticSearchIndex.createIndex(logger, Markers.DELETE_COLLECTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting objects");
        }
    }

    @Override
    public CollectionId postCollection(final Collection collection) throws IoException {
        try {
            return elasticSearchIndex.postModel(logger, Markers.POST_COLLECTION, collection,
                    CollectionIdFactory.getInstance());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error posting object");
        }
    }

    private final CollectionElasticSearchIndex elasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchCollectionCommandService.class);
}
