import { UserId } from "../../models/user/user_id";
import { UserSettings } from "../../models/user/user_settings";

export interface UserSettingsQueryService {
    /**
     * getUserSettings
     * @param {UserId} id
     * @return {UserSettings}
     * @throws {IoException}
     * @throws {NoSuchUserException}
     * @throws {NoSuchUserSettingsException}
     */
    getUserSettings(kwds: {id: UserId}): Promise<UserSettings>;
}
