import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureSelectionEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_selection_event";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetInputView } from "./input/worksheet_input_view";
import { WorksheetNavigationView } from "./navigation/worksheet_navigation_view";
import "./worksheet_content_view.less";

declare function require(moduleName: string): any;

export class WorksheetContentView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options: any) {
        super(_.extend(options, {
            regions: {
                leftColumn: "#left-column",
                rightColumn: "#right-column"
            },
            template: _.template(require("raw!./worksheet_content_view.html"))
        }));
    }

    initialize() {
        this.listenTo(AppRadio.channel, WorksheetFeatureSelectionEvent.NAME, this.onFeatureSelection);
    }

    onFeatureSelection(request: WorksheetFeatureSelectionEvent) {
        let region = this.getRegion("rightColumn");
        region.reset();
        region.show(WorksheetInputView.create(request.featureModel));
    }

    onBeforeShow() {
        this.showChildView("leftColumn", new WorksheetNavigationView({ collection: this.model.rootFeatureSets }));
        this.showChildView("rightColumn", WorksheetInputView.create(this.model.selectedFeature));
    }
}
