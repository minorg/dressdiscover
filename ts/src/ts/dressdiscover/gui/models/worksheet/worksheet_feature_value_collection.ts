import Backbone = require("backbone");
import WorksheetFeatureValueModel = require("./worksheet_feature_value_model");

class WorksheetFeatureValueCollection extends Backbone.Collection<WorksheetFeatureValueModel> {
    constructor(models: WorksheetFeatureValueModel[]) {
        super(models);
    }
}

export = WorksheetFeatureValueCollection;
