package org.dressdiscover.lib.services.qa;

import static com.google.common.base.Preconditions.checkNotNull;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.dressdiscover.api.models.qa.Answer;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.qa.AnswerCommandService;
import org.dressdiscover.api.services.qa.LoggingAnswerCommandService.Markers;
import org.dressdiscover.lib.properties.Environment;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.stores.qa.AnswerMongoCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.api.models.BsonModelId;
import org.thryft.waf.api.services.NoSuchModelException;
import org.thryft.waf.lib.stores.DuplicateModelException;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.client.model.UpdateOptions;

@Singleton
class MongoAnswerCommandService implements AnswerCommandService {
    @Inject
    MongoAnswerCommandService(final GlobalProperties globalProperties, final AnswerMongoCollection store) {
        this.environment = globalProperties.getEnvironment();
        this.store = checkNotNull(store);
    }

    @Override
    public void deleteAnswers() throws IoException {
        switch (environment) {
        case DEV:
        case JENKINS:
            break;
        default:
            throw new IllegalStateException(environment.toString());
        }

        store.deleteModels(Markers.DELETE_ANSWERS);
    }

    @Override
    public void putAnswer(final Answer answer) throws IoException {
        try {
            store.postModel(Markers.PUT_ANSWER, answer);
            return;
        } catch (final DuplicateModelException e) {
        }

        final Document filter = new Document();
        filter.put(Answer.FieldMetadata.OBJECT_ID.getThriftProtocolKey(),
                new ObjectId(answer.getObjectId().toString()));
        filter.put(Answer.FieldMetadata.QUESTION_ID.getThriftProtocolKey(),
                new ObjectId(answer.getQuestionId().toString()));
        filter.put(Answer.FieldMetadata.QUESTION_SET_ID.getThriftProtocolKey(),
                new ObjectId(answer.getQuestionSetId().toString()));
        filter.put(Answer.FieldMetadata.USER_ID.getThriftProtocolKey(), answer.getUserId().toString());

        BsonModelId answerId;
        try {
            answerId = store.getFirstModelId(Markers.PUT_ANSWER, store.find().filter(filter));
        } catch (final NoSuchModelException e) {
            logger.error(Markers.PUT_ANSWER, "could not find existing answer");
            return;
        }

        try {
            store.putModel(answerId, Markers.PUT_ANSWER, answer, new UpdateOptions());
        } catch (final NoSuchModelException e) {
            logger.error(Markers.PUT_ANSWER, "could not overwrite existing answer");
        }
    }

    private final Environment environment;
    private final AnswerMongoCollection store;
    private final Logger logger = LoggerFactory.getLogger(MongoAnswerCommandService.class);
}
