namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object_id.thrift"

struct ObjectQuery {
	optional collection_id.CollectionId include_collection_id;
	optional institution_id.InstitutionId include_institution_id;
	optional object_id.ObjectId more_like_object_id;
	// @validation {"minLength": 1}
	optional string query_string;
}
