namespace bean_java net.lab1318.costume.gui.models.user
namespace java net.lab1318.costume.api.models.user
namespace * costume.api.models.user

include "thryft/native/date_time.thrift"
include "thryft/native/email_address.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct User {
	date_time.DateTime ctime;

	// @sql_unique
	email_address.EmailAddress email_address;
}
