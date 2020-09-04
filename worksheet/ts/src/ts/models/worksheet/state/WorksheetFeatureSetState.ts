import {WorksheetFeatureSetId} from "../WorksheetFeatureSetId";
import {WorksheetFeatureState} from "./WorksheetFeatureState";

export interface WorksheetFeatureSetState {
  features: WorksheetFeatureState[];
  readonly id: WorksheetFeatureSetId;
}
