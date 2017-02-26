package org.dressdiscover.lib.stores;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.services.IoExceptions;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.api.models.BsonModelId;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.api.models.ModelEntry;
import org.thryft.waf.api.services.NoSuchModelException;
import org.thryft.waf.lib.stores.StringModelIdFactory;

import com.mongodb.MongoException;

public abstract class ModelMongoCollection<ModelT extends Model, ModelEntryT extends ModelEntry<ModelT, ModelIdT>, ModelIdT extends BsonModelId, NoSuchModelExceptionT extends NoSuchModelException>
        extends
        org.thryft.waf.lib.stores.mongodb.ModelMongoCollection<IoException, ModelT, ModelEntryT, ModelIdT, NoSuchModelExceptionT> {
    protected ModelMongoCollection(final MongoClient client, final String collectionName, final String dbName,
            final ModelEntryFactory<ModelEntryT, ModelIdT> modelEntryFactory,
            final StringModelIdFactory<ModelIdT> modelIdFactory) {
        super(client, collectionName, dbName, modelEntryFactory, modelIdFactory);
    }

    @Override
    protected final IoException _newIoException(final MongoException cause, final String message) {
        return IoExceptions.wrap(cause, message);
    }

    @Override
    protected IoException _newIoException(final OutputProtocolException cause, final String message) {
        return IoExceptions.wrap(cause, message);
    }
}
