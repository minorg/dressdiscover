package org.dressdiscover.api.services.user;

public interface UserSettingsQueryService {
    public enum FunctionMetadata {
        GET_USER_SETTINGS("get_user_settings");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public org.dressdiscover.api.models.user.UserSettings getUserSettings(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException, org.dressdiscover.api.services.user.NoSuchUserSettingsException;
}
