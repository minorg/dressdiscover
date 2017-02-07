import { WorksheetFeature } from "dressdiscover/gui/worksheet/models/worksheet_feature";

export class WorksheetFeatureNavigationEvent {
    static readonly NAME = "worksheet:feature:navigation";

    constructor(options: {feature: WorksheetFeature}) {
        this._feature = options.feature;
    }

    get feature() {
        return this._feature;
    }

    private _feature: WorksheetFeature;
}
