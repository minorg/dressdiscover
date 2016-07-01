namespace java org.dressdiscover.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * dressdiscover.api.services.object

include "costume/api/models/object/object_query.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/object/get_object_summaries_options.thrift"
include "costume/api/services/object/get_object_summaries_result.thrift"

service ObjectSummaryQueryService {
	get_object_summaries_result.GetObjectSummariesResult
	get_object_summaries(
		optional get_object_summaries_options.GetObjectSummariesOptions options,
		optional object_query.ObjectQuery query
	) throws (
		io_exception.IoException e
	);
}