import Backbone = require("backbone");
import { WorksheetFeatureSet } from "dressdiscover/gui/worksheet/models/worksheet_feature_set";

export class WorksheetFeatureSetCollection extends Backbone.Collection<WorksheetFeatureSet> {
    constructor(models: WorksheetFeatureSet[]) {
        super(models);
    }
}
