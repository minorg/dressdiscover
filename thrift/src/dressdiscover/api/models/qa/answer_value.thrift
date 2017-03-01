namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_value_id.thrift"

struct AnswerValue {
    1: optional i32 value_i32;
    2: optional question_value_id.QuestionValueId value_id;
    // @validation {"blank": false, "minLength": 1}
    3: optional string value_string;
}
