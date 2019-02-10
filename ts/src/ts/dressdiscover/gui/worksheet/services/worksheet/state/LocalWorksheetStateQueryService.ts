import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/state/no_such_worksheet_state_exception';
import { WorksheetStateQueryService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_query_service';

export class LocalWorksheetStateQueryService implements WorksheetStateQueryService {
    getWorksheetState(kwds: { id: WorksheetStateId; }): Promise<WorksheetState> {
        return new Promise((resolve, reject) => {
            const jsonString = localStorage.getItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
            if (jsonString == null) {
                reject(new NoSuchWorksheetStateException({ id: kwds.id }));
                return;
            }
            resolve(WorksheetState.fromThryftJsonObject(JSON.parse(jsonString)));
        });
    }

    getWorksheetStateIds(): Promise<WorksheetStateId[]> {
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
        return new Promise((resolve, reject) => resolve(result));
    }

    static getWorksheetStateItemKey(id: WorksheetStateId): string {
        return LocalWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX + id.toString();
    }

    private static readonly _WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
}
