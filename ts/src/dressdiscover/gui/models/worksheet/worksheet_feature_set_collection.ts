import Backbone = require("backbone");
import WorksheetFeatureSetModel = require("./worksheet_feature_set_model");

class WorksheetFeatureSetCollection extends Backbone.Collection<WorksheetFeatureSetModel> {
    constructor(models: WorksheetFeatureSetModel[]) {
        super(models);
    }
}

export = WorksheetFeatureSetCollection;
