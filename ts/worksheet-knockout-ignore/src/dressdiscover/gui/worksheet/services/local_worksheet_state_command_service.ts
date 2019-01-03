import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import {
    AsyncToSyncWorksheetStateCommandService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_state_command_service';
import {
    DuplicateSuchWorksheetStateException,
} from 'dressdiscover/api/services/worksheet/duplicate_such_worksheet_state_exception';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/no_such_worksheet_state_exception';
import { LocalWorksheetStateQueryService } from 'dressdiscover/gui/worksheet/services/local_worksheet_state_query_service';

export class LocalWorksheetStateCommandService extends AsyncToSyncWorksheetStateCommandService {
    deleteWorksheetStateSync(kwds: { id: WorksheetStateId }): void {
        localStorage.removeItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
    }

    putWorksheetStateSync(kwds: { state: WorksheetState }): void {
        localStorage.setItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.state.id), JSON.stringify(kwds.state.toThryftJsonObject()));
    }

    renameWorksheetStateSync(kwds: { newId: WorksheetStateId, oldId: WorksheetStateId }): void {
        const newKey = LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.newId);
        const oldKey = LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.oldId);

        if (localStorage.getItem(newKey)) {
            throw new DuplicateSuchWorksheetStateException({ id: kwds.newId });
        }

        const oldJsonString = localStorage.getItem(oldKey);
        if (!oldJsonString) {
            throw new NoSuchWorksheetStateException({ id: kwds.oldId });
        }

        // Change the id in the value, too
        const value = WorksheetState.fromThryftJsonObject(JSON.parse(oldJsonString));
        value.id = kwds.newId;

        localStorage.removeItem(oldKey);
        localStorage.setItem(newKey, JSON.stringify(value.toThryftJsonObject()));
    }
}
