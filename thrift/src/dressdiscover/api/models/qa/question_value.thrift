namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/qa_image.thrift"
include "dressdiscover/api/models/qa/question_value_id.thrift"

struct QuestionValue {
	question_value_id.QuestionValueId id;
	// @validation {"blank": false, "minLength": 1}
	string text;
    optional qa_image.QaImage image;
}
