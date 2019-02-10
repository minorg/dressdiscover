import { WorksheetState } from "../../../models/worksheet/state/worksheet_state";
import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class LoggingWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(private delegate: WorksheetStateQueryService) {
    }

    public getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState> {
        return this.delegate.getWorksheetState({id: kwds.id})
        .then((returnValue) => { console.debug("getWorksheetState({", "id: ", kwds.id, "}) -> ", returnValue); return returnValue; })
        .catch((e) => { console.warn("getWorksheetState({", "id: ", kwds.id, "}) -> exception"); console.warn(e); throw e; });
    }

    public getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        return this.delegate.getWorksheetStateIds()
        .then((returnValue) => { console.debug("getWorksheetStateIds() -> ", returnValue); return returnValue; })
        .catch((e) => { console.warn("getWorksheetStateIds() -> exception"); console.warn(e); throw e; });
    }
}
