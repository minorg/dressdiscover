import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";

export interface WorksheetStateCommandService {
  deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void>;
  putWorksheetState(kwds: {state: WorksheetState}): Promise<void>;
  renameWorksheetState(kwds: {
    newId: WorksheetStateId;
    oldId: WorksheetStateId;
  }): Promise<void>;
}
