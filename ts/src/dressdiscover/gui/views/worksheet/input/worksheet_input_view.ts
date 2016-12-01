import * as _ from "underscore";
import * as Marionette from "backbone.marionette";
import { Application } from "dressdiscover/gui/application";
import { WorksheetEnumFeatureInputView } from "./worksheet_enum_feature_input_view";
import { WorksheetEnumFeature } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
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
        this._nextFeature = this.model.nextFeature;
        this._previousFeature = this.model.previousFeature;
    }

    initialize() {
        this.ui = { backButton: "#back-button", nextButton: "#next-button" };
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
        if (!this._previousFeature) {
            return;
        }
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: this._previousFeature }));
    }

    onClickNextButton() {
        if (!this._nextFeature) {
            return;
        }
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: this._nextFeature }));
    }

    onRender() {
        (this.ui.backButton as JQuery).prop("disabled", !!!this._previousFeature);
        (this.ui.nextButton as JQuery).prop("disabled", !!!this._nextFeature);
    }

    private _nextFeature: WorksheetFeature | undefined;
    private _previousFeature: WorksheetFeature | undefined;
}
