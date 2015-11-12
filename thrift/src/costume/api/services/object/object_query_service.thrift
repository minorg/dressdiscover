namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/models/object/object_query.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/object/get_objects_options.thrift"
include "costume/api/services/object/get_objects_result.thrift"
include "costume/api/services/object/no_such_object_exception.thrift"
include "thryft/native/u32.thrift"

service ObjectQueryService {
	object.Object
	get_object_by_id(
		object_id.ObjectId id
	) throws (
		io_exception.IoException e1,
		no_such_object_exception.NoSuchObjectException e2
	);

	u32.u32
	get_object_count(
		optional object_query.ObjectQuery query
	) throws (
		io_exception.IoException e
	);

	get_objects_result.GetObjectsResult
	get_objects(
		get_objects_options.GetObjectsOptions options,
		optional object_query.ObjectQuery query
	) throws (
		io_exception.IoException e
	);
}
