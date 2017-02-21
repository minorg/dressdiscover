namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_value_id.thrift"

struct AnswerValue {
    optional i32 value_i32;
    optional question_value_id.QuestionValueId value_id;
    // @validation {"blank": false, "minLength": 1}
    optional string value_string;
}
