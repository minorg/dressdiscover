namespace bean_java org.dressdiscover.gui.models.object
namespace java org.dressdiscover.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/gender/gender.thrift"
include "costume/api/models/image/image.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct ObjectSummary {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	// Dublin Core title
	// @validation {"minLength": 1}
	4: string title;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	6: optional list<string> agent_name_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	7: optional list<string> categories;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	17: optional list<string> color_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	18: optional list<string> cultural_context_texts;

	// Dublin Core date
	// @validation {"minLength": 1}
	12: optional string date;

	// Dublin Core description
	// @validation {"minLength": 1}
	5: optional string description;

	8: optional gender.Gender gender;

	// @validation {"acceptance": true}
	22: optional bool hidden;

	21: optional image.Image image;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	19: optional list<string> location_name_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	14: optional list<string> material_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	16: optional list<string> relation_texts;

	// @validation {"minLength": 1}
	20: optional map<string, string> structure_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	9: optional list<string> subject_term_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	15: optional list<string> technique_texts;

	13: optional url.Url url;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	11: optional list<string> work_type_texts;
}
