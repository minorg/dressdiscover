package org.dressdiscover.lib.stores.qa;

import org.bson.Document;
import org.dressdiscover.api.models.qa.Answer;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.stores.ModelMongoCollection;
import org.dressdiscover.lib.stores.MongoClient;
import org.thryft.CompoundType;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.api.models.BsonModelId;
import org.thryft.waf.api.services.NoSuchModelException;
import org.thryft.waf.lib.protocols.mongodb.MongoOutputProtocol;
import org.thryft.waf.lib.stores.mongodb.BsonModelEntry;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Mongo collection for Q&A answers.
 *
 * Index: db.answer.createIndex( { "1:object_id": 1, "2:question_id": 1,
 * "3:question_set_id": 1, "4:user_id": 1 }, { unique: true } )
 */
@Singleton
public class AnswerMongoCollection
        extends ModelMongoCollection<Answer, BsonModelEntry<Answer>, BsonModelId, NoSuchModelException> {
    @Inject
    AnswerMongoCollection(final MongoClient client, final GlobalProperties properties) {
        super(client, "answer", "dressdiscover_" + properties.getEnvironment().name().toLowerCase(), (id, iprot,
                unknownFieldCallback) -> new BsonModelEntry<>(id, Answer.readAsStruct(iprot, unknownFieldCallback)),
                (id) -> BsonModelId.parse(id));
    }

    @Override
    protected NoSuchModelException _newNoSuchModelException(final Optional<BsonModelId> id) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected final Document _serializeModel(final Answer answer) throws IoException {
        final MongoOutputProtocol oprot = new MongoOutputProtocol(OBJECT_ID_FIELDS);
        try {
            answer.writeAsStruct(oprot);
            return oprot.toBsonDocument();
        } catch (final OutputProtocolException e) {
            throw IoExceptions.wrap(e, "error serializing answer");
        }
    }

    private final static ImmutableList<CompoundType.FieldMetadata> OBJECT_ID_FIELDS = ImmutableList
            .of(Answer.FieldMetadata.OBJECT_ID, Answer.FieldMetadata.QUESTION_ID, Answer.FieldMetadata.QUESTION_SET_ID);
}
