import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: string[]) => void}): void;
    getWorksheetAccessionNumbersSync(): string[];

    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}
