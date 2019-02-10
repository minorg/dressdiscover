import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";

export interface WorksheetDefinitionQueryService {
    /**
     * getWorksheetDefinition
     * @return {WorksheetDefinition}
     * @throws {IoException}
     */
    getWorksheetDefinition(): Promise<WorksheetDefinition>;
}
