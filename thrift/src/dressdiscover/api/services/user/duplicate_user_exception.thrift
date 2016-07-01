namespace java org.dressdiscover.api.services.user
namespace * costume.api.services.user

include "costume/api/models/user/user_id.thrift"

exception DuplicateUserException {
	// validation {"minLength": 1}
	string cause_message;

	user_id.UserId user_id;
}
