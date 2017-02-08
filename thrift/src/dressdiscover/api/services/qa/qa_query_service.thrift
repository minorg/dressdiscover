namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/qa_object.thrift"
include "dressdiscover/api/models/qa/question_set.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/qa/no_such_question_set_exception.thrift"

service QaQueryService {
    set<qa_object.QaObject>
    get_objects(
    ) throws (
        io_exception.IoException e
    );

    map<question_set_id.QuestionSetId, question_set.QuestionSet>
    get_question_sets(
        set<question_set_id.QuestionSetId> ids
    ) throws (
        io_exception.IoException e1,
        no_such_question_set_exception.NoSuchQuestionSetException e2
    );
}
