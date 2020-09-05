import {UserSettings} from "~/models/user/UserSettings";

export interface UserSettingsCommandService {
  putUserSettings(kwds: {
    id: string;
    userSettings: UserSettings;
  }): Promise<void>;
}
