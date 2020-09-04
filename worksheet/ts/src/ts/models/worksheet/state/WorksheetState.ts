import {WorksheetFeatureSetState} from "./WorksheetFeatureSetState";
import {WorksheetStateId} from "./WorksheetStateId";

export interface WorksheetState {
  readonly ctime: Date;
  featureSets: readonly WorksheetFeatureSetState[];
  readonly id: WorksheetStateId;
  readonly mtime: Date;
  readonly text?: string;
}
