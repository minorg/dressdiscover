namespace bean_java org.dressdiscover.gui.models.user
namespace java org.dressdiscover.api.models.user
namespace * dressdiscover.api.models.user

include "costume/api/models/user/user_bookmark.thrift"
include "costume/api/models/user/user_bookmark_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.user.UserBookmark, net.lab1318.costume.api.models.user.UserBookmarkId>
struct UserBookmarkEntry {
	user_bookmark_id.UserBookmarkId id;
	user_bookmark.UserBookmark model;
}
