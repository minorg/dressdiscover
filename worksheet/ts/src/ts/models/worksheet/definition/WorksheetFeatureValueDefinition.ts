import {WorksheetDescription} from "./WorksheetDescription";
import {WorksheetFeatureValueId} from "../WorksheetFeatureValueId";
import {WorksheetFeatureValueImage} from "./WorksheetFeatureValueImage";

export interface WorksheetFeatureValueDefinition {
  readonly displayNameEn: string;
  readonly id: WorksheetFeatureValueId;
  readonly description?: WorksheetDescription;
  readonly image?: WorksheetFeatureValueImage;
}
