import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";

declare function require(moduleName: string): any;

export class WorksheetOutputView extends Marionette.ItemView<WorksheetModel> {
    constructor(options?: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }
}
