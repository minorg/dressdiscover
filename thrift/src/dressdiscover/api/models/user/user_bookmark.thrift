namespace bean_java org.dressdiscover.gui.models.user
namespace java org.dressdiscover.api.models.user
namespace * dressdiscover.api.models.user

include "dressdiscover/api/models/object/object_id.thrift"
include "dressdiscover/api/models/object/object_query.thrift"
include "dressdiscover/api/models/user/user_id.thrift"

// @java_implements org.thryft.waf.api.models.Model
// @sql_column object_query VARCHAR
struct UserBookmark {
	// @validation {"minLength": 1}
	string name;

	// @sql_foreign_key user.id
	user_id.UserId user_id;

	// @validation {"minLength": 1}
	optional string folder;

	optional object_id.ObjectId object_id;

	optional object_query.ObjectQuery object_query;
}
