namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/object/get_object_summaries_options.thrift"
include "costume/api/services/object/get_object_summaries_result.thrift"
include "costume/api/services/object/object_query.thrift"
include "costume/api/services/object/no_such_object_exception.thrift"

service ObjectQueryService {
	object.Object
	get_object_by_id(
		object_id.ObjectId id
	) throws (
		io_exception.IoException e1,
		no_such_object_exception.NoSuchObjectException e2
	);

	get_object_summaries_result.GetObjectSummariesResult
	get_object_summaries(
		optional get_object_summaries_options.GetObjectSummariesOptions options,
		optional object_query.ObjectQuery query
	) throws (
		io_exception.IoException e
	);
}
