namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/models/object/object_facet_filters.thrift"

struct ObjectQuery {
	optional collection_id.CollectionId collection_id;

	// @validation {"minLength": 1}
	optional object_facet_filters.ObjectFacetFilters facet_filters;

	optional institution_id.InstitutionId institution_id;

	optional object_id.ObjectId more_like_object_id;

	optional set<object_id.ObjectId> object_ids;

	// @validation {"minLength": 1}
	optional string relation_text;

	// @validation {"minLength": 1}
	optional string query_string;

	// key=(value OR value...) AND key=(value OR value...)
	// @validation {"minLength": 1}
	optional	map<string, list<string>> structure_texts;

	// @validation {"minLength": 1}
	optional string work_type_text;
}
