import {WorksheetState} from "~/models/worksheet/state/WorksheetState";

export interface WorksheetStateCommandService {
  deleteWorksheetState(kwds: {id: string}): Promise<void>;
  putWorksheetState(kwds: {state: WorksheetState}): Promise<void>;
  renameWorksheetState(kwds: {newId: string; oldId: string}): Promise<void>;
}
