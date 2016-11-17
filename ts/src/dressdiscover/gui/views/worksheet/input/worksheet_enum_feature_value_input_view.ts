import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureValueInputView extends Marionette.ItemView<WorksheetEnumFeatureValueModel> {
    constructor(options: any) {
        super(_.extend(options, { template: _.template(require("raw!./worksheet_enum_feature_value_input_view.html")) }));
    }

    serializeData(): any {
        let data = this.model.definition.toJSON();
        if (!data["displayName"]) {
            data["displayName"] = undefined;
        }
        data['image'] = this.model.definition.image ? this.model.definition.image.toJSON() : null;
        return data;
    }
}
