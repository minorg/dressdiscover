namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/answer.thrift"

service QaCommandService {
    void
    put_answer(
        answer.Answer answer
    ) throws (
        io_exception.IoException e
    );
}
