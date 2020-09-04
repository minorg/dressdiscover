import {WorksheetDescription} from "./WorksheetDescription";
import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureValueId} from "../WorksheetFeatureValueId";

export interface WorksheetFeatureDefinition {
  readonly displayNameEn: string;
  readonly id: WorksheetFeatureId;
  readonly valueIds: WorksheetFeatureValueId[];
  readonly description?: WorksheetDescription;
}
