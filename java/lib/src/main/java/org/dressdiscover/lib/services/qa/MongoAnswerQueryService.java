package org.dressdiscover.lib.services.qa;

import static com.google.common.base.Preconditions.checkNotNull;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.dressdiscover.api.models.qa.Answer;
import org.dressdiscover.api.models.qa.QaObjectId;
import org.dressdiscover.api.models.qa.QaUserId;
import org.dressdiscover.api.models.qa.QuestionId;
import org.dressdiscover.api.models.qa.QuestionSetId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.qa.AnswerQueryService;
import org.dressdiscover.api.services.qa.LoggingAnswerQueryService.Markers;
import org.dressdiscover.lib.stores.qa.AnswerMongoCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.ModelEntryIterator;
import org.thryft.waf.lib.stores.mongodb.BsonModelEntry;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.BasicDBList;

@Singleton
class MongoAnswerQueryService implements AnswerQueryService {
    @Inject
    MongoAnswerQueryService(final AnswerMongoCollection store) {
        this.store = checkNotNull(store);
    }

    @Override
    public ImmutableList<Answer> getAnswers(final QaObjectId objectId, final QuestionSetId questionSetId,
            final Optional<ImmutableList<QuestionId>> questionIds, final Optional<QaUserId> userId) throws IoException {
        final Document filter = new Document();
        filter.put(Answer.FieldMetadata.OBJECT_ID.getThriftProtocolKey(), new ObjectId(objectId.toString()));
        filter.put(Answer.FieldMetadata.QUESTION_SET_ID.getThriftProtocolKey(), new ObjectId(questionSetId.toString()));
        if (questionIds.isPresent()) {
            final BasicDBList questionIdFilters = new BasicDBList();
            for (final QuestionId questionId : questionIds.get()) {
                questionIdFilters.add(new Document(Answer.FieldMetadata.QUESTION_ID.getThriftProtocolKey(),
                        new ObjectId(questionId.toString())));
            }
            if (!questionIdFilters.isEmpty()) {
                filter.put("$or", questionIdFilters);
            }
        }
        if (userId.isPresent()) {
            filter.put(Answer.FieldMetadata.USER_ID.getThriftProtocolKey(), userId.get().toString());
        }

        final ImmutableList.Builder<Answer> resultBuilder = ImmutableList.builder();
        try (ModelEntryIterator<IoException, BsonModelEntry<Answer>> modelEntryI = store.getModels(Markers.GET_ANSWERS,
                store.find().filter(filter))) {
            while (modelEntryI.hasNext()) {
                try {
                    resultBuilder.add(modelEntryI.next().getModel());
                } catch (final InvalidModelException e) {
                    logger.warn(Markers.GET_ANSWERS, "invalid answer: {}",
                            org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(e));
                }
            }
        }
        return resultBuilder.build();
    }

    private final AnswerMongoCollection store;
    private final static Logger logger = LoggerFactory.getLogger(MongoAnswerQueryService.class);
}
