namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/question.thrift"
include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/qa/no_such_question_exception.thrift"

service QuestionQueryService {
    list<question.Question>
    get_questions(
        list<question_id.QuestionId> ids
    ) throws (
        io_exception.IoException e1,
        no_such_question_exception.NoSuchQuestionException e2
    );
}
