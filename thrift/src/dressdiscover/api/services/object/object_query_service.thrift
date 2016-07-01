namespace java org.dressdiscover.api.services.object
namespace json_rpc_client_py dressdiscover.client.services.object
namespace logging_service_java org.dressdiscover.lib.services.object
namespace servlet_java org.dressdiscover.server.controllers.object
namespace validating_service_java org.dressdiscover.lib.services.object
namespace * dressdiscover.api.services.object

include "dressdiscover/api/models/object/object.thrift"
include "dressdiscover/api/models/object/object_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/collection/no_such_collection_exception.thrift"
include "dressdiscover/api/services/institution/no_such_institution_exception.thrift"
include "dressdiscover/api/services/object/no_such_object_exception.thrift"

service ObjectQueryService {
	object.Object
	get_object_by_id(
		object_id.ObjectId id
	) throws (
		io_exception.IoException e1,
        no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3,
		no_such_object_exception.NoSuchObjectException e4
	);
}
