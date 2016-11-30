import * as _ from "underscore";
import * as Marionette from "backbone.marionette";
import { WorksheetEnumFeatureInputView } from "./worksheet_enum_feature_input_view";
import { WorksheetEnumFeature } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetTextFeatureInputView } from "./worksheet_text_feature_input_view";
import { WorksheetTextFeature } from "dressdiscover/gui/models/worksheet/worksheet_text_feature";

declare function require(moduleName: string): any;

export class WorksheetInputView extends Marionette.LayoutView<WorksheetFeature> {
    constructor(options: any) {
        super(_.extend(options, {
            events: {
                "click #back-button": "onClickBackButton",
                "click #next-button": "onClickNextButton"
            },
            regions: {
                buttons: "#input-navigation",
                child: "#input-child"
            },
            template: _.template(require("raw!./worksheet_input_view.html"))
        }));
    }

    onBeforeShow() {
        let childView: Marionette.View<any>;
        if (this.model instanceof WorksheetEnumFeature) {
            childView = new WorksheetEnumFeatureInputView({ model: this.model });
        } else if (this.model instanceof WorksheetTextFeature) {
            childView = new WorksheetTextFeatureInputView({ model: this.model });
        } else {
            throw new Error("not supported " + (this.model.constructor as any).name);
        }
        this.showChildView("child", childView);
    }

    onClickBackButton() {
        console.info("Back");
    }

    onClickNextButton() {
        console.info("Next");
    }
}
