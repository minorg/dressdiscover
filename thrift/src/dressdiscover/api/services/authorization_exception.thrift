namespace * dressdiscover.api.services

include "thryft/waf/api/models/non_blank_string.thrift"

// @ts_implements Exception
exception AuthorizationException {
    non_blank_string.NonBlankString cause_message;
}
