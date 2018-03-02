import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import {
    AsyncToSyncWorksheetStateQueryService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_state_query_service';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/no_such_worksheet_state_exception';

export class LocalWorksheetStateQueryService extends AsyncToSyncWorksheetStateQueryService {
    getWorksheetStateIdsSync(): WorksheetStateId[] {
        let result: WorksheetStateId[] = [];
        for (var keyI = 0; ; keyI++) {
            const key = localStorage.key(keyI);
            if (key == null) {
                break;
            }
            if (!key.match("^" + LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX)) {
                continue;
            } else if (key.length == LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX.length) {
                continue;
            }
            result.push(WorksheetStateId.parse(key.substr(LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX.length)));
        }
        return result;
    }

    static getWorksheetStateItemKey(id: WorksheetStateId): string {
        return LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX + id.toString();
    }

    getWorksheetStateSync(kwds: { id: WorksheetStateId }): WorksheetState {
        const jsonString = localStorage.getItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
        if (jsonString == null) {
            throw new NoSuchWorksheetStateException({ id: kwds.id });
        }
        return WorksheetState.fromThryftJsonObject(JSON.parse(jsonString));
    }

    private static readonly _WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
}
