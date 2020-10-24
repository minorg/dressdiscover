import {WorksheetDescription} from "./WorksheetDescription";

export interface WorksheetFeatureSetDefinition {
  readonly displayNameEn: string;
  readonly featureIds: string[];
  id: string;
  readonly description?: WorksheetDescription;
}
