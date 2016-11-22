import { AsyncToSyncWorksheetQueryService } from "dressdiscover/api/services/worksheet/worksheet_query_service";
import * as Backbone from "backbone";
import { WorksheetDefinition } from "dressdiscover/api/models/worksheet/worksheet_definition";
import { WorksheetFeatureSetDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

declare var DEFINITIONS: any;

export class LocalWorksheetQueryService extends AsyncToSyncWorksheetQueryService {
    constructor() {
        super();
        {
            const rootFeatureSetDefinitions: WorksheetFeatureSetDefinition[] = [];
            for (let featureSetDefinitionJsonObject of DEFINITIONS) {
                rootFeatureSetDefinitions.push(WorksheetFeatureSetDefinition.fromThryftJSON(featureSetDefinitionJsonObject));
            }
            this._worksheetDefinition = new WorksheetDefinition({ rootFeatureSets: new Backbone.Collection<WorksheetFeatureSetDefinition>(rootFeatureSetDefinitions) });
        }
    }

    getWorksheetAccessionNumbersSync(): string[] {
        return [];
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        return this._worksheetDefinition;
    }

    static getWorksheetStateItemKey(accessionNumber: string): string {
        return "worksheet/state/" + accessionNumber;
    }

    getWorksheetStateSync(kwds: { accessionNumber: string }): WorksheetState {
        const jsonString = localStorage.getItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
        console.info("state from service: " + jsonString);
        if (jsonString == null) {
            return new WorksheetState();
        }
        return WorksheetState.fromThryftJSON(JSON.parse(jsonString));
    }

    private _worksheetDefinition: WorksheetDefinition;
}
