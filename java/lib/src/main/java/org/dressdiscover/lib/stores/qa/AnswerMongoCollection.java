package org.dressdiscover.lib.stores.qa;

import org.dressdiscover.api.models.qa.Answer;
import org.dressdiscover.api.services.IoException;
import org.thryft.waf.api.models.BsonModelId;
import org.thryft.waf.api.services.NoSuchModelException;
import org.thryft.waf.lib.stores.mongodb.BsonModelEntry;
import org.thryft.waf.lib.stores.mongodb.ModelMongoCollection;

import com.google.inject.Singleton;

@Singleton
class AnswerMongoCollection
        extends ModelMongoCollection<IoException, Answer, BsonModelEntry<Answer>, BsonModelId, NoSuchModelException> {

}
