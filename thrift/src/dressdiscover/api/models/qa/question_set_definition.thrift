namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_definition.thrift"

struct QuestionSetDefinition {
    // @validation {"minLength": 1}
    list<question_definition.QuestionDefinition> questions;
}
