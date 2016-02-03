namespace bean_java net.lab1318.costume.gui.models.user
namespace java net.lab1318.costume.api.models.user
namespace * costume.api.models.user

include "costume/api/models/object/object_id.thrift"
include "costume/api/models/object/object_query.thrift"
include "costume/api/models/user/user_id.thrift"

// @java_implements org.thryft.waf.api.models.Model
// @sql_column object_query VARCHAR
struct UserBookmark {
	// @sql_foreign_key user.id
	user_id.UserId user_id;

	// @validation {"minLength": 1}
	optional string folder;

	optional object_id.ObjectId object_id;

	optional object_query.ObjectQuery object_query;
}
