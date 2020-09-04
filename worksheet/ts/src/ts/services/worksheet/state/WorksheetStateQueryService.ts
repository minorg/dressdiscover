import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";

export interface WorksheetStateQueryService {
  getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState>;
  getWorksheetStateIds(): Promise<WorksheetStateId[]>;
}
