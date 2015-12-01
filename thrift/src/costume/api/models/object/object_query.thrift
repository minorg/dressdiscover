namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/object/object_filters.thrift"
include "costume/api/models/object/object_id.thrift"

struct ObjectQuery {
	optional object_filters.ObjectFilters filters;

	optional object_id.ObjectId more_like_object_id;

	// @validation {"minLength": 1}
	optional string query_string;
}
