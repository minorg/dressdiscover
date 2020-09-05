import {WorksheetFeatureSetState} from "./WorksheetFeatureSetState";

export interface WorksheetState {
  readonly ctime: Date;
  featureSets: WorksheetFeatureSetState[];
  id: string;
  mtime: Date;
  text?: string;
}
