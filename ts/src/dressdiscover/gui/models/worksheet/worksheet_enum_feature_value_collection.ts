import Backbone = require("backbone");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";

export class WorksheetEnumFeatureValueCollection extends Backbone.Collection<WorksheetEnumFeatureValueModel> {
    constructor(models: WorksheetEnumFeatureValueModel[]) {
        super(models);
    }
}
