import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export interface WorksheetStateCommandService {
    deleteWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    deleteWorksheetStateSync(kwds: {id: WorksheetStateId}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}
