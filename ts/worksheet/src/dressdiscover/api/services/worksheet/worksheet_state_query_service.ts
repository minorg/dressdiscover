import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export interface WorksheetStateQueryService {
    getWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {id: WorksheetStateId}): WorksheetState;

    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetStateId[]) => void}): void;
    getWorksheetStateIdsSync(): WorksheetStateId[];
}
