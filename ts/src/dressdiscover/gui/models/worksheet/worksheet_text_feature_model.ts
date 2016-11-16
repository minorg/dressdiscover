import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";

export class WorksheetTextFeatureModel extends WorksheetFeatureModel {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super(definition, state);
        if (state && state.text && state.text.text) {
            this.set("text", state.text.text);
        }
    }
}
