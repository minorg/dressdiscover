import Backbone = require("backbone");
import { WorksheetFeatureSetModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_set_model";

export class WorksheetFeatureSetCollection extends Backbone.Collection<WorksheetFeatureSetModel> {
    constructor(models: WorksheetFeatureSetModel[]) {
        super(models);
    }
}
