import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';

export class WorksheetFeatureDefinitionWrapper {
    constructor(featureDefinition: WorksheetFeatureDefinition) {
        this._featureDefinition = featureDefinition;
    }

    get displayName() {
        return this._featureDefinition.displayName ? this._featureDefinition.displayName : this._featureDefinition.id;
    }

    private _featureDefinition: WorksheetFeatureDefinition;
}
