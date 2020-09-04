import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureSetId} from "../WorksheetFeatureSetId";
import {WorksheetStateId} from "./WorksheetStateId";

export interface WorksheetStateMark {
  readonly worksheetStateId: WorksheetStateId;
  readonly featureId?: WorksheetFeatureId;
  readonly featureSetId?: WorksheetFeatureSetId;
  readonly review?: boolean;
}
