namespace * dressdiscover.api.services

include "thryft/waf/api/models/non_blank_string.thrift"

// @java_extends org.thryft.waf.api.services.IoException
exception IoException {
    non_blank_string.NonBlankString cause_message;
}
