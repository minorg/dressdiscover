import {WorksheetFeatureValueImageUrl} from "./WorksheetFeatureValueImageUrl";
import {WorksheetRights} from "./WorksheetRights";

export interface WorksheetFeatureValueImage {
  readonly rights: WorksheetRights;
  readonly thumbnailUrl: WorksheetFeatureValueImageUrl;
  readonly fullSizeUrl?: WorksheetFeatureValueImageUrl;
}
