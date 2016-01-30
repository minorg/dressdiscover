namespace bean_java net.lab1318.costume.gui.models.user
namespace java net.lab1318.costume.api.models.user
namespace * costume.api.models.user

include "costume/api/models/user/user.thrift"
include "costume/api/models/user/user_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.user.User, net.lab1318.costume.api.models.user.UserId>
struct UserEntry {
	user_id.UserId id;
	user.User model;
}
