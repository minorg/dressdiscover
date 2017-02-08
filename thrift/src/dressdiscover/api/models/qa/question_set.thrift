namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"

struct QuestionSet {
    question_set_id.QuestionSetId id;

    // @validation {"minLength": 1}
    list<question.Question> questions;
}
