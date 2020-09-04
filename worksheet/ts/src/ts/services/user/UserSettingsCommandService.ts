import { UserId } from "~/models/user/UserId";
import { UserSettings } from "~/models/user/UserSettings";

export interface UserSettingsCommandService {
    /**
     * putUserSettings
     * @param {UserId} id
     * @param {UserSettings} user_settings
     * @throws {IoException}
     * @throws {NoSuchUserException}
     */
    putUserSettings(kwds: {id: UserId, userSettings: UserSettings}): Promise<void>;
}
