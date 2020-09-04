import {WorksheetRightsLicense} from "./WorksheetRightsLicense";
import {WorksheetRightsSource} from "./WorksheetRightsSource";

export interface WorksheetRights {
  readonly author: string;
  readonly license: WorksheetRightsLicense;
  readonly source: WorksheetRightsSource;
}
