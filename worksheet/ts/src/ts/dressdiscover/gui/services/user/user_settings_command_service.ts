import { UserId } from "../../models/user/user_id";
import { UserSettings } from "../../models/user/user_settings";

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
