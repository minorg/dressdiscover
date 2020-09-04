import {UserId} from "~/models/user/UserId";

export class NoSuchUserException {
  constructor(readonly id?: UserId) {}
}
