package org.dressdiscover.api.services.user;

public interface UserSettingsCommandService {
    public enum FunctionMetadata {
        PUT_USER_SETTINGS("put_user_settings");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public void putUserSettings(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;
}
