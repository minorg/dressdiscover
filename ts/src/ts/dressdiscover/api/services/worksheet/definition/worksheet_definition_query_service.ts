import { WorksheetDefinition } from "../../../models/worksheet/definition/worksheet_definition";

export interface WorksheetDefinitionQueryService {
    /**
     * getWorksheetDefinition
     * @return {WorksheetDefinition}
     * @throws {IoException}
     */
    getWorksheetDefinition(): Promise<WorksheetDefinition>;
}
