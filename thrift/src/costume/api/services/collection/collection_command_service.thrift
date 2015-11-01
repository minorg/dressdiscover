namespace java net.lab1318.costume.api.services.collection
namespace json_rpc_client_py costume.client.services.collection
namespace logging_service_java net.lab1318.costume.lib.services.collection
namespace servlet_java net.lab1318.costume.server.controllers.collection
namespace validating_service_java net.lab1318.costume.lib.services.collection
namespace * costume.api.services.collection

include "costume/api/models/collection/collection.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/services/io_exception.thrift"

service CollectionCommandService {
	void
	delete_collections(
	) throws (
		io_exception.IoException e
	);

	collection_id.CollectionId
	post_collection(
		collection.Collection collection
	) throws (
		io_exception.IoException e1
	);
}
