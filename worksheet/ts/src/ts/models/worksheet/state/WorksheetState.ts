import {WorksheetFeatureSetState} from "./WorksheetFeatureSetState";

export interface WorksheetState {
  readonly ctime: number;
  featureSets: WorksheetFeatureSetState[];
  id: string;
  mtime: number;
  text?: string;
}
