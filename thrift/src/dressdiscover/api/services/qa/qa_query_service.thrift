namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/answer.thrift"
include "dressdiscover/api/models/qa/qa_object.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/qa_user_id.thrift"
include "dressdiscover/api/models/qa/question.thrift"
include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_set.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/qa/no_such_object_exception.thrift"
include "dressdiscover/api/services/qa/no_such_question_exception.thrift"
include "dressdiscover/api/services/qa/no_such_question_set_exception.thrift"

service QaQueryService {
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

    qa_object.QaObject
    get_object_by_id(
        qa_object_id.QaObjectId id
    ) throws (
        io_exception.IoException e1,
        no_such_object_exception.NoSuchObjectException e2
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

    list<question.Question>
    get_questions(
        list<question_id.QuestionId> ids
    ) throws (
        io_exception.IoException e1,
        no_such_question_exception.NoSuchQuestionException e2
    );
}
