import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import {
    AsyncToSyncWorksheetStateQueryService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_state_query_service';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/no_such_worksheet_state_exception';

export class LocalWorksheetStateQueryService extends AsyncToSyncWorksheetStateQueryService {
    getWorksheetStateIdsSync(): string[] {
        let result: string[] = [];
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
            result.push(key.substr(LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX.length));
        }
        return result;
    }

    static getWorksheetStateItemKey(id: string): string {
        return LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX + id;
    }

    getWorksheetStateSync(kwds: { id: string }): WorksheetState {
        const jsonString = localStorage.getItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
        if (jsonString == null) {
            throw new NoSuchWorksheetStateException({ id: kwds.id });
        }
        return WorksheetState.fromThryftJsonObject(JSON.parse(jsonString));
    }

    private static readonly _WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
}
