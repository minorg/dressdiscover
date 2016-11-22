import { AsyncToSyncWorksheetCommandService } from "dressdiscover/api/services/worksheet/worksheet_command_service";
import { LocalWorksheetQueryService } from "dressdiscover/gui/services/worksheet/local_worksheet_query_service";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

export class LocalWorksheetCommandService extends AsyncToSyncWorksheetCommandService {
    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        let jsonString = JSON.stringify(kwds.state.toThryftJSON());
        console.info("state to service: " + jsonString);
        localStorage.setItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.state.accessionNumber), jsonString);
    }
}
