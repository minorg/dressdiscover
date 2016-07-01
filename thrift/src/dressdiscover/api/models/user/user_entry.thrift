namespace bean_java org.dressdiscover.gui.models.user
namespace java org.dressdiscover.api.models.user
namespace * dressdiscover.api.models.user

include "dressdiscover/api/models/user/user.thrift"
include "dressdiscover/api/models/user/user_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.user.User, org.dressdiscover.api.models.user.UserId>
struct UserEntry {
	user_id.UserId id;
	user.User model;
}
