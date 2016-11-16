import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetTextFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_text_feature_model";
import "../../../../../../node_modules/backbone.stickit/backbone.stickit.js";

declare function require(moduleName: string): any;

export class WorksheetTextFeatureInputView extends Marionette.ItemView<WorksheetTextFeatureModel> {
    constructor(options: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_text_feature_input_view.html"))
        }));
    }
}
