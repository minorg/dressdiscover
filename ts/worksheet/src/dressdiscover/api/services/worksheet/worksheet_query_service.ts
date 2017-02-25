import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: string[]) => void}): void;
    getWorksheetAccessionNumbersSync(): string[];

    getWorksheetDefinitionAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {accessionNumber: string, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}
