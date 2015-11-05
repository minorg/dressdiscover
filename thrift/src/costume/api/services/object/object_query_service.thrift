namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_entry.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/object/no_such_object_exception.thrift"
include "thryft/native/u32.thrift"

service ObjectQueryService {
	object.Object
	get_object_by_id(
		object_id.ObjectId id
	) throws (
		io_exception.IoException e1,
		no_such_object_exception.NoSuchObjectException e2
	);

	u32.u32
	get_object_count(
	) throws (
		io_exception.IoException e
	);

	u32.u32
	get_object_count_by_collection_id(
		collection_id.CollectionId collection_id
	) throws (
		io_exception.IoException e
	);

	u32.u32
	get_object_count_by_institution_id(
		institution_id.InstitutionId institution_id
	) throws (
		io_exception.IoException e
	);

	list<object_entry.ObjectEntry>
	get_objects(
		u32.u32 from_,
		u32.u32 size
	) throws (
		io_exception.IoException e
	);

	list<object_entry.ObjectEntry>
	get_objects_by_collection_id(
		collection_id.CollectionId collection_id,
		u32.u32 from_,
		u32.u32 size
	) throws (
		io_exception.IoException e
	);

	list<object_entry.ObjectEntry>
	get_objects_by_institution_id(
		institution_id.InstitutionId institution_id,
		u32.u32 from_,
		u32.u32 size
	) throws (
		io_exception.IoException e
	);
}
