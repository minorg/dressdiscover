import { AsyncToSyncWorksheetQueryService } from "../../../api/services/worksheet/worksheet_query_service";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    getWorksheetFeatureSetDefinitionsSync(): { [index: string]: WorksheetFeatureSetDefinition } {
        return {};
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
}

export = LocalWorksheetQueryService;
