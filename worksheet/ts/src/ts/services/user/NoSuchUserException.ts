import {UserId} from "~/models/user/UserId";
import {Exception} from "~/Exception";

export class NoSuchUserException extends Exception {
  constructor(readonly id?: UserId) {
    super();
  }
}
