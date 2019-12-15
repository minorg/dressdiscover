namespace * dressdiscover.api.services.user

include "dressdiscover/api/models/user/user_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

exception DuplicateUserException {
	non_blank_string.NonBlankString cause_message;

	user_id.UserId user_id;
}
