import { UserId } from "../../models/user/user_id";
import { UserSettings } from "../../models/user/user_settings";
import { UserSettingsQueryService } from "./user_settings_query_service";

export class LoggingUserSettingsQueryService implements UserSettingsQueryService {
    constructor(private delegate: UserSettingsQueryService) {
    }

    public getUserSettings(kwds: {id: UserId}): Promise<UserSettings> {
        return this.delegate.getUserSettings({id: kwds.id})
        .then((returnValue) => { console.debug("getUserSettings({", "id: ", kwds.id, "}) -> ", returnValue); return returnValue; })
        .catch((e) => { console.warn("getUserSettings({", "id: ", kwds.id, "}) -> exception"); console.warn(e); throw e; });
    }
}
