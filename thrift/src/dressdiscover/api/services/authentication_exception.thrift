namespace * dressdiscover.api.services

include "thryft/waf/api/models/non_blank_string.thrift"

exception AuthenticationException {
    non_blank_string.NonBlankString cause_message;
}
