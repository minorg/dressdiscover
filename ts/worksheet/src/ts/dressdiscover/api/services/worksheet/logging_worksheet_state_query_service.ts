import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class LoggingWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(private delegate: WorksheetStateQueryService) {
    }

    getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState> {
        return this.delegate.getWorksheetState({id: kwds.id})
        .then((__returnValue) => { console.debug("getWorksheetState({", "id: ", kwds.id, "}) -> ", __returnValue); return __returnValue; })
        .catch((e) => { console.warn("getWorksheetState({", "id: ", kwds.id, "}) -> exception"); console.warn(e); throw e })
    }

    getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        return this.delegate.getWorksheetStateIds()
        .then((__returnValue) => { console.debug("getWorksheetStateIds() -> ", __returnValue); return __returnValue; })
        .catch((e) => { console.warn("getWorksheetStateIds() -> exception"); console.warn(e); throw e })
    }
}
