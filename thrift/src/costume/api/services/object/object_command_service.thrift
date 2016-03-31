namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_entry.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/collection/no_such_collection_exception.thrift"
include "costume/api/services/institution/no_such_institution_exception.thrift"
include "thryft/native/u32.thrift"

service ObjectCommandService {
	u32.u32
	delete_objects_by_collection_id(
		collection_id.CollectionId collection_id
	) throws (
		io_exception.IoException e1,
		no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3
	);

	void
	put_object(
		object_id.ObjectId id,
		object.Object object
	) throws (
		io_exception.IoException e1,
        no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3
	);

	void
	put_objects(
		list<object_entry.ObjectEntry> objects
	) throws (
		io_exception.IoException e1,
        no_such_collection_exception.NoSuchCollectionException e2,
        no_such_institution_exception.NoSuchInstitutionException e3
	);

	void
	resummarize_objects(
	) throws (
		io_exception.IoException e
	);
}
