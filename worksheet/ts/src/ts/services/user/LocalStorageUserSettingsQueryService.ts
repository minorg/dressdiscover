import {UserId} from "~/models/user/UserId";
import {UserSettings} from "~/models/user/UserSettings";
import {NoSuchUserSettingsException} from "~/services/user/NoSuchUserSettingsException";
import {UserSettingsQueryService} from "~/services/user/UserSettingsQueryService";

export class LocalStorageUserSettingsQueryService
  implements UserSettingsQueryService {
  private static readonly USER_SETTINGS_ITEM_KEY_PREFIX = "userSettings";

  getUserSettings(kwds: {id: UserId}): Promise<UserSettings> {
    const key = LocalStorageUserSettingsQueryService.getUserSettingsItemKey(
      kwds.id
    );
    const value = localStorage.getItem(key);
    // console.info("read user settings from key=%s: %s (%s)", key, value);
    if (!value) {
      return Promise.reject(new NoSuchUserSettingsException(kwds));
    }
    return Promise.resolve(JSON.parse(value));
  }

  static getUserSettingsItemKey(id: UserId): string {
    return (
      LocalStorageUserSettingsQueryService.USER_SETTINGS_ITEM_KEY_PREFIX +
      id.toString()
    );
  }
}
