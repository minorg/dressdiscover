import {WorksheetDescription} from "./WorksheetDescription";
import {WorksheetFeatureValueImage} from "./WorksheetFeatureValueImage";

export interface WorksheetFeatureValueDefinition {
  readonly displayNameEn: string;
  readonly id: string;
  readonly description?: WorksheetDescription;
  readonly image?: WorksheetFeatureValueImage;
}
