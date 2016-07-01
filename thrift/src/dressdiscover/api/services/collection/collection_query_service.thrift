namespace java org.dressdiscover.api.services.collection
namespace json_rpc_client_py dressdiscover.client.services.collection
namespace logging_service_java org.dressdiscover.lib.services.collection
namespace servlet_java org.dressdiscover.server.controllers.collection
namespace validating_service_java org.dressdiscover.lib.services.collection
namespace * dressdiscover.api.services.collection

include "dressdiscover/api/models/collection/collection.thrift"
include "dressdiscover/api/models/collection/collection_entry.thrift"
include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/collection/no_such_collection_exception.thrift"
include "dressdiscover/api/services/institution/no_such_institution_exception.thrift"

service CollectionQueryService {
	collection.Collection
	get_collection_by_id(
		collection_id.CollectionId id
	) throws (
		io_exception.IoException e1,
		no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3
	);

	list<collection.Collection>
	get_collections_by_ids(
		list<collection_id.CollectionId> ids
	) throws (
		io_exception.IoException e1,
		no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3
	);

	list<collection_entry.CollectionEntry>
	get_collections_by_institution_id(
		institution_id.InstitutionId institution_id
	) throws (
		io_exception.IoException e1,
        no_such_institution_exception.NoSuchInstitutionException e2
	);
}
