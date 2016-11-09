import { AsyncToSyncWorksheetQueryService } from "../../../api/services/worksheet/worksheet_query_service";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

declare var FEATURES: any;

class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    constructor() {
        super();
        for (var key in FEATURES) {
            this._definitions[key] = WorksheetFeatureSetDefinition.fromThryftJSON(FEATURES[key]);
        }
    }

    getWorksheetFeatureSetDefinitionsSync(): { [index: string]: WorksheetFeatureSetDefinition } {
        return this._definitions;
    }

    getWorksheetFeatureSetStatesSync(): { [index: string]: WorksheetFeatureSetState } {
        const jsonString = localStorage.getItem("worksheet-feature-set-states");
        if (jsonString == null) {
            return {};
        }
        const jsonObject = JSON.parse(jsonString);
        var out: { [index: string]: WorksheetFeatureSetState } = {};
        for (var key in jsonObject) {
            out[key] = WorksheetFeatureSetState.fromThryftJSON(jsonObject[key]);            
        }
        return out;
    }

    private _definitions: { [index: string]: WorksheetFeatureSetDefinition } = {};
}

export = LocalWorksheetQueryService;
