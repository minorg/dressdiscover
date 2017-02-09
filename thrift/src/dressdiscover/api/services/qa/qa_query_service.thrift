namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/answer_set.thrift"
include "dressdiscover/api/models/qa/qa_object.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/qa_user_id.thrift"
include "dressdiscover/api/models/qa/question_set.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/qa/no_such_question_set_exception.thrift"

service QaQueryService {
    answer_set.AnswerSet
    get_answer_set(
        qa_object_id.QaObjectId object_id,
        question_set_id.QuestionSetId question_set_id,
        qa_user_id.QaUserId user_id
    );

    list<qa_object.QaObject>
    get_objects(
    ) throws (
        io_exception.IoException e
    );

    list<question_set.QuestionSet>
    get_question_sets(
        list<question_set_id.QuestionSetId> ids
    ) throws (
        io_exception.IoException e1,
        no_such_question_set_exception.NoSuchQuestionSetException e2
    );
}
