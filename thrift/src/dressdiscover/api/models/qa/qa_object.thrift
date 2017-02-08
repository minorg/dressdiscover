namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/qa_image.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/models/qa/question_set_id.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct QaObject {
    qa_object_id.QaObjectId id;
    qa_image.QaImage image;
    set<question_set_id.QuestionSetId> question_set_ids;
}
