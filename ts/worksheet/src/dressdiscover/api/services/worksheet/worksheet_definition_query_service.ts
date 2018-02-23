import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";

export interface WorksheetDefinitionQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): WorksheetDefinition;
}
