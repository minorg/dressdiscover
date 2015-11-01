namespace java net.lab1318.costume.api.services.object
namespace json_rpc_client_py costume.client.services.object
namespace logging_service_java net.lab1318.costume.lib.services.object
namespace servlet_java net.lab1318.costume.server.controllers.object
namespace validating_service_java net.lab1318.costume.lib.services.object
namespace * costume.api.services.object

include "costume/api/models/object/object.thrift"
include "costume/api/models/object/object_id.thrift"
include "costume/api/services/io_exception.thrift"

service ObjectCommandService {
	void
	delete_objects(
	) throws (
		io_exception.IoException e
	);

	object_id.ObjectId
	post_object(
		object.Object object
	) throws (
		io_exception.IoException e1
	);
}
