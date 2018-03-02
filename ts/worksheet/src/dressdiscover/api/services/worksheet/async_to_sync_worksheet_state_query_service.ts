import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export abstract class AsyncToSyncWorksheetStateQueryService implements WorksheetStateQueryService {
    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string[]) => void}): void {
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

    abstract getWorksheetStateIdsSync(): string[];

    getWorksheetStateAsync(kwds: {id: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void {
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

    abstract getWorksheetStateSync(kwds: {id: string}): WorksheetState;
}
