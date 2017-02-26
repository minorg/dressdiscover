namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/answer.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service AnswerCommandService {
    void
    delete_answers(
    ) throws (
        io_exception.IoException e
    );

    void
    put_answer(
        answer.Answer answer
    ) throws (
        io_exception.IoException e
    );
}
