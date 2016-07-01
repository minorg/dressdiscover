namespace java org.dressdiscover.api.services.user
namespace * dressdiscover.api.services.user

include "costume/api/models/user/user_id.thrift"

exception NoSuchUserException {
	optional user_id.UserId id;
}
