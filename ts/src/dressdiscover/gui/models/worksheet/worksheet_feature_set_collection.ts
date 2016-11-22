import Backbone = require("backbone");
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";

export class WorksheetFeatureSetCollection extends Backbone.Collection<WorksheetFeatureSet> {
    constructor(models: WorksheetFeatureSet[]) {
        super(models);
    }
}
