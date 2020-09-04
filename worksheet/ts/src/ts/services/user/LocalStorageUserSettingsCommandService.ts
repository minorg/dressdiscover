import { UserId } from '~/models/user/user_id';
import { UserSettings } from '~/models/user/user_settings';
import { UserSettingsCommandService } from '~/services/user/user_settings_command_service';
import { LocalStorageUserSettingsQueryService } from '~/services/user/LocalStorageUserSettingsQueryService';

export class LocalStorageUserSettingsCommandService implements UserSettingsCommandService {
    putUserSettings(kwds: { id: UserId, userSettings: UserSettings }): Promise<void> {
        const key = LocalStorageUserSettingsQueryService.getUserSettingsItemKey(kwds.id);
        const value = JSON.stringify(kwds.userSettings);
        localStorage.setItem(key, value);
        // console.info("wrote user settings to key=%s, value=%s", key, value);
        return Promise.resolve();
    }
}
