namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/answer_value.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/qa_user_id.thrift"
include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Answer {
    1: qa_object_id.QaObjectId object_id;
	2: question_id.QuestionId question_id;
	3: question_set_id.QuestionSetId question_set_id;
    4: qa_user_id.QaUserId user_id;

    // @validation {"minLength": 1}
    5: list<answer_value.AnswerValue> values;
}
