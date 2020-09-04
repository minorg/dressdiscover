import {WorksheetDescription} from "./WorksheetDescription";
import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureSetId} from "../WorksheetFeatureSetId";

export interface WorksheetFeatureSetDefinition {
  readonly displayNameEn: string;
  readonly featureIds: readonly WorksheetFeatureId[];
  id: WorksheetFeatureSetId;
  readonly description?: WorksheetDescription;
}
