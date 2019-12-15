namespace * dressdiscover.api.services.user

include "dressdiscover/api/models/user/user_id.thrift"
include "dressdiscover/api/models/user/user_settings.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/user/no_such_user_exception.thrift"

service UserSettingsCommandService {
	void
	put_user_settings(
		user_id.UserId id,
		user_settings.UserSettings user_settings
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2
	);
}
