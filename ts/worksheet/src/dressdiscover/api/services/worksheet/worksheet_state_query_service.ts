import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetStateQueryService {
    getWorksheetStateAsync(kwds: {id: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {id: string}): WorksheetState;

    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string[]) => void}): void;
    getWorksheetStateIdsSync(): string[];
}
