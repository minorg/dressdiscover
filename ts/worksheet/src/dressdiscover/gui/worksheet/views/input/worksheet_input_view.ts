import * as _ from "underscore";
import * as Marionette from "backbone.marionette";
import { Application } from "dressdiscover/gui/worksheet/application";
import { WorksheetFeature } from "dressdiscover/gui/worksheet/models/worksheet_feature";
import { WorksheetFeatureInputView } from "dressdiscover/gui/worksheet/views/input/worksheet_feature_input_view";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/worksheet/events/worksheet_feature_navigation_event";

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
        this.showChildView("child", new WorksheetFeatureInputView({ model: this.model }));
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
