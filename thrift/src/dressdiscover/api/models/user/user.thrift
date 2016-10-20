namespace * dressdiscover.api.models.user

include "thryft/native/date_time.thrift"
include "thryft/native/email_address.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct User {
	date_time.DateTime ctime;

	// @sql_unique
	email_address.EmailAddress email_address;
}
