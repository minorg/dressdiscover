namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/qa_user_id.thrift"
include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_value_id.thrift"

struct Answer {
    qa_object_id.QaObjectId object_id;
	question_id.QuestionId question_id;
    qa_user_id.QaUserId user_id;

    // @validation {"minLength": 1}
    optional list<question_value_id.QuestionValueId> selected_values;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}
