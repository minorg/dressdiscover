import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetStateCommandService {
    deleteWorksheetStateAsync(kwds: {id: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    deleteWorksheetStateSync(kwds: {id: string}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}
