import { AsyncToSyncWorksheetQueryService } from "../../../api/services/worksheet/worksheet_query_service";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    getWorksheetFeatureSetDefinitionsSync(): { [index: string]: WorksheetFeatureSetDefinition } {
        return {};
    }

    getWorksheetFeatureSetStatesSync(): { [index: string]: WorksheetFeatureSetState } {
        return {};
    }
}

export = LocalWorksheetQueryService;
