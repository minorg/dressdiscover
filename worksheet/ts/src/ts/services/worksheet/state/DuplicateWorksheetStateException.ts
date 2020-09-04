import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";
import {Exception} from "~/Exception";

export class DuplicateWorksheetStateException extends Exception {
  constructor(readonly id: WorksheetStateId) {
    super();
  }
}
