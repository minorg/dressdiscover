import {WorksheetDescription} from "./WorksheetDescription";

export interface WorksheetFeatureDefinition {
  readonly displayNameEn: string;
  readonly id: string;
  readonly valueIds: string[];
  readonly description?: WorksheetDescription;
}
