import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';

export class WorksheetFeatureSetDefinitionWrapper {
    constructor(featureSetDefinition: WorksheetFeatureSetDefinition) {
        this._featureSetDefinition = featureSetDefinition;
    }

    get displayName() {
        return this._featureSetDefinition.displayName ? this._featureSetDefinition.displayName : this._featureSetDefinition.id;
    }

    private _featureSetDefinition: WorksheetFeatureSetDefinition;
}