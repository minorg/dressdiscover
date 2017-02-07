import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetFeatureValue } from "dressdiscover/gui/worksheet/models/worksheet_feature_value";
import { WorksheetFeatureValueInputView } from "./worksheet_feature_value_input_view";

export class WorksheetFeatureValuesInputView extends Marionette.CollectionView<WorksheetFeatureValue, WorksheetFeatureValueInputView> {
    constructor(options: any) {
        super(_.extend(options, {
            childView: WorksheetFeatureValueInputView
        }));
    }
}
