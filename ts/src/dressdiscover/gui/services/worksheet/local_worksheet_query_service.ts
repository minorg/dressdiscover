import { AsyncToSyncWorksheetQueryService } from "../../../api/services/worksheet/worksheet_query_service";
import * as Backbone from "backbone";
import { WorksheetDefinition } from "../../../api/models/worksheet/worksheet_definition";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";
import { WorksheetState } from "../../../api/models/worksheet/worksheet_state";

declare var FEATURES: any;

class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    constructor() {
        super();
        {
            const rootFeatureSetDefinitions: WorksheetFeatureSetDefinition[] = [];
            for (let featureSetDefinitionJsonObject of FEATURES) {
                rootFeatureSetDefinitions.push(WorksheetFeatureSetDefinition.fromThryftJSON(featureSetDefinitionJsonObject));
            }
            this._worksheetDefinition = new WorksheetDefinition({ rootFeatureSets: new Backbone.Collection<WorksheetFeatureSetDefinition>(rootFeatureSetDefinitions) });
        }
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        return this._worksheetDefinition;
    }

    getWorksheetStateSync(): WorksheetState {
        const jsonString = localStorage.getItem("worksheet-feature-set-states");
        if (jsonString == null) {
            return new WorksheetState();
        }
        const jsonObject = JSON.parse(jsonString);
        var rootFeatureSets: { [index: string]: WorksheetFeatureSetState } = {};
        for (var key in jsonObject) {
            rootFeatureSets[key] = WorksheetFeatureSetState.fromThryftJSON(jsonObject[key]);            
        }
        return new WorksheetState(rootFeatureSets);
    }

    private _worksheetDefinition: WorksheetDefinition;
}

export = LocalWorksheetQueryService;
