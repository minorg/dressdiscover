import { UserId } from 'dressdiscover/api/models/user/user_id';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { UserSettingsCommandService } from 'dressdiscover/api/services/user/user_settings_command_service';
import { LocalStorageUserSettingsQueryService } from 'dressdiscover/gui/services/user/LocalStorageUserSettingsQueryService';

export class LocalStorageUserSettingsCommandService implements UserSettingsCommandService {
    putUserSettings(kwds: { id: UserId, userSettings: UserSettings }): Promise<void> {
        const key = LocalStorageUserSettingsQueryService.getUserSettingsItemKey(kwds.id);
        localStorage.setItem(key, JSON.stringify(kwds.userSettings.toThryftJsonObject()));
        return Promise.resolve();
    }
}
