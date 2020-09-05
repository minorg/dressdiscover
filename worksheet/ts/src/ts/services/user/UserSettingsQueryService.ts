import {UserSettings} from "~/models/user/UserSettings";

export interface UserSettingsQueryService {
  getUserSettings(kwds: {id: string}): Promise<UserSettings>;
}
