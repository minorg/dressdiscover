import { AsyncToSyncWorksheetQueryService } from "../../../api/services/worksheet/worksheet_query_service";
import * as Backbone from "backbone";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

declare var FEATURES: any;

class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    constructor() {
        super();
        for (let featureSetDefinitionJsonObject of FEATURES) {
            this._featureSetDefinitions.add(WorksheetFeatureSetDefinition.fromThryftJSON(featureSetDefinitionJsonObject));
        }
    }

    getWorksheetFeatureSetDefinitionsSync(): Backbone.Collection<WorksheetFeatureSetDefinition> {
        return this._featureSetDefinitions;
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

    private _featureSetDefinitions: Backbone.Collection<WorksheetFeatureSetDefinition> = new Backbone.Collection< WorksheetFeatureSetDefinition>();
}

export = LocalWorksheetQueryService;
