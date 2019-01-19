import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class LoggingWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(private delegate: WorksheetStateCommandService) {
    }

    public deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void> {
        return this.delegate.deleteWorksheetState({id: kwds.id})
        .then(() => console.debug("deleteWorksheetState({", "id: ", kwds.id, "}) -> success"))
        .catch((e) => { console.warn("deleteWorksheetState({", "id: ", kwds.id, "}) -> exception"); console.warn(e); throw e; });
    }

    public putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
        return this.delegate.putWorksheetState({state: kwds.state})
        .then(() => console.debug("putWorksheetState({", "state: ", kwds.state, "}) -> success"))
        .catch((e) => { console.warn("putWorksheetState({", "state: ", kwds.state, "}) -> exception"); console.warn(e); throw e; });
    }

    public renameWorksheetState(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): Promise<void> {
        return this.delegate.renameWorksheetState({newId: kwds.newId, oldId: kwds.oldId})
        .then(() => console.debug("renameWorksheetState({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> success"))
        .catch((e) => { console.warn("renameWorksheetState({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> exception"); console.warn(e); throw e; });
    }
}
