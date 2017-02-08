namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/question_set_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchQuestionSetException {
    optional question_set_id.QuestionSetId id;
}
