import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetStateQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string[]) => void}): void;
    getWorksheetAccessionNumbersSync(): string[];

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}
