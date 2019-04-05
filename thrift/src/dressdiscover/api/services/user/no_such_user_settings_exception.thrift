namespace * dressdiscover.api.services.user

include "dressdiscover/api/models/user/user_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
// @ts_implements Exception
exception NoSuchUserSettingsException {
	optional user_id.UserId id;
}