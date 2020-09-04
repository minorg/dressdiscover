import {WorksheetFeatureSetState} from "./WorksheetFeatureSetState";
import {WorksheetStateId} from "./WorksheetStateId";

export interface WorksheetState {
  readonly ctime: Date;
  featureSets: WorksheetFeatureSetState[];
  id: WorksheetStateId;
  mtime: Date;
  text?: string;
}
