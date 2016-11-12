import { AsyncToSyncWorksheetCommandService } from "../../../api/services/worksheet/worksheet_command_service";
import { WorksheetState } from "../../../api/models/worksheet/worksheet_state";

class LocalWorksheetCommandService extends AsyncToSyncWorksheetCommandService {
    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        localStorage.setItem("worksheet-state", JSON.stringify(kwds.state.toThryftJSON));
    }
}

export = LocalWorksheetCommandService;
