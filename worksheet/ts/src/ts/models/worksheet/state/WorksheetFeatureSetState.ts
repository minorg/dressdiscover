import {WorksheetFeatureSetId} from "../WorksheetFeatureSetId";
import {WorksheetFeatureState} from "./WorksheetFeatureState";

export interface WorksheetFeatureSetState {
  features: readonly WorksheetFeatureState[];
  readonly id: WorksheetFeatureSetId;
}
