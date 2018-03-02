import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import {
    AsyncToSyncWorksheetStateCommandService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_state_command_service';
import { LocalWorksheetStateQueryService } from 'dressdiscover/gui/worksheet/services/local_worksheet_state_query_service';

export class LocalWorksheetStateCommandService extends AsyncToSyncWorksheetStateCommandService {
    deleteWorksheetStateSync(kwds: { id: WorksheetStateId }): void {
        localStorage.removeItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
    }

    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        localStorage.setItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.state.id), JSON.stringify(kwds.state.toThryftJsonObject()));
    }
}
