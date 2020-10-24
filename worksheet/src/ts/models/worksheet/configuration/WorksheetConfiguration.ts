import {WorksheetDefinitionConfiguration} from "./WorksheetDefinitionConfiguration";
import {WorksheetStateConfiguration} from "./WorksheetStateConfiguration";

export interface WorksheetConfiguration {
  readonly definition: WorksheetDefinitionConfiguration;
  readonly state: WorksheetStateConfiguration;
}
