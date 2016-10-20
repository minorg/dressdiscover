namespace * dressdiscover.api.vocabularies.vra_core.relation

include "dressdiscover/api/models/object/object_id.thrift"
include "dressdiscover/api/vocabularies/vra_core/relation/relation_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 relation element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Relation {
	1: relation_type.RelationType type;

	2: optional url.Url href;

	// @validation {"minLength": 1}
	3: optional set<object_id.ObjectId> relids;

	// @validation {"minLength": 1}
	4: optional string text;
}