namespace java net.lab1318.costume.api.services.collection
namespace json_rpc_client_py costume.client.services.collection
namespace logging_service_java net.lab1318.costume.lib.services.collection
namespace servlet_java net.lab1318.costume.server.controllers.collection
namespace validating_service_java net.lab1318.costume.lib.services.collection
namespace * costume.api.services.collection

include "costume/api/models/collection/collection.thrift"
include "costume/api/models/collection/collection_entry.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/collection/no_such_collection_exception.thrift"

service CollectionQueryService {
	collection.Collection
	get_collection_by_id(
		collection_id.CollectionId id
	) throws (
		io_exception.IoException e1,
		no_such_collection_exception.NoSuchCollectionException e2
	);

	list<collection_entry.CollectionEntry>
	get_collections(
	) throws (
		io_exception.IoException e
	);

	list<collection.Collection>
	get_collections_by_ids(
		list<collection_id.CollectionId> ids
	) throws (
		io_exception.IoException e1,
		no_such_collection_exception.NoSuchCollectionException e2
	);

	list<collection_entry.CollectionEntry>
	get_collections_by_institution_id(
		institution_id.InstitutionId institution_id
	) throws (
		io_exception.IoException e
	);
}
