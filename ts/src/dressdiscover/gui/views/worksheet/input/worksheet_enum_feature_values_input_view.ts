import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";
import { WorksheetEnumFeatureValueInputView } from "./worksheet_enum_feature_value_input_view";

export class WorksheetEnumFeatureValuesInputView extends Marionette.CollectionView<WorksheetEnumFeatureValueModel, WorksheetEnumFeatureValueInputView> {
    constructor(options: any) {
        super(_.extend(options, {
            childView: WorksheetEnumFeatureValueInputView,
        }));
    }
}
