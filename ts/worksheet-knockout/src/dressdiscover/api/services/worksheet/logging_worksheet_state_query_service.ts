import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class LoggingWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(private delegate: WorksheetStateQueryService) {
    }

    getWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void {
        this.delegate.getWorksheetStateAsync({id: kwds.id, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getWorksheetStateAsync({", "id: ", kwds.id, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: WorksheetState) => { console.debug("getWorksheetStateAsync({", "id: ", kwds.id, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getWorksheetStateSync(kwds: {id: WorksheetStateId}): WorksheetState {
        try {
            const __returnValue = this.delegate.getWorksheetStateSync({id: kwds.id});
            console.debug("getWorksheetStateSync({", "id: ", kwds.id, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getWorksheetStateSync({", "id: ", kwds.id, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }

    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetStateId[]) => void}): void {
        this.delegate.getWorksheetStateIdsAsync({error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getWorksheetStateIdsAsync() -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: WorksheetStateId[]) => { console.debug("getWorksheetStateIdsAsync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getWorksheetStateIdsSync(): WorksheetStateId[] {
        try {
            const __returnValue = this.delegate.getWorksheetStateIdsSync();
            console.debug("getWorksheetStateIdsSync() -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getWorksheetStateIdsSync() -> exception");
            console.warn(e);
            throw e;
        }
    }
}