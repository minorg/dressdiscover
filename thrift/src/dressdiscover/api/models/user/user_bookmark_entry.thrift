namespace bean_java org.dressdiscover.gui.models.user
namespace java org.dressdiscover.api.models.user
namespace * dressdiscover.api.models.user

include "dressdiscover/api/models/user/user_bookmark.thrift"
include "dressdiscover/api/models/user/user_bookmark_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.user.UserBookmark, org.dressdiscover.api.models.user.UserBookmarkId>
struct UserBookmarkEntry {
	user_bookmark_id.UserBookmarkId id;
	user_bookmark.UserBookmark model;
}
