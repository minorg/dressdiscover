import { AsyncToSyncWorksheetCommandService } from "../../../api/services/worksheet/worksheet_command_service";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

class LocalWorksheetCommandService extends AsyncToSyncWorksheetCommandService {
    putWorksheetFeatureSetStatesSync(kwds: { worksheet_feature_set_states: { [index: string]: WorksheetFeatureSetState } }): void {

    }
}

export = LocalWorksheetCommandService;
