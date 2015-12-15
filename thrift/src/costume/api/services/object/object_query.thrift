namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/object/object_facet_filters.thrift"

struct ObjectQuery {
	optional collection_id.CollectionId collection_id;

	optional object_facet_filters.ObjectFacetFilters facet_filters;

	optional institution_id.InstitutionId institution_id;

	optional object_id.ObjectId more_like_object_id;

	// @validation {"minLength": 1}
	optional string query_string;
}