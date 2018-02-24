import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import {
    AsyncToSyncWorksheetStateCommandService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_state_command_service';
import { LocalWorksheetStateQueryService } from 'dressdiscover/gui/worksheet/services/local_worksheet_state_query_service';

export class LocalWorksheetStateCommandService extends AsyncToSyncWorksheetStateCommandService {
    deleteWorksheetStateSync(kwds: { accessionNumber: string }): void {
        localStorage.removeItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
    }

    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        localStorage.setItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.state.accessionNumber), JSON.stringify(kwds.state.toThryftJsonObject()));
    }
}
