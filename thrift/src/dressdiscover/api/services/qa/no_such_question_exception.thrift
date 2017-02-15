namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/question_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchQuestionException
exception NoSuchQuestionException {
    optional question_id.QuestionId id;
}
