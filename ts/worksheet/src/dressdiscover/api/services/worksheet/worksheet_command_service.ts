import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetCommandService {
    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    deleteWorksheetStateSync(kwds: {accessionNumber: string}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}
