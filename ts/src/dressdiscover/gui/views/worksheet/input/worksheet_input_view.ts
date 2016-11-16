import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureInputView } from "./worksheet_enum_feature_input_view";
import { WorksheetEnumFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_model";
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";
import { WorksheetTextFeatureInputView } from "./worksheet_text_feature_input_view";
import { WorksheetTextFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_text_feature_model";

export class WorksheetInputView {
    static create(model: WorksheetFeatureModel): Marionette.View<any> {
        if (model instanceof WorksheetEnumFeatureModel) {
            return new WorksheetEnumFeatureInputView({ model: model });
        } else if (model instanceof WorksheetTextFeatureModel) {
            return new WorksheetTextFeatureInputView({ model: model });
        } else {
            throw new Error("not supported " + (model.constructor as any).name);
        }
    }
}
