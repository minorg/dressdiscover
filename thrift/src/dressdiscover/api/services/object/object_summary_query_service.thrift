namespace java org.dressdiscover.api.services.object
namespace json_rpc_client_py dressdiscover.client.services.object
namespace logging_service_java org.dressdiscover.lib.services.object
namespace servlet_java org.dressdiscover.server.controllers.object
namespace validating_service_java org.dressdiscover.lib.services.object
namespace * dressdiscover.api.services.object

include "dressdiscover/api/models/object/object_query.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/object/get_object_summaries_options.thrift"
include "dressdiscover/api/services/object/get_object_summaries_result.thrift"

service ObjectSummaryQueryService {
	get_object_summaries_result.GetObjectSummariesResult
	get_object_summaries(
		optional get_object_summaries_options.GetObjectSummariesOptions options,
		optional object_query.ObjectQuery query
	) throws (
		io_exception.IoException e
	);
}
