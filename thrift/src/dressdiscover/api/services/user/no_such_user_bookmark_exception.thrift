namespace java org.dressdiscover.api.services.user
namespace * dressdiscover.api.services.user

include "costume/api/models/user/user_bookmark_id.thrift"

exception NoSuchUserBookmarkException {
	optional user_bookmark_id.UserBookmarkId id;
}