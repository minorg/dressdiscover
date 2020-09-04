import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";

export class DuplicateWorksheetStateException {
  constructor(readonly id: WorksheetStateId) {}
}
