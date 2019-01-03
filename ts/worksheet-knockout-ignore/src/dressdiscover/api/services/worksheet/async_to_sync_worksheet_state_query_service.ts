import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export abstract class AsyncToSyncWorksheetStateQueryService implements WorksheetStateQueryService {
    getWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getWorksheetStateSync({id: kwds.id}));
            } else {
                this.getWorksheetStateSync({id: kwds.id});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getWorksheetStateSync(kwds: {id: WorksheetStateId}): WorksheetState;

    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetStateId[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getWorksheetStateIdsSync());
            } else {
                this.getWorksheetStateIdsSync();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getWorksheetStateIdsSync(): WorksheetStateId[];
}
