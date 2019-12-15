namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/image/image.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/vocabularies/costume_core/gender/gender.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct ObjectSummary {
    collection_id.CollectionId collection_id;

    institution_id.InstitutionId institution_id;

	// Dublin Core title
	// @validation {"minLength": 1}
    string title;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> agent_name_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> categories;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> color_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> cultural_context_texts;

	// Dublin Core date
	// @validation {"minLength": 1}
    optional string date;

	// Dublin Core description
	// @validation {"minLength": 1}
    optional string description;

    optional gender.Gender gender;

	// @validation {"acceptance": true}
    optional bool hidden;

    optional image.Image image;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> location_name_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> material_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> relation_texts;

	// @validation {"minLength": 1}
    optional map<string, string> structure_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> subject_term_texts;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> technique_texts;

    optional url.Url url;

	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
    optional list<string> work_type_texts;
}
