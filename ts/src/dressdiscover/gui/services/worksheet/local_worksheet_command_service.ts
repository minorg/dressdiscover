import { AsyncToSyncWorksheetCommandService } from "../../../api/services/worksheet/worksheet_command_service";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

class LocalWorksheetCommandService extends AsyncToSyncWorksheetCommandService {
    putWorksheetFeatureSetStatesSync(kwds: { worksheetFeatureSetStates : { [index: string]: WorksheetFeatureSetState } }): void {
        const jsonObject: { [index: string]: any } = {};
        for (var key in kwds.worksheetFeatureSetStates) {
            jsonObject[key] = kwds.worksheetFeatureSetStates[key].toThryftJSON();
        }
        const jsonString = JSON.stringify(jsonObject);
        localStorage.setItem("worksheet-feature-set-states", jsonString);
    }
}

export = LocalWorksheetCommandService;
