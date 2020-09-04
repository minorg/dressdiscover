import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureValueId} from "../WorksheetFeatureValueId";

export interface WorksheetFeatureState {
  readonly id: WorksheetFeatureId;
  readonly selectedValueIds?: readonly WorksheetFeatureValueId[];
  readonly text?: string;
}
