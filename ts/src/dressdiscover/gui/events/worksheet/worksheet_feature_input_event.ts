import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";

export class WorksheetFeatureInputEvent {
    static readonly NAME = "worksheet:feature:input";

    constructor(options: {feature: WorksheetFeature}) {
        this._feature = options.feature;
    }

    get feature() {
        return this._feature;
    }

    private _feature: WorksheetFeature;
}
