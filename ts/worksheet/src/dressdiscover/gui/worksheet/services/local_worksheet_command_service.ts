import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import {
    AsyncToSyncWorksheetCommandService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_command_service';

export class LocalWorksheetCommandService extends AsyncToSyncWorksheetCommandService {
    deleteWorksheetStateSync(kwds: { accessionNumber: string }): void {
        // console.info("delete " + kwds.accessionNumber);
        // localStorage.removeItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
    }

    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        // let jsonString = JSON.stringify(kwds.state.toThryftJSON());
        // console.info("put " + jsonString);
        // localStorage.setItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.state.accessionNumber), jsonString);
    }
}
