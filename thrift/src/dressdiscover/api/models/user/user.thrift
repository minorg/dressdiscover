namespace * dressdiscover.api.models.user

include "thryft/native/email_address.thrift"
include "thryft/native/url.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct User {
	// date_time.DateTime ctime;

	email_address.EmailAddress email_address;

	optional bool email_address_verified;

	optional non_blank_string.NonBlankString family_name;

	optional non_blank_string.NonBlankString given_name;

	optional non_blank_string.NonBlankString locale;

	optional non_blank_string.NonBlankString name;

	optional non_blank_string.NonBlankString nickname;

	optional url.Url picture_url;
}
