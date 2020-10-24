import {WorksheetDefinition} from "~/models/worksheet/definition/WorksheetDefinition";

export interface WorksheetDefinitionQueryService {
  getWorksheetDefinition(): Promise<WorksheetDefinition>;
}
