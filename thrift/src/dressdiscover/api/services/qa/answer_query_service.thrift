namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/answer.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/qa_user_id.thrift"
include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service AnswerQueryService {
    list<answer.Answer>
    get_answers(
        qa_object_id.QaObjectId object_id,
        question_set_id.QuestionSetId question_set_id,
        // @validation {"minLength": 1}
        optional list<question_id.QuestionId> question_ids,
        optional qa_user_id.QaUserId user_id
    ) throws (
        io_exception.IoException e
    );
}
