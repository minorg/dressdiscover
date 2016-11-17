import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";

export class WorksheetFeatureSelectionEvent {
    static readonly NAME = "worksheet:feature:select";

    constructor(options: {feature: WorksheetFeatureModel}) {
        this._featureModel = options.feature;
    }

    get feature() {
        return this._featureModel;
    }

    private _featureModel: WorksheetFeatureModel;
}
