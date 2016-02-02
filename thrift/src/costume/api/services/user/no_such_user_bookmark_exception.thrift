namespace java net.lab1318.costume.api.services.user
namespace * costume.api.services.user

include "costume/api/models/user/user_bookmark_id.thrift"

exception NoSuchUserBookmarkException {
	optional user_bookmark_id.UserBookmarkId id;
}
