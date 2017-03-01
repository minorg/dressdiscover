namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_value_id.thrift"

struct AnswerValue {
    // 24-bit RGB color as a hex string: FF0000, no leading #
    // @validation {"blank": false, "maxLength": 6, "minLength": 6}
    4: optional string value_color;
    1: optional i32 value_i32;
    2: optional question_value_id.QuestionValueId value_id;
    // @validation {"blank": false, "minLength": 1}
    3: optional string value_string;
}
