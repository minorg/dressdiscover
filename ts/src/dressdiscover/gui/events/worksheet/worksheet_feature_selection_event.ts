import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";

export class WorksheetFeatureSelectionEvent {
    static readonly NAME = "worksheet:feature:select";

    constructor(options: {featureModel: WorksheetFeatureModel}) {
        this._featureModel = options.featureModel;
    }

    get featureModel() {
        return this._featureModel;
    }

    private _featureModel: WorksheetFeatureModel;
}
