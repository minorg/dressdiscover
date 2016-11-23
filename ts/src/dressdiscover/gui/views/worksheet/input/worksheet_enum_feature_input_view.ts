import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeature } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature";
import { WorksheetEnumFeatureValuesInputView } from "dressdiscover/gui/views/worksheet/input/worksheet_enum_feature_values_input_view";
import "./worksheet_enum_feature_value_input_view.less";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureInputView extends Marionette.LayoutView<WorksheetEnumFeature> {
    constructor(options: any) {
        super(_.extend(options, {
            regions: {
                values: "#values"
            },
            template: _.template(require("raw!./worksheet_enum_feature_input_view.html"))
        }));
    }

    onRender() {
        this.showChildView("values", new WorksheetEnumFeatureValuesInputView({ collection: this.model.values_ }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
