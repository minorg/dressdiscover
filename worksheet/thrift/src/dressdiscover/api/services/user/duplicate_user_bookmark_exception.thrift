namespace * dressdiscover.api.services.user

include "thryft/waf/api/models/non_blank_string.thrift"

exception DuplicateUserBookmarkException {
	non_blank_string.NonBlankString cause_message;
}
