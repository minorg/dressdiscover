import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";

export class WorksheetFeatureInputEvent {
    static readonly NAME = "worksheet:feature:input";

    constructor(options: {feature: WorksheetFeatureModel}) {
        this._feature = options.feature;
    }

    get feature() {
        return this._feature;
    }

    private _feature: WorksheetFeatureModel;
}
