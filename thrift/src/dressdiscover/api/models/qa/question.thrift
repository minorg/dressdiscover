namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_value.thrift"

struct Question {
	question_id.QuestionId id;

    // @validation {"blank": false, "minLength": 1}
    string text;

    // @validation {"minLength": 1}
    optional list<question_value.QuestionValue> values;
}
