import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureInputView } from "./worksheet_enum_feature_input_view";
import { WorksheetEnumFeature } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetTextFeatureInputView } from "./worksheet_text_feature_input_view";
import { WorksheetTextFeature } from "dressdiscover/gui/models/worksheet/worksheet_text_feature";

export class WorksheetInputView {
    static create(model: WorksheetFeature): Marionette.View<any> {
        if (model instanceof WorksheetEnumFeature) {
            return new WorksheetEnumFeatureInputView({ model: model });
        } else if (model instanceof WorksheetTextFeature) {
            return new WorksheetTextFeatureInputView({ model: model });
        } else {
            throw new Error("not supported " + (model.constructor as any).name);
        }
    }
}
