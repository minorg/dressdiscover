namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/answer.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"

struct AnswerSet {
    qa_object_id.QaObjectId object_id;
	question_set_id.QuestionSetId question_set_id;

    // @validation {"minLength": 1}
    optional list<answer.Answer> answers;
}
