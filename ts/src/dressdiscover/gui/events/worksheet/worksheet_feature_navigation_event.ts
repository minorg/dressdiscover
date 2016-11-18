import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";

export class WorksheetFeatureNavigationEvent {
    static readonly NAME = "worksheet:feature:navigation";

    constructor(options: {feature: WorksheetFeatureModel}) {
        this._feature = options.feature;
    }

    get feature() {
        return this._feature;
    }

    private _feature: WorksheetFeatureModel;
}
