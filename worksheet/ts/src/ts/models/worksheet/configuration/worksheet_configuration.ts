import { WorksheetDefinitionConfiguration } from "./worksheet_definition_configuration";
import { WorksheetStateConfiguration } from "./worksheet_state_configuration";

export interface WorksheetConfiguration {
    readonly definition: WorksheetDefinitionConfiguration;
    readonly state: WorksheetStateConfiguration;
}
