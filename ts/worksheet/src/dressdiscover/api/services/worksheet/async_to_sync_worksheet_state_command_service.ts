import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export abstract class AsyncToSyncWorksheetStateCommandService implements WorksheetStateCommandService {
    deleteWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        try {
            this.deleteWorksheetStateSync({id: kwds.id})
            if (kwds.success) {
                kwds.success();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract deleteWorksheetStateSync(kwds: {id: WorksheetStateId}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        try {
            this.putWorksheetStateSync({state: kwds.state})
            if (kwds.success) {
                kwds.success();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}
