namespace bean_java net.lab1318.costume.gui.models.user
namespace java net.lab1318.costume.api.models.user
namespace * costume.api.models.user

include "costume/api/models/object/object_id.thrift"
include "costume/api/models/user/user_id.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct UserBookmark {
	object_id.ObjectId object_id;
	user_id.UserId user_id;
}
