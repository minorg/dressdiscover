namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"

struct QuestionSet {
    question_set_id.QuestionSetId id;

    // @validation {"minLength": 1}
    list<question_id.QuestionId> question_ids;

    // @validation {"blank": false, "minLength": 1}
    string title;
}
