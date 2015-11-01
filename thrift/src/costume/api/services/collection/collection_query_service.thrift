namespace java net.lab1318.costume.api.services.collection
namespace json_rpc_client_py costume.client.services.collection
namespace logging_service_java net.lab1318.costume.lib.services.collection
namespace servlet_java net.lab1318.costume.server.controllers.collection
namespace validating_service_java net.lab1318.costume.lib.services.collection
namespace * costume.api.services.collection

include "costume/api/models/collection/collection.thrift"
include "costume/api/models/collection/collection_entry.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/collection/invalid_collection_id_exception.thrift"
include "costume/api/services/collection/no_such_collection_exception.thrift"

service CollectionQueryService {
	collection.Collection
	get_collection_by_id(
		collection_id.CollectionId id
	) throws (
		invalid_collection_id_exception.InvalidCollectionIdException e1,
		io_exception.IoException e2,
		no_such_collection_exception.NoSuchCollectionException e3
	);

	list<collection_entry.CollectionEntry>
	get_collections(
	) throws (
		io_exception.IoException e
	);
}
