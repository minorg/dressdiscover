namespace * dressdiscover.api.services.user

include "dressdiscover/api/models/user/user_id.thrift"
include "dressdiscover/api/models/user/user_settings.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/user/no_such_user_exception.thrift"
include "dressdiscover/api/services/user/no_such_user_settings_exception.thrift"

service UserSettingsQueryService {
	user_settings.UserSettings
	get_user_settings(
		user_id.UserId id
	) throws (
		io_exception.IoException e1,
		no_such_user_exception.NoSuchUserException e2,
		no_such_user_settings_exception.NoSuchUserSettingsException e3
	);
}
