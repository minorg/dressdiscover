import { UserId } from "../../models/user/user_id";
import { UserSettings } from "../../models/user/user_settings";
import { UserSettingsCommandService } from "./user_settings_command_service";

export class LoggingUserSettingsCommandService implements UserSettingsCommandService {
    constructor(private delegate: UserSettingsCommandService) {
    }

    public putUserSettings(kwds: {id: UserId, userSettings: UserSettings}): Promise<void> {
        return this.delegate.putUserSettings({id: kwds.id, userSettings: kwds.userSettings})
        .then(() => console.debug("putUserSettings({", "id: ", kwds.id, "userSettings: ", kwds.userSettings, "}) -> success"))
        .catch((e) => { console.warn("putUserSettings({", "id: ", kwds.id, "userSettings: ", kwds.userSettings, "}) -> exception"); console.warn(e); throw e; });
    }
}
