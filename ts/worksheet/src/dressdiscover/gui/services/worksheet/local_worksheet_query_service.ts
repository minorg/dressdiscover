import { AsyncToSyncWorksheetQueryService } from "dressdiscover/api/services/worksheet/async_to_sync_worksheet_query_service";
import { WorksheetDefinition } from "dressdiscover/api/models/worksheet/worksheet_definition";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

declare var WORKSHEET_DEFINITION: any;

export class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    constructor() {
        super();
        this._worksheetDefinition = WorksheetDefinition.fromThryftJSON(WORKSHEET_DEFINITION);
    }

    getWorksheetAccessionNumbersSync(): string[] {
        let result: string[] = [];
        for (var keyI = 0; ; keyI++) {
            const key = localStorage.key(keyI);
            if (key == null) {
                break;
            }
            if (!key.match("^" + LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX)) {
                continue;
            } else if (key.length == LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length) {
                continue;
            }
            result.push(key.substr(LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length));
        }
        return result;
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        return this._worksheetDefinition;
    }

    static getWorksheetStateItemKey(accessionNumber: string): string {
        return LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX + accessionNumber;
    }

    getWorksheetStateSync(kwds: { accessionNumber: string }): WorksheetState {
        const jsonString = localStorage.getItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
        console.info("state from service: " + jsonString);
        if (jsonString == null) {
            return new WorksheetState();
        }
        return WorksheetState.fromThryftJSON(JSON.parse(jsonString));
    }

    private static readonly _WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
    private _worksheetDefinition: WorksheetDefinition;
}
