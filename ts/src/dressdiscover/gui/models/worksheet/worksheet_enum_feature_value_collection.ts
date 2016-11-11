import Backbone = require("backbone");
import WorksheetEnumFeatureValueModel = require("./worksheet_enum_feature_value_model");

class WorksheetEnumFeatureValueCollection extends Backbone.Collection<WorksheetEnumFeatureValueModel> {
    constructor(models: WorksheetEnumFeatureValueModel[]) {
        super(models);
    }
}

export = WorksheetEnumFeatureValueCollection;
