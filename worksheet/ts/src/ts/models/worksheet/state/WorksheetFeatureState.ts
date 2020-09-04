import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureValueId} from "../WorksheetFeatureValueId";

export interface WorksheetFeatureState {
  readonly id: WorksheetFeatureId;
  selectedValueIds?: WorksheetFeatureValueId[];
  text?: string;
}
