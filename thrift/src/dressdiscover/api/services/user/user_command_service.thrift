namespace logging_service_java org.dressdiscover.lib.services.user
namespace servlet_java org.dressdiscover.server.controllers.user
namespace validating_service_java org.dressdiscover.lib.services.user
namespace * dressdiscover.api.services.user

include "dressdiscover/api/models/user/user.thrift"
include "dressdiscover/api/models/user/user_bookmark.thrift"
include "dressdiscover/api/models/user/user_bookmark_id.thrift"
include "dressdiscover/api/models/user/user_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/user/duplicate_user_bookmark_exception.thrift"
include "dressdiscover/api/services/user/duplicate_user_exception.thrift"
include "dressdiscover/api/services/user/no_such_user_bookmark_exception.thrift"
include "dressdiscover/api/services/user/no_such_user_exception.thrift"

service UserCommandService {
	void
	delete_user_bookmark_by_id(
		user_bookmark_id.UserBookmarkId id
	) throws (
		io_exception.IoException e1,
		no_such_user_bookmark_exception.NoSuchUserBookmarkException e2
	);

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

	user_id.UserId
	post_user(
		user.User user
	) throws (
		duplicate_user_exception.DuplicateUserException e1,
		io_exception.IoException e2
	);

	user_bookmark_id.UserBookmarkId
	post_user_bookmark(
		user_bookmark.UserBookmark user_bookmark,
	) throws (
		duplicate_user_bookmark_exception.DuplicateUserBookmarkException e1,
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
