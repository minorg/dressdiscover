import {UserId} from "~/models/user/UserId";

export class NoSuchUserSettingsException {
  constructor(readonly id?: UserId) {}
}
