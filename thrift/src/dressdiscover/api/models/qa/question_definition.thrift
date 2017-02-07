namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/question_id.thrift"
include "dressdiscover/api/models/qa/question_value_definition.thrift"

struct QuestionDefinition {
	question_id.QuestionId id;

    // @validation {"minLength": 1}
    optional list<question_value_definition.QuestionValueDefinition> values_;
}
