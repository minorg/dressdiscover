namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/io_exception.thrift"

service ObjectCommandService {
	void
	delete_objects(
	) throws (
		io_exception.IoException e
	);

	void
	delete_objects_by_collection_id(
		collection_id.CollectionId collection_id
	) throws (
		io_exception.IoException e
	);

	void
	delete_objects_by_institution_id(
		institution_id.InstitutionId institution_id
	) throws (
		io_exception.IoException e
	);

	void
	put_object(
		object_id.ObjectId id,
		object.Object object
	) throws (
		io_exception.IoException e
	);
}
