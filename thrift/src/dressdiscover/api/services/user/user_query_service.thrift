namespace java org.dressdiscover.api.services.user
namespace json_rpc_client_py costume.client.services.user
namespace logging_service_java net.lab1318.costume.lib.services.user
namespace servlet_java net.lab1318.costume.server.controllers.user
namespace validating_service_java net.lab1318.costume.lib.services.user
namespace * costume.api.services.user

include "costume/api/models/user/user.thrift"
include "costume/api/models/user/user_bookmark_entry.thrift"
include "costume/api/models/user/user_entry.thrift"
include "costume/api/models/user/user_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/user/no_such_user_exception.thrift"
include "thryft/native/email_address.thrift"

service UserQueryService {
	list<user_bookmark_entry.UserBookmarkEntry>
	get_user_bookmarks_by_user_id(
		user_id.UserId user_id,
		optional bool object_ids_only
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);

	user_entry.UserEntry
	get_user_by_email_address(
		email_address.EmailAddress email_address
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);

	user.User
	get_user_by_id(
		user_id.UserId id
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);
}
