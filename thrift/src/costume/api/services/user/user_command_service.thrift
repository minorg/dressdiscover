namespace java net.lab1318.costume.api.services.user
namespace json_rpc_client_py costume.client.services.user
namespace logging_service_java net.lab1318.costume.lib.services.user
namespace servlet_java net.lab1318.costume.server.controllers.user
namespace validating_service_java net.lab1318.costume.lib.services.user
namespace * costume.api.services.user

include "costume/api/models/user/user.thrift"
include "costume/api/models/user/user_entry.thrift"
include "costume/api/models/user/user_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/user/duplicate_user_exception.thrift"
include "costume/api/services/user/no_such_user_exception.thrift"

service UserCommandService {
	void
	delete_user_by_id(
		user_id.UserId id
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);

	void
	delete_users(
	) throws (
		io_exception.IoException e
	);

	user_entry.UserEntry
	post_and_get_user(
		user.User user
	) throws (
		duplicate_user_exception.DuplicateUserException e1,
		io_exception.IoException e2
	);

	user_id.UserId
	post_user(
		user.User user
	) throws (
		duplicate_user_exception.DuplicateUserException e1,
		io_exception.IoException e2
	);

	void
	put_user(
		user_id.UserId id,
		user.User user
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);
}
