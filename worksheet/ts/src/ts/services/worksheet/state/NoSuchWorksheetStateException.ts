import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";

export class NoSuchWorksheetStateException {
  constructor(readonly id: WorksheetStateId) {}
}
