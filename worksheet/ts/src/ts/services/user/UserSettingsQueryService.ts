import {UserId} from "~/models/user/UserId";
import {UserSettings} from "~/models/user/UserSettings";

export interface UserSettingsQueryService {
  getUserSettings(kwds: {id: UserId}): Promise<UserSettings>;
}
