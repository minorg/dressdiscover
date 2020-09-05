import {WorksheetState} from "~/models/worksheet/state/WorksheetState";

export interface WorksheetStateQueryService {
  getWorksheetState(kwds: {id: string}): Promise<WorksheetState>;
  getWorksheetStateIds(): Promise<string[]>;
}
