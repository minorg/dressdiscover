import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";

export interface WorksheetDefinitionQueryService {
    /**
     * getWorksheetDefinition
     * @return {WorksheetDefinition}
     * @throws {IoException}
     */
    getWorksheetDefinitionAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetDefinition) => void}): void;

    /**
     * getWorksheetDefinition
     * @return {WorksheetDefinition}
     * @throws {IoException}
     */
    getWorksheetDefinitionSync(): WorksheetDefinition;
}
