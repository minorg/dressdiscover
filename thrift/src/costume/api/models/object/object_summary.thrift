namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/gender/gender.thrift"
include "costume/api/models/image/image_version.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/url.thrift"

// @java_implements org.notaweb.api.models.Model
struct ObjectSummary {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	3: model_metadata.ModelMetadata model_metadata;

	// Dublin Core title
	// @validation {"minLength": 1}
	4: string title;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	6: optional list<string> agent_name_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	7: optional list<string> categories;

	// Dublin Core date
	// @validation {"minLength": 1}
	12: optional string date;

	// Dublin Core description
	// @validation {"minLength": 1}
	5: optional string description;

	8: optional gender.Gender gender;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	9: optional list<string> subject_term_texts;

	10: optional image_version.ImageVersion thumbnail;

	13: optional url.Url url;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	11: optional list<string> work_type_texts;
}